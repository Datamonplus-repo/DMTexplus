package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class entradaensayolaboratorio_productos_wc_impl extends GXWebComponent
{
   public entradaensayolaboratorio_productos_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public entradaensayolaboratorio_productos_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradaensayolaboratorio_productos_wc_impl.class ));
   }

   public entradaensayolaboratorio_productos_wc_impl( int remoteHandle ,
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
               AV13Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Emprcod", AV13Emprcod);
               AV6Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Lb_numero), 8, 0));
               AV7Lb_opcion = httpContext.GetPar( "Lb_opcion") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Lb_opcion", AV7Lb_opcion);
               AV26Lb_CodGru = httpContext.GetPar( "Lb_CodGru") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Lb_CodGru", AV26Lb_CodGru);
               AV49Tipo_p = httpContext.GetPar( "Tipo_p") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Tipo_p", AV49Tipo_p);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV13Emprcod,Integer.valueOf(AV6Lb_numero),AV7Lb_opcion,AV26Lb_CodGru,AV49Tipo_p});
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
      nRC_GXsfl_33 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_33"))) ;
      nGXsfl_33_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_33_idx"))) ;
      sGXsfl_33_idx = httpContext.GetPar( "sGXsfl_33_idx") ;
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
      AV13Emprcod = httpContext.GetPar( "Emprcod") ;
      AV26Lb_CodGru = httpContext.GetPar( "Lb_CodGru") ;
      AV41TFLb_LinGru = (short)(GXutil.lval( httpContext.GetPar( "TFLb_LinGru"))) ;
      AV42TFLb_LinGru_To = (short)(GXutil.lval( httpContext.GetPar( "TFLb_LinGru_To"))) ;
      AV45TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV46TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV43TFPrdNom = httpContext.GetPar( "TFPrdNom") ;
      AV44TFPrdNom_Sel = httpContext.GetPar( "TFPrdNom_Sel") ;
      AV47TFValCod = (byte)(GXutil.lval( httpContext.GetPar( "TFValCod"))) ;
      AV48TFValCod_To = (byte)(GXutil.lval( httpContext.GetPar( "TFValCod_To"))) ;
      AV62Pgmname = httpContext.GetPar( "Pgmname") ;
      AV31OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV33OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV6Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
      AV7Lb_opcion = httpContext.GetPar( "Lb_opcion") ;
      AV49Tipo_p = httpContext.GetPar( "Tipo_p") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV8Col_Lb_LinGru);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV54Col_Prdnum);
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV13Emprcod, AV26Lb_CodGru, AV41TFLb_LinGru, AV42TFLb_LinGru_To, AV45TFPrdNum, AV46TFPrdNum_Sel, AV43TFPrdNom, AV44TFPrdNom_Sel, AV47TFValCod, AV48TFValCod_To, AV62Pgmname, AV31OrderedBy, AV33OrderedDsc, AV6Lb_numero, AV7Lb_opcion, AV49Tipo_p, AV8Col_Lb_LinGru, AV54Col_Prdnum, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1UW2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Creacion Opcion,Productos", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.gestionlaboratorio.entradaensayolaboratorio_productos_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV13Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6Lb_numero,8,0)),GXutil.URLEncode(GXutil.rtrim(AV7Lb_opcion)),GXutil.URLEncode(GXutil.rtrim(AV26Lb_CodGru)),GXutil.URLEncode(GXutil.rtrim(AV49Tipo_p))}, new String[] {"Emprcod","Lb_numero","Lb_opcion","Lb_CodGru","Tipo_p"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"EntradaEnsayoLaboratorio_Productos_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV62Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\entradaensayolaboratorio_productos_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_33", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_33, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV12DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV12DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV13Emprcod", GXutil.rtrim( wcpOAV13Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6Lb_numero", GXutil.ltrim( localUtil.ntoc( wcpOAV6Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7Lb_opcion", GXutil.rtrim( wcpOAV7Lb_opcion));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV26Lb_CodGru", GXutil.rtrim( wcpOAV26Lb_CodGru));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV49Tipo_p", GXutil.rtrim( wcpOAV49Tipo_p));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_LINGRU", GXutil.ltrim( localUtil.ntoc( AV41TFLb_LinGru, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_LINGRU_TO", GXutil.ltrim( localUtil.ntoc( AV42TFLb_LinGru_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM", GXutil.rtrim( AV45TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM_SEL", GXutil.rtrim( AV46TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNOM", GXutil.rtrim( AV43TFPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNOM_SEL", GXutil.rtrim( AV44TFPrdNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFVALCOD", GXutil.ltrim( localUtil.ntoc( AV47TFValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFVALCOD_TO", GXutil.ltrim( localUtil.ntoc( AV48TFValCod_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV31OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV33OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV13Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_NUMERO", GXutil.ltrim( localUtil.ntoc( AV6Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_OPCION", GXutil.rtrim( AV7Lb_opcion));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_CODGRU", GXutil.rtrim( AV26Lb_CodGru));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPO_P", GXutil.rtrim( AV49Tipo_p));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_LB_LINGRU", AV8Col_Lb_LinGru);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_LB_LINGRU", AV8Col_Lb_LinGru);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_PRDNUM", AV54Col_Prdnum);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_PRDNUM", AV54Col_Prdnum);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMSG", GXutil.rtrim( Gx_msg));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vI", GXutil.ltrim( localUtil.ntoc( AV24i, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUM", GXutil.rtrim( AV55prdnum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vF_ERROR", GXutil.ltrim( localUtil.ntoc( AV16F_error, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
   }

   public void renderHtmlCloseForm1UW2( )
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
      return "GestionLaboratorio.EntradaEnsayoLaboratorio_Productos_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Creacion Opcion,Productos", "") ;
   }

   public void wb1UW0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.gestionlaboratorio.entradaensayolaboratorio_productos_wc");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTxttipo_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'" + sPrefix + "',false,'" + sGXsfl_33_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTxttipo_Internalname, GXutil.rtrim( AV56txtTipo), GXutil.rtrim( localUtil.format( AV56txtTipo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,14);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTxttipo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTxttipo_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Productos_WC.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 33, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111uw1_client"+"'", TempTags, "", 2, "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Productos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancelar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 33, 2, 0)+","+"null"+");", httpContext.getMessage( "Cancelar", ""), bttBtncancelar_Jsonclick, 5, httpContext.getMessage( "Cancelar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOCANCELAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Productos_WC.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", divUnnamedtable3_Height, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol33( ) ;
      }
      if ( wbEnd == 33 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_33 = (int)(nGXsfl_33_idx-1) ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV62Pgmname), GXutil.rtrim( localUtil.format( AV62Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Productos_WC.htm");
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
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV12DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         wb_table1_47_1UW2( true) ;
      }
      else
      {
         wb_table1_47_1UW2( false) ;
      }
      return  ;
   }

   public void wb_table1_47_1UW2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
      if ( wbEnd == 33 )
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

   public void start1UW2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Creacion Opcion,Productos", ""), (short)(0)) ;
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
            strup1UW0( ) ;
         }
      }
   }

   public void ws1UW2( )
   {
      start1UW2( ) ;
      evt1UW2( ) ;
   }

   public void evt1UW2( )
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
                              strup1UW0( ) ;
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
                              strup1UW0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121UW2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1UW0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131UW2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCANCELAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1UW0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoCancelar' */
                                 e141UW2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1UW0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = chkavSeleccionar.getInternalname() ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1UW0( ) ;
                           }
                           AV63Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_1_tflb_lingru = AV41TFLb_LinGru ;
                           AV64Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_2_tflb_lingru_to = AV42TFLb_LinGru_To ;
                           AV65Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum = AV45TFPrdNum ;
                           AV66Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel = AV46TFPrdNum_Sel ;
                           AV67Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom = AV43TFPrdNom ;
                           AV68Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel = AV44TFPrdNom_Sel ;
                           AV69Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_7_tfvalcod = AV47TFValCod ;
                           AV70Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_8_tfvalcod_to = AV48TFValCod_To ;
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
                              strup1UW0( ) ;
                           }
                           nGXsfl_33_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_332( ) ;
                           AV35Seleccionar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionar.getInternalname())) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV35Seleccionar);
                           A5615Lb_LinGru = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_LinGru_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
                           A856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtValCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e151UW2 ();
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
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e161UW2 ();
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
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e171UW2 ();
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
                                    strup1UW0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
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

   public void we1UW2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1UW2( ) ;
         }
      }
   }

   public void pa1UW2( )
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
            GX_FocusControl = edtavTxttipo_Internalname ;
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
      subsflControlProps_332( ) ;
      while ( nGXsfl_33_idx <= nRC_GXsfl_33 )
      {
         sendrow_332( ) ;
         nGXsfl_33_idx = ((subGrid_Islastpage==1)&&(nGXsfl_33_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_33_idx+1) ;
         sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_332( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV13Emprcod ,
                                 String AV26Lb_CodGru ,
                                 short AV41TFLb_LinGru ,
                                 short AV42TFLb_LinGru_To ,
                                 String AV45TFPrdNum ,
                                 String AV46TFPrdNum_Sel ,
                                 String AV43TFPrdNom ,
                                 String AV44TFPrdNom_Sel ,
                                 byte AV47TFValCod ,
                                 byte AV48TFValCod_To ,
                                 String AV62Pgmname ,
                                 short AV31OrderedBy ,
                                 boolean AV33OrderedDsc ,
                                 int AV6Lb_numero ,
                                 String AV7Lb_opcion ,
                                 String AV49Tipo_p ,
                                 GXSimpleCollection<Short> AV8Col_Lb_LinGru ,
                                 GXSimpleCollection<String> AV54Col_Prdnum ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e161UW2 ();
      GRID_nCurrentRecord = 0 ;
      rf1UW2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"EntradaEnsayoLaboratorio_Productos_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV62Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\entradaensayolaboratorio_productos_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LB_LINGRU", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A5615Lb_LinGru), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"LB_LINGRU", GXutil.ltrim( localUtil.ntoc( A5615Lb_LinGru, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PRDNUM", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A719PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDNUM", GXutil.rtrim( A719PrdNum));
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
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_33_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf1UW2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV62Pgmname = "GestionLaboratorio.EntradaEnsayoLaboratorio_Productos_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Pgmname", AV62Pgmname);
      Gx_err = (short)(0) ;
      edtavTxttipo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTxttipo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTxttipo_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1UW2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(33) ;
      /* Execute user event: Refresh */
      e161UW2 ();
      nGXsfl_33_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_332( ) ;
      bGXsfl_33_Refreshing = true ;
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
         subsflControlProps_332( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Short.valueOf(AV63Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_1_tflb_lingru) ,
                                              Short.valueOf(AV64Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_2_tflb_lingru_to) ,
                                              AV66Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel ,
                                              AV65Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum ,
                                              AV68Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel ,
                                              AV67Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom ,
                                              Byte.valueOf(AV69Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_7_tfvalcod) ,
                                              Byte.valueOf(AV70Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_8_tfvalcod_to) ,
                                              Short.valueOf(A5615Lb_LinGru) ,
                                              A719PrdNum ,
                                              A718PrdNom ,
                                              Byte.valueOf(A856ValCod) ,
                                              Short.valueOf(AV31OrderedBy) ,
                                              Boolean.valueOf(AV33OrderedDsc) ,
                                              AV13Emprcod ,
                                              AV26Lb_CodGru ,
                                              A396EmprCod ,
                                              A5612Lb_CodGru } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV65Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV65Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum), 6, "%") ;
         lV67Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV67Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom), 26, "%") ;
         /* Using cursor H01UW2 */
         pr_default.execute(0, new Object[] {AV13Emprcod, AV26Lb_CodGru, Short.valueOf(AV63Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_1_tflb_lingru), Short.valueOf(AV64Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_2_tflb_lingru_to), lV65Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum, AV66Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel, lV67Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom, AV68Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel, Byte.valueOf(AV69Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_7_tfvalcod), Byte.valueOf(AV70Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_8_tfvalcod_to), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_33_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_332( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H01UW2_A396EmprCod[0] ;
            A5612Lb_CodGru = H01UW2_A5612Lb_CodGru[0] ;
            A856ValCod = H01UW2_A856ValCod[0] ;
            A718PrdNom = H01UW2_A718PrdNom[0] ;
            A719PrdNum = H01UW2_A719PrdNum[0] ;
            A5615Lb_LinGru = H01UW2_A5615Lb_LinGru[0] ;
            A856ValCod = H01UW2_A856ValCod[0] ;
            A718PrdNom = H01UW2_A718PrdNom[0] ;
            e171UW2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(33) ;
         wb1UW0( ) ;
      }
      bGXsfl_33_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1UW2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_LB_LINGRU"+"_"+sGXsfl_33_idx, getSecureSignedToken( sPrefix+sGXsfl_33_idx, localUtil.format( DecimalUtil.doubleToDec(A5615Lb_LinGru), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PRDNUM"+"_"+sGXsfl_33_idx, getSecureSignedToken( sPrefix+sGXsfl_33_idx, GXutil.rtrim( localUtil.format( A719PrdNum, ""))));
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
      AV63Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_1_tflb_lingru = AV41TFLb_LinGru ;
      AV64Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_2_tflb_lingru_to = AV42TFLb_LinGru_To ;
      AV65Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum = AV45TFPrdNum ;
      AV66Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel = AV46TFPrdNum_Sel ;
      AV67Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom = AV43TFPrdNom ;
      AV68Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel = AV44TFPrdNom_Sel ;
      AV69Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_7_tfvalcod = AV47TFValCod ;
      AV70Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_8_tfvalcod_to = AV48TFValCod_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV63Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_1_tflb_lingru) ,
                                           Short.valueOf(AV64Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_2_tflb_lingru_to) ,
                                           AV66Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel ,
                                           AV65Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum ,
                                           AV68Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel ,
                                           AV67Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom ,
                                           Byte.valueOf(AV69Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_7_tfvalcod) ,
                                           Byte.valueOf(AV70Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_8_tfvalcod_to) ,
                                           Short.valueOf(A5615Lb_LinGru) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Byte.valueOf(A856ValCod) ,
                                           Short.valueOf(AV31OrderedBy) ,
                                           Boolean.valueOf(AV33OrderedDsc) ,
                                           AV13Emprcod ,
                                           AV26Lb_CodGru ,
                                           A396EmprCod ,
                                           A5612Lb_CodGru } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV65Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum), 6, "%") ;
      lV67Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV67Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom), 26, "%") ;
      /* Using cursor H01UW3 */
      pr_default.execute(1, new Object[] {AV13Emprcod, AV26Lb_CodGru, Short.valueOf(AV63Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_1_tflb_lingru), Short.valueOf(AV64Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_2_tflb_lingru_to), lV65Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum, AV66Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel, lV67Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom, AV68Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel, Byte.valueOf(AV69Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_7_tfvalcod), Byte.valueOf(AV70Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_8_tfvalcod_to)});
      GRID_nRecordCount = H01UW3_AGRID_nRecordCount[0] ;
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
      AV63Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_1_tflb_lingru = AV41TFLb_LinGru ;
      AV64Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_2_tflb_lingru_to = AV42TFLb_LinGru_To ;
      AV65Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum = AV45TFPrdNum ;
      AV66Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel = AV46TFPrdNum_Sel ;
      AV67Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom = AV43TFPrdNom ;
      AV68Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel = AV44TFPrdNom_Sel ;
      AV69Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_7_tfvalcod = AV47TFValCod ;
      AV70Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_8_tfvalcod_to = AV48TFValCod_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV13Emprcod, AV26Lb_CodGru, AV41TFLb_LinGru, AV42TFLb_LinGru_To, AV45TFPrdNum, AV46TFPrdNum_Sel, AV43TFPrdNom, AV44TFPrdNom_Sel, AV47TFValCod, AV48TFValCod_To, AV62Pgmname, AV31OrderedBy, AV33OrderedDsc, AV6Lb_numero, AV7Lb_opcion, AV49Tipo_p, AV8Col_Lb_LinGru, AV54Col_Prdnum, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV63Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_1_tflb_lingru = AV41TFLb_LinGru ;
      AV64Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_2_tflb_lingru_to = AV42TFLb_LinGru_To ;
      AV65Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum = AV45TFPrdNum ;
      AV66Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel = AV46TFPrdNum_Sel ;
      AV67Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom = AV43TFPrdNom ;
      AV68Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel = AV44TFPrdNom_Sel ;
      AV69Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_7_tfvalcod = AV47TFValCod ;
      AV70Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_8_tfvalcod_to = AV48TFValCod_To ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( GRID_nEOF == 1 )
      {
         GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV13Emprcod, AV26Lb_CodGru, AV41TFLb_LinGru, AV42TFLb_LinGru_To, AV45TFPrdNum, AV46TFPrdNum_Sel, AV43TFPrdNom, AV44TFPrdNom_Sel, AV47TFValCod, AV48TFValCod_To, AV62Pgmname, AV31OrderedBy, AV33OrderedDsc, AV6Lb_numero, AV7Lb_opcion, AV49Tipo_p, AV8Col_Lb_LinGru, AV54Col_Prdnum, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV63Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_1_tflb_lingru = AV41TFLb_LinGru ;
      AV64Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_2_tflb_lingru_to = AV42TFLb_LinGru_To ;
      AV65Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum = AV45TFPrdNum ;
      AV66Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel = AV46TFPrdNum_Sel ;
      AV67Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom = AV43TFPrdNom ;
      AV68Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel = AV44TFPrdNom_Sel ;
      AV69Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_7_tfvalcod = AV47TFValCod ;
      AV70Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_8_tfvalcod_to = AV48TFValCod_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV13Emprcod, AV26Lb_CodGru, AV41TFLb_LinGru, AV42TFLb_LinGru_To, AV45TFPrdNum, AV46TFPrdNum_Sel, AV43TFPrdNom, AV44TFPrdNom_Sel, AV47TFValCod, AV48TFValCod_To, AV62Pgmname, AV31OrderedBy, AV33OrderedDsc, AV6Lb_numero, AV7Lb_opcion, AV49Tipo_p, AV8Col_Lb_LinGru, AV54Col_Prdnum, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV63Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_1_tflb_lingru = AV41TFLb_LinGru ;
      AV64Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_2_tflb_lingru_to = AV42TFLb_LinGru_To ;
      AV65Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum = AV45TFPrdNum ;
      AV66Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel = AV46TFPrdNum_Sel ;
      AV67Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom = AV43TFPrdNom ;
      AV68Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel = AV44TFPrdNom_Sel ;
      AV69Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_7_tfvalcod = AV47TFValCod ;
      AV70Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_8_tfvalcod_to = AV48TFValCod_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV13Emprcod, AV26Lb_CodGru, AV41TFLb_LinGru, AV42TFLb_LinGru_To, AV45TFPrdNum, AV46TFPrdNum_Sel, AV43TFPrdNom, AV44TFPrdNom_Sel, AV47TFValCod, AV48TFValCod_To, AV62Pgmname, AV31OrderedBy, AV33OrderedDsc, AV6Lb_numero, AV7Lb_opcion, AV49Tipo_p, AV8Col_Lb_LinGru, AV54Col_Prdnum, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV63Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_1_tflb_lingru = AV41TFLb_LinGru ;
      AV64Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_2_tflb_lingru_to = AV42TFLb_LinGru_To ;
      AV65Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum = AV45TFPrdNum ;
      AV66Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel = AV46TFPrdNum_Sel ;
      AV67Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom = AV43TFPrdNom ;
      AV68Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel = AV44TFPrdNom_Sel ;
      AV69Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_7_tfvalcod = AV47TFValCod ;
      AV70Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_8_tfvalcod_to = AV48TFValCod_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV13Emprcod, AV26Lb_CodGru, AV41TFLb_LinGru, AV42TFLb_LinGru_To, AV45TFPrdNum, AV46TFPrdNum_Sel, AV43TFPrdNom, AV44TFPrdNom_Sel, AV47TFValCod, AV48TFValCod_To, AV62Pgmname, AV31OrderedBy, AV33OrderedDsc, AV6Lb_numero, AV7Lb_opcion, AV49Tipo_p, AV8Col_Lb_LinGru, AV54Col_Prdnum, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV62Pgmname = "GestionLaboratorio.EntradaEnsayoLaboratorio_Productos_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Pgmname", AV62Pgmname);
      Gx_err = (short)(0) ;
      edtavTxttipo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTxttipo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTxttipo_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1UW0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e151UW2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV12DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOL_PRDNUM"), AV54Col_Prdnum);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOL_LB_LINGRU"), AV8Col_Lb_LinGru);
         /* Read saved values. */
         nRC_GXsfl_33 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_33"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV13Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV13Emprcod") ;
         wcpOAV6Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6Lb_numero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV7Lb_opcion = httpContext.cgiGet( sPrefix+"wcpOAV7Lb_opcion") ;
         wcpOAV26Lb_CodGru = httpContext.cgiGet( sPrefix+"wcpOAV26Lb_CodGru") ;
         wcpOAV49Tipo_p = httpContext.cgiGet( sPrefix+"wcpOAV49Tipo_p") ;
         AV24i = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_msg = httpContext.cgiGet( sPrefix+"vMSG") ;
         AV49Tipo_p = httpContext.cgiGet( sPrefix+"vTIPO_P") ;
         AV55prdnum = httpContext.cgiGet( sPrefix+"vPRDNUM") ;
         AV16F_error = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vF_ERROR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Dvelop_confirmpanel_confirmar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Title") ;
         Dvelop_confirmpanel_confirmar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_confirmar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_confirmar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Dvelop_confirmpanel_confirmar_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Result") ;
         /* Read variables values. */
         AV56txtTipo = httpContext.cgiGet( edtavTxttipo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56txtTipo", AV56txtTipo);
         AV62Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Pgmname", AV62Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"EntradaEnsayoLaboratorio_Productos_WC");
         AV62Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Pgmname", AV62Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV62Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("gestionlaboratorio\\entradaensayolaboratorio_productos_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e151UW2 ();
      if (returnInSub) return;
   }

   public void e151UW2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV56txtTipo = ((GXutil.strcmp(AV49Tipo_p, "C")==0) ? httpContext.getMessage( "Colorantes", "") : httpContext.getMessage( "Productos", "")) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56txtTipo", AV56txtTipo);
      GXt_char1 = AV57Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      entradaensayolaboratorio_productos_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV57Station = GXt_char1 ;
      GXv_char2[0] = AV13Emprcod ;
      GXv_char3[0] = AV58EmprNom ;
      GXv_char4[0] = AV59UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV57Station, GXv_char2, GXv_char3, GXv_char4) ;
      entradaensayolaboratorio_productos_wc_impl.this.AV13Emprcod = GXv_char2[0] ;
      entradaensayolaboratorio_productos_wc_impl.this.AV58EmprNom = GXv_char3[0] ;
      entradaensayolaboratorio_productos_wc_impl.this.AV59UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Emprcod", AV13Emprcod);
      divUnnamedtable3_Height = 30 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divUnnamedtable3_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable3_Height), 9, 0), true);
      subGrid_Rows = 0 ;
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
      if ( AV31OrderedBy < 1 )
      {
         AV31OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV12DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV12DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
   }

   public void e161UW2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV53WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV53WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      AV63Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_1_tflb_lingru = AV41TFLb_LinGru ;
      AV64Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_2_tflb_lingru_to = AV42TFLb_LinGru_To ;
      AV65Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum = AV45TFPrdNum ;
      AV66Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel = AV46TFPrdNum_Sel ;
      AV67Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom = AV43TFPrdNom ;
      AV68Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel = AV44TFPrdNom_Sel ;
      AV69Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_7_tfvalcod = AV47TFValCod ;
      AV70Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_8_tfvalcod_to = AV48TFValCod_To ;
   }

   public void e121UW2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV31OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31OrderedBy), 4, 0));
         AV33OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33OrderedDsc", AV33OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_LinGru") == 0 )
         {
            AV41TFLb_LinGru = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFLb_LinGru", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFLb_LinGru), 4, 0));
            AV42TFLb_LinGru_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFLb_LinGru_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFLb_LinGru_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV45TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFPrdNum", AV45TFPrdNum);
            AV46TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFPrdNum_Sel", AV46TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNom") == 0 )
         {
            AV43TFPrdNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFPrdNom", AV43TFPrdNom);
            AV44TFPrdNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFPrdNom_Sel", AV44TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ValCod") == 0 )
         {
            AV47TFValCod = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFValCod", GXutil.str( AV47TFValCod, 1, 0));
            AV48TFValCod_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFValCod_To", GXutil.str( AV48TFValCod_To, 1, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e171UW2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      if ( A856ValCod < 3 )
      {
         AV8Col_Lb_LinGru.add((short)(A5615Lb_LinGru), 0);
         AV54Col_Prdnum.add(A719PrdNum, 0);
         AV35Seleccionar = true ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV35Seleccionar);
      }
      else
      {
         AV35Seleccionar = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV35Seleccionar);
      }
      AV24i = (short)(1) ;
      while ( AV24i <= AV8Col_Lb_LinGru.size() )
      {
         if ( ( ((Number) AV8Col_Lb_LinGru.elementAt(-1+AV24i)).shortValue() == A5615Lb_LinGru ) && ( GXutil.strcmp((String)AV54Col_Prdnum.elementAt(-1+AV24i), A719PrdNum) == 0 ) )
         {
            System.out.println( GXutil.str( ((Number) AV8Col_Lb_LinGru.elementAt(-1+AV24i)).shortValue(), 4, 0)+" = "+localUtil.format( DecimalUtil.doubleToDec(A5615Lb_LinGru), "ZZZ9")+" | "+(String)AV54Col_Prdnum.elementAt(-1+AV24i)+" = "+A719PrdNum );
            AV35Seleccionar = true ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV35Seleccionar);
            if (true) break;
         }
         AV24i = (short)(AV24i+1) ;
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(33) ;
      }
      sendrow_332( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_33_Refreshing )
      {
         httpContext.doAjaxLoad(33, GridRow);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV8Col_Lb_LinGru", AV8Col_Lb_LinGru);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV54Col_Prdnum", AV54Col_Prdnum);
   }

   public void e131UW2( )
   {
      /* Dvelop_confirmpanel_confirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_confirmar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFIRMAR' */
         S152 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e141UW2( )
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

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV31OrderedBy, 4, 0))+":"+(AV33OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      AV27Linea_p = (short)(10) ;
      AV24i = (short)(1) ;
      while ( AV24i <= AV8Col_Lb_LinGru.size() )
      {
         AV5Lb_LinGru = ((Number) AV8Col_Lb_LinGru.elementAt(-1+AV24i)).shortValue() ;
         AV55prdnum = (String)AV54Col_Prdnum.elementAt(-1+AV24i) ;
         GXv_char4[0] = AV13Emprcod ;
         GXv_int8[0] = AV6Lb_numero ;
         GXv_char3[0] = AV7Lb_opcion ;
         GXv_char2[0] = AV55prdnum ;
         GXv_char9[0] = AV49Tipo_p ;
         GXv_int10[0] = AV27Linea_p ;
         new app.gestionlaboratorio.pens021(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2, GXv_char9, GXv_int10) ;
         entradaensayolaboratorio_productos_wc_impl.this.AV13Emprcod = GXv_char4[0] ;
         entradaensayolaboratorio_productos_wc_impl.this.AV6Lb_numero = GXv_int8[0] ;
         entradaensayolaboratorio_productos_wc_impl.this.AV7Lb_opcion = GXv_char3[0] ;
         entradaensayolaboratorio_productos_wc_impl.this.AV55prdnum = GXv_char2[0] ;
         entradaensayolaboratorio_productos_wc_impl.this.AV49Tipo_p = GXv_char9[0] ;
         entradaensayolaboratorio_productos_wc_impl.this.AV27Linea_p = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Emprcod", AV13Emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Lb_numero), 8, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Lb_opcion", AV7Lb_opcion);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Tipo_p", AV49Tipo_p);
         AV27Linea_p = (short)(AV27Linea_p+10) ;
         AV24i = (short)(AV24i+1) ;
      }
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso finalizado", ""));
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV36Session.getValue(AV62Pgmname+"GridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV62Pgmname+"GridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV36Session.getValue(AV62Pgmname+"GridState"), null, null);
      }
      AV31OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31OrderedBy), 4, 0));
      AV33OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33OrderedDsc", AV33OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV72GXV1 = 1 ;
      while ( AV72GXV1 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV72GXV1));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_LINGRU") == 0 )
         {
            AV41TFLb_LinGru = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFLb_LinGru", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFLb_LinGru), 4, 0));
            AV42TFLb_LinGru_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFLb_LinGru_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFLb_LinGru_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV45TFPrdNum = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFPrdNum", AV45TFPrdNum);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV46TFPrdNum_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFPrdNum_Sel", AV46TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV43TFPrdNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFPrdNom", AV43TFPrdNom);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV44TFPrdNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFPrdNom_Sel", AV44TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALCOD") == 0 )
         {
            AV47TFValCod = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFValCod", GXutil.str( AV47TFValCod, 1, 0));
            AV48TFValCod_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFValCod_To", GXutil.str( AV48TFValCod_To, 1, 0));
         }
         AV72GXV1 = (int)(AV72GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char9[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFPrdNum_Sel)==0), AV46TFPrdNum_Sel, GXv_char9) ;
      entradaensayolaboratorio_productos_wc_impl.this.GXt_char1 = GXv_char9[0] ;
      GXt_char11 = "" ;
      GXv_char4[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFPrdNom_Sel)==0), AV44TFPrdNom_Sel, GXv_char4) ;
      entradaensayolaboratorio_productos_wc_impl.this.GXt_char11 = GXv_char4[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char11+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char11 = "" ;
      GXv_char9[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFPrdNum)==0), AV45TFPrdNum, GXv_char9) ;
      entradaensayolaboratorio_productos_wc_impl.this.GXt_char11 = GXv_char9[0] ;
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFPrdNom)==0), AV43TFPrdNom, GXv_char4) ;
      entradaensayolaboratorio_productos_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV41TFLb_LinGru) ? "" : GXutil.str( AV41TFLb_LinGru, 4, 0))+"|"+GXt_char11+"|"+GXt_char1+"|"+((0==AV47TFValCod) ? "" : GXutil.str( AV47TFValCod, 1, 0)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV42TFLb_LinGru_To) ? "" : GXutil.str( AV42TFLb_LinGru_To, 4, 0))+"|||"+((0==AV48TFValCod_To) ? "" : GXutil.str( AV48TFValCod_To, 1, 0)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV21GridState.fromxml(AV36Session.getValue(AV62Pgmname+"GridState"), null, null);
      AV21GridState.setgxTv_SdtWWPGridState_Orderedby( AV31OrderedBy );
      AV21GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV33OrderedDsc );
      AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState12[0] = AV21GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFLB_LINGRU", "", !((0==AV41TFLb_LinGru)&&(0==AV42TFLb_LinGru_To)), (short)(0), GXutil.trim( GXutil.str( AV41TFLb_LinGru, 4, 0)), GXutil.trim( GXutil.str( AV42TFLb_LinGru_To, 4, 0))) ;
      AV21GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV21GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFPRDNUM", "", !(GXutil.strcmp("", AV45TFPrdNum)==0), (short)(0), AV45TFPrdNum, "", !(GXutil.strcmp("", AV46TFPrdNum_Sel)==0), AV46TFPrdNum_Sel, "") ;
      AV21GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV21GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFPRDNOM", "", !(GXutil.strcmp("", AV43TFPrdNom)==0), (short)(0), AV43TFPrdNom, "", !(GXutil.strcmp("", AV44TFPrdNom_Sel)==0), AV44TFPrdNom_Sel, "") ;
      AV21GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV21GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFVALCOD", "", !((0==AV47TFValCod)&&(0==AV48TFValCod_To)), (short)(0), GXutil.trim( GXutil.str( AV47TFValCod, 1, 0)), GXutil.trim( GXutil.str( AV48TFValCod_To, 1, 0))) ;
      AV21GridState = GXv_SdtWWPGridState12[0] ;
      if ( ! (GXutil.strcmp("", AV13Emprcod)==0) )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV22GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV22GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV13Emprcod );
         AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV22GridStateFilterValue, 0);
      }
      if ( ! (0==AV6Lb_numero) )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV22GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_NUMERO" );
         AV22GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV6Lb_numero, 8, 0) );
         AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV22GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV7Lb_opcion)==0) )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV22GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_OPCION" );
         AV22GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV7Lb_opcion );
         AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV22GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV26Lb_CodGru)==0) )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV22GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_CODGRU" );
         AV22GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV26Lb_CodGru );
         AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV22GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV49Tipo_p)==0) )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV22GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPO_P" );
         AV22GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV49Tipo_p );
         AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV22GridStateFilterValue, 0);
      }
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV62Pgmname+"GridState", AV21GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV50TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV50TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV62Pgmname );
      AV50TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV50TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV23HTTPRequest.getScriptName()+"?"+AV23HTTPRequest.getQuerystring() );
      AV50TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "GestionLaboratorio.EntradaEnsayoLaboratorio_Productos_TRN" );
      AV36Session.setValue("TrnContext", AV50TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_47_1UW2( boolean wbgen )
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
         wb_table1_47_1UW2e( true) ;
      }
      else
      {
         wb_table1_47_1UW2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV13Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Emprcod", AV13Emprcod);
      AV6Lb_numero = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Lb_numero), 8, 0));
      AV7Lb_opcion = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Lb_opcion", AV7Lb_opcion);
      AV26Lb_CodGru = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Lb_CodGru", AV26Lb_CodGru);
      AV49Tipo_p = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Tipo_p", AV49Tipo_p);
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
      pa1UW2( ) ;
      ws1UW2( ) ;
      we1UW2( ) ;
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
      sCtrlAV13Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV6Lb_numero = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV7Lb_opcion = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV26Lb_CodGru = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV49Tipo_p = (String)getParm(obj,4,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1UW2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "gestionlaboratorio\\entradaensayolaboratorio_productos_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1UW2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV13Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Emprcod", AV13Emprcod);
         AV6Lb_numero = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Lb_numero), 8, 0));
         AV7Lb_opcion = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Lb_opcion", AV7Lb_opcion);
         AV26Lb_CodGru = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Lb_CodGru", AV26Lb_CodGru);
         AV49Tipo_p = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Tipo_p", AV49Tipo_p);
      }
      wcpOAV13Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV13Emprcod") ;
      wcpOAV6Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6Lb_numero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV7Lb_opcion = httpContext.cgiGet( sPrefix+"wcpOAV7Lb_opcion") ;
      wcpOAV26Lb_CodGru = httpContext.cgiGet( sPrefix+"wcpOAV26Lb_CodGru") ;
      wcpOAV49Tipo_p = httpContext.cgiGet( sPrefix+"wcpOAV49Tipo_p") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV13Emprcod, wcpOAV13Emprcod) != 0 ) || ( AV6Lb_numero != wcpOAV6Lb_numero ) || ( GXutil.strcmp(AV7Lb_opcion, wcpOAV7Lb_opcion) != 0 ) || ( GXutil.strcmp(AV26Lb_CodGru, wcpOAV26Lb_CodGru) != 0 ) || ( GXutil.strcmp(AV49Tipo_p, wcpOAV49Tipo_p) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV13Emprcod = AV13Emprcod ;
      wcpOAV6Lb_numero = AV6Lb_numero ;
      wcpOAV7Lb_opcion = AV7Lb_opcion ;
      wcpOAV26Lb_CodGru = AV26Lb_CodGru ;
      wcpOAV49Tipo_p = AV49Tipo_p ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV13Emprcod = httpContext.cgiGet( sPrefix+"AV13Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV13Emprcod) > 0 )
      {
         AV13Emprcod = httpContext.cgiGet( sCtrlAV13Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Emprcod", AV13Emprcod);
      }
      else
      {
         AV13Emprcod = httpContext.cgiGet( sPrefix+"AV13Emprcod_PARM") ;
      }
      sCtrlAV6Lb_numero = httpContext.cgiGet( sPrefix+"AV6Lb_numero_CTRL") ;
      if ( GXutil.len( sCtrlAV6Lb_numero) > 0 )
      {
         AV6Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV6Lb_numero), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Lb_numero), 8, 0));
      }
      else
      {
         AV6Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV6Lb_numero_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV7Lb_opcion = httpContext.cgiGet( sPrefix+"AV7Lb_opcion_CTRL") ;
      if ( GXutil.len( sCtrlAV7Lb_opcion) > 0 )
      {
         AV7Lb_opcion = httpContext.cgiGet( sCtrlAV7Lb_opcion) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Lb_opcion", AV7Lb_opcion);
      }
      else
      {
         AV7Lb_opcion = httpContext.cgiGet( sPrefix+"AV7Lb_opcion_PARM") ;
      }
      sCtrlAV26Lb_CodGru = httpContext.cgiGet( sPrefix+"AV26Lb_CodGru_CTRL") ;
      if ( GXutil.len( sCtrlAV26Lb_CodGru) > 0 )
      {
         AV26Lb_CodGru = httpContext.cgiGet( sCtrlAV26Lb_CodGru) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Lb_CodGru", AV26Lb_CodGru);
      }
      else
      {
         AV26Lb_CodGru = httpContext.cgiGet( sPrefix+"AV26Lb_CodGru_PARM") ;
      }
      sCtrlAV49Tipo_p = httpContext.cgiGet( sPrefix+"AV49Tipo_p_CTRL") ;
      if ( GXutil.len( sCtrlAV49Tipo_p) > 0 )
      {
         AV49Tipo_p = httpContext.cgiGet( sCtrlAV49Tipo_p) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Tipo_p", AV49Tipo_p);
      }
      else
      {
         AV49Tipo_p = httpContext.cgiGet( sPrefix+"AV49Tipo_p_PARM") ;
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
      pa1UW2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1UW2( ) ;
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
      ws1UW2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13Emprcod_PARM", GXutil.rtrim( AV13Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV13Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13Emprcod_CTRL", GXutil.rtrim( sCtrlAV13Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Lb_numero_PARM", GXutil.ltrim( localUtil.ntoc( AV6Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6Lb_numero)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Lb_numero_CTRL", GXutil.rtrim( sCtrlAV6Lb_numero));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Lb_opcion_PARM", GXutil.rtrim( AV7Lb_opcion));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7Lb_opcion)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Lb_opcion_CTRL", GXutil.rtrim( sCtrlAV7Lb_opcion));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26Lb_CodGru_PARM", GXutil.rtrim( AV26Lb_CodGru));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV26Lb_CodGru)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26Lb_CodGru_CTRL", GXutil.rtrim( sCtrlAV26Lb_CodGru));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV49Tipo_p_PARM", GXutil.rtrim( AV49Tipo_p));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV49Tipo_p)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV49Tipo_p_CTRL", GXutil.rtrim( sCtrlAV49Tipo_p));
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
      we1UW2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115554648", true, true);
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
      httpContext.AddJavascriptSource("gestionlaboratorio/entradaensayolaboratorio_productos_wc.js", "?202682115554649", false, true);
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

   public void subsflControlProps_332( )
   {
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_33_idx );
      edtLb_LinGru_Internalname = sPrefix+"LB_LINGRU_"+sGXsfl_33_idx ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_33_idx ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM_"+sGXsfl_33_idx ;
      edtValCod_Internalname = sPrefix+"VALCOD_"+sGXsfl_33_idx ;
   }

   public void subsflControlProps_fel_332( )
   {
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_33_fel_idx );
      edtLb_LinGru_Internalname = sPrefix+"LB_LINGRU_"+sGXsfl_33_fel_idx ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_33_fel_idx ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM_"+sGXsfl_33_fel_idx ;
      edtValCod_Internalname = sPrefix+"VALCOD_"+sGXsfl_33_fel_idx ;
   }

   public void sendrow_332( )
   {
      subsflControlProps_332( ) ;
      wb1UW0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_33_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_33_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_33_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 34,'"+sPrefix+"',false,'"+sGXsfl_33_idx+"',33)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vSELECCIONAR_" + sGXsfl_33_idx ;
         chkavSeleccionar.setName( GXCCtl );
         chkavSeleccionar.setWebtags( "" );
         chkavSeleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_33_Refreshing);
         chkavSeleccionar.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSeleccionar.getInternalname(),GXutil.booltostr( AV35Seleccionar),"","",Integer.valueOf(-1),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,34);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_LinGru_Internalname,GXutil.ltrim( localUtil.ntoc( A5615Lb_LinGru, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5615Lb_LinGru), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_LinGru_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtValCod_Internalname,GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A856ValCod), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtValCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1UW2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_33_idx = ((subGrid_Islastpage==1)&&(nGXsfl_33_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_33_idx+1) ;
         sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_332( ) ;
      }
      /* End function sendrow_332 */
   }

   public void startgridcontrol33( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"33\">") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Validez", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.booltostr( AV35Seleccionar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5615Lb_LinGru, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")));
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
      edtavTxttipo_Internalname = sPrefix+"vTXTTIPO" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      bttBtnconfirmar_Internalname = sPrefix+"BTNCONFIRMAR" ;
      bttBtncancelar_Internalname = sPrefix+"BTNCANCELAR" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR" );
      edtLb_LinGru_Internalname = sPrefix+"LB_LINGRU" ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM" ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM" ;
      edtValCod_Internalname = sPrefix+"VALCOD" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
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
      edtValCod_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtLb_LinGru_Jsonclick = "" ;
      chkavSeleccionar.setCaption( "" );
      chkavSeleccionar.setVisible( -1 );
      chkavSeleccionar.setEnabled( 1 );
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divUnnamedtable3_Height = 0 ;
      edtavTxttipo_Jsonclick = "" ;
      edtavTxttipo_Enabled = 1 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Dvelop_confirmpanel_confirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar_Confirmationtext = "¿Confirma?" ;
      Dvelop_confirmpanel_confirmar_Title = "" ;
      Ddo_grid_Datalistproc = "GestionLaboratorio.EntradaEnsayoLaboratorio_Productos_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|" ;
      Ddo_grid_Includedatalist = "|T|T|" ;
      Ddo_grid_Filterisrange = "T|||T" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4" ;
      Ddo_grid_Columnids = "1:Lb_LinGru|2:PrdNum|3:PrdNom|4:ValCod" ;
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
      GXCCtl = "vSELECCIONAR_" + sGXsfl_33_idx ;
      chkavSeleccionar.setName( GXCCtl );
      chkavSeleccionar.setWebtags( "" );
      chkavSeleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_33_Refreshing);
      chkavSeleccionar.setCheckedValue( "false" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV8Col_Lb_LinGru',fld:'vCOL_LB_LINGRU',pic:''},{av:'AV54Col_Prdnum',fld:'vCOL_PRDNUM',pic:''},{av:'sPrefix'},{av:'AV41TFLb_LinGru',fld:'vTFLB_LINGRU',pic:'ZZZ9'},{av:'AV42TFLb_LinGru_To',fld:'vTFLB_LINGRU_TO',pic:'ZZZ9'},{av:'AV45TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV46TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV43TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV44TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV47TFValCod',fld:'vTFVALCOD',pic:'9'},{av:'AV48TFValCod_To',fld:'vTFVALCOD_TO',pic:'9'},{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV7Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV26Lb_CodGru',fld:'vLB_CODGRU',pic:''},{av:'AV49Tipo_p',fld:'vTIPO_P',pic:''},{av:'AV62Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e121UW2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV26Lb_CodGru',fld:'vLB_CODGRU',pic:''},{av:'AV41TFLb_LinGru',fld:'vTFLB_LINGRU',pic:'ZZZ9'},{av:'AV42TFLb_LinGru_To',fld:'vTFLB_LINGRU_TO',pic:'ZZZ9'},{av:'AV45TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV46TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV43TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV44TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV47TFValCod',fld:'vTFVALCOD',pic:'9'},{av:'AV48TFValCod_To',fld:'vTFVALCOD_TO',pic:'9'},{av:'AV62Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV6Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV7Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV49Tipo_p',fld:'vTIPO_P',pic:''},{av:'AV8Col_Lb_LinGru',fld:'vCOL_LB_LINGRU',pic:''},{av:'AV54Col_Prdnum',fld:'vCOL_PRDNUM',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV41TFLb_LinGru',fld:'vTFLB_LINGRU',pic:'ZZZ9'},{av:'AV42TFLb_LinGru_To',fld:'vTFLB_LINGRU_TO',pic:'ZZZ9'},{av:'AV45TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV46TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV43TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV44TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV47TFValCod',fld:'vTFVALCOD',pic:'9'},{av:'AV48TFValCod_To',fld:'vTFVALCOD_TO',pic:'9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e171UW2',iparms:[{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A5615Lb_LinGru',fld:'LB_LINGRU',pic:'ZZZ9',hsh:true},{av:'AV8Col_Lb_LinGru',fld:'vCOL_LB_LINGRU',pic:''},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true},{av:'AV54Col_Prdnum',fld:'vCOL_PRDNUM',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV8Col_Lb_LinGru',fld:'vCOL_LB_LINGRU',pic:''},{av:'AV54Col_Prdnum',fld:'vCOL_PRDNUM',pic:''},{av:'AV35Seleccionar',fld:'vSELECCIONAR',pic:''}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e111UW1',iparms:[{av:'AV8Col_Lb_LinGru',fld:'vCOL_LB_LINGRU',pic:''},{av:'AV54Col_Prdnum',fld:'vCOL_PRDNUM',pic:''},{av:'AV49Tipo_p',fld:'vTIPO_P',pic:''},{av:'Gx_msg',fld:'vMSG',pic:''}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'Gx_msg',fld:'vMSG',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE","{handler:'e131UW2',iparms:[{av:'Dvelop_confirmpanel_confirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Result'},{av:'AV8Col_Lb_LinGru',fld:'vCOL_LB_LINGRU',pic:''},{av:'AV54Col_Prdnum',fld:'vCOL_PRDNUM',pic:''},{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV7Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV49Tipo_p',fld:'vTIPO_P',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE",",oparms:[{av:'AV49Tipo_p',fld:'vTIPO_P',pic:''},{av:'AV7Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV6Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCANCELAR'","{handler:'e141UW2',iparms:[]");
      setEventMetadata("'DOCANCELAR'",",oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV8Col_Lb_LinGru',fld:'vCOL_LB_LINGRU',pic:''},{av:'AV54Col_Prdnum',fld:'vCOL_PRDNUM',pic:''},{av:'sPrefix'},{av:'AV41TFLb_LinGru',fld:'vTFLB_LINGRU',pic:'ZZZ9'},{av:'AV42TFLb_LinGru_To',fld:'vTFLB_LINGRU_TO',pic:'ZZZ9'},{av:'AV45TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV46TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV43TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV44TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV47TFValCod',fld:'vTFVALCOD',pic:'9'},{av:'AV48TFValCod_To',fld:'vTFVALCOD_TO',pic:'9'},{av:'AV62Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV7Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV26Lb_CodGru',fld:'vLB_CODGRU',pic:''},{av:'AV49Tipo_p',fld:'vTIPO_P',pic:''}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV8Col_Lb_LinGru',fld:'vCOL_LB_LINGRU',pic:''},{av:'AV54Col_Prdnum',fld:'vCOL_PRDNUM',pic:''},{av:'sPrefix'},{av:'AV41TFLb_LinGru',fld:'vTFLB_LINGRU',pic:'ZZZ9'},{av:'AV42TFLb_LinGru_To',fld:'vTFLB_LINGRU_TO',pic:'ZZZ9'},{av:'AV45TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV46TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV43TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV44TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV47TFValCod',fld:'vTFVALCOD',pic:'9'},{av:'AV48TFValCod_To',fld:'vTFVALCOD_TO',pic:'9'},{av:'AV62Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV7Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV26Lb_CodGru',fld:'vLB_CODGRU',pic:''},{av:'AV49Tipo_p',fld:'vTIPO_P',pic:''}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV8Col_Lb_LinGru',fld:'vCOL_LB_LINGRU',pic:''},{av:'AV54Col_Prdnum',fld:'vCOL_PRDNUM',pic:''},{av:'sPrefix'},{av:'AV41TFLb_LinGru',fld:'vTFLB_LINGRU',pic:'ZZZ9'},{av:'AV42TFLb_LinGru_To',fld:'vTFLB_LINGRU_TO',pic:'ZZZ9'},{av:'AV45TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV46TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV43TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV44TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV47TFValCod',fld:'vTFVALCOD',pic:'9'},{av:'AV48TFValCod_To',fld:'vTFVALCOD_TO',pic:'9'},{av:'AV62Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV7Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV26Lb_CodGru',fld:'vLB_CODGRU',pic:''},{av:'AV49Tipo_p',fld:'vTIPO_P',pic:''}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV8Col_Lb_LinGru',fld:'vCOL_LB_LINGRU',pic:''},{av:'AV54Col_Prdnum',fld:'vCOL_PRDNUM',pic:''},{av:'sPrefix'},{av:'AV41TFLb_LinGru',fld:'vTFLB_LINGRU',pic:'ZZZ9'},{av:'AV42TFLb_LinGru_To',fld:'vTFLB_LINGRU_TO',pic:'ZZZ9'},{av:'AV45TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV46TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV43TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV44TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV47TFValCod',fld:'vTFVALCOD',pic:'9'},{av:'AV48TFValCod_To',fld:'vTFVALCOD_TO',pic:'9'},{av:'AV62Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV13Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV7Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV26Lb_CodGru',fld:'vLB_CODGRU',pic:''},{av:'AV49Tipo_p',fld:'vTIPO_P',pic:''}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Valcod',iparms:[]");
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
      wcpOAV13Emprcod = "" ;
      wcpOAV7Lb_opcion = "" ;
      wcpOAV26Lb_CodGru = "" ;
      wcpOAV49Tipo_p = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Dvelop_confirmpanel_confirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV13Emprcod = "" ;
      AV7Lb_opcion = "" ;
      AV26Lb_CodGru = "" ;
      AV49Tipo_p = "" ;
      AV45TFPrdNum = "" ;
      AV46TFPrdNum_Sel = "" ;
      AV43TFPrdNom = "" ;
      AV44TFPrdNom_Sel = "" ;
      AV62Pgmname = "" ;
      AV8Col_Lb_LinGru = new GXSimpleCollection<Short>(Short.class, "internal", "");
      AV54Col_Prdnum = new GXSimpleCollection<String>(String.class, "internal", "");
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV12DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Gx_msg = "" ;
      AV55prdnum = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      TempTags = "" ;
      AV56txtTipo = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncancelar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV65Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum = "" ;
      AV66Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel = "" ;
      AV67Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom = "" ;
      AV68Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV65Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum = "" ;
      lV67Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom = "" ;
      A396EmprCod = "" ;
      A5612Lb_CodGru = "" ;
      H01UW2_A396EmprCod = new String[] {""} ;
      H01UW2_A5612Lb_CodGru = new String[] {""} ;
      H01UW2_A856ValCod = new byte[1] ;
      H01UW2_A718PrdNom = new String[] {""} ;
      H01UW2_A719PrdNum = new String[] {""} ;
      H01UW2_A5615Lb_LinGru = new short[1] ;
      H01UW3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV57Station = "" ;
      AV58EmprNom = "" ;
      AV59UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV53WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      GXv_int8 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int10 = new short[1] ;
      AV36Session = httpContext.getWebSession();
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char11 = "" ;
      GXv_char9 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_SdtWWPGridState12 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV50TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV23HTTPRequest = httpContext.getHttpRequest();
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV13Emprcod = "" ;
      sCtrlAV6Lb_numero = "" ;
      sCtrlAV7Lb_opcion = "" ;
      sCtrlAV26Lb_CodGru = "" ;
      sCtrlAV49Tipo_p = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.entradaensayolaboratorio_productos_wc__default(),
         new Object[] {
             new Object[] {
            H01UW2_A396EmprCod, H01UW2_A5612Lb_CodGru, H01UW2_A856ValCod, H01UW2_A718PrdNom, H01UW2_A719PrdNum, H01UW2_A5615Lb_LinGru
            }
            , new Object[] {
            H01UW3_AGRID_nRecordCount
            }
         }
      );
      AV62Pgmname = "GestionLaboratorio.EntradaEnsayoLaboratorio_Productos_WC" ;
      /* GeneXus formulas. */
      AV62Pgmname = "GestionLaboratorio.EntradaEnsayoLaboratorio_Productos_WC" ;
      Gx_err = (short)(0) ;
      edtavTxttipo_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV47TFValCod ;
   private byte AV48TFValCod_To ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte AV69Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_7_tfvalcod ;
   private byte AV70Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_8_tfvalcod_to ;
   private byte A856ValCod ;
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
   private short AV41TFLb_LinGru ;
   private short AV42TFLb_LinGru_To ;
   private short AV31OrderedBy ;
   private short AV24i ;
   private short AV16F_error ;
   private short wbEnd ;
   private short wbStart ;
   private short AV63Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_1_tflb_lingru ;
   private short AV64Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_2_tflb_lingru_to ;
   private short A5615Lb_LinGru ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV27Linea_p ;
   private short AV5Lb_LinGru ;
   private short GXv_int10[] ;
   private int wcpOAV6Lb_numero ;
   private int nRC_GXsfl_33 ;
   private int AV6Lb_numero ;
   private int subGrid_Rows ;
   private int nGXsfl_33_idx=1 ;
   private int edtavTxttipo_Enabled ;
   private int divUnnamedtable3_Height ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int GXv_int8[] ;
   private int AV72GXV1 ;
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
   private String wcpOAV13Emprcod ;
   private String wcpOAV7Lb_opcion ;
   private String wcpOAV26Lb_CodGru ;
   private String wcpOAV49Tipo_p ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Dvelop_confirmpanel_confirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV13Emprcod ;
   private String AV7Lb_opcion ;
   private String AV26Lb_CodGru ;
   private String AV49Tipo_p ;
   private String sGXsfl_33_idx="0001" ;
   private String AV45TFPrdNum ;
   private String AV46TFPrdNum_Sel ;
   private String AV43TFPrdNom ;
   private String AV44TFPrdNom_Sel ;
   private String AV62Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Gx_msg ;
   private String AV55prdnum ;
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
   private String Dvelop_confirmpanel_confirmar_Title ;
   private String Dvelop_confirmpanel_confirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_confirmar_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Infinitescrolling ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavTxttipo_Internalname ;
   private String TempTags ;
   private String AV56txtTipo ;
   private String edtavTxttipo_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncancelar_Internalname ;
   private String bttBtncancelar_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
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
   private String AV65Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum ;
   private String AV66Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel ;
   private String AV67Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom ;
   private String AV68Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel ;
   private String edtLb_LinGru_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Internalname ;
   private String edtValCod_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV65Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum ;
   private String lV67Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom ;
   private String A396EmprCod ;
   private String A5612Lb_CodGru ;
   private String hsh ;
   private String AV57Station ;
   private String AV58EmprNom ;
   private String AV59UsurCod ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXt_char11 ;
   private String GXv_char9[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String tblTabledvelop_confirmpanel_confirmar_Internalname ;
   private String Dvelop_confirmpanel_confirmar_Internalname ;
   private String sCtrlAV13Emprcod ;
   private String sCtrlAV6Lb_numero ;
   private String sCtrlAV7Lb_opcion ;
   private String sCtrlAV26Lb_CodGru ;
   private String sCtrlAV49Tipo_p ;
   private String sGXsfl_33_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtLb_LinGru_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtValCod_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV33OrderedDsc ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean AV35Seleccionar ;
   private boolean bGXsfl_33_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private GXSimpleCollection<Short> AV8Col_Lb_LinGru ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV23HTTPRequest ;
   private com.genexus.webpanels.WebSession AV36Session ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavSeleccionar ;
   private IDataStoreProvider pr_default ;
   private String[] H01UW2_A396EmprCod ;
   private String[] H01UW2_A5612Lb_CodGru ;
   private byte[] H01UW2_A856ValCod ;
   private String[] H01UW2_A718PrdNom ;
   private String[] H01UW2_A719PrdNum ;
   private short[] H01UW2_A5615Lb_LinGru ;
   private long[] H01UW3_AGRID_nRecordCount ;
   private GXSimpleCollection<String> AV54Col_Prdnum ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV12DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState12[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV50TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV53WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class entradaensayolaboratorio_productos_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01UW2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV63Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_1_tflb_lingru ,
                                          short AV64Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_2_tflb_lingru_to ,
                                          String AV66Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel ,
                                          String AV65Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum ,
                                          String AV68Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel ,
                                          String AV67Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom ,
                                          byte AV69Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_7_tfvalcod ,
                                          byte AV70Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_8_tfvalcod_to ,
                                          short A5615Lb_LinGru ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          byte A856ValCod ,
                                          short AV31OrderedBy ,
                                          boolean AV33OrderedDsc ,
                                          String AV13Emprcod ,
                                          String AV26Lb_CodGru ,
                                          String A396EmprCod ,
                                          String A5612Lb_CodGru )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[15];
      Object[] GXv_Object14 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " /*+ FIRST_ROWS(51) */ T1.EmprCod, T1.Lb_CodGru, T2.ValCod, T2.PrdNom, T1.PrdNum, T1.Lb_LinGru" ;
      sFromString = " FROM (TXPENSPR1 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.Lb_CodGru = ?)");
      if ( ! (0==AV63Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_1_tflb_lingru) )
      {
         addWhere(sWhereString, "(T1.Lb_LinGru >= ?)");
      }
      else
      {
         GXv_int13[2] = (byte)(1) ;
      }
      if ( ! (0==AV64Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_2_tflb_lingru_to) )
      {
         addWhere(sWhereString, "(T1.Lb_LinGru <= ?)");
      }
      else
      {
         GXv_int13[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV65Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int13[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV67Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int13[7] = (byte)(1) ;
      }
      if ( ! (0==AV69Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_7_tfvalcod) )
      {
         addWhere(sWhereString, "(T2.ValCod >= ?)");
      }
      else
      {
         GXv_int13[8] = (byte)(1) ;
      }
      if ( ! (0==AV70Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_8_tfvalcod_to) )
      {
         addWhere(sWhereString, "(T2.ValCod <= ?)");
      }
      else
      {
         GXv_int13[9] = (byte)(1) ;
      }
      if ( ( AV31OrderedBy == 1 ) && ! AV33OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Lb_LinGru" ;
      }
      else if ( ( AV31OrderedBy == 1 ) && ( AV33OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Lb_LinGru DESC" ;
      }
      else if ( ( AV31OrderedBy == 2 ) && ! AV33OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV31OrderedBy == 2 ) && ( AV33OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV31OrderedBy == 3 ) && ! AV33OrderedDsc )
      {
         sOrderString += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV31OrderedBy == 3 ) && ( AV33OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV31OrderedBy == 4 ) && ! AV33OrderedDsc )
      {
         sOrderString += " ORDER BY T2.ValCod" ;
      }
      else if ( ( AV31OrderedBy == 4 ) && ( AV33OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.ValCod DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.Lb_CodGru, T1.Lb_LinGru" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
   }

   protected Object[] conditional_H01UW3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV63Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_1_tflb_lingru ,
                                          short AV64Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_2_tflb_lingru_to ,
                                          String AV66Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel ,
                                          String AV65Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum ,
                                          String AV68Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel ,
                                          String AV67Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom ,
                                          byte AV69Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_7_tfvalcod ,
                                          byte AV70Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_8_tfvalcod_to ,
                                          short A5615Lb_LinGru ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          byte A856ValCod ,
                                          short AV31OrderedBy ,
                                          boolean AV33OrderedDsc ,
                                          String AV13Emprcod ,
                                          String AV26Lb_CodGru ,
                                          String A396EmprCod ,
                                          String A5612Lb_CodGru )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[10];
      Object[] GXv_Object16 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPENSPR1 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.Lb_CodGru = ?)");
      if ( ! (0==AV63Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_1_tflb_lingru) )
      {
         addWhere(sWhereString, "(T1.Lb_LinGru >= ?)");
      }
      else
      {
         GXv_int15[2] = (byte)(1) ;
      }
      if ( ! (0==AV64Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_2_tflb_lingru_to) )
      {
         addWhere(sWhereString, "(T1.Lb_LinGru <= ?)");
      }
      else
      {
         GXv_int15[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV65Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int15[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV67Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int15[7] = (byte)(1) ;
      }
      if ( ! (0==AV69Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_7_tfvalcod) )
      {
         addWhere(sWhereString, "(T2.ValCod >= ?)");
      }
      else
      {
         GXv_int15[8] = (byte)(1) ;
      }
      if ( ! (0==AV70Gestionlaboratorio_entradaensayolaboratorio_productos_wcds_8_tfvalcod_to) )
      {
         addWhere(sWhereString, "(T2.ValCod <= ?)");
      }
      else
      {
         GXv_int15[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV31OrderedBy == 1 ) && ! AV33OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 1 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 2 ) && ! AV33OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 2 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 3 ) && ! AV33OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 3 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 4 ) && ! AV33OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 4 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
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
                  return conditional_H01UW2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).shortValue() , ((Boolean) dynConstraints[13]).booleanValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] );
            case 1 :
                  return conditional_H01UW3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).shortValue() , ((Boolean) dynConstraints[13]).booleanValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01UW2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01UW3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
                  stmt.setString(sIdx, (String)parms[15], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[17]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[12]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[13]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[18]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[19]).byteValue());
               }
               return;
      }
   }

}

