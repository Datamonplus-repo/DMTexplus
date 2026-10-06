package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wchistoricorecetas_impl extends GXWebComponent
{
   public wchistoricorecetas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wchistoricorecetas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wchistoricorecetas_impl.class ));
   }

   public wchistoricorecetas_impl( int remoteHandle ,
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
               AV5Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
               AV6HreBarcod = (int)(GXutil.lval( httpContext.GetPar( "HreBarcod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6HreBarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6HreBarcod), 8, 0));
               AV7Hrebarreo = (byte)(GXutil.lval( httpContext.GetPar( "Hrebarreo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Hrebarreo", GXutil.str( AV7Hrebarreo, 1, 0));
               AV8Hrebarpar = httpContext.GetPar( "Hrebarpar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Hrebarpar", AV8Hrebarpar);
               AV9Hremaqcod = httpContext.GetPar( "Hremaqcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Hremaqcod", AV9Hremaqcod);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5Emprcod,Integer.valueOf(AV6HreBarcod),Byte.valueOf(AV7Hrebarreo),AV8Hrebarpar,AV9Hremaqcod});
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
      nRC_GXsfl_46 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_46"))) ;
      nGXsfl_46_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_46_idx"))) ;
      sGXsfl_46_idx = httpContext.GetPar( "sGXsfl_46_idx") ;
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
      AV56FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV5Emprcod = httpContext.GetPar( "Emprcod") ;
      AV6HreBarcod = (int)(GXutil.lval( httpContext.GetPar( "HreBarcod"))) ;
      AV7Hrebarreo = (byte)(GXutil.lval( httpContext.GetPar( "Hrebarreo"))) ;
      AV8Hrebarpar = httpContext.GetPar( "Hrebarpar") ;
      AV9Hremaqcod = httpContext.GetPar( "Hremaqcod") ;
      AV30ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV25ColumnsSelector);
      AV32TFHreMaqCod = httpContext.GetPar( "TFHreMaqCod") ;
      AV33TFHreMaqCod_Sel = httpContext.GetPar( "TFHreMaqCod_Sel") ;
      AV58TFHreVolPrd = (int)(GXutil.lval( httpContext.GetPar( "TFHreVolPrd"))) ;
      AV59TFHreVolPrd_To = (int)(GXutil.lval( httpContext.GetPar( "TFHreVolPrd_To"))) ;
      AV35TFHreNumCie = (byte)(GXutil.lval( httpContext.GetPar( "TFHreNumCie"))) ;
      AV36TFHreNumCie_To = (byte)(GXutil.lval( httpContext.GetPar( "TFHreNumCie_To"))) ;
      AV38TFHreLinMaq = (short)(GXutil.lval( httpContext.GetPar( "TFHreLinMaq"))) ;
      AV39TFHreLinMaq_To = (short)(GXutil.lval( httpContext.GetPar( "TFHreLinMaq_To"))) ;
      AV74Pgmname = httpContext.GetPar( "Pgmname") ;
      AV17OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV18OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV47Receta = (short)(GXutil.lval( httpContext.GetPar( "Receta"))) ;
      AV49PwdGrl = (short)(GXutil.lval( httpContext.GetPar( "PwdGrl"))) ;
      AV48ContVal = (int)(GXutil.lval( httpContext.GetPar( "ContVal"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV56FilterFullText, AV5Emprcod, AV6HreBarcod, AV7Hrebarreo, AV8Hrebarpar, AV9Hremaqcod, AV30ManageFiltersExecutionStep, AV25ColumnsSelector, AV32TFHreMaqCod, AV33TFHreMaqCod_Sel, AV58TFHreVolPrd, AV59TFHreVolPrd_To, AV35TFHreNumCie, AV36TFHreNumCie_To, AV38TFHreLinMaq, AV39TFHreLinMaq_To, AV74Pgmname, AV17OrderedBy, AV18OrderedDsc, AV47Receta, AV49PwdGrl, AV48ContVal, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paTD2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Recetas Historico", "")) ;
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
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.wchistoricorecetas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6HreBarcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7Hrebarreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8Hrebarpar)),GXutil.URLEncode(GXutil.rtrim(AV9Hremaqcod))}, new String[] {"Emprcod","HreBarcod","Hrebarreo","Hrebarpar","Hremaqcod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV74Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECETA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV47Receta), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPWDGRL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV49PwdGrl), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONTVAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV48ContVal), "ZZZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV56FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_46", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_46, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV28ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV28ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV43GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV44GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV41DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV41DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV25ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV25ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5Emprcod", GXutil.rtrim( wcpOAV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6HreBarcod", GXutil.ltrim( localUtil.ntoc( wcpOAV6HreBarcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7Hrebarreo", GXutil.ltrim( localUtil.ntoc( wcpOAV7Hrebarreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8Hrebarpar", GXutil.rtrim( wcpOAV8Hrebarpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9Hremaqcod", GXutil.rtrim( wcpOAV9Hremaqcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV30ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREMAQCOD", GXutil.rtrim( AV32TFHreMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREMAQCOD_SEL", GXutil.rtrim( AV33TFHreMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREVOLPRD", GXutil.ltrim( localUtil.ntoc( AV58TFHreVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREVOLPRD_TO", GXutil.ltrim( localUtil.ntoc( AV59TFHreVolPrd_To, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRENUMCIE", GXutil.ltrim( localUtil.ntoc( AV35TFHreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRENUMCIE_TO", GXutil.ltrim( localUtil.ntoc( AV36TFHreNumCie_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRELINMAQ", GXutil.ltrim( localUtil.ntoc( AV38TFHreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRELINMAQ_TO", GXutil.ltrim( localUtil.ntoc( AV39TFHreLinMaq_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV74Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV74Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV17OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV18OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHREBARCOD", GXutil.ltrim( localUtil.ntoc( AV6HreBarcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHREBARREO", GXutil.ltrim( localUtil.ntoc( AV7Hrebarreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHREBARPAR", GXutil.rtrim( AV8Hrebarpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHREMAQCOD", GXutil.rtrim( AV9Hremaqcod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV15GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV15GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECETA", GXutil.ltrim( localUtil.ntoc( AV47Receta, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECETA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV47Receta), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPWDGRL", GXutil.ltrim( localUtil.ntoc( AV49PwdGrl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPWDGRL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV49PwdGrl), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONTVAL", GXutil.ltrim( localUtil.ntoc( AV48ContVal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONTVAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV48ContVal), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXUITABSPANEL_TABS_Pagecount", GXutil.ltrim( localUtil.ntoc( Gxuitabspanel_tabs_Pagecount, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXUITABSPANEL_TABS_Class", GXutil.rtrim( Gxuitabspanel_tabs_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXUITABSPANEL_TABS_Historymanagement", GXutil.booltostr( Gxuitabspanel_tabs_Historymanagement));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Width", GXutil.rtrim( Dvpanel_unnamedtable2_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable2_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable2_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Cls", GXutil.rtrim( Dvpanel_unnamedtable2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Title", GXutil.rtrim( Dvpanel_unnamedtable2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable2_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable2_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable2_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseFormTD2( )
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
         if ( ! ( WebComp_Wcwcprocesosquimicos == null ) )
         {
            WebComp_Wcwcprocesosquimicos.componentjscripts();
         }
         if ( ! ( WebComp_Wcwccostesproductos == null ) )
         {
            WebComp_Wcwccostesproductos.componentjscripts();
         }
         if ( ! ( WebComp_Wcwccostesproductosadiciones == null ) )
         {
            WebComp_Wcwccostesproductosadiciones.componentjscripts();
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
      return "FormulacionTinte.WCHistoricoRecetas" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Recetas Historico", "") ;
   }

   public void wbTD0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.formulaciontinte.wchistoricorecetas");
            httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
            httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
            httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
            httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
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
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnrecetahistorico_Internalname, "gx.evt.setGridEvt("+GXutil.str( 46, 2, 0)+","+"null"+");", httpContext.getMessage( "Receta Historico (PDF)", ""), bttBtnrecetahistorico_Jsonclick, 7, httpContext.getMessage( "Receta Historico (PDF)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e11td1_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\WCHistoricoRecetas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnrecetacostes_Internalname, "gx.evt.setGridEvt("+GXutil.str( 46, 2, 0)+","+"null"+");", httpContext.getMessage( "Receta Costes (PDF)", ""), bttBtnrecetacostes_Jsonclick, 5, httpContext.getMessage( "Receta Costes (PDF)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DORECETACOSTES\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\WCHistoricoRecetas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnrecetaconnormas_Internalname, "gx.evt.setGridEvt("+GXutil.str( 46, 2, 0)+","+"null"+");", httpContext.getMessage( "Receta con Normas (PDF)", ""), bttBtnrecetaconnormas_Jsonclick, 5, httpContext.getMessage( "Receta con Normas (PDF)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DORECETACONNORMAS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\WCHistoricoRecetas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 46, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\WCHistoricoRecetas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_TD2( true) ;
      }
      else
      {
         wb_table1_25_TD2( false) ;
      }
      return  ;
   }

   public void wb_table1_25_TD2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         startgridcontrol46( ) ;
      }
      if ( wbEnd == 46 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_46 = (int)(nGXsfl_46_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV43GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV44GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable2.setProperty("Width", Dvpanel_unnamedtable2_Width);
         ucDvpanel_unnamedtable2.setProperty("AutoWidth", Dvpanel_unnamedtable2_Autowidth);
         ucDvpanel_unnamedtable2.setProperty("AutoHeight", Dvpanel_unnamedtable2_Autoheight);
         ucDvpanel_unnamedtable2.setProperty("Cls", Dvpanel_unnamedtable2_Cls);
         ucDvpanel_unnamedtable2.setProperty("Title", Dvpanel_unnamedtable2_Title);
         ucDvpanel_unnamedtable2.setProperty("Collapsible", Dvpanel_unnamedtable2_Collapsible);
         ucDvpanel_unnamedtable2.setProperty("Collapsed", Dvpanel_unnamedtable2_Collapsed);
         ucDvpanel_unnamedtable2.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable2_Showcollapseicon);
         ucDvpanel_unnamedtable2.setProperty("IconPosition", Dvpanel_unnamedtable2_Iconposition);
         ucDvpanel_unnamedtable2.setProperty("AutoScroll", Dvpanel_unnamedtable2_Autoscroll);
         ucDvpanel_unnamedtable2.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable2_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE2Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE2Container"+"UnnamedTable2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGxuitabspanel_tabs.setProperty("PageCount", Gxuitabspanel_tabs_Pagecount);
         ucGxuitabspanel_tabs.setProperty("Class", Gxuitabspanel_tabs_Class);
         ucGxuitabspanel_tabs.setProperty("HistoryManagement", Gxuitabspanel_tabs_Historymanagement);
         ucGxuitabspanel_tabs.render(context, "tab", Gxuitabspanel_tabs_Internalname, sPrefix+"GXUITABSPANEL_TABSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"title1"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblPrcesos_title_Internalname, httpContext.getMessage( "Procesos Quimicos", ""), "", "", lblPrcesos_title_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\WCHistoricoRecetas.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Prcesos") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"panel1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0072"+"", GXutil.rtrim( WebComp_Wcwcprocesosquimicos_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0072"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_46_Refreshing )
            {
               if ( GXutil.len( WebComp_Wcwcprocesosquimicos_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWcwcprocesosquimicos), GXutil.lower( WebComp_Wcwcprocesosquimicos_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0072"+"");
                  }
                  WebComp_Wcwcprocesosquimicos.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldWcwcprocesosquimicos), GXutil.lower( WebComp_Wcwcprocesosquimicos_Component)) != 0 )
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
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"title2"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblCosteshdr_title_Internalname, httpContext.getMessage( "Costes Hdr", ""), "", "", lblCosteshdr_title_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\WCHistoricoRecetas.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "CostesHdr") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"panel2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0080"+"", GXutil.rtrim( WebComp_Wcwccostesproductos_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0080"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_46_Refreshing )
            {
               if ( GXutil.len( WebComp_Wcwccostesproductos_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWcwccostesproductos), GXutil.lower( WebComp_Wcwccostesproductos_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0080"+"");
                  }
                  WebComp_Wcwccostesproductos.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldWcwccostesproductos), GXutil.lower( WebComp_Wcwccostesproductos_Component)) != 0 )
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
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"title3"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblAnadidas_title_Internalname, httpContext.getMessage( "Añadidas", ""), "", "", lblAnadidas_title_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\WCHistoricoRecetas.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Anadidas") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"GXUITABSPANEL_TABSContainer"+"panel3"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0088"+"", GXutil.rtrim( WebComp_Wcwccostesproductosadiciones_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0088"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_46_Refreshing )
            {
               if ( GXutil.len( WebComp_Wcwccostesproductosadiciones_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWcwccostesproductosadiciones), GXutil.lower( WebComp_Wcwccostesproductosadiciones_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0088"+"");
                  }
                  WebComp_Wcwccostesproductosadiciones.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldWcwccostesproductosadiciones), GXutil.lower( WebComp_Wcwccostesproductosadiciones_Component)) != 0 )
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
         httpContext.writeText( "</div>") ;
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
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV41DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV41DDO_TitleSettingsIcons);
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
      if ( wbEnd == 46 )
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

   public void startTD2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Recetas Historico", ""), (short)(0)) ;
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
            strupTD0( ) ;
         }
      }
   }

   public void wsTD2( )
   {
      startTD2( ) ;
      evtTD2( ) ;
   }

   public void evtTD2( )
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
                              strupTD0( ) ;
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
                              strupTD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e12TD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupTD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e13TD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupTD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e14TD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupTD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e15TD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupTD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e16TD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DORECETACOSTES'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupTD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoRecetaCostes' */
                                 e17TD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DORECETACONNORMAS'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupTD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoRecetaconNormas' */
                                 e18TD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupTD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavFilterfulltext_Internalname ;
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
                              strupTD0( ) ;
                           }
                           nGXsfl_46_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_462( ) ;
                           A4546HreMaqCod = httpContext.cgiGet( edtHreMaqCod_Internalname) ;
                           n4546HreMaqCod = false ;
                           A4547HreVolPrd = (int)(localUtil.ctol( httpContext.cgiGet( edtHreVolPrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n4547HreVolPrd = false ;
                           A4495HreNumCie = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreNumCie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4545HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtHreLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4492HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtHreBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4493HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4494HreBarPar = httpContext.cgiGet( edtHreBarPar_Internalname) ;
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e19TD2 ();
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e20TD2 ();
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e21TD2 ();
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
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV56FilterFullText) != 0 )
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
                                    strupTD0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
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
                     if ( nCmpId == 72 )
                     {
                        OldWcwcprocesosquimicos = httpContext.cgiGet( sPrefix+"W0072") ;
                        if ( ( GXutil.len( OldWcwcprocesosquimicos) == 0 ) || ( GXutil.strcmp(OldWcwcprocesosquimicos, WebComp_Wcwcprocesosquimicos_Component) != 0 ) )
                        {
                           WebComp_Wcwcprocesosquimicos = WebUtils.getWebComponent(getClass(), "app." + OldWcwcprocesosquimicos + "_impl", remoteHandle, context);
                           WebComp_Wcwcprocesosquimicos_Component = OldWcwcprocesosquimicos ;
                        }
                        if ( GXutil.len( WebComp_Wcwcprocesosquimicos_Component) != 0 )
                        {
                           WebComp_Wcwcprocesosquimicos.componentprocess(sPrefix+"W0072", "", sEvt);
                        }
                        WebComp_Wcwcprocesosquimicos_Component = OldWcwcprocesosquimicos ;
                     }
                     else if ( nCmpId == 80 )
                     {
                        OldWcwccostesproductos = httpContext.cgiGet( sPrefix+"W0080") ;
                        if ( ( GXutil.len( OldWcwccostesproductos) == 0 ) || ( GXutil.strcmp(OldWcwccostesproductos, WebComp_Wcwccostesproductos_Component) != 0 ) )
                        {
                           WebComp_Wcwccostesproductos = WebUtils.getWebComponent(getClass(), "app." + OldWcwccostesproductos + "_impl", remoteHandle, context);
                           WebComp_Wcwccostesproductos_Component = OldWcwccostesproductos ;
                        }
                        if ( GXutil.len( WebComp_Wcwccostesproductos_Component) != 0 )
                        {
                           WebComp_Wcwccostesproductos.componentprocess(sPrefix+"W0080", "", sEvt);
                        }
                        WebComp_Wcwccostesproductos_Component = OldWcwccostesproductos ;
                     }
                     else if ( nCmpId == 88 )
                     {
                        OldWcwccostesproductosadiciones = httpContext.cgiGet( sPrefix+"W0088") ;
                        if ( ( GXutil.len( OldWcwccostesproductosadiciones) == 0 ) || ( GXutil.strcmp(OldWcwccostesproductosadiciones, WebComp_Wcwccostesproductosadiciones_Component) != 0 ) )
                        {
                           WebComp_Wcwccostesproductosadiciones = WebUtils.getWebComponent(getClass(), "app." + OldWcwccostesproductosadiciones + "_impl", remoteHandle, context);
                           WebComp_Wcwccostesproductosadiciones_Component = OldWcwccostesproductosadiciones ;
                        }
                        if ( GXutil.len( WebComp_Wcwccostesproductosadiciones_Component) != 0 )
                        {
                           WebComp_Wcwccostesproductosadiciones.componentprocess(sPrefix+"W0088", "", sEvt);
                        }
                        WebComp_Wcwccostesproductosadiciones_Component = OldWcwccostesproductosadiciones ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void weTD2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormTD2( ) ;
         }
      }
   }

   public void paTD2( )
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
      subsflControlProps_462( ) ;
      while ( nGXsfl_46_idx <= nRC_GXsfl_46 )
      {
         sendrow_462( ) ;
         nGXsfl_46_idx = ((subGrid_Islastpage==1)&&(nGXsfl_46_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_46_idx+1) ;
         sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_462( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV56FilterFullText ,
                                 String AV5Emprcod ,
                                 int AV6HreBarcod ,
                                 byte AV7Hrebarreo ,
                                 String AV8Hrebarpar ,
                                 String AV9Hremaqcod ,
                                 byte AV30ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelector ,
                                 String AV32TFHreMaqCod ,
                                 String AV33TFHreMaqCod_Sel ,
                                 int AV58TFHreVolPrd ,
                                 int AV59TFHreVolPrd_To ,
                                 byte AV35TFHreNumCie ,
                                 byte AV36TFHreNumCie_To ,
                                 short AV38TFHreLinMaq ,
                                 short AV39TFHreLinMaq_To ,
                                 String AV74Pgmname ,
                                 short AV17OrderedBy ,
                                 boolean AV18OrderedDsc ,
                                 short AV47Receta ,
                                 short AV49PwdGrl ,
                                 int AV48ContVal ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e20TD2 ();
      GRID_nCurrentRecord = 0 ;
      rfTD2( ) ;
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
      rfTD2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV74Pgmname = "FormulacionTinte.WCHistoricoRecetas" ;
      Gx_err = (short)(0) ;
   }

   public void rfTD2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(46) ;
      /* Execute user event: Refresh */
      e20TD2 ();
      nGXsfl_46_idx = 1 ;
      sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_462( ) ;
      bGXsfl_46_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcprocesosquimicos_Component) != 0 )
            {
               WebComp_Wcwcprocesosquimicos.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwccostesproductos_Component) != 0 )
            {
               WebComp_Wcwccostesproductos.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwccostesproductosadiciones_Component) != 0 )
            {
               WebComp_Wcwccostesproductosadiciones.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_462( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext ,
                                              AV67Formulaciontinte_wchistoricorecetasds_3_tfhremaqcod_sel ,
                                              AV66Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod ,
                                              Integer.valueOf(AV68Formulaciontinte_wchistoricorecetasds_4_tfhrevolprd) ,
                                              Integer.valueOf(AV69Formulaciontinte_wchistoricorecetasds_5_tfhrevolprd_to) ,
                                              Byte.valueOf(AV70Formulaciontinte_wchistoricorecetasds_6_tfhrenumcie) ,
                                              Byte.valueOf(AV71Formulaciontinte_wchistoricorecetasds_7_tfhrenumcie_to) ,
                                              Short.valueOf(AV72Formulaciontinte_wchistoricorecetasds_8_tfhrelinmaq) ,
                                              Short.valueOf(AV73Formulaciontinte_wchistoricorecetasds_9_tfhrelinmaq_to) ,
                                              A4546HreMaqCod ,
                                              Integer.valueOf(A4547HreVolPrd) ,
                                              Byte.valueOf(A4495HreNumCie) ,
                                              Short.valueOf(A4545HreLinMaq) ,
                                              Short.valueOf(AV17OrderedBy) ,
                                              Boolean.valueOf(AV18OrderedDsc) ,
                                              AV9Hremaqcod ,
                                              AV5Emprcod ,
                                              Integer.valueOf(AV6HreBarcod) ,
                                              Byte.valueOf(AV7Hrebarreo) ,
                                              AV8Hrebarpar ,
                                              A396EmprCod ,
                                              Integer.valueOf(A4492HreBarCod) ,
                                              Byte.valueOf(A4493HreBarReo) ,
                                              A4494HreBarPar } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         lV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext), "%", "") ;
         lV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext), "%", "") ;
         lV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext), "%", "") ;
         lV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext), "%", "") ;
         lV66Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod = GXutil.padr( GXutil.rtrim( AV66Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod), 6, "%") ;
         /* Using cursor H00TD2 */
         pr_default.execute(0, new Object[] {AV5Emprcod, Integer.valueOf(AV6HreBarcod), Byte.valueOf(AV7Hrebarreo), AV8Hrebarpar, AV9Hremaqcod, lV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext, lV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext, lV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext, lV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext, lV66Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod, AV67Formulaciontinte_wchistoricorecetasds_3_tfhremaqcod_sel, Integer.valueOf(AV68Formulaciontinte_wchistoricorecetasds_4_tfhrevolprd), Integer.valueOf(AV69Formulaciontinte_wchistoricorecetasds_5_tfhrevolprd_to), Byte.valueOf(AV70Formulaciontinte_wchistoricorecetasds_6_tfhrenumcie), Byte.valueOf(AV71Formulaciontinte_wchistoricorecetasds_7_tfhrenumcie_to), Short.valueOf(AV72Formulaciontinte_wchistoricorecetasds_8_tfhrelinmaq), Short.valueOf(AV73Formulaciontinte_wchistoricorecetasds_9_tfhrelinmaq_to), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_46_idx = 1 ;
         sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_462( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H00TD2_A396EmprCod[0] ;
            A4494HreBarPar = H00TD2_A4494HreBarPar[0] ;
            A4493HreBarReo = H00TD2_A4493HreBarReo[0] ;
            A4492HreBarCod = H00TD2_A4492HreBarCod[0] ;
            A4545HreLinMaq = H00TD2_A4545HreLinMaq[0] ;
            A4495HreNumCie = H00TD2_A4495HreNumCie[0] ;
            A4547HreVolPrd = H00TD2_A4547HreVolPrd[0] ;
            n4547HreVolPrd = H00TD2_n4547HreVolPrd[0] ;
            A4546HreMaqCod = H00TD2_A4546HreMaqCod[0] ;
            n4546HreMaqCod = H00TD2_n4546HreMaqCod[0] ;
            e21TD2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(46) ;
         wbTD0( ) ;
      }
      bGXsfl_46_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesTD2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV74Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV74Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECETA", GXutil.ltrim( localUtil.ntoc( AV47Receta, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECETA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV47Receta), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPWDGRL", GXutil.ltrim( localUtil.ntoc( AV49PwdGrl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPWDGRL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV49PwdGrl), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONTVAL", GXutil.ltrim( localUtil.ntoc( AV48ContVal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONTVAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV48ContVal), "ZZZZZZZ9")));
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
      AV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext = AV56FilterFullText ;
      AV66Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod = AV32TFHreMaqCod ;
      AV67Formulaciontinte_wchistoricorecetasds_3_tfhremaqcod_sel = AV33TFHreMaqCod_Sel ;
      AV68Formulaciontinte_wchistoricorecetasds_4_tfhrevolprd = AV58TFHreVolPrd ;
      AV69Formulaciontinte_wchistoricorecetasds_5_tfhrevolprd_to = AV59TFHreVolPrd_To ;
      AV70Formulaciontinte_wchistoricorecetasds_6_tfhrenumcie = AV35TFHreNumCie ;
      AV71Formulaciontinte_wchistoricorecetasds_7_tfhrenumcie_to = AV36TFHreNumCie_To ;
      AV72Formulaciontinte_wchistoricorecetasds_8_tfhrelinmaq = AV38TFHreLinMaq ;
      AV73Formulaciontinte_wchistoricorecetasds_9_tfhrelinmaq_to = AV39TFHreLinMaq_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext ,
                                           AV67Formulaciontinte_wchistoricorecetasds_3_tfhremaqcod_sel ,
                                           AV66Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod ,
                                           Integer.valueOf(AV68Formulaciontinte_wchistoricorecetasds_4_tfhrevolprd) ,
                                           Integer.valueOf(AV69Formulaciontinte_wchistoricorecetasds_5_tfhrevolprd_to) ,
                                           Byte.valueOf(AV70Formulaciontinte_wchistoricorecetasds_6_tfhrenumcie) ,
                                           Byte.valueOf(AV71Formulaciontinte_wchistoricorecetasds_7_tfhrenumcie_to) ,
                                           Short.valueOf(AV72Formulaciontinte_wchistoricorecetasds_8_tfhrelinmaq) ,
                                           Short.valueOf(AV73Formulaciontinte_wchistoricorecetasds_9_tfhrelinmaq_to) ,
                                           A4546HreMaqCod ,
                                           Integer.valueOf(A4547HreVolPrd) ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Short.valueOf(A4545HreLinMaq) ,
                                           Short.valueOf(AV17OrderedBy) ,
                                           Boolean.valueOf(AV18OrderedDsc) ,
                                           AV9Hremaqcod ,
                                           AV5Emprcod ,
                                           Integer.valueOf(AV6HreBarcod) ,
                                           Byte.valueOf(AV7Hrebarreo) ,
                                           AV8Hrebarpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           A4494HreBarPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext), "%", "") ;
      lV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext), "%", "") ;
      lV66Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod = GXutil.padr( GXutil.rtrim( AV66Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod), 6, "%") ;
      /* Using cursor H00TD3 */
      pr_default.execute(1, new Object[] {AV5Emprcod, Integer.valueOf(AV6HreBarcod), Byte.valueOf(AV7Hrebarreo), AV8Hrebarpar, AV9Hremaqcod, lV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext, lV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext, lV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext, lV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext, lV66Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod, AV67Formulaciontinte_wchistoricorecetasds_3_tfhremaqcod_sel, Integer.valueOf(AV68Formulaciontinte_wchistoricorecetasds_4_tfhrevolprd), Integer.valueOf(AV69Formulaciontinte_wchistoricorecetasds_5_tfhrevolprd_to), Byte.valueOf(AV70Formulaciontinte_wchistoricorecetasds_6_tfhrenumcie), Byte.valueOf(AV71Formulaciontinte_wchistoricorecetasds_7_tfhrenumcie_to), Short.valueOf(AV72Formulaciontinte_wchistoricorecetasds_8_tfhrelinmaq), Short.valueOf(AV73Formulaciontinte_wchistoricorecetasds_9_tfhrelinmaq_to)});
      GRID_nRecordCount = H00TD3_AGRID_nRecordCount[0] ;
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
      AV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext = AV56FilterFullText ;
      AV66Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod = AV32TFHreMaqCod ;
      AV67Formulaciontinte_wchistoricorecetasds_3_tfhremaqcod_sel = AV33TFHreMaqCod_Sel ;
      AV68Formulaciontinte_wchistoricorecetasds_4_tfhrevolprd = AV58TFHreVolPrd ;
      AV69Formulaciontinte_wchistoricorecetasds_5_tfhrevolprd_to = AV59TFHreVolPrd_To ;
      AV70Formulaciontinte_wchistoricorecetasds_6_tfhrenumcie = AV35TFHreNumCie ;
      AV71Formulaciontinte_wchistoricorecetasds_7_tfhrenumcie_to = AV36TFHreNumCie_To ;
      AV72Formulaciontinte_wchistoricorecetasds_8_tfhrelinmaq = AV38TFHreLinMaq ;
      AV73Formulaciontinte_wchistoricorecetasds_9_tfhrelinmaq_to = AV39TFHreLinMaq_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV56FilterFullText, AV5Emprcod, AV6HreBarcod, AV7Hrebarreo, AV8Hrebarpar, AV9Hremaqcod, AV30ManageFiltersExecutionStep, AV25ColumnsSelector, AV32TFHreMaqCod, AV33TFHreMaqCod_Sel, AV58TFHreVolPrd, AV59TFHreVolPrd_To, AV35TFHreNumCie, AV36TFHreNumCie_To, AV38TFHreLinMaq, AV39TFHreLinMaq_To, AV74Pgmname, AV17OrderedBy, AV18OrderedDsc, AV47Receta, AV49PwdGrl, AV48ContVal, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext = AV56FilterFullText ;
      AV66Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod = AV32TFHreMaqCod ;
      AV67Formulaciontinte_wchistoricorecetasds_3_tfhremaqcod_sel = AV33TFHreMaqCod_Sel ;
      AV68Formulaciontinte_wchistoricorecetasds_4_tfhrevolprd = AV58TFHreVolPrd ;
      AV69Formulaciontinte_wchistoricorecetasds_5_tfhrevolprd_to = AV59TFHreVolPrd_To ;
      AV70Formulaciontinte_wchistoricorecetasds_6_tfhrenumcie = AV35TFHreNumCie ;
      AV71Formulaciontinte_wchistoricorecetasds_7_tfhrenumcie_to = AV36TFHreNumCie_To ;
      AV72Formulaciontinte_wchistoricorecetasds_8_tfhrelinmaq = AV38TFHreLinMaq ;
      AV73Formulaciontinte_wchistoricorecetasds_9_tfhrelinmaq_to = AV39TFHreLinMaq_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV56FilterFullText, AV5Emprcod, AV6HreBarcod, AV7Hrebarreo, AV8Hrebarpar, AV9Hremaqcod, AV30ManageFiltersExecutionStep, AV25ColumnsSelector, AV32TFHreMaqCod, AV33TFHreMaqCod_Sel, AV58TFHreVolPrd, AV59TFHreVolPrd_To, AV35TFHreNumCie, AV36TFHreNumCie_To, AV38TFHreLinMaq, AV39TFHreLinMaq_To, AV74Pgmname, AV17OrderedBy, AV18OrderedDsc, AV47Receta, AV49PwdGrl, AV48ContVal, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext = AV56FilterFullText ;
      AV66Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod = AV32TFHreMaqCod ;
      AV67Formulaciontinte_wchistoricorecetasds_3_tfhremaqcod_sel = AV33TFHreMaqCod_Sel ;
      AV68Formulaciontinte_wchistoricorecetasds_4_tfhrevolprd = AV58TFHreVolPrd ;
      AV69Formulaciontinte_wchistoricorecetasds_5_tfhrevolprd_to = AV59TFHreVolPrd_To ;
      AV70Formulaciontinte_wchistoricorecetasds_6_tfhrenumcie = AV35TFHreNumCie ;
      AV71Formulaciontinte_wchistoricorecetasds_7_tfhrenumcie_to = AV36TFHreNumCie_To ;
      AV72Formulaciontinte_wchistoricorecetasds_8_tfhrelinmaq = AV38TFHreLinMaq ;
      AV73Formulaciontinte_wchistoricorecetasds_9_tfhrelinmaq_to = AV39TFHreLinMaq_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV56FilterFullText, AV5Emprcod, AV6HreBarcod, AV7Hrebarreo, AV8Hrebarpar, AV9Hremaqcod, AV30ManageFiltersExecutionStep, AV25ColumnsSelector, AV32TFHreMaqCod, AV33TFHreMaqCod_Sel, AV58TFHreVolPrd, AV59TFHreVolPrd_To, AV35TFHreNumCie, AV36TFHreNumCie_To, AV38TFHreLinMaq, AV39TFHreLinMaq_To, AV74Pgmname, AV17OrderedBy, AV18OrderedDsc, AV47Receta, AV49PwdGrl, AV48ContVal, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext = AV56FilterFullText ;
      AV66Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod = AV32TFHreMaqCod ;
      AV67Formulaciontinte_wchistoricorecetasds_3_tfhremaqcod_sel = AV33TFHreMaqCod_Sel ;
      AV68Formulaciontinte_wchistoricorecetasds_4_tfhrevolprd = AV58TFHreVolPrd ;
      AV69Formulaciontinte_wchistoricorecetasds_5_tfhrevolprd_to = AV59TFHreVolPrd_To ;
      AV70Formulaciontinte_wchistoricorecetasds_6_tfhrenumcie = AV35TFHreNumCie ;
      AV71Formulaciontinte_wchistoricorecetasds_7_tfhrenumcie_to = AV36TFHreNumCie_To ;
      AV72Formulaciontinte_wchistoricorecetasds_8_tfhrelinmaq = AV38TFHreLinMaq ;
      AV73Formulaciontinte_wchistoricorecetasds_9_tfhrelinmaq_to = AV39TFHreLinMaq_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV56FilterFullText, AV5Emprcod, AV6HreBarcod, AV7Hrebarreo, AV8Hrebarpar, AV9Hremaqcod, AV30ManageFiltersExecutionStep, AV25ColumnsSelector, AV32TFHreMaqCod, AV33TFHreMaqCod_Sel, AV58TFHreVolPrd, AV59TFHreVolPrd_To, AV35TFHreNumCie, AV36TFHreNumCie_To, AV38TFHreLinMaq, AV39TFHreLinMaq_To, AV74Pgmname, AV17OrderedBy, AV18OrderedDsc, AV47Receta, AV49PwdGrl, AV48ContVal, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext = AV56FilterFullText ;
      AV66Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod = AV32TFHreMaqCod ;
      AV67Formulaciontinte_wchistoricorecetasds_3_tfhremaqcod_sel = AV33TFHreMaqCod_Sel ;
      AV68Formulaciontinte_wchistoricorecetasds_4_tfhrevolprd = AV58TFHreVolPrd ;
      AV69Formulaciontinte_wchistoricorecetasds_5_tfhrevolprd_to = AV59TFHreVolPrd_To ;
      AV70Formulaciontinte_wchistoricorecetasds_6_tfhrenumcie = AV35TFHreNumCie ;
      AV71Formulaciontinte_wchistoricorecetasds_7_tfhrenumcie_to = AV36TFHreNumCie_To ;
      AV72Formulaciontinte_wchistoricorecetasds_8_tfhrelinmaq = AV38TFHreLinMaq ;
      AV73Formulaciontinte_wchistoricorecetasds_9_tfhrelinmaq_to = AV39TFHreLinMaq_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV56FilterFullText, AV5Emprcod, AV6HreBarcod, AV7Hrebarreo, AV8Hrebarpar, AV9Hremaqcod, AV30ManageFiltersExecutionStep, AV25ColumnsSelector, AV32TFHreMaqCod, AV33TFHreMaqCod_Sel, AV58TFHreVolPrd, AV59TFHreVolPrd_To, AV35TFHreNumCie, AV36TFHreNumCie_To, AV38TFHreLinMaq, AV39TFHreLinMaq_To, AV74Pgmname, AV17OrderedBy, AV18OrderedDsc, AV47Receta, AV49PwdGrl, AV48ContVal, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV74Pgmname = "FormulacionTinte.WCHistoricoRecetas" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupTD0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e19TD2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV28ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV41DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV25ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_46 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_46"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV43GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV44GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
         wcpOAV6HreBarcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6HreBarcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV7Hrebarreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7Hrebarreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV8Hrebarpar = httpContext.cgiGet( sPrefix+"wcpOAV8Hrebarpar") ;
         wcpOAV9Hremaqcod = httpContext.cgiGet( sPrefix+"wcpOAV9Hremaqcod") ;
         AV5Emprcod = httpContext.cgiGet( sPrefix+"vEMPRCOD") ;
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
         Gxuitabspanel_tabs_Pagecount = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GXUITABSPANEL_TABS_Pagecount"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gxuitabspanel_tabs_Class = httpContext.cgiGet( sPrefix+"GXUITABSPANEL_TABS_Class") ;
         Gxuitabspanel_tabs_Historymanagement = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GXUITABSPANEL_TABS_Historymanagement")) ;
         Dvpanel_unnamedtable2_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Width") ;
         Dvpanel_unnamedtable2_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Autowidth")) ;
         Dvpanel_unnamedtable2_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Autoheight")) ;
         Dvpanel_unnamedtable2_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Cls") ;
         Dvpanel_unnamedtable2_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Title") ;
         Dvpanel_unnamedtable2_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Collapsible")) ;
         Dvpanel_unnamedtable2_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Collapsed")) ;
         Dvpanel_unnamedtable2_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Showcollapseicon")) ;
         Dvpanel_unnamedtable2_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Iconposition") ;
         Dvpanel_unnamedtable2_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Autoscroll")) ;
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
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read variables values. */
         AV56FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56FilterFullText", AV56FilterFullText);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV56FilterFullText) != 0 )
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
      e19TD2 ();
      if (returnInSub) return;
   }

   public void e19TD2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_int1 = (byte)(AV47Receta) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV5Emprcod, httpContext.getMessage( "HRRECE", ""), GXv_int2) ;
      wchistoricorecetas_impl.this.GXt_int1 = GXv_int2[0] ;
      AV47Receta = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47Receta", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Receta), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECETA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV47Receta), "ZZZ9")));
      GXt_int3 = AV48ContVal ;
      GXv_int4[0] = GXt_int3 ;
      new app.pbuscon(remoteHandle, context).execute( AV5Emprcod, httpContext.getMessage( "PWDHHR", ""), GXv_int4) ;
      wchistoricorecetas_impl.this.GXt_int3 = GXv_int4[0] ;
      AV48ContVal = GXt_int3 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48ContVal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48ContVal), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONTVAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV48ContVal), "ZZZZZZZ9")));
      GXt_int1 = (byte)(AV49PwdGrl) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV5Emprcod, httpContext.getMessage( "PWDHHR", ""), GXv_int2) ;
      wchistoricorecetas_impl.this.GXt_int1 = GXv_int2[0] ;
      AV49PwdGrl = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49PwdGrl", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49PwdGrl), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPWDGRL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV49PwdGrl), "ZZZ9")));
      GXt_int1 = (byte)(AV50anahuac) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV5Emprcod, httpContext.getMessage( "ANAHUA", ""), GXv_int2) ;
      wchistoricorecetas_impl.this.GXt_int1 = GXv_int2[0] ;
      AV50anahuac = GXt_int1 ;
      GXt_char5 = AV60Station ;
      GXv_char6[0] = GXt_char5 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char6) ;
      wchistoricorecetas_impl.this.GXt_char5 = GXv_char6[0] ;
      AV60Station = GXt_char5 ;
      GXv_char6[0] = AV5Emprcod ;
      GXv_char7[0] = AV61EmprNom ;
      GXv_char8[0] = AV62UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV60Station, GXv_char6, GXv_char7, GXv_char8) ;
      wchistoricorecetas_impl.this.AV5Emprcod = GXv_char6[0] ;
      wchistoricorecetas_impl.this.AV61EmprNom = GXv_char7[0] ;
      wchistoricorecetas_impl.this.AV62UsurCod = GXv_char8[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
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
      /* Object Property */
      if ( GXutil.len( sPrefix) == 0 )
      {
         bDynCreated_Wcwccostesproductosadiciones = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwccostesproductosadiciones_Component), GXutil.lower( "WCCostesProductosAdiciones_")) != 0 )
      {
         WebComp_Wcwccostesproductosadiciones = WebUtils.getWebComponent(getClass(), "app.wccostesproductosadiciones__impl", remoteHandle, context);
         WebComp_Wcwccostesproductosadiciones_Component = "WCCostesProductosAdiciones_" ;
      }
      if ( GXutil.len( WebComp_Wcwccostesproductosadiciones_Component) != 0 )
      {
         WebComp_Wcwccostesproductosadiciones.setjustcreated();
         WebComp_Wcwccostesproductosadiciones.componentprepare(new Object[] {sPrefix+"W0088","",AV5Emprcod,Integer.valueOf(A4492HreBarCod),Byte.valueOf(A4493HreBarReo),A4494HreBarPar,Byte.valueOf(A4495HreNumCie),Short.valueOf(A4545HreLinMaq)});
         WebComp_Wcwccostesproductosadiciones.componentbind(new Object[] {"","","","","",""});
      }
      /* Object Property */
      if ( GXutil.len( sPrefix) == 0 )
      {
         bDynCreated_Wcwccostesproductos = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwccostesproductos_Component), GXutil.lower( "WCCostesProductos")) != 0 )
      {
         WebComp_Wcwccostesproductos = WebUtils.getWebComponent(getClass(), "app.wccostesproductos_impl", remoteHandle, context);
         WebComp_Wcwccostesproductos_Component = "WCCostesProductos" ;
      }
      if ( GXutil.len( WebComp_Wcwccostesproductos_Component) != 0 )
      {
         WebComp_Wcwccostesproductos.setjustcreated();
         WebComp_Wcwccostesproductos.componentprepare(new Object[] {sPrefix+"W0080","",AV5Emprcod,Integer.valueOf(A4492HreBarCod),Byte.valueOf(A4493HreBarReo),A4494HreBarPar,Byte.valueOf(A4495HreNumCie),Short.valueOf(A4545HreLinMaq)});
         WebComp_Wcwccostesproductos.componentbind(new Object[] {"","","","","",""});
      }
      /* Object Property */
      if ( GXutil.len( sPrefix) == 0 )
      {
         bDynCreated_Wcwcprocesosquimicos = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcprocesosquimicos_Component), GXutil.lower( "WCProcesosQuimicos")) != 0 )
      {
         WebComp_Wcwcprocesosquimicos = WebUtils.getWebComponent(getClass(), "app.wcprocesosquimicos_impl", remoteHandle, context);
         WebComp_Wcwcprocesosquimicos_Component = "WCProcesosQuimicos" ;
      }
      if ( GXutil.len( WebComp_Wcwcprocesosquimicos_Component) != 0 )
      {
         WebComp_Wcwcprocesosquimicos.setjustcreated();
         WebComp_Wcwcprocesosquimicos.componentprepare(new Object[] {sPrefix+"W0072","",AV5Emprcod,Integer.valueOf(A4492HreBarCod),Byte.valueOf(A4493HreBarReo),A4494HreBarPar,Byte.valueOf(A4495HreNumCie),Short.valueOf(A4545HreLinMaq)});
         WebComp_Wcwcprocesosquimicos.componentbind(new Object[] {"","","","","",""});
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = AV41DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] ;
      AV41DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e20TD2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext11[0] = AV11WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV11WWPContext = GXv_SdtWWPContext11[0] ;
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
      if ( GXutil.strcmp(AV27Session.getValue("FormulacionTinte.WCHistoricoRecetasColumnsSelector"), "") != 0 )
      {
         AV23ColumnsSelectorXML = AV27Session.getValue("FormulacionTinte.WCHistoricoRecetasColumnsSelector") ;
         AV25ColumnsSelector.fromxml(AV23ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtHreMaqCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHreMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreMaqCod_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtHreVolPrd_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHreVolPrd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreVolPrd_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtHreNumCie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHreNumCie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNumCie_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtHreLinMaq_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHreLinMaq_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinMaq_Visible), 5, 0), !bGXsfl_46_Refreshing);
      AV43GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43GridCurrentPage), 10, 0));
      AV44GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44GridPageCount), 10, 0));
      AV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext = AV56FilterFullText ;
      AV66Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod = AV32TFHreMaqCod ;
      AV67Formulaciontinte_wchistoricorecetasds_3_tfhremaqcod_sel = AV33TFHreMaqCod_Sel ;
      AV68Formulaciontinte_wchistoricorecetasds_4_tfhrevolprd = AV58TFHreVolPrd ;
      AV69Formulaciontinte_wchistoricorecetasds_5_tfhrevolprd_to = AV59TFHreVolPrd_To ;
      AV70Formulaciontinte_wchistoricorecetasds_6_tfhrenumcie = AV35TFHreNumCie ;
      AV71Formulaciontinte_wchistoricorecetasds_7_tfhrenumcie_to = AV36TFHreNumCie_To ;
      AV72Formulaciontinte_wchistoricorecetasds_8_tfhrelinmaq = AV38TFHreLinMaq ;
      AV73Formulaciontinte_wchistoricorecetasds_9_tfhrelinmaq_to = AV39TFHreLinMaq_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25ColumnsSelector", AV25ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28ManageFiltersData", AV28ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV15GridState", AV15GridState);
   }

   public void e13TD2( )
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
         AV42PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV42PageToGo) ;
      }
   }

   public void e14TD2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e15TD2( )
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
            AV32TFHreMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFHreMaqCod", AV32TFHreMaqCod);
            AV33TFHreMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFHreMaqCod_Sel", AV33TFHreMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreVolPrd") == 0 )
         {
            AV58TFHreVolPrd = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFHreVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFHreVolPrd), 5, 0));
            AV59TFHreVolPrd_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFHreVolPrd_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFHreVolPrd_To), 5, 0));
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
            AV38TFHreLinMaq = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFHreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFHreLinMaq), 4, 0));
            AV39TFHreLinMaq_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFHreLinMaq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFHreLinMaq_To), 4, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e21TD2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(46) ;
      }
      sendrow_462( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_46_Refreshing )
      {
         httpContext.doAjaxLoad(46, GridRow);
      }
   }

   public void e16TD2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV23ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV25ColumnsSelector.fromJSonString(AV23ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.WCHistoricoRecetasColumnsSelector", ((GXutil.strcmp("", AV23ColumnsSelectorXML)==0) ? "" : AV25ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25ColumnsSelector", AV25ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28ManageFiltersData", AV28ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV15GridState", AV15GridState);
   }

   public void e12TD2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.WCHistoricoRecetasFilters")),GXutil.URLEncode(GXutil.rtrim(AV74Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV30ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30ManageFiltersExecutionStep", GXutil.str( AV30ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.WCHistoricoRecetasFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV30ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30ManageFiltersExecutionStep", GXutil.str( AV30ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char5 = AV29ManageFiltersXml ;
         GXv_char8[0] = GXt_char5 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "FormulacionTinte.WCHistoricoRecetasFilters", Ddo_managefilters_Activeeventkey, GXv_char8) ;
         wchistoricorecetas_impl.this.GXt_char5 = GXv_char8[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV74Pgmname+"GridState", AV29ManageFiltersXml) ;
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

   public void e17TD2( )
   {
      /* 'DoRecetaCostes' Routine */
      returnInSub = false ;
      if ( AV47Receta == 1 )
      {
         httpContext.popup(formatLink("app.rhrhr021", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(A4492HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A4493HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A4494HreBarPar)),GXutil.URLEncode(GXutil.ltrimstr(A4495HreNumCie,2,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","HRENUMCIE","Output"}) , new Object[] {"AV5Emprcod","A4492HreBarCod","A4493HreBarReo","A4494HreBarPar","A4495HreNumCie",""});
      }
      else
      {
         AV53ClaveConfirmada = true ;
         if ( AV49PwdGrl == 1 )
         {
            AV53ClaveConfirmada = false ;
            AV54WebSession.setValue("ValidarWebWPwdGrl", GXutil.str( AV48ContVal, 8, 0));
            /* Window Datatype Object Property */
            AV46window.setUrl( formatLink("app.webwpwdgrl", new String[] {GXutil.URLEncode(GXutil.booltostr(AV53ClaveConfirmada))}, new String[] {"PwdBo"})  );
            AV46window.setReturnParms(new Object[] {"AV53ClaveConfirmada",});
            httpContext.newWindow(AV46window);
         }
         if ( AV53ClaveConfirmada )
         {
            httpContext.popup(formatLink("app.rhrhr02", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(A4492HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A4493HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A4494HreBarPar)),GXutil.URLEncode(GXutil.ltrimstr(A4495HreNumCie,2,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","HRENUMCIE","Output"}) , new Object[] {"AV5Emprcod","A4492HreBarCod","A4493HreBarReo","A4494HreBarPar","A4495HreNumCie",""});
         }
      }
      /*  Sending Event outputs  */
   }

   public void e18TD2( )
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
      GXt_char5 = AV24UserCustomValue ;
      GXv_char8[0] = GXt_char5 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.WCHistoricoRecetasColumnsSelector", GXv_char8) ;
      wchistoricorecetas_impl.this.GXt_char5 = GXv_char8[0] ;
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
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "FormulacionTinte.WCHistoricoRecetasFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[0] ;
      AV28ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV56FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56FilterFullText", AV56FilterFullText);
      AV32TFHreMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFHreMaqCod", AV32TFHreMaqCod);
      AV33TFHreMaqCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFHreMaqCod_Sel", AV33TFHreMaqCod_Sel);
      AV58TFHreVolPrd = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFHreVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFHreVolPrd), 5, 0));
      AV59TFHreVolPrd_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFHreVolPrd_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFHreVolPrd_To), 5, 0));
      AV35TFHreNumCie = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFHreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFHreNumCie), 2, 0));
      AV36TFHreNumCie_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFHreNumCie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFHreNumCie_To), 2, 0));
      AV38TFHreLinMaq = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFHreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFHreLinMaq), 4, 0));
      AV39TFHreLinMaq_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFHreLinMaq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFHreLinMaq_To), 4, 0));
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
      if ( GXutil.strcmp(AV27Session.getValue(AV74Pgmname+"GridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV74Pgmname+"GridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV27Session.getValue(AV74Pgmname+"GridState"), null, null);
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
      AV75GXV1 = 1 ;
      while ( AV75GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV75GXV1));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV56FilterFullText = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56FilterFullText", AV56FilterFullText);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREMAQCOD") == 0 )
         {
            AV32TFHreMaqCod = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFHreMaqCod", AV32TFHreMaqCod);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREMAQCOD_SEL") == 0 )
         {
            AV33TFHreMaqCod_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFHreMaqCod_Sel", AV33TFHreMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREVOLPRD") == 0 )
         {
            AV58TFHreVolPrd = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFHreVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFHreVolPrd), 5, 0));
            AV59TFHreVolPrd_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFHreVolPrd_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFHreVolPrd_To), 5, 0));
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
            AV38TFHreLinMaq = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFHreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFHreLinMaq), 4, 0));
            AV39TFHreLinMaq_To = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFHreLinMaq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFHreLinMaq_To), 4, 0));
         }
         AV75GXV1 = (int)(AV75GXV1+1) ;
      }
      GXt_char5 = "" ;
      GXv_char8[0] = GXt_char5 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFHreMaqCod_Sel)==0), AV33TFHreMaqCod_Sel, GXv_char8) ;
      wchistoricorecetas_impl.this.GXt_char5 = GXv_char8[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char5+"|||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char5 = "" ;
      GXv_char8[0] = GXt_char5 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFHreMaqCod)==0), AV32TFHreMaqCod, GXv_char8) ;
      wchistoricorecetas_impl.this.GXt_char5 = GXv_char8[0] ;
      Ddo_grid_Filteredtext_set = GXt_char5+"|"+((0==AV58TFHreVolPrd) ? "" : GXutil.str( AV58TFHreVolPrd, 5, 0))+"|"+((0==AV35TFHreNumCie) ? "" : GXutil.str( AV35TFHreNumCie, 2, 0))+"|"+((0==AV38TFHreLinMaq) ? "" : GXutil.str( AV38TFHreLinMaq, 4, 0)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV59TFHreVolPrd_To) ? "" : GXutil.str( AV59TFHreVolPrd_To, 5, 0))+"|"+((0==AV36TFHreNumCie_To) ? "" : GXutil.str( AV36TFHreNumCie_To, 2, 0))+"|"+((0==AV39TFHreLinMaq_To) ? "" : GXutil.str( AV39TFHreLinMaq_To, 4, 0)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV15GridState.fromxml(AV27Session.getValue(AV74Pgmname+"GridState"), null, null);
      AV15GridState.setgxTv_SdtWWPGridState_Orderedby( AV17OrderedBy );
      AV15GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV18OrderedDsc );
      AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState16[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV56FilterFullText)==0), (short)(0), AV56FilterFullText, "") ;
      AV15GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFHREMAQCOD", "", !(GXutil.strcmp("", AV32TFHreMaqCod)==0), (short)(0), AV32TFHreMaqCod, "", !(GXutil.strcmp("", AV33TFHreMaqCod_Sel)==0), AV33TFHreMaqCod_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFHREVOLPRD", "", !((0==AV58TFHreVolPrd)&&(0==AV59TFHreVolPrd_To)), (short)(0), GXutil.trim( GXutil.str( AV58TFHreVolPrd, 5, 0)), GXutil.trim( GXutil.str( AV59TFHreVolPrd_To, 5, 0))) ;
      AV15GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFHRENUMCIE", "", !((0==AV35TFHreNumCie)&&(0==AV36TFHreNumCie_To)), (short)(0), GXutil.trim( GXutil.str( AV35TFHreNumCie, 2, 0)), GXutil.trim( GXutil.str( AV36TFHreNumCie_To, 2, 0))) ;
      AV15GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFHRELINMAQ", "", !((0==AV38TFHreLinMaq)&&(0==AV39TFHreLinMaq_To)), (short)(0), GXutil.trim( GXutil.str( AV38TFHreLinMaq, 4, 0)), GXutil.trim( GXutil.str( AV39TFHreLinMaq_To, 4, 0))) ;
      AV15GridState = GXv_SdtWWPGridState16[0] ;
      if ( ! (GXutil.strcmp("", AV5Emprcod)==0) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV5Emprcod );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      if ( ! (0==AV6HreBarcod) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HREBARCOD" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV6HreBarcod, 8, 0) );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      if ( ! (0==AV7Hrebarreo) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HREBARREO" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV7Hrebarreo, 1, 0) );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV8Hrebarpar)==0) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HREBARPAR" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV8Hrebarpar );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV9Hremaqcod)==0) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HREMAQCOD" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV9Hremaqcod );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      AV15GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV15GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV74Pgmname+"GridState", AV15GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV13TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV13TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV74Pgmname );
      AV13TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV13TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV12HTTPRequest.getScriptName()+"?"+AV12HTTPRequest.getQuerystring() );
      AV13TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "HISREM" );
      AV27Session.setValue("TrnContext", AV13TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_25_TD2( boolean wbgen )
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
         wb_table2_30_TD2( true) ;
      }
      else
      {
         wb_table2_30_TD2( false) ;
      }
      return  ;
   }

   public void wb_table2_30_TD2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_TD2e( true) ;
      }
      else
      {
         wb_table1_25_TD2e( false) ;
      }
   }

   public void wb_table2_30_TD2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'" + sPrefix + "',false,'" + sGXsfl_46_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV56FilterFullText, GXutil.rtrim( localUtil.format( AV56FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_FormulacionTinte\\WCHistoricoRecetas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_30_TD2e( true) ;
      }
      else
      {
         wb_table2_30_TD2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      AV6HreBarcod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6HreBarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6HreBarcod), 8, 0));
      AV7Hrebarreo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Hrebarreo", GXutil.str( AV7Hrebarreo, 1, 0));
      AV8Hrebarpar = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Hrebarpar", AV8Hrebarpar);
      AV9Hremaqcod = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Hremaqcod", AV9Hremaqcod);
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
      paTD2( ) ;
      wsTD2( ) ;
      weTD2( ) ;
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
      sCtrlAV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV6HreBarcod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV7Hrebarreo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV8Hrebarpar = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV9Hremaqcod = (String)getParm(obj,4,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paTD2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "formulaciontinte\\wchistoricorecetas", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paTD2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
         AV6HreBarcod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6HreBarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6HreBarcod), 8, 0));
         AV7Hrebarreo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Hrebarreo", GXutil.str( AV7Hrebarreo, 1, 0));
         AV8Hrebarpar = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Hrebarpar", AV8Hrebarpar);
         AV9Hremaqcod = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Hremaqcod", AV9Hremaqcod);
      }
      wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
      wcpOAV6HreBarcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6HreBarcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV7Hrebarreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7Hrebarreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV8Hrebarpar = httpContext.cgiGet( sPrefix+"wcpOAV8Hrebarpar") ;
      wcpOAV9Hremaqcod = httpContext.cgiGet( sPrefix+"wcpOAV9Hremaqcod") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5Emprcod, wcpOAV5Emprcod) != 0 ) || ( AV6HreBarcod != wcpOAV6HreBarcod ) || ( AV7Hrebarreo != wcpOAV7Hrebarreo ) || ( GXutil.strcmp(AV8Hrebarpar, wcpOAV8Hrebarpar) != 0 ) || ( GXutil.strcmp(AV9Hremaqcod, wcpOAV9Hremaqcod) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV5Emprcod = AV5Emprcod ;
      wcpOAV6HreBarcod = AV6HreBarcod ;
      wcpOAV7Hrebarreo = AV7Hrebarreo ;
      wcpOAV8Hrebarpar = AV8Hrebarpar ;
      wcpOAV9Hremaqcod = AV9Hremaqcod ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV5Emprcod = httpContext.cgiGet( sPrefix+"AV5Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV5Emprcod) > 0 )
      {
         AV5Emprcod = httpContext.cgiGet( sCtrlAV5Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      }
      else
      {
         AV5Emprcod = httpContext.cgiGet( sPrefix+"AV5Emprcod_PARM") ;
      }
      sCtrlAV6HreBarcod = httpContext.cgiGet( sPrefix+"AV6HreBarcod_CTRL") ;
      if ( GXutil.len( sCtrlAV6HreBarcod) > 0 )
      {
         AV6HreBarcod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV6HreBarcod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6HreBarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6HreBarcod), 8, 0));
      }
      else
      {
         AV6HreBarcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV6HreBarcod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV7Hrebarreo = httpContext.cgiGet( sPrefix+"AV7Hrebarreo_CTRL") ;
      if ( GXutil.len( sCtrlAV7Hrebarreo) > 0 )
      {
         AV7Hrebarreo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV7Hrebarreo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Hrebarreo", GXutil.str( AV7Hrebarreo, 1, 0));
      }
      else
      {
         AV7Hrebarreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV7Hrebarreo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV8Hrebarpar = httpContext.cgiGet( sPrefix+"AV8Hrebarpar_CTRL") ;
      if ( GXutil.len( sCtrlAV8Hrebarpar) > 0 )
      {
         AV8Hrebarpar = httpContext.cgiGet( sCtrlAV8Hrebarpar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Hrebarpar", AV8Hrebarpar);
      }
      else
      {
         AV8Hrebarpar = httpContext.cgiGet( sPrefix+"AV8Hrebarpar_PARM") ;
      }
      sCtrlAV9Hremaqcod = httpContext.cgiGet( sPrefix+"AV9Hremaqcod_CTRL") ;
      if ( GXutil.len( sCtrlAV9Hremaqcod) > 0 )
      {
         AV9Hremaqcod = httpContext.cgiGet( sCtrlAV9Hremaqcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Hremaqcod", AV9Hremaqcod);
      }
      else
      {
         AV9Hremaqcod = httpContext.cgiGet( sPrefix+"AV9Hremaqcod_PARM") ;
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
      paTD2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsTD2( ) ;
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
      wsTD2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Emprcod_PARM", GXutil.rtrim( AV5Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Emprcod_CTRL", GXutil.rtrim( sCtrlAV5Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6HreBarcod_PARM", GXutil.ltrim( localUtil.ntoc( AV6HreBarcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6HreBarcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6HreBarcod_CTRL", GXutil.rtrim( sCtrlAV6HreBarcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Hrebarreo_PARM", GXutil.ltrim( localUtil.ntoc( AV7Hrebarreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7Hrebarreo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Hrebarreo_CTRL", GXutil.rtrim( sCtrlAV7Hrebarreo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Hrebarpar_PARM", GXutil.rtrim( AV8Hrebarpar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8Hrebarpar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Hrebarpar_CTRL", GXutil.rtrim( sCtrlAV8Hrebarpar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9Hremaqcod_PARM", GXutil.rtrim( AV9Hremaqcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9Hremaqcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9Hremaqcod_CTRL", GXutil.rtrim( sCtrlAV9Hremaqcod));
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
      weTD2( ) ;
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
      if ( ! ( WebComp_Wcwcprocesosquimicos == null ) )
      {
         WebComp_Wcwcprocesosquimicos.componentjscripts();
      }
      if ( ! ( WebComp_Wcwccostesproductos == null ) )
      {
         WebComp_Wcwccostesproductos.componentjscripts();
      }
      if ( ! ( WebComp_Wcwccostesproductosadiciones == null ) )
      {
         WebComp_Wcwccostesproductosadiciones.componentjscripts();
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
      if ( ! ( WebComp_Wcwcprocesosquimicos == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcprocesosquimicos_Component) != 0 )
         {
            WebComp_Wcwcprocesosquimicos.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwccostesproductos == null ) )
      {
         if ( GXutil.len( WebComp_Wcwccostesproductos_Component) != 0 )
         {
            WebComp_Wcwccostesproductos.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwccostesproductosadiciones == null ) )
      {
         if ( GXutil.len( WebComp_Wcwccostesproductosadiciones_Component) != 0 )
         {
            WebComp_Wcwccostesproductosadiciones.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115564878", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/wchistoricorecetas.js", "?202682115564878", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
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

   public void subsflControlProps_462( )
   {
      edtHreMaqCod_Internalname = sPrefix+"HREMAQCOD_"+sGXsfl_46_idx ;
      edtHreVolPrd_Internalname = sPrefix+"HREVOLPRD_"+sGXsfl_46_idx ;
      edtHreNumCie_Internalname = sPrefix+"HRENUMCIE_"+sGXsfl_46_idx ;
      edtHreLinMaq_Internalname = sPrefix+"HRELINMAQ_"+sGXsfl_46_idx ;
      edtHreBarCod_Internalname = sPrefix+"HREBARCOD_"+sGXsfl_46_idx ;
      edtHreBarReo_Internalname = sPrefix+"HREBARREO_"+sGXsfl_46_idx ;
      edtHreBarPar_Internalname = sPrefix+"HREBARPAR_"+sGXsfl_46_idx ;
   }

   public void subsflControlProps_fel_462( )
   {
      edtHreMaqCod_Internalname = sPrefix+"HREMAQCOD_"+sGXsfl_46_fel_idx ;
      edtHreVolPrd_Internalname = sPrefix+"HREVOLPRD_"+sGXsfl_46_fel_idx ;
      edtHreNumCie_Internalname = sPrefix+"HRENUMCIE_"+sGXsfl_46_fel_idx ;
      edtHreLinMaq_Internalname = sPrefix+"HRELINMAQ_"+sGXsfl_46_fel_idx ;
      edtHreBarCod_Internalname = sPrefix+"HREBARCOD_"+sGXsfl_46_fel_idx ;
      edtHreBarReo_Internalname = sPrefix+"HREBARREO_"+sGXsfl_46_fel_idx ;
      edtHreBarPar_Internalname = sPrefix+"HREBARPAR_"+sGXsfl_46_fel_idx ;
   }

   public void sendrow_462( )
   {
      subsflControlProps_462( ) ;
      wbTD0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_46_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_46_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_46_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHreMaqCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreMaqCod_Internalname,GXutil.rtrim( A4546HreMaqCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn TagColumn","",Integer.valueOf(edtHreMaqCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHreVolPrd_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreVolPrd_Internalname,GXutil.ltrim( localUtil.ntoc( A4547HreVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4547HreVolPrd), "ZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreVolPrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn TagColumn hidden-xs","",Integer.valueOf(edtHreVolPrd_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHreNumCie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreNumCie_Internalname,GXutil.ltrim( localUtil.ntoc( A4495HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreNumCie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn TagColumn hidden-xs","",Integer.valueOf(edtHreNumCie_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHreLinMaq_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreLinMaq_Internalname,GXutil.ltrim( localUtil.ntoc( A4545HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4545HreLinMaq), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreLinMaq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn TagColumn hidden-xs","",Integer.valueOf(edtHreLinMaq_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A4492HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreBarReo_Internalname,GXutil.ltrim( localUtil.ntoc( A4493HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreBarReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreBarPar_Internalname,GXutil.rtrim( A4494HreBarPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreBarPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesTD2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_46_idx = ((subGrid_Islastpage==1)&&(nGXsfl_46_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_46_idx+1) ;
         sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_462( ) ;
      }
      /* End function sendrow_462 */
   }

   public void startgridcontrol46( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"46\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
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
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4493HreBarReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4494HreBarPar));
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
      edtHreMaqCod_Internalname = sPrefix+"HREMAQCOD" ;
      edtHreVolPrd_Internalname = sPrefix+"HREVOLPRD" ;
      edtHreNumCie_Internalname = sPrefix+"HRENUMCIE" ;
      edtHreLinMaq_Internalname = sPrefix+"HRELINMAQ" ;
      edtHreBarCod_Internalname = sPrefix+"HREBARCOD" ;
      edtHreBarReo_Internalname = sPrefix+"HREBARREO" ;
      edtHreBarPar_Internalname = sPrefix+"HREBARPAR" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      lblPrcesos_title_Internalname = sPrefix+"PRCESOS_TITLE" ;
      divUnnamedtable5_Internalname = sPrefix+"UNNAMEDTABLE5" ;
      lblCosteshdr_title_Internalname = sPrefix+"COSTESHDR_TITLE" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      lblAnadidas_title_Internalname = sPrefix+"ANADIDAS_TITLE" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      Gxuitabspanel_tabs_Internalname = sPrefix+"GXUITABSPANEL_TABS" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE2" ;
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
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtHreBarPar_Jsonclick = "" ;
      edtHreBarReo_Jsonclick = "" ;
      edtHreBarCod_Jsonclick = "" ;
      edtHreLinMaq_Jsonclick = "" ;
      edtHreNumCie_Jsonclick = "" ;
      edtHreVolPrd_Jsonclick = "" ;
      edtHreMaqCod_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtHreLinMaq_Visible = -1 ;
      edtHreNumCie_Visible = -1 ;
      edtHreVolPrd_Visible = -1 ;
      edtHreMaqCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "FormulacionTinte.WCHistoricoRecetasGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|||" ;
      Ddo_grid_Includedatalist = "T|||" ;
      Ddo_grid_Filterisrange = "|T|T|T" ;
      Ddo_grid_Filtertype = "Character|Numeric|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4" ;
      Ddo_grid_Columnids = "0:HreMaqCod|1:HreVolPrd|2:HreNumCie|3:HreLinMaq" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Mas datos..", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Gxuitabspanel_tabs_Historymanagement = GXutil.toBoolean( 0) ;
      Gxuitabspanel_tabs_Class = "" ;
      Gxuitabspanel_tabs_Pagecount = 3 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV56FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6HreBarcod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Hrebarreo',fld:'vHREBARREO',pic:'9'},{av:'AV8Hrebarpar',fld:'vHREBARPAR',pic:''},{av:'AV9Hremaqcod',fld:'vHREMAQCOD',pic:''},{av:'AV32TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV33TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'AV58TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV59TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV35TFHreNumCie',fld:'vTFHRENUMCIE',pic:'Z9'},{av:'AV36TFHreNumCie_To',fld:'vTFHRENUMCIE_TO',pic:'Z9'},{av:'AV38TFHreLinMaq',fld:'vTFHRELINMAQ',pic:'ZZZ9'},{av:'AV39TFHreLinMaq_To',fld:'vTFHRELINMAQ_TO',pic:'ZZZ9'},{av:'AV74Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV47Receta',fld:'vRECETA',pic:'ZZZ9',hsh:true},{av:'AV49PwdGrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'AV48ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtHreMaqCod_Visible',ctrl:'HREMAQCOD',prop:'Visible'},{av:'edtHreVolPrd_Visible',ctrl:'HREVOLPRD',prop:'Visible'},{av:'edtHreNumCie_Visible',ctrl:'HRENUMCIE',prop:'Visible'},{av:'edtHreLinMaq_Visible',ctrl:'HRELINMAQ',prop:'Visible'},{av:'AV43GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV44GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV28ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV15GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e13TD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV56FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6HreBarcod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Hrebarreo',fld:'vHREBARREO',pic:'9'},{av:'AV8Hrebarpar',fld:'vHREBARPAR',pic:''},{av:'AV9Hremaqcod',fld:'vHREMAQCOD',pic:''},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV32TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV33TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'AV58TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV59TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV35TFHreNumCie',fld:'vTFHRENUMCIE',pic:'Z9'},{av:'AV36TFHreNumCie_To',fld:'vTFHRENUMCIE_TO',pic:'Z9'},{av:'AV38TFHreLinMaq',fld:'vTFHRELINMAQ',pic:'ZZZ9'},{av:'AV39TFHreLinMaq_To',fld:'vTFHRELINMAQ_TO',pic:'ZZZ9'},{av:'AV74Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV47Receta',fld:'vRECETA',pic:'ZZZ9',hsh:true},{av:'AV49PwdGrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'AV48ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e14TD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV56FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6HreBarcod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Hrebarreo',fld:'vHREBARREO',pic:'9'},{av:'AV8Hrebarpar',fld:'vHREBARPAR',pic:''},{av:'AV9Hremaqcod',fld:'vHREMAQCOD',pic:''},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV32TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV33TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'AV58TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV59TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV35TFHreNumCie',fld:'vTFHRENUMCIE',pic:'Z9'},{av:'AV36TFHreNumCie_To',fld:'vTFHRENUMCIE_TO',pic:'Z9'},{av:'AV38TFHreLinMaq',fld:'vTFHRELINMAQ',pic:'ZZZ9'},{av:'AV39TFHreLinMaq_To',fld:'vTFHRELINMAQ_TO',pic:'ZZZ9'},{av:'AV74Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV47Receta',fld:'vRECETA',pic:'ZZZ9',hsh:true},{av:'AV49PwdGrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'AV48ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e15TD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV56FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6HreBarcod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Hrebarreo',fld:'vHREBARREO',pic:'9'},{av:'AV8Hrebarpar',fld:'vHREBARPAR',pic:''},{av:'AV9Hremaqcod',fld:'vHREMAQCOD',pic:''},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV32TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV33TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'AV58TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV59TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV35TFHreNumCie',fld:'vTFHRENUMCIE',pic:'Z9'},{av:'AV36TFHreNumCie_To',fld:'vTFHRENUMCIE_TO',pic:'Z9'},{av:'AV38TFHreLinMaq',fld:'vTFHRELINMAQ',pic:'ZZZ9'},{av:'AV39TFHreLinMaq_To',fld:'vTFHRELINMAQ_TO',pic:'ZZZ9'},{av:'AV74Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV47Receta',fld:'vRECETA',pic:'ZZZ9',hsh:true},{av:'AV49PwdGrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'AV48ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV32TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV33TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'AV58TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV59TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV35TFHreNumCie',fld:'vTFHRENUMCIE',pic:'Z9'},{av:'AV36TFHreNumCie_To',fld:'vTFHRENUMCIE_TO',pic:'Z9'},{av:'AV38TFHreLinMaq',fld:'vTFHRELINMAQ',pic:'ZZZ9'},{av:'AV39TFHreLinMaq_To',fld:'vTFHRELINMAQ_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e21TD2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e16TD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV56FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6HreBarcod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Hrebarreo',fld:'vHREBARREO',pic:'9'},{av:'AV8Hrebarpar',fld:'vHREBARPAR',pic:''},{av:'AV9Hremaqcod',fld:'vHREMAQCOD',pic:''},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV32TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV33TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'AV58TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV59TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV35TFHreNumCie',fld:'vTFHRENUMCIE',pic:'Z9'},{av:'AV36TFHreNumCie_To',fld:'vTFHRENUMCIE_TO',pic:'Z9'},{av:'AV38TFHreLinMaq',fld:'vTFHRELINMAQ',pic:'ZZZ9'},{av:'AV39TFHreLinMaq_To',fld:'vTFHRELINMAQ_TO',pic:'ZZZ9'},{av:'AV74Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV47Receta',fld:'vRECETA',pic:'ZZZ9',hsh:true},{av:'AV49PwdGrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'AV48ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtHreMaqCod_Visible',ctrl:'HREMAQCOD',prop:'Visible'},{av:'edtHreVolPrd_Visible',ctrl:'HREVOLPRD',prop:'Visible'},{av:'edtHreNumCie_Visible',ctrl:'HRENUMCIE',prop:'Visible'},{av:'edtHreLinMaq_Visible',ctrl:'HRELINMAQ',prop:'Visible'},{av:'AV43GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV44GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV28ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV15GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e12TD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV56FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6HreBarcod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Hrebarreo',fld:'vHREBARREO',pic:'9'},{av:'AV8Hrebarpar',fld:'vHREBARPAR',pic:''},{av:'AV9Hremaqcod',fld:'vHREMAQCOD',pic:''},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV32TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV33TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'AV58TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV59TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV35TFHreNumCie',fld:'vTFHRENUMCIE',pic:'Z9'},{av:'AV36TFHreNumCie_To',fld:'vTFHRENUMCIE_TO',pic:'Z9'},{av:'AV38TFHreLinMaq',fld:'vTFHRELINMAQ',pic:'ZZZ9'},{av:'AV39TFHreLinMaq_To',fld:'vTFHRELINMAQ_TO',pic:'ZZZ9'},{av:'AV74Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV47Receta',fld:'vRECETA',pic:'ZZZ9',hsh:true},{av:'AV49PwdGrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'AV48ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV15GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV15GridState',fld:'vGRIDSTATE',pic:''},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV56FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV32TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV33TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'AV58TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV59TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV35TFHreNumCie',fld:'vTFHRENUMCIE',pic:'Z9'},{av:'AV36TFHreNumCie_To',fld:'vTFHRENUMCIE_TO',pic:'Z9'},{av:'AV38TFHreLinMaq',fld:'vTFHRELINMAQ',pic:'ZZZ9'},{av:'AV39TFHreLinMaq_To',fld:'vTFHRELINMAQ_TO',pic:'ZZZ9'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtHreMaqCod_Visible',ctrl:'HREMAQCOD',prop:'Visible'},{av:'edtHreVolPrd_Visible',ctrl:'HREVOLPRD',prop:'Visible'},{av:'edtHreNumCie_Visible',ctrl:'HRENUMCIE',prop:'Visible'},{av:'edtHreLinMaq_Visible',ctrl:'HRELINMAQ',prop:'Visible'},{av:'AV43GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV44GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV28ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DORECETAHISTORICO'","{handler:'e11TD1',iparms:[{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'}]");
      setEventMetadata("'DORECETAHISTORICO'",",oparms:[]}");
      setEventMetadata("'DORECETACOSTES'","{handler:'e17TD2',iparms:[{av:'AV47Receta',fld:'vRECETA',pic:'ZZZ9',hsh:true},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'AV49PwdGrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'AV48ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("'DORECETACOSTES'",",oparms:[{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DORECETACONNORMAS'","{handler:'e18TD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV56FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6HreBarcod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Hrebarreo',fld:'vHREBARREO',pic:'9'},{av:'AV8Hrebarpar',fld:'vHREBARPAR',pic:''},{av:'AV9Hremaqcod',fld:'vHREMAQCOD',pic:''},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV32TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV33TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'AV58TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV59TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV35TFHreNumCie',fld:'vTFHRENUMCIE',pic:'Z9'},{av:'AV36TFHreNumCie_To',fld:'vTFHRENUMCIE_TO',pic:'Z9'},{av:'AV38TFHreLinMaq',fld:'vTFHRELINMAQ',pic:'ZZZ9'},{av:'AV39TFHreLinMaq_To',fld:'vTFHRELINMAQ_TO',pic:'ZZZ9'},{av:'AV74Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV47Receta',fld:'vRECETA',pic:'ZZZ9',hsh:true},{av:'AV49PwdGrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'AV48ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4545HreLinMaq',fld:'HRELINMAQ',pic:'ZZZ9'},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'}]");
      setEventMetadata("'DORECETACONNORMAS'",",oparms:[{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A4545HreLinMaq',fld:'HRELINMAQ',pic:'ZZZ9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtHreMaqCod_Visible',ctrl:'HREMAQCOD',prop:'Visible'},{av:'edtHreVolPrd_Visible',ctrl:'HREVOLPRD',prop:'Visible'},{av:'edtHreNumCie_Visible',ctrl:'HRENUMCIE',prop:'Visible'},{av:'edtHreLinMaq_Visible',ctrl:'HRELINMAQ',prop:'Visible'},{av:'AV43GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV44GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV28ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV15GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Hrebarpar',iparms:[]");
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
      wcpOAV5Emprcod = "" ;
      wcpOAV8Hrebarpar = "" ;
      wcpOAV9Hremaqcod = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV5Emprcod = "" ;
      AV8Hrebarpar = "" ;
      AV9Hremaqcod = "" ;
      AV56FilterFullText = "" ;
      AV25ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV32TFHreMaqCod = "" ;
      AV33TFHreMaqCod_Sel = "" ;
      AV74Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV28ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV41DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      A396EmprCod = "" ;
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
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      ucGxuitabspanel_tabs = new com.genexus.webpanels.GXUserControl();
      lblPrcesos_title_Jsonclick = "" ;
      WebComp_Wcwcprocesosquimicos_Component = "" ;
      OldWcwcprocesosquimicos = "" ;
      lblCosteshdr_title_Jsonclick = "" ;
      WebComp_Wcwccostesproductos_Component = "" ;
      OldWcwccostesproductos = "" ;
      lblAnadidas_title_Jsonclick = "" ;
      WebComp_Wcwccostesproductosadiciones_Component = "" ;
      OldWcwccostesproductosadiciones = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A4546HreMaqCod = "" ;
      A4494HreBarPar = "" ;
      scmdbuf = "" ;
      lV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext = "" ;
      lV66Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod = "" ;
      AV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext = "" ;
      AV67Formulaciontinte_wchistoricorecetasds_3_tfhremaqcod_sel = "" ;
      AV66Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod = "" ;
      H00TD2_A396EmprCod = new String[] {""} ;
      H00TD2_A4494HreBarPar = new String[] {""} ;
      H00TD2_A4493HreBarReo = new byte[1] ;
      H00TD2_A4492HreBarCod = new int[1] ;
      H00TD2_A4545HreLinMaq = new short[1] ;
      H00TD2_A4495HreNumCie = new byte[1] ;
      H00TD2_A4547HreVolPrd = new int[1] ;
      H00TD2_n4547HreVolPrd = new boolean[] {false} ;
      H00TD2_A4546HreMaqCod = new String[] {""} ;
      H00TD2_n4546HreMaqCod = new boolean[] {false} ;
      H00TD3_AGRID_nRecordCount = new long[1] ;
      GXv_int4 = new int[1] ;
      GXv_int2 = new byte[1] ;
      AV60Station = "" ;
      GXv_char6 = new String[1] ;
      AV61EmprNom = "" ;
      GXv_char7 = new String[1] ;
      AV62UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV11WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV27Session = httpContext.getWebSession();
      AV23ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV29ManageFiltersXml = "" ;
      AV54WebSession = httpContext.getWebSession();
      AV46window = new com.genexus.webpanels.GXWindow();
      AV24UserCustomValue = "" ;
      AV26ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector13 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15 = new GXBaseCollection[1] ;
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char5 = "" ;
      GXv_char8 = new String[1] ;
      GXv_SdtWWPGridState16 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV13TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12HTTPRequest = httpContext.getHttpRequest();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5Emprcod = "" ;
      sCtrlAV6HreBarcod = "" ;
      sCtrlAV7Hrebarreo = "" ;
      sCtrlAV8Hrebarpar = "" ;
      sCtrlAV9Hremaqcod = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.wchistoricorecetas__default(),
         new Object[] {
             new Object[] {
            H00TD2_A396EmprCod, H00TD2_A4494HreBarPar, H00TD2_A4493HreBarReo, H00TD2_A4492HreBarCod, H00TD2_A4545HreLinMaq, H00TD2_A4495HreNumCie, H00TD2_A4547HreVolPrd, H00TD2_n4547HreVolPrd, H00TD2_A4546HreMaqCod, H00TD2_n4546HreMaqCod
            }
            , new Object[] {
            H00TD3_AGRID_nRecordCount
            }
         }
      );
      AV74Pgmname = "FormulacionTinte.WCHistoricoRecetas" ;
      /* GeneXus formulas. */
      AV74Pgmname = "FormulacionTinte.WCHistoricoRecetas" ;
      Gx_err = (short)(0) ;
      WebComp_Wcwcprocesosquimicos = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwccostesproductos = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwccostesproductosadiciones = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV7Hrebarreo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV7Hrebarreo ;
   private byte AV30ManageFiltersExecutionStep ;
   private byte AV35TFHreNumCie ;
   private byte AV36TFHreNumCie_To ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A4495HreNumCie ;
   private byte A4493HreBarReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV70Formulaciontinte_wchistoricorecetasds_6_tfhrenumcie ;
   private byte AV71Formulaciontinte_wchistoricorecetasds_7_tfhrenumcie_to ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV38TFHreLinMaq ;
   private short AV39TFHreLinMaq_To ;
   private short AV17OrderedBy ;
   private short AV47Receta ;
   private short AV49PwdGrl ;
   private short wbEnd ;
   private short wbStart ;
   private short A4545HreLinMaq ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV72Formulaciontinte_wchistoricorecetasds_8_tfhrelinmaq ;
   private short AV73Formulaciontinte_wchistoricorecetasds_9_tfhrelinmaq_to ;
   private short AV50anahuac ;
   private int wcpOAV6HreBarcod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_46 ;
   private int AV6HreBarcod ;
   private int nGXsfl_46_idx=1 ;
   private int AV58TFHreVolPrd ;
   private int AV59TFHreVolPrd_To ;
   private int AV48ContVal ;
   private int Gridpaginationbar_Pagestoshow ;
   private int Gxuitabspanel_tabs_Pagecount ;
   private int A4547HreVolPrd ;
   private int A4492HreBarCod ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV68Formulaciontinte_wchistoricorecetasds_4_tfhrevolprd ;
   private int AV69Formulaciontinte_wchistoricorecetasds_5_tfhrevolprd_to ;
   private int GXt_int3 ;
   private int GXv_int4[] ;
   private int edtHreMaqCod_Visible ;
   private int edtHreVolPrd_Visible ;
   private int edtHreNumCie_Visible ;
   private int edtHreLinMaq_Visible ;
   private int AV42PageToGo ;
   private int AV75GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV43GridCurrentPage ;
   private long AV44GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV5Emprcod ;
   private String wcpOAV8Hrebarpar ;
   private String wcpOAV9Hremaqcod ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV5Emprcod ;
   private String AV8Hrebarpar ;
   private String AV9Hremaqcod ;
   private String sGXsfl_46_idx="0001" ;
   private String AV32TFHreMaqCod ;
   private String AV33TFHreMaqCod_Sel ;
   private String AV74Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
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
   private String Gxuitabspanel_tabs_Class ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
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
   private String divUnnamedtable1_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String Gxuitabspanel_tabs_Internalname ;
   private String lblPrcesos_title_Internalname ;
   private String lblPrcesos_title_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String WebComp_Wcwcprocesosquimicos_Component ;
   private String OldWcwcprocesosquimicos ;
   private String lblCosteshdr_title_Internalname ;
   private String lblCosteshdr_title_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String WebComp_Wcwccostesproductos_Component ;
   private String OldWcwccostesproductos ;
   private String lblAnadidas_title_Internalname ;
   private String lblAnadidas_title_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String WebComp_Wcwccostesproductosadiciones_Component ;
   private String OldWcwccostesproductosadiciones ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String A4546HreMaqCod ;
   private String edtHreMaqCod_Internalname ;
   private String edtHreVolPrd_Internalname ;
   private String edtHreNumCie_Internalname ;
   private String edtHreLinMaq_Internalname ;
   private String edtHreBarCod_Internalname ;
   private String edtHreBarReo_Internalname ;
   private String A4494HreBarPar ;
   private String edtHreBarPar_Internalname ;
   private String scmdbuf ;
   private String lV66Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod ;
   private String AV67Formulaciontinte_wchistoricorecetasds_3_tfhremaqcod_sel ;
   private String AV66Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod ;
   private String AV60Station ;
   private String GXv_char6[] ;
   private String AV61EmprNom ;
   private String GXv_char7[] ;
   private String AV62UsurCod ;
   private String GXt_char5 ;
   private String GXv_char8[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV5Emprcod ;
   private String sCtrlAV6HreBarcod ;
   private String sCtrlAV7Hrebarreo ;
   private String sCtrlAV8Hrebarpar ;
   private String sCtrlAV9Hremaqcod ;
   private String sGXsfl_46_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtHreMaqCod_Jsonclick ;
   private String edtHreVolPrd_Jsonclick ;
   private String edtHreNumCie_Jsonclick ;
   private String edtHreLinMaq_Jsonclick ;
   private String edtHreBarCod_Jsonclick ;
   private String edtHreBarReo_Jsonclick ;
   private String edtHreBarPar_Jsonclick ;
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
   private boolean Gxuitabspanel_tabs_Historymanagement ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean bGXsfl_46_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n4546HreMaqCod ;
   private boolean n4547HreVolPrd ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wcwccostesproductosadiciones ;
   private boolean bDynCreated_Wcwccostesproductos ;
   private boolean bDynCreated_Wcwcprocesosquimicos ;
   private boolean gx_refresh_fired ;
   private boolean AV53ClaveConfirmada ;
   private String AV23ColumnsSelectorXML ;
   private String AV29ManageFiltersXml ;
   private String AV24UserCustomValue ;
   private String AV56FilterFullText ;
   private String lV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext ;
   private String AV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.GXWindow AV46window ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcwcprocesosquimicos ;
   private GXWebComponent WebComp_Wcwccostesproductos ;
   private GXWebComponent WebComp_Wcwccostesproductosadiciones ;
   private com.genexus.internet.HttpRequest AV12HTTPRequest ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private IDataStoreProvider pr_default ;
   private String[] H00TD2_A396EmprCod ;
   private String[] H00TD2_A4494HreBarPar ;
   private byte[] H00TD2_A4493HreBarReo ;
   private int[] H00TD2_A4492HreBarCod ;
   private short[] H00TD2_A4545HreLinMaq ;
   private byte[] H00TD2_A4495HreNumCie ;
   private int[] H00TD2_A4547HreVolPrd ;
   private boolean[] H00TD2_n4547HreVolPrd ;
   private String[] H00TD2_A4546HreMaqCod ;
   private boolean[] H00TD2_n4546HreMaqCod ;
   private long[] H00TD3_AGRID_nRecordCount ;
   private com.genexus.webpanels.WebSession AV54WebSession ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV28ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[] ;
   private app.wwpbaseobjects.SdtWWPContext AV11WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV13TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState16[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV26ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector13[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV41DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[] ;
}

final  class wchistoricorecetas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00TD2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext ,
                                          String AV67Formulaciontinte_wchistoricorecetasds_3_tfhremaqcod_sel ,
                                          String AV66Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod ,
                                          int AV68Formulaciontinte_wchistoricorecetasds_4_tfhrevolprd ,
                                          int AV69Formulaciontinte_wchistoricorecetasds_5_tfhrevolprd_to ,
                                          byte AV70Formulaciontinte_wchistoricorecetasds_6_tfhrenumcie ,
                                          byte AV71Formulaciontinte_wchistoricorecetasds_7_tfhrenumcie_to ,
                                          short AV72Formulaciontinte_wchistoricorecetasds_8_tfhrelinmaq ,
                                          short AV73Formulaciontinte_wchistoricorecetasds_9_tfhrelinmaq_to ,
                                          String A4546HreMaqCod ,
                                          int A4547HreVolPrd ,
                                          byte A4495HreNumCie ,
                                          short A4545HreLinMaq ,
                                          short AV17OrderedBy ,
                                          boolean AV18OrderedDsc ,
                                          String AV9Hremaqcod ,
                                          String AV5Emprcod ,
                                          int AV6HreBarcod ,
                                          byte AV7Hrebarreo ,
                                          String AV8Hrebarpar ,
                                          String A396EmprCod ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[22];
      Object[] GXv_Object18 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " EmprCod, HreBarPar, HreBarReo, HreBarCod, HreLinMaq, HreNumCie, HreVolPrd, HreMaqCod" ;
      sFromString = " FROM TXPHISREM" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ?)");
      addWhere(sWhereString, "(HreMaqCod = ?)");
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(HreMaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(HreVolPrd,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreNumCie,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreLinMaq,'9990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
         GXv_int17[6] = (byte)(1) ;
         GXv_int17[7] = (byte)(1) ;
         GXv_int17[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Formulaciontinte_wchistoricorecetasds_3_tfhremaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV66Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Formulaciontinte_wchistoricorecetasds_3_tfhremaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(HreMaqCod = ?)");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (0==AV68Formulaciontinte_wchistoricorecetasds_4_tfhrevolprd) )
      {
         addWhere(sWhereString, "(HreVolPrd >= ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (0==AV69Formulaciontinte_wchistoricorecetasds_5_tfhrevolprd_to) )
      {
         addWhere(sWhereString, "(HreVolPrd <= ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (0==AV70Formulaciontinte_wchistoricorecetasds_6_tfhrenumcie) )
      {
         addWhere(sWhereString, "(HreNumCie >= ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! (0==AV71Formulaciontinte_wchistoricorecetasds_7_tfhrenumcie_to) )
      {
         addWhere(sWhereString, "(HreNumCie <= ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (0==AV72Formulaciontinte_wchistoricorecetasds_8_tfhrelinmaq) )
      {
         addWhere(sWhereString, "(HreLinMaq >= ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( ! (0==AV73Formulaciontinte_wchistoricorecetasds_9_tfhrelinmaq_to) )
      {
         addWhere(sWhereString, "(HreLinMaq <= ?)");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
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
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_H00TD3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext ,
                                          String AV67Formulaciontinte_wchistoricorecetasds_3_tfhremaqcod_sel ,
                                          String AV66Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod ,
                                          int AV68Formulaciontinte_wchistoricorecetasds_4_tfhrevolprd ,
                                          int AV69Formulaciontinte_wchistoricorecetasds_5_tfhrevolprd_to ,
                                          byte AV70Formulaciontinte_wchistoricorecetasds_6_tfhrenumcie ,
                                          byte AV71Formulaciontinte_wchistoricorecetasds_7_tfhrenumcie_to ,
                                          short AV72Formulaciontinte_wchistoricorecetasds_8_tfhrelinmaq ,
                                          short AV73Formulaciontinte_wchistoricorecetasds_9_tfhrelinmaq_to ,
                                          String A4546HreMaqCod ,
                                          int A4547HreVolPrd ,
                                          byte A4495HreNumCie ,
                                          short A4545HreLinMaq ,
                                          short AV17OrderedBy ,
                                          boolean AV18OrderedDsc ,
                                          String AV9Hremaqcod ,
                                          String AV5Emprcod ,
                                          int AV6HreBarcod ,
                                          byte AV7Hrebarreo ,
                                          String AV8Hrebarpar ,
                                          String A396EmprCod ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[17];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPHISREM" ;
      addWhere(sWhereString, "(EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ?)");
      addWhere(sWhereString, "(HreMaqCod = ?)");
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_wchistoricorecetasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(HreMaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(HreVolPrd,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreNumCie,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreLinMaq,'9990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int19[5] = (byte)(1) ;
         GXv_int19[6] = (byte)(1) ;
         GXv_int19[7] = (byte)(1) ;
         GXv_int19[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Formulaciontinte_wchistoricorecetasds_3_tfhremaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV66Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Formulaciontinte_wchistoricorecetasds_3_tfhremaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(HreMaqCod = ?)");
      }
      else
      {
         GXv_int19[10] = (byte)(1) ;
      }
      if ( ! (0==AV68Formulaciontinte_wchistoricorecetasds_4_tfhrevolprd) )
      {
         addWhere(sWhereString, "(HreVolPrd >= ?)");
      }
      else
      {
         GXv_int19[11] = (byte)(1) ;
      }
      if ( ! (0==AV69Formulaciontinte_wchistoricorecetasds_5_tfhrevolprd_to) )
      {
         addWhere(sWhereString, "(HreVolPrd <= ?)");
      }
      else
      {
         GXv_int19[12] = (byte)(1) ;
      }
      if ( ! (0==AV70Formulaciontinte_wchistoricorecetasds_6_tfhrenumcie) )
      {
         addWhere(sWhereString, "(HreNumCie >= ?)");
      }
      else
      {
         GXv_int19[13] = (byte)(1) ;
      }
      if ( ! (0==AV71Formulaciontinte_wchistoricorecetasds_7_tfhrenumcie_to) )
      {
         addWhere(sWhereString, "(HreNumCie <= ?)");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( ! (0==AV72Formulaciontinte_wchistoricorecetasds_8_tfhrelinmaq) )
      {
         addWhere(sWhereString, "(HreLinMaq >= ?)");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( ! (0==AV73Formulaciontinte_wchistoricorecetasds_9_tfhrelinmaq_to) )
      {
         addWhere(sWhereString, "(HreLinMaq <= ?)");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
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
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
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
                  return conditional_H00TD2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Boolean) dynConstraints[14]).booleanValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] );
            case 1 :
                  return conditional_H00TD3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Boolean) dynConstraints[14]).booleanValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00TD2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00TD3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[37]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[19]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               return;
      }
   }

}

