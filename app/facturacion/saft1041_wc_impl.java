package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class saft1041_wc_impl extends GXWebComponent
{
   public saft1041_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public saft1041_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( saft1041_wc_impl.class ));
   }

   public saft1041_wc_impl( int remoteHandle ,
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
      chkavSaft1041_sdt__seleccionar1 = UIFactory.getCheckbox(this);
      chkavSaft1041_sdt__seleccionar2 = UIFactory.getCheckbox(this);
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
               AV29FacFchFrom = localUtil.parseDateParm( httpContext.GetPar( "FacFchFrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29FacFchFrom", localUtil.format(AV29FacFchFrom, "99/99/99"));
               AV30FacFchTo = localUtil.parseDateParm( httpContext.GetPar( "FacFchTo")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30FacFchTo", localUtil.format(AV30FacFchTo, "99/99/99"));
               AV31Faccodfrom = (int)(GXutil.lval( httpContext.GetPar( "Faccodfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31Faccodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Faccodfrom), 8, 0));
               AV32Faccodto = (int)(GXutil.lval( httpContext.GetPar( "Faccodto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Faccodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Faccodto), 8, 0));
               AV43FirmaD = (byte)(GXutil.lval( httpContext.GetPar( "FirmaD"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43FirmaD", GXutil.str( AV43FirmaD, 1, 0));
               AV44TaxReg = httpContext.GetPar( "TaxReg") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TaxReg", AV44TaxReg);
               AV42CompanyId = httpContext.GetPar( "CompanyId") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42CompanyId", AV42CompanyId);
               AV45Dir = httpContext.GetPar( "Dir") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Dir", AV45Dir);
               AV46Anyo = (short)(GXutil.lval( httpContext.GetPar( "Anyo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46Anyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46Anyo), 4, 0));
               AV47CantidadRegistrosAProcesar = (short)(GXutil.lval( httpContext.GetPar( "CantidadRegistrosAProcesar"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47CantidadRegistrosAProcesar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47CantidadRegistrosAProcesar), 4, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV28Emprcod,AV29FacFchFrom,AV30FacFchTo,Integer.valueOf(AV31Faccodfrom),Integer.valueOf(AV32Faccodto),Byte.valueOf(AV43FirmaD),AV44TaxReg,AV42CompanyId,AV45Dir,Short.valueOf(AV46Anyo),Short.valueOf(AV47CantidadRegistrosAProcesar)});
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
      nRC_GXsfl_63 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_63"))) ;
      nGXsfl_63_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_63_idx"))) ;
      sGXsfl_63_idx = httpContext.GetPar( "sGXsfl_63_idx") ;
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
      AV70Pgmname = httpContext.GetPar( "Pgmname") ;
      AV28Emprcod = httpContext.GetPar( "Emprcod") ;
      AV29FacFchFrom = localUtil.parseDateParm( httpContext.GetPar( "FacFchFrom")) ;
      AV30FacFchTo = localUtil.parseDateParm( httpContext.GetPar( "FacFchTo")) ;
      AV31Faccodfrom = (int)(GXutil.lval( httpContext.GetPar( "Faccodfrom"))) ;
      AV32Faccodto = (int)(GXutil.lval( httpContext.GetPar( "Faccodto"))) ;
      AV43FirmaD = (byte)(GXutil.lval( httpContext.GetPar( "FirmaD"))) ;
      AV44TaxReg = httpContext.GetPar( "TaxReg") ;
      AV42CompanyId = httpContext.GetPar( "CompanyId") ;
      AV45Dir = httpContext.GetPar( "Dir") ;
      AV46Anyo = (short)(GXutil.lval( httpContext.GetPar( "Anyo"))) ;
      AV47CantidadRegistrosAProcesar = (short)(GXutil.lval( httpContext.GetPar( "CantidadRegistrosAProcesar"))) ;
      AV39UsurCod = httpContext.GetPar( "UsurCod") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV18ColumnsSelector, AV70Pgmname, AV28Emprcod, AV29FacFchFrom, AV30FacFchTo, AV31Faccodfrom, AV32Faccodto, AV43FirmaD, AV44TaxReg, AV42CompanyId, AV45Dir, AV46Anyo, AV47CantidadRegistrosAProcesar, AV39UsurCod, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa2452( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "StandardAuditFile-Tax:PT_1.04_01", "")) ;
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
         FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.saft1041_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV28Emprcod)),GXutil.URLEncode(GXutil.formatDateParm(AV29FacFchFrom)),GXutil.URLEncode(GXutil.formatDateParm(AV30FacFchTo)),GXutil.URLEncode(GXutil.ltrimstr(AV31Faccodfrom,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV32Faccodto,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV43FirmaD,1,0)),GXutil.URLEncode(GXutil.rtrim(AV44TaxReg)),GXutil.URLEncode(GXutil.rtrim(AV42CompanyId)),GXutil.URLEncode(GXutil.rtrim(AV45Dir)),GXutil.URLEncode(GXutil.ltrimstr(AV46Anyo,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV47CantidadRegistrosAProcesar,4,0))}, new String[] {"Emprcod","FacFchFrom","FacFchTo","Faccodfrom","Faccodto","FirmaD","TaxReg","CompanyId","Dir","Anyo","CantidadRegistrosAProcesar"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV39UsurCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"SAFT1041_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV70Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\saft1041_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Saft1041_sdt", AV13SAFT1041_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Saft1041_sdt", AV13SAFT1041_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_63", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_63, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV29FacFchFrom", localUtil.dtoc( wcpOAV29FacFchFrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV30FacFchTo", localUtil.dtoc( wcpOAV30FacFchTo, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV31Faccodfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV31Faccodfrom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV32Faccodto", GXutil.ltrim( localUtil.ntoc( wcpOAV32Faccodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV43FirmaD", GXutil.ltrim( localUtil.ntoc( wcpOAV43FirmaD, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV44TaxReg", GXutil.rtrim( wcpOAV44TaxReg));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV42CompanyId", GXutil.rtrim( wcpOAV42CompanyId));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV45Dir", GXutil.rtrim( wcpOAV45Dir));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV46Anyo", GXutil.ltrim( localUtil.ntoc( wcpOAV46Anyo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV47CantidadRegistrosAProcesar", GXutil.ltrim( localUtil.ntoc( wcpOAV47CantidadRegistrosAProcesar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV28Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFACFCHFROM", localUtil.dtoc( AV29FacFchFrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFACFCHTO", localUtil.dtoc( AV30FacFchTo, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFACCODFROM", GXutil.ltrim( localUtil.ntoc( AV31Faccodfrom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFACCODTO", GXutil.ltrim( localUtil.ntoc( AV32Faccodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFIRMAD", GXutil.ltrim( localUtil.ntoc( AV43FirmaD, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTAXREG", GXutil.rtrim( AV44TaxReg));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOMPANYID", GXutil.rtrim( AV42CompanyId));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDIR", GXutil.rtrim( AV45Dir));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vANYO", GXutil.ltrim( localUtil.ntoc( AV46Anyo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSAFT1041_SDT", AV13SAFT1041_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSAFT1041_SDT", AV13SAFT1041_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV39UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV39UsurCod, "@!"))));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENTER_Title", GXutil.rtrim( Dvelop_confirmpanel_enter_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENTER_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENTER_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
   }

   public void renderHtmlCloseForm2452( )
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
      return "Facturacion.SAFT1041_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "StandardAuditFile-Tax:PT_1.04_01", "") ;
   }

   public void wb2450( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.facturacion.saft1041_wc");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 63, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\SAFT1041_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 63, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\SAFT1041_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 63, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\SAFT1041_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* User Defined Control */
         ucProgressbar.render(context, "gxprogressindicator", Progressbar_Internalname, sPrefix+"PROGRESSBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablecantidadregistrosaprocesar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcantidadregistrosaprocesar_Internalname, httpContext.getMessage( "Faturas a processar", ""), "", "", lblTextblockcantidadregistrosaprocesar_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\SAFT1041_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCantidadregistrosaprocesar_Internalname, httpContext.getMessage( "Cantidad Registros AProcesar", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCantidadregistrosaprocesar_Internalname, GXutil.ltrim( localUtil.ntoc( AV47CantidadRegistrosAProcesar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCantidadregistrosaprocesar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV47CantidadRegistrosAProcesar), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV47CantidadRegistrosAProcesar), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCantidadregistrosaprocesar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCantidadregistrosaprocesar_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\SAFT1041_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablevar_file_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockvar_file_Internalname, httpContext.getMessage( "Fichero", ""), "", "", lblTextblockvar_file_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\SAFT1041_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavVar_file_Internalname, httpContext.getMessage( "var_File", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'" + sPrefix + "',false,'" + sGXsfl_63_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavVar_file_Internalname, AV41var_File, GXutil.rtrim( localUtil.format( AV41var_File, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavVar_file_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavVar_file_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\SAFT1041_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTxtmensaje_Internalname, lblTxtmensaje_Caption, "", "", lblTxtmensaje_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\SAFT1041_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnigualartotal_Internalname, "gx.evt.setGridEvt("+GXutil.str( 63, 2, 0)+","+"null"+");", httpContext.getMessage( "Igualar TOTAL", ""), bttBtnigualartotal_Jsonclick, 5, httpContext.getMessage( "Igualar TOTAL", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOIGUALARTOTAL\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\SAFT1041_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 63, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\SAFT1041_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 63, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\SAFT1041_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol63( ) ;
      }
      if ( wbEnd == 63 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_63 = (int)(nGXsfl_63_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV55GXV1 = nGXsfl_63_idx ;
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV70Pgmname), GXutil.rtrim( localUtil.format( AV70Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\SAFT1041_WC.htm");
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
         wb_table1_93_2452( true) ;
      }
      else
      {
         wb_table1_93_2452( false) ;
      }
      return  ;
   }

   public void wb_table1_93_2452e( boolean wbgen )
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
      if ( wbEnd == 63 )
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
               AV55GXV1 = nGXsfl_63_idx ;
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

   public void start2452( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "StandardAuditFile-Tax:PT_1.04_01", ""), (short)(0)) ;
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
            strup2450( ) ;
         }
      }
   }

   public void ws2452( )
   {
      start2452( ) ;
      evt2452( ) ;
   }

   public void evt2452( )
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
                              strup2450( ) ;
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
                              strup2450( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e112452 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2450( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e122452 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2450( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e132452 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ENTER.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2450( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e142452 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOIGUALARTOTAL'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2450( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoIgualarTotal' */
                                 e152452 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2450( ) ;
                           }
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
                                       /* Execute user event: Enter */
                                       e162452 ();
                                    }
                                    dynload_actions( ) ;
                                 }
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2450( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoCerrar' */
                                 e172452 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2450( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e182452 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2450( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e192452 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2450( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavVar_file_Internalname ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2450( ) ;
                           }
                           nGXsfl_63_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_632( ) ;
                           AV55GXV1 = (int)(nGXsfl_63_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV13SAFT1041_SDT.size() >= AV55GXV1 ) && ( AV55GXV1 > 0 ) )
                           {
                              AV13SAFT1041_SDT.currentItem( ((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV55GXV1)) );
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
                                       GX_FocusControl = edtavVar_file_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e202452 ();
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
                                       GX_FocusControl = edtavVar_file_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e212452 ();
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
                                       GX_FocusControl = edtavVar_file_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e222452 ();
                                    }
                                 }
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                                 {
                                    strup2450( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavVar_file_Internalname ;
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

   public void we2452( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2452( ) ;
         }
      }
   }

   public void pa2452( )
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
            GX_FocusControl = edtavVar_file_Internalname ;
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
      subsflControlProps_632( ) ;
      while ( nGXsfl_63_idx <= nRC_GXsfl_63 )
      {
         sendrow_632( ) ;
         nGXsfl_63_idx = ((subGrid_Islastpage==1)&&(nGXsfl_63_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_63_idx+1) ;
         sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_632( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ,
                                 String AV70Pgmname ,
                                 String AV28Emprcod ,
                                 java.util.Date AV29FacFchFrom ,
                                 java.util.Date AV30FacFchTo ,
                                 int AV31Faccodfrom ,
                                 int AV32Faccodto ,
                                 byte AV43FirmaD ,
                                 String AV44TaxReg ,
                                 String AV42CompanyId ,
                                 String AV45Dir ,
                                 short AV46Anyo ,
                                 short AV47CantidadRegistrosAProcesar ,
                                 String AV39UsurCod ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e212452 ();
      GRID_nCurrentRecord = 0 ;
      rf2452( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"SAFT1041_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV70Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\saft1041_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf2452( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV70Pgmname = "Facturacion.SAFT1041_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Pgmname", AV70Pgmname);
      Gx_err = (short)(0) ;
      edtavCantidadregistrosaprocesar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCantidadregistrosaprocesar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantidadregistrosaprocesar_Enabled), 5, 0), true);
      edtavVar_file_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavVar_file_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVar_file_Enabled), 5, 0), true);
      chkavSaft1041_sdt__seleccionar1.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSaft1041_sdt__seleccionar1.getInternalname(), "Enabled", GXutil.ltrimstr( chkavSaft1041_sdt__seleccionar1.getEnabled(), 5, 0), !bGXsfl_63_Refreshing);
      chkavSaft1041_sdt__seleccionar2.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSaft1041_sdt__seleccionar2.getInternalname(), "Enabled", GXutil.ltrimstr( chkavSaft1041_sdt__seleccionar2.getEnabled(), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__facest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__facest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__facest_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__faccod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__faccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__faccod_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__facfch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__facfch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__facfch_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__factot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__factot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__factot_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__factot1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__factot1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__factot1_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__fachor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__fachor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__fachor_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__hhdt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__hhdt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__hhdt_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__dias_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__dias_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__dias_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__times_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__times_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__times_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__hhmmss_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__hhmmss_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__hhmmss_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__facfirdg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__facfirdg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__facfirdg_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__facfirma_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__facfirma_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__facfirma_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2452( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(63) ;
      /* Execute user event: Refresh */
      e212452 ();
      nGXsfl_63_idx = 1 ;
      sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_632( ) ;
      bGXsfl_63_Refreshing = true ;
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
         subsflControlProps_632( ) ;
         e222452 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_63_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e222452 ();
         }
         wbEnd = (short)(63) ;
         wb2450( ) ;
      }
      bGXsfl_63_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2452( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV39UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV39UsurCod, "@!"))));
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
      return AV13SAFT1041_SDT.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV18ColumnsSelector, AV70Pgmname, AV28Emprcod, AV29FacFchFrom, AV30FacFchTo, AV31Faccodfrom, AV32Faccodto, AV43FirmaD, AV44TaxReg, AV42CompanyId, AV45Dir, AV46Anyo, AV47CantidadRegistrosAProcesar, AV39UsurCod, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV18ColumnsSelector, AV70Pgmname, AV28Emprcod, AV29FacFchFrom, AV30FacFchTo, AV31Faccodfrom, AV32Faccodto, AV43FirmaD, AV44TaxReg, AV42CompanyId, AV45Dir, AV46Anyo, AV47CantidadRegistrosAProcesar, AV39UsurCod, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV18ColumnsSelector, AV70Pgmname, AV28Emprcod, AV29FacFchFrom, AV30FacFchTo, AV31Faccodfrom, AV32Faccodto, AV43FirmaD, AV44TaxReg, AV42CompanyId, AV45Dir, AV46Anyo, AV47CantidadRegistrosAProcesar, AV39UsurCod, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV18ColumnsSelector, AV70Pgmname, AV28Emprcod, AV29FacFchFrom, AV30FacFchTo, AV31Faccodfrom, AV32Faccodto, AV43FirmaD, AV44TaxReg, AV42CompanyId, AV45Dir, AV46Anyo, AV47CantidadRegistrosAProcesar, AV39UsurCod, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV18ColumnsSelector, AV70Pgmname, AV28Emprcod, AV29FacFchFrom, AV30FacFchTo, AV31Faccodfrom, AV32Faccodto, AV43FirmaD, AV44TaxReg, AV42CompanyId, AV45Dir, AV46Anyo, AV47CantidadRegistrosAProcesar, AV39UsurCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV70Pgmname = "Facturacion.SAFT1041_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Pgmname", AV70Pgmname);
      Gx_err = (short)(0) ;
      edtavCantidadregistrosaprocesar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCantidadregistrosaprocesar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantidadregistrosaprocesar_Enabled), 5, 0), true);
      edtavVar_file_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavVar_file_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVar_file_Enabled), 5, 0), true);
      chkavSaft1041_sdt__seleccionar1.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSaft1041_sdt__seleccionar1.getInternalname(), "Enabled", GXutil.ltrimstr( chkavSaft1041_sdt__seleccionar1.getEnabled(), 5, 0), !bGXsfl_63_Refreshing);
      chkavSaft1041_sdt__seleccionar2.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSaft1041_sdt__seleccionar2.getInternalname(), "Enabled", GXutil.ltrimstr( chkavSaft1041_sdt__seleccionar2.getEnabled(), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__facest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__facest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__facest_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__faccod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__faccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__faccod_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__facfch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__facfch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__facfch_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__factot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__factot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__factot_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__factot1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__factot1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__factot1_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__fachor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__fachor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__fachor_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__hhdt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__hhdt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__hhdt_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__dias_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__dias_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__dias_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__times_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__times_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__times_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__hhmmss_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__hhmmss_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__hhmmss_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__facfirdg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__facfirdg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__facfirdg_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__facfirma_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__facfirma_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__facfirma_Enabled), 5, 0), !bGXsfl_63_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2450( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e202452 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Saft1041_sdt"), AV13SAFT1041_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV24DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV18ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vSAFT1041_SDT"), AV13SAFT1041_SDT);
         /* Read saved values. */
         nRC_GXsfl_63 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_63"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV26GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV27GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV28Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV28Emprcod") ;
         wcpOAV29FacFchFrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV29FacFchFrom"), 0) ;
         wcpOAV30FacFchTo = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV30FacFchTo"), 0) ;
         wcpOAV31Faccodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV31Faccodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV32Faccodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV32Faccodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV43FirmaD = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV43FirmaD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV44TaxReg = httpContext.cgiGet( sPrefix+"wcpOAV44TaxReg") ;
         wcpOAV42CompanyId = httpContext.cgiGet( sPrefix+"wcpOAV42CompanyId") ;
         wcpOAV45Dir = httpContext.cgiGet( sPrefix+"wcpOAV45Dir") ;
         wcpOAV46Anyo = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV46Anyo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV47CantidadRegistrosAProcesar = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV47CantidadRegistrosAProcesar"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Dvelop_confirmpanel_enter_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENTER_Title") ;
         Dvelop_confirmpanel_enter_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENTER_Confirmationtext") ;
         Dvelop_confirmpanel_enter_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption") ;
         Dvelop_confirmpanel_enter_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption") ;
         Dvelop_confirmpanel_enter_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_enter_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition") ;
         Dvelop_confirmpanel_enter_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENTER_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Dvelop_confirmpanel_enter_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ENTER_Result") ;
         nRC_GXsfl_63 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_63"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_63_fel_idx = 0 ;
         while ( nGXsfl_63_fel_idx < nRC_GXsfl_63 )
         {
            nGXsfl_63_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_63_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_63_fel_idx+1) ;
            sGXsfl_63_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_632( ) ;
            AV55GXV1 = (int)(nGXsfl_63_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV13SAFT1041_SDT.size() >= AV55GXV1 ) && ( AV55GXV1 > 0 ) )
            {
               AV13SAFT1041_SDT.currentItem( ((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV55GXV1)) );
            }
         }
         if ( nGXsfl_63_fel_idx == 0 )
         {
            nGXsfl_63_idx = 1 ;
            sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_632( ) ;
         }
         nGXsfl_63_fel_idx = 1 ;
         /* Read variables values. */
         AV41var_File = httpContext.cgiGet( edtavVar_file_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41var_File", AV41var_File);
         AV70Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Pgmname", AV70Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"SAFT1041_WC");
         AV70Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Pgmname", AV70Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV70Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("facturacion\\saft1041_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e202452 ();
      if (returnInSub) return;
   }

   public void e202452( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV37Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      saft1041_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV37Station = GXt_char1 ;
      GXv_char2[0] = AV28Emprcod ;
      GXv_char3[0] = AV38EmprNom ;
      GXv_char4[0] = AV39UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV37Station, GXv_char2, GXv_char3, GXv_char4) ;
      saft1041_wc_impl.this.AV28Emprcod = GXv_char2[0] ;
      saft1041_wc_impl.this.AV38EmprNom = GXv_char3[0] ;
      saft1041_wc_impl.this.AV39UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39UsurCod", AV39UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV39UsurCod, "@!"))));
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
      GXt_objcol_SdtSAFT1041_SDT_Item7 = AV13SAFT1041_SDT ;
      GXv_objcol_SdtSAFT1041_SDT_Item8[0] = GXt_objcol_SdtSAFT1041_SDT_Item7 ;
      new app.facturacion.saft1041_dp(remoteHandle, context).execute( AV28Emprcod, AV31Faccodfrom, AV32Faccodto, AV29FacFchFrom, AV30FacFchTo, AV43FirmaD, GXv_objcol_SdtSAFT1041_SDT_Item8) ;
      GXt_objcol_SdtSAFT1041_SDT_Item7 = GXv_objcol_SdtSAFT1041_SDT_Item8[0] ;
      AV13SAFT1041_SDT = GXt_objcol_SdtSAFT1041_SDT_Item7 ;
      gx_BV63 = true ;
      AV13SAFT1041_SDT.sort(httpContext.getMessage( "[EmprCod,FacFch,FacCod]", ""));
      gx_BV63 = true ;
   }

   public void e212452( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV6WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV20Session.getValue("Facturacion.SAFT1041_WCColumnsSelector"), "") != 0 )
      {
         AV16ColumnsSelectorXML = AV20Session.getValue("Facturacion.SAFT1041_WCColumnsSelector") ;
         AV18ColumnsSelector.fromxml(AV16ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S132 ();
         if (returnInSub) return;
      }
      chkavSaft1041_sdt__seleccionar1.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSaft1041_sdt__seleccionar1.getInternalname(), "Visible", GXutil.ltrimstr( chkavSaft1041_sdt__seleccionar1.getVisible(), 5, 0), !bGXsfl_63_Refreshing);
      chkavSaft1041_sdt__seleccionar2.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSaft1041_sdt__seleccionar2.getInternalname(), "Visible", GXutil.ltrimstr( chkavSaft1041_sdt__seleccionar2.getVisible(), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__facest_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__facest_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__facest_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__faccod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__faccod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__faccod_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__facfch_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__facfch_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__facfch_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__factot_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__factot_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__factot_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__factot1_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__factot1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__factot1_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__fachor_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__fachor_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__fachor_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__hhdt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__hhdt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__hhdt_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__dias_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__dias_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__dias_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__times_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__times_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__times_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__hhmmss_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__hhmmss_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__hhmmss_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__facfirdg_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__facfirdg_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__facfirdg_Visible), 5, 0), !bGXsfl_63_Refreshing);
      edtavSaft1041_sdt__facfirma_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaft1041_sdt__facfirma_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaft1041_sdt__facfirma_Visible), 5, 0), !bGXsfl_63_Refreshing);
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S142 ();
      if (returnInSub) return;
      AV26GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26GridCurrentPage), 10, 0));
      AV27GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27GridPageCount), 10, 0));
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
   }

   public void e112452( )
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

   public void e122452( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e222452( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV55GXV1 = 1 ;
      while ( AV55GXV1 <= AV13SAFT1041_SDT.size() )
      {
         AV13SAFT1041_SDT.currentItem( ((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV55GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(63) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_632( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_63_Refreshing )
         {
            httpContext.doAjaxLoad(63, GridRow);
         }
         AV55GXV1 = (int)(AV55GXV1+1) ;
      }
   }

   public void e132452( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV16ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV18ColumnsSelector.fromJSonString(AV16ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "Facturacion.SAFT1041_WCColumnsSelector", ((GXutil.strcmp("", AV16ColumnsSelectorXML)==0) ? "" : AV18ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
   }

   public void e152452( )
   {
      AV55GXV1 = (int)(nGXsfl_63_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV55GXV1 > 0 ) && ( AV13SAFT1041_SDT.size() >= AV55GXV1 ) )
      {
         AV13SAFT1041_SDT.currentItem( ((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV55GXV1)) );
      }
      /* 'DoIgualarTotal' Routine */
      returnInSub = false ;
      AV71GXV16 = 1 ;
      while ( AV71GXV16 <= AV13SAFT1041_SDT.size() )
      {
         AV33SAFT1041_SDT_item = (app.facturacion.SdtSAFT1041_SDT_Item)((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV71GXV16));
         if ( ( AV33SAFT1041_SDT_item.getgxTv_SdtSAFT1041_SDT_Item_Seleccionar2() ) && ( DecimalUtil.compareTo(AV33SAFT1041_SDT_item.getgxTv_SdtSAFT1041_SDT_Item_Factot(), AV33SAFT1041_SDT_item.getgxTv_SdtSAFT1041_SDT_Item_Factot1()) != 0 ) )
         {
            AV34Faccod = AV33SAFT1041_SDT_item.getgxTv_SdtSAFT1041_SDT_Item_Faccod() ;
            AV35FacHor = AV33SAFT1041_SDT_item.getgxTv_SdtSAFT1041_SDT_Item_Fachor() ;
            GXv_char4[0] = AV28Emprcod ;
            GXv_int10[0] = AV34Faccod ;
            GXv_dtime11[0] = AV35FacHor ;
            new app.pfiritems(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_dtime11) ;
            saft1041_wc_impl.this.AV28Emprcod = GXv_char4[0] ;
            saft1041_wc_impl.this.AV34Faccod = GXv_int10[0] ;
            saft1041_wc_impl.this.AV35FacHor = GXv_dtime11[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
         }
         AV71GXV16 = (int)(AV71GXV16+1) ;
      }
      GXt_objcol_SdtSAFT1041_SDT_Item7 = AV13SAFT1041_SDT ;
      GXv_objcol_SdtSAFT1041_SDT_Item8[0] = GXt_objcol_SdtSAFT1041_SDT_Item7 ;
      new app.facturacion.saft1041_dp(remoteHandle, context).execute( AV28Emprcod, AV31Faccodfrom, AV32Faccodto, AV29FacFchFrom, AV30FacFchTo, AV43FirmaD, GXv_objcol_SdtSAFT1041_SDT_Item8) ;
      GXt_objcol_SdtSAFT1041_SDT_Item7 = GXv_objcol_SdtSAFT1041_SDT_Item8[0] ;
      AV13SAFT1041_SDT = GXt_objcol_SdtSAFT1041_SDT_Item7 ;
      gx_BV63 = true ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13SAFT1041_SDT", AV13SAFT1041_SDT);
      nGXsfl_63_bak_idx = nGXsfl_63_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV18ColumnsSelector, AV70Pgmname, AV28Emprcod, AV29FacFchFrom, AV30FacFchTo, AV31Faccodfrom, AV32Faccodto, AV43FirmaD, AV44TaxReg, AV42CompanyId, AV45Dir, AV46Anyo, AV47CantidadRegistrosAProcesar, AV39UsurCod, sPrefix) ;
      nGXsfl_63_idx = nGXsfl_63_bak_idx ;
      sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_632( ) ;
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e162452 ();
      if (returnInSub) return;
   }

   public void e162452( )
   {
      AV55GXV1 = (int)(nGXsfl_63_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV55GXV1 > 0 ) && ( AV13SAFT1041_SDT.size() >= AV55GXV1 ) )
      {
         AV13SAFT1041_SDT.currentItem( ((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV55GXV1)) );
      }
      /* Enter Routine */
      returnInSub = false ;
      AV36error = (short)(0) ;
      lblTxtmensaje_Caption = " " ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
      AV72GXV17 = 1 ;
      while ( AV72GXV17 <= AV13SAFT1041_SDT.size() )
      {
         AV33SAFT1041_SDT_item = (app.facturacion.SdtSAFT1041_SDT_Item)((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV72GXV17));
         if ( AV33SAFT1041_SDT_item.getgxTv_SdtSAFT1041_SDT_Item_Seleccionar2() )
         {
            AV36error = (short)(1) ;
         }
         if ( AV33SAFT1041_SDT_item.getgxTv_SdtSAFT1041_SDT_Item_Seleccionar1() )
         {
            AV36error = (short)(2) ;
         }
         AV72GXV17 = (int)(AV72GXV17+1) ;
      }
      if ( AV36error == 1 )
      {
         lblTxtmensaje_Caption = httpContext.getMessage( "Revisar Linhas, columna OpT con Valor ¡¡¡", "") ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
      }
      else
      {
         if ( AV36error == 2 )
         {
            lblTxtmensaje_Caption = httpContext.getMessage( "Revisar Linhas, columna Op con Valor ¡¡¡", "") ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
         }
         else
         {
            this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_ENTERContainer", "Confirm", "", new Object[] {});
         }
      }
      /*  Sending Event outputs  */
   }

   public void e142452( )
   {
      AV55GXV1 = (int)(nGXsfl_63_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV55GXV1 > 0 ) && ( AV13SAFT1041_SDT.size() >= AV55GXV1 ) )
      {
         AV13SAFT1041_SDT.currentItem( ((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV55GXV1)) );
      }
      /* Dvelop_confirmpanel_enter_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_enter_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ENTER' */
         S152 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e172452( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e182452( )
   {
      AV55GXV1 = (int)(nGXsfl_63_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV55GXV1 > 0 ) && ( AV13SAFT1041_SDT.size() >= AV55GXV1 ) )
      {
         AV13SAFT1041_SDT.currentItem( ((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV55GXV1)) );
      }
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV49SAFT1041_SDT_json = AV13SAFT1041_SDT.toJSonString(false) ;
      AV50websession.setValue(httpContext.getMessage( "&SAFT1041_SDT_json", ""), AV49SAFT1041_SDT_json);
      GXv_char4[0] = AV14ExcelFilename ;
      GXv_char3[0] = AV15ErrorMessage ;
      new app.facturacion.saft1041_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      saft1041_wc_impl.this.AV14ExcelFilename = GXv_char4[0] ;
      saft1041_wc_impl.this.AV15ErrorMessage = GXv_char3[0] ;
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

   public void e192452( )
   {
      AV55GXV1 = (int)(nGXsfl_63_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV55GXV1 > 0 ) && ( AV13SAFT1041_SDT.size() >= AV55GXV1 ) )
      {
         AV13SAFT1041_SDT.currentItem( ((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV55GXV1)) );
      }
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV49SAFT1041_SDT_json = AV13SAFT1041_SDT.toJSonString(false) ;
      AV50websession.setValue(httpContext.getMessage( "&SAFT1041_SDT_json", ""), AV49SAFT1041_SDT_json);
      callWebObject(formatLink("app.facturacion.saft1041_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
   }

   public void S132( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV18ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "SAFT1041_SDT__Seleccionar1", "", "Op", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "SAFT1041_SDT__Seleccionar2", "", "OpT", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "SAFT1041_SDT__Facest", "", "E", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "SAFT1041_SDT__FacCod", "", "Fatura", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "SAFT1041_SDT__FacFch", "", "Data", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "SAFT1041_SDT__Factot", "", "Gross Total (Formula)", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "SAFT1041_SDT__Factot1", "", "Gross Total (Bdatos)", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "SAFT1041_SDT__FacHor", "", "Hora Facturaçao", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "SAFT1041_SDT__Hhdt", "", "Hhmm Calculada", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "SAFT1041_SDT__DiaS", "", "Dia Sistema", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "SAFT1041_SDT__TimeS", "", "Hora Sistema", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "SAFT1041_SDT__Hhmmss", "", "Hhmmss", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "SAFT1041_SDT__facfirdg", "", "Firma Digital Control", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "SAFT1041_SDT__FacFirma", "", "Hash", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXt_char1 = AV17UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Facturacion.SAFT1041_WCColumnsSelector", GXv_char4) ;
      saft1041_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV17UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV17UserCustomValue)==0) ) )
      {
         AV19ColumnsSelectorAux.fromxml(AV17UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector12[0] = AV19ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector13[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, GXv_SdtWWPColumnsSelector13) ;
         AV19ColumnsSelectorAux = GXv_SdtWWPColumnsSelector12[0] ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      }
   }

   public void S152( )
   {
      /* 'DO ACTION ENTER' Routine */
      returnInSub = false ;
      AV73GXV18 = 1 ;
      while ( AV73GXV18 <= AV13SAFT1041_SDT.size() )
      {
         AV33SAFT1041_SDT_item = (app.facturacion.SdtSAFT1041_SDT_Item)((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV73GXV18));
         AV34Faccod = AV33SAFT1041_SDT_item.getgxTv_SdtSAFT1041_SDT_Item_Faccod() ;
         GXv_char4[0] = AV28Emprcod ;
         GXv_int10[0] = AV34Faccod ;
         new app.facturacion.pfacclicod(remoteHandle, context).execute( GXv_char4, GXv_int10) ;
         saft1041_wc_impl.this.AV28Emprcod = GXv_char4[0] ;
         saft1041_wc_impl.this.AV34Faccod = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
         AV73GXV18 = (int)(AV73GXV18+1) ;
      }
      GXv_char4[0] = AV41var_File ;
      GXv_objcol_SdtMessages_Message14[0] = AV52messages ;
      new app.psaft1401(remoteHandle, context).execute( AV28Emprcod, AV29FacFchFrom, AV30FacFchTo, AV46Anyo, AV44TaxReg, AV42CompanyId, AV31Faccodfrom, AV32Faccodto, AV45Dir, GXv_char4, AV39UsurCod, AV47CantidadRegistrosAProcesar, GXv_objcol_SdtMessages_Message14) ;
      saft1041_wc_impl.this.AV41var_File = GXv_char4[0] ;
      AV52messages = GXv_objcol_SdtMessages_Message14[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41var_File", AV41var_File);
      httpContext.GX_msglist.addItem(AV41var_File);
   }

   public void S112( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue(AV70Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV70Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV20Session.getValue(AV70Pgmname+"GridState"), null, null);
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
      AV10GridState.fromxml(AV20Session.getValue(AV70Pgmname+"GridState"), null, null);
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      if ( ! (GXutil.strcmp("", AV28Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV28Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV29FacFchFrom)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FACFCHFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV29FacFchFrom, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV30FacFchTo)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FACFCHTO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV30FacFchTo, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV31Faccodfrom) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FACCODFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV31Faccodfrom, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV32Faccodto) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FACCODTO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV32Faccodto, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV43FirmaD) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FIRMAD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV43FirmaD, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV44TaxReg)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TAXREG" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV44TaxReg );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV42CompanyId)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&COMPANYID" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV42CompanyId );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV45Dir)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&DIR" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV45Dir );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV46Anyo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ANYO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV46Anyo, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV47CantidadRegistrosAProcesar) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CANTIDADREGISTROSAPROCESAR" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV47CantidadRegistrosAProcesar, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV70Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void wb_table1_93_2452( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_enter_Internalname, tblTabledvelop_confirmpanel_enter_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_enter.setProperty("Title", Dvelop_confirmpanel_enter_Title);
         ucDvelop_confirmpanel_enter.setProperty("ConfirmationText", Dvelop_confirmpanel_enter_Confirmationtext);
         ucDvelop_confirmpanel_enter.setProperty("YesButtonCaption", Dvelop_confirmpanel_enter_Yesbuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("NoButtonCaption", Dvelop_confirmpanel_enter_Nobuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("CancelButtonCaption", Dvelop_confirmpanel_enter_Cancelbuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("YesButtonPosition", Dvelop_confirmpanel_enter_Yesbuttonposition);
         ucDvelop_confirmpanel_enter.setProperty("ConfirmType", Dvelop_confirmpanel_enter_Confirmtype);
         ucDvelop_confirmpanel_enter.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_enter_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_ENTERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_ENTERContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_93_2452e( true) ;
      }
      else
      {
         wb_table1_93_2452e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV28Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
      AV29FacFchFrom = (java.util.Date)getParm(obj,1,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29FacFchFrom", localUtil.format(AV29FacFchFrom, "99/99/99"));
      AV30FacFchTo = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30FacFchTo", localUtil.format(AV30FacFchTo, "99/99/99"));
      AV31Faccodfrom = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31Faccodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Faccodfrom), 8, 0));
      AV32Faccodto = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Faccodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Faccodto), 8, 0));
      AV43FirmaD = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43FirmaD", GXutil.str( AV43FirmaD, 1, 0));
      AV44TaxReg = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TaxReg", AV44TaxReg);
      AV42CompanyId = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42CompanyId", AV42CompanyId);
      AV45Dir = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Dir", AV45Dir);
      AV46Anyo = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46Anyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46Anyo), 4, 0));
      AV47CantidadRegistrosAProcesar = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47CantidadRegistrosAProcesar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47CantidadRegistrosAProcesar), 4, 0));
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
      pa2452( ) ;
      ws2452( ) ;
      we2452( ) ;
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
      sCtrlAV29FacFchFrom = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV30FacFchTo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV31Faccodfrom = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV32Faccodto = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV43FirmaD = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV44TaxReg = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV42CompanyId = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV45Dir = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV46Anyo = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV47CantidadRegistrosAProcesar = (String)getParm(obj,10,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2452( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "facturacion\\saft1041_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa2452( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV28Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
         AV29FacFchFrom = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29FacFchFrom", localUtil.format(AV29FacFchFrom, "99/99/99"));
         AV30FacFchTo = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30FacFchTo", localUtil.format(AV30FacFchTo, "99/99/99"));
         AV31Faccodfrom = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31Faccodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Faccodfrom), 8, 0));
         AV32Faccodto = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Faccodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Faccodto), 8, 0));
         AV43FirmaD = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43FirmaD", GXutil.str( AV43FirmaD, 1, 0));
         AV44TaxReg = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TaxReg", AV44TaxReg);
         AV42CompanyId = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42CompanyId", AV42CompanyId);
         AV45Dir = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Dir", AV45Dir);
         AV46Anyo = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46Anyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46Anyo), 4, 0));
         AV47CantidadRegistrosAProcesar = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47CantidadRegistrosAProcesar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47CantidadRegistrosAProcesar), 4, 0));
      }
      wcpOAV28Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV28Emprcod") ;
      wcpOAV29FacFchFrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV29FacFchFrom"), 0) ;
      wcpOAV30FacFchTo = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV30FacFchTo"), 0) ;
      wcpOAV31Faccodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV31Faccodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV32Faccodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV32Faccodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV43FirmaD = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV43FirmaD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV44TaxReg = httpContext.cgiGet( sPrefix+"wcpOAV44TaxReg") ;
      wcpOAV42CompanyId = httpContext.cgiGet( sPrefix+"wcpOAV42CompanyId") ;
      wcpOAV45Dir = httpContext.cgiGet( sPrefix+"wcpOAV45Dir") ;
      wcpOAV46Anyo = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV46Anyo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV47CantidadRegistrosAProcesar = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV47CantidadRegistrosAProcesar"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV28Emprcod, wcpOAV28Emprcod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV29FacFchFrom), GXutil.resetTime(wcpOAV29FacFchFrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV30FacFchTo), GXutil.resetTime(wcpOAV30FacFchTo)) ) || ( AV31Faccodfrom != wcpOAV31Faccodfrom ) || ( AV32Faccodto != wcpOAV32Faccodto ) || ( AV43FirmaD != wcpOAV43FirmaD ) || ( GXutil.strcmp(AV44TaxReg, wcpOAV44TaxReg) != 0 ) || ( GXutil.strcmp(AV42CompanyId, wcpOAV42CompanyId) != 0 ) || ( GXutil.strcmp(AV45Dir, wcpOAV45Dir) != 0 ) || ( AV46Anyo != wcpOAV46Anyo ) || ( AV47CantidadRegistrosAProcesar != wcpOAV47CantidadRegistrosAProcesar ) ) )
      {
         setjustcreated();
      }
      wcpOAV28Emprcod = AV28Emprcod ;
      wcpOAV29FacFchFrom = AV29FacFchFrom ;
      wcpOAV30FacFchTo = AV30FacFchTo ;
      wcpOAV31Faccodfrom = AV31Faccodfrom ;
      wcpOAV32Faccodto = AV32Faccodto ;
      wcpOAV43FirmaD = AV43FirmaD ;
      wcpOAV44TaxReg = AV44TaxReg ;
      wcpOAV42CompanyId = AV42CompanyId ;
      wcpOAV45Dir = AV45Dir ;
      wcpOAV46Anyo = AV46Anyo ;
      wcpOAV47CantidadRegistrosAProcesar = AV47CantidadRegistrosAProcesar ;
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
      sCtrlAV29FacFchFrom = httpContext.cgiGet( sPrefix+"AV29FacFchFrom_CTRL") ;
      if ( GXutil.len( sCtrlAV29FacFchFrom) > 0 )
      {
         AV29FacFchFrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV29FacFchFrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29FacFchFrom", localUtil.format(AV29FacFchFrom, "99/99/99"));
      }
      else
      {
         AV29FacFchFrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV29FacFchFrom_PARM"), 0) ;
      }
      sCtrlAV30FacFchTo = httpContext.cgiGet( sPrefix+"AV30FacFchTo_CTRL") ;
      if ( GXutil.len( sCtrlAV30FacFchTo) > 0 )
      {
         AV30FacFchTo = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV30FacFchTo), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30FacFchTo", localUtil.format(AV30FacFchTo, "99/99/99"));
      }
      else
      {
         AV30FacFchTo = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV30FacFchTo_PARM"), 0) ;
      }
      sCtrlAV31Faccodfrom = httpContext.cgiGet( sPrefix+"AV31Faccodfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV31Faccodfrom) > 0 )
      {
         AV31Faccodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV31Faccodfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31Faccodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Faccodfrom), 8, 0));
      }
      else
      {
         AV31Faccodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV31Faccodfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV32Faccodto = httpContext.cgiGet( sPrefix+"AV32Faccodto_CTRL") ;
      if ( GXutil.len( sCtrlAV32Faccodto) > 0 )
      {
         AV32Faccodto = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV32Faccodto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Faccodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Faccodto), 8, 0));
      }
      else
      {
         AV32Faccodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV32Faccodto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV43FirmaD = httpContext.cgiGet( sPrefix+"AV43FirmaD_CTRL") ;
      if ( GXutil.len( sCtrlAV43FirmaD) > 0 )
      {
         AV43FirmaD = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV43FirmaD), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43FirmaD", GXutil.str( AV43FirmaD, 1, 0));
      }
      else
      {
         AV43FirmaD = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV43FirmaD_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV44TaxReg = httpContext.cgiGet( sPrefix+"AV44TaxReg_CTRL") ;
      if ( GXutil.len( sCtrlAV44TaxReg) > 0 )
      {
         AV44TaxReg = httpContext.cgiGet( sCtrlAV44TaxReg) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TaxReg", AV44TaxReg);
      }
      else
      {
         AV44TaxReg = httpContext.cgiGet( sPrefix+"AV44TaxReg_PARM") ;
      }
      sCtrlAV42CompanyId = httpContext.cgiGet( sPrefix+"AV42CompanyId_CTRL") ;
      if ( GXutil.len( sCtrlAV42CompanyId) > 0 )
      {
         AV42CompanyId = httpContext.cgiGet( sCtrlAV42CompanyId) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42CompanyId", AV42CompanyId);
      }
      else
      {
         AV42CompanyId = httpContext.cgiGet( sPrefix+"AV42CompanyId_PARM") ;
      }
      sCtrlAV45Dir = httpContext.cgiGet( sPrefix+"AV45Dir_CTRL") ;
      if ( GXutil.len( sCtrlAV45Dir) > 0 )
      {
         AV45Dir = httpContext.cgiGet( sCtrlAV45Dir) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Dir", AV45Dir);
      }
      else
      {
         AV45Dir = httpContext.cgiGet( sPrefix+"AV45Dir_PARM") ;
      }
      sCtrlAV46Anyo = httpContext.cgiGet( sPrefix+"AV46Anyo_CTRL") ;
      if ( GXutil.len( sCtrlAV46Anyo) > 0 )
      {
         AV46Anyo = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV46Anyo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46Anyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46Anyo), 4, 0));
      }
      else
      {
         AV46Anyo = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV46Anyo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV47CantidadRegistrosAProcesar = httpContext.cgiGet( sPrefix+"AV47CantidadRegistrosAProcesar_CTRL") ;
      if ( GXutil.len( sCtrlAV47CantidadRegistrosAProcesar) > 0 )
      {
         AV47CantidadRegistrosAProcesar = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV47CantidadRegistrosAProcesar), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47CantidadRegistrosAProcesar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47CantidadRegistrosAProcesar), 4, 0));
      }
      else
      {
         AV47CantidadRegistrosAProcesar = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV47CantidadRegistrosAProcesar_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa2452( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2452( ) ;
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
      ws2452( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29FacFchFrom_PARM", localUtil.dtoc( AV29FacFchFrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV29FacFchFrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29FacFchFrom_CTRL", GXutil.rtrim( sCtrlAV29FacFchFrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30FacFchTo_PARM", localUtil.dtoc( AV30FacFchTo, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV30FacFchTo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30FacFchTo_CTRL", GXutil.rtrim( sCtrlAV30FacFchTo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31Faccodfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV31Faccodfrom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV31Faccodfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31Faccodfrom_CTRL", GXutil.rtrim( sCtrlAV31Faccodfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32Faccodto_PARM", GXutil.ltrim( localUtil.ntoc( AV32Faccodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV32Faccodto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32Faccodto_CTRL", GXutil.rtrim( sCtrlAV32Faccodto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43FirmaD_PARM", GXutil.ltrim( localUtil.ntoc( AV43FirmaD, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV43FirmaD)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43FirmaD_CTRL", GXutil.rtrim( sCtrlAV43FirmaD));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44TaxReg_PARM", GXutil.rtrim( AV44TaxReg));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV44TaxReg)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44TaxReg_CTRL", GXutil.rtrim( sCtrlAV44TaxReg));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42CompanyId_PARM", GXutil.rtrim( AV42CompanyId));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV42CompanyId)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42CompanyId_CTRL", GXutil.rtrim( sCtrlAV42CompanyId));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45Dir_PARM", GXutil.rtrim( AV45Dir));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV45Dir)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45Dir_CTRL", GXutil.rtrim( sCtrlAV45Dir));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV46Anyo_PARM", GXutil.ltrim( localUtil.ntoc( AV46Anyo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV46Anyo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV46Anyo_CTRL", GXutil.rtrim( sCtrlAV46Anyo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47CantidadRegistrosAProcesar_PARM", GXutil.ltrim( localUtil.ntoc( AV47CantidadRegistrosAProcesar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV47CantidadRegistrosAProcesar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47CantidadRegistrosAProcesar_CTRL", GXutil.rtrim( sCtrlAV47CantidadRegistrosAProcesar));
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
      we2452( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115553615", true, true);
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
      httpContext.AddJavascriptSource("facturacion/saft1041_wc.js", "?202682115553616", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_632( )
   {
      chkavSaft1041_sdt__seleccionar1.setInternalname( sPrefix+"SAFT1041_SDT__SELECCIONAR1_"+sGXsfl_63_idx );
      chkavSaft1041_sdt__seleccionar2.setInternalname( sPrefix+"SAFT1041_SDT__SELECCIONAR2_"+sGXsfl_63_idx );
      edtavSaft1041_sdt__facest_Internalname = sPrefix+"SAFT1041_SDT__FACEST_"+sGXsfl_63_idx ;
      edtavSaft1041_sdt__faccod_Internalname = sPrefix+"SAFT1041_SDT__FACCOD_"+sGXsfl_63_idx ;
      edtavSaft1041_sdt__facfch_Internalname = sPrefix+"SAFT1041_SDT__FACFCH_"+sGXsfl_63_idx ;
      edtavSaft1041_sdt__factot_Internalname = sPrefix+"SAFT1041_SDT__FACTOT_"+sGXsfl_63_idx ;
      edtavSaft1041_sdt__factot1_Internalname = sPrefix+"SAFT1041_SDT__FACTOT1_"+sGXsfl_63_idx ;
      edtavSaft1041_sdt__fachor_Internalname = sPrefix+"SAFT1041_SDT__FACHOR_"+sGXsfl_63_idx ;
      edtavSaft1041_sdt__hhdt_Internalname = sPrefix+"SAFT1041_SDT__HHDT_"+sGXsfl_63_idx ;
      edtavSaft1041_sdt__dias_Internalname = sPrefix+"SAFT1041_SDT__DIAS_"+sGXsfl_63_idx ;
      edtavSaft1041_sdt__times_Internalname = sPrefix+"SAFT1041_SDT__TIMES_"+sGXsfl_63_idx ;
      edtavSaft1041_sdt__hhmmss_Internalname = sPrefix+"SAFT1041_SDT__HHMMSS_"+sGXsfl_63_idx ;
      edtavSaft1041_sdt__facfirdg_Internalname = sPrefix+"SAFT1041_SDT__FACFIRDG_"+sGXsfl_63_idx ;
      edtavSaft1041_sdt__facfirma_Internalname = sPrefix+"SAFT1041_SDT__FACFIRMA_"+sGXsfl_63_idx ;
   }

   public void subsflControlProps_fel_632( )
   {
      chkavSaft1041_sdt__seleccionar1.setInternalname( sPrefix+"SAFT1041_SDT__SELECCIONAR1_"+sGXsfl_63_fel_idx );
      chkavSaft1041_sdt__seleccionar2.setInternalname( sPrefix+"SAFT1041_SDT__SELECCIONAR2_"+sGXsfl_63_fel_idx );
      edtavSaft1041_sdt__facest_Internalname = sPrefix+"SAFT1041_SDT__FACEST_"+sGXsfl_63_fel_idx ;
      edtavSaft1041_sdt__faccod_Internalname = sPrefix+"SAFT1041_SDT__FACCOD_"+sGXsfl_63_fel_idx ;
      edtavSaft1041_sdt__facfch_Internalname = sPrefix+"SAFT1041_SDT__FACFCH_"+sGXsfl_63_fel_idx ;
      edtavSaft1041_sdt__factot_Internalname = sPrefix+"SAFT1041_SDT__FACTOT_"+sGXsfl_63_fel_idx ;
      edtavSaft1041_sdt__factot1_Internalname = sPrefix+"SAFT1041_SDT__FACTOT1_"+sGXsfl_63_fel_idx ;
      edtavSaft1041_sdt__fachor_Internalname = sPrefix+"SAFT1041_SDT__FACHOR_"+sGXsfl_63_fel_idx ;
      edtavSaft1041_sdt__hhdt_Internalname = sPrefix+"SAFT1041_SDT__HHDT_"+sGXsfl_63_fel_idx ;
      edtavSaft1041_sdt__dias_Internalname = sPrefix+"SAFT1041_SDT__DIAS_"+sGXsfl_63_fel_idx ;
      edtavSaft1041_sdt__times_Internalname = sPrefix+"SAFT1041_SDT__TIMES_"+sGXsfl_63_fel_idx ;
      edtavSaft1041_sdt__hhmmss_Internalname = sPrefix+"SAFT1041_SDT__HHMMSS_"+sGXsfl_63_fel_idx ;
      edtavSaft1041_sdt__facfirdg_Internalname = sPrefix+"SAFT1041_SDT__FACFIRDG_"+sGXsfl_63_fel_idx ;
      edtavSaft1041_sdt__facfirma_Internalname = sPrefix+"SAFT1041_SDT__FACFIRMA_"+sGXsfl_63_fel_idx ;
   }

   public void sendrow_632( )
   {
      subsflControlProps_632( ) ;
      wb2450( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_63_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_63_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_63_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavSaft1041_sdt__seleccionar1.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "SAFT1041_SDT__SELECCIONAR1_" + sGXsfl_63_idx ;
         chkavSaft1041_sdt__seleccionar1.setName( GXCCtl );
         chkavSaft1041_sdt__seleccionar1.setWebtags( "" );
         chkavSaft1041_sdt__seleccionar1.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSaft1041_sdt__seleccionar1.getInternalname(), "TitleCaption", chkavSaft1041_sdt__seleccionar1.getCaption(), !bGXsfl_63_Refreshing);
         chkavSaft1041_sdt__seleccionar1.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSaft1041_sdt__seleccionar1.getInternalname(),GXutil.booltostr( ((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtSAFT1041_SDT_Item_Seleccionar1()),"","",Integer.valueOf(chkavSaft1041_sdt__seleccionar1.getVisible()),Integer.valueOf(chkavSaft1041_sdt__seleccionar1.getEnabled()),"true","",StyleString,ClassString,"WWColumn","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavSaft1041_sdt__seleccionar2.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "SAFT1041_SDT__SELECCIONAR2_" + sGXsfl_63_idx ;
         chkavSaft1041_sdt__seleccionar2.setName( GXCCtl );
         chkavSaft1041_sdt__seleccionar2.setWebtags( "" );
         chkavSaft1041_sdt__seleccionar2.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSaft1041_sdt__seleccionar2.getInternalname(), "TitleCaption", chkavSaft1041_sdt__seleccionar2.getCaption(), !bGXsfl_63_Refreshing);
         chkavSaft1041_sdt__seleccionar2.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSaft1041_sdt__seleccionar2.getInternalname(),GXutil.booltostr( ((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtSAFT1041_SDT_Item_Seleccionar2()),"","",Integer.valueOf(chkavSaft1041_sdt__seleccionar2.getVisible()),Integer.valueOf(chkavSaft1041_sdt__seleccionar2.getEnabled()),"true","",StyleString,ClassString,"WWColumn","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSaft1041_sdt__facest_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSaft1041_sdt__facest_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtSAFT1041_SDT_Item_Facest(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSaft1041_sdt__facest_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtSAFT1041_SDT_Item_Facest()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtSAFT1041_SDT_Item_Facest()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSaft1041_sdt__facest_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSaft1041_sdt__facest_Visible),Integer.valueOf(edtavSaft1041_sdt__facest_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSaft1041_sdt__faccod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSaft1041_sdt__faccod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtSAFT1041_SDT_Item_Faccod(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSaft1041_sdt__faccod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtSAFT1041_SDT_Item_Faccod()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtSAFT1041_SDT_Item_Faccod()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSaft1041_sdt__faccod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSaft1041_sdt__faccod_Visible),Integer.valueOf(edtavSaft1041_sdt__faccod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSaft1041_sdt__facfch_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSaft1041_sdt__facfch_Internalname,localUtil.format(((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtSAFT1041_SDT_Item_Facfch(), "99/99/99"),localUtil.format( ((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtSAFT1041_SDT_Item_Facfch(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSaft1041_sdt__facfch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSaft1041_sdt__facfch_Visible),Integer.valueOf(edtavSaft1041_sdt__facfch_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSaft1041_sdt__factot_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSaft1041_sdt__factot_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtSAFT1041_SDT_Item_Factot(), (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSaft1041_sdt__factot_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtSAFT1041_SDT_Item_Factot(), "ZZZZZZZZZ9.99") : localUtil.format( ((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtSAFT1041_SDT_Item_Factot(), "ZZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSaft1041_sdt__factot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSaft1041_sdt__factot_Visible),Integer.valueOf(edtavSaft1041_sdt__factot_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSaft1041_sdt__factot1_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSaft1041_sdt__factot1_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtSAFT1041_SDT_Item_Factot1(), (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSaft1041_sdt__factot1_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtSAFT1041_SDT_Item_Factot1(), "ZZZZZZZZZ9.99999") : localUtil.format( ((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtSAFT1041_SDT_Item_Factot1(), "ZZZZZZZZZ9.99999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSaft1041_sdt__factot1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSaft1041_sdt__factot1_Visible),Integer.valueOf(edtavSaft1041_sdt__factot1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSaft1041_sdt__fachor_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSaft1041_sdt__fachor_Internalname,localUtil.ttoc( ((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtSAFT1041_SDT_Item_Fachor(), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( ((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtSAFT1041_SDT_Item_Fachor(), "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSaft1041_sdt__fachor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSaft1041_sdt__fachor_Visible),Integer.valueOf(edtavSaft1041_sdt__fachor_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSaft1041_sdt__hhdt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSaft1041_sdt__hhdt_Internalname,localUtil.ttoc( ((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtSAFT1041_SDT_Item_Hhdt(), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( ((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtSAFT1041_SDT_Item_Hhdt(), "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSaft1041_sdt__hhdt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSaft1041_sdt__hhdt_Visible),Integer.valueOf(edtavSaft1041_sdt__hhdt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSaft1041_sdt__dias_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSaft1041_sdt__dias_Internalname,GXutil.rtrim( ((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtSAFT1041_SDT_Item_Dias()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSaft1041_sdt__dias_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSaft1041_sdt__dias_Visible),Integer.valueOf(edtavSaft1041_sdt__dias_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSaft1041_sdt__times_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSaft1041_sdt__times_Internalname,GXutil.rtrim( ((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtSAFT1041_SDT_Item_Times()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSaft1041_sdt__times_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSaft1041_sdt__times_Visible),Integer.valueOf(edtavSaft1041_sdt__times_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSaft1041_sdt__hhmmss_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSaft1041_sdt__hhmmss_Internalname,GXutil.rtrim( ((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtSAFT1041_SDT_Item_Hhmmss()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSaft1041_sdt__hhmmss_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSaft1041_sdt__hhmmss_Visible),Integer.valueOf(edtavSaft1041_sdt__hhmmss_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSaft1041_sdt__facfirdg_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSaft1041_sdt__facfirdg_Internalname,GXutil.rtrim( ((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtSAFT1041_SDT_Item_Facfirdg()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSaft1041_sdt__facfirdg_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSaft1041_sdt__facfirdg_Visible),Integer.valueOf(edtavSaft1041_sdt__facfirdg_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSaft1041_sdt__facfirma_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSaft1041_sdt__facfirma_Internalname,GXutil.rtrim( ((app.facturacion.SdtSAFT1041_SDT_Item)AV13SAFT1041_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtSAFT1041_SDT_Item_Facfirma()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSaft1041_sdt__facfirma_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSaft1041_sdt__facfirma_Visible),Integer.valueOf(edtavSaft1041_sdt__facfirma_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes2452( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_63_idx = ((subGrid_Islastpage==1)&&(nGXsfl_63_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_63_idx+1) ;
         sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_632( ) ;
      }
      /* End function sendrow_632 */
   }

   public void startgridcontrol63( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"63\">") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavSaft1041_sdt__seleccionar1.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Op", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavSaft1041_sdt__seleccionar2.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "OpT", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSaft1041_sdt__facest_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSaft1041_sdt__faccod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fatura", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSaft1041_sdt__facfch_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Data", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSaft1041_sdt__factot_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Gross Total (Formula)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSaft1041_sdt__factot1_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Gross Total (Bdatos)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSaft1041_sdt__fachor_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hora Facturaçao", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSaft1041_sdt__hhdt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hhmm Calculada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSaft1041_sdt__dias_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dia Sistema", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSaft1041_sdt__times_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hora Sistema", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSaft1041_sdt__hhmmss_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hhmmss", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSaft1041_sdt__facfirdg_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Firma Digital Control", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSaft1041_sdt__facfirma_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hash", "")) ;
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
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkavSaft1041_sdt__seleccionar1.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavSaft1041_sdt__seleccionar1.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkavSaft1041_sdt__seleccionar2.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavSaft1041_sdt__seleccionar2.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSaft1041_sdt__facest_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSaft1041_sdt__facest_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSaft1041_sdt__faccod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSaft1041_sdt__faccod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSaft1041_sdt__facfch_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSaft1041_sdt__facfch_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSaft1041_sdt__factot_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSaft1041_sdt__factot_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSaft1041_sdt__factot1_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSaft1041_sdt__factot1_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSaft1041_sdt__fachor_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSaft1041_sdt__fachor_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSaft1041_sdt__hhdt_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSaft1041_sdt__hhdt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSaft1041_sdt__dias_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSaft1041_sdt__dias_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSaft1041_sdt__times_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSaft1041_sdt__times_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSaft1041_sdt__hhmmss_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSaft1041_sdt__hhmmss_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSaft1041_sdt__facfirdg_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSaft1041_sdt__facfirdg_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSaft1041_sdt__facfirma_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSaft1041_sdt__facfirma_Visible, (byte)(5), (byte)(0), ".", "")));
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
      Progressbar_Internalname = sPrefix+"PROGRESSBAR" ;
      lblTextblockcantidadregistrosaprocesar_Internalname = sPrefix+"TEXTBLOCKCANTIDADREGISTROSAPROCESAR" ;
      edtavCantidadregistrosaprocesar_Internalname = sPrefix+"vCANTIDADREGISTROSAPROCESAR" ;
      divUnnamedtablecantidadregistrosaprocesar_Internalname = sPrefix+"UNNAMEDTABLECANTIDADREGISTROSAPROCESAR" ;
      lblTextblockvar_file_Internalname = sPrefix+"TEXTBLOCKVAR_FILE" ;
      edtavVar_file_Internalname = sPrefix+"vVAR_FILE" ;
      divUnnamedtablevar_file_Internalname = sPrefix+"UNNAMEDTABLEVAR_FILE" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      lblTxtmensaje_Internalname = sPrefix+"TXTMENSAJE" ;
      bttBtnigualartotal_Internalname = sPrefix+"BTNIGUALARTOTAL" ;
      bttBtnenter_Internalname = sPrefix+"BTNENTER" ;
      bttBtncerrar_Internalname = sPrefix+"BTNCERRAR" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      chkavSaft1041_sdt__seleccionar1.setInternalname( sPrefix+"SAFT1041_SDT__SELECCIONAR1" );
      chkavSaft1041_sdt__seleccionar2.setInternalname( sPrefix+"SAFT1041_SDT__SELECCIONAR2" );
      edtavSaft1041_sdt__facest_Internalname = sPrefix+"SAFT1041_SDT__FACEST" ;
      edtavSaft1041_sdt__faccod_Internalname = sPrefix+"SAFT1041_SDT__FACCOD" ;
      edtavSaft1041_sdt__facfch_Internalname = sPrefix+"SAFT1041_SDT__FACFCH" ;
      edtavSaft1041_sdt__factot_Internalname = sPrefix+"SAFT1041_SDT__FACTOT" ;
      edtavSaft1041_sdt__factot1_Internalname = sPrefix+"SAFT1041_SDT__FACTOT1" ;
      edtavSaft1041_sdt__fachor_Internalname = sPrefix+"SAFT1041_SDT__FACHOR" ;
      edtavSaft1041_sdt__hhdt_Internalname = sPrefix+"SAFT1041_SDT__HHDT" ;
      edtavSaft1041_sdt__dias_Internalname = sPrefix+"SAFT1041_SDT__DIAS" ;
      edtavSaft1041_sdt__times_Internalname = sPrefix+"SAFT1041_SDT__TIMES" ;
      edtavSaft1041_sdt__hhmmss_Internalname = sPrefix+"SAFT1041_SDT__HHMMSS" ;
      edtavSaft1041_sdt__facfirdg_Internalname = sPrefix+"SAFT1041_SDT__FACFIRDG" ;
      edtavSaft1041_sdt__facfirma_Internalname = sPrefix+"SAFT1041_SDT__FACFIRMA" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_enter_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_ENTER" ;
      tblTabledvelop_confirmpanel_enter_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_ENTER" ;
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
      edtavSaft1041_sdt__facfirma_Jsonclick = "" ;
      edtavSaft1041_sdt__facfirma_Enabled = 0 ;
      edtavSaft1041_sdt__facfirma_Visible = -1 ;
      edtavSaft1041_sdt__facfirdg_Jsonclick = "" ;
      edtavSaft1041_sdt__facfirdg_Enabled = 0 ;
      edtavSaft1041_sdt__facfirdg_Visible = -1 ;
      edtavSaft1041_sdt__hhmmss_Jsonclick = "" ;
      edtavSaft1041_sdt__hhmmss_Enabled = 0 ;
      edtavSaft1041_sdt__hhmmss_Visible = -1 ;
      edtavSaft1041_sdt__times_Jsonclick = "" ;
      edtavSaft1041_sdt__times_Enabled = 0 ;
      edtavSaft1041_sdt__times_Visible = -1 ;
      edtavSaft1041_sdt__dias_Jsonclick = "" ;
      edtavSaft1041_sdt__dias_Enabled = 0 ;
      edtavSaft1041_sdt__dias_Visible = -1 ;
      edtavSaft1041_sdt__hhdt_Jsonclick = "" ;
      edtavSaft1041_sdt__hhdt_Enabled = 0 ;
      edtavSaft1041_sdt__hhdt_Visible = -1 ;
      edtavSaft1041_sdt__fachor_Jsonclick = "" ;
      edtavSaft1041_sdt__fachor_Enabled = 0 ;
      edtavSaft1041_sdt__fachor_Visible = -1 ;
      edtavSaft1041_sdt__factot1_Jsonclick = "" ;
      edtavSaft1041_sdt__factot1_Enabled = 0 ;
      edtavSaft1041_sdt__factot1_Visible = -1 ;
      edtavSaft1041_sdt__factot_Jsonclick = "" ;
      edtavSaft1041_sdt__factot_Enabled = 0 ;
      edtavSaft1041_sdt__factot_Visible = -1 ;
      edtavSaft1041_sdt__facfch_Jsonclick = "" ;
      edtavSaft1041_sdt__facfch_Enabled = 0 ;
      edtavSaft1041_sdt__facfch_Visible = -1 ;
      edtavSaft1041_sdt__faccod_Jsonclick = "" ;
      edtavSaft1041_sdt__faccod_Enabled = 0 ;
      edtavSaft1041_sdt__faccod_Visible = -1 ;
      edtavSaft1041_sdt__facest_Jsonclick = "" ;
      edtavSaft1041_sdt__facest_Enabled = 0 ;
      edtavSaft1041_sdt__facest_Visible = -1 ;
      chkavSaft1041_sdt__seleccionar2.setCaption( "" );
      chkavSaft1041_sdt__seleccionar2.setEnabled( 0 );
      chkavSaft1041_sdt__seleccionar2.setVisible( -1 );
      chkavSaft1041_sdt__seleccionar1.setCaption( "" );
      chkavSaft1041_sdt__seleccionar1.setEnabled( 0 );
      chkavSaft1041_sdt__seleccionar1.setVisible( -1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavSaft1041_sdt__facfirma_Visible = -1 ;
      edtavSaft1041_sdt__facfirdg_Visible = -1 ;
      edtavSaft1041_sdt__hhmmss_Visible = -1 ;
      edtavSaft1041_sdt__times_Visible = -1 ;
      edtavSaft1041_sdt__dias_Visible = -1 ;
      edtavSaft1041_sdt__hhdt_Visible = -1 ;
      edtavSaft1041_sdt__fachor_Visible = -1 ;
      edtavSaft1041_sdt__factot1_Visible = -1 ;
      edtavSaft1041_sdt__factot_Visible = -1 ;
      edtavSaft1041_sdt__facfch_Visible = -1 ;
      edtavSaft1041_sdt__faccod_Visible = -1 ;
      edtavSaft1041_sdt__facest_Visible = -1 ;
      chkavSaft1041_sdt__seleccionar2.setVisible( -1 );
      chkavSaft1041_sdt__seleccionar1.setVisible( -1 );
      subGrid_Sortable = (byte)(0) ;
      edtavSaft1041_sdt__facfirma_Enabled = -1 ;
      edtavSaft1041_sdt__facfirdg_Enabled = -1 ;
      edtavSaft1041_sdt__hhmmss_Enabled = -1 ;
      edtavSaft1041_sdt__times_Enabled = -1 ;
      edtavSaft1041_sdt__dias_Enabled = -1 ;
      edtavSaft1041_sdt__hhdt_Enabled = -1 ;
      edtavSaft1041_sdt__fachor_Enabled = -1 ;
      edtavSaft1041_sdt__factot1_Enabled = -1 ;
      edtavSaft1041_sdt__factot_Enabled = -1 ;
      edtavSaft1041_sdt__facfch_Enabled = -1 ;
      edtavSaft1041_sdt__faccod_Enabled = -1 ;
      edtavSaft1041_sdt__facest_Enabled = -1 ;
      chkavSaft1041_sdt__seleccionar2.setEnabled( -1 );
      chkavSaft1041_sdt__seleccionar1.setEnabled( -1 );
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      lblTxtmensaje_Caption = "" ;
      edtavVar_file_Jsonclick = "" ;
      edtavVar_file_Enabled = 1 ;
      edtavCantidadregistrosaprocesar_Jsonclick = "" ;
      edtavCantidadregistrosaprocesar_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_enter_Confirmtype = "1" ;
      Dvelop_confirmpanel_enter_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_enter_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_enter_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_enter_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_enter_Confirmationtext = "¿Deseja criar o ficheiro SAFT?" ;
      Dvelop_confirmpanel_enter_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "|||||||||||||" ;
      Ddo_grid_Columnids = "0:SAFT1041_SDT__Seleccionar1|1:SAFT1041_SDT__Seleccionar2|2:SAFT1041_SDT__Facest|3:SAFT1041_SDT__FacCod|4:SAFT1041_SDT__FacFch|5:SAFT1041_SDT__Factot|6:SAFT1041_SDT__Factot1|7:SAFT1041_SDT__FacHor|8:SAFT1041_SDT__Hhdt|9:SAFT1041_SDT__DiaS|10:SAFT1041_SDT__TimeS|11:SAFT1041_SDT__Hhmmss|12:SAFT1041_SDT__facfirdg|13:SAFT1041_SDT__FacFirma" ;
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
      GXCCtl = "SAFT1041_SDT__SELECCIONAR1_" + sGXsfl_63_idx ;
      chkavSaft1041_sdt__seleccionar1.setName( GXCCtl );
      chkavSaft1041_sdt__seleccionar1.setWebtags( "" );
      chkavSaft1041_sdt__seleccionar1.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSaft1041_sdt__seleccionar1.getInternalname(), "TitleCaption", chkavSaft1041_sdt__seleccionar1.getCaption(), !bGXsfl_63_Refreshing);
      chkavSaft1041_sdt__seleccionar1.setCheckedValue( "false" );
      GXCCtl = "SAFT1041_SDT__SELECCIONAR2_" + sGXsfl_63_idx ;
      chkavSaft1041_sdt__seleccionar2.setName( GXCCtl );
      chkavSaft1041_sdt__seleccionar2.setWebtags( "" );
      chkavSaft1041_sdt__seleccionar2.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSaft1041_sdt__seleccionar2.getInternalname(), "TitleCaption", chkavSaft1041_sdt__seleccionar2.getCaption(), !bGXsfl_63_Refreshing);
      chkavSaft1041_sdt__seleccionar2.setCheckedValue( "false" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV13SAFT1041_SDT',fld:'vSAFT1041_SDT',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63},{av:'sPrefix'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV70Pgmname',fld:'vPGMNAME',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29FacFchFrom',fld:'vFACFCHFROM',pic:''},{av:'AV30FacFchTo',fld:'vFACFCHTO',pic:''},{av:'AV31Faccodfrom',fld:'vFACCODFROM',pic:'ZZZZZZZ9'},{av:'AV32Faccodto',fld:'vFACCODTO',pic:'ZZZZZZZ9'},{av:'AV43FirmaD',fld:'vFIRMAD',pic:'9'},{av:'AV44TaxReg',fld:'vTAXREG',pic:''},{av:'AV42CompanyId',fld:'vCOMPANYID',pic:''},{av:'AV45Dir',fld:'vDIR',pic:''},{av:'AV46Anyo',fld:'vANYO',pic:'ZZZ9'},{av:'AV47CantidadRegistrosAProcesar',fld:'vCANTIDADREGISTROSAPROCESAR',pic:'ZZZ9'},{av:'AV39UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'SAFT1041_SDT__SELECCIONAR1',prop:'Visible'},{ctrl:'SAFT1041_SDT__SELECCIONAR2',prop:'Visible'},{ctrl:'SAFT1041_SDT__FACEST',prop:'Visible'},{ctrl:'SAFT1041_SDT__FACCOD',prop:'Visible'},{ctrl:'SAFT1041_SDT__FACFCH',prop:'Visible'},{ctrl:'SAFT1041_SDT__FACTOT',prop:'Visible'},{ctrl:'SAFT1041_SDT__FACTOT1',prop:'Visible'},{ctrl:'SAFT1041_SDT__FACHOR',prop:'Visible'},{ctrl:'SAFT1041_SDT__HHDT',prop:'Visible'},{ctrl:'SAFT1041_SDT__DIAS',prop:'Visible'},{ctrl:'SAFT1041_SDT__TIMES',prop:'Visible'},{ctrl:'SAFT1041_SDT__HHMMSS',prop:'Visible'},{ctrl:'SAFT1041_SDT__FACFIRDG',prop:'Visible'},{ctrl:'SAFT1041_SDT__FACFIRMA',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e112452',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV13SAFT1041_SDT',fld:'vSAFT1041_SDT',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV70Pgmname',fld:'vPGMNAME',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29FacFchFrom',fld:'vFACFCHFROM',pic:''},{av:'AV30FacFchTo',fld:'vFACFCHTO',pic:''},{av:'AV31Faccodfrom',fld:'vFACCODFROM',pic:'ZZZZZZZ9'},{av:'AV32Faccodto',fld:'vFACCODTO',pic:'ZZZZZZZ9'},{av:'AV43FirmaD',fld:'vFIRMAD',pic:'9'},{av:'AV44TaxReg',fld:'vTAXREG',pic:''},{av:'AV42CompanyId',fld:'vCOMPANYID',pic:''},{av:'AV45Dir',fld:'vDIR',pic:''},{av:'AV46Anyo',fld:'vANYO',pic:'ZZZ9'},{av:'AV47CantidadRegistrosAProcesar',fld:'vCANTIDADREGISTROSAPROCESAR',pic:'ZZZ9'},{av:'AV39UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e122452',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV13SAFT1041_SDT',fld:'vSAFT1041_SDT',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV70Pgmname',fld:'vPGMNAME',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29FacFchFrom',fld:'vFACFCHFROM',pic:''},{av:'AV30FacFchTo',fld:'vFACFCHTO',pic:''},{av:'AV31Faccodfrom',fld:'vFACCODFROM',pic:'ZZZZZZZ9'},{av:'AV32Faccodto',fld:'vFACCODTO',pic:'ZZZZZZZ9'},{av:'AV43FirmaD',fld:'vFIRMAD',pic:'9'},{av:'AV44TaxReg',fld:'vTAXREG',pic:''},{av:'AV42CompanyId',fld:'vCOMPANYID',pic:''},{av:'AV45Dir',fld:'vDIR',pic:''},{av:'AV46Anyo',fld:'vANYO',pic:'ZZZ9'},{av:'AV47CantidadRegistrosAProcesar',fld:'vCANTIDADREGISTROSAPROCESAR',pic:'ZZZ9'},{av:'AV39UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e222452',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e132452',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV13SAFT1041_SDT',fld:'vSAFT1041_SDT',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV70Pgmname',fld:'vPGMNAME',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29FacFchFrom',fld:'vFACFCHFROM',pic:''},{av:'AV30FacFchTo',fld:'vFACFCHTO',pic:''},{av:'AV31Faccodfrom',fld:'vFACCODFROM',pic:'ZZZZZZZ9'},{av:'AV32Faccodto',fld:'vFACCODTO',pic:'ZZZZZZZ9'},{av:'AV43FirmaD',fld:'vFIRMAD',pic:'9'},{av:'AV44TaxReg',fld:'vTAXREG',pic:''},{av:'AV42CompanyId',fld:'vCOMPANYID',pic:''},{av:'AV45Dir',fld:'vDIR',pic:''},{av:'AV46Anyo',fld:'vANYO',pic:'ZZZ9'},{av:'AV47CantidadRegistrosAProcesar',fld:'vCANTIDADREGISTROSAPROCESAR',pic:'ZZZ9'},{av:'AV39UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'SAFT1041_SDT__SELECCIONAR1',prop:'Visible'},{ctrl:'SAFT1041_SDT__SELECCIONAR2',prop:'Visible'},{ctrl:'SAFT1041_SDT__FACEST',prop:'Visible'},{ctrl:'SAFT1041_SDT__FACCOD',prop:'Visible'},{ctrl:'SAFT1041_SDT__FACFCH',prop:'Visible'},{ctrl:'SAFT1041_SDT__FACTOT',prop:'Visible'},{ctrl:'SAFT1041_SDT__FACTOT1',prop:'Visible'},{ctrl:'SAFT1041_SDT__FACHOR',prop:'Visible'},{ctrl:'SAFT1041_SDT__HHDT',prop:'Visible'},{ctrl:'SAFT1041_SDT__DIAS',prop:'Visible'},{ctrl:'SAFT1041_SDT__TIMES',prop:'Visible'},{ctrl:'SAFT1041_SDT__HHMMSS',prop:'Visible'},{ctrl:'SAFT1041_SDT__FACFIRDG',prop:'Visible'},{ctrl:'SAFT1041_SDT__FACFIRMA',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOIGUALARTOTAL'","{handler:'e152452',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV13SAFT1041_SDT',fld:'vSAFT1041_SDT',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV70Pgmname',fld:'vPGMNAME',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29FacFchFrom',fld:'vFACFCHFROM',pic:''},{av:'AV30FacFchTo',fld:'vFACFCHTO',pic:''},{av:'AV31Faccodfrom',fld:'vFACCODFROM',pic:'ZZZZZZZ9'},{av:'AV32Faccodto',fld:'vFACCODTO',pic:'ZZZZZZZ9'},{av:'AV43FirmaD',fld:'vFIRMAD',pic:'9'},{av:'AV44TaxReg',fld:'vTAXREG',pic:''},{av:'AV42CompanyId',fld:'vCOMPANYID',pic:''},{av:'AV45Dir',fld:'vDIR',pic:''},{av:'AV46Anyo',fld:'vANYO',pic:'ZZZ9'},{av:'AV47CantidadRegistrosAProcesar',fld:'vCANTIDADREGISTROSAPROCESAR',pic:'ZZZ9'},{av:'AV39UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'sPrefix'}]");
      setEventMetadata("'DOIGUALARTOTAL'",",oparms:[{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV13SAFT1041_SDT',fld:'vSAFT1041_SDT',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'SAFT1041_SDT__SELECCIONAR1',prop:'Visible'},{ctrl:'SAFT1041_SDT__SELECCIONAR2',prop:'Visible'},{ctrl:'SAFT1041_SDT__FACEST',prop:'Visible'},{ctrl:'SAFT1041_SDT__FACCOD',prop:'Visible'},{ctrl:'SAFT1041_SDT__FACFCH',prop:'Visible'},{ctrl:'SAFT1041_SDT__FACTOT',prop:'Visible'},{ctrl:'SAFT1041_SDT__FACTOT1',prop:'Visible'},{ctrl:'SAFT1041_SDT__FACHOR',prop:'Visible'},{ctrl:'SAFT1041_SDT__HHDT',prop:'Visible'},{ctrl:'SAFT1041_SDT__DIAS',prop:'Visible'},{ctrl:'SAFT1041_SDT__TIMES',prop:'Visible'},{ctrl:'SAFT1041_SDT__HHMMSS',prop:'Visible'},{ctrl:'SAFT1041_SDT__FACFIRDG',prop:'Visible'},{ctrl:'SAFT1041_SDT__FACFIRMA',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("ENTER","{handler:'e162452',iparms:[{av:'AV13SAFT1041_SDT',fld:'vSAFT1041_SDT',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63}]");
      setEventMetadata("ENTER",",oparms:[{av:'lblTxtmensaje_Caption',ctrl:'TXTMENSAJE',prop:'Caption'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE","{handler:'e142452',iparms:[{av:'Dvelop_confirmpanel_enter_Result',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'Result'},{av:'AV13SAFT1041_SDT',fld:'vSAFT1041_SDT',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29FacFchFrom',fld:'vFACFCHFROM',pic:''},{av:'AV30FacFchTo',fld:'vFACFCHTO',pic:''},{av:'AV46Anyo',fld:'vANYO',pic:'ZZZ9'},{av:'AV44TaxReg',fld:'vTAXREG',pic:''},{av:'AV42CompanyId',fld:'vCOMPANYID',pic:''},{av:'AV31Faccodfrom',fld:'vFACCODFROM',pic:'ZZZZZZZ9'},{av:'AV32Faccodto',fld:'vFACCODTO',pic:'ZZZZZZZ9'},{av:'AV45Dir',fld:'vDIR',pic:''},{av:'AV39UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV47CantidadRegistrosAProcesar',fld:'vCANTIDADREGISTROSAPROCESAR',pic:'ZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE",",oparms:[{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV41var_File',fld:'vVAR_FILE',pic:''}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e172452',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e182452',iparms:[{av:'AV13SAFT1041_SDT',fld:'vSAFT1041_SDT',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63}]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e192452',iparms:[{av:'AV13SAFT1041_SDT',fld:'vSAFT1041_SDT',grid:63,pic:''},{av:'nGXsfl_63_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:63},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_63',ctrl:'GRID',prop:'GridRC',grid:63}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv15',iparms:[]");
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
      wcpOAV29FacFchFrom = GXutil.nullDate() ;
      wcpOAV30FacFchTo = GXutil.nullDate() ;
      wcpOAV44TaxReg = "" ;
      wcpOAV42CompanyId = "" ;
      wcpOAV45Dir = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Dvelop_confirmpanel_enter_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV28Emprcod = "" ;
      AV29FacFchFrom = GXutil.nullDate() ;
      AV30FacFchTo = GXutil.nullDate() ;
      AV44TaxReg = "" ;
      AV42CompanyId = "" ;
      AV45Dir = "" ;
      AV18ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV70Pgmname = "" ;
      AV39UsurCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV13SAFT1041_SDT = new GXBaseCollection<app.facturacion.SdtSAFT1041_SDT_Item>(app.facturacion.SdtSAFT1041_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
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
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      ucProgressbar = new com.genexus.webpanels.GXUserControl();
      lblTextblockcantidadregistrosaprocesar_Jsonclick = "" ;
      lblTextblockvar_file_Jsonclick = "" ;
      AV41var_File = "" ;
      lblTxtmensaje_Jsonclick = "" ;
      bttBtnigualartotal_Jsonclick = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
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
      AV37Station = "" ;
      GXv_char2 = new String[1] ;
      AV38EmprNom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV20Session = httpContext.getWebSession();
      AV16ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV33SAFT1041_SDT_item = new app.facturacion.SdtSAFT1041_SDT_Item(remoteHandle, context);
      AV35FacHor = GXutil.resetTime( GXutil.nullDate() );
      GXv_dtime11 = new java.util.Date[1] ;
      GXt_objcol_SdtSAFT1041_SDT_Item7 = new GXBaseCollection<app.facturacion.SdtSAFT1041_SDT_Item>(app.facturacion.SdtSAFT1041_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSAFT1041_SDT_Item8 = new GXBaseCollection[1] ;
      AV49SAFT1041_SDT_json = "" ;
      AV50websession = httpContext.getWebSession();
      AV14ExcelFilename = "" ;
      AV15ErrorMessage = "" ;
      GXv_char3 = new String[1] ;
      AV17UserCustomValue = "" ;
      GXt_char1 = "" ;
      AV19ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector13 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_int10 = new int[1] ;
      GXv_char4 = new String[1] ;
      AV52messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_objcol_SdtMessages_Message14 = new GXBaseCollection[1] ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      ucDvelop_confirmpanel_enter = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV28Emprcod = "" ;
      sCtrlAV29FacFchFrom = "" ;
      sCtrlAV30FacFchTo = "" ;
      sCtrlAV31Faccodfrom = "" ;
      sCtrlAV32Faccodto = "" ;
      sCtrlAV43FirmaD = "" ;
      sCtrlAV44TaxReg = "" ;
      sCtrlAV42CompanyId = "" ;
      sCtrlAV45Dir = "" ;
      sCtrlAV46Anyo = "" ;
      sCtrlAV47CantidadRegistrosAProcesar = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV70Pgmname = "Facturacion.SAFT1041_WC" ;
      /* GeneXus formulas. */
      AV70Pgmname = "Facturacion.SAFT1041_WC" ;
      Gx_err = (short)(0) ;
      edtavCantidadregistrosaprocesar_Enabled = 0 ;
      edtavVar_file_Enabled = 0 ;
      chkavSaft1041_sdt__seleccionar1.setEnabled( 0 );
      chkavSaft1041_sdt__seleccionar2.setEnabled( 0 );
      edtavSaft1041_sdt__facest_Enabled = 0 ;
      edtavSaft1041_sdt__faccod_Enabled = 0 ;
      edtavSaft1041_sdt__facfch_Enabled = 0 ;
      edtavSaft1041_sdt__factot_Enabled = 0 ;
      edtavSaft1041_sdt__factot1_Enabled = 0 ;
      edtavSaft1041_sdt__fachor_Enabled = 0 ;
      edtavSaft1041_sdt__hhdt_Enabled = 0 ;
      edtavSaft1041_sdt__dias_Enabled = 0 ;
      edtavSaft1041_sdt__times_Enabled = 0 ;
      edtavSaft1041_sdt__hhmmss_Enabled = 0 ;
      edtavSaft1041_sdt__facfirdg_Enabled = 0 ;
      edtavSaft1041_sdt__facfirma_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV43FirmaD ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV43FirmaD ;
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
   private short wcpOAV46Anyo ;
   private short wcpOAV47CantidadRegistrosAProcesar ;
   private short AV46Anyo ;
   private short AV47CantidadRegistrosAProcesar ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV36error ;
   private int wcpOAV31Faccodfrom ;
   private int wcpOAV32Faccodto ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_63 ;
   private int AV31Faccodfrom ;
   private int AV32Faccodto ;
   private int nGXsfl_63_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavCantidadregistrosaprocesar_Enabled ;
   private int edtavVar_file_Enabled ;
   private int AV55GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavSaft1041_sdt__facest_Enabled ;
   private int edtavSaft1041_sdt__faccod_Enabled ;
   private int edtavSaft1041_sdt__facfch_Enabled ;
   private int edtavSaft1041_sdt__factot_Enabled ;
   private int edtavSaft1041_sdt__factot1_Enabled ;
   private int edtavSaft1041_sdt__fachor_Enabled ;
   private int edtavSaft1041_sdt__hhdt_Enabled ;
   private int edtavSaft1041_sdt__dias_Enabled ;
   private int edtavSaft1041_sdt__times_Enabled ;
   private int edtavSaft1041_sdt__hhmmss_Enabled ;
   private int edtavSaft1041_sdt__facfirdg_Enabled ;
   private int edtavSaft1041_sdt__facfirma_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_63_fel_idx=1 ;
   private int edtavSaft1041_sdt__facest_Visible ;
   private int edtavSaft1041_sdt__faccod_Visible ;
   private int edtavSaft1041_sdt__facfch_Visible ;
   private int edtavSaft1041_sdt__factot_Visible ;
   private int edtavSaft1041_sdt__factot1_Visible ;
   private int edtavSaft1041_sdt__fachor_Visible ;
   private int edtavSaft1041_sdt__hhdt_Visible ;
   private int edtavSaft1041_sdt__dias_Visible ;
   private int edtavSaft1041_sdt__times_Visible ;
   private int edtavSaft1041_sdt__hhmmss_Visible ;
   private int edtavSaft1041_sdt__facfirdg_Visible ;
   private int edtavSaft1041_sdt__facfirma_Visible ;
   private int AV25PageToGo ;
   private int AV71GXV16 ;
   private int AV34Faccod ;
   private int nGXsfl_63_bak_idx=1 ;
   private int AV72GXV17 ;
   private int AV73GXV18 ;
   private int GXv_int10[] ;
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
   private String wcpOAV28Emprcod ;
   private String wcpOAV44TaxReg ;
   private String wcpOAV42CompanyId ;
   private String wcpOAV45Dir ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Dvelop_confirmpanel_enter_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV28Emprcod ;
   private String AV44TaxReg ;
   private String AV42CompanyId ;
   private String AV45Dir ;
   private String sGXsfl_63_idx="0001" ;
   private String AV70Pgmname ;
   private String AV39UsurCod ;
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
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Dvelop_confirmpanel_enter_Title ;
   private String Dvelop_confirmpanel_enter_Confirmationtext ;
   private String Dvelop_confirmpanel_enter_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Nobuttoncaption ;
   private String Dvelop_confirmpanel_enter_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Yesbuttonposition ;
   private String Dvelop_confirmpanel_enter_Confirmtype ;
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
   private String Progressbar_Internalname ;
   private String divUnnamedtablecantidadregistrosaprocesar_Internalname ;
   private String lblTextblockcantidadregistrosaprocesar_Internalname ;
   private String lblTextblockcantidadregistrosaprocesar_Jsonclick ;
   private String edtavCantidadregistrosaprocesar_Internalname ;
   private String edtavCantidadregistrosaprocesar_Jsonclick ;
   private String divUnnamedtablevar_file_Internalname ;
   private String lblTextblockvar_file_Internalname ;
   private String lblTextblockvar_file_Jsonclick ;
   private String edtavVar_file_Internalname ;
   private String edtavVar_file_Jsonclick ;
   private String lblTxtmensaje_Internalname ;
   private String lblTxtmensaje_Caption ;
   private String lblTxtmensaje_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtnigualartotal_Internalname ;
   private String bttBtnigualartotal_Jsonclick ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
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
   private String edtavSaft1041_sdt__facest_Internalname ;
   private String edtavSaft1041_sdt__faccod_Internalname ;
   private String edtavSaft1041_sdt__facfch_Internalname ;
   private String edtavSaft1041_sdt__factot_Internalname ;
   private String edtavSaft1041_sdt__factot1_Internalname ;
   private String edtavSaft1041_sdt__fachor_Internalname ;
   private String edtavSaft1041_sdt__hhdt_Internalname ;
   private String edtavSaft1041_sdt__dias_Internalname ;
   private String edtavSaft1041_sdt__times_Internalname ;
   private String edtavSaft1041_sdt__hhmmss_Internalname ;
   private String edtavSaft1041_sdt__facfirdg_Internalname ;
   private String edtavSaft1041_sdt__facfirma_Internalname ;
   private String sGXsfl_63_fel_idx="0001" ;
   private String hsh ;
   private String AV37Station ;
   private String GXv_char2[] ;
   private String AV38EmprNom ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String tblTabledvelop_confirmpanel_enter_Internalname ;
   private String Dvelop_confirmpanel_enter_Internalname ;
   private String sCtrlAV28Emprcod ;
   private String sCtrlAV29FacFchFrom ;
   private String sCtrlAV30FacFchTo ;
   private String sCtrlAV31Faccodfrom ;
   private String sCtrlAV32Faccodto ;
   private String sCtrlAV43FirmaD ;
   private String sCtrlAV44TaxReg ;
   private String sCtrlAV42CompanyId ;
   private String sCtrlAV45Dir ;
   private String sCtrlAV46Anyo ;
   private String sCtrlAV47CantidadRegistrosAProcesar ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavSaft1041_sdt__facest_Jsonclick ;
   private String edtavSaft1041_sdt__faccod_Jsonclick ;
   private String edtavSaft1041_sdt__facfch_Jsonclick ;
   private String edtavSaft1041_sdt__factot_Jsonclick ;
   private String edtavSaft1041_sdt__factot1_Jsonclick ;
   private String edtavSaft1041_sdt__fachor_Jsonclick ;
   private String edtavSaft1041_sdt__hhdt_Jsonclick ;
   private String edtavSaft1041_sdt__dias_Jsonclick ;
   private String edtavSaft1041_sdt__times_Jsonclick ;
   private String edtavSaft1041_sdt__hhmmss_Jsonclick ;
   private String edtavSaft1041_sdt__facfirdg_Jsonclick ;
   private String edtavSaft1041_sdt__facfirma_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV35FacHor ;
   private java.util.Date GXv_dtime11[] ;
   private java.util.Date wcpOAV29FacFchFrom ;
   private java.util.Date wcpOAV30FacFchTo ;
   private java.util.Date AV29FacFchFrom ;
   private java.util.Date AV30FacFchTo ;
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
   private boolean bGXsfl_63_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV63 ;
   private boolean gx_refresh_fired ;
   private String AV16ColumnsSelectorXML ;
   private String AV49SAFT1041_SDT_json ;
   private String AV17UserCustomValue ;
   private String AV41var_File ;
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
   private com.genexus.webpanels.GXUserControl ucProgressbar ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_enter ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavSaft1041_sdt__seleccionar1 ;
   private ICheckbox chkavSaft1041_sdt__seleccionar2 ;
   private com.genexus.webpanels.WebSession AV50websession ;
   private GXBaseCollection<app.facturacion.SdtSAFT1041_SDT_Item> AV13SAFT1041_SDT ;
   private GXBaseCollection<app.facturacion.SdtSAFT1041_SDT_Item> GXt_objcol_SdtSAFT1041_SDT_Item7 ;
   private GXBaseCollection<app.facturacion.SdtSAFT1041_SDT_Item> GXv_objcol_SdtSAFT1041_SDT_Item8[] ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV52messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message14[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector13[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV24DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.facturacion.SdtSAFT1041_SDT_Item AV33SAFT1041_SDT_item ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

