package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcprocesosformula_impl extends GXWebComponent
{
   public wcprocesosformula_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcprocesosformula_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcprocesosformula_impl.class ));
   }

   public wcprocesosformula_impl( int remoteHandle ,
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
               AV6Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Clicod), 6, 0));
               AV7Forser = httpContext.GetPar( "Forser") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Forser", AV7Forser);
               AV8Forcolnom = httpContext.GetPar( "Forcolnom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Forcolnom", AV8Forcolnom);
               AV9Forcolnum = (int)(GXutil.lval( httpContext.GetPar( "Forcolnum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Forcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Forcolnum), 6, 0));
               AV45Tipcolcod = (byte)(GXutil.lval( httpContext.GetPar( "Tipcolcod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Tipcolcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45Tipcolcod), 2, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5Emprcod,Integer.valueOf(AV6Clicod),AV7Forser,AV8Forcolnom,Integer.valueOf(AV9Forcolnum),Byte.valueOf(AV45Tipcolcod)});
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
      nRC_GXsfl_12 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_12"))) ;
      nGXsfl_12_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_12_idx"))) ;
      sGXsfl_12_idx = httpContext.GetPar( "sGXsfl_12_idx") ;
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
      AV5Emprcod = httpContext.GetPar( "Emprcod") ;
      AV6Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
      AV7Forser = httpContext.GetPar( "Forser") ;
      AV8Forcolnom = httpContext.GetPar( "Forcolnom") ;
      AV9Forcolnum = (int)(GXutil.lval( httpContext.GetPar( "Forcolnum"))) ;
      AV45Tipcolcod = (byte)(GXutil.lval( httpContext.GetPar( "Tipcolcod"))) ;
      AV32TFProForL = (short)(GXutil.lval( httpContext.GetPar( "TFProForL"))) ;
      AV33TFProForL_To = (short)(GXutil.lval( httpContext.GetPar( "TFProForL_To"))) ;
      AV35TFProForCod = httpContext.GetPar( "TFProForCod") ;
      AV36TFProForCod_Sel = httpContext.GetPar( "TFProForCod_Sel") ;
      AV38TFProForDsc = httpContext.GetPar( "TFProForDsc") ;
      AV39TFProForDsc_Sel = httpContext.GetPar( "TFProForDsc_Sel") ;
      AV59Pgmname = httpContext.GetPar( "Pgmname") ;
      AV18OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV19OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6Clicod, AV7Forser, AV8Forcolnom, AV9Forcolnum, AV45Tipcolcod, AV32TFProForL, AV33TFProForL_To, AV35TFProForCod, AV36TFProForCod_Sel, AV38TFProForDsc, AV39TFProForDsc_Sel, AV59Pgmname, AV18OrderedBy, AV19OrderedDsc, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paQV2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Procesos quimicos ", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.wcprocesosformula", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV7Forser)),GXutil.URLEncode(GXutil.rtrim(AV8Forcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV9Forcolnum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV45Tipcolcod,2,0))}, new String[] {"Emprcod","Clicod","Forser","Forcolnom","Forcolnum","Tipcolcod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV59Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_12", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_12, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV41DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV41DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5Emprcod", GXutil.rtrim( wcpOAV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6Clicod", GXutil.ltrim( localUtil.ntoc( wcpOAV6Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7Forser", GXutil.rtrim( wcpOAV7Forser));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8Forcolnom", GXutil.rtrim( wcpOAV8Forcolnom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9Forcolnum", GXutil.ltrim( localUtil.ntoc( wcpOAV9Forcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV45Tipcolcod", GXutil.ltrim( localUtil.ntoc( wcpOAV45Tipcolcod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROFORL", GXutil.ltrim( localUtil.ntoc( AV32TFProForL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROFORL_TO", GXutil.ltrim( localUtil.ntoc( AV33TFProForL_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROFORCOD", GXutil.rtrim( AV35TFProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROFORCOD_SEL", GXutil.rtrim( AV36TFProForCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROFORDSC", GXutil.rtrim( AV38TFProForDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROFORDSC_SEL", GXutil.rtrim( AV39TFProForDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV59Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV59Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV18OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV19OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV6Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORSER", GXutil.rtrim( AV7Forser));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNOM", GXutil.rtrim( AV8Forcolnom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNUM", GXutil.ltrim( localUtil.ntoc( AV9Forcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV45Tipcolcod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
   }

   public void renderHtmlCloseFormQV2( )
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
      return "FormulacionTinte.WCProcesosFormula" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Procesos quimicos ", "") ;
   }

   public void wbQV0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.formulaciontinte.wcprocesosformula");
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
         startgridcontrol12( ) ;
      }
      if ( wbEnd == 12 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_12 = (int)(nGXsfl_12_idx-1) ;
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV41DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 12 )
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

   public void startQV2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Procesos quimicos ", ""), (short)(0)) ;
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
            strupQV0( ) ;
         }
      }
   }

   public void wsQV2( )
   {
      startQV2( ) ;
      evtQV2( ) ;
   }

   public void evtQV2( )
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
                              strupQV0( ) ;
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
                              strupQV0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e11QV2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupQV0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupQV0( ) ;
                           }
                           AV53Formulaciontinte_wcprocesosformulads_1_tfproforl = AV32TFProForL ;
                           AV54Formulaciontinte_wcprocesosformulads_2_tfproforl_to = AV33TFProForL_To ;
                           AV55Formulaciontinte_wcprocesosformulads_3_tfproforcod = AV35TFProForCod ;
                           AV56Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel = AV36TFProForCod_Sel ;
                           AV57Formulaciontinte_wcprocesosformulads_5_tfprofordsc = AV38TFProForDsc ;
                           AV58Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel = AV39TFProForDsc_Sel ;
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
                              strupQV0( ) ;
                           }
                           nGXsfl_12_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_12_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_12_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_122( ) ;
                           A1160ProForL = (short)(localUtil.ctol( httpContext.cgiGet( edtProForL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
                           A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
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
                                       /* Execute user event: Start */
                                       e12QV2 ();
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
                                       /* Execute user event: Refresh */
                                       e13QV2 ();
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
                                       e14QV2 ();
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
                                    strupQV0( ) ;
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

   public void weQV2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormQV2( ) ;
         }
      }
   }

   public void paQV2( )
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
      subsflControlProps_122( ) ;
      while ( nGXsfl_12_idx <= nRC_GXsfl_12 )
      {
         sendrow_122( ) ;
         nGXsfl_12_idx = ((subGrid_Islastpage==1)&&(nGXsfl_12_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_12_idx+1) ;
         sGXsfl_12_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_12_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_122( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV5Emprcod ,
                                 int AV6Clicod ,
                                 String AV7Forser ,
                                 String AV8Forcolnom ,
                                 int AV9Forcolnum ,
                                 byte AV45Tipcolcod ,
                                 short AV32TFProForL ,
                                 short AV33TFProForL_To ,
                                 String AV35TFProForCod ,
                                 String AV36TFProForCod_Sel ,
                                 String AV38TFProForDsc ,
                                 String AV39TFProForDsc_Sel ,
                                 String AV59Pgmname ,
                                 short AV18OrderedBy ,
                                 boolean AV19OrderedDsc ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e13QV2 ();
      GRID_nCurrentRecord = 0 ;
      rfQV2( ) ;
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
      rfQV2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV59Pgmname = "FormulacionTinte.WCProcesosFormula" ;
      Gx_err = (short)(0) ;
   }

   public void rfQV2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(12) ;
      /* Execute user event: Refresh */
      e13QV2 ();
      nGXsfl_12_idx = 1 ;
      sGXsfl_12_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_12_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_122( ) ;
      bGXsfl_12_Refreshing = true ;
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
         subsflControlProps_122( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Short.valueOf(AV53Formulaciontinte_wcprocesosformulads_1_tfproforl) ,
                                              Short.valueOf(AV54Formulaciontinte_wcprocesosformulads_2_tfproforl_to) ,
                                              AV56Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel ,
                                              AV55Formulaciontinte_wcprocesosformulads_3_tfproforcod ,
                                              AV58Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel ,
                                              AV57Formulaciontinte_wcprocesosformulads_5_tfprofordsc ,
                                              Short.valueOf(A1160ProForL) ,
                                              A764ProForCod ,
                                              A766ProForDsc ,
                                              Short.valueOf(AV18OrderedBy) ,
                                              Boolean.valueOf(AV19OrderedDsc) ,
                                              AV5Emprcod ,
                                              Integer.valueOf(AV6Clicod) ,
                                              AV7Forser ,
                                              AV8Forcolnom ,
                                              Integer.valueOf(AV9Forcolnum) ,
                                              Byte.valueOf(AV45Tipcolcod) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A252CliCod) ,
                                              A494ForSer ,
                                              A482ForColNom ,
                                              Integer.valueOf(A483ForColNum) ,
                                              Byte.valueOf(A831TipColCod) } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE
                                              }
         });
         lV55Formulaciontinte_wcprocesosformulads_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV55Formulaciontinte_wcprocesosformulads_3_tfproforcod), 6, "%") ;
         lV57Formulaciontinte_wcprocesosformulads_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV57Formulaciontinte_wcprocesosformulads_5_tfprofordsc), 30, "%") ;
         /* Using cursor H00QV2 */
         pr_default.execute(0, new Object[] {AV5Emprcod, Integer.valueOf(AV6Clicod), AV7Forser, AV8Forcolnom, Integer.valueOf(AV9Forcolnum), Byte.valueOf(AV45Tipcolcod), Short.valueOf(AV53Formulaciontinte_wcprocesosformulads_1_tfproforl), Short.valueOf(AV54Formulaciontinte_wcprocesosformulads_2_tfproforl_to), lV55Formulaciontinte_wcprocesosformulads_3_tfproforcod, AV56Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel, lV57Formulaciontinte_wcprocesosformulads_5_tfprofordsc, AV58Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_12_idx = 1 ;
         sGXsfl_12_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_12_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_122( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H00QV2_A396EmprCod[0] ;
            A252CliCod = H00QV2_A252CliCod[0] ;
            A494ForSer = H00QV2_A494ForSer[0] ;
            A482ForColNom = H00QV2_A482ForColNom[0] ;
            A483ForColNum = H00QV2_A483ForColNum[0] ;
            A831TipColCod = H00QV2_A831TipColCod[0] ;
            A766ProForDsc = H00QV2_A766ProForDsc[0] ;
            A764ProForCod = H00QV2_A764ProForCod[0] ;
            A1160ProForL = H00QV2_A1160ProForL[0] ;
            A766ProForDsc = H00QV2_A766ProForDsc[0] ;
            e14QV2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(12) ;
         wbQV0( ) ;
      }
      bGXsfl_12_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesQV2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV59Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV59Pgmname, ""))));
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
      AV53Formulaciontinte_wcprocesosformulads_1_tfproforl = AV32TFProForL ;
      AV54Formulaciontinte_wcprocesosformulads_2_tfproforl_to = AV33TFProForL_To ;
      AV55Formulaciontinte_wcprocesosformulads_3_tfproforcod = AV35TFProForCod ;
      AV56Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel = AV36TFProForCod_Sel ;
      AV57Formulaciontinte_wcprocesosformulads_5_tfprofordsc = AV38TFProForDsc ;
      AV58Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel = AV39TFProForDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV53Formulaciontinte_wcprocesosformulads_1_tfproforl) ,
                                           Short.valueOf(AV54Formulaciontinte_wcprocesosformulads_2_tfproforl_to) ,
                                           AV56Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel ,
                                           AV55Formulaciontinte_wcprocesosformulads_3_tfproforcod ,
                                           AV58Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel ,
                                           AV57Formulaciontinte_wcprocesosformulads_5_tfprofordsc ,
                                           Short.valueOf(A1160ProForL) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           Short.valueOf(AV18OrderedBy) ,
                                           Boolean.valueOf(AV19OrderedDsc) ,
                                           AV5Emprcod ,
                                           Integer.valueOf(AV6Clicod) ,
                                           AV7Forser ,
                                           AV8Forcolnom ,
                                           Integer.valueOf(AV9Forcolnum) ,
                                           Byte.valueOf(AV45Tipcolcod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           A494ForSer ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE
                                           }
      });
      lV55Formulaciontinte_wcprocesosformulads_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV55Formulaciontinte_wcprocesosformulads_3_tfproforcod), 6, "%") ;
      lV57Formulaciontinte_wcprocesosformulads_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV57Formulaciontinte_wcprocesosformulads_5_tfprofordsc), 30, "%") ;
      /* Using cursor H00QV3 */
      pr_default.execute(1, new Object[] {AV5Emprcod, Integer.valueOf(AV6Clicod), AV7Forser, AV8Forcolnom, Integer.valueOf(AV9Forcolnum), Byte.valueOf(AV45Tipcolcod), Short.valueOf(AV53Formulaciontinte_wcprocesosformulads_1_tfproforl), Short.valueOf(AV54Formulaciontinte_wcprocesosformulads_2_tfproforl_to), lV55Formulaciontinte_wcprocesosformulads_3_tfproforcod, AV56Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel, lV57Formulaciontinte_wcprocesosformulads_5_tfprofordsc, AV58Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel});
      GRID_nRecordCount = H00QV3_AGRID_nRecordCount[0] ;
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
      AV53Formulaciontinte_wcprocesosformulads_1_tfproforl = AV32TFProForL ;
      AV54Formulaciontinte_wcprocesosformulads_2_tfproforl_to = AV33TFProForL_To ;
      AV55Formulaciontinte_wcprocesosformulads_3_tfproforcod = AV35TFProForCod ;
      AV56Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel = AV36TFProForCod_Sel ;
      AV57Formulaciontinte_wcprocesosformulads_5_tfprofordsc = AV38TFProForDsc ;
      AV58Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel = AV39TFProForDsc_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6Clicod, AV7Forser, AV8Forcolnom, AV9Forcolnum, AV45Tipcolcod, AV32TFProForL, AV33TFProForL_To, AV35TFProForCod, AV36TFProForCod_Sel, AV38TFProForDsc, AV39TFProForDsc_Sel, AV59Pgmname, AV18OrderedBy, AV19OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV53Formulaciontinte_wcprocesosformulads_1_tfproforl = AV32TFProForL ;
      AV54Formulaciontinte_wcprocesosformulads_2_tfproforl_to = AV33TFProForL_To ;
      AV55Formulaciontinte_wcprocesosformulads_3_tfproforcod = AV35TFProForCod ;
      AV56Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel = AV36TFProForCod_Sel ;
      AV57Formulaciontinte_wcprocesosformulads_5_tfprofordsc = AV38TFProForDsc ;
      AV58Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel = AV39TFProForDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6Clicod, AV7Forser, AV8Forcolnom, AV9Forcolnum, AV45Tipcolcod, AV32TFProForL, AV33TFProForL_To, AV35TFProForCod, AV36TFProForCod_Sel, AV38TFProForDsc, AV39TFProForDsc_Sel, AV59Pgmname, AV18OrderedBy, AV19OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV53Formulaciontinte_wcprocesosformulads_1_tfproforl = AV32TFProForL ;
      AV54Formulaciontinte_wcprocesosformulads_2_tfproforl_to = AV33TFProForL_To ;
      AV55Formulaciontinte_wcprocesosformulads_3_tfproforcod = AV35TFProForCod ;
      AV56Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel = AV36TFProForCod_Sel ;
      AV57Formulaciontinte_wcprocesosformulads_5_tfprofordsc = AV38TFProForDsc ;
      AV58Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel = AV39TFProForDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6Clicod, AV7Forser, AV8Forcolnom, AV9Forcolnum, AV45Tipcolcod, AV32TFProForL, AV33TFProForL_To, AV35TFProForCod, AV36TFProForCod_Sel, AV38TFProForDsc, AV39TFProForDsc_Sel, AV59Pgmname, AV18OrderedBy, AV19OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV53Formulaciontinte_wcprocesosformulads_1_tfproforl = AV32TFProForL ;
      AV54Formulaciontinte_wcprocesosformulads_2_tfproforl_to = AV33TFProForL_To ;
      AV55Formulaciontinte_wcprocesosformulads_3_tfproforcod = AV35TFProForCod ;
      AV56Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel = AV36TFProForCod_Sel ;
      AV57Formulaciontinte_wcprocesosformulads_5_tfprofordsc = AV38TFProForDsc ;
      AV58Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel = AV39TFProForDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6Clicod, AV7Forser, AV8Forcolnom, AV9Forcolnum, AV45Tipcolcod, AV32TFProForL, AV33TFProForL_To, AV35TFProForCod, AV36TFProForCod_Sel, AV38TFProForDsc, AV39TFProForDsc_Sel, AV59Pgmname, AV18OrderedBy, AV19OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV53Formulaciontinte_wcprocesosformulads_1_tfproforl = AV32TFProForL ;
      AV54Formulaciontinte_wcprocesosformulads_2_tfproforl_to = AV33TFProForL_To ;
      AV55Formulaciontinte_wcprocesosformulads_3_tfproforcod = AV35TFProForCod ;
      AV56Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel = AV36TFProForCod_Sel ;
      AV57Formulaciontinte_wcprocesosformulads_5_tfprofordsc = AV38TFProForDsc ;
      AV58Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel = AV39TFProForDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6Clicod, AV7Forser, AV8Forcolnom, AV9Forcolnum, AV45Tipcolcod, AV32TFProForL, AV33TFProForL_To, AV35TFProForCod, AV36TFProForCod_Sel, AV38TFProForDsc, AV39TFProForDsc_Sel, AV59Pgmname, AV18OrderedBy, AV19OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV59Pgmname = "FormulacionTinte.WCProcesosFormula" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupQV0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e12QV2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV41DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_12 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_12"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
         wcpOAV6Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV7Forser = httpContext.cgiGet( sPrefix+"wcpOAV7Forser") ;
         wcpOAV8Forcolnom = httpContext.cgiGet( sPrefix+"wcpOAV8Forcolnom") ;
         wcpOAV9Forcolnum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9Forcolnum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV45Tipcolcod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV45Tipcolcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         /* Read variables values. */
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
      e12QV2 ();
      if (returnInSub) return;
   }

   public void e12QV2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV50Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcprocesosformula_impl.this.GXt_char1 = GXv_char2[0] ;
      AV50Station = GXt_char1 ;
      GXv_char2[0] = AV5Emprcod ;
      GXv_char3[0] = AV51Emprnom ;
      GXv_char4[0] = AV52Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV50Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcprocesosformula_impl.this.AV5Emprcod = GXv_char2[0] ;
      wcprocesosformula_impl.this.AV51Emprnom = GXv_char3[0] ;
      wcprocesosformula_impl.this.AV52Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      subGrid_Rows = 10 ;
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
      if ( AV18OrderedBy < 1 )
      {
         AV18OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV41DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV41DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
   }

   public void e13QV2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV12WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV12WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      AV53Formulaciontinte_wcprocesosformulads_1_tfproforl = AV32TFProForL ;
      AV54Formulaciontinte_wcprocesosformulads_2_tfproforl_to = AV33TFProForL_To ;
      AV55Formulaciontinte_wcprocesosformulads_3_tfproforcod = AV35TFProForCod ;
      AV56Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel = AV36TFProForCod_Sel ;
      AV57Formulaciontinte_wcprocesosformulads_5_tfprofordsc = AV38TFProForDsc ;
      AV58Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel = AV39TFProForDsc_Sel ;
   }

   public void e11QV2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV18OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18OrderedBy), 4, 0));
         AV19OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19OrderedDsc", AV19OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProForL") == 0 )
         {
            AV32TFProForL = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFProForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFProForL), 4, 0));
            AV33TFProForL_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFProForL_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFProForL_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProForCod") == 0 )
         {
            AV35TFProForCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFProForCod", AV35TFProForCod);
            AV36TFProForCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFProForCod_Sel", AV36TFProForCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProForDsc") == 0 )
         {
            AV38TFProForDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFProForDsc", AV38TFProForDsc);
            AV39TFProForDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFProForDsc_Sel", AV39TFProForDsc_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e14QV2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(12) ;
      }
      sendrow_122( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_12_Refreshing )
      {
         httpContext.doAjaxLoad(12, GridRow);
      }
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV18OrderedBy, 4, 0))+":"+(AV19OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV27Session.getValue(AV59Pgmname+"GridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV59Pgmname+"GridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV27Session.getValue(AV59Pgmname+"GridState"), null, null);
      }
      AV18OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18OrderedBy), 4, 0));
      AV19OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19OrderedDsc", AV19OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV60GXV1 = 1 ;
      while ( AV60GXV1 <= AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV60GXV1));
         if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORL") == 0 )
         {
            AV32TFProForL = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFProForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFProForL), 4, 0));
            AV33TFProForL_To = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFProForL_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFProForL_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD") == 0 )
         {
            AV35TFProForCod = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFProForCod", AV35TFProForCod);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD_SEL") == 0 )
         {
            AV36TFProForCod_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFProForCod_Sel", AV36TFProForCod_Sel);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC") == 0 )
         {
            AV38TFProForDsc = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFProForDsc", AV38TFProForDsc);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC_SEL") == 0 )
         {
            AV39TFProForDsc_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFProForDsc_Sel", AV39TFProForDsc_Sel);
         }
         AV60GXV1 = (int)(AV60GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFProForCod_Sel)==0), AV36TFProForCod_Sel, GXv_char4) ;
      wcprocesosformula_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char8 = "" ;
      GXv_char3[0] = GXt_char8 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFProForDsc_Sel)==0), AV39TFProForDsc_Sel, GXv_char3) ;
      wcprocesosformula_impl.this.GXt_char8 = GXv_char3[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char8 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char8 = "" ;
      GXv_char4[0] = GXt_char8 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFProForCod)==0), AV35TFProForCod, GXv_char4) ;
      wcprocesosformula_impl.this.GXt_char8 = GXv_char4[0] ;
      GXt_char1 = "" ;
      GXv_char3[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFProForDsc)==0), AV38TFProForDsc, GXv_char3) ;
      wcprocesosformula_impl.this.GXt_char1 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV32TFProForL) ? "" : GXutil.str( AV32TFProForL, 4, 0))+"|"+GXt_char8+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV33TFProForL_To) ? "" : GXutil.str( AV33TFProForL_To, 4, 0))+"||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV16GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV16GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV16GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV16GridState.fromxml(AV27Session.getValue(AV59Pgmname+"GridState"), null, null);
      AV16GridState.setgxTv_SdtWWPGridState_Orderedby( AV18OrderedBy );
      AV16GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV19OrderedDsc );
      AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState9[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState9, "TFPROFORL", "", !((0==AV32TFProForL)&&(0==AV33TFProForL_To)), (short)(0), GXutil.trim( GXutil.str( AV32TFProForL, 4, 0)), GXutil.trim( GXutil.str( AV33TFProForL_To, 4, 0))) ;
      AV16GridState = GXv_SdtWWPGridState9[0] ;
      GXv_SdtWWPGridState9[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState9, "TFPROFORCOD", "", !(GXutil.strcmp("", AV35TFProForCod)==0), (short)(0), AV35TFProForCod, "", !(GXutil.strcmp("", AV36TFProForCod_Sel)==0), AV36TFProForCod_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState9[0] ;
      GXv_SdtWWPGridState9[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState9, "TFPROFORDSC", "", !(GXutil.strcmp("", AV38TFProForDsc)==0), (short)(0), AV38TFProForDsc, "", !(GXutil.strcmp("", AV39TFProForDsc_Sel)==0), AV39TFProForDsc_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState9[0] ;
      if ( ! (GXutil.strcmp("", AV5Emprcod)==0) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV5Emprcod );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (0==AV6Clicod) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV6Clicod, 6, 0) );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV7Forser)==0) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORSER" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV7Forser );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV8Forcolnom)==0) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORCOLNOM" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV8Forcolnom );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (0==AV9Forcolnum) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORCOLNUM" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV9Forcolnum, 6, 0) );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (0==AV45Tipcolcod) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPCOLCOD" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV45Tipcolcod, 2, 0) );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      AV16GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV16GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV59Pgmname+"GridState", AV16GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV14TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV59Pgmname );
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV13HTTPRequest.getScriptName()+"?"+AV13HTTPRequest.getQuerystring() );
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "LFORMU" );
      AV27Session.setValue("TrnContext", AV14TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      AV6Clicod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Clicod), 6, 0));
      AV7Forser = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Forser", AV7Forser);
      AV8Forcolnom = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Forcolnom", AV8Forcolnom);
      AV9Forcolnum = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Forcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Forcolnum), 6, 0));
      AV45Tipcolcod = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Tipcolcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45Tipcolcod), 2, 0));
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
      paQV2( ) ;
      wsQV2( ) ;
      weQV2( ) ;
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
      sCtrlAV6Clicod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV7Forser = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV8Forcolnom = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV9Forcolnum = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV45Tipcolcod = (String)getParm(obj,5,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paQV2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "formulaciontinte\\wcprocesosformula", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paQV2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
         AV6Clicod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Clicod), 6, 0));
         AV7Forser = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Forser", AV7Forser);
         AV8Forcolnom = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Forcolnom", AV8Forcolnom);
         AV9Forcolnum = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Forcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Forcolnum), 6, 0));
         AV45Tipcolcod = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Tipcolcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45Tipcolcod), 2, 0));
      }
      wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
      wcpOAV6Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV7Forser = httpContext.cgiGet( sPrefix+"wcpOAV7Forser") ;
      wcpOAV8Forcolnom = httpContext.cgiGet( sPrefix+"wcpOAV8Forcolnom") ;
      wcpOAV9Forcolnum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9Forcolnum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV45Tipcolcod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV45Tipcolcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5Emprcod, wcpOAV5Emprcod) != 0 ) || ( AV6Clicod != wcpOAV6Clicod ) || ( GXutil.strcmp(AV7Forser, wcpOAV7Forser) != 0 ) || ( GXutil.strcmp(AV8Forcolnom, wcpOAV8Forcolnom) != 0 ) || ( AV9Forcolnum != wcpOAV9Forcolnum ) || ( AV45Tipcolcod != wcpOAV45Tipcolcod ) ) )
      {
         setjustcreated();
      }
      wcpOAV5Emprcod = AV5Emprcod ;
      wcpOAV6Clicod = AV6Clicod ;
      wcpOAV7Forser = AV7Forser ;
      wcpOAV8Forcolnom = AV8Forcolnom ;
      wcpOAV9Forcolnum = AV9Forcolnum ;
      wcpOAV45Tipcolcod = AV45Tipcolcod ;
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
      sCtrlAV6Clicod = httpContext.cgiGet( sPrefix+"AV6Clicod_CTRL") ;
      if ( GXutil.len( sCtrlAV6Clicod) > 0 )
      {
         AV6Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV6Clicod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Clicod), 6, 0));
      }
      else
      {
         AV6Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV6Clicod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV7Forser = httpContext.cgiGet( sPrefix+"AV7Forser_CTRL") ;
      if ( GXutil.len( sCtrlAV7Forser) > 0 )
      {
         AV7Forser = httpContext.cgiGet( sCtrlAV7Forser) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Forser", AV7Forser);
      }
      else
      {
         AV7Forser = httpContext.cgiGet( sPrefix+"AV7Forser_PARM") ;
      }
      sCtrlAV8Forcolnom = httpContext.cgiGet( sPrefix+"AV8Forcolnom_CTRL") ;
      if ( GXutil.len( sCtrlAV8Forcolnom) > 0 )
      {
         AV8Forcolnom = httpContext.cgiGet( sCtrlAV8Forcolnom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Forcolnom", AV8Forcolnom);
      }
      else
      {
         AV8Forcolnom = httpContext.cgiGet( sPrefix+"AV8Forcolnom_PARM") ;
      }
      sCtrlAV9Forcolnum = httpContext.cgiGet( sPrefix+"AV9Forcolnum_CTRL") ;
      if ( GXutil.len( sCtrlAV9Forcolnum) > 0 )
      {
         AV9Forcolnum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV9Forcolnum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Forcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Forcolnum), 6, 0));
      }
      else
      {
         AV9Forcolnum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV9Forcolnum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV45Tipcolcod = httpContext.cgiGet( sPrefix+"AV45Tipcolcod_CTRL") ;
      if ( GXutil.len( sCtrlAV45Tipcolcod) > 0 )
      {
         AV45Tipcolcod = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV45Tipcolcod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Tipcolcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45Tipcolcod), 2, 0));
      }
      else
      {
         AV45Tipcolcod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV45Tipcolcod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      paQV2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsQV2( ) ;
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
      wsQV2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Clicod_PARM", GXutil.ltrim( localUtil.ntoc( AV6Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6Clicod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Clicod_CTRL", GXutil.rtrim( sCtrlAV6Clicod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Forser_PARM", GXutil.rtrim( AV7Forser));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7Forser)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Forser_CTRL", GXutil.rtrim( sCtrlAV7Forser));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Forcolnom_PARM", GXutil.rtrim( AV8Forcolnom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8Forcolnom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Forcolnom_CTRL", GXutil.rtrim( sCtrlAV8Forcolnom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9Forcolnum_PARM", GXutil.ltrim( localUtil.ntoc( AV9Forcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9Forcolnum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9Forcolnum_CTRL", GXutil.rtrim( sCtrlAV9Forcolnum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45Tipcolcod_PARM", GXutil.ltrim( localUtil.ntoc( AV45Tipcolcod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV45Tipcolcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45Tipcolcod_CTRL", GXutil.rtrim( sCtrlAV45Tipcolcod));
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
      weQV2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821169155", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/wcprocesosformula.js", "?2026821169156", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_122( )
   {
      edtProForL_Internalname = sPrefix+"PROFORL_"+sGXsfl_12_idx ;
      edtProForCod_Internalname = sPrefix+"PROFORCOD_"+sGXsfl_12_idx ;
      edtProForDsc_Internalname = sPrefix+"PROFORDSC_"+sGXsfl_12_idx ;
   }

   public void subsflControlProps_fel_122( )
   {
      edtProForL_Internalname = sPrefix+"PROFORL_"+sGXsfl_12_fel_idx ;
      edtProForCod_Internalname = sPrefix+"PROFORCOD_"+sGXsfl_12_fel_idx ;
      edtProForDsc_Internalname = sPrefix+"PROFORDSC_"+sGXsfl_12_fel_idx ;
   }

   public void sendrow_122( )
   {
      subsflControlProps_122( ) ;
      wbQV0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_12_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_12_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_12_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForL_Internalname,GXutil.ltrim( localUtil.ntoc( A1160ProForL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1160ProForL), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtProForL_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn WWActionColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForCod_Internalname,GXutil.rtrim( A764ProForCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtProForCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn WWActionColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForDsc_Internalname,GXutil.rtrim( A766ProForDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtProForDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesQV2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_12_idx = ((subGrid_Islastpage==1)&&(nGXsfl_12_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_12_idx+1) ;
         sGXsfl_12_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_12_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_122( ) ;
      }
      /* End function sendrow_122 */
   }

   public void startgridcontrol12( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"12\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proceso", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1160ProForL, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A764ProForCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A766ProForDsc));
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
      edtProForL_Internalname = sPrefix+"PROFORL" ;
      edtProForCod_Internalname = sPrefix+"PROFORCOD" ;
      edtProForDsc_Internalname = sPrefix+"PROFORDSC" ;
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
      edtProForDsc_Jsonclick = "" ;
      edtProForCod_Jsonclick = "" ;
      edtProForL_Jsonclick = "" ;
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_grid_Datalistproc = "FormulacionTinte.WCProcesosFormulaGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "|T|T" ;
      Ddo_grid_Filterisrange = "T||" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3" ;
      Ddo_grid_Columnids = "0:ProForL|1:ProForCod|2:ProForDsc" ;
      Ddo_grid_Gridinternalname = "" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV32TFProForL',fld:'vTFPROFORL',pic:'ZZZ9'},{av:'AV33TFProForL_To',fld:'vTFPROFORL_TO',pic:'ZZZ9'},{av:'AV35TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV36TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV38TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV39TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV7Forser',fld:'vFORSER',pic:''},{av:'AV8Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV9Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV45Tipcolcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV59Pgmname',fld:'vPGMNAME',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e11QV2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV7Forser',fld:'vFORSER',pic:''},{av:'AV8Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV9Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV45Tipcolcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV32TFProForL',fld:'vTFPROFORL',pic:'ZZZ9'},{av:'AV33TFProForL_To',fld:'vTFPROFORL_TO',pic:'ZZZ9'},{av:'AV35TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV36TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV38TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV39TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV59Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV32TFProForL',fld:'vTFPROFORL',pic:'ZZZ9'},{av:'AV33TFProForL_To',fld:'vTFPROFORL_TO',pic:'ZZZ9'},{av:'AV35TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV36TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV38TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV39TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e14QV2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV32TFProForL',fld:'vTFPROFORL',pic:'ZZZ9'},{av:'AV33TFProForL_To',fld:'vTFPROFORL_TO',pic:'ZZZ9'},{av:'AV35TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV36TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV38TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV39TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV59Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV7Forser',fld:'vFORSER',pic:''},{av:'AV8Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV9Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV45Tipcolcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV32TFProForL',fld:'vTFPROFORL',pic:'ZZZ9'},{av:'AV33TFProForL_To',fld:'vTFPROFORL_TO',pic:'ZZZ9'},{av:'AV35TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV36TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV38TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV39TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV59Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV7Forser',fld:'vFORSER',pic:''},{av:'AV8Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV9Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV45Tipcolcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV32TFProForL',fld:'vTFPROFORL',pic:'ZZZ9'},{av:'AV33TFProForL_To',fld:'vTFPROFORL_TO',pic:'ZZZ9'},{av:'AV35TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV36TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV38TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV39TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV59Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV7Forser',fld:'vFORSER',pic:''},{av:'AV8Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV9Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV45Tipcolcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV32TFProForL',fld:'vTFPROFORL',pic:'ZZZ9'},{av:'AV33TFProForL_To',fld:'vTFPROFORL_TO',pic:'ZZZ9'},{av:'AV35TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV36TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV38TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV39TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV59Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV7Forser',fld:'vFORSER',pic:''},{av:'AV8Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV9Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV45Tipcolcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[]}");
      setEventMetadata("VALID_PROFORCOD","{handler:'valid_Proforcod',iparms:[]");
      setEventMetadata("VALID_PROFORCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Profordsc',iparms:[]");
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
      wcpOAV7Forser = "" ;
      wcpOAV8Forcolnom = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV5Emprcod = "" ;
      AV7Forser = "" ;
      AV8Forcolnom = "" ;
      AV35TFProForCod = "" ;
      AV36TFProForCod_Sel = "" ;
      AV38TFProForDsc = "" ;
      AV39TFProForDsc_Sel = "" ;
      AV59Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV41DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
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
      AV55Formulaciontinte_wcprocesosformulads_3_tfproforcod = "" ;
      AV56Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel = "" ;
      AV57Formulaciontinte_wcprocesosformulads_5_tfprofordsc = "" ;
      AV58Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel = "" ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      scmdbuf = "" ;
      lV55Formulaciontinte_wcprocesosformulads_3_tfproforcod = "" ;
      lV57Formulaciontinte_wcprocesosformulads_5_tfprofordsc = "" ;
      A396EmprCod = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      H00QV2_A396EmprCod = new String[] {""} ;
      H00QV2_A252CliCod = new int[1] ;
      H00QV2_A494ForSer = new String[] {""} ;
      H00QV2_A482ForColNom = new String[] {""} ;
      H00QV2_A483ForColNum = new int[1] ;
      H00QV2_A831TipColCod = new byte[1] ;
      H00QV2_A766ProForDsc = new String[] {""} ;
      H00QV2_A764ProForCod = new String[] {""} ;
      H00QV2_A1160ProForL = new short[1] ;
      H00QV3_AGRID_nRecordCount = new long[1] ;
      AV50Station = "" ;
      GXv_char2 = new String[1] ;
      AV51Emprnom = "" ;
      AV52Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV12WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV27Session = httpContext.getWebSession();
      AV16GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV17GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char8 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState9 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV14TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV13HTTPRequest = httpContext.getHttpRequest();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5Emprcod = "" ;
      sCtrlAV6Clicod = "" ;
      sCtrlAV7Forser = "" ;
      sCtrlAV8Forcolnom = "" ;
      sCtrlAV9Forcolnum = "" ;
      sCtrlAV45Tipcolcod = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.wcprocesosformula__default(),
         new Object[] {
             new Object[] {
            H00QV2_A396EmprCod, H00QV2_A252CliCod, H00QV2_A494ForSer, H00QV2_A482ForColNom, H00QV2_A483ForColNum, H00QV2_A831TipColCod, H00QV2_A766ProForDsc, H00QV2_A764ProForCod, H00QV2_A1160ProForL
            }
            , new Object[] {
            H00QV3_AGRID_nRecordCount
            }
         }
      );
      AV59Pgmname = "FormulacionTinte.WCProcesosFormula" ;
      /* GeneXus formulas. */
      AV59Pgmname = "FormulacionTinte.WCProcesosFormula" ;
      Gx_err = (short)(0) ;
   }

   private byte wcpOAV45Tipcolcod ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV45Tipcolcod ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte A831TipColCod ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV32TFProForL ;
   private short AV33TFProForL_To ;
   private short AV18OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV53Formulaciontinte_wcprocesosformulads_1_tfproforl ;
   private short AV54Formulaciontinte_wcprocesosformulads_2_tfproforl_to ;
   private short A1160ProForL ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV6Clicod ;
   private int wcpOAV9Forcolnum ;
   private int subGrid_Rows ;
   private int nRC_GXsfl_12 ;
   private int AV6Clicod ;
   private int AV9Forcolnum ;
   private int nGXsfl_12_idx=1 ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int AV60GXV1 ;
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
   private String wcpOAV5Emprcod ;
   private String wcpOAV7Forser ;
   private String wcpOAV8Forcolnom ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV5Emprcod ;
   private String AV7Forser ;
   private String AV8Forcolnom ;
   private String sGXsfl_12_idx="0001" ;
   private String AV35TFProForCod ;
   private String AV36TFProForCod_Sel ;
   private String AV38TFProForDsc ;
   private String AV39TFProForDsc_Sel ;
   private String AV59Pgmname ;
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
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
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
   private String AV55Formulaciontinte_wcprocesosformulads_3_tfproforcod ;
   private String AV56Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel ;
   private String AV57Formulaciontinte_wcprocesosformulads_5_tfprofordsc ;
   private String AV58Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel ;
   private String edtProForL_Internalname ;
   private String A764ProForCod ;
   private String edtProForCod_Internalname ;
   private String A766ProForDsc ;
   private String edtProForDsc_Internalname ;
   private String scmdbuf ;
   private String lV55Formulaciontinte_wcprocesosformulads_3_tfproforcod ;
   private String lV57Formulaciontinte_wcprocesosformulads_5_tfprofordsc ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String AV50Station ;
   private String GXv_char2[] ;
   private String AV51Emprnom ;
   private String AV52Usurcod ;
   private String GXt_char8 ;
   private String GXv_char4[] ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String sCtrlAV5Emprcod ;
   private String sCtrlAV6Clicod ;
   private String sCtrlAV7Forser ;
   private String sCtrlAV8Forcolnom ;
   private String sCtrlAV9Forcolnum ;
   private String sCtrlAV45Tipcolcod ;
   private String sGXsfl_12_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtProForL_Jsonclick ;
   private String edtProForCod_Jsonclick ;
   private String edtProForDsc_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV19OrderedDsc ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_12_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV13HTTPRequest ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private IDataStoreProvider pr_default ;
   private String[] H00QV2_A396EmprCod ;
   private int[] H00QV2_A252CliCod ;
   private String[] H00QV2_A494ForSer ;
   private String[] H00QV2_A482ForColNom ;
   private int[] H00QV2_A483ForColNum ;
   private byte[] H00QV2_A831TipColCod ;
   private String[] H00QV2_A766ProForDsc ;
   private String[] H00QV2_A764ProForCod ;
   private short[] H00QV2_A1160ProForL ;
   private long[] H00QV3_AGRID_nRecordCount ;
   private app.wwpbaseobjects.SdtWWPContext AV12WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV14TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState9[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV17GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV41DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class wcprocesosformula__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00QV2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV53Formulaciontinte_wcprocesosformulads_1_tfproforl ,
                                          short AV54Formulaciontinte_wcprocesosformulads_2_tfproforl_to ,
                                          String AV56Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel ,
                                          String AV55Formulaciontinte_wcprocesosformulads_3_tfproforcod ,
                                          String AV58Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel ,
                                          String AV57Formulaciontinte_wcprocesosformulads_5_tfprofordsc ,
                                          short A1160ProForL ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          short AV18OrderedBy ,
                                          boolean AV19OrderedDsc ,
                                          String AV5Emprcod ,
                                          int AV6Clicod ,
                                          String AV7Forser ,
                                          String AV8Forcolnom ,
                                          int AV9Forcolnum ,
                                          byte AV45Tipcolcod ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          String A494ForSer ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[17];
      Object[] GXv_Object11 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T2.ProForDsc, T1.ProForCod, T1.ProForL" ;
      sFromString = " FROM (TXPLFORMU T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ?)");
      if ( ! (0==AV53Formulaciontinte_wcprocesosformulads_1_tfproforl) )
      {
         addWhere(sWhereString, "(T1.ProForL >= ?)");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( ! (0==AV54Formulaciontinte_wcprocesosformulads_2_tfproforl_to) )
      {
         addWhere(sWhereString, "(T1.ProForL <= ?)");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV55Formulaciontinte_wcprocesosformulads_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCod = ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV57Formulaciontinte_wcprocesosformulads_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProForDsc = ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ( AV18OrderedBy == 1 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProForL" ;
      }
      else if ( ( AV18OrderedBy == 1 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProForL DESC" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProForCod" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProForCod DESC" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T2.ProForDsc" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.ProForDsc DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ProForL" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_H00QV3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV53Formulaciontinte_wcprocesosformulads_1_tfproforl ,
                                          short AV54Formulaciontinte_wcprocesosformulads_2_tfproforl_to ,
                                          String AV56Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel ,
                                          String AV55Formulaciontinte_wcprocesosformulads_3_tfproforcod ,
                                          String AV58Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel ,
                                          String AV57Formulaciontinte_wcprocesosformulads_5_tfprofordsc ,
                                          short A1160ProForL ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          short AV18OrderedBy ,
                                          boolean AV19OrderedDsc ,
                                          String AV5Emprcod ,
                                          int AV6Clicod ,
                                          String AV7Forser ,
                                          String AV8Forcolnom ,
                                          int AV9Forcolnum ,
                                          byte AV45Tipcolcod ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          String A494ForSer ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[12];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPLFORMU T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ?)");
      if ( ! (0==AV53Formulaciontinte_wcprocesosformulads_1_tfproforl) )
      {
         addWhere(sWhereString, "(T1.ProForL >= ?)");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( ! (0==AV54Formulaciontinte_wcprocesosformulads_2_tfproforl_to) )
      {
         addWhere(sWhereString, "(T1.ProForL <= ?)");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV55Formulaciontinte_wcprocesosformulads_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Formulaciontinte_wcprocesosformulads_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCod = ?)");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV57Formulaciontinte_wcprocesosformulads_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Formulaciontinte_wcprocesosformulads_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProForDsc = ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV18OrderedBy == 1 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 1 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
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
                  return conditional_H00QV2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Boolean) dynConstraints[10]).booleanValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() );
            case 1 :
                  return conditional_H00QV3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Boolean) dynConstraints[10]).booleanValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00QV2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00QV3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((short[]) buf[8])[0] = rslt.getShort(9);
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
                  stmt.setString(sIdx, (String)parms[19], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 13);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[22]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 13);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[17]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               return;
      }
   }

}

