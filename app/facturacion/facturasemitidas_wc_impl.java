package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class facturasemitidas_wc_impl extends GXWebComponent
{
   public facturasemitidas_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public facturasemitidas_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( facturasemitidas_wc_impl.class ));
   }

   public facturasemitidas_wc_impl( int remoteHandle ,
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
               AV28Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
               AV29Faccodfrom = (int)(GXutil.lval( httpContext.GetPar( "Faccodfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Faccodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Faccodfrom), 8, 0));
               AV30Faccodto = (int)(GXutil.lval( httpContext.GetPar( "Faccodto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Faccodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Faccodto), 8, 0));
               AV31clicodfrom = (int)(GXutil.lval( httpContext.GetPar( "clicodfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31clicodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31clicodfrom), 6, 0));
               AV32clicodto = (int)(GXutil.lval( httpContext.GetPar( "clicodto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32clicodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32clicodto), 6, 0));
               AV33facfchfrom = localUtil.parseDateParm( httpContext.GetPar( "facfchfrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33facfchfrom", localUtil.format(AV33facfchfrom, "99/99/99"));
               AV34facfchto = localUtil.parseDateParm( httpContext.GetPar( "facfchto")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34facfchto", localUtil.format(AV34facfchto, "99/99/99"));
               AV35Factipfac = (byte)(GXutil.lval( httpContext.GetPar( "Factipfac"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Factipfac", GXutil.str( AV35Factipfac, 1, 0));
               AV36FacSerNum = httpContext.GetPar( "FacSerNum") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36FacSerNum", AV36FacSerNum);
               AV37FacPri = httpContext.GetPar( "FacPri") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37FacPri", AV37FacPri);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV28Emprcod,Integer.valueOf(AV29Faccodfrom),Integer.valueOf(AV30Faccodto),Integer.valueOf(AV31clicodfrom),Integer.valueOf(AV32clicodto),AV33facfchfrom,AV34facfchto,Byte.valueOf(AV35Factipfac),AV36FacSerNum,AV37FacPri});
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
      nRC_GXsfl_36 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_36"))) ;
      nGXsfl_36_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_36_idx"))) ;
      sGXsfl_36_idx = httpContext.GetPar( "sGXsfl_36_idx") ;
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
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV18ColumnsSelector);
      AV69Pgmname = httpContext.GetPar( "Pgmname") ;
      AV28Emprcod = httpContext.GetPar( "Emprcod") ;
      AV29Faccodfrom = (int)(GXutil.lval( httpContext.GetPar( "Faccodfrom"))) ;
      AV30Faccodto = (int)(GXutil.lval( httpContext.GetPar( "Faccodto"))) ;
      AV31clicodfrom = (int)(GXutil.lval( httpContext.GetPar( "clicodfrom"))) ;
      AV32clicodto = (int)(GXutil.lval( httpContext.GetPar( "clicodto"))) ;
      AV33facfchfrom = localUtil.parseDateParm( httpContext.GetPar( "facfchfrom")) ;
      AV34facfchto = localUtil.parseDateParm( httpContext.GetPar( "facfchto")) ;
      AV35Factipfac = (byte)(GXutil.lval( httpContext.GetPar( "Factipfac"))) ;
      AV36FacSerNum = httpContext.GetPar( "FacSerNum") ;
      AV37FacPri = httpContext.GetPar( "FacPri") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV13FacturasEmitidas_SDT);
      AV43Tot_Factot = CommonUtil.decimalVal( httpContext.GetPar( "Tot_Factot"), ".") ;
      AV45Tot_FacBasImp = CommonUtil.decimalVal( httpContext.GetPar( "Tot_FacBasImp"), ".") ;
      AV47Tot_FacIVAImp = CommonUtil.decimalVal( httpContext.GetPar( "Tot_FacIVAImp"), ".") ;
      AV49Tot_Fac_kgs = CommonUtil.decimalVal( httpContext.GetPar( "Tot_Fac_kgs"), ".") ;
      AV51Tot_Fac_mts = CommonUtil.decimalVal( httpContext.GetPar( "Tot_Fac_mts"), ".") ;
      AV41FacturasEmitidas_SDT_json = httpContext.GetPar( "FacturasEmitidas_SDT_json") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV18ColumnsSelector, AV69Pgmname, AV28Emprcod, AV29Faccodfrom, AV30Faccodto, AV31clicodfrom, AV32clicodto, AV33facfchfrom, AV34facfchto, AV35Factipfac, AV36FacSerNum, AV37FacPri, AV13FacturasEmitidas_SDT, AV43Tot_Factot, AV45Tot_FacBasImp, AV47Tot_FacIVAImp, AV49Tot_Fac_kgs, AV51Tot_Fac_mts, AV41FacturasEmitidas_SDT_json, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa24M2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Facturas Emitidas", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.facturasemitidas_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV28Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV29Faccodfrom,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV30Faccodto,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV31clicodfrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV32clicodto,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV33facfchfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV34facfchto)),GXutil.URLEncode(GXutil.ltrimstr(AV35Factipfac,1,0)),GXutil.URLEncode(GXutil.rtrim(AV36FacSerNum)),GXutil.URLEncode(GXutil.rtrim(AV37FacPri))}, new String[] {"Emprcod","Faccodfrom","Faccodto","clicodfrom","clicodto","facfchfrom","facfchto","Factipfac","FacSerNum","FacPri"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFACTURASEMITIDAS_SDT", getSecureSignedToken( sPrefix, AV13FacturasEmitidas_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACTOT", getSecureSignedToken( sPrefix, localUtil.format( AV43Tot_Factot, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACBASIMP", getSecureSignedToken( sPrefix, localUtil.format( AV45Tot_FacBasImp, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIVAIMP", getSecureSignedToken( sPrefix, localUtil.format( AV47Tot_FacIVAImp, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FAC_KGS", getSecureSignedToken( sPrefix, localUtil.format( AV49Tot_Fac_kgs, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FAC_MTS", getSecureSignedToken( sPrefix, localUtil.format( AV51Tot_Fac_mts, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFACTURASEMITIDAS_SDT_JSON", getSecureSignedToken( sPrefix, AV41FacturasEmitidas_SDT_json));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"FacturasEmitidas_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV69Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\facturasemitidas_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Facturasemitidas_sdt", AV13FacturasEmitidas_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Facturasemitidas_sdt", AV13FacturasEmitidas_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_Facturasemitidas_sdt", getSecureSignedToken( sPrefix, AV13FacturasEmitidas_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_36", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_36, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV28Emprcod", GXutil.rtrim( wcpOAV28Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV29Faccodfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV29Faccodfrom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV30Faccodto", GXutil.ltrim( localUtil.ntoc( wcpOAV30Faccodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV31clicodfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV31clicodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV32clicodto", GXutil.ltrim( localUtil.ntoc( wcpOAV32clicodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV33facfchfrom", localUtil.dtoc( wcpOAV33facfchfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV34facfchto", localUtil.dtoc( wcpOAV34facfchto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV35Factipfac", GXutil.ltrim( localUtil.ntoc( wcpOAV35Factipfac, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV36FacSerNum", GXutil.rtrim( wcpOAV36FacSerNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV37FacPri", GXutil.rtrim( wcpOAV37FacPri));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV28Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFACCODFROM", GXutil.ltrim( localUtil.ntoc( AV29Faccodfrom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFACCODTO", GXutil.ltrim( localUtil.ntoc( AV30Faccodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODFROM", GXutil.ltrim( localUtil.ntoc( AV31clicodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODTO", GXutil.ltrim( localUtil.ntoc( AV32clicodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFACFCHFROM", localUtil.dtoc( AV33facfchfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFACFCHTO", localUtil.dtoc( AV34facfchto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFACTIPFAC", GXutil.ltrim( localUtil.ntoc( AV35Factipfac, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFACSERNUM", GXutil.rtrim( AV36FacSerNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFACPRI", GXutil.rtrim( AV37FacPri));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vFACTURASEMITIDAS_SDT", AV13FacturasEmitidas_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vFACTURASEMITIDAS_SDT", AV13FacturasEmitidas_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFACTURASEMITIDAS_SDT", getSecureSignedToken( sPrefix, AV13FacturasEmitidas_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FACTOT", GXutil.ltrim( localUtil.ntoc( AV43Tot_Factot, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACTOT", getSecureSignedToken( sPrefix, localUtil.format( AV43Tot_Factot, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FACBASIMP", GXutil.ltrim( localUtil.ntoc( AV45Tot_FacBasImp, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACBASIMP", getSecureSignedToken( sPrefix, localUtil.format( AV45Tot_FacBasImp, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FACIVAIMP", GXutil.ltrim( localUtil.ntoc( AV47Tot_FacIVAImp, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIVAIMP", getSecureSignedToken( sPrefix, localUtil.format( AV47Tot_FacIVAImp, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FAC_KGS", GXutil.ltrim( localUtil.ntoc( AV49Tot_Fac_kgs, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FAC_KGS", getSecureSignedToken( sPrefix, localUtil.format( AV49Tot_Fac_kgs, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FAC_MTS", GXutil.ltrim( localUtil.ntoc( AV51Tot_Fac_mts, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FAC_MTS", getSecureSignedToken( sPrefix, localUtil.format( AV51Tot_Fac_mts, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFACTURASEMITIDAS_SDT_JSON", AV41FacturasEmitidas_SDT_json);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFACTURASEMITIDAS_SDT_JSON", getSecureSignedToken( sPrefix, AV41FacturasEmitidas_SDT_json));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Width", GXutil.rtrim( Innewwindow1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Height", GXutil.rtrim( Innewwindow1_Height));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Target", GXutil.rtrim( Innewwindow1_Target));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
   }

   public void renderHtmlCloseForm24M2( )
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
      return "Facturacion.FacturasEmitidas_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Facturas Emitidas", "") ;
   }

   public void wb24M0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.facturacion.facturasemitidas_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 36, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\FacturasEmitidas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 36, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\FacturasEmitidas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 36, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\FacturasEmitidas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 36, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\FacturasEmitidas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_24M2( true) ;
      }
      else
      {
         wb_table1_25_24M2( false) ;
      }
      return  ;
   }

   public void wb_table1_25_24M2e( boolean wbgen )
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
         startgridcontrol36( ) ;
      }
      if ( wbEnd == 36 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_36 = (int)(nGXsfl_36_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV56GXV1 = nGXsfl_36_idx ;
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
         wb_table2_51_24M2( true) ;
      }
      else
      {
         wb_table2_51_24M2( false) ;
      }
      return  ;
   }

   public void wb_table2_51_24M2e( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV69Pgmname), GXutil.rtrim( localUtil.format( AV69Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\FacturasEmitidas_WC.htm");
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
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, sPrefix+"INNEWWINDOW1Container");
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
      if ( wbEnd == 36 )
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
               AV56GXV1 = nGXsfl_36_idx ;
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

   public void start24M2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Facturas Emitidas", ""), (short)(0)) ;
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
            strup24M0( ) ;
         }
      }
   }

   public void ws24M2( )
   {
      start24M2( ) ;
      evt24M2( ) ;
   }

   public void evt24M2( )
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
                              strup24M0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup24M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1124M2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup24M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1224M2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup24M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1324M2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup24M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e1424M2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup24M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportReport' */
                                 e1524M2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup24M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e1624M2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup24M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavTotvalue_factot_Internalname ;
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
                              strup24M0( ) ;
                           }
                           nGXsfl_36_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_362( ) ;
                           AV56GXV1 = (int)(nGXsfl_36_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV13FacturasEmitidas_SDT.size() >= AV56GXV1 ) && ( AV56GXV1 > 0 ) )
                           {
                              AV13FacturasEmitidas_SDT.currentItem( ((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)) );
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
                                       GX_FocusControl = edtavTotvalue_factot_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e1724M2 ();
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
                                       GX_FocusControl = edtavTotvalue_factot_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e1824M2 ();
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
                                       GX_FocusControl = edtavTotvalue_factot_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e1924M2 ();
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
                                    strup24M0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavTotvalue_factot_Internalname ;
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

   public void we24M2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm24M2( ) ;
         }
      }
   }

   public void pa24M2( )
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
            GX_FocusControl = edtavTotvalue_factot_Internalname ;
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
      subsflControlProps_362( ) ;
      while ( nGXsfl_36_idx <= nRC_GXsfl_36 )
      {
         sendrow_362( ) ;
         nGXsfl_36_idx = ((subGrid_Islastpage==1)&&(nGXsfl_36_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_36_idx+1) ;
         sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_362( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ,
                                 String AV69Pgmname ,
                                 String AV28Emprcod ,
                                 int AV29Faccodfrom ,
                                 int AV30Faccodto ,
                                 int AV31clicodfrom ,
                                 int AV32clicodto ,
                                 java.util.Date AV33facfchfrom ,
                                 java.util.Date AV34facfchto ,
                                 byte AV35Factipfac ,
                                 String AV36FacSerNum ,
                                 String AV37FacPri ,
                                 GXBaseCollection<app.facturacion.SdtFacturasEmitidas_SDT_Item> AV13FacturasEmitidas_SDT ,
                                 java.math.BigDecimal AV43Tot_Factot ,
                                 java.math.BigDecimal AV45Tot_FacBasImp ,
                                 java.math.BigDecimal AV47Tot_FacIVAImp ,
                                 java.math.BigDecimal AV49Tot_Fac_kgs ,
                                 java.math.BigDecimal AV51Tot_Fac_mts ,
                                 String AV41FacturasEmitidas_SDT_json ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1824M2 ();
      GRID_nCurrentRecord = 0 ;
      rf24M2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"FacturasEmitidas_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV69Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\facturasemitidas_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf24M2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV69Pgmname = "Facturacion.FacturasEmitidas_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69Pgmname", AV69Pgmname);
      Gx_err = (short)(0) ;
      edtavFacturasemitidas_sdt__faccod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__faccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__faccod_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavFacturasemitidas_sdt__facfch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__facfch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__facfch_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavFacturasemitidas_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__clicod_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavFacturasemitidas_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__clinom_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavFacturasemitidas_sdt__clinif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__clinif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__clinif_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavFacturasemitidas_sdt__factot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__factot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__factot_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavFacturasemitidas_sdt__facbasimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__facbasimp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__facbasimp_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavFacturasemitidas_sdt__facivapor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__facivapor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__facivapor_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavFacturasemitidas_sdt__facivaimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__facivaimp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__facivaimp_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavFacturasemitidas_sdt__fac_kgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__fac_kgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__fac_kgs_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavFacturasemitidas_sdt__fac_mts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__fac_mts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__fac_mts_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavFacturasemitidas_sdt__factipo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__factipo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__factipo_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavTotvalue_factot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_factot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_factot_Enabled), 5, 0), true);
      edtavTotvalue_facbasimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_facbasimp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_facbasimp_Enabled), 5, 0), true);
      edtavTotvalue_facivaimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_facivaimp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_facivaimp_Enabled), 5, 0), true);
      edtavTotvalue_fac_kgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_fac_kgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_fac_kgs_Enabled), 5, 0), true);
      edtavTotvalue_fac_mts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_fac_mts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_fac_mts_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf24M2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(36) ;
      /* Execute user event: Refresh */
      e1824M2 ();
      nGXsfl_36_idx = 1 ;
      sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_362( ) ;
      bGXsfl_36_Refreshing = true ;
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
         subsflControlProps_362( ) ;
         e1924M2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_36_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e1924M2 ();
         }
         wbEnd = (short)(36) ;
         wb24M0( ) ;
      }
      bGXsfl_36_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes24M2( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vFACTURASEMITIDAS_SDT", AV13FacturasEmitidas_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vFACTURASEMITIDAS_SDT", AV13FacturasEmitidas_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFACTURASEMITIDAS_SDT", getSecureSignedToken( sPrefix, AV13FacturasEmitidas_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FACTOT", GXutil.ltrim( localUtil.ntoc( AV43Tot_Factot, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACTOT", getSecureSignedToken( sPrefix, localUtil.format( AV43Tot_Factot, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FACBASIMP", GXutil.ltrim( localUtil.ntoc( AV45Tot_FacBasImp, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACBASIMP", getSecureSignedToken( sPrefix, localUtil.format( AV45Tot_FacBasImp, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FACIVAIMP", GXutil.ltrim( localUtil.ntoc( AV47Tot_FacIVAImp, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIVAIMP", getSecureSignedToken( sPrefix, localUtil.format( AV47Tot_FacIVAImp, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FAC_KGS", GXutil.ltrim( localUtil.ntoc( AV49Tot_Fac_kgs, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FAC_KGS", getSecureSignedToken( sPrefix, localUtil.format( AV49Tot_Fac_kgs, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FAC_MTS", GXutil.ltrim( localUtil.ntoc( AV51Tot_Fac_mts, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FAC_MTS", getSecureSignedToken( sPrefix, localUtil.format( AV51Tot_Fac_mts, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFACTURASEMITIDAS_SDT_JSON", AV41FacturasEmitidas_SDT_json);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFACTURASEMITIDAS_SDT_JSON", getSecureSignedToken( sPrefix, AV41FacturasEmitidas_SDT_json));
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
      return AV13FacturasEmitidas_SDT.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV18ColumnsSelector, AV69Pgmname, AV28Emprcod, AV29Faccodfrom, AV30Faccodto, AV31clicodfrom, AV32clicodto, AV33facfchfrom, AV34facfchto, AV35Factipfac, AV36FacSerNum, AV37FacPri, AV13FacturasEmitidas_SDT, AV43Tot_Factot, AV45Tot_FacBasImp, AV47Tot_FacIVAImp, AV49Tot_Fac_kgs, AV51Tot_Fac_mts, AV41FacturasEmitidas_SDT_json, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV18ColumnsSelector, AV69Pgmname, AV28Emprcod, AV29Faccodfrom, AV30Faccodto, AV31clicodfrom, AV32clicodto, AV33facfchfrom, AV34facfchto, AV35Factipfac, AV36FacSerNum, AV37FacPri, AV13FacturasEmitidas_SDT, AV43Tot_Factot, AV45Tot_FacBasImp, AV47Tot_FacIVAImp, AV49Tot_Fac_kgs, AV51Tot_Fac_mts, AV41FacturasEmitidas_SDT_json, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV18ColumnsSelector, AV69Pgmname, AV28Emprcod, AV29Faccodfrom, AV30Faccodto, AV31clicodfrom, AV32clicodto, AV33facfchfrom, AV34facfchto, AV35Factipfac, AV36FacSerNum, AV37FacPri, AV13FacturasEmitidas_SDT, AV43Tot_Factot, AV45Tot_FacBasImp, AV47Tot_FacIVAImp, AV49Tot_Fac_kgs, AV51Tot_Fac_mts, AV41FacturasEmitidas_SDT_json, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV18ColumnsSelector, AV69Pgmname, AV28Emprcod, AV29Faccodfrom, AV30Faccodto, AV31clicodfrom, AV32clicodto, AV33facfchfrom, AV34facfchto, AV35Factipfac, AV36FacSerNum, AV37FacPri, AV13FacturasEmitidas_SDT, AV43Tot_Factot, AV45Tot_FacBasImp, AV47Tot_FacIVAImp, AV49Tot_Fac_kgs, AV51Tot_Fac_mts, AV41FacturasEmitidas_SDT_json, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV18ColumnsSelector, AV69Pgmname, AV28Emprcod, AV29Faccodfrom, AV30Faccodto, AV31clicodfrom, AV32clicodto, AV33facfchfrom, AV34facfchto, AV35Factipfac, AV36FacSerNum, AV37FacPri, AV13FacturasEmitidas_SDT, AV43Tot_Factot, AV45Tot_FacBasImp, AV47Tot_FacIVAImp, AV49Tot_Fac_kgs, AV51Tot_Fac_mts, AV41FacturasEmitidas_SDT_json, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV69Pgmname = "Facturacion.FacturasEmitidas_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69Pgmname", AV69Pgmname);
      Gx_err = (short)(0) ;
      edtavFacturasemitidas_sdt__faccod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__faccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__faccod_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavFacturasemitidas_sdt__facfch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__facfch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__facfch_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavFacturasemitidas_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__clicod_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavFacturasemitidas_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__clinom_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavFacturasemitidas_sdt__clinif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__clinif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__clinif_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavFacturasemitidas_sdt__factot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__factot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__factot_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavFacturasemitidas_sdt__facbasimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__facbasimp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__facbasimp_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavFacturasemitidas_sdt__facivapor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__facivapor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__facivapor_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavFacturasemitidas_sdt__facivaimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__facivaimp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__facivaimp_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavFacturasemitidas_sdt__fac_kgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__fac_kgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__fac_kgs_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavFacturasemitidas_sdt__fac_mts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__fac_mts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__fac_mts_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavFacturasemitidas_sdt__factipo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__factipo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__factipo_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavTotvalue_factot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_factot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_factot_Enabled), 5, 0), true);
      edtavTotvalue_facbasimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_facbasimp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_facbasimp_Enabled), 5, 0), true);
      edtavTotvalue_facivaimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_facivaimp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_facivaimp_Enabled), 5, 0), true);
      edtavTotvalue_fac_kgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_fac_kgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_fac_kgs_Enabled), 5, 0), true);
      edtavTotvalue_fac_mts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_fac_mts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_fac_mts_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup24M0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1724M2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Facturasemitidas_sdt"), AV13FacturasEmitidas_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV24DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV18ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vFACTURASEMITIDAS_SDT"), AV13FacturasEmitidas_SDT);
         /* Read saved values. */
         nRC_GXsfl_36 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_36"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV26GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV27GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV28Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV28Emprcod") ;
         wcpOAV29Faccodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV29Faccodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV30Faccodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV30Faccodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV31clicodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV31clicodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV32clicodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV32clicodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV33facfchfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV33facfchfrom"), 0) ;
         wcpOAV34facfchto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV34facfchto"), 0) ;
         wcpOAV35Factipfac = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV35Factipfac"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV36FacSerNum = httpContext.cgiGet( sPrefix+"wcpOAV36FacSerNum") ;
         wcpOAV37FacPri = httpContext.cgiGet( sPrefix+"wcpOAV37FacPri") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Innewwindow1_Width = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Width") ;
         Innewwindow1_Height = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Height") ;
         Innewwindow1_Target = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Target") ;
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
         nRC_GXsfl_36 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_36"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_36_fel_idx = 0 ;
         while ( nGXsfl_36_fel_idx < nRC_GXsfl_36 )
         {
            nGXsfl_36_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_36_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_36_fel_idx+1) ;
            sGXsfl_36_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_362( ) ;
            AV56GXV1 = (int)(nGXsfl_36_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV13FacturasEmitidas_SDT.size() >= AV56GXV1 ) && ( AV56GXV1 > 0 ) )
            {
               AV13FacturasEmitidas_SDT.currentItem( ((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)) );
            }
         }
         if ( nGXsfl_36_fel_idx == 0 )
         {
            nGXsfl_36_idx = 1 ;
            sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_362( ) ;
         }
         nGXsfl_36_fel_idx = 1 ;
         /* Read variables values. */
         AV44TotValue_Factot = httpContext.cgiGet( edtavTotvalue_factot_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TotValue_Factot", AV44TotValue_Factot);
         AV46TotValue_FacBasImp = httpContext.cgiGet( edtavTotvalue_facbasimp_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TotValue_FacBasImp", AV46TotValue_FacBasImp);
         AV48TotValue_FacIVAImp = httpContext.cgiGet( edtavTotvalue_facivaimp_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TotValue_FacIVAImp", AV48TotValue_FacIVAImp);
         AV50TotValue_Fac_kgs = httpContext.cgiGet( edtavTotvalue_fac_kgs_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TotValue_Fac_kgs", AV50TotValue_Fac_kgs);
         AV52TotValue_Fac_mts = httpContext.cgiGet( edtavTotvalue_fac_mts_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TotValue_Fac_mts", AV52TotValue_Fac_mts);
         AV69Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69Pgmname", AV69Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"FacturasEmitidas_WC");
         AV69Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69Pgmname", AV69Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV69Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("facturacion\\facturasemitidas_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1724M2 ();
      if (returnInSub) return;
   }

   public void e1724M2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXv_char1[0] = AV41FacturasEmitidas_SDT_json ;
      new app.facturacion.facturasemitidas_prc(remoteHandle, context).execute( AV28Emprcod, AV31clicodfrom, AV32clicodto, AV29Faccodfrom, AV30Faccodto, AV33facfchfrom, AV34facfchto, AV36FacSerNum, AV35Factipfac, AV37FacPri, GXv_char1) ;
      facturasemitidas_wc_impl.this.AV41FacturasEmitidas_SDT_json = GXv_char1[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41FacturasEmitidas_SDT_json", AV41FacturasEmitidas_SDT_json);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFACTURASEMITIDAS_SDT_JSON", getSecureSignedToken( sPrefix, AV41FacturasEmitidas_SDT_json));
      AV13FacturasEmitidas_SDT.fromJSonString(AV41FacturasEmitidas_SDT_json, null);
      gx_BV36 = true ;
      GXt_char2 = AV38Station ;
      GXv_char1[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char1) ;
      facturasemitidas_wc_impl.this.GXt_char2 = GXv_char1[0] ;
      AV38Station = GXt_char2 ;
      GXv_char1[0] = AV28Emprcod ;
      GXv_char3[0] = AV39EmprNom ;
      GXv_char4[0] = AV40UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV38Station, GXv_char1, GXv_char3, GXv_char4) ;
      facturasemitidas_wc_impl.this.AV28Emprcod = GXv_char1[0] ;
      facturasemitidas_wc_impl.this.AV39EmprNom = GXv_char3[0] ;
      facturasemitidas_wc_impl.this.AV40UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
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

   public void e1824M2( )
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
      S122 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV20Session.getValue("Facturacion.FacturasEmitidas_WCColumnsSelector"), "") != 0 )
      {
         AV16ColumnsSelectorXML = AV20Session.getValue("Facturacion.FacturasEmitidas_WCColumnsSelector") ;
         AV18ColumnsSelector.fromxml(AV16ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S132 ();
         if (returnInSub) return;
      }
      edtavFacturasemitidas_sdt__faccod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__faccod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__faccod_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavFacturasemitidas_sdt__facfch_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__facfch_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__facfch_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavFacturasemitidas_sdt__clicod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__clicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__clicod_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavFacturasemitidas_sdt__clinom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__clinom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__clinom_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavFacturasemitidas_sdt__clinif_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__clinif_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__clinif_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavFacturasemitidas_sdt__factot_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__factot_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__factot_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavFacturasemitidas_sdt__facbasimp_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__facbasimp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__facbasimp_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavFacturasemitidas_sdt__facivapor_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__facivapor_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__facivapor_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavFacturasemitidas_sdt__facivaimp_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__facivaimp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__facivaimp_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavFacturasemitidas_sdt__fac_kgs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__fac_kgs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__fac_kgs_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavFacturasemitidas_sdt__fac_mts_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFacturasemitidas_sdt__fac_mts_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturasemitidas_sdt__fac_mts_Visible), 5, 0), !bGXsfl_36_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S152 ();
      if (returnInSub) return;
      AV26GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26GridCurrentPage), 10, 0));
      AV27GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S162 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
   }

   public void e1124M2( )
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

   public void e1224M2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e1924M2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV56GXV1 = 1 ;
      while ( AV56GXV1 <= AV13FacturasEmitidas_SDT.size() )
      {
         AV13FacturasEmitidas_SDT.currentItem( ((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(36) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_362( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_36_Refreshing )
         {
            httpContext.doAjaxLoad(36, GridRow);
         }
         AV56GXV1 = (int)(AV56GXV1+1) ;
      }
   }

   public void e1324M2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV16ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV18ColumnsSelector.fromJSonString(AV16ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "Facturacion.FacturasEmitidas_WCColumnsSelector", ((GXutil.strcmp("", AV16ColumnsSelectorXML)==0) ? "" : AV18ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
   }

   public void e1424M2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV53websession.setValue(httpContext.getMessage( "&FacturasEmitidas_SDT_json", ""), AV41FacturasEmitidas_SDT_json);
      GXv_char4[0] = AV14ExcelFilename ;
      GXv_char3[0] = AV15ErrorMessage ;
      new app.facturacion.facturasemitidas_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      facturasemitidas_wc_impl.this.AV14ExcelFilename = GXv_char4[0] ;
      facturasemitidas_wc_impl.this.AV15ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV14ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV14ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV15ErrorMessage);
      }
   }

   public void e1524M2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      AV53websession.setValue(httpContext.getMessage( "&FacturasEmitidas_SDT_json", ""), AV41FacturasEmitidas_SDT_json);
      Innewwindow1_Target = formatLink("app.facturacion.facturasemitidas_wcexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, sPrefix, false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, sPrefix, false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, sPrefix, false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod(sPrefix, false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
   }

   public void e1624M2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV53websession.setValue(httpContext.getMessage( "&FacturasEmitidas_SDT_json", ""), AV41FacturasEmitidas_SDT_json);
      callWebObject(formatLink("app.facturacion.facturasemitidas_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S152( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
   }

   public void S132( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV18ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "FacturasEmitidas_SDT__Faccod", "", "Nº Factura", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "FacturasEmitidas_SDT__Facfch", "", "Fecha", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "FacturasEmitidas_SDT__Clicod", "", "Cliente", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "FacturasEmitidas_SDT__CliNom", "", "Nombre", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "FacturasEmitidas_SDT__CliNif", "", "Nif", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "FacturasEmitidas_SDT__Factot", "", "Valor Factura", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "FacturasEmitidas_SDT__FacBasImp", "", "Base Imponible", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "FacturasEmitidas_SDT__FacIvaPor", "", "% IVA", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "FacturasEmitidas_SDT__FacIVAImp", "", "Importe IVA", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "FacturasEmitidas_SDT__Fac_kgs", "", "Kilos Fra.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "FacturasEmitidas_SDT__Fac_mts", "", "Metros Fra.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char2 = AV17UserCustomValue ;
      GXv_char4[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Facturacion.FacturasEmitidas_WCColumnsSelector", GXv_char4) ;
      facturasemitidas_wc_impl.this.GXt_char2 = GXv_char4[0] ;
      AV17UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV17UserCustomValue)==0) ) )
      {
         AV19ColumnsSelectorAux.fromxml(AV17UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV19ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue(AV69Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV69Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV20Session.getValue(AV69Pgmname+"GridState"), null, null);
      }
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S122( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV20Session.getValue(AV69Pgmname+"GridState"), null, null);
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      if ( ! (GXutil.strcmp("", AV28Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV28Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV29Faccodfrom) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FACCODFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV29Faccodfrom, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV30Faccodto) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FACCODTO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV30Faccodto, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV31clicodfrom) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICODFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV31clicodfrom, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV32clicodto) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICODTO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV32clicodto, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV33facfchfrom)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FACFCHFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV33facfchfrom, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV34facfchto)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FACFCHTO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV34facfchto, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV35Factipfac) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FACTIPFAC" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV35Factipfac, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV36FacSerNum)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FACSERNUM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV36FacSerNum );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV37FacPri)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FACPRI" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV37FacPri );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV69Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S142( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV43Tot_Factot = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43Tot_Factot", GXutil.ltrimstr( AV43Tot_Factot, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACTOT", getSecureSignedToken( sPrefix, localUtil.format( AV43Tot_Factot, "ZZZZZZZZZ9.99")));
      AV45Tot_FacBasImp = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Tot_FacBasImp", GXutil.ltrimstr( AV45Tot_FacBasImp, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACBASIMP", getSecureSignedToken( sPrefix, localUtil.format( AV45Tot_FacBasImp, "ZZZZZZZZZ9.99")));
      AV47Tot_FacIVAImp = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47Tot_FacIVAImp", GXutil.ltrimstr( AV47Tot_FacIVAImp, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIVAIMP", getSecureSignedToken( sPrefix, localUtil.format( AV47Tot_FacIVAImp, "ZZZZZZZ9.99")));
      AV49Tot_Fac_kgs = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Tot_Fac_kgs", GXutil.ltrimstr( AV49Tot_Fac_kgs, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FAC_KGS", getSecureSignedToken( sPrefix, localUtil.format( AV49Tot_Fac_kgs, "ZZZZZ9.99")));
      AV51Tot_Fac_mts = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51Tot_Fac_mts", GXutil.ltrimstr( AV51Tot_Fac_mts, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FAC_MTS", getSecureSignedToken( sPrefix, localUtil.format( AV51Tot_Fac_mts, "ZZZZZ9.99")));
   }

   public void S162( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV70GXV14 = 1 ;
      while ( AV70GXV14 <= AV13FacturasEmitidas_SDT.size() )
      {
         AV42FacturasEmitidas_SDTItem = (app.facturacion.SdtFacturasEmitidas_SDT_Item)((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV70GXV14));
         AV43Tot_Factot = AV43Tot_Factot.add((AV42FacturasEmitidas_SDTItem.getgxTv_SdtFacturasEmitidas_SDT_Item_Factot())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43Tot_Factot", GXutil.ltrimstr( AV43Tot_Factot, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACTOT", getSecureSignedToken( sPrefix, localUtil.format( AV43Tot_Factot, "ZZZZZZZZZ9.99")));
         AV45Tot_FacBasImp = AV45Tot_FacBasImp.add((AV42FacturasEmitidas_SDTItem.getgxTv_SdtFacturasEmitidas_SDT_Item_Facbasimp())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Tot_FacBasImp", GXutil.ltrimstr( AV45Tot_FacBasImp, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACBASIMP", getSecureSignedToken( sPrefix, localUtil.format( AV45Tot_FacBasImp, "ZZZZZZZZZ9.99")));
         AV47Tot_FacIVAImp = AV47Tot_FacIVAImp.add((AV42FacturasEmitidas_SDTItem.getgxTv_SdtFacturasEmitidas_SDT_Item_Facivaimp())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47Tot_FacIVAImp", GXutil.ltrimstr( AV47Tot_FacIVAImp, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIVAIMP", getSecureSignedToken( sPrefix, localUtil.format( AV47Tot_FacIVAImp, "ZZZZZZZ9.99")));
         AV49Tot_Fac_kgs = AV49Tot_Fac_kgs.add((AV42FacturasEmitidas_SDTItem.getgxTv_SdtFacturasEmitidas_SDT_Item_Fac_kgs())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Tot_Fac_kgs", GXutil.ltrimstr( AV49Tot_Fac_kgs, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FAC_KGS", getSecureSignedToken( sPrefix, localUtil.format( AV49Tot_Fac_kgs, "ZZZZZ9.99")));
         AV51Tot_Fac_mts = AV51Tot_Fac_mts.add((AV42FacturasEmitidas_SDTItem.getgxTv_SdtFacturasEmitidas_SDT_Item_Fac_mts())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51Tot_Fac_mts", GXutil.ltrimstr( AV51Tot_Fac_mts, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FAC_MTS", getSecureSignedToken( sPrefix, localUtil.format( AV51Tot_Fac_mts, "ZZZZZ9.99")));
         AV70GXV14 = (int)(AV70GXV14+1) ;
      }
      AV44TotValue_Factot = localUtil.format( AV43Tot_Factot, "ZZZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TotValue_Factot", AV44TotValue_Factot);
      AV46TotValue_FacBasImp = localUtil.format( AV45Tot_FacBasImp, "ZZZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TotValue_FacBasImp", AV46TotValue_FacBasImp);
      AV48TotValue_FacIVAImp = localUtil.format( AV47Tot_FacIVAImp, "ZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TotValue_FacIVAImp", AV48TotValue_FacIVAImp);
      AV50TotValue_Fac_kgs = localUtil.format( AV49Tot_Fac_kgs, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TotValue_Fac_kgs", AV50TotValue_Fac_kgs);
      AV52TotValue_Fac_mts = localUtil.format( AV51Tot_Fac_mts, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TotValue_Fac_mts", AV52TotValue_Fac_mts);
   }

   public void wb_table2_51_24M2( boolean wbgen )
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
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_factot_Internalname, httpContext.getMessage( "Tot Value_Factot", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_factot_Internalname, AV44TotValue_Factot, GXutil.rtrim( localUtil.format( AV44TotValue_Factot, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,60);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_factot_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_factot_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\FacturasEmitidas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_facbasimp_Internalname, httpContext.getMessage( "Tot Value_Fac Bas Imp", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_facbasimp_Internalname, AV46TotValue_FacBasImp, GXutil.rtrim( localUtil.format( AV46TotValue_FacBasImp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_facbasimp_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_facbasimp_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\FacturasEmitidas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_facivaimp_Internalname, httpContext.getMessage( "Tot Value_Fac IVAImp", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_facivaimp_Internalname, AV48TotValue_FacIVAImp, GXutil.rtrim( localUtil.format( AV48TotValue_FacIVAImp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,67);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_facivaimp_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_facivaimp_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\FacturasEmitidas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_fac_kgs_Internalname, httpContext.getMessage( "Tot Value_Fac_kgs", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_fac_kgs_Internalname, AV50TotValue_Fac_kgs, GXutil.rtrim( localUtil.format( AV50TotValue_Fac_kgs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,70);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_fac_kgs_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_fac_kgs_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\FacturasEmitidas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_fac_mts_Internalname, httpContext.getMessage( "Tot Value_Fac_mts", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_fac_mts_Internalname, AV52TotValue_Fac_mts, GXutil.rtrim( localUtil.format( AV52TotValue_Fac_mts, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,73);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_fac_mts_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_fac_mts_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\FacturasEmitidas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_51_24M2e( true) ;
      }
      else
      {
         wb_table2_51_24M2e( false) ;
      }
   }

   public void wb_table1_25_24M2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_24M2e( true) ;
      }
      else
      {
         wb_table1_25_24M2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV28Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
      AV29Faccodfrom = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Faccodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Faccodfrom), 8, 0));
      AV30Faccodto = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Faccodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Faccodto), 8, 0));
      AV31clicodfrom = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31clicodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31clicodfrom), 6, 0));
      AV32clicodto = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32clicodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32clicodto), 6, 0));
      AV33facfchfrom = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33facfchfrom", localUtil.format(AV33facfchfrom, "99/99/99"));
      AV34facfchto = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34facfchto", localUtil.format(AV34facfchto, "99/99/99"));
      AV35Factipfac = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Factipfac", GXutil.str( AV35Factipfac, 1, 0));
      AV36FacSerNum = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36FacSerNum", AV36FacSerNum);
      AV37FacPri = (String)getParm(obj,9,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37FacPri", AV37FacPri);
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
      pa24M2( ) ;
      ws24M2( ) ;
      we24M2( ) ;
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
      sCtrlAV28Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV29Faccodfrom = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV30Faccodto = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV31clicodfrom = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV32clicodto = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV33facfchfrom = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV34facfchto = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV35Factipfac = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV36FacSerNum = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV37FacPri = (String)getParm(obj,9,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa24M2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "facturacion\\facturasemitidas_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa24M2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV28Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
         AV29Faccodfrom = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Faccodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Faccodfrom), 8, 0));
         AV30Faccodto = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Faccodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Faccodto), 8, 0));
         AV31clicodfrom = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31clicodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31clicodfrom), 6, 0));
         AV32clicodto = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32clicodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32clicodto), 6, 0));
         AV33facfchfrom = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33facfchfrom", localUtil.format(AV33facfchfrom, "99/99/99"));
         AV34facfchto = (java.util.Date)getParm(obj,8,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34facfchto", localUtil.format(AV34facfchto, "99/99/99"));
         AV35Factipfac = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Factipfac", GXutil.str( AV35Factipfac, 1, 0));
         AV36FacSerNum = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36FacSerNum", AV36FacSerNum);
         AV37FacPri = (String)getParm(obj,11,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37FacPri", AV37FacPri);
      }
      wcpOAV28Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV28Emprcod") ;
      wcpOAV29Faccodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV29Faccodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV30Faccodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV30Faccodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV31clicodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV31clicodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV32clicodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV32clicodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV33facfchfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV33facfchfrom"), 0) ;
      wcpOAV34facfchto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV34facfchto"), 0) ;
      wcpOAV35Factipfac = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV35Factipfac"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV36FacSerNum = httpContext.cgiGet( sPrefix+"wcpOAV36FacSerNum") ;
      wcpOAV37FacPri = httpContext.cgiGet( sPrefix+"wcpOAV37FacPri") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV28Emprcod, wcpOAV28Emprcod) != 0 ) || ( AV29Faccodfrom != wcpOAV29Faccodfrom ) || ( AV30Faccodto != wcpOAV30Faccodto ) || ( AV31clicodfrom != wcpOAV31clicodfrom ) || ( AV32clicodto != wcpOAV32clicodto ) || !( GXutil.dateCompare(GXutil.resetTime(AV33facfchfrom), GXutil.resetTime(wcpOAV33facfchfrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV34facfchto), GXutil.resetTime(wcpOAV34facfchto)) ) || ( AV35Factipfac != wcpOAV35Factipfac ) || ( GXutil.strcmp(AV36FacSerNum, wcpOAV36FacSerNum) != 0 ) || ( GXutil.strcmp(AV37FacPri, wcpOAV37FacPri) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV28Emprcod = AV28Emprcod ;
      wcpOAV29Faccodfrom = AV29Faccodfrom ;
      wcpOAV30Faccodto = AV30Faccodto ;
      wcpOAV31clicodfrom = AV31clicodfrom ;
      wcpOAV32clicodto = AV32clicodto ;
      wcpOAV33facfchfrom = AV33facfchfrom ;
      wcpOAV34facfchto = AV34facfchto ;
      wcpOAV35Factipfac = AV35Factipfac ;
      wcpOAV36FacSerNum = AV36FacSerNum ;
      wcpOAV37FacPri = AV37FacPri ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV28Emprcod = httpContext.cgiGet( sPrefix+"AV28Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV28Emprcod) > 0 )
      {
         AV28Emprcod = httpContext.cgiGet( sCtrlAV28Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
      }
      else
      {
         AV28Emprcod = httpContext.cgiGet( sPrefix+"AV28Emprcod_PARM") ;
      }
      sCtrlAV29Faccodfrom = httpContext.cgiGet( sPrefix+"AV29Faccodfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV29Faccodfrom) > 0 )
      {
         AV29Faccodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV29Faccodfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Faccodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Faccodfrom), 8, 0));
      }
      else
      {
         AV29Faccodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV29Faccodfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV30Faccodto = httpContext.cgiGet( sPrefix+"AV30Faccodto_CTRL") ;
      if ( GXutil.len( sCtrlAV30Faccodto) > 0 )
      {
         AV30Faccodto = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV30Faccodto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Faccodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Faccodto), 8, 0));
      }
      else
      {
         AV30Faccodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV30Faccodto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV31clicodfrom = httpContext.cgiGet( sPrefix+"AV31clicodfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV31clicodfrom) > 0 )
      {
         AV31clicodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV31clicodfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31clicodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31clicodfrom), 6, 0));
      }
      else
      {
         AV31clicodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV31clicodfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV32clicodto = httpContext.cgiGet( sPrefix+"AV32clicodto_CTRL") ;
      if ( GXutil.len( sCtrlAV32clicodto) > 0 )
      {
         AV32clicodto = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV32clicodto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32clicodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32clicodto), 6, 0));
      }
      else
      {
         AV32clicodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV32clicodto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV33facfchfrom = httpContext.cgiGet( sPrefix+"AV33facfchfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV33facfchfrom) > 0 )
      {
         AV33facfchfrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV33facfchfrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33facfchfrom", localUtil.format(AV33facfchfrom, "99/99/99"));
      }
      else
      {
         AV33facfchfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV33facfchfrom_PARM"), 0) ;
      }
      sCtrlAV34facfchto = httpContext.cgiGet( sPrefix+"AV34facfchto_CTRL") ;
      if ( GXutil.len( sCtrlAV34facfchto) > 0 )
      {
         AV34facfchto = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV34facfchto), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34facfchto", localUtil.format(AV34facfchto, "99/99/99"));
      }
      else
      {
         AV34facfchto = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV34facfchto_PARM"), 0) ;
      }
      sCtrlAV35Factipfac = httpContext.cgiGet( sPrefix+"AV35Factipfac_CTRL") ;
      if ( GXutil.len( sCtrlAV35Factipfac) > 0 )
      {
         AV35Factipfac = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV35Factipfac), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Factipfac", GXutil.str( AV35Factipfac, 1, 0));
      }
      else
      {
         AV35Factipfac = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV35Factipfac_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV36FacSerNum = httpContext.cgiGet( sPrefix+"AV36FacSerNum_CTRL") ;
      if ( GXutil.len( sCtrlAV36FacSerNum) > 0 )
      {
         AV36FacSerNum = httpContext.cgiGet( sCtrlAV36FacSerNum) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36FacSerNum", AV36FacSerNum);
      }
      else
      {
         AV36FacSerNum = httpContext.cgiGet( sPrefix+"AV36FacSerNum_PARM") ;
      }
      sCtrlAV37FacPri = httpContext.cgiGet( sPrefix+"AV37FacPri_CTRL") ;
      if ( GXutil.len( sCtrlAV37FacPri) > 0 )
      {
         AV37FacPri = httpContext.cgiGet( sCtrlAV37FacPri) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37FacPri", AV37FacPri);
      }
      else
      {
         AV37FacPri = httpContext.cgiGet( sPrefix+"AV37FacPri_PARM") ;
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
      pa24M2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws24M2( ) ;
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
      ws24M2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28Emprcod_PARM", GXutil.rtrim( AV28Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV28Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28Emprcod_CTRL", GXutil.rtrim( sCtrlAV28Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29Faccodfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV29Faccodfrom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV29Faccodfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29Faccodfrom_CTRL", GXutil.rtrim( sCtrlAV29Faccodfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30Faccodto_PARM", GXutil.ltrim( localUtil.ntoc( AV30Faccodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV30Faccodto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30Faccodto_CTRL", GXutil.rtrim( sCtrlAV30Faccodto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31clicodfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV31clicodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV31clicodfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31clicodfrom_CTRL", GXutil.rtrim( sCtrlAV31clicodfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32clicodto_PARM", GXutil.ltrim( localUtil.ntoc( AV32clicodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV32clicodto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32clicodto_CTRL", GXutil.rtrim( sCtrlAV32clicodto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33facfchfrom_PARM", localUtil.dtoc( AV33facfchfrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV33facfchfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33facfchfrom_CTRL", GXutil.rtrim( sCtrlAV33facfchfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34facfchto_PARM", localUtil.dtoc( AV34facfchto, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV34facfchto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34facfchto_CTRL", GXutil.rtrim( sCtrlAV34facfchto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35Factipfac_PARM", GXutil.ltrim( localUtil.ntoc( AV35Factipfac, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV35Factipfac)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35Factipfac_CTRL", GXutil.rtrim( sCtrlAV35Factipfac));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36FacSerNum_PARM", GXutil.rtrim( AV36FacSerNum));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV36FacSerNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36FacSerNum_CTRL", GXutil.rtrim( sCtrlAV36FacSerNum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37FacPri_PARM", GXutil.rtrim( AV37FacPri));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV37FacPri)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37FacPri_CTRL", GXutil.rtrim( sCtrlAV37FacPri));
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
      we24M2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115553111", true, true);
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
      httpContext.AddJavascriptSource("facturacion/facturasemitidas_wc.js", "?202682115553112", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_362( )
   {
      edtavFacturasemitidas_sdt__faccod_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__FACCOD_"+sGXsfl_36_idx ;
      edtavFacturasemitidas_sdt__facfch_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__FACFCH_"+sGXsfl_36_idx ;
      edtavFacturasemitidas_sdt__clicod_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__CLICOD_"+sGXsfl_36_idx ;
      edtavFacturasemitidas_sdt__clinom_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__CLINOM_"+sGXsfl_36_idx ;
      edtavFacturasemitidas_sdt__clinif_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__CLINIF_"+sGXsfl_36_idx ;
      edtavFacturasemitidas_sdt__factot_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__FACTOT_"+sGXsfl_36_idx ;
      edtavFacturasemitidas_sdt__facbasimp_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__FACBASIMP_"+sGXsfl_36_idx ;
      edtavFacturasemitidas_sdt__facivapor_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__FACIVAPOR_"+sGXsfl_36_idx ;
      edtavFacturasemitidas_sdt__facivaimp_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__FACIVAIMP_"+sGXsfl_36_idx ;
      edtavFacturasemitidas_sdt__fac_kgs_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__FAC_KGS_"+sGXsfl_36_idx ;
      edtavFacturasemitidas_sdt__fac_mts_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__FAC_MTS_"+sGXsfl_36_idx ;
      edtavFacturasemitidas_sdt__factipo_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__FACTIPO_"+sGXsfl_36_idx ;
   }

   public void subsflControlProps_fel_362( )
   {
      edtavFacturasemitidas_sdt__faccod_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__FACCOD_"+sGXsfl_36_fel_idx ;
      edtavFacturasemitidas_sdt__facfch_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__FACFCH_"+sGXsfl_36_fel_idx ;
      edtavFacturasemitidas_sdt__clicod_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__CLICOD_"+sGXsfl_36_fel_idx ;
      edtavFacturasemitidas_sdt__clinom_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__CLINOM_"+sGXsfl_36_fel_idx ;
      edtavFacturasemitidas_sdt__clinif_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__CLINIF_"+sGXsfl_36_fel_idx ;
      edtavFacturasemitidas_sdt__factot_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__FACTOT_"+sGXsfl_36_fel_idx ;
      edtavFacturasemitidas_sdt__facbasimp_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__FACBASIMP_"+sGXsfl_36_fel_idx ;
      edtavFacturasemitidas_sdt__facivapor_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__FACIVAPOR_"+sGXsfl_36_fel_idx ;
      edtavFacturasemitidas_sdt__facivaimp_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__FACIVAIMP_"+sGXsfl_36_fel_idx ;
      edtavFacturasemitidas_sdt__fac_kgs_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__FAC_KGS_"+sGXsfl_36_fel_idx ;
      edtavFacturasemitidas_sdt__fac_mts_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__FAC_MTS_"+sGXsfl_36_fel_idx ;
      edtavFacturasemitidas_sdt__factipo_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__FACTIPO_"+sGXsfl_36_fel_idx ;
   }

   public void sendrow_362( )
   {
      subsflControlProps_362( ) ;
      wb24M0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_36_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_36_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_36_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavFacturasemitidas_sdt__faccod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFacturasemitidas_sdt__faccod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)).getgxTv_SdtFacturasEmitidas_SDT_Item_Faccod(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavFacturasemitidas_sdt__faccod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)).getgxTv_SdtFacturasEmitidas_SDT_Item_Faccod()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)).getgxTv_SdtFacturasEmitidas_SDT_Item_Faccod()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavFacturasemitidas_sdt__faccod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavFacturasemitidas_sdt__faccod_Visible),Integer.valueOf(edtavFacturasemitidas_sdt__faccod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavFacturasemitidas_sdt__facfch_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFacturasemitidas_sdt__facfch_Internalname,localUtil.format(((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)).getgxTv_SdtFacturasEmitidas_SDT_Item_Facfch(), "99/99/99"),localUtil.format( ((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)).getgxTv_SdtFacturasEmitidas_SDT_Item_Facfch(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavFacturasemitidas_sdt__facfch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavFacturasemitidas_sdt__facfch_Visible),Integer.valueOf(edtavFacturasemitidas_sdt__facfch_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavFacturasemitidas_sdt__clicod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFacturasemitidas_sdt__clicod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)).getgxTv_SdtFacturasEmitidas_SDT_Item_Clicod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavFacturasemitidas_sdt__clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)).getgxTv_SdtFacturasEmitidas_SDT_Item_Clicod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)).getgxTv_SdtFacturasEmitidas_SDT_Item_Clicod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavFacturasemitidas_sdt__clicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavFacturasemitidas_sdt__clicod_Visible),Integer.valueOf(edtavFacturasemitidas_sdt__clicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavFacturasemitidas_sdt__clinom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFacturasemitidas_sdt__clinom_Internalname,GXutil.rtrim( ((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)).getgxTv_SdtFacturasEmitidas_SDT_Item_Clinom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavFacturasemitidas_sdt__clinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavFacturasemitidas_sdt__clinom_Visible),Integer.valueOf(edtavFacturasemitidas_sdt__clinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavFacturasemitidas_sdt__clinif_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFacturasemitidas_sdt__clinif_Internalname,GXutil.rtrim( ((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)).getgxTv_SdtFacturasEmitidas_SDT_Item_Clinif()),GXutil.rtrim( localUtil.format( ((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)).getgxTv_SdtFacturasEmitidas_SDT_Item_Clinif(), "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavFacturasemitidas_sdt__clinif_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavFacturasemitidas_sdt__clinif_Visible),Integer.valueOf(edtavFacturasemitidas_sdt__clinif_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavFacturasemitidas_sdt__factot_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFacturasemitidas_sdt__factot_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)).getgxTv_SdtFacturasEmitidas_SDT_Item_Factot(), (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavFacturasemitidas_sdt__factot_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)).getgxTv_SdtFacturasEmitidas_SDT_Item_Factot(), "ZZZZZZZZZ9.99") : localUtil.format( ((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)).getgxTv_SdtFacturasEmitidas_SDT_Item_Factot(), "ZZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavFacturasemitidas_sdt__factot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavFacturasemitidas_sdt__factot_Visible),Integer.valueOf(edtavFacturasemitidas_sdt__factot_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavFacturasemitidas_sdt__facbasimp_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFacturasemitidas_sdt__facbasimp_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)).getgxTv_SdtFacturasEmitidas_SDT_Item_Facbasimp(), (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavFacturasemitidas_sdt__facbasimp_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)).getgxTv_SdtFacturasEmitidas_SDT_Item_Facbasimp(), "ZZZZZZZZZ9.99") : localUtil.format( ((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)).getgxTv_SdtFacturasEmitidas_SDT_Item_Facbasimp(), "ZZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavFacturasemitidas_sdt__facbasimp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavFacturasemitidas_sdt__facbasimp_Visible),Integer.valueOf(edtavFacturasemitidas_sdt__facbasimp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavFacturasemitidas_sdt__facivapor_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFacturasemitidas_sdt__facivapor_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)).getgxTv_SdtFacturasEmitidas_SDT_Item_Facivapor(), (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavFacturasemitidas_sdt__facivapor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)).getgxTv_SdtFacturasEmitidas_SDT_Item_Facivapor()), "Z9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)).getgxTv_SdtFacturasEmitidas_SDT_Item_Facivapor()), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavFacturasemitidas_sdt__facivapor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavFacturasemitidas_sdt__facivapor_Visible),Integer.valueOf(edtavFacturasemitidas_sdt__facivapor_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavFacturasemitidas_sdt__facivaimp_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFacturasemitidas_sdt__facivaimp_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)).getgxTv_SdtFacturasEmitidas_SDT_Item_Facivaimp(), (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavFacturasemitidas_sdt__facivaimp_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)).getgxTv_SdtFacturasEmitidas_SDT_Item_Facivaimp(), "ZZZZZZZ9.99") : localUtil.format( ((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)).getgxTv_SdtFacturasEmitidas_SDT_Item_Facivaimp(), "ZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavFacturasemitidas_sdt__facivaimp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavFacturasemitidas_sdt__facivaimp_Visible),Integer.valueOf(edtavFacturasemitidas_sdt__facivaimp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavFacturasemitidas_sdt__fac_kgs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFacturasemitidas_sdt__fac_kgs_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)).getgxTv_SdtFacturasEmitidas_SDT_Item_Fac_kgs(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavFacturasemitidas_sdt__fac_kgs_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)).getgxTv_SdtFacturasEmitidas_SDT_Item_Fac_kgs(), "ZZZZZ9.99") : localUtil.format( ((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)).getgxTv_SdtFacturasEmitidas_SDT_Item_Fac_kgs(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavFacturasemitidas_sdt__fac_kgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavFacturasemitidas_sdt__fac_kgs_Visible),Integer.valueOf(edtavFacturasemitidas_sdt__fac_kgs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavFacturasemitidas_sdt__fac_mts_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFacturasemitidas_sdt__fac_mts_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)).getgxTv_SdtFacturasEmitidas_SDT_Item_Fac_mts(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavFacturasemitidas_sdt__fac_mts_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)).getgxTv_SdtFacturasEmitidas_SDT_Item_Fac_mts(), "ZZZZZ9.99") : localUtil.format( ((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)).getgxTv_SdtFacturasEmitidas_SDT_Item_Fac_mts(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavFacturasemitidas_sdt__fac_mts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavFacturasemitidas_sdt__fac_mts_Visible),Integer.valueOf(edtavFacturasemitidas_sdt__fac_mts_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFacturasemitidas_sdt__factipo_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)).getgxTv_SdtFacturasEmitidas_SDT_Item_Factipo(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavFacturasemitidas_sdt__factipo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)).getgxTv_SdtFacturasEmitidas_SDT_Item_Factipo()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtFacturasEmitidas_SDT_Item)AV13FacturasEmitidas_SDT.elementAt(-1+AV56GXV1)).getgxTv_SdtFacturasEmitidas_SDT_Item_Factipo()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavFacturasemitidas_sdt__factipo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavFacturasemitidas_sdt__factipo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes24M2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_36_idx = ((subGrid_Islastpage==1)&&(nGXsfl_36_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_36_idx+1) ;
         sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_362( ) ;
      }
      /* End function sendrow_362 */
   }

   public void startgridcontrol36( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"36\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavFacturasemitidas_sdt__faccod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Factura", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavFacturasemitidas_sdt__facfch_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavFacturasemitidas_sdt__clicod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavFacturasemitidas_sdt__clinom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavFacturasemitidas_sdt__clinif_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nif", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavFacturasemitidas_sdt__factot_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor Factura", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavFacturasemitidas_sdt__facbasimp_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Base Imponible", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavFacturasemitidas_sdt__facivapor_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "% IVA", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavFacturasemitidas_sdt__facivaimp_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Importe IVA", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavFacturasemitidas_sdt__fac_kgs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos Fra.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavFacturasemitidas_sdt__fac_mts_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros Fra.", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFacturasemitidas_sdt__faccod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavFacturasemitidas_sdt__faccod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFacturasemitidas_sdt__facfch_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavFacturasemitidas_sdt__facfch_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFacturasemitidas_sdt__clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavFacturasemitidas_sdt__clicod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFacturasemitidas_sdt__clinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavFacturasemitidas_sdt__clinom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFacturasemitidas_sdt__clinif_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavFacturasemitidas_sdt__clinif_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFacturasemitidas_sdt__factot_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavFacturasemitidas_sdt__factot_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFacturasemitidas_sdt__facbasimp_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavFacturasemitidas_sdt__facbasimp_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFacturasemitidas_sdt__facivapor_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavFacturasemitidas_sdt__facivapor_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFacturasemitidas_sdt__facivaimp_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavFacturasemitidas_sdt__facivaimp_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFacturasemitidas_sdt__fac_kgs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavFacturasemitidas_sdt__fac_kgs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFacturasemitidas_sdt__fac_mts_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavFacturasemitidas_sdt__fac_mts_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFacturasemitidas_sdt__factipo_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtavFacturasemitidas_sdt__faccod_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__FACCOD" ;
      edtavFacturasemitidas_sdt__facfch_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__FACFCH" ;
      edtavFacturasemitidas_sdt__clicod_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__CLICOD" ;
      edtavFacturasemitidas_sdt__clinom_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__CLINOM" ;
      edtavFacturasemitidas_sdt__clinif_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__CLINIF" ;
      edtavFacturasemitidas_sdt__factot_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__FACTOT" ;
      edtavFacturasemitidas_sdt__facbasimp_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__FACBASIMP" ;
      edtavFacturasemitidas_sdt__facivapor_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__FACIVAPOR" ;
      edtavFacturasemitidas_sdt__facivaimp_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__FACIVAIMP" ;
      edtavFacturasemitidas_sdt__fac_kgs_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__FAC_KGS" ;
      edtavFacturasemitidas_sdt__fac_mts_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__FAC_MTS" ;
      edtavFacturasemitidas_sdt__factipo_Internalname = sPrefix+"FACTURASEMITIDAS_SDT__FACTIPO" ;
      edtavTotvalue_factot_Internalname = sPrefix+"vTOTVALUE_FACTOT" ;
      edtavTotvalue_facbasimp_Internalname = sPrefix+"vTOTVALUE_FACBASIMP" ;
      edtavTotvalue_facivaimp_Internalname = sPrefix+"vTOTVALUE_FACIVAIMP" ;
      edtavTotvalue_fac_kgs_Internalname = sPrefix+"vTOTVALUE_FAC_KGS" ;
      edtavTotvalue_fac_mts_Internalname = sPrefix+"vTOTVALUE_FAC_MTS" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Innewwindow1_Internalname = sPrefix+"INNEWWINDOW1" ;
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
      edtavFacturasemitidas_sdt__factipo_Jsonclick = "" ;
      edtavFacturasemitidas_sdt__factipo_Enabled = 0 ;
      edtavFacturasemitidas_sdt__fac_mts_Jsonclick = "" ;
      edtavFacturasemitidas_sdt__fac_mts_Enabled = 0 ;
      edtavFacturasemitidas_sdt__fac_mts_Visible = -1 ;
      edtavFacturasemitidas_sdt__fac_kgs_Jsonclick = "" ;
      edtavFacturasemitidas_sdt__fac_kgs_Enabled = 0 ;
      edtavFacturasemitidas_sdt__fac_kgs_Visible = -1 ;
      edtavFacturasemitidas_sdt__facivaimp_Jsonclick = "" ;
      edtavFacturasemitidas_sdt__facivaimp_Enabled = 0 ;
      edtavFacturasemitidas_sdt__facivaimp_Visible = -1 ;
      edtavFacturasemitidas_sdt__facivapor_Jsonclick = "" ;
      edtavFacturasemitidas_sdt__facivapor_Enabled = 0 ;
      edtavFacturasemitidas_sdt__facivapor_Visible = -1 ;
      edtavFacturasemitidas_sdt__facbasimp_Jsonclick = "" ;
      edtavFacturasemitidas_sdt__facbasimp_Enabled = 0 ;
      edtavFacturasemitidas_sdt__facbasimp_Visible = -1 ;
      edtavFacturasemitidas_sdt__factot_Jsonclick = "" ;
      edtavFacturasemitidas_sdt__factot_Enabled = 0 ;
      edtavFacturasemitidas_sdt__factot_Visible = -1 ;
      edtavFacturasemitidas_sdt__clinif_Jsonclick = "" ;
      edtavFacturasemitidas_sdt__clinif_Enabled = 0 ;
      edtavFacturasemitidas_sdt__clinif_Visible = -1 ;
      edtavFacturasemitidas_sdt__clinom_Jsonclick = "" ;
      edtavFacturasemitidas_sdt__clinom_Enabled = 0 ;
      edtavFacturasemitidas_sdt__clinom_Visible = -1 ;
      edtavFacturasemitidas_sdt__clicod_Jsonclick = "" ;
      edtavFacturasemitidas_sdt__clicod_Enabled = 0 ;
      edtavFacturasemitidas_sdt__clicod_Visible = -1 ;
      edtavFacturasemitidas_sdt__facfch_Jsonclick = "" ;
      edtavFacturasemitidas_sdt__facfch_Enabled = 0 ;
      edtavFacturasemitidas_sdt__facfch_Visible = -1 ;
      edtavFacturasemitidas_sdt__faccod_Jsonclick = "" ;
      edtavFacturasemitidas_sdt__faccod_Enabled = 0 ;
      edtavFacturasemitidas_sdt__faccod_Visible = -1 ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvalue_fac_mts_Jsonclick = "" ;
      edtavTotvalue_fac_mts_Enabled = 1 ;
      edtavTotvalue_fac_kgs_Jsonclick = "" ;
      edtavTotvalue_fac_kgs_Enabled = 1 ;
      edtavTotvalue_facivaimp_Jsonclick = "" ;
      edtavTotvalue_facivaimp_Enabled = 1 ;
      edtavTotvalue_facbasimp_Jsonclick = "" ;
      edtavTotvalue_facbasimp_Enabled = 1 ;
      edtavTotvalue_factot_Jsonclick = "" ;
      edtavTotvalue_factot_Enabled = 1 ;
      edtavFacturasemitidas_sdt__fac_mts_Visible = -1 ;
      edtavFacturasemitidas_sdt__fac_kgs_Visible = -1 ;
      edtavFacturasemitidas_sdt__facivaimp_Visible = -1 ;
      edtavFacturasemitidas_sdt__facivapor_Visible = -1 ;
      edtavFacturasemitidas_sdt__facbasimp_Visible = -1 ;
      edtavFacturasemitidas_sdt__factot_Visible = -1 ;
      edtavFacturasemitidas_sdt__clinif_Visible = -1 ;
      edtavFacturasemitidas_sdt__clinom_Visible = -1 ;
      edtavFacturasemitidas_sdt__clicod_Visible = -1 ;
      edtavFacturasemitidas_sdt__facfch_Visible = -1 ;
      edtavFacturasemitidas_sdt__faccod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavFacturasemitidas_sdt__factipo_Enabled = -1 ;
      edtavFacturasemitidas_sdt__fac_mts_Enabled = -1 ;
      edtavFacturasemitidas_sdt__fac_kgs_Enabled = -1 ;
      edtavFacturasemitidas_sdt__facivaimp_Enabled = -1 ;
      edtavFacturasemitidas_sdt__facivapor_Enabled = -1 ;
      edtavFacturasemitidas_sdt__facbasimp_Enabled = -1 ;
      edtavFacturasemitidas_sdt__factot_Enabled = -1 ;
      edtavFacturasemitidas_sdt__clinif_Enabled = -1 ;
      edtavFacturasemitidas_sdt__clinom_Enabled = -1 ;
      edtavFacturasemitidas_sdt__clicod_Enabled = -1 ;
      edtavFacturasemitidas_sdt__facfch_Enabled = -1 ;
      edtavFacturasemitidas_sdt__faccod_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "||||||||||" ;
      Ddo_grid_Columnids = "0:FacturasEmitidas_SDT__Faccod|1:FacturasEmitidas_SDT__Facfch|2:FacturasEmitidas_SDT__Clicod|3:FacturasEmitidas_SDT__CliNom|4:FacturasEmitidas_SDT__CliNif|5:FacturasEmitidas_SDT__Factot|6:FacturasEmitidas_SDT__FacBasImp|7:FacturasEmitidas_SDT__FacIvaPor|8:FacturasEmitidas_SDT__FacIVAImp|9:FacturasEmitidas_SDT__Fac_kgs|10:FacturasEmitidas_SDT__Fac_mts" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV69Pgmname',fld:'vPGMNAME',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29Faccodfrom',fld:'vFACCODFROM',pic:'ZZZZZZZ9'},{av:'AV30Faccodto',fld:'vFACCODTO',pic:'ZZZZZZZ9'},{av:'AV31clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV32clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV33facfchfrom',fld:'vFACFCHFROM',pic:''},{av:'AV34facfchto',fld:'vFACFCHTO',pic:''},{av:'AV35Factipfac',fld:'vFACTIPFAC',pic:'9'},{av:'AV36FacSerNum',fld:'vFACSERNUM',pic:''},{av:'AV37FacPri',fld:'vFACPRI',pic:'9'},{av:'AV13FacturasEmitidas_SDT',fld:'vFACTURASEMITIDAS_SDT',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{av:'AV43Tot_Factot',fld:'vTOT_FACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV45Tot_FacBasImp',fld:'vTOT_FACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV47Tot_FacIVAImp',fld:'vTOT_FACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV49Tot_Fac_kgs',fld:'vTOT_FAC_KGS',pic:'ZZZZZ9.99',hsh:true},{av:'AV51Tot_Fac_mts',fld:'vTOT_FAC_MTS',pic:'ZZZZZ9.99',hsh:true},{av:'AV41FacturasEmitidas_SDT_json',fld:'vFACTURASEMITIDAS_SDT_JSON',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'FACTURASEMITIDAS_SDT__FACCOD',prop:'Visible'},{ctrl:'FACTURASEMITIDAS_SDT__FACFCH',prop:'Visible'},{ctrl:'FACTURASEMITIDAS_SDT__CLICOD',prop:'Visible'},{ctrl:'FACTURASEMITIDAS_SDT__CLINOM',prop:'Visible'},{ctrl:'FACTURASEMITIDAS_SDT__CLINIF',prop:'Visible'},{ctrl:'FACTURASEMITIDAS_SDT__FACTOT',prop:'Visible'},{ctrl:'FACTURASEMITIDAS_SDT__FACBASIMP',prop:'Visible'},{ctrl:'FACTURASEMITIDAS_SDT__FACIVAPOR',prop:'Visible'},{ctrl:'FACTURASEMITIDAS_SDT__FACIVAIMP',prop:'Visible'},{ctrl:'FACTURASEMITIDAS_SDT__FAC_KGS',prop:'Visible'},{ctrl:'FACTURASEMITIDAS_SDT__FAC_MTS',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV43Tot_Factot',fld:'vTOT_FACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV45Tot_FacBasImp',fld:'vTOT_FACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV47Tot_FacIVAImp',fld:'vTOT_FACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV49Tot_Fac_kgs',fld:'vTOT_FAC_KGS',pic:'ZZZZZ9.99',hsh:true},{av:'AV51Tot_Fac_mts',fld:'vTOT_FAC_MTS',pic:'ZZZZZ9.99',hsh:true},{av:'AV44TotValue_Factot',fld:'vTOTVALUE_FACTOT',pic:''},{av:'AV46TotValue_FacBasImp',fld:'vTOTVALUE_FACBASIMP',pic:''},{av:'AV48TotValue_FacIVAImp',fld:'vTOTVALUE_FACIVAIMP',pic:''},{av:'AV50TotValue_Fac_kgs',fld:'vTOTVALUE_FAC_KGS',pic:''},{av:'AV52TotValue_Fac_mts',fld:'vTOTVALUE_FAC_MTS',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1124M2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV69Pgmname',fld:'vPGMNAME',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29Faccodfrom',fld:'vFACCODFROM',pic:'ZZZZZZZ9'},{av:'AV30Faccodto',fld:'vFACCODTO',pic:'ZZZZZZZ9'},{av:'AV31clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV32clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV33facfchfrom',fld:'vFACFCHFROM',pic:''},{av:'AV34facfchto',fld:'vFACFCHTO',pic:''},{av:'AV35Factipfac',fld:'vFACTIPFAC',pic:'9'},{av:'AV36FacSerNum',fld:'vFACSERNUM',pic:''},{av:'AV37FacPri',fld:'vFACPRI',pic:'9'},{av:'AV13FacturasEmitidas_SDT',fld:'vFACTURASEMITIDAS_SDT',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{av:'AV43Tot_Factot',fld:'vTOT_FACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV45Tot_FacBasImp',fld:'vTOT_FACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV47Tot_FacIVAImp',fld:'vTOT_FACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV49Tot_Fac_kgs',fld:'vTOT_FAC_KGS',pic:'ZZZZZ9.99',hsh:true},{av:'AV51Tot_Fac_mts',fld:'vTOT_FAC_MTS',pic:'ZZZZZ9.99',hsh:true},{av:'AV41FacturasEmitidas_SDT_json',fld:'vFACTURASEMITIDAS_SDT_JSON',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1224M2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV69Pgmname',fld:'vPGMNAME',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29Faccodfrom',fld:'vFACCODFROM',pic:'ZZZZZZZ9'},{av:'AV30Faccodto',fld:'vFACCODTO',pic:'ZZZZZZZ9'},{av:'AV31clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV32clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV33facfchfrom',fld:'vFACFCHFROM',pic:''},{av:'AV34facfchto',fld:'vFACFCHTO',pic:''},{av:'AV35Factipfac',fld:'vFACTIPFAC',pic:'9'},{av:'AV36FacSerNum',fld:'vFACSERNUM',pic:''},{av:'AV37FacPri',fld:'vFACPRI',pic:'9'},{av:'AV13FacturasEmitidas_SDT',fld:'vFACTURASEMITIDAS_SDT',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{av:'AV43Tot_Factot',fld:'vTOT_FACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV45Tot_FacBasImp',fld:'vTOT_FACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV47Tot_FacIVAImp',fld:'vTOT_FACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV49Tot_Fac_kgs',fld:'vTOT_FAC_KGS',pic:'ZZZZZ9.99',hsh:true},{av:'AV51Tot_Fac_mts',fld:'vTOT_FAC_MTS',pic:'ZZZZZ9.99',hsh:true},{av:'AV41FacturasEmitidas_SDT_json',fld:'vFACTURASEMITIDAS_SDT_JSON',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e1924M2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1324M2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV69Pgmname',fld:'vPGMNAME',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29Faccodfrom',fld:'vFACCODFROM',pic:'ZZZZZZZ9'},{av:'AV30Faccodto',fld:'vFACCODTO',pic:'ZZZZZZZ9'},{av:'AV31clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV32clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV33facfchfrom',fld:'vFACFCHFROM',pic:''},{av:'AV34facfchto',fld:'vFACFCHTO',pic:''},{av:'AV35Factipfac',fld:'vFACTIPFAC',pic:'9'},{av:'AV36FacSerNum',fld:'vFACSERNUM',pic:''},{av:'AV37FacPri',fld:'vFACPRI',pic:'9'},{av:'AV13FacturasEmitidas_SDT',fld:'vFACTURASEMITIDAS_SDT',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{av:'AV43Tot_Factot',fld:'vTOT_FACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV45Tot_FacBasImp',fld:'vTOT_FACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV47Tot_FacIVAImp',fld:'vTOT_FACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV49Tot_Fac_kgs',fld:'vTOT_FAC_KGS',pic:'ZZZZZ9.99',hsh:true},{av:'AV51Tot_Fac_mts',fld:'vTOT_FAC_MTS',pic:'ZZZZZ9.99',hsh:true},{av:'AV41FacturasEmitidas_SDT_json',fld:'vFACTURASEMITIDAS_SDT_JSON',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'FACTURASEMITIDAS_SDT__FACCOD',prop:'Visible'},{ctrl:'FACTURASEMITIDAS_SDT__FACFCH',prop:'Visible'},{ctrl:'FACTURASEMITIDAS_SDT__CLICOD',prop:'Visible'},{ctrl:'FACTURASEMITIDAS_SDT__CLINOM',prop:'Visible'},{ctrl:'FACTURASEMITIDAS_SDT__CLINIF',prop:'Visible'},{ctrl:'FACTURASEMITIDAS_SDT__FACTOT',prop:'Visible'},{ctrl:'FACTURASEMITIDAS_SDT__FACBASIMP',prop:'Visible'},{ctrl:'FACTURASEMITIDAS_SDT__FACIVAPOR',prop:'Visible'},{ctrl:'FACTURASEMITIDAS_SDT__FACIVAIMP',prop:'Visible'},{ctrl:'FACTURASEMITIDAS_SDT__FAC_KGS',prop:'Visible'},{ctrl:'FACTURASEMITIDAS_SDT__FAC_MTS',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV43Tot_Factot',fld:'vTOT_FACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV45Tot_FacBasImp',fld:'vTOT_FACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV47Tot_FacIVAImp',fld:'vTOT_FACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV49Tot_Fac_kgs',fld:'vTOT_FAC_KGS',pic:'ZZZZZ9.99',hsh:true},{av:'AV51Tot_Fac_mts',fld:'vTOT_FAC_MTS',pic:'ZZZZZ9.99',hsh:true},{av:'AV44TotValue_Factot',fld:'vTOTVALUE_FACTOT',pic:''},{av:'AV46TotValue_FacBasImp',fld:'vTOTVALUE_FACBASIMP',pic:''},{av:'AV48TotValue_FacIVAImp',fld:'vTOTVALUE_FACIVAIMP',pic:''},{av:'AV50TotValue_Fac_kgs',fld:'vTOTVALUE_FAC_KGS',pic:''},{av:'AV52TotValue_Fac_mts',fld:'vTOTVALUE_FAC_MTS',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1424M2',iparms:[{av:'AV41FacturasEmitidas_SDT_json',fld:'vFACTURASEMITIDAS_SDT_JSON',pic:'',hsh:true}]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e1524M2',iparms:[{av:'AV41FacturasEmitidas_SDT_json',fld:'vFACTURASEMITIDAS_SDT_JSON',pic:'',hsh:true}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e1624M2',iparms:[{av:'AV41FacturasEmitidas_SDT_json',fld:'vFACTURASEMITIDAS_SDT_JSON',pic:'',hsh:true}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv13',iparms:[]");
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
      wcpOAV28Emprcod = "" ;
      wcpOAV33facfchfrom = GXutil.nullDate() ;
      wcpOAV34facfchto = GXutil.nullDate() ;
      wcpOAV36FacSerNum = "" ;
      wcpOAV37FacPri = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV28Emprcod = "" ;
      AV33facfchfrom = GXutil.nullDate() ;
      AV34facfchto = GXutil.nullDate() ;
      AV36FacSerNum = "" ;
      AV37FacPri = "" ;
      AV18ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV69Pgmname = "" ;
      AV13FacturasEmitidas_SDT = new GXBaseCollection<app.facturacion.SdtFacturasEmitidas_SDT_Item>(app.facturacion.SdtFacturasEmitidas_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV43Tot_Factot = DecimalUtil.ZERO ;
      AV45Tot_FacBasImp = DecimalUtil.ZERO ;
      AV47Tot_FacIVAImp = DecimalUtil.ZERO ;
      AV49Tot_Fac_kgs = DecimalUtil.ZERO ;
      AV51Tot_Fac_mts = DecimalUtil.ZERO ;
      AV41FacturasEmitidas_SDT_json = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV24DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportreport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV44TotValue_Factot = "" ;
      AV46TotValue_FacBasImp = "" ;
      AV48TotValue_FacIVAImp = "" ;
      AV50TotValue_Fac_kgs = "" ;
      AV52TotValue_Fac_mts = "" ;
      hsh = "" ;
      AV38Station = "" ;
      GXv_char1 = new String[1] ;
      AV39EmprNom = "" ;
      AV40UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV20Session = httpContext.getWebSession();
      AV16ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV53websession = httpContext.getWebSession();
      AV14ExcelFilename = "" ;
      AV15ErrorMessage = "" ;
      GXv_char3 = new String[1] ;
      AV17UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char4 = new String[1] ;
      AV19ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV42FacturasEmitidas_SDTItem = new app.facturacion.SdtFacturasEmitidas_SDT_Item(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV28Emprcod = "" ;
      sCtrlAV29Faccodfrom = "" ;
      sCtrlAV30Faccodto = "" ;
      sCtrlAV31clicodfrom = "" ;
      sCtrlAV32clicodto = "" ;
      sCtrlAV33facfchfrom = "" ;
      sCtrlAV34facfchto = "" ;
      sCtrlAV35Factipfac = "" ;
      sCtrlAV36FacSerNum = "" ;
      sCtrlAV37FacPri = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV69Pgmname = "Facturacion.FacturasEmitidas_WC" ;
      /* GeneXus formulas. */
      AV69Pgmname = "Facturacion.FacturasEmitidas_WC" ;
      Gx_err = (short)(0) ;
      edtavFacturasemitidas_sdt__faccod_Enabled = 0 ;
      edtavFacturasemitidas_sdt__facfch_Enabled = 0 ;
      edtavFacturasemitidas_sdt__clicod_Enabled = 0 ;
      edtavFacturasemitidas_sdt__clinom_Enabled = 0 ;
      edtavFacturasemitidas_sdt__clinif_Enabled = 0 ;
      edtavFacturasemitidas_sdt__factot_Enabled = 0 ;
      edtavFacturasemitidas_sdt__facbasimp_Enabled = 0 ;
      edtavFacturasemitidas_sdt__facivapor_Enabled = 0 ;
      edtavFacturasemitidas_sdt__facivaimp_Enabled = 0 ;
      edtavFacturasemitidas_sdt__fac_kgs_Enabled = 0 ;
      edtavFacturasemitidas_sdt__fac_mts_Enabled = 0 ;
      edtavFacturasemitidas_sdt__factipo_Enabled = 0 ;
      edtavTotvalue_factot_Enabled = 0 ;
      edtavTotvalue_facbasimp_Enabled = 0 ;
      edtavTotvalue_facivaimp_Enabled = 0 ;
      edtavTotvalue_fac_kgs_Enabled = 0 ;
      edtavTotvalue_fac_mts_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV35Factipfac ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV35Factipfac ;
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
   private int wcpOAV29Faccodfrom ;
   private int wcpOAV30Faccodto ;
   private int wcpOAV31clicodfrom ;
   private int wcpOAV32clicodto ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_36 ;
   private int AV29Faccodfrom ;
   private int AV30Faccodto ;
   private int AV31clicodfrom ;
   private int AV32clicodto ;
   private int nGXsfl_36_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV56GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavFacturasemitidas_sdt__faccod_Enabled ;
   private int edtavFacturasemitidas_sdt__facfch_Enabled ;
   private int edtavFacturasemitidas_sdt__clicod_Enabled ;
   private int edtavFacturasemitidas_sdt__clinom_Enabled ;
   private int edtavFacturasemitidas_sdt__clinif_Enabled ;
   private int edtavFacturasemitidas_sdt__factot_Enabled ;
   private int edtavFacturasemitidas_sdt__facbasimp_Enabled ;
   private int edtavFacturasemitidas_sdt__facivapor_Enabled ;
   private int edtavFacturasemitidas_sdt__facivaimp_Enabled ;
   private int edtavFacturasemitidas_sdt__fac_kgs_Enabled ;
   private int edtavFacturasemitidas_sdt__fac_mts_Enabled ;
   private int edtavFacturasemitidas_sdt__factipo_Enabled ;
   private int edtavTotvalue_factot_Enabled ;
   private int edtavTotvalue_facbasimp_Enabled ;
   private int edtavTotvalue_facivaimp_Enabled ;
   private int edtavTotvalue_fac_kgs_Enabled ;
   private int edtavTotvalue_fac_mts_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_36_fel_idx=1 ;
   private int edtavFacturasemitidas_sdt__faccod_Visible ;
   private int edtavFacturasemitidas_sdt__facfch_Visible ;
   private int edtavFacturasemitidas_sdt__clicod_Visible ;
   private int edtavFacturasemitidas_sdt__clinom_Visible ;
   private int edtavFacturasemitidas_sdt__clinif_Visible ;
   private int edtavFacturasemitidas_sdt__factot_Visible ;
   private int edtavFacturasemitidas_sdt__facbasimp_Visible ;
   private int edtavFacturasemitidas_sdt__facivapor_Visible ;
   private int edtavFacturasemitidas_sdt__facivaimp_Visible ;
   private int edtavFacturasemitidas_sdt__fac_kgs_Visible ;
   private int edtavFacturasemitidas_sdt__fac_mts_Visible ;
   private int AV25PageToGo ;
   private int AV70GXV14 ;
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
   private java.math.BigDecimal AV43Tot_Factot ;
   private java.math.BigDecimal AV45Tot_FacBasImp ;
   private java.math.BigDecimal AV47Tot_FacIVAImp ;
   private java.math.BigDecimal AV49Tot_Fac_kgs ;
   private java.math.BigDecimal AV51Tot_Fac_mts ;
   private String wcpOAV28Emprcod ;
   private String wcpOAV36FacSerNum ;
   private String wcpOAV37FacPri ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV28Emprcod ;
   private String AV36FacSerNum ;
   private String AV37FacPri ;
   private String sGXsfl_36_idx="0001" ;
   private String AV69Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String Innewwindow1_Width ;
   private String Innewwindow1_Height ;
   private String Innewwindow1_Target ;
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
   private String bttBtnexportreport_Internalname ;
   private String bttBtnexportreport_Jsonclick ;
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
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavTotvalue_factot_Internalname ;
   private String edtavFacturasemitidas_sdt__faccod_Internalname ;
   private String edtavFacturasemitidas_sdt__facfch_Internalname ;
   private String edtavFacturasemitidas_sdt__clicod_Internalname ;
   private String edtavFacturasemitidas_sdt__clinom_Internalname ;
   private String edtavFacturasemitidas_sdt__clinif_Internalname ;
   private String edtavFacturasemitidas_sdt__factot_Internalname ;
   private String edtavFacturasemitidas_sdt__facbasimp_Internalname ;
   private String edtavFacturasemitidas_sdt__facivapor_Internalname ;
   private String edtavFacturasemitidas_sdt__facivaimp_Internalname ;
   private String edtavFacturasemitidas_sdt__fac_kgs_Internalname ;
   private String edtavFacturasemitidas_sdt__fac_mts_Internalname ;
   private String edtavFacturasemitidas_sdt__factipo_Internalname ;
   private String edtavTotvalue_facbasimp_Internalname ;
   private String edtavTotvalue_facivaimp_Internalname ;
   private String edtavTotvalue_fac_kgs_Internalname ;
   private String edtavTotvalue_fac_mts_Internalname ;
   private String sGXsfl_36_fel_idx="0001" ;
   private String hsh ;
   private String AV38Station ;
   private String GXv_char1[] ;
   private String AV39EmprNom ;
   private String AV40UsurCod ;
   private String GXv_char3[] ;
   private String GXt_char2 ;
   private String GXv_char4[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvalue_factot_Jsonclick ;
   private String edtavTotvalue_facbasimp_Jsonclick ;
   private String edtavTotvalue_facivaimp_Jsonclick ;
   private String edtavTotvalue_fac_kgs_Jsonclick ;
   private String edtavTotvalue_fac_mts_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String sCtrlAV28Emprcod ;
   private String sCtrlAV29Faccodfrom ;
   private String sCtrlAV30Faccodto ;
   private String sCtrlAV31clicodfrom ;
   private String sCtrlAV32clicodto ;
   private String sCtrlAV33facfchfrom ;
   private String sCtrlAV34facfchto ;
   private String sCtrlAV35Factipfac ;
   private String sCtrlAV36FacSerNum ;
   private String sCtrlAV37FacPri ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavFacturasemitidas_sdt__faccod_Jsonclick ;
   private String edtavFacturasemitidas_sdt__facfch_Jsonclick ;
   private String edtavFacturasemitidas_sdt__clicod_Jsonclick ;
   private String edtavFacturasemitidas_sdt__clinom_Jsonclick ;
   private String edtavFacturasemitidas_sdt__clinif_Jsonclick ;
   private String edtavFacturasemitidas_sdt__factot_Jsonclick ;
   private String edtavFacturasemitidas_sdt__facbasimp_Jsonclick ;
   private String edtavFacturasemitidas_sdt__facivapor_Jsonclick ;
   private String edtavFacturasemitidas_sdt__facivaimp_Jsonclick ;
   private String edtavFacturasemitidas_sdt__fac_kgs_Jsonclick ;
   private String edtavFacturasemitidas_sdt__fac_mts_Jsonclick ;
   private String edtavFacturasemitidas_sdt__factipo_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV33facfchfrom ;
   private java.util.Date wcpOAV34facfchto ;
   private java.util.Date AV33facfchfrom ;
   private java.util.Date AV34facfchto ;
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
   private boolean bGXsfl_36_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV36 ;
   private boolean gx_refresh_fired ;
   private String AV41FacturasEmitidas_SDT_json ;
   private String AV16ColumnsSelectorXML ;
   private String AV17UserCustomValue ;
   private String AV44TotValue_Factot ;
   private String AV46TotValue_FacBasImp ;
   private String AV48TotValue_FacIVAImp ;
   private String AV50TotValue_Fac_kgs ;
   private String AV52TotValue_Fac_mts ;
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
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private com.genexus.webpanels.WebSession AV53websession ;
   private GXBaseCollection<app.facturacion.SdtFacturasEmitidas_SDT_Item> AV13FacturasEmitidas_SDT ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.facturacion.SdtFacturasEmitidas_SDT_Item AV42FacturasEmitidas_SDTItem ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV24DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

