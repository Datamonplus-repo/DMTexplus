package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcreoperadosdetallelist_impl extends GXWebComponent
{
   public wcreoperadosdetallelist_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcreoperadosdetallelist_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcreoperadosdetallelist_impl.class ));
   }

   public wcreoperadosdetallelist_impl( int remoteHandle ,
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
      cmbavSdtreoperadoss__tiporeoperado = new HTMLChoice();
      chkavSdtreoperadoss__hisadesn = UIFactory.getCheckbox(this);
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
               AV34Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Emprcod", AV34Emprcod);
               AV32FechaIni = localUtil.parseDateParm( httpContext.GetPar( "FechaIni")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32FechaIni", localUtil.format(AV32FechaIni, "99/99/99"));
               AV31FechaFin = localUtil.parseDateParm( httpContext.GetPar( "FechaFin")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31FechaFin", localUtil.format(AV31FechaFin, "99/99/99"));
               AV30ClicodIni = (int)(GXutil.lval( httpContext.GetPar( "ClicodIni"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30ClicodIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30ClicodIni), 6, 0));
               AV29ClicodFin = (int)(GXutil.lval( httpContext.GetPar( "ClicodFin"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29ClicodFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29ClicodFin), 6, 0));
               AV33HisEstReo = (byte)(GXutil.lval( httpContext.GetPar( "HisEstReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33HisEstReo", GXutil.str( AV33HisEstReo, 1, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV34Emprcod,AV32FechaIni,AV31FechaFin,Integer.valueOf(AV30ClicodIni),Integer.valueOf(AV29ClicodFin),Byte.valueOf(AV33HisEstReo)});
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
      nRC_GXsfl_41 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_41"))) ;
      nGXsfl_41_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_41_idx"))) ;
      sGXsfl_41_idx = httpContext.GetPar( "sGXsfl_41_idx") ;
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
      AV34Emprcod = httpContext.GetPar( "Emprcod") ;
      AV32FechaIni = localUtil.parseDateParm( httpContext.GetPar( "FechaIni")) ;
      AV31FechaFin = localUtil.parseDateParm( httpContext.GetPar( "FechaFin")) ;
      AV30ClicodIni = (int)(GXutil.lval( httpContext.GetPar( "ClicodIni"))) ;
      AV29ClicodFin = (int)(GXutil.lval( httpContext.GetPar( "ClicodFin"))) ;
      AV33HisEstReo = (byte)(GXutil.lval( httpContext.GetPar( "HisEstReo"))) ;
      AV19ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV5ColumnsSelector);
      AV79Pgmname = httpContext.GetPar( "Pgmname") ;
      AV35FilterFullText = httpContext.GetPar( "FilterFullText") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV34Emprcod, AV32FechaIni, AV31FechaFin, AV30ClicodIni, AV29ClicodFin, AV33HisEstReo, AV19ManageFiltersExecutionStep, AV5ColumnsSelector, AV79Pgmname, AV35FilterFullText, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paE22( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "WCReoperados Detalle List", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcreoperadosdetallelist", new String[] {GXutil.URLEncode(GXutil.rtrim(AV34Emprcod)),GXutil.URLEncode(GXutil.formatDateParm(AV32FechaIni)),GXutil.URLEncode(GXutil.formatDateParm(AV31FechaFin)),GXutil.URLEncode(GXutil.ltrimstr(AV30ClicodIni,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV29ClicodFin,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV33HisEstReo,1,0))}, new String[] {"Emprcod","FechaIni","FechaFin","ClicodIni","ClicodFin","HisEstReo"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV79Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Sdtreoperadoss", AV22SDTReoperadoss);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Sdtreoperadoss", AV22SDTReoperadoss);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_41", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_41, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV18ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV18ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV12GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV13GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV8DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV8DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV5ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV5ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV34Emprcod", GXutil.rtrim( wcpOAV34Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV32FechaIni", localUtil.dtoc( wcpOAV32FechaIni, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV31FechaFin", localUtil.dtoc( wcpOAV31FechaFin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV30ClicodIni", GXutil.ltrim( localUtil.ntoc( wcpOAV30ClicodIni, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV29ClicodFin", GXutil.ltrim( localUtil.ntoc( wcpOAV29ClicodFin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV33HisEstReo", GXutil.ltrim( localUtil.ntoc( wcpOAV33HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV34Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFECHAINI", localUtil.dtoc( AV32FechaIni, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFECHAFIN", localUtil.dtoc( AV31FechaFin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODINI", GXutil.ltrim( localUtil.ntoc( AV30ClicodIni, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODFIN", GXutil.ltrim( localUtil.ntoc( AV29ClicodFin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISESTREO", GXutil.ltrim( localUtil.ntoc( AV33HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV19ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV79Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV79Pgmname, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV14GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV14GridState);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTREOPERADOSS", AV22SDTReoperadoss);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTREOPERADOSS", AV22SDTReoperadoss);
      }
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseFormE22( )
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
      return "WCReoperadosDetalleList" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "WCReoperados Detalle List", "") ;
   }

   public void wbE20( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcreoperadosdetallelist");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCReoperadosDetalleList.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCReoperadosDetalleList.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCReoperadosDetalleList.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_E22( true) ;
      }
      else
      {
         wb_table1_23_E22( false) ;
      }
      return  ;
   }

   public void wb_table1_23_E22e( boolean wbgen )
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
         startgridcontrol41( ) ;
      }
      if ( wbEnd == 41 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_41 = (int)(nGXsfl_41_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV39GXV1 = nGXsfl_41_idx ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV12GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV13GridPageCount);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV8DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV8DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV5ColumnsSelector);
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
      if ( wbEnd == 41 )
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
               AV39GXV1 = nGXsfl_41_idx ;
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

   public void startE22( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "WCReoperados Detalle List", ""), (short)(0)) ;
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
            strupE20( ) ;
         }
      }
   }

   public void wsE22( )
   {
      startE22( ) ;
      evtE22( ) ;
   }

   public void evtE22( )
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
                              strupE20( ) ;
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
                              strupE20( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e11E22 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupE20( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e12E22 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupE20( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e13E22 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupE20( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e14E22 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupE20( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e15E22 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupE20( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e16E22 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupE20( ) ;
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
                              strupE20( ) ;
                           }
                           nGXsfl_41_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_412( ) ;
                           AV39GXV1 = (int)(nGXsfl_41_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV22SDTReoperadoss.size() >= AV39GXV1 ) && ( AV39GXV1 > 0 ) )
                           {
                              AV22SDTReoperadoss.currentItem( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)) );
                           }
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
                                       e17E22 ();
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
                                       e18E22 ();
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
                                       e19E22 ();
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
                                    strupE20( ) ;
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
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void weE22( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormE22( ) ;
         }
      }
   }

   public void paE22( )
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
      subsflControlProps_412( ) ;
      while ( nGXsfl_41_idx <= nRC_GXsfl_41 )
      {
         sendrow_412( ) ;
         nGXsfl_41_idx = ((subGrid_Islastpage==1)&&(nGXsfl_41_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_41_idx+1) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV34Emprcod ,
                                 java.util.Date AV32FechaIni ,
                                 java.util.Date AV31FechaFin ,
                                 int AV30ClicodIni ,
                                 int AV29ClicodFin ,
                                 byte AV33HisEstReo ,
                                 byte AV19ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV5ColumnsSelector ,
                                 String AV79Pgmname ,
                                 String AV35FilterFullText ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e18E22 ();
      GRID_nCurrentRecord = 0 ;
      rfE22( ) ;
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
      rfE22( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV79Pgmname = "WCReoperadosDetalleList" ;
      Gx_err = (short)(0) ;
      cmbavSdtreoperadoss__tiporeoperado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavSdtreoperadoss__tiporeoperado.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavSdtreoperadoss__tiporeoperado.getEnabled(), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisreofec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisreofec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisreofec_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hishorreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hishorreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hishorreo_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisreohdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisreohdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisreohdr_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisreolote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisreolote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisreolote_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__tipdefcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__tipdefcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__tipdefcod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__tipdefdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__tipdefdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__tipdefdsc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__codcausa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__codcausa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__codcausa_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__dsccausa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__dsccausa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__dsccausa_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__rps_cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__rps_cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__rps_cod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__rps_dsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__rps_dsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__rps_dsc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__maqcod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__maqdsc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__clicod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__clinom_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisbarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisbarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisbarser_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisreodsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisreodsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisreodsc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__histipart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__histipart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__histipart_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hiscolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hiscolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hiscolnom_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hiscolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hiscolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hiscolnum_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__histipcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__histipcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__histipcol_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisnomcli_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisnumcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisnumcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisnumcli_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisbarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisbarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisbarkgm_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisbarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisbarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisbarmtr_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisnumpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisnumpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisnumpie_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisopetur_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisopetur_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisopetur_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisopecod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisopecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisopecod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisusu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisusu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisusu_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisadeobs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisadeobs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisadeobs_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      chkavSdtreoperadoss__hisadesn.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSdtreoperadoss__hisadesn.getInternalname(), "Enabled", GXutil.ltrimstr( chkavSdtreoperadoss__hisadesn.getEnabled(), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisaccot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisaccot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisaccot_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisacco_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisacco_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisacco_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisadeacct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisadeacct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisadeacct_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisadeacco_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisadeacco_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisadeacco_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisreotn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisreotn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisreotn_Enabled), 5, 0), !bGXsfl_41_Refreshing);
   }

   public void rfE22( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(41) ;
      /* Execute user event: Refresh */
      e18E22 ();
      nGXsfl_41_idx = 1 ;
      sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_412( ) ;
      bGXsfl_41_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
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
         subsflControlProps_412( ) ;
         e19E22 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_41_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e19E22 ();
         }
         wbEnd = (short)(41) ;
         wbE20( ) ;
      }
      bGXsfl_41_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesE22( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV79Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV79Pgmname, ""))));
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
      return AV22SDTReoperadoss.size() ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV34Emprcod, AV32FechaIni, AV31FechaFin, AV30ClicodIni, AV29ClicodFin, AV33HisEstReo, AV19ManageFiltersExecutionStep, AV5ColumnsSelector, AV79Pgmname, AV35FilterFullText, sPrefix) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV34Emprcod, AV32FechaIni, AV31FechaFin, AV30ClicodIni, AV29ClicodFin, AV33HisEstReo, AV19ManageFiltersExecutionStep, AV5ColumnsSelector, AV79Pgmname, AV35FilterFullText, sPrefix) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV34Emprcod, AV32FechaIni, AV31FechaFin, AV30ClicodIni, AV29ClicodFin, AV33HisEstReo, AV19ManageFiltersExecutionStep, AV5ColumnsSelector, AV79Pgmname, AV35FilterFullText, sPrefix) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV34Emprcod, AV32FechaIni, AV31FechaFin, AV30ClicodIni, AV29ClicodFin, AV33HisEstReo, AV19ManageFiltersExecutionStep, AV5ColumnsSelector, AV79Pgmname, AV35FilterFullText, sPrefix) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV34Emprcod, AV32FechaIni, AV31FechaFin, AV30ClicodIni, AV29ClicodFin, AV33HisEstReo, AV19ManageFiltersExecutionStep, AV5ColumnsSelector, AV79Pgmname, AV35FilterFullText, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV79Pgmname = "WCReoperadosDetalleList" ;
      Gx_err = (short)(0) ;
      cmbavSdtreoperadoss__tiporeoperado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavSdtreoperadoss__tiporeoperado.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavSdtreoperadoss__tiporeoperado.getEnabled(), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisreofec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisreofec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisreofec_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hishorreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hishorreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hishorreo_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisreohdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisreohdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisreohdr_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisreolote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisreolote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisreolote_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__tipdefcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__tipdefcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__tipdefcod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__tipdefdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__tipdefdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__tipdefdsc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__codcausa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__codcausa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__codcausa_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__dsccausa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__dsccausa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__dsccausa_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__rps_cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__rps_cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__rps_cod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__rps_dsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__rps_dsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__rps_dsc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__maqcod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__maqdsc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__clicod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__clinom_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisbarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisbarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisbarser_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisreodsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisreodsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisreodsc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__histipart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__histipart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__histipart_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hiscolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hiscolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hiscolnom_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hiscolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hiscolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hiscolnum_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__histipcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__histipcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__histipcol_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisnomcli_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisnumcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisnumcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisnumcli_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisbarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisbarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisbarkgm_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisbarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisbarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisbarmtr_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisnumpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisnumpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisnumpie_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisopetur_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisopetur_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisopetur_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisopecod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisopecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisopecod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisusu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisusu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisusu_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisadeobs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisadeobs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisadeobs_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      chkavSdtreoperadoss__hisadesn.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSdtreoperadoss__hisadesn.getInternalname(), "Enabled", GXutil.ltrimstr( chkavSdtreoperadoss__hisadesn.getEnabled(), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisaccot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisaccot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisaccot_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisacco_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisacco_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisacco_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisadeacct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisadeacct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisadeacct_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisadeacco_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisadeacco_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisadeacco_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisreotn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisreotn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisreotn_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupE20( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e17E22 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Sdtreoperadoss"), AV22SDTReoperadoss);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV18ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV8DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV5ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vSDTREOPERADOSS"), AV22SDTReoperadoss);
         /* Read saved values. */
         nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV12GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV13GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV34Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV34Emprcod") ;
         wcpOAV32FechaIni = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV32FechaIni"), 0) ;
         wcpOAV31FechaFin = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV31FechaFin"), 0) ;
         wcpOAV30ClicodIni = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV30ClicodIni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV29ClicodFin = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV29ClicodFin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV33HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV33HisEstReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
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
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_41_fel_idx = 0 ;
         while ( nGXsfl_41_fel_idx < nRC_GXsfl_41 )
         {
            nGXsfl_41_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_41_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_41_fel_idx+1) ;
            sGXsfl_41_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_412( ) ;
            AV39GXV1 = (int)(nGXsfl_41_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV22SDTReoperadoss.size() >= AV39GXV1 ) && ( AV39GXV1 > 0 ) )
            {
               AV22SDTReoperadoss.currentItem( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)) );
            }
         }
         if ( nGXsfl_41_fel_idx == 0 )
         {
            nGXsfl_41_idx = 1 ;
            sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_412( ) ;
         }
         nGXsfl_41_fel_idx = 1 ;
         /* Read variables values. */
         AV35FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35FilterFullText", AV35FilterFullText);
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
      e17E22 ();
      if (returnInSub) return;
   }

   public void e17E22( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV76Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcreoperadosdetallelist_impl.this.GXt_char1 = GXv_char2[0] ;
      AV76Station = GXt_char1 ;
      GXv_char2[0] = AV34Emprcod ;
      GXv_char3[0] = AV77Emprnom ;
      GXv_char4[0] = AV78Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV76Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcreoperadosdetallelist_impl.this.AV34Emprcod = GXv_char2[0] ;
      wcreoperadosdetallelist_impl.this.AV77Emprnom = GXv_char3[0] ;
      wcreoperadosdetallelist_impl.this.AV78Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Emprcod", AV34Emprcod);
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
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV8DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV8DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e18E22( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXt_objcol_SdtSDTReoperados7 = AV22SDTReoperadoss ;
      GXv_objcol_SdtSDTReoperados8[0] = GXt_objcol_SdtSDTReoperados7 ;
      new app.dpreoperados(remoteHandle, context).execute( AV34Emprcod, AV32FechaIni, AV31FechaFin, AV30ClicodIni, AV29ClicodFin, AV33HisEstReo, GXv_objcol_SdtSDTReoperados8) ;
      GXt_objcol_SdtSDTReoperados7 = GXv_objcol_SdtSDTReoperados8[0] ;
      AV22SDTReoperadoss = GXt_objcol_SdtSDTReoperados7 ;
      gx_BV41 = true ;
      GXv_SdtWWPContext9[0] = AV28WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV28WWPContext = GXv_SdtWWPContext9[0] ;
      if ( AV19ManageFiltersExecutionStep == 1 )
      {
         AV19ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19ManageFiltersExecutionStep", GXutil.str( AV19ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV19ManageFiltersExecutionStep == 2 )
      {
         AV19ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19ManageFiltersExecutionStep", GXutil.str( AV19ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV23Session.getValue("WCReoperadosDetalleListColumnsSelector"), "") != 0 )
      {
         AV7ColumnsSelectorXML = AV23Session.getValue("WCReoperadosDetalleListColumnsSelector") ;
         AV5ColumnsSelector.fromxml(AV7ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S142 ();
         if (returnInSub) return;
      }
      cmbavSdtreoperadoss__tiporeoperado.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavSdtreoperadoss__tiporeoperado.getInternalname(), "Visible", GXutil.ltrimstr( cmbavSdtreoperadoss__tiporeoperado.getVisible(), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisreofec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisreofec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisreofec_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hishorreo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hishorreo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hishorreo_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisreohdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisreohdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisreohdr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisreolote_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisreolote_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisreolote_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__tipdefcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__tipdefcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__tipdefcod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__tipdefdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__tipdefdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__tipdefdsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__codcausa_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__codcausa_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__codcausa_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__dsccausa_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__dsccausa_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__dsccausa_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__rps_cod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__rps_cod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__rps_cod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__rps_dsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__rps_dsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__rps_dsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__maqcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__maqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__maqcod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__maqdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__maqdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__maqdsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__clicod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__clicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__clicod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__clinom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__clinom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__clinom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisbarser_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisbarser_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisbarser_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisreodsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisreodsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisreodsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__histipart_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__histipart_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__histipart_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hiscolnom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hiscolnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hiscolnom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hiscolnum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hiscolnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hiscolnum_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__histipcol_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__histipcol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__histipcol_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisnomcli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisnomcli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisnomcli_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisnumcli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisnumcli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisnumcli_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisbarkgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisbarkgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisbarkgm_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisbarmtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisbarmtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisbarmtr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisnumpie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisnumpie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisnumpie_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisopetur_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisopetur_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisopetur_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisopecod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisopecod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisopecod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisusu_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisusu_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisusu_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisadeobs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisadeobs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisadeobs_Visible), 5, 0), !bGXsfl_41_Refreshing);
      chkavSdtreoperadoss__hisadesn.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+31)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSdtreoperadoss__hisadesn.getInternalname(), "Visible", GXutil.ltrimstr( chkavSdtreoperadoss__hisadesn.getVisible(), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisaccot_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+32)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisaccot_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisaccot_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisacco_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+33)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisacco_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisacco_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisadeacct_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+34)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisadeacct_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisadeacct_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisadeacco_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+35)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisadeacco_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisadeacco_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdtreoperadoss__hisreotn_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+36)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtreoperadoss__hisreotn_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtreoperadoss__hisreotn_Visible), 5, 0), !bGXsfl_41_Refreshing);
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S152 ();
      if (returnInSub) return;
      AV12GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12GridCurrentPage), 10, 0));
      AV13GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13GridPageCount), 10, 0));
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22SDTReoperadoss", AV22SDTReoperadoss);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV5ColumnsSelector", AV5ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ManageFiltersData", AV18ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV14GridState", AV14GridState);
   }

   public void e12E22( )
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
         AV21PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV21PageToGo) ;
      }
   }

   public void e13E22( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e19E22( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV39GXV1 = 1 ;
      while ( AV39GXV1 <= AV22SDTReoperadoss.size() )
      {
         AV22SDTReoperadoss.currentItem( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(41) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_412( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_41_Refreshing )
         {
            httpContext.doAjaxLoad(41, GridRow);
         }
         AV39GXV1 = (int)(AV39GXV1+1) ;
      }
   }

   public void e14E22( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV7ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV5ColumnsSelector.fromJSonString(AV7ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WCReoperadosDetalleListColumnsSelector", ((GXutil.strcmp("", AV7ColumnsSelectorXML)==0) ? "" : AV5ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV5ColumnsSelector", AV5ColumnsSelector);
      if ( gx_BV41 )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22SDTReoperadoss", AV22SDTReoperadoss);
         nGXsfl_41_bak_idx = nGXsfl_41_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV34Emprcod, AV32FechaIni, AV31FechaFin, AV30ClicodIni, AV29ClicodFin, AV33HisEstReo, AV19ManageFiltersExecutionStep, AV5ColumnsSelector, AV79Pgmname, AV35FilterFullText, sPrefix) ;
         nGXsfl_41_idx = nGXsfl_41_bak_idx ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
      }
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ManageFiltersData", AV18ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV14GridState", AV14GridState);
   }

   public void e11E22( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S162 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S132 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WCReoperadosDetalleListFilters")),GXutil.URLEncode(GXutil.rtrim(AV79Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV19ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19ManageFiltersExecutionStep", GXutil.str( AV19ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WCReoperadosDetalleListFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV19ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19ManageFiltersExecutionStep", GXutil.str( AV19ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV20ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WCReoperadosDetalleListFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         wcreoperadosdetallelist_impl.this.GXt_char1 = GXv_char4[0] ;
         AV20ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV20ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S162 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV79Pgmname+"GridState", AV20ManageFiltersXml) ;
            AV14GridState.fromxml(AV20ManageFiltersXml, null, null);
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S172 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV14GridState", AV14GridState);
      if ( gx_BV41 )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22SDTReoperadoss", AV22SDTReoperadoss);
         nGXsfl_41_bak_idx = nGXsfl_41_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV34Emprcod, AV32FechaIni, AV31FechaFin, AV30ClicodIni, AV29ClicodFin, AV33HisEstReo, AV19ManageFiltersExecutionStep, AV5ColumnsSelector, AV79Pgmname, AV35FilterFullText, sPrefix) ;
         nGXsfl_41_idx = nGXsfl_41_bak_idx ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
      }
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV5ColumnsSelector", AV5ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ManageFiltersData", AV18ManageFiltersData);
   }

   public void e15E22( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      GXv_char4[0] = AV11ExcelFilename ;
      GXv_char3[0] = AV10ErrorMessage ;
      new app.wcreoperadosdetallelistexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      wcreoperadosdetallelist_impl.this.AV11ExcelFilename = GXv_char4[0] ;
      wcreoperadosdetallelist_impl.this.AV10ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV11ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV11ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV10ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV14GridState", AV14GridState);
   }

   public void e16E22( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.wcreoperadosdetallelistexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV14GridState", AV14GridState);
   }

   public void S152( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
   }

   public void S142( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV5ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__TipoReoperado", "", "Tipo", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__HisReoFec", "", "Fecha", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__HisHorReo", "", "Hora", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__HisReoHDR", "", "Hdr", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__HisreoLote", "", "Lote", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__Tipdefcod", "", "Defecto", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__TipDefDsc", "", "Descripcion", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__CodCausa", "", "Codigo", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__DscCausa", "", "Causa", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__Rps_Cod", "", "Codigo", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__Rps_Dsc", "", " Responsabilidad", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__MaqCod", "", "Maquina", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__MaqDsc", "", "Descripcion ", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__CliCod", "", "Cliente", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__CliNom", "", "Nombre", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__HisBarSer", "", "Articulo", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__HisReoDsc", "", "Descripcion", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__HisTipArt", "", "Tipo Articulo", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__HisColNom", "", "Color", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__HisColNum", "", "Numero", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__HisTipCol", "", "Tc", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__HisNomCli", "", "Color Cliente", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__HisNumCli", "", "Numero", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__HisBarKgm", "", "Kilos", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__HisBarMtr", "", "Metros", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__HisNumPie", "", "Piezas", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__HisOpeTur", "", "Turno", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__HisOpecod", "", "Operario", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__HisUsu", "", "Usuario", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__HisAdeObs", "", "Observaciones", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__HisAdeSN", "", "Resultado eficaz?", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__HisAcCot", "", "Acciones Correctivas", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__HisAcCo", "", "Correccion a efectuar, Accion", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__HisAdEAcCt", "", "Acciones correctivas,Analisis", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__HisAdEAcCo", "", "Acciones de correccion,Analisi", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTReoperadoss__HisReoTn", "", "Nº Interno", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char1 = AV27UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCReoperadosDetalleListColumnsSelector", GXv_char4) ;
      wcreoperadosdetallelist_impl.this.GXt_char1 = GXv_char4[0] ;
      AV27UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV27UserCustomValue)==0) ) )
      {
         AV6ColumnsSelectorAux.fromxml(AV27UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV6ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV5ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV6ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV5ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = AV18ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WCReoperadosDetalleListFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] ;
      AV18ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   }

   public void S162( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV35FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35FilterFullText", AV35FilterFullText);
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV23Session.getValue(AV79Pgmname+"GridState"), "") == 0 )
      {
         AV14GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV79Pgmname+"GridState"), null, null);
      }
      else
      {
         AV14GridState.fromxml(AV23Session.getValue(AV79Pgmname+"GridState"), null, null);
      }
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S172 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV14GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV14GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV14GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S172( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV80GXV38 = 1 ;
      while ( AV80GXV38 <= AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV80GXV38));
         if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV35FilterFullText = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35FilterFullText", AV35FilterFullText);
         }
         AV80GXV38 = (int)(AV80GXV38+1) ;
      }
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV14GridState.fromxml(AV23Session.getValue(AV79Pgmname+"GridState"), null, null);
      AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState14[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV35FilterFullText)==0), (short)(0), AV35FilterFullText, "") ;
      AV14GridState = GXv_SdtWWPGridState14[0] ;
      AV14GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV14GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV79Pgmname+"GridState", AV14GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void wb_table1_23_E22( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV18ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_28_E22( true) ;
      }
      else
      {
         wb_table2_28_E22( false) ;
      }
      return  ;
   }

   public void wb_table2_28_E22e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_E22e( true) ;
      }
      else
      {
         wb_table1_23_E22e( false) ;
      }
   }

   public void wb_table2_28_E22( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV35FilterFullText, GXutil.rtrim( localUtil.format( AV35FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WCReoperadosDetalleList.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_28_E22e( true) ;
      }
      else
      {
         wb_table2_28_E22e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV34Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Emprcod", AV34Emprcod);
      AV32FechaIni = (java.util.Date)getParm(obj,1,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32FechaIni", localUtil.format(AV32FechaIni, "99/99/99"));
      AV31FechaFin = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31FechaFin", localUtil.format(AV31FechaFin, "99/99/99"));
      AV30ClicodIni = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30ClicodIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30ClicodIni), 6, 0));
      AV29ClicodFin = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29ClicodFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29ClicodFin), 6, 0));
      AV33HisEstReo = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33HisEstReo", GXutil.str( AV33HisEstReo, 1, 0));
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
      paE22( ) ;
      wsE22( ) ;
      weE22( ) ;
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
      sCtrlAV34Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV32FechaIni = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV31FechaFin = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV30ClicodIni = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV29ClicodFin = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV33HisEstReo = (String)getParm(obj,5,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paE22( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcreoperadosdetallelist", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paE22( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV34Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Emprcod", AV34Emprcod);
         AV32FechaIni = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32FechaIni", localUtil.format(AV32FechaIni, "99/99/99"));
         AV31FechaFin = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31FechaFin", localUtil.format(AV31FechaFin, "99/99/99"));
         AV30ClicodIni = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30ClicodIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30ClicodIni), 6, 0));
         AV29ClicodFin = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29ClicodFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29ClicodFin), 6, 0));
         AV33HisEstReo = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33HisEstReo", GXutil.str( AV33HisEstReo, 1, 0));
      }
      wcpOAV34Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV34Emprcod") ;
      wcpOAV32FechaIni = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV32FechaIni"), 0) ;
      wcpOAV31FechaFin = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV31FechaFin"), 0) ;
      wcpOAV30ClicodIni = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV30ClicodIni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV29ClicodFin = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV29ClicodFin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV33HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV33HisEstReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV34Emprcod, wcpOAV34Emprcod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV32FechaIni), GXutil.resetTime(wcpOAV32FechaIni)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV31FechaFin), GXutil.resetTime(wcpOAV31FechaFin)) ) || ( AV30ClicodIni != wcpOAV30ClicodIni ) || ( AV29ClicodFin != wcpOAV29ClicodFin ) || ( AV33HisEstReo != wcpOAV33HisEstReo ) ) )
      {
         setjustcreated();
      }
      wcpOAV34Emprcod = AV34Emprcod ;
      wcpOAV32FechaIni = AV32FechaIni ;
      wcpOAV31FechaFin = AV31FechaFin ;
      wcpOAV30ClicodIni = AV30ClicodIni ;
      wcpOAV29ClicodFin = AV29ClicodFin ;
      wcpOAV33HisEstReo = AV33HisEstReo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV34Emprcod = httpContext.cgiGet( sPrefix+"AV34Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV34Emprcod) > 0 )
      {
         AV34Emprcod = httpContext.cgiGet( sCtrlAV34Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Emprcod", AV34Emprcod);
      }
      else
      {
         AV34Emprcod = httpContext.cgiGet( sPrefix+"AV34Emprcod_PARM") ;
      }
      sCtrlAV32FechaIni = httpContext.cgiGet( sPrefix+"AV32FechaIni_CTRL") ;
      if ( GXutil.len( sCtrlAV32FechaIni) > 0 )
      {
         AV32FechaIni = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV32FechaIni), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32FechaIni", localUtil.format(AV32FechaIni, "99/99/99"));
      }
      else
      {
         AV32FechaIni = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV32FechaIni_PARM"), 0) ;
      }
      sCtrlAV31FechaFin = httpContext.cgiGet( sPrefix+"AV31FechaFin_CTRL") ;
      if ( GXutil.len( sCtrlAV31FechaFin) > 0 )
      {
         AV31FechaFin = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV31FechaFin), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31FechaFin", localUtil.format(AV31FechaFin, "99/99/99"));
      }
      else
      {
         AV31FechaFin = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV31FechaFin_PARM"), 0) ;
      }
      sCtrlAV30ClicodIni = httpContext.cgiGet( sPrefix+"AV30ClicodIni_CTRL") ;
      if ( GXutil.len( sCtrlAV30ClicodIni) > 0 )
      {
         AV30ClicodIni = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV30ClicodIni), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30ClicodIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30ClicodIni), 6, 0));
      }
      else
      {
         AV30ClicodIni = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV30ClicodIni_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV29ClicodFin = httpContext.cgiGet( sPrefix+"AV29ClicodFin_CTRL") ;
      if ( GXutil.len( sCtrlAV29ClicodFin) > 0 )
      {
         AV29ClicodFin = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV29ClicodFin), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29ClicodFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29ClicodFin), 6, 0));
      }
      else
      {
         AV29ClicodFin = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV29ClicodFin_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV33HisEstReo = httpContext.cgiGet( sPrefix+"AV33HisEstReo_CTRL") ;
      if ( GXutil.len( sCtrlAV33HisEstReo) > 0 )
      {
         AV33HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV33HisEstReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33HisEstReo", GXutil.str( AV33HisEstReo, 1, 0));
      }
      else
      {
         AV33HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV33HisEstReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      paE22( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsE22( ) ;
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
      wsE22( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34Emprcod_PARM", GXutil.rtrim( AV34Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV34Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34Emprcod_CTRL", GXutil.rtrim( sCtrlAV34Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32FechaIni_PARM", localUtil.dtoc( AV32FechaIni, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV32FechaIni)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32FechaIni_CTRL", GXutil.rtrim( sCtrlAV32FechaIni));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31FechaFin_PARM", localUtil.dtoc( AV31FechaFin, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV31FechaFin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31FechaFin_CTRL", GXutil.rtrim( sCtrlAV31FechaFin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30ClicodIni_PARM", GXutil.ltrim( localUtil.ntoc( AV30ClicodIni, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV30ClicodIni)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30ClicodIni_CTRL", GXutil.rtrim( sCtrlAV30ClicodIni));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29ClicodFin_PARM", GXutil.ltrim( localUtil.ntoc( AV29ClicodFin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV29ClicodFin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29ClicodFin_CTRL", GXutil.rtrim( sCtrlAV29ClicodFin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33HisEstReo_PARM", GXutil.ltrim( localUtil.ntoc( AV33HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV33HisEstReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33HisEstReo_CTRL", GXutil.rtrim( sCtrlAV33HisEstReo));
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
      weE22( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115565817", true, true);
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
      httpContext.AddJavascriptSource("wcreoperadosdetallelist.js", "?202682115565817", false, true);
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

   public void subsflControlProps_412( )
   {
      cmbavSdtreoperadoss__tiporeoperado.setInternalname( sPrefix+"SDTREOPERADOSS__TIPOREOPERADO_"+sGXsfl_41_idx );
      edtavSdtreoperadoss__hisreofec_Internalname = sPrefix+"SDTREOPERADOSS__HISREOFEC_"+sGXsfl_41_idx ;
      edtavSdtreoperadoss__hishorreo_Internalname = sPrefix+"SDTREOPERADOSS__HISHORREO_"+sGXsfl_41_idx ;
      edtavSdtreoperadoss__hisreohdr_Internalname = sPrefix+"SDTREOPERADOSS__HISREOHDR_"+sGXsfl_41_idx ;
      edtavSdtreoperadoss__hisreolote_Internalname = sPrefix+"SDTREOPERADOSS__HISREOLOTE_"+sGXsfl_41_idx ;
      edtavSdtreoperadoss__tipdefcod_Internalname = sPrefix+"SDTREOPERADOSS__TIPDEFCOD_"+sGXsfl_41_idx ;
      edtavSdtreoperadoss__tipdefdsc_Internalname = sPrefix+"SDTREOPERADOSS__TIPDEFDSC_"+sGXsfl_41_idx ;
      edtavSdtreoperadoss__codcausa_Internalname = sPrefix+"SDTREOPERADOSS__CODCAUSA_"+sGXsfl_41_idx ;
      edtavSdtreoperadoss__dsccausa_Internalname = sPrefix+"SDTREOPERADOSS__DSCCAUSA_"+sGXsfl_41_idx ;
      edtavSdtreoperadoss__rps_cod_Internalname = sPrefix+"SDTREOPERADOSS__RPS_COD_"+sGXsfl_41_idx ;
      edtavSdtreoperadoss__rps_dsc_Internalname = sPrefix+"SDTREOPERADOSS__RPS_DSC_"+sGXsfl_41_idx ;
      edtavSdtreoperadoss__maqcod_Internalname = sPrefix+"SDTREOPERADOSS__MAQCOD_"+sGXsfl_41_idx ;
      edtavSdtreoperadoss__maqdsc_Internalname = sPrefix+"SDTREOPERADOSS__MAQDSC_"+sGXsfl_41_idx ;
      edtavSdtreoperadoss__clicod_Internalname = sPrefix+"SDTREOPERADOSS__CLICOD_"+sGXsfl_41_idx ;
      edtavSdtreoperadoss__clinom_Internalname = sPrefix+"SDTREOPERADOSS__CLINOM_"+sGXsfl_41_idx ;
      edtavSdtreoperadoss__hisbarser_Internalname = sPrefix+"SDTREOPERADOSS__HISBARSER_"+sGXsfl_41_idx ;
      edtavSdtreoperadoss__hisreodsc_Internalname = sPrefix+"SDTREOPERADOSS__HISREODSC_"+sGXsfl_41_idx ;
      edtavSdtreoperadoss__histipart_Internalname = sPrefix+"SDTREOPERADOSS__HISTIPART_"+sGXsfl_41_idx ;
      edtavSdtreoperadoss__hiscolnom_Internalname = sPrefix+"SDTREOPERADOSS__HISCOLNOM_"+sGXsfl_41_idx ;
      edtavSdtreoperadoss__hiscolnum_Internalname = sPrefix+"SDTREOPERADOSS__HISCOLNUM_"+sGXsfl_41_idx ;
      edtavSdtreoperadoss__histipcol_Internalname = sPrefix+"SDTREOPERADOSS__HISTIPCOL_"+sGXsfl_41_idx ;
      edtavSdtreoperadoss__hisnomcli_Internalname = sPrefix+"SDTREOPERADOSS__HISNOMCLI_"+sGXsfl_41_idx ;
      edtavSdtreoperadoss__hisnumcli_Internalname = sPrefix+"SDTREOPERADOSS__HISNUMCLI_"+sGXsfl_41_idx ;
      edtavSdtreoperadoss__hisbarkgm_Internalname = sPrefix+"SDTREOPERADOSS__HISBARKGM_"+sGXsfl_41_idx ;
      edtavSdtreoperadoss__hisbarmtr_Internalname = sPrefix+"SDTREOPERADOSS__HISBARMTR_"+sGXsfl_41_idx ;
      edtavSdtreoperadoss__hisnumpie_Internalname = sPrefix+"SDTREOPERADOSS__HISNUMPIE_"+sGXsfl_41_idx ;
      edtavSdtreoperadoss__hisopetur_Internalname = sPrefix+"SDTREOPERADOSS__HISOPETUR_"+sGXsfl_41_idx ;
      edtavSdtreoperadoss__hisopecod_Internalname = sPrefix+"SDTREOPERADOSS__HISOPECOD_"+sGXsfl_41_idx ;
      edtavSdtreoperadoss__hisusu_Internalname = sPrefix+"SDTREOPERADOSS__HISUSU_"+sGXsfl_41_idx ;
      edtavSdtreoperadoss__hisadeobs_Internalname = sPrefix+"SDTREOPERADOSS__HISADEOBS_"+sGXsfl_41_idx ;
      chkavSdtreoperadoss__hisadesn.setInternalname( sPrefix+"SDTREOPERADOSS__HISADESN_"+sGXsfl_41_idx );
      edtavSdtreoperadoss__hisaccot_Internalname = sPrefix+"SDTREOPERADOSS__HISACCOT_"+sGXsfl_41_idx ;
      edtavSdtreoperadoss__hisacco_Internalname = sPrefix+"SDTREOPERADOSS__HISACCO_"+sGXsfl_41_idx ;
      edtavSdtreoperadoss__hisadeacct_Internalname = sPrefix+"SDTREOPERADOSS__HISADEACCT_"+sGXsfl_41_idx ;
      edtavSdtreoperadoss__hisadeacco_Internalname = sPrefix+"SDTREOPERADOSS__HISADEACCO_"+sGXsfl_41_idx ;
      edtavSdtreoperadoss__hisreotn_Internalname = sPrefix+"SDTREOPERADOSS__HISREOTN_"+sGXsfl_41_idx ;
   }

   public void subsflControlProps_fel_412( )
   {
      cmbavSdtreoperadoss__tiporeoperado.setInternalname( sPrefix+"SDTREOPERADOSS__TIPOREOPERADO_"+sGXsfl_41_fel_idx );
      edtavSdtreoperadoss__hisreofec_Internalname = sPrefix+"SDTREOPERADOSS__HISREOFEC_"+sGXsfl_41_fel_idx ;
      edtavSdtreoperadoss__hishorreo_Internalname = sPrefix+"SDTREOPERADOSS__HISHORREO_"+sGXsfl_41_fel_idx ;
      edtavSdtreoperadoss__hisreohdr_Internalname = sPrefix+"SDTREOPERADOSS__HISREOHDR_"+sGXsfl_41_fel_idx ;
      edtavSdtreoperadoss__hisreolote_Internalname = sPrefix+"SDTREOPERADOSS__HISREOLOTE_"+sGXsfl_41_fel_idx ;
      edtavSdtreoperadoss__tipdefcod_Internalname = sPrefix+"SDTREOPERADOSS__TIPDEFCOD_"+sGXsfl_41_fel_idx ;
      edtavSdtreoperadoss__tipdefdsc_Internalname = sPrefix+"SDTREOPERADOSS__TIPDEFDSC_"+sGXsfl_41_fel_idx ;
      edtavSdtreoperadoss__codcausa_Internalname = sPrefix+"SDTREOPERADOSS__CODCAUSA_"+sGXsfl_41_fel_idx ;
      edtavSdtreoperadoss__dsccausa_Internalname = sPrefix+"SDTREOPERADOSS__DSCCAUSA_"+sGXsfl_41_fel_idx ;
      edtavSdtreoperadoss__rps_cod_Internalname = sPrefix+"SDTREOPERADOSS__RPS_COD_"+sGXsfl_41_fel_idx ;
      edtavSdtreoperadoss__rps_dsc_Internalname = sPrefix+"SDTREOPERADOSS__RPS_DSC_"+sGXsfl_41_fel_idx ;
      edtavSdtreoperadoss__maqcod_Internalname = sPrefix+"SDTREOPERADOSS__MAQCOD_"+sGXsfl_41_fel_idx ;
      edtavSdtreoperadoss__maqdsc_Internalname = sPrefix+"SDTREOPERADOSS__MAQDSC_"+sGXsfl_41_fel_idx ;
      edtavSdtreoperadoss__clicod_Internalname = sPrefix+"SDTREOPERADOSS__CLICOD_"+sGXsfl_41_fel_idx ;
      edtavSdtreoperadoss__clinom_Internalname = sPrefix+"SDTREOPERADOSS__CLINOM_"+sGXsfl_41_fel_idx ;
      edtavSdtreoperadoss__hisbarser_Internalname = sPrefix+"SDTREOPERADOSS__HISBARSER_"+sGXsfl_41_fel_idx ;
      edtavSdtreoperadoss__hisreodsc_Internalname = sPrefix+"SDTREOPERADOSS__HISREODSC_"+sGXsfl_41_fel_idx ;
      edtavSdtreoperadoss__histipart_Internalname = sPrefix+"SDTREOPERADOSS__HISTIPART_"+sGXsfl_41_fel_idx ;
      edtavSdtreoperadoss__hiscolnom_Internalname = sPrefix+"SDTREOPERADOSS__HISCOLNOM_"+sGXsfl_41_fel_idx ;
      edtavSdtreoperadoss__hiscolnum_Internalname = sPrefix+"SDTREOPERADOSS__HISCOLNUM_"+sGXsfl_41_fel_idx ;
      edtavSdtreoperadoss__histipcol_Internalname = sPrefix+"SDTREOPERADOSS__HISTIPCOL_"+sGXsfl_41_fel_idx ;
      edtavSdtreoperadoss__hisnomcli_Internalname = sPrefix+"SDTREOPERADOSS__HISNOMCLI_"+sGXsfl_41_fel_idx ;
      edtavSdtreoperadoss__hisnumcli_Internalname = sPrefix+"SDTREOPERADOSS__HISNUMCLI_"+sGXsfl_41_fel_idx ;
      edtavSdtreoperadoss__hisbarkgm_Internalname = sPrefix+"SDTREOPERADOSS__HISBARKGM_"+sGXsfl_41_fel_idx ;
      edtavSdtreoperadoss__hisbarmtr_Internalname = sPrefix+"SDTREOPERADOSS__HISBARMTR_"+sGXsfl_41_fel_idx ;
      edtavSdtreoperadoss__hisnumpie_Internalname = sPrefix+"SDTREOPERADOSS__HISNUMPIE_"+sGXsfl_41_fel_idx ;
      edtavSdtreoperadoss__hisopetur_Internalname = sPrefix+"SDTREOPERADOSS__HISOPETUR_"+sGXsfl_41_fel_idx ;
      edtavSdtreoperadoss__hisopecod_Internalname = sPrefix+"SDTREOPERADOSS__HISOPECOD_"+sGXsfl_41_fel_idx ;
      edtavSdtreoperadoss__hisusu_Internalname = sPrefix+"SDTREOPERADOSS__HISUSU_"+sGXsfl_41_fel_idx ;
      edtavSdtreoperadoss__hisadeobs_Internalname = sPrefix+"SDTREOPERADOSS__HISADEOBS_"+sGXsfl_41_fel_idx ;
      chkavSdtreoperadoss__hisadesn.setInternalname( sPrefix+"SDTREOPERADOSS__HISADESN_"+sGXsfl_41_fel_idx );
      edtavSdtreoperadoss__hisaccot_Internalname = sPrefix+"SDTREOPERADOSS__HISACCOT_"+sGXsfl_41_fel_idx ;
      edtavSdtreoperadoss__hisacco_Internalname = sPrefix+"SDTREOPERADOSS__HISACCO_"+sGXsfl_41_fel_idx ;
      edtavSdtreoperadoss__hisadeacct_Internalname = sPrefix+"SDTREOPERADOSS__HISADEACCT_"+sGXsfl_41_fel_idx ;
      edtavSdtreoperadoss__hisadeacco_Internalname = sPrefix+"SDTREOPERADOSS__HISADEACCO_"+sGXsfl_41_fel_idx ;
      edtavSdtreoperadoss__hisreotn_Internalname = sPrefix+"SDTREOPERADOSS__HISREOTN_"+sGXsfl_41_fel_idx ;
   }

   public void sendrow_412( )
   {
      subsflControlProps_412( ) ;
      wbE20( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_41_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_41_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_41_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbavSdtreoperadoss__tiporeoperado.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbavSdtreoperadoss__tiporeoperado.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "SDTREOPERADOSS__TIPOREOPERADO_" + sGXsfl_41_idx ;
            cmbavSdtreoperadoss__tiporeoperado.setName( GXCCtl );
            cmbavSdtreoperadoss__tiporeoperado.setWebtags( "" );
            if ( cmbavSdtreoperadoss__tiporeoperado.getItemCount() > 0 )
            {
               if ( ( AV39GXV1 > 0 ) && ( AV22SDTReoperadoss.size() >= AV39GXV1 ) && (GXutil.strcmp("", ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Tiporeoperado())==0) )
               {
                  ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).setgxTv_SdtSDTReoperados_Tiporeoperado( cmbavSdtreoperadoss__tiporeoperado.getValidValue(((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Tiporeoperado()) );
               }
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavSdtreoperadoss__tiporeoperado,cmbavSdtreoperadoss__tiporeoperado.getInternalname(),GXutil.rtrim( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Tiporeoperado()),Integer.valueOf(1),cmbavSdtreoperadoss__tiporeoperado.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbavSdtreoperadoss__tiporeoperado.getVisible()),Integer.valueOf(cmbavSdtreoperadoss__tiporeoperado.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavSdtreoperadoss__tiporeoperado.setValue( GXutil.rtrim( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Tiporeoperado()) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavSdtreoperadoss__tiporeoperado.getInternalname(), "Values", cmbavSdtreoperadoss__tiporeoperado.ToJavascriptSource(), !bGXsfl_41_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdtreoperadoss__hisreofec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__hisreofec_Internalname,localUtil.format(((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisreofec(), "99/99/99"),localUtil.format( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisreofec(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__hisreofec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__hisreofec_Visible),Integer.valueOf(edtavSdtreoperadoss__hisreofec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdtreoperadoss__hishorreo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__hishorreo_Internalname,GXutil.rtrim( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hishorreo()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__hishorreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__hishorreo_Visible),Integer.valueOf(edtavSdtreoperadoss__hishorreo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdtreoperadoss__hisreohdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__hisreohdr_Internalname,GXutil.rtrim( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisreohdr()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__hisreohdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__hisreohdr_Visible),Integer.valueOf(edtavSdtreoperadoss__hisreohdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdtreoperadoss__hisreolote_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__hisreolote_Internalname,GXutil.rtrim( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisreolote()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__hisreolote_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__hisreolote_Visible),Integer.valueOf(edtavSdtreoperadoss__hisreolote_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdtreoperadoss__tipdefcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__tipdefcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Tipdefcod(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtreoperadoss__tipdefcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Tipdefcod()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Tipdefcod()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__tipdefcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__tipdefcod_Visible),Integer.valueOf(edtavSdtreoperadoss__tipdefcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdtreoperadoss__tipdefdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__tipdefdsc_Internalname,GXutil.rtrim( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Tipdefdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__tipdefdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__tipdefdsc_Visible),Integer.valueOf(edtavSdtreoperadoss__tipdefdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdtreoperadoss__codcausa_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__codcausa_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Codcausa(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtreoperadoss__codcausa_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Codcausa()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Codcausa()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__codcausa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__codcausa_Visible),Integer.valueOf(edtavSdtreoperadoss__codcausa_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdtreoperadoss__dsccausa_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__dsccausa_Internalname,GXutil.rtrim( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Dsccausa()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__dsccausa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__dsccausa_Visible),Integer.valueOf(edtavSdtreoperadoss__dsccausa_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdtreoperadoss__rps_cod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__rps_cod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Rps_cod(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtreoperadoss__rps_cod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Rps_cod()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Rps_cod()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__rps_cod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__rps_cod_Visible),Integer.valueOf(edtavSdtreoperadoss__rps_cod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdtreoperadoss__rps_dsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__rps_dsc_Internalname,GXutil.rtrim( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Rps_dsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__rps_dsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__rps_dsc_Visible),Integer.valueOf(edtavSdtreoperadoss__rps_dsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdtreoperadoss__maqcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__maqcod_Internalname,GXutil.rtrim( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Maqcod()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__maqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__maqcod_Visible),Integer.valueOf(edtavSdtreoperadoss__maqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdtreoperadoss__maqdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__maqdsc_Internalname,GXutil.rtrim( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Maqdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__maqdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__maqdsc_Visible),Integer.valueOf(edtavSdtreoperadoss__maqdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdtreoperadoss__clicod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__clicod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Clicod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtreoperadoss__clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Clicod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Clicod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__clicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__clicod_Visible),Integer.valueOf(edtavSdtreoperadoss__clicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdtreoperadoss__clinom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__clinom_Internalname,GXutil.rtrim( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Clinom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__clinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__clinom_Visible),Integer.valueOf(edtavSdtreoperadoss__clinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdtreoperadoss__hisbarser_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__hisbarser_Internalname,GXutil.rtrim( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisbarser()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__hisbarser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__hisbarser_Visible),Integer.valueOf(edtavSdtreoperadoss__hisbarser_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdtreoperadoss__hisreodsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__hisreodsc_Internalname,GXutil.rtrim( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisreodsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__hisreodsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__hisreodsc_Visible),Integer.valueOf(edtavSdtreoperadoss__hisreodsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdtreoperadoss__histipart_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__histipart_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Histipart(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtreoperadoss__histipart_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Histipart()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Histipart()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__histipart_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__histipart_Visible),Integer.valueOf(edtavSdtreoperadoss__histipart_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdtreoperadoss__hiscolnom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__hiscolnom_Internalname,GXutil.rtrim( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hiscolnom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__hiscolnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__hiscolnom_Visible),Integer.valueOf(edtavSdtreoperadoss__hiscolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdtreoperadoss__hiscolnum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__hiscolnum_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hiscolnum(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtreoperadoss__hiscolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hiscolnum()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hiscolnum()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__hiscolnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__hiscolnum_Visible),Integer.valueOf(edtavSdtreoperadoss__hiscolnum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdtreoperadoss__histipcol_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__histipcol_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Histipcol(), (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtreoperadoss__histipcol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Histipcol()), "Z9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Histipcol()), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__histipcol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__histipcol_Visible),Integer.valueOf(edtavSdtreoperadoss__histipcol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdtreoperadoss__hisnomcli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__hisnomcli_Internalname,GXutil.rtrim( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisnomcli()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__hisnomcli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__hisnomcli_Visible),Integer.valueOf(edtavSdtreoperadoss__hisnomcli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdtreoperadoss__hisnumcli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__hisnumcli_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisnumcli(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtreoperadoss__hisnumcli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisnumcli()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisnumcli()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__hisnumcli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__hisnumcli_Visible),Integer.valueOf(edtavSdtreoperadoss__hisnumcli_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdtreoperadoss__hisbarkgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__hisbarkgm_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisbarkgm(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtreoperadoss__hisbarkgm_Enabled!=0) ? localUtil.format( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisbarkgm(), "ZZZZZ9.99") : localUtil.format( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisbarkgm(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__hisbarkgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__hisbarkgm_Visible),Integer.valueOf(edtavSdtreoperadoss__hisbarkgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdtreoperadoss__hisbarmtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__hisbarmtr_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisbarmtr(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtreoperadoss__hisbarmtr_Enabled!=0) ? localUtil.format( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisbarmtr(), "ZZZZZ9.99") : localUtil.format( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisbarmtr(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__hisbarmtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__hisbarmtr_Visible),Integer.valueOf(edtavSdtreoperadoss__hisbarmtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdtreoperadoss__hisnumpie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__hisnumpie_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisnumpie(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtreoperadoss__hisnumpie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisnumpie()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisnumpie()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__hisnumpie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__hisnumpie_Visible),Integer.valueOf(edtavSdtreoperadoss__hisnumpie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdtreoperadoss__hisopetur_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__hisopetur_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisopetur(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtreoperadoss__hisopetur_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisopetur()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisopetur()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__hisopetur_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__hisopetur_Visible),Integer.valueOf(edtavSdtreoperadoss__hisopetur_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdtreoperadoss__hisopecod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__hisopecod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisopecod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtreoperadoss__hisopecod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisopecod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisopecod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__hisopecod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__hisopecod_Visible),Integer.valueOf(edtavSdtreoperadoss__hisopecod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdtreoperadoss__hisusu_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__hisusu_Internalname,GXutil.rtrim( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisusu()),GXutil.rtrim( localUtil.format( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisusu(), "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__hisusu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__hisusu_Visible),Integer.valueOf(edtavSdtreoperadoss__hisusu_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdtreoperadoss__hisadeobs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__hisadeobs_Internalname,((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisadeobs(),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__hisadeobs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__hisadeobs_Visible),Integer.valueOf(edtavSdtreoperadoss__hisadeobs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavSdtreoperadoss__hisadesn.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "SDTREOPERADOSS__HISADESN_" + sGXsfl_41_idx ;
         chkavSdtreoperadoss__hisadesn.setName( GXCCtl );
         chkavSdtreoperadoss__hisadesn.setWebtags( "" );
         chkavSdtreoperadoss__hisadesn.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSdtreoperadoss__hisadesn.getInternalname(), "TitleCaption", chkavSdtreoperadoss__hisadesn.getCaption(), !bGXsfl_41_Refreshing);
         chkavSdtreoperadoss__hisadesn.setCheckedValue( "N" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSdtreoperadoss__hisadesn.getInternalname(),((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisadesn(),"","",Integer.valueOf(chkavSdtreoperadoss__hisadesn.getVisible()),Integer.valueOf(chkavSdtreoperadoss__hisadesn.getEnabled()),"S","",StyleString,ClassString,"WWColumn","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdtreoperadoss__hisaccot_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__hisaccot_Internalname,((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisaccot(),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__hisaccot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__hisaccot_Visible),Integer.valueOf(edtavSdtreoperadoss__hisaccot_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdtreoperadoss__hisacco_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__hisacco_Internalname,((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisacco(),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__hisacco_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__hisacco_Visible),Integer.valueOf(edtavSdtreoperadoss__hisacco_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3276),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdtreoperadoss__hisadeacct_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__hisadeacct_Internalname,((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisadeacct(),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__hisadeacct_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__hisadeacct_Visible),Integer.valueOf(edtavSdtreoperadoss__hisadeacct_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdtreoperadoss__hisadeacco_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__hisadeacco_Internalname,((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisadeacco(),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__hisadeacco_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__hisadeacco_Visible),Integer.valueOf(edtavSdtreoperadoss__hisadeacco_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdtreoperadoss__hisreotn_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtreoperadoss__hisreotn_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisreotn(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtreoperadoss__hisreotn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisreotn()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Hisreotn()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtreoperadoss__hisreotn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdtreoperadoss__hisreotn_Visible),Integer.valueOf(edtavSdtreoperadoss__hisreotn_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesE22( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_41_idx = ((subGrid_Islastpage==1)&&(nGXsfl_41_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_41_idx+1) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
      }
      /* End function sendrow_412 */
   }

   public void startgridcontrol41( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"41\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbavSdtreoperadoss__tiporeoperado.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__hisreofec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__hishorreo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hora", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__hisreohdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__hisreolote_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__tipdefcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Defecto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__tipdefdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__codcausa_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__dsccausa_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Causa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__rps_cod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__rps_dsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( " Responsabilidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__maqcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__maqdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__clicod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__clinom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__hisbarser_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__hisreodsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__histipart_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__hiscolnom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__hiscolnum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__histipcol_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tc", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__hisnomcli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__hisnumcli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__hisbarkgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__hisbarmtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__hisnumpie_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__hisopetur_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Turno", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__hisopecod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Operario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__hisusu_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Usuario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__hisadeobs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Observaciones", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavSdtreoperadoss__hisadesn.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Resultado eficaz?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__hisaccot_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Acciones Correctivas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__hisacco_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Correccion a efectuar, Accion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__hisadeacct_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Acciones correctivas,Analisis", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__hisadeacco_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Acciones de correccion,Analisi", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdtreoperadoss__hisreotn_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Interno", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
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
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbavSdtreoperadoss__tiporeoperado.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbavSdtreoperadoss__tiporeoperado.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisreofec_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisreofec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hishorreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hishorreo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisreohdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisreohdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisreolote_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisreolote_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__tipdefcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__tipdefcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__tipdefdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__tipdefdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__codcausa_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__codcausa_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__dsccausa_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__dsccausa_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__rps_cod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__rps_cod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__rps_dsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__rps_dsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__maqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__maqcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__maqdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__maqdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__clicod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__clinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__clinom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisbarser_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisbarser_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisreodsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisreodsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__histipart_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__histipart_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hiscolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hiscolnom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hiscolnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hiscolnum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__histipcol_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__histipcol_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisnomcli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisnomcli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisnumcli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisnumcli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisbarkgm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisbarkgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisbarmtr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisbarmtr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisnumpie_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisnumpie_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisopetur_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisopetur_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisopecod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisopecod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisusu_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisusu_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisadeobs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisadeobs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkavSdtreoperadoss__hisadesn.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavSdtreoperadoss__hisadesn.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisaccot_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisaccot_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisacco_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisacco_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisadeacct_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisadeacct_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisadeacco_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisadeacco_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisreotn_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdtreoperadoss__hisreotn_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      cmbavSdtreoperadoss__tiporeoperado.setInternalname( sPrefix+"SDTREOPERADOSS__TIPOREOPERADO" );
      edtavSdtreoperadoss__hisreofec_Internalname = sPrefix+"SDTREOPERADOSS__HISREOFEC" ;
      edtavSdtreoperadoss__hishorreo_Internalname = sPrefix+"SDTREOPERADOSS__HISHORREO" ;
      edtavSdtreoperadoss__hisreohdr_Internalname = sPrefix+"SDTREOPERADOSS__HISREOHDR" ;
      edtavSdtreoperadoss__hisreolote_Internalname = sPrefix+"SDTREOPERADOSS__HISREOLOTE" ;
      edtavSdtreoperadoss__tipdefcod_Internalname = sPrefix+"SDTREOPERADOSS__TIPDEFCOD" ;
      edtavSdtreoperadoss__tipdefdsc_Internalname = sPrefix+"SDTREOPERADOSS__TIPDEFDSC" ;
      edtavSdtreoperadoss__codcausa_Internalname = sPrefix+"SDTREOPERADOSS__CODCAUSA" ;
      edtavSdtreoperadoss__dsccausa_Internalname = sPrefix+"SDTREOPERADOSS__DSCCAUSA" ;
      edtavSdtreoperadoss__rps_cod_Internalname = sPrefix+"SDTREOPERADOSS__RPS_COD" ;
      edtavSdtreoperadoss__rps_dsc_Internalname = sPrefix+"SDTREOPERADOSS__RPS_DSC" ;
      edtavSdtreoperadoss__maqcod_Internalname = sPrefix+"SDTREOPERADOSS__MAQCOD" ;
      edtavSdtreoperadoss__maqdsc_Internalname = sPrefix+"SDTREOPERADOSS__MAQDSC" ;
      edtavSdtreoperadoss__clicod_Internalname = sPrefix+"SDTREOPERADOSS__CLICOD" ;
      edtavSdtreoperadoss__clinom_Internalname = sPrefix+"SDTREOPERADOSS__CLINOM" ;
      edtavSdtreoperadoss__hisbarser_Internalname = sPrefix+"SDTREOPERADOSS__HISBARSER" ;
      edtavSdtreoperadoss__hisreodsc_Internalname = sPrefix+"SDTREOPERADOSS__HISREODSC" ;
      edtavSdtreoperadoss__histipart_Internalname = sPrefix+"SDTREOPERADOSS__HISTIPART" ;
      edtavSdtreoperadoss__hiscolnom_Internalname = sPrefix+"SDTREOPERADOSS__HISCOLNOM" ;
      edtavSdtreoperadoss__hiscolnum_Internalname = sPrefix+"SDTREOPERADOSS__HISCOLNUM" ;
      edtavSdtreoperadoss__histipcol_Internalname = sPrefix+"SDTREOPERADOSS__HISTIPCOL" ;
      edtavSdtreoperadoss__hisnomcli_Internalname = sPrefix+"SDTREOPERADOSS__HISNOMCLI" ;
      edtavSdtreoperadoss__hisnumcli_Internalname = sPrefix+"SDTREOPERADOSS__HISNUMCLI" ;
      edtavSdtreoperadoss__hisbarkgm_Internalname = sPrefix+"SDTREOPERADOSS__HISBARKGM" ;
      edtavSdtreoperadoss__hisbarmtr_Internalname = sPrefix+"SDTREOPERADOSS__HISBARMTR" ;
      edtavSdtreoperadoss__hisnumpie_Internalname = sPrefix+"SDTREOPERADOSS__HISNUMPIE" ;
      edtavSdtreoperadoss__hisopetur_Internalname = sPrefix+"SDTREOPERADOSS__HISOPETUR" ;
      edtavSdtreoperadoss__hisopecod_Internalname = sPrefix+"SDTREOPERADOSS__HISOPECOD" ;
      edtavSdtreoperadoss__hisusu_Internalname = sPrefix+"SDTREOPERADOSS__HISUSU" ;
      edtavSdtreoperadoss__hisadeobs_Internalname = sPrefix+"SDTREOPERADOSS__HISADEOBS" ;
      chkavSdtreoperadoss__hisadesn.setInternalname( sPrefix+"SDTREOPERADOSS__HISADESN" );
      edtavSdtreoperadoss__hisaccot_Internalname = sPrefix+"SDTREOPERADOSS__HISACCOT" ;
      edtavSdtreoperadoss__hisacco_Internalname = sPrefix+"SDTREOPERADOSS__HISACCO" ;
      edtavSdtreoperadoss__hisadeacct_Internalname = sPrefix+"SDTREOPERADOSS__HISADEACCT" ;
      edtavSdtreoperadoss__hisadeacco_Internalname = sPrefix+"SDTREOPERADOSS__HISADEACCO" ;
      edtavSdtreoperadoss__hisreotn_Internalname = sPrefix+"SDTREOPERADOSS__HISREOTN" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
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
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtavSdtreoperadoss__hisreotn_Jsonclick = "" ;
      edtavSdtreoperadoss__hisreotn_Enabled = 0 ;
      edtavSdtreoperadoss__hisreotn_Visible = -1 ;
      edtavSdtreoperadoss__hisadeacco_Jsonclick = "" ;
      edtavSdtreoperadoss__hisadeacco_Enabled = 0 ;
      edtavSdtreoperadoss__hisadeacco_Visible = -1 ;
      edtavSdtreoperadoss__hisadeacct_Jsonclick = "" ;
      edtavSdtreoperadoss__hisadeacct_Enabled = 0 ;
      edtavSdtreoperadoss__hisadeacct_Visible = -1 ;
      edtavSdtreoperadoss__hisacco_Jsonclick = "" ;
      edtavSdtreoperadoss__hisacco_Enabled = 0 ;
      edtavSdtreoperadoss__hisacco_Visible = -1 ;
      edtavSdtreoperadoss__hisaccot_Jsonclick = "" ;
      edtavSdtreoperadoss__hisaccot_Enabled = 0 ;
      edtavSdtreoperadoss__hisaccot_Visible = -1 ;
      chkavSdtreoperadoss__hisadesn.setCaption( "" );
      chkavSdtreoperadoss__hisadesn.setEnabled( 0 );
      chkavSdtreoperadoss__hisadesn.setVisible( -1 );
      edtavSdtreoperadoss__hisadeobs_Jsonclick = "" ;
      edtavSdtreoperadoss__hisadeobs_Enabled = 0 ;
      edtavSdtreoperadoss__hisadeobs_Visible = -1 ;
      edtavSdtreoperadoss__hisusu_Jsonclick = "" ;
      edtavSdtreoperadoss__hisusu_Enabled = 0 ;
      edtavSdtreoperadoss__hisusu_Visible = -1 ;
      edtavSdtreoperadoss__hisopecod_Jsonclick = "" ;
      edtavSdtreoperadoss__hisopecod_Enabled = 0 ;
      edtavSdtreoperadoss__hisopecod_Visible = -1 ;
      edtavSdtreoperadoss__hisopetur_Jsonclick = "" ;
      edtavSdtreoperadoss__hisopetur_Enabled = 0 ;
      edtavSdtreoperadoss__hisopetur_Visible = -1 ;
      edtavSdtreoperadoss__hisnumpie_Jsonclick = "" ;
      edtavSdtreoperadoss__hisnumpie_Enabled = 0 ;
      edtavSdtreoperadoss__hisnumpie_Visible = -1 ;
      edtavSdtreoperadoss__hisbarmtr_Jsonclick = "" ;
      edtavSdtreoperadoss__hisbarmtr_Enabled = 0 ;
      edtavSdtreoperadoss__hisbarmtr_Visible = -1 ;
      edtavSdtreoperadoss__hisbarkgm_Jsonclick = "" ;
      edtavSdtreoperadoss__hisbarkgm_Enabled = 0 ;
      edtavSdtreoperadoss__hisbarkgm_Visible = -1 ;
      edtavSdtreoperadoss__hisnumcli_Jsonclick = "" ;
      edtavSdtreoperadoss__hisnumcli_Enabled = 0 ;
      edtavSdtreoperadoss__hisnumcli_Visible = -1 ;
      edtavSdtreoperadoss__hisnomcli_Jsonclick = "" ;
      edtavSdtreoperadoss__hisnomcli_Enabled = 0 ;
      edtavSdtreoperadoss__hisnomcli_Visible = -1 ;
      edtavSdtreoperadoss__histipcol_Jsonclick = "" ;
      edtavSdtreoperadoss__histipcol_Enabled = 0 ;
      edtavSdtreoperadoss__histipcol_Visible = -1 ;
      edtavSdtreoperadoss__hiscolnum_Jsonclick = "" ;
      edtavSdtreoperadoss__hiscolnum_Enabled = 0 ;
      edtavSdtreoperadoss__hiscolnum_Visible = -1 ;
      edtavSdtreoperadoss__hiscolnom_Jsonclick = "" ;
      edtavSdtreoperadoss__hiscolnom_Enabled = 0 ;
      edtavSdtreoperadoss__hiscolnom_Visible = -1 ;
      edtavSdtreoperadoss__histipart_Jsonclick = "" ;
      edtavSdtreoperadoss__histipart_Enabled = 0 ;
      edtavSdtreoperadoss__histipart_Visible = -1 ;
      edtavSdtreoperadoss__hisreodsc_Jsonclick = "" ;
      edtavSdtreoperadoss__hisreodsc_Enabled = 0 ;
      edtavSdtreoperadoss__hisreodsc_Visible = -1 ;
      edtavSdtreoperadoss__hisbarser_Jsonclick = "" ;
      edtavSdtreoperadoss__hisbarser_Enabled = 0 ;
      edtavSdtreoperadoss__hisbarser_Visible = -1 ;
      edtavSdtreoperadoss__clinom_Jsonclick = "" ;
      edtavSdtreoperadoss__clinom_Enabled = 0 ;
      edtavSdtreoperadoss__clinom_Visible = -1 ;
      edtavSdtreoperadoss__clicod_Jsonclick = "" ;
      edtavSdtreoperadoss__clicod_Enabled = 0 ;
      edtavSdtreoperadoss__clicod_Visible = -1 ;
      edtavSdtreoperadoss__maqdsc_Jsonclick = "" ;
      edtavSdtreoperadoss__maqdsc_Enabled = 0 ;
      edtavSdtreoperadoss__maqdsc_Visible = -1 ;
      edtavSdtreoperadoss__maqcod_Jsonclick = "" ;
      edtavSdtreoperadoss__maqcod_Enabled = 0 ;
      edtavSdtreoperadoss__maqcod_Visible = -1 ;
      edtavSdtreoperadoss__rps_dsc_Jsonclick = "" ;
      edtavSdtreoperadoss__rps_dsc_Enabled = 0 ;
      edtavSdtreoperadoss__rps_dsc_Visible = -1 ;
      edtavSdtreoperadoss__rps_cod_Jsonclick = "" ;
      edtavSdtreoperadoss__rps_cod_Enabled = 0 ;
      edtavSdtreoperadoss__rps_cod_Visible = -1 ;
      edtavSdtreoperadoss__dsccausa_Jsonclick = "" ;
      edtavSdtreoperadoss__dsccausa_Enabled = 0 ;
      edtavSdtreoperadoss__dsccausa_Visible = -1 ;
      edtavSdtreoperadoss__codcausa_Jsonclick = "" ;
      edtavSdtreoperadoss__codcausa_Enabled = 0 ;
      edtavSdtreoperadoss__codcausa_Visible = -1 ;
      edtavSdtreoperadoss__tipdefdsc_Jsonclick = "" ;
      edtavSdtreoperadoss__tipdefdsc_Enabled = 0 ;
      edtavSdtreoperadoss__tipdefdsc_Visible = -1 ;
      edtavSdtreoperadoss__tipdefcod_Jsonclick = "" ;
      edtavSdtreoperadoss__tipdefcod_Enabled = 0 ;
      edtavSdtreoperadoss__tipdefcod_Visible = -1 ;
      edtavSdtreoperadoss__hisreolote_Jsonclick = "" ;
      edtavSdtreoperadoss__hisreolote_Enabled = 0 ;
      edtavSdtreoperadoss__hisreolote_Visible = -1 ;
      edtavSdtreoperadoss__hisreohdr_Jsonclick = "" ;
      edtavSdtreoperadoss__hisreohdr_Enabled = 0 ;
      edtavSdtreoperadoss__hisreohdr_Visible = -1 ;
      edtavSdtreoperadoss__hishorreo_Jsonclick = "" ;
      edtavSdtreoperadoss__hishorreo_Enabled = 0 ;
      edtavSdtreoperadoss__hishorreo_Visible = -1 ;
      edtavSdtreoperadoss__hisreofec_Jsonclick = "" ;
      edtavSdtreoperadoss__hisreofec_Enabled = 0 ;
      edtavSdtreoperadoss__hisreofec_Visible = -1 ;
      cmbavSdtreoperadoss__tiporeoperado.setJsonclick( "" );
      cmbavSdtreoperadoss__tiporeoperado.setEnabled( 0 );
      cmbavSdtreoperadoss__tiporeoperado.setVisible( -1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavSdtreoperadoss__hisreotn_Visible = -1 ;
      edtavSdtreoperadoss__hisadeacco_Visible = -1 ;
      edtavSdtreoperadoss__hisadeacct_Visible = -1 ;
      edtavSdtreoperadoss__hisacco_Visible = -1 ;
      edtavSdtreoperadoss__hisaccot_Visible = -1 ;
      chkavSdtreoperadoss__hisadesn.setVisible( -1 );
      edtavSdtreoperadoss__hisadeobs_Visible = -1 ;
      edtavSdtreoperadoss__hisusu_Visible = -1 ;
      edtavSdtreoperadoss__hisopecod_Visible = -1 ;
      edtavSdtreoperadoss__hisopetur_Visible = -1 ;
      edtavSdtreoperadoss__hisnumpie_Visible = -1 ;
      edtavSdtreoperadoss__hisbarmtr_Visible = -1 ;
      edtavSdtreoperadoss__hisbarkgm_Visible = -1 ;
      edtavSdtreoperadoss__hisnumcli_Visible = -1 ;
      edtavSdtreoperadoss__hisnomcli_Visible = -1 ;
      edtavSdtreoperadoss__histipcol_Visible = -1 ;
      edtavSdtreoperadoss__hiscolnum_Visible = -1 ;
      edtavSdtreoperadoss__hiscolnom_Visible = -1 ;
      edtavSdtreoperadoss__histipart_Visible = -1 ;
      edtavSdtreoperadoss__hisreodsc_Visible = -1 ;
      edtavSdtreoperadoss__hisbarser_Visible = -1 ;
      edtavSdtreoperadoss__clinom_Visible = -1 ;
      edtavSdtreoperadoss__clicod_Visible = -1 ;
      edtavSdtreoperadoss__maqdsc_Visible = -1 ;
      edtavSdtreoperadoss__maqcod_Visible = -1 ;
      edtavSdtreoperadoss__rps_dsc_Visible = -1 ;
      edtavSdtreoperadoss__rps_cod_Visible = -1 ;
      edtavSdtreoperadoss__dsccausa_Visible = -1 ;
      edtavSdtreoperadoss__codcausa_Visible = -1 ;
      edtavSdtreoperadoss__tipdefdsc_Visible = -1 ;
      edtavSdtreoperadoss__tipdefcod_Visible = -1 ;
      edtavSdtreoperadoss__hisreolote_Visible = -1 ;
      edtavSdtreoperadoss__hisreohdr_Visible = -1 ;
      edtavSdtreoperadoss__hishorreo_Visible = -1 ;
      edtavSdtreoperadoss__hisreofec_Visible = -1 ;
      cmbavSdtreoperadoss__tiporeoperado.setVisible( -1 );
      subGrid_Sortable = (byte)(0) ;
      edtavSdtreoperadoss__hisreotn_Enabled = -1 ;
      edtavSdtreoperadoss__hisadeacco_Enabled = -1 ;
      edtavSdtreoperadoss__hisadeacct_Enabled = -1 ;
      edtavSdtreoperadoss__hisacco_Enabled = -1 ;
      edtavSdtreoperadoss__hisaccot_Enabled = -1 ;
      chkavSdtreoperadoss__hisadesn.setEnabled( -1 );
      edtavSdtreoperadoss__hisadeobs_Enabled = -1 ;
      edtavSdtreoperadoss__hisusu_Enabled = -1 ;
      edtavSdtreoperadoss__hisopecod_Enabled = -1 ;
      edtavSdtreoperadoss__hisopetur_Enabled = -1 ;
      edtavSdtreoperadoss__hisnumpie_Enabled = -1 ;
      edtavSdtreoperadoss__hisbarmtr_Enabled = -1 ;
      edtavSdtreoperadoss__hisbarkgm_Enabled = -1 ;
      edtavSdtreoperadoss__hisnumcli_Enabled = -1 ;
      edtavSdtreoperadoss__hisnomcli_Enabled = -1 ;
      edtavSdtreoperadoss__histipcol_Enabled = -1 ;
      edtavSdtreoperadoss__hiscolnum_Enabled = -1 ;
      edtavSdtreoperadoss__hiscolnom_Enabled = -1 ;
      edtavSdtreoperadoss__histipart_Enabled = -1 ;
      edtavSdtreoperadoss__hisreodsc_Enabled = -1 ;
      edtavSdtreoperadoss__hisbarser_Enabled = -1 ;
      edtavSdtreoperadoss__clinom_Enabled = -1 ;
      edtavSdtreoperadoss__clicod_Enabled = -1 ;
      edtavSdtreoperadoss__maqdsc_Enabled = -1 ;
      edtavSdtreoperadoss__maqcod_Enabled = -1 ;
      edtavSdtreoperadoss__rps_dsc_Enabled = -1 ;
      edtavSdtreoperadoss__rps_cod_Enabled = -1 ;
      edtavSdtreoperadoss__dsccausa_Enabled = -1 ;
      edtavSdtreoperadoss__codcausa_Enabled = -1 ;
      edtavSdtreoperadoss__tipdefdsc_Enabled = -1 ;
      edtavSdtreoperadoss__tipdefcod_Enabled = -1 ;
      edtavSdtreoperadoss__hisreolote_Enabled = -1 ;
      edtavSdtreoperadoss__hisreohdr_Enabled = -1 ;
      edtavSdtreoperadoss__hishorreo_Enabled = -1 ;
      edtavSdtreoperadoss__hisreofec_Enabled = -1 ;
      cmbavSdtreoperadoss__tiporeoperado.setEnabled( -1 );
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "|||||||||||||||||||||||||||||||||||" ;
      Ddo_grid_Columnids = "0:SDTReoperadoss__TipoReoperado|1:SDTReoperadoss__HisReoFec|2:SDTReoperadoss__HisHorReo|3:SDTReoperadoss__HisReoHDR|4:SDTReoperadoss__HisreoLote|5:SDTReoperadoss__Tipdefcod|6:SDTReoperadoss__TipDefDsc|7:SDTReoperadoss__CodCausa|8:SDTReoperadoss__DscCausa|9:SDTReoperadoss__Rps_Cod|10:SDTReoperadoss__Rps_Dsc|11:SDTReoperadoss__MaqCod|12:SDTReoperadoss__MaqDsc|13:SDTReoperadoss__CliCod|14:SDTReoperadoss__CliNom|15:SDTReoperadoss__HisBarSer|16:SDTReoperadoss__HisReoDsc|17:SDTReoperadoss__HisTipArt|18:SDTReoperadoss__HisColNom|19:SDTReoperadoss__HisColNum|20:SDTReoperadoss__HisTipCol|21:SDTReoperadoss__HisNomCli|22:SDTReoperadoss__HisNumCli|23:SDTReoperadoss__HisBarKgm|24:SDTReoperadoss__HisBarMtr|25:SDTReoperadoss__HisNumPie|26:SDTReoperadoss__HisOpeTur|27:SDTReoperadoss__HisOpecod|28:SDTReoperadoss__HisUsu|29:SDTReoperadoss__HisAdeObs|30:SDTReoperadoss__HisAdeSN|31:SDTReoperadoss__HisAcCot|32:SDTReoperadoss__HisAcCo|33:SDTReoperadoss__HisAdEAcCt|34:SDTReoperadoss__HisAdEAcCo|35:SDTReoperadoss__HisReoTn" ;
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
      GXCCtl = "SDTREOPERADOSS__TIPOREOPERADO_" + sGXsfl_41_idx ;
      cmbavSdtreoperadoss__tiporeoperado.setName( GXCCtl );
      cmbavSdtreoperadoss__tiporeoperado.setWebtags( "" );
      if ( cmbavSdtreoperadoss__tiporeoperado.getItemCount() > 0 )
      {
         if ( ( AV39GXV1 > 0 ) && ( AV22SDTReoperadoss.size() >= AV39GXV1 ) && (GXutil.strcmp("", ((app.SdtSDTReoperados)AV22SDTReoperadoss.elementAt(-1+AV39GXV1)).getgxTv_SdtSDTReoperados_Tiporeoperado())==0) )
         {
         }
      }
      GXCCtl = "SDTREOPERADOSS__HISADESN_" + sGXsfl_41_idx ;
      chkavSdtreoperadoss__hisadesn.setName( GXCCtl );
      chkavSdtreoperadoss__hisadesn.setWebtags( "" );
      chkavSdtreoperadoss__hisadesn.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSdtreoperadoss__hisadesn.getInternalname(), "TitleCaption", chkavSdtreoperadoss__hisadesn.getCaption(), !bGXsfl_41_Refreshing);
      chkavSdtreoperadoss__hisadesn.setCheckedValue( "N" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV22SDTReoperadoss',fld:'vSDTREOPERADOSS',grid:41,pic:''},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'sPrefix'},{av:'AV34Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV32FechaIni',fld:'vFECHAINI',pic:''},{av:'AV31FechaFin',fld:'vFECHAFIN',pic:''},{av:'AV30ClicodIni',fld:'vCLICODINI',pic:'ZZZZZ9'},{av:'AV29ClicodFin',fld:'vCLICODFIN',pic:'ZZZZZ9'},{av:'AV33HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV19ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV79Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV35FilterFullText',fld:'vFILTERFULLTEXT',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV22SDTReoperadoss',fld:'vSDTREOPERADOSS',grid:41,pic:''},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'AV19ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'SDTREOPERADOSS__TIPOREOPERADO',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISREOFEC',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISHORREO',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISREOHDR',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISREOLOTE',prop:'Visible'},{ctrl:'SDTREOPERADOSS__TIPDEFCOD',prop:'Visible'},{ctrl:'SDTREOPERADOSS__TIPDEFDSC',prop:'Visible'},{ctrl:'SDTREOPERADOSS__CODCAUSA',prop:'Visible'},{ctrl:'SDTREOPERADOSS__DSCCAUSA',prop:'Visible'},{ctrl:'SDTREOPERADOSS__RPS_COD',prop:'Visible'},{ctrl:'SDTREOPERADOSS__RPS_DSC',prop:'Visible'},{ctrl:'SDTREOPERADOSS__MAQCOD',prop:'Visible'},{ctrl:'SDTREOPERADOSS__MAQDSC',prop:'Visible'},{ctrl:'SDTREOPERADOSS__CLICOD',prop:'Visible'},{ctrl:'SDTREOPERADOSS__CLINOM',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISBARSER',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISREODSC',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISTIPART',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISCOLNOM',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISCOLNUM',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISTIPCOL',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISNOMCLI',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISNUMCLI',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISBARKGM',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISBARMTR',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISNUMPIE',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISOPETUR',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISOPECOD',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISUSU',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISADEOBS',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISADESN',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISACCOT',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISACCO',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISADEACCT',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISADEACCO',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISREOTN',prop:'Visible'},{av:'AV12GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV13GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV18ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12E22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV22SDTReoperadoss',fld:'vSDTREOPERADOSS',grid:41,pic:''},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV32FechaIni',fld:'vFECHAINI',pic:''},{av:'AV31FechaFin',fld:'vFECHAFIN',pic:''},{av:'AV30ClicodIni',fld:'vCLICODINI',pic:'ZZZZZ9'},{av:'AV29ClicodFin',fld:'vCLICODFIN',pic:'ZZZZZ9'},{av:'AV33HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV19ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV79Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV35FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13E22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV22SDTReoperadoss',fld:'vSDTREOPERADOSS',grid:41,pic:''},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV32FechaIni',fld:'vFECHAINI',pic:''},{av:'AV31FechaFin',fld:'vFECHAFIN',pic:''},{av:'AV30ClicodIni',fld:'vCLICODINI',pic:'ZZZZZ9'},{av:'AV29ClicodFin',fld:'vCLICODFIN',pic:'ZZZZZ9'},{av:'AV33HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV19ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV79Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV35FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e19E22',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e14E22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV22SDTReoperadoss',fld:'vSDTREOPERADOSS',grid:41,pic:''},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV32FechaIni',fld:'vFECHAINI',pic:''},{av:'AV31FechaFin',fld:'vFECHAFIN',pic:''},{av:'AV30ClicodIni',fld:'vCLICODINI',pic:'ZZZZZ9'},{av:'AV29ClicodFin',fld:'vCLICODFIN',pic:'ZZZZZ9'},{av:'AV33HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV19ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV79Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV35FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV22SDTReoperadoss',fld:'vSDTREOPERADOSS',grid:41,pic:''},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'AV19ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{ctrl:'SDTREOPERADOSS__TIPOREOPERADO',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISREOFEC',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISHORREO',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISREOHDR',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISREOLOTE',prop:'Visible'},{ctrl:'SDTREOPERADOSS__TIPDEFCOD',prop:'Visible'},{ctrl:'SDTREOPERADOSS__TIPDEFDSC',prop:'Visible'},{ctrl:'SDTREOPERADOSS__CODCAUSA',prop:'Visible'},{ctrl:'SDTREOPERADOSS__DSCCAUSA',prop:'Visible'},{ctrl:'SDTREOPERADOSS__RPS_COD',prop:'Visible'},{ctrl:'SDTREOPERADOSS__RPS_DSC',prop:'Visible'},{ctrl:'SDTREOPERADOSS__MAQCOD',prop:'Visible'},{ctrl:'SDTREOPERADOSS__MAQDSC',prop:'Visible'},{ctrl:'SDTREOPERADOSS__CLICOD',prop:'Visible'},{ctrl:'SDTREOPERADOSS__CLINOM',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISBARSER',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISREODSC',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISTIPART',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISCOLNOM',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISCOLNUM',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISTIPCOL',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISNOMCLI',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISNUMCLI',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISBARKGM',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISBARMTR',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISNUMPIE',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISOPETUR',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISOPECOD',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISUSU',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISADEOBS',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISADESN',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISACCOT',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISACCO',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISADEACCT',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISADEACCO',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISREOTN',prop:'Visible'},{av:'AV12GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV13GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV18ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11E22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV22SDTReoperadoss',fld:'vSDTREOPERADOSS',grid:41,pic:''},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV32FechaIni',fld:'vFECHAINI',pic:''},{av:'AV31FechaFin',fld:'vFECHAFIN',pic:''},{av:'AV30ClicodIni',fld:'vCLICODINI',pic:'ZZZZZ9'},{av:'AV29ClicodFin',fld:'vCLICODFIN',pic:'ZZZZZ9'},{av:'AV33HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV19ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV79Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV35FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV19ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV35FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV22SDTReoperadoss',fld:'vSDTREOPERADOSS',grid:41,pic:''},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'SDTREOPERADOSS__TIPOREOPERADO',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISREOFEC',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISHORREO',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISREOHDR',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISREOLOTE',prop:'Visible'},{ctrl:'SDTREOPERADOSS__TIPDEFCOD',prop:'Visible'},{ctrl:'SDTREOPERADOSS__TIPDEFDSC',prop:'Visible'},{ctrl:'SDTREOPERADOSS__CODCAUSA',prop:'Visible'},{ctrl:'SDTREOPERADOSS__DSCCAUSA',prop:'Visible'},{ctrl:'SDTREOPERADOSS__RPS_COD',prop:'Visible'},{ctrl:'SDTREOPERADOSS__RPS_DSC',prop:'Visible'},{ctrl:'SDTREOPERADOSS__MAQCOD',prop:'Visible'},{ctrl:'SDTREOPERADOSS__MAQDSC',prop:'Visible'},{ctrl:'SDTREOPERADOSS__CLICOD',prop:'Visible'},{ctrl:'SDTREOPERADOSS__CLINOM',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISBARSER',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISREODSC',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISTIPART',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISCOLNOM',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISCOLNUM',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISTIPCOL',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISNOMCLI',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISNUMCLI',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISBARKGM',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISBARMTR',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISNUMPIE',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISOPETUR',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISOPECOD',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISUSU',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISADEOBS',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISADESN',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISACCOT',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISACCO',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISADEACCT',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISADEACCO',prop:'Visible'},{ctrl:'SDTREOPERADOSS__HISREOTN',prop:'Visible'},{av:'AV12GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV13GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV18ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e15E22',iparms:[{av:'AV79Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV22SDTReoperadoss',fld:'vSDTREOPERADOSS',grid:41,pic:''},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'AV34Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV32FechaIni',fld:'vFECHAINI',pic:''},{av:'AV31FechaFin',fld:'vFECHAFIN',pic:''},{av:'AV30ClicodIni',fld:'vCLICODINI',pic:'ZZZZZ9'},{av:'AV29ClicodFin',fld:'vCLICODFIN',pic:'ZZZZZ9'},{av:'AV33HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV19ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV79Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV35FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'sPrefix'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e16E22',iparms:[{av:'AV79Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV22SDTReoperadoss',fld:'vSDTREOPERADOSS',grid:41,pic:''},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'AV34Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV32FechaIni',fld:'vFECHAINI',pic:''},{av:'AV31FechaFin',fld:'vFECHAFIN',pic:''},{av:'AV30ClicodIni',fld:'vCLICODINI',pic:'ZZZZZ9'},{av:'AV29ClicodFin',fld:'vCLICODFIN',pic:'ZZZZZ9'},{av:'AV33HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV19ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV79Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV35FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'sPrefix'}]}");
      setEventMetadata("VALIDV_GXV32","{handler:'validv_Gxv32',iparms:[]");
      setEventMetadata("VALIDV_GXV32",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv37',iparms:[]");
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
      wcpOAV34Emprcod = "" ;
      wcpOAV32FechaIni = GXutil.nullDate() ;
      wcpOAV31FechaFin = GXutil.nullDate() ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV34Emprcod = "" ;
      AV32FechaIni = GXutil.nullDate() ;
      AV31FechaFin = GXutil.nullDate() ;
      AV5ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV79Pgmname = "" ;
      AV35FilterFullText = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV22SDTReoperadoss = new GXBaseCollection<app.SdtSDTReoperados>(app.SdtSDTReoperados.class, "SDTReoperados", "TexplusNET", remoteHandle);
      AV18ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV8DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV14GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV76Station = "" ;
      GXv_char2 = new String[1] ;
      AV77Emprnom = "" ;
      AV78Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXt_objcol_SdtSDTReoperados7 = new GXBaseCollection<app.SdtSDTReoperados>(app.SdtSDTReoperados.class, "SDTReoperados", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTReoperados8 = new GXBaseCollection[1] ;
      AV28WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV23Session = httpContext.getWebSession();
      AV7ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV20ManageFiltersXml = "" ;
      AV11ExcelFilename = "" ;
      AV10ErrorMessage = "" ;
      GXv_char3 = new String[1] ;
      AV27UserCustomValue = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV6ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = new GXBaseCollection[1] ;
      AV15GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState14 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV34Emprcod = "" ;
      sCtrlAV32FechaIni = "" ;
      sCtrlAV31FechaFin = "" ;
      sCtrlAV30ClicodIni = "" ;
      sCtrlAV29ClicodFin = "" ;
      sCtrlAV33HisEstReo = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV79Pgmname = "WCReoperadosDetalleList" ;
      /* GeneXus formulas. */
      AV79Pgmname = "WCReoperadosDetalleList" ;
      Gx_err = (short)(0) ;
      cmbavSdtreoperadoss__tiporeoperado.setEnabled( 0 );
      edtavSdtreoperadoss__hisreofec_Enabled = 0 ;
      edtavSdtreoperadoss__hishorreo_Enabled = 0 ;
      edtavSdtreoperadoss__hisreohdr_Enabled = 0 ;
      edtavSdtreoperadoss__hisreolote_Enabled = 0 ;
      edtavSdtreoperadoss__tipdefcod_Enabled = 0 ;
      edtavSdtreoperadoss__tipdefdsc_Enabled = 0 ;
      edtavSdtreoperadoss__codcausa_Enabled = 0 ;
      edtavSdtreoperadoss__dsccausa_Enabled = 0 ;
      edtavSdtreoperadoss__rps_cod_Enabled = 0 ;
      edtavSdtreoperadoss__rps_dsc_Enabled = 0 ;
      edtavSdtreoperadoss__maqcod_Enabled = 0 ;
      edtavSdtreoperadoss__maqdsc_Enabled = 0 ;
      edtavSdtreoperadoss__clicod_Enabled = 0 ;
      edtavSdtreoperadoss__clinom_Enabled = 0 ;
      edtavSdtreoperadoss__hisbarser_Enabled = 0 ;
      edtavSdtreoperadoss__hisreodsc_Enabled = 0 ;
      edtavSdtreoperadoss__histipart_Enabled = 0 ;
      edtavSdtreoperadoss__hiscolnom_Enabled = 0 ;
      edtavSdtreoperadoss__hiscolnum_Enabled = 0 ;
      edtavSdtreoperadoss__histipcol_Enabled = 0 ;
      edtavSdtreoperadoss__hisnomcli_Enabled = 0 ;
      edtavSdtreoperadoss__hisnumcli_Enabled = 0 ;
      edtavSdtreoperadoss__hisbarkgm_Enabled = 0 ;
      edtavSdtreoperadoss__hisbarmtr_Enabled = 0 ;
      edtavSdtreoperadoss__hisnumpie_Enabled = 0 ;
      edtavSdtreoperadoss__hisopetur_Enabled = 0 ;
      edtavSdtreoperadoss__hisopecod_Enabled = 0 ;
      edtavSdtreoperadoss__hisusu_Enabled = 0 ;
      edtavSdtreoperadoss__hisadeobs_Enabled = 0 ;
      chkavSdtreoperadoss__hisadesn.setEnabled( 0 );
      edtavSdtreoperadoss__hisaccot_Enabled = 0 ;
      edtavSdtreoperadoss__hisacco_Enabled = 0 ;
      edtavSdtreoperadoss__hisadeacct_Enabled = 0 ;
      edtavSdtreoperadoss__hisadeacco_Enabled = 0 ;
      edtavSdtreoperadoss__hisreotn_Enabled = 0 ;
   }

   private byte wcpOAV33HisEstReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV33HisEstReo ;
   private byte AV19ManageFiltersExecutionStep ;
   private byte nDraw ;
   private byte nDoneStart ;
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
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV30ClicodIni ;
   private int wcpOAV29ClicodFin ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_41 ;
   private int AV30ClicodIni ;
   private int AV29ClicodFin ;
   private int nGXsfl_41_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV39GXV1 ;
   private int subGrid_Islastpage ;
   private int edtavSdtreoperadoss__hisreofec_Enabled ;
   private int edtavSdtreoperadoss__hishorreo_Enabled ;
   private int edtavSdtreoperadoss__hisreohdr_Enabled ;
   private int edtavSdtreoperadoss__hisreolote_Enabled ;
   private int edtavSdtreoperadoss__tipdefcod_Enabled ;
   private int edtavSdtreoperadoss__tipdefdsc_Enabled ;
   private int edtavSdtreoperadoss__codcausa_Enabled ;
   private int edtavSdtreoperadoss__dsccausa_Enabled ;
   private int edtavSdtreoperadoss__rps_cod_Enabled ;
   private int edtavSdtreoperadoss__rps_dsc_Enabled ;
   private int edtavSdtreoperadoss__maqcod_Enabled ;
   private int edtavSdtreoperadoss__maqdsc_Enabled ;
   private int edtavSdtreoperadoss__clicod_Enabled ;
   private int edtavSdtreoperadoss__clinom_Enabled ;
   private int edtavSdtreoperadoss__hisbarser_Enabled ;
   private int edtavSdtreoperadoss__hisreodsc_Enabled ;
   private int edtavSdtreoperadoss__histipart_Enabled ;
   private int edtavSdtreoperadoss__hiscolnom_Enabled ;
   private int edtavSdtreoperadoss__hiscolnum_Enabled ;
   private int edtavSdtreoperadoss__histipcol_Enabled ;
   private int edtavSdtreoperadoss__hisnomcli_Enabled ;
   private int edtavSdtreoperadoss__hisnumcli_Enabled ;
   private int edtavSdtreoperadoss__hisbarkgm_Enabled ;
   private int edtavSdtreoperadoss__hisbarmtr_Enabled ;
   private int edtavSdtreoperadoss__hisnumpie_Enabled ;
   private int edtavSdtreoperadoss__hisopetur_Enabled ;
   private int edtavSdtreoperadoss__hisopecod_Enabled ;
   private int edtavSdtreoperadoss__hisusu_Enabled ;
   private int edtavSdtreoperadoss__hisadeobs_Enabled ;
   private int edtavSdtreoperadoss__hisaccot_Enabled ;
   private int edtavSdtreoperadoss__hisacco_Enabled ;
   private int edtavSdtreoperadoss__hisadeacct_Enabled ;
   private int edtavSdtreoperadoss__hisadeacco_Enabled ;
   private int edtavSdtreoperadoss__hisreotn_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_41_fel_idx=1 ;
   private int edtavSdtreoperadoss__hisreofec_Visible ;
   private int edtavSdtreoperadoss__hishorreo_Visible ;
   private int edtavSdtreoperadoss__hisreohdr_Visible ;
   private int edtavSdtreoperadoss__hisreolote_Visible ;
   private int edtavSdtreoperadoss__tipdefcod_Visible ;
   private int edtavSdtreoperadoss__tipdefdsc_Visible ;
   private int edtavSdtreoperadoss__codcausa_Visible ;
   private int edtavSdtreoperadoss__dsccausa_Visible ;
   private int edtavSdtreoperadoss__rps_cod_Visible ;
   private int edtavSdtreoperadoss__rps_dsc_Visible ;
   private int edtavSdtreoperadoss__maqcod_Visible ;
   private int edtavSdtreoperadoss__maqdsc_Visible ;
   private int edtavSdtreoperadoss__clicod_Visible ;
   private int edtavSdtreoperadoss__clinom_Visible ;
   private int edtavSdtreoperadoss__hisbarser_Visible ;
   private int edtavSdtreoperadoss__hisreodsc_Visible ;
   private int edtavSdtreoperadoss__histipart_Visible ;
   private int edtavSdtreoperadoss__hiscolnom_Visible ;
   private int edtavSdtreoperadoss__hiscolnum_Visible ;
   private int edtavSdtreoperadoss__histipcol_Visible ;
   private int edtavSdtreoperadoss__hisnomcli_Visible ;
   private int edtavSdtreoperadoss__hisnumcli_Visible ;
   private int edtavSdtreoperadoss__hisbarkgm_Visible ;
   private int edtavSdtreoperadoss__hisbarmtr_Visible ;
   private int edtavSdtreoperadoss__hisnumpie_Visible ;
   private int edtavSdtreoperadoss__hisopetur_Visible ;
   private int edtavSdtreoperadoss__hisopecod_Visible ;
   private int edtavSdtreoperadoss__hisusu_Visible ;
   private int edtavSdtreoperadoss__hisadeobs_Visible ;
   private int edtavSdtreoperadoss__hisaccot_Visible ;
   private int edtavSdtreoperadoss__hisacco_Visible ;
   private int edtavSdtreoperadoss__hisadeacct_Visible ;
   private int edtavSdtreoperadoss__hisadeacco_Visible ;
   private int edtavSdtreoperadoss__hisreotn_Visible ;
   private int AV21PageToGo ;
   private int nGXsfl_41_bak_idx=1 ;
   private int AV80GXV38 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV12GridCurrentPage ;
   private long AV13GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV34Emprcod ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV34Emprcod ;
   private String sGXsfl_41_idx="0001" ;
   private String AV79Pgmname ;
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
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Fixable ;
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
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
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
   private String edtavSdtreoperadoss__hisreofec_Internalname ;
   private String edtavSdtreoperadoss__hishorreo_Internalname ;
   private String edtavSdtreoperadoss__hisreohdr_Internalname ;
   private String edtavSdtreoperadoss__hisreolote_Internalname ;
   private String edtavSdtreoperadoss__tipdefcod_Internalname ;
   private String edtavSdtreoperadoss__tipdefdsc_Internalname ;
   private String edtavSdtreoperadoss__codcausa_Internalname ;
   private String edtavSdtreoperadoss__dsccausa_Internalname ;
   private String edtavSdtreoperadoss__rps_cod_Internalname ;
   private String edtavSdtreoperadoss__rps_dsc_Internalname ;
   private String edtavSdtreoperadoss__maqcod_Internalname ;
   private String edtavSdtreoperadoss__maqdsc_Internalname ;
   private String edtavSdtreoperadoss__clicod_Internalname ;
   private String edtavSdtreoperadoss__clinom_Internalname ;
   private String edtavSdtreoperadoss__hisbarser_Internalname ;
   private String edtavSdtreoperadoss__hisreodsc_Internalname ;
   private String edtavSdtreoperadoss__histipart_Internalname ;
   private String edtavSdtreoperadoss__hiscolnom_Internalname ;
   private String edtavSdtreoperadoss__hiscolnum_Internalname ;
   private String edtavSdtreoperadoss__histipcol_Internalname ;
   private String edtavSdtreoperadoss__hisnomcli_Internalname ;
   private String edtavSdtreoperadoss__hisnumcli_Internalname ;
   private String edtavSdtreoperadoss__hisbarkgm_Internalname ;
   private String edtavSdtreoperadoss__hisbarmtr_Internalname ;
   private String edtavSdtreoperadoss__hisnumpie_Internalname ;
   private String edtavSdtreoperadoss__hisopetur_Internalname ;
   private String edtavSdtreoperadoss__hisopecod_Internalname ;
   private String edtavSdtreoperadoss__hisusu_Internalname ;
   private String edtavSdtreoperadoss__hisadeobs_Internalname ;
   private String edtavSdtreoperadoss__hisaccot_Internalname ;
   private String edtavSdtreoperadoss__hisacco_Internalname ;
   private String edtavSdtreoperadoss__hisadeacct_Internalname ;
   private String edtavSdtreoperadoss__hisadeacco_Internalname ;
   private String edtavSdtreoperadoss__hisreotn_Internalname ;
   private String sGXsfl_41_fel_idx="0001" ;
   private String AV76Station ;
   private String GXv_char2[] ;
   private String AV77Emprnom ;
   private String AV78Usurcod ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV34Emprcod ;
   private String sCtrlAV32FechaIni ;
   private String sCtrlAV31FechaFin ;
   private String sCtrlAV30ClicodIni ;
   private String sCtrlAV29ClicodFin ;
   private String sCtrlAV33HisEstReo ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavSdtreoperadoss__hisreofec_Jsonclick ;
   private String edtavSdtreoperadoss__hishorreo_Jsonclick ;
   private String edtavSdtreoperadoss__hisreohdr_Jsonclick ;
   private String edtavSdtreoperadoss__hisreolote_Jsonclick ;
   private String edtavSdtreoperadoss__tipdefcod_Jsonclick ;
   private String edtavSdtreoperadoss__tipdefdsc_Jsonclick ;
   private String edtavSdtreoperadoss__codcausa_Jsonclick ;
   private String edtavSdtreoperadoss__dsccausa_Jsonclick ;
   private String edtavSdtreoperadoss__rps_cod_Jsonclick ;
   private String edtavSdtreoperadoss__rps_dsc_Jsonclick ;
   private String edtavSdtreoperadoss__maqcod_Jsonclick ;
   private String edtavSdtreoperadoss__maqdsc_Jsonclick ;
   private String edtavSdtreoperadoss__clicod_Jsonclick ;
   private String edtavSdtreoperadoss__clinom_Jsonclick ;
   private String edtavSdtreoperadoss__hisbarser_Jsonclick ;
   private String edtavSdtreoperadoss__hisreodsc_Jsonclick ;
   private String edtavSdtreoperadoss__histipart_Jsonclick ;
   private String edtavSdtreoperadoss__hiscolnom_Jsonclick ;
   private String edtavSdtreoperadoss__hiscolnum_Jsonclick ;
   private String edtavSdtreoperadoss__histipcol_Jsonclick ;
   private String edtavSdtreoperadoss__hisnomcli_Jsonclick ;
   private String edtavSdtreoperadoss__hisnumcli_Jsonclick ;
   private String edtavSdtreoperadoss__hisbarkgm_Jsonclick ;
   private String edtavSdtreoperadoss__hisbarmtr_Jsonclick ;
   private String edtavSdtreoperadoss__hisnumpie_Jsonclick ;
   private String edtavSdtreoperadoss__hisopetur_Jsonclick ;
   private String edtavSdtreoperadoss__hisopecod_Jsonclick ;
   private String edtavSdtreoperadoss__hisusu_Jsonclick ;
   private String edtavSdtreoperadoss__hisadeobs_Jsonclick ;
   private String edtavSdtreoperadoss__hisaccot_Jsonclick ;
   private String edtavSdtreoperadoss__hisacco_Jsonclick ;
   private String edtavSdtreoperadoss__hisadeacct_Jsonclick ;
   private String edtavSdtreoperadoss__hisadeacco_Jsonclick ;
   private String edtavSdtreoperadoss__hisreotn_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV32FechaIni ;
   private java.util.Date wcpOAV31FechaFin ;
   private java.util.Date AV32FechaIni ;
   private java.util.Date AV31FechaFin ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
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
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_41_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean gx_BV41 ;
   private String AV7ColumnsSelectorXML ;
   private String AV20ManageFiltersXml ;
   private String AV27UserCustomValue ;
   private String AV35FilterFullText ;
   private String AV11ExcelFilename ;
   private String AV10ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV23Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavSdtreoperadoss__tiporeoperado ;
   private ICheckbox chkavSdtreoperadoss__hisadesn ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV18ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[] ;
   private GXBaseCollection<app.SdtSDTReoperados> AV22SDTReoperadoss ;
   private GXBaseCollection<app.SdtSDTReoperados> GXt_objcol_SdtSDTReoperados7 ;
   private GXBaseCollection<app.SdtSDTReoperados> GXv_objcol_SdtSDTReoperados8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV5ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV6ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV8DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV14GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState14[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV15GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV28WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

