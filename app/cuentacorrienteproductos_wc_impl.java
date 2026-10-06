package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class cuentacorrienteproductos_wc_impl extends GXWebComponent
{
   public cuentacorrienteproductos_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public cuentacorrienteproductos_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cuentacorrienteproductos_wc_impl.class ));
   }

   public cuentacorrienteproductos_wc_impl( int remoteHandle ,
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
      cmbavGrupodeacciones = new HTMLChoice();
      chkavSeleccionar = UIFactory.getCheckbox(this);
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
               AV11EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
               AV6PrdNum = httpContext.GetPar( "PrdNum") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6PrdNum", AV6PrdNum);
               AV58Prdnom = httpContext.GetPar( "Prdnom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58Prdnom", AV58Prdnom);
               AV7CCStkFec = localUtil.parseDateParm( httpContext.GetPar( "CCStkFec")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7CCStkFec", localUtil.format(AV7CCStkFec, "99/99/99"));
               AV8CCStkFec_to = localUtil.parseDateParm( httpContext.GetPar( "CCStkFec_to")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8CCStkFec_to", localUtil.format(AV8CCStkFec_to, "99/99/99"));
               AV9TipMovCcIN = httpContext.GetPar( "TipMovCcIN") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9TipMovCcIN", AV9TipMovCcIN);
               AV10Existencias = CommonUtil.decimalVal( httpContext.GetPar( "Existencias"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Existencias", GXutil.ltrimstr( AV10Existencias, 12, 4));
               AV43Compras = CommonUtil.decimalVal( httpContext.GetPar( "Compras"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43Compras", GXutil.ltrimstr( AV43Compras, 12, 4));
               AV44consumos = CommonUtil.decimalVal( httpContext.GetPar( "consumos"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44consumos", GXutil.ltrimstr( AV44consumos, 12, 4));
               AV45devoluciones = CommonUtil.decimalVal( httpContext.GetPar( "devoluciones"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45devoluciones", GXutil.ltrimstr( AV45devoluciones, 12, 4));
               AV47existenciasxcuentacorriente = CommonUtil.decimalVal( httpContext.GetPar( "existenciasxcuentacorriente"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47existenciasxcuentacorriente", GXutil.ltrimstr( AV47existenciasxcuentacorriente, 12, 4));
               AV49PrdExiAlm = CommonUtil.decimalVal( httpContext.GetPar( "PrdExiAlm"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49PrdExiAlm", GXutil.ltrimstr( AV49PrdExiAlm, 12, 4));
               AV51PrdCanRes = CommonUtil.decimalVal( httpContext.GetPar( "PrdCanRes"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51PrdCanRes", GXutil.ltrimstr( AV51PrdCanRes, 12, 4));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV11EmprCod,AV6PrdNum,AV58Prdnom,AV7CCStkFec,AV8CCStkFec_to,AV9TipMovCcIN,AV10Existencias,AV43Compras,AV44consumos,AV45devoluciones,AV47existenciasxcuentacorriente,AV49PrdExiAlm,AV51PrdCanRes});
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
      nRC_GXsfl_103 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_103"))) ;
      nGXsfl_103_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_103_idx"))) ;
      sGXsfl_103_idx = httpContext.GetPar( "sGXsfl_103_idx") ;
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
      AV38ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV33ColumnsSelector);
      AV11EmprCod = httpContext.GetPar( "EmprCod") ;
      AV6PrdNum = httpContext.GetPar( "PrdNum") ;
      AV69Siacumular = httpContext.GetPar( "Siacumular") ;
      AV98Pgmname = httpContext.GetPar( "Pgmname") ;
      AV7CCStkFec = localUtil.parseDateParm( httpContext.GetPar( "CCStkFec")) ;
      AV8CCStkFec_to = localUtil.parseDateParm( httpContext.GetPar( "CCStkFec_to")) ;
      AV9TipMovCcIN = httpContext.GetPar( "TipMovCcIN") ;
      AV10Existencias = CommonUtil.decimalVal( httpContext.GetPar( "Existencias"), ".") ;
      AV19FilterFullText = httpContext.GetPar( "FilterFullText") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV28CuentaCorrienteProductos2_SDTs);
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV11EmprCod, AV6PrdNum, AV69Siacumular, AV98Pgmname, AV7CCStkFec, AV8CCStkFec_to, AV9TipMovCcIN, AV10Existencias, AV19FilterFullText, AV28CuentaCorrienteProductos2_SDTs, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1A92( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Cuenta Corriente Productos", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.cuentacorrienteproductos_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV6PrdNum)),GXutil.URLEncode(GXutil.rtrim(AV58Prdnom)),GXutil.URLEncode(GXutil.formatDateParm(AV7CCStkFec)),GXutil.URLEncode(GXutil.formatDateParm(AV8CCStkFec_to)),GXutil.URLEncode(GXutil.rtrim(AV9TipMovCcIN)),GXutil.URLEncode(DecimalUtil.decToString(AV10Existencias)),GXutil.URLEncode(DecimalUtil.decToString(AV43Compras)),GXutil.URLEncode(DecimalUtil.decToString(AV44consumos)),GXutil.URLEncode(DecimalUtil.decToString(AV45devoluciones)),GXutil.URLEncode(DecimalUtil.decToString(AV47existenciasxcuentacorriente)),GXutil.URLEncode(DecimalUtil.decToString(AV49PrdExiAlm)),GXutil.URLEncode(DecimalUtil.decToString(AV51PrdCanRes))}, new String[] {"EmprCod","PrdNum","Prdnom","CCStkFec","CCStkFec_to","TipMovCcIN","Existencias","Compras","consumos","devoluciones","existenciasxcuentacorriente","PrdExiAlm","PrdCanRes"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSIACUMULAR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV69Siacumular, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV98Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Cuentacorrienteproductos2_sdts", AV28CuentaCorrienteProductos2_SDTs);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Cuentacorrienteproductos2_sdts", AV28CuentaCorrienteProductos2_SDTs);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_103", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_103, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV36ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV36ManageFiltersData);
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
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV33ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV33ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11EmprCod", GXutil.rtrim( wcpOAV11EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6PrdNum", GXutil.rtrim( wcpOAV6PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV58Prdnom", GXutil.rtrim( wcpOAV58Prdnom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7CCStkFec", localUtil.dtoc( wcpOAV7CCStkFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8CCStkFec_to", localUtil.dtoc( wcpOAV8CCStkFec_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9TipMovCcIN", GXutil.rtrim( wcpOAV9TipMovCcIN));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10Existencias", GXutil.ltrim( localUtil.ntoc( wcpOAV10Existencias, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV43Compras", GXutil.ltrim( localUtil.ntoc( wcpOAV43Compras, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV44consumos", GXutil.ltrim( localUtil.ntoc( wcpOAV44consumos, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV45devoluciones", GXutil.ltrim( localUtil.ntoc( wcpOAV45devoluciones, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV47existenciasxcuentacorriente", GXutil.ltrim( localUtil.ntoc( wcpOAV47existenciasxcuentacorriente, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV49PrdExiAlm", GXutil.ltrim( localUtil.ntoc( wcpOAV49PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV51PrdCanRes", GXutil.ltrim( localUtil.ntoc( wcpOAV51PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV38ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV11EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUM", GXutil.rtrim( AV6PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSIACUMULAR", GXutil.rtrim( AV69Siacumular));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSIACUMULAR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV69Siacumular, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV98Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV98Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCCSTKFEC", localUtil.dtoc( AV7CCStkFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCCSTKFEC_TO", localUtil.dtoc( AV8CCStkFec_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPMOVCCIN", GXutil.rtrim( AV9TipMovCcIN));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEXISTENCIAS", GXutil.ltrim( localUtil.ntoc( AV10Existencias, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCUENTACORRIENTEPRODUCTOS2_SDTS", AV28CuentaCorrienteProductos2_SDTs);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCUENTACORRIENTEPRODUCTOS2_SDTS", AV28CuentaCorrienteProductos2_SDTs);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV26GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV26GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCUENTACORRIENTEPRODUCTOS2_SDTS_INDEX", GXutil.ltrim( localUtil.ntoc( AV81CuentaCorrienteProductos2_SDTs_Index, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNOM", GXutil.rtrim( AV58Prdnom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV61Usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV62Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONTVAL", GXutil.ltrim( localUtil.ntoc( AV78contval, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITORIAUPQ_Title", GXutil.rtrim( Dvelop_confirmpanel_btnauditoriaupq_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITORIAUPQ_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnauditoriaupq_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITORIAUPQ_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnauditoriaupq_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITORIAUPQ_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnauditoriaupq_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITORIAUPQ_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnauditoriaupq_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITORIAUPQ_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnauditoriaupq_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITORIAUPQ_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnauditoriaupq_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITORIAUPQ_Result", GXutil.rtrim( Dvelop_confirmpanel_btnauditoriaupq_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITORIAUPQ_Result", GXutil.rtrim( Dvelop_confirmpanel_btnauditoriaupq_Result));
   }

   public void renderHtmlCloseForm1A92( )
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
      return "CuentaCorrienteProductos_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Cuenta Corriente Productos", "") ;
   }

   public void wb1A90( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.cuentacorrienteproductos_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
         ucDvpanel_unnamedtable1.setProperty("Width", Dvpanel_unnamedtable1_Width);
         ucDvpanel_unnamedtable1.setProperty("AutoWidth", Dvpanel_unnamedtable1_Autowidth);
         ucDvpanel_unnamedtable1.setProperty("AutoHeight", Dvpanel_unnamedtable1_Autoheight);
         ucDvpanel_unnamedtable1.setProperty("Cls", Dvpanel_unnamedtable1_Cls);
         ucDvpanel_unnamedtable1.setProperty("Title", Dvpanel_unnamedtable1_Title);
         ucDvpanel_unnamedtable1.setProperty("Collapsible", Dvpanel_unnamedtable1_Collapsible);
         ucDvpanel_unnamedtable1.setProperty("Collapsed", Dvpanel_unnamedtable1_Collapsed);
         ucDvpanel_unnamedtable1.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable1_Showcollapseicon);
         ucDvpanel_unnamedtable1.setProperty("IconPosition", Dvpanel_unnamedtable1_Iconposition);
         ucDvpanel_unnamedtable1.setProperty("AutoScroll", Dvpanel_unnamedtable1_Autoscroll);
         ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup3_Internalname, httpContext.getMessage( "Existencias", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_CuentaCorrienteProductos_WC.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrdexialm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrdexialm_Internalname, httpContext.getMessage( " Base Datos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdexialm_Internalname, GXutil.ltrim( localUtil.ntoc( AV49PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPrdexialm_Enabled!=0) ? localUtil.format( AV49PrdExiAlm, "ZZZZZZ9.9999") : localUtil.format( AV49PrdExiAlm, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdexialm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrdexialm_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CuentaCorrienteProductos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavExistenciasxcuentacorriente_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavExistenciasxcuentacorriente_Internalname, httpContext.getMessage( "Cuenta Corriente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavExistenciasxcuentacorriente_Internalname, GXutil.ltrim( localUtil.ntoc( AV47existenciasxcuentacorriente, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavExistenciasxcuentacorriente_Enabled!=0) ? localUtil.format( AV47existenciasxcuentacorriente, "ZZZZZZ9.9999") : localUtil.format( AV47existenciasxcuentacorriente, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavExistenciasxcuentacorriente_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavExistenciasxcuentacorriente_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CuentaCorrienteProductos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDiferencia_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDiferencia_Internalname, httpContext.getMessage( "Diferencia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'" + sPrefix + "',false,'" + sGXsfl_103_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDiferencia_Internalname, GXutil.ltrim( localUtil.ntoc( AV50Diferencia, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavDiferencia_Enabled!=0) ? localUtil.format( AV50Diferencia, "ZZZZZZ9.9999") : localUtil.format( AV50Diferencia, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,28);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDiferencia_Jsonclick, 0, "AttributeFL", "color:"+WebUtils.getHTMLColor( edtavDiferencia_Forecolor)+";"+((edtavDiferencia_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavDiferencia_Backcolor)+";"), "", "", "", 1, edtavDiferencia_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CuentaCorrienteProductos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup5_Internalname, httpContext.getMessage( "Movimientos", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_CuentaCorrienteProductos_WC.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCompras_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCompras_Internalname, httpContext.getMessage( "Compras", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCompras_Internalname, GXutil.ltrim( localUtil.ntoc( AV43Compras, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCompras_Enabled!=0) ? localUtil.format( AV43Compras, "ZZZZZZ9.9999") : localUtil.format( AV43Compras, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCompras_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCompras_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CuentaCorrienteProductos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavConsumos_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavConsumos_Internalname, httpContext.getMessage( "Consumos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavConsumos_Internalname, GXutil.ltrim( localUtil.ntoc( AV44consumos, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavConsumos_Enabled!=0) ? localUtil.format( AV44consumos, "ZZZZZZ9.9999") : localUtil.format( AV44consumos, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavConsumos_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavConsumos_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CuentaCorrienteProductos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDevoluciones_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDevoluciones_Internalname, httpContext.getMessage( "Devoluciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDevoluciones_Internalname, GXutil.ltrim( localUtil.ntoc( AV45devoluciones, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavDevoluciones_Enabled!=0) ? localUtil.format( AV45devoluciones, "ZZZZZZ9.9999") : localUtil.format( AV45devoluciones, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDevoluciones_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDevoluciones_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CuentaCorrienteProductos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrdcanres_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrdcanres_Internalname, httpContext.getMessage( "Reservada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdcanres_Internalname, GXutil.ltrim( localUtil.ntoc( AV51PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPrdcanres_Enabled!=0) ? localUtil.format( AV51PrdCanRes, "ZZZZZZ9.9999") : localUtil.format( AV51PrdCanRes, "ZZZZZZ9.9999"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdcanres_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrdcanres_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CuentaCorrienteProductos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup7_Internalname, httpContext.getMessage( "Modificar Lote", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_CuentaCorrienteProductos_WC.htm");
         wb_table1_52_1A92( true) ;
      }
      else
      {
         wb_table1_52_1A92( false) ;
      }
      return  ;
   }

   public void wb_table1_52_1A92e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup9_Internalname, httpContext.getMessage( "Auditoria", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_CuentaCorrienteProductos_WC.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnauditoriaupq_Internalname, "gx.evt.setGridEvt("+GXutil.str( 103, 3, 0)+","+"null"+");", httpContext.getMessage( "Auditoria", ""), bttBtnauditoriaupq_Jsonclick, 7, httpContext.getMessage( "Auditoria", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111a91_client"+"'", TempTags, "", 2, "HLP_CuentaCorrienteProductos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 103, 3, 0)+","+"null"+");", httpContext.getMessage( "Exportar", ""), bttBtnexportar_Jsonclick, 5, httpContext.getMessage( "Exportar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CuentaCorrienteProductos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 103, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CuentaCorrienteProductos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavTexto1_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'" + sPrefix + "',false,'" + sGXsfl_103_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTexto1_Internalname, AV48Texto1, GXutil.rtrim( localUtil.format( AV48Texto1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,83);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTexto1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTexto1_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CuentaCorrienteProductos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table2_85_1A92( true) ;
      }
      else
      {
         wb_table2_85_1A92( false) ;
      }
      return  ;
   }

   public void wb_table2_85_1A92e( boolean wbgen )
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
         startgridcontrol103( ) ;
      }
      if ( wbEnd == 103 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_103 = (int)(nGXsfl_103_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV84GXV1 = nGXsfl_103_idx ;
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV39DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV39DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV33ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table3_127_1A92( true) ;
      }
      else
      {
         wb_table3_127_1A92( false) ;
      }
      return  ;
   }

   public void wb_table3_127_1A92e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_132_1A92( true) ;
      }
      else
      {
         wb_table4_132_1A92( false) ;
      }
      return  ;
   }

   public void wb_table4_132_1A92e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, sPrefix+"GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 103 )
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
               AV84GXV1 = nGXsfl_103_idx ;
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

   public void start1A92( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Cuenta Corriente Productos", ""), (short)(0)) ;
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
            strup1A90( ) ;
         }
      }
   }

   public void ws1A92( )
   {
      start1A92( ) ;
      evt1A92( ) ;
   }

   public void evt1A92( )
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
                              strup1A90( ) ;
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
                              strup1A90( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121A92 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1A90( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131A92 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1A90( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141A92 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1A90( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151A92 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1A90( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e161A92 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNAUDITORIAUPQ.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1A90( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e171A92 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1A90( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportar' */
                                 e181A92 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOMODIFICARLOTEN'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1A90( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoModificarLoten' */
                                 e191A92 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1A90( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 22), "VGRUPODEACCIONES.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 22), "VGRUPODEACCIONES.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1A90( ) ;
                           }
                           nGXsfl_103_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_103_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_103_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1032( ) ;
                           AV84GXV1 = (int)(nGXsfl_103_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV28CuentaCorrienteProductos2_SDTs.size() >= AV84GXV1 ) && ( AV84GXV1 > 0 ) )
                           {
                              AV28CuentaCorrienteProductos2_SDTs.currentItem( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)) );
                              cmbavGrupodeacciones.setName( cmbavGrupodeacciones.getInternalname() );
                              cmbavGrupodeacciones.setValue( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()) );
                              AV54GrupodeAcciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54GrupodeAcciones), 4, 0));
                              AV53Seleccionar = ((GXutil.strcmp(httpContext.cgiGet( chkavSeleccionar.getInternalname()), "S")==0) ? "S" : "N") ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV53Seleccionar);
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
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e201A92 ();
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
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e211A92 ();
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
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e221A92 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRUPODEACCIONES.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e231A92 ();
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
                                    strup1A90( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
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

   public void we1A92( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1A92( ) ;
         }
      }
   }

   public void pa1A92( )
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
            GX_FocusControl = edtavDiferencia_Internalname ;
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
      subsflControlProps_1032( ) ;
      while ( nGXsfl_103_idx <= nRC_GXsfl_103 )
      {
         sendrow_1032( ) ;
         nGXsfl_103_idx = ((subGrid_Islastpage==1)&&(nGXsfl_103_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_103_idx+1) ;
         sGXsfl_103_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_103_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1032( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 byte AV38ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV33ColumnsSelector ,
                                 String AV11EmprCod ,
                                 String AV6PrdNum ,
                                 String AV69Siacumular ,
                                 String AV98Pgmname ,
                                 java.util.Date AV7CCStkFec ,
                                 java.util.Date AV8CCStkFec_to ,
                                 String AV9TipMovCcIN ,
                                 java.math.BigDecimal AV10Existencias ,
                                 String AV19FilterFullText ,
                                 GXBaseCollection<app.SdtCuentaCorrienteProductos2_SDT> AV28CuentaCorrienteProductos2_SDTs ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e211A92 ();
      GRID_nCurrentRecord = 0 ;
      rf1A92( ) ;
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
      rf1A92( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV98Pgmname = "CuentaCorrienteProductos_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98Pgmname", AV98Pgmname);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV98Pgmname, ""))));
      Gx_err = (short)(0) ;
      edtavPrdexialm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdexialm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdexialm_Enabled), 5, 0), true);
      edtavExistenciasxcuentacorriente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExistenciasxcuentacorriente_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExistenciasxcuentacorriente_Enabled), 5, 0), true);
      edtavDiferencia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiferencia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiferencia_Enabled), 5, 0), true);
      edtavCompras_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCompras_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCompras_Enabled), 5, 0), true);
      edtavConsumos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConsumos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConsumos_Enabled), 5, 0), true);
      edtavDevoluciones_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDevoluciones_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDevoluciones_Enabled), 5, 0), true);
      edtavPrdcanres_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdcanres_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdcanres_Enabled), 5, 0), true);
      edtavCuentacorrienteproductos2_sdts__ccstklin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstklin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__ccstklin_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__tipmovcc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__tipmovcc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__tipmovcc_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstkdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstkdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__ccstkdsc_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstkcane_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstkcane_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__ccstkcane_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstkcans_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstkcans_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__ccstkcans_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstkpre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstkpre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__ccstkpre_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__existencias_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__existencias_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__existencias_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstklot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstklot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__ccstklot_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstknhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstknhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__ccstknhdr_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstkusu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstkusu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__ccstkusu_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstkped_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstkped_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__ccstkped_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstkfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstkfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__ccstkfec_Enabled), 5, 0), !bGXsfl_103_Refreshing);
   }

   public void rf1A92( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(103) ;
      /* Execute user event: Refresh */
      e211A92 ();
      nGXsfl_103_idx = 1 ;
      sGXsfl_103_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_103_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1032( ) ;
      bGXsfl_103_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
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
         subsflControlProps_1032( ) ;
         e221A92 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_103_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e221A92 ();
         }
         wbEnd = (short)(103) ;
         wb1A90( ) ;
      }
      bGXsfl_103_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1A92( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSIACUMULAR", GXutil.rtrim( AV69Siacumular));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSIACUMULAR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV69Siacumular, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV98Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV98Pgmname, ""))));
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
      return AV28CuentaCorrienteProductos2_SDTs.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV11EmprCod, AV6PrdNum, AV69Siacumular, AV98Pgmname, AV7CCStkFec, AV8CCStkFec_to, AV9TipMovCcIN, AV10Existencias, AV19FilterFullText, AV28CuentaCorrienteProductos2_SDTs, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV11EmprCod, AV6PrdNum, AV69Siacumular, AV98Pgmname, AV7CCStkFec, AV8CCStkFec_to, AV9TipMovCcIN, AV10Existencias, AV19FilterFullText, AV28CuentaCorrienteProductos2_SDTs, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV11EmprCod, AV6PrdNum, AV69Siacumular, AV98Pgmname, AV7CCStkFec, AV8CCStkFec_to, AV9TipMovCcIN, AV10Existencias, AV19FilterFullText, AV28CuentaCorrienteProductos2_SDTs, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV11EmprCod, AV6PrdNum, AV69Siacumular, AV98Pgmname, AV7CCStkFec, AV8CCStkFec_to, AV9TipMovCcIN, AV10Existencias, AV19FilterFullText, AV28CuentaCorrienteProductos2_SDTs, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV11EmprCod, AV6PrdNum, AV69Siacumular, AV98Pgmname, AV7CCStkFec, AV8CCStkFec_to, AV9TipMovCcIN, AV10Existencias, AV19FilterFullText, AV28CuentaCorrienteProductos2_SDTs, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV98Pgmname = "CuentaCorrienteProductos_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98Pgmname", AV98Pgmname);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV98Pgmname, ""))));
      Gx_err = (short)(0) ;
      edtavPrdexialm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdexialm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdexialm_Enabled), 5, 0), true);
      edtavExistenciasxcuentacorriente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExistenciasxcuentacorriente_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExistenciasxcuentacorriente_Enabled), 5, 0), true);
      edtavDiferencia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiferencia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiferencia_Enabled), 5, 0), true);
      edtavCompras_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCompras_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCompras_Enabled), 5, 0), true);
      edtavConsumos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConsumos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConsumos_Enabled), 5, 0), true);
      edtavDevoluciones_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDevoluciones_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDevoluciones_Enabled), 5, 0), true);
      edtavPrdcanres_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdcanres_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdcanres_Enabled), 5, 0), true);
      edtavCuentacorrienteproductos2_sdts__ccstklin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstklin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__ccstklin_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__tipmovcc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__tipmovcc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__tipmovcc_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstkdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstkdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__ccstkdsc_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstkcane_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstkcane_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__ccstkcane_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstkcans_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstkcans_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__ccstkcans_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstkpre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstkpre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__ccstkpre_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__existencias_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__existencias_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__existencias_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstklot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstklot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__ccstklot_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstknhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstknhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__ccstknhdr_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstkusu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstkusu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__ccstkusu_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstkped_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstkped_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__ccstkped_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstkfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstkfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__ccstkfec_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strup1A90( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e201A92 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Cuentacorrienteproductos2_sdts"), AV28CuentaCorrienteProductos2_SDTs);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV36ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV39DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV33ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCUENTACORRIENTEPRODUCTOS2_SDTS"), AV28CuentaCorrienteProductos2_SDTs);
         /* Read saved values. */
         nRC_GXsfl_103 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_103"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV41GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV42GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV11EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV11EmprCod") ;
         wcpOAV6PrdNum = httpContext.cgiGet( sPrefix+"wcpOAV6PrdNum") ;
         wcpOAV58Prdnom = httpContext.cgiGet( sPrefix+"wcpOAV58Prdnom") ;
         wcpOAV7CCStkFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV7CCStkFec"), 0) ;
         wcpOAV8CCStkFec_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV8CCStkFec_to"), 0) ;
         wcpOAV9TipMovCcIN = httpContext.cgiGet( sPrefix+"wcpOAV9TipMovCcIN") ;
         wcpOAV10Existencias = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV10Existencias")) ;
         wcpOAV43Compras = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV43Compras")) ;
         wcpOAV44consumos = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV44consumos")) ;
         wcpOAV45devoluciones = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV45devoluciones")) ;
         wcpOAV47existenciasxcuentacorriente = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV47existenciasxcuentacorriente")) ;
         wcpOAV49PrdExiAlm = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV49PrdExiAlm")) ;
         wcpOAV51PrdCanRes = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV51PrdCanRes")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
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
         Dvelop_confirmpanel_eliminar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Title") ;
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_eliminar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype") ;
         Dvelop_confirmpanel_btnauditoriaupq_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITORIAUPQ_Title") ;
         Dvelop_confirmpanel_btnauditoriaupq_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITORIAUPQ_Confirmationtext") ;
         Dvelop_confirmpanel_btnauditoriaupq_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITORIAUPQ_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnauditoriaupq_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITORIAUPQ_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnauditoriaupq_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITORIAUPQ_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnauditoriaupq_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITORIAUPQ_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnauditoriaupq_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITORIAUPQ_Confirmtype") ;
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascategories")) ;
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
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         Dvelop_confirmpanel_btnauditoriaupq_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITORIAUPQ_Result") ;
         nRC_GXsfl_103 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_103"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_103_fel_idx = 0 ;
         while ( nGXsfl_103_fel_idx < nRC_GXsfl_103 )
         {
            nGXsfl_103_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_103_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_103_fel_idx+1) ;
            sGXsfl_103_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_103_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_1032( ) ;
            AV84GXV1 = (int)(nGXsfl_103_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV28CuentaCorrienteProductos2_SDTs.size() >= AV84GXV1 ) && ( AV84GXV1 > 0 ) )
            {
               AV28CuentaCorrienteProductos2_SDTs.currentItem( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)) );
               cmbavGrupodeacciones.setName( cmbavGrupodeacciones.getInternalname() );
               cmbavGrupodeacciones.setValue( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()) );
               AV54GrupodeAcciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()))) ;
               AV53Seleccionar = ((GXutil.strcmp(httpContext.cgiGet( chkavSeleccionar.getInternalname()), "S")==0) ? "S" : "N") ;
            }
         }
         if ( nGXsfl_103_fel_idx == 0 )
         {
            nGXsfl_103_idx = 1 ;
            sGXsfl_103_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_103_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_1032( ) ;
         }
         nGXsfl_103_fel_idx = 1 ;
         /* Read variables values. */
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDiferencia_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDiferencia_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFERENCIA");
            GX_FocusControl = edtavDiferencia_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV50Diferencia = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50Diferencia", GXutil.ltrimstr( AV50Diferencia, 12, 4));
         }
         else
         {
            AV50Diferencia = localUtil.ctond( httpContext.cgiGet( edtavDiferencia_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50Diferencia", GXutil.ltrimstr( AV50Diferencia, 12, 4));
         }
         AV64Lotenuevo = httpContext.cgiGet( edtavLotenuevo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Lotenuevo", AV64Lotenuevo);
         AV48Texto1 = httpContext.cgiGet( edtavTexto1_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48Texto1", AV48Texto1);
         AV19FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19FilterFullText", AV19FilterFullText);
         /* Read subfile selected row values. */
         nGXsfl_103_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_103_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_103_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1032( ) ;
         AV84GXV1 = (int)(nGXsfl_103_idx+GRID_nFirstRecordOnPage) ;
         if ( nGXsfl_103_idx > 0 )
         {
            AV84GXV1 = (int)(nGXsfl_103_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV28CuentaCorrienteProductos2_SDTs.size() >= AV84GXV1 ) && ( AV84GXV1 > 0 ) )
            {
               AV28CuentaCorrienteProductos2_SDTs.currentItem( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)) );
               cmbavGrupodeacciones.setName( cmbavGrupodeacciones.getInternalname() );
               cmbavGrupodeacciones.setValue( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()) );
               AV54GrupodeAcciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54GrupodeAcciones), 4, 0));
               AV53Seleccionar = ((GXutil.strcmp(httpContext.cgiGet( chkavSeleccionar.getInternalname()), "S")==0) ? "S" : "N") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV53Seleccionar);
            }
            if ( ( AV84GXV1 > 0 ) && ( AV28CuentaCorrienteProductos2_SDTs.size() >= AV84GXV1 ) )
            {
               AV28CuentaCorrienteProductos2_SDTs.currentItem( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)) );
            }
         }
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
      e201A92 ();
      if (returnInSub) return;
   }

   public void e201A92( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV62Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      cuentacorrienteproductos_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV62Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Station", AV62Station);
      GXv_char2[0] = AV11EmprCod ;
      GXv_char3[0] = AV67EmprNom ;
      GXv_char4[0] = AV61Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV62Station, GXv_char2, GXv_char3, GXv_char4) ;
      cuentacorrienteproductos_wc_impl.this.AV11EmprCod = GXv_char2[0] ;
      cuentacorrienteproductos_wc_impl.this.AV67EmprNom = GXv_char3[0] ;
      cuentacorrienteproductos_wc_impl.this.AV61Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Usurcod", AV61Usurcod);
      GXt_int5 = (byte)(AV68Cotexsur) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "COTEXS", ""), GXv_int6) ;
      cuentacorrienteproductos_wc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV68Cotexsur = GXt_int5 ;
      AV69Siacumular = ((0==AV68Cotexsur) ? httpContext.getMessage( "N", "") : httpContext.getMessage( "S", "")) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69Siacumular", AV69Siacumular);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSIACUMULAR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV69Siacumular, ""))));
      AV70ActDatos = "N" ;
      GXt_int7 = AV78contval ;
      GXv_char4[0] = AV11EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "PSWAUD", "") ;
      GXv_int8[0] = GXt_int7 ;
      new app.prepkil(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int8) ;
      cuentacorrienteproductos_wc_impl.this.AV11EmprCod = GXv_char4[0] ;
      cuentacorrienteproductos_wc_impl.this.GXt_int7 = GXv_int8[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
      AV78contval = (int)(GXt_int7) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78contval", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78contval), 8, 0));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, sPrefix, false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      /* Execute user subroutine: 'LOADSAVEDFILTERS' */
      S112 ();
      if (returnInSub) return;
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = AV39DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] ;
      AV39DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_objcol_SdtCuentaCorrienteProductos2_SDT11 = AV28CuentaCorrienteProductos2_SDTs ;
      GXv_objcol_SdtCuentaCorrienteProductos2_SDT12[0] = GXt_objcol_SdtCuentaCorrienteProductos2_SDT11 ;
      new app.cuentacorrienteproductos2_dp(remoteHandle, context).execute( AV11EmprCod, AV6PrdNum, AV7CCStkFec, AV8CCStkFec_to, AV9TipMovCcIN, AV10Existencias, GXv_objcol_SdtCuentaCorrienteProductos2_SDT12) ;
      GXt_objcol_SdtCuentaCorrienteProductos2_SDT11 = GXv_objcol_SdtCuentaCorrienteProductos2_SDT12[0] ;
      AV28CuentaCorrienteProductos2_SDTs = GXt_objcol_SdtCuentaCorrienteProductos2_SDT11 ;
      gx_BV103 = true ;
      AV48Texto1 = httpContext.getMessage( "Existencias ", "") + GXutil.trim( GXutil.str( AV10Existencias, 12, 4)) + httpContext.getMessage( " a fecha <= ", "") + GXutil.trim( localUtil.dtoc( AV7CCStkFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48Texto1", AV48Texto1);
      AV50Diferencia = AV47existenciasxcuentacorriente.subtract(AV49PrdExiAlm) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50Diferencia", GXutil.ltrimstr( AV50Diferencia, 12, 4));
      if ( AV50Diferencia.doubleValue() != 0 )
      {
         edtavDiferencia_Backcolor = GXutil.getColor( 255, 0, 0) ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiferencia_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiferencia_Backcolor), 9, 0), true);
         edtavDiferencia_Forecolor = GXutil.getColor( 255, 255, 255) ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiferencia_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiferencia_Forecolor), 9, 0), true);
      }
      else
      {
         edtavDiferencia_Backcolor = GXutil.getColor( 0, 255, 0) ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiferencia_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiferencia_Backcolor), 9, 0), true);
         edtavDiferencia_Forecolor = GXutil.getColor( 0, 0, 0) ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiferencia_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiferencia_Forecolor), 9, 0), true);
      }
   }

   public void e211A92( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext13[0] = AV22WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext13) ;
      AV22WWPContext = GXv_SdtWWPContext13[0] ;
      if ( AV38ManageFiltersExecutionStep == 1 )
      {
         AV38ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38ManageFiltersExecutionStep", GXutil.str( AV38ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV38ManageFiltersExecutionStep == 2 )
      {
         AV38ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38ManageFiltersExecutionStep", GXutil.str( AV38ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV35Session.getValue("CuentaCorrienteProductos_WCColumnsSelector"), "") != 0 )
      {
         AV31ColumnsSelectorXML = AV35Session.getValue("CuentaCorrienteProductos_WCColumnsSelector") ;
         AV33ColumnsSelector.fromxml(AV31ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S142 ();
         if (returnInSub) return;
      }
      chkavSeleccionar.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "Visible", GXutil.ltrimstr( chkavSeleccionar.getVisible(), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstklin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstklin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__ccstklin_Visible), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Visible), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__tipmovcc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__tipmovcc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__tipmovcc_Visible), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstkdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstkdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__ccstkdsc_Visible), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstkcane_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstkcane_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__ccstkcane_Visible), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstkcans_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstkcans_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__ccstkcans_Visible), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstkpre_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstkpre_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__ccstkpre_Visible), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__existencias_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__existencias_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__existencias_Visible), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstklot_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstklot_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__ccstklot_Visible), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstknhdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstknhdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__ccstknhdr_Visible), 5, 0), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstkusu_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstkusu_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCuentacorrienteproductos2_sdts__ccstkusu_Visible), 5, 0), !bGXsfl_103_Refreshing);
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S152 ();
      if (returnInSub) return;
      AV41GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41GridCurrentPage), 10, 0));
      AV42GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42GridPageCount), 10, 0));
      cmbavGrupodeacciones.setColumnHeaderClass( "WWActionGroupColumn" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGrupodeacciones.getInternalname(), "Columnheaderclass", cmbavGrupodeacciones.getColumnHeaderClass(), !bGXsfl_103_Refreshing);
      chkavSeleccionar.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "Columnheaderclass", chkavSeleccionar.getColumnHeaderClass(), !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstklin_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstklin_Internalname, "Columnheaderclass", edtavCuentacorrienteproductos2_sdts__ccstklin_Columnheaderclass, !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Internalname, "Columnheaderclass", edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Columnheaderclass, !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__tipmovcc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__tipmovcc_Internalname, "Columnheaderclass", edtavCuentacorrienteproductos2_sdts__tipmovcc_Columnheaderclass, !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstkdsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstkdsc_Internalname, "Columnheaderclass", edtavCuentacorrienteproductos2_sdts__ccstkdsc_Columnheaderclass, !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstkcane_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstkcane_Internalname, "Columnheaderclass", edtavCuentacorrienteproductos2_sdts__ccstkcane_Columnheaderclass, !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstkcans_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstkcans_Internalname, "Columnheaderclass", edtavCuentacorrienteproductos2_sdts__ccstkcans_Columnheaderclass, !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstkpre_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstkpre_Internalname, "Columnheaderclass", edtavCuentacorrienteproductos2_sdts__ccstkpre_Columnheaderclass, !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__existencias_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__existencias_Internalname, "Columnheaderclass", edtavCuentacorrienteproductos2_sdts__existencias_Columnheaderclass, !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstklot_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstklot_Internalname, "Columnheaderclass", edtavCuentacorrienteproductos2_sdts__ccstklot_Columnheaderclass, !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstknhdr_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstknhdr_Internalname, "Columnheaderclass", edtavCuentacorrienteproductos2_sdts__ccstknhdr_Columnheaderclass, !bGXsfl_103_Refreshing);
      edtavCuentacorrienteproductos2_sdts__ccstkusu_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCuentacorrienteproductos2_sdts__ccstkusu_Internalname, "Columnheaderclass", edtavCuentacorrienteproductos2_sdts__ccstkusu_Columnheaderclass, !bGXsfl_103_Refreshing);
      AV70ActDatos = httpContext.getMessage( "N", "") ;
      if ( GXutil.strcmp(GXutil.upper( GXutil.trim( AV80WebSession.getValue("ActDatos"))), httpContext.getMessage( "S", "")) == 0 )
      {
         AV70ActDatos = httpContext.getMessage( "S", "") ;
         AV66File = "" ;
         callWebObject(formatLink("app.apupq001", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV6PrdNum)),GXutil.URLEncode(GXutil.rtrim(AV6PrdNum)),GXutil.URLEncode(GXutil.rtrim(AV69Siacumular)),GXutil.URLEncode(GXutil.rtrim(AV70ActDatos)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(AV66File)),GXutil.URLEncode(GXutil.rtrim(GXutil.substring( AV98Pgmname, 1, 10)))}, new String[] {"Emprcod","Prdnum1","Prdnum2","Siacumular","ActDatos","CantCierre","File","PgmnameOut"}) );
         httpContext.wjLocDisableFrm = (byte)(2) ;
         if ( GXutil.strcmp(GXutil.upper( AV70ActDatos), "S") == 0 )
         {
            GXv_char4[0] = AV11EmprCod ;
            GXv_char3[0] = AV6PrdNum ;
            GXv_char2[0] = AV69Siacumular ;
            GXv_decimal14[0] = AV73Dif ;
            GXv_decimal15[0] = AV72Dif2 ;
            GXv_char16[0] = AV71obs ;
            new app.pupq003(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_decimal14, GXv_decimal15, GXv_char16) ;
            cuentacorrienteproductos_wc_impl.this.AV11EmprCod = GXv_char4[0] ;
            cuentacorrienteproductos_wc_impl.this.AV6PrdNum = GXv_char3[0] ;
            cuentacorrienteproductos_wc_impl.this.AV69Siacumular = GXv_char2[0] ;
            cuentacorrienteproductos_wc_impl.this.AV73Dif = GXv_decimal14[0] ;
            cuentacorrienteproductos_wc_impl.this.AV72Dif2 = GXv_decimal15[0] ;
            cuentacorrienteproductos_wc_impl.this.AV71obs = GXv_char16[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6PrdNum", AV6PrdNum);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69Siacumular", AV69Siacumular);
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSIACUMULAR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV69Siacumular, ""))));
            GXv_char16[0] = AV11EmprCod ;
            GXv_char4[0] = AV6PrdNum ;
            GXv_decimal15[0] = AV73Dif ;
            GXv_decimal14[0] = AV72Dif2 ;
            GXv_char3[0] = AV71obs ;
            new app.pupq002(remoteHandle, context).execute( GXv_char16, GXv_char4, GXv_decimal15, GXv_decimal14, GXv_char3) ;
            cuentacorrienteproductos_wc_impl.this.AV11EmprCod = GXv_char16[0] ;
            cuentacorrienteproductos_wc_impl.this.AV6PrdNum = GXv_char4[0] ;
            cuentacorrienteproductos_wc_impl.this.AV73Dif = GXv_decimal15[0] ;
            cuentacorrienteproductos_wc_impl.this.AV72Dif2 = GXv_decimal14[0] ;
            cuentacorrienteproductos_wc_impl.this.AV71obs = GXv_char3[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6PrdNum", AV6PrdNum);
            new app.pcommit(remoteHandle, context).execute( ) ;
            GXv_char16[0] = AV11EmprCod ;
            GXv_char4[0] = AV6PrdNum ;
            new app.core.upq004(remoteHandle, context).execute( GXv_char16, GXv_char4) ;
            cuentacorrienteproductos_wc_impl.this.AV11EmprCod = GXv_char16[0] ;
            cuentacorrienteproductos_wc_impl.this.AV6PrdNum = GXv_char4[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6PrdNum", AV6PrdNum);
            GXv_char16[0] = AV11EmprCod ;
            GXv_char4[0] = AV6PrdNum ;
            GXv_char3[0] = AV69Siacumular ;
            GXv_decimal15[0] = AV73Dif ;
            GXv_decimal14[0] = AV72Dif2 ;
            GXv_char2[0] = AV71obs ;
            new app.pupq003(remoteHandle, context).execute( GXv_char16, GXv_char4, GXv_char3, GXv_decimal15, GXv_decimal14, GXv_char2) ;
            cuentacorrienteproductos_wc_impl.this.AV11EmprCod = GXv_char16[0] ;
            cuentacorrienteproductos_wc_impl.this.AV6PrdNum = GXv_char4[0] ;
            cuentacorrienteproductos_wc_impl.this.AV69Siacumular = GXv_char3[0] ;
            cuentacorrienteproductos_wc_impl.this.AV73Dif = GXv_decimal15[0] ;
            cuentacorrienteproductos_wc_impl.this.AV72Dif2 = GXv_decimal14[0] ;
            cuentacorrienteproductos_wc_impl.this.AV71obs = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6PrdNum", AV6PrdNum);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69Siacumular", AV69Siacumular);
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSIACUMULAR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV69Siacumular, ""))));
            GXv_char16[0] = AV11EmprCod ;
            GXv_char4[0] = AV6PrdNum ;
            GXv_decimal15[0] = AV73Dif ;
            GXv_decimal14[0] = AV72Dif2 ;
            GXv_char3[0] = AV71obs ;
            new app.pupq002(remoteHandle, context).execute( GXv_char16, GXv_char4, GXv_decimal15, GXv_decimal14, GXv_char3) ;
            cuentacorrienteproductos_wc_impl.this.AV11EmprCod = GXv_char16[0] ;
            cuentacorrienteproductos_wc_impl.this.AV6PrdNum = GXv_char4[0] ;
            cuentacorrienteproductos_wc_impl.this.AV73Dif = GXv_decimal15[0] ;
            cuentacorrienteproductos_wc_impl.this.AV72Dif2 = GXv_decimal14[0] ;
            cuentacorrienteproductos_wc_impl.this.AV71obs = GXv_char3[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6PrdNum", AV6PrdNum);
            new app.pcommit(remoteHandle, context).execute( ) ;
            GXv_char16[0] = AV11EmprCod ;
            GXv_char4[0] = AV6PrdNum ;
            new app.core.upq004(remoteHandle, context).execute( GXv_char16, GXv_char4) ;
            cuentacorrienteproductos_wc_impl.this.AV11EmprCod = GXv_char16[0] ;
            cuentacorrienteproductos_wc_impl.this.AV6PrdNum = GXv_char4[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6PrdNum", AV6PrdNum);
            callWebObject(formatLink("app.apupq001", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV6PrdNum)),GXutil.URLEncode(GXutil.rtrim(AV6PrdNum)),GXutil.URLEncode(GXutil.rtrim(AV69Siacumular)),GXutil.URLEncode(GXutil.rtrim(AV70ActDatos)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(AV66File)),GXutil.URLEncode(GXutil.rtrim(GXutil.substring( AV98Pgmname, 1, 10)))}, new String[] {"Emprcod","Prdnum1","Prdnum2","Siacumular","ActDatos","CantCierre","File","PgmnameOut"}) );
            httpContext.wjLocDisableFrm = (byte)(2) ;
         }
         AV80WebSession.remove("ActDatos");
      }
      if ( GXutil.strcmp(GXutil.upper( GXutil.trim( AV80WebSession.getValue("ActDatos"))), httpContext.getMessage( "N", "")) == 0 )
      {
         AV66File = "" ;
         callWebObject(formatLink("app.apupq001", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV6PrdNum)),GXutil.URLEncode(GXutil.rtrim(AV6PrdNum)),GXutil.URLEncode(GXutil.rtrim(AV69Siacumular)),GXutil.URLEncode(GXutil.rtrim(AV70ActDatos)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(AV66File)),GXutil.URLEncode(GXutil.rtrim(GXutil.substring( AV98Pgmname, 1, 10)))}, new String[] {"Emprcod","Prdnum1","Prdnum2","Siacumular","ActDatos","CantCierre","File","PgmnameOut"}) );
         httpContext.wjLocDisableFrm = (byte)(2) ;
         AV80WebSession.remove("ActDatos");
      }
      if ( GXutil.strcmp(GXutil.upper( GXutil.trim( AV80WebSession.getValue("Cambiolote"))), httpContext.getMessage( "S", "")) == 0 )
      {
         GXt_objcol_SdtCuentaCorrienteProductos2_SDT11 = AV28CuentaCorrienteProductos2_SDTs ;
         GXv_objcol_SdtCuentaCorrienteProductos2_SDT12[0] = GXt_objcol_SdtCuentaCorrienteProductos2_SDT11 ;
         new app.cuentacorrienteproductos2_dp(remoteHandle, context).execute( AV11EmprCod, AV6PrdNum, AV7CCStkFec, AV8CCStkFec_to, AV9TipMovCcIN, AV10Existencias, GXv_objcol_SdtCuentaCorrienteProductos2_SDT12) ;
         GXt_objcol_SdtCuentaCorrienteProductos2_SDT11 = GXv_objcol_SdtCuentaCorrienteProductos2_SDT12[0] ;
         AV28CuentaCorrienteProductos2_SDTs = GXt_objcol_SdtCuentaCorrienteProductos2_SDT11 ;
         gx_BV103 = true ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV33ColumnsSelector", AV33ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28CuentaCorrienteProductos2_SDTs", AV28CuentaCorrienteProductos2_SDTs);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV36ManageFiltersData", AV36ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26GridState", AV26GridState);
   }

   public void e131A92( )
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

   public void e141A92( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e221A92( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV84GXV1 = 1 ;
      while ( AV84GXV1 <= AV28CuentaCorrienteProductos2_SDTs.size() )
      {
         AV28CuentaCorrienteProductos2_SDTs.currentItem( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)) );
         cmbavGrupodeacciones.removeAllItems();
         cmbavGrupodeacciones.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGrupodeacciones.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         cmbavGrupodeacciones.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Modificar Lote", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         AV53Seleccionar = "N" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV53Seleccionar);
         cmbavGrupodeacciones.setColumnClass( ((GXutil.strcmp(((app.SdtCuentaCorrienteProductos2_SDT)(AV28CuentaCorrienteProductos2_SDTs.currentItem())).getgxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc(), httpContext.getMessage( "SR", ""))==0) ? "WWActionGroupColumn WWColumnSuccess WWColumnSuccessFirstColumn" : "WWActionGroupColumn") );
         chkavSeleccionar.setColumnClass( ((GXutil.strcmp(((app.SdtCuentaCorrienteProductos2_SDT)(AV28CuentaCorrienteProductos2_SDTs.currentItem())).getgxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc(), httpContext.getMessage( "SR", ""))==0) ? "WWColumn WWColumnSuccess" : "WWColumn") );
         edtavCuentacorrienteproductos2_sdts__ccstklin_Columnclass = ((GXutil.strcmp(((app.SdtCuentaCorrienteProductos2_SDT)(AV28CuentaCorrienteProductos2_SDTs.currentItem())).getgxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc(), httpContext.getMessage( "SR", ""))==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Columnclass = ((GXutil.strcmp(((app.SdtCuentaCorrienteProductos2_SDT)(AV28CuentaCorrienteProductos2_SDTs.currentItem())).getgxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc(), httpContext.getMessage( "SR", ""))==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavCuentacorrienteproductos2_sdts__tipmovcc_Columnclass = ((GXutil.strcmp(((app.SdtCuentaCorrienteProductos2_SDT)(AV28CuentaCorrienteProductos2_SDTs.currentItem())).getgxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc(), httpContext.getMessage( "SR", ""))==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavCuentacorrienteproductos2_sdts__ccstkdsc_Columnclass = ((GXutil.strcmp(((app.SdtCuentaCorrienteProductos2_SDT)(AV28CuentaCorrienteProductos2_SDTs.currentItem())).getgxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc(), httpContext.getMessage( "SR", ""))==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavCuentacorrienteproductos2_sdts__ccstkcane_Columnclass = ((GXutil.strcmp(((app.SdtCuentaCorrienteProductos2_SDT)(AV28CuentaCorrienteProductos2_SDTs.currentItem())).getgxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc(), httpContext.getMessage( "SR", ""))==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavCuentacorrienteproductos2_sdts__ccstkcans_Columnclass = ((GXutil.strcmp(((app.SdtCuentaCorrienteProductos2_SDT)(AV28CuentaCorrienteProductos2_SDTs.currentItem())).getgxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc(), httpContext.getMessage( "SR", ""))==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavCuentacorrienteproductos2_sdts__ccstkpre_Columnclass = ((GXutil.strcmp(((app.SdtCuentaCorrienteProductos2_SDT)(AV28CuentaCorrienteProductos2_SDTs.currentItem())).getgxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc(), httpContext.getMessage( "SR", ""))==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavCuentacorrienteproductos2_sdts__existencias_Columnclass = ((GXutil.strcmp(((app.SdtCuentaCorrienteProductos2_SDT)(AV28CuentaCorrienteProductos2_SDTs.currentItem())).getgxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc(), httpContext.getMessage( "SR", ""))==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavCuentacorrienteproductos2_sdts__ccstklot_Columnclass = ((GXutil.strcmp(((app.SdtCuentaCorrienteProductos2_SDT)(AV28CuentaCorrienteProductos2_SDTs.currentItem())).getgxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc(), httpContext.getMessage( "SR", ""))==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavCuentacorrienteproductos2_sdts__ccstknhdr_Columnclass = ((GXutil.strcmp(((app.SdtCuentaCorrienteProductos2_SDT)(AV28CuentaCorrienteProductos2_SDTs.currentItem())).getgxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc(), httpContext.getMessage( "SR", ""))==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         edtavCuentacorrienteproductos2_sdts__ccstkusu_Columnclass = ((GXutil.strcmp(((app.SdtCuentaCorrienteProductos2_SDT)(AV28CuentaCorrienteProductos2_SDTs.currentItem())).getgxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc(), httpContext.getMessage( "SR", ""))==0) ? "WWColumn WWColumnSuccess" : "WWColumn") ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(103) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_1032( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_103_Refreshing )
         {
            httpContext.doAjaxLoad(103, GridRow);
         }
         AV84GXV1 = (int)(AV84GXV1+1) ;
      }
      /*  Sending Event outputs  */
      cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV54GrupodeAcciones, 4, 0)) );
   }

   public void e151A92( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV31ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV33ColumnsSelector.fromJSonString(AV31ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "CuentaCorrienteProductos_WCColumnsSelector", ((GXutil.strcmp("", AV31ColumnsSelectorXML)==0) ? "" : AV33ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV33ColumnsSelector", AV33ColumnsSelector);
      if ( gx_BV103 )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28CuentaCorrienteProductos2_SDTs", AV28CuentaCorrienteProductos2_SDTs);
         nGXsfl_103_bak_idx = nGXsfl_103_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV11EmprCod, AV6PrdNum, AV69Siacumular, AV98Pgmname, AV7CCStkFec, AV8CCStkFec_to, AV9TipMovCcIN, AV10Existencias, AV19FilterFullText, AV28CuentaCorrienteProductos2_SDTs, sPrefix) ;
         nGXsfl_103_idx = nGXsfl_103_bak_idx ;
         sGXsfl_103_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_103_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1032( ) ;
      }
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV36ManageFiltersData", AV36ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26GridState", AV26GridState);
   }

   public void e121A92( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("CuentaCorrienteProductos_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV98Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV38ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38ManageFiltersExecutionStep", GXutil.str( AV38ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("CuentaCorrienteProductos_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV38ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38ManageFiltersExecutionStep", GXutil.str( AV38ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV37ManageFiltersXml ;
         GXv_char16[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "CuentaCorrienteProductos_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char16) ;
         cuentacorrienteproductos_wc_impl.this.GXt_char1 = GXv_char16[0] ;
         AV37ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV37ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S162 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV98Pgmname+"GridState", AV37ManageFiltersXml) ;
            AV26GridState.fromxml(AV37ManageFiltersXml, null, null);
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S172 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26GridState", AV26GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV33ColumnsSelector", AV33ColumnsSelector);
      if ( gx_BV103 )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28CuentaCorrienteProductos2_SDTs", AV28CuentaCorrienteProductos2_SDTs);
         nGXsfl_103_bak_idx = nGXsfl_103_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV11EmprCod, AV6PrdNum, AV69Siacumular, AV98Pgmname, AV7CCStkFec, AV8CCStkFec_to, AV9TipMovCcIN, AV10Existencias, AV19FilterFullText, AV28CuentaCorrienteProductos2_SDTs, sPrefix) ;
         nGXsfl_103_idx = nGXsfl_103_bak_idx ;
         sGXsfl_103_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_103_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1032( ) ;
      }
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV36ManageFiltersData", AV36ManageFiltersData);
   }

   public void e231A92( )
   {
      AV84GXV1 = (int)(nGXsfl_103_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV84GXV1 > 0 ) && ( AV28CuentaCorrienteProductos2_SDTs.size() >= AV84GXV1 ) )
      {
         AV28CuentaCorrienteProductos2_SDTs.currentItem( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)) );
      }
      /* Grupodeacciones_Click Routine */
      returnInSub = false ;
      if ( AV54GrupodeAcciones == 1 )
      {
         /* Execute user subroutine: 'DO ELIMINAR' */
         S182 ();
         if (returnInSub) return;
      }
      else if ( AV54GrupodeAcciones == 2 )
      {
         /* Execute user subroutine: 'DO MODIFICARLOTE' */
         S192 ();
         if (returnInSub) return;
      }
      AV54GrupodeAcciones = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54GrupodeAcciones), 4, 0));
      /*  Sending Event outputs  */
      cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV54GrupodeAcciones, 4, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGrupodeacciones.getInternalname(), "Values", cmbavGrupodeacciones.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28CuentaCorrienteProductos2_SDTs", AV28CuentaCorrienteProductos2_SDTs);
      nGXsfl_103_bak_idx = nGXsfl_103_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV11EmprCod, AV6PrdNum, AV69Siacumular, AV98Pgmname, AV7CCStkFec, AV8CCStkFec_to, AV9TipMovCcIN, AV10Existencias, AV19FilterFullText, AV28CuentaCorrienteProductos2_SDTs, sPrefix) ;
      nGXsfl_103_idx = nGXsfl_103_bak_idx ;
      sGXsfl_103_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_103_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1032( ) ;
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV33ColumnsSelector", AV33ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV36ManageFiltersData", AV36ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26GridState", AV26GridState);
   }

   public void e161A92( )
   {
      AV84GXV1 = (int)(nGXsfl_103_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV84GXV1 > 0 ) && ( AV28CuentaCorrienteProductos2_SDTs.size() >= AV84GXV1 ) )
      {
         AV28CuentaCorrienteProductos2_SDTs.currentItem( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)) );
      }
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S202 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28CuentaCorrienteProductos2_SDTs", AV28CuentaCorrienteProductos2_SDTs);
      nGXsfl_103_bak_idx = nGXsfl_103_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV11EmprCod, AV6PrdNum, AV69Siacumular, AV98Pgmname, AV7CCStkFec, AV8CCStkFec_to, AV9TipMovCcIN, AV10Existencias, AV19FilterFullText, AV28CuentaCorrienteProductos2_SDTs, sPrefix) ;
      nGXsfl_103_idx = nGXsfl_103_bak_idx ;
      sGXsfl_103_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_103_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1032( ) ;
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV33ColumnsSelector", AV33ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV36ManageFiltersData", AV36ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26GridState", AV26GridState);
   }

   public void e181A92( )
   {
      /* 'DoExportar' Routine */
      returnInSub = false ;
      GXv_char16[0] = AV29ExcelFilename ;
      GXv_char4[0] = AV30ErrorMessage ;
      new app.core.cuentacorrienteproductos_exportar(remoteHandle, context).execute( AV11EmprCod, AV6PrdNum, AV58Prdnom, AV7CCStkFec, AV8CCStkFec_to, AV10Existencias, AV43Compras, AV44consumos, AV45devoluciones, GXv_char16, GXv_char4) ;
      cuentacorrienteproductos_wc_impl.this.AV29ExcelFilename = GXv_char16[0] ;
      cuentacorrienteproductos_wc_impl.this.AV30ErrorMessage = GXv_char4[0] ;
      if ( GXutil.strcmp(AV29ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV29ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV30ErrorMessage);
      }
   }

   public void e171A92( )
   {
      /* Dvelop_confirmpanel_btnauditoriaupq_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnauditoriaupq_Result, "Yes") == 0 )
      {
         AV80WebSession.setValue("ActDatos", "");
         httpContext.popup(formatLink("app.confirmacionpassword", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV78contval,8,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Contval","PwdBo"}) , new Object[] {"AV78contval","AV79PwdBo"});
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV33ColumnsSelector", AV33ColumnsSelector);
      if ( gx_BV103 )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28CuentaCorrienteProductos2_SDTs", AV28CuentaCorrienteProductos2_SDTs);
         nGXsfl_103_bak_idx = nGXsfl_103_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV11EmprCod, AV6PrdNum, AV69Siacumular, AV98Pgmname, AV7CCStkFec, AV8CCStkFec_to, AV9TipMovCcIN, AV10Existencias, AV19FilterFullText, AV28CuentaCorrienteProductos2_SDTs, sPrefix) ;
         nGXsfl_103_idx = nGXsfl_103_bak_idx ;
         sGXsfl_103_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_103_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1032( ) ;
      }
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV36ManageFiltersData", AV36ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26GridState", AV26GridState);
   }

   public void e191A92( )
   {
      AV84GXV1 = (int)(nGXsfl_103_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV84GXV1 > 0 ) && ( AV28CuentaCorrienteProductos2_SDTs.size() >= AV84GXV1 ) )
      {
         AV28CuentaCorrienteProductos2_SDTs.currentItem( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)) );
      }
      /* 'DoModificarLoten' Routine */
      returnInSub = false ;
      if ( (GXutil.strcmp("", AV64Lotenuevo)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO hay lote", ""));
      }
      else
      {
         /* Start For Each Line */
         nRC_GXsfl_103 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_103"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_103_fel_idx = 0 ;
         while ( nGXsfl_103_fel_idx < nRC_GXsfl_103 )
         {
            nGXsfl_103_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_103_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_103_fel_idx+1) ;
            sGXsfl_103_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_103_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_1032( ) ;
            AV84GXV1 = (int)(nGXsfl_103_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV28CuentaCorrienteProductos2_SDTs.size() >= AV84GXV1 ) && ( AV84GXV1 > 0 ) )
            {
               AV28CuentaCorrienteProductos2_SDTs.currentItem( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)) );
               cmbavGrupodeacciones.setName( cmbavGrupodeacciones.getInternalname() );
               cmbavGrupodeacciones.setValue( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()) );
               AV54GrupodeAcciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()))) ;
               AV53Seleccionar = ((GXutil.strcmp(httpContext.cgiGet( chkavSeleccionar.getInternalname()), "S")==0) ? "S" : "N") ;
            }
            AV81CuentaCorrienteProductos2_SDTs_Index = (short)(AV28CuentaCorrienteProductos2_SDTs.indexof(((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.currentItem()))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81CuentaCorrienteProductos2_SDTs_Index", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81CuentaCorrienteProductos2_SDTs_Index), 4, 0));
            if ( ( GXutil.strcmp(AV53Seleccionar, "S") == 0 ) && ( GXutil.strcmp(((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc(), "SC") == 0 ) )
            {
               GXv_char16[0] = AV11EmprCod ;
               GXv_char4[0] = AV6PrdNum ;
               GXv_int8[0] = ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklin() ;
               GXv_int17[0] = ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkbar() ;
               GXv_int6[0] = ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkreo() ;
               GXv_char3[0] = ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpar() ;
               GXv_char2[0] = AV64Lotenuevo ;
               GXv_char18[0] = AV61Usurcod ;
               GXv_char19[0] = AV62Station ;
               new app.plotescall(remoteHandle, context).execute( GXv_char16, GXv_char4, GXv_int8, GXv_int17, GXv_int6, GXv_char3, GXv_char2, GXv_char18, GXv_char19) ;
               cuentacorrienteproductos_wc_impl.this.AV11EmprCod = GXv_char16[0] ;
               cuentacorrienteproductos_wc_impl.this.AV6PrdNum = GXv_char4[0] ;
               ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklin( GXv_int8[0] );
               ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkbar( GXv_int17[0] );
               ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkreo( GXv_int6[0] );
               ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpar( GXv_char3[0] );
               cuentacorrienteproductos_wc_impl.this.AV64Lotenuevo = GXv_char2[0] ;
               cuentacorrienteproductos_wc_impl.this.AV61Usurcod = GXv_char18[0] ;
               cuentacorrienteproductos_wc_impl.this.AV62Station = GXv_char19[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6PrdNum", AV6PrdNum);
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Lotenuevo", AV64Lotenuevo);
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Usurcod", AV61Usurcod);
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Station", AV62Station);
            }
            /* End For Each Line */
         }
         if ( nGXsfl_103_fel_idx == 0 )
         {
            nGXsfl_103_idx = 1 ;
            sGXsfl_103_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_103_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_1032( ) ;
         }
         nGXsfl_103_fel_idx = 1 ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28CuentaCorrienteProductos2_SDTs", AV28CuentaCorrienteProductos2_SDTs);
      nGXsfl_103_bak_idx = nGXsfl_103_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV11EmprCod, AV6PrdNum, AV69Siacumular, AV98Pgmname, AV7CCStkFec, AV8CCStkFec_to, AV9TipMovCcIN, AV10Existencias, AV19FilterFullText, AV28CuentaCorrienteProductos2_SDTs, sPrefix) ;
      nGXsfl_103_idx = nGXsfl_103_bak_idx ;
      sGXsfl_103_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_103_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1032( ) ;
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV33ColumnsSelector", AV33ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV36ManageFiltersData", AV36ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26GridState", AV26GridState);
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
      AV33ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector20[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "&Seleccionar", "", "Op", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "CuentaCorrienteProductos2_SDTs__Ccstklin", "", "Linea", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "CuentaCorrienteProductos2_SDTs__Ccstkdiahora", "", "Dia-Hora", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "CuentaCorrienteProductos2_SDTs__TipMovCC", "", "Codigo", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "CuentaCorrienteProductos2_SDTs__CCstkdsc", "", "Tipo Movimiento", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "CuentaCorrienteProductos2_SDTs__Ccstkcane", "Cantidad", "Entrada", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "CuentaCorrienteProductos2_SDTs__Ccstkcans", "Cantidad", "Salida", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "CuentaCorrienteProductos2_SDTs__Ccstkpre", "", "Precio", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "CuentaCorrienteProductos2_SDTs__Existencias", "", "Existencias", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "CuentaCorrienteProductos2_SDTs__CCStkLot", "", "Lote", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "CuentaCorrienteProductos2_SDTs__Ccstknhdr", "", "Nº Doc", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "CuentaCorrienteProductos2_SDTs__CcstkUsu", "", "Usuario", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXt_char1 = AV32UserCustomValue ;
      GXv_char19[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "CuentaCorrienteProductos_WCColumnsSelector", GXv_char19) ;
      cuentacorrienteproductos_wc_impl.this.GXt_char1 = GXv_char19[0] ;
      AV32UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV32UserCustomValue)==0) ) )
      {
         AV34ColumnsSelectorAux.fromxml(AV32UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector20[0] = AV34ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector21[0] = AV33ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, GXv_SdtWWPColumnsSelector21) ;
         AV34ColumnsSelectorAux = GXv_SdtWWPColumnsSelector20[0] ;
         AV33ColumnsSelector = GXv_SdtWWPColumnsSelector21[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item22 = AV36ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item23[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item22 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "CuentaCorrienteProductos_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item23) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item22 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item23[0] ;
      AV36ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item22 ;
   }

   public void S162( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV19FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19FilterFullText", AV19FilterFullText);
   }

   public void S182( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      AV81CuentaCorrienteProductos2_SDTs_Index = (short)(AV28CuentaCorrienteProductos2_SDTs.indexof(((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.currentItem()))) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81CuentaCorrienteProductos2_SDTs_Index", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81CuentaCorrienteProductos2_SDTs_Index), 4, 0));
      Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.getMessage( "Desea eliminar la linea ", "")+GXutil.trim( GXutil.str( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklin(), 12, 0))+"?" ;
      ucDvelop_confirmpanel_eliminar.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_eliminar_Internalname, "ConfirmationText", Dvelop_confirmpanel_eliminar_Confirmationtext);
      this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
   }

   public void S202( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdsc(), httpContext.getMessage( "Consumo Manual Almacen,wIntMov", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Esta linea, NO se puede Eliminar", ""));
      }
      else
      {
         GXv_char19[0] = AV11EmprCod ;
         GXv_char18[0] = AV6PrdNum ;
         GXv_int8[0] = ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklin() ;
         new app.pkccstks(remoteHandle, context).execute( GXv_char19, GXv_char18, GXv_int8) ;
         cuentacorrienteproductos_wc_impl.this.AV11EmprCod = GXv_char19[0] ;
         cuentacorrienteproductos_wc_impl.this.AV6PrdNum = GXv_char18[0] ;
         ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklin( GXv_int8[0] );
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6PrdNum", AV6PrdNum);
         AV56Inc_obs = httpContext.getMessage( "Producto ", "") + AV6PrdNum + " " + GXutil.trim( AV58Prdnom) + GXutil.newLine( ) ;
         AV56Inc_obs += httpContext.getMessage( "Del Rgto CCSTKS, Linea/Mov/Desc/Usua/Fecha-Hora/Cant E/Cant S =", "") + GXutil.newLine( ) ;
         AV56Inc_obs += GXutil.trim( GXutil.str( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklin(), 12, 0)) + " " + ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc() + " " + GXutil.newLine( ) ;
         AV56Inc_obs += GXutil.trim( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdsc()) + " " + GXutil.trim( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkusu()) + " " + GXutil.newLine( ) ;
         AV56Inc_obs += GXutil.trim( localUtil.ttoc( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora(), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) + " " + GXutil.trim( GXutil.str( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcane(), 12, 4)) + " " + GXutil.trim( GXutil.str( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcans(), 12, 4)) + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( AV11EmprCod, GXutil.substring( AV98Pgmname, 1, 10), AV61Usurcod, AV62Station, AV56Inc_obs, 99999999, (byte)(0), "@") ;
         AV28CuentaCorrienteProductos2_SDTs.removeItem(AV81CuentaCorrienteProductos2_SDTs_Index);
         gx_BV103 = true ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
   }

   public void S192( )
   {
      /* 'DO MODIFICARLOTE' Routine */
      returnInSub = false ;
      AV81CuentaCorrienteProductos2_SDTs_Index = (short)(AV28CuentaCorrienteProductos2_SDTs.indexof(((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.currentItem()))) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81CuentaCorrienteProductos2_SDTs_Index", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81CuentaCorrienteProductos2_SDTs_Index), 4, 0));
      if ( GXutil.strcmp(((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdsc(), httpContext.getMessage( "Consumo Manual Almacen,wIntMov", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Esta linea, NO se puede Modificar", ""));
      }
      else
      {
         if ( GXutil.strcmp(((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc(), "SC") == 0 )
         {
            AV80WebSession.setValue("Cambiolote", "");
            httpContext.popup(formatLink("app.webwuti010", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV6PrdNum)),GXutil.URLEncode(GXutil.ltrimstr(((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklin(),12,0)),GXutil.URLEncode(GXutil.ltrimstr(((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkbar(),8,0)),GXutil.URLEncode(GXutil.ltrimstr(((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkreo(),1,0)),GXutil.URLEncode(GXutil.rtrim(((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpar()))}, new String[] {"EmprCod","Prdnum","CCStkLin","CCStkBar","CCStkReo","CCStkpar"}) , new Object[] {"AV11EmprCod","AV6PrdNum","","","",""});
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
         else if ( GXutil.strcmp(((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc(), "SM") == 0 )
         {
            AV80WebSession.setValue("Cambiolote", "");
            httpContext.popup(formatLink("app.webwuti011", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV6PrdNum)),GXutil.URLEncode(GXutil.ltrimstr(((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklin(),12,0)),GXutil.URLEncode(GXutil.ltrimstr(((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkped(),8,0))}, new String[] {"EmprCod","Prdnum","CCStkLin","Ccstkped"}) , new Object[] {"AV11EmprCod","AV6PrdNum","",""});
         }
         else if ( GXutil.strcmp(((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc(), "EN") == 0 )
         {
            AV80WebSession.setValue("Cambiolote", "");
            httpContext.popup(formatLink("app.webwuti012", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV6PrdNum)),GXutil.URLEncode(GXutil.ltrimstr(((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklin(),12,0)),GXutil.URLEncode(GXutil.ltrimstr(((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklen(),4,0))}, new String[] {"EmprCod","Prdnum","CCStkLin","CCStkLen"}) , new Object[] {"AV11EmprCod","AV6PrdNum","",""});
         }
         else if ( GXutil.strcmp(((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc(), "SR") == 0 )
         {
            AV80WebSession.setValue("Cambiolote", "");
            httpContext.popup(formatLink("app.webwuti014", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV6PrdNum)),GXutil.URLEncode(GXutil.ltrimstr(((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklin(),12,0)),GXutil.URLEncode(GXutil.formatDateParm(((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV81CuentaCorrienteProductos2_SDTs_Index)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec()))}, new String[] {"EmprCod","Prdnum","CCStkLin","Recfec"}) , new Object[] {"AV11EmprCod","AV6PrdNum","",""});
         }
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV35Session.getValue(AV98Pgmname+"GridState"), "") == 0 )
      {
         AV26GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV98Pgmname+"GridState"), null, null);
      }
      else
      {
         AV26GridState.fromxml(AV35Session.getValue(AV98Pgmname+"GridState"), null, null);
      }
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S172 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV26GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV26GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV26GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S172( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV100GXV15 = 1 ;
      while ( AV100GXV15 <= AV26GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV27GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV26GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV100GXV15));
         if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV19FilterFullText = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19FilterFullText", AV19FilterFullText);
         }
         AV100GXV15 = (int)(AV100GXV15+1) ;
      }
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV26GridState.fromxml(AV35Session.getValue(AV98Pgmname+"GridState"), null, null);
      AV26GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState24[0] = AV26GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV19FilterFullText)==0), (short)(0), AV19FilterFullText, "") ;
      AV26GridState = GXv_SdtWWPGridState24[0] ;
      AV26GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV26GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV98Pgmname+"GridState", AV26GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void wb_table4_132_1A92( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnauditoriaupq_Internalname, tblTabledvelop_confirmpanel_btnauditoriaupq_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnauditoriaupq.setProperty("Title", Dvelop_confirmpanel_btnauditoriaupq_Title);
         ucDvelop_confirmpanel_btnauditoriaupq.setProperty("ConfirmationText", Dvelop_confirmpanel_btnauditoriaupq_Confirmationtext);
         ucDvelop_confirmpanel_btnauditoriaupq.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnauditoriaupq_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnauditoriaupq.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnauditoriaupq_Nobuttoncaption);
         ucDvelop_confirmpanel_btnauditoriaupq.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnauditoriaupq_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnauditoriaupq.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnauditoriaupq_Yesbuttonposition);
         ucDvelop_confirmpanel_btnauditoriaupq.setProperty("ConfirmType", Dvelop_confirmpanel_btnauditoriaupq_Confirmtype);
         ucDvelop_confirmpanel_btnauditoriaupq.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnauditoriaupq_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITORIAUPQContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITORIAUPQContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_132_1A92e( true) ;
      }
      else
      {
         wb_table4_132_1A92e( false) ;
      }
   }

   public void wb_table3_127_1A92( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminar_Internalname, tblTabledvelop_confirmpanel_eliminar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminar.setProperty("Title", Dvelop_confirmpanel_eliminar_Title);
         ucDvelop_confirmpanel_eliminar.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminar_Confirmationtext);
         ucDvelop_confirmpanel_eliminar.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminar_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminar_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminar_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminar.setProperty("ConfirmType", Dvelop_confirmpanel_eliminar_Confirmtype);
         ucDvelop_confirmpanel_eliminar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminar_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_127_1A92e( true) ;
      }
      else
      {
         wb_table3_127_1A92e( false) ;
      }
   }

   public void wb_table2_85_1A92( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV36ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table5_90_1A92( true) ;
      }
      else
      {
         wb_table5_90_1A92( false) ;
      }
      return  ;
   }

   public void wb_table5_90_1A92e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_85_1A92e( true) ;
      }
      else
      {
         wb_table2_85_1A92e( false) ;
      }
   }

   public void wb_table5_90_1A92( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'" + sPrefix + "',false,'" + sGXsfl_103_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV19FilterFullText, GXutil.rtrim( localUtil.format( AV19FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_CuentaCorrienteProductos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_90_1A92e( true) ;
      }
      else
      {
         wb_table5_90_1A92e( false) ;
      }
   }

   public void wb_table1_52_1A92( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable6_Internalname, tblUnnamedtable6_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavLotenuevo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLotenuevo_Internalname, httpContext.getMessage( "Lote", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'" + sPrefix + "',false,'" + sGXsfl_103_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLotenuevo_Internalname, GXutil.rtrim( AV64Lotenuevo), GXutil.rtrim( localUtil.format( AV64Lotenuevo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLotenuevo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLotenuevo_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CuentaCorrienteProductos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"Center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-Center;text-align:-moz-Center;text-align:-webkit-Center")+"\">") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnmodificarloten_Internalname, "gx.evt.setGridEvt("+GXutil.str( 103, 3, 0)+","+"null"+");", httpContext.getMessage( "Modificar (Op)", ""), bttBtnmodificarloten_Jsonclick, 5, httpContext.getMessage( "Modificar (Op)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOMODIFICARLOTEN\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CuentaCorrienteProductos_WC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_52_1A92e( true) ;
      }
      else
      {
         wb_table1_52_1A92e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV11EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
      AV6PrdNum = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6PrdNum", AV6PrdNum);
      AV58Prdnom = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58Prdnom", AV58Prdnom);
      AV7CCStkFec = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7CCStkFec", localUtil.format(AV7CCStkFec, "99/99/99"));
      AV8CCStkFec_to = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8CCStkFec_to", localUtil.format(AV8CCStkFec_to, "99/99/99"));
      AV9TipMovCcIN = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9TipMovCcIN", AV9TipMovCcIN);
      AV10Existencias = (java.math.BigDecimal)getParm(obj,6,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Existencias", GXutil.ltrimstr( AV10Existencias, 12, 4));
      AV43Compras = (java.math.BigDecimal)getParm(obj,7,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43Compras", GXutil.ltrimstr( AV43Compras, 12, 4));
      AV44consumos = (java.math.BigDecimal)getParm(obj,8,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44consumos", GXutil.ltrimstr( AV44consumos, 12, 4));
      AV45devoluciones = (java.math.BigDecimal)getParm(obj,9,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45devoluciones", GXutil.ltrimstr( AV45devoluciones, 12, 4));
      AV47existenciasxcuentacorriente = (java.math.BigDecimal)getParm(obj,10,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47existenciasxcuentacorriente", GXutil.ltrimstr( AV47existenciasxcuentacorriente, 12, 4));
      AV49PrdExiAlm = (java.math.BigDecimal)getParm(obj,11,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49PrdExiAlm", GXutil.ltrimstr( AV49PrdExiAlm, 12, 4));
      AV51PrdCanRes = (java.math.BigDecimal)getParm(obj,12,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51PrdCanRes", GXutil.ltrimstr( AV51PrdCanRes, 12, 4));
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
      pa1A92( ) ;
      ws1A92( ) ;
      we1A92( ) ;
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
      sCtrlAV11EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV6PrdNum = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV58Prdnom = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV7CCStkFec = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV8CCStkFec_to = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV9TipMovCcIN = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV10Existencias = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV43Compras = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV44consumos = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV45devoluciones = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV47existenciasxcuentacorriente = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV49PrdExiAlm = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV51PrdCanRes = (String)getParm(obj,12,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1A92( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "cuentacorrienteproductos_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1A92( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV11EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
         AV6PrdNum = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6PrdNum", AV6PrdNum);
         AV58Prdnom = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58Prdnom", AV58Prdnom);
         AV7CCStkFec = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7CCStkFec", localUtil.format(AV7CCStkFec, "99/99/99"));
         AV8CCStkFec_to = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8CCStkFec_to", localUtil.format(AV8CCStkFec_to, "99/99/99"));
         AV9TipMovCcIN = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9TipMovCcIN", AV9TipMovCcIN);
         AV10Existencias = (java.math.BigDecimal)getParm(obj,8,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Existencias", GXutil.ltrimstr( AV10Existencias, 12, 4));
         AV43Compras = (java.math.BigDecimal)getParm(obj,9,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43Compras", GXutil.ltrimstr( AV43Compras, 12, 4));
         AV44consumos = (java.math.BigDecimal)getParm(obj,10,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44consumos", GXutil.ltrimstr( AV44consumos, 12, 4));
         AV45devoluciones = (java.math.BigDecimal)getParm(obj,11,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45devoluciones", GXutil.ltrimstr( AV45devoluciones, 12, 4));
         AV47existenciasxcuentacorriente = (java.math.BigDecimal)getParm(obj,12,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47existenciasxcuentacorriente", GXutil.ltrimstr( AV47existenciasxcuentacorriente, 12, 4));
         AV49PrdExiAlm = (java.math.BigDecimal)getParm(obj,13,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49PrdExiAlm", GXutil.ltrimstr( AV49PrdExiAlm, 12, 4));
         AV51PrdCanRes = (java.math.BigDecimal)getParm(obj,14,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51PrdCanRes", GXutil.ltrimstr( AV51PrdCanRes, 12, 4));
      }
      wcpOAV11EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV11EmprCod") ;
      wcpOAV6PrdNum = httpContext.cgiGet( sPrefix+"wcpOAV6PrdNum") ;
      wcpOAV58Prdnom = httpContext.cgiGet( sPrefix+"wcpOAV58Prdnom") ;
      wcpOAV7CCStkFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV7CCStkFec"), 0) ;
      wcpOAV8CCStkFec_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV8CCStkFec_to"), 0) ;
      wcpOAV9TipMovCcIN = httpContext.cgiGet( sPrefix+"wcpOAV9TipMovCcIN") ;
      wcpOAV10Existencias = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV10Existencias")) ;
      wcpOAV43Compras = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV43Compras")) ;
      wcpOAV44consumos = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV44consumos")) ;
      wcpOAV45devoluciones = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV45devoluciones")) ;
      wcpOAV47existenciasxcuentacorriente = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV47existenciasxcuentacorriente")) ;
      wcpOAV49PrdExiAlm = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV49PrdExiAlm")) ;
      wcpOAV51PrdCanRes = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV51PrdCanRes")) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV11EmprCod, wcpOAV11EmprCod) != 0 ) || ( GXutil.strcmp(AV6PrdNum, wcpOAV6PrdNum) != 0 ) || ( GXutil.strcmp(AV58Prdnom, wcpOAV58Prdnom) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV7CCStkFec), GXutil.resetTime(wcpOAV7CCStkFec)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV8CCStkFec_to), GXutil.resetTime(wcpOAV8CCStkFec_to)) ) || ( GXutil.strcmp(AV9TipMovCcIN, wcpOAV9TipMovCcIN) != 0 ) || ( DecimalUtil.compareTo(AV10Existencias, wcpOAV10Existencias) != 0 ) || ( DecimalUtil.compareTo(AV43Compras, wcpOAV43Compras) != 0 ) || ( DecimalUtil.compareTo(AV44consumos, wcpOAV44consumos) != 0 ) || ( DecimalUtil.compareTo(AV45devoluciones, wcpOAV45devoluciones) != 0 ) || ( DecimalUtil.compareTo(AV47existenciasxcuentacorriente, wcpOAV47existenciasxcuentacorriente) != 0 ) || ( DecimalUtil.compareTo(AV49PrdExiAlm, wcpOAV49PrdExiAlm) != 0 ) || ( DecimalUtil.compareTo(AV51PrdCanRes, wcpOAV51PrdCanRes) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV11EmprCod = AV11EmprCod ;
      wcpOAV6PrdNum = AV6PrdNum ;
      wcpOAV58Prdnom = AV58Prdnom ;
      wcpOAV7CCStkFec = AV7CCStkFec ;
      wcpOAV8CCStkFec_to = AV8CCStkFec_to ;
      wcpOAV9TipMovCcIN = AV9TipMovCcIN ;
      wcpOAV10Existencias = AV10Existencias ;
      wcpOAV43Compras = AV43Compras ;
      wcpOAV44consumos = AV44consumos ;
      wcpOAV45devoluciones = AV45devoluciones ;
      wcpOAV47existenciasxcuentacorriente = AV47existenciasxcuentacorriente ;
      wcpOAV49PrdExiAlm = AV49PrdExiAlm ;
      wcpOAV51PrdCanRes = AV51PrdCanRes ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV11EmprCod = httpContext.cgiGet( sPrefix+"AV11EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV11EmprCod) > 0 )
      {
         AV11EmprCod = httpContext.cgiGet( sCtrlAV11EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
      }
      else
      {
         AV11EmprCod = httpContext.cgiGet( sPrefix+"AV11EmprCod_PARM") ;
      }
      sCtrlAV6PrdNum = httpContext.cgiGet( sPrefix+"AV6PrdNum_CTRL") ;
      if ( GXutil.len( sCtrlAV6PrdNum) > 0 )
      {
         AV6PrdNum = httpContext.cgiGet( sCtrlAV6PrdNum) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6PrdNum", AV6PrdNum);
      }
      else
      {
         AV6PrdNum = httpContext.cgiGet( sPrefix+"AV6PrdNum_PARM") ;
      }
      sCtrlAV58Prdnom = httpContext.cgiGet( sPrefix+"AV58Prdnom_CTRL") ;
      if ( GXutil.len( sCtrlAV58Prdnom) > 0 )
      {
         AV58Prdnom = httpContext.cgiGet( sCtrlAV58Prdnom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58Prdnom", AV58Prdnom);
      }
      else
      {
         AV58Prdnom = httpContext.cgiGet( sPrefix+"AV58Prdnom_PARM") ;
      }
      sCtrlAV7CCStkFec = httpContext.cgiGet( sPrefix+"AV7CCStkFec_CTRL") ;
      if ( GXutil.len( sCtrlAV7CCStkFec) > 0 )
      {
         AV7CCStkFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV7CCStkFec), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7CCStkFec", localUtil.format(AV7CCStkFec, "99/99/99"));
      }
      else
      {
         AV7CCStkFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV7CCStkFec_PARM"), 0) ;
      }
      sCtrlAV8CCStkFec_to = httpContext.cgiGet( sPrefix+"AV8CCStkFec_to_CTRL") ;
      if ( GXutil.len( sCtrlAV8CCStkFec_to) > 0 )
      {
         AV8CCStkFec_to = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV8CCStkFec_to), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8CCStkFec_to", localUtil.format(AV8CCStkFec_to, "99/99/99"));
      }
      else
      {
         AV8CCStkFec_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV8CCStkFec_to_PARM"), 0) ;
      }
      sCtrlAV9TipMovCcIN = httpContext.cgiGet( sPrefix+"AV9TipMovCcIN_CTRL") ;
      if ( GXutil.len( sCtrlAV9TipMovCcIN) > 0 )
      {
         AV9TipMovCcIN = httpContext.cgiGet( sCtrlAV9TipMovCcIN) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9TipMovCcIN", AV9TipMovCcIN);
      }
      else
      {
         AV9TipMovCcIN = httpContext.cgiGet( sPrefix+"AV9TipMovCcIN_PARM") ;
      }
      sCtrlAV10Existencias = httpContext.cgiGet( sPrefix+"AV10Existencias_CTRL") ;
      if ( GXutil.len( sCtrlAV10Existencias) > 0 )
      {
         AV10Existencias = localUtil.ctond( httpContext.cgiGet( sCtrlAV10Existencias)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Existencias", GXutil.ltrimstr( AV10Existencias, 12, 4));
      }
      else
      {
         AV10Existencias = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV10Existencias_PARM")) ;
      }
      sCtrlAV43Compras = httpContext.cgiGet( sPrefix+"AV43Compras_CTRL") ;
      if ( GXutil.len( sCtrlAV43Compras) > 0 )
      {
         AV43Compras = localUtil.ctond( httpContext.cgiGet( sCtrlAV43Compras)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43Compras", GXutil.ltrimstr( AV43Compras, 12, 4));
      }
      else
      {
         AV43Compras = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV43Compras_PARM")) ;
      }
      sCtrlAV44consumos = httpContext.cgiGet( sPrefix+"AV44consumos_CTRL") ;
      if ( GXutil.len( sCtrlAV44consumos) > 0 )
      {
         AV44consumos = localUtil.ctond( httpContext.cgiGet( sCtrlAV44consumos)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44consumos", GXutil.ltrimstr( AV44consumos, 12, 4));
      }
      else
      {
         AV44consumos = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV44consumos_PARM")) ;
      }
      sCtrlAV45devoluciones = httpContext.cgiGet( sPrefix+"AV45devoluciones_CTRL") ;
      if ( GXutil.len( sCtrlAV45devoluciones) > 0 )
      {
         AV45devoluciones = localUtil.ctond( httpContext.cgiGet( sCtrlAV45devoluciones)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45devoluciones", GXutil.ltrimstr( AV45devoluciones, 12, 4));
      }
      else
      {
         AV45devoluciones = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV45devoluciones_PARM")) ;
      }
      sCtrlAV47existenciasxcuentacorriente = httpContext.cgiGet( sPrefix+"AV47existenciasxcuentacorriente_CTRL") ;
      if ( GXutil.len( sCtrlAV47existenciasxcuentacorriente) > 0 )
      {
         AV47existenciasxcuentacorriente = localUtil.ctond( httpContext.cgiGet( sCtrlAV47existenciasxcuentacorriente)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47existenciasxcuentacorriente", GXutil.ltrimstr( AV47existenciasxcuentacorriente, 12, 4));
      }
      else
      {
         AV47existenciasxcuentacorriente = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV47existenciasxcuentacorriente_PARM")) ;
      }
      sCtrlAV49PrdExiAlm = httpContext.cgiGet( sPrefix+"AV49PrdExiAlm_CTRL") ;
      if ( GXutil.len( sCtrlAV49PrdExiAlm) > 0 )
      {
         AV49PrdExiAlm = localUtil.ctond( httpContext.cgiGet( sCtrlAV49PrdExiAlm)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49PrdExiAlm", GXutil.ltrimstr( AV49PrdExiAlm, 12, 4));
      }
      else
      {
         AV49PrdExiAlm = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV49PrdExiAlm_PARM")) ;
      }
      sCtrlAV51PrdCanRes = httpContext.cgiGet( sPrefix+"AV51PrdCanRes_CTRL") ;
      if ( GXutil.len( sCtrlAV51PrdCanRes) > 0 )
      {
         AV51PrdCanRes = localUtil.ctond( httpContext.cgiGet( sCtrlAV51PrdCanRes)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51PrdCanRes", GXutil.ltrimstr( AV51PrdCanRes, 12, 4));
      }
      else
      {
         AV51PrdCanRes = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV51PrdCanRes_PARM")) ;
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
      pa1A92( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1A92( ) ;
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
      ws1A92( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11EmprCod_PARM", GXutil.rtrim( AV11EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11EmprCod_CTRL", GXutil.rtrim( sCtrlAV11EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6PrdNum_PARM", GXutil.rtrim( AV6PrdNum));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6PrdNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6PrdNum_CTRL", GXutil.rtrim( sCtrlAV6PrdNum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58Prdnom_PARM", GXutil.rtrim( AV58Prdnom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV58Prdnom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58Prdnom_CTRL", GXutil.rtrim( sCtrlAV58Prdnom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7CCStkFec_PARM", localUtil.dtoc( AV7CCStkFec, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7CCStkFec)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7CCStkFec_CTRL", GXutil.rtrim( sCtrlAV7CCStkFec));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8CCStkFec_to_PARM", localUtil.dtoc( AV8CCStkFec_to, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8CCStkFec_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8CCStkFec_to_CTRL", GXutil.rtrim( sCtrlAV8CCStkFec_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9TipMovCcIN_PARM", GXutil.rtrim( AV9TipMovCcIN));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9TipMovCcIN)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9TipMovCcIN_CTRL", GXutil.rtrim( sCtrlAV9TipMovCcIN));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10Existencias_PARM", GXutil.ltrim( localUtil.ntoc( AV10Existencias, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10Existencias)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10Existencias_CTRL", GXutil.rtrim( sCtrlAV10Existencias));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43Compras_PARM", GXutil.ltrim( localUtil.ntoc( AV43Compras, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV43Compras)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43Compras_CTRL", GXutil.rtrim( sCtrlAV43Compras));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44consumos_PARM", GXutil.ltrim( localUtil.ntoc( AV44consumos, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV44consumos)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44consumos_CTRL", GXutil.rtrim( sCtrlAV44consumos));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45devoluciones_PARM", GXutil.ltrim( localUtil.ntoc( AV45devoluciones, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV45devoluciones)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45devoluciones_CTRL", GXutil.rtrim( sCtrlAV45devoluciones));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47existenciasxcuentacorriente_PARM", GXutil.ltrim( localUtil.ntoc( AV47existenciasxcuentacorriente, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV47existenciasxcuentacorriente)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47existenciasxcuentacorriente_CTRL", GXutil.rtrim( sCtrlAV47existenciasxcuentacorriente));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV49PrdExiAlm_PARM", GXutil.ltrim( localUtil.ntoc( AV49PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV49PrdExiAlm)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV49PrdExiAlm_CTRL", GXutil.rtrim( sCtrlAV49PrdExiAlm));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV51PrdCanRes_PARM", GXutil.ltrim( localUtil.ntoc( AV51PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV51PrdCanRes)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV51PrdCanRes_CTRL", GXutil.rtrim( sCtrlAV51PrdCanRes));
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
      we1A92( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115562066", true, true);
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
      httpContext.AddJavascriptSource("cuentacorrienteproductos_wc.js", "?202682115562067", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_1032( )
   {
      cmbavGrupodeacciones.setInternalname( sPrefix+"vGRUPODEACCIONES_"+sGXsfl_103_idx );
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_103_idx );
      edtavCuentacorrienteproductos2_sdts__ccstklin_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLIN_"+sGXsfl_103_idx ;
      edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDIAHORA_"+sGXsfl_103_idx ;
      edtavCuentacorrienteproductos2_sdts__tipmovcc_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__TIPMOVCC_"+sGXsfl_103_idx ;
      edtavCuentacorrienteproductos2_sdts__ccstkdsc_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDSC_"+sGXsfl_103_idx ;
      edtavCuentacorrienteproductos2_sdts__ccstkcane_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANE_"+sGXsfl_103_idx ;
      edtavCuentacorrienteproductos2_sdts__ccstkcans_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANS_"+sGXsfl_103_idx ;
      edtavCuentacorrienteproductos2_sdts__ccstkpre_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKPRE_"+sGXsfl_103_idx ;
      edtavCuentacorrienteproductos2_sdts__existencias_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__EXISTENCIAS_"+sGXsfl_103_idx ;
      edtavCuentacorrienteproductos2_sdts__ccstklot_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLOT_"+sGXsfl_103_idx ;
      edtavCuentacorrienteproductos2_sdts__ccstknhdr_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKNHDR_"+sGXsfl_103_idx ;
      edtavCuentacorrienteproductos2_sdts__ccstkusu_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKUSU_"+sGXsfl_103_idx ;
      edtavCuentacorrienteproductos2_sdts__ccstkped_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKPED_"+sGXsfl_103_idx ;
      edtavCuentacorrienteproductos2_sdts__ccstkfec_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKFEC_"+sGXsfl_103_idx ;
   }

   public void subsflControlProps_fel_1032( )
   {
      cmbavGrupodeacciones.setInternalname( sPrefix+"vGRUPODEACCIONES_"+sGXsfl_103_fel_idx );
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_103_fel_idx );
      edtavCuentacorrienteproductos2_sdts__ccstklin_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLIN_"+sGXsfl_103_fel_idx ;
      edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDIAHORA_"+sGXsfl_103_fel_idx ;
      edtavCuentacorrienteproductos2_sdts__tipmovcc_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__TIPMOVCC_"+sGXsfl_103_fel_idx ;
      edtavCuentacorrienteproductos2_sdts__ccstkdsc_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDSC_"+sGXsfl_103_fel_idx ;
      edtavCuentacorrienteproductos2_sdts__ccstkcane_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANE_"+sGXsfl_103_fel_idx ;
      edtavCuentacorrienteproductos2_sdts__ccstkcans_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANS_"+sGXsfl_103_fel_idx ;
      edtavCuentacorrienteproductos2_sdts__ccstkpre_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKPRE_"+sGXsfl_103_fel_idx ;
      edtavCuentacorrienteproductos2_sdts__existencias_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__EXISTENCIAS_"+sGXsfl_103_fel_idx ;
      edtavCuentacorrienteproductos2_sdts__ccstklot_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLOT_"+sGXsfl_103_fel_idx ;
      edtavCuentacorrienteproductos2_sdts__ccstknhdr_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKNHDR_"+sGXsfl_103_fel_idx ;
      edtavCuentacorrienteproductos2_sdts__ccstkusu_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKUSU_"+sGXsfl_103_fel_idx ;
      edtavCuentacorrienteproductos2_sdts__ccstkped_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKPED_"+sGXsfl_103_fel_idx ;
      edtavCuentacorrienteproductos2_sdts__ccstkfec_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKFEC_"+sGXsfl_103_fel_idx ;
   }

   public void sendrow_1032( )
   {
      subsflControlProps_1032( ) ;
      wb1A90( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_103_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_103_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_103_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGrupodeacciones.getEnabled()!=0)&&(cmbavGrupodeacciones.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 104,'"+sPrefix+"',false,'"+sGXsfl_103_idx+"',103)\"" : " ") ;
         if ( ( cmbavGrupodeacciones.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRUPODEACCIONES_" + sGXsfl_103_idx ;
            cmbavGrupodeacciones.setName( GXCCtl );
            cmbavGrupodeacciones.setWebtags( "" );
            if ( cmbavGrupodeacciones.getItemCount() > 0 )
            {
               if ( ( AV84GXV1 > 0 ) && ( AV28CuentaCorrienteProductos2_SDTs.size() >= AV84GXV1 ) && (0==AV54GrupodeAcciones) )
               {
                  AV54GrupodeAcciones = (short)(GXutil.lval( cmbavGrupodeacciones.getValidValue(GXutil.trim( GXutil.str( AV54GrupodeAcciones, 4, 0))))) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54GrupodeAcciones), 4, 0));
               }
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGrupodeacciones,cmbavGrupodeacciones.getInternalname(),GXutil.trim( GXutil.str( AV54GrupodeAcciones, 4, 0)),Integer.valueOf(1),cmbavGrupodeacciones.getJsonclick(),Integer.valueOf(5),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVGRUPODEACCIONES.CLICK."+sGXsfl_103_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO",cmbavGrupodeacciones.getColumnClass(),cmbavGrupodeacciones.getColumnHeaderClass(),TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGrupodeacciones.getEnabled()!=0)&&(cmbavGrupodeacciones.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,104);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV54GrupodeAcciones, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGrupodeacciones.getInternalname(), "Values", cmbavGrupodeacciones.ToJavascriptSource(), !bGXsfl_103_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavSeleccionar.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 105,'"+sPrefix+"',false,'"+sGXsfl_103_idx+"',103)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vSELECCIONAR_" + sGXsfl_103_idx ;
         chkavSeleccionar.setName( GXCCtl );
         chkavSeleccionar.setWebtags( "" );
         chkavSeleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_103_Refreshing);
         chkavSeleccionar.setCheckedValue( "N" );
         if ( (GXutil.strcmp("", AV53Seleccionar)==0) )
         {
         }
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSeleccionar.getInternalname(),AV53Seleccionar,"","",Integer.valueOf(chkavSeleccionar.getVisible()),Integer.valueOf(1),"S","",StyleString,ClassString,chkavSeleccionar.getColumnClass(),chkavSeleccionar.getColumnHeaderClass(),TempTags+" onclick="+"\"gx.fn.checkboxClick(105, this, 'S', 'N',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,105);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCuentacorrienteproductos2_sdts__ccstklin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCuentacorrienteproductos2_sdts__ccstklin_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklin(), (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCuentacorrienteproductos2_sdts__ccstklin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklin()), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklin()), "ZZZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCuentacorrienteproductos2_sdts__ccstklin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavCuentacorrienteproductos2_sdts__ccstklin_Columnclass,edtavCuentacorrienteproductos2_sdts__ccstklin_Columnheaderclass,Integer.valueOf(edtavCuentacorrienteproductos2_sdts__ccstklin_Visible),Integer.valueOf(edtavCuentacorrienteproductos2_sdts__ccstklin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Internalname,localUtil.ttoc( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora(), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora(), "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Columnclass,edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Columnheaderclass,Integer.valueOf(edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Visible),Integer.valueOf(edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCuentacorrienteproductos2_sdts__tipmovcc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCuentacorrienteproductos2_sdts__tipmovcc_Internalname,GXutil.rtrim( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCuentacorrienteproductos2_sdts__tipmovcc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavCuentacorrienteproductos2_sdts__tipmovcc_Columnclass,edtavCuentacorrienteproductos2_sdts__tipmovcc_Columnheaderclass,Integer.valueOf(edtavCuentacorrienteproductos2_sdts__tipmovcc_Visible),Integer.valueOf(edtavCuentacorrienteproductos2_sdts__tipmovcc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCuentacorrienteproductos2_sdts__ccstkdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCuentacorrienteproductos2_sdts__ccstkdsc_Internalname,GXutil.rtrim( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCuentacorrienteproductos2_sdts__ccstkdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavCuentacorrienteproductos2_sdts__ccstkdsc_Columnclass,edtavCuentacorrienteproductos2_sdts__ccstkdsc_Columnheaderclass,Integer.valueOf(edtavCuentacorrienteproductos2_sdts__ccstkdsc_Visible),Integer.valueOf(edtavCuentacorrienteproductos2_sdts__ccstkdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCuentacorrienteproductos2_sdts__ccstkcane_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCuentacorrienteproductos2_sdts__ccstkcane_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcane(), (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCuentacorrienteproductos2_sdts__ccstkcane_Enabled!=0) ? localUtil.format( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcane(), "ZZZZZZ9.9999") : localUtil.format( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcane(), "ZZZZZZ9.9999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCuentacorrienteproductos2_sdts__ccstkcane_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavCuentacorrienteproductos2_sdts__ccstkcane_Columnclass,edtavCuentacorrienteproductos2_sdts__ccstkcane_Columnheaderclass,Integer.valueOf(edtavCuentacorrienteproductos2_sdts__ccstkcane_Visible),Integer.valueOf(edtavCuentacorrienteproductos2_sdts__ccstkcane_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCuentacorrienteproductos2_sdts__ccstkcans_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCuentacorrienteproductos2_sdts__ccstkcans_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcans(), (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCuentacorrienteproductos2_sdts__ccstkcans_Enabled!=0) ? localUtil.format( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcans(), "ZZZZZZ9.9999") : localUtil.format( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcans(), "ZZZZZZ9.9999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCuentacorrienteproductos2_sdts__ccstkcans_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavCuentacorrienteproductos2_sdts__ccstkcans_Columnclass,edtavCuentacorrienteproductos2_sdts__ccstkcans_Columnheaderclass,Integer.valueOf(edtavCuentacorrienteproductos2_sdts__ccstkcans_Visible),Integer.valueOf(edtavCuentacorrienteproductos2_sdts__ccstkcans_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCuentacorrienteproductos2_sdts__ccstkpre_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCuentacorrienteproductos2_sdts__ccstkpre_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpre(), (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCuentacorrienteproductos2_sdts__ccstkpre_Enabled!=0) ? localUtil.format( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpre(), "ZZZZZZZ9.999") : localUtil.format( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpre(), "ZZZZZZZ9.999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCuentacorrienteproductos2_sdts__ccstkpre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavCuentacorrienteproductos2_sdts__ccstkpre_Columnclass,edtavCuentacorrienteproductos2_sdts__ccstkpre_Columnheaderclass,Integer.valueOf(edtavCuentacorrienteproductos2_sdts__ccstkpre_Visible),Integer.valueOf(edtavCuentacorrienteproductos2_sdts__ccstkpre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCuentacorrienteproductos2_sdts__existencias_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCuentacorrienteproductos2_sdts__existencias_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Existencias(), (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCuentacorrienteproductos2_sdts__existencias_Enabled!=0) ? localUtil.format( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Existencias(), "ZZZZZZ9.9999") : localUtil.format( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Existencias(), "ZZZZZZ9.9999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCuentacorrienteproductos2_sdts__existencias_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavCuentacorrienteproductos2_sdts__existencias_Columnclass,edtavCuentacorrienteproductos2_sdts__existencias_Columnheaderclass,Integer.valueOf(edtavCuentacorrienteproductos2_sdts__existencias_Visible),Integer.valueOf(edtavCuentacorrienteproductos2_sdts__existencias_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCuentacorrienteproductos2_sdts__ccstklot_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCuentacorrienteproductos2_sdts__ccstklot_Internalname,GXutil.rtrim( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklot()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCuentacorrienteproductos2_sdts__ccstklot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavCuentacorrienteproductos2_sdts__ccstklot_Columnclass,edtavCuentacorrienteproductos2_sdts__ccstklot_Columnheaderclass,Integer.valueOf(edtavCuentacorrienteproductos2_sdts__ccstklot_Visible),Integer.valueOf(edtavCuentacorrienteproductos2_sdts__ccstklot_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCuentacorrienteproductos2_sdts__ccstknhdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCuentacorrienteproductos2_sdts__ccstknhdr_Internalname,GXutil.rtrim( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstknhdr()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCuentacorrienteproductos2_sdts__ccstknhdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavCuentacorrienteproductos2_sdts__ccstknhdr_Columnclass,edtavCuentacorrienteproductos2_sdts__ccstknhdr_Columnheaderclass,Integer.valueOf(edtavCuentacorrienteproductos2_sdts__ccstknhdr_Visible),Integer.valueOf(edtavCuentacorrienteproductos2_sdts__ccstknhdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCuentacorrienteproductos2_sdts__ccstkusu_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCuentacorrienteproductos2_sdts__ccstkusu_Internalname,GXutil.rtrim( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkusu()),GXutil.rtrim( localUtil.format( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkusu(), "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCuentacorrienteproductos2_sdts__ccstkusu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavCuentacorrienteproductos2_sdts__ccstkusu_Columnclass,edtavCuentacorrienteproductos2_sdts__ccstkusu_Columnheaderclass,Integer.valueOf(edtavCuentacorrienteproductos2_sdts__ccstkusu_Visible),Integer.valueOf(edtavCuentacorrienteproductos2_sdts__ccstkusu_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCuentacorrienteproductos2_sdts__ccstkped_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkped(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCuentacorrienteproductos2_sdts__ccstkped_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkped()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkped()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCuentacorrienteproductos2_sdts__ccstkped_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavCuentacorrienteproductos2_sdts__ccstkped_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCuentacorrienteproductos2_sdts__ccstkfec_Internalname,localUtil.format(((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec(), "99/99/99"),localUtil.format( ((app.SdtCuentaCorrienteProductos2_SDT)AV28CuentaCorrienteProductos2_SDTs.elementAt(-1+AV84GXV1)).getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCuentacorrienteproductos2_sdts__ccstkfec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavCuentacorrienteproductos2_sdts__ccstkfec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1A92( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_103_idx = ((subGrid_Islastpage==1)&&(nGXsfl_103_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_103_idx+1) ;
         sGXsfl_103_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_103_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1032( ) ;
      }
      /* End function sendrow_1032 */
   }

   public void startgridcontrol103( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"103\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavSeleccionar.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Op", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCuentacorrienteproductos2_sdts__ccstklin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dia-Hora", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCuentacorrienteproductos2_sdts__tipmovcc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCuentacorrienteproductos2_sdts__ccstkdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Movimiento", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCuentacorrienteproductos2_sdts__ccstkcane_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCuentacorrienteproductos2_sdts__ccstkcans_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Salida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCuentacorrienteproductos2_sdts__ccstkpre_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCuentacorrienteproductos2_sdts__existencias_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Existencias", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCuentacorrienteproductos2_sdts__ccstklot_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCuentacorrienteproductos2_sdts__ccstknhdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Doc", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCuentacorrienteproductos2_sdts__ccstkusu_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Usuario", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV54GrupodeAcciones, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbavGrupodeacciones.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbavGrupodeacciones.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV53Seleccionar));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( chkavSeleccionar.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( chkavSeleccionar.getColumnHeaderClass()));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavSeleccionar.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavCuentacorrienteproductos2_sdts__ccstklin_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavCuentacorrienteproductos2_sdts__ccstklin_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCuentacorrienteproductos2_sdts__ccstklin_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCuentacorrienteproductos2_sdts__ccstklin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavCuentacorrienteproductos2_sdts__tipmovcc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavCuentacorrienteproductos2_sdts__tipmovcc_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCuentacorrienteproductos2_sdts__tipmovcc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCuentacorrienteproductos2_sdts__tipmovcc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavCuentacorrienteproductos2_sdts__ccstkdsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavCuentacorrienteproductos2_sdts__ccstkdsc_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCuentacorrienteproductos2_sdts__ccstkdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCuentacorrienteproductos2_sdts__ccstkdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavCuentacorrienteproductos2_sdts__ccstkcane_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavCuentacorrienteproductos2_sdts__ccstkcane_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCuentacorrienteproductos2_sdts__ccstkcane_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCuentacorrienteproductos2_sdts__ccstkcane_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavCuentacorrienteproductos2_sdts__ccstkcans_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavCuentacorrienteproductos2_sdts__ccstkcans_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCuentacorrienteproductos2_sdts__ccstkcans_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCuentacorrienteproductos2_sdts__ccstkcans_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavCuentacorrienteproductos2_sdts__ccstkpre_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavCuentacorrienteproductos2_sdts__ccstkpre_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCuentacorrienteproductos2_sdts__ccstkpre_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCuentacorrienteproductos2_sdts__ccstkpre_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavCuentacorrienteproductos2_sdts__existencias_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavCuentacorrienteproductos2_sdts__existencias_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCuentacorrienteproductos2_sdts__existencias_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCuentacorrienteproductos2_sdts__existencias_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavCuentacorrienteproductos2_sdts__ccstklot_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavCuentacorrienteproductos2_sdts__ccstklot_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCuentacorrienteproductos2_sdts__ccstklot_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCuentacorrienteproductos2_sdts__ccstklot_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavCuentacorrienteproductos2_sdts__ccstknhdr_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavCuentacorrienteproductos2_sdts__ccstknhdr_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCuentacorrienteproductos2_sdts__ccstknhdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCuentacorrienteproductos2_sdts__ccstknhdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavCuentacorrienteproductos2_sdts__ccstkusu_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavCuentacorrienteproductos2_sdts__ccstkusu_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCuentacorrienteproductos2_sdts__ccstkusu_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCuentacorrienteproductos2_sdts__ccstkusu_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCuentacorrienteproductos2_sdts__ccstkped_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCuentacorrienteproductos2_sdts__ccstkfec_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtavPrdexialm_Internalname = sPrefix+"vPRDEXIALM" ;
      edtavExistenciasxcuentacorriente_Internalname = sPrefix+"vEXISTENCIASXCUENTACORRIENTE" ;
      edtavDiferencia_Internalname = sPrefix+"vDIFERENCIA" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      grpUnnamedgroup3_Internalname = sPrefix+"UNNAMEDGROUP3" ;
      edtavCompras_Internalname = sPrefix+"vCOMPRAS" ;
      edtavConsumos_Internalname = sPrefix+"vCONSUMOS" ;
      edtavDevoluciones_Internalname = sPrefix+"vDEVOLUCIONES" ;
      edtavPrdcanres_Internalname = sPrefix+"vPRDCANRES" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      grpUnnamedgroup5_Internalname = sPrefix+"UNNAMEDGROUP5" ;
      edtavLotenuevo_Internalname = sPrefix+"vLOTENUEVO" ;
      bttBtnmodificarloten_Internalname = sPrefix+"BTNMODIFICARLOTEN" ;
      tblUnnamedtable6_Internalname = sPrefix+"UNNAMEDTABLE6" ;
      grpUnnamedgroup7_Internalname = sPrefix+"UNNAMEDGROUP7" ;
      bttBtnauditoriaupq_Internalname = sPrefix+"BTNAUDITORIAUPQ" ;
      divUnnamedtable8_Internalname = sPrefix+"UNNAMEDTABLE8" ;
      grpUnnamedgroup9_Internalname = sPrefix+"UNNAMEDGROUP9" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      bttBtnexportar_Internalname = sPrefix+"BTNEXPORTAR" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      edtavTexto1_Internalname = sPrefix+"vTEXTO1" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      cmbavGrupodeacciones.setInternalname( sPrefix+"vGRUPODEACCIONES" );
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR" );
      edtavCuentacorrienteproductos2_sdts__ccstklin_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLIN" ;
      edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDIAHORA" ;
      edtavCuentacorrienteproductos2_sdts__tipmovcc_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__TIPMOVCC" ;
      edtavCuentacorrienteproductos2_sdts__ccstkdsc_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDSC" ;
      edtavCuentacorrienteproductos2_sdts__ccstkcane_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANE" ;
      edtavCuentacorrienteproductos2_sdts__ccstkcans_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANS" ;
      edtavCuentacorrienteproductos2_sdts__ccstkpre_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKPRE" ;
      edtavCuentacorrienteproductos2_sdts__existencias_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__EXISTENCIAS" ;
      edtavCuentacorrienteproductos2_sdts__ccstklot_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLOT" ;
      edtavCuentacorrienteproductos2_sdts__ccstknhdr_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKNHDR" ;
      edtavCuentacorrienteproductos2_sdts__ccstkusu_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKUSU" ;
      edtavCuentacorrienteproductos2_sdts__ccstkped_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKPED" ;
      edtavCuentacorrienteproductos2_sdts__ccstkfec_Internalname = sPrefix+"CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKFEC" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_eliminar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
      Dvelop_confirmpanel_btnauditoriaupq_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_BTNAUDITORIAUPQ" ;
      tblTabledvelop_confirmpanel_btnauditoriaupq_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_BTNAUDITORIAUPQ" ;
      Grid_titlescategories_Internalname = sPrefix+"GRID_TITLESCATEGORIES" ;
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
      edtavCuentacorrienteproductos2_sdts__ccstkfec_Jsonclick = "" ;
      edtavCuentacorrienteproductos2_sdts__ccstkfec_Enabled = 0 ;
      edtavCuentacorrienteproductos2_sdts__ccstkped_Jsonclick = "" ;
      edtavCuentacorrienteproductos2_sdts__ccstkped_Enabled = 0 ;
      edtavCuentacorrienteproductos2_sdts__ccstkusu_Jsonclick = "" ;
      edtavCuentacorrienteproductos2_sdts__ccstkusu_Columnheaderclass = "" ;
      edtavCuentacorrienteproductos2_sdts__ccstkusu_Columnclass = "WWColumn" ;
      edtavCuentacorrienteproductos2_sdts__ccstkusu_Enabled = 0 ;
      edtavCuentacorrienteproductos2_sdts__ccstkusu_Visible = -1 ;
      edtavCuentacorrienteproductos2_sdts__ccstknhdr_Jsonclick = "" ;
      edtavCuentacorrienteproductos2_sdts__ccstknhdr_Columnheaderclass = "" ;
      edtavCuentacorrienteproductos2_sdts__ccstknhdr_Columnclass = "WWColumn" ;
      edtavCuentacorrienteproductos2_sdts__ccstknhdr_Enabled = 0 ;
      edtavCuentacorrienteproductos2_sdts__ccstknhdr_Visible = -1 ;
      edtavCuentacorrienteproductos2_sdts__ccstklot_Jsonclick = "" ;
      edtavCuentacorrienteproductos2_sdts__ccstklot_Columnheaderclass = "" ;
      edtavCuentacorrienteproductos2_sdts__ccstklot_Columnclass = "WWColumn" ;
      edtavCuentacorrienteproductos2_sdts__ccstklot_Enabled = 0 ;
      edtavCuentacorrienteproductos2_sdts__ccstklot_Visible = -1 ;
      edtavCuentacorrienteproductos2_sdts__existencias_Jsonclick = "" ;
      edtavCuentacorrienteproductos2_sdts__existencias_Columnheaderclass = "" ;
      edtavCuentacorrienteproductos2_sdts__existencias_Columnclass = "WWColumn" ;
      edtavCuentacorrienteproductos2_sdts__existencias_Enabled = 0 ;
      edtavCuentacorrienteproductos2_sdts__existencias_Visible = -1 ;
      edtavCuentacorrienteproductos2_sdts__ccstkpre_Jsonclick = "" ;
      edtavCuentacorrienteproductos2_sdts__ccstkpre_Columnheaderclass = "" ;
      edtavCuentacorrienteproductos2_sdts__ccstkpre_Columnclass = "WWColumn" ;
      edtavCuentacorrienteproductos2_sdts__ccstkpre_Enabled = 0 ;
      edtavCuentacorrienteproductos2_sdts__ccstkpre_Visible = -1 ;
      edtavCuentacorrienteproductos2_sdts__ccstkcans_Jsonclick = "" ;
      edtavCuentacorrienteproductos2_sdts__ccstkcans_Columnheaderclass = "" ;
      edtavCuentacorrienteproductos2_sdts__ccstkcans_Columnclass = "WWColumn" ;
      edtavCuentacorrienteproductos2_sdts__ccstkcans_Enabled = 0 ;
      edtavCuentacorrienteproductos2_sdts__ccstkcans_Visible = -1 ;
      edtavCuentacorrienteproductos2_sdts__ccstkcane_Jsonclick = "" ;
      edtavCuentacorrienteproductos2_sdts__ccstkcane_Columnheaderclass = "" ;
      edtavCuentacorrienteproductos2_sdts__ccstkcane_Columnclass = "WWColumn" ;
      edtavCuentacorrienteproductos2_sdts__ccstkcane_Enabled = 0 ;
      edtavCuentacorrienteproductos2_sdts__ccstkcane_Visible = -1 ;
      edtavCuentacorrienteproductos2_sdts__ccstkdsc_Jsonclick = "" ;
      edtavCuentacorrienteproductos2_sdts__ccstkdsc_Columnheaderclass = "" ;
      edtavCuentacorrienteproductos2_sdts__ccstkdsc_Columnclass = "WWColumn" ;
      edtavCuentacorrienteproductos2_sdts__ccstkdsc_Enabled = 0 ;
      edtavCuentacorrienteproductos2_sdts__ccstkdsc_Visible = -1 ;
      edtavCuentacorrienteproductos2_sdts__tipmovcc_Jsonclick = "" ;
      edtavCuentacorrienteproductos2_sdts__tipmovcc_Columnheaderclass = "" ;
      edtavCuentacorrienteproductos2_sdts__tipmovcc_Columnclass = "WWColumn" ;
      edtavCuentacorrienteproductos2_sdts__tipmovcc_Enabled = 0 ;
      edtavCuentacorrienteproductos2_sdts__tipmovcc_Visible = -1 ;
      edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Jsonclick = "" ;
      edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Columnheaderclass = "" ;
      edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Columnclass = "WWColumn" ;
      edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Enabled = 0 ;
      edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Visible = -1 ;
      edtavCuentacorrienteproductos2_sdts__ccstklin_Jsonclick = "" ;
      edtavCuentacorrienteproductos2_sdts__ccstklin_Columnheaderclass = "" ;
      edtavCuentacorrienteproductos2_sdts__ccstklin_Columnclass = "WWColumn" ;
      edtavCuentacorrienteproductos2_sdts__ccstklin_Enabled = 0 ;
      edtavCuentacorrienteproductos2_sdts__ccstklin_Visible = -1 ;
      chkavSeleccionar.setCaption( "" );
      chkavSeleccionar.setColumnClass( "WWColumn" );
      chkavSeleccionar.setEnabled( 1 );
      cmbavGrupodeacciones.setJsonclick( "" );
      cmbavGrupodeacciones.setVisible( -1 );
      cmbavGrupodeacciones.setEnabled( 1 );
      cmbavGrupodeacciones.setColumnClass( "WWActionGroupColumn" );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavLotenuevo_Jsonclick = "" ;
      edtavLotenuevo_Enabled = 1 ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      chkavSeleccionar.setColumnHeaderClass( "" );
      cmbavGrupodeacciones.setColumnHeaderClass( "" );
      edtavCuentacorrienteproductos2_sdts__ccstkusu_Visible = -1 ;
      edtavCuentacorrienteproductos2_sdts__ccstknhdr_Visible = -1 ;
      edtavCuentacorrienteproductos2_sdts__ccstklot_Visible = -1 ;
      edtavCuentacorrienteproductos2_sdts__existencias_Visible = -1 ;
      edtavCuentacorrienteproductos2_sdts__ccstkpre_Visible = -1 ;
      edtavCuentacorrienteproductos2_sdts__ccstkcans_Visible = -1 ;
      edtavCuentacorrienteproductos2_sdts__ccstkcane_Visible = -1 ;
      edtavCuentacorrienteproductos2_sdts__ccstkdsc_Visible = -1 ;
      edtavCuentacorrienteproductos2_sdts__tipmovcc_Visible = -1 ;
      edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Visible = -1 ;
      edtavCuentacorrienteproductos2_sdts__ccstklin_Visible = -1 ;
      chkavSeleccionar.setVisible( -1 );
      subGrid_Sortable = (byte)(0) ;
      edtavCuentacorrienteproductos2_sdts__ccstkfec_Enabled = -1 ;
      edtavCuentacorrienteproductos2_sdts__ccstkped_Enabled = -1 ;
      edtavCuentacorrienteproductos2_sdts__ccstkusu_Enabled = -1 ;
      edtavCuentacorrienteproductos2_sdts__ccstknhdr_Enabled = -1 ;
      edtavCuentacorrienteproductos2_sdts__ccstklot_Enabled = -1 ;
      edtavCuentacorrienteproductos2_sdts__existencias_Enabled = -1 ;
      edtavCuentacorrienteproductos2_sdts__ccstkpre_Enabled = -1 ;
      edtavCuentacorrienteproductos2_sdts__ccstkcans_Enabled = -1 ;
      edtavCuentacorrienteproductos2_sdts__ccstkcane_Enabled = -1 ;
      edtavCuentacorrienteproductos2_sdts__ccstkdsc_Enabled = -1 ;
      edtavCuentacorrienteproductos2_sdts__tipmovcc_Enabled = -1 ;
      edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Enabled = -1 ;
      edtavCuentacorrienteproductos2_sdts__ccstklin_Enabled = -1 ;
      edtavTexto1_Jsonclick = "" ;
      edtavTexto1_Enabled = 1 ;
      edtavPrdcanres_Jsonclick = "" ;
      edtavPrdcanres_Enabled = 0 ;
      edtavDevoluciones_Jsonclick = "" ;
      edtavDevoluciones_Enabled = 0 ;
      edtavConsumos_Jsonclick = "" ;
      edtavConsumos_Enabled = 0 ;
      edtavCompras_Jsonclick = "" ;
      edtavCompras_Enabled = 0 ;
      edtavDiferencia_Jsonclick = "" ;
      edtavDiferencia_Backstyle = (byte)(-1) ;
      edtavDiferencia_Backcolor = (int)(0xFFFFFF) ;
      edtavDiferencia_Forecolor = (int)(0x000000) ;
      edtavDiferencia_Enabled = 1 ;
      edtavExistenciasxcuentacorriente_Jsonclick = "" ;
      edtavExistenciasxcuentacorriente_Enabled = 0 ;
      edtavPrdexialm_Jsonclick = "" ;
      edtavPrdexialm_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;Cantidad;Cantidad;;;;;;;" ;
      Dvelop_confirmpanel_btnauditoriaupq_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnauditoriaupq_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnauditoriaupq_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnauditoriaupq_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnauditoriaupq_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnauditoriaupq_Confirmationtext = "¿Desea aplicar Auditoria?" ;
      Dvelop_confirmpanel_btnauditoriaupq_Title = "" ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Desea eliminar la Linea?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "|||||||||||" ;
      Ddo_grid_Columnids = "1:Seleccionar|2:CuentaCorrienteProductos2_SDTs__Ccstklin|3:CuentaCorrienteProductos2_SDTs__Ccstkdiahora|4:CuentaCorrienteProductos2_SDTs__TipMovCC|5:CuentaCorrienteProductos2_SDTs__CCstkdsc|6:CuentaCorrienteProductos2_SDTs__Ccstkcane|7:CuentaCorrienteProductos2_SDTs__Ccstkcans|8:CuentaCorrienteProductos2_SDTs__Ccstkpre|9:CuentaCorrienteProductos2_SDTs__Existencias|10:CuentaCorrienteProductos2_SDTs__CCStkLot|11:CuentaCorrienteProductos2_SDTs__Ccstknhdr|12:CuentaCorrienteProductos2_SDTs__CcstkUsu" ;
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
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Informacion Producto", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
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
      GXCCtl = "vGRUPODEACCIONES_" + sGXsfl_103_idx ;
      cmbavGrupodeacciones.setName( GXCCtl );
      cmbavGrupodeacciones.setWebtags( "" );
      if ( cmbavGrupodeacciones.getItemCount() > 0 )
      {
         if ( ( AV84GXV1 > 0 ) && ( AV28CuentaCorrienteProductos2_SDTs.size() >= AV84GXV1 ) && (0==AV54GrupodeAcciones) )
         {
         }
      }
      GXCCtl = "vSELECCIONAR_" + sGXsfl_103_idx ;
      chkavSeleccionar.setName( GXCCtl );
      chkavSeleccionar.setWebtags( "" );
      chkavSeleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_103_Refreshing);
      chkavSeleccionar.setCheckedValue( "N" );
      if ( (GXutil.strcmp("", AV53Seleccionar)==0) )
      {
      }
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV28CuentaCorrienteProductos2_SDTs',fld:'vCUENTACORRIENTEPRODUCTOS2_SDTS',grid:103,pic:''},{av:'nGXsfl_103_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:103},{av:'nRC_GXsfl_103',ctrl:'GRID',prop:'GridRC',grid:103},{av:'sPrefix'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6PrdNum',fld:'vPRDNUM',pic:''},{av:'AV69Siacumular',fld:'vSIACUMULAR',pic:'',hsh:true},{av:'AV98Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV7CCStkFec',fld:'vCCSTKFEC',pic:''},{av:'AV8CCStkFec_to',fld:'vCCSTKFEC_TO',pic:''},{av:'AV9TipMovCcIN',fld:'vTIPMOVCCIN',pic:''},{av:'AV10Existencias',fld:'vEXISTENCIAS',pic:'ZZZZZZ9.9999'},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLIN',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDIAHORA',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__TIPMOVCC',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDSC',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANE',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANS',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKPRE',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__EXISTENCIAS',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLOT',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKNHDR',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKUSU',prop:'Visible'},{av:'AV41GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV42GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGrupodeacciones'},{av:'chkavSeleccionar.getColumnHeaderClass()',ctrl:'vSELECCIONAR',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLIN',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDIAHORA',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__TIPMOVCC',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDSC',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANE',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANS',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKPRE',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__EXISTENCIAS',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLOT',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKNHDR',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKUSU',prop:'Columnheaderclass'},{av:'AV98Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV69Siacumular',fld:'vSIACUMULAR',pic:'',hsh:true},{av:'AV6PrdNum',fld:'vPRDNUM',pic:''},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV28CuentaCorrienteProductos2_SDTs',fld:'vCUENTACORRIENTEPRODUCTOS2_SDTS',grid:103,pic:''},{av:'nGXsfl_103_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:103},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_103',ctrl:'GRID',prop:'GridRC',grid:103},{av:'AV36ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV26GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e131A92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6PrdNum',fld:'vPRDNUM',pic:''},{av:'AV69Siacumular',fld:'vSIACUMULAR',pic:'',hsh:true},{av:'AV98Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV7CCStkFec',fld:'vCCSTKFEC',pic:''},{av:'AV8CCStkFec_to',fld:'vCCSTKFEC_TO',pic:''},{av:'AV9TipMovCcIN',fld:'vTIPMOVCCIN',pic:''},{av:'AV10Existencias',fld:'vEXISTENCIAS',pic:'ZZZZZZ9.9999'},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28CuentaCorrienteProductos2_SDTs',fld:'vCUENTACORRIENTEPRODUCTOS2_SDTS',grid:103,pic:''},{av:'nGXsfl_103_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:103},{av:'nRC_GXsfl_103',ctrl:'GRID',prop:'GridRC',grid:103},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e141A92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6PrdNum',fld:'vPRDNUM',pic:''},{av:'AV69Siacumular',fld:'vSIACUMULAR',pic:'',hsh:true},{av:'AV98Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV7CCStkFec',fld:'vCCSTKFEC',pic:''},{av:'AV8CCStkFec_to',fld:'vCCSTKFEC_TO',pic:''},{av:'AV9TipMovCcIN',fld:'vTIPMOVCCIN',pic:''},{av:'AV10Existencias',fld:'vEXISTENCIAS',pic:'ZZZZZZ9.9999'},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28CuentaCorrienteProductos2_SDTs',fld:'vCUENTACORRIENTEPRODUCTOS2_SDTS',grid:103,pic:''},{av:'nGXsfl_103_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:103},{av:'nRC_GXsfl_103',ctrl:'GRID',prop:'GridRC',grid:103},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e221A92',iparms:[{av:'AV28CuentaCorrienteProductos2_SDTs',fld:'vCUENTACORRIENTEPRODUCTOS2_SDTS',grid:103,pic:''},{av:'nGXsfl_103_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:103},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_103',ctrl:'GRID',prop:'GridRC',grid:103}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGrupodeacciones'},{av:'AV54GrupodeAcciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'AV53Seleccionar',fld:'vSELECCIONAR',pic:''},{av:'chkavSeleccionar.getColumnClass()',ctrl:'vSELECCIONAR',prop:'Columnclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLIN',prop:'Columnclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDIAHORA',prop:'Columnclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__TIPMOVCC',prop:'Columnclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDSC',prop:'Columnclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANE',prop:'Columnclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANS',prop:'Columnclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKPRE',prop:'Columnclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__EXISTENCIAS',prop:'Columnclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLOT',prop:'Columnclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKNHDR',prop:'Columnclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKUSU',prop:'Columnclass'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151A92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6PrdNum',fld:'vPRDNUM',pic:''},{av:'AV69Siacumular',fld:'vSIACUMULAR',pic:'',hsh:true},{av:'AV98Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV7CCStkFec',fld:'vCCSTKFEC',pic:''},{av:'AV8CCStkFec_to',fld:'vCCSTKFEC_TO',pic:''},{av:'AV9TipMovCcIN',fld:'vTIPMOVCCIN',pic:''},{av:'AV10Existencias',fld:'vEXISTENCIAS',pic:'ZZZZZZ9.9999'},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28CuentaCorrienteProductos2_SDTs',fld:'vCUENTACORRIENTEPRODUCTOS2_SDTS',grid:103,pic:''},{av:'nGXsfl_103_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:103},{av:'nRC_GXsfl_103',ctrl:'GRID',prop:'GridRC',grid:103},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLIN',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDIAHORA',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__TIPMOVCC',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDSC',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANE',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANS',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKPRE',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__EXISTENCIAS',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLOT',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKNHDR',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKUSU',prop:'Visible'},{av:'AV41GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV42GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGrupodeacciones'},{av:'chkavSeleccionar.getColumnHeaderClass()',ctrl:'vSELECCIONAR',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLIN',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDIAHORA',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__TIPMOVCC',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDSC',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANE',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANS',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKPRE',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__EXISTENCIAS',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLOT',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKNHDR',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKUSU',prop:'Columnheaderclass'},{av:'AV98Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV69Siacumular',fld:'vSIACUMULAR',pic:'',hsh:true},{av:'AV6PrdNum',fld:'vPRDNUM',pic:''},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV28CuentaCorrienteProductos2_SDTs',fld:'vCUENTACORRIENTEPRODUCTOS2_SDTS',grid:103,pic:''},{av:'nGXsfl_103_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:103},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_103',ctrl:'GRID',prop:'GridRC',grid:103},{av:'AV36ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV26GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e121A92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6PrdNum',fld:'vPRDNUM',pic:''},{av:'AV69Siacumular',fld:'vSIACUMULAR',pic:'',hsh:true},{av:'AV98Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV7CCStkFec',fld:'vCCSTKFEC',pic:''},{av:'AV8CCStkFec_to',fld:'vCCSTKFEC_TO',pic:''},{av:'AV9TipMovCcIN',fld:'vTIPMOVCCIN',pic:''},{av:'AV10Existencias',fld:'vEXISTENCIAS',pic:'ZZZZZZ9.9999'},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28CuentaCorrienteProductos2_SDTs',fld:'vCUENTACORRIENTEPRODUCTOS2_SDTS',grid:103,pic:''},{av:'nGXsfl_103_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:103},{av:'nRC_GXsfl_103',ctrl:'GRID',prop:'GridRC',grid:103},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV26GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26GridState',fld:'vGRIDSTATE',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLIN',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDIAHORA',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__TIPMOVCC',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDSC',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANE',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANS',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKPRE',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__EXISTENCIAS',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLOT',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKNHDR',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKUSU',prop:'Visible'},{av:'AV41GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV42GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGrupodeacciones'},{av:'chkavSeleccionar.getColumnHeaderClass()',ctrl:'vSELECCIONAR',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLIN',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDIAHORA',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__TIPMOVCC',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDSC',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANE',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANS',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKPRE',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__EXISTENCIAS',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLOT',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKNHDR',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKUSU',prop:'Columnheaderclass'},{av:'AV98Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV69Siacumular',fld:'vSIACUMULAR',pic:'',hsh:true},{av:'AV6PrdNum',fld:'vPRDNUM',pic:''},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV28CuentaCorrienteProductos2_SDTs',fld:'vCUENTACORRIENTEPRODUCTOS2_SDTS',grid:103,pic:''},{av:'nGXsfl_103_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:103},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_103',ctrl:'GRID',prop:'GridRC',grid:103},{av:'AV36ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRUPODEACCIONES.CLICK","{handler:'e231A92',iparms:[{av:'cmbavGrupodeacciones'},{av:'AV54GrupodeAcciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'AV28CuentaCorrienteProductos2_SDTs',fld:'vCUENTACORRIENTEPRODUCTOS2_SDTS',grid:103,pic:''},{av:'nGXsfl_103_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:103},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_103',ctrl:'GRID',prop:'GridRC',grid:103},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6PrdNum',fld:'vPRDNUM',pic:''},{av:'AV69Siacumular',fld:'vSIACUMULAR',pic:'',hsh:true},{av:'AV98Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV7CCStkFec',fld:'vCCSTKFEC',pic:''},{av:'AV8CCStkFec_to',fld:'vCCSTKFEC_TO',pic:''},{av:'AV9TipMovCcIN',fld:'vTIPMOVCCIN',pic:''},{av:'AV10Existencias',fld:'vEXISTENCIAS',pic:'ZZZZZZ9.9999'},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'sPrefix'}]");
      setEventMetadata("VGRUPODEACCIONES.CLICK",",oparms:[{av:'cmbavGrupodeacciones'},{av:'AV54GrupodeAcciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'AV81CuentaCorrienteProductos2_SDTs_Index',fld:'vCUENTACORRIENTEPRODUCTOS2_SDTS_INDEX',pic:'ZZZ9'},{av:'Dvelop_confirmpanel_eliminar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'ConfirmationText'},{av:'AV28CuentaCorrienteProductos2_SDTs',fld:'vCUENTACORRIENTEPRODUCTOS2_SDTS',grid:103,pic:''},{av:'nGXsfl_103_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:103},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_103',ctrl:'GRID',prop:'GridRC',grid:103},{av:'AV6PrdNum',fld:'vPRDNUM',pic:''},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLIN',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDIAHORA',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__TIPMOVCC',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDSC',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANE',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANS',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKPRE',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__EXISTENCIAS',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLOT',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKNHDR',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKUSU',prop:'Visible'},{av:'AV41GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV42GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'chkavSeleccionar.getColumnHeaderClass()',ctrl:'vSELECCIONAR',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLIN',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDIAHORA',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__TIPMOVCC',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDSC',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANE',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANS',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKPRE',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__EXISTENCIAS',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLOT',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKNHDR',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKUSU',prop:'Columnheaderclass'},{av:'AV98Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV69Siacumular',fld:'vSIACUMULAR',pic:'',hsh:true},{av:'AV36ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV26GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e161A92',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6PrdNum',fld:'vPRDNUM',pic:''},{av:'AV69Siacumular',fld:'vSIACUMULAR',pic:'',hsh:true},{av:'AV98Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV7CCStkFec',fld:'vCCSTKFEC',pic:''},{av:'AV8CCStkFec_to',fld:'vCCSTKFEC_TO',pic:''},{av:'AV9TipMovCcIN',fld:'vTIPMOVCCIN',pic:''},{av:'AV10Existencias',fld:'vEXISTENCIAS',pic:'ZZZZZZ9.9999'},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28CuentaCorrienteProductos2_SDTs',fld:'vCUENTACORRIENTEPRODUCTOS2_SDTS',grid:103,pic:''},{av:'nGXsfl_103_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:103},{av:'nRC_GXsfl_103',ctrl:'GRID',prop:'GridRC',grid:103},{av:'sPrefix'},{av:'AV81CuentaCorrienteProductos2_SDTs_Index',fld:'vCUENTACORRIENTEPRODUCTOS2_SDTS_INDEX',pic:'ZZZ9'},{av:'AV58Prdnom',fld:'vPRDNOM',pic:''},{av:'AV61Usurcod',fld:'vUSURCOD',pic:'@!'},{av:'AV62Station',fld:'vSTATION',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'AV28CuentaCorrienteProductos2_SDTs',fld:'vCUENTACORRIENTEPRODUCTOS2_SDTS',grid:103,pic:''},{av:'nGXsfl_103_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:103},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_103',ctrl:'GRID',prop:'GridRC',grid:103},{av:'AV81CuentaCorrienteProductos2_SDTs_Index',fld:'vCUENTACORRIENTEPRODUCTOS2_SDTS_INDEX',pic:'ZZZ9'},{av:'AV6PrdNum',fld:'vPRDNUM',pic:''},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLIN',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDIAHORA',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__TIPMOVCC',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDSC',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANE',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANS',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKPRE',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__EXISTENCIAS',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLOT',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKNHDR',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKUSU',prop:'Visible'},{av:'AV41GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV42GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGrupodeacciones'},{av:'chkavSeleccionar.getColumnHeaderClass()',ctrl:'vSELECCIONAR',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLIN',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDIAHORA',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__TIPMOVCC',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDSC',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANE',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANS',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKPRE',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__EXISTENCIAS',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLOT',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKNHDR',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKUSU',prop:'Columnheaderclass'},{av:'AV98Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV69Siacumular',fld:'vSIACUMULAR',pic:'',hsh:true},{av:'AV36ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV26GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOEXPORTAR'","{handler:'e181A92',iparms:[{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6PrdNum',fld:'vPRDNUM',pic:''},{av:'AV58Prdnom',fld:'vPRDNOM',pic:''},{av:'AV7CCStkFec',fld:'vCCSTKFEC',pic:''},{av:'AV8CCStkFec_to',fld:'vCCSTKFEC_TO',pic:''},{av:'AV10Existencias',fld:'vEXISTENCIAS',pic:'ZZZZZZ9.9999'},{av:'AV43Compras',fld:'vCOMPRAS',pic:'ZZZZZZ9.9999'},{av:'AV44consumos',fld:'vCONSUMOS',pic:'ZZZZZZ9.9999'},{av:'AV45devoluciones',fld:'vDEVOLUCIONES',pic:'ZZZZZZ9.9999'}]");
      setEventMetadata("'DOEXPORTAR'",",oparms:[]}");
      setEventMetadata("'DOAUDITORIAUPQ'","{handler:'e111A91',iparms:[]");
      setEventMetadata("'DOAUDITORIAUPQ'",",oparms:[{av:'Dvelop_confirmpanel_btnauditoriaupq_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_BTNAUDITORIAUPQ',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNAUDITORIAUPQ.CLOSE","{handler:'e171A92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6PrdNum',fld:'vPRDNUM',pic:''},{av:'AV69Siacumular',fld:'vSIACUMULAR',pic:'',hsh:true},{av:'AV98Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV7CCStkFec',fld:'vCCSTKFEC',pic:''},{av:'AV8CCStkFec_to',fld:'vCCSTKFEC_TO',pic:''},{av:'AV9TipMovCcIN',fld:'vTIPMOVCCIN',pic:''},{av:'AV10Existencias',fld:'vEXISTENCIAS',pic:'ZZZZZZ9.9999'},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28CuentaCorrienteProductos2_SDTs',fld:'vCUENTACORRIENTEPRODUCTOS2_SDTS',grid:103,pic:''},{av:'nGXsfl_103_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:103},{av:'nRC_GXsfl_103',ctrl:'GRID',prop:'GridRC',grid:103},{av:'sPrefix'},{av:'Dvelop_confirmpanel_btnauditoriaupq_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNAUDITORIAUPQ',prop:'Result'},{av:'AV78contval',fld:'vCONTVAL',pic:'ZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNAUDITORIAUPQ.CLOSE",",oparms:[{av:'AV78contval',fld:'vCONTVAL',pic:'ZZZZZZZ9'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLIN',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDIAHORA',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__TIPMOVCC',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDSC',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANE',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANS',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKPRE',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__EXISTENCIAS',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLOT',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKNHDR',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKUSU',prop:'Visible'},{av:'AV41GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV42GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGrupodeacciones'},{av:'chkavSeleccionar.getColumnHeaderClass()',ctrl:'vSELECCIONAR',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLIN',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDIAHORA',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__TIPMOVCC',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDSC',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANE',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANS',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKPRE',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__EXISTENCIAS',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLOT',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKNHDR',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKUSU',prop:'Columnheaderclass'},{av:'AV98Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV69Siacumular',fld:'vSIACUMULAR',pic:'',hsh:true},{av:'AV6PrdNum',fld:'vPRDNUM',pic:''},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV28CuentaCorrienteProductos2_SDTs',fld:'vCUENTACORRIENTEPRODUCTOS2_SDTS',grid:103,pic:''},{av:'nGXsfl_103_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:103},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_103',ctrl:'GRID',prop:'GridRC',grid:103},{av:'AV36ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV26GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOMODIFICARLOTEN'","{handler:'e191A92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6PrdNum',fld:'vPRDNUM',pic:''},{av:'AV69Siacumular',fld:'vSIACUMULAR',pic:'',hsh:true},{av:'AV98Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV7CCStkFec',fld:'vCCSTKFEC',pic:''},{av:'AV8CCStkFec_to',fld:'vCCSTKFEC_TO',pic:''},{av:'AV9TipMovCcIN',fld:'vTIPMOVCCIN',pic:''},{av:'AV10Existencias',fld:'vEXISTENCIAS',pic:'ZZZZZZ9.9999'},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28CuentaCorrienteProductos2_SDTs',fld:'vCUENTACORRIENTEPRODUCTOS2_SDTS',grid:103,pic:''},{av:'nGXsfl_103_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:103},{av:'nRC_GXsfl_103',ctrl:'GRID',grid:103,prop:'GridRC',grid:103},{av:'sPrefix'},{av:'AV64Lotenuevo',fld:'vLOTENUEVO',pic:''},{av:'AV53Seleccionar',fld:'vSELECCIONAR',grid:103,pic:''},{av:'AV61Usurcod',fld:'vUSURCOD',pic:'@!'},{av:'AV62Station',fld:'vSTATION',pic:''}]");
      setEventMetadata("'DOMODIFICARLOTEN'",",oparms:[{av:'AV81CuentaCorrienteProductos2_SDTs_Index',fld:'vCUENTACORRIENTEPRODUCTOS2_SDTS_INDEX',pic:'ZZZ9'},{av:'AV62Station',fld:'vSTATION',pic:''},{av:'AV61Usurcod',fld:'vUSURCOD',pic:'@!'},{av:'AV64Lotenuevo',fld:'vLOTENUEVO',pic:''},{av:'AV28CuentaCorrienteProductos2_SDTs',fld:'vCUENTACORRIENTEPRODUCTOS2_SDTS',grid:103,pic:''},{av:'nGXsfl_103_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:103},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_103',ctrl:'GRID',prop:'GridRC',grid:103},{av:'AV6PrdNum',fld:'vPRDNUM',pic:''},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLIN',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDIAHORA',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__TIPMOVCC',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDSC',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANE',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANS',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKPRE',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__EXISTENCIAS',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLOT',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKNHDR',prop:'Visible'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKUSU',prop:'Visible'},{av:'AV41GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV42GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGrupodeacciones'},{av:'chkavSeleccionar.getColumnHeaderClass()',ctrl:'vSELECCIONAR',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLIN',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDIAHORA',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__TIPMOVCC',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKDSC',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANE',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKCANS',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKPRE',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__EXISTENCIAS',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKLOT',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKNHDR',prop:'Columnheaderclass'},{ctrl:'CUENTACORRIENTEPRODUCTOS2_SDTS__CCSTKUSU',prop:'Columnheaderclass'},{av:'AV98Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV69Siacumular',fld:'vSIACUMULAR',pic:'',hsh:true},{av:'AV36ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV26GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("NULL","{handler:'validv_Gxv14',iparms:[]");
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
      wcpOAV11EmprCod = "" ;
      wcpOAV6PrdNum = "" ;
      wcpOAV58Prdnom = "" ;
      wcpOAV7CCStkFec = GXutil.nullDate() ;
      wcpOAV8CCStkFec_to = GXutil.nullDate() ;
      wcpOAV9TipMovCcIN = "" ;
      wcpOAV10Existencias = DecimalUtil.ZERO ;
      wcpOAV43Compras = DecimalUtil.ZERO ;
      wcpOAV44consumos = DecimalUtil.ZERO ;
      wcpOAV45devoluciones = DecimalUtil.ZERO ;
      wcpOAV47existenciasxcuentacorriente = DecimalUtil.ZERO ;
      wcpOAV49PrdExiAlm = DecimalUtil.ZERO ;
      wcpOAV51PrdCanRes = DecimalUtil.ZERO ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      Dvelop_confirmpanel_btnauditoriaupq_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV11EmprCod = "" ;
      AV6PrdNum = "" ;
      AV58Prdnom = "" ;
      AV7CCStkFec = GXutil.nullDate() ;
      AV8CCStkFec_to = GXutil.nullDate() ;
      AV9TipMovCcIN = "" ;
      AV10Existencias = DecimalUtil.ZERO ;
      AV43Compras = DecimalUtil.ZERO ;
      AV44consumos = DecimalUtil.ZERO ;
      AV45devoluciones = DecimalUtil.ZERO ;
      AV47existenciasxcuentacorriente = DecimalUtil.ZERO ;
      AV49PrdExiAlm = DecimalUtil.ZERO ;
      AV51PrdCanRes = DecimalUtil.ZERO ;
      AV33ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV69Siacumular = "" ;
      AV98Pgmname = "" ;
      AV19FilterFullText = "" ;
      AV28CuentaCorrienteProductos2_SDTs = new GXBaseCollection<app.SdtCuentaCorrienteProductos2_SDT>(app.SdtCuentaCorrienteProductos2_SDT.class, "CuentaCorrienteProductos2_SDT", "TexplusNET", remoteHandle);
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV36ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV39DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV26GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV61Usurcod = "" ;
      AV62Station = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV50Diferencia = DecimalUtil.ZERO ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnauditoriaupq_Jsonclick = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      bttBtnexportar_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      AV48Texto1 = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV53Seleccionar = "" ;
      AV64Lotenuevo = "" ;
      AV67EmprNom = "" ;
      AV70ActDatos = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV22WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext13 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35Session = httpContext.getWebSession();
      AV31ColumnsSelectorXML = "" ;
      AV80WebSession = httpContext.getWebSession();
      AV66File = "" ;
      AV73Dif = DecimalUtil.ZERO ;
      AV72Dif2 = DecimalUtil.ZERO ;
      AV71obs = "" ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXt_objcol_SdtCuentaCorrienteProductos2_SDT11 = new GXBaseCollection<app.SdtCuentaCorrienteProductos2_SDT>(app.SdtCuentaCorrienteProductos2_SDT.class, "CuentaCorrienteProductos2_SDT", "TexplusNET", remoteHandle);
      GXv_objcol_SdtCuentaCorrienteProductos2_SDT12 = new GXBaseCollection[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV37ManageFiltersXml = "" ;
      AV29ExcelFilename = "" ;
      AV30ErrorMessage = "" ;
      GXv_char16 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int17 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV32UserCustomValue = "" ;
      GXt_char1 = "" ;
      AV34ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector20 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector21 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item22 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item23 = new GXBaseCollection[1] ;
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      GXv_char19 = new String[1] ;
      GXv_char18 = new String[1] ;
      GXv_int8 = new long[1] ;
      AV56Inc_obs = "" ;
      AV27GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState24 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      ucDvelop_confirmpanel_btnauditoriaupq = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      bttBtnmodificarloten_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV11EmprCod = "" ;
      sCtrlAV6PrdNum = "" ;
      sCtrlAV58Prdnom = "" ;
      sCtrlAV7CCStkFec = "" ;
      sCtrlAV8CCStkFec_to = "" ;
      sCtrlAV9TipMovCcIN = "" ;
      sCtrlAV10Existencias = "" ;
      sCtrlAV43Compras = "" ;
      sCtrlAV44consumos = "" ;
      sCtrlAV45devoluciones = "" ;
      sCtrlAV47existenciasxcuentacorriente = "" ;
      sCtrlAV49PrdExiAlm = "" ;
      sCtrlAV51PrdCanRes = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV98Pgmname = "CuentaCorrienteProductos_WC" ;
      /* GeneXus formulas. */
      AV98Pgmname = "CuentaCorrienteProductos_WC" ;
      Gx_err = (short)(0) ;
      edtavPrdexialm_Enabled = 0 ;
      edtavExistenciasxcuentacorriente_Enabled = 0 ;
      edtavDiferencia_Enabled = 0 ;
      edtavCompras_Enabled = 0 ;
      edtavConsumos_Enabled = 0 ;
      edtavDevoluciones_Enabled = 0 ;
      edtavPrdcanres_Enabled = 0 ;
      edtavCuentacorrienteproductos2_sdts__ccstklin_Enabled = 0 ;
      edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Enabled = 0 ;
      edtavCuentacorrienteproductos2_sdts__tipmovcc_Enabled = 0 ;
      edtavCuentacorrienteproductos2_sdts__ccstkdsc_Enabled = 0 ;
      edtavCuentacorrienteproductos2_sdts__ccstkcane_Enabled = 0 ;
      edtavCuentacorrienteproductos2_sdts__ccstkcans_Enabled = 0 ;
      edtavCuentacorrienteproductos2_sdts__ccstkpre_Enabled = 0 ;
      edtavCuentacorrienteproductos2_sdts__existencias_Enabled = 0 ;
      edtavCuentacorrienteproductos2_sdts__ccstklot_Enabled = 0 ;
      edtavCuentacorrienteproductos2_sdts__ccstknhdr_Enabled = 0 ;
      edtavCuentacorrienteproductos2_sdts__ccstkusu_Enabled = 0 ;
      edtavCuentacorrienteproductos2_sdts__ccstkped_Enabled = 0 ;
      edtavCuentacorrienteproductos2_sdts__ccstkfec_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV38ManageFiltersExecutionStep ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private byte edtavDiferencia_Backstyle ;
   private short AV81CuentaCorrienteProductos2_SDTs_Index ;
   private short wbEnd ;
   private short wbStart ;
   private short AV54GrupodeAcciones ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV68Cotexsur ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_103 ;
   private int nGXsfl_103_idx=1 ;
   private int AV78contval ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPrdexialm_Enabled ;
   private int edtavExistenciasxcuentacorriente_Enabled ;
   private int edtavDiferencia_Enabled ;
   private int edtavDiferencia_Forecolor ;
   private int edtavDiferencia_Backcolor ;
   private int edtavCompras_Enabled ;
   private int edtavConsumos_Enabled ;
   private int edtavDevoluciones_Enabled ;
   private int edtavPrdcanres_Enabled ;
   private int edtavTexto1_Enabled ;
   private int AV84GXV1 ;
   private int subGrid_Islastpage ;
   private int edtavCuentacorrienteproductos2_sdts__ccstklin_Enabled ;
   private int edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Enabled ;
   private int edtavCuentacorrienteproductos2_sdts__tipmovcc_Enabled ;
   private int edtavCuentacorrienteproductos2_sdts__ccstkdsc_Enabled ;
   private int edtavCuentacorrienteproductos2_sdts__ccstkcane_Enabled ;
   private int edtavCuentacorrienteproductos2_sdts__ccstkcans_Enabled ;
   private int edtavCuentacorrienteproductos2_sdts__ccstkpre_Enabled ;
   private int edtavCuentacorrienteproductos2_sdts__existencias_Enabled ;
   private int edtavCuentacorrienteproductos2_sdts__ccstklot_Enabled ;
   private int edtavCuentacorrienteproductos2_sdts__ccstknhdr_Enabled ;
   private int edtavCuentacorrienteproductos2_sdts__ccstkusu_Enabled ;
   private int edtavCuentacorrienteproductos2_sdts__ccstkped_Enabled ;
   private int edtavCuentacorrienteproductos2_sdts__ccstkfec_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_103_fel_idx=1 ;
   private int edtavCuentacorrienteproductos2_sdts__ccstklin_Visible ;
   private int edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Visible ;
   private int edtavCuentacorrienteproductos2_sdts__tipmovcc_Visible ;
   private int edtavCuentacorrienteproductos2_sdts__ccstkdsc_Visible ;
   private int edtavCuentacorrienteproductos2_sdts__ccstkcane_Visible ;
   private int edtavCuentacorrienteproductos2_sdts__ccstkcans_Visible ;
   private int edtavCuentacorrienteproductos2_sdts__ccstkpre_Visible ;
   private int edtavCuentacorrienteproductos2_sdts__existencias_Visible ;
   private int edtavCuentacorrienteproductos2_sdts__ccstklot_Visible ;
   private int edtavCuentacorrienteproductos2_sdts__ccstknhdr_Visible ;
   private int edtavCuentacorrienteproductos2_sdts__ccstkusu_Visible ;
   private int AV40PageToGo ;
   private int nGXsfl_103_bak_idx=1 ;
   private int GXv_int17[] ;
   private int AV100GXV15 ;
   private int edtavFilterfulltext_Enabled ;
   private int edtavLotenuevo_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV41GridCurrentPage ;
   private long AV42GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long GXt_int7 ;
   private long GXv_int8[] ;
   private java.math.BigDecimal wcpOAV10Existencias ;
   private java.math.BigDecimal wcpOAV43Compras ;
   private java.math.BigDecimal wcpOAV44consumos ;
   private java.math.BigDecimal wcpOAV45devoluciones ;
   private java.math.BigDecimal wcpOAV47existenciasxcuentacorriente ;
   private java.math.BigDecimal wcpOAV49PrdExiAlm ;
   private java.math.BigDecimal wcpOAV51PrdCanRes ;
   private java.math.BigDecimal AV10Existencias ;
   private java.math.BigDecimal AV43Compras ;
   private java.math.BigDecimal AV44consumos ;
   private java.math.BigDecimal AV45devoluciones ;
   private java.math.BigDecimal AV47existenciasxcuentacorriente ;
   private java.math.BigDecimal AV49PrdExiAlm ;
   private java.math.BigDecimal AV51PrdCanRes ;
   private java.math.BigDecimal AV50Diferencia ;
   private java.math.BigDecimal AV73Dif ;
   private java.math.BigDecimal AV72Dif2 ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private String wcpOAV11EmprCod ;
   private String wcpOAV6PrdNum ;
   private String wcpOAV58Prdnom ;
   private String wcpOAV9TipMovCcIN ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String Dvelop_confirmpanel_btnauditoriaupq_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV11EmprCod ;
   private String AV6PrdNum ;
   private String AV58Prdnom ;
   private String AV9TipMovCcIN ;
   private String sGXsfl_103_idx="0001" ;
   private String AV69Siacumular ;
   private String AV98Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV61Usurcod ;
   private String AV62Station ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
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
   private String Dvelop_confirmpanel_eliminar_Title ;
   private String Dvelop_confirmpanel_eliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminar_Confirmtype ;
   private String Dvelop_confirmpanel_btnauditoriaupq_Title ;
   private String Dvelop_confirmpanel_btnauditoriaupq_Confirmationtext ;
   private String Dvelop_confirmpanel_btnauditoriaupq_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnauditoriaupq_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnauditoriaupq_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnauditoriaupq_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnauditoriaupq_Confirmtype ;
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String grpUnnamedgroup3_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavPrdexialm_Internalname ;
   private String edtavPrdexialm_Jsonclick ;
   private String edtavExistenciasxcuentacorriente_Internalname ;
   private String edtavExistenciasxcuentacorriente_Jsonclick ;
   private String edtavDiferencia_Internalname ;
   private String TempTags ;
   private String edtavDiferencia_Jsonclick ;
   private String grpUnnamedgroup5_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavCompras_Internalname ;
   private String edtavCompras_Jsonclick ;
   private String edtavConsumos_Internalname ;
   private String edtavConsumos_Jsonclick ;
   private String edtavDevoluciones_Internalname ;
   private String edtavDevoluciones_Jsonclick ;
   private String edtavPrdcanres_Internalname ;
   private String edtavPrdcanres_Jsonclick ;
   private String grpUnnamedgroup7_Internalname ;
   private String grpUnnamedgroup9_Internalname ;
   private String divUnnamedtable8_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnauditoriaupq_Internalname ;
   private String bttBtnauditoriaupq_Jsonclick ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String bttBtnexportar_Internalname ;
   private String bttBtnexportar_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String edtavTexto1_Internalname ;
   private String edtavTexto1_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV53Seleccionar ;
   private String edtavCuentacorrienteproductos2_sdts__ccstklin_Internalname ;
   private String edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Internalname ;
   private String edtavCuentacorrienteproductos2_sdts__tipmovcc_Internalname ;
   private String edtavCuentacorrienteproductos2_sdts__ccstkdsc_Internalname ;
   private String edtavCuentacorrienteproductos2_sdts__ccstkcane_Internalname ;
   private String edtavCuentacorrienteproductos2_sdts__ccstkcans_Internalname ;
   private String edtavCuentacorrienteproductos2_sdts__ccstkpre_Internalname ;
   private String edtavCuentacorrienteproductos2_sdts__existencias_Internalname ;
   private String edtavCuentacorrienteproductos2_sdts__ccstklot_Internalname ;
   private String edtavCuentacorrienteproductos2_sdts__ccstknhdr_Internalname ;
   private String edtavCuentacorrienteproductos2_sdts__ccstkusu_Internalname ;
   private String edtavCuentacorrienteproductos2_sdts__ccstkped_Internalname ;
   private String edtavCuentacorrienteproductos2_sdts__ccstkfec_Internalname ;
   private String sGXsfl_103_fel_idx="0001" ;
   private String AV64Lotenuevo ;
   private String edtavLotenuevo_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String AV67EmprNom ;
   private String AV70ActDatos ;
   private String edtavCuentacorrienteproductos2_sdts__ccstklin_Columnheaderclass ;
   private String edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Columnheaderclass ;
   private String edtavCuentacorrienteproductos2_sdts__tipmovcc_Columnheaderclass ;
   private String edtavCuentacorrienteproductos2_sdts__ccstkdsc_Columnheaderclass ;
   private String edtavCuentacorrienteproductos2_sdts__ccstkcane_Columnheaderclass ;
   private String edtavCuentacorrienteproductos2_sdts__ccstkcans_Columnheaderclass ;
   private String edtavCuentacorrienteproductos2_sdts__ccstkpre_Columnheaderclass ;
   private String edtavCuentacorrienteproductos2_sdts__existencias_Columnheaderclass ;
   private String edtavCuentacorrienteproductos2_sdts__ccstklot_Columnheaderclass ;
   private String edtavCuentacorrienteproductos2_sdts__ccstknhdr_Columnheaderclass ;
   private String edtavCuentacorrienteproductos2_sdts__ccstkusu_Columnheaderclass ;
   private String AV71obs ;
   private String edtavCuentacorrienteproductos2_sdts__ccstklin_Columnclass ;
   private String edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Columnclass ;
   private String edtavCuentacorrienteproductos2_sdts__tipmovcc_Columnclass ;
   private String edtavCuentacorrienteproductos2_sdts__ccstkdsc_Columnclass ;
   private String edtavCuentacorrienteproductos2_sdts__ccstkcane_Columnclass ;
   private String edtavCuentacorrienteproductos2_sdts__ccstkcans_Columnclass ;
   private String edtavCuentacorrienteproductos2_sdts__ccstkpre_Columnclass ;
   private String edtavCuentacorrienteproductos2_sdts__existencias_Columnclass ;
   private String edtavCuentacorrienteproductos2_sdts__ccstklot_Columnclass ;
   private String edtavCuentacorrienteproductos2_sdts__ccstknhdr_Columnclass ;
   private String edtavCuentacorrienteproductos2_sdts__ccstkusu_Columnclass ;
   private String GXv_char16[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXt_char1 ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String GXv_char19[] ;
   private String GXv_char18[] ;
   private String tblTabledvelop_confirmpanel_btnauditoriaupq_Internalname ;
   private String Dvelop_confirmpanel_btnauditoriaupq_Internalname ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String tblUnnamedtable6_Internalname ;
   private String edtavLotenuevo_Jsonclick ;
   private String bttBtnmodificarloten_Internalname ;
   private String bttBtnmodificarloten_Jsonclick ;
   private String sCtrlAV11EmprCod ;
   private String sCtrlAV6PrdNum ;
   private String sCtrlAV58Prdnom ;
   private String sCtrlAV7CCStkFec ;
   private String sCtrlAV8CCStkFec_to ;
   private String sCtrlAV9TipMovCcIN ;
   private String sCtrlAV10Existencias ;
   private String sCtrlAV43Compras ;
   private String sCtrlAV44consumos ;
   private String sCtrlAV45devoluciones ;
   private String sCtrlAV47existenciasxcuentacorriente ;
   private String sCtrlAV49PrdExiAlm ;
   private String sCtrlAV51PrdCanRes ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavCuentacorrienteproductos2_sdts__ccstklin_Jsonclick ;
   private String edtavCuentacorrienteproductos2_sdts__ccstkdiahora_Jsonclick ;
   private String edtavCuentacorrienteproductos2_sdts__tipmovcc_Jsonclick ;
   private String edtavCuentacorrienteproductos2_sdts__ccstkdsc_Jsonclick ;
   private String edtavCuentacorrienteproductos2_sdts__ccstkcane_Jsonclick ;
   private String edtavCuentacorrienteproductos2_sdts__ccstkcans_Jsonclick ;
   private String edtavCuentacorrienteproductos2_sdts__ccstkpre_Jsonclick ;
   private String edtavCuentacorrienteproductos2_sdts__existencias_Jsonclick ;
   private String edtavCuentacorrienteproductos2_sdts__ccstklot_Jsonclick ;
   private String edtavCuentacorrienteproductos2_sdts__ccstknhdr_Jsonclick ;
   private String edtavCuentacorrienteproductos2_sdts__ccstkusu_Jsonclick ;
   private String edtavCuentacorrienteproductos2_sdts__ccstkped_Jsonclick ;
   private String edtavCuentacorrienteproductos2_sdts__ccstkfec_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV7CCStkFec ;
   private java.util.Date wcpOAV8CCStkFec_to ;
   private java.util.Date AV7CCStkFec ;
   private java.util.Date AV8CCStkFec_to ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
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
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_103_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV103 ;
   private boolean gx_refresh_fired ;
   private String AV31ColumnsSelectorXML ;
   private String AV37ManageFiltersXml ;
   private String AV32UserCustomValue ;
   private String AV19FilterFullText ;
   private String AV48Texto1 ;
   private String AV66File ;
   private String AV29ExcelFilename ;
   private String AV30ErrorMessage ;
   private String AV56Inc_obs ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private com.genexus.webpanels.WebSession AV80WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnauditoriaupq ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavGrupodeacciones ;
   private ICheckbox chkavSeleccionar ;
   private GXBaseCollection<app.SdtCuentaCorrienteProductos2_SDT> AV28CuentaCorrienteProductos2_SDTs ;
   private GXBaseCollection<app.SdtCuentaCorrienteProductos2_SDT> GXt_objcol_SdtCuentaCorrienteProductos2_SDT11 ;
   private GXBaseCollection<app.SdtCuentaCorrienteProductos2_SDT> GXv_objcol_SdtCuentaCorrienteProductos2_SDT12[] ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV36ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item22 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item23[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV33ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV34ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector20[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector21[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV39DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV26GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState24[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV27GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV22WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext13[] ;
}

