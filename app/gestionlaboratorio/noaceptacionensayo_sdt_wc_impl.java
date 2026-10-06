package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class noaceptacionensayo_sdt_wc_impl extends GXWebComponent
{
   public noaceptacionensayo_sdt_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public noaceptacionensayo_sdt_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( noaceptacionensayo_sdt_wc_impl.class ));
   }

   public noaceptacionensayo_sdt_wc_impl( int remoteHandle ,
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
      chkavNoaceptacionensayo_sdt__seleccionar = UIFactory.getCheckbox(this);
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
               AV5EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
               AV39Lb_Numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_Numero"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Lb_Numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39Lb_Numero), 8, 0));
               AV37Lb_fechaR = localUtil.parseDateParm( httpContext.GetPar( "Lb_fechaR")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Lb_fechaR", localUtil.format(AV37Lb_fechaR, "99/99/99"));
               AV38Lb_obscr = httpContext.GetPar( "Lb_obscr") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Lb_obscr", AV38Lb_obscr);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5EmprCod,Integer.valueOf(AV39Lb_Numero),AV37Lb_fechaR,AV38Lb_obscr});
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
      nRC_GXsfl_58 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_58"))) ;
      nGXsfl_58_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_58_idx"))) ;
      sGXsfl_58_idx = httpContext.GetPar( "sGXsfl_58_idx") ;
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
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV9ColumnsSelector);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV25NoAceptacionEnsayo_SDT);
      AV66Pgmname = httpContext.GetPar( "Pgmname") ;
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV5EmprCod = httpContext.GetPar( "EmprCod") ;
      AV39Lb_Numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_Numero"))) ;
      AV37Lb_fechaR = localUtil.parseDateParm( httpContext.GetPar( "Lb_fechaR")) ;
      AV38Lb_obscr = httpContext.GetPar( "Lb_obscr") ;
      AV40Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV9ColumnsSelector, AV25NoAceptacionEnsayo_SDT, AV66Pgmname, AV15FilterFullText, AV5EmprCod, AV39Lb_Numero, AV37Lb_fechaR, AV38Lb_obscr, AV40Moda21, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa2752( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "No Aceptacion Ensayo (SDT)", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.gestionlaboratorio.noaceptacionensayo_sdt_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV39Lb_Numero,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV37Lb_fechaR)),GXutil.URLEncode(GXutil.rtrim(AV38Lb_obscr))}, new String[] {"EmprCod","Lb_Numero","Lb_fechaR","Lb_obscr"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV40Moda21), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"NoAceptacionEnsayo_SDT_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV66Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\noaceptacionensayo_sdt_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Noaceptacionensayo_sdt", AV25NoAceptacionEnsayo_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Noaceptacionensayo_sdt", AV25NoAceptacionEnsayo_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_58", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_58, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV22ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV22ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV16GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV17GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV12DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV12DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV9ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV9ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5EmprCod", GXutil.rtrim( wcpOAV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV39Lb_Numero", GXutil.ltrim( localUtil.ntoc( wcpOAV39Lb_Numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV37Lb_fechaR", localUtil.dtoc( wcpOAV37Lb_fechaR, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV38Lb_obscr", wcpOAV38Lb_obscr);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV23ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vNOACEPTACIONENSAYO_SDT", AV25NoAceptacionEnsayo_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vNOACEPTACIONENSAYO_SDT", AV25NoAceptacionEnsayo_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_NUMERO", GXutil.ltrim( localUtil.ntoc( AV39Lb_Numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_FECHAR", localUtil.dtoc( AV37Lb_fechaR, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_OBSCR", AV38Lb_obscr);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV18GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV18GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV40Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV40Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV41CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vVAR_SELECCIONAR", AV45Var_seleccionar);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vNOACEPTACIONENSAYO_SDT_ITEM", AV34NoAceptacionEnsayo_SDT_item);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vNOACEPTACIONENSAYO_SDT_ITEM", AV34NoAceptacionEnsayo_SDT_item);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGXV16", GXutil.ltrim( localUtil.ntoc( AV67GXV16, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLINEAS", GXutil.ltrim( localUtil.ntoc( AV48Lineas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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

   public void renderHtmlCloseForm2752( )
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
      return "GestionLaboratorio.NoAceptacionEnsayo_SDT_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "No Aceptacion Ensayo (SDT)", "") ;
   }

   public void wb2750( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.gestionlaboratorio.noaceptacionensayo_sdt_wc");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 58, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\NoAceptacionEnsayo_SDT_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 58, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\NoAceptacionEnsayo_SDT_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 58, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\NoAceptacionEnsayo_SDT_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_2752( true) ;
      }
      else
      {
         wb_table1_23_2752( false) ;
      }
      return  ;
   }

   public void wb_table1_23_2752e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 58, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e112751_client"+"'", TempTags, "", 2, "HLP_GestionLaboratorio\\NoAceptacionEnsayo_SDT_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnmarcartodas_Internalname, "gx.evt.setGridEvt("+GXutil.str( 58, 2, 0)+","+"null"+");", "++", bttBtnmarcartodas_Jsonclick, 5, "++", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOMARCARTODAS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\NoAceptacionEnsayo_SDT_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndesmarcartodas_Internalname, "gx.evt.setGridEvt("+GXutil.str( 58, 2, 0)+","+"null"+");", "--", bttBtndesmarcartodas_Jsonclick, 5, "--", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DODESMARCARTODAS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\NoAceptacionEnsayo_SDT_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancelar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 58, 2, 0)+","+"null"+");", httpContext.getMessage( "Cancelar", ""), bttBtncancelar_Jsonclick, 5, httpContext.getMessage( "Cancelar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOCANCELAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\NoAceptacionEnsayo_SDT_WC.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         startgridcontrol58( ) ;
      }
      if ( wbEnd == 58 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_58 = (int)(nGXsfl_58_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV51GXV1 = nGXsfl_58_idx ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV16GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV17GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV66Pgmname), GXutil.rtrim( localUtil.format( AV66Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\NoAceptacionEnsayo_SDT_WC.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV12DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV12DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV9ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'" + sPrefix + "',false,'" + sGXsfl_58_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavNoaceptacionensayo_sdt_json_Internalname, AV46NoAceptacionEnsayo_SDT_json, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,88);\"", (short)(0), edtavNoaceptacionensayo_sdt_json_Visible, 1, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_GestionLaboratorio\\NoAceptacionEnsayo_SDT_WC.htm");
         wb_table2_89_2752( true) ;
      }
      else
      {
         wb_table2_89_2752( false) ;
      }
      return  ;
   }

   public void wb_table2_89_2752e( boolean wbgen )
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
      if ( wbEnd == 58 )
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
               AV51GXV1 = nGXsfl_58_idx ;
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

   public void start2752( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "No Aceptacion Ensayo (SDT)", ""), (short)(0)) ;
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
            strup2750( ) ;
         }
      }
   }

   public void ws2752( )
   {
      start2752( ) ;
      evt2752( ) ;
   }

   public void evt2752( )
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
                              strup2750( ) ;
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
                              strup2750( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e122752 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2750( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e132752 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2750( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e142752 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2750( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e152752 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2750( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e162752 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOMARCARTODAS'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2750( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoMarcarTodas' */
                                 e172752 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DODESMARCARTODAS'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2750( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoDesmarcarTodas' */
                                 e182752 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCANCELAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2750( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoCancelar' */
                                 e192752 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2750( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e202752 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2750( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e212752 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2750( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = chkavNoaceptacionensayo_sdt__seleccionar.getInternalname() ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 41), "NOACEPTACIONENSAYO_SDT__SELECCIONAR.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 41), "NOACEPTACIONENSAYO_SDT__SELECCIONAR.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2750( ) ;
                           }
                           nGXsfl_58_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_582( ) ;
                           AV51GXV1 = (int)(nGXsfl_58_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV25NoAceptacionEnsayo_SDT.size() >= AV51GXV1 ) && ( AV51GXV1 > 0 ) )
                           {
                              AV25NoAceptacionEnsayo_SDT.currentItem( ((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)) );
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
                                       GX_FocusControl = chkavNoaceptacionensayo_sdt__seleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e222752 ();
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
                                       GX_FocusControl = chkavNoaceptacionensayo_sdt__seleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e232752 ();
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
                                       GX_FocusControl = chkavNoaceptacionensayo_sdt__seleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e242752 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "NOACEPTACIONENSAYO_SDT__SELECCIONAR.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = chkavNoaceptacionensayo_sdt__seleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e252752 ();
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
                                    strup2750( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = chkavNoaceptacionensayo_sdt__seleccionar.getInternalname() ;
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

   public void we2752( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2752( ) ;
         }
      }
   }

   public void pa2752( )
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
      subsflControlProps_582( ) ;
      while ( nGXsfl_58_idx <= nRC_GXsfl_58 )
      {
         sendrow_582( ) ;
         nGXsfl_58_idx = ((subGrid_Islastpage==1)&&(nGXsfl_58_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_58_idx+1) ;
         sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_582( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 byte AV23ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV9ColumnsSelector ,
                                 GXBaseCollection<app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item> AV25NoAceptacionEnsayo_SDT ,
                                 String AV66Pgmname ,
                                 String AV15FilterFullText ,
                                 String AV5EmprCod ,
                                 int AV39Lb_Numero ,
                                 java.util.Date AV37Lb_fechaR ,
                                 String AV38Lb_obscr ,
                                 short AV40Moda21 ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e232752 ();
      GRID_nCurrentRecord = 0 ;
      rf2752( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"NoAceptacionEnsayo_SDT_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV66Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\noaceptacionensayo_sdt_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf2752( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV66Pgmname = "GestionLaboratorio.NoAceptacionEnsayo_SDT_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Pgmname", AV66Pgmname);
      Gx_err = (short)(0) ;
      edtavNoaceptacionensayo_sdt__lb_numero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__lb_numero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__lb_numero_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__lb_opcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__lb_opcion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__lb_opcion_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__lb_colnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__lb_colnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__lb_colnom_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__lb_colnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__lb_colnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__lb_colnum_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__clicod_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__clinom_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__lb_cartaz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__lb_cartaz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__lb_cartaz_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__lb_cartazf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__lb_cartazf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__lb_cartazf_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__lb_fechaen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__lb_fechaen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__lb_fechaen_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__lb_fechar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__lb_fechar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__lb_fechar_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__lb_estado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__lb_estado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__lb_estado_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__lb_fecnoa1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__lb_fecnoa1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__lb_fecnoa1_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__lb_hhnoa1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__lb_hhnoa1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__lb_hhnoa1_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2752( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(58) ;
      /* Execute user event: Refresh */
      e232752 ();
      nGXsfl_58_idx = 1 ;
      sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_582( ) ;
      bGXsfl_58_Refreshing = true ;
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
         subsflControlProps_582( ) ;
         e242752 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_58_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e242752 ();
         }
         wbEnd = (short)(58) ;
         wb2750( ) ;
      }
      bGXsfl_58_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2752( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV40Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV40Moda21), "ZZZ9")));
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
      return AV25NoAceptacionEnsayo_SDT.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV9ColumnsSelector, AV25NoAceptacionEnsayo_SDT, AV66Pgmname, AV15FilterFullText, AV5EmprCod, AV39Lb_Numero, AV37Lb_fechaR, AV38Lb_obscr, AV40Moda21, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV9ColumnsSelector, AV25NoAceptacionEnsayo_SDT, AV66Pgmname, AV15FilterFullText, AV5EmprCod, AV39Lb_Numero, AV37Lb_fechaR, AV38Lb_obscr, AV40Moda21, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV9ColumnsSelector, AV25NoAceptacionEnsayo_SDT, AV66Pgmname, AV15FilterFullText, AV5EmprCod, AV39Lb_Numero, AV37Lb_fechaR, AV38Lb_obscr, AV40Moda21, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV9ColumnsSelector, AV25NoAceptacionEnsayo_SDT, AV66Pgmname, AV15FilterFullText, AV5EmprCod, AV39Lb_Numero, AV37Lb_fechaR, AV38Lb_obscr, AV40Moda21, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV9ColumnsSelector, AV25NoAceptacionEnsayo_SDT, AV66Pgmname, AV15FilterFullText, AV5EmprCod, AV39Lb_Numero, AV37Lb_fechaR, AV38Lb_obscr, AV40Moda21, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV66Pgmname = "GestionLaboratorio.NoAceptacionEnsayo_SDT_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Pgmname", AV66Pgmname);
      Gx_err = (short)(0) ;
      edtavNoaceptacionensayo_sdt__lb_numero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__lb_numero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__lb_numero_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__lb_opcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__lb_opcion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__lb_opcion_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__lb_colnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__lb_colnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__lb_colnom_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__lb_colnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__lb_colnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__lb_colnum_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__clicod_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__clinom_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__lb_cartaz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__lb_cartaz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__lb_cartaz_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__lb_cartazf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__lb_cartazf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__lb_cartazf_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__lb_fechaen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__lb_fechaen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__lb_fechaen_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__lb_fechar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__lb_fechar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__lb_fechar_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__lb_estado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__lb_estado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__lb_estado_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__lb_fecnoa1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__lb_fecnoa1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__lb_fecnoa1_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__lb_hhnoa1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__lb_hhnoa1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__lb_hhnoa1_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2750( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e222752 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Noaceptacionensayo_sdt"), AV25NoAceptacionEnsayo_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV22ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV12DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV9ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vNOACEPTACIONENSAYO_SDT"), AV25NoAceptacionEnsayo_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vNOACEPTACIONENSAYO_SDT_ITEM"), AV34NoAceptacionEnsayo_SDT_item);
         /* Read saved values. */
         nRC_GXsfl_58 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_58"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV16GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV17GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV5EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV5EmprCod") ;
         wcpOAV39Lb_Numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV39Lb_Numero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV37Lb_fechaR = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV37Lb_fechaR"), 0) ;
         wcpOAV38Lb_obscr = httpContext.cgiGet( sPrefix+"wcpOAV38Lb_obscr") ;
         AV67GXV16 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vGXV16"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV48Lineas = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vLINEAS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         nRC_GXsfl_58 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_58"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_58_fel_idx = 0 ;
         while ( nGXsfl_58_fel_idx < nRC_GXsfl_58 )
         {
            nGXsfl_58_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_58_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_58_fel_idx+1) ;
            sGXsfl_58_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_582( ) ;
            AV51GXV1 = (int)(nGXsfl_58_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV25NoAceptacionEnsayo_SDT.size() >= AV51GXV1 ) && ( AV51GXV1 > 0 ) )
            {
               AV25NoAceptacionEnsayo_SDT.currentItem( ((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)) );
            }
         }
         if ( nGXsfl_58_fel_idx == 0 )
         {
            nGXsfl_58_idx = 1 ;
            sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_582( ) ;
         }
         nGXsfl_58_fel_idx = 1 ;
         /* Read variables values. */
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         AV66Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Pgmname", AV66Pgmname);
         AV46NoAceptacionEnsayo_SDT_json = httpContext.cgiGet( edtavNoaceptacionensayo_sdt_json_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46NoAceptacionEnsayo_SDT_json", AV46NoAceptacionEnsayo_SDT_json);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"NoAceptacionEnsayo_SDT_WC");
         AV66Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Pgmname", AV66Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV66Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("gestionlaboratorio\\noaceptacionensayo_sdt_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e222752 ();
      if (returnInSub) return;
   }

   public void e222752( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      noaceptacionensayo_sdt_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Station = GXt_char1 ;
      GXv_char2[0] = AV5EmprCod ;
      GXv_char3[0] = AV6EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char2, GXv_char3, GXv_char4) ;
      noaceptacionensayo_sdt_wc_impl.this.AV5EmprCod = GXv_char2[0] ;
      noaceptacionensayo_sdt_wc_impl.this.AV6EmprNom = GXv_char3[0] ;
      noaceptacionensayo_sdt_wc_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
      edtavNoaceptacionensayo_sdt_json_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt_json_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt_json_Visible), 5, 0), true);
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV12DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV12DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int7 = (byte)(AV40Moda21) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      noaceptacionensayo_sdt_wc_impl.this.GXt_int7 = GXv_int8[0] ;
      AV40Moda21 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV40Moda21), "ZZZ9")));
      GXt_objcol_SdtNoAceptacionEnsayo_SDT_Item9 = AV25NoAceptacionEnsayo_SDT ;
      GXv_objcol_SdtNoAceptacionEnsayo_SDT_Item10[0] = GXt_objcol_SdtNoAceptacionEnsayo_SDT_Item9 ;
      new app.gestionlaboratorio.noaceptacionensayo_dp(remoteHandle, context).execute( AV5EmprCod, AV39Lb_Numero, GXv_objcol_SdtNoAceptacionEnsayo_SDT_Item10) ;
      GXt_objcol_SdtNoAceptacionEnsayo_SDT_Item9 = GXv_objcol_SdtNoAceptacionEnsayo_SDT_Item10[0] ;
      AV25NoAceptacionEnsayo_SDT = GXt_objcol_SdtNoAceptacionEnsayo_SDT_Item9 ;
      gx_BV58 = true ;
   }

   public void e232752( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext11[0] = AV31WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV31WWPContext = GXv_SdtWWPContext11[0] ;
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
      if ( GXutil.strcmp(AV27Session.getValue("GestionLaboratorio.NoAceptacionEnsayo_SDT_WCColumnsSelector"), "") != 0 )
      {
         AV11ColumnsSelectorXML = AV27Session.getValue("GestionLaboratorio.NoAceptacionEnsayo_SDT_WCColumnsSelector") ;
         AV9ColumnsSelector.fromxml(AV11ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S142 ();
         if (returnInSub) return;
      }
      chkavNoaceptacionensayo_sdt__seleccionar.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavNoaceptacionensayo_sdt__seleccionar.getInternalname(), "Visible", GXutil.ltrimstr( chkavNoaceptacionensayo_sdt__seleccionar.getVisible(), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__lb_numero_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__lb_numero_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__lb_numero_Visible), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__lb_opcion_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__lb_opcion_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__lb_opcion_Visible), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__lb_colnom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__lb_colnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__lb_colnom_Visible), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__lb_colnum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__lb_colnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__lb_colnum_Visible), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__clicod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__clicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__clicod_Visible), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__clinom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__clinom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__clinom_Visible), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__lb_cartaz_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__lb_cartaz_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__lb_cartaz_Visible), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__lb_cartazf_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__lb_cartazf_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__lb_cartazf_Visible), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__lb_fechaen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__lb_fechaen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__lb_fechaen_Visible), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__lb_fechar_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__lb_fechar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__lb_fechar_Visible), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__lb_estado_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__lb_estado_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__lb_estado_Visible), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__lb_fecnoa1_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__lb_fecnoa1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__lb_fecnoa1_Visible), 5, 0), !bGXsfl_58_Refreshing);
      edtavNoaceptacionensayo_sdt__lb_hhnoa1_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNoaceptacionensayo_sdt__lb_hhnoa1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNoaceptacionensayo_sdt__lb_hhnoa1_Visible), 5, 0), !bGXsfl_58_Refreshing);
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S152 ();
      if (returnInSub) return;
      AV16GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16GridCurrentPage), 10, 0));
      AV17GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17GridPageCount), 10, 0));
      AV46NoAceptacionEnsayo_SDT_json = AV25NoAceptacionEnsayo_SDT.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46NoAceptacionEnsayo_SDT_json", AV46NoAceptacionEnsayo_SDT_json);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV9ColumnsSelector", AV9ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22ManageFiltersData", AV22ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18GridState", AV18GridState);
   }

   public void e132752( )
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
         AV26PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV26PageToGo) ;
      }
   }

   public void e142752( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e242752( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV51GXV1 = 1 ;
      while ( AV51GXV1 <= AV25NoAceptacionEnsayo_SDT.size() )
      {
         AV25NoAceptacionEnsayo_SDT.currentItem( ((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(58) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_582( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_58_Refreshing )
         {
            httpContext.doAjaxLoad(58, GridRow);
         }
         AV51GXV1 = (int)(AV51GXV1+1) ;
      }
   }

   public void e152752( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV11ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV9ColumnsSelector.fromJSonString(AV11ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.NoAceptacionEnsayo_SDT_WCColumnsSelector", ((GXutil.strcmp("", AV11ColumnsSelectorXML)==0) ? "" : AV9ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV9ColumnsSelector", AV9ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22ManageFiltersData", AV22ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18GridState", AV18GridState);
   }

   public void e122752( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("GestionLaboratorio.NoAceptacionEnsayo_SDT_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV66Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("GestionLaboratorio.NoAceptacionEnsayo_SDT_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "GestionLaboratorio.NoAceptacionEnsayo_SDT_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         noaceptacionensayo_sdt_wc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV24ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV24ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S162 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV66Pgmname+"GridState", AV24ManageFiltersXml) ;
            AV18GridState.fromxml(AV24ManageFiltersXml, null, null);
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S172 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18GridState", AV18GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV9ColumnsSelector", AV9ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22ManageFiltersData", AV22ManageFiltersData);
   }

   public void e162752( )
   {
      AV51GXV1 = (int)(nGXsfl_58_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV51GXV1 > 0 ) && ( AV25NoAceptacionEnsayo_SDT.size() >= AV51GXV1 ) )
      {
         AV25NoAceptacionEnsayo_SDT.currentItem( ((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)) );
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
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25NoAceptacionEnsayo_SDT", AV25NoAceptacionEnsayo_SDT);
      nGXsfl_58_bak_idx = nGXsfl_58_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV9ColumnsSelector, AV25NoAceptacionEnsayo_SDT, AV66Pgmname, AV15FilterFullText, AV5EmprCod, AV39Lb_Numero, AV37Lb_fechaR, AV38Lb_obscr, AV40Moda21, sPrefix) ;
      nGXsfl_58_idx = nGXsfl_58_bak_idx ;
      sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_582( ) ;
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV9ColumnsSelector", AV9ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22ManageFiltersData", AV22ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18GridState", AV18GridState);
   }

   public void e172752( )
   {
      AV51GXV1 = (int)(nGXsfl_58_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV51GXV1 > 0 ) && ( AV25NoAceptacionEnsayo_SDT.size() >= AV51GXV1 ) )
      {
         AV25NoAceptacionEnsayo_SDT.currentItem( ((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)) );
      }
      /* 'DoMarcarTodas' Routine */
      returnInSub = false ;
      AV45Var_seleccionar = true ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Var_seleccionar", AV45Var_seleccionar);
      /* Execute user subroutine: 'APLICOGRID' */
      S192 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25NoAceptacionEnsayo_SDT", AV25NoAceptacionEnsayo_SDT);
      nGXsfl_58_bak_idx = nGXsfl_58_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV9ColumnsSelector, AV25NoAceptacionEnsayo_SDT, AV66Pgmname, AV15FilterFullText, AV5EmprCod, AV39Lb_Numero, AV37Lb_fechaR, AV38Lb_obscr, AV40Moda21, sPrefix) ;
      nGXsfl_58_idx = nGXsfl_58_bak_idx ;
      sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_582( ) ;
   }

   public void e182752( )
   {
      AV51GXV1 = (int)(nGXsfl_58_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV51GXV1 > 0 ) && ( AV25NoAceptacionEnsayo_SDT.size() >= AV51GXV1 ) )
      {
         AV25NoAceptacionEnsayo_SDT.currentItem( ((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)) );
      }
      /* 'DoDesmarcarTodas' Routine */
      returnInSub = false ;
      AV45Var_seleccionar = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Var_seleccionar", AV45Var_seleccionar);
      /* Execute user subroutine: 'APLICOGRID' */
      S192 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25NoAceptacionEnsayo_SDT", AV25NoAceptacionEnsayo_SDT);
      nGXsfl_58_bak_idx = nGXsfl_58_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV9ColumnsSelector, AV25NoAceptacionEnsayo_SDT, AV66Pgmname, AV15FilterFullText, AV5EmprCod, AV39Lb_Numero, AV37Lb_fechaR, AV38Lb_obscr, AV40Moda21, sPrefix) ;
      nGXsfl_58_idx = nGXsfl_58_bak_idx ;
      sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_582( ) ;
   }

   public void e192752( )
   {
      /* 'DoCancelar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e202752( )
   {
      AV51GXV1 = (int)(nGXsfl_58_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV51GXV1 > 0 ) && ( AV25NoAceptacionEnsayo_SDT.size() >= AV51GXV1 ) )
      {
         AV25NoAceptacionEnsayo_SDT.currentItem( ((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)) );
      }
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV46NoAceptacionEnsayo_SDT_json = AV25NoAceptacionEnsayo_SDT.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46NoAceptacionEnsayo_SDT_json", AV46NoAceptacionEnsayo_SDT_json);
      AV47websession.setValue("&NoAceptacionEnsayo_SDT_json", AV46NoAceptacionEnsayo_SDT_json);
      GXv_char4[0] = AV14ExcelFilename ;
      GXv_char3[0] = AV13ErrorMessage ;
      new app.gestionlaboratorio.noaceptacionensayo_sdt_wcexport(remoteHandle, context).execute( AV5EmprCod, AV39Lb_Numero, GXv_char4, GXv_char3) ;
      noaceptacionensayo_sdt_wc_impl.this.AV14ExcelFilename = GXv_char4[0] ;
      noaceptacionensayo_sdt_wc_impl.this.AV13ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV14ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV14ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV13ErrorMessage);
      }
      /*  Sending Event outputs  */
   }

   public void e212752( )
   {
      AV51GXV1 = (int)(nGXsfl_58_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV51GXV1 > 0 ) && ( AV25NoAceptacionEnsayo_SDT.size() >= AV51GXV1 ) )
      {
         AV25NoAceptacionEnsayo_SDT.currentItem( ((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)) );
      }
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV46NoAceptacionEnsayo_SDT_json = AV25NoAceptacionEnsayo_SDT.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46NoAceptacionEnsayo_SDT_json", AV46NoAceptacionEnsayo_SDT_json);
      AV47websession.setValue("&NoAceptacionEnsayo_SDT_json", AV46NoAceptacionEnsayo_SDT_json);
      callWebObject(formatLink("app.gestionlaboratorio.noaceptacionensayo_sdt_wcexportcsv", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV39Lb_Numero,8,0))}, new String[] {"Emprcod","Lb_Numero"}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
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
      AV9ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "NoAceptacionEnsayo_SDT__Seleccionar", "", "Seleccionar", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "NoAceptacionEnsayo_SDT__Lb_numero", "", "Nº de Ensayo", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "NoAceptacionEnsayo_SDT__Lb_opcion", "", "Opcion", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "NoAceptacionEnsayo_SDT__Lb_ColNom", "", "Color", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "NoAceptacionEnsayo_SDT__Lb_colnum", "", "Numero", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "NoAceptacionEnsayo_SDT__Clicod", "", "Cliente", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "NoAceptacionEnsayo_SDT__CliNom", "", "Nombre", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "NoAceptacionEnsayo_SDT__Lb_Cartaz", "", "Coleccion", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "NoAceptacionEnsayo_SDT__Lb_Cartazf", "", "Fecha", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "NoAceptacionEnsayo_SDT__Lb_FechaEn", "", "Fecha Envio", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "NoAceptacionEnsayo_SDT__Lb_FechaR", "", "Fecha Recepcion", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "NoAceptacionEnsayo_SDT__Lb_Estado", "", "Estado", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "NoAceptacionEnsayo_SDT__Lb_FecNoa1", "", "Fecha No aceptacion", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "NoAceptacionEnsayo_SDT__Lb_Hhnoa1", "", "Hora", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXt_char1 = AV30UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.NoAceptacionEnsayo_SDT_WCColumnsSelector", GXv_char4) ;
      noaceptacionensayo_sdt_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV30UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV30UserCustomValue)==0) ) )
      {
         AV10ColumnsSelectorAux.fromxml(AV30UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector12[0] = AV10ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector13[0] = AV9ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, GXv_SdtWWPColumnsSelector13) ;
         AV10ColumnsSelectorAux = GXv_SdtWWPColumnsSelector12[0] ;
         AV9ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = AV22ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "GestionLaboratorio.NoAceptacionEnsayo_SDT_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[0] ;
      AV22ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
   }

   public void S162( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
   }

   public void S182( )
   {
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      AV32Lb_opcions = " " ;
      AV33Lb_hhnoa1 = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
      AV68GXV17 = 1 ;
      while ( AV68GXV17 <= AV25NoAceptacionEnsayo_SDT.size() )
      {
         AV34NoAceptacionEnsayo_SDT_item = (app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV68GXV17));
         if ( AV34NoAceptacionEnsayo_SDT_item.getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Seleccionar() )
         {
            AV35IN_Lb_numero = AV34NoAceptacionEnsayo_SDT_item.getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_numero() ;
            AV36IN_Lb_opcion = AV34NoAceptacionEnsayo_SDT_item.getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_opcion() ;
            GXv_char4[0] = AV5EmprCod ;
            GXv_int16[0] = AV35IN_Lb_numero ;
            GXv_char3[0] = AV36IN_Lb_opcion ;
            GXv_date17[0] = AV37Lb_fechaR ;
            GXv_dtime18[0] = AV33Lb_hhnoa1 ;
            GXv_char2[0] = AV38Lb_obscr ;
            new app.gestionlaboratorio.pens044(remoteHandle, context).execute( GXv_char4, GXv_int16, GXv_char3, GXv_date17, GXv_dtime18, GXv_char2) ;
            noaceptacionensayo_sdt_wc_impl.this.AV5EmprCod = GXv_char4[0] ;
            noaceptacionensayo_sdt_wc_impl.this.AV35IN_Lb_numero = GXv_int16[0] ;
            noaceptacionensayo_sdt_wc_impl.this.AV36IN_Lb_opcion = GXv_char3[0] ;
            noaceptacionensayo_sdt_wc_impl.this.AV37Lb_fechaR = GXv_date17[0] ;
            noaceptacionensayo_sdt_wc_impl.this.AV33Lb_hhnoa1 = GXv_dtime18[0] ;
            noaceptacionensayo_sdt_wc_impl.this.AV38Lb_obscr = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Lb_fechaR", localUtil.format(AV37Lb_fechaR, "99/99/99"));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Lb_obscr", AV38Lb_obscr);
            if ( GXutil.strcmp(AV32Lb_opcions, " ") == 0 )
            {
               AV32Lb_opcions = GXutil.trim( AV36IN_Lb_opcion) + "+" ;
            }
            else
            {
               AV32Lb_opcions += GXutil.concat( AV36IN_Lb_opcion, "+", "") ;
            }
            GXv_char4[0] = AV5EmprCod ;
            GXv_int16[0] = AV35IN_Lb_numero ;
            new app.gestionlaboratorio.pdbgl01(remoteHandle, context).execute( GXv_char4, GXv_int16) ;
            noaceptacionensayo_sdt_wc_impl.this.AV5EmprCod = GXv_char4[0] ;
            noaceptacionensayo_sdt_wc_impl.this.AV35IN_Lb_numero = GXv_int16[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
            AV41CliCod = AV34NoAceptacionEnsayo_SDT_item.getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Clicod() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41CliCod), 6, 0));
         }
         AV68GXV17 = (int)(AV68GXV17+1) ;
      }
      if ( AV40Moda21 == 1 )
      {
         GXv_char4[0] = AV5EmprCod ;
         GXv_int16[0] = AV39Lb_Numero ;
         GXv_char3[0] = AV32Lb_opcions ;
         GXv_date17[0] = AV37Lb_fechaR ;
         GXv_int19[0] = AV41CliCod ;
         new app.gestionlaboratorio.pregcor9(remoteHandle, context).execute( GXv_char4, GXv_int16, GXv_char3, GXv_date17, GXv_int19) ;
         noaceptacionensayo_sdt_wc_impl.this.AV5EmprCod = GXv_char4[0] ;
         noaceptacionensayo_sdt_wc_impl.this.AV39Lb_Numero = GXv_int16[0] ;
         noaceptacionensayo_sdt_wc_impl.this.AV32Lb_opcions = GXv_char3[0] ;
         noaceptacionensayo_sdt_wc_impl.this.AV37Lb_fechaR = GXv_date17[0] ;
         noaceptacionensayo_sdt_wc_impl.this.AV41CliCod = GXv_int19[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Lb_Numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39Lb_Numero), 8, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Lb_fechaR", localUtil.format(AV37Lb_fechaR, "99/99/99"));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41CliCod), 6, 0));
      }
      GXt_objcol_SdtNoAceptacionEnsayo_SDT_Item9 = AV25NoAceptacionEnsayo_SDT ;
      GXv_objcol_SdtNoAceptacionEnsayo_SDT_Item10[0] = GXt_objcol_SdtNoAceptacionEnsayo_SDT_Item9 ;
      new app.gestionlaboratorio.noaceptacionensayo_dp(remoteHandle, context).execute( AV5EmprCod, AV39Lb_Numero, GXv_objcol_SdtNoAceptacionEnsayo_SDT_Item10) ;
      GXt_objcol_SdtNoAceptacionEnsayo_SDT_Item9 = GXv_objcol_SdtNoAceptacionEnsayo_SDT_Item10[0] ;
      AV25NoAceptacionEnsayo_SDT = GXt_objcol_SdtNoAceptacionEnsayo_SDT_Item9 ;
      gx_BV58 = true ;
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV27Session.getValue(AV66Pgmname+"GridState"), "") == 0 )
      {
         AV18GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV66Pgmname+"GridState"), null, null);
      }
      else
      {
         AV18GridState.fromxml(AV27Session.getValue(AV66Pgmname+"GridState"), null, null);
      }
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S172 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV18GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV18GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV18GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S172( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV69GXV18 = 1 ;
      while ( AV69GXV18 <= AV18GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV19GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV18GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV69GXV18));
         if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         }
         AV69GXV18 = (int)(AV69GXV18+1) ;
      }
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV18GridState.fromxml(AV27Session.getValue(AV66Pgmname+"GridState"), null, null);
      AV18GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState20[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV18GridState = GXv_SdtWWPGridState20[0] ;
      if ( ! (GXutil.strcmp("", AV5EmprCod)==0) )
      {
         AV19GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV19GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV19GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV5EmprCod );
         AV18GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV19GridStateFilterValue, 0);
      }
      if ( ! (0==AV39Lb_Numero) )
      {
         AV19GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV19GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_NUMERO" );
         AV19GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV39Lb_Numero, 8, 0) );
         AV18GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV19GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV37Lb_fechaR)) )
      {
         AV19GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV19GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_FECHAR" );
         AV19GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV37Lb_fechaR, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV18GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV19GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV38Lb_obscr)==0) )
      {
         AV19GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV19GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_OBSCR" );
         AV19GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV38Lb_obscr );
         AV18GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV19GridStateFilterValue, 0);
      }
      AV18GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV18GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV66Pgmname+"GridState", AV18GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void e252752( )
   {
      /* Noaceptacionensayo_sdt__seleccionar_Click Routine */
      returnInSub = false ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV9ColumnsSelector", AV9ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22ManageFiltersData", AV22ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18GridState", AV18GridState);
   }

   public void S192( )
   {
      /* 'APLICOGRID' Routine */
      returnInSub = false ;
      AV43i = (short)(1) ;
      while ( AV43i <= AV25NoAceptacionEnsayo_SDT.size() )
      {
         ((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV43i)).setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Seleccionar( GXutil.boolval( GXutil.booltostr( AV45Var_seleccionar)) );
         AV43i = (short)(AV43i+1) ;
      }
   }

   public void wb_table2_89_2752( boolean wbgen )
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
         wb_table2_89_2752e( true) ;
      }
      else
      {
         wb_table2_89_2752e( false) ;
      }
   }

   public void wb_table1_23_2752( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV22ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_28_2752( true) ;
      }
      else
      {
         wb_table3_28_2752( false) ;
      }
      return  ;
   }

   public void wb_table3_28_2752e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_2752e( true) ;
      }
      else
      {
         wb_table1_23_2752e( false) ;
      }
   }

   public void wb_table3_28_2752( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'" + sPrefix + "',false,'" + sGXsfl_58_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_GestionLaboratorio\\NoAceptacionEnsayo_SDT_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_2752e( true) ;
      }
      else
      {
         wb_table3_28_2752e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
      AV39Lb_Numero = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Lb_Numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39Lb_Numero), 8, 0));
      AV37Lb_fechaR = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Lb_fechaR", localUtil.format(AV37Lb_fechaR, "99/99/99"));
      AV38Lb_obscr = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Lb_obscr", AV38Lb_obscr);
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
      pa2752( ) ;
      ws2752( ) ;
      we2752( ) ;
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
      sCtrlAV5EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV39Lb_Numero = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV37Lb_fechaR = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV38Lb_obscr = (String)getParm(obj,3,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2752( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "gestionlaboratorio\\noaceptacionensayo_sdt_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa2752( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
         AV39Lb_Numero = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Lb_Numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39Lb_Numero), 8, 0));
         AV37Lb_fechaR = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Lb_fechaR", localUtil.format(AV37Lb_fechaR, "99/99/99"));
         AV38Lb_obscr = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Lb_obscr", AV38Lb_obscr);
      }
      wcpOAV5EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV5EmprCod") ;
      wcpOAV39Lb_Numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV39Lb_Numero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV37Lb_fechaR = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV37Lb_fechaR"), 0) ;
      wcpOAV38Lb_obscr = httpContext.cgiGet( sPrefix+"wcpOAV38Lb_obscr") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5EmprCod, wcpOAV5EmprCod) != 0 ) || ( AV39Lb_Numero != wcpOAV39Lb_Numero ) || !( GXutil.dateCompare(GXutil.resetTime(AV37Lb_fechaR), GXutil.resetTime(wcpOAV37Lb_fechaR)) ) || ( GXutil.strcmp(AV38Lb_obscr, wcpOAV38Lb_obscr) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV5EmprCod = AV5EmprCod ;
      wcpOAV39Lb_Numero = AV39Lb_Numero ;
      wcpOAV37Lb_fechaR = AV37Lb_fechaR ;
      wcpOAV38Lb_obscr = AV38Lb_obscr ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV5EmprCod = httpContext.cgiGet( sPrefix+"AV5EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV5EmprCod) > 0 )
      {
         AV5EmprCod = httpContext.cgiGet( sCtrlAV5EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
      }
      else
      {
         AV5EmprCod = httpContext.cgiGet( sPrefix+"AV5EmprCod_PARM") ;
      }
      sCtrlAV39Lb_Numero = httpContext.cgiGet( sPrefix+"AV39Lb_Numero_CTRL") ;
      if ( GXutil.len( sCtrlAV39Lb_Numero) > 0 )
      {
         AV39Lb_Numero = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV39Lb_Numero), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Lb_Numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39Lb_Numero), 8, 0));
      }
      else
      {
         AV39Lb_Numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV39Lb_Numero_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV37Lb_fechaR = httpContext.cgiGet( sPrefix+"AV37Lb_fechaR_CTRL") ;
      if ( GXutil.len( sCtrlAV37Lb_fechaR) > 0 )
      {
         AV37Lb_fechaR = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV37Lb_fechaR), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Lb_fechaR", localUtil.format(AV37Lb_fechaR, "99/99/99"));
      }
      else
      {
         AV37Lb_fechaR = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV37Lb_fechaR_PARM"), 0) ;
      }
      sCtrlAV38Lb_obscr = httpContext.cgiGet( sPrefix+"AV38Lb_obscr_CTRL") ;
      if ( GXutil.len( sCtrlAV38Lb_obscr) > 0 )
      {
         AV38Lb_obscr = httpContext.cgiGet( sCtrlAV38Lb_obscr) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Lb_obscr", AV38Lb_obscr);
      }
      else
      {
         AV38Lb_obscr = httpContext.cgiGet( sPrefix+"AV38Lb_obscr_PARM") ;
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
      pa2752( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2752( ) ;
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
      ws2752( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5EmprCod_PARM", GXutil.rtrim( AV5EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5EmprCod_CTRL", GXutil.rtrim( sCtrlAV5EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV39Lb_Numero_PARM", GXutil.ltrim( localUtil.ntoc( AV39Lb_Numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV39Lb_Numero)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV39Lb_Numero_CTRL", GXutil.rtrim( sCtrlAV39Lb_Numero));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37Lb_fechaR_PARM", localUtil.dtoc( AV37Lb_fechaR, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV37Lb_fechaR)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37Lb_fechaR_CTRL", GXutil.rtrim( sCtrlAV37Lb_fechaR));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV38Lb_obscr_PARM", AV38Lb_obscr);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV38Lb_obscr)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV38Lb_obscr_CTRL", GXutil.rtrim( sCtrlAV38Lb_obscr));
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
      we2752( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115552767", true, true);
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
      httpContext.AddJavascriptSource("gestionlaboratorio/noaceptacionensayo_sdt_wc.js", "?202682115552768", false, true);
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

   public void subsflControlProps_582( )
   {
      chkavNoaceptacionensayo_sdt__seleccionar.setInternalname( sPrefix+"NOACEPTACIONENSAYO_SDT__SELECCIONAR_"+sGXsfl_58_idx );
      edtavNoaceptacionensayo_sdt__lb_numero_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__LB_NUMERO_"+sGXsfl_58_idx ;
      edtavNoaceptacionensayo_sdt__lb_opcion_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__LB_OPCION_"+sGXsfl_58_idx ;
      edtavNoaceptacionensayo_sdt__lb_colnom_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__LB_COLNOM_"+sGXsfl_58_idx ;
      edtavNoaceptacionensayo_sdt__lb_colnum_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__LB_COLNUM_"+sGXsfl_58_idx ;
      edtavNoaceptacionensayo_sdt__clicod_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__CLICOD_"+sGXsfl_58_idx ;
      edtavNoaceptacionensayo_sdt__clinom_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__CLINOM_"+sGXsfl_58_idx ;
      edtavNoaceptacionensayo_sdt__lb_cartaz_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__LB_CARTAZ_"+sGXsfl_58_idx ;
      edtavNoaceptacionensayo_sdt__lb_cartazf_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__LB_CARTAZF_"+sGXsfl_58_idx ;
      edtavNoaceptacionensayo_sdt__lb_fechaen_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__LB_FECHAEN_"+sGXsfl_58_idx ;
      edtavNoaceptacionensayo_sdt__lb_fechar_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__LB_FECHAR_"+sGXsfl_58_idx ;
      edtavNoaceptacionensayo_sdt__lb_estado_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__LB_ESTADO_"+sGXsfl_58_idx ;
      edtavNoaceptacionensayo_sdt__lb_fecnoa1_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__LB_FECNOA1_"+sGXsfl_58_idx ;
      edtavNoaceptacionensayo_sdt__lb_hhnoa1_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__LB_HHNOA1_"+sGXsfl_58_idx ;
   }

   public void subsflControlProps_fel_582( )
   {
      chkavNoaceptacionensayo_sdt__seleccionar.setInternalname( sPrefix+"NOACEPTACIONENSAYO_SDT__SELECCIONAR_"+sGXsfl_58_fel_idx );
      edtavNoaceptacionensayo_sdt__lb_numero_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__LB_NUMERO_"+sGXsfl_58_fel_idx ;
      edtavNoaceptacionensayo_sdt__lb_opcion_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__LB_OPCION_"+sGXsfl_58_fel_idx ;
      edtavNoaceptacionensayo_sdt__lb_colnom_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__LB_COLNOM_"+sGXsfl_58_fel_idx ;
      edtavNoaceptacionensayo_sdt__lb_colnum_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__LB_COLNUM_"+sGXsfl_58_fel_idx ;
      edtavNoaceptacionensayo_sdt__clicod_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__CLICOD_"+sGXsfl_58_fel_idx ;
      edtavNoaceptacionensayo_sdt__clinom_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__CLINOM_"+sGXsfl_58_fel_idx ;
      edtavNoaceptacionensayo_sdt__lb_cartaz_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__LB_CARTAZ_"+sGXsfl_58_fel_idx ;
      edtavNoaceptacionensayo_sdt__lb_cartazf_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__LB_CARTAZF_"+sGXsfl_58_fel_idx ;
      edtavNoaceptacionensayo_sdt__lb_fechaen_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__LB_FECHAEN_"+sGXsfl_58_fel_idx ;
      edtavNoaceptacionensayo_sdt__lb_fechar_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__LB_FECHAR_"+sGXsfl_58_fel_idx ;
      edtavNoaceptacionensayo_sdt__lb_estado_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__LB_ESTADO_"+sGXsfl_58_fel_idx ;
      edtavNoaceptacionensayo_sdt__lb_fecnoa1_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__LB_FECNOA1_"+sGXsfl_58_fel_idx ;
      edtavNoaceptacionensayo_sdt__lb_hhnoa1_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__LB_HHNOA1_"+sGXsfl_58_fel_idx ;
   }

   public void sendrow_582( )
   {
      subsflControlProps_582( ) ;
      wb2750( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_58_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_58_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_58_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavNoaceptacionensayo_sdt__seleccionar.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavNoaceptacionensayo_sdt__seleccionar.getEnabled()!=0)&&(chkavNoaceptacionensayo_sdt__seleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 59,'"+sPrefix+"',false,'"+sGXsfl_58_idx+"',58)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "NOACEPTACIONENSAYO_SDT__SELECCIONAR_" + sGXsfl_58_idx ;
         chkavNoaceptacionensayo_sdt__seleccionar.setName( GXCCtl );
         chkavNoaceptacionensayo_sdt__seleccionar.setWebtags( "" );
         chkavNoaceptacionensayo_sdt__seleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavNoaceptacionensayo_sdt__seleccionar.getInternalname(), "TitleCaption", chkavNoaceptacionensayo_sdt__seleccionar.getCaption(), !bGXsfl_58_Refreshing);
         chkavNoaceptacionensayo_sdt__seleccionar.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavNoaceptacionensayo_sdt__seleccionar.getInternalname(),GXutil.booltostr( ((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Seleccionar()),"","",Integer.valueOf(chkavNoaceptacionensayo_sdt__seleccionar.getVisible()),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+((chkavNoaceptacionensayo_sdt__seleccionar.getEnabled()!=0)&&(chkavNoaceptacionensayo_sdt__seleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,59);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavNoaceptacionensayo_sdt__lb_numero_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavNoaceptacionensayo_sdt__lb_numero_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_numero(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavNoaceptacionensayo_sdt__lb_numero_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_numero()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_numero()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavNoaceptacionensayo_sdt__lb_numero_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavNoaceptacionensayo_sdt__lb_numero_Visible),Integer.valueOf(edtavNoaceptacionensayo_sdt__lb_numero_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavNoaceptacionensayo_sdt__lb_opcion_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavNoaceptacionensayo_sdt__lb_opcion_Internalname,GXutil.rtrim( ((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_opcion()),GXutil.rtrim( localUtil.format( ((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_opcion(), "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavNoaceptacionensayo_sdt__lb_opcion_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavNoaceptacionensayo_sdt__lb_opcion_Visible),Integer.valueOf(edtavNoaceptacionensayo_sdt__lb_opcion_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavNoaceptacionensayo_sdt__lb_colnom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavNoaceptacionensayo_sdt__lb_colnom_Internalname,GXutil.rtrim( ((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavNoaceptacionensayo_sdt__lb_colnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavNoaceptacionensayo_sdt__lb_colnom_Visible),Integer.valueOf(edtavNoaceptacionensayo_sdt__lb_colnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavNoaceptacionensayo_sdt__lb_colnum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavNoaceptacionensayo_sdt__lb_colnum_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnum(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavNoaceptacionensayo_sdt__lb_colnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnum()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnum()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavNoaceptacionensayo_sdt__lb_colnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavNoaceptacionensayo_sdt__lb_colnum_Visible),Integer.valueOf(edtavNoaceptacionensayo_sdt__lb_colnum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavNoaceptacionensayo_sdt__clicod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavNoaceptacionensayo_sdt__clicod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Clicod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavNoaceptacionensayo_sdt__clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Clicod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Clicod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavNoaceptacionensayo_sdt__clicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavNoaceptacionensayo_sdt__clicod_Visible),Integer.valueOf(edtavNoaceptacionensayo_sdt__clicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavNoaceptacionensayo_sdt__clinom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavNoaceptacionensayo_sdt__clinom_Internalname,GXutil.rtrim( ((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Clinom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavNoaceptacionensayo_sdt__clinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavNoaceptacionensayo_sdt__clinom_Visible),Integer.valueOf(edtavNoaceptacionensayo_sdt__clinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavNoaceptacionensayo_sdt__lb_cartaz_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavNoaceptacionensayo_sdt__lb_cartaz_Internalname,GXutil.rtrim( ((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartaz()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavNoaceptacionensayo_sdt__lb_cartaz_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavNoaceptacionensayo_sdt__lb_cartaz_Visible),Integer.valueOf(edtavNoaceptacionensayo_sdt__lb_cartaz_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavNoaceptacionensayo_sdt__lb_cartazf_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavNoaceptacionensayo_sdt__lb_cartazf_Internalname,localUtil.format(((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf(), "99/99/99"),localUtil.format( ((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavNoaceptacionensayo_sdt__lb_cartazf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavNoaceptacionensayo_sdt__lb_cartazf_Visible),Integer.valueOf(edtavNoaceptacionensayo_sdt__lb_cartazf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavNoaceptacionensayo_sdt__lb_fechaen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavNoaceptacionensayo_sdt__lb_fechaen_Internalname,localUtil.format(((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen(), "99/99/99"),localUtil.format( ((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavNoaceptacionensayo_sdt__lb_fechaen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavNoaceptacionensayo_sdt__lb_fechaen_Visible),Integer.valueOf(edtavNoaceptacionensayo_sdt__lb_fechaen_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavNoaceptacionensayo_sdt__lb_fechar_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavNoaceptacionensayo_sdt__lb_fechar_Internalname,localUtil.format(((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar(), "99/99/99"),localUtil.format( ((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavNoaceptacionensayo_sdt__lb_fechar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavNoaceptacionensayo_sdt__lb_fechar_Visible),Integer.valueOf(edtavNoaceptacionensayo_sdt__lb_fechar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavNoaceptacionensayo_sdt__lb_estado_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavNoaceptacionensayo_sdt__lb_estado_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_estado(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavNoaceptacionensayo_sdt__lb_estado_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_estado()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_estado()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavNoaceptacionensayo_sdt__lb_estado_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavNoaceptacionensayo_sdt__lb_estado_Visible),Integer.valueOf(edtavNoaceptacionensayo_sdt__lb_estado_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavNoaceptacionensayo_sdt__lb_fecnoa1_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavNoaceptacionensayo_sdt__lb_fecnoa1_Internalname,localUtil.format(((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1(), "99/99/99"),localUtil.format( ((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavNoaceptacionensayo_sdt__lb_fecnoa1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavNoaceptacionensayo_sdt__lb_fecnoa1_Visible),Integer.valueOf(edtavNoaceptacionensayo_sdt__lb_fecnoa1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavNoaceptacionensayo_sdt__lb_hhnoa1_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavNoaceptacionensayo_sdt__lb_hhnoa1_Internalname,localUtil.ttoc( ((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1(), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( ((app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)AV25NoAceptacionEnsayo_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1(), "99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavNoaceptacionensayo_sdt__lb_hhnoa1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavNoaceptacionensayo_sdt__lb_hhnoa1_Visible),Integer.valueOf(edtavNoaceptacionensayo_sdt__lb_hhnoa1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2752( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_58_idx = ((subGrid_Islastpage==1)&&(nGXsfl_58_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_58_idx+1) ;
         sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_582( ) ;
      }
      /* End function sendrow_582 */
   }

   public void startgridcontrol58( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"58\">") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavNoaceptacionensayo_sdt__seleccionar.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Seleccionar", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavNoaceptacionensayo_sdt__lb_numero_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº de Ensayo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavNoaceptacionensayo_sdt__lb_opcion_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Opcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavNoaceptacionensayo_sdt__lb_colnom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavNoaceptacionensayo_sdt__lb_colnum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavNoaceptacionensayo_sdt__clicod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavNoaceptacionensayo_sdt__clinom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavNoaceptacionensayo_sdt__lb_cartaz_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coleccion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavNoaceptacionensayo_sdt__lb_cartazf_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavNoaceptacionensayo_sdt__lb_fechaen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Envio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavNoaceptacionensayo_sdt__lb_fechar_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Recepcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavNoaceptacionensayo_sdt__lb_estado_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavNoaceptacionensayo_sdt__lb_fecnoa1_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha No aceptacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavNoaceptacionensayo_sdt__lb_hhnoa1_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hora", "")) ;
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
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavNoaceptacionensayo_sdt__seleccionar.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavNoaceptacionensayo_sdt__lb_numero_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavNoaceptacionensayo_sdt__lb_numero_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavNoaceptacionensayo_sdt__lb_opcion_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavNoaceptacionensayo_sdt__lb_opcion_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavNoaceptacionensayo_sdt__lb_colnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavNoaceptacionensayo_sdt__lb_colnom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavNoaceptacionensayo_sdt__lb_colnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavNoaceptacionensayo_sdt__lb_colnum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavNoaceptacionensayo_sdt__clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavNoaceptacionensayo_sdt__clicod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavNoaceptacionensayo_sdt__clinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavNoaceptacionensayo_sdt__clinom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavNoaceptacionensayo_sdt__lb_cartaz_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavNoaceptacionensayo_sdt__lb_cartaz_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavNoaceptacionensayo_sdt__lb_cartazf_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavNoaceptacionensayo_sdt__lb_cartazf_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavNoaceptacionensayo_sdt__lb_fechaen_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavNoaceptacionensayo_sdt__lb_fechaen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavNoaceptacionensayo_sdt__lb_fechar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavNoaceptacionensayo_sdt__lb_fechar_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavNoaceptacionensayo_sdt__lb_estado_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavNoaceptacionensayo_sdt__lb_estado_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavNoaceptacionensayo_sdt__lb_fecnoa1_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavNoaceptacionensayo_sdt__lb_fecnoa1_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavNoaceptacionensayo_sdt__lb_hhnoa1_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavNoaceptacionensayo_sdt__lb_hhnoa1_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnconfirmar_Internalname = sPrefix+"BTNCONFIRMAR" ;
      bttBtnmarcartodas_Internalname = sPrefix+"BTNMARCARTODAS" ;
      bttBtndesmarcartodas_Internalname = sPrefix+"BTNDESMARCARTODAS" ;
      bttBtncancelar_Internalname = sPrefix+"BTNCANCELAR" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      chkavNoaceptacionensayo_sdt__seleccionar.setInternalname( sPrefix+"NOACEPTACIONENSAYO_SDT__SELECCIONAR" );
      edtavNoaceptacionensayo_sdt__lb_numero_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__LB_NUMERO" ;
      edtavNoaceptacionensayo_sdt__lb_opcion_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__LB_OPCION" ;
      edtavNoaceptacionensayo_sdt__lb_colnom_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__LB_COLNOM" ;
      edtavNoaceptacionensayo_sdt__lb_colnum_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__LB_COLNUM" ;
      edtavNoaceptacionensayo_sdt__clicod_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__CLICOD" ;
      edtavNoaceptacionensayo_sdt__clinom_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__CLINOM" ;
      edtavNoaceptacionensayo_sdt__lb_cartaz_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__LB_CARTAZ" ;
      edtavNoaceptacionensayo_sdt__lb_cartazf_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__LB_CARTAZF" ;
      edtavNoaceptacionensayo_sdt__lb_fechaen_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__LB_FECHAEN" ;
      edtavNoaceptacionensayo_sdt__lb_fechar_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__LB_FECHAR" ;
      edtavNoaceptacionensayo_sdt__lb_estado_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__LB_ESTADO" ;
      edtavNoaceptacionensayo_sdt__lb_fecnoa1_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__LB_FECNOA1" ;
      edtavNoaceptacionensayo_sdt__lb_hhnoa1_Internalname = sPrefix+"NOACEPTACIONENSAYO_SDT__LB_HHNOA1" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      edtavNoaceptacionensayo_sdt_json_Internalname = sPrefix+"vNOACEPTACIONENSAYO_SDT_JSON" ;
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
      edtavNoaceptacionensayo_sdt__lb_hhnoa1_Jsonclick = "" ;
      edtavNoaceptacionensayo_sdt__lb_hhnoa1_Enabled = 0 ;
      edtavNoaceptacionensayo_sdt__lb_hhnoa1_Visible = -1 ;
      edtavNoaceptacionensayo_sdt__lb_fecnoa1_Jsonclick = "" ;
      edtavNoaceptacionensayo_sdt__lb_fecnoa1_Enabled = 0 ;
      edtavNoaceptacionensayo_sdt__lb_fecnoa1_Visible = -1 ;
      edtavNoaceptacionensayo_sdt__lb_estado_Jsonclick = "" ;
      edtavNoaceptacionensayo_sdt__lb_estado_Enabled = 0 ;
      edtavNoaceptacionensayo_sdt__lb_estado_Visible = -1 ;
      edtavNoaceptacionensayo_sdt__lb_fechar_Jsonclick = "" ;
      edtavNoaceptacionensayo_sdt__lb_fechar_Enabled = 0 ;
      edtavNoaceptacionensayo_sdt__lb_fechar_Visible = -1 ;
      edtavNoaceptacionensayo_sdt__lb_fechaen_Jsonclick = "" ;
      edtavNoaceptacionensayo_sdt__lb_fechaen_Enabled = 0 ;
      edtavNoaceptacionensayo_sdt__lb_fechaen_Visible = -1 ;
      edtavNoaceptacionensayo_sdt__lb_cartazf_Jsonclick = "" ;
      edtavNoaceptacionensayo_sdt__lb_cartazf_Enabled = 0 ;
      edtavNoaceptacionensayo_sdt__lb_cartazf_Visible = -1 ;
      edtavNoaceptacionensayo_sdt__lb_cartaz_Jsonclick = "" ;
      edtavNoaceptacionensayo_sdt__lb_cartaz_Enabled = 0 ;
      edtavNoaceptacionensayo_sdt__lb_cartaz_Visible = -1 ;
      edtavNoaceptacionensayo_sdt__clinom_Jsonclick = "" ;
      edtavNoaceptacionensayo_sdt__clinom_Enabled = 0 ;
      edtavNoaceptacionensayo_sdt__clinom_Visible = -1 ;
      edtavNoaceptacionensayo_sdt__clicod_Jsonclick = "" ;
      edtavNoaceptacionensayo_sdt__clicod_Enabled = 0 ;
      edtavNoaceptacionensayo_sdt__clicod_Visible = -1 ;
      edtavNoaceptacionensayo_sdt__lb_colnum_Jsonclick = "" ;
      edtavNoaceptacionensayo_sdt__lb_colnum_Enabled = 0 ;
      edtavNoaceptacionensayo_sdt__lb_colnum_Visible = -1 ;
      edtavNoaceptacionensayo_sdt__lb_colnom_Jsonclick = "" ;
      edtavNoaceptacionensayo_sdt__lb_colnom_Enabled = 0 ;
      edtavNoaceptacionensayo_sdt__lb_colnom_Visible = -1 ;
      edtavNoaceptacionensayo_sdt__lb_opcion_Jsonclick = "" ;
      edtavNoaceptacionensayo_sdt__lb_opcion_Enabled = 0 ;
      edtavNoaceptacionensayo_sdt__lb_opcion_Visible = -1 ;
      edtavNoaceptacionensayo_sdt__lb_numero_Jsonclick = "" ;
      edtavNoaceptacionensayo_sdt__lb_numero_Enabled = 0 ;
      edtavNoaceptacionensayo_sdt__lb_numero_Visible = -1 ;
      chkavNoaceptacionensayo_sdt__seleccionar.setCaption( "" );
      chkavNoaceptacionensayo_sdt__seleccionar.setEnabled( 1 );
      chkavNoaceptacionensayo_sdt__seleccionar.setVisible( -1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavNoaceptacionensayo_sdt__lb_hhnoa1_Visible = -1 ;
      edtavNoaceptacionensayo_sdt__lb_fecnoa1_Visible = -1 ;
      edtavNoaceptacionensayo_sdt__lb_estado_Visible = -1 ;
      edtavNoaceptacionensayo_sdt__lb_fechar_Visible = -1 ;
      edtavNoaceptacionensayo_sdt__lb_fechaen_Visible = -1 ;
      edtavNoaceptacionensayo_sdt__lb_cartazf_Visible = -1 ;
      edtavNoaceptacionensayo_sdt__lb_cartaz_Visible = -1 ;
      edtavNoaceptacionensayo_sdt__clinom_Visible = -1 ;
      edtavNoaceptacionensayo_sdt__clicod_Visible = -1 ;
      edtavNoaceptacionensayo_sdt__lb_colnum_Visible = -1 ;
      edtavNoaceptacionensayo_sdt__lb_colnom_Visible = -1 ;
      edtavNoaceptacionensayo_sdt__lb_opcion_Visible = -1 ;
      edtavNoaceptacionensayo_sdt__lb_numero_Visible = -1 ;
      chkavNoaceptacionensayo_sdt__seleccionar.setVisible( -1 );
      subGrid_Sortable = (byte)(0) ;
      edtavNoaceptacionensayo_sdt__lb_hhnoa1_Enabled = -1 ;
      edtavNoaceptacionensayo_sdt__lb_fecnoa1_Enabled = -1 ;
      edtavNoaceptacionensayo_sdt__lb_estado_Enabled = -1 ;
      edtavNoaceptacionensayo_sdt__lb_fechar_Enabled = -1 ;
      edtavNoaceptacionensayo_sdt__lb_fechaen_Enabled = -1 ;
      edtavNoaceptacionensayo_sdt__lb_cartazf_Enabled = -1 ;
      edtavNoaceptacionensayo_sdt__lb_cartaz_Enabled = -1 ;
      edtavNoaceptacionensayo_sdt__clinom_Enabled = -1 ;
      edtavNoaceptacionensayo_sdt__clicod_Enabled = -1 ;
      edtavNoaceptacionensayo_sdt__lb_colnum_Enabled = -1 ;
      edtavNoaceptacionensayo_sdt__lb_colnom_Enabled = -1 ;
      edtavNoaceptacionensayo_sdt__lb_opcion_Enabled = -1 ;
      edtavNoaceptacionensayo_sdt__lb_numero_Enabled = -1 ;
      edtavNoaceptacionensayo_sdt_json_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_confirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar_Confirmationtext = "¿Confirma la NO Aceptacion?" ;
      Dvelop_confirmpanel_confirmar_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "|||||||||||||" ;
      Ddo_grid_Columnids = "0:NoAceptacionEnsayo_SDT__Seleccionar|1:NoAceptacionEnsayo_SDT__Lb_numero|2:NoAceptacionEnsayo_SDT__Lb_opcion|3:NoAceptacionEnsayo_SDT__Lb_ColNom|4:NoAceptacionEnsayo_SDT__Lb_colnum|5:NoAceptacionEnsayo_SDT__Clicod|6:NoAceptacionEnsayo_SDT__CliNom|7:NoAceptacionEnsayo_SDT__Lb_Cartaz|8:NoAceptacionEnsayo_SDT__Lb_Cartazf|9:NoAceptacionEnsayo_SDT__Lb_FechaEn|10:NoAceptacionEnsayo_SDT__Lb_FechaR|11:NoAceptacionEnsayo_SDT__Lb_Estado|12:NoAceptacionEnsayo_SDT__Lb_FecNoa1|13:NoAceptacionEnsayo_SDT__Lb_Hhnoa1" ;
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
      GXCCtl = "NOACEPTACIONENSAYO_SDT__SELECCIONAR_" + sGXsfl_58_idx ;
      chkavNoaceptacionensayo_sdt__seleccionar.setName( GXCCtl );
      chkavNoaceptacionensayo_sdt__seleccionar.setWebtags( "" );
      chkavNoaceptacionensayo_sdt__seleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavNoaceptacionensayo_sdt__seleccionar.getInternalname(), "TitleCaption", chkavNoaceptacionensayo_sdt__seleccionar.getCaption(), !bGXsfl_58_Refreshing);
      chkavNoaceptacionensayo_sdt__seleccionar.setCheckedValue( "false" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25NoAceptacionEnsayo_SDT',fld:'vNOACEPTACIONENSAYO_SDT',grid:58,pic:''},{av:'nGXsfl_58_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:58},{av:'nRC_GXsfl_58',ctrl:'GRID',prop:'GridRC',grid:58},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV37Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'AV38Lb_obscr',fld:'vLB_OBSCR',pic:''},{av:'AV40Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'NOACEPTACIONENSAYO_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_NUMERO',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_OPCION',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_COLNOM',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_COLNUM',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__CLICOD',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__CLINOM',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_CARTAZ',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_CARTAZF',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_FECHAEN',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_FECHAR',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_ESTADO',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_FECNOA1',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_HHNOA1',prop:'Visible'},{av:'AV16GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV17GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV46NoAceptacionEnsayo_SDT_json',fld:'vNOACEPTACIONENSAYO_SDT_JSON',pic:''},{av:'AV22ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV18GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e132752',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25NoAceptacionEnsayo_SDT',fld:'vNOACEPTACIONENSAYO_SDT',grid:58,pic:''},{av:'nGXsfl_58_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:58},{av:'nRC_GXsfl_58',ctrl:'GRID',prop:'GridRC',grid:58},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV37Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'AV38Lb_obscr',fld:'vLB_OBSCR',pic:''},{av:'AV40Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e142752',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25NoAceptacionEnsayo_SDT',fld:'vNOACEPTACIONENSAYO_SDT',grid:58,pic:''},{av:'nGXsfl_58_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:58},{av:'nRC_GXsfl_58',ctrl:'GRID',prop:'GridRC',grid:58},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV37Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'AV38Lb_obscr',fld:'vLB_OBSCR',pic:''},{av:'AV40Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e242752',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e152752',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25NoAceptacionEnsayo_SDT',fld:'vNOACEPTACIONENSAYO_SDT',grid:58,pic:''},{av:'nGXsfl_58_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:58},{av:'nRC_GXsfl_58',ctrl:'GRID',prop:'GridRC',grid:58},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV37Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'AV38Lb_obscr',fld:'vLB_OBSCR',pic:''},{av:'AV40Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{ctrl:'NOACEPTACIONENSAYO_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_NUMERO',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_OPCION',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_COLNOM',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_COLNUM',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__CLICOD',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__CLINOM',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_CARTAZ',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_CARTAZF',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_FECHAEN',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_FECHAR',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_ESTADO',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_FECNOA1',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_HHNOA1',prop:'Visible'},{av:'AV16GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV17GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV46NoAceptacionEnsayo_SDT_json',fld:'vNOACEPTACIONENSAYO_SDT_JSON',pic:''},{av:'AV22ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV18GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e122752',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25NoAceptacionEnsayo_SDT',fld:'vNOACEPTACIONENSAYO_SDT',grid:58,pic:''},{av:'nGXsfl_58_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:58},{av:'nRC_GXsfl_58',ctrl:'GRID',prop:'GridRC',grid:58},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV37Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'AV38Lb_obscr',fld:'vLB_OBSCR',pic:''},{av:'AV40Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV18GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18GridState',fld:'vGRIDSTATE',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'NOACEPTACIONENSAYO_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_NUMERO',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_OPCION',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_COLNOM',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_COLNUM',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__CLICOD',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__CLINOM',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_CARTAZ',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_CARTAZF',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_FECHAEN',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_FECHAR',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_ESTADO',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_FECNOA1',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_HHNOA1',prop:'Visible'},{av:'AV16GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV17GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV46NoAceptacionEnsayo_SDT_json',fld:'vNOACEPTACIONENSAYO_SDT_JSON',pic:''},{av:'AV22ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e112751',iparms:[{av:'AV25NoAceptacionEnsayo_SDT',fld:'vNOACEPTACIONENSAYO_SDT',grid:58,pic:''},{av:'nGXsfl_58_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:58},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_58',ctrl:'GRID',prop:'GridRC',grid:58}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE","{handler:'e162752',iparms:[{av:'Dvelop_confirmpanel_confirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25NoAceptacionEnsayo_SDT',fld:'vNOACEPTACIONENSAYO_SDT',grid:58,pic:''},{av:'nGXsfl_58_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:58},{av:'nRC_GXsfl_58',ctrl:'GRID',prop:'GridRC',grid:58},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV37Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'AV38Lb_obscr',fld:'vLB_OBSCR',pic:''},{av:'AV40Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'AV41CliCod',fld:'vCLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE",",oparms:[{av:'AV38Lb_obscr',fld:'vLB_OBSCR',pic:''},{av:'AV37Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV41CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV39Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV25NoAceptacionEnsayo_SDT',fld:'vNOACEPTACIONENSAYO_SDT',grid:58,pic:''},{av:'nGXsfl_58_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:58},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_58',ctrl:'GRID',prop:'GridRC',grid:58},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'NOACEPTACIONENSAYO_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_NUMERO',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_OPCION',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_COLNOM',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_COLNUM',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__CLICOD',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__CLINOM',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_CARTAZ',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_CARTAZF',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_FECHAEN',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_FECHAR',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_ESTADO',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_FECNOA1',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_HHNOA1',prop:'Visible'},{av:'AV16GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV17GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV46NoAceptacionEnsayo_SDT_json',fld:'vNOACEPTACIONENSAYO_SDT_JSON',pic:''},{av:'AV22ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV18GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOMARCARTODAS'","{handler:'e172752',iparms:[{av:'AV25NoAceptacionEnsayo_SDT',fld:'vNOACEPTACIONENSAYO_SDT',grid:58,pic:''},{av:'nGXsfl_58_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:58},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_58',ctrl:'GRID',prop:'GridRC',grid:58},{av:'AV45Var_seleccionar',fld:'vVAR_SELECCIONAR',pic:''},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV37Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'AV38Lb_obscr',fld:'vLB_OBSCR',pic:''},{av:'AV40Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("'DOMARCARTODAS'",",oparms:[{av:'AV45Var_seleccionar',fld:'vVAR_SELECCIONAR',pic:''},{av:'AV25NoAceptacionEnsayo_SDT',fld:'vNOACEPTACIONENSAYO_SDT',grid:58,pic:''},{av:'nGXsfl_58_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:58},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_58',ctrl:'GRID',prop:'GridRC',grid:58}]}");
      setEventMetadata("'DODESMARCARTODAS'","{handler:'e182752',iparms:[{av:'AV25NoAceptacionEnsayo_SDT',fld:'vNOACEPTACIONENSAYO_SDT',grid:58,pic:''},{av:'nGXsfl_58_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:58},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_58',ctrl:'GRID',prop:'GridRC',grid:58},{av:'AV45Var_seleccionar',fld:'vVAR_SELECCIONAR',pic:''},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV37Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'AV38Lb_obscr',fld:'vLB_OBSCR',pic:''},{av:'AV40Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("'DODESMARCARTODAS'",",oparms:[{av:'AV45Var_seleccionar',fld:'vVAR_SELECCIONAR',pic:''},{av:'AV25NoAceptacionEnsayo_SDT',fld:'vNOACEPTACIONENSAYO_SDT',grid:58,pic:''},{av:'nGXsfl_58_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:58},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_58',ctrl:'GRID',prop:'GridRC',grid:58}]}");
      setEventMetadata("'DOCANCELAR'","{handler:'e192752',iparms:[]");
      setEventMetadata("'DOCANCELAR'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e202752',iparms:[{av:'AV25NoAceptacionEnsayo_SDT',fld:'vNOACEPTACIONENSAYO_SDT',grid:58,pic:''},{av:'nGXsfl_58_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:58},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_58',ctrl:'GRID',prop:'GridRC',grid:58},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV46NoAceptacionEnsayo_SDT_json',fld:'vNOACEPTACIONENSAYO_SDT_JSON',pic:''}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e212752',iparms:[{av:'AV25NoAceptacionEnsayo_SDT',fld:'vNOACEPTACIONENSAYO_SDT',grid:58,pic:''},{av:'nGXsfl_58_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:58},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_58',ctrl:'GRID',prop:'GridRC',grid:58},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV46NoAceptacionEnsayo_SDT_json',fld:'vNOACEPTACIONENSAYO_SDT_JSON',pic:''}]}");
      setEventMetadata("NOACEPTACIONENSAYO_SDT__SELECCIONAR.CLICK","{handler:'e252752',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25NoAceptacionEnsayo_SDT',fld:'vNOACEPTACIONENSAYO_SDT',grid:58,pic:''},{av:'nGXsfl_58_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:58},{av:'nRC_GXsfl_58',ctrl:'GRID',prop:'GridRC',grid:58},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV37Lb_fechaR',fld:'vLB_FECHAR',pic:''},{av:'AV38Lb_obscr',fld:'vLB_OBSCR',pic:''},{av:'AV40Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'}]");
      setEventMetadata("NOACEPTACIONENSAYO_SDT__SELECCIONAR.CLICK",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'NOACEPTACIONENSAYO_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_NUMERO',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_OPCION',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_COLNOM',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_COLNUM',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__CLICOD',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__CLINOM',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_CARTAZ',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_CARTAZF',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_FECHAEN',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_FECHAR',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_ESTADO',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_FECNOA1',prop:'Visible'},{ctrl:'NOACEPTACIONENSAYO_SDT__LB_HHNOA1',prop:'Visible'},{av:'AV16GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV17GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV46NoAceptacionEnsayo_SDT_json',fld:'vNOACEPTACIONENSAYO_SDT_JSON',pic:''},{av:'AV22ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV18GridState',fld:'vGRIDSTATE',pic:''}]}");
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
      wcpOAV5EmprCod = "" ;
      wcpOAV37Lb_fechaR = GXutil.nullDate() ;
      wcpOAV38Lb_obscr = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      Dvelop_confirmpanel_confirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV5EmprCod = "" ;
      AV37Lb_fechaR = GXutil.nullDate() ;
      AV38Lb_obscr = "" ;
      AV9ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25NoAceptacionEnsayo_SDT = new GXBaseCollection<app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item>(app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV66Pgmname = "" ;
      AV15FilterFullText = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV22ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV12DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV18GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34NoAceptacionEnsayo_SDT_item = new app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item(remoteHandle, context);
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
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtnmarcartodas_Jsonclick = "" ;
      bttBtndesmarcartodas_Jsonclick = "" ;
      bttBtncancelar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      AV46NoAceptacionEnsayo_SDT_json = "" ;
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      hsh = "" ;
      AV7Station = "" ;
      AV6EmprNom = "" ;
      AV8UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXv_int8 = new byte[1] ;
      AV31WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV27Session = httpContext.getWebSession();
      AV11ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV24ManageFiltersXml = "" ;
      AV47websession = httpContext.getWebSession();
      AV14ExcelFilename = "" ;
      AV13ErrorMessage = "" ;
      AV30UserCustomValue = "" ;
      GXt_char1 = "" ;
      AV10ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector13 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15 = new GXBaseCollection[1] ;
      AV32Lb_opcions = "" ;
      AV33Lb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      AV36IN_Lb_opcion = "" ;
      GXv_dtime18 = new java.util.Date[1] ;
      GXv_char2 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int16 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_date17 = new java.util.Date[1] ;
      GXv_int19 = new int[1] ;
      GXt_objcol_SdtNoAceptacionEnsayo_SDT_Item9 = new GXBaseCollection<app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item>(app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      GXv_objcol_SdtNoAceptacionEnsayo_SDT_Item10 = new GXBaseCollection[1] ;
      AV19GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState20 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5EmprCod = "" ;
      sCtrlAV39Lb_Numero = "" ;
      sCtrlAV37Lb_fechaR = "" ;
      sCtrlAV38Lb_obscr = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.noaceptacionensayo_sdt_wc__default(),
         new Object[] {
         }
      );
      AV66Pgmname = "GestionLaboratorio.NoAceptacionEnsayo_SDT_WC" ;
      /* GeneXus formulas. */
      AV66Pgmname = "GestionLaboratorio.NoAceptacionEnsayo_SDT_WC" ;
      Gx_err = (short)(0) ;
      edtavNoaceptacionensayo_sdt__lb_numero_Enabled = 0 ;
      edtavNoaceptacionensayo_sdt__lb_opcion_Enabled = 0 ;
      edtavNoaceptacionensayo_sdt__lb_colnom_Enabled = 0 ;
      edtavNoaceptacionensayo_sdt__lb_colnum_Enabled = 0 ;
      edtavNoaceptacionensayo_sdt__clicod_Enabled = 0 ;
      edtavNoaceptacionensayo_sdt__clinom_Enabled = 0 ;
      edtavNoaceptacionensayo_sdt__lb_cartaz_Enabled = 0 ;
      edtavNoaceptacionensayo_sdt__lb_cartazf_Enabled = 0 ;
      edtavNoaceptacionensayo_sdt__lb_fechaen_Enabled = 0 ;
      edtavNoaceptacionensayo_sdt__lb_fechar_Enabled = 0 ;
      edtavNoaceptacionensayo_sdt__lb_estado_Enabled = 0 ;
      edtavNoaceptacionensayo_sdt__lb_fecnoa1_Enabled = 0 ;
      edtavNoaceptacionensayo_sdt__lb_hhnoa1_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV23ManageFiltersExecutionStep ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV40Moda21 ;
   private short AV48Lineas ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV43i ;
   private int wcpOAV39Lb_Numero ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_58 ;
   private int AV39Lb_Numero ;
   private int nGXsfl_58_idx=1 ;
   private int AV41CliCod ;
   private int AV67GXV16 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV51GXV1 ;
   private int edtavPgmname_Enabled ;
   private int edtavNoaceptacionensayo_sdt_json_Visible ;
   private int subGrid_Islastpage ;
   private int edtavNoaceptacionensayo_sdt__lb_numero_Enabled ;
   private int edtavNoaceptacionensayo_sdt__lb_opcion_Enabled ;
   private int edtavNoaceptacionensayo_sdt__lb_colnom_Enabled ;
   private int edtavNoaceptacionensayo_sdt__lb_colnum_Enabled ;
   private int edtavNoaceptacionensayo_sdt__clicod_Enabled ;
   private int edtavNoaceptacionensayo_sdt__clinom_Enabled ;
   private int edtavNoaceptacionensayo_sdt__lb_cartaz_Enabled ;
   private int edtavNoaceptacionensayo_sdt__lb_cartazf_Enabled ;
   private int edtavNoaceptacionensayo_sdt__lb_fechaen_Enabled ;
   private int edtavNoaceptacionensayo_sdt__lb_fechar_Enabled ;
   private int edtavNoaceptacionensayo_sdt__lb_estado_Enabled ;
   private int edtavNoaceptacionensayo_sdt__lb_fecnoa1_Enabled ;
   private int edtavNoaceptacionensayo_sdt__lb_hhnoa1_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_58_fel_idx=1 ;
   private int edtavNoaceptacionensayo_sdt__lb_numero_Visible ;
   private int edtavNoaceptacionensayo_sdt__lb_opcion_Visible ;
   private int edtavNoaceptacionensayo_sdt__lb_colnom_Visible ;
   private int edtavNoaceptacionensayo_sdt__lb_colnum_Visible ;
   private int edtavNoaceptacionensayo_sdt__clicod_Visible ;
   private int edtavNoaceptacionensayo_sdt__clinom_Visible ;
   private int edtavNoaceptacionensayo_sdt__lb_cartaz_Visible ;
   private int edtavNoaceptacionensayo_sdt__lb_cartazf_Visible ;
   private int edtavNoaceptacionensayo_sdt__lb_fechaen_Visible ;
   private int edtavNoaceptacionensayo_sdt__lb_fechar_Visible ;
   private int edtavNoaceptacionensayo_sdt__lb_estado_Visible ;
   private int edtavNoaceptacionensayo_sdt__lb_fecnoa1_Visible ;
   private int edtavNoaceptacionensayo_sdt__lb_hhnoa1_Visible ;
   private int AV26PageToGo ;
   private int nGXsfl_58_bak_idx=1 ;
   private int AV68GXV17 ;
   private int AV35IN_Lb_numero ;
   private int GXv_int16[] ;
   private int GXv_int19[] ;
   private int AV69GXV18 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV16GridCurrentPage ;
   private long AV17GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV5EmprCod ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_confirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV5EmprCod ;
   private String sGXsfl_58_idx="0001" ;
   private String AV66Pgmname ;
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
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtnmarcartodas_Internalname ;
   private String bttBtnmarcartodas_Jsonclick ;
   private String bttBtndesmarcartodas_Internalname ;
   private String bttBtndesmarcartodas_Jsonclick ;
   private String bttBtncancelar_Internalname ;
   private String bttBtncancelar_Jsonclick ;
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
   private String edtavNoaceptacionensayo_sdt_json_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String edtavNoaceptacionensayo_sdt__lb_numero_Internalname ;
   private String edtavNoaceptacionensayo_sdt__lb_opcion_Internalname ;
   private String edtavNoaceptacionensayo_sdt__lb_colnom_Internalname ;
   private String edtavNoaceptacionensayo_sdt__lb_colnum_Internalname ;
   private String edtavNoaceptacionensayo_sdt__clicod_Internalname ;
   private String edtavNoaceptacionensayo_sdt__clinom_Internalname ;
   private String edtavNoaceptacionensayo_sdt__lb_cartaz_Internalname ;
   private String edtavNoaceptacionensayo_sdt__lb_cartazf_Internalname ;
   private String edtavNoaceptacionensayo_sdt__lb_fechaen_Internalname ;
   private String edtavNoaceptacionensayo_sdt__lb_fechar_Internalname ;
   private String edtavNoaceptacionensayo_sdt__lb_estado_Internalname ;
   private String edtavNoaceptacionensayo_sdt__lb_fecnoa1_Internalname ;
   private String edtavNoaceptacionensayo_sdt__lb_hhnoa1_Internalname ;
   private String sGXsfl_58_fel_idx="0001" ;
   private String hsh ;
   private String AV7Station ;
   private String AV6EmprNom ;
   private String AV8UsurCod ;
   private String GXt_char1 ;
   private String AV32Lb_opcions ;
   private String AV36IN_Lb_opcion ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String tblTabledvelop_confirmpanel_confirmar_Internalname ;
   private String Dvelop_confirmpanel_confirmar_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV5EmprCod ;
   private String sCtrlAV39Lb_Numero ;
   private String sCtrlAV37Lb_fechaR ;
   private String sCtrlAV38Lb_obscr ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavNoaceptacionensayo_sdt__lb_numero_Jsonclick ;
   private String edtavNoaceptacionensayo_sdt__lb_opcion_Jsonclick ;
   private String edtavNoaceptacionensayo_sdt__lb_colnom_Jsonclick ;
   private String edtavNoaceptacionensayo_sdt__lb_colnum_Jsonclick ;
   private String edtavNoaceptacionensayo_sdt__clicod_Jsonclick ;
   private String edtavNoaceptacionensayo_sdt__clinom_Jsonclick ;
   private String edtavNoaceptacionensayo_sdt__lb_cartaz_Jsonclick ;
   private String edtavNoaceptacionensayo_sdt__lb_cartazf_Jsonclick ;
   private String edtavNoaceptacionensayo_sdt__lb_fechaen_Jsonclick ;
   private String edtavNoaceptacionensayo_sdt__lb_fechar_Jsonclick ;
   private String edtavNoaceptacionensayo_sdt__lb_estado_Jsonclick ;
   private String edtavNoaceptacionensayo_sdt__lb_fecnoa1_Jsonclick ;
   private String edtavNoaceptacionensayo_sdt__lb_hhnoa1_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV33Lb_hhnoa1 ;
   private java.util.Date GXv_dtime18[] ;
   private java.util.Date wcpOAV37Lb_fechaR ;
   private java.util.Date AV37Lb_fechaR ;
   private java.util.Date GXv_date17[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV45Var_seleccionar ;
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
   private boolean bGXsfl_58_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV58 ;
   private boolean gx_refresh_fired ;
   private String AV46NoAceptacionEnsayo_SDT_json ;
   private String AV11ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV30UserCustomValue ;
   private String wcpOAV38Lb_obscr ;
   private String AV38Lb_obscr ;
   private String AV15FilterFullText ;
   private String AV14ExcelFilename ;
   private String AV13ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmar ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavNoaceptacionensayo_sdt__seleccionar ;
   private IDataStoreProvider pr_default ;
   private com.genexus.webpanels.WebSession AV47websession ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV22ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[] ;
   private GXBaseCollection<app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item> AV25NoAceptacionEnsayo_SDT ;
   private GXBaseCollection<app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item> GXt_objcol_SdtNoAceptacionEnsayo_SDT_Item9 ;
   private GXBaseCollection<app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item> GXv_objcol_SdtNoAceptacionEnsayo_SDT_Item10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV9ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV10ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector13[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV12DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV18GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState20[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV19GridStateFilterValue ;
   private app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item AV34NoAceptacionEnsayo_SDT_item ;
   private app.wwpbaseobjects.SdtWWPContext AV31WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
}

final  class noaceptacionensayo_sdt_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

