package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wccostesproductosadiciones__impl extends GXWebComponent
{
   public wccostesproductosadiciones__impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wccostesproductosadiciones__impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wccostesproductosadiciones__impl.class ));
   }

   public wccostesproductosadiciones__impl( int remoteHandle ,
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
               AV17Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Emprcod", AV17Emprcod);
               AV18Hrebarcod = (int)(GXutil.lval( httpContext.GetPar( "Hrebarcod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Hrebarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Hrebarcod), 8, 0));
               AV19Hrebarreo = (byte)(GXutil.lval( httpContext.GetPar( "Hrebarreo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Hrebarreo", GXutil.str( AV19Hrebarreo, 1, 0));
               AV20HreBarPar = httpContext.GetPar( "HreBarPar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20HreBarPar", AV20HreBarPar);
               AV21HreNumcie = (byte)(GXutil.lval( httpContext.GetPar( "HreNumcie"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21HreNumcie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21HreNumcie), 2, 0));
               AV22HreLinMaq = (short)(GXutil.lval( httpContext.GetPar( "HreLinMaq"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22HreLinMaq), 4, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV17Emprcod,Integer.valueOf(AV18Hrebarcod),Byte.valueOf(AV19Hrebarreo),AV20HreBarPar,Byte.valueOf(AV21HreNumcie),Short.valueOf(AV22HreLinMaq)});
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
      nRC_GXsfl_20 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_20"))) ;
      nGXsfl_20_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_20_idx"))) ;
      sGXsfl_20_idx = httpContext.GetPar( "sGXsfl_20_idx") ;
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
      AV17Emprcod = httpContext.GetPar( "Emprcod") ;
      AV18Hrebarcod = (int)(GXutil.lval( httpContext.GetPar( "Hrebarcod"))) ;
      AV19Hrebarreo = (byte)(GXutil.lval( httpContext.GetPar( "Hrebarreo"))) ;
      AV20HreBarPar = httpContext.GetPar( "HreBarPar") ;
      AV21HreNumcie = (byte)(GXutil.lval( httpContext.GetPar( "HreNumcie"))) ;
      AV22HreLinMaq = (short)(GXutil.lval( httpContext.GetPar( "HreLinMaq"))) ;
      AV23TFHreLanyPvp = CommonUtil.decimalVal( httpContext.GetPar( "TFHreLanyPvp"), ".") ;
      AV24TFHreLanyPvp_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHreLanyPvp_To"), ".") ;
      AV25TFHreLanyCost = CommonUtil.decimalVal( httpContext.GetPar( "TFHreLanyCost"), ".") ;
      AV26TFHreLanyCost_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHreLanyCost_To"), ".") ;
      AV32Pgmname = httpContext.GetPar( "Pgmname") ;
      AV28TotHreLanyCost = CommonUtil.decimalVal( httpContext.GetPar( "TotHreLanyCost"), ".") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV17Emprcod, AV18Hrebarcod, AV19Hrebarreo, AV20HreBarPar, AV21HreNumcie, AV22HreLinMaq, AV23TFHreLanyPvp, AV24TFHreLanyPvp_To, AV25TFHreLanyCost, AV26TFHreLanyCost_To, AV32Pgmname, AV28TotHreLanyCost, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa29E2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " HISTORICO RECETAS AÑAD.BALANZ.", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wccostesproductosadiciones_", new String[] {GXutil.URLEncode(GXutil.rtrim(AV17Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV18Hrebarcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV19Hrebarreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV20HreBarPar)),GXutil.URLEncode(GXutil.ltrimstr(AV21HreNumcie,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV22HreLinMaq,4,0))}, new String[] {"Emprcod","Hrebarcod","Hrebarreo","HreBarPar","HreNumcie","HreLinMaq"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHRELANYCOST", getSecureSignedToken( sPrefix, localUtil.format( AV28TotHreLanyCost, "ZZZZZZ9.99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCCostesProductosAdiciones_");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV32Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("wccostesproductosadiciones_:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_20", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_20, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV27DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV27DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV17Emprcod", GXutil.rtrim( wcpOAV17Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV18Hrebarcod", GXutil.ltrim( localUtil.ntoc( wcpOAV18Hrebarcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV19Hrebarreo", GXutil.ltrim( localUtil.ntoc( wcpOAV19Hrebarreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV20HreBarPar", GXutil.rtrim( wcpOAV20HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV21HreNumcie", GXutil.ltrim( localUtil.ntoc( wcpOAV21HreNumcie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV22HreLinMaq", GXutil.ltrim( localUtil.ntoc( wcpOAV22HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRELANYPVP", GXutil.ltrim( localUtil.ntoc( AV23TFHreLanyPvp, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRELANYPVP_TO", GXutil.ltrim( localUtil.ntoc( AV24TFHreLanyPvp_To, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRELANYCOST", GXutil.ltrim( localUtil.ntoc( AV25TFHreLanyCost, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRELANYCOST_TO", GXutil.ltrim( localUtil.ntoc( AV26TFHreLanyCost_To, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV17Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHREBARCOD", GXutil.ltrim( localUtil.ntoc( AV18Hrebarcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHREBARREO", GXutil.ltrim( localUtil.ntoc( AV19Hrebarreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHREBARPAR", GXutil.rtrim( AV20HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHRENUMCIE", GXutil.ltrim( localUtil.ntoc( AV21HreNumcie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHRELINMAQ", GXutil.ltrim( localUtil.ntoc( AV22HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTHRELANYCOST", GXutil.ltrim( localUtil.ntoc( AV28TotHreLanyCost, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHRELANYCOST", getSecureSignedToken( sPrefix, localUtil.format( AV28TotHreLanyCost, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREBARCOD", GXutil.ltrim( localUtil.ntoc( A4492HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREBARREO", GXutil.ltrim( localUtil.ntoc( A4493HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREBARPAR", GXutil.rtrim( A4494HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HRENUMCIE", GXutil.ltrim( localUtil.ntoc( A4495HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HRELINMAL", GXutil.ltrim( localUtil.ntoc( A4508HreLinMAL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
   }

   public void renderHtmlCloseForm29E2( )
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
      return "WCCostesProductosAdiciones_" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " HISTORICO RECETAS AÑAD.BALANZ.", "") ;
   }

   public void wb29E0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wccostesproductosadiciones_");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablegrid_Internalname, 1, 0, "px", 0, "px", "grid-scroll-horizontal", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithtotalizers_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol20( ) ;
      }
      if ( wbEnd == 20 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_20 = (int)(nGXsfl_20_idx-1) ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_29_29E2( true) ;
      }
      else
      {
         wb_table1_29_29E2( false) ;
      }
      return  ;
   }

   public void wb_table1_29_29E2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV32Pgmname), GXutil.rtrim( localUtil.format( AV32Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCCostesProductosAdiciones_.htm");
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
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV27DDO_TitleSettingsIcons);
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
      if ( wbEnd == 20 )
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

   public void start29E2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " HISTORICO RECETAS AÑAD.BALANZ.", ""), (short)(0)) ;
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
            strup29E0( ) ;
         }
      }
   }

   public void ws29E2( )
   {
      start29E2( ) ;
      evt29E2( ) ;
   }

   public void evt29E2( )
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
                              strup29E0( ) ;
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
                              strup29E0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1129E2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup29E0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavTotvaluehrelanycost_Internalname ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup29E0( ) ;
                           }
                           AV36Wccostesproductosadiciones_ds_1_tfhrelanypvp = AV23TFHreLanyPvp ;
                           AV37Wccostesproductosadiciones_ds_2_tfhrelanypvp_to = AV24TFHreLanyPvp_To ;
                           AV38Wccostesproductosadiciones_ds_3_tfhrelanycost = AV25TFHreLanyCost ;
                           AV39Wccostesproductosadiciones_ds_4_tfhrelanycost_to = AV26TFHreLanyCost_To ;
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
                              strup29E0( ) ;
                           }
                           nGXsfl_20_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_20_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_20_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_202( ) ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A4510HrdPrdDsc = httpContext.cgiGet( edtHrdPrdDsc_Internalname) ;
                           n4510HrdPrdDsc = false ;
                           A4511HrePrdCFin = localUtil.ctond( httpContext.cgiGet( edtHrePrdCFin_Internalname)) ;
                           n4511HrePrdCFin = false ;
                           A707PrdFacCon = localUtil.ctond( httpContext.cgiGet( edtPrdFacCon_Internalname)) ;
                           A14363HreLanyPvp = localUtil.ctond( httpContext.cgiGet( edtHreLanyPvp_Internalname)) ;
                           A14364HreLanyCos = localUtil.ctond( httpContext.cgiGet( edtHreLanyCos_Internalname)) ;
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
                                       GX_FocusControl = edtavTotvaluehrelanycost_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e1229E2 ();
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
                                       GX_FocusControl = edtavTotvaluehrelanycost_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e1329E2 ();
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
                                       GX_FocusControl = edtavTotvaluehrelanycost_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e1429E2 ();
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
                                    strup29E0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavTotvaluehrelanycost_Internalname ;
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

   public void we29E2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm29E2( ) ;
         }
      }
   }

   public void pa29E2( )
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
            GX_FocusControl = edtavTotvaluehrelanycost_Internalname ;
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
      subsflControlProps_202( ) ;
      while ( nGXsfl_20_idx <= nRC_GXsfl_20 )
      {
         sendrow_202( ) ;
         nGXsfl_20_idx = ((subGrid_Islastpage==1)&&(nGXsfl_20_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_20_idx+1) ;
         sGXsfl_20_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_20_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_202( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV17Emprcod ,
                                 int AV18Hrebarcod ,
                                 byte AV19Hrebarreo ,
                                 String AV20HreBarPar ,
                                 byte AV21HreNumcie ,
                                 short AV22HreLinMaq ,
                                 java.math.BigDecimal AV23TFHreLanyPvp ,
                                 java.math.BigDecimal AV24TFHreLanyPvp_To ,
                                 java.math.BigDecimal AV25TFHreLanyCost ,
                                 java.math.BigDecimal AV26TFHreLanyCost_To ,
                                 String AV32Pgmname ,
                                 java.math.BigDecimal AV28TotHreLanyCost ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1329E2 ();
      GRID_nCurrentRecord = 0 ;
      rf29E2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCCostesProductosAdiciones_");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV32Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("wccostesproductosadiciones_:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_20_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf29E2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV32Pgmname = "WCCostesProductosAdiciones_" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Pgmname", AV32Pgmname);
      Gx_err = (short)(0) ;
      edtavTotvaluehrelanycost_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluehrelanycost_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehrelanycost_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV36Wccostesproductosadiciones_ds_1_tfhrelanypvp = AV23TFHreLanyPvp ;
      AV37Wccostesproductosadiciones_ds_2_tfhrelanypvp_to = AV24TFHreLanyPvp_To ;
      AV38Wccostesproductosadiciones_ds_3_tfhrelanycost = AV25TFHreLanyCost ;
      AV39Wccostesproductosadiciones_ds_4_tfhrelanycost_to = AV26TFHreLanyCost_To ;
      GRID_nRecordCount = 0 ;
      /* Using cursor H029E2 */
      pr_default.execute(0, new Object[] {AV17Emprcod, Integer.valueOf(AV18Hrebarcod), Byte.valueOf(AV19Hrebarreo), AV20HreBarPar, Byte.valueOf(AV21HreNumcie), Short.valueOf(AV22HreLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4510HrdPrdDsc = H029E2_A4510HrdPrdDsc[0] ;
         n4510HrdPrdDsc = H029E2_n4510HrdPrdDsc[0] ;
         A719PrdNum = H029E2_A719PrdNum[0] ;
         A4508HreLinMAL = H029E2_A4508HreLinMAL[0] ;
         A4495HreNumCie = H029E2_A4495HreNumCie[0] ;
         A4494HreBarPar = H029E2_A4494HreBarPar[0] ;
         A4493HreBarReo = H029E2_A4493HreBarReo[0] ;
         A4492HreBarCod = H029E2_A4492HreBarCod[0] ;
         A396EmprCod = H029E2_A396EmprCod[0] ;
         A707PrdFacCon = H029E2_A707PrdFacCon[0] ;
         A4511HrePrdCFin = H029E2_A4511HrePrdCFin[0] ;
         n4511HrePrdCFin = H029E2_n4511HrePrdCFin[0] ;
         A707PrdFacCon = H029E2_A707PrdFacCon[0] ;
         GXt_decimal1 = A14363HreLanyPvp ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = A4492HreBarCod ;
         GXv_int4[0] = A4493HreBarReo ;
         GXv_char5[0] = A4494HreBarPar ;
         GXv_int6[0] = A4495HreNumCie ;
         GXv_int7[0] = A4508HreLinMAL ;
         GXv_char8[0] = A719PrdNum ;
         GXv_decimal9[0] = GXt_decimal1 ;
         new app.precioproductoadicionado(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int4, GXv_char5, GXv_int6, GXv_int7, GXv_char8, GXv_decimal9) ;
         wccostesproductosadiciones__impl.this.A396EmprCod = GXv_char2[0] ;
         wccostesproductosadiciones__impl.this.A4492HreBarCod = GXv_int3[0] ;
         wccostesproductosadiciones__impl.this.A4493HreBarReo = GXv_int4[0] ;
         wccostesproductosadiciones__impl.this.A4494HreBarPar = GXv_char5[0] ;
         wccostesproductosadiciones__impl.this.A4495HreNumCie = GXv_int6[0] ;
         wccostesproductosadiciones__impl.this.A4508HreLinMAL = GXv_int7[0] ;
         wccostesproductosadiciones__impl.this.A719PrdNum = GXv_char8[0] ;
         wccostesproductosadiciones__impl.this.GXt_decimal1 = GXv_decimal9[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4494HreBarPar", A4494HreBarPar);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4508HreLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4508HreLinMAL), 4, 0));
         A14363HreLanyPvp = GXt_decimal1 ;
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV36Wccostesproductosadiciones_ds_1_tfhrelanypvp)==0) || ( ( DecimalUtil.compareTo(A14363HreLanyPvp, AV36Wccostesproductosadiciones_ds_1_tfhrelanypvp) >= 0 ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV37Wccostesproductosadiciones_ds_2_tfhrelanypvp_to)==0) || ( ( DecimalUtil.compareTo(A14363HreLanyPvp, AV37Wccostesproductosadiciones_ds_2_tfhrelanypvp_to) <= 0 ) ) )
            {
               A14364HreLanyCos = GXutil.roundDecimal( A4511HrePrdCFin.multiply(A707PrdFacCon).multiply(A14363HreLanyPvp).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV38Wccostesproductosadiciones_ds_3_tfhrelanycost)==0) || ( ( DecimalUtil.compareTo(A14364HreLanyCos, AV38Wccostesproductosadiciones_ds_3_tfhrelanycost) >= 0 ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39Wccostesproductosadiciones_ds_4_tfhrelanycost_to)==0) || ( ( DecimalUtil.compareTo(A14364HreLanyCos, AV39Wccostesproductosadiciones_ds_4_tfhrelanycost_to) <= 0 ) ) )
                  {
                     GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
                  }
               }
            }
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rf29E2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(20) ;
      /* Execute user event: Refresh */
      e1329E2 ();
      nGXsfl_20_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_20_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_20_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_202( ) ;
      bGXsfl_20_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridNoBorder WorkWith");
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
         subsflControlProps_202( ) ;
         /* Using cursor H029E3 */
         pr_default.execute(1, new Object[] {AV17Emprcod, Integer.valueOf(AV18Hrebarcod), Byte.valueOf(AV19Hrebarreo), AV20HreBarPar, Byte.valueOf(AV21HreNumcie), Short.valueOf(AV22HreLinMaq)});
         nGXsfl_20_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_20_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_20_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_202( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A4510HrdPrdDsc = H029E3_A4510HrdPrdDsc[0] ;
            n4510HrdPrdDsc = H029E3_n4510HrdPrdDsc[0] ;
            A719PrdNum = H029E3_A719PrdNum[0] ;
            A4508HreLinMAL = H029E3_A4508HreLinMAL[0] ;
            A4495HreNumCie = H029E3_A4495HreNumCie[0] ;
            A4494HreBarPar = H029E3_A4494HreBarPar[0] ;
            A4493HreBarReo = H029E3_A4493HreBarReo[0] ;
            A4492HreBarCod = H029E3_A4492HreBarCod[0] ;
            A396EmprCod = H029E3_A396EmprCod[0] ;
            A707PrdFacCon = H029E3_A707PrdFacCon[0] ;
            A4511HrePrdCFin = H029E3_A4511HrePrdCFin[0] ;
            n4511HrePrdCFin = H029E3_n4511HrePrdCFin[0] ;
            A707PrdFacCon = H029E3_A707PrdFacCon[0] ;
            GXt_decimal1 = A14363HreLanyPvp ;
            GXv_char8[0] = A396EmprCod ;
            GXv_int3[0] = A4492HreBarCod ;
            GXv_int6[0] = A4493HreBarReo ;
            GXv_char5[0] = A4494HreBarPar ;
            GXv_int4[0] = A4495HreNumCie ;
            GXv_int7[0] = A4508HreLinMAL ;
            GXv_char2[0] = A719PrdNum ;
            GXv_decimal9[0] = GXt_decimal1 ;
            new app.precioproductoadicionado(remoteHandle, context).execute( GXv_char8, GXv_int3, GXv_int6, GXv_char5, GXv_int4, GXv_int7, GXv_char2, GXv_decimal9) ;
            wccostesproductosadiciones__impl.this.A396EmprCod = GXv_char8[0] ;
            wccostesproductosadiciones__impl.this.A4492HreBarCod = GXv_int3[0] ;
            wccostesproductosadiciones__impl.this.A4493HreBarReo = GXv_int6[0] ;
            wccostesproductosadiciones__impl.this.A4494HreBarPar = GXv_char5[0] ;
            wccostesproductosadiciones__impl.this.A4495HreNumCie = GXv_int4[0] ;
            wccostesproductosadiciones__impl.this.A4508HreLinMAL = GXv_int7[0] ;
            wccostesproductosadiciones__impl.this.A719PrdNum = GXv_char2[0] ;
            wccostesproductosadiciones__impl.this.GXt_decimal1 = GXv_decimal9[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4494HreBarPar", A4494HreBarPar);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4508HreLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4508HreLinMAL), 4, 0));
            A14363HreLanyPvp = GXt_decimal1 ;
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV36Wccostesproductosadiciones_ds_1_tfhrelanypvp)==0) || ( ( DecimalUtil.compareTo(A14363HreLanyPvp, AV36Wccostesproductosadiciones_ds_1_tfhrelanypvp) >= 0 ) ) )
            {
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV37Wccostesproductosadiciones_ds_2_tfhrelanypvp_to)==0) || ( ( DecimalUtil.compareTo(A14363HreLanyPvp, AV37Wccostesproductosadiciones_ds_2_tfhrelanypvp_to) <= 0 ) ) )
               {
                  A14364HreLanyCos = GXutil.roundDecimal( A4511HrePrdCFin.multiply(A707PrdFacCon).multiply(A14363HreLanyPvp).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV38Wccostesproductosadiciones_ds_3_tfhrelanycost)==0) || ( ( DecimalUtil.compareTo(A14364HreLanyCos, AV38Wccostesproductosadiciones_ds_3_tfhrelanycost) >= 0 ) ) )
                  {
                     if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39Wccostesproductosadiciones_ds_4_tfhrelanycost_to)==0) || ( ( DecimalUtil.compareTo(A14364HreLanyCos, AV39Wccostesproductosadiciones_ds_4_tfhrelanycost_to) <= 0 ) ) )
                     {
                        e1429E2 ();
                     }
                  }
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(20) ;
         wb29E0( ) ;
      }
      bGXsfl_20_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes29E2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTHRELANYCOST", GXutil.ltrim( localUtil.ntoc( AV28TotHreLanyCost, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHRELANYCOST", getSecureSignedToken( sPrefix, localUtil.format( AV28TotHreLanyCost, "ZZZZZZ9.99")));
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
      AV36Wccostesproductosadiciones_ds_1_tfhrelanypvp = AV23TFHreLanyPvp ;
      AV37Wccostesproductosadiciones_ds_2_tfhrelanypvp_to = AV24TFHreLanyPvp_To ;
      AV38Wccostesproductosadiciones_ds_3_tfhrelanycost = AV25TFHreLanyCost ;
      AV39Wccostesproductosadiciones_ds_4_tfhrelanycost_to = AV26TFHreLanyCost_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV17Emprcod, AV18Hrebarcod, AV19Hrebarreo, AV20HreBarPar, AV21HreNumcie, AV22HreLinMaq, AV23TFHreLanyPvp, AV24TFHreLanyPvp_To, AV25TFHreLanyCost, AV26TFHreLanyCost_To, AV32Pgmname, AV28TotHreLanyCost, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV36Wccostesproductosadiciones_ds_1_tfhrelanypvp = AV23TFHreLanyPvp ;
      AV37Wccostesproductosadiciones_ds_2_tfhrelanypvp_to = AV24TFHreLanyPvp_To ;
      AV38Wccostesproductosadiciones_ds_3_tfhrelanycost = AV25TFHreLanyCost ;
      AV39Wccostesproductosadiciones_ds_4_tfhrelanycost_to = AV26TFHreLanyCost_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV17Emprcod, AV18Hrebarcod, AV19Hrebarreo, AV20HreBarPar, AV21HreNumcie, AV22HreLinMaq, AV23TFHreLanyPvp, AV24TFHreLanyPvp_To, AV25TFHreLanyCost, AV26TFHreLanyCost_To, AV32Pgmname, AV28TotHreLanyCost, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV36Wccostesproductosadiciones_ds_1_tfhrelanypvp = AV23TFHreLanyPvp ;
      AV37Wccostesproductosadiciones_ds_2_tfhrelanypvp_to = AV24TFHreLanyPvp_To ;
      AV38Wccostesproductosadiciones_ds_3_tfhrelanycost = AV25TFHreLanyCost ;
      AV39Wccostesproductosadiciones_ds_4_tfhrelanycost_to = AV26TFHreLanyCost_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV17Emprcod, AV18Hrebarcod, AV19Hrebarreo, AV20HreBarPar, AV21HreNumcie, AV22HreLinMaq, AV23TFHreLanyPvp, AV24TFHreLanyPvp_To, AV25TFHreLanyCost, AV26TFHreLanyCost_To, AV32Pgmname, AV28TotHreLanyCost, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV36Wccostesproductosadiciones_ds_1_tfhrelanypvp = AV23TFHreLanyPvp ;
      AV37Wccostesproductosadiciones_ds_2_tfhrelanypvp_to = AV24TFHreLanyPvp_To ;
      AV38Wccostesproductosadiciones_ds_3_tfhrelanycost = AV25TFHreLanyCost ;
      AV39Wccostesproductosadiciones_ds_4_tfhrelanycost_to = AV26TFHreLanyCost_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV17Emprcod, AV18Hrebarcod, AV19Hrebarreo, AV20HreBarPar, AV21HreNumcie, AV22HreLinMaq, AV23TFHreLanyPvp, AV24TFHreLanyPvp_To, AV25TFHreLanyCost, AV26TFHreLanyCost_To, AV32Pgmname, AV28TotHreLanyCost, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV36Wccostesproductosadiciones_ds_1_tfhrelanypvp = AV23TFHreLanyPvp ;
      AV37Wccostesproductosadiciones_ds_2_tfhrelanypvp_to = AV24TFHreLanyPvp_To ;
      AV38Wccostesproductosadiciones_ds_3_tfhrelanycost = AV25TFHreLanyCost ;
      AV39Wccostesproductosadiciones_ds_4_tfhrelanycost_to = AV26TFHreLanyCost_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV17Emprcod, AV18Hrebarcod, AV19Hrebarreo, AV20HreBarPar, AV21HreNumcie, AV22HreLinMaq, AV23TFHreLanyPvp, AV24TFHreLanyPvp_To, AV25TFHreLanyCost, AV26TFHreLanyCost_To, AV32Pgmname, AV28TotHreLanyCost, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV32Pgmname = "WCCostesProductosAdiciones_" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Pgmname", AV32Pgmname);
      Gx_err = (short)(0) ;
      edtavTotvaluehrelanycost_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluehrelanycost_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehrelanycost_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup29E0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1229E2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV27DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_20 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_20"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV17Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV17Emprcod") ;
         wcpOAV18Hrebarcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV18Hrebarcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV19Hrebarreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV19Hrebarreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV20HreBarPar = httpContext.cgiGet( sPrefix+"wcpOAV20HreBarPar") ;
         wcpOAV21HreNumcie = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV21HreNumcie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV22HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV22HreLinMaq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_grid_Caption = httpContext.cgiGet( sPrefix+"DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( sPrefix+"DDO_GRID_Filterisrange") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         /* Read variables values. */
         AV29TotValueHreLanyCost = httpContext.cgiGet( edtavTotvaluehrelanycost_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TotValueHreLanyCost", AV29TotValueHreLanyCost);
         AV32Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Pgmname", AV32Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCCostesProductosAdiciones_");
         AV32Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Pgmname", AV32Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV32Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("wccostesproductosadiciones_:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1229E2 ();
      if (returnInSub) return;
   }

   public void e1229E2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char10 = AV33Station ;
      GXv_char8[0] = GXt_char10 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char8) ;
      wccostesproductosadiciones__impl.this.GXt_char10 = GXv_char8[0] ;
      AV33Station = GXt_char10 ;
      GXv_char8[0] = AV17Emprcod ;
      GXv_char5[0] = AV34Emprnom ;
      GXv_char2[0] = AV35Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV33Station, GXv_char8, GXv_char5, GXv_char2) ;
      wccostesproductosadiciones__impl.this.AV17Emprcod = GXv_char8[0] ;
      wccostesproductosadiciones__impl.this.AV34Emprnom = GXv_char5[0] ;
      wccostesproductosadiciones__impl.this.AV35Usurcod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Emprcod", AV17Emprcod);
      subGrid_Rows = 50 ;
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11 = AV27DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons12[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons12) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons12[0] ;
      AV27DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11;
   }

   public void e1329E2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext13[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext13) ;
      AV6WWPContext = GXv_SdtWWPContext13[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S152 ();
      if (returnInSub) return;
      AV36Wccostesproductosadiciones_ds_1_tfhrelanypvp = AV23TFHreLanyPvp ;
      AV37Wccostesproductosadiciones_ds_2_tfhrelanypvp_to = AV24TFHreLanyPvp_To ;
      AV38Wccostesproductosadiciones_ds_3_tfhrelanycost = AV25TFHreLanyCost ;
      AV39Wccostesproductosadiciones_ds_4_tfhrelanycost_to = AV26TFHreLanyCost_To ;
      /*  Sending Event outputs  */
   }

   public void e1129E2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreLanyPvp") == 0 )
         {
            AV23TFHreLanyPvp = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23TFHreLanyPvp", GXutil.ltrimstr( AV23TFHreLanyPvp, 11, 3));
            AV24TFHreLanyPvp_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TFHreLanyPvp_To", GXutil.ltrimstr( AV24TFHreLanyPvp_To, 11, 3));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreLanyCost") == 0 )
         {
            AV25TFHreLanyCost = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TFHreLanyCost", GXutil.ltrimstr( AV25TFHreLanyCost, 10, 2));
            AV26TFHreLanyCost_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFHreLanyCost_To", GXutil.ltrimstr( AV26TFHreLanyCost_To, 10, 2));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e1429E2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(20) ;
         }
         sendrow_202( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_20_Refreshing )
      {
         httpContext.doAjaxLoad(20, GridRow);
      }
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV14Session.getValue(AV32Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV32Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV14Session.getValue(AV32Pgmname+"GridState"), null, null);
      }
      AV40GXV1 = 1 ;
      while ( AV40GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV40GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELANYPVP") == 0 )
         {
            AV23TFHreLanyPvp = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23TFHreLanyPvp", GXutil.ltrimstr( AV23TFHreLanyPvp, 11, 3));
            AV24TFHreLanyPvp_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TFHreLanyPvp_To", GXutil.ltrimstr( AV24TFHreLanyPvp_To, 11, 3));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELANYCOST") == 0 )
         {
            AV25TFHreLanyCost = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TFHreLanyCost", GXutil.ltrimstr( AV25TFHreLanyCost, 10, 2));
            AV26TFHreLanyCost_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFHreLanyCost_To", GXutil.ltrimstr( AV26TFHreLanyCost_To, 10, 2));
         }
         AV40GXV1 = (int)(AV40GXV1+1) ;
      }
      Ddo_grid_Filteredtext_set = ((DecimalUtil.compareTo(DecimalUtil.ZERO, AV23TFHreLanyPvp)==0) ? "" : GXutil.str( AV23TFHreLanyPvp, 11, 3))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV25TFHreLanyCost)==0) ? "" : GXutil.str( AV25TFHreLanyCost, 10, 2)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((DecimalUtil.compareTo(DecimalUtil.ZERO, AV24TFHreLanyPvp_To)==0) ? "" : GXutil.str( AV24TFHreLanyPvp_To, 11, 3))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV26TFHreLanyCost_To)==0) ? "" : GXutil.str( AV26TFHreLanyCost_To, 10, 2)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV14Session.getValue(AV32Pgmname+"GridState"), null, null);
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFHRELANYPVP", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV23TFHreLanyPvp)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV24TFHreLanyPvp_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV23TFHreLanyPvp, 11, 3)), GXutil.trim( GXutil.str( AV24TFHreLanyPvp_To, 11, 3))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFHRELANYCOST", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV25TFHreLanyCost)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV26TFHreLanyCost_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV25TFHreLanyCost, 10, 2)), GXutil.trim( GXutil.str( AV26TFHreLanyCost_To, 10, 2))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV32Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV32Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "THISREA" );
      AV14Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S142( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV28TotHreLanyCost = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TotHreLanyCost", GXutil.ltrimstr( AV28TotHreLanyCost, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHRELANYCOST", getSecureSignedToken( sPrefix, localUtil.format( AV28TotHreLanyCost, "ZZZZZZ9.99")));
   }

   public void S152( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV36Wccostesproductosadiciones_ds_1_tfhrelanypvp = AV23TFHreLanyPvp ;
      AV37Wccostesproductosadiciones_ds_2_tfhrelanypvp_to = AV24TFHreLanyPvp_To ;
      AV38Wccostesproductosadiciones_ds_3_tfhrelanycost = AV25TFHreLanyCost ;
      AV39Wccostesproductosadiciones_ds_4_tfhrelanycost_to = AV26TFHreLanyCost_To ;
      /* Using cursor H029E4 */
      pr_default.execute(2, new Object[] {AV17Emprcod, Integer.valueOf(AV18Hrebarcod), Byte.valueOf(AV19Hrebarreo), AV20HreBarPar, Byte.valueOf(AV21HreNumcie), Short.valueOf(AV22HreLinMaq)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A719PrdNum = H029E4_A719PrdNum[0] ;
         A4508HreLinMAL = H029E4_A4508HreLinMAL[0] ;
         A4495HreNumCie = H029E4_A4495HreNumCie[0] ;
         A4494HreBarPar = H029E4_A4494HreBarPar[0] ;
         A4493HreBarReo = H029E4_A4493HreBarReo[0] ;
         A4492HreBarCod = H029E4_A4492HreBarCod[0] ;
         A396EmprCod = H029E4_A396EmprCod[0] ;
         A707PrdFacCon = H029E4_A707PrdFacCon[0] ;
         A4511HrePrdCFin = H029E4_A4511HrePrdCFin[0] ;
         n4511HrePrdCFin = H029E4_n4511HrePrdCFin[0] ;
         A707PrdFacCon = H029E4_A707PrdFacCon[0] ;
         GXt_decimal1 = A14363HreLanyPvp ;
         GXv_char8[0] = A396EmprCod ;
         GXv_int3[0] = A4492HreBarCod ;
         GXv_int6[0] = A4493HreBarReo ;
         GXv_char5[0] = A4494HreBarPar ;
         GXv_int4[0] = A4495HreNumCie ;
         GXv_int7[0] = A4508HreLinMAL ;
         GXv_char2[0] = A719PrdNum ;
         GXv_decimal9[0] = GXt_decimal1 ;
         new app.precioproductoadicionado(remoteHandle, context).execute( GXv_char8, GXv_int3, GXv_int6, GXv_char5, GXv_int4, GXv_int7, GXv_char2, GXv_decimal9) ;
         wccostesproductosadiciones__impl.this.A396EmprCod = GXv_char8[0] ;
         wccostesproductosadiciones__impl.this.A4492HreBarCod = GXv_int3[0] ;
         wccostesproductosadiciones__impl.this.A4493HreBarReo = GXv_int6[0] ;
         wccostesproductosadiciones__impl.this.A4494HreBarPar = GXv_char5[0] ;
         wccostesproductosadiciones__impl.this.A4495HreNumCie = GXv_int4[0] ;
         wccostesproductosadiciones__impl.this.A4508HreLinMAL = GXv_int7[0] ;
         wccostesproductosadiciones__impl.this.A719PrdNum = GXv_char2[0] ;
         wccostesproductosadiciones__impl.this.GXt_decimal1 = GXv_decimal9[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4494HreBarPar", A4494HreBarPar);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4508HreLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4508HreLinMAL), 4, 0));
         A14363HreLanyPvp = GXt_decimal1 ;
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV36Wccostesproductosadiciones_ds_1_tfhrelanypvp)==0) || ( ( DecimalUtil.compareTo(A14363HreLanyPvp, AV36Wccostesproductosadiciones_ds_1_tfhrelanypvp) >= 0 ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV37Wccostesproductosadiciones_ds_2_tfhrelanypvp_to)==0) || ( ( DecimalUtil.compareTo(A14363HreLanyPvp, AV37Wccostesproductosadiciones_ds_2_tfhrelanypvp_to) <= 0 ) ) )
            {
               A14364HreLanyCos = GXutil.roundDecimal( A4511HrePrdCFin.multiply(A707PrdFacCon).multiply(A14363HreLanyPvp).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV38Wccostesproductosadiciones_ds_3_tfhrelanycost)==0) || ( ( DecimalUtil.compareTo(A14364HreLanyCos, AV38Wccostesproductosadiciones_ds_3_tfhrelanycost) >= 0 ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39Wccostesproductosadiciones_ds_4_tfhrelanycost_to)==0) || ( ( DecimalUtil.compareTo(A14364HreLanyCos, AV39Wccostesproductosadiciones_ds_4_tfhrelanycost_to) <= 0 ) ) )
                  {
                     AV28TotHreLanyCost = A14364HreLanyCos.add(AV28TotHreLanyCost) ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TotHreLanyCost", GXutil.ltrimstr( AV28TotHreLanyCost, 18, 2));
                     app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHRELANYCOST", getSecureSignedToken( sPrefix, localUtil.format( AV28TotHreLanyCost, "ZZZZZZ9.99")));
                  }
               }
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV29TotValueHreLanyCost = localUtil.format( AV28TotHreLanyCost, "ZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TotValueHreLanyCost", AV29TotValueHreLanyCost);
   }

   public void wb_table1_29_29E2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblGridtabletotalizer_Internalname, tblGridtabletotalizer_Internalname, "", "TableTotalizerAl", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluehrelanycost_Internalname, httpContext.getMessage( "Tot Value Hre Lany Cost", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'" + sPrefix + "',false,'" + sGXsfl_20_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluehrelanycost_Internalname, AV29TotValueHreLanyCost, GXutil.rtrim( localUtil.format( AV29TotValueHreLanyCost, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluehrelanycost_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluehrelanycost_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCCostesProductosAdiciones_.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_29_29E2e( true) ;
      }
      else
      {
         wb_table1_29_29E2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV17Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Emprcod", AV17Emprcod);
      AV18Hrebarcod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Hrebarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Hrebarcod), 8, 0));
      AV19Hrebarreo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Hrebarreo", GXutil.str( AV19Hrebarreo, 1, 0));
      AV20HreBarPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20HreBarPar", AV20HreBarPar);
      AV21HreNumcie = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21HreNumcie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21HreNumcie), 2, 0));
      AV22HreLinMaq = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22HreLinMaq), 4, 0));
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
      pa29E2( ) ;
      ws29E2( ) ;
      we29E2( ) ;
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
      sCtrlAV17Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV18Hrebarcod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV19Hrebarreo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV20HreBarPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV21HreNumcie = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV22HreLinMaq = (String)getParm(obj,5,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa29E2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wccostesproductosadiciones_", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa29E2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV17Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Emprcod", AV17Emprcod);
         AV18Hrebarcod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Hrebarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Hrebarcod), 8, 0));
         AV19Hrebarreo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Hrebarreo", GXutil.str( AV19Hrebarreo, 1, 0));
         AV20HreBarPar = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20HreBarPar", AV20HreBarPar);
         AV21HreNumcie = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21HreNumcie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21HreNumcie), 2, 0));
         AV22HreLinMaq = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22HreLinMaq), 4, 0));
      }
      wcpOAV17Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV17Emprcod") ;
      wcpOAV18Hrebarcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV18Hrebarcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV19Hrebarreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV19Hrebarreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV20HreBarPar = httpContext.cgiGet( sPrefix+"wcpOAV20HreBarPar") ;
      wcpOAV21HreNumcie = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV21HreNumcie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV22HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV22HreLinMaq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV17Emprcod, wcpOAV17Emprcod) != 0 ) || ( AV18Hrebarcod != wcpOAV18Hrebarcod ) || ( AV19Hrebarreo != wcpOAV19Hrebarreo ) || ( GXutil.strcmp(AV20HreBarPar, wcpOAV20HreBarPar) != 0 ) || ( AV21HreNumcie != wcpOAV21HreNumcie ) || ( AV22HreLinMaq != wcpOAV22HreLinMaq ) ) )
      {
         setjustcreated();
      }
      wcpOAV17Emprcod = AV17Emprcod ;
      wcpOAV18Hrebarcod = AV18Hrebarcod ;
      wcpOAV19Hrebarreo = AV19Hrebarreo ;
      wcpOAV20HreBarPar = AV20HreBarPar ;
      wcpOAV21HreNumcie = AV21HreNumcie ;
      wcpOAV22HreLinMaq = AV22HreLinMaq ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV17Emprcod = httpContext.cgiGet( sPrefix+"AV17Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV17Emprcod) > 0 )
      {
         AV17Emprcod = httpContext.cgiGet( sCtrlAV17Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Emprcod", AV17Emprcod);
      }
      else
      {
         AV17Emprcod = httpContext.cgiGet( sPrefix+"AV17Emprcod_PARM") ;
      }
      sCtrlAV18Hrebarcod = httpContext.cgiGet( sPrefix+"AV18Hrebarcod_CTRL") ;
      if ( GXutil.len( sCtrlAV18Hrebarcod) > 0 )
      {
         AV18Hrebarcod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV18Hrebarcod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Hrebarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Hrebarcod), 8, 0));
      }
      else
      {
         AV18Hrebarcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV18Hrebarcod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV19Hrebarreo = httpContext.cgiGet( sPrefix+"AV19Hrebarreo_CTRL") ;
      if ( GXutil.len( sCtrlAV19Hrebarreo) > 0 )
      {
         AV19Hrebarreo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV19Hrebarreo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Hrebarreo", GXutil.str( AV19Hrebarreo, 1, 0));
      }
      else
      {
         AV19Hrebarreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV19Hrebarreo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV20HreBarPar = httpContext.cgiGet( sPrefix+"AV20HreBarPar_CTRL") ;
      if ( GXutil.len( sCtrlAV20HreBarPar) > 0 )
      {
         AV20HreBarPar = httpContext.cgiGet( sCtrlAV20HreBarPar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20HreBarPar", AV20HreBarPar);
      }
      else
      {
         AV20HreBarPar = httpContext.cgiGet( sPrefix+"AV20HreBarPar_PARM") ;
      }
      sCtrlAV21HreNumcie = httpContext.cgiGet( sPrefix+"AV21HreNumcie_CTRL") ;
      if ( GXutil.len( sCtrlAV21HreNumcie) > 0 )
      {
         AV21HreNumcie = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV21HreNumcie), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21HreNumcie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21HreNumcie), 2, 0));
      }
      else
      {
         AV21HreNumcie = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV21HreNumcie_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV22HreLinMaq = httpContext.cgiGet( sPrefix+"AV22HreLinMaq_CTRL") ;
      if ( GXutil.len( sCtrlAV22HreLinMaq) > 0 )
      {
         AV22HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV22HreLinMaq), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22HreLinMaq), 4, 0));
      }
      else
      {
         AV22HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV22HreLinMaq_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa29E2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws29E2( ) ;
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
      ws29E2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17Emprcod_PARM", GXutil.rtrim( AV17Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV17Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17Emprcod_CTRL", GXutil.rtrim( sCtrlAV17Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18Hrebarcod_PARM", GXutil.ltrim( localUtil.ntoc( AV18Hrebarcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV18Hrebarcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18Hrebarcod_CTRL", GXutil.rtrim( sCtrlAV18Hrebarcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19Hrebarreo_PARM", GXutil.ltrim( localUtil.ntoc( AV19Hrebarreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV19Hrebarreo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19Hrebarreo_CTRL", GXutil.rtrim( sCtrlAV19Hrebarreo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20HreBarPar_PARM", GXutil.rtrim( AV20HreBarPar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV20HreBarPar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20HreBarPar_CTRL", GXutil.rtrim( sCtrlAV20HreBarPar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21HreNumcie_PARM", GXutil.ltrim( localUtil.ntoc( AV21HreNumcie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV21HreNumcie)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21HreNumcie_CTRL", GXutil.rtrim( sCtrlAV21HreNumcie));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22HreLinMaq_PARM", GXutil.ltrim( localUtil.ntoc( AV22HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV22HreLinMaq)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22HreLinMaq_CTRL", GXutil.rtrim( sCtrlAV22HreLinMaq));
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
      we29E2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115551796", true, true);
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
      httpContext.AddJavascriptSource("wccostesproductosadiciones_.js", "?202682115551796", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_202( )
   {
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_20_idx ;
      edtHrdPrdDsc_Internalname = sPrefix+"HRDPRDDSC_"+sGXsfl_20_idx ;
      edtHrePrdCFin_Internalname = sPrefix+"HREPRDCFIN_"+sGXsfl_20_idx ;
      edtPrdFacCon_Internalname = sPrefix+"PRDFACCON_"+sGXsfl_20_idx ;
      edtHreLanyPvp_Internalname = sPrefix+"HRELANYPVP_"+sGXsfl_20_idx ;
      edtHreLanyCos_Internalname = sPrefix+"HRELANYCOS_"+sGXsfl_20_idx ;
   }

   public void subsflControlProps_fel_202( )
   {
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_20_fel_idx ;
      edtHrdPrdDsc_Internalname = sPrefix+"HRDPRDDSC_"+sGXsfl_20_fel_idx ;
      edtHrePrdCFin_Internalname = sPrefix+"HREPRDCFIN_"+sGXsfl_20_fel_idx ;
      edtPrdFacCon_Internalname = sPrefix+"PRDFACCON_"+sGXsfl_20_fel_idx ;
      edtHreLanyPvp_Internalname = sPrefix+"HRELANYPVP_"+sGXsfl_20_fel_idx ;
      edtHreLanyCos_Internalname = sPrefix+"HRELANYCOS_"+sGXsfl_20_fel_idx ;
   }

   public void sendrow_202( )
   {
      subsflControlProps_202( ) ;
      wb29E0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_20_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_20_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithTotalizer GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_20_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn TagColum","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHrdPrdDsc_Internalname,GXutil.rtrim( A4510HrdPrdDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHrdPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn TagColum","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHrePrdCFin_Internalname,GXutil.ltrim( localUtil.ntoc( A4511HrePrdCFin, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A4511HrePrdCFin, "ZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHrePrdCFin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdFacCon_Internalname,GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A707PrdFacCon, "Z9.9999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdFacCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreLanyPvp_Internalname,GXutil.ltrim( localUtil.ntoc( A14363HreLanyPvp, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A14363HreLanyPvp, "ZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreLanyPvp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreLanyCos_Internalname,GXutil.ltrim( localUtil.ntoc( A14364HreLanyCos, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A14364HreLanyCos, "ZZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreLanyCos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes29E2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_20_idx = ((subGrid_Islastpage==1)&&(nGXsfl_20_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_20_idx+1) ;
         sGXsfl_20_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_20_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_202( ) ;
      }
      /* End function sendrow_202 */
   }

   public void startgridcontrol20( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"20\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithTotalizer GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeValue( httpContext.getMessage( "Cantidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Factor de Conversion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridNoBorder WorkWith");
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4510HrdPrdDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4511HrePrdCFin, (byte)(11), (byte)(3), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14363HreLanyPvp, (byte)(11), (byte)(3), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14364HreLanyCos, (byte)(10), (byte)(2), ".", "")));
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
      edtPrdNum_Internalname = sPrefix+"PRDNUM" ;
      edtHrdPrdDsc_Internalname = sPrefix+"HRDPRDDSC" ;
      edtHrePrdCFin_Internalname = sPrefix+"HREPRDCFIN" ;
      edtPrdFacCon_Internalname = sPrefix+"PRDFACCON" ;
      edtHreLanyPvp_Internalname = sPrefix+"HRELANYPVP" ;
      edtHreLanyCos_Internalname = sPrefix+"HRELANYCOS" ;
      edtavTotvaluehrelanycost_Internalname = sPrefix+"vTOTVALUEHRELANYCOST" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      divGridtablewithtotalizers_Internalname = sPrefix+"GRIDTABLEWITHTOTALIZERS" ;
      divTablegrid_Internalname = sPrefix+"TABLEGRID" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
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
      edtHreLanyCos_Jsonclick = "" ;
      edtHreLanyPvp_Jsonclick = "" ;
      edtPrdFacCon_Jsonclick = "" ;
      edtHrePrdCFin_Jsonclick = "" ;
      edtHrdPrdDsc_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      subGrid_Class = "GridWithTotalizer GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvaluehrelanycost_Jsonclick = "" ;
      edtavTotvaluehrelanycost_Enabled = 1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Ddo_grid_Filterisrange = "T" ;
      Ddo_grid_Filtertype = "Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Columnssortvalues = "|" ;
      Ddo_grid_Columnids = "4:HreLanyPvp|5:HreLanyCost" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV23TFHreLanyPvp',fld:'vTFHRELANYPVP',pic:'ZZZZZZ9.999'},{av:'AV24TFHreLanyPvp_To',fld:'vTFHRELANYPVP_TO',pic:'ZZZZZZ9.999'},{av:'AV25TFHreLanyCost',fld:'vTFHRELANYCOST',pic:'ZZZZZZ9.99'},{av:'AV26TFHreLanyCost_To',fld:'vTFHRELANYCOST_TO',pic:'ZZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV17Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'AV18Hrebarcod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'AV19Hrebarreo',fld:'vHREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'AV20HreBarPar',fld:'vHREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'AV21HreNumcie',fld:'vHRENUMCIE',pic:'Z9'},{av:'A4508HreLinMAL',fld:'HRELINMAL',pic:'ZZZ9'},{av:'AV22HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'A14364HreLanyCos',fld:'HRELANYCOS',pic:'ZZZZZZ9.99'},{av:'AV28TotHreLanyCost',fld:'vTOTHRELANYCOST',pic:'ZZZZZZ9.99',hsh:true},{av:'AV32Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV28TotHreLanyCost',fld:'vTOTHRELANYCOST',pic:'ZZZZZZ9.99',hsh:true},{av:'AV29TotValueHreLanyCost',fld:'vTOTVALUEHRELANYCOST',pic:''}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1129E2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV17Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV18Hrebarcod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV19Hrebarreo',fld:'vHREBARREO',pic:'9'},{av:'AV20HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV21HreNumcie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV22HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'AV23TFHreLanyPvp',fld:'vTFHRELANYPVP',pic:'ZZZZZZ9.999'},{av:'AV24TFHreLanyPvp_To',fld:'vTFHRELANYPVP_TO',pic:'ZZZZZZ9.999'},{av:'AV25TFHreLanyCost',fld:'vTFHRELANYCOST',pic:'ZZZZZZ9.99'},{av:'AV26TFHreLanyCost_To',fld:'vTFHRELANYCOST_TO',pic:'ZZZZZZ9.99'},{av:'AV32Pgmname',fld:'vPGMNAME',pic:''},{av:'AV28TotHreLanyCost',fld:'vTOTHRELANYCOST',pic:'ZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV23TFHreLanyPvp',fld:'vTFHRELANYPVP',pic:'ZZZZZZ9.999'},{av:'AV24TFHreLanyPvp_To',fld:'vTFHRELANYPVP_TO',pic:'ZZZZZZ9.999'},{av:'AV25TFHreLanyCost',fld:'vTFHRELANYCOST',pic:'ZZZZZZ9.99'},{av:'AV26TFHreLanyCost_To',fld:'vTFHRELANYCOST_TO',pic:'ZZZZZZ9.99'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e1429E2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV23TFHreLanyPvp',fld:'vTFHRELANYPVP',pic:'ZZZZZZ9.999'},{av:'AV24TFHreLanyPvp_To',fld:'vTFHRELANYPVP_TO',pic:'ZZZZZZ9.999'},{av:'AV25TFHreLanyCost',fld:'vTFHRELANYCOST',pic:'ZZZZZZ9.99'},{av:'AV26TFHreLanyCost_To',fld:'vTFHRELANYCOST_TO',pic:'ZZZZZZ9.99'},{av:'AV32Pgmname',fld:'vPGMNAME',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV17Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'AV18Hrebarcod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'AV19Hrebarreo',fld:'vHREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'AV20HreBarPar',fld:'vHREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'AV21HreNumcie',fld:'vHRENUMCIE',pic:'Z9'},{av:'A4508HreLinMAL',fld:'HRELINMAL',pic:'ZZZ9'},{av:'AV22HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'A14364HreLanyCos',fld:'HRELANYCOS',pic:'ZZZZZZ9.99'},{av:'AV28TotHreLanyCost',fld:'vTOTHRELANYCOST',pic:'ZZZZZZ9.99',hsh:true}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'AV28TotHreLanyCost',fld:'vTOTHRELANYCOST',pic:'ZZZZZZ9.99',hsh:true},{av:'AV29TotValueHreLanyCost',fld:'vTOTVALUEHRELANYCOST',pic:''}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV23TFHreLanyPvp',fld:'vTFHRELANYPVP',pic:'ZZZZZZ9.999'},{av:'AV24TFHreLanyPvp_To',fld:'vTFHRELANYPVP_TO',pic:'ZZZZZZ9.999'},{av:'AV25TFHreLanyCost',fld:'vTFHRELANYCOST',pic:'ZZZZZZ9.99'},{av:'AV26TFHreLanyCost_To',fld:'vTFHRELANYCOST_TO',pic:'ZZZZZZ9.99'},{av:'AV32Pgmname',fld:'vPGMNAME',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV17Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'AV18Hrebarcod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'AV19Hrebarreo',fld:'vHREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'AV20HreBarPar',fld:'vHREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'AV21HreNumcie',fld:'vHRENUMCIE',pic:'Z9'},{av:'A4508HreLinMAL',fld:'HRELINMAL',pic:'ZZZ9'},{av:'AV22HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'A14364HreLanyCos',fld:'HRELANYCOS',pic:'ZZZZZZ9.99'},{av:'AV28TotHreLanyCost',fld:'vTOTHRELANYCOST',pic:'ZZZZZZ9.99',hsh:true}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'AV28TotHreLanyCost',fld:'vTOTHRELANYCOST',pic:'ZZZZZZ9.99',hsh:true},{av:'AV29TotValueHreLanyCost',fld:'vTOTVALUEHRELANYCOST',pic:''}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV23TFHreLanyPvp',fld:'vTFHRELANYPVP',pic:'ZZZZZZ9.999'},{av:'AV24TFHreLanyPvp_To',fld:'vTFHRELANYPVP_TO',pic:'ZZZZZZ9.999'},{av:'AV25TFHreLanyCost',fld:'vTFHRELANYCOST',pic:'ZZZZZZ9.99'},{av:'AV26TFHreLanyCost_To',fld:'vTFHRELANYCOST_TO',pic:'ZZZZZZ9.99'},{av:'AV32Pgmname',fld:'vPGMNAME',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV17Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'AV18Hrebarcod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'AV19Hrebarreo',fld:'vHREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'AV20HreBarPar',fld:'vHREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'AV21HreNumcie',fld:'vHRENUMCIE',pic:'Z9'},{av:'A4508HreLinMAL',fld:'HRELINMAL',pic:'ZZZ9'},{av:'AV22HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'A14364HreLanyCos',fld:'HRELANYCOS',pic:'ZZZZZZ9.99'},{av:'AV28TotHreLanyCost',fld:'vTOTHRELANYCOST',pic:'ZZZZZZ9.99',hsh:true}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'AV28TotHreLanyCost',fld:'vTOTHRELANYCOST',pic:'ZZZZZZ9.99',hsh:true},{av:'AV29TotValueHreLanyCost',fld:'vTOTVALUEHRELANYCOST',pic:''}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV23TFHreLanyPvp',fld:'vTFHRELANYPVP',pic:'ZZZZZZ9.999'},{av:'AV24TFHreLanyPvp_To',fld:'vTFHRELANYPVP_TO',pic:'ZZZZZZ9.999'},{av:'AV25TFHreLanyCost',fld:'vTFHRELANYCOST',pic:'ZZZZZZ9.99'},{av:'AV26TFHreLanyCost_To',fld:'vTFHRELANYCOST_TO',pic:'ZZZZZZ9.99'},{av:'AV32Pgmname',fld:'vPGMNAME',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV17Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'AV18Hrebarcod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'AV19Hrebarreo',fld:'vHREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'AV20HreBarPar',fld:'vHREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'AV21HreNumcie',fld:'vHRENUMCIE',pic:'Z9'},{av:'A4508HreLinMAL',fld:'HRELINMAL',pic:'ZZZ9'},{av:'AV22HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'A14364HreLanyCos',fld:'HRELANYCOS',pic:'ZZZZZZ9.99'},{av:'AV28TotHreLanyCost',fld:'vTOTHRELANYCOST',pic:'ZZZZZZ9.99',hsh:true}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'AV28TotHreLanyCost',fld:'vTOTHRELANYCOST',pic:'ZZZZZZ9.99',hsh:true},{av:'AV29TotValueHreLanyCost',fld:'vTOTVALUEHRELANYCOST',pic:''}]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_HREPRDCFIN","{handler:'valid_Hreprdcfin',iparms:[]");
      setEventMetadata("VALID_HREPRDCFIN",",oparms:[]}");
      setEventMetadata("VALID_PRDFACCON","{handler:'valid_Prdfaccon',iparms:[]");
      setEventMetadata("VALID_PRDFACCON",",oparms:[]}");
      setEventMetadata("VALID_HRELANYPVP","{handler:'valid_Hrelanypvp',iparms:[]");
      setEventMetadata("VALID_HRELANYPVP",",oparms:[]}");
      setEventMetadata("VALID_HRELANYCOS","{handler:'valid_Hrelanycos',iparms:[]");
      setEventMetadata("VALID_HRELANYCOS",",oparms:[]}");
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
      wcpOAV17Emprcod = "" ;
      wcpOAV20HreBarPar = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV17Emprcod = "" ;
      AV20HreBarPar = "" ;
      AV23TFHreLanyPvp = DecimalUtil.ZERO ;
      AV24TFHreLanyPvp_To = DecimalUtil.ZERO ;
      AV25TFHreLanyCost = DecimalUtil.ZERO ;
      AV26TFHreLanyCost_To = DecimalUtil.ZERO ;
      AV32Pgmname = "" ;
      AV28TotHreLanyCost = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV27DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
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
      AV36Wccostesproductosadiciones_ds_1_tfhrelanypvp = DecimalUtil.ZERO ;
      AV37Wccostesproductosadiciones_ds_2_tfhrelanypvp_to = DecimalUtil.ZERO ;
      AV38Wccostesproductosadiciones_ds_3_tfhrelanycost = DecimalUtil.ZERO ;
      AV39Wccostesproductosadiciones_ds_4_tfhrelanycost_to = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      A4510HrdPrdDsc = "" ;
      A4511HrePrdCFin = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A14363HreLanyPvp = DecimalUtil.ZERO ;
      A14364HreLanyCos = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      H029E2_A4509HreNumAny = new byte[1] ;
      H029E2_A4510HrdPrdDsc = new String[] {""} ;
      H029E2_n4510HrdPrdDsc = new boolean[] {false} ;
      H029E2_A719PrdNum = new String[] {""} ;
      H029E2_A4508HreLinMAL = new short[1] ;
      H029E2_A4495HreNumCie = new byte[1] ;
      H029E2_A4494HreBarPar = new String[] {""} ;
      H029E2_A4493HreBarReo = new byte[1] ;
      H029E2_A4492HreBarCod = new int[1] ;
      H029E2_A396EmprCod = new String[] {""} ;
      H029E2_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H029E2_A4511HrePrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H029E2_n4511HrePrdCFin = new boolean[] {false} ;
      H029E3_A4509HreNumAny = new byte[1] ;
      H029E3_A4510HrdPrdDsc = new String[] {""} ;
      H029E3_n4510HrdPrdDsc = new boolean[] {false} ;
      H029E3_A719PrdNum = new String[] {""} ;
      H029E3_A4508HreLinMAL = new short[1] ;
      H029E3_A4495HreNumCie = new byte[1] ;
      H029E3_A4494HreBarPar = new String[] {""} ;
      H029E3_A4493HreBarReo = new byte[1] ;
      H029E3_A4492HreBarCod = new int[1] ;
      H029E3_A396EmprCod = new String[] {""} ;
      H029E3_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H029E3_A4511HrePrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H029E3_n4511HrePrdCFin = new boolean[] {false} ;
      AV29TotValueHreLanyCost = "" ;
      hsh = "" ;
      AV33Station = "" ;
      GXt_char10 = "" ;
      AV34Emprnom = "" ;
      AV35Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons12 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext13 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV14Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState14 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      H029E4_A4509HreNumAny = new byte[1] ;
      H029E4_A719PrdNum = new String[] {""} ;
      H029E4_A4508HreLinMAL = new short[1] ;
      H029E4_A4495HreNumCie = new byte[1] ;
      H029E4_A4494HreBarPar = new String[] {""} ;
      H029E4_A4493HreBarReo = new byte[1] ;
      H029E4_A4492HreBarCod = new int[1] ;
      H029E4_A396EmprCod = new String[] {""} ;
      H029E4_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H029E4_A4511HrePrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H029E4_n4511HrePrdCFin = new boolean[] {false} ;
      GXt_decimal1 = DecimalUtil.ZERO ;
      GXv_char8 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_int4 = new byte[1] ;
      GXv_int7 = new short[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      TempTags = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV17Emprcod = "" ;
      sCtrlAV18Hrebarcod = "" ;
      sCtrlAV19Hrebarreo = "" ;
      sCtrlAV20HreBarPar = "" ;
      sCtrlAV21HreNumcie = "" ;
      sCtrlAV22HreLinMaq = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wccostesproductosadiciones___default(),
         new Object[] {
             new Object[] {
            H029E2_A4509HreNumAny, H029E2_A4510HrdPrdDsc, H029E2_n4510HrdPrdDsc, H029E2_A719PrdNum, H029E2_A4508HreLinMAL, H029E2_A4495HreNumCie, H029E2_A4494HreBarPar, H029E2_A4493HreBarReo, H029E2_A4492HreBarCod, H029E2_A396EmprCod,
            H029E2_A707PrdFacCon, H029E2_A4511HrePrdCFin, H029E2_n4511HrePrdCFin
            }
            , new Object[] {
            H029E3_A4509HreNumAny, H029E3_A4510HrdPrdDsc, H029E3_n4510HrdPrdDsc, H029E3_A719PrdNum, H029E3_A4508HreLinMAL, H029E3_A4495HreNumCie, H029E3_A4494HreBarPar, H029E3_A4493HreBarReo, H029E3_A4492HreBarCod, H029E3_A396EmprCod,
            H029E3_A707PrdFacCon, H029E3_A4511HrePrdCFin, H029E3_n4511HrePrdCFin
            }
            , new Object[] {
            H029E4_A4509HreNumAny, H029E4_A719PrdNum, H029E4_A4508HreLinMAL, H029E4_A4495HreNumCie, H029E4_A4494HreBarPar, H029E4_A4493HreBarReo, H029E4_A4492HreBarCod, H029E4_A396EmprCod, H029E4_A707PrdFacCon, H029E4_A4511HrePrdCFin,
            H029E4_n4511HrePrdCFin
            }
         }
      );
      AV32Pgmname = "WCCostesProductosAdiciones_" ;
      /* GeneXus formulas. */
      AV32Pgmname = "WCCostesProductosAdiciones_" ;
      Gx_err = (short)(0) ;
      edtavTotvaluehrelanycost_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV19Hrebarreo ;
   private byte wcpOAV21HreNumcie ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV19Hrebarreo ;
   private byte AV21HreNumcie ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXv_int6[] ;
   private byte GXv_int4[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV22HreLinMaq ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV22HreLinMaq ;
   private short A4508HreLinMAL ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int7[] ;
   private int wcpOAV18Hrebarcod ;
   private int nRC_GXsfl_20 ;
   private int AV18Hrebarcod ;
   private int subGrid_Rows ;
   private int nGXsfl_20_idx=1 ;
   private int A4492HreBarCod ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavTotvaluehrelanycost_Enabled ;
   private int AV40GXV1 ;
   private int GXv_int3[] ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV23TFHreLanyPvp ;
   private java.math.BigDecimal AV24TFHreLanyPvp_To ;
   private java.math.BigDecimal AV25TFHreLanyCost ;
   private java.math.BigDecimal AV26TFHreLanyCost_To ;
   private java.math.BigDecimal AV28TotHreLanyCost ;
   private java.math.BigDecimal AV36Wccostesproductosadiciones_ds_1_tfhrelanypvp ;
   private java.math.BigDecimal AV37Wccostesproductosadiciones_ds_2_tfhrelanypvp_to ;
   private java.math.BigDecimal AV38Wccostesproductosadiciones_ds_3_tfhrelanycost ;
   private java.math.BigDecimal AV39Wccostesproductosadiciones_ds_4_tfhrelanycost_to ;
   private java.math.BigDecimal A4511HrePrdCFin ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A14363HreLanyPvp ;
   private java.math.BigDecimal A14364HreLanyCos ;
   private java.math.BigDecimal GXt_decimal1 ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String wcpOAV17Emprcod ;
   private String wcpOAV20HreBarPar ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV17Emprcod ;
   private String AV20HreBarPar ;
   private String sGXsfl_20_idx="0001" ;
   private String AV32Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Filteredtext_set ;
   private String Ddo_grid_Filteredtextto_set ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Infinitescrolling ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablegrid_Internalname ;
   private String divGridtablewithtotalizers_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavTotvaluehrelanycost_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String A4510HrdPrdDsc ;
   private String edtHrdPrdDsc_Internalname ;
   private String edtHrePrdCFin_Internalname ;
   private String edtPrdFacCon_Internalname ;
   private String edtHreLanyPvp_Internalname ;
   private String edtHreLanyCos_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String hsh ;
   private String AV33Station ;
   private String GXt_char10 ;
   private String AV34Emprnom ;
   private String AV35Usurcod ;
   private String GXv_char8[] ;
   private String GXv_char5[] ;
   private String GXv_char2[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String TempTags ;
   private String edtavTotvaluehrelanycost_Jsonclick ;
   private String sCtrlAV17Emprcod ;
   private String sCtrlAV18Hrebarcod ;
   private String sCtrlAV19Hrebarreo ;
   private String sCtrlAV20HreBarPar ;
   private String sCtrlAV21HreNumcie ;
   private String sCtrlAV22HreLinMaq ;
   private String sGXsfl_20_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtPrdNum_Jsonclick ;
   private String edtHrdPrdDsc_Jsonclick ;
   private String edtHrePrdCFin_Jsonclick ;
   private String edtPrdFacCon_Jsonclick ;
   private String edtHreLanyPvp_Jsonclick ;
   private String edtHreLanyCos_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n4510HrdPrdDsc ;
   private boolean n4511HrePrdCFin ;
   private boolean bGXsfl_20_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV29TotValueHreLanyCost ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private byte[] H029E2_A4509HreNumAny ;
   private String[] H029E2_A4510HrdPrdDsc ;
   private boolean[] H029E2_n4510HrdPrdDsc ;
   private String[] H029E2_A719PrdNum ;
   private short[] H029E2_A4508HreLinMAL ;
   private byte[] H029E2_A4495HreNumCie ;
   private String[] H029E2_A4494HreBarPar ;
   private byte[] H029E2_A4493HreBarReo ;
   private int[] H029E2_A4492HreBarCod ;
   private String[] H029E2_A396EmprCod ;
   private java.math.BigDecimal[] H029E2_A707PrdFacCon ;
   private java.math.BigDecimal[] H029E2_A4511HrePrdCFin ;
   private boolean[] H029E2_n4511HrePrdCFin ;
   private byte[] H029E3_A4509HreNumAny ;
   private String[] H029E3_A4510HrdPrdDsc ;
   private boolean[] H029E3_n4510HrdPrdDsc ;
   private String[] H029E3_A719PrdNum ;
   private short[] H029E3_A4508HreLinMAL ;
   private byte[] H029E3_A4495HreNumCie ;
   private String[] H029E3_A4494HreBarPar ;
   private byte[] H029E3_A4493HreBarReo ;
   private int[] H029E3_A4492HreBarCod ;
   private String[] H029E3_A396EmprCod ;
   private java.math.BigDecimal[] H029E3_A707PrdFacCon ;
   private java.math.BigDecimal[] H029E3_A4511HrePrdCFin ;
   private boolean[] H029E3_n4511HrePrdCFin ;
   private byte[] H029E4_A4509HreNumAny ;
   private String[] H029E4_A719PrdNum ;
   private short[] H029E4_A4508HreLinMAL ;
   private byte[] H029E4_A4495HreNumCie ;
   private String[] H029E4_A4494HreBarPar ;
   private byte[] H029E4_A4493HreBarReo ;
   private int[] H029E4_A4492HreBarCod ;
   private String[] H029E4_A396EmprCod ;
   private java.math.BigDecimal[] H029E4_A707PrdFacCon ;
   private java.math.BigDecimal[] H029E4_A4511HrePrdCFin ;
   private boolean[] H029E4_n4511HrePrdCFin ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext13[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState14[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV27DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons12[] ;
}

final  class wccostesproductosadiciones___default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H029E2", "SELECT /*+ FIRST_ROWS(51) */ T1.HreNumAny, T1.HrdPrdDsc, T1.PrdNum, T1.HreLinMAL, T1.HreNumCie, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T1.EmprCod, T2.PrdFacCon, T1.HrePrdCFin FROM (TXPHISREA T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ?) AND (T1.HreBarCod = ?) AND (T1.HreBarReo = ?) AND (T1.HreBarPar = ?) AND (T1.HreNumCie = ?) AND (T1.HreLinMAL = ?) ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H029E3", "SELECT /*+ FIRST_ROWS(51) */ T1.HreNumAny, T1.HrdPrdDsc, T1.PrdNum, T1.HreLinMAL, T1.HreNumCie, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T1.EmprCod, T2.PrdFacCon, T1.HrePrdCFin FROM (TXPHISREA T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ?) AND (T1.HreBarCod = ?) AND (T1.HreBarReo = ?) AND (T1.HreBarPar = ?) AND (T1.HreNumCie = ?) AND (T1.HreLinMAL = ?) ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H029E4", "SELECT /*+ FIRST_ROWS(51) */ T1.HreNumAny, T1.PrdNum, T1.HreLinMAL, T1.HreNumCie, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T1.EmprCod, T2.PrdFacCon, T1.HrePrdCFin FROM (TXPHISREA T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.HreBarCod = ? and T1.HreBarReo = ? and T1.HreBarPar = ? and T1.HreNumCie = ? and T1.HreLinMAL = ? ORDER BY T1.EmprCod, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.HreLinMAL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 3);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 3);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

