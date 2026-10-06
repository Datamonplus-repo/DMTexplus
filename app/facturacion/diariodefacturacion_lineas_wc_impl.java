package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class diariodefacturacion_lineas_wc_impl extends GXWebComponent
{
   public diariodefacturacion_lineas_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public diariodefacturacion_lineas_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( diariodefacturacion_lineas_wc_impl.class ));
   }

   public diariodefacturacion_lineas_wc_impl( int remoteHandle ,
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
               AV31Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31Emprcod", AV31Emprcod);
               AV32Clicodfrom = (int)(GXutil.lval( httpContext.GetPar( "Clicodfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Clicodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Clicodfrom), 6, 0));
               AV33Clicodto = (int)(GXutil.lval( httpContext.GetPar( "Clicodto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Clicodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Clicodto), 6, 0));
               AV34Facfchfrom = localUtil.parseDateParm( httpContext.GetPar( "Facfchfrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Facfchfrom", localUtil.format(AV34Facfchfrom, "99/99/99"));
               AV35Facfchto = localUtil.parseDateParm( httpContext.GetPar( "Facfchto")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Facfchto", localUtil.format(AV35Facfchto, "99/99/99"));
               AV36FacPri = httpContext.GetPar( "FacPri") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36FacPri", AV36FacPri);
               AV37FacSernum = httpContext.GetPar( "FacSernum") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37FacSernum", AV37FacSernum);
               AV38noserie = (byte)(GXutil.lval( httpContext.GetPar( "noserie"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38noserie", GXutil.str( AV38noserie, 1, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV31Emprcod,Integer.valueOf(AV32Clicodfrom),Integer.valueOf(AV33Clicodto),AV34Facfchfrom,AV35Facfchto,AV36FacPri,AV37FacSernum,Byte.valueOf(AV38noserie)});
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
      AV23ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV18ColumnsSelector);
      AV62Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV31Emprcod = httpContext.GetPar( "Emprcod") ;
      AV32Clicodfrom = (int)(GXutil.lval( httpContext.GetPar( "Clicodfrom"))) ;
      AV33Clicodto = (int)(GXutil.lval( httpContext.GetPar( "Clicodto"))) ;
      AV34Facfchfrom = localUtil.parseDateParm( httpContext.GetPar( "Facfchfrom")) ;
      AV35Facfchto = localUtil.parseDateParm( httpContext.GetPar( "Facfchto")) ;
      AV36FacPri = httpContext.GetPar( "FacPri") ;
      AV37FacSernum = httpContext.GetPar( "FacSernum") ;
      AV38noserie = (byte)(GXutil.lval( httpContext.GetPar( "noserie"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV13DiariodeFacturacion_lineas_SDT);
      AV29Tot_FacImp = CommonUtil.decimalVal( httpContext.GetPar( "Tot_FacImp"), ".") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV62Pgmname, AV12FilterFullText, AV31Emprcod, AV32Clicodfrom, AV33Clicodto, AV34Facfchfrom, AV35Facfchto, AV36FacPri, AV37FacSernum, AV38noserie, AV13DiariodeFacturacion_lineas_SDT, AV29Tot_FacImp, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa24V2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Diario de Facturacion (lineas)", "")) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.diariodefacturacion_lineas_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV31Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV32Clicodfrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV33Clicodto,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV34Facfchfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV35Facfchto)),GXutil.URLEncode(GXutil.rtrim(AV36FacPri)),GXutil.URLEncode(GXutil.rtrim(AV37FacSernum)),GXutil.URLEncode(GXutil.ltrimstr(AV38noserie,1,0))}, new String[] {"Emprcod","Clicodfrom","Clicodto","Facfchfrom","Facfchto","FacPri","FacSernum","noserie"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDIARIODEFACTURACION_LINEAS_SDT", getSecureSignedToken( sPrefix, AV13DiariodeFacturacion_lineas_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMP", getSecureSignedToken( sPrefix, localUtil.format( AV29Tot_FacImp, "ZZZZZZZZZZ9.99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"DiariodeFacturacion_lineas_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV62Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\diariodefacturacion_lineas_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Diariodefacturacion_lineas_sdt", AV13DiariodeFacturacion_lineas_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Diariodefacturacion_lineas_sdt", AV13DiariodeFacturacion_lineas_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_Diariodefacturacion_lineas_sdt", getSecureSignedToken( sPrefix, AV13DiariodeFacturacion_lineas_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_41", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_41, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV21ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV21ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV26GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV27GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV24DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV24DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV18ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV18ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV31Emprcod", GXutil.rtrim( wcpOAV31Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV32Clicodfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV32Clicodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV33Clicodto", GXutil.ltrim( localUtil.ntoc( wcpOAV33Clicodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV34Facfchfrom", localUtil.dtoc( wcpOAV34Facfchfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV35Facfchto", localUtil.dtoc( wcpOAV35Facfchto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV36FacPri", GXutil.rtrim( wcpOAV36FacPri));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV37FacSernum", GXutil.rtrim( wcpOAV37FacSernum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV38noserie", GXutil.ltrim( localUtil.ntoc( wcpOAV38noserie, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV23ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV31Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODFROM", GXutil.ltrim( localUtil.ntoc( AV32Clicodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODTO", GXutil.ltrim( localUtil.ntoc( AV33Clicodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFACFCHFROM", localUtil.dtoc( AV34Facfchfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFACFCHTO", localUtil.dtoc( AV35Facfchto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFACPRI", GXutil.rtrim( AV36FacPri));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFACSERNUM", GXutil.rtrim( AV37FacSernum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNOSERIE", GXutil.ltrim( localUtil.ntoc( AV38noserie, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDIARIODEFACTURACION_LINEAS_SDT", AV13DiariodeFacturacion_lineas_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDIARIODEFACTURACION_LINEAS_SDT", AV13DiariodeFacturacion_lineas_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDIARIODEFACTURACION_LINEAS_SDT", getSecureSignedToken( sPrefix, AV13DiariodeFacturacion_lineas_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FACIMP", GXutil.ltrim( localUtil.ntoc( AV29Tot_FacImp, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMP", getSecureSignedToken( sPrefix, localUtil.format( AV29Tot_FacImp, "ZZZZZZZZZZ9.99")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
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

   public void renderHtmlCloseForm24V2( )
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
      return "Facturacion.DiariodeFacturacion_lineas_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Diario de Facturacion (lineas)", "") ;
   }

   public void wb24V0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.facturacion.diariodefacturacion_lineas_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\DiariodeFacturacion_lineas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\DiariodeFacturacion_lineas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\DiariodeFacturacion_lineas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_24V2( true) ;
      }
      else
      {
         wb_table1_23_24V2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_24V2e( boolean wbgen )
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
            AV46GXV1 = nGXsfl_41_idx ;
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
         wb_table2_59_24V2( true) ;
      }
      else
      {
         wb_table2_59_24V2( false) ;
      }
      return  ;
   }

   public void wb_table2_59_24V2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         ucGridpaginationbar.setProperty("CurrentPage", AV26GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV27GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV62Pgmname), GXutil.rtrim( localUtil.format( AV62Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\DiariodeFacturacion_lineas_WC.htm");
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
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV24DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV24DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV18ColumnsSelector);
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
               AV46GXV1 = nGXsfl_41_idx ;
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

   public void start24V2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Diario de Facturacion (lineas)", ""), (short)(0)) ;
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
            strup24V0( ) ;
         }
      }
   }

   public void ws24V2( )
   {
      start24V2( ) ;
      evt24V2( ) ;
   }

   public void evt24V2( )
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
                              strup24V0( ) ;
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
                              strup24V0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1124V2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup24V0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1224V2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup24V0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1324V2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup24V0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1424V2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup24V0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e1524V2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup24V0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e1624V2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup24V0( ) ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "'DOEXPORTREPORT'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup24V0( ) ;
                           }
                           nGXsfl_41_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_412( ) ;
                           AV46GXV1 = (int)(nGXsfl_41_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV13DiariodeFacturacion_lineas_SDT.size() >= AV46GXV1 ) && ( AV46GXV1 > 0 ) )
                           {
                              AV13DiariodeFacturacion_lineas_SDT.currentItem( ((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)) );
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
                                       e1724V2 ();
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
                                       e1824V2 ();
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
                                       e1924V2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: 'DoExportReport' */
                                       e2024V2 ();
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
                                    strup24V0( ) ;
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

   public void we24V2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm24V2( ) ;
         }
      }
   }

   public void pa24V2( )
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
                                 byte AV23ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ,
                                 String AV62Pgmname ,
                                 String AV12FilterFullText ,
                                 String AV31Emprcod ,
                                 int AV32Clicodfrom ,
                                 int AV33Clicodto ,
                                 java.util.Date AV34Facfchfrom ,
                                 java.util.Date AV35Facfchto ,
                                 String AV36FacPri ,
                                 String AV37FacSernum ,
                                 byte AV38noserie ,
                                 GXBaseCollection<app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item> AV13DiariodeFacturacion_lineas_SDT ,
                                 java.math.BigDecimal AV29Tot_FacImp ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1824V2 ();
      GRID_nCurrentRecord = 0 ;
      rf24V2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"DiariodeFacturacion_lineas_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV62Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\diariodefacturacion_lineas_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf24V2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV62Pgmname = "Facturacion.DiariodeFacturacion_lineas_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Pgmname", AV62Pgmname);
      Gx_err = (short)(0) ;
      edtavDiariodefacturacion_lineas_sdt__facfch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__facfch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__facfch_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__faccod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__faccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__faccod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__clicod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__clinom_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__facalbcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__facalbcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__facalbcod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__albprofch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__albprofch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__albprofch_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__barnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__barnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__barnhdr_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__facser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__facser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__facser_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__color_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__color_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__color_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__fackgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__fackgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__fackgs_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__facprekgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__facprekgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__facprekgs_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__facmts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__facmts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__facmts_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__facpremts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__facpremts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__facpremts_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__baralbpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__baralbpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__baralbpie_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__facimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__facimp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__facimp_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavTotvalue_facimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_facimp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_facimp_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf24V2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(41) ;
      /* Execute user event: Refresh */
      e1824V2 ();
      nGXsfl_41_idx = 1 ;
      sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_412( ) ;
      bGXsfl_41_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
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
         e1924V2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_41_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e1924V2 ();
         }
         wbEnd = (short)(41) ;
         wb24V0( ) ;
      }
      bGXsfl_41_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes24V2( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDIARIODEFACTURACION_LINEAS_SDT", AV13DiariodeFacturacion_lineas_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDIARIODEFACTURACION_LINEAS_SDT", AV13DiariodeFacturacion_lineas_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDIARIODEFACTURACION_LINEAS_SDT", getSecureSignedToken( sPrefix, AV13DiariodeFacturacion_lineas_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FACIMP", GXutil.ltrim( localUtil.ntoc( AV29Tot_FacImp, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMP", getSecureSignedToken( sPrefix, localUtil.format( AV29Tot_FacImp, "ZZZZZZZZZZ9.99")));
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
      return AV13DiariodeFacturacion_lineas_SDT.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV62Pgmname, AV12FilterFullText, AV31Emprcod, AV32Clicodfrom, AV33Clicodto, AV34Facfchfrom, AV35Facfchto, AV36FacPri, AV37FacSernum, AV38noserie, AV13DiariodeFacturacion_lineas_SDT, AV29Tot_FacImp, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV62Pgmname, AV12FilterFullText, AV31Emprcod, AV32Clicodfrom, AV33Clicodto, AV34Facfchfrom, AV35Facfchto, AV36FacPri, AV37FacSernum, AV38noserie, AV13DiariodeFacturacion_lineas_SDT, AV29Tot_FacImp, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV62Pgmname, AV12FilterFullText, AV31Emprcod, AV32Clicodfrom, AV33Clicodto, AV34Facfchfrom, AV35Facfchto, AV36FacPri, AV37FacSernum, AV38noserie, AV13DiariodeFacturacion_lineas_SDT, AV29Tot_FacImp, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV62Pgmname, AV12FilterFullText, AV31Emprcod, AV32Clicodfrom, AV33Clicodto, AV34Facfchfrom, AV35Facfchto, AV36FacPri, AV37FacSernum, AV38noserie, AV13DiariodeFacturacion_lineas_SDT, AV29Tot_FacImp, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV62Pgmname, AV12FilterFullText, AV31Emprcod, AV32Clicodfrom, AV33Clicodto, AV34Facfchfrom, AV35Facfchto, AV36FacPri, AV37FacSernum, AV38noserie, AV13DiariodeFacturacion_lineas_SDT, AV29Tot_FacImp, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV62Pgmname = "Facturacion.DiariodeFacturacion_lineas_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Pgmname", AV62Pgmname);
      Gx_err = (short)(0) ;
      edtavDiariodefacturacion_lineas_sdt__facfch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__facfch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__facfch_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__faccod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__faccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__faccod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__clicod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__clinom_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__facalbcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__facalbcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__facalbcod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__albprofch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__albprofch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__albprofch_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__barnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__barnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__barnhdr_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__facser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__facser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__facser_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__color_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__color_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__color_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__fackgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__fackgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__fackgs_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__facprekgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__facprekgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__facprekgs_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__facmts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__facmts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__facmts_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__facpremts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__facpremts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__facpremts_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__baralbpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__baralbpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__baralbpie_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__facimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__facimp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__facimp_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavTotvalue_facimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_facimp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_facimp_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup24V0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1724V2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Diariodefacturacion_lineas_sdt"), AV13DiariodeFacturacion_lineas_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV21ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV24DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV18ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDIARIODEFACTURACION_LINEAS_SDT"), AV13DiariodeFacturacion_lineas_SDT);
         /* Read saved values. */
         nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV26GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV27GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV31Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV31Emprcod") ;
         wcpOAV32Clicodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV32Clicodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV33Clicodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV33Clicodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV34Facfchfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV34Facfchfrom"), 0) ;
         wcpOAV35Facfchto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV35Facfchto"), 0) ;
         wcpOAV36FacPri = httpContext.cgiGet( sPrefix+"wcpOAV36FacPri") ;
         wcpOAV37FacSernum = httpContext.cgiGet( sPrefix+"wcpOAV37FacSernum") ;
         wcpOAV38noserie = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV38noserie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            AV46GXV1 = (int)(nGXsfl_41_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV13DiariodeFacturacion_lineas_SDT.size() >= AV46GXV1 ) && ( AV46GXV1 > 0 ) )
            {
               AV13DiariodeFacturacion_lineas_SDT.currentItem( ((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)) );
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
         AV12FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
         AV30TotValue_FacImp = httpContext.cgiGet( edtavTotvalue_facimp_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TotValue_FacImp", AV30TotValue_FacImp);
         AV62Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Pgmname", AV62Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"DiariodeFacturacion_lineas_WC");
         AV62Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Pgmname", AV62Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV62Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("facturacion\\diariodefacturacion_lineas_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1724V2 ();
      if (returnInSub) return;
   }

   public void e1724V2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV39Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      diariodefacturacion_lineas_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV39Station = GXt_char1 ;
      GXv_char2[0] = AV31Emprcod ;
      GXv_char3[0] = AV40EmprNom ;
      GXv_char4[0] = AV41UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV39Station, GXv_char2, GXv_char3, GXv_char4) ;
      diariodefacturacion_lineas_wc_impl.this.AV31Emprcod = GXv_char2[0] ;
      diariodefacturacion_lineas_wc_impl.this.AV40EmprNom = GXv_char3[0] ;
      diariodefacturacion_lineas_wc_impl.this.AV41UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31Emprcod", AV31Emprcod);
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV24DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV24DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e1824V2( )
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
      if ( AV23ManageFiltersExecutionStep == 1 )
      {
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV23ManageFiltersExecutionStep == 2 )
      {
         AV23ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV20Session.getValue("Facturacion.DiariodeFacturacion_lineas_WCColumnsSelector"), "") != 0 )
      {
         AV16ColumnsSelectorXML = AV20Session.getValue("Facturacion.DiariodeFacturacion_lineas_WCColumnsSelector") ;
         AV18ColumnsSelector.fromxml(AV16ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S142 ();
         if (returnInSub) return;
      }
      edtavDiariodefacturacion_lineas_sdt__facfch_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__facfch_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__facfch_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__faccod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__faccod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__faccod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__clicod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__clicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__clicod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__clinom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__clinom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__clinom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__facalbcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__facalbcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__facalbcod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__albprofch_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__albprofch_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__albprofch_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__barnhdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__barnhdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__barnhdr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__facser_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__facser_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__facser_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__color_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__color_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__color_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__fackgs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__fackgs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__fackgs_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__facprekgs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__facprekgs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__facprekgs_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__facmts_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__facmts_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__facmts_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__facpremts_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__facpremts_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__facpremts_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__baralbpie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__baralbpie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__baralbpie_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavDiariodefacturacion_lineas_sdt__facimp_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_lineas_sdt__facimp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_lineas_sdt__facimp_Visible), 5, 0), !bGXsfl_41_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S162 ();
      if (returnInSub) return;
      AV26GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26GridCurrentPage), 10, 0));
      AV27GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13DiariodeFacturacion_lineas_SDT", AV13DiariodeFacturacion_lineas_SDT);
   }

   public void e1224V2( )
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
         AV25PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV25PageToGo) ;
      }
   }

   public void e1324V2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e1924V2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV46GXV1 = 1 ;
      while ( AV46GXV1 <= AV13DiariodeFacturacion_lineas_SDT.size() )
      {
         AV13DiariodeFacturacion_lineas_SDT.currentItem( ((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)) );
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
         AV46GXV1 = (int)(AV46GXV1+1) ;
      }
   }

   public void e1424V2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV16ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV18ColumnsSelector.fromJSonString(AV16ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "Facturacion.DiariodeFacturacion_lineas_WCColumnsSelector", ((GXutil.strcmp("", AV16ColumnsSelectorXML)==0) ? "" : AV18ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      if ( gx_BV41 )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13DiariodeFacturacion_lineas_SDT", AV13DiariodeFacturacion_lineas_SDT);
         nGXsfl_41_bak_idx = nGXsfl_41_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV62Pgmname, AV12FilterFullText, AV31Emprcod, AV32Clicodfrom, AV33Clicodto, AV34Facfchfrom, AV35Facfchto, AV36FacPri, AV37FacSernum, AV38noserie, AV13DiariodeFacturacion_lineas_SDT, AV29Tot_FacImp, sPrefix) ;
         nGXsfl_41_idx = nGXsfl_41_bak_idx ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
      }
   }

   public void e1124V2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S182 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S132 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("Facturacion.DiariodeFacturacion_lineas_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV62Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("Facturacion.DiariodeFacturacion_lineas_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV22ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "Facturacion.DiariodeFacturacion_lineas_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         diariodefacturacion_lineas_wc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV22ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV22ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S182 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV62Pgmname+"GridState", AV22ManageFiltersXml) ;
            AV10GridState.fromxml(AV22ManageFiltersXml, null, null);
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S192 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
      if ( gx_BV41 )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13DiariodeFacturacion_lineas_SDT", AV13DiariodeFacturacion_lineas_SDT);
         nGXsfl_41_bak_idx = nGXsfl_41_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV62Pgmname, AV12FilterFullText, AV31Emprcod, AV32Clicodfrom, AV33Clicodto, AV34Facfchfrom, AV35Facfchto, AV36FacPri, AV37FacSernum, AV38noserie, AV13DiariodeFacturacion_lineas_SDT, AV29Tot_FacImp, sPrefix) ;
         nGXsfl_41_idx = nGXsfl_41_bak_idx ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
      }
   }

   public void e1524V2( )
   {
      AV46GXV1 = (int)(nGXsfl_41_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV46GXV1 > 0 ) && ( AV13DiariodeFacturacion_lineas_SDT.size() >= AV46GXV1 ) )
      {
         AV13DiariodeFacturacion_lineas_SDT.currentItem( ((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)) );
      }
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV42DiariodeFacturacion_lineas_json = AV13DiariodeFacturacion_lineas_SDT.toJSonString(false) ;
      AV43Websession.setValue(httpContext.getMessage( "&DiariodeFacturacion_lineas_json", ""), AV42DiariodeFacturacion_lineas_json);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      GXv_char4[0] = AV14ExcelFilename ;
      GXv_char3[0] = AV15ErrorMessage ;
      new app.facturacion.diariodefacturacion_lineas_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      diariodefacturacion_lineas_wc_impl.this.AV14ExcelFilename = GXv_char4[0] ;
      diariodefacturacion_lineas_wc_impl.this.AV15ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV14ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV14ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV15ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e1624V2( )
   {
      AV46GXV1 = (int)(nGXsfl_41_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV46GXV1 > 0 ) && ( AV13DiariodeFacturacion_lineas_SDT.size() >= AV46GXV1 ) )
      {
         AV13DiariodeFacturacion_lineas_SDT.currentItem( ((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)) );
      }
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV42DiariodeFacturacion_lineas_json = AV13DiariodeFacturacion_lineas_SDT.toJSonString(false) ;
      AV43Websession.setValue(httpContext.getMessage( "&DiariodeFacturacion_lineas_json", ""), AV42DiariodeFacturacion_lineas_json);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.facturacion.diariodefacturacion_lineas_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void S162( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDiariodeFacturacion_lineas_SDT_Item8 = AV13DiariodeFacturacion_lineas_SDT ;
      GXv_objcol_SdtDiariodeFacturacion_lineas_SDT_Item9[0] = GXt_objcol_SdtDiariodeFacturacion_lineas_SDT_Item8 ;
      new app.facturacion.diariodefacturacion_lineas_dp(remoteHandle, context).execute( AV31Emprcod, AV32Clicodfrom, AV33Clicodto, AV34Facfchfrom, AV35Facfchto, AV36FacPri, AV37FacSernum, AV38noserie, GXv_objcol_SdtDiariodeFacturacion_lineas_SDT_Item9) ;
      GXt_objcol_SdtDiariodeFacturacion_lineas_SDT_Item8 = GXv_objcol_SdtDiariodeFacturacion_lineas_SDT_Item9[0] ;
      AV13DiariodeFacturacion_lineas_SDT = GXt_objcol_SdtDiariodeFacturacion_lineas_SDT_Item8 ;
      gx_BV41 = true ;
   }

   public void S142( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV18ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DiariodeFacturacion_lineas_SDT__Facfch", "", "Fecha", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DiariodeFacturacion_lineas_SDT__Faccod", "", "Nº Factura", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DiariodeFacturacion_lineas_SDT__Clicod", "", "Cliente", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DiariodeFacturacion_lineas_SDT__CliNom", "", "Nombre", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DiariodeFacturacion_lineas_SDT__Facalbcod", "", "Nº Documento", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DiariodeFacturacion_lineas_SDT__AlbProfch", "", "Fecha Documento", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DiariodeFacturacion_lineas_SDT__Barnhdr", "", "Nº Hdr", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DiariodeFacturacion_lineas_SDT__FacSer", "", "Articulo", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DiariodeFacturacion_lineas_SDT__Color", "", "Color", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DiariodeFacturacion_lineas_SDT__FacKgs", "", "Kilos", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DiariodeFacturacion_lineas_SDT__FacPreKgs", "", "Precio", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DiariodeFacturacion_lineas_SDT__FacMts", "", "Metros", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DiariodeFacturacion_lineas_SDT__FacPremts", "", "Precio", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DiariodeFacturacion_lineas_SDT__BarAlbPie", "", "Piezas", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DiariodeFacturacion_lineas_SDT__FacImp", "", "Imp. Linea", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char1 = AV17UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Facturacion.DiariodeFacturacion_lineas_WCColumnsSelector", GXv_char4) ;
      diariodefacturacion_lineas_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV17UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV17UserCustomValue)==0) ) )
      {
         AV19ColumnsSelectorAux.fromxml(AV17UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV19ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = AV21ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "Facturacion.DiariodeFacturacion_lineas_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] ;
      AV21ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   }

   public void S182( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV12FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue(AV62Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV62Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV20Session.getValue(AV62Pgmname+"GridState"), null, null);
      }
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S192 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S192( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV63GXV17 = 1 ;
      while ( AV63GXV17 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV63GXV17));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
         }
         AV63GXV17 = (int)(AV63GXV17+1) ;
      }
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV20Session.getValue(AV62Pgmname+"GridState"), null, null);
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV12FilterFullText)==0), (short)(0), AV12FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV62Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S152( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV29Tot_FacImp = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Tot_FacImp", GXutil.ltrimstr( AV29Tot_FacImp, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMP", getSecureSignedToken( sPrefix, localUtil.format( AV29Tot_FacImp, "ZZZZZZZZZZ9.99")));
   }

   public void S172( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV64GXV18 = 1 ;
      while ( AV64GXV18 <= AV13DiariodeFacturacion_lineas_SDT.size() )
      {
         AV28DiariodeFacturacion_lineas_SDTItem = (app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV64GXV18));
         AV29Tot_FacImp = AV29Tot_FacImp.add((AV28DiariodeFacturacion_lineas_SDTItem.getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facimp())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Tot_FacImp", GXutil.ltrimstr( AV29Tot_FacImp, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMP", getSecureSignedToken( sPrefix, localUtil.format( AV29Tot_FacImp, "ZZZZZZZZZZ9.99")));
         AV64GXV18 = (int)(AV64GXV18+1) ;
      }
      AV30TotValue_FacImp = localUtil.format( AV29Tot_FacImp, "ZZZZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TotValue_FacImp", AV30TotValue_FacImp);
   }

   public void e2024V2( )
   {
      AV46GXV1 = (int)(nGXsfl_41_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV46GXV1 > 0 ) && ( AV13DiariodeFacturacion_lineas_SDT.size() >= AV46GXV1 ) )
      {
         AV13DiariodeFacturacion_lineas_SDT.currentItem( ((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)) );
      }
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      AV42DiariodeFacturacion_lineas_json = AV13DiariodeFacturacion_lineas_SDT.toJSonString(false) ;
      AV43Websession.setValue(httpContext.getMessage( "&DiariodeFacturacion_lineas_json", ""), AV42DiariodeFacturacion_lineas_json);
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13DiariodeFacturacion_lineas_SDT", AV13DiariodeFacturacion_lineas_SDT);
      nGXsfl_41_bak_idx = nGXsfl_41_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV62Pgmname, AV12FilterFullText, AV31Emprcod, AV32Clicodfrom, AV33Clicodto, AV34Facfchfrom, AV35Facfchto, AV36FacPri, AV37FacSernum, AV38noserie, AV13DiariodeFacturacion_lineas_SDT, AV29Tot_FacImp, sPrefix) ;
      nGXsfl_41_idx = nGXsfl_41_bak_idx ;
      sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_412( ) ;
   }

   public void wb_table2_59_24V2( boolean wbgen )
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
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_facimp_Internalname, httpContext.getMessage( "Tot Value_Fac Imp", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_facimp_Internalname, AV30TotValue_FacImp, GXutil.rtrim( localUtil.format( AV30TotValue_FacImp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_facimp_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_facimp_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\DiariodeFacturacion_lineas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_59_24V2e( true) ;
      }
      else
      {
         wb_table2_59_24V2e( false) ;
      }
   }

   public void wb_table1_23_24V2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV21ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_28_24V2( true) ;
      }
      else
      {
         wb_table3_28_24V2( false) ;
      }
      return  ;
   }

   public void wb_table3_28_24V2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_24V2e( true) ;
      }
      else
      {
         wb_table1_23_24V2e( false) ;
      }
   }

   public void wb_table3_28_24V2( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV12FilterFullText, GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_Facturacion\\DiariodeFacturacion_lineas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_24V2e( true) ;
      }
      else
      {
         wb_table3_28_24V2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV31Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31Emprcod", AV31Emprcod);
      AV32Clicodfrom = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Clicodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Clicodfrom), 6, 0));
      AV33Clicodto = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Clicodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Clicodto), 6, 0));
      AV34Facfchfrom = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Facfchfrom", localUtil.format(AV34Facfchfrom, "99/99/99"));
      AV35Facfchto = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Facfchto", localUtil.format(AV35Facfchto, "99/99/99"));
      AV36FacPri = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36FacPri", AV36FacPri);
      AV37FacSernum = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37FacSernum", AV37FacSernum);
      AV38noserie = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38noserie", GXutil.str( AV38noserie, 1, 0));
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
      pa24V2( ) ;
      ws24V2( ) ;
      we24V2( ) ;
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
      sCtrlAV31Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV32Clicodfrom = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV33Clicodto = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV34Facfchfrom = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV35Facfchto = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV36FacPri = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV37FacSernum = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV38noserie = (String)getParm(obj,7,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa24V2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "facturacion\\diariodefacturacion_lineas_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa24V2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV31Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31Emprcod", AV31Emprcod);
         AV32Clicodfrom = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Clicodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Clicodfrom), 6, 0));
         AV33Clicodto = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Clicodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Clicodto), 6, 0));
         AV34Facfchfrom = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Facfchfrom", localUtil.format(AV34Facfchfrom, "99/99/99"));
         AV35Facfchto = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Facfchto", localUtil.format(AV35Facfchto, "99/99/99"));
         AV36FacPri = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36FacPri", AV36FacPri);
         AV37FacSernum = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37FacSernum", AV37FacSernum);
         AV38noserie = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38noserie", GXutil.str( AV38noserie, 1, 0));
      }
      wcpOAV31Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV31Emprcod") ;
      wcpOAV32Clicodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV32Clicodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV33Clicodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV33Clicodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV34Facfchfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV34Facfchfrom"), 0) ;
      wcpOAV35Facfchto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV35Facfchto"), 0) ;
      wcpOAV36FacPri = httpContext.cgiGet( sPrefix+"wcpOAV36FacPri") ;
      wcpOAV37FacSernum = httpContext.cgiGet( sPrefix+"wcpOAV37FacSernum") ;
      wcpOAV38noserie = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV38noserie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV31Emprcod, wcpOAV31Emprcod) != 0 ) || ( AV32Clicodfrom != wcpOAV32Clicodfrom ) || ( AV33Clicodto != wcpOAV33Clicodto ) || !( GXutil.dateCompare(GXutil.resetTime(AV34Facfchfrom), GXutil.resetTime(wcpOAV34Facfchfrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV35Facfchto), GXutil.resetTime(wcpOAV35Facfchto)) ) || ( GXutil.strcmp(AV36FacPri, wcpOAV36FacPri) != 0 ) || ( GXutil.strcmp(AV37FacSernum, wcpOAV37FacSernum) != 0 ) || ( AV38noserie != wcpOAV38noserie ) ) )
      {
         setjustcreated();
      }
      wcpOAV31Emprcod = AV31Emprcod ;
      wcpOAV32Clicodfrom = AV32Clicodfrom ;
      wcpOAV33Clicodto = AV33Clicodto ;
      wcpOAV34Facfchfrom = AV34Facfchfrom ;
      wcpOAV35Facfchto = AV35Facfchto ;
      wcpOAV36FacPri = AV36FacPri ;
      wcpOAV37FacSernum = AV37FacSernum ;
      wcpOAV38noserie = AV38noserie ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV31Emprcod = httpContext.cgiGet( sPrefix+"AV31Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV31Emprcod) > 0 )
      {
         AV31Emprcod = httpContext.cgiGet( sCtrlAV31Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31Emprcod", AV31Emprcod);
      }
      else
      {
         AV31Emprcod = httpContext.cgiGet( sPrefix+"AV31Emprcod_PARM") ;
      }
      sCtrlAV32Clicodfrom = httpContext.cgiGet( sPrefix+"AV32Clicodfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV32Clicodfrom) > 0 )
      {
         AV32Clicodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV32Clicodfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Clicodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Clicodfrom), 6, 0));
      }
      else
      {
         AV32Clicodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV32Clicodfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV33Clicodto = httpContext.cgiGet( sPrefix+"AV33Clicodto_CTRL") ;
      if ( GXutil.len( sCtrlAV33Clicodto) > 0 )
      {
         AV33Clicodto = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV33Clicodto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Clicodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Clicodto), 6, 0));
      }
      else
      {
         AV33Clicodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV33Clicodto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV34Facfchfrom = httpContext.cgiGet( sPrefix+"AV34Facfchfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV34Facfchfrom) > 0 )
      {
         AV34Facfchfrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV34Facfchfrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Facfchfrom", localUtil.format(AV34Facfchfrom, "99/99/99"));
      }
      else
      {
         AV34Facfchfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV34Facfchfrom_PARM"), 0) ;
      }
      sCtrlAV35Facfchto = httpContext.cgiGet( sPrefix+"AV35Facfchto_CTRL") ;
      if ( GXutil.len( sCtrlAV35Facfchto) > 0 )
      {
         AV35Facfchto = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV35Facfchto), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Facfchto", localUtil.format(AV35Facfchto, "99/99/99"));
      }
      else
      {
         AV35Facfchto = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV35Facfchto_PARM"), 0) ;
      }
      sCtrlAV36FacPri = httpContext.cgiGet( sPrefix+"AV36FacPri_CTRL") ;
      if ( GXutil.len( sCtrlAV36FacPri) > 0 )
      {
         AV36FacPri = httpContext.cgiGet( sCtrlAV36FacPri) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36FacPri", AV36FacPri);
      }
      else
      {
         AV36FacPri = httpContext.cgiGet( sPrefix+"AV36FacPri_PARM") ;
      }
      sCtrlAV37FacSernum = httpContext.cgiGet( sPrefix+"AV37FacSernum_CTRL") ;
      if ( GXutil.len( sCtrlAV37FacSernum) > 0 )
      {
         AV37FacSernum = httpContext.cgiGet( sCtrlAV37FacSernum) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37FacSernum", AV37FacSernum);
      }
      else
      {
         AV37FacSernum = httpContext.cgiGet( sPrefix+"AV37FacSernum_PARM") ;
      }
      sCtrlAV38noserie = httpContext.cgiGet( sPrefix+"AV38noserie_CTRL") ;
      if ( GXutil.len( sCtrlAV38noserie) > 0 )
      {
         AV38noserie = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV38noserie), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38noserie", GXutil.str( AV38noserie, 1, 0));
      }
      else
      {
         AV38noserie = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV38noserie_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa24V2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws24V2( ) ;
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
      ws24V2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31Emprcod_PARM", GXutil.rtrim( AV31Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV31Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31Emprcod_CTRL", GXutil.rtrim( sCtrlAV31Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32Clicodfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV32Clicodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV32Clicodfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32Clicodfrom_CTRL", GXutil.rtrim( sCtrlAV32Clicodfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33Clicodto_PARM", GXutil.ltrim( localUtil.ntoc( AV33Clicodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV33Clicodto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33Clicodto_CTRL", GXutil.rtrim( sCtrlAV33Clicodto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34Facfchfrom_PARM", localUtil.dtoc( AV34Facfchfrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV34Facfchfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34Facfchfrom_CTRL", GXutil.rtrim( sCtrlAV34Facfchfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35Facfchto_PARM", localUtil.dtoc( AV35Facfchto, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV35Facfchto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35Facfchto_CTRL", GXutil.rtrim( sCtrlAV35Facfchto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36FacPri_PARM", GXutil.rtrim( AV36FacPri));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV36FacPri)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36FacPri_CTRL", GXutil.rtrim( sCtrlAV36FacPri));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37FacSernum_PARM", GXutil.rtrim( AV37FacSernum));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV37FacSernum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37FacSernum_CTRL", GXutil.rtrim( sCtrlAV37FacSernum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV38noserie_PARM", GXutil.ltrim( localUtil.ntoc( AV38noserie, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV38noserie)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV38noserie_CTRL", GXutil.rtrim( sCtrlAV38noserie));
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
      we24V2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115552599", true, true);
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
      httpContext.AddJavascriptSource("facturacion/diariodefacturacion_lineas_wc.js", "?202682115552599", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      edtavDiariodefacturacion_lineas_sdt__facfch_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__FACFCH_"+sGXsfl_41_idx ;
      edtavDiariodefacturacion_lineas_sdt__faccod_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__FACCOD_"+sGXsfl_41_idx ;
      edtavDiariodefacturacion_lineas_sdt__clicod_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__CLICOD_"+sGXsfl_41_idx ;
      edtavDiariodefacturacion_lineas_sdt__clinom_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__CLINOM_"+sGXsfl_41_idx ;
      edtavDiariodefacturacion_lineas_sdt__facalbcod_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__FACALBCOD_"+sGXsfl_41_idx ;
      edtavDiariodefacturacion_lineas_sdt__albprofch_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__ALBPROFCH_"+sGXsfl_41_idx ;
      edtavDiariodefacturacion_lineas_sdt__barnhdr_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__BARNHDR_"+sGXsfl_41_idx ;
      edtavDiariodefacturacion_lineas_sdt__facser_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__FACSER_"+sGXsfl_41_idx ;
      edtavDiariodefacturacion_lineas_sdt__color_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__COLOR_"+sGXsfl_41_idx ;
      edtavDiariodefacturacion_lineas_sdt__fackgs_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__FACKGS_"+sGXsfl_41_idx ;
      edtavDiariodefacturacion_lineas_sdt__facprekgs_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__FACPREKGS_"+sGXsfl_41_idx ;
      edtavDiariodefacturacion_lineas_sdt__facmts_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__FACMTS_"+sGXsfl_41_idx ;
      edtavDiariodefacturacion_lineas_sdt__facpremts_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__FACPREMTS_"+sGXsfl_41_idx ;
      edtavDiariodefacturacion_lineas_sdt__baralbpie_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__BARALBPIE_"+sGXsfl_41_idx ;
      edtavDiariodefacturacion_lineas_sdt__facimp_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__FACIMP_"+sGXsfl_41_idx ;
   }

   public void subsflControlProps_fel_412( )
   {
      edtavDiariodefacturacion_lineas_sdt__facfch_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__FACFCH_"+sGXsfl_41_fel_idx ;
      edtavDiariodefacturacion_lineas_sdt__faccod_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__FACCOD_"+sGXsfl_41_fel_idx ;
      edtavDiariodefacturacion_lineas_sdt__clicod_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__CLICOD_"+sGXsfl_41_fel_idx ;
      edtavDiariodefacturacion_lineas_sdt__clinom_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__CLINOM_"+sGXsfl_41_fel_idx ;
      edtavDiariodefacturacion_lineas_sdt__facalbcod_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__FACALBCOD_"+sGXsfl_41_fel_idx ;
      edtavDiariodefacturacion_lineas_sdt__albprofch_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__ALBPROFCH_"+sGXsfl_41_fel_idx ;
      edtavDiariodefacturacion_lineas_sdt__barnhdr_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__BARNHDR_"+sGXsfl_41_fel_idx ;
      edtavDiariodefacturacion_lineas_sdt__facser_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__FACSER_"+sGXsfl_41_fel_idx ;
      edtavDiariodefacturacion_lineas_sdt__color_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__COLOR_"+sGXsfl_41_fel_idx ;
      edtavDiariodefacturacion_lineas_sdt__fackgs_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__FACKGS_"+sGXsfl_41_fel_idx ;
      edtavDiariodefacturacion_lineas_sdt__facprekgs_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__FACPREKGS_"+sGXsfl_41_fel_idx ;
      edtavDiariodefacturacion_lineas_sdt__facmts_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__FACMTS_"+sGXsfl_41_fel_idx ;
      edtavDiariodefacturacion_lineas_sdt__facpremts_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__FACPREMTS_"+sGXsfl_41_fel_idx ;
      edtavDiariodefacturacion_lineas_sdt__baralbpie_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__BARALBPIE_"+sGXsfl_41_fel_idx ;
      edtavDiariodefacturacion_lineas_sdt__facimp_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__FACIMP_"+sGXsfl_41_fel_idx ;
   }

   public void sendrow_412( )
   {
      subsflControlProps_412( ) ;
      wb24V0( ) ;
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
            httpContext.writeText( " class=\""+"GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_41_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDiariodefacturacion_lineas_sdt__facfch_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDiariodefacturacion_lineas_sdt__facfch_Internalname,localUtil.format(((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch(), "99/99/99"),localUtil.format( ((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDiariodefacturacion_lineas_sdt__facfch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDiariodefacturacion_lineas_sdt__facfch_Visible),Integer.valueOf(edtavDiariodefacturacion_lineas_sdt__facfch_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDiariodefacturacion_lineas_sdt__faccod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDiariodefacturacion_lineas_sdt__faccod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Faccod(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDiariodefacturacion_lineas_sdt__faccod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Faccod()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Faccod()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDiariodefacturacion_lineas_sdt__faccod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDiariodefacturacion_lineas_sdt__faccod_Visible),Integer.valueOf(edtavDiariodefacturacion_lineas_sdt__faccod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDiariodefacturacion_lineas_sdt__clicod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDiariodefacturacion_lineas_sdt__clicod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clicod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDiariodefacturacion_lineas_sdt__clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clicod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clicod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDiariodefacturacion_lineas_sdt__clicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDiariodefacturacion_lineas_sdt__clicod_Visible),Integer.valueOf(edtavDiariodefacturacion_lineas_sdt__clicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavDiariodefacturacion_lineas_sdt__clinom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDiariodefacturacion_lineas_sdt__clinom_Internalname,GXutil.rtrim( ((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clinom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDiariodefacturacion_lineas_sdt__clinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDiariodefacturacion_lineas_sdt__clinom_Visible),Integer.valueOf(edtavDiariodefacturacion_lineas_sdt__clinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDiariodefacturacion_lineas_sdt__facalbcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDiariodefacturacion_lineas_sdt__facalbcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facalbcod(), (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDiariodefacturacion_lineas_sdt__facalbcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facalbcod()), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facalbcod()), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDiariodefacturacion_lineas_sdt__facalbcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDiariodefacturacion_lineas_sdt__facalbcod_Visible),Integer.valueOf(edtavDiariodefacturacion_lineas_sdt__facalbcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDiariodefacturacion_lineas_sdt__albprofch_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDiariodefacturacion_lineas_sdt__albprofch_Internalname,localUtil.format(((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch(), "99/99/99"),localUtil.format( ((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDiariodefacturacion_lineas_sdt__albprofch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDiariodefacturacion_lineas_sdt__albprofch_Visible),Integer.valueOf(edtavDiariodefacturacion_lineas_sdt__albprofch_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavDiariodefacturacion_lineas_sdt__barnhdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDiariodefacturacion_lineas_sdt__barnhdr_Internalname,GXutil.rtrim( ((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Barnhdr()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDiariodefacturacion_lineas_sdt__barnhdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDiariodefacturacion_lineas_sdt__barnhdr_Visible),Integer.valueOf(edtavDiariodefacturacion_lineas_sdt__barnhdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavDiariodefacturacion_lineas_sdt__facser_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDiariodefacturacion_lineas_sdt__facser_Internalname,GXutil.rtrim( ((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facser()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDiariodefacturacion_lineas_sdt__facser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDiariodefacturacion_lineas_sdt__facser_Visible),Integer.valueOf(edtavDiariodefacturacion_lineas_sdt__facser_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavDiariodefacturacion_lineas_sdt__color_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDiariodefacturacion_lineas_sdt__color_Internalname,GXutil.rtrim( ((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Color()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDiariodefacturacion_lineas_sdt__color_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDiariodefacturacion_lineas_sdt__color_Visible),Integer.valueOf(edtavDiariodefacturacion_lineas_sdt__color_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDiariodefacturacion_lineas_sdt__fackgs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDiariodefacturacion_lineas_sdt__fackgs_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Fackgs(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDiariodefacturacion_lineas_sdt__fackgs_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Fackgs(), "ZZZZZ9.99") : localUtil.format( ((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Fackgs(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDiariodefacturacion_lineas_sdt__fackgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDiariodefacturacion_lineas_sdt__fackgs_Visible),Integer.valueOf(edtavDiariodefacturacion_lineas_sdt__fackgs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDiariodefacturacion_lineas_sdt__facprekgs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDiariodefacturacion_lineas_sdt__facprekgs_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facprekgs(), (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDiariodefacturacion_lineas_sdt__facprekgs_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facprekgs(), "ZZZZZZ9.999") : localUtil.format( ((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facprekgs(), "ZZZZZZ9.999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDiariodefacturacion_lineas_sdt__facprekgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDiariodefacturacion_lineas_sdt__facprekgs_Visible),Integer.valueOf(edtavDiariodefacturacion_lineas_sdt__facprekgs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDiariodefacturacion_lineas_sdt__facmts_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDiariodefacturacion_lineas_sdt__facmts_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facmts(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDiariodefacturacion_lineas_sdt__facmts_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facmts(), "ZZZZZ9.99") : localUtil.format( ((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facmts(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDiariodefacturacion_lineas_sdt__facmts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDiariodefacturacion_lineas_sdt__facmts_Visible),Integer.valueOf(edtavDiariodefacturacion_lineas_sdt__facmts_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDiariodefacturacion_lineas_sdt__facpremts_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDiariodefacturacion_lineas_sdt__facpremts_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facpremts(), (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDiariodefacturacion_lineas_sdt__facpremts_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facpremts(), "ZZZZZZ9.999") : localUtil.format( ((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facpremts(), "ZZZZZZ9.999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDiariodefacturacion_lineas_sdt__facpremts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDiariodefacturacion_lineas_sdt__facpremts_Visible),Integer.valueOf(edtavDiariodefacturacion_lineas_sdt__facpremts_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDiariodefacturacion_lineas_sdt__baralbpie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDiariodefacturacion_lineas_sdt__baralbpie_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Baralbpie(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDiariodefacturacion_lineas_sdt__baralbpie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Baralbpie()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Baralbpie()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDiariodefacturacion_lineas_sdt__baralbpie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDiariodefacturacion_lineas_sdt__baralbpie_Visible),Integer.valueOf(edtavDiariodefacturacion_lineas_sdt__baralbpie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDiariodefacturacion_lineas_sdt__facimp_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDiariodefacturacion_lineas_sdt__facimp_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facimp(), (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDiariodefacturacion_lineas_sdt__facimp_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facimp(), "ZZZZZZZZZZ9.99") : localUtil.format( ((app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)AV13DiariodeFacturacion_lineas_SDT.elementAt(-1+AV46GXV1)).getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facimp(), "ZZZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDiariodefacturacion_lineas_sdt__facimp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDiariodefacturacion_lineas_sdt__facimp_Visible),Integer.valueOf(edtavDiariodefacturacion_lineas_sdt__facimp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes24V2( ) ;
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
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDiariodefacturacion_lineas_sdt__facfch_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDiariodefacturacion_lineas_sdt__faccod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Factura", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDiariodefacturacion_lineas_sdt__clicod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDiariodefacturacion_lineas_sdt__clinom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDiariodefacturacion_lineas_sdt__facalbcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Documento", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDiariodefacturacion_lineas_sdt__albprofch_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Documento", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDiariodefacturacion_lineas_sdt__barnhdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDiariodefacturacion_lineas_sdt__facser_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDiariodefacturacion_lineas_sdt__color_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDiariodefacturacion_lineas_sdt__fackgs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDiariodefacturacion_lineas_sdt__facprekgs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDiariodefacturacion_lineas_sdt__facmts_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDiariodefacturacion_lineas_sdt__facpremts_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDiariodefacturacion_lineas_sdt__baralbpie_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDiariodefacturacion_lineas_sdt__facimp_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Imp. Linea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_lineas_sdt__facfch_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_lineas_sdt__facfch_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_lineas_sdt__faccod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_lineas_sdt__faccod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_lineas_sdt__clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_lineas_sdt__clicod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_lineas_sdt__clinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_lineas_sdt__clinom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_lineas_sdt__facalbcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_lineas_sdt__facalbcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_lineas_sdt__albprofch_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_lineas_sdt__albprofch_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_lineas_sdt__barnhdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_lineas_sdt__barnhdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_lineas_sdt__facser_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_lineas_sdt__facser_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_lineas_sdt__color_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_lineas_sdt__color_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_lineas_sdt__fackgs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_lineas_sdt__fackgs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_lineas_sdt__facprekgs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_lineas_sdt__facprekgs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_lineas_sdt__facmts_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_lineas_sdt__facmts_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_lineas_sdt__facpremts_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_lineas_sdt__facpremts_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_lineas_sdt__baralbpie_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_lineas_sdt__baralbpie_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_lineas_sdt__facimp_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_lineas_sdt__facimp_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtavDiariodefacturacion_lineas_sdt__facfch_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__FACFCH" ;
      edtavDiariodefacturacion_lineas_sdt__faccod_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__FACCOD" ;
      edtavDiariodefacturacion_lineas_sdt__clicod_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__CLICOD" ;
      edtavDiariodefacturacion_lineas_sdt__clinom_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__CLINOM" ;
      edtavDiariodefacturacion_lineas_sdt__facalbcod_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__FACALBCOD" ;
      edtavDiariodefacturacion_lineas_sdt__albprofch_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__ALBPROFCH" ;
      edtavDiariodefacturacion_lineas_sdt__barnhdr_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__BARNHDR" ;
      edtavDiariodefacturacion_lineas_sdt__facser_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__FACSER" ;
      edtavDiariodefacturacion_lineas_sdt__color_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__COLOR" ;
      edtavDiariodefacturacion_lineas_sdt__fackgs_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__FACKGS" ;
      edtavDiariodefacturacion_lineas_sdt__facprekgs_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__FACPREKGS" ;
      edtavDiariodefacturacion_lineas_sdt__facmts_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__FACMTS" ;
      edtavDiariodefacturacion_lineas_sdt__facpremts_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__FACPREMTS" ;
      edtavDiariodefacturacion_lineas_sdt__baralbpie_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__BARALBPIE" ;
      edtavDiariodefacturacion_lineas_sdt__facimp_Internalname = sPrefix+"DIARIODEFACTURACION_LINEAS_SDT__FACIMP" ;
      edtavTotvalue_facimp_Internalname = sPrefix+"vTOTVALUE_FACIMP" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
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
      edtavDiariodefacturacion_lineas_sdt__facimp_Jsonclick = "" ;
      edtavDiariodefacturacion_lineas_sdt__facimp_Enabled = 0 ;
      edtavDiariodefacturacion_lineas_sdt__facimp_Visible = -1 ;
      edtavDiariodefacturacion_lineas_sdt__baralbpie_Jsonclick = "" ;
      edtavDiariodefacturacion_lineas_sdt__baralbpie_Enabled = 0 ;
      edtavDiariodefacturacion_lineas_sdt__baralbpie_Visible = -1 ;
      edtavDiariodefacturacion_lineas_sdt__facpremts_Jsonclick = "" ;
      edtavDiariodefacturacion_lineas_sdt__facpremts_Enabled = 0 ;
      edtavDiariodefacturacion_lineas_sdt__facpremts_Visible = -1 ;
      edtavDiariodefacturacion_lineas_sdt__facmts_Jsonclick = "" ;
      edtavDiariodefacturacion_lineas_sdt__facmts_Enabled = 0 ;
      edtavDiariodefacturacion_lineas_sdt__facmts_Visible = -1 ;
      edtavDiariodefacturacion_lineas_sdt__facprekgs_Jsonclick = "" ;
      edtavDiariodefacturacion_lineas_sdt__facprekgs_Enabled = 0 ;
      edtavDiariodefacturacion_lineas_sdt__facprekgs_Visible = -1 ;
      edtavDiariodefacturacion_lineas_sdt__fackgs_Jsonclick = "" ;
      edtavDiariodefacturacion_lineas_sdt__fackgs_Enabled = 0 ;
      edtavDiariodefacturacion_lineas_sdt__fackgs_Visible = -1 ;
      edtavDiariodefacturacion_lineas_sdt__color_Jsonclick = "" ;
      edtavDiariodefacturacion_lineas_sdt__color_Enabled = 0 ;
      edtavDiariodefacturacion_lineas_sdt__color_Visible = -1 ;
      edtavDiariodefacturacion_lineas_sdt__facser_Jsonclick = "" ;
      edtavDiariodefacturacion_lineas_sdt__facser_Enabled = 0 ;
      edtavDiariodefacturacion_lineas_sdt__facser_Visible = -1 ;
      edtavDiariodefacturacion_lineas_sdt__barnhdr_Jsonclick = "" ;
      edtavDiariodefacturacion_lineas_sdt__barnhdr_Enabled = 0 ;
      edtavDiariodefacturacion_lineas_sdt__barnhdr_Visible = -1 ;
      edtavDiariodefacturacion_lineas_sdt__albprofch_Jsonclick = "" ;
      edtavDiariodefacturacion_lineas_sdt__albprofch_Enabled = 0 ;
      edtavDiariodefacturacion_lineas_sdt__albprofch_Visible = -1 ;
      edtavDiariodefacturacion_lineas_sdt__facalbcod_Jsonclick = "" ;
      edtavDiariodefacturacion_lineas_sdt__facalbcod_Enabled = 0 ;
      edtavDiariodefacturacion_lineas_sdt__facalbcod_Visible = -1 ;
      edtavDiariodefacturacion_lineas_sdt__clinom_Jsonclick = "" ;
      edtavDiariodefacturacion_lineas_sdt__clinom_Enabled = 0 ;
      edtavDiariodefacturacion_lineas_sdt__clinom_Visible = -1 ;
      edtavDiariodefacturacion_lineas_sdt__clicod_Jsonclick = "" ;
      edtavDiariodefacturacion_lineas_sdt__clicod_Enabled = 0 ;
      edtavDiariodefacturacion_lineas_sdt__clicod_Visible = -1 ;
      edtavDiariodefacturacion_lineas_sdt__faccod_Jsonclick = "" ;
      edtavDiariodefacturacion_lineas_sdt__faccod_Enabled = 0 ;
      edtavDiariodefacturacion_lineas_sdt__faccod_Visible = -1 ;
      edtavDiariodefacturacion_lineas_sdt__facfch_Jsonclick = "" ;
      edtavDiariodefacturacion_lineas_sdt__facfch_Enabled = 0 ;
      edtavDiariodefacturacion_lineas_sdt__facfch_Visible = -1 ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavTotvalue_facimp_Jsonclick = "" ;
      edtavTotvalue_facimp_Enabled = 1 ;
      edtavDiariodefacturacion_lineas_sdt__facimp_Visible = -1 ;
      edtavDiariodefacturacion_lineas_sdt__baralbpie_Visible = -1 ;
      edtavDiariodefacturacion_lineas_sdt__facpremts_Visible = -1 ;
      edtavDiariodefacturacion_lineas_sdt__facmts_Visible = -1 ;
      edtavDiariodefacturacion_lineas_sdt__facprekgs_Visible = -1 ;
      edtavDiariodefacturacion_lineas_sdt__fackgs_Visible = -1 ;
      edtavDiariodefacturacion_lineas_sdt__color_Visible = -1 ;
      edtavDiariodefacturacion_lineas_sdt__facser_Visible = -1 ;
      edtavDiariodefacturacion_lineas_sdt__barnhdr_Visible = -1 ;
      edtavDiariodefacturacion_lineas_sdt__albprofch_Visible = -1 ;
      edtavDiariodefacturacion_lineas_sdt__facalbcod_Visible = -1 ;
      edtavDiariodefacturacion_lineas_sdt__clinom_Visible = -1 ;
      edtavDiariodefacturacion_lineas_sdt__clicod_Visible = -1 ;
      edtavDiariodefacturacion_lineas_sdt__faccod_Visible = -1 ;
      edtavDiariodefacturacion_lineas_sdt__facfch_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDiariodefacturacion_lineas_sdt__facimp_Enabled = -1 ;
      edtavDiariodefacturacion_lineas_sdt__baralbpie_Enabled = -1 ;
      edtavDiariodefacturacion_lineas_sdt__facpremts_Enabled = -1 ;
      edtavDiariodefacturacion_lineas_sdt__facmts_Enabled = -1 ;
      edtavDiariodefacturacion_lineas_sdt__facprekgs_Enabled = -1 ;
      edtavDiariodefacturacion_lineas_sdt__fackgs_Enabled = -1 ;
      edtavDiariodefacturacion_lineas_sdt__color_Enabled = -1 ;
      edtavDiariodefacturacion_lineas_sdt__facser_Enabled = -1 ;
      edtavDiariodefacturacion_lineas_sdt__barnhdr_Enabled = -1 ;
      edtavDiariodefacturacion_lineas_sdt__albprofch_Enabled = -1 ;
      edtavDiariodefacturacion_lineas_sdt__facalbcod_Enabled = -1 ;
      edtavDiariodefacturacion_lineas_sdt__clinom_Enabled = -1 ;
      edtavDiariodefacturacion_lineas_sdt__clicod_Enabled = -1 ;
      edtavDiariodefacturacion_lineas_sdt__faccod_Enabled = -1 ;
      edtavDiariodefacturacion_lineas_sdt__facfch_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "||||||||||||||" ;
      Ddo_grid_Columnids = "0:DiariodeFacturacion_lineas_SDT__Facfch|1:DiariodeFacturacion_lineas_SDT__Faccod|2:DiariodeFacturacion_lineas_SDT__Clicod|3:DiariodeFacturacion_lineas_SDT__CliNom|4:DiariodeFacturacion_lineas_SDT__Facalbcod|5:DiariodeFacturacion_lineas_SDT__AlbProfch|6:DiariodeFacturacion_lineas_SDT__Barnhdr|7:DiariodeFacturacion_lineas_SDT__FacSer|8:DiariodeFacturacion_lineas_SDT__Color|9:DiariodeFacturacion_lineas_SDT__FacKgs|10:DiariodeFacturacion_lineas_SDT__FacPreKgs|11:DiariodeFacturacion_lineas_SDT__FacMts|12:DiariodeFacturacion_lineas_SDT__FacPremts|13:DiariodeFacturacion_lineas_SDT__BarAlbPie|14:DiariodeFacturacion_lineas_SDT__FacImp" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV62Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV31Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV32Clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV33Clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV34Facfchfrom',fld:'vFACFCHFROM',pic:''},{av:'AV35Facfchto',fld:'vFACFCHTO',pic:''},{av:'AV36FacPri',fld:'vFACPRI',pic:'9'},{av:'AV37FacSernum',fld:'vFACSERNUM',pic:''},{av:'AV38noserie',fld:'vNOSERIE',pic:'9'},{av:'AV13DiariodeFacturacion_lineas_SDT',fld:'vDIARIODEFACTURACION_LINEAS_SDT',grid:41,pic:'',hsh:true},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'AV29Tot_FacImp',fld:'vTOT_FACIMP',pic:'ZZZZZZZZZZ9.99',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACFCH',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACCOD',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__CLICOD',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__CLINOM',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACALBCOD',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__ALBPROFCH',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__BARNHDR',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACSER',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__COLOR',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACKGS',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACPREKGS',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACMTS',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACPREMTS',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__BARALBPIE',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACIMP',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV29Tot_FacImp',fld:'vTOT_FACIMP',pic:'ZZZZZZZZZZ9.99',hsh:true},{av:'AV13DiariodeFacturacion_lineas_SDT',fld:'vDIARIODEFACTURACION_LINEAS_SDT',grid:41,pic:'',hsh:true},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'AV30TotValue_FacImp',fld:'vTOTVALUE_FACIMP',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1224V2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV62Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV31Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV32Clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV33Clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV34Facfchfrom',fld:'vFACFCHFROM',pic:''},{av:'AV35Facfchto',fld:'vFACFCHTO',pic:''},{av:'AV36FacPri',fld:'vFACPRI',pic:'9'},{av:'AV37FacSernum',fld:'vFACSERNUM',pic:''},{av:'AV38noserie',fld:'vNOSERIE',pic:'9'},{av:'AV13DiariodeFacturacion_lineas_SDT',fld:'vDIARIODEFACTURACION_LINEAS_SDT',grid:41,pic:'',hsh:true},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'AV29Tot_FacImp',fld:'vTOT_FACIMP',pic:'ZZZZZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1324V2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV62Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV31Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV32Clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV33Clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV34Facfchfrom',fld:'vFACFCHFROM',pic:''},{av:'AV35Facfchto',fld:'vFACFCHTO',pic:''},{av:'AV36FacPri',fld:'vFACPRI',pic:'9'},{av:'AV37FacSernum',fld:'vFACSERNUM',pic:''},{av:'AV38noserie',fld:'vNOSERIE',pic:'9'},{av:'AV13DiariodeFacturacion_lineas_SDT',fld:'vDIARIODEFACTURACION_LINEAS_SDT',grid:41,pic:'',hsh:true},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'AV29Tot_FacImp',fld:'vTOT_FACIMP',pic:'ZZZZZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e1924V2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1424V2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV62Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV31Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV32Clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV33Clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV34Facfchfrom',fld:'vFACFCHFROM',pic:''},{av:'AV35Facfchto',fld:'vFACFCHTO',pic:''},{av:'AV36FacPri',fld:'vFACPRI',pic:'9'},{av:'AV37FacSernum',fld:'vFACSERNUM',pic:''},{av:'AV38noserie',fld:'vNOSERIE',pic:'9'},{av:'AV13DiariodeFacturacion_lineas_SDT',fld:'vDIARIODEFACTURACION_LINEAS_SDT',grid:41,pic:'',hsh:true},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'AV29Tot_FacImp',fld:'vTOT_FACIMP',pic:'ZZZZZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACFCH',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACCOD',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__CLICOD',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__CLINOM',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACALBCOD',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__ALBPROFCH',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__BARNHDR',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACSER',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__COLOR',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACKGS',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACPREKGS',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACMTS',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACPREMTS',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__BARALBPIE',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACIMP',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV29Tot_FacImp',fld:'vTOT_FACIMP',pic:'ZZZZZZZZZZ9.99',hsh:true},{av:'AV13DiariodeFacturacion_lineas_SDT',fld:'vDIARIODEFACTURACION_LINEAS_SDT',grid:41,pic:'',hsh:true},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'AV30TotValue_FacImp',fld:'vTOTVALUE_FACIMP',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e1124V2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV62Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV31Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV32Clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV33Clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV34Facfchfrom',fld:'vFACFCHFROM',pic:''},{av:'AV35Facfchto',fld:'vFACFCHTO',pic:''},{av:'AV36FacPri',fld:'vFACPRI',pic:'9'},{av:'AV37FacSernum',fld:'vFACSERNUM',pic:''},{av:'AV38noserie',fld:'vNOSERIE',pic:'9'},{av:'AV13DiariodeFacturacion_lineas_SDT',fld:'vDIARIODEFACTURACION_LINEAS_SDT',grid:41,pic:'',hsh:true},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'AV29Tot_FacImp',fld:'vTOT_FACIMP',pic:'ZZZZZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACFCH',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACCOD',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__CLICOD',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__CLINOM',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACALBCOD',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__ALBPROFCH',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__BARNHDR',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACSER',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__COLOR',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACKGS',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACPREKGS',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACMTS',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACPREMTS',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__BARALBPIE',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACIMP',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV29Tot_FacImp',fld:'vTOT_FACIMP',pic:'ZZZZZZZZZZ9.99',hsh:true},{av:'AV13DiariodeFacturacion_lineas_SDT',fld:'vDIARIODEFACTURACION_LINEAS_SDT',grid:41,pic:'',hsh:true},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'AV30TotValue_FacImp',fld:'vTOTVALUE_FACIMP',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1524V2',iparms:[{av:'AV13DiariodeFacturacion_lineas_SDT',fld:'vDIARIODEFACTURACION_LINEAS_SDT',grid:41,pic:'',hsh:true},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'AV62Pgmname',fld:'vPGMNAME',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV62Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV31Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV32Clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV33Clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV34Facfchfrom',fld:'vFACFCHFROM',pic:''},{av:'AV35Facfchto',fld:'vFACFCHTO',pic:''},{av:'AV36FacPri',fld:'vFACPRI',pic:'9'},{av:'AV37FacSernum',fld:'vFACSERNUM',pic:''},{av:'AV38noserie',fld:'vNOSERIE',pic:'9'},{av:'AV13DiariodeFacturacion_lineas_SDT',fld:'vDIARIODEFACTURACION_LINEAS_SDT',grid:41,pic:'',hsh:true},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'AV29Tot_FacImp',fld:'vTOT_FACIMP',pic:'ZZZZZZZZZZ9.99',hsh:true},{av:'sPrefix'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e1624V2',iparms:[{av:'AV13DiariodeFacturacion_lineas_SDT',fld:'vDIARIODEFACTURACION_LINEAS_SDT',grid:41,pic:'',hsh:true},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'AV62Pgmname',fld:'vPGMNAME',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV62Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV31Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV32Clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV33Clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV34Facfchfrom',fld:'vFACFCHFROM',pic:''},{av:'AV35Facfchto',fld:'vFACFCHTO',pic:''},{av:'AV36FacPri',fld:'vFACPRI',pic:'9'},{av:'AV37FacSernum',fld:'vFACSERNUM',pic:''},{av:'AV38noserie',fld:'vNOSERIE',pic:'9'},{av:'AV13DiariodeFacturacion_lineas_SDT',fld:'vDIARIODEFACTURACION_LINEAS_SDT',grid:41,pic:'',hsh:true},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'AV29Tot_FacImp',fld:'vTOT_FACIMP',pic:'ZZZZZZZZZZ9.99',hsh:true},{av:'sPrefix'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e2024V2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV62Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV31Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV32Clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV33Clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV34Facfchfrom',fld:'vFACFCHFROM',pic:''},{av:'AV35Facfchto',fld:'vFACFCHTO',pic:''},{av:'AV36FacPri',fld:'vFACPRI',pic:'9'},{av:'AV37FacSernum',fld:'vFACSERNUM',pic:''},{av:'AV38noserie',fld:'vNOSERIE',pic:'9'},{av:'AV13DiariodeFacturacion_lineas_SDT',fld:'vDIARIODEFACTURACION_LINEAS_SDT',grid:41,pic:'',hsh:true},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'AV29Tot_FacImp',fld:'vTOT_FACIMP',pic:'ZZZZZZZZZZ9.99',hsh:true},{av:'sPrefix'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACFCH',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACCOD',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__CLICOD',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__CLINOM',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACALBCOD',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__ALBPROFCH',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__BARNHDR',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACSER',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__COLOR',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACKGS',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACPREKGS',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACMTS',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACPREMTS',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__BARALBPIE',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_LINEAS_SDT__FACIMP',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV29Tot_FacImp',fld:'vTOT_FACIMP',pic:'ZZZZZZZZZZ9.99',hsh:true},{av:'AV13DiariodeFacturacion_lineas_SDT',fld:'vDIARIODEFACTURACION_LINEAS_SDT',grid:41,pic:'',hsh:true},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'AV30TotValue_FacImp',fld:'vTOTVALUE_FACIMP',pic:''}]}");
      setEventMetadata("NULL","{handler:'validv_Gxv16',iparms:[]");
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
      wcpOAV31Emprcod = "" ;
      wcpOAV34Facfchfrom = GXutil.nullDate() ;
      wcpOAV35Facfchto = GXutil.nullDate() ;
      wcpOAV36FacPri = "" ;
      wcpOAV37FacSernum = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV31Emprcod = "" ;
      AV34Facfchfrom = GXutil.nullDate() ;
      AV35Facfchto = GXutil.nullDate() ;
      AV36FacPri = "" ;
      AV37FacSernum = "" ;
      AV18ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV62Pgmname = "" ;
      AV12FilterFullText = "" ;
      AV13DiariodeFacturacion_lineas_SDT = new GXBaseCollection<app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item>(app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV29Tot_FacImp = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV21ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV24DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
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
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV30TotValue_FacImp = "" ;
      hsh = "" ;
      AV39Station = "" ;
      GXv_char2 = new String[1] ;
      AV40EmprNom = "" ;
      AV41UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV20Session = httpContext.getWebSession();
      AV16ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV22ManageFiltersXml = "" ;
      AV42DiariodeFacturacion_lineas_json = "" ;
      AV43Websession = httpContext.getWebSession();
      AV14ExcelFilename = "" ;
      AV15ErrorMessage = "" ;
      GXv_char3 = new String[1] ;
      GXt_objcol_SdtDiariodeFacturacion_lineas_SDT_Item8 = new GXBaseCollection<app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item>(app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      GXv_objcol_SdtDiariodeFacturacion_lineas_SDT_Item9 = new GXBaseCollection[1] ;
      AV17UserCustomValue = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV19ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState14 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV28DiariodeFacturacion_lineas_SDTItem = new app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV31Emprcod = "" ;
      sCtrlAV32Clicodfrom = "" ;
      sCtrlAV33Clicodto = "" ;
      sCtrlAV34Facfchfrom = "" ;
      sCtrlAV35Facfchto = "" ;
      sCtrlAV36FacPri = "" ;
      sCtrlAV37FacSernum = "" ;
      sCtrlAV38noserie = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV62Pgmname = "Facturacion.DiariodeFacturacion_lineas_WC" ;
      /* GeneXus formulas. */
      AV62Pgmname = "Facturacion.DiariodeFacturacion_lineas_WC" ;
      Gx_err = (short)(0) ;
      edtavDiariodefacturacion_lineas_sdt__facfch_Enabled = 0 ;
      edtavDiariodefacturacion_lineas_sdt__faccod_Enabled = 0 ;
      edtavDiariodefacturacion_lineas_sdt__clicod_Enabled = 0 ;
      edtavDiariodefacturacion_lineas_sdt__clinom_Enabled = 0 ;
      edtavDiariodefacturacion_lineas_sdt__facalbcod_Enabled = 0 ;
      edtavDiariodefacturacion_lineas_sdt__albprofch_Enabled = 0 ;
      edtavDiariodefacturacion_lineas_sdt__barnhdr_Enabled = 0 ;
      edtavDiariodefacturacion_lineas_sdt__facser_Enabled = 0 ;
      edtavDiariodefacturacion_lineas_sdt__color_Enabled = 0 ;
      edtavDiariodefacturacion_lineas_sdt__fackgs_Enabled = 0 ;
      edtavDiariodefacturacion_lineas_sdt__facprekgs_Enabled = 0 ;
      edtavDiariodefacturacion_lineas_sdt__facmts_Enabled = 0 ;
      edtavDiariodefacturacion_lineas_sdt__facpremts_Enabled = 0 ;
      edtavDiariodefacturacion_lineas_sdt__baralbpie_Enabled = 0 ;
      edtavDiariodefacturacion_lineas_sdt__facimp_Enabled = 0 ;
      edtavTotvalue_facimp_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV38noserie ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV38noserie ;
   private byte AV23ManageFiltersExecutionStep ;
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
   private int wcpOAV32Clicodfrom ;
   private int wcpOAV33Clicodto ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_41 ;
   private int AV32Clicodfrom ;
   private int AV33Clicodto ;
   private int nGXsfl_41_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV46GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavDiariodefacturacion_lineas_sdt__facfch_Enabled ;
   private int edtavDiariodefacturacion_lineas_sdt__faccod_Enabled ;
   private int edtavDiariodefacturacion_lineas_sdt__clicod_Enabled ;
   private int edtavDiariodefacturacion_lineas_sdt__clinom_Enabled ;
   private int edtavDiariodefacturacion_lineas_sdt__facalbcod_Enabled ;
   private int edtavDiariodefacturacion_lineas_sdt__albprofch_Enabled ;
   private int edtavDiariodefacturacion_lineas_sdt__barnhdr_Enabled ;
   private int edtavDiariodefacturacion_lineas_sdt__facser_Enabled ;
   private int edtavDiariodefacturacion_lineas_sdt__color_Enabled ;
   private int edtavDiariodefacturacion_lineas_sdt__fackgs_Enabled ;
   private int edtavDiariodefacturacion_lineas_sdt__facprekgs_Enabled ;
   private int edtavDiariodefacturacion_lineas_sdt__facmts_Enabled ;
   private int edtavDiariodefacturacion_lineas_sdt__facpremts_Enabled ;
   private int edtavDiariodefacturacion_lineas_sdt__baralbpie_Enabled ;
   private int edtavDiariodefacturacion_lineas_sdt__facimp_Enabled ;
   private int edtavTotvalue_facimp_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_41_fel_idx=1 ;
   private int edtavDiariodefacturacion_lineas_sdt__facfch_Visible ;
   private int edtavDiariodefacturacion_lineas_sdt__faccod_Visible ;
   private int edtavDiariodefacturacion_lineas_sdt__clicod_Visible ;
   private int edtavDiariodefacturacion_lineas_sdt__clinom_Visible ;
   private int edtavDiariodefacturacion_lineas_sdt__facalbcod_Visible ;
   private int edtavDiariodefacturacion_lineas_sdt__albprofch_Visible ;
   private int edtavDiariodefacturacion_lineas_sdt__barnhdr_Visible ;
   private int edtavDiariodefacturacion_lineas_sdt__facser_Visible ;
   private int edtavDiariodefacturacion_lineas_sdt__color_Visible ;
   private int edtavDiariodefacturacion_lineas_sdt__fackgs_Visible ;
   private int edtavDiariodefacturacion_lineas_sdt__facprekgs_Visible ;
   private int edtavDiariodefacturacion_lineas_sdt__facmts_Visible ;
   private int edtavDiariodefacturacion_lineas_sdt__facpremts_Visible ;
   private int edtavDiariodefacturacion_lineas_sdt__baralbpie_Visible ;
   private int edtavDiariodefacturacion_lineas_sdt__facimp_Visible ;
   private int AV25PageToGo ;
   private int nGXsfl_41_bak_idx=1 ;
   private int AV63GXV17 ;
   private int AV64GXV18 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV26GridCurrentPage ;
   private long AV27GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV29Tot_FacImp ;
   private String wcpOAV31Emprcod ;
   private String wcpOAV36FacPri ;
   private String wcpOAV37FacSernum ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV31Emprcod ;
   private String AV36FacPri ;
   private String AV37FacSernum ;
   private String sGXsfl_41_idx="0001" ;
   private String AV62Pgmname ;
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
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
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
   private String edtavDiariodefacturacion_lineas_sdt__facfch_Internalname ;
   private String edtavDiariodefacturacion_lineas_sdt__faccod_Internalname ;
   private String edtavDiariodefacturacion_lineas_sdt__clicod_Internalname ;
   private String edtavDiariodefacturacion_lineas_sdt__clinom_Internalname ;
   private String edtavDiariodefacturacion_lineas_sdt__facalbcod_Internalname ;
   private String edtavDiariodefacturacion_lineas_sdt__albprofch_Internalname ;
   private String edtavDiariodefacturacion_lineas_sdt__barnhdr_Internalname ;
   private String edtavDiariodefacturacion_lineas_sdt__facser_Internalname ;
   private String edtavDiariodefacturacion_lineas_sdt__color_Internalname ;
   private String edtavDiariodefacturacion_lineas_sdt__fackgs_Internalname ;
   private String edtavDiariodefacturacion_lineas_sdt__facprekgs_Internalname ;
   private String edtavDiariodefacturacion_lineas_sdt__facmts_Internalname ;
   private String edtavDiariodefacturacion_lineas_sdt__facpremts_Internalname ;
   private String edtavDiariodefacturacion_lineas_sdt__baralbpie_Internalname ;
   private String edtavDiariodefacturacion_lineas_sdt__facimp_Internalname ;
   private String edtavTotvalue_facimp_Internalname ;
   private String sGXsfl_41_fel_idx="0001" ;
   private String hsh ;
   private String AV39Station ;
   private String GXv_char2[] ;
   private String AV40EmprNom ;
   private String AV41UsurCod ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvalue_facimp_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV31Emprcod ;
   private String sCtrlAV32Clicodfrom ;
   private String sCtrlAV33Clicodto ;
   private String sCtrlAV34Facfchfrom ;
   private String sCtrlAV35Facfchto ;
   private String sCtrlAV36FacPri ;
   private String sCtrlAV37FacSernum ;
   private String sCtrlAV38noserie ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavDiariodefacturacion_lineas_sdt__facfch_Jsonclick ;
   private String edtavDiariodefacturacion_lineas_sdt__faccod_Jsonclick ;
   private String edtavDiariodefacturacion_lineas_sdt__clicod_Jsonclick ;
   private String edtavDiariodefacturacion_lineas_sdt__clinom_Jsonclick ;
   private String edtavDiariodefacturacion_lineas_sdt__facalbcod_Jsonclick ;
   private String edtavDiariodefacturacion_lineas_sdt__albprofch_Jsonclick ;
   private String edtavDiariodefacturacion_lineas_sdt__barnhdr_Jsonclick ;
   private String edtavDiariodefacturacion_lineas_sdt__facser_Jsonclick ;
   private String edtavDiariodefacturacion_lineas_sdt__color_Jsonclick ;
   private String edtavDiariodefacturacion_lineas_sdt__fackgs_Jsonclick ;
   private String edtavDiariodefacturacion_lineas_sdt__facprekgs_Jsonclick ;
   private String edtavDiariodefacturacion_lineas_sdt__facmts_Jsonclick ;
   private String edtavDiariodefacturacion_lineas_sdt__facpremts_Jsonclick ;
   private String edtavDiariodefacturacion_lineas_sdt__baralbpie_Jsonclick ;
   private String edtavDiariodefacturacion_lineas_sdt__facimp_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV34Facfchfrom ;
   private java.util.Date wcpOAV35Facfchto ;
   private java.util.Date AV34Facfchfrom ;
   private java.util.Date AV35Facfchto ;
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
   private String AV16ColumnsSelectorXML ;
   private String AV22ManageFiltersXml ;
   private String AV42DiariodeFacturacion_lineas_json ;
   private String AV17UserCustomValue ;
   private String AV12FilterFullText ;
   private String AV30TotValue_FacImp ;
   private String AV14ExcelFilename ;
   private String AV15ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private com.genexus.webpanels.WebSession AV43Websession ;
   private GXBaseCollection<app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item> AV13DiariodeFacturacion_lineas_SDT ;
   private GXBaseCollection<app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item> GXt_objcol_SdtDiariodeFacturacion_lineas_SDT_Item8 ;
   private GXBaseCollection<app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item> GXv_objcol_SdtDiariodeFacturacion_lineas_SDT_Item9[] ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV21ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState14[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item AV28DiariodeFacturacion_lineas_SDTItem ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV24DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

