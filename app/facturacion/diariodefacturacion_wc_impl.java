package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class diariodefacturacion_wc_impl extends GXWebComponent
{
   public diariodefacturacion_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public diariodefacturacion_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( diariodefacturacion_wc_impl.class ));
   }

   public diariodefacturacion_wc_impl( int remoteHandle ,
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
               AV5Clicodfrom = (int)(GXutil.lval( httpContext.GetPar( "Clicodfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Clicodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Clicodfrom), 6, 0));
               AV6Clicodto = (int)(GXutil.lval( httpContext.GetPar( "Clicodto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Clicodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Clicodto), 6, 0));
               AV8Facfchfrom = localUtil.parseDateParm( httpContext.GetPar( "Facfchfrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Facfchfrom", localUtil.format(AV8Facfchfrom, "99/99/99"));
               AV9Facfchto = localUtil.parseDateParm( httpContext.GetPar( "Facfchto")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Facfchto", localUtil.format(AV9Facfchto, "99/99/99"));
               AV10FacPri = httpContext.GetPar( "FacPri") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10FacPri", AV10FacPri);
               AV11FacSernum = httpContext.GetPar( "FacSernum") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11FacSernum", AV11FacSernum);
               AV12noserie = (short)(GXutil.lval( httpContext.GetPar( "noserie"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12noserie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12noserie), 4, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV7Emprcod,Integer.valueOf(AV5Clicodfrom),Integer.valueOf(AV6Clicodto),AV8Facfchfrom,AV9Facfchto,AV10FacPri,AV11FacSernum,Short.valueOf(AV12noserie)});
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
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV26ColumnsSelector);
      AV81Pgmname = httpContext.GetPar( "Pgmname") ;
      AV36OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV37OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV52TFDiariodeFacturacion_SDT__Facfch = localUtil.parseDateParm( httpContext.GetPar( "TFDiariodeFacturacion_SDT__Facfch")) ;
      AV53TFDiariodeFacturacion_SDT__Facfch_To = localUtil.parseDateParm( httpContext.GetPar( "TFDiariodeFacturacion_SDT__Facfch_To")) ;
      AV56TFDiariodeFacturacion_SDT__Faccod = (int)(GXutil.lval( httpContext.GetPar( "TFDiariodeFacturacion_SDT__Faccod"))) ;
      AV57TFDiariodeFacturacion_SDT__Faccod_To = (int)(GXutil.lval( httpContext.GetPar( "TFDiariodeFacturacion_SDT__Faccod_To"))) ;
      AV58TFDiariodeFacturacion_SDT__Clicod = (int)(GXutil.lval( httpContext.GetPar( "TFDiariodeFacturacion_SDT__Clicod"))) ;
      AV59TFDiariodeFacturacion_SDT__Clicod_To = (int)(GXutil.lval( httpContext.GetPar( "TFDiariodeFacturacion_SDT__Clicod_To"))) ;
      AV60TFDiariodeFacturacion_SDT__CliNom = httpContext.GetPar( "TFDiariodeFacturacion_SDT__CliNom") ;
      AV7Emprcod = httpContext.GetPar( "Emprcod") ;
      AV5Clicodfrom = (int)(GXutil.lval( httpContext.GetPar( "Clicodfrom"))) ;
      AV6Clicodto = (int)(GXutil.lval( httpContext.GetPar( "Clicodto"))) ;
      AV8Facfchfrom = localUtil.parseDateParm( httpContext.GetPar( "Facfchfrom")) ;
      AV9Facfchto = localUtil.parseDateParm( httpContext.GetPar( "Facfchto")) ;
      AV10FacPri = httpContext.GetPar( "FacPri") ;
      AV11FacSernum = httpContext.GetPar( "FacSernum") ;
      AV12noserie = (short)(GXutil.lval( httpContext.GetPar( "noserie"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV21DiariodeFacturacion_SDT);
      AV40Tot_FacImpTot = CommonUtil.decimalVal( httpContext.GetPar( "Tot_FacImpTot"), ".") ;
      AV42Tot_FacImpGen = CommonUtil.decimalVal( httpContext.GetPar( "Tot_FacImpGen"), ".") ;
      AV44Tot_FacImpPP = CommonUtil.decimalVal( httpContext.GetPar( "Tot_FacImpPP"), ".") ;
      AV46Tot_FacBasImp = CommonUtil.decimalVal( httpContext.GetPar( "Tot_FacBasImp"), ".") ;
      AV48Tot_FacIVAImp = CommonUtil.decimalVal( httpContext.GetPar( "Tot_FacIVAImp"), ".") ;
      AV50Tot_FacTot = CommonUtil.decimalVal( httpContext.GetPar( "Tot_FacTot"), ".") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV26ColumnsSelector, AV81Pgmname, AV36OrderedBy, AV37OrderedDsc, AV52TFDiariodeFacturacion_SDT__Facfch, AV53TFDiariodeFacturacion_SDT__Facfch_To, AV56TFDiariodeFacturacion_SDT__Faccod, AV57TFDiariodeFacturacion_SDT__Faccod_To, AV58TFDiariodeFacturacion_SDT__Clicod, AV59TFDiariodeFacturacion_SDT__Clicod_To, AV60TFDiariodeFacturacion_SDT__CliNom, AV7Emprcod, AV5Clicodfrom, AV6Clicodto, AV8Facfchfrom, AV9Facfchto, AV10FacPri, AV11FacSernum, AV12noserie, AV21DiariodeFacturacion_SDT, AV40Tot_FacImpTot, AV42Tot_FacImpGen, AV44Tot_FacImpPP, AV46Tot_FacBasImp, AV48Tot_FacIVAImp, AV50Tot_FacTot, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa24U2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Diario de Facturacion", "")) ;
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.diariodefacturacion_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV5Clicodfrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV6Clicodto,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV8Facfchfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV9Facfchto)),GXutil.URLEncode(GXutil.rtrim(AV10FacPri)),GXutil.URLEncode(GXutil.rtrim(AV11FacSernum)),GXutil.URLEncode(GXutil.ltrimstr(AV12noserie,4,0))}, new String[] {"Emprcod","Clicodfrom","Clicodto","Facfchfrom","Facfchto","FacPri","FacSernum","noserie"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDIARIODEFACTURACION_SDT", getSecureSignedToken( sPrefix, AV21DiariodeFacturacion_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMPTOT", getSecureSignedToken( sPrefix, localUtil.format( AV40Tot_FacImpTot, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMPGEN", getSecureSignedToken( sPrefix, localUtil.format( AV42Tot_FacImpGen, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMPPP", getSecureSignedToken( sPrefix, localUtil.format( AV44Tot_FacImpPP, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACBASIMP", getSecureSignedToken( sPrefix, localUtil.format( AV46Tot_FacBasImp, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIVAIMP", getSecureSignedToken( sPrefix, localUtil.format( AV48Tot_FacIVAImp, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACTOT", getSecureSignedToken( sPrefix, localUtil.format( AV50Tot_FacTot, "ZZZZZZZZZ9.99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"DiariodeFacturacion_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV81Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\diariodefacturacion_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Diariodefacturacion_sdt", AV21DiariodeFacturacion_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Diariodefacturacion_sdt", AV21DiariodeFacturacion_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_Diariodefacturacion_sdt", getSecureSignedToken( sPrefix, AV21DiariodeFacturacion_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_36", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_36, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV34GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV35GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV32DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV32DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV26ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV26ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7Emprcod", GXutil.rtrim( wcpOAV7Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5Clicodfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV5Clicodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6Clicodto", GXutil.ltrim( localUtil.ntoc( wcpOAV6Clicodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8Facfchfrom", localUtil.dtoc( wcpOAV8Facfchfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9Facfchto", localUtil.dtoc( wcpOAV9Facfchto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10FacPri", GXutil.rtrim( wcpOAV10FacPri));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11FacSernum", GXutil.rtrim( wcpOAV11FacSernum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV12noserie", GXutil.ltrim( localUtil.ntoc( wcpOAV12noserie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV36OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV37OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDIARIODEFACTURACION_SDT__FACFCH", localUtil.dtoc( AV52TFDiariodeFacturacion_SDT__Facfch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDIARIODEFACTURACION_SDT__FACFCH_TO", localUtil.dtoc( AV53TFDiariodeFacturacion_SDT__Facfch_To, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDIARIODEFACTURACION_SDT__FACCOD", GXutil.ltrim( localUtil.ntoc( AV56TFDiariodeFacturacion_SDT__Faccod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDIARIODEFACTURACION_SDT__FACCOD_TO", GXutil.ltrim( localUtil.ntoc( AV57TFDiariodeFacturacion_SDT__Faccod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDIARIODEFACTURACION_SDT__CLICOD", GXutil.ltrim( localUtil.ntoc( AV58TFDiariodeFacturacion_SDT__Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDIARIODEFACTURACION_SDT__CLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV59TFDiariodeFacturacion_SDT__Clicod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDIARIODEFACTURACION_SDT__CLINOM", GXutil.rtrim( AV60TFDiariodeFacturacion_SDT__CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV7Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODFROM", GXutil.ltrim( localUtil.ntoc( AV5Clicodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODTO", GXutil.ltrim( localUtil.ntoc( AV6Clicodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFACFCHFROM", localUtil.dtoc( AV8Facfchfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFACFCHTO", localUtil.dtoc( AV9Facfchto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFACPRI", GXutil.rtrim( AV10FacPri));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFACSERNUM", GXutil.rtrim( AV11FacSernum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNOSERIE", GXutil.ltrim( localUtil.ntoc( AV12noserie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDIARIODEFACTURACION_SDT", AV21DiariodeFacturacion_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDIARIODEFACTURACION_SDT", AV21DiariodeFacturacion_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDIARIODEFACTURACION_SDT", getSecureSignedToken( sPrefix, AV21DiariodeFacturacion_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FACIMPTOT", GXutil.ltrim( localUtil.ntoc( AV40Tot_FacImpTot, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMPTOT", getSecureSignedToken( sPrefix, localUtil.format( AV40Tot_FacImpTot, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FACIMPGEN", GXutil.ltrim( localUtil.ntoc( AV42Tot_FacImpGen, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMPGEN", getSecureSignedToken( sPrefix, localUtil.format( AV42Tot_FacImpGen, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FACIMPPP", GXutil.ltrim( localUtil.ntoc( AV44Tot_FacImpPP, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMPPP", getSecureSignedToken( sPrefix, localUtil.format( AV44Tot_FacImpPP, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FACBASIMP", GXutil.ltrim( localUtil.ntoc( AV46Tot_FacBasImp, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACBASIMP", getSecureSignedToken( sPrefix, localUtil.format( AV46Tot_FacBasImp, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FACIVAIMP", GXutil.ltrim( localUtil.ntoc( AV48Tot_FacIVAImp, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIVAIMP", getSecureSignedToken( sPrefix, localUtil.format( AV48Tot_FacIVAImp, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FACTOT", GXutil.ltrim( localUtil.ntoc( AV50Tot_FacTot, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACTOT", getSecureSignedToken( sPrefix, localUtil.format( AV50Tot_FacTot, "ZZZZZZZZZ9.99")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
   }

   public void renderHtmlCloseForm24U2( )
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
      return "Facturacion.DiariodeFacturacion_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Diario de Facturacion", "") ;
   }

   public void wb24U0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.facturacion.diariodefacturacion_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
            httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 36, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\DiariodeFacturacion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 36, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\DiariodeFacturacion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 36, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\DiariodeFacturacion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_24U2( true) ;
      }
      else
      {
         wb_table1_23_24U2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_24U2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* User Defined Control */
         ucBarradeprogreso.render(context, "gxprogressindicator", Barradeprogreso_Internalname, sPrefix+"BARRADEPROGRESOContainer");
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
            AV70GXV1 = nGXsfl_36_idx ;
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
         wb_table2_49_24U2( true) ;
      }
      else
      {
         wb_table2_49_24U2( false) ;
      }
      return  ;
   }

   public void wb_table2_49_24U2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV34GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV35GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV81Pgmname), GXutil.rtrim( localUtil.format( AV81Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\DiariodeFacturacion_WC.htm");
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
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV32DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV32DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV26ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_diariodefacturacion_sdt__facfchauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_diariodefacturacion_sdt__facfchauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_diariodefacturacion_sdt__facfchauxdate_Internalname, localUtil.format(AV54DDO_DiariodeFacturacion_SDT__FacfchAuxDate, "99/99/99"), localUtil.format( AV54DDO_DiariodeFacturacion_SDT__FacfchAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,90);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_diariodefacturacion_sdt__facfchauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\DiariodeFacturacion_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_diariodefacturacion_sdt__facfchauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Facturacion\\DiariodeFacturacion_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_diariodefacturacion_sdt__facfchauxdateto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_diariodefacturacion_sdt__facfchauxdateto_Internalname, localUtil.format(AV55DDO_DiariodeFacturacion_SDT__FacfchAuxDateTo, "99/99/99"), localUtil.format( AV55DDO_DiariodeFacturacion_SDT__FacfchAuxDateTo, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,91);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_diariodefacturacion_sdt__facfchauxdateto_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\DiariodeFacturacion_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_diariodefacturacion_sdt__facfchauxdateto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Facturacion\\DiariodeFacturacion_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
               AV70GXV1 = nGXsfl_36_idx ;
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

   public void start24U2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Diario de Facturacion", ""), (short)(0)) ;
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
            strup24U0( ) ;
         }
      }
   }

   public void ws24U2( )
   {
      start24U2( ) ;
      evt24U2( ) ;
   }

   public void evt24U2( )
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
                              strup24U0( ) ;
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
                              strup24U0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1124U2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup24U0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1224U2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup24U0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1324U2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup24U0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1424U2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup24U0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e1524U2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup24U0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e1624U2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup24U0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavTotvalue_facimptot_Internalname ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "'DOEXPORTREPORT'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "'DOUSERACTION1'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup24U0( ) ;
                           }
                           nGXsfl_36_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_362( ) ;
                           AV70GXV1 = (int)(nGXsfl_36_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV21DiariodeFacturacion_SDT.size() >= AV70GXV1 ) && ( AV70GXV1 > 0 ) )
                           {
                              AV21DiariodeFacturacion_SDT.currentItem( ((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)) );
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
                                       GX_FocusControl = edtavTotvalue_facimptot_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e1724U2 ();
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
                                       GX_FocusControl = edtavTotvalue_facimptot_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e1824U2 ();
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
                                       GX_FocusControl = edtavTotvalue_facimptot_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e1924U2 ();
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
                                       GX_FocusControl = edtavTotvalue_facimptot_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: 'DoExportReport' */
                                       e2024U2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "'DOUSERACTION1'") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavTotvalue_facimptot_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: 'DoUserAction1' */
                                       e2124U2 ();
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
                                    strup24U0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavTotvalue_facimptot_Internalname ;
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

   public void we24U2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm24U2( ) ;
         }
      }
   }

   public void pa24U2( )
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
            GX_FocusControl = edtavTotvalue_facimptot_Internalname ;
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
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV26ColumnsSelector ,
                                 String AV81Pgmname ,
                                 short AV36OrderedBy ,
                                 boolean AV37OrderedDsc ,
                                 java.util.Date AV52TFDiariodeFacturacion_SDT__Facfch ,
                                 java.util.Date AV53TFDiariodeFacturacion_SDT__Facfch_To ,
                                 int AV56TFDiariodeFacturacion_SDT__Faccod ,
                                 int AV57TFDiariodeFacturacion_SDT__Faccod_To ,
                                 int AV58TFDiariodeFacturacion_SDT__Clicod ,
                                 int AV59TFDiariodeFacturacion_SDT__Clicod_To ,
                                 String AV60TFDiariodeFacturacion_SDT__CliNom ,
                                 String AV7Emprcod ,
                                 int AV5Clicodfrom ,
                                 int AV6Clicodto ,
                                 java.util.Date AV8Facfchfrom ,
                                 java.util.Date AV9Facfchto ,
                                 String AV10FacPri ,
                                 String AV11FacSernum ,
                                 short AV12noserie ,
                                 GXBaseCollection<app.facturacion.SdtDiariodeFacturacion_SDT_Item> AV21DiariodeFacturacion_SDT ,
                                 java.math.BigDecimal AV40Tot_FacImpTot ,
                                 java.math.BigDecimal AV42Tot_FacImpGen ,
                                 java.math.BigDecimal AV44Tot_FacImpPP ,
                                 java.math.BigDecimal AV46Tot_FacBasImp ,
                                 java.math.BigDecimal AV48Tot_FacIVAImp ,
                                 java.math.BigDecimal AV50Tot_FacTot ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1824U2 ();
      GRID_nCurrentRecord = 0 ;
      rf24U2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"DiariodeFacturacion_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV81Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\diariodefacturacion_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf24U2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV81Pgmname = "Facturacion.DiariodeFacturacion_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81Pgmname", AV81Pgmname);
      Gx_err = (short)(0) ;
      edtavDiariodefacturacion_sdt__facfch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_sdt__facfch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_sdt__facfch_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavDiariodefacturacion_sdt__faccod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_sdt__faccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_sdt__faccod_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavDiariodefacturacion_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_sdt__clicod_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavDiariodefacturacion_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_sdt__clinom_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavDiariodefacturacion_sdt__facimptot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_sdt__facimptot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_sdt__facimptot_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavDiariodefacturacion_sdt__facimpgen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_sdt__facimpgen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_sdt__facimpgen_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavDiariodefacturacion_sdt__facimppp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_sdt__facimppp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_sdt__facimppp_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavDiariodefacturacion_sdt__facbasimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_sdt__facbasimp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_sdt__facbasimp_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavDiariodefacturacion_sdt__facivaimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_sdt__facivaimp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_sdt__facivaimp_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavDiariodefacturacion_sdt__factot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_sdt__factot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_sdt__factot_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavTotvalue_facimptot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_facimptot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_facimptot_Enabled), 5, 0), true);
      edtavTotvalue_facimpgen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_facimpgen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_facimpgen_Enabled), 5, 0), true);
      edtavTotvalue_facimppp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_facimppp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_facimppp_Enabled), 5, 0), true);
      edtavTotvalue_facbasimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_facbasimp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_facbasimp_Enabled), 5, 0), true);
      edtavTotvalue_facivaimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_facivaimp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_facivaimp_Enabled), 5, 0), true);
      edtavTotvalue_factot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_factot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_factot_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf24U2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(36) ;
      /* Execute user event: Refresh */
      e1824U2 ();
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
         e1924U2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_36_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e1924U2 ();
         }
         wbEnd = (short)(36) ;
         wb24U0( ) ;
      }
      bGXsfl_36_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes24U2( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDIARIODEFACTURACION_SDT", AV21DiariodeFacturacion_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDIARIODEFACTURACION_SDT", AV21DiariodeFacturacion_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vDIARIODEFACTURACION_SDT", getSecureSignedToken( sPrefix, AV21DiariodeFacturacion_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FACIMPTOT", GXutil.ltrim( localUtil.ntoc( AV40Tot_FacImpTot, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMPTOT", getSecureSignedToken( sPrefix, localUtil.format( AV40Tot_FacImpTot, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FACIMPGEN", GXutil.ltrim( localUtil.ntoc( AV42Tot_FacImpGen, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMPGEN", getSecureSignedToken( sPrefix, localUtil.format( AV42Tot_FacImpGen, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FACIMPPP", GXutil.ltrim( localUtil.ntoc( AV44Tot_FacImpPP, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMPPP", getSecureSignedToken( sPrefix, localUtil.format( AV44Tot_FacImpPP, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FACBASIMP", GXutil.ltrim( localUtil.ntoc( AV46Tot_FacBasImp, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACBASIMP", getSecureSignedToken( sPrefix, localUtil.format( AV46Tot_FacBasImp, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FACIVAIMP", GXutil.ltrim( localUtil.ntoc( AV48Tot_FacIVAImp, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIVAIMP", getSecureSignedToken( sPrefix, localUtil.format( AV48Tot_FacIVAImp, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_FACTOT", GXutil.ltrim( localUtil.ntoc( AV50Tot_FacTot, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACTOT", getSecureSignedToken( sPrefix, localUtil.format( AV50Tot_FacTot, "ZZZZZZZZZ9.99")));
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
      return AV21DiariodeFacturacion_SDT.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV26ColumnsSelector, AV81Pgmname, AV36OrderedBy, AV37OrderedDsc, AV52TFDiariodeFacturacion_SDT__Facfch, AV53TFDiariodeFacturacion_SDT__Facfch_To, AV56TFDiariodeFacturacion_SDT__Faccod, AV57TFDiariodeFacturacion_SDT__Faccod_To, AV58TFDiariodeFacturacion_SDT__Clicod, AV59TFDiariodeFacturacion_SDT__Clicod_To, AV60TFDiariodeFacturacion_SDT__CliNom, AV7Emprcod, AV5Clicodfrom, AV6Clicodto, AV8Facfchfrom, AV9Facfchto, AV10FacPri, AV11FacSernum, AV12noserie, AV21DiariodeFacturacion_SDT, AV40Tot_FacImpTot, AV42Tot_FacImpGen, AV44Tot_FacImpPP, AV46Tot_FacBasImp, AV48Tot_FacIVAImp, AV50Tot_FacTot, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV26ColumnsSelector, AV81Pgmname, AV36OrderedBy, AV37OrderedDsc, AV52TFDiariodeFacturacion_SDT__Facfch, AV53TFDiariodeFacturacion_SDT__Facfch_To, AV56TFDiariodeFacturacion_SDT__Faccod, AV57TFDiariodeFacturacion_SDT__Faccod_To, AV58TFDiariodeFacturacion_SDT__Clicod, AV59TFDiariodeFacturacion_SDT__Clicod_To, AV60TFDiariodeFacturacion_SDT__CliNom, AV7Emprcod, AV5Clicodfrom, AV6Clicodto, AV8Facfchfrom, AV9Facfchto, AV10FacPri, AV11FacSernum, AV12noserie, AV21DiariodeFacturacion_SDT, AV40Tot_FacImpTot, AV42Tot_FacImpGen, AV44Tot_FacImpPP, AV46Tot_FacBasImp, AV48Tot_FacIVAImp, AV50Tot_FacTot, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV26ColumnsSelector, AV81Pgmname, AV36OrderedBy, AV37OrderedDsc, AV52TFDiariodeFacturacion_SDT__Facfch, AV53TFDiariodeFacturacion_SDT__Facfch_To, AV56TFDiariodeFacturacion_SDT__Faccod, AV57TFDiariodeFacturacion_SDT__Faccod_To, AV58TFDiariodeFacturacion_SDT__Clicod, AV59TFDiariodeFacturacion_SDT__Clicod_To, AV60TFDiariodeFacturacion_SDT__CliNom, AV7Emprcod, AV5Clicodfrom, AV6Clicodto, AV8Facfchfrom, AV9Facfchto, AV10FacPri, AV11FacSernum, AV12noserie, AV21DiariodeFacturacion_SDT, AV40Tot_FacImpTot, AV42Tot_FacImpGen, AV44Tot_FacImpPP, AV46Tot_FacBasImp, AV48Tot_FacIVAImp, AV50Tot_FacTot, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV26ColumnsSelector, AV81Pgmname, AV36OrderedBy, AV37OrderedDsc, AV52TFDiariodeFacturacion_SDT__Facfch, AV53TFDiariodeFacturacion_SDT__Facfch_To, AV56TFDiariodeFacturacion_SDT__Faccod, AV57TFDiariodeFacturacion_SDT__Faccod_To, AV58TFDiariodeFacturacion_SDT__Clicod, AV59TFDiariodeFacturacion_SDT__Clicod_To, AV60TFDiariodeFacturacion_SDT__CliNom, AV7Emprcod, AV5Clicodfrom, AV6Clicodto, AV8Facfchfrom, AV9Facfchto, AV10FacPri, AV11FacSernum, AV12noserie, AV21DiariodeFacturacion_SDT, AV40Tot_FacImpTot, AV42Tot_FacImpGen, AV44Tot_FacImpPP, AV46Tot_FacBasImp, AV48Tot_FacIVAImp, AV50Tot_FacTot, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV26ColumnsSelector, AV81Pgmname, AV36OrderedBy, AV37OrderedDsc, AV52TFDiariodeFacturacion_SDT__Facfch, AV53TFDiariodeFacturacion_SDT__Facfch_To, AV56TFDiariodeFacturacion_SDT__Faccod, AV57TFDiariodeFacturacion_SDT__Faccod_To, AV58TFDiariodeFacturacion_SDT__Clicod, AV59TFDiariodeFacturacion_SDT__Clicod_To, AV60TFDiariodeFacturacion_SDT__CliNom, AV7Emprcod, AV5Clicodfrom, AV6Clicodto, AV8Facfchfrom, AV9Facfchto, AV10FacPri, AV11FacSernum, AV12noserie, AV21DiariodeFacturacion_SDT, AV40Tot_FacImpTot, AV42Tot_FacImpGen, AV44Tot_FacImpPP, AV46Tot_FacBasImp, AV48Tot_FacIVAImp, AV50Tot_FacTot, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV81Pgmname = "Facturacion.DiariodeFacturacion_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81Pgmname", AV81Pgmname);
      Gx_err = (short)(0) ;
      edtavDiariodefacturacion_sdt__facfch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_sdt__facfch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_sdt__facfch_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavDiariodefacturacion_sdt__faccod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_sdt__faccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_sdt__faccod_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavDiariodefacturacion_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_sdt__clicod_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavDiariodefacturacion_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_sdt__clinom_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavDiariodefacturacion_sdt__facimptot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_sdt__facimptot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_sdt__facimptot_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavDiariodefacturacion_sdt__facimpgen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_sdt__facimpgen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_sdt__facimpgen_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavDiariodefacturacion_sdt__facimppp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_sdt__facimppp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_sdt__facimppp_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavDiariodefacturacion_sdt__facbasimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_sdt__facbasimp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_sdt__facbasimp_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavDiariodefacturacion_sdt__facivaimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_sdt__facivaimp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_sdt__facivaimp_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavDiariodefacturacion_sdt__factot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_sdt__factot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_sdt__factot_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavTotvalue_facimptot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_facimptot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_facimptot_Enabled), 5, 0), true);
      edtavTotvalue_facimpgen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_facimpgen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_facimpgen_Enabled), 5, 0), true);
      edtavTotvalue_facimppp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_facimppp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_facimppp_Enabled), 5, 0), true);
      edtavTotvalue_facbasimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_facbasimp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_facbasimp_Enabled), 5, 0), true);
      edtavTotvalue_facivaimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_facivaimp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_facivaimp_Enabled), 5, 0), true);
      edtavTotvalue_factot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_factot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_factot_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup24U0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1724U2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Diariodefacturacion_sdt"), AV21DiariodeFacturacion_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV32DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV26ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDIARIODEFACTURACION_SDT"), AV21DiariodeFacturacion_SDT);
         /* Read saved values. */
         nRC_GXsfl_36 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_36"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV34GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV35GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV7Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV7Emprcod") ;
         wcpOAV5Clicodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV5Clicodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV6Clicodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6Clicodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV8Facfchfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV8Facfchfrom"), 0) ;
         wcpOAV9Facfchto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV9Facfchto"), 0) ;
         wcpOAV10FacPri = httpContext.cgiGet( sPrefix+"wcpOAV10FacPri") ;
         wcpOAV11FacSernum = httpContext.cgiGet( sPrefix+"wcpOAV11FacSernum") ;
         wcpOAV12noserie = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV12noserie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( sPrefix+"DDO_GRID_Includesortasc") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( sPrefix+"DDO_GRID_Filterisrange") ;
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
         nRC_GXsfl_36 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_36"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_36_fel_idx = 0 ;
         while ( nGXsfl_36_fel_idx < nRC_GXsfl_36 )
         {
            nGXsfl_36_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_36_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_36_fel_idx+1) ;
            sGXsfl_36_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_362( ) ;
            AV70GXV1 = (int)(nGXsfl_36_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV21DiariodeFacturacion_SDT.size() >= AV70GXV1 ) && ( AV70GXV1 > 0 ) )
            {
               AV21DiariodeFacturacion_SDT.currentItem( ((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)) );
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
         AV41TotValue_FacImpTot = httpContext.cgiGet( edtavTotvalue_facimptot_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TotValue_FacImpTot", AV41TotValue_FacImpTot);
         AV43TotValue_FacImpGen = httpContext.cgiGet( edtavTotvalue_facimpgen_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TotValue_FacImpGen", AV43TotValue_FacImpGen);
         AV45TotValue_FacImpPP = httpContext.cgiGet( edtavTotvalue_facimppp_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TotValue_FacImpPP", AV45TotValue_FacImpPP);
         AV47TotValue_FacBasImp = httpContext.cgiGet( edtavTotvalue_facbasimp_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TotValue_FacBasImp", AV47TotValue_FacBasImp);
         AV49TotValue_FacIVAImp = httpContext.cgiGet( edtavTotvalue_facivaimp_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TotValue_FacIVAImp", AV49TotValue_FacIVAImp);
         AV51TotValue_FacTot = httpContext.cgiGet( edtavTotvalue_factot_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TotValue_FacTot", AV51TotValue_FacTot);
         AV81Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81Pgmname", AV81Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_diariodefacturacion_sdt__facfchauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_DIARIODEFACTURACION_SDT__FACFCHAUXDATE");
            GX_FocusControl = edtavDdo_diariodefacturacion_sdt__facfchauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV54DDO_DiariodeFacturacion_SDT__FacfchAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54DDO_DiariodeFacturacion_SDT__FacfchAuxDate", localUtil.format(AV54DDO_DiariodeFacturacion_SDT__FacfchAuxDate, "99/99/99"));
         }
         else
         {
            AV54DDO_DiariodeFacturacion_SDT__FacfchAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_diariodefacturacion_sdt__facfchauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54DDO_DiariodeFacturacion_SDT__FacfchAuxDate", localUtil.format(AV54DDO_DiariodeFacturacion_SDT__FacfchAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_diariodefacturacion_sdt__facfchauxdateto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_DIARIODEFACTURACION_SDT__FACFCHAUXDATETO");
            GX_FocusControl = edtavDdo_diariodefacturacion_sdt__facfchauxdateto_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV55DDO_DiariodeFacturacion_SDT__FacfchAuxDateTo = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55DDO_DiariodeFacturacion_SDT__FacfchAuxDateTo", localUtil.format(AV55DDO_DiariodeFacturacion_SDT__FacfchAuxDateTo, "99/99/99"));
         }
         else
         {
            AV55DDO_DiariodeFacturacion_SDT__FacfchAuxDateTo = localUtil.ctod( httpContext.cgiGet( edtavDdo_diariodefacturacion_sdt__facfchauxdateto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55DDO_DiariodeFacturacion_SDT__FacfchAuxDateTo", localUtil.format(AV55DDO_DiariodeFacturacion_SDT__FacfchAuxDateTo, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"DiariodeFacturacion_WC");
         AV81Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81Pgmname", AV81Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV81Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("facturacion\\diariodefacturacion_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1724U2 ();
      if (returnInSub) return;
   }

   public void e1724U2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV61Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      diariodefacturacion_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV61Station = GXt_char1 ;
      GXv_char2[0] = AV7Emprcod ;
      GXv_char3[0] = AV62EmprNom ;
      GXv_char4[0] = AV63UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV61Station, GXv_char2, GXv_char3, GXv_char4) ;
      diariodefacturacion_wc_impl.this.AV7Emprcod = GXv_char2[0] ;
      diariodefacturacion_wc_impl.this.AV62EmprNom = GXv_char3[0] ;
      diariodefacturacion_wc_impl.this.AV63UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
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
      if ( AV36OrderedBy < 1 )
      {
         AV36OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S122 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV32DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV32DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e1824U2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV14WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV14WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV28Session.getValue("Facturacion.DiariodeFacturacion_WCColumnsSelector"), "") != 0 )
      {
         AV24ColumnsSelectorXML = AV28Session.getValue("Facturacion.DiariodeFacturacion_WCColumnsSelector") ;
         AV26ColumnsSelector.fromxml(AV24ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S142 ();
         if (returnInSub) return;
      }
      edtavDiariodefacturacion_sdt__facfch_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_sdt__facfch_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_sdt__facfch_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavDiariodefacturacion_sdt__faccod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_sdt__faccod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_sdt__faccod_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavDiariodefacturacion_sdt__clicod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_sdt__clicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_sdt__clicod_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavDiariodefacturacion_sdt__clinom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_sdt__clinom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_sdt__clinom_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavDiariodefacturacion_sdt__facimptot_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_sdt__facimptot_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_sdt__facimptot_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavDiariodefacturacion_sdt__facimpgen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_sdt__facimpgen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_sdt__facimpgen_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavDiariodefacturacion_sdt__facimppp_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_sdt__facimppp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_sdt__facimppp_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavDiariodefacturacion_sdt__facbasimp_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_sdt__facbasimp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_sdt__facbasimp_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavDiariodefacturacion_sdt__facivaimp_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_sdt__facivaimp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_sdt__facivaimp_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtavDiariodefacturacion_sdt__factot_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiariodefacturacion_sdt__factot_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiariodefacturacion_sdt__factot_Visible), 5, 0), !bGXsfl_36_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S162 ();
      if (returnInSub) return;
      AV34GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34GridCurrentPage), 10, 0));
      AV35GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ColumnsSelector", AV26ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21DiariodeFacturacion_SDT", AV21DiariodeFacturacion_SDT);
   }

   public void e1124U2( )
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
         AV33PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV33PageToGo) ;
      }
   }

   public void e1224U2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1324U2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV36OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36OrderedBy), 4, 0));
         AV37OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37OrderedDsc", AV37OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S122 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DiariodeFacturacion_SDT__Facfch") == 0 )
         {
            AV52TFDiariodeFacturacion_SDT__Facfch = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFDiariodeFacturacion_SDT__Facfch", localUtil.format(AV52TFDiariodeFacturacion_SDT__Facfch, "99/99/99"));
            AV53TFDiariodeFacturacion_SDT__Facfch_To = localUtil.ctod( Ddo_grid_Filteredtextto_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFDiariodeFacturacion_SDT__Facfch_To", localUtil.format(AV53TFDiariodeFacturacion_SDT__Facfch_To, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DiariodeFacturacion_SDT__Faccod") == 0 )
         {
            AV56TFDiariodeFacturacion_SDT__Faccod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFDiariodeFacturacion_SDT__Faccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFDiariodeFacturacion_SDT__Faccod), 8, 0));
            AV57TFDiariodeFacturacion_SDT__Faccod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFDiariodeFacturacion_SDT__Faccod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFDiariodeFacturacion_SDT__Faccod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DiariodeFacturacion_SDT__Clicod") == 0 )
         {
            AV58TFDiariodeFacturacion_SDT__Clicod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFDiariodeFacturacion_SDT__Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFDiariodeFacturacion_SDT__Clicod), 6, 0));
            AV59TFDiariodeFacturacion_SDT__Clicod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFDiariodeFacturacion_SDT__Clicod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFDiariodeFacturacion_SDT__Clicod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DiariodeFacturacion_SDT__CliNom") == 0 )
         {
            AV60TFDiariodeFacturacion_SDT__CliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFDiariodeFacturacion_SDT__CliNom", AV60TFDiariodeFacturacion_SDT__CliNom);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e1924U2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV70GXV1 = 1 ;
      while ( AV70GXV1 <= AV21DiariodeFacturacion_SDT.size() )
      {
         AV21DiariodeFacturacion_SDT.currentItem( ((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)) );
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
         AV70GXV1 = (int)(AV70GXV1+1) ;
      }
   }

   public void e1424U2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV24ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV26ColumnsSelector.fromJSonString(AV24ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "Facturacion.DiariodeFacturacion_WCColumnsSelector", ((GXutil.strcmp("", AV24ColumnsSelectorXML)==0) ? "" : AV26ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ColumnsSelector", AV26ColumnsSelector);
      if ( gx_BV36 )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21DiariodeFacturacion_SDT", AV21DiariodeFacturacion_SDT);
         nGXsfl_36_bak_idx = nGXsfl_36_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV26ColumnsSelector, AV81Pgmname, AV36OrderedBy, AV37OrderedDsc, AV52TFDiariodeFacturacion_SDT__Facfch, AV53TFDiariodeFacturacion_SDT__Facfch_To, AV56TFDiariodeFacturacion_SDT__Faccod, AV57TFDiariodeFacturacion_SDT__Faccod_To, AV58TFDiariodeFacturacion_SDT__Clicod, AV59TFDiariodeFacturacion_SDT__Clicod_To, AV60TFDiariodeFacturacion_SDT__CliNom, AV7Emprcod, AV5Clicodfrom, AV6Clicodto, AV8Facfchfrom, AV9Facfchto, AV10FacPri, AV11FacSernum, AV12noserie, AV21DiariodeFacturacion_SDT, AV40Tot_FacImpTot, AV42Tot_FacImpGen, AV44Tot_FacImpPP, AV46Tot_FacBasImp, AV48Tot_FacIVAImp, AV50Tot_FacTot, sPrefix) ;
         nGXsfl_36_idx = nGXsfl_36_bak_idx ;
         sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_362( ) ;
      }
   }

   public void e1524U2( )
   {
      AV70GXV1 = (int)(nGXsfl_36_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV70GXV1 > 0 ) && ( AV21DiariodeFacturacion_SDT.size() >= AV70GXV1 ) )
      {
         AV21DiariodeFacturacion_SDT.currentItem( ((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)) );
      }
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV65DiariodeFacturacion_json = AV21DiariodeFacturacion_SDT.toJSonString(false) ;
      AV64Websession.setValue(httpContext.getMessage( "DiariodeFacturacion_json", ""), AV65DiariodeFacturacion_json);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
      GXv_char4[0] = AV22ExcelFilename ;
      GXv_char3[0] = AV23ErrorMessage ;
      new app.facturacion.diariodefacturacion_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      diariodefacturacion_wc_impl.this.AV22ExcelFilename = GXv_char4[0] ;
      diariodefacturacion_wc_impl.this.AV23ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV22ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV22ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV23ErrorMessage);
      }
      /*  Sending Event outputs  */
   }

   public void e1624U2( )
   {
      AV70GXV1 = (int)(nGXsfl_36_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV70GXV1 > 0 ) && ( AV21DiariodeFacturacion_SDT.size() >= AV70GXV1 ) )
      {
         AV21DiariodeFacturacion_SDT.currentItem( ((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)) );
      }
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV65DiariodeFacturacion_json = AV21DiariodeFacturacion_SDT.toJSonString(false) ;
      AV64Websession.setValue(httpContext.getMessage( "DiariodeFacturacion_json", ""), AV65DiariodeFacturacion_json);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.facturacion.diariodefacturacion_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
   }

   public void S162( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDiariodeFacturacion_SDT_Item8 = AV21DiariodeFacturacion_SDT ;
      GXv_objcol_SdtDiariodeFacturacion_SDT_Item9[0] = GXt_objcol_SdtDiariodeFacturacion_SDT_Item8 ;
      new app.facturacion.diariodefacturacion_dp(remoteHandle, context).execute( AV7Emprcod, AV5Clicodfrom, AV6Clicodto, AV8Facfchfrom, AV9Facfchto, AV10FacPri, AV11FacSernum, AV12noserie, AV58TFDiariodeFacturacion_SDT__Clicod, AV59TFDiariodeFacturacion_SDT__Clicod_To, AV60TFDiariodeFacturacion_SDT__CliNom, AV56TFDiariodeFacturacion_SDT__Faccod, AV57TFDiariodeFacturacion_SDT__Faccod_To, AV52TFDiariodeFacturacion_SDT__Facfch, AV53TFDiariodeFacturacion_SDT__Facfch_To, GXv_objcol_SdtDiariodeFacturacion_SDT_Item9) ;
      GXt_objcol_SdtDiariodeFacturacion_SDT_Item8 = GXv_objcol_SdtDiariodeFacturacion_SDT_Item9[0] ;
      AV21DiariodeFacturacion_SDT = GXt_objcol_SdtDiariodeFacturacion_SDT_Item8 ;
      gx_BV36 = true ;
      AV21DiariodeFacturacion_SDT.sort((AV37OrderedDsc ? "[" : "")+GXutil.format( "%"+GXutil.trim( GXutil.str( AV36OrderedBy, 4, 0)), "Facfch", "Faccod", "Clicod", "CliNom", "", "", "", "", "")+(AV37OrderedDsc ? "]" : ""));
      gx_BV36 = true ;
   }

   public void S122( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV36OrderedBy, 4, 0))+":"+(AV37OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S142( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV26ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DiariodeFacturacion_SDT__Facfch", "", "Fecha", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DiariodeFacturacion_SDT__Faccod", "", "Nº Factura", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DiariodeFacturacion_SDT__Clicod", "", "Cliente", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DiariodeFacturacion_SDT__CliNom", "", "Nombre", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DiariodeFacturacion_SDT__FacImpTot", "", "Total Bruto", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DiariodeFacturacion_SDT__FacImpGen", "", "Imp. Dto. Gral.", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DiariodeFacturacion_SDT__FacImpPP", "", "Imp. Dto. PP.", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DiariodeFacturacion_SDT__FacBasImp", "", "Base Imponible", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DiariodeFacturacion_SDT__FacIVAImp", "", "Imp. IVA", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DiariodeFacturacion_SDT__FacTot", "", "Total", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char1 = AV25UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Facturacion.DiariodeFacturacion_WCColumnsSelector", GXv_char4) ;
      diariodefacturacion_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV25UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV25UserCustomValue)==0) ) )
      {
         AV27ColumnsSelectorAux.fromxml(AV25UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV27ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV26ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV27ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV26ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV28Session.getValue(AV81Pgmname+"GridState"), "") == 0 )
      {
         AV18GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV81Pgmname+"GridState"), null, null);
      }
      else
      {
         AV18GridState.fromxml(AV28Session.getValue(AV81Pgmname+"GridState"), null, null);
      }
      AV36OrderedBy = AV18GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36OrderedBy), 4, 0));
      AV37OrderedDsc = AV18GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37OrderedDsc", AV37OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S122 ();
      if (returnInSub) return;
      AV82GXV12 = 1 ;
      while ( AV82GXV12 <= AV18GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV19GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV18GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV82GXV12));
         if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIARIODEFACTURACION_SDT__FACFCH") == 0 )
         {
            AV52TFDiariodeFacturacion_SDT__Facfch = localUtil.ctod( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFDiariodeFacturacion_SDT__Facfch", localUtil.format(AV52TFDiariodeFacturacion_SDT__Facfch, "99/99/99"));
            AV53TFDiariodeFacturacion_SDT__Facfch_To = localUtil.ctod( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFDiariodeFacturacion_SDT__Facfch_To", localUtil.format(AV53TFDiariodeFacturacion_SDT__Facfch_To, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIARIODEFACTURACION_SDT__FACCOD") == 0 )
         {
            AV56TFDiariodeFacturacion_SDT__Faccod = (int)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFDiariodeFacturacion_SDT__Faccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFDiariodeFacturacion_SDT__Faccod), 8, 0));
            AV57TFDiariodeFacturacion_SDT__Faccod_To = (int)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFDiariodeFacturacion_SDT__Faccod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFDiariodeFacturacion_SDT__Faccod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIARIODEFACTURACION_SDT__CLICOD") == 0 )
         {
            AV58TFDiariodeFacturacion_SDT__Clicod = (int)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFDiariodeFacturacion_SDT__Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFDiariodeFacturacion_SDT__Clicod), 6, 0));
            AV59TFDiariodeFacturacion_SDT__Clicod_To = (int)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFDiariodeFacturacion_SDT__Clicod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFDiariodeFacturacion_SDT__Clicod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIARIODEFACTURACION_SDT__CLINOM") == 0 )
         {
            AV60TFDiariodeFacturacion_SDT__CliNom = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFDiariodeFacturacion_SDT__CliNom", AV60TFDiariodeFacturacion_SDT__CliNom);
         }
         AV82GXV12 = (int)(AV82GXV12+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFDiariodeFacturacion_SDT__CliNom)==0), AV60TFDiariodeFacturacion_SDT__CliNom, GXv_char4) ;
      diariodefacturacion_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52TFDiariodeFacturacion_SDT__Facfch)) ? "" : localUtil.dtoc( AV52TFDiariodeFacturacion_SDT__Facfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV56TFDiariodeFacturacion_SDT__Faccod) ? "" : GXutil.str( AV56TFDiariodeFacturacion_SDT__Faccod, 8, 0))+"|"+((0==AV58TFDiariodeFacturacion_SDT__Clicod) ? "" : GXutil.str( AV58TFDiariodeFacturacion_SDT__Clicod, 6, 0))+"|"+GXt_char1+"||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53TFDiariodeFacturacion_SDT__Facfch_To)) ? "" : localUtil.dtoc( AV53TFDiariodeFacturacion_SDT__Facfch_To, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV57TFDiariodeFacturacion_SDT__Faccod_To) ? "" : GXutil.str( AV57TFDiariodeFacturacion_SDT__Faccod_To, 8, 0))+"|"+((0==AV59TFDiariodeFacturacion_SDT__Clicod_To) ? "" : GXutil.str( AV59TFDiariodeFacturacion_SDT__Clicod_To, 6, 0))+"|||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV18GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV18GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV18GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV18GridState.fromxml(AV28Session.getValue(AV81Pgmname+"GridState"), null, null);
      AV18GridState.setgxTv_SdtWWPGridState_Orderedby( AV36OrderedBy );
      AV18GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV37OrderedDsc );
      AV18GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState12[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFDIARIODEFACTURACION_SDT__FACFCH", "", !(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52TFDiariodeFacturacion_SDT__Facfch))&&GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53TFDiariodeFacturacion_SDT__Facfch_To))), (short)(0), GXutil.trim( localUtil.dtoc( AV52TFDiariodeFacturacion_SDT__Facfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), GXutil.trim( localUtil.dtoc( AV53TFDiariodeFacturacion_SDT__Facfch_To, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))) ;
      AV18GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFDIARIODEFACTURACION_SDT__FACCOD", "", !((0==AV56TFDiariodeFacturacion_SDT__Faccod)&&(0==AV57TFDiariodeFacturacion_SDT__Faccod_To)), (short)(0), GXutil.trim( GXutil.str( AV56TFDiariodeFacturacion_SDT__Faccod, 8, 0)), GXutil.trim( GXutil.str( AV57TFDiariodeFacturacion_SDT__Faccod_To, 8, 0))) ;
      AV18GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFDIARIODEFACTURACION_SDT__CLICOD", "", !((0==AV58TFDiariodeFacturacion_SDT__Clicod)&&(0==AV59TFDiariodeFacturacion_SDT__Clicod_To)), (short)(0), GXutil.trim( GXutil.str( AV58TFDiariodeFacturacion_SDT__Clicod, 6, 0)), GXutil.trim( GXutil.str( AV59TFDiariodeFacturacion_SDT__Clicod_To, 6, 0))) ;
      AV18GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFDIARIODEFACTURACION_SDT__CLINOM", "", !(GXutil.strcmp("", AV60TFDiariodeFacturacion_SDT__CliNom)==0), (short)(0), AV60TFDiariodeFacturacion_SDT__CliNom, "") ;
      AV18GridState = GXv_SdtWWPGridState12[0] ;
      AV18GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV18GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV81Pgmname+"GridState", AV18GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S152( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV40Tot_FacImpTot = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40Tot_FacImpTot", GXutil.ltrimstr( AV40Tot_FacImpTot, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMPTOT", getSecureSignedToken( sPrefix, localUtil.format( AV40Tot_FacImpTot, "ZZZZZZZZZ9.99")));
      AV42Tot_FacImpGen = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Tot_FacImpGen", GXutil.ltrimstr( AV42Tot_FacImpGen, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMPGEN", getSecureSignedToken( sPrefix, localUtil.format( AV42Tot_FacImpGen, "ZZZZZZZ9.99")));
      AV44Tot_FacImpPP = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Tot_FacImpPP", GXutil.ltrimstr( AV44Tot_FacImpPP, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMPPP", getSecureSignedToken( sPrefix, localUtil.format( AV44Tot_FacImpPP, "ZZZZZZZ9.99")));
      AV46Tot_FacBasImp = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46Tot_FacBasImp", GXutil.ltrimstr( AV46Tot_FacBasImp, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACBASIMP", getSecureSignedToken( sPrefix, localUtil.format( AV46Tot_FacBasImp, "ZZZZZZZZZ9.99")));
      AV48Tot_FacIVAImp = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48Tot_FacIVAImp", GXutil.ltrimstr( AV48Tot_FacIVAImp, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIVAIMP", getSecureSignedToken( sPrefix, localUtil.format( AV48Tot_FacIVAImp, "ZZZZZZZ9.99")));
      AV50Tot_FacTot = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50Tot_FacTot", GXutil.ltrimstr( AV50Tot_FacTot, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACTOT", getSecureSignedToken( sPrefix, localUtil.format( AV50Tot_FacTot, "ZZZZZZZZZ9.99")));
   }

   public void S172( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV83GXV13 = 1 ;
      while ( AV83GXV13 <= AV21DiariodeFacturacion_SDT.size() )
      {
         AV39DiariodeFacturacion_SDTItem = (app.facturacion.SdtDiariodeFacturacion_SDT_Item)((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV83GXV13));
         AV40Tot_FacImpTot = AV40Tot_FacImpTot.add((AV39DiariodeFacturacion_SDTItem.getgxTv_SdtDiariodeFacturacion_SDT_Item_Facimptot())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40Tot_FacImpTot", GXutil.ltrimstr( AV40Tot_FacImpTot, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMPTOT", getSecureSignedToken( sPrefix, localUtil.format( AV40Tot_FacImpTot, "ZZZZZZZZZ9.99")));
         AV42Tot_FacImpGen = AV42Tot_FacImpGen.add((AV39DiariodeFacturacion_SDTItem.getgxTv_SdtDiariodeFacturacion_SDT_Item_Facimpgen())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Tot_FacImpGen", GXutil.ltrimstr( AV42Tot_FacImpGen, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMPGEN", getSecureSignedToken( sPrefix, localUtil.format( AV42Tot_FacImpGen, "ZZZZZZZ9.99")));
         AV44Tot_FacImpPP = AV44Tot_FacImpPP.add((AV39DiariodeFacturacion_SDTItem.getgxTv_SdtDiariodeFacturacion_SDT_Item_Facimppp())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Tot_FacImpPP", GXutil.ltrimstr( AV44Tot_FacImpPP, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIMPPP", getSecureSignedToken( sPrefix, localUtil.format( AV44Tot_FacImpPP, "ZZZZZZZ9.99")));
         AV46Tot_FacBasImp = AV46Tot_FacBasImp.add((AV39DiariodeFacturacion_SDTItem.getgxTv_SdtDiariodeFacturacion_SDT_Item_Facbasimp())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46Tot_FacBasImp", GXutil.ltrimstr( AV46Tot_FacBasImp, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACBASIMP", getSecureSignedToken( sPrefix, localUtil.format( AV46Tot_FacBasImp, "ZZZZZZZZZ9.99")));
         AV48Tot_FacIVAImp = AV48Tot_FacIVAImp.add((AV39DiariodeFacturacion_SDTItem.getgxTv_SdtDiariodeFacturacion_SDT_Item_Facivaimp())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48Tot_FacIVAImp", GXutil.ltrimstr( AV48Tot_FacIVAImp, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACIVAIMP", getSecureSignedToken( sPrefix, localUtil.format( AV48Tot_FacIVAImp, "ZZZZZZZ9.99")));
         AV50Tot_FacTot = AV50Tot_FacTot.add((AV39DiariodeFacturacion_SDTItem.getgxTv_SdtDiariodeFacturacion_SDT_Item_Factot())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50Tot_FacTot", GXutil.ltrimstr( AV50Tot_FacTot, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_FACTOT", getSecureSignedToken( sPrefix, localUtil.format( AV50Tot_FacTot, "ZZZZZZZZZ9.99")));
         AV83GXV13 = (int)(AV83GXV13+1) ;
      }
      AV41TotValue_FacImpTot = localUtil.format( AV40Tot_FacImpTot, "ZZZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TotValue_FacImpTot", AV41TotValue_FacImpTot);
      AV43TotValue_FacImpGen = localUtil.format( AV42Tot_FacImpGen, "ZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TotValue_FacImpGen", AV43TotValue_FacImpGen);
      AV45TotValue_FacImpPP = localUtil.format( AV44Tot_FacImpPP, "ZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TotValue_FacImpPP", AV45TotValue_FacImpPP);
      AV47TotValue_FacBasImp = localUtil.format( AV46Tot_FacBasImp, "ZZZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TotValue_FacBasImp", AV47TotValue_FacBasImp);
      AV49TotValue_FacIVAImp = localUtil.format( AV48Tot_FacIVAImp, "ZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TotValue_FacIVAImp", AV49TotValue_FacIVAImp);
      AV51TotValue_FacTot = localUtil.format( AV50Tot_FacTot, "ZZZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TotValue_FacTot", AV51TotValue_FacTot);
   }

   public void e2024U2( )
   {
      AV70GXV1 = (int)(nGXsfl_36_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV70GXV1 > 0 ) && ( AV21DiariodeFacturacion_SDT.size() >= AV70GXV1 ) )
      {
         AV21DiariodeFacturacion_SDT.currentItem( ((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)) );
      }
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      AV65DiariodeFacturacion_json = AV21DiariodeFacturacion_SDT.toJSonString(false) ;
      AV64Websession.setValue(httpContext.getMessage( "DiariodeFacturacion_json", ""), AV65DiariodeFacturacion_json);
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ColumnsSelector", AV26ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21DiariodeFacturacion_SDT", AV21DiariodeFacturacion_SDT);
      nGXsfl_36_bak_idx = nGXsfl_36_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV26ColumnsSelector, AV81Pgmname, AV36OrderedBy, AV37OrderedDsc, AV52TFDiariodeFacturacion_SDT__Facfch, AV53TFDiariodeFacturacion_SDT__Facfch_To, AV56TFDiariodeFacturacion_SDT__Faccod, AV57TFDiariodeFacturacion_SDT__Faccod_To, AV58TFDiariodeFacturacion_SDT__Clicod, AV59TFDiariodeFacturacion_SDT__Clicod_To, AV60TFDiariodeFacturacion_SDT__CliNom, AV7Emprcod, AV5Clicodfrom, AV6Clicodto, AV8Facfchfrom, AV9Facfchto, AV10FacPri, AV11FacSernum, AV12noserie, AV21DiariodeFacturacion_SDT, AV40Tot_FacImpTot, AV42Tot_FacImpGen, AV44Tot_FacImpPP, AV46Tot_FacBasImp, AV48Tot_FacIVAImp, AV50Tot_FacTot, sPrefix) ;
      nGXsfl_36_idx = nGXsfl_36_bak_idx ;
      sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_362( ) ;
   }

   public void e2124U2( )
   {
      AV70GXV1 = (int)(nGXsfl_36_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV70GXV1 > 0 ) && ( AV21DiariodeFacturacion_SDT.size() >= AV70GXV1 ) )
      {
         AV21DiariodeFacturacion_SDT.currentItem( ((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)) );
      }
      /* 'DoUserAction1' Routine */
      returnInSub = false ;
      AV65DiariodeFacturacion_json = AV21DiariodeFacturacion_SDT.toJSonString(false) ;
      AV64Websession.setValue(httpContext.getMessage( "DiariodeFacturacion_json", ""), AV65DiariodeFacturacion_json);
      AV66DiariodeFacturacion_json_GET = AV64Websession.getValue(httpContext.getMessage( "DiariodeFacturacion_json", "")) ;
      AV64Websession.remove(httpContext.getMessage( "DiariodeFacturacion_json", ""));
   }

   public void wb_table2_49_24U2( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_facimptot_Internalname, httpContext.getMessage( "Tot Value_Fac Imp Tot", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_facimptot_Internalname, AV41TotValue_FacImpTot, GXutil.rtrim( localUtil.format( AV41TotValue_FacImpTot, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_facimptot_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_facimptot_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\DiariodeFacturacion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_facimpgen_Internalname, httpContext.getMessage( "Tot Value_Fac Imp Gen", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_facimpgen_Internalname, AV43TotValue_FacImpGen, GXutil.rtrim( localUtil.format( AV43TotValue_FacImpGen, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,60);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_facimpgen_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_facimpgen_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\DiariodeFacturacion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_facimppp_Internalname, httpContext.getMessage( "Tot Value_Fac Imp PP", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_facimppp_Internalname, AV45TotValue_FacImpPP, GXutil.rtrim( localUtil.format( AV45TotValue_FacImpPP, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_facimppp_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_facimppp_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\DiariodeFacturacion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_facbasimp_Internalname, httpContext.getMessage( "Tot Value_Fac Bas Imp", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_facbasimp_Internalname, AV47TotValue_FacBasImp, GXutil.rtrim( localUtil.format( AV47TotValue_FacBasImp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_facbasimp_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_facbasimp_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\DiariodeFacturacion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_facivaimp_Internalname, httpContext.getMessage( "Tot Value_Fac IVAImp", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_facivaimp_Internalname, AV49TotValue_FacIVAImp, GXutil.rtrim( localUtil.format( AV49TotValue_FacIVAImp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_facivaimp_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_facivaimp_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\DiariodeFacturacion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_factot_Internalname, httpContext.getMessage( "Tot Value_Fac Tot", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_factot_Internalname, AV51TotValue_FacTot, GXutil.rtrim( localUtil.format( AV51TotValue_FacTot, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,72);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_factot_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_factot_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\DiariodeFacturacion_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_49_24U2e( true) ;
      }
      else
      {
         wb_table2_49_24U2e( false) ;
      }
   }

   public void wb_table1_23_24U2( boolean wbgen )
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
         wb_table1_23_24U2e( true) ;
      }
      else
      {
         wb_table1_23_24U2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV7Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
      AV5Clicodfrom = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Clicodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Clicodfrom), 6, 0));
      AV6Clicodto = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Clicodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Clicodto), 6, 0));
      AV8Facfchfrom = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Facfchfrom", localUtil.format(AV8Facfchfrom, "99/99/99"));
      AV9Facfchto = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Facfchto", localUtil.format(AV9Facfchto, "99/99/99"));
      AV10FacPri = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10FacPri", AV10FacPri);
      AV11FacSernum = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11FacSernum", AV11FacSernum);
      AV12noserie = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12noserie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12noserie), 4, 0));
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
      pa24U2( ) ;
      ws24U2( ) ;
      we24U2( ) ;
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
      sCtrlAV5Clicodfrom = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV6Clicodto = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV8Facfchfrom = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV9Facfchto = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV10FacPri = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV11FacSernum = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV12noserie = (String)getParm(obj,7,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa24U2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "facturacion\\diariodefacturacion_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa24U2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV7Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
         AV5Clicodfrom = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Clicodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Clicodfrom), 6, 0));
         AV6Clicodto = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Clicodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Clicodto), 6, 0));
         AV8Facfchfrom = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Facfchfrom", localUtil.format(AV8Facfchfrom, "99/99/99"));
         AV9Facfchto = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Facfchto", localUtil.format(AV9Facfchto, "99/99/99"));
         AV10FacPri = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10FacPri", AV10FacPri);
         AV11FacSernum = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11FacSernum", AV11FacSernum);
         AV12noserie = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12noserie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12noserie), 4, 0));
      }
      wcpOAV7Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV7Emprcod") ;
      wcpOAV5Clicodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV5Clicodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV6Clicodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6Clicodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV8Facfchfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV8Facfchfrom"), 0) ;
      wcpOAV9Facfchto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV9Facfchto"), 0) ;
      wcpOAV10FacPri = httpContext.cgiGet( sPrefix+"wcpOAV10FacPri") ;
      wcpOAV11FacSernum = httpContext.cgiGet( sPrefix+"wcpOAV11FacSernum") ;
      wcpOAV12noserie = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV12noserie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV7Emprcod, wcpOAV7Emprcod) != 0 ) || ( AV5Clicodfrom != wcpOAV5Clicodfrom ) || ( AV6Clicodto != wcpOAV6Clicodto ) || !( GXutil.dateCompare(GXutil.resetTime(AV8Facfchfrom), GXutil.resetTime(wcpOAV8Facfchfrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV9Facfchto), GXutil.resetTime(wcpOAV9Facfchto)) ) || ( GXutil.strcmp(AV10FacPri, wcpOAV10FacPri) != 0 ) || ( GXutil.strcmp(AV11FacSernum, wcpOAV11FacSernum) != 0 ) || ( AV12noserie != wcpOAV12noserie ) ) )
      {
         setjustcreated();
      }
      wcpOAV7Emprcod = AV7Emprcod ;
      wcpOAV5Clicodfrom = AV5Clicodfrom ;
      wcpOAV6Clicodto = AV6Clicodto ;
      wcpOAV8Facfchfrom = AV8Facfchfrom ;
      wcpOAV9Facfchto = AV9Facfchto ;
      wcpOAV10FacPri = AV10FacPri ;
      wcpOAV11FacSernum = AV11FacSernum ;
      wcpOAV12noserie = AV12noserie ;
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
      sCtrlAV5Clicodfrom = httpContext.cgiGet( sPrefix+"AV5Clicodfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV5Clicodfrom) > 0 )
      {
         AV5Clicodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV5Clicodfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Clicodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Clicodfrom), 6, 0));
      }
      else
      {
         AV5Clicodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV5Clicodfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV6Clicodto = httpContext.cgiGet( sPrefix+"AV6Clicodto_CTRL") ;
      if ( GXutil.len( sCtrlAV6Clicodto) > 0 )
      {
         AV6Clicodto = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV6Clicodto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Clicodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Clicodto), 6, 0));
      }
      else
      {
         AV6Clicodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV6Clicodto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV8Facfchfrom = httpContext.cgiGet( sPrefix+"AV8Facfchfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV8Facfchfrom) > 0 )
      {
         AV8Facfchfrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV8Facfchfrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Facfchfrom", localUtil.format(AV8Facfchfrom, "99/99/99"));
      }
      else
      {
         AV8Facfchfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV8Facfchfrom_PARM"), 0) ;
      }
      sCtrlAV9Facfchto = httpContext.cgiGet( sPrefix+"AV9Facfchto_CTRL") ;
      if ( GXutil.len( sCtrlAV9Facfchto) > 0 )
      {
         AV9Facfchto = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV9Facfchto), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Facfchto", localUtil.format(AV9Facfchto, "99/99/99"));
      }
      else
      {
         AV9Facfchto = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV9Facfchto_PARM"), 0) ;
      }
      sCtrlAV10FacPri = httpContext.cgiGet( sPrefix+"AV10FacPri_CTRL") ;
      if ( GXutil.len( sCtrlAV10FacPri) > 0 )
      {
         AV10FacPri = httpContext.cgiGet( sCtrlAV10FacPri) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10FacPri", AV10FacPri);
      }
      else
      {
         AV10FacPri = httpContext.cgiGet( sPrefix+"AV10FacPri_PARM") ;
      }
      sCtrlAV11FacSernum = httpContext.cgiGet( sPrefix+"AV11FacSernum_CTRL") ;
      if ( GXutil.len( sCtrlAV11FacSernum) > 0 )
      {
         AV11FacSernum = httpContext.cgiGet( sCtrlAV11FacSernum) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11FacSernum", AV11FacSernum);
      }
      else
      {
         AV11FacSernum = httpContext.cgiGet( sPrefix+"AV11FacSernum_PARM") ;
      }
      sCtrlAV12noserie = httpContext.cgiGet( sPrefix+"AV12noserie_CTRL") ;
      if ( GXutil.len( sCtrlAV12noserie) > 0 )
      {
         AV12noserie = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV12noserie), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12noserie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12noserie), 4, 0));
      }
      else
      {
         AV12noserie = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV12noserie_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa24U2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws24U2( ) ;
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
      ws24U2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Clicodfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV5Clicodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5Clicodfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Clicodfrom_CTRL", GXutil.rtrim( sCtrlAV5Clicodfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Clicodto_PARM", GXutil.ltrim( localUtil.ntoc( AV6Clicodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6Clicodto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Clicodto_CTRL", GXutil.rtrim( sCtrlAV6Clicodto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Facfchfrom_PARM", localUtil.dtoc( AV8Facfchfrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8Facfchfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Facfchfrom_CTRL", GXutil.rtrim( sCtrlAV8Facfchfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9Facfchto_PARM", localUtil.dtoc( AV9Facfchto, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9Facfchto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9Facfchto_CTRL", GXutil.rtrim( sCtrlAV9Facfchto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10FacPri_PARM", GXutil.rtrim( AV10FacPri));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10FacPri)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10FacPri_CTRL", GXutil.rtrim( sCtrlAV10FacPri));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11FacSernum_PARM", GXutil.rtrim( AV11FacSernum));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11FacSernum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11FacSernum_CTRL", GXutil.rtrim( sCtrlAV11FacSernum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12noserie_PARM", GXutil.ltrim( localUtil.ntoc( AV12noserie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV12noserie)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12noserie_CTRL", GXutil.rtrim( sCtrlAV12noserie));
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
      we24U2( ) ;
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
      httpContext.AddStyleSheetFile("GXProgressIndicator/css/bootstrap-progressbar-3.0.1.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115552775", true, true);
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
      httpContext.AddJavascriptSource("facturacion/diariodefacturacion_wc.js", "?202682115552775", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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

   public void subsflControlProps_362( )
   {
      edtavDiariodefacturacion_sdt__facfch_Internalname = sPrefix+"DIARIODEFACTURACION_SDT__FACFCH_"+sGXsfl_36_idx ;
      edtavDiariodefacturacion_sdt__faccod_Internalname = sPrefix+"DIARIODEFACTURACION_SDT__FACCOD_"+sGXsfl_36_idx ;
      edtavDiariodefacturacion_sdt__clicod_Internalname = sPrefix+"DIARIODEFACTURACION_SDT__CLICOD_"+sGXsfl_36_idx ;
      edtavDiariodefacturacion_sdt__clinom_Internalname = sPrefix+"DIARIODEFACTURACION_SDT__CLINOM_"+sGXsfl_36_idx ;
      edtavDiariodefacturacion_sdt__facimptot_Internalname = sPrefix+"DIARIODEFACTURACION_SDT__FACIMPTOT_"+sGXsfl_36_idx ;
      edtavDiariodefacturacion_sdt__facimpgen_Internalname = sPrefix+"DIARIODEFACTURACION_SDT__FACIMPGEN_"+sGXsfl_36_idx ;
      edtavDiariodefacturacion_sdt__facimppp_Internalname = sPrefix+"DIARIODEFACTURACION_SDT__FACIMPPP_"+sGXsfl_36_idx ;
      edtavDiariodefacturacion_sdt__facbasimp_Internalname = sPrefix+"DIARIODEFACTURACION_SDT__FACBASIMP_"+sGXsfl_36_idx ;
      edtavDiariodefacturacion_sdt__facivaimp_Internalname = sPrefix+"DIARIODEFACTURACION_SDT__FACIVAIMP_"+sGXsfl_36_idx ;
      edtavDiariodefacturacion_sdt__factot_Internalname = sPrefix+"DIARIODEFACTURACION_SDT__FACTOT_"+sGXsfl_36_idx ;
   }

   public void subsflControlProps_fel_362( )
   {
      edtavDiariodefacturacion_sdt__facfch_Internalname = sPrefix+"DIARIODEFACTURACION_SDT__FACFCH_"+sGXsfl_36_fel_idx ;
      edtavDiariodefacturacion_sdt__faccod_Internalname = sPrefix+"DIARIODEFACTURACION_SDT__FACCOD_"+sGXsfl_36_fel_idx ;
      edtavDiariodefacturacion_sdt__clicod_Internalname = sPrefix+"DIARIODEFACTURACION_SDT__CLICOD_"+sGXsfl_36_fel_idx ;
      edtavDiariodefacturacion_sdt__clinom_Internalname = sPrefix+"DIARIODEFACTURACION_SDT__CLINOM_"+sGXsfl_36_fel_idx ;
      edtavDiariodefacturacion_sdt__facimptot_Internalname = sPrefix+"DIARIODEFACTURACION_SDT__FACIMPTOT_"+sGXsfl_36_fel_idx ;
      edtavDiariodefacturacion_sdt__facimpgen_Internalname = sPrefix+"DIARIODEFACTURACION_SDT__FACIMPGEN_"+sGXsfl_36_fel_idx ;
      edtavDiariodefacturacion_sdt__facimppp_Internalname = sPrefix+"DIARIODEFACTURACION_SDT__FACIMPPP_"+sGXsfl_36_fel_idx ;
      edtavDiariodefacturacion_sdt__facbasimp_Internalname = sPrefix+"DIARIODEFACTURACION_SDT__FACBASIMP_"+sGXsfl_36_fel_idx ;
      edtavDiariodefacturacion_sdt__facivaimp_Internalname = sPrefix+"DIARIODEFACTURACION_SDT__FACIVAIMP_"+sGXsfl_36_fel_idx ;
      edtavDiariodefacturacion_sdt__factot_Internalname = sPrefix+"DIARIODEFACTURACION_SDT__FACTOT_"+sGXsfl_36_fel_idx ;
   }

   public void sendrow_362( )
   {
      subsflControlProps_362( ) ;
      wb24U0( ) ;
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDiariodefacturacion_sdt__facfch_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDiariodefacturacion_sdt__facfch_Internalname,localUtil.format(((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)).getgxTv_SdtDiariodeFacturacion_SDT_Item_Facfch(), "99/99/99"),localUtil.format( ((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)).getgxTv_SdtDiariodeFacturacion_SDT_Item_Facfch(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDiariodefacturacion_sdt__facfch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDiariodefacturacion_sdt__facfch_Visible),Integer.valueOf(edtavDiariodefacturacion_sdt__facfch_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDiariodefacturacion_sdt__faccod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDiariodefacturacion_sdt__faccod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)).getgxTv_SdtDiariodeFacturacion_SDT_Item_Faccod(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDiariodefacturacion_sdt__faccod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)).getgxTv_SdtDiariodeFacturacion_SDT_Item_Faccod()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)).getgxTv_SdtDiariodeFacturacion_SDT_Item_Faccod()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDiariodefacturacion_sdt__faccod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDiariodefacturacion_sdt__faccod_Visible),Integer.valueOf(edtavDiariodefacturacion_sdt__faccod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDiariodefacturacion_sdt__clicod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDiariodefacturacion_sdt__clicod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)).getgxTv_SdtDiariodeFacturacion_SDT_Item_Clicod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDiariodefacturacion_sdt__clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)).getgxTv_SdtDiariodeFacturacion_SDT_Item_Clicod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)).getgxTv_SdtDiariodeFacturacion_SDT_Item_Clicod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDiariodefacturacion_sdt__clicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDiariodefacturacion_sdt__clicod_Visible),Integer.valueOf(edtavDiariodefacturacion_sdt__clicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavDiariodefacturacion_sdt__clinom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDiariodefacturacion_sdt__clinom_Internalname,GXutil.rtrim( ((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)).getgxTv_SdtDiariodeFacturacion_SDT_Item_Clinom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDiariodefacturacion_sdt__clinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDiariodefacturacion_sdt__clinom_Visible),Integer.valueOf(edtavDiariodefacturacion_sdt__clinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDiariodefacturacion_sdt__facimptot_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDiariodefacturacion_sdt__facimptot_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)).getgxTv_SdtDiariodeFacturacion_SDT_Item_Facimptot(), (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDiariodefacturacion_sdt__facimptot_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)).getgxTv_SdtDiariodeFacturacion_SDT_Item_Facimptot(), "ZZZZZZZZZ9.99") : localUtil.format( ((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)).getgxTv_SdtDiariodeFacturacion_SDT_Item_Facimptot(), "ZZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDiariodefacturacion_sdt__facimptot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDiariodefacturacion_sdt__facimptot_Visible),Integer.valueOf(edtavDiariodefacturacion_sdt__facimptot_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDiariodefacturacion_sdt__facimpgen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDiariodefacturacion_sdt__facimpgen_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)).getgxTv_SdtDiariodeFacturacion_SDT_Item_Facimpgen(), (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDiariodefacturacion_sdt__facimpgen_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)).getgxTv_SdtDiariodeFacturacion_SDT_Item_Facimpgen(), "ZZZZZZZ9.99") : localUtil.format( ((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)).getgxTv_SdtDiariodeFacturacion_SDT_Item_Facimpgen(), "ZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDiariodefacturacion_sdt__facimpgen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDiariodefacturacion_sdt__facimpgen_Visible),Integer.valueOf(edtavDiariodefacturacion_sdt__facimpgen_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDiariodefacturacion_sdt__facimppp_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDiariodefacturacion_sdt__facimppp_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)).getgxTv_SdtDiariodeFacturacion_SDT_Item_Facimppp(), (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDiariodefacturacion_sdt__facimppp_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)).getgxTv_SdtDiariodeFacturacion_SDT_Item_Facimppp(), "ZZZZZZZ9.99") : localUtil.format( ((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)).getgxTv_SdtDiariodeFacturacion_SDT_Item_Facimppp(), "ZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDiariodefacturacion_sdt__facimppp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDiariodefacturacion_sdt__facimppp_Visible),Integer.valueOf(edtavDiariodefacturacion_sdt__facimppp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDiariodefacturacion_sdt__facbasimp_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDiariodefacturacion_sdt__facbasimp_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)).getgxTv_SdtDiariodeFacturacion_SDT_Item_Facbasimp(), (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDiariodefacturacion_sdt__facbasimp_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)).getgxTv_SdtDiariodeFacturacion_SDT_Item_Facbasimp(), "ZZZZZZZZZ9.99") : localUtil.format( ((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)).getgxTv_SdtDiariodeFacturacion_SDT_Item_Facbasimp(), "ZZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDiariodefacturacion_sdt__facbasimp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDiariodefacturacion_sdt__facbasimp_Visible),Integer.valueOf(edtavDiariodefacturacion_sdt__facbasimp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDiariodefacturacion_sdt__facivaimp_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDiariodefacturacion_sdt__facivaimp_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)).getgxTv_SdtDiariodeFacturacion_SDT_Item_Facivaimp(), (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDiariodefacturacion_sdt__facivaimp_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)).getgxTv_SdtDiariodeFacturacion_SDT_Item_Facivaimp(), "ZZZZZZZ9.99") : localUtil.format( ((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)).getgxTv_SdtDiariodeFacturacion_SDT_Item_Facivaimp(), "ZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDiariodefacturacion_sdt__facivaimp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDiariodefacturacion_sdt__facivaimp_Visible),Integer.valueOf(edtavDiariodefacturacion_sdt__facivaimp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDiariodefacturacion_sdt__factot_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDiariodefacturacion_sdt__factot_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)).getgxTv_SdtDiariodeFacturacion_SDT_Item_Factot(), (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDiariodefacturacion_sdt__factot_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)).getgxTv_SdtDiariodeFacturacion_SDT_Item_Factot(), "ZZZZZZZZZ9.99") : localUtil.format( ((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV21DiariodeFacturacion_SDT.elementAt(-1+AV70GXV1)).getgxTv_SdtDiariodeFacturacion_SDT_Item_Factot(), "ZZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDiariodefacturacion_sdt__factot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDiariodefacturacion_sdt__factot_Visible),Integer.valueOf(edtavDiariodefacturacion_sdt__factot_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes24U2( ) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDiariodefacturacion_sdt__facfch_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDiariodefacturacion_sdt__faccod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Factura", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDiariodefacturacion_sdt__clicod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDiariodefacturacion_sdt__clinom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDiariodefacturacion_sdt__facimptot_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Total Bruto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDiariodefacturacion_sdt__facimpgen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Imp. Dto. Gral.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDiariodefacturacion_sdt__facimppp_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Imp. Dto. PP.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDiariodefacturacion_sdt__facbasimp_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Base Imponible", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDiariodefacturacion_sdt__facivaimp_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Imp. IVA", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDiariodefacturacion_sdt__factot_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Total", "")) ;
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
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_sdt__facfch_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_sdt__facfch_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_sdt__faccod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_sdt__faccod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_sdt__clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_sdt__clicod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_sdt__clinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_sdt__clinom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_sdt__facimptot_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_sdt__facimptot_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_sdt__facimpgen_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_sdt__facimpgen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_sdt__facimppp_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_sdt__facimppp_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_sdt__facbasimp_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_sdt__facbasimp_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_sdt__facivaimp_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_sdt__facivaimp_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_sdt__factot_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDiariodefacturacion_sdt__factot_Visible, (byte)(5), (byte)(0), ".", "")));
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
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      Barradeprogreso_Internalname = sPrefix+"BARRADEPROGRESO" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtavDiariodefacturacion_sdt__facfch_Internalname = sPrefix+"DIARIODEFACTURACION_SDT__FACFCH" ;
      edtavDiariodefacturacion_sdt__faccod_Internalname = sPrefix+"DIARIODEFACTURACION_SDT__FACCOD" ;
      edtavDiariodefacturacion_sdt__clicod_Internalname = sPrefix+"DIARIODEFACTURACION_SDT__CLICOD" ;
      edtavDiariodefacturacion_sdt__clinom_Internalname = sPrefix+"DIARIODEFACTURACION_SDT__CLINOM" ;
      edtavDiariodefacturacion_sdt__facimptot_Internalname = sPrefix+"DIARIODEFACTURACION_SDT__FACIMPTOT" ;
      edtavDiariodefacturacion_sdt__facimpgen_Internalname = sPrefix+"DIARIODEFACTURACION_SDT__FACIMPGEN" ;
      edtavDiariodefacturacion_sdt__facimppp_Internalname = sPrefix+"DIARIODEFACTURACION_SDT__FACIMPPP" ;
      edtavDiariodefacturacion_sdt__facbasimp_Internalname = sPrefix+"DIARIODEFACTURACION_SDT__FACBASIMP" ;
      edtavDiariodefacturacion_sdt__facivaimp_Internalname = sPrefix+"DIARIODEFACTURACION_SDT__FACIVAIMP" ;
      edtavDiariodefacturacion_sdt__factot_Internalname = sPrefix+"DIARIODEFACTURACION_SDT__FACTOT" ;
      edtavTotvalue_facimptot_Internalname = sPrefix+"vTOTVALUE_FACIMPTOT" ;
      edtavTotvalue_facimpgen_Internalname = sPrefix+"vTOTVALUE_FACIMPGEN" ;
      edtavTotvalue_facimppp_Internalname = sPrefix+"vTOTVALUE_FACIMPPP" ;
      edtavTotvalue_facbasimp_Internalname = sPrefix+"vTOTVALUE_FACBASIMP" ;
      edtavTotvalue_facivaimp_Internalname = sPrefix+"vTOTVALUE_FACIVAIMP" ;
      edtavTotvalue_factot_Internalname = sPrefix+"vTOTVALUE_FACTOT" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_diariodefacturacion_sdt__facfchauxdate_Internalname = sPrefix+"vDDO_DIARIODEFACTURACION_SDT__FACFCHAUXDATE" ;
      edtavDdo_diariodefacturacion_sdt__facfchauxdateto_Internalname = sPrefix+"vDDO_DIARIODEFACTURACION_SDT__FACFCHAUXDATETO" ;
      divDdo_diariodefacturacion_sdt__facfchauxdates_Internalname = sPrefix+"DDO_DIARIODEFACTURACION_SDT__FACFCHAUXDATES" ;
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
      edtavDiariodefacturacion_sdt__factot_Jsonclick = "" ;
      edtavDiariodefacturacion_sdt__factot_Enabled = 0 ;
      edtavDiariodefacturacion_sdt__factot_Visible = -1 ;
      edtavDiariodefacturacion_sdt__facivaimp_Jsonclick = "" ;
      edtavDiariodefacturacion_sdt__facivaimp_Enabled = 0 ;
      edtavDiariodefacturacion_sdt__facivaimp_Visible = -1 ;
      edtavDiariodefacturacion_sdt__facbasimp_Jsonclick = "" ;
      edtavDiariodefacturacion_sdt__facbasimp_Enabled = 0 ;
      edtavDiariodefacturacion_sdt__facbasimp_Visible = -1 ;
      edtavDiariodefacturacion_sdt__facimppp_Jsonclick = "" ;
      edtavDiariodefacturacion_sdt__facimppp_Enabled = 0 ;
      edtavDiariodefacturacion_sdt__facimppp_Visible = -1 ;
      edtavDiariodefacturacion_sdt__facimpgen_Jsonclick = "" ;
      edtavDiariodefacturacion_sdt__facimpgen_Enabled = 0 ;
      edtavDiariodefacturacion_sdt__facimpgen_Visible = -1 ;
      edtavDiariodefacturacion_sdt__facimptot_Jsonclick = "" ;
      edtavDiariodefacturacion_sdt__facimptot_Enabled = 0 ;
      edtavDiariodefacturacion_sdt__facimptot_Visible = -1 ;
      edtavDiariodefacturacion_sdt__clinom_Jsonclick = "" ;
      edtavDiariodefacturacion_sdt__clinom_Enabled = 0 ;
      edtavDiariodefacturacion_sdt__clinom_Visible = -1 ;
      edtavDiariodefacturacion_sdt__clicod_Jsonclick = "" ;
      edtavDiariodefacturacion_sdt__clicod_Enabled = 0 ;
      edtavDiariodefacturacion_sdt__clicod_Visible = -1 ;
      edtavDiariodefacturacion_sdt__faccod_Jsonclick = "" ;
      edtavDiariodefacturacion_sdt__faccod_Enabled = 0 ;
      edtavDiariodefacturacion_sdt__faccod_Visible = -1 ;
      edtavDiariodefacturacion_sdt__facfch_Jsonclick = "" ;
      edtavDiariodefacturacion_sdt__facfch_Enabled = 0 ;
      edtavDiariodefacturacion_sdt__facfch_Visible = -1 ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvalue_factot_Jsonclick = "" ;
      edtavTotvalue_factot_Enabled = 1 ;
      edtavTotvalue_facivaimp_Jsonclick = "" ;
      edtavTotvalue_facivaimp_Enabled = 1 ;
      edtavTotvalue_facbasimp_Jsonclick = "" ;
      edtavTotvalue_facbasimp_Enabled = 1 ;
      edtavTotvalue_facimppp_Jsonclick = "" ;
      edtavTotvalue_facimppp_Enabled = 1 ;
      edtavTotvalue_facimpgen_Jsonclick = "" ;
      edtavTotvalue_facimpgen_Enabled = 1 ;
      edtavTotvalue_facimptot_Jsonclick = "" ;
      edtavTotvalue_facimptot_Enabled = 1 ;
      edtavDiariodefacturacion_sdt__factot_Visible = -1 ;
      edtavDiariodefacturacion_sdt__facivaimp_Visible = -1 ;
      edtavDiariodefacturacion_sdt__facbasimp_Visible = -1 ;
      edtavDiariodefacturacion_sdt__facimppp_Visible = -1 ;
      edtavDiariodefacturacion_sdt__facimpgen_Visible = -1 ;
      edtavDiariodefacturacion_sdt__facimptot_Visible = -1 ;
      edtavDiariodefacturacion_sdt__clinom_Visible = -1 ;
      edtavDiariodefacturacion_sdt__clicod_Visible = -1 ;
      edtavDiariodefacturacion_sdt__faccod_Visible = -1 ;
      edtavDiariodefacturacion_sdt__facfch_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDiariodefacturacion_sdt__factot_Enabled = -1 ;
      edtavDiariodefacturacion_sdt__facivaimp_Enabled = -1 ;
      edtavDiariodefacturacion_sdt__facbasimp_Enabled = -1 ;
      edtavDiariodefacturacion_sdt__facimppp_Enabled = -1 ;
      edtavDiariodefacturacion_sdt__facimpgen_Enabled = -1 ;
      edtavDiariodefacturacion_sdt__facimptot_Enabled = -1 ;
      edtavDiariodefacturacion_sdt__clinom_Enabled = -1 ;
      edtavDiariodefacturacion_sdt__clicod_Enabled = -1 ;
      edtavDiariodefacturacion_sdt__faccod_Enabled = -1 ;
      edtavDiariodefacturacion_sdt__facfch_Enabled = -1 ;
      edtavDdo_diariodefacturacion_sdt__facfchauxdateto_Jsonclick = "" ;
      edtavDdo_diariodefacturacion_sdt__facfchauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Filterisrange = "T|T|T|||||||" ;
      Ddo_grid_Filtertype = "Date|Numeric|Numeric|Character||||||" ;
      Ddo_grid_Includefilter = "T|T|T|T||||||" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T||||||" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4||||||" ;
      Ddo_grid_Columnids = "0:DiariodeFacturacion_SDT__Facfch|1:DiariodeFacturacion_SDT__Faccod|2:DiariodeFacturacion_SDT__Clicod|3:DiariodeFacturacion_SDT__CliNom|4:DiariodeFacturacion_SDT__FacImpTot|5:DiariodeFacturacion_SDT__FacImpGen|6:DiariodeFacturacion_SDT__FacImpPP|7:DiariodeFacturacion_SDT__FacBasImp|8:DiariodeFacturacion_SDT__FacIVAImp|9:DiariodeFacturacion_SDT__FacTot" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV81Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TFDiariodeFacturacion_SDT__Facfch',fld:'vTFDIARIODEFACTURACION_SDT__FACFCH',pic:''},{av:'AV53TFDiariodeFacturacion_SDT__Facfch_To',fld:'vTFDIARIODEFACTURACION_SDT__FACFCH_TO',pic:''},{av:'AV56TFDiariodeFacturacion_SDT__Faccod',fld:'vTFDIARIODEFACTURACION_SDT__FACCOD',pic:'ZZZZZZZ9'},{av:'AV57TFDiariodeFacturacion_SDT__Faccod_To',fld:'vTFDIARIODEFACTURACION_SDT__FACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV58TFDiariodeFacturacion_SDT__Clicod',fld:'vTFDIARIODEFACTURACION_SDT__CLICOD',pic:'ZZZZZ9'},{av:'AV59TFDiariodeFacturacion_SDT__Clicod_To',fld:'vTFDIARIODEFACTURACION_SDT__CLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFDiariodeFacturacion_SDT__CliNom',fld:'vTFDIARIODEFACTURACION_SDT__CLINOM',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV6Clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV8Facfchfrom',fld:'vFACFCHFROM',pic:''},{av:'AV9Facfchto',fld:'vFACFCHTO',pic:''},{av:'AV10FacPri',fld:'vFACPRI',pic:'9'},{av:'AV11FacSernum',fld:'vFACSERNUM',pic:''},{av:'AV12noserie',fld:'vNOSERIE',pic:'ZZZ9'},{av:'AV21DiariodeFacturacion_SDT',fld:'vDIARIODEFACTURACION_SDT',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{av:'AV40Tot_FacImpTot',fld:'vTOT_FACIMPTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV42Tot_FacImpGen',fld:'vTOT_FACIMPGEN',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV44Tot_FacImpPP',fld:'vTOT_FACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV46Tot_FacBasImp',fld:'vTOT_FACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV48Tot_FacIVAImp',fld:'vTOT_FACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV50Tot_FacTot',fld:'vTOT_FACTOT',pic:'ZZZZZZZZZ9.99',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'DIARIODEFACTURACION_SDT__FACFCH',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_SDT__FACCOD',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_SDT__CLICOD',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_SDT__CLINOM',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_SDT__FACIMPTOT',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_SDT__FACIMPGEN',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_SDT__FACIMPPP',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_SDT__FACBASIMP',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_SDT__FACIVAIMP',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_SDT__FACTOT',prop:'Visible'},{av:'AV34GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV35GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV40Tot_FacImpTot',fld:'vTOT_FACIMPTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV42Tot_FacImpGen',fld:'vTOT_FACIMPGEN',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV44Tot_FacImpPP',fld:'vTOT_FACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV46Tot_FacBasImp',fld:'vTOT_FACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV48Tot_FacIVAImp',fld:'vTOT_FACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV50Tot_FacTot',fld:'vTOT_FACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV21DiariodeFacturacion_SDT',fld:'vDIARIODEFACTURACION_SDT',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{av:'AV41TotValue_FacImpTot',fld:'vTOTVALUE_FACIMPTOT',pic:''},{av:'AV43TotValue_FacImpGen',fld:'vTOTVALUE_FACIMPGEN',pic:''},{av:'AV45TotValue_FacImpPP',fld:'vTOTVALUE_FACIMPPP',pic:''},{av:'AV47TotValue_FacBasImp',fld:'vTOTVALUE_FACBASIMP',pic:''},{av:'AV49TotValue_FacIVAImp',fld:'vTOTVALUE_FACIVAIMP',pic:''},{av:'AV51TotValue_FacTot',fld:'vTOTVALUE_FACTOT',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1124U2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV81Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TFDiariodeFacturacion_SDT__Facfch',fld:'vTFDIARIODEFACTURACION_SDT__FACFCH',pic:''},{av:'AV53TFDiariodeFacturacion_SDT__Facfch_To',fld:'vTFDIARIODEFACTURACION_SDT__FACFCH_TO',pic:''},{av:'AV56TFDiariodeFacturacion_SDT__Faccod',fld:'vTFDIARIODEFACTURACION_SDT__FACCOD',pic:'ZZZZZZZ9'},{av:'AV57TFDiariodeFacturacion_SDT__Faccod_To',fld:'vTFDIARIODEFACTURACION_SDT__FACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV58TFDiariodeFacturacion_SDT__Clicod',fld:'vTFDIARIODEFACTURACION_SDT__CLICOD',pic:'ZZZZZ9'},{av:'AV59TFDiariodeFacturacion_SDT__Clicod_To',fld:'vTFDIARIODEFACTURACION_SDT__CLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFDiariodeFacturacion_SDT__CliNom',fld:'vTFDIARIODEFACTURACION_SDT__CLINOM',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV6Clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV8Facfchfrom',fld:'vFACFCHFROM',pic:''},{av:'AV9Facfchto',fld:'vFACFCHTO',pic:''},{av:'AV10FacPri',fld:'vFACPRI',pic:'9'},{av:'AV11FacSernum',fld:'vFACSERNUM',pic:''},{av:'AV12noserie',fld:'vNOSERIE',pic:'ZZZ9'},{av:'AV21DiariodeFacturacion_SDT',fld:'vDIARIODEFACTURACION_SDT',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{av:'AV40Tot_FacImpTot',fld:'vTOT_FACIMPTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV42Tot_FacImpGen',fld:'vTOT_FACIMPGEN',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV44Tot_FacImpPP',fld:'vTOT_FACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV46Tot_FacBasImp',fld:'vTOT_FACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV48Tot_FacIVAImp',fld:'vTOT_FACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV50Tot_FacTot',fld:'vTOT_FACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1224U2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV81Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TFDiariodeFacturacion_SDT__Facfch',fld:'vTFDIARIODEFACTURACION_SDT__FACFCH',pic:''},{av:'AV53TFDiariodeFacturacion_SDT__Facfch_To',fld:'vTFDIARIODEFACTURACION_SDT__FACFCH_TO',pic:''},{av:'AV56TFDiariodeFacturacion_SDT__Faccod',fld:'vTFDIARIODEFACTURACION_SDT__FACCOD',pic:'ZZZZZZZ9'},{av:'AV57TFDiariodeFacturacion_SDT__Faccod_To',fld:'vTFDIARIODEFACTURACION_SDT__FACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV58TFDiariodeFacturacion_SDT__Clicod',fld:'vTFDIARIODEFACTURACION_SDT__CLICOD',pic:'ZZZZZ9'},{av:'AV59TFDiariodeFacturacion_SDT__Clicod_To',fld:'vTFDIARIODEFACTURACION_SDT__CLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFDiariodeFacturacion_SDT__CliNom',fld:'vTFDIARIODEFACTURACION_SDT__CLINOM',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV6Clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV8Facfchfrom',fld:'vFACFCHFROM',pic:''},{av:'AV9Facfchto',fld:'vFACFCHTO',pic:''},{av:'AV10FacPri',fld:'vFACPRI',pic:'9'},{av:'AV11FacSernum',fld:'vFACSERNUM',pic:''},{av:'AV12noserie',fld:'vNOSERIE',pic:'ZZZ9'},{av:'AV21DiariodeFacturacion_SDT',fld:'vDIARIODEFACTURACION_SDT',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{av:'AV40Tot_FacImpTot',fld:'vTOT_FACIMPTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV42Tot_FacImpGen',fld:'vTOT_FACIMPGEN',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV44Tot_FacImpPP',fld:'vTOT_FACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV46Tot_FacBasImp',fld:'vTOT_FACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV48Tot_FacIVAImp',fld:'vTOT_FACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV50Tot_FacTot',fld:'vTOT_FACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1324U2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV81Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TFDiariodeFacturacion_SDT__Facfch',fld:'vTFDIARIODEFACTURACION_SDT__FACFCH',pic:''},{av:'AV53TFDiariodeFacturacion_SDT__Facfch_To',fld:'vTFDIARIODEFACTURACION_SDT__FACFCH_TO',pic:''},{av:'AV56TFDiariodeFacturacion_SDT__Faccod',fld:'vTFDIARIODEFACTURACION_SDT__FACCOD',pic:'ZZZZZZZ9'},{av:'AV57TFDiariodeFacturacion_SDT__Faccod_To',fld:'vTFDIARIODEFACTURACION_SDT__FACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV58TFDiariodeFacturacion_SDT__Clicod',fld:'vTFDIARIODEFACTURACION_SDT__CLICOD',pic:'ZZZZZ9'},{av:'AV59TFDiariodeFacturacion_SDT__Clicod_To',fld:'vTFDIARIODEFACTURACION_SDT__CLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFDiariodeFacturacion_SDT__CliNom',fld:'vTFDIARIODEFACTURACION_SDT__CLINOM',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV6Clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV8Facfchfrom',fld:'vFACFCHFROM',pic:''},{av:'AV9Facfchto',fld:'vFACFCHTO',pic:''},{av:'AV10FacPri',fld:'vFACPRI',pic:'9'},{av:'AV11FacSernum',fld:'vFACSERNUM',pic:''},{av:'AV12noserie',fld:'vNOSERIE',pic:'ZZZ9'},{av:'AV21DiariodeFacturacion_SDT',fld:'vDIARIODEFACTURACION_SDT',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{av:'AV40Tot_FacImpTot',fld:'vTOT_FACIMPTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV42Tot_FacImpGen',fld:'vTOT_FACIMPGEN',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV44Tot_FacImpPP',fld:'vTOT_FACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV46Tot_FacBasImp',fld:'vTOT_FACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV48Tot_FacIVAImp',fld:'vTOT_FACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV50Tot_FacTot',fld:'vTOT_FACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TFDiariodeFacturacion_SDT__Facfch',fld:'vTFDIARIODEFACTURACION_SDT__FACFCH',pic:''},{av:'AV53TFDiariodeFacturacion_SDT__Facfch_To',fld:'vTFDIARIODEFACTURACION_SDT__FACFCH_TO',pic:''},{av:'AV56TFDiariodeFacturacion_SDT__Faccod',fld:'vTFDIARIODEFACTURACION_SDT__FACCOD',pic:'ZZZZZZZ9'},{av:'AV57TFDiariodeFacturacion_SDT__Faccod_To',fld:'vTFDIARIODEFACTURACION_SDT__FACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV58TFDiariodeFacturacion_SDT__Clicod',fld:'vTFDIARIODEFACTURACION_SDT__CLICOD',pic:'ZZZZZ9'},{av:'AV59TFDiariodeFacturacion_SDT__Clicod_To',fld:'vTFDIARIODEFACTURACION_SDT__CLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFDiariodeFacturacion_SDT__CliNom',fld:'vTFDIARIODEFACTURACION_SDT__CLINOM',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e1924U2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1424U2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV81Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TFDiariodeFacturacion_SDT__Facfch',fld:'vTFDIARIODEFACTURACION_SDT__FACFCH',pic:''},{av:'AV53TFDiariodeFacturacion_SDT__Facfch_To',fld:'vTFDIARIODEFACTURACION_SDT__FACFCH_TO',pic:''},{av:'AV56TFDiariodeFacturacion_SDT__Faccod',fld:'vTFDIARIODEFACTURACION_SDT__FACCOD',pic:'ZZZZZZZ9'},{av:'AV57TFDiariodeFacturacion_SDT__Faccod_To',fld:'vTFDIARIODEFACTURACION_SDT__FACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV58TFDiariodeFacturacion_SDT__Clicod',fld:'vTFDIARIODEFACTURACION_SDT__CLICOD',pic:'ZZZZZ9'},{av:'AV59TFDiariodeFacturacion_SDT__Clicod_To',fld:'vTFDIARIODEFACTURACION_SDT__CLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFDiariodeFacturacion_SDT__CliNom',fld:'vTFDIARIODEFACTURACION_SDT__CLINOM',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV6Clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV8Facfchfrom',fld:'vFACFCHFROM',pic:''},{av:'AV9Facfchto',fld:'vFACFCHTO',pic:''},{av:'AV10FacPri',fld:'vFACPRI',pic:'9'},{av:'AV11FacSernum',fld:'vFACSERNUM',pic:''},{av:'AV12noserie',fld:'vNOSERIE',pic:'ZZZ9'},{av:'AV21DiariodeFacturacion_SDT',fld:'vDIARIODEFACTURACION_SDT',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{av:'AV40Tot_FacImpTot',fld:'vTOT_FACIMPTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV42Tot_FacImpGen',fld:'vTOT_FACIMPGEN',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV44Tot_FacImpPP',fld:'vTOT_FACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV46Tot_FacBasImp',fld:'vTOT_FACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV48Tot_FacIVAImp',fld:'vTOT_FACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV50Tot_FacTot',fld:'vTOT_FACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'DIARIODEFACTURACION_SDT__FACFCH',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_SDT__FACCOD',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_SDT__CLICOD',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_SDT__CLINOM',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_SDT__FACIMPTOT',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_SDT__FACIMPGEN',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_SDT__FACIMPPP',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_SDT__FACBASIMP',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_SDT__FACIVAIMP',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_SDT__FACTOT',prop:'Visible'},{av:'AV34GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV35GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV40Tot_FacImpTot',fld:'vTOT_FACIMPTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV42Tot_FacImpGen',fld:'vTOT_FACIMPGEN',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV44Tot_FacImpPP',fld:'vTOT_FACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV46Tot_FacBasImp',fld:'vTOT_FACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV48Tot_FacIVAImp',fld:'vTOT_FACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV50Tot_FacTot',fld:'vTOT_FACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV21DiariodeFacturacion_SDT',fld:'vDIARIODEFACTURACION_SDT',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{av:'AV41TotValue_FacImpTot',fld:'vTOTVALUE_FACIMPTOT',pic:''},{av:'AV43TotValue_FacImpGen',fld:'vTOTVALUE_FACIMPGEN',pic:''},{av:'AV45TotValue_FacImpPP',fld:'vTOTVALUE_FACIMPPP',pic:''},{av:'AV47TotValue_FacBasImp',fld:'vTOTVALUE_FACBASIMP',pic:''},{av:'AV49TotValue_FacIVAImp',fld:'vTOTVALUE_FACIVAIMP',pic:''},{av:'AV51TotValue_FacTot',fld:'vTOTVALUE_FACTOT',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1524U2',iparms:[{av:'AV21DiariodeFacturacion_SDT',fld:'vDIARIODEFACTURACION_SDT',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{av:'AV81Pgmname',fld:'vPGMNAME',pic:''},{av:'AV52TFDiariodeFacturacion_SDT__Facfch',fld:'vTFDIARIODEFACTURACION_SDT__FACFCH',pic:''},{av:'AV56TFDiariodeFacturacion_SDT__Faccod',fld:'vTFDIARIODEFACTURACION_SDT__FACCOD',pic:'ZZZZZZZ9'},{av:'AV58TFDiariodeFacturacion_SDT__Clicod',fld:'vTFDIARIODEFACTURACION_SDT__CLICOD',pic:'ZZZZZ9'},{av:'AV60TFDiariodeFacturacion_SDT__CliNom',fld:'vTFDIARIODEFACTURACION_SDT__CLINOM',pic:''},{av:'AV53TFDiariodeFacturacion_SDT__Facfch_To',fld:'vTFDIARIODEFACTURACION_SDT__FACFCH_TO',pic:''},{av:'AV57TFDiariodeFacturacion_SDT__Faccod_To',fld:'vTFDIARIODEFACTURACION_SDT__FACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV59TFDiariodeFacturacion_SDT__Clicod_To',fld:'vTFDIARIODEFACTURACION_SDT__CLICOD_TO',pic:'ZZZZZ9'},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TFDiariodeFacturacion_SDT__Facfch',fld:'vTFDIARIODEFACTURACION_SDT__FACFCH',pic:''},{av:'AV53TFDiariodeFacturacion_SDT__Facfch_To',fld:'vTFDIARIODEFACTURACION_SDT__FACFCH_TO',pic:''},{av:'AV56TFDiariodeFacturacion_SDT__Faccod',fld:'vTFDIARIODEFACTURACION_SDT__FACCOD',pic:'ZZZZZZZ9'},{av:'AV57TFDiariodeFacturacion_SDT__Faccod_To',fld:'vTFDIARIODEFACTURACION_SDT__FACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV58TFDiariodeFacturacion_SDT__Clicod',fld:'vTFDIARIODEFACTURACION_SDT__CLICOD',pic:'ZZZZZ9'},{av:'AV59TFDiariodeFacturacion_SDT__Clicod_To',fld:'vTFDIARIODEFACTURACION_SDT__CLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFDiariodeFacturacion_SDT__CliNom',fld:'vTFDIARIODEFACTURACION_SDT__CLINOM',pic:''},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV81Pgmname',fld:'vPGMNAME',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV6Clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV8Facfchfrom',fld:'vFACFCHFROM',pic:''},{av:'AV9Facfchto',fld:'vFACFCHTO',pic:''},{av:'AV10FacPri',fld:'vFACPRI',pic:'9'},{av:'AV11FacSernum',fld:'vFACSERNUM',pic:''},{av:'AV12noserie',fld:'vNOSERIE',pic:'ZZZ9'},{av:'AV21DiariodeFacturacion_SDT',fld:'vDIARIODEFACTURACION_SDT',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{av:'AV40Tot_FacImpTot',fld:'vTOT_FACIMPTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV42Tot_FacImpGen',fld:'vTOT_FACIMPGEN',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV44Tot_FacImpPP',fld:'vTOT_FACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV46Tot_FacBasImp',fld:'vTOT_FACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV48Tot_FacIVAImp',fld:'vTOT_FACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV50Tot_FacTot',fld:'vTOT_FACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e1624U2',iparms:[{av:'AV21DiariodeFacturacion_SDT',fld:'vDIARIODEFACTURACION_SDT',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{av:'AV81Pgmname',fld:'vPGMNAME',pic:''},{av:'AV52TFDiariodeFacturacion_SDT__Facfch',fld:'vTFDIARIODEFACTURACION_SDT__FACFCH',pic:''},{av:'AV56TFDiariodeFacturacion_SDT__Faccod',fld:'vTFDIARIODEFACTURACION_SDT__FACCOD',pic:'ZZZZZZZ9'},{av:'AV58TFDiariodeFacturacion_SDT__Clicod',fld:'vTFDIARIODEFACTURACION_SDT__CLICOD',pic:'ZZZZZ9'},{av:'AV60TFDiariodeFacturacion_SDT__CliNom',fld:'vTFDIARIODEFACTURACION_SDT__CLINOM',pic:''},{av:'AV53TFDiariodeFacturacion_SDT__Facfch_To',fld:'vTFDIARIODEFACTURACION_SDT__FACFCH_TO',pic:''},{av:'AV57TFDiariodeFacturacion_SDT__Faccod_To',fld:'vTFDIARIODEFACTURACION_SDT__FACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV59TFDiariodeFacturacion_SDT__Clicod_To',fld:'vTFDIARIODEFACTURACION_SDT__CLICOD_TO',pic:'ZZZZZ9'},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TFDiariodeFacturacion_SDT__Facfch',fld:'vTFDIARIODEFACTURACION_SDT__FACFCH',pic:''},{av:'AV53TFDiariodeFacturacion_SDT__Facfch_To',fld:'vTFDIARIODEFACTURACION_SDT__FACFCH_TO',pic:''},{av:'AV56TFDiariodeFacturacion_SDT__Faccod',fld:'vTFDIARIODEFACTURACION_SDT__FACCOD',pic:'ZZZZZZZ9'},{av:'AV57TFDiariodeFacturacion_SDT__Faccod_To',fld:'vTFDIARIODEFACTURACION_SDT__FACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV58TFDiariodeFacturacion_SDT__Clicod',fld:'vTFDIARIODEFACTURACION_SDT__CLICOD',pic:'ZZZZZ9'},{av:'AV59TFDiariodeFacturacion_SDT__Clicod_To',fld:'vTFDIARIODEFACTURACION_SDT__CLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFDiariodeFacturacion_SDT__CliNom',fld:'vTFDIARIODEFACTURACION_SDT__CLINOM',pic:''},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV81Pgmname',fld:'vPGMNAME',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV6Clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV8Facfchfrom',fld:'vFACFCHFROM',pic:''},{av:'AV9Facfchto',fld:'vFACFCHTO',pic:''},{av:'AV10FacPri',fld:'vFACPRI',pic:'9'},{av:'AV11FacSernum',fld:'vFACSERNUM',pic:''},{av:'AV12noserie',fld:'vNOSERIE',pic:'ZZZ9'},{av:'AV21DiariodeFacturacion_SDT',fld:'vDIARIODEFACTURACION_SDT',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{av:'AV40Tot_FacImpTot',fld:'vTOT_FACIMPTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV42Tot_FacImpGen',fld:'vTOT_FACIMPGEN',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV44Tot_FacImpPP',fld:'vTOT_FACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV46Tot_FacBasImp',fld:'vTOT_FACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV48Tot_FacIVAImp',fld:'vTOT_FACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV50Tot_FacTot',fld:'vTOT_FACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e2024U2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV81Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TFDiariodeFacturacion_SDT__Facfch',fld:'vTFDIARIODEFACTURACION_SDT__FACFCH',pic:''},{av:'AV53TFDiariodeFacturacion_SDT__Facfch_To',fld:'vTFDIARIODEFACTURACION_SDT__FACFCH_TO',pic:''},{av:'AV56TFDiariodeFacturacion_SDT__Faccod',fld:'vTFDIARIODEFACTURACION_SDT__FACCOD',pic:'ZZZZZZZ9'},{av:'AV57TFDiariodeFacturacion_SDT__Faccod_To',fld:'vTFDIARIODEFACTURACION_SDT__FACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV58TFDiariodeFacturacion_SDT__Clicod',fld:'vTFDIARIODEFACTURACION_SDT__CLICOD',pic:'ZZZZZ9'},{av:'AV59TFDiariodeFacturacion_SDT__Clicod_To',fld:'vTFDIARIODEFACTURACION_SDT__CLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFDiariodeFacturacion_SDT__CliNom',fld:'vTFDIARIODEFACTURACION_SDT__CLINOM',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Clicodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV6Clicodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV8Facfchfrom',fld:'vFACFCHFROM',pic:''},{av:'AV9Facfchto',fld:'vFACFCHTO',pic:''},{av:'AV10FacPri',fld:'vFACPRI',pic:'9'},{av:'AV11FacSernum',fld:'vFACSERNUM',pic:''},{av:'AV12noserie',fld:'vNOSERIE',pic:'ZZZ9'},{av:'AV21DiariodeFacturacion_SDT',fld:'vDIARIODEFACTURACION_SDT',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{av:'AV40Tot_FacImpTot',fld:'vTOT_FACIMPTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV42Tot_FacImpGen',fld:'vTOT_FACIMPGEN',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV44Tot_FacImpPP',fld:'vTOT_FACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV46Tot_FacBasImp',fld:'vTOT_FACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV48Tot_FacIVAImp',fld:'vTOT_FACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV50Tot_FacTot',fld:'vTOT_FACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'sPrefix'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'DIARIODEFACTURACION_SDT__FACFCH',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_SDT__FACCOD',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_SDT__CLICOD',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_SDT__CLINOM',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_SDT__FACIMPTOT',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_SDT__FACIMPGEN',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_SDT__FACIMPPP',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_SDT__FACBASIMP',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_SDT__FACIVAIMP',prop:'Visible'},{ctrl:'DIARIODEFACTURACION_SDT__FACTOT',prop:'Visible'},{av:'AV34GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV35GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV40Tot_FacImpTot',fld:'vTOT_FACIMPTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV42Tot_FacImpGen',fld:'vTOT_FACIMPGEN',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV44Tot_FacImpPP',fld:'vTOT_FACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV46Tot_FacBasImp',fld:'vTOT_FACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV48Tot_FacIVAImp',fld:'vTOT_FACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV50Tot_FacTot',fld:'vTOT_FACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV21DiariodeFacturacion_SDT',fld:'vDIARIODEFACTURACION_SDT',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36},{av:'AV41TotValue_FacImpTot',fld:'vTOTVALUE_FACIMPTOT',pic:''},{av:'AV43TotValue_FacImpGen',fld:'vTOTVALUE_FACIMPGEN',pic:''},{av:'AV45TotValue_FacImpPP',fld:'vTOTVALUE_FACIMPPP',pic:''},{av:'AV47TotValue_FacBasImp',fld:'vTOTVALUE_FACBASIMP',pic:''},{av:'AV49TotValue_FacIVAImp',fld:'vTOTVALUE_FACIVAIMP',pic:''},{av:'AV51TotValue_FacTot',fld:'vTOTVALUE_FACTOT',pic:''}]}");
      setEventMetadata("'DOUSERACTION1'","{handler:'e2124U2',iparms:[{av:'AV21DiariodeFacturacion_SDT',fld:'vDIARIODEFACTURACION_SDT',grid:36,pic:'',hsh:true},{av:'nGXsfl_36_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:36},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_36',ctrl:'GRID',prop:'GridRC',grid:36}]");
      setEventMetadata("'DOUSERACTION1'",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv11',iparms:[]");
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
      wcpOAV7Emprcod = "" ;
      wcpOAV8Facfchfrom = GXutil.nullDate() ;
      wcpOAV9Facfchto = GXutil.nullDate() ;
      wcpOAV10FacPri = "" ;
      wcpOAV11FacSernum = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV7Emprcod = "" ;
      AV8Facfchfrom = GXutil.nullDate() ;
      AV9Facfchto = GXutil.nullDate() ;
      AV10FacPri = "" ;
      AV11FacSernum = "" ;
      AV26ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV81Pgmname = "" ;
      AV52TFDiariodeFacturacion_SDT__Facfch = GXutil.nullDate() ;
      AV53TFDiariodeFacturacion_SDT__Facfch_To = GXutil.nullDate() ;
      AV60TFDiariodeFacturacion_SDT__CliNom = "" ;
      AV21DiariodeFacturacion_SDT = new GXBaseCollection<app.facturacion.SdtDiariodeFacturacion_SDT_Item>(app.facturacion.SdtDiariodeFacturacion_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV40Tot_FacImpTot = DecimalUtil.ZERO ;
      AV42Tot_FacImpGen = DecimalUtil.ZERO ;
      AV44Tot_FacImpPP = DecimalUtil.ZERO ;
      AV46Tot_FacBasImp = DecimalUtil.ZERO ;
      AV48Tot_FacIVAImp = DecimalUtil.ZERO ;
      AV50Tot_FacTot = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV32DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
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
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV54DDO_DiariodeFacturacion_SDT__FacfchAuxDate = GXutil.nullDate() ;
      AV55DDO_DiariodeFacturacion_SDT__FacfchAuxDateTo = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV41TotValue_FacImpTot = "" ;
      AV43TotValue_FacImpGen = "" ;
      AV45TotValue_FacImpPP = "" ;
      AV47TotValue_FacBasImp = "" ;
      AV49TotValue_FacIVAImp = "" ;
      AV51TotValue_FacTot = "" ;
      hsh = "" ;
      AV61Station = "" ;
      GXv_char2 = new String[1] ;
      AV62EmprNom = "" ;
      AV63UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV14WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV28Session = httpContext.getWebSession();
      AV24ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV65DiariodeFacturacion_json = "" ;
      AV64Websession = httpContext.getWebSession();
      AV22ExcelFilename = "" ;
      AV23ErrorMessage = "" ;
      GXv_char3 = new String[1] ;
      GXt_objcol_SdtDiariodeFacturacion_SDT_Item8 = new GXBaseCollection<app.facturacion.SdtDiariodeFacturacion_SDT_Item>(app.facturacion.SdtDiariodeFacturacion_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      GXv_objcol_SdtDiariodeFacturacion_SDT_Item9 = new GXBaseCollection[1] ;
      AV25UserCustomValue = "" ;
      AV27ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV18GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV19GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_SdtWWPGridState12 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV39DiariodeFacturacion_SDTItem = new app.facturacion.SdtDiariodeFacturacion_SDT_Item(remoteHandle, context);
      AV66DiariodeFacturacion_json_GET = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV7Emprcod = "" ;
      sCtrlAV5Clicodfrom = "" ;
      sCtrlAV6Clicodto = "" ;
      sCtrlAV8Facfchfrom = "" ;
      sCtrlAV9Facfchto = "" ;
      sCtrlAV10FacPri = "" ;
      sCtrlAV11FacSernum = "" ;
      sCtrlAV12noserie = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV81Pgmname = "Facturacion.DiariodeFacturacion_WC" ;
      /* GeneXus formulas. */
      AV81Pgmname = "Facturacion.DiariodeFacturacion_WC" ;
      Gx_err = (short)(0) ;
      edtavDiariodefacturacion_sdt__facfch_Enabled = 0 ;
      edtavDiariodefacturacion_sdt__faccod_Enabled = 0 ;
      edtavDiariodefacturacion_sdt__clicod_Enabled = 0 ;
      edtavDiariodefacturacion_sdt__clinom_Enabled = 0 ;
      edtavDiariodefacturacion_sdt__facimptot_Enabled = 0 ;
      edtavDiariodefacturacion_sdt__facimpgen_Enabled = 0 ;
      edtavDiariodefacturacion_sdt__facimppp_Enabled = 0 ;
      edtavDiariodefacturacion_sdt__facbasimp_Enabled = 0 ;
      edtavDiariodefacturacion_sdt__facivaimp_Enabled = 0 ;
      edtavDiariodefacturacion_sdt__factot_Enabled = 0 ;
      edtavTotvalue_facimptot_Enabled = 0 ;
      edtavTotvalue_facimpgen_Enabled = 0 ;
      edtavTotvalue_facimppp_Enabled = 0 ;
      edtavTotvalue_facbasimp_Enabled = 0 ;
      edtavTotvalue_facivaimp_Enabled = 0 ;
      edtavTotvalue_factot_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
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
   private short wcpOAV12noserie ;
   private short AV12noserie ;
   private short AV36OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV5Clicodfrom ;
   private int wcpOAV6Clicodto ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_36 ;
   private int AV5Clicodfrom ;
   private int AV6Clicodto ;
   private int nGXsfl_36_idx=1 ;
   private int AV56TFDiariodeFacturacion_SDT__Faccod ;
   private int AV57TFDiariodeFacturacion_SDT__Faccod_To ;
   private int AV58TFDiariodeFacturacion_SDT__Clicod ;
   private int AV59TFDiariodeFacturacion_SDT__Clicod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV70GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavDiariodefacturacion_sdt__facfch_Enabled ;
   private int edtavDiariodefacturacion_sdt__faccod_Enabled ;
   private int edtavDiariodefacturacion_sdt__clicod_Enabled ;
   private int edtavDiariodefacturacion_sdt__clinom_Enabled ;
   private int edtavDiariodefacturacion_sdt__facimptot_Enabled ;
   private int edtavDiariodefacturacion_sdt__facimpgen_Enabled ;
   private int edtavDiariodefacturacion_sdt__facimppp_Enabled ;
   private int edtavDiariodefacturacion_sdt__facbasimp_Enabled ;
   private int edtavDiariodefacturacion_sdt__facivaimp_Enabled ;
   private int edtavDiariodefacturacion_sdt__factot_Enabled ;
   private int edtavTotvalue_facimptot_Enabled ;
   private int edtavTotvalue_facimpgen_Enabled ;
   private int edtavTotvalue_facimppp_Enabled ;
   private int edtavTotvalue_facbasimp_Enabled ;
   private int edtavTotvalue_facivaimp_Enabled ;
   private int edtavTotvalue_factot_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_36_fel_idx=1 ;
   private int edtavDiariodefacturacion_sdt__facfch_Visible ;
   private int edtavDiariodefacturacion_sdt__faccod_Visible ;
   private int edtavDiariodefacturacion_sdt__clicod_Visible ;
   private int edtavDiariodefacturacion_sdt__clinom_Visible ;
   private int edtavDiariodefacturacion_sdt__facimptot_Visible ;
   private int edtavDiariodefacturacion_sdt__facimpgen_Visible ;
   private int edtavDiariodefacturacion_sdt__facimppp_Visible ;
   private int edtavDiariodefacturacion_sdt__facbasimp_Visible ;
   private int edtavDiariodefacturacion_sdt__facivaimp_Visible ;
   private int edtavDiariodefacturacion_sdt__factot_Visible ;
   private int AV33PageToGo ;
   private int nGXsfl_36_bak_idx=1 ;
   private int AV82GXV12 ;
   private int AV83GXV13 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV34GridCurrentPage ;
   private long AV35GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV40Tot_FacImpTot ;
   private java.math.BigDecimal AV42Tot_FacImpGen ;
   private java.math.BigDecimal AV44Tot_FacImpPP ;
   private java.math.BigDecimal AV46Tot_FacBasImp ;
   private java.math.BigDecimal AV48Tot_FacIVAImp ;
   private java.math.BigDecimal AV50Tot_FacTot ;
   private String wcpOAV7Emprcod ;
   private String wcpOAV10FacPri ;
   private String wcpOAV11FacSernum ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV7Emprcod ;
   private String AV10FacPri ;
   private String AV11FacSernum ;
   private String sGXsfl_36_idx="0001" ;
   private String AV81Pgmname ;
   private String AV60TFDiariodeFacturacion_SDT__CliNom ;
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
   private String Ddo_grid_Filteredtext_set ;
   private String Ddo_grid_Filteredtextto_set ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Fixable ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
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
   private String Barradeprogreso_Internalname ;
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
   private String divDdo_diariodefacturacion_sdt__facfchauxdates_Internalname ;
   private String edtavDdo_diariodefacturacion_sdt__facfchauxdate_Internalname ;
   private String edtavDdo_diariodefacturacion_sdt__facfchauxdate_Jsonclick ;
   private String edtavDdo_diariodefacturacion_sdt__facfchauxdateto_Internalname ;
   private String edtavDdo_diariodefacturacion_sdt__facfchauxdateto_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavTotvalue_facimptot_Internalname ;
   private String edtavDiariodefacturacion_sdt__facfch_Internalname ;
   private String edtavDiariodefacturacion_sdt__faccod_Internalname ;
   private String edtavDiariodefacturacion_sdt__clicod_Internalname ;
   private String edtavDiariodefacturacion_sdt__clinom_Internalname ;
   private String edtavDiariodefacturacion_sdt__facimptot_Internalname ;
   private String edtavDiariodefacturacion_sdt__facimpgen_Internalname ;
   private String edtavDiariodefacturacion_sdt__facimppp_Internalname ;
   private String edtavDiariodefacturacion_sdt__facbasimp_Internalname ;
   private String edtavDiariodefacturacion_sdt__facivaimp_Internalname ;
   private String edtavDiariodefacturacion_sdt__factot_Internalname ;
   private String edtavTotvalue_facimpgen_Internalname ;
   private String edtavTotvalue_facimppp_Internalname ;
   private String edtavTotvalue_facbasimp_Internalname ;
   private String edtavTotvalue_facivaimp_Internalname ;
   private String edtavTotvalue_factot_Internalname ;
   private String sGXsfl_36_fel_idx="0001" ;
   private String hsh ;
   private String AV61Station ;
   private String GXv_char2[] ;
   private String AV62EmprNom ;
   private String AV63UsurCod ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvalue_facimptot_Jsonclick ;
   private String edtavTotvalue_facimpgen_Jsonclick ;
   private String edtavTotvalue_facimppp_Jsonclick ;
   private String edtavTotvalue_facbasimp_Jsonclick ;
   private String edtavTotvalue_facivaimp_Jsonclick ;
   private String edtavTotvalue_factot_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String sCtrlAV7Emprcod ;
   private String sCtrlAV5Clicodfrom ;
   private String sCtrlAV6Clicodto ;
   private String sCtrlAV8Facfchfrom ;
   private String sCtrlAV9Facfchto ;
   private String sCtrlAV10FacPri ;
   private String sCtrlAV11FacSernum ;
   private String sCtrlAV12noserie ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavDiariodefacturacion_sdt__facfch_Jsonclick ;
   private String edtavDiariodefacturacion_sdt__faccod_Jsonclick ;
   private String edtavDiariodefacturacion_sdt__clicod_Jsonclick ;
   private String edtavDiariodefacturacion_sdt__clinom_Jsonclick ;
   private String edtavDiariodefacturacion_sdt__facimptot_Jsonclick ;
   private String edtavDiariodefacturacion_sdt__facimpgen_Jsonclick ;
   private String edtavDiariodefacturacion_sdt__facimppp_Jsonclick ;
   private String edtavDiariodefacturacion_sdt__facbasimp_Jsonclick ;
   private String edtavDiariodefacturacion_sdt__facivaimp_Jsonclick ;
   private String edtavDiariodefacturacion_sdt__factot_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV8Facfchfrom ;
   private java.util.Date wcpOAV9Facfchto ;
   private java.util.Date AV8Facfchfrom ;
   private java.util.Date AV9Facfchto ;
   private java.util.Date AV52TFDiariodeFacturacion_SDT__Facfch ;
   private java.util.Date AV53TFDiariodeFacturacion_SDT__Facfch_To ;
   private java.util.Date AV54DDO_DiariodeFacturacion_SDT__FacfchAuxDate ;
   private java.util.Date AV55DDO_DiariodeFacturacion_SDT__FacfchAuxDateTo ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV37OrderedDsc ;
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
   private boolean gx_refresh_fired ;
   private boolean gx_BV36 ;
   private String AV24ColumnsSelectorXML ;
   private String AV65DiariodeFacturacion_json ;
   private String AV25UserCustomValue ;
   private String AV66DiariodeFacturacion_json_GET ;
   private String AV41TotValue_FacImpTot ;
   private String AV43TotValue_FacImpGen ;
   private String AV45TotValue_FacImpPP ;
   private String AV47TotValue_FacBasImp ;
   private String AV49TotValue_FacIVAImp ;
   private String AV51TotValue_FacTot ;
   private String AV22ExcelFilename ;
   private String AV23ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV28Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private com.genexus.webpanels.WebSession AV64Websession ;
   private GXBaseCollection<app.facturacion.SdtDiariodeFacturacion_SDT_Item> AV21DiariodeFacturacion_SDT ;
   private GXBaseCollection<app.facturacion.SdtDiariodeFacturacion_SDT_Item> GXt_objcol_SdtDiariodeFacturacion_SDT_Item8 ;
   private GXBaseCollection<app.facturacion.SdtDiariodeFacturacion_SDT_Item> GXv_objcol_SdtDiariodeFacturacion_SDT_Item9[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV26ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV27ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV32DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.facturacion.SdtDiariodeFacturacion_SDT_Item AV39DiariodeFacturacion_SDTItem ;
   private app.wwpbaseobjects.SdtWWPGridState AV18GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState12[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV19GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV14WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

