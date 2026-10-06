package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class penalizaciones_wc_impl extends GXWebComponent
{
   public penalizaciones_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public penalizaciones_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( penalizaciones_wc_impl.class ));
   }

   public penalizaciones_wc_impl( int remoteHandle ,
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
      chkavPenalizaciones_sdt__seleccionar = UIFactory.getCheckbox(this);
      chkavPenalizaciones_sdt__baracc = UIFactory.getCheckbox(this);
      chkavPenalizaciones_sdt__fase_618 = UIFactory.getCheckbox(this);
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
               AV28Clicodfrom = (int)(GXutil.lval( httpContext.GetPar( "Clicodfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Clicodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Clicodfrom), 6, 0));
               AV29Clicodto = (int)(GXutil.lval( httpContext.GetPar( "Clicodto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Clicodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Clicodto), 6, 0));
               AV30Albprofchfrom = localUtil.parseDateParm( httpContext.GetPar( "Albprofchfrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Albprofchfrom", localUtil.format(AV30Albprofchfrom, "99/99/99"));
               AV31Albprofchto = localUtil.parseDateParm( httpContext.GetPar( "Albprofchto")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31Albprofchto", localUtil.format(AV31Albprofchto, "99/99/99"));
               AV32Inbarmancod1 = (short)(GXutil.lval( httpContext.GetPar( "Inbarmancod1"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Inbarmancod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Inbarmancod1), 4, 0));
               AV27InBarcolnom = httpContext.GetPar( "InBarcolnom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27InBarcolnom", AV27InBarcolnom);
               AV50NoVerPen = (byte)(GXutil.lval( httpContext.GetPar( "NoVerPen"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50NoVerPen", GXutil.str( AV50NoVerPen, 1, 0));
               AV59Penalizaciones_Json2 = httpContext.GetPar( "Penalizaciones_Json2") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Penalizaciones_Json2", AV59Penalizaciones_Json2);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV26EmprCod,Integer.valueOf(AV28Clicodfrom),Integer.valueOf(AV29Clicodto),AV30Albprofchfrom,AV31Albprofchto,Short.valueOf(AV32Inbarmancod1),AV27InBarcolnom,Byte.valueOf(AV50NoVerPen),AV59Penalizaciones_Json2});
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
      nRC_GXsfl_54 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_54"))) ;
      nGXsfl_54_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_54_idx"))) ;
      sGXsfl_54_idx = httpContext.GetPar( "sGXsfl_54_idx") ;
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
      AV21ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV16ColumnsSelector);
      AV97Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV26EmprCod = httpContext.GetPar( "EmprCod") ;
      AV28Clicodfrom = (int)(GXutil.lval( httpContext.GetPar( "Clicodfrom"))) ;
      AV29Clicodto = (int)(GXutil.lval( httpContext.GetPar( "Clicodto"))) ;
      AV30Albprofchfrom = localUtil.parseDateParm( httpContext.GetPar( "Albprofchfrom")) ;
      AV31Albprofchto = localUtil.parseDateParm( httpContext.GetPar( "Albprofchto")) ;
      AV32Inbarmancod1 = (short)(GXutil.lval( httpContext.GetPar( "Inbarmancod1"))) ;
      AV27InBarcolnom = httpContext.GetPar( "InBarcolnom") ;
      AV50NoVerPen = (byte)(GXutil.lval( httpContext.GetPar( "NoVerPen"))) ;
      AV59Penalizaciones_Json2 = httpContext.GetPar( "Penalizaciones_Json2") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV21ManageFiltersExecutionStep, AV16ColumnsSelector, AV97Pgmname, AV12FilterFullText, AV26EmprCod, AV28Clicodfrom, AV29Clicodto, AV30Albprofchfrom, AV31Albprofchto, AV32Inbarmancod1, AV27InBarcolnom, AV50NoVerPen, AV59Penalizaciones_Json2, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa23L2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Penalizaciones", "")) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.penalizaciones_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV26EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV28Clicodfrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV29Clicodto,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV30Albprofchfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV31Albprofchto)),GXutil.URLEncode(GXutil.ltrimstr(AV32Inbarmancod1,4,0)),GXutil.URLEncode(GXutil.rtrim(AV27InBarcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV50NoVerPen,1,0)),GXutil.URLEncode(GXutil.rtrim(AV59Penalizaciones_Json2))}, new String[] {"EmprCod","Clicodfrom","Clicodto","Albprofchfrom","Albprofchto","Inbarmancod1","InBarcolnom","NoVerPen","Penalizaciones_Json2"}) +"\">") ;
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
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"Penalizaciones_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV97Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\penalizaciones_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Penalizaciones_sdt", AV13Penalizaciones_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Penalizaciones_sdt", AV13Penalizaciones_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_54", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_54, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV19ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV19ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV24GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV25GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV22DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV22DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV16ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV16ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV26EmprCod", GXutil.rtrim( wcpOAV26EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV28Clicodfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV28Clicodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV29Clicodto", GXutil.ltrim( localUtil.ntoc( wcpOAV29Clicodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV30Albprofchfrom", localUtil.dtoc( wcpOAV30Albprofchfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV31Albprofchto", localUtil.dtoc( wcpOAV31Albprofchto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV32Inbarmancod1", GXutil.ltrim( localUtil.ntoc( wcpOAV32Inbarmancod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV27InBarcolnom", GXutil.rtrim( wcpOAV27InBarcolnom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV50NoVerPen", GXutil.ltrim( localUtil.ntoc( wcpOAV50NoVerPen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV59Penalizaciones_Json2", wcpOAV59Penalizaciones_Json2);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV21ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV26EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODFROM", GXutil.ltrim( localUtil.ntoc( AV28Clicodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODTO", GXutil.ltrim( localUtil.ntoc( AV29Clicodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBPROFCHFROM", localUtil.dtoc( AV30Albprofchfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBPROFCHTO", localUtil.dtoc( AV31Albprofchto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINBARMANCOD1", GXutil.ltrim( localUtil.ntoc( AV32Inbarmancod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINBARCOLNOM", GXutil.rtrim( AV27InBarcolnom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNOVERPEN", GXutil.ltrim( localUtil.ntoc( AV50NoVerPen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPENALIZACIONES_JSON2", AV59Penalizaciones_Json2);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vPENALIZACIONES_SDT", AV13Penalizaciones_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vPENALIZACIONES_SDT", AV13Penalizaciones_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GUIREMCLI", GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBPROEST", GXutil.ltrim( localUtil.ntoc( A33AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBPROCOD", GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBPROPRI", GXutil.rtrim( A39AlbProPri));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBPROFCH", localUtil.dtoc( A34AlbProfch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARALBEXT", GXutil.ltrim( localUtil.ntoc( A2395BarAlbExt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBPROESP", GXutil.ltrim( localUtil.ntoc( A32AlbProEsp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOLNOM", GXutil.rtrim( A135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARMANCOD1", GXutil.ltrim( localUtil.ntoc( A3311BarManCod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARACC", GXutil.rtrim( A5253BarAcc));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"FASE_618", A14267Fase_618);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPMDPREUNI", GXutil.ltrim( localUtil.ntoc( AV42PMDPreUni, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARALBKGME", GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARANCACA1", GXutil.ltrim( localUtil.ntoc( A125BarAncAca1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARALBMTRE", GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vVAR_SELECCIONAR", GXutil.ltrim( localUtil.ntoc( AV33Var_seleccionar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEM_PENALIZACIONES_SDT", AV35Item_Penalizaciones_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEM_PENALIZACIONES_SDT", AV35Item_Penalizaciones_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGXV27", GXutil.ltrim( localUtil.ntoc( AV98GXV27, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vREGISTROSTRUE", GXutil.ltrim( localUtil.ntoc( AV36registrostrue, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
   }

   public void renderHtmlCloseForm23L2( )
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
      return "Facturacion.Penalizaciones_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Penalizaciones", "") ;
   }

   public void wb23L0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.facturacion.penalizaciones_wc");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 54, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\Penalizaciones_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 54, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\Penalizaciones_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_21_23L2( true) ;
      }
      else
      {
         wb_table1_21_23L2( false) ;
      }
      return  ;
   }

   public void wb_table1_21_23L2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 54, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e1123l1_client"+"'", TempTags, "", 2, "HLP_Facturacion\\Penalizaciones_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnmarcartodas_Internalname, "gx.evt.setGridEvt("+GXutil.str( 54, 2, 0)+","+"null"+");", httpContext.getMessage( "Validar (Tudo)", ""), bttBtnmarcartodas_Jsonclick, 5, httpContext.getMessage( "Validar (Tudo)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOMARCARTODAS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\Penalizaciones_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndesmarcartodas_Internalname, "gx.evt.setGridEvt("+GXutil.str( 54, 2, 0)+","+"null"+");", httpContext.getMessage( "Nao Validar (Tudo)", ""), bttBtndesmarcartodas_Jsonclick, 5, httpContext.getMessage( "Nao Validar (Tudo)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DODESMARCARTODAS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\Penalizaciones_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         startgridcontrol54( ) ;
      }
      if ( wbEnd == 54 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_54 = (int)(nGXsfl_54_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV71GXV1 = nGXsfl_54_idx ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV24GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV25GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV97Pgmname), GXutil.rtrim( localUtil.format( AV97Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\Penalizaciones_WC.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV22DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV22DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV16ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_95_23L2( true) ;
      }
      else
      {
         wb_table2_95_23L2( false) ;
      }
      return  ;
   }

   public void wb_table2_95_23L2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
      if ( wbEnd == 54 )
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
               AV71GXV1 = nGXsfl_54_idx ;
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

   public void start23L2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Penalizaciones", ""), (short)(0)) ;
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
            strup23L0( ) ;
         }
      }
   }

   public void ws23L2( )
   {
      start23L2( ) ;
      evt23L2( ) ;
   }

   public void evt23L2( )
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
                              strup23L0( ) ;
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
                              strup23L0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1223L2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup23L0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1323L2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup23L0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1423L2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup23L0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1523L2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup23L0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1623L2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOMARCARTODAS'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup23L0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoMarcarTodas' */
                                 e1723L2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DODESMARCARTODAS'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup23L0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoDesmarcarTodas' */
                                 e1823L2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup23L0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e1923L2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup23L0( ) ;
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
                              strup23L0( ) ;
                           }
                           nGXsfl_54_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_542( ) ;
                           AV71GXV1 = (int)(nGXsfl_54_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV13Penalizaciones_SDT.size() >= AV71GXV1 ) && ( AV71GXV1 > 0 ) )
                           {
                              AV13Penalizaciones_SDT.currentItem( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)) );
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
                                       e2023L2 ();
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
                                       e2123L2 ();
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
                                       e2223L2 ();
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
                                    strup23L0( ) ;
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

   public void we23L2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm23L2( ) ;
         }
      }
   }

   public void pa23L2( )
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
      subsflControlProps_542( ) ;
      while ( nGXsfl_54_idx <= nRC_GXsfl_54 )
      {
         sendrow_542( ) ;
         nGXsfl_54_idx = ((subGrid_Islastpage==1)&&(nGXsfl_54_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_54_idx+1) ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_542( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 byte AV21ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelector ,
                                 String AV97Pgmname ,
                                 String AV12FilterFullText ,
                                 String AV26EmprCod ,
                                 int AV28Clicodfrom ,
                                 int AV29Clicodto ,
                                 java.util.Date AV30Albprofchfrom ,
                                 java.util.Date AV31Albprofchto ,
                                 short AV32Inbarmancod1 ,
                                 String AV27InBarcolnom ,
                                 byte AV50NoVerPen ,
                                 String AV59Penalizaciones_Json2 ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2123L2 ();
      GRID_nCurrentRecord = 0 ;
      rf23L2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"Penalizaciones_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV97Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\penalizaciones_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf23L2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV97Pgmname = "Facturacion.Penalizaciones_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97Pgmname", AV97Pgmname);
      Gx_err = (short)(0) ;
      edtavPenalizaciones_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__clicod_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__barmancod1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__barmancod1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__barmancod1_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__barcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__barcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__barcolnum_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__barcolnom_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__barcod_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__barcodreo_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__barcodpar_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__albprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__albprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__albprocod_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__barkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__barkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__barkgm_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__baralbkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__baralbkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__baralbkgm_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__pmddtotin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__pmddtotin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__pmddtotin_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__pmddtoaca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__pmddtoaca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__pmddtoaca_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__pmdtinprc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__pmdtinprc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__pmdtinprc_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__pmdacaprc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__pmdacaprc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__pmdacaprc_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__precio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__precio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__precio_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__barprekgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__barprekgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__barprekgm_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__clinom_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__pmddsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__pmddsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__pmddsc_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__okkgmin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__okkgmin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__okkgmin_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__pmdpreuni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__pmdpreuni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__pmdpreuni_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      chkavPenalizaciones_sdt__baracc.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavPenalizaciones_sdt__baracc.getInternalname(), "Enabled", GXutil.ltrimstr( chkavPenalizaciones_sdt__baracc.getEnabled(), 5, 0), !bGXsfl_54_Refreshing);
      chkavPenalizaciones_sdt__fase_618.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavPenalizaciones_sdt__fase_618.getInternalname(), "Enabled", GXutil.ltrimstr( chkavPenalizaciones_sdt__fase_618.getEnabled(), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__mtsmins_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__mtsmins_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__mtsmins_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__pmdkgmmins_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__pmdkgmmins_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__pmdkgmmins_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf23L2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(54) ;
      /* Execute user event: Refresh */
      e2123L2 ();
      nGXsfl_54_idx = 1 ;
      sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_542( ) ;
      bGXsfl_54_Refreshing = true ;
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
         subsflControlProps_542( ) ;
         e2223L2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_54_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e2223L2 ();
         }
         wbEnd = (short)(54) ;
         wb23L0( ) ;
      }
      bGXsfl_54_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes23L2( )
   {
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
      return AV13Penalizaciones_SDT.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV21ManageFiltersExecutionStep, AV16ColumnsSelector, AV97Pgmname, AV12FilterFullText, AV26EmprCod, AV28Clicodfrom, AV29Clicodto, AV30Albprofchfrom, AV31Albprofchto, AV32Inbarmancod1, AV27InBarcolnom, AV50NoVerPen, AV59Penalizaciones_Json2, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV21ManageFiltersExecutionStep, AV16ColumnsSelector, AV97Pgmname, AV12FilterFullText, AV26EmprCod, AV28Clicodfrom, AV29Clicodto, AV30Albprofchfrom, AV31Albprofchto, AV32Inbarmancod1, AV27InBarcolnom, AV50NoVerPen, AV59Penalizaciones_Json2, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV21ManageFiltersExecutionStep, AV16ColumnsSelector, AV97Pgmname, AV12FilterFullText, AV26EmprCod, AV28Clicodfrom, AV29Clicodto, AV30Albprofchfrom, AV31Albprofchto, AV32Inbarmancod1, AV27InBarcolnom, AV50NoVerPen, AV59Penalizaciones_Json2, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV21ManageFiltersExecutionStep, AV16ColumnsSelector, AV97Pgmname, AV12FilterFullText, AV26EmprCod, AV28Clicodfrom, AV29Clicodto, AV30Albprofchfrom, AV31Albprofchto, AV32Inbarmancod1, AV27InBarcolnom, AV50NoVerPen, AV59Penalizaciones_Json2, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV21ManageFiltersExecutionStep, AV16ColumnsSelector, AV97Pgmname, AV12FilterFullText, AV26EmprCod, AV28Clicodfrom, AV29Clicodto, AV30Albprofchfrom, AV31Albprofchto, AV32Inbarmancod1, AV27InBarcolnom, AV50NoVerPen, AV59Penalizaciones_Json2, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV97Pgmname = "Facturacion.Penalizaciones_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97Pgmname", AV97Pgmname);
      Gx_err = (short)(0) ;
      edtavPenalizaciones_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__clicod_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__barmancod1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__barmancod1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__barmancod1_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__barcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__barcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__barcolnum_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__barcolnom_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__barcod_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__barcodreo_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__barcodpar_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__albprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__albprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__albprocod_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__barkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__barkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__barkgm_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__baralbkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__baralbkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__baralbkgm_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__pmddtotin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__pmddtotin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__pmddtotin_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__pmddtoaca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__pmddtoaca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__pmddtoaca_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__pmdtinprc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__pmdtinprc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__pmdtinprc_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__pmdacaprc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__pmdacaprc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__pmdacaprc_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__precio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__precio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__precio_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__barprekgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__barprekgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__barprekgm_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__clinom_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__pmddsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__pmddsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__pmddsc_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__okkgmin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__okkgmin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__okkgmin_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__pmdpreuni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__pmdpreuni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__pmdpreuni_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      chkavPenalizaciones_sdt__baracc.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavPenalizaciones_sdt__baracc.getInternalname(), "Enabled", GXutil.ltrimstr( chkavPenalizaciones_sdt__baracc.getEnabled(), 5, 0), !bGXsfl_54_Refreshing);
      chkavPenalizaciones_sdt__fase_618.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavPenalizaciones_sdt__fase_618.getInternalname(), "Enabled", GXutil.ltrimstr( chkavPenalizaciones_sdt__fase_618.getEnabled(), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__mtsmins_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__mtsmins_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__mtsmins_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__pmdkgmmins_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__pmdkgmmins_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__pmdkgmmins_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup23L0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e2023L2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Penalizaciones_sdt"), AV13Penalizaciones_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV19ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV22DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV16ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vPENALIZACIONES_SDT"), AV13Penalizaciones_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEM_PENALIZACIONES_SDT"), AV35Item_Penalizaciones_SDT);
         /* Read saved values. */
         nRC_GXsfl_54 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_54"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV24GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV25GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV26EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV26EmprCod") ;
         wcpOAV28Clicodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV28Clicodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV29Clicodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV29Clicodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV30Albprofchfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV30Albprofchfrom"), 0) ;
         wcpOAV31Albprofchto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV31Albprofchto"), 0) ;
         wcpOAV32Inbarmancod1 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV32Inbarmancod1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV27InBarcolnom = httpContext.cgiGet( sPrefix+"wcpOAV27InBarcolnom") ;
         wcpOAV50NoVerPen = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV50NoVerPen"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV59Penalizaciones_Json2 = httpContext.cgiGet( sPrefix+"wcpOAV59Penalizaciones_Json2") ;
         AV98GXV27 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vGXV27"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV36registrostrue = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vREGISTROSTRUE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Dvelop_confirmpanel_confirmar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Title") ;
         Dvelop_confirmpanel_confirmar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_confirmar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_confirmar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype") ;
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
         Dvelop_confirmpanel_confirmar_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Result") ;
         nRC_GXsfl_54 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_54"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_54_fel_idx = 0 ;
         while ( nGXsfl_54_fel_idx < nRC_GXsfl_54 )
         {
            nGXsfl_54_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_54_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_54_fel_idx+1) ;
            sGXsfl_54_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_542( ) ;
            AV71GXV1 = (int)(nGXsfl_54_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV13Penalizaciones_SDT.size() >= AV71GXV1 ) && ( AV71GXV1 > 0 ) )
            {
               AV13Penalizaciones_SDT.currentItem( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)) );
            }
         }
         if ( nGXsfl_54_fel_idx == 0 )
         {
            nGXsfl_54_idx = 1 ;
            sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_542( ) ;
         }
         nGXsfl_54_fel_idx = 1 ;
         /* Read variables values. */
         AV12FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
         AV97Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97Pgmname", AV97Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"Penalizaciones_WC");
         AV97Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97Pgmname", AV97Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV97Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("facturacion\\penalizaciones_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e2023L2 ();
      if (returnInSub) return;
   }

   public void e2023L2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV13Penalizaciones_SDT.fromJSonString(AV59Penalizaciones_Json2, null);
      gx_BV54 = true ;
      GXt_char1 = AV64Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      penalizaciones_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV64Station = GXt_char1 ;
      GXv_char2[0] = AV26EmprCod ;
      GXv_char3[0] = AV61EmprNom ;
      GXv_char4[0] = AV65UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV64Station, GXv_char2, GXv_char3, GXv_char4) ;
      penalizaciones_wc_impl.this.AV26EmprCod = GXv_char2[0] ;
      penalizaciones_wc_impl.this.AV61EmprNom = GXv_char3[0] ;
      penalizaciones_wc_impl.this.AV65UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26EmprCod", AV26EmprCod);
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV22DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV22DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      subgrid_gotopage( 1) ;
   }

   public void e2123L2( )
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
      if ( AV21ManageFiltersExecutionStep == 1 )
      {
         AV21ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21ManageFiltersExecutionStep", GXutil.str( AV21ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV21ManageFiltersExecutionStep == 2 )
      {
         AV21ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21ManageFiltersExecutionStep", GXutil.str( AV21ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV18Session.getValue("Facturacion.Penalizaciones_WCColumnsSelector"), "") != 0 )
      {
         AV14ColumnsSelectorXML = AV18Session.getValue("Facturacion.Penalizaciones_WCColumnsSelector") ;
         AV16ColumnsSelector.fromxml(AV14ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S142 ();
         if (returnInSub) return;
      }
      chkavPenalizaciones_sdt__seleccionar.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavPenalizaciones_sdt__seleccionar.getInternalname(), "Visible", GXutil.ltrimstr( chkavPenalizaciones_sdt__seleccionar.getVisible(), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__clicod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__clicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__clicod_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__barmancod1_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__barmancod1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__barmancod1_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__barcolnum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__barcolnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__barcolnum_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__barcolnom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__barcolnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__barcolnom_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__barcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__barcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__barcod_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__barcodreo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__barcodreo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__barcodreo_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__barcodpar_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__barcodpar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__barcodpar_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__albprocod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__albprocod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__albprocod_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__barkgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__barkgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__barkgm_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__baralbkgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__baralbkgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__baralbkgm_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__pmddtotin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__pmddtotin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__pmddtotin_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__pmddtoaca_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__pmddtoaca_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__pmddtoaca_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__pmdtinprc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__pmdtinprc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__pmdtinprc_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__pmdacaprc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__pmdacaprc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__pmdacaprc_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__precio_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__precio_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__precio_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__barprekgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__barprekgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__barprekgm_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__pmddsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__pmddsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__pmddsc_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__okkgmin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__okkgmin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__okkgmin_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavPenalizaciones_sdt__pmdpreuni_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPenalizaciones_sdt__pmdpreuni_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPenalizaciones_sdt__pmdpreuni_Visible), 5, 0), !bGXsfl_54_Refreshing);
      chkavPenalizaciones_sdt__baracc.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavPenalizaciones_sdt__baracc.getInternalname(), "Visible", GXutil.ltrimstr( chkavPenalizaciones_sdt__baracc.getVisible(), 5, 0), !bGXsfl_54_Refreshing);
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S152 ();
      if (returnInSub) return;
      AV24GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24GridCurrentPage), 10, 0));
      AV25GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25GridPageCount), 10, 0));
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16ColumnsSelector", AV16ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19ManageFiltersData", AV19ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e1323L2( )
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
         AV23PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV23PageToGo) ;
      }
   }

   public void e1423L2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e2223L2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV71GXV1 = 1 ;
      while ( AV71GXV1 <= AV13Penalizaciones_SDT.size() )
      {
         AV13Penalizaciones_SDT.currentItem( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(54) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_542( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_54_Refreshing )
         {
            httpContext.doAjaxLoad(54, GridRow);
         }
         AV71GXV1 = (int)(AV71GXV1+1) ;
      }
   }

   public void e1523L2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV14ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV16ColumnsSelector.fromJSonString(AV14ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "Facturacion.Penalizaciones_WCColumnsSelector", ((GXutil.strcmp("", AV14ColumnsSelectorXML)==0) ? "" : AV16ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16ColumnsSelector", AV16ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19ManageFiltersData", AV19ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e1223L2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("Facturacion.Penalizaciones_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV97Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV21ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21ManageFiltersExecutionStep", GXutil.str( AV21ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("Facturacion.Penalizaciones_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV21ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21ManageFiltersExecutionStep", GXutil.str( AV21ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV20ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "Facturacion.Penalizaciones_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         penalizaciones_wc_impl.this.GXt_char1 = GXv_char4[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV97Pgmname+"GridState", AV20ManageFiltersXml) ;
            AV10GridState.fromxml(AV20ManageFiltersXml, null, null);
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S172 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16ColumnsSelector", AV16ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19ManageFiltersData", AV19ManageFiltersData);
   }

   public void e1623L2( )
   {
      AV71GXV1 = (int)(nGXsfl_54_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV71GXV1 > 0 ) && ( AV13Penalizaciones_SDT.size() >= AV71GXV1 ) )
      {
         AV13Penalizaciones_SDT.currentItem( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)) );
      }
      /* Dvelop_confirmpanel_confirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_confirmar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFIRMAR' */
         S182 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV63ProgressIndicator", AV63ProgressIndicator);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13Penalizaciones_SDT", AV13Penalizaciones_SDT);
      nGXsfl_54_bak_idx = nGXsfl_54_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV21ManageFiltersExecutionStep, AV16ColumnsSelector, AV97Pgmname, AV12FilterFullText, AV26EmprCod, AV28Clicodfrom, AV29Clicodto, AV30Albprofchfrom, AV31Albprofchto, AV32Inbarmancod1, AV27InBarcolnom, AV50NoVerPen, AV59Penalizaciones_Json2, sPrefix) ;
      nGXsfl_54_idx = nGXsfl_54_bak_idx ;
      sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_542( ) ;
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16ColumnsSelector", AV16ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19ManageFiltersData", AV19ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e1723L2( )
   {
      AV71GXV1 = (int)(nGXsfl_54_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV71GXV1 > 0 ) && ( AV13Penalizaciones_SDT.size() >= AV71GXV1 ) )
      {
         AV13Penalizaciones_SDT.currentItem( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)) );
      }
      /* 'DoMarcarTodas' Routine */
      returnInSub = false ;
      AV33Var_seleccionar = (short)((byte)((true)?1:0)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Var_seleccionar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Var_seleccionar), 4, 0));
      /* Execute user subroutine: 'APLICOGRID' */
      S192 ();
      if (returnInSub) return;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13Penalizaciones_SDT", AV13Penalizaciones_SDT);
      nGXsfl_54_bak_idx = nGXsfl_54_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV21ManageFiltersExecutionStep, AV16ColumnsSelector, AV97Pgmname, AV12FilterFullText, AV26EmprCod, AV28Clicodfrom, AV29Clicodto, AV30Albprofchfrom, AV31Albprofchto, AV32Inbarmancod1, AV27InBarcolnom, AV50NoVerPen, AV59Penalizaciones_Json2, sPrefix) ;
      nGXsfl_54_idx = nGXsfl_54_bak_idx ;
      sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_542( ) ;
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16ColumnsSelector", AV16ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19ManageFiltersData", AV19ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e1823L2( )
   {
      AV71GXV1 = (int)(nGXsfl_54_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV71GXV1 > 0 ) && ( AV13Penalizaciones_SDT.size() >= AV71GXV1 ) )
      {
         AV13Penalizaciones_SDT.currentItem( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)) );
      }
      /* 'DoDesmarcarTodas' Routine */
      returnInSub = false ;
      AV33Var_seleccionar = (short)((byte)((false)?1:0)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Var_seleccionar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Var_seleccionar), 4, 0));
      /* Execute user subroutine: 'APLICOGRID' */
      S192 ();
      if (returnInSub) return;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13Penalizaciones_SDT", AV13Penalizaciones_SDT);
      nGXsfl_54_bak_idx = nGXsfl_54_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV21ManageFiltersExecutionStep, AV16ColumnsSelector, AV97Pgmname, AV12FilterFullText, AV26EmprCod, AV28Clicodfrom, AV29Clicodto, AV30Albprofchfrom, AV31Albprofchto, AV32Inbarmancod1, AV27InBarcolnom, AV50NoVerPen, AV59Penalizaciones_Json2, sPrefix) ;
      nGXsfl_54_idx = nGXsfl_54_bak_idx ;
      sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_542( ) ;
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16ColumnsSelector", AV16ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19ManageFiltersData", AV19ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e1923L2( )
   {
      AV71GXV1 = (int)(nGXsfl_54_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV71GXV1 > 0 ) && ( AV13Penalizaciones_SDT.size() >= AV71GXV1 ) )
      {
         AV13Penalizaciones_SDT.currentItem( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)) );
      }
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV53Penalizaciones_json = AV13Penalizaciones_SDT.toJSonString(false) ;
      AV54WebSession.setValue("&Penalizaciones_json", AV53Penalizaciones_json);
      GXv_char4[0] = AV51ExcelFilename ;
      GXv_char3[0] = AV52ErrorMessage ;
      new app.facturacion.penalizaciones_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      penalizaciones_wc_impl.this.AV51ExcelFilename = GXv_char4[0] ;
      penalizaciones_wc_impl.this.AV52ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV51ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV51ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV52ErrorMessage);
      }
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
      AV16ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Penalizaciones_SDT__Seleccionar", "", "Op", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Penalizaciones_SDT__Clicod", "", "Cliente", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Penalizaciones_SDT__Barmancod1", "", "Prog.", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Penalizaciones_SDT__Barcolnum", "", "#", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Penalizaciones_SDT__Barcolnom", "", "Nome Cor", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Penalizaciones_SDT__Barcod", "", "OS", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Penalizaciones_SDT__Barcodreo", "", "R", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Penalizaciones_SDT__Barcodpar", "", "P", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Penalizaciones_SDT__AlbProcod", "", "Nº Guia", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Penalizaciones_SDT__BarKgm", "", "Quilos OS", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Penalizaciones_SDT__Baralbkgm", "", "Quilos Guia", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Penalizaciones_SDT__PMDDtoTin", "", "Dto.Ting", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Penalizaciones_SDT__PMDDtoAca", "", "Dto.Aca", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Penalizaciones_SDT__PMDTinPrc", "", "Pen. Ting.", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Penalizaciones_SDT__PMDAcaPrc", "", "Pen. Aca.", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Penalizaciones_SDT__Precio", "", "Preço", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Penalizaciones_SDT__BarPreKgm", "", "Preço Guia", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Penalizaciones_SDT__PMDDsc", "", "Descriçao Prog.", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Penalizaciones_SDT__OkKgMin", "", "Ok Kg Min", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Penalizaciones_SDT__PMDPreUni", "", "Preço Unico", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Penalizaciones_SDT__BarAcc", "", "PU?", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV15UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Facturacion.Penalizaciones_WCColumnsSelector", GXv_char4) ;
      penalizaciones_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV15UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV15UserCustomValue)==0) ) )
      {
         AV17ColumnsSelectorAux.fromxml(AV15UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV17ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV16ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV17ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV16ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV19ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "Facturacion.Penalizaciones_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV19ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S162( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV12FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
   }

   public void S182( )
   {
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      AV63ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV63ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV63ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
      AV63ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV63ProgressIndicator.show();
      AV60CantidadRegistrosAProcesar = 0 ;
      AV99GXV28 = 1 ;
      while ( AV99GXV28 <= AV13Penalizaciones_SDT.size() )
      {
         AV35Item_Penalizaciones_SDT = (app.facturacion.SdtPenalizaciones_SDT_Item)((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV99GXV28));
         if ( AV35Item_Penalizaciones_SDT.getgxTv_SdtPenalizaciones_SDT_Item_Seleccionar() )
         {
            AV60CantidadRegistrosAProcesar = (int)(AV60CantidadRegistrosAProcesar+1) ;
         }
         AV99GXV28 = (int)(AV99GXV28+1) ;
      }
      if ( AV60CantidadRegistrosAProcesar == 0 )
      {
         AV60CantidadRegistrosAProcesar = 1 ;
      }
      AV36registrostrue = (short)(0) ;
      AV100GXV29 = 1 ;
      while ( AV100GXV29 <= AV13Penalizaciones_SDT.size() )
      {
         AV35Item_Penalizaciones_SDT = (app.facturacion.SdtPenalizaciones_SDT_Item)((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV100GXV29));
         if ( AV35Item_Penalizaciones_SDT.getgxTv_SdtPenalizaciones_SDT_Item_Seleccionar() )
         {
            AV37albprocod = AV35Item_Penalizaciones_SDT.getgxTv_SdtPenalizaciones_SDT_Item_Albprocod() ;
            AV38barcod = AV35Item_Penalizaciones_SDT.getgxTv_SdtPenalizaciones_SDT_Item_Barcod() ;
            AV39barcodreo = AV35Item_Penalizaciones_SDT.getgxTv_SdtPenalizaciones_SDT_Item_Barcodreo() ;
            AV40barcodpar = AV35Item_Penalizaciones_SDT.getgxTv_SdtPenalizaciones_SDT_Item_Barcodpar() ;
            AV43PMDDtoTin = AV35Item_Penalizaciones_SDT.getgxTv_SdtPenalizaciones_SDT_Item_Pmddtotin() ;
            AV41PMDDtoAca = AV35Item_Penalizaciones_SDT.getgxTv_SdtPenalizaciones_SDT_Item_Pmddtoaca() ;
            AV48Precio = AV35Item_Penalizaciones_SDT.getgxTv_SdtPenalizaciones_SDT_Item_Precio() ;
            AV46PMDTinPrc = AV35Item_Penalizaciones_SDT.getgxTv_SdtPenalizaciones_SDT_Item_Pmdtinprc() ;
            AV44PMDAcaPrc = AV35Item_Penalizaciones_SDT.getgxTv_SdtPenalizaciones_SDT_Item_Pmdacaprc() ;
            AV45PMDKgmMinS = AV35Item_Penalizaciones_SDT.getgxTv_SdtPenalizaciones_SDT_Item_Pmdkgmmins() ;
            AV47MtsMinS = AV35Item_Penalizaciones_SDT.getgxTv_SdtPenalizaciones_SDT_Item_Mtsmins() ;
            AV49OkKgMin = AV35Item_Penalizaciones_SDT.getgxTv_SdtPenalizaciones_SDT_Item_Okkgmin() ;
            AV42PMDPreUni = AV35Item_Penalizaciones_SDT.getgxTv_SdtPenalizaciones_SDT_Item_Pmdpreuni() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42PMDPreUni", GXutil.ltrimstr( AV42PMDPreUni, 14, 5));
            GXv_char4[0] = AV26EmprCod ;
            GXv_int12[0] = AV37albprocod ;
            GXv_int13[0] = AV38barcod ;
            GXv_int14[0] = AV39barcodreo ;
            GXv_char3[0] = AV40barcodpar ;
            GXv_decimal15[0] = AV43PMDDtoTin ;
            GXv_decimal16[0] = AV41PMDDtoAca ;
            GXv_decimal17[0] = AV48Precio ;
            GXv_decimal18[0] = AV46PMDTinPrc ;
            GXv_decimal19[0] = AV44PMDAcaPrc ;
            GXv_decimal20[0] = AV45PMDKgmMinS ;
            GXv_decimal21[0] = AV47MtsMinS ;
            GXv_int22[0] = AV49OkKgMin ;
            GXv_decimal23[0] = AV42PMDPreUni ;
            new app.pppadto(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_int13, GXv_int14, GXv_char3, GXv_decimal15, GXv_decimal16, GXv_decimal17, GXv_decimal18, GXv_decimal19, GXv_decimal20, GXv_decimal21, GXv_int22, GXv_decimal23) ;
            penalizaciones_wc_impl.this.AV26EmprCod = GXv_char4[0] ;
            penalizaciones_wc_impl.this.AV37albprocod = GXv_int12[0] ;
            penalizaciones_wc_impl.this.AV38barcod = GXv_int13[0] ;
            penalizaciones_wc_impl.this.AV39barcodreo = GXv_int14[0] ;
            penalizaciones_wc_impl.this.AV40barcodpar = GXv_char3[0] ;
            penalizaciones_wc_impl.this.AV43PMDDtoTin = GXv_decimal15[0] ;
            penalizaciones_wc_impl.this.AV41PMDDtoAca = GXv_decimal16[0] ;
            penalizaciones_wc_impl.this.AV48Precio = GXv_decimal17[0] ;
            penalizaciones_wc_impl.this.AV46PMDTinPrc = GXv_decimal18[0] ;
            penalizaciones_wc_impl.this.AV44PMDAcaPrc = GXv_decimal19[0] ;
            penalizaciones_wc_impl.this.AV45PMDKgmMinS = GXv_decimal20[0] ;
            penalizaciones_wc_impl.this.AV47MtsMinS = GXv_decimal21[0] ;
            penalizaciones_wc_impl.this.AV49OkKgMin = GXv_int22[0] ;
            penalizaciones_wc_impl.this.AV42PMDPreUni = GXv_decimal23[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26EmprCod", AV26EmprCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42PMDPreUni", GXutil.ltrimstr( AV42PMDPreUni, 14, 5));
            AV36registrostrue = (short)(AV36registrostrue+1) ;
            AV62Porcentaje = (short)((AV36registrostrue/ (double) (AV60CantidadRegistrosAProcesar))*100) ;
            AV63ProgressIndicator.setgxTv_SdtProgress_Value( AV62Porcentaje );
            AV63ProgressIndicator.showwithtitle(GXutil.format( httpContext.getMessage( "Procesando %1 de %2.", ""), GXutil.trim( GXutil.str( AV36registrostrue, 4, 0)), GXutil.trim( GXutil.str( AV60CantidadRegistrosAProcesar, 6, 0)), "", "", "", "", "", "", ""));
         }
         AV100GXV29 = (int)(AV100GXV29+1) ;
      }
      AV63ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV63ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado", ""));
      AV34i = GXutil.sleep( 1) ;
      AV63ProgressIndicator.hide();
      if ( AV36registrostrue > 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso Finalizado", ""));
         /* Execute user subroutine: 'BARRA' */
         S202 ();
         if (returnInSub) return;
         GXv_char4[0] = AV58var_json ;
         GXv_objcol_SdtPenalizaciones_SDT_Item24[0] = AV13Penalizaciones_SDT ;
         new app.facturacion.penalizaciones_cargar_sdt(remoteHandle, context).execute( AV26EmprCod, AV28Clicodfrom, AV29Clicodto, AV30Albprofchfrom, AV31Albprofchto, AV32Inbarmancod1, AV27InBarcolnom, AV50NoVerPen, GXv_char4, GXv_objcol_SdtPenalizaciones_SDT_Item24) ;
         penalizaciones_wc_impl.this.AV58var_json = GXv_char4[0] ;
         AV13Penalizaciones_SDT = GXv_objcol_SdtPenalizaciones_SDT_Item24[0] ;
         gx_BV54 = true ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No habia lineas seleccionadas", ""));
      }
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV18Session.getValue(AV97Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV97Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV18Session.getValue(AV97Pgmname+"GridState"), null, null);
      }
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S172 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S172( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV101GXV30 = 1 ;
      while ( AV101GXV30 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV101GXV30));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
         }
         AV101GXV30 = (int)(AV101GXV30+1) ;
      }
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV18Session.getValue(AV97Pgmname+"GridState"), null, null);
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState25[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV12FilterFullText)==0), (short)(0), AV12FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState25[0] ;
      if ( ! (GXutil.strcmp("", AV26EmprCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV26EmprCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV28Clicodfrom) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICODFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV28Clicodfrom, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV29Clicodto) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICODTO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV29Clicodto, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV30Albprofchfrom)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBPROFCHFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV30Albprofchfrom, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV31Albprofchto)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBPROFCHTO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV31Albprofchto, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV32Inbarmancod1) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&INBARMANCOD1" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV32Inbarmancod1, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV27InBarcolnom)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&INBARCOLNOM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV27InBarcolnom );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV50NoVerPen) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&NOVERPEN" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV50NoVerPen, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV59Penalizaciones_Json2)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PENALIZACIONES_JSON2" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV59Penalizaciones_Json2 );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV97Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S192( )
   {
      /* 'APLICOGRID' Routine */
      returnInSub = false ;
      AV34i = (short)(1) ;
      while ( AV34i <= AV13Penalizaciones_SDT.size() )
      {
         ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV34i)).setgxTv_SdtPenalizaciones_SDT_Item_Seleccionar( GXutil.toBoolean( AV33Var_seleccionar) );
         AV34i = (short)(AV34i+1) ;
      }
   }

   public void S202( )
   {
      /* 'BARRA' Routine */
      returnInSub = false ;
      AV63ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV63ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV63ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
      AV63ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV63ProgressIndicator.show();
      AV60CantidadRegistrosAProcesar = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV28Clicodfrom) ,
                                           Integer.valueOf(AV29Clicodto) ,
                                           AV30Albprofchfrom ,
                                           AV31Albprofchto ,
                                           AV27InBarcolnom ,
                                           Short.valueOf(AV32Inbarmancod1) ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A34AlbProfch ,
                                           A135BarColNom ,
                                           Short.valueOf(A3311BarManCod1) ,
                                           Byte.valueOf(A32AlbProEsp) ,
                                           A5253BarAcc ,
                                           Byte.valueOf(A33AlbProEst) ,
                                           A39AlbProPri ,
                                           Integer.valueOf(A2395BarAlbExt) ,
                                           Boolean.valueOf(A14267Fase_618) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      /* Using cursor H023L2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV28Clicodfrom), Integer.valueOf(AV29Clicodto), AV30Albprofchfrom, AV31Albprofchto, AV27InBarcolnom, Short.valueOf(AV32Inbarmancod1)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A33AlbProEst = H023L2_A33AlbProEst[0] ;
         A39AlbProPri = H023L2_A39AlbProPri[0] ;
         A2395BarAlbExt = H023L2_A2395BarAlbExt[0] ;
         n2395BarAlbExt = H023L2_n2395BarAlbExt[0] ;
         A5253BarAcc = H023L2_A5253BarAcc[0] ;
         A3311BarManCod1 = H023L2_A3311BarManCod1[0] ;
         A135BarColNom = H023L2_A135BarColNom[0] ;
         A32AlbProEsp = H023L2_A32AlbProEsp[0] ;
         A34AlbProfch = H023L2_A34AlbProfch[0] ;
         A1243GuiRemCli = H023L2_A1243GuiRemCli[0] ;
         A1262BarPreKgm = H023L2_A1262BarPreKgm[0] ;
         A1261BarAlbKgmE = H023L2_A1261BarAlbKgmE[0] ;
         A125BarAncAca1 = H023L2_A125BarAncAca1[0] ;
         A1263BarAlbMtrE = H023L2_A1263BarAlbMtrE[0] ;
         A30AlbProCod = H023L2_A30AlbProCod[0] ;
         A130BarCodPar = H023L2_A130BarCodPar[0] ;
         A132BarCodReo = H023L2_A132BarCodReo[0] ;
         A129BarCod = H023L2_A129BarCod[0] ;
         A396EmprCod = H023L2_A396EmprCod[0] ;
         A5253BarAcc = H023L2_A5253BarAcc[0] ;
         A3311BarManCod1 = H023L2_A3311BarManCod1[0] ;
         A135BarColNom = H023L2_A135BarColNom[0] ;
         A125BarAncAca1 = H023L2_A125BarAncAca1[0] ;
         A33AlbProEst = H023L2_A33AlbProEst[0] ;
         A39AlbProPri = H023L2_A39AlbProPri[0] ;
         A34AlbProfch = H023L2_A34AlbProfch[0] ;
         A1243GuiRemCli = H023L2_A1243GuiRemCli[0] ;
         GXt_boolean26 = A14267Fase_618 ;
         GXv_boolean27[0] = GXt_boolean26 ;
         new app.pedidosclientesindetalle.fase_618(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_boolean27) ;
         penalizaciones_wc_impl.this.GXt_boolean26 = GXv_boolean27[0] ;
         A14267Fase_618 = GXt_boolean26 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14267Fase_618", A14267Fase_618);
         if ( ! A14267Fase_618 )
         {
            GXv_decimal23[0] = AV48Precio ;
            GXv_decimal21[0] = AV66Kilos ;
            GXv_char4[0] = AV67PMDDsc ;
            GXv_decimal20[0] = AV43PMDDtoTin ;
            GXv_decimal19[0] = AV41PMDDtoAca ;
            GXv_decimal18[0] = AV46PMDTinPrc ;
            GXv_decimal17[0] = AV44PMDAcaPrc ;
            GXv_decimal16[0] = AV45PMDKgmMinS ;
            GXv_int22[0] = AV49OkKgMin ;
            GXv_decimal15[0] = A1262BarPreKgm ;
            new app.pppmd21(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal23, GXv_decimal21, "T", GXv_char4, GXv_decimal20, GXv_decimal19, GXv_decimal18, GXv_decimal17, GXv_decimal16, GXv_int22, GXv_decimal15, AV42PMDPreUni) ;
            penalizaciones_wc_impl.this.AV48Precio = GXv_decimal23[0] ;
            penalizaciones_wc_impl.this.AV66Kilos = GXv_decimal21[0] ;
            penalizaciones_wc_impl.this.AV67PMDDsc = GXv_char4[0] ;
            penalizaciones_wc_impl.this.AV43PMDDtoTin = GXv_decimal20[0] ;
            penalizaciones_wc_impl.this.AV41PMDDtoAca = GXv_decimal19[0] ;
            penalizaciones_wc_impl.this.AV46PMDTinPrc = GXv_decimal18[0] ;
            penalizaciones_wc_impl.this.AV44PMDAcaPrc = GXv_decimal17[0] ;
            penalizaciones_wc_impl.this.AV45PMDKgmMinS = GXv_decimal16[0] ;
            penalizaciones_wc_impl.this.AV49OkKgMin = GXv_int22[0] ;
            penalizaciones_wc_impl.this.A1262BarPreKgm = GXv_decimal15[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1262BarPreKgm", GXutil.ltrimstr( A1262BarPreKgm, 13, 5));
            GXv_decimal23[0] = AV47MtsMinS ;
            new app.facturacion.pmtsmins(remoteHandle, context).execute( AV45PMDKgmMinS, A1261BarAlbKgmE, AV49OkKgMin, A125BarAncAca1, A1263BarAlbMtrE, GXv_decimal23) ;
            penalizaciones_wc_impl.this.AV47MtsMinS = GXv_decimal23[0] ;
            if ( ( ( A3311BarManCod1 > 0 ) ) || ( ( DecimalUtil.compareTo(AV48Precio, A1262BarPreKgm) != 0 ) ) || ( ( AV46PMDTinPrc.doubleValue() != 0 ) ) || ( ( AV44PMDAcaPrc.doubleValue() != 0 ) ) || ( ( AV45PMDKgmMinS.doubleValue() != 0 ) ) || ( ( AV49OkKgMin == 1 ) ) )
            {
               if ( ( A3311BarManCod1 == 0 ) && ( AV50NoVerPen == 1 ) )
               {
               }
               else
               {
                  AV60CantidadRegistrosAProcesar = (int)(AV60CantidadRegistrosAProcesar+1) ;
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV60CantidadRegistrosAProcesar == 0 )
      {
         AV60CantidadRegistrosAProcesar = 1 ;
      }
      AV68CantidadRegistrosProcesados = 0 ;
      AV34i = (short)(1) ;
      while ( AV34i <= AV60CantidadRegistrosAProcesar )
      {
         AV68CantidadRegistrosProcesados = (int)(AV68CantidadRegistrosProcesados+1) ;
         AV62Porcentaje = (short)((AV68CantidadRegistrosProcesados/ (double) (AV60CantidadRegistrosAProcesar))*100) ;
         AV63ProgressIndicator.setgxTv_SdtProgress_Value( AV62Porcentaje );
         AV63ProgressIndicator.showwithtitle(GXutil.format( httpContext.getMessage( "Procesando %1 de %2.", ""), GXutil.trim( GXutil.str( AV68CantidadRegistrosProcesados, 6, 0)), GXutil.trim( GXutil.str( AV60CantidadRegistrosAProcesar, 6, 0)), "", "", "", "", "", "", ""));
         AV34i = (short)(AV34i+1) ;
         AV34i = (short)(AV34i+1) ;
      }
      AV63ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV63ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado", ""));
      AV34i = GXutil.sleep( 1) ;
      AV63ProgressIndicator.hide();
   }

   public void wb_table2_95_23L2( boolean wbgen )
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
         ucDvelop_confirmpanel_confirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_confirmar_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_95_23L2e( true) ;
      }
      else
      {
         wb_table2_95_23L2e( false) ;
      }
   }

   public void wb_table1_21_23L2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV19ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_26_23L2( true) ;
      }
      else
      {
         wb_table3_26_23L2( false) ;
      }
      return  ;
   }

   public void wb_table3_26_23L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_21_23L2e( true) ;
      }
      else
      {
         wb_table1_21_23L2e( false) ;
      }
   }

   public void wb_table3_26_23L2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'" + sPrefix + "',false,'" + sGXsfl_54_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV12FilterFullText, GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_Facturacion\\Penalizaciones_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_26_23L2e( true) ;
      }
      else
      {
         wb_table3_26_23L2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV26EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26EmprCod", AV26EmprCod);
      AV28Clicodfrom = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Clicodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Clicodfrom), 6, 0));
      AV29Clicodto = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Clicodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Clicodto), 6, 0));
      AV30Albprofchfrom = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Albprofchfrom", localUtil.format(AV30Albprofchfrom, "99/99/99"));
      AV31Albprofchto = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31Albprofchto", localUtil.format(AV31Albprofchto, "99/99/99"));
      AV32Inbarmancod1 = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Inbarmancod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Inbarmancod1), 4, 0));
      AV27InBarcolnom = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27InBarcolnom", AV27InBarcolnom);
      AV50NoVerPen = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50NoVerPen", GXutil.str( AV50NoVerPen, 1, 0));
      AV59Penalizaciones_Json2 = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Penalizaciones_Json2", AV59Penalizaciones_Json2);
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
      pa23L2( ) ;
      ws23L2( ) ;
      we23L2( ) ;
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
      sCtrlAV28Clicodfrom = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV29Clicodto = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV30Albprofchfrom = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV31Albprofchto = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV32Inbarmancod1 = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV27InBarcolnom = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV50NoVerPen = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV59Penalizaciones_Json2 = (String)getParm(obj,8,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa23L2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "facturacion\\penalizaciones_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa23L2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV26EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26EmprCod", AV26EmprCod);
         AV28Clicodfrom = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Clicodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Clicodfrom), 6, 0));
         AV29Clicodto = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Clicodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Clicodto), 6, 0));
         AV30Albprofchfrom = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Albprofchfrom", localUtil.format(AV30Albprofchfrom, "99/99/99"));
         AV31Albprofchto = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31Albprofchto", localUtil.format(AV31Albprofchto, "99/99/99"));
         AV32Inbarmancod1 = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Inbarmancod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Inbarmancod1), 4, 0));
         AV27InBarcolnom = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27InBarcolnom", AV27InBarcolnom);
         AV50NoVerPen = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50NoVerPen", GXutil.str( AV50NoVerPen, 1, 0));
         AV59Penalizaciones_Json2 = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Penalizaciones_Json2", AV59Penalizaciones_Json2);
      }
      wcpOAV26EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV26EmprCod") ;
      wcpOAV28Clicodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV28Clicodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV29Clicodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV29Clicodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV30Albprofchfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV30Albprofchfrom"), 0) ;
      wcpOAV31Albprofchto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV31Albprofchto"), 0) ;
      wcpOAV32Inbarmancod1 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV32Inbarmancod1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV27InBarcolnom = httpContext.cgiGet( sPrefix+"wcpOAV27InBarcolnom") ;
      wcpOAV50NoVerPen = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV50NoVerPen"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV59Penalizaciones_Json2 = httpContext.cgiGet( sPrefix+"wcpOAV59Penalizaciones_Json2") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV26EmprCod, wcpOAV26EmprCod) != 0 ) || ( AV28Clicodfrom != wcpOAV28Clicodfrom ) || ( AV29Clicodto != wcpOAV29Clicodto ) || !( GXutil.dateCompare(GXutil.resetTime(AV30Albprofchfrom), GXutil.resetTime(wcpOAV30Albprofchfrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV31Albprofchto), GXutil.resetTime(wcpOAV31Albprofchto)) ) || ( AV32Inbarmancod1 != wcpOAV32Inbarmancod1 ) || ( GXutil.strcmp(AV27InBarcolnom, wcpOAV27InBarcolnom) != 0 ) || ( AV50NoVerPen != wcpOAV50NoVerPen ) || ( GXutil.strcmp(AV59Penalizaciones_Json2, wcpOAV59Penalizaciones_Json2) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV26EmprCod = AV26EmprCod ;
      wcpOAV28Clicodfrom = AV28Clicodfrom ;
      wcpOAV29Clicodto = AV29Clicodto ;
      wcpOAV30Albprofchfrom = AV30Albprofchfrom ;
      wcpOAV31Albprofchto = AV31Albprofchto ;
      wcpOAV32Inbarmancod1 = AV32Inbarmancod1 ;
      wcpOAV27InBarcolnom = AV27InBarcolnom ;
      wcpOAV50NoVerPen = AV50NoVerPen ;
      wcpOAV59Penalizaciones_Json2 = AV59Penalizaciones_Json2 ;
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
      sCtrlAV28Clicodfrom = httpContext.cgiGet( sPrefix+"AV28Clicodfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV28Clicodfrom) > 0 )
      {
         AV28Clicodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV28Clicodfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Clicodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Clicodfrom), 6, 0));
      }
      else
      {
         AV28Clicodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV28Clicodfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV29Clicodto = httpContext.cgiGet( sPrefix+"AV29Clicodto_CTRL") ;
      if ( GXutil.len( sCtrlAV29Clicodto) > 0 )
      {
         AV29Clicodto = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV29Clicodto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Clicodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Clicodto), 6, 0));
      }
      else
      {
         AV29Clicodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV29Clicodto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV30Albprofchfrom = httpContext.cgiGet( sPrefix+"AV30Albprofchfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV30Albprofchfrom) > 0 )
      {
         AV30Albprofchfrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV30Albprofchfrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Albprofchfrom", localUtil.format(AV30Albprofchfrom, "99/99/99"));
      }
      else
      {
         AV30Albprofchfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV30Albprofchfrom_PARM"), 0) ;
      }
      sCtrlAV31Albprofchto = httpContext.cgiGet( sPrefix+"AV31Albprofchto_CTRL") ;
      if ( GXutil.len( sCtrlAV31Albprofchto) > 0 )
      {
         AV31Albprofchto = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV31Albprofchto), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31Albprofchto", localUtil.format(AV31Albprofchto, "99/99/99"));
      }
      else
      {
         AV31Albprofchto = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV31Albprofchto_PARM"), 0) ;
      }
      sCtrlAV32Inbarmancod1 = httpContext.cgiGet( sPrefix+"AV32Inbarmancod1_CTRL") ;
      if ( GXutil.len( sCtrlAV32Inbarmancod1) > 0 )
      {
         AV32Inbarmancod1 = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV32Inbarmancod1), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Inbarmancod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Inbarmancod1), 4, 0));
      }
      else
      {
         AV32Inbarmancod1 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV32Inbarmancod1_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV27InBarcolnom = httpContext.cgiGet( sPrefix+"AV27InBarcolnom_CTRL") ;
      if ( GXutil.len( sCtrlAV27InBarcolnom) > 0 )
      {
         AV27InBarcolnom = httpContext.cgiGet( sCtrlAV27InBarcolnom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27InBarcolnom", AV27InBarcolnom);
      }
      else
      {
         AV27InBarcolnom = httpContext.cgiGet( sPrefix+"AV27InBarcolnom_PARM") ;
      }
      sCtrlAV50NoVerPen = httpContext.cgiGet( sPrefix+"AV50NoVerPen_CTRL") ;
      if ( GXutil.len( sCtrlAV50NoVerPen) > 0 )
      {
         AV50NoVerPen = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV50NoVerPen), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50NoVerPen", GXutil.str( AV50NoVerPen, 1, 0));
      }
      else
      {
         AV50NoVerPen = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV50NoVerPen_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV59Penalizaciones_Json2 = httpContext.cgiGet( sPrefix+"AV59Penalizaciones_Json2_CTRL") ;
      if ( GXutil.len( sCtrlAV59Penalizaciones_Json2) > 0 )
      {
         AV59Penalizaciones_Json2 = httpContext.cgiGet( sCtrlAV59Penalizaciones_Json2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59Penalizaciones_Json2", AV59Penalizaciones_Json2);
      }
      else
      {
         AV59Penalizaciones_Json2 = httpContext.cgiGet( sPrefix+"AV59Penalizaciones_Json2_PARM") ;
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
      pa23L2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws23L2( ) ;
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
      ws23L2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28Clicodfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV28Clicodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV28Clicodfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28Clicodfrom_CTRL", GXutil.rtrim( sCtrlAV28Clicodfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29Clicodto_PARM", GXutil.ltrim( localUtil.ntoc( AV29Clicodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV29Clicodto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29Clicodto_CTRL", GXutil.rtrim( sCtrlAV29Clicodto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30Albprofchfrom_PARM", localUtil.dtoc( AV30Albprofchfrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV30Albprofchfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30Albprofchfrom_CTRL", GXutil.rtrim( sCtrlAV30Albprofchfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31Albprofchto_PARM", localUtil.dtoc( AV31Albprofchto, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV31Albprofchto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31Albprofchto_CTRL", GXutil.rtrim( sCtrlAV31Albprofchto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32Inbarmancod1_PARM", GXutil.ltrim( localUtil.ntoc( AV32Inbarmancod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV32Inbarmancod1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32Inbarmancod1_CTRL", GXutil.rtrim( sCtrlAV32Inbarmancod1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27InBarcolnom_PARM", GXutil.rtrim( AV27InBarcolnom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV27InBarcolnom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27InBarcolnom_CTRL", GXutil.rtrim( sCtrlAV27InBarcolnom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV50NoVerPen_PARM", GXutil.ltrim( localUtil.ntoc( AV50NoVerPen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV50NoVerPen)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV50NoVerPen_CTRL", GXutil.rtrim( sCtrlAV50NoVerPen));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59Penalizaciones_Json2_PARM", AV59Penalizaciones_Json2);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV59Penalizaciones_Json2)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59Penalizaciones_Json2_CTRL", GXutil.rtrim( sCtrlAV59Penalizaciones_Json2));
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
      we23L2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115554497", true, true);
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
      httpContext.AddJavascriptSource("facturacion/penalizaciones_wc.js", "?202682115554498", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_542( )
   {
      chkavPenalizaciones_sdt__seleccionar.setInternalname( sPrefix+"PENALIZACIONES_SDT__SELECCIONAR_"+sGXsfl_54_idx );
      edtavPenalizaciones_sdt__clicod_Internalname = sPrefix+"PENALIZACIONES_SDT__CLICOD_"+sGXsfl_54_idx ;
      edtavPenalizaciones_sdt__barmancod1_Internalname = sPrefix+"PENALIZACIONES_SDT__BARMANCOD1_"+sGXsfl_54_idx ;
      edtavPenalizaciones_sdt__barcolnum_Internalname = sPrefix+"PENALIZACIONES_SDT__BARCOLNUM_"+sGXsfl_54_idx ;
      edtavPenalizaciones_sdt__barcolnom_Internalname = sPrefix+"PENALIZACIONES_SDT__BARCOLNOM_"+sGXsfl_54_idx ;
      edtavPenalizaciones_sdt__barcod_Internalname = sPrefix+"PENALIZACIONES_SDT__BARCOD_"+sGXsfl_54_idx ;
      edtavPenalizaciones_sdt__barcodreo_Internalname = sPrefix+"PENALIZACIONES_SDT__BARCODREO_"+sGXsfl_54_idx ;
      edtavPenalizaciones_sdt__barcodpar_Internalname = sPrefix+"PENALIZACIONES_SDT__BARCODPAR_"+sGXsfl_54_idx ;
      edtavPenalizaciones_sdt__albprocod_Internalname = sPrefix+"PENALIZACIONES_SDT__ALBPROCOD_"+sGXsfl_54_idx ;
      edtavPenalizaciones_sdt__barkgm_Internalname = sPrefix+"PENALIZACIONES_SDT__BARKGM_"+sGXsfl_54_idx ;
      edtavPenalizaciones_sdt__baralbkgm_Internalname = sPrefix+"PENALIZACIONES_SDT__BARALBKGM_"+sGXsfl_54_idx ;
      edtavPenalizaciones_sdt__pmddtotin_Internalname = sPrefix+"PENALIZACIONES_SDT__PMDDTOTIN_"+sGXsfl_54_idx ;
      edtavPenalizaciones_sdt__pmddtoaca_Internalname = sPrefix+"PENALIZACIONES_SDT__PMDDTOACA_"+sGXsfl_54_idx ;
      edtavPenalizaciones_sdt__pmdtinprc_Internalname = sPrefix+"PENALIZACIONES_SDT__PMDTINPRC_"+sGXsfl_54_idx ;
      edtavPenalizaciones_sdt__pmdacaprc_Internalname = sPrefix+"PENALIZACIONES_SDT__PMDACAPRC_"+sGXsfl_54_idx ;
      edtavPenalizaciones_sdt__precio_Internalname = sPrefix+"PENALIZACIONES_SDT__PRECIO_"+sGXsfl_54_idx ;
      edtavPenalizaciones_sdt__barprekgm_Internalname = sPrefix+"PENALIZACIONES_SDT__BARPREKGM_"+sGXsfl_54_idx ;
      edtavPenalizaciones_sdt__clinom_Internalname = sPrefix+"PENALIZACIONES_SDT__CLINOM_"+sGXsfl_54_idx ;
      edtavPenalizaciones_sdt__pmddsc_Internalname = sPrefix+"PENALIZACIONES_SDT__PMDDSC_"+sGXsfl_54_idx ;
      edtavPenalizaciones_sdt__okkgmin_Internalname = sPrefix+"PENALIZACIONES_SDT__OKKGMIN_"+sGXsfl_54_idx ;
      edtavPenalizaciones_sdt__pmdpreuni_Internalname = sPrefix+"PENALIZACIONES_SDT__PMDPREUNI_"+sGXsfl_54_idx ;
      chkavPenalizaciones_sdt__baracc.setInternalname( sPrefix+"PENALIZACIONES_SDT__BARACC_"+sGXsfl_54_idx );
      chkavPenalizaciones_sdt__fase_618.setInternalname( sPrefix+"PENALIZACIONES_SDT__FASE_618_"+sGXsfl_54_idx );
      edtavPenalizaciones_sdt__mtsmins_Internalname = sPrefix+"PENALIZACIONES_SDT__MTSMINS_"+sGXsfl_54_idx ;
      edtavPenalizaciones_sdt__pmdkgmmins_Internalname = sPrefix+"PENALIZACIONES_SDT__PMDKGMMINS_"+sGXsfl_54_idx ;
   }

   public void subsflControlProps_fel_542( )
   {
      chkavPenalizaciones_sdt__seleccionar.setInternalname( sPrefix+"PENALIZACIONES_SDT__SELECCIONAR_"+sGXsfl_54_fel_idx );
      edtavPenalizaciones_sdt__clicod_Internalname = sPrefix+"PENALIZACIONES_SDT__CLICOD_"+sGXsfl_54_fel_idx ;
      edtavPenalizaciones_sdt__barmancod1_Internalname = sPrefix+"PENALIZACIONES_SDT__BARMANCOD1_"+sGXsfl_54_fel_idx ;
      edtavPenalizaciones_sdt__barcolnum_Internalname = sPrefix+"PENALIZACIONES_SDT__BARCOLNUM_"+sGXsfl_54_fel_idx ;
      edtavPenalizaciones_sdt__barcolnom_Internalname = sPrefix+"PENALIZACIONES_SDT__BARCOLNOM_"+sGXsfl_54_fel_idx ;
      edtavPenalizaciones_sdt__barcod_Internalname = sPrefix+"PENALIZACIONES_SDT__BARCOD_"+sGXsfl_54_fel_idx ;
      edtavPenalizaciones_sdt__barcodreo_Internalname = sPrefix+"PENALIZACIONES_SDT__BARCODREO_"+sGXsfl_54_fel_idx ;
      edtavPenalizaciones_sdt__barcodpar_Internalname = sPrefix+"PENALIZACIONES_SDT__BARCODPAR_"+sGXsfl_54_fel_idx ;
      edtavPenalizaciones_sdt__albprocod_Internalname = sPrefix+"PENALIZACIONES_SDT__ALBPROCOD_"+sGXsfl_54_fel_idx ;
      edtavPenalizaciones_sdt__barkgm_Internalname = sPrefix+"PENALIZACIONES_SDT__BARKGM_"+sGXsfl_54_fel_idx ;
      edtavPenalizaciones_sdt__baralbkgm_Internalname = sPrefix+"PENALIZACIONES_SDT__BARALBKGM_"+sGXsfl_54_fel_idx ;
      edtavPenalizaciones_sdt__pmddtotin_Internalname = sPrefix+"PENALIZACIONES_SDT__PMDDTOTIN_"+sGXsfl_54_fel_idx ;
      edtavPenalizaciones_sdt__pmddtoaca_Internalname = sPrefix+"PENALIZACIONES_SDT__PMDDTOACA_"+sGXsfl_54_fel_idx ;
      edtavPenalizaciones_sdt__pmdtinprc_Internalname = sPrefix+"PENALIZACIONES_SDT__PMDTINPRC_"+sGXsfl_54_fel_idx ;
      edtavPenalizaciones_sdt__pmdacaprc_Internalname = sPrefix+"PENALIZACIONES_SDT__PMDACAPRC_"+sGXsfl_54_fel_idx ;
      edtavPenalizaciones_sdt__precio_Internalname = sPrefix+"PENALIZACIONES_SDT__PRECIO_"+sGXsfl_54_fel_idx ;
      edtavPenalizaciones_sdt__barprekgm_Internalname = sPrefix+"PENALIZACIONES_SDT__BARPREKGM_"+sGXsfl_54_fel_idx ;
      edtavPenalizaciones_sdt__clinom_Internalname = sPrefix+"PENALIZACIONES_SDT__CLINOM_"+sGXsfl_54_fel_idx ;
      edtavPenalizaciones_sdt__pmddsc_Internalname = sPrefix+"PENALIZACIONES_SDT__PMDDSC_"+sGXsfl_54_fel_idx ;
      edtavPenalizaciones_sdt__okkgmin_Internalname = sPrefix+"PENALIZACIONES_SDT__OKKGMIN_"+sGXsfl_54_fel_idx ;
      edtavPenalizaciones_sdt__pmdpreuni_Internalname = sPrefix+"PENALIZACIONES_SDT__PMDPREUNI_"+sGXsfl_54_fel_idx ;
      chkavPenalizaciones_sdt__baracc.setInternalname( sPrefix+"PENALIZACIONES_SDT__BARACC_"+sGXsfl_54_fel_idx );
      chkavPenalizaciones_sdt__fase_618.setInternalname( sPrefix+"PENALIZACIONES_SDT__FASE_618_"+sGXsfl_54_fel_idx );
      edtavPenalizaciones_sdt__mtsmins_Internalname = sPrefix+"PENALIZACIONES_SDT__MTSMINS_"+sGXsfl_54_fel_idx ;
      edtavPenalizaciones_sdt__pmdkgmmins_Internalname = sPrefix+"PENALIZACIONES_SDT__PMDKGMMINS_"+sGXsfl_54_fel_idx ;
   }

   public void sendrow_542( )
   {
      subsflControlProps_542( ) ;
      wb23L0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_54_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_54_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_54_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavPenalizaciones_sdt__seleccionar.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavPenalizaciones_sdt__seleccionar.getEnabled()!=0)&&(chkavPenalizaciones_sdt__seleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 55,'"+sPrefix+"',false,'"+sGXsfl_54_idx+"',54)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "PENALIZACIONES_SDT__SELECCIONAR_" + sGXsfl_54_idx ;
         chkavPenalizaciones_sdt__seleccionar.setName( GXCCtl );
         chkavPenalizaciones_sdt__seleccionar.setWebtags( "" );
         chkavPenalizaciones_sdt__seleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavPenalizaciones_sdt__seleccionar.getInternalname(), "TitleCaption", chkavPenalizaciones_sdt__seleccionar.getCaption(), !bGXsfl_54_Refreshing);
         chkavPenalizaciones_sdt__seleccionar.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavPenalizaciones_sdt__seleccionar.getInternalname(),GXutil.booltostr( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Seleccionar()),"","",Integer.valueOf(chkavPenalizaciones_sdt__seleccionar.getVisible()),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(55, this, 'true', 'false',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+((chkavPenalizaciones_sdt__seleccionar.getEnabled()!=0)&&(chkavPenalizaciones_sdt__seleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,55);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPenalizaciones_sdt__clicod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPenalizaciones_sdt__clicod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Clicod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPenalizaciones_sdt__clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Clicod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Clicod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPenalizaciones_sdt__clicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPenalizaciones_sdt__clicod_Visible),Integer.valueOf(edtavPenalizaciones_sdt__clicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPenalizaciones_sdt__barmancod1_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPenalizaciones_sdt__barmancod1_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Barmancod1(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPenalizaciones_sdt__barmancod1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Barmancod1()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Barmancod1()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPenalizaciones_sdt__barmancod1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPenalizaciones_sdt__barmancod1_Visible),Integer.valueOf(edtavPenalizaciones_sdt__barmancod1_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPenalizaciones_sdt__barcolnum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPenalizaciones_sdt__barcolnum_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Barcolnum(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPenalizaciones_sdt__barcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Barcolnum()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Barcolnum()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPenalizaciones_sdt__barcolnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPenalizaciones_sdt__barcolnum_Visible),Integer.valueOf(edtavPenalizaciones_sdt__barcolnum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavPenalizaciones_sdt__barcolnom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPenalizaciones_sdt__barcolnom_Internalname,GXutil.rtrim( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Barcolnom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPenalizaciones_sdt__barcolnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPenalizaciones_sdt__barcolnom_Visible),Integer.valueOf(edtavPenalizaciones_sdt__barcolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPenalizaciones_sdt__barcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPenalizaciones_sdt__barcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Barcod(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPenalizaciones_sdt__barcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Barcod()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Barcod()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPenalizaciones_sdt__barcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPenalizaciones_sdt__barcod_Visible),Integer.valueOf(edtavPenalizaciones_sdt__barcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPenalizaciones_sdt__barcodreo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPenalizaciones_sdt__barcodreo_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Barcodreo(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPenalizaciones_sdt__barcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Barcodreo()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Barcodreo()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPenalizaciones_sdt__barcodreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPenalizaciones_sdt__barcodreo_Visible),Integer.valueOf(edtavPenalizaciones_sdt__barcodreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavPenalizaciones_sdt__barcodpar_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPenalizaciones_sdt__barcodpar_Internalname,GXutil.rtrim( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Barcodpar()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPenalizaciones_sdt__barcodpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPenalizaciones_sdt__barcodpar_Visible),Integer.valueOf(edtavPenalizaciones_sdt__barcodpar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPenalizaciones_sdt__albprocod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPenalizaciones_sdt__albprocod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Albprocod(), (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPenalizaciones_sdt__albprocod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Albprocod()), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Albprocod()), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPenalizaciones_sdt__albprocod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPenalizaciones_sdt__albprocod_Visible),Integer.valueOf(edtavPenalizaciones_sdt__albprocod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPenalizaciones_sdt__barkgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPenalizaciones_sdt__barkgm_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Barkgm(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPenalizaciones_sdt__barkgm_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Barkgm(), "ZZZZZ9.99") : localUtil.format( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Barkgm(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPenalizaciones_sdt__barkgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPenalizaciones_sdt__barkgm_Visible),Integer.valueOf(edtavPenalizaciones_sdt__barkgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPenalizaciones_sdt__baralbkgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPenalizaciones_sdt__baralbkgm_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Baralbkgm(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPenalizaciones_sdt__baralbkgm_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Baralbkgm(), "ZZZZZ9.99") : localUtil.format( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Baralbkgm(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPenalizaciones_sdt__baralbkgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPenalizaciones_sdt__baralbkgm_Visible),Integer.valueOf(edtavPenalizaciones_sdt__baralbkgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPenalizaciones_sdt__pmddtotin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPenalizaciones_sdt__pmddtotin_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Pmddtotin(), (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPenalizaciones_sdt__pmddtotin_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Pmddtotin(), "ZZ9.99 ") : localUtil.format( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Pmddtotin(), "ZZ9.99 "))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPenalizaciones_sdt__pmddtotin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPenalizaciones_sdt__pmddtotin_Visible),Integer.valueOf(edtavPenalizaciones_sdt__pmddtotin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPenalizaciones_sdt__pmddtoaca_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPenalizaciones_sdt__pmddtoaca_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Pmddtoaca(), (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPenalizaciones_sdt__pmddtoaca_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Pmddtoaca(), "ZZ9.99") : localUtil.format( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Pmddtoaca(), "ZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPenalizaciones_sdt__pmddtoaca_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPenalizaciones_sdt__pmddtoaca_Visible),Integer.valueOf(edtavPenalizaciones_sdt__pmddtoaca_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPenalizaciones_sdt__pmdtinprc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPenalizaciones_sdt__pmdtinprc_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Pmdtinprc(), (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPenalizaciones_sdt__pmdtinprc_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Pmdtinprc(), "ZZ9.99") : localUtil.format( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Pmdtinprc(), "ZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPenalizaciones_sdt__pmdtinprc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPenalizaciones_sdt__pmdtinprc_Visible),Integer.valueOf(edtavPenalizaciones_sdt__pmdtinprc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPenalizaciones_sdt__pmdacaprc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPenalizaciones_sdt__pmdacaprc_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Pmdacaprc(), (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPenalizaciones_sdt__pmdacaprc_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Pmdacaprc(), "ZZ9.99") : localUtil.format( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Pmdacaprc(), "ZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPenalizaciones_sdt__pmdacaprc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPenalizaciones_sdt__pmdacaprc_Visible),Integer.valueOf(edtavPenalizaciones_sdt__pmdacaprc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPenalizaciones_sdt__precio_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPenalizaciones_sdt__precio_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Precio(), (byte)(9), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPenalizaciones_sdt__precio_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Precio(), "ZZZZ9.999") : localUtil.format( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Precio(), "ZZZZ9.999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPenalizaciones_sdt__precio_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPenalizaciones_sdt__precio_Visible),Integer.valueOf(edtavPenalizaciones_sdt__precio_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPenalizaciones_sdt__barprekgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPenalizaciones_sdt__barprekgm_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Barprekgm(), (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPenalizaciones_sdt__barprekgm_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Barprekgm(), "ZZZZZZ9.999") : localUtil.format( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Barprekgm(), "ZZZZZZ9.999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPenalizaciones_sdt__barprekgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPenalizaciones_sdt__barprekgm_Visible),Integer.valueOf(edtavPenalizaciones_sdt__barprekgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPenalizaciones_sdt__clinom_Internalname,GXutil.rtrim( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Clinom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPenalizaciones_sdt__clinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavPenalizaciones_sdt__clinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavPenalizaciones_sdt__pmddsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPenalizaciones_sdt__pmddsc_Internalname,GXutil.rtrim( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Pmddsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPenalizaciones_sdt__pmddsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPenalizaciones_sdt__pmddsc_Visible),Integer.valueOf(edtavPenalizaciones_sdt__pmddsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPenalizaciones_sdt__okkgmin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPenalizaciones_sdt__okkgmin_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Okkgmin(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPenalizaciones_sdt__okkgmin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Okkgmin()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Okkgmin()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPenalizaciones_sdt__okkgmin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPenalizaciones_sdt__okkgmin_Visible),Integer.valueOf(edtavPenalizaciones_sdt__okkgmin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPenalizaciones_sdt__pmdpreuni_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPenalizaciones_sdt__pmdpreuni_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Pmdpreuni(), (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPenalizaciones_sdt__pmdpreuni_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Pmdpreuni(), "ZZZZZZ9.999") : localUtil.format( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Pmdpreuni(), "ZZZZZZ9.999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPenalizaciones_sdt__pmdpreuni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPenalizaciones_sdt__pmdpreuni_Visible),Integer.valueOf(edtavPenalizaciones_sdt__pmdpreuni_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavPenalizaciones_sdt__baracc.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "PENALIZACIONES_SDT__BARACC_" + sGXsfl_54_idx ;
         chkavPenalizaciones_sdt__baracc.setName( GXCCtl );
         chkavPenalizaciones_sdt__baracc.setWebtags( "" );
         chkavPenalizaciones_sdt__baracc.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavPenalizaciones_sdt__baracc.getInternalname(), "TitleCaption", chkavPenalizaciones_sdt__baracc.getCaption(), !bGXsfl_54_Refreshing);
         chkavPenalizaciones_sdt__baracc.setCheckedValue( "N" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavPenalizaciones_sdt__baracc.getInternalname(),((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Baracc(),"","",Integer.valueOf(chkavPenalizaciones_sdt__baracc.getVisible()),Integer.valueOf(chkavPenalizaciones_sdt__baracc.getEnabled()),"S","",StyleString,ClassString,"WWColumn","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "PENALIZACIONES_SDT__FASE_618_" + sGXsfl_54_idx ;
         chkavPenalizaciones_sdt__fase_618.setName( GXCCtl );
         chkavPenalizaciones_sdt__fase_618.setWebtags( "" );
         chkavPenalizaciones_sdt__fase_618.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavPenalizaciones_sdt__fase_618.getInternalname(), "TitleCaption", chkavPenalizaciones_sdt__fase_618.getCaption(), !bGXsfl_54_Refreshing);
         chkavPenalizaciones_sdt__fase_618.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavPenalizaciones_sdt__fase_618.getInternalname(),GXutil.booltostr( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Fase_618()),"","",Integer.valueOf(0),Integer.valueOf(chkavPenalizaciones_sdt__fase_618.getEnabled()),"true","",StyleString,ClassString,"WWColumn","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPenalizaciones_sdt__mtsmins_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Mtsmins(), (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPenalizaciones_sdt__mtsmins_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Mtsmins(), "ZZZ9.99") : localUtil.format( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Mtsmins(), "ZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPenalizaciones_sdt__mtsmins_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavPenalizaciones_sdt__mtsmins_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPenalizaciones_sdt__pmdkgmmins_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Pmdkgmmins(), (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPenalizaciones_sdt__pmdkgmmins_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Pmdkgmmins(), "ZZZ9.99") : localUtil.format( ((app.facturacion.SdtPenalizaciones_SDT_Item)AV13Penalizaciones_SDT.elementAt(-1+AV71GXV1)).getgxTv_SdtPenalizaciones_SDT_Item_Pmdkgmmins(), "ZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPenalizaciones_sdt__pmdkgmmins_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavPenalizaciones_sdt__pmdkgmmins_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes23L2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_54_idx = ((subGrid_Islastpage==1)&&(nGXsfl_54_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_54_idx+1) ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_542( ) ;
      }
      /* End function sendrow_542 */
   }

   public void startgridcontrol54( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"54\">") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavPenalizaciones_sdt__seleccionar.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Op", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPenalizaciones_sdt__clicod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPenalizaciones_sdt__barmancod1_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Prog.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPenalizaciones_sdt__barcolnum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPenalizaciones_sdt__barcolnom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nome Cor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPenalizaciones_sdt__barcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "OS", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPenalizaciones_sdt__barcodreo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPenalizaciones_sdt__barcodpar_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPenalizaciones_sdt__albprocod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Guia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPenalizaciones_sdt__barkgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Quilos OS", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPenalizaciones_sdt__baralbkgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Quilos Guia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPenalizaciones_sdt__pmddtotin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dto.Ting", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPenalizaciones_sdt__pmddtoaca_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dto.Aca", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPenalizaciones_sdt__pmdtinprc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pen. Ting.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPenalizaciones_sdt__pmdacaprc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pen. Aca.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPenalizaciones_sdt__precio_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Preço", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPenalizaciones_sdt__barprekgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Preço Guia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPenalizaciones_sdt__pmddsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descriçao Prog.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPenalizaciones_sdt__okkgmin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ok Kg Min", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPenalizaciones_sdt__pmdpreuni_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Preço Unico", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavPenalizaciones_sdt__baracc.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "PU?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
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
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavPenalizaciones_sdt__seleccionar.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__clicod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__barmancod1_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__barmancod1_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__barcolnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__barcolnum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__barcolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__barcolnom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__barcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__barcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__barcodreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__barcodreo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__barcodpar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__barcodpar_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__albprocod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__albprocod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__barkgm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__barkgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__baralbkgm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__baralbkgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__pmddtotin_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__pmddtotin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__pmddtoaca_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__pmddtoaca_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__pmdtinprc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__pmdtinprc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__pmdacaprc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__pmdacaprc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__precio_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__precio_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__barprekgm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__barprekgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__clinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__pmddsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__pmddsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__okkgmin_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__okkgmin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__pmdpreuni_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__pmdpreuni_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkavPenalizaciones_sdt__baracc.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavPenalizaciones_sdt__baracc.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkavPenalizaciones_sdt__fase_618.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__mtsmins_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPenalizaciones_sdt__pmdkgmmins_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      bttBtnconfirmar_Internalname = sPrefix+"BTNCONFIRMAR" ;
      bttBtnmarcartodas_Internalname = sPrefix+"BTNMARCARTODAS" ;
      bttBtndesmarcartodas_Internalname = sPrefix+"BTNDESMARCARTODAS" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      chkavPenalizaciones_sdt__seleccionar.setInternalname( sPrefix+"PENALIZACIONES_SDT__SELECCIONAR" );
      edtavPenalizaciones_sdt__clicod_Internalname = sPrefix+"PENALIZACIONES_SDT__CLICOD" ;
      edtavPenalizaciones_sdt__barmancod1_Internalname = sPrefix+"PENALIZACIONES_SDT__BARMANCOD1" ;
      edtavPenalizaciones_sdt__barcolnum_Internalname = sPrefix+"PENALIZACIONES_SDT__BARCOLNUM" ;
      edtavPenalizaciones_sdt__barcolnom_Internalname = sPrefix+"PENALIZACIONES_SDT__BARCOLNOM" ;
      edtavPenalizaciones_sdt__barcod_Internalname = sPrefix+"PENALIZACIONES_SDT__BARCOD" ;
      edtavPenalizaciones_sdt__barcodreo_Internalname = sPrefix+"PENALIZACIONES_SDT__BARCODREO" ;
      edtavPenalizaciones_sdt__barcodpar_Internalname = sPrefix+"PENALIZACIONES_SDT__BARCODPAR" ;
      edtavPenalizaciones_sdt__albprocod_Internalname = sPrefix+"PENALIZACIONES_SDT__ALBPROCOD" ;
      edtavPenalizaciones_sdt__barkgm_Internalname = sPrefix+"PENALIZACIONES_SDT__BARKGM" ;
      edtavPenalizaciones_sdt__baralbkgm_Internalname = sPrefix+"PENALIZACIONES_SDT__BARALBKGM" ;
      edtavPenalizaciones_sdt__pmddtotin_Internalname = sPrefix+"PENALIZACIONES_SDT__PMDDTOTIN" ;
      edtavPenalizaciones_sdt__pmddtoaca_Internalname = sPrefix+"PENALIZACIONES_SDT__PMDDTOACA" ;
      edtavPenalizaciones_sdt__pmdtinprc_Internalname = sPrefix+"PENALIZACIONES_SDT__PMDTINPRC" ;
      edtavPenalizaciones_sdt__pmdacaprc_Internalname = sPrefix+"PENALIZACIONES_SDT__PMDACAPRC" ;
      edtavPenalizaciones_sdt__precio_Internalname = sPrefix+"PENALIZACIONES_SDT__PRECIO" ;
      edtavPenalizaciones_sdt__barprekgm_Internalname = sPrefix+"PENALIZACIONES_SDT__BARPREKGM" ;
      edtavPenalizaciones_sdt__clinom_Internalname = sPrefix+"PENALIZACIONES_SDT__CLINOM" ;
      edtavPenalizaciones_sdt__pmddsc_Internalname = sPrefix+"PENALIZACIONES_SDT__PMDDSC" ;
      edtavPenalizaciones_sdt__okkgmin_Internalname = sPrefix+"PENALIZACIONES_SDT__OKKGMIN" ;
      edtavPenalizaciones_sdt__pmdpreuni_Internalname = sPrefix+"PENALIZACIONES_SDT__PMDPREUNI" ;
      chkavPenalizaciones_sdt__baracc.setInternalname( sPrefix+"PENALIZACIONES_SDT__BARACC" );
      chkavPenalizaciones_sdt__fase_618.setInternalname( sPrefix+"PENALIZACIONES_SDT__FASE_618" );
      edtavPenalizaciones_sdt__mtsmins_Internalname = sPrefix+"PENALIZACIONES_SDT__MTSMINS" ;
      edtavPenalizaciones_sdt__pmdkgmmins_Internalname = sPrefix+"PENALIZACIONES_SDT__PMDKGMMINS" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_confirmar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR" ;
      tblTabledvelop_confirmpanel_confirmar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_CONFIRMAR" ;
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
      edtavPenalizaciones_sdt__pmdkgmmins_Jsonclick = "" ;
      edtavPenalizaciones_sdt__pmdkgmmins_Enabled = 0 ;
      edtavPenalizaciones_sdt__mtsmins_Jsonclick = "" ;
      edtavPenalizaciones_sdt__mtsmins_Enabled = 0 ;
      chkavPenalizaciones_sdt__fase_618.setCaption( "" );
      chkavPenalizaciones_sdt__fase_618.setEnabled( 0 );
      chkavPenalizaciones_sdt__baracc.setCaption( "" );
      chkavPenalizaciones_sdt__baracc.setEnabled( 0 );
      chkavPenalizaciones_sdt__baracc.setVisible( -1 );
      edtavPenalizaciones_sdt__pmdpreuni_Jsonclick = "" ;
      edtavPenalizaciones_sdt__pmdpreuni_Enabled = 0 ;
      edtavPenalizaciones_sdt__pmdpreuni_Visible = -1 ;
      edtavPenalizaciones_sdt__okkgmin_Jsonclick = "" ;
      edtavPenalizaciones_sdt__okkgmin_Enabled = 0 ;
      edtavPenalizaciones_sdt__okkgmin_Visible = -1 ;
      edtavPenalizaciones_sdt__pmddsc_Jsonclick = "" ;
      edtavPenalizaciones_sdt__pmddsc_Enabled = 0 ;
      edtavPenalizaciones_sdt__pmddsc_Visible = -1 ;
      edtavPenalizaciones_sdt__clinom_Jsonclick = "" ;
      edtavPenalizaciones_sdt__clinom_Enabled = 0 ;
      edtavPenalizaciones_sdt__barprekgm_Jsonclick = "" ;
      edtavPenalizaciones_sdt__barprekgm_Enabled = 0 ;
      edtavPenalizaciones_sdt__barprekgm_Visible = -1 ;
      edtavPenalizaciones_sdt__precio_Jsonclick = "" ;
      edtavPenalizaciones_sdt__precio_Enabled = 0 ;
      edtavPenalizaciones_sdt__precio_Visible = -1 ;
      edtavPenalizaciones_sdt__pmdacaprc_Jsonclick = "" ;
      edtavPenalizaciones_sdt__pmdacaprc_Enabled = 0 ;
      edtavPenalizaciones_sdt__pmdacaprc_Visible = -1 ;
      edtavPenalizaciones_sdt__pmdtinprc_Jsonclick = "" ;
      edtavPenalizaciones_sdt__pmdtinprc_Enabled = 0 ;
      edtavPenalizaciones_sdt__pmdtinprc_Visible = -1 ;
      edtavPenalizaciones_sdt__pmddtoaca_Jsonclick = "" ;
      edtavPenalizaciones_sdt__pmddtoaca_Enabled = 0 ;
      edtavPenalizaciones_sdt__pmddtoaca_Visible = -1 ;
      edtavPenalizaciones_sdt__pmddtotin_Jsonclick = "" ;
      edtavPenalizaciones_sdt__pmddtotin_Enabled = 0 ;
      edtavPenalizaciones_sdt__pmddtotin_Visible = -1 ;
      edtavPenalizaciones_sdt__baralbkgm_Jsonclick = "" ;
      edtavPenalizaciones_sdt__baralbkgm_Enabled = 0 ;
      edtavPenalizaciones_sdt__baralbkgm_Visible = -1 ;
      edtavPenalizaciones_sdt__barkgm_Jsonclick = "" ;
      edtavPenalizaciones_sdt__barkgm_Enabled = 0 ;
      edtavPenalizaciones_sdt__barkgm_Visible = -1 ;
      edtavPenalizaciones_sdt__albprocod_Jsonclick = "" ;
      edtavPenalizaciones_sdt__albprocod_Enabled = 0 ;
      edtavPenalizaciones_sdt__albprocod_Visible = -1 ;
      edtavPenalizaciones_sdt__barcodpar_Jsonclick = "" ;
      edtavPenalizaciones_sdt__barcodpar_Enabled = 0 ;
      edtavPenalizaciones_sdt__barcodpar_Visible = -1 ;
      edtavPenalizaciones_sdt__barcodreo_Jsonclick = "" ;
      edtavPenalizaciones_sdt__barcodreo_Enabled = 0 ;
      edtavPenalizaciones_sdt__barcodreo_Visible = -1 ;
      edtavPenalizaciones_sdt__barcod_Jsonclick = "" ;
      edtavPenalizaciones_sdt__barcod_Enabled = 0 ;
      edtavPenalizaciones_sdt__barcod_Visible = -1 ;
      edtavPenalizaciones_sdt__barcolnom_Jsonclick = "" ;
      edtavPenalizaciones_sdt__barcolnom_Enabled = 0 ;
      edtavPenalizaciones_sdt__barcolnom_Visible = -1 ;
      edtavPenalizaciones_sdt__barcolnum_Jsonclick = "" ;
      edtavPenalizaciones_sdt__barcolnum_Enabled = 0 ;
      edtavPenalizaciones_sdt__barcolnum_Visible = -1 ;
      edtavPenalizaciones_sdt__barmancod1_Jsonclick = "" ;
      edtavPenalizaciones_sdt__barmancod1_Enabled = 0 ;
      edtavPenalizaciones_sdt__barmancod1_Visible = -1 ;
      edtavPenalizaciones_sdt__clicod_Jsonclick = "" ;
      edtavPenalizaciones_sdt__clicod_Enabled = 0 ;
      edtavPenalizaciones_sdt__clicod_Visible = -1 ;
      chkavPenalizaciones_sdt__seleccionar.setCaption( "" );
      chkavPenalizaciones_sdt__seleccionar.setEnabled( 1 );
      chkavPenalizaciones_sdt__seleccionar.setVisible( -1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      chkavPenalizaciones_sdt__baracc.setVisible( -1 );
      edtavPenalizaciones_sdt__pmdpreuni_Visible = -1 ;
      edtavPenalizaciones_sdt__okkgmin_Visible = -1 ;
      edtavPenalizaciones_sdt__pmddsc_Visible = -1 ;
      edtavPenalizaciones_sdt__barprekgm_Visible = -1 ;
      edtavPenalizaciones_sdt__precio_Visible = -1 ;
      edtavPenalizaciones_sdt__pmdacaprc_Visible = -1 ;
      edtavPenalizaciones_sdt__pmdtinprc_Visible = -1 ;
      edtavPenalizaciones_sdt__pmddtoaca_Visible = -1 ;
      edtavPenalizaciones_sdt__pmddtotin_Visible = -1 ;
      edtavPenalizaciones_sdt__baralbkgm_Visible = -1 ;
      edtavPenalizaciones_sdt__barkgm_Visible = -1 ;
      edtavPenalizaciones_sdt__albprocod_Visible = -1 ;
      edtavPenalizaciones_sdt__barcodpar_Visible = -1 ;
      edtavPenalizaciones_sdt__barcodreo_Visible = -1 ;
      edtavPenalizaciones_sdt__barcod_Visible = -1 ;
      edtavPenalizaciones_sdt__barcolnom_Visible = -1 ;
      edtavPenalizaciones_sdt__barcolnum_Visible = -1 ;
      edtavPenalizaciones_sdt__barmancod1_Visible = -1 ;
      edtavPenalizaciones_sdt__clicod_Visible = -1 ;
      chkavPenalizaciones_sdt__seleccionar.setVisible( -1 );
      subGrid_Sortable = (byte)(0) ;
      edtavPenalizaciones_sdt__pmdkgmmins_Enabled = -1 ;
      edtavPenalizaciones_sdt__mtsmins_Enabled = -1 ;
      chkavPenalizaciones_sdt__fase_618.setEnabled( -1 );
      chkavPenalizaciones_sdt__baracc.setEnabled( -1 );
      edtavPenalizaciones_sdt__pmdpreuni_Enabled = -1 ;
      edtavPenalizaciones_sdt__okkgmin_Enabled = -1 ;
      edtavPenalizaciones_sdt__pmddsc_Enabled = -1 ;
      edtavPenalizaciones_sdt__clinom_Enabled = -1 ;
      edtavPenalizaciones_sdt__barprekgm_Enabled = -1 ;
      edtavPenalizaciones_sdt__precio_Enabled = -1 ;
      edtavPenalizaciones_sdt__pmdacaprc_Enabled = -1 ;
      edtavPenalizaciones_sdt__pmdtinprc_Enabled = -1 ;
      edtavPenalizaciones_sdt__pmddtoaca_Enabled = -1 ;
      edtavPenalizaciones_sdt__pmddtotin_Enabled = -1 ;
      edtavPenalizaciones_sdt__baralbkgm_Enabled = -1 ;
      edtavPenalizaciones_sdt__barkgm_Enabled = -1 ;
      edtavPenalizaciones_sdt__albprocod_Enabled = -1 ;
      edtavPenalizaciones_sdt__barcodpar_Enabled = -1 ;
      edtavPenalizaciones_sdt__barcodreo_Enabled = -1 ;
      edtavPenalizaciones_sdt__barcod_Enabled = -1 ;
      edtavPenalizaciones_sdt__barcolnom_Enabled = -1 ;
      edtavPenalizaciones_sdt__barcolnum_Enabled = -1 ;
      edtavPenalizaciones_sdt__barmancod1_Enabled = -1 ;
      edtavPenalizaciones_sdt__clicod_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_confirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar_Confirmationtext = "¿Confirmar los datos?" ;
      Dvelop_confirmpanel_confirmar_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "||||||||||||||||||||" ;
      Ddo_grid_Columnids = "0:Penalizaciones_SDT__Seleccionar|1:Penalizaciones_SDT__Clicod|2:Penalizaciones_SDT__Barmancod1|3:Penalizaciones_SDT__Barcolnum|4:Penalizaciones_SDT__Barcolnom|5:Penalizaciones_SDT__Barcod|6:Penalizaciones_SDT__Barcodreo|7:Penalizaciones_SDT__Barcodpar|8:Penalizaciones_SDT__AlbProcod|9:Penalizaciones_SDT__BarKgm|10:Penalizaciones_SDT__Baralbkgm|11:Penalizaciones_SDT__PMDDtoTin|12:Penalizaciones_SDT__PMDDtoAca|13:Penalizaciones_SDT__PMDTinPrc|14:Penalizaciones_SDT__PMDAcaPrc|15:Penalizaciones_SDT__Precio|16:Penalizaciones_SDT__BarPreKgm|18:Penalizaciones_SDT__PMDDsc|19:Penalizaciones_SDT__OkKgMin|20:Penalizaciones_SDT__PMDPreUni|21:Penalizaciones_SDT__BarAcc" ;
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
      GXCCtl = "PENALIZACIONES_SDT__SELECCIONAR_" + sGXsfl_54_idx ;
      chkavPenalizaciones_sdt__seleccionar.setName( GXCCtl );
      chkavPenalizaciones_sdt__seleccionar.setWebtags( "" );
      chkavPenalizaciones_sdt__seleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavPenalizaciones_sdt__seleccionar.getInternalname(), "TitleCaption", chkavPenalizaciones_sdt__seleccionar.getCaption(), !bGXsfl_54_Refreshing);
      chkavPenalizaciones_sdt__seleccionar.setCheckedValue( "false" );
      GXCCtl = "PENALIZACIONES_SDT__BARACC_" + sGXsfl_54_idx ;
      chkavPenalizaciones_sdt__baracc.setName( GXCCtl );
      chkavPenalizaciones_sdt__baracc.setWebtags( "" );
      chkavPenalizaciones_sdt__baracc.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavPenalizaciones_sdt__baracc.getInternalname(), "TitleCaption", chkavPenalizaciones_sdt__baracc.getCaption(), !bGXsfl_54_Refreshing);
      chkavPenalizaciones_sdt__baracc.setCheckedValue( "N" );
      GXCCtl = "PENALIZACIONES_SDT__FASE_618_" + sGXsfl_54_idx ;
      chkavPenalizaciones_sdt__fase_618.setName( GXCCtl );
      chkavPenalizaciones_sdt__fase_618.setWebtags( "" );
      chkavPenalizaciones_sdt__fase_618.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavPenalizaciones_sdt__fase_618.getInternalname(), "TitleCaption", chkavPenalizaciones_sdt__fase_618.getCaption(), !bGXsfl_54_Refreshing);
      chkavPenalizaciones_sdt__fase_618.setCheckedValue( "false" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV13Penalizaciones_SDT',fld:'vPENALIZACIONES_SDT',grid:54,pic:''},{av:'nGXsfl_54_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:54},{av:'nRC_GXsfl_54',ctrl:'GRID',prop:'GridRC',grid:54},{av:'sPrefix'},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV28Clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV29Clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV30Albprofchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV31Albprofchto',fld:'vALBPROFCHTO',pic:''},{av:'AV32Inbarmancod1',fld:'vINBARMANCOD1',pic:'ZZZ9'},{av:'AV27InBarcolnom',fld:'vINBARCOLNOM',pic:''},{av:'AV50NoVerPen',fld:'vNOVERPEN',pic:'9'},{av:'AV59Penalizaciones_Json2',fld:'vPENALIZACIONES_JSON2',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'PENALIZACIONES_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__CLICOD',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARMANCOD1',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARCOLNUM',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARCOLNOM',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARCOD',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARCODREO',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARCODPAR',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__ALBPROCOD',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARKGM',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARALBKGM',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDDTOTIN',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDDTOACA',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDTINPRC',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDACAPRC',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PRECIO',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARPREKGM',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDDSC',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__OKKGMIN',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDPREUNI',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARACC',prop:'Visible'},{av:'AV24GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV25GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV19ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1323L2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV13Penalizaciones_SDT',fld:'vPENALIZACIONES_SDT',grid:54,pic:''},{av:'nGXsfl_54_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:54},{av:'nRC_GXsfl_54',ctrl:'GRID',prop:'GridRC',grid:54},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV28Clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV29Clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV30Albprofchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV31Albprofchto',fld:'vALBPROFCHTO',pic:''},{av:'AV32Inbarmancod1',fld:'vINBARMANCOD1',pic:'ZZZ9'},{av:'AV27InBarcolnom',fld:'vINBARCOLNOM',pic:''},{av:'AV50NoVerPen',fld:'vNOVERPEN',pic:'9'},{av:'AV59Penalizaciones_Json2',fld:'vPENALIZACIONES_JSON2',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1423L2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV13Penalizaciones_SDT',fld:'vPENALIZACIONES_SDT',grid:54,pic:''},{av:'nGXsfl_54_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:54},{av:'nRC_GXsfl_54',ctrl:'GRID',prop:'GridRC',grid:54},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV28Clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV29Clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV30Albprofchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV31Albprofchto',fld:'vALBPROFCHTO',pic:''},{av:'AV32Inbarmancod1',fld:'vINBARMANCOD1',pic:'ZZZ9'},{av:'AV27InBarcolnom',fld:'vINBARCOLNOM',pic:''},{av:'AV50NoVerPen',fld:'vNOVERPEN',pic:'9'},{av:'AV59Penalizaciones_Json2',fld:'vPENALIZACIONES_JSON2',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2223L2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1523L2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV13Penalizaciones_SDT',fld:'vPENALIZACIONES_SDT',grid:54,pic:''},{av:'nGXsfl_54_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:54},{av:'nRC_GXsfl_54',ctrl:'GRID',prop:'GridRC',grid:54},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV28Clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV29Clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV30Albprofchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV31Albprofchto',fld:'vALBPROFCHTO',pic:''},{av:'AV32Inbarmancod1',fld:'vINBARMANCOD1',pic:'ZZZ9'},{av:'AV27InBarcolnom',fld:'vINBARCOLNOM',pic:''},{av:'AV50NoVerPen',fld:'vNOVERPEN',pic:'9'},{av:'AV59Penalizaciones_Json2',fld:'vPENALIZACIONES_JSON2',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{ctrl:'PENALIZACIONES_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__CLICOD',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARMANCOD1',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARCOLNUM',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARCOLNOM',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARCOD',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARCODREO',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARCODPAR',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__ALBPROCOD',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARKGM',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARALBKGM',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDDTOTIN',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDDTOACA',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDTINPRC',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDACAPRC',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PRECIO',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARPREKGM',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDDSC',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__OKKGMIN',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDPREUNI',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARACC',prop:'Visible'},{av:'AV24GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV25GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV19ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e1223L2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV13Penalizaciones_SDT',fld:'vPENALIZACIONES_SDT',grid:54,pic:''},{av:'nGXsfl_54_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:54},{av:'nRC_GXsfl_54',ctrl:'GRID',prop:'GridRC',grid:54},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV28Clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV29Clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV30Albprofchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV31Albprofchto',fld:'vALBPROFCHTO',pic:''},{av:'AV32Inbarmancod1',fld:'vINBARMANCOD1',pic:'ZZZ9'},{av:'AV27InBarcolnom',fld:'vINBARCOLNOM',pic:''},{av:'AV50NoVerPen',fld:'vNOVERPEN',pic:'9'},{av:'AV59Penalizaciones_Json2',fld:'vPENALIZACIONES_JSON2',pic:''},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'PENALIZACIONES_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__CLICOD',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARMANCOD1',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARCOLNUM',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARCOLNOM',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARCOD',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARCODREO',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARCODPAR',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__ALBPROCOD',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARKGM',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARALBKGM',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDDTOTIN',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDDTOACA',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDTINPRC',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDACAPRC',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PRECIO',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARPREKGM',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDDSC',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__OKKGMIN',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDPREUNI',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARACC',prop:'Visible'},{av:'AV24GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV25GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV19ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e1123L1',iparms:[{av:'AV13Penalizaciones_SDT',fld:'vPENALIZACIONES_SDT',grid:54,pic:''},{av:'nGXsfl_54_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:54},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_54',ctrl:'GRID',prop:'GridRC',grid:54}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE","{handler:'e1623L2',iparms:[{av:'Dvelop_confirmpanel_confirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV13Penalizaciones_SDT',fld:'vPENALIZACIONES_SDT',grid:54,pic:''},{av:'nGXsfl_54_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:54},{av:'nRC_GXsfl_54',ctrl:'GRID',prop:'GridRC',grid:54},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV28Clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV29Clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV30Albprofchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV31Albprofchto',fld:'vALBPROFCHTO',pic:''},{av:'AV32Inbarmancod1',fld:'vINBARMANCOD1',pic:'ZZZ9'},{av:'AV27InBarcolnom',fld:'vINBARCOLNOM',pic:''},{av:'AV50NoVerPen',fld:'vNOVERPEN',pic:'9'},{av:'AV59Penalizaciones_Json2',fld:'vPENALIZACIONES_JSON2',pic:''},{av:'sPrefix'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A33AlbProEst',fld:'ALBPROEST',pic:'9'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A39AlbProPri',fld:'ALBPROPRI',pic:'9'},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'A2395BarAlbExt',fld:'BARALBEXT',pic:'ZZZZZZZ9'},{av:'A32AlbProEsp',fld:'ALBPROESP',pic:'99'},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A3311BarManCod1',fld:'BARMANCOD1',pic:'ZZZ9'},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'A14267Fase_618',fld:'FASE_618',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV42PMDPreUni',fld:'vPMDPREUNI',pic:'ZZZZZZ9.999'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A125BarAncAca1',fld:'BARANCACA1',pic:'ZZ9'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE",",oparms:[{av:'AV42PMDPreUni',fld:'vPMDPREUNI',pic:'ZZZZZZ9.999'},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV13Penalizaciones_SDT',fld:'vPENALIZACIONES_SDT',grid:54,pic:''},{av:'nGXsfl_54_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:54},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_54',ctrl:'GRID',prop:'GridRC',grid:54},{av:'A1262BarPreKgm',fld:'BARPREKGM',pic:'ZZZZZZ9.999'},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'PENALIZACIONES_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__CLICOD',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARMANCOD1',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARCOLNUM',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARCOLNOM',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARCOD',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARCODREO',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARCODPAR',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__ALBPROCOD',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARKGM',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARALBKGM',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDDTOTIN',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDDTOACA',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDTINPRC',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDACAPRC',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PRECIO',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARPREKGM',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDDSC',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__OKKGMIN',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDPREUNI',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARACC',prop:'Visible'},{av:'AV24GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV25GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV19ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOMARCARTODAS'","{handler:'e1723L2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV13Penalizaciones_SDT',fld:'vPENALIZACIONES_SDT',grid:54,pic:''},{av:'nGXsfl_54_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:54},{av:'nRC_GXsfl_54',ctrl:'GRID',prop:'GridRC',grid:54},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV28Clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV29Clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV30Albprofchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV31Albprofchto',fld:'vALBPROFCHTO',pic:''},{av:'AV32Inbarmancod1',fld:'vINBARMANCOD1',pic:'ZZZ9'},{av:'AV27InBarcolnom',fld:'vINBARCOLNOM',pic:''},{av:'AV50NoVerPen',fld:'vNOVERPEN',pic:'9'},{av:'AV59Penalizaciones_Json2',fld:'vPENALIZACIONES_JSON2',pic:''},{av:'sPrefix'},{av:'AV33Var_seleccionar',fld:'vVAR_SELECCIONAR',pic:'ZZZ9'}]");
      setEventMetadata("'DOMARCARTODAS'",",oparms:[{av:'AV33Var_seleccionar',fld:'vVAR_SELECCIONAR',pic:'ZZZ9'},{av:'AV13Penalizaciones_SDT',fld:'vPENALIZACIONES_SDT',grid:54,pic:''},{av:'nGXsfl_54_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:54},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_54',ctrl:'GRID',prop:'GridRC',grid:54},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'PENALIZACIONES_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__CLICOD',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARMANCOD1',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARCOLNUM',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARCOLNOM',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARCOD',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARCODREO',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARCODPAR',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__ALBPROCOD',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARKGM',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARALBKGM',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDDTOTIN',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDDTOACA',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDTINPRC',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDACAPRC',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PRECIO',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARPREKGM',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDDSC',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__OKKGMIN',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDPREUNI',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARACC',prop:'Visible'},{av:'AV24GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV25GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV19ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DODESMARCARTODAS'","{handler:'e1823L2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV13Penalizaciones_SDT',fld:'vPENALIZACIONES_SDT',grid:54,pic:''},{av:'nGXsfl_54_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:54},{av:'nRC_GXsfl_54',ctrl:'GRID',prop:'GridRC',grid:54},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV28Clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV29Clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV30Albprofchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV31Albprofchto',fld:'vALBPROFCHTO',pic:''},{av:'AV32Inbarmancod1',fld:'vINBARMANCOD1',pic:'ZZZ9'},{av:'AV27InBarcolnom',fld:'vINBARCOLNOM',pic:''},{av:'AV50NoVerPen',fld:'vNOVERPEN',pic:'9'},{av:'AV59Penalizaciones_Json2',fld:'vPENALIZACIONES_JSON2',pic:''},{av:'sPrefix'},{av:'AV33Var_seleccionar',fld:'vVAR_SELECCIONAR',pic:'ZZZ9'}]");
      setEventMetadata("'DODESMARCARTODAS'",",oparms:[{av:'AV33Var_seleccionar',fld:'vVAR_SELECCIONAR',pic:'ZZZ9'},{av:'AV13Penalizaciones_SDT',fld:'vPENALIZACIONES_SDT',grid:54,pic:''},{av:'nGXsfl_54_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:54},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_54',ctrl:'GRID',prop:'GridRC',grid:54},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'PENALIZACIONES_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__CLICOD',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARMANCOD1',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARCOLNUM',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARCOLNOM',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARCOD',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARCODREO',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARCODPAR',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__ALBPROCOD',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARKGM',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARALBKGM',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDDTOTIN',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDDTOACA',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDTINPRC',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDACAPRC',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PRECIO',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARPREKGM',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDDSC',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__OKKGMIN',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__PMDPREUNI',prop:'Visible'},{ctrl:'PENALIZACIONES_SDT__BARACC',prop:'Visible'},{av:'AV24GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV25GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV19ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1923L2',iparms:[{av:'AV13Penalizaciones_SDT',fld:'vPENALIZACIONES_SDT',grid:54,pic:''},{av:'nGXsfl_54_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:54},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_54',ctrl:'GRID',prop:'GridRC',grid:54}]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("VALIDV_GXV23","{handler:'validv_Gxv23',iparms:[]");
      setEventMetadata("VALIDV_GXV23",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv26',iparms:[]");
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
      wcpOAV30Albprofchfrom = GXutil.nullDate() ;
      wcpOAV31Albprofchto = GXutil.nullDate() ;
      wcpOAV27InBarcolnom = "" ;
      wcpOAV59Penalizaciones_Json2 = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      Dvelop_confirmpanel_confirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV26EmprCod = "" ;
      AV30Albprofchfrom = GXutil.nullDate() ;
      AV31Albprofchto = GXutil.nullDate() ;
      AV27InBarcolnom = "" ;
      AV59Penalizaciones_Json2 = "" ;
      AV16ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV97Pgmname = "" ;
      AV12FilterFullText = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV13Penalizaciones_SDT = new GXBaseCollection<app.facturacion.SdtPenalizaciones_SDT_Item>(app.facturacion.SdtPenalizaciones_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV19ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV22DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      A396EmprCod = "" ;
      A39AlbProPri = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A135BarColNom = "" ;
      A5253BarAcc = "" ;
      A130BarCodPar = "" ;
      AV42PMDPreUni = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      AV35Item_Penalizaciones_SDT = new app.facturacion.SdtPenalizaciones_SDT_Item(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtnmarcartodas_Jsonclick = "" ;
      bttBtndesmarcartodas_Jsonclick = "" ;
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
      hsh = "" ;
      AV64Station = "" ;
      GXv_char2 = new String[1] ;
      AV61EmprNom = "" ;
      AV65UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV18Session = httpContext.getWebSession();
      AV14ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV20ManageFiltersXml = "" ;
      AV63ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      AV53Penalizaciones_json = "" ;
      AV54WebSession = httpContext.getWebSession();
      AV51ExcelFilename = "" ;
      AV52ErrorMessage = "" ;
      AV15UserCustomValue = "" ;
      GXt_char1 = "" ;
      AV17ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV40barcodpar = "" ;
      AV43PMDDtoTin = DecimalUtil.ZERO ;
      AV41PMDDtoAca = DecimalUtil.ZERO ;
      AV48Precio = DecimalUtil.ZERO ;
      AV46PMDTinPrc = DecimalUtil.ZERO ;
      AV44PMDAcaPrc = DecimalUtil.ZERO ;
      AV45PMDKgmMinS = DecimalUtil.ZERO ;
      AV47MtsMinS = DecimalUtil.ZERO ;
      GXv_int12 = new long[1] ;
      GXv_int13 = new int[1] ;
      GXv_int14 = new byte[1] ;
      GXv_char3 = new String[1] ;
      AV58var_json = "" ;
      GXv_objcol_SdtPenalizaciones_SDT_Item24 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState25 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      scmdbuf = "" ;
      H023L2_A33AlbProEst = new byte[1] ;
      H023L2_A39AlbProPri = new String[] {""} ;
      H023L2_A2395BarAlbExt = new int[1] ;
      H023L2_n2395BarAlbExt = new boolean[] {false} ;
      H023L2_A5253BarAcc = new String[] {""} ;
      H023L2_A3311BarManCod1 = new short[1] ;
      H023L2_A135BarColNom = new String[] {""} ;
      H023L2_A32AlbProEsp = new byte[1] ;
      H023L2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H023L2_A1243GuiRemCli = new int[1] ;
      H023L2_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H023L2_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H023L2_A125BarAncAca1 = new short[1] ;
      H023L2_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H023L2_A30AlbProCod = new long[1] ;
      H023L2_A130BarCodPar = new String[] {""} ;
      H023L2_A132BarCodReo = new byte[1] ;
      H023L2_A129BarCod = new int[1] ;
      H023L2_A396EmprCod = new String[] {""} ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      GXv_boolean27 = new boolean[1] ;
      AV66Kilos = DecimalUtil.ZERO ;
      GXv_decimal21 = new java.math.BigDecimal[1] ;
      AV67PMDDsc = "" ;
      GXv_char4 = new String[1] ;
      GXv_decimal20 = new java.math.BigDecimal[1] ;
      GXv_decimal19 = new java.math.BigDecimal[1] ;
      GXv_decimal18 = new java.math.BigDecimal[1] ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      GXv_int22 = new byte[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_decimal23 = new java.math.BigDecimal[1] ;
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV26EmprCod = "" ;
      sCtrlAV28Clicodfrom = "" ;
      sCtrlAV29Clicodto = "" ;
      sCtrlAV30Albprofchfrom = "" ;
      sCtrlAV31Albprofchto = "" ;
      sCtrlAV32Inbarmancod1 = "" ;
      sCtrlAV27InBarcolnom = "" ;
      sCtrlAV50NoVerPen = "" ;
      sCtrlAV59Penalizaciones_Json2 = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.penalizaciones_wc__default(),
         new Object[] {
             new Object[] {
            H023L2_A33AlbProEst, H023L2_A39AlbProPri, H023L2_A2395BarAlbExt, H023L2_n2395BarAlbExt, H023L2_A5253BarAcc, H023L2_A3311BarManCod1, H023L2_A135BarColNom, H023L2_A32AlbProEsp, H023L2_A34AlbProfch, H023L2_A1243GuiRemCli,
            H023L2_A1262BarPreKgm, H023L2_A1261BarAlbKgmE, H023L2_A125BarAncAca1, H023L2_A1263BarAlbMtrE, H023L2_A30AlbProCod, H023L2_A130BarCodPar, H023L2_A132BarCodReo, H023L2_A129BarCod, H023L2_A396EmprCod
            }
         }
      );
      AV97Pgmname = "Facturacion.Penalizaciones_WC" ;
      /* GeneXus formulas. */
      AV97Pgmname = "Facturacion.Penalizaciones_WC" ;
      Gx_err = (short)(0) ;
      edtavPenalizaciones_sdt__clicod_Enabled = 0 ;
      edtavPenalizaciones_sdt__barmancod1_Enabled = 0 ;
      edtavPenalizaciones_sdt__barcolnum_Enabled = 0 ;
      edtavPenalizaciones_sdt__barcolnom_Enabled = 0 ;
      edtavPenalizaciones_sdt__barcod_Enabled = 0 ;
      edtavPenalizaciones_sdt__barcodreo_Enabled = 0 ;
      edtavPenalizaciones_sdt__barcodpar_Enabled = 0 ;
      edtavPenalizaciones_sdt__albprocod_Enabled = 0 ;
      edtavPenalizaciones_sdt__barkgm_Enabled = 0 ;
      edtavPenalizaciones_sdt__baralbkgm_Enabled = 0 ;
      edtavPenalizaciones_sdt__pmddtotin_Enabled = 0 ;
      edtavPenalizaciones_sdt__pmddtoaca_Enabled = 0 ;
      edtavPenalizaciones_sdt__pmdtinprc_Enabled = 0 ;
      edtavPenalizaciones_sdt__pmdacaprc_Enabled = 0 ;
      edtavPenalizaciones_sdt__precio_Enabled = 0 ;
      edtavPenalizaciones_sdt__barprekgm_Enabled = 0 ;
      edtavPenalizaciones_sdt__clinom_Enabled = 0 ;
      edtavPenalizaciones_sdt__pmddsc_Enabled = 0 ;
      edtavPenalizaciones_sdt__okkgmin_Enabled = 0 ;
      edtavPenalizaciones_sdt__pmdpreuni_Enabled = 0 ;
      chkavPenalizaciones_sdt__baracc.setEnabled( 0 );
      chkavPenalizaciones_sdt__fase_618.setEnabled( 0 );
      edtavPenalizaciones_sdt__mtsmins_Enabled = 0 ;
      edtavPenalizaciones_sdt__pmdkgmmins_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV50NoVerPen ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV50NoVerPen ;
   private byte AV21ManageFiltersExecutionStep ;
   private byte A33AlbProEst ;
   private byte A32AlbProEsp ;
   private byte A132BarCodReo ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV39barcodreo ;
   private byte AV49OkKgMin ;
   private byte GXv_int14[] ;
   private byte GXv_int22[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV32Inbarmancod1 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV32Inbarmancod1 ;
   private short A3311BarManCod1 ;
   private short A125BarAncAca1 ;
   private short AV33Var_seleccionar ;
   private short AV36registrostrue ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV62Porcentaje ;
   private short AV34i ;
   private int wcpOAV28Clicodfrom ;
   private int wcpOAV29Clicodto ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_54 ;
   private int AV28Clicodfrom ;
   private int AV29Clicodto ;
   private int nGXsfl_54_idx=1 ;
   private int A1243GuiRemCli ;
   private int A2395BarAlbExt ;
   private int A129BarCod ;
   private int AV98GXV27 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV71GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavPenalizaciones_sdt__clicod_Enabled ;
   private int edtavPenalizaciones_sdt__barmancod1_Enabled ;
   private int edtavPenalizaciones_sdt__barcolnum_Enabled ;
   private int edtavPenalizaciones_sdt__barcolnom_Enabled ;
   private int edtavPenalizaciones_sdt__barcod_Enabled ;
   private int edtavPenalizaciones_sdt__barcodreo_Enabled ;
   private int edtavPenalizaciones_sdt__barcodpar_Enabled ;
   private int edtavPenalizaciones_sdt__albprocod_Enabled ;
   private int edtavPenalizaciones_sdt__barkgm_Enabled ;
   private int edtavPenalizaciones_sdt__baralbkgm_Enabled ;
   private int edtavPenalizaciones_sdt__pmddtotin_Enabled ;
   private int edtavPenalizaciones_sdt__pmddtoaca_Enabled ;
   private int edtavPenalizaciones_sdt__pmdtinprc_Enabled ;
   private int edtavPenalizaciones_sdt__pmdacaprc_Enabled ;
   private int edtavPenalizaciones_sdt__precio_Enabled ;
   private int edtavPenalizaciones_sdt__barprekgm_Enabled ;
   private int edtavPenalizaciones_sdt__clinom_Enabled ;
   private int edtavPenalizaciones_sdt__pmddsc_Enabled ;
   private int edtavPenalizaciones_sdt__okkgmin_Enabled ;
   private int edtavPenalizaciones_sdt__pmdpreuni_Enabled ;
   private int edtavPenalizaciones_sdt__mtsmins_Enabled ;
   private int edtavPenalizaciones_sdt__pmdkgmmins_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_54_fel_idx=1 ;
   private int edtavPenalizaciones_sdt__clicod_Visible ;
   private int edtavPenalizaciones_sdt__barmancod1_Visible ;
   private int edtavPenalizaciones_sdt__barcolnum_Visible ;
   private int edtavPenalizaciones_sdt__barcolnom_Visible ;
   private int edtavPenalizaciones_sdt__barcod_Visible ;
   private int edtavPenalizaciones_sdt__barcodreo_Visible ;
   private int edtavPenalizaciones_sdt__barcodpar_Visible ;
   private int edtavPenalizaciones_sdt__albprocod_Visible ;
   private int edtavPenalizaciones_sdt__barkgm_Visible ;
   private int edtavPenalizaciones_sdt__baralbkgm_Visible ;
   private int edtavPenalizaciones_sdt__pmddtotin_Visible ;
   private int edtavPenalizaciones_sdt__pmddtoaca_Visible ;
   private int edtavPenalizaciones_sdt__pmdtinprc_Visible ;
   private int edtavPenalizaciones_sdt__pmdacaprc_Visible ;
   private int edtavPenalizaciones_sdt__precio_Visible ;
   private int edtavPenalizaciones_sdt__barprekgm_Visible ;
   private int edtavPenalizaciones_sdt__pmddsc_Visible ;
   private int edtavPenalizaciones_sdt__okkgmin_Visible ;
   private int edtavPenalizaciones_sdt__pmdpreuni_Visible ;
   private int AV23PageToGo ;
   private int nGXsfl_54_bak_idx=1 ;
   private int AV60CantidadRegistrosAProcesar ;
   private int AV99GXV28 ;
   private int AV100GXV29 ;
   private int AV38barcod ;
   private int GXv_int13[] ;
   private int AV101GXV30 ;
   private int AV68CantidadRegistrosProcesados ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV24GridCurrentPage ;
   private long AV25GridPageCount ;
   private long A30AlbProCod ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long AV37albprocod ;
   private long GXv_int12[] ;
   private java.math.BigDecimal AV42PMDPreUni ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal AV43PMDDtoTin ;
   private java.math.BigDecimal AV41PMDDtoAca ;
   private java.math.BigDecimal AV48Precio ;
   private java.math.BigDecimal AV46PMDTinPrc ;
   private java.math.BigDecimal AV44PMDAcaPrc ;
   private java.math.BigDecimal AV45PMDKgmMinS ;
   private java.math.BigDecimal AV47MtsMinS ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal AV66Kilos ;
   private java.math.BigDecimal GXv_decimal21[] ;
   private java.math.BigDecimal GXv_decimal20[] ;
   private java.math.BigDecimal GXv_decimal19[] ;
   private java.math.BigDecimal GXv_decimal18[] ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal23[] ;
   private String wcpOAV26EmprCod ;
   private String wcpOAV27InBarcolnom ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_confirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV26EmprCod ;
   private String AV27InBarcolnom ;
   private String sGXsfl_54_idx="0001" ;
   private String AV97Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A39AlbProPri ;
   private String A135BarColNom ;
   private String A5253BarAcc ;
   private String A130BarCodPar ;
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
   private String Dvelop_confirmpanel_confirmar_Title ;
   private String Dvelop_confirmpanel_confirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_confirmar_Confirmtype ;
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
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtnmarcartodas_Internalname ;
   private String bttBtnmarcartodas_Jsonclick ;
   private String bttBtndesmarcartodas_Internalname ;
   private String bttBtndesmarcartodas_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
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
   private String edtavPenalizaciones_sdt__clicod_Internalname ;
   private String edtavPenalizaciones_sdt__barmancod1_Internalname ;
   private String edtavPenalizaciones_sdt__barcolnum_Internalname ;
   private String edtavPenalizaciones_sdt__barcolnom_Internalname ;
   private String edtavPenalizaciones_sdt__barcod_Internalname ;
   private String edtavPenalizaciones_sdt__barcodreo_Internalname ;
   private String edtavPenalizaciones_sdt__barcodpar_Internalname ;
   private String edtavPenalizaciones_sdt__albprocod_Internalname ;
   private String edtavPenalizaciones_sdt__barkgm_Internalname ;
   private String edtavPenalizaciones_sdt__baralbkgm_Internalname ;
   private String edtavPenalizaciones_sdt__pmddtotin_Internalname ;
   private String edtavPenalizaciones_sdt__pmddtoaca_Internalname ;
   private String edtavPenalizaciones_sdt__pmdtinprc_Internalname ;
   private String edtavPenalizaciones_sdt__pmdacaprc_Internalname ;
   private String edtavPenalizaciones_sdt__precio_Internalname ;
   private String edtavPenalizaciones_sdt__barprekgm_Internalname ;
   private String edtavPenalizaciones_sdt__clinom_Internalname ;
   private String edtavPenalizaciones_sdt__pmddsc_Internalname ;
   private String edtavPenalizaciones_sdt__okkgmin_Internalname ;
   private String edtavPenalizaciones_sdt__pmdpreuni_Internalname ;
   private String edtavPenalizaciones_sdt__mtsmins_Internalname ;
   private String edtavPenalizaciones_sdt__pmdkgmmins_Internalname ;
   private String sGXsfl_54_fel_idx="0001" ;
   private String hsh ;
   private String AV64Station ;
   private String GXv_char2[] ;
   private String AV61EmprNom ;
   private String AV65UsurCod ;
   private String GXt_char1 ;
   private String AV40barcodpar ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String AV67PMDDsc ;
   private String GXv_char4[] ;
   private String tblTabledvelop_confirmpanel_confirmar_Internalname ;
   private String Dvelop_confirmpanel_confirmar_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV26EmprCod ;
   private String sCtrlAV28Clicodfrom ;
   private String sCtrlAV29Clicodto ;
   private String sCtrlAV30Albprofchfrom ;
   private String sCtrlAV31Albprofchto ;
   private String sCtrlAV32Inbarmancod1 ;
   private String sCtrlAV27InBarcolnom ;
   private String sCtrlAV50NoVerPen ;
   private String sCtrlAV59Penalizaciones_Json2 ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavPenalizaciones_sdt__clicod_Jsonclick ;
   private String edtavPenalizaciones_sdt__barmancod1_Jsonclick ;
   private String edtavPenalizaciones_sdt__barcolnum_Jsonclick ;
   private String edtavPenalizaciones_sdt__barcolnom_Jsonclick ;
   private String edtavPenalizaciones_sdt__barcod_Jsonclick ;
   private String edtavPenalizaciones_sdt__barcodreo_Jsonclick ;
   private String edtavPenalizaciones_sdt__barcodpar_Jsonclick ;
   private String edtavPenalizaciones_sdt__albprocod_Jsonclick ;
   private String edtavPenalizaciones_sdt__barkgm_Jsonclick ;
   private String edtavPenalizaciones_sdt__baralbkgm_Jsonclick ;
   private String edtavPenalizaciones_sdt__pmddtotin_Jsonclick ;
   private String edtavPenalizaciones_sdt__pmddtoaca_Jsonclick ;
   private String edtavPenalizaciones_sdt__pmdtinprc_Jsonclick ;
   private String edtavPenalizaciones_sdt__pmdacaprc_Jsonclick ;
   private String edtavPenalizaciones_sdt__precio_Jsonclick ;
   private String edtavPenalizaciones_sdt__barprekgm_Jsonclick ;
   private String edtavPenalizaciones_sdt__clinom_Jsonclick ;
   private String edtavPenalizaciones_sdt__pmddsc_Jsonclick ;
   private String edtavPenalizaciones_sdt__okkgmin_Jsonclick ;
   private String edtavPenalizaciones_sdt__pmdpreuni_Jsonclick ;
   private String edtavPenalizaciones_sdt__mtsmins_Jsonclick ;
   private String edtavPenalizaciones_sdt__pmdkgmmins_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV30Albprofchfrom ;
   private java.util.Date wcpOAV31Albprofchto ;
   private java.util.Date AV30Albprofchfrom ;
   private java.util.Date AV31Albprofchto ;
   private java.util.Date A34AlbProfch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean A14267Fase_618 ;
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
   private boolean bGXsfl_54_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV54 ;
   private boolean gx_refresh_fired ;
   private boolean n2395BarAlbExt ;
   private boolean GXt_boolean26 ;
   private boolean GXv_boolean27[] ;
   private String wcpOAV59Penalizaciones_Json2 ;
   private String AV59Penalizaciones_Json2 ;
   private String AV14ColumnsSelectorXML ;
   private String AV20ManageFiltersXml ;
   private String AV53Penalizaciones_json ;
   private String AV15UserCustomValue ;
   private String AV58var_json ;
   private String AV12FilterFullText ;
   private String AV51ExcelFilename ;
   private String AV52ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV18Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmar ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavPenalizaciones_sdt__seleccionar ;
   private ICheckbox chkavPenalizaciones_sdt__baracc ;
   private ICheckbox chkavPenalizaciones_sdt__fase_618 ;
   private IDataStoreProvider pr_default ;
   private byte[] H023L2_A33AlbProEst ;
   private String[] H023L2_A39AlbProPri ;
   private int[] H023L2_A2395BarAlbExt ;
   private boolean[] H023L2_n2395BarAlbExt ;
   private String[] H023L2_A5253BarAcc ;
   private short[] H023L2_A3311BarManCod1 ;
   private String[] H023L2_A135BarColNom ;
   private byte[] H023L2_A32AlbProEsp ;
   private java.util.Date[] H023L2_A34AlbProfch ;
   private int[] H023L2_A1243GuiRemCli ;
   private java.math.BigDecimal[] H023L2_A1262BarPreKgm ;
   private java.math.BigDecimal[] H023L2_A1261BarAlbKgmE ;
   private short[] H023L2_A125BarAncAca1 ;
   private java.math.BigDecimal[] H023L2_A1263BarAlbMtrE ;
   private long[] H023L2_A30AlbProCod ;
   private String[] H023L2_A130BarCodPar ;
   private byte[] H023L2_A132BarCodReo ;
   private int[] H023L2_A129BarCod ;
   private String[] H023L2_A396EmprCod ;
   private com.genexus.webpanels.WebSession AV54WebSession ;
   private GXBaseCollection<app.facturacion.SdtPenalizaciones_SDT_Item> AV13Penalizaciones_SDT ;
   private GXBaseCollection<app.facturacion.SdtPenalizaciones_SDT_Item> GXv_objcol_SdtPenalizaciones_SDT_Item24[] ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV19ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV17ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV22DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState25[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.facturacion.SdtPenalizaciones_SDT_Item AV35Item_Penalizaciones_SDT ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV63ProgressIndicator ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class penalizaciones_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H023L2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV28Clicodfrom ,
                                          int AV29Clicodto ,
                                          java.util.Date AV30Albprofchfrom ,
                                          java.util.Date AV31Albprofchto ,
                                          String AV27InBarcolnom ,
                                          short AV32Inbarmancod1 ,
                                          int A1243GuiRemCli ,
                                          java.util.Date A34AlbProfch ,
                                          String A135BarColNom ,
                                          short A3311BarManCod1 ,
                                          byte A32AlbProEsp ,
                                          String A5253BarAcc ,
                                          byte A33AlbProEst ,
                                          String A39AlbProPri ,
                                          int A2395BarAlbExt ,
                                          boolean A14267Fase_618 ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int28 = new byte[7];
      Object[] GXv_Object29 = new Object[2];
      scmdbuf = "SELECT T3.AlbProEst, T3.AlbProPri, T1.BarAlbExt, T2.BarAcc, T2.BarManCod1, T2.BarColNom, T1.AlbProEsp, T3.AlbProfch, T3.GuiRemCli, T1.BarPreKgm, T1.BarAlbKgmE, T2.BarAncAca1," ;
      scmdbuf += " T1.BarAlbMtrE, T1.AlbProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod" ;
      scmdbuf += " = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProEsp = 0 or T1.AlbProEsp > 9)");
      addWhere(sWhereString, "(T2.BarAcc <> 'S')");
      addWhere(sWhereString, "(T3.AlbProEst = 1)");
      addWhere(sWhereString, "(T3.AlbProPri = '1')");
      addWhere(sWhereString, "(T1.BarAlbExt = 0)");
      if ( ! (0==AV28Clicodfrom) )
      {
         addWhere(sWhereString, "(T3.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int28[1] = (byte)(1) ;
      }
      if ( ! (0==AV29Clicodto) )
      {
         addWhere(sWhereString, "(T3.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int28[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV30Albprofchfrom)) )
      {
         addWhere(sWhereString, "(T3.AlbProfch >= ?)");
      }
      else
      {
         GXv_int28[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV31Albprofchto)) )
      {
         addWhere(sWhereString, "(T3.AlbProfch <= ?)");
      }
      else
      {
         GXv_int28[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27InBarcolnom)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int28[5] = (byte)(1) ;
      }
      if ( ! (0==AV32Inbarmancod1) )
      {
         addWhere(sWhereString, "(T2.BarManCod1 = ?)");
      }
      else
      {
         GXv_int28[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T3.GuiRemCli, T3.AlbProEst, T1.AlbProCod" ;
      GXv_Object29[0] = scmdbuf ;
      GXv_Object29[1] = GXv_int28 ;
      return GXv_Object29 ;
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
                  return conditional_H023L2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Boolean) dynConstraints[15]).booleanValue() , (String)dynConstraints[16] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H023L2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((long[]) buf[14])[0] = rslt.getLong(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 1);
               ((byte[]) buf[16])[0] = rslt.getByte(16);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 3);
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
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 13);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[13]).shortValue());
               }
               return;
      }
   }

}

