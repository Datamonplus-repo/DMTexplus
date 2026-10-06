package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ensayospendientesenvio_wc_impl extends GXWebComponent
{
   public ensayospendientesenvio_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ensayospendientesenvio_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ensayospendientesenvio_wc_impl.class ));
   }

   public ensayospendientesenvio_wc_impl( int remoteHandle ,
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
            gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
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
               AV56emprcod = httpContext.GetPar( "emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56emprcod", AV56emprcod);
               AV57Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57Clicod), 6, 0));
               AV58lb_fechaefrom = localUtil.parseDateParm( httpContext.GetPar( "lb_fechaefrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58lb_fechaefrom", localUtil.format(AV58lb_fechaefrom, "99/99/99"));
               AV59lb_fechaeto = localUtil.parseDateParm( httpContext.GetPar( "lb_fechaeto")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59lb_fechaeto", localUtil.format(AV59lb_fechaeto, "99/99/99"));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV56emprcod,Integer.valueOf(AV57Clicod),AV58lb_fechaefrom,AV59lb_fechaeto});
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
               gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
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
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV56emprcod = httpContext.GetPar( "emprcod") ;
      AV57Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
      AV58lb_fechaefrom = localUtil.parseDateParm( httpContext.GetPar( "lb_fechaefrom")) ;
      AV59lb_fechaeto = localUtil.parseDateParm( httpContext.GetPar( "lb_fechaeto")) ;
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV26TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV27TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV28TFLb_numero = (int)(GXutil.lval( httpContext.GetPar( "TFLb_numero"))) ;
      AV29TFLb_numero_To = (int)(GXutil.lval( httpContext.GetPar( "TFLb_numero_To"))) ;
      AV30TFLb_Cartaz = httpContext.GetPar( "TFLb_Cartaz") ;
      AV31TFLb_Cartaz_Sel = httpContext.GetPar( "TFLb_Cartaz_Sel") ;
      AV32TFLb_cartazf = localUtil.parseDateParm( httpContext.GetPar( "TFLb_cartazf")) ;
      AV36TFLb_ArtCod = httpContext.GetPar( "TFLb_ArtCod") ;
      AV37TFLb_ArtCod_Sel = httpContext.GetPar( "TFLb_ArtCod_Sel") ;
      AV38TFLb_ArtDsc = httpContext.GetPar( "TFLb_ArtDsc") ;
      AV39TFLb_ArtDsc_Sel = httpContext.GetPar( "TFLb_ArtDsc_Sel") ;
      AV40TFLb_ColNomC = httpContext.GetPar( "TFLb_ColNomC") ;
      AV41TFLb_ColNomC_Sel = httpContext.GetPar( "TFLb_ColNomC_Sel") ;
      AV42TFLb_ColNom = httpContext.GetPar( "TFLb_ColNom") ;
      AV43TFLb_ColNom_Sel = httpContext.GetPar( "TFLb_ColNom_Sel") ;
      AV44TFLb_ColNum = (int)(GXutil.lval( httpContext.GetPar( "TFLb_ColNum"))) ;
      AV45TFLb_ColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFLb_ColNum_To"))) ;
      AV46TFLb_FechaE = localUtil.parseDateParm( httpContext.GetPar( "TFLb_FechaE")) ;
      AV61TFLb_Tipo = httpContext.GetPar( "TFLb_Tipo") ;
      AV62TFLb_Tipo_Sel = httpContext.GetPar( "TFLb_Tipo_Sel") ;
      AV65Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      Gx_date = localUtil.parseDateParm( httpContext.GetPar( "Gx_date")) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV56emprcod, AV57Clicod, AV58lb_fechaefrom, AV59lb_fechaeto, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFCliNom, AV27TFCliNom_Sel, AV28TFLb_numero, AV29TFLb_numero_To, AV30TFLb_Cartaz, AV31TFLb_Cartaz_Sel, AV32TFLb_cartazf, AV36TFLb_ArtCod, AV37TFLb_ArtCod_Sel, AV38TFLb_ArtDsc, AV39TFLb_ArtDsc_Sel, AV40TFLb_ColNomC, AV41TFLb_ColNomC_Sel, AV42TFLb_ColNom, AV43TFLb_ColNom_Sel, AV44TFLb_ColNum, AV45TFLb_ColNum_To, AV46TFLb_FechaE, AV61TFLb_Tipo, AV62TFLb_Tipo_Sel, AV65Pgmname, AV12OrderedBy, AV13OrderedDsc, Gx_date, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1UY2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Ensayos Pendientes Envio", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.gestionlaboratorio.ensayospendientesenvio_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV56emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV57Clicod,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV58lb_fechaefrom)),GXutil.URLEncode(GXutil.formatDateParm(AV59lb_fechaeto))}, new String[] {"emprcod","Clicod","lb_fechaefrom","lb_fechaeto"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTODAY", getSecureSignedToken( sPrefix, Gx_date));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"EnsayosPendientesEnvio_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV65Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\ensayospendientesenvio_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV15FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_41", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_41, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV52GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV53GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV50DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV50DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV56emprcod", GXutil.rtrim( wcpOAV56emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV57Clicod", GXutil.ltrim( localUtil.ntoc( wcpOAV57Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV58lb_fechaefrom", localUtil.dtoc( wcpOAV58lb_fechaefrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV59lb_fechaeto", localUtil.dtoc( wcpOAV59lb_fechaeto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV25ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM", GXutil.rtrim( AV26TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM_SEL", GXutil.rtrim( AV27TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_NUMERO", GXutil.ltrim( localUtil.ntoc( AV28TFLb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_NUMERO_TO", GXutil.ltrim( localUtil.ntoc( AV29TFLb_numero_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_CARTAZ", GXutil.rtrim( AV30TFLb_Cartaz));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_CARTAZ_SEL", GXutil.rtrim( AV31TFLb_Cartaz_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_CARTAZF", localUtil.dtoc( AV32TFLb_cartazf, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_ARTCOD", GXutil.rtrim( AV36TFLb_ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_ARTCOD_SEL", GXutil.rtrim( AV37TFLb_ArtCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_ARTDSC", GXutil.rtrim( AV38TFLb_ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_ARTDSC_SEL", GXutil.rtrim( AV39TFLb_ArtDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COLNOMC", GXutil.rtrim( AV40TFLb_ColNomC));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COLNOMC_SEL", GXutil.rtrim( AV41TFLb_ColNomC_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COLNOM", GXutil.rtrim( AV42TFLb_ColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COLNOM_SEL", GXutil.rtrim( AV43TFLb_ColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COLNUM", GXutil.ltrim( localUtil.ntoc( AV44TFLb_ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_COLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV45TFLb_ColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_FECHAE", localUtil.dtoc( AV46TFLb_FechaE, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_TIPO", GXutil.rtrim( AV61TFLb_Tipo));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFLB_TIPO_SEL", GXutil.rtrim( AV62TFLb_Tipo_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV56emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV57Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_FECHAEFROM", localUtil.dtoc( AV58lb_fechaefrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_FECHAETO", localUtil.dtoc( AV59lb_fechaeto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTODAY", getSecureSignedToken( sPrefix, Gx_date));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm1UY2( )
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
      return "GestionLaboratorio.EnsayosPendientesEnvio_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Ensayos Pendientes Envio", "") ;
   }

   public void wb1UY0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.gestionlaboratorio.ensayospendientesenvio_wc");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EnsayosPendientesEnvio_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EnsayosPendientesEnvio_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EnsayosPendientesEnvio_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_1UY2( true) ;
      }
      else
      {
         wb_table1_23_1UY2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_1UY2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV52GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV53GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV65Pgmname), GXutil.rtrim( localUtil.format( AV65Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EnsayosPendientesEnvio_WC.htm");
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
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV50DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV50DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lb_cartazfauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lb_cartazfauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lb_cartazfauxdate_Internalname, localUtil.format(AV34DDO_Lb_cartazfAuxDate, "99/99/99"), localUtil.format( AV34DDO_Lb_cartazfAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,69);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lb_cartazfauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EnsayosPendientesEnvio_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lb_cartazfauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\EnsayosPendientesEnvio_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lb_fechaeauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lb_fechaeauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lb_fechaeauxdate_Internalname, localUtil.format(AV48DDO_Lb_FechaEAuxDate, "99/99/99"), localUtil.format( AV48DDO_Lb_FechaEAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,71);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lb_fechaeauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EnsayosPendientesEnvio_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lb_fechaeauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_GestionLaboratorio\\EnsayosPendientesEnvio_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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

   public void start1UY2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Ensayos Pendientes Envio", ""), (short)(0)) ;
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
            strup1UY0( ) ;
         }
      }
   }

   public void ws1UY2( )
   {
      start1UY2( ) ;
      evt1UY2( ) ;
   }

   public void evt1UY2( )
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
                              strup1UY0( ) ;
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
                              strup1UY0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111UY2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1UY0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121UY2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1UY0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131UY2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1UY0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141UY2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1UY0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151UY2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1UY0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e161UY2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1UY0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e171UY2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1UY0( ) ;
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
                              strup1UY0( ) ;
                           }
                           nGXsfl_41_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_412( ) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A5532Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5540Lb_Cartaz = httpContext.cgiGet( edtLb_Cartaz_Internalname) ;
                           A5594Lb_cartazf = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_cartazf_Internalname), 0)) ;
                           A5533Lb_ArtCod = httpContext.cgiGet( edtLb_ArtCod_Internalname) ;
                           A5534Lb_ArtDsc = httpContext.cgiGet( edtLb_ArtDsc_Internalname) ;
                           A5538Lb_ColNomC = httpContext.cgiGet( edtLb_ColNomC_Internalname) ;
                           A5536Lb_ColNom = httpContext.cgiGet( edtLb_ColNom_Internalname) ;
                           A5537Lb_ColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_ColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5541Lb_FechaE = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLb_FechaE_Internalname), 0)) ;
                           A5570Lb_Tipo = httpContext.cgiGet( edtLb_Tipo_Internalname) ;
                           AV60Dias = (short)(localUtil.ctol( httpContext.cgiGet( edtavDias_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDias_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60Dias), 4, 0));
                           A14098Lb_Enviado = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_Enviado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
                                       e181UY2 ();
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
                                       e191UY2 ();
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
                                       e201UY2 ();
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
                                          /* Set Refresh If Filterfulltext Changed */
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
                                          {
                                             Rfr0gs = true ;
                                          }
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
                                    strup1UY0( ) ;
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

   public void we1UY2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1UY2( ) ;
         }
      }
   }

   public void pa1UY2( )
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
                                 String AV15FilterFullText ,
                                 String AV56emprcod ,
                                 int AV57Clicod ,
                                 java.util.Date AV58lb_fechaefrom ,
                                 java.util.Date AV59lb_fechaeto ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV26TFCliNom ,
                                 String AV27TFCliNom_Sel ,
                                 int AV28TFLb_numero ,
                                 int AV29TFLb_numero_To ,
                                 String AV30TFLb_Cartaz ,
                                 String AV31TFLb_Cartaz_Sel ,
                                 java.util.Date AV32TFLb_cartazf ,
                                 String AV36TFLb_ArtCod ,
                                 String AV37TFLb_ArtCod_Sel ,
                                 String AV38TFLb_ArtDsc ,
                                 String AV39TFLb_ArtDsc_Sel ,
                                 String AV40TFLb_ColNomC ,
                                 String AV41TFLb_ColNomC_Sel ,
                                 String AV42TFLb_ColNom ,
                                 String AV43TFLb_ColNom_Sel ,
                                 int AV44TFLb_ColNum ,
                                 int AV45TFLb_ColNum_To ,
                                 java.util.Date AV46TFLb_FechaE ,
                                 String AV61TFLb_Tipo ,
                                 String AV62TFLb_Tipo_Sel ,
                                 String AV65Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 java.util.Date Gx_date ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e191UY2 ();
      GRID_nCurrentRecord = 0 ;
      rf1UY2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"EnsayosPendientesEnvio_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV65Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\ensayospendientesenvio_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf1UY2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV65Pgmname = "GestionLaboratorio.EnsayosPendientesEnvio_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Pgmname", AV65Pgmname);
      Gx_err = (short)(0) ;
      edtavDias_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDias_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDias_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = AV15FilterFullText ;
      AV70Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = AV26TFCliNom ;
      AV71Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel = AV27TFCliNom_Sel ;
      AV72Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero = AV28TFLb_numero ;
      AV73Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to = AV29TFLb_numero_To ;
      AV74Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = AV30TFLb_Cartaz ;
      AV75Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel = AV31TFLb_Cartaz_Sel ;
      AV76Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf = AV32TFLb_cartazf ;
      AV77Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = AV36TFLb_ArtCod ;
      AV78Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel = AV37TFLb_ArtCod_Sel ;
      AV79Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = AV38TFLb_ArtDsc ;
      AV80Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel = AV39TFLb_ArtDsc_Sel ;
      AV81Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = AV40TFLb_ColNomC ;
      AV82Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel = AV41TFLb_ColNomC_Sel ;
      AV83Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = AV42TFLb_ColNom ;
      AV84Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel = AV43TFLb_ColNom_Sel ;
      AV85Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum = AV44TFLb_ColNum ;
      AV86Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to = AV45TFLb_ColNum_To ;
      AV87Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae = AV46TFLb_FechaE ;
      AV88Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = AV61TFLb_Tipo ;
      AV89Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel = AV62TFLb_Tipo_Sel ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext ,
                                           AV71Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel ,
                                           AV70Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom ,
                                           Integer.valueOf(AV72Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero) ,
                                           Integer.valueOf(AV73Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to) ,
                                           AV75Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel ,
                                           AV74Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz ,
                                           AV76Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf ,
                                           AV78Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel ,
                                           AV77Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod ,
                                           AV80Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel ,
                                           AV79Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc ,
                                           AV82Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel ,
                                           AV81Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc ,
                                           AV84Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel ,
                                           AV83Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom ,
                                           Integer.valueOf(AV85Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum) ,
                                           Integer.valueOf(AV86Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to) ,
                                           AV87Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae ,
                                           AV89Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel ,
                                           AV88Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo ,
                                           Integer.valueOf(AV57Clicod) ,
                                           AV58lb_fechaefrom ,
                                           AV59lb_fechaeto ,
                                           A279CliNom ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5540Lb_Cartaz ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5538Lb_ColNomC ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           A5570Lb_Tipo ,
                                           A5594Lb_cartazf ,
                                           A5541Lb_FechaE ,
                                           Integer.valueOf(A252CliCod) ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           Byte.valueOf(A14098Lb_Enviado) ,
                                           AV56emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
      lV70Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV70Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom), 30, "%") ;
      lV74Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV74Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz), 20, "%") ;
      lV77Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = GXutil.padr( GXutil.rtrim( AV77Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod), 16, "%") ;
      lV79Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV79Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc), 26, "%") ;
      lV81Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV81Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc), 13, "%") ;
      lV83Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = GXutil.padr( GXutil.rtrim( AV83Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom), 13, "%") ;
      lV88Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = GXutil.padr( GXutil.rtrim( AV88Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo), 1, "%") ;
      /* Using cursor H01UY2 */
      pr_default.execute(0, new Object[] {AV56emprcod, lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV70Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom, AV71Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel, Integer.valueOf(AV72Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero), Integer.valueOf(AV73Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to), lV74Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz, AV75Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel, AV76Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf, lV77Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod, AV78Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel, lV79Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc, AV80Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel, lV81Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc, AV82Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel, lV83Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom, AV84Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel, Integer.valueOf(AV85Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum), Integer.valueOf(AV86Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to), AV87Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae, lV88Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo, AV89Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel, Integer.valueOf(AV57Clicod), AV58lb_fechaefrom, AV59lb_fechaeto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = H01UY2_A252CliCod[0] ;
         A5569Lb_EstEns = H01UY2_A5569Lb_EstEns[0] ;
         A5570Lb_Tipo = H01UY2_A5570Lb_Tipo[0] ;
         A5541Lb_FechaE = H01UY2_A5541Lb_FechaE[0] ;
         A5537Lb_ColNum = H01UY2_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = H01UY2_A5536Lb_ColNom[0] ;
         A5538Lb_ColNomC = H01UY2_A5538Lb_ColNomC[0] ;
         A5534Lb_ArtDsc = H01UY2_A5534Lb_ArtDsc[0] ;
         A5533Lb_ArtCod = H01UY2_A5533Lb_ArtCod[0] ;
         A5594Lb_cartazf = H01UY2_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = H01UY2_A5540Lb_Cartaz[0] ;
         A279CliNom = H01UY2_A279CliNom[0] ;
         A5532Lb_numero = H01UY2_A5532Lb_numero[0] ;
         A396EmprCod = H01UY2_A396EmprCod[0] ;
         A279CliNom = H01UY2_A279CliNom[0] ;
         GXt_int1 = A14098Lb_Enviado ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = A5532Lb_numero ;
         GXv_int4[0] = GXt_int1 ;
         new app.gestionlaboratorio.ensayoenviado(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int4) ;
         ensayospendientesenvio_wc_impl.this.A396EmprCod = GXv_char2[0] ;
         ensayospendientesenvio_wc_impl.this.A5532Lb_numero = GXv_int3[0] ;
         ensayospendientesenvio_wc_impl.this.GXt_int1 = GXv_int4[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A14098Lb_Enviado = GXt_int1 ;
         if ( A14098Lb_Enviado == 0 )
         {
            GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rf1UY2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(41) ;
      /* Execute user event: Refresh */
      e191UY2 ();
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
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext ,
                                              AV71Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel ,
                                              AV70Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom ,
                                              Integer.valueOf(AV72Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero) ,
                                              Integer.valueOf(AV73Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to) ,
                                              AV75Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel ,
                                              AV74Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz ,
                                              AV76Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf ,
                                              AV78Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel ,
                                              AV77Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod ,
                                              AV80Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel ,
                                              AV79Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc ,
                                              AV82Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel ,
                                              AV81Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc ,
                                              AV84Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel ,
                                              AV83Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom ,
                                              Integer.valueOf(AV85Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum) ,
                                              Integer.valueOf(AV86Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to) ,
                                              AV87Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae ,
                                              AV89Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel ,
                                              AV88Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo ,
                                              Integer.valueOf(AV57Clicod) ,
                                              AV58lb_fechaefrom ,
                                              AV59lb_fechaeto ,
                                              A279CliNom ,
                                              Integer.valueOf(A5532Lb_numero) ,
                                              A5540Lb_Cartaz ,
                                              A5533Lb_ArtCod ,
                                              A5534Lb_ArtDsc ,
                                              A5538Lb_ColNomC ,
                                              A5536Lb_ColNom ,
                                              Integer.valueOf(A5537Lb_ColNum) ,
                                              A5570Lb_Tipo ,
                                              A5594Lb_cartazf ,
                                              A5541Lb_FechaE ,
                                              Integer.valueOf(A252CliCod) ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              Byte.valueOf(A5569Lb_EstEns) ,
                                              Byte.valueOf(A14098Lb_Enviado) ,
                                              AV56emprcod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
         lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
         lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
         lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
         lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
         lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
         lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
         lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
         lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext), "%", "") ;
         lV70Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV70Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom), 30, "%") ;
         lV74Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV74Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz), 20, "%") ;
         lV77Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = GXutil.padr( GXutil.rtrim( AV77Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod), 16, "%") ;
         lV79Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV79Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc), 26, "%") ;
         lV81Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV81Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc), 13, "%") ;
         lV83Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = GXutil.padr( GXutil.rtrim( AV83Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom), 13, "%") ;
         lV88Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = GXutil.padr( GXutil.rtrim( AV88Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo), 1, "%") ;
         /* Using cursor H01UY3 */
         pr_default.execute(1, new Object[] {AV56emprcod, lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext, lV70Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom, AV71Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel, Integer.valueOf(AV72Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero), Integer.valueOf(AV73Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to), lV74Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz, AV75Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel, AV76Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf, lV77Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod, AV78Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel, lV79Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc, AV80Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel, lV81Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc, AV82Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel, lV83Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom, AV84Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel, Integer.valueOf(AV85Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum), Integer.valueOf(AV86Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to), AV87Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae, lV88Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo, AV89Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel, Integer.valueOf(AV57Clicod), AV58lb_fechaefrom, AV59lb_fechaeto});
         nGXsfl_41_idx = 1 ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A252CliCod = H01UY3_A252CliCod[0] ;
            A5569Lb_EstEns = H01UY3_A5569Lb_EstEns[0] ;
            A5570Lb_Tipo = H01UY3_A5570Lb_Tipo[0] ;
            A5541Lb_FechaE = H01UY3_A5541Lb_FechaE[0] ;
            A5537Lb_ColNum = H01UY3_A5537Lb_ColNum[0] ;
            A5536Lb_ColNom = H01UY3_A5536Lb_ColNom[0] ;
            A5538Lb_ColNomC = H01UY3_A5538Lb_ColNomC[0] ;
            A5534Lb_ArtDsc = H01UY3_A5534Lb_ArtDsc[0] ;
            A5533Lb_ArtCod = H01UY3_A5533Lb_ArtCod[0] ;
            A5594Lb_cartazf = H01UY3_A5594Lb_cartazf[0] ;
            A5540Lb_Cartaz = H01UY3_A5540Lb_Cartaz[0] ;
            A279CliNom = H01UY3_A279CliNom[0] ;
            A5532Lb_numero = H01UY3_A5532Lb_numero[0] ;
            A396EmprCod = H01UY3_A396EmprCod[0] ;
            A279CliNom = H01UY3_A279CliNom[0] ;
            GXt_int1 = A14098Lb_Enviado ;
            GXv_char2[0] = A396EmprCod ;
            GXv_int3[0] = A5532Lb_numero ;
            GXv_int4[0] = GXt_int1 ;
            new app.gestionlaboratorio.ensayoenviado(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int4) ;
            ensayospendientesenvio_wc_impl.this.A396EmprCod = GXv_char2[0] ;
            ensayospendientesenvio_wc_impl.this.A5532Lb_numero = GXv_int3[0] ;
            ensayospendientesenvio_wc_impl.this.GXt_int1 = GXv_int4[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            A14098Lb_Enviado = GXt_int1 ;
            if ( A14098Lb_Enviado == 0 )
            {
               e201UY2 ();
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(41) ;
         wb1UY0( ) ;
      }
      bGXsfl_41_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1UY2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTODAY", getSecureSignedToken( sPrefix, Gx_date));
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
      return (int)(subgridclient_rec_count_fnc()) ;
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
      AV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = AV15FilterFullText ;
      AV70Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = AV26TFCliNom ;
      AV71Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel = AV27TFCliNom_Sel ;
      AV72Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero = AV28TFLb_numero ;
      AV73Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to = AV29TFLb_numero_To ;
      AV74Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = AV30TFLb_Cartaz ;
      AV75Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel = AV31TFLb_Cartaz_Sel ;
      AV76Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf = AV32TFLb_cartazf ;
      AV77Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = AV36TFLb_ArtCod ;
      AV78Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel = AV37TFLb_ArtCod_Sel ;
      AV79Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = AV38TFLb_ArtDsc ;
      AV80Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel = AV39TFLb_ArtDsc_Sel ;
      AV81Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = AV40TFLb_ColNomC ;
      AV82Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel = AV41TFLb_ColNomC_Sel ;
      AV83Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = AV42TFLb_ColNom ;
      AV84Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel = AV43TFLb_ColNom_Sel ;
      AV85Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum = AV44TFLb_ColNum ;
      AV86Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to = AV45TFLb_ColNum_To ;
      AV87Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae = AV46TFLb_FechaE ;
      AV88Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = AV61TFLb_Tipo ;
      AV89Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel = AV62TFLb_Tipo_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV56emprcod, AV57Clicod, AV58lb_fechaefrom, AV59lb_fechaeto, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFCliNom, AV27TFCliNom_Sel, AV28TFLb_numero, AV29TFLb_numero_To, AV30TFLb_Cartaz, AV31TFLb_Cartaz_Sel, AV32TFLb_cartazf, AV36TFLb_ArtCod, AV37TFLb_ArtCod_Sel, AV38TFLb_ArtDsc, AV39TFLb_ArtDsc_Sel, AV40TFLb_ColNomC, AV41TFLb_ColNomC_Sel, AV42TFLb_ColNom, AV43TFLb_ColNom_Sel, AV44TFLb_ColNum, AV45TFLb_ColNum_To, AV46TFLb_FechaE, AV61TFLb_Tipo, AV62TFLb_Tipo_Sel, AV65Pgmname, AV12OrderedBy, AV13OrderedDsc, Gx_date, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = AV15FilterFullText ;
      AV70Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = AV26TFCliNom ;
      AV71Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel = AV27TFCliNom_Sel ;
      AV72Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero = AV28TFLb_numero ;
      AV73Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to = AV29TFLb_numero_To ;
      AV74Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = AV30TFLb_Cartaz ;
      AV75Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel = AV31TFLb_Cartaz_Sel ;
      AV76Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf = AV32TFLb_cartazf ;
      AV77Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = AV36TFLb_ArtCod ;
      AV78Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel = AV37TFLb_ArtCod_Sel ;
      AV79Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = AV38TFLb_ArtDsc ;
      AV80Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel = AV39TFLb_ArtDsc_Sel ;
      AV81Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = AV40TFLb_ColNomC ;
      AV82Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel = AV41TFLb_ColNomC_Sel ;
      AV83Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = AV42TFLb_ColNom ;
      AV84Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel = AV43TFLb_ColNom_Sel ;
      AV85Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum = AV44TFLb_ColNum ;
      AV86Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to = AV45TFLb_ColNum_To ;
      AV87Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae = AV46TFLb_FechaE ;
      AV88Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = AV61TFLb_Tipo ;
      AV89Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel = AV62TFLb_Tipo_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV56emprcod, AV57Clicod, AV58lb_fechaefrom, AV59lb_fechaeto, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFCliNom, AV27TFCliNom_Sel, AV28TFLb_numero, AV29TFLb_numero_To, AV30TFLb_Cartaz, AV31TFLb_Cartaz_Sel, AV32TFLb_cartazf, AV36TFLb_ArtCod, AV37TFLb_ArtCod_Sel, AV38TFLb_ArtDsc, AV39TFLb_ArtDsc_Sel, AV40TFLb_ColNomC, AV41TFLb_ColNomC_Sel, AV42TFLb_ColNom, AV43TFLb_ColNom_Sel, AV44TFLb_ColNum, AV45TFLb_ColNum_To, AV46TFLb_FechaE, AV61TFLb_Tipo, AV62TFLb_Tipo_Sel, AV65Pgmname, AV12OrderedBy, AV13OrderedDsc, Gx_date, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = AV15FilterFullText ;
      AV70Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = AV26TFCliNom ;
      AV71Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel = AV27TFCliNom_Sel ;
      AV72Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero = AV28TFLb_numero ;
      AV73Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to = AV29TFLb_numero_To ;
      AV74Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = AV30TFLb_Cartaz ;
      AV75Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel = AV31TFLb_Cartaz_Sel ;
      AV76Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf = AV32TFLb_cartazf ;
      AV77Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = AV36TFLb_ArtCod ;
      AV78Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel = AV37TFLb_ArtCod_Sel ;
      AV79Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = AV38TFLb_ArtDsc ;
      AV80Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel = AV39TFLb_ArtDsc_Sel ;
      AV81Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = AV40TFLb_ColNomC ;
      AV82Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel = AV41TFLb_ColNomC_Sel ;
      AV83Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = AV42TFLb_ColNom ;
      AV84Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel = AV43TFLb_ColNom_Sel ;
      AV85Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum = AV44TFLb_ColNum ;
      AV86Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to = AV45TFLb_ColNum_To ;
      AV87Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae = AV46TFLb_FechaE ;
      AV88Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = AV61TFLb_Tipo ;
      AV89Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel = AV62TFLb_Tipo_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV56emprcod, AV57Clicod, AV58lb_fechaefrom, AV59lb_fechaeto, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFCliNom, AV27TFCliNom_Sel, AV28TFLb_numero, AV29TFLb_numero_To, AV30TFLb_Cartaz, AV31TFLb_Cartaz_Sel, AV32TFLb_cartazf, AV36TFLb_ArtCod, AV37TFLb_ArtCod_Sel, AV38TFLb_ArtDsc, AV39TFLb_ArtDsc_Sel, AV40TFLb_ColNomC, AV41TFLb_ColNomC_Sel, AV42TFLb_ColNom, AV43TFLb_ColNom_Sel, AV44TFLb_ColNum, AV45TFLb_ColNum_To, AV46TFLb_FechaE, AV61TFLb_Tipo, AV62TFLb_Tipo_Sel, AV65Pgmname, AV12OrderedBy, AV13OrderedDsc, Gx_date, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = AV15FilterFullText ;
      AV70Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = AV26TFCliNom ;
      AV71Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel = AV27TFCliNom_Sel ;
      AV72Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero = AV28TFLb_numero ;
      AV73Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to = AV29TFLb_numero_To ;
      AV74Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = AV30TFLb_Cartaz ;
      AV75Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel = AV31TFLb_Cartaz_Sel ;
      AV76Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf = AV32TFLb_cartazf ;
      AV77Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = AV36TFLb_ArtCod ;
      AV78Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel = AV37TFLb_ArtCod_Sel ;
      AV79Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = AV38TFLb_ArtDsc ;
      AV80Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel = AV39TFLb_ArtDsc_Sel ;
      AV81Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = AV40TFLb_ColNomC ;
      AV82Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel = AV41TFLb_ColNomC_Sel ;
      AV83Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = AV42TFLb_ColNom ;
      AV84Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel = AV43TFLb_ColNom_Sel ;
      AV85Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum = AV44TFLb_ColNum ;
      AV86Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to = AV45TFLb_ColNum_To ;
      AV87Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae = AV46TFLb_FechaE ;
      AV88Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = AV61TFLb_Tipo ;
      AV89Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel = AV62TFLb_Tipo_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV56emprcod, AV57Clicod, AV58lb_fechaefrom, AV59lb_fechaeto, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFCliNom, AV27TFCliNom_Sel, AV28TFLb_numero, AV29TFLb_numero_To, AV30TFLb_Cartaz, AV31TFLb_Cartaz_Sel, AV32TFLb_cartazf, AV36TFLb_ArtCod, AV37TFLb_ArtCod_Sel, AV38TFLb_ArtDsc, AV39TFLb_ArtDsc_Sel, AV40TFLb_ColNomC, AV41TFLb_ColNomC_Sel, AV42TFLb_ColNom, AV43TFLb_ColNom_Sel, AV44TFLb_ColNum, AV45TFLb_ColNum_To, AV46TFLb_FechaE, AV61TFLb_Tipo, AV62TFLb_Tipo_Sel, AV65Pgmname, AV12OrderedBy, AV13OrderedDsc, Gx_date, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = AV15FilterFullText ;
      AV70Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = AV26TFCliNom ;
      AV71Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel = AV27TFCliNom_Sel ;
      AV72Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero = AV28TFLb_numero ;
      AV73Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to = AV29TFLb_numero_To ;
      AV74Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = AV30TFLb_Cartaz ;
      AV75Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel = AV31TFLb_Cartaz_Sel ;
      AV76Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf = AV32TFLb_cartazf ;
      AV77Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = AV36TFLb_ArtCod ;
      AV78Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel = AV37TFLb_ArtCod_Sel ;
      AV79Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = AV38TFLb_ArtDsc ;
      AV80Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel = AV39TFLb_ArtDsc_Sel ;
      AV81Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = AV40TFLb_ColNomC ;
      AV82Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel = AV41TFLb_ColNomC_Sel ;
      AV83Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = AV42TFLb_ColNom ;
      AV84Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel = AV43TFLb_ColNom_Sel ;
      AV85Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum = AV44TFLb_ColNum ;
      AV86Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to = AV45TFLb_ColNum_To ;
      AV87Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae = AV46TFLb_FechaE ;
      AV88Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = AV61TFLb_Tipo ;
      AV89Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel = AV62TFLb_Tipo_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV56emprcod, AV57Clicod, AV58lb_fechaefrom, AV59lb_fechaeto, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFCliNom, AV27TFCliNom_Sel, AV28TFLb_numero, AV29TFLb_numero_To, AV30TFLb_Cartaz, AV31TFLb_Cartaz_Sel, AV32TFLb_cartazf, AV36TFLb_ArtCod, AV37TFLb_ArtCod_Sel, AV38TFLb_ArtDsc, AV39TFLb_ArtDsc_Sel, AV40TFLb_ColNomC, AV41TFLb_ColNomC_Sel, AV42TFLb_ColNom, AV43TFLb_ColNom_Sel, AV44TFLb_ColNum, AV45TFLb_ColNum_To, AV46TFLb_FechaE, AV61TFLb_Tipo, AV62TFLb_Tipo_Sel, AV65Pgmname, AV12OrderedBy, AV13OrderedDsc, Gx_date, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV65Pgmname = "GestionLaboratorio.EnsayosPendientesEnvio_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Pgmname", AV65Pgmname);
      Gx_err = (short)(0) ;
      edtavDias_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDias_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDias_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1UY0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e181UY2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV50DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV52GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV53GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV56emprcod = httpContext.cgiGet( sPrefix+"wcpOAV56emprcod") ;
         wcpOAV57Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV57Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV58lb_fechaefrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV58lb_fechaefrom"), 0) ;
         wcpOAV59lb_fechaeto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV59lb_fechaeto"), 0) ;
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
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( sPrefix+"DDO_GRID_Includesortasc") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( sPrefix+"DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( sPrefix+"DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
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
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read variables values. */
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         AV65Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Pgmname", AV65Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lb_cartazfauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LB_CARTAZFAUXDATE");
            GX_FocusControl = edtavDdo_lb_cartazfauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV34DDO_Lb_cartazfAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34DDO_Lb_cartazfAuxDate", localUtil.format(AV34DDO_Lb_cartazfAuxDate, "99/99/99"));
         }
         else
         {
            AV34DDO_Lb_cartazfAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lb_cartazfauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34DDO_Lb_cartazfAuxDate", localUtil.format(AV34DDO_Lb_cartazfAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lb_fechaeauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LB_FECHAEAUXDATE");
            GX_FocusControl = edtavDdo_lb_fechaeauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV48DDO_Lb_FechaEAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48DDO_Lb_FechaEAuxDate", localUtil.format(AV48DDO_Lb_FechaEAuxDate, "99/99/99"));
         }
         else
         {
            AV48DDO_Lb_FechaEAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lb_fechaeauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48DDO_Lb_FechaEAuxDate", localUtil.format(AV48DDO_Lb_FechaEAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"EnsayosPendientesEnvio_WC");
         AV65Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Pgmname", AV65Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV65Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("gestionlaboratorio\\ensayospendientesenvio_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e181UY2 ();
      if (returnInSub) return;
   }

   public void e181UY2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char5 = AV66Station ;
      GXv_char2[0] = GXt_char5 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      ensayospendientesenvio_wc_impl.this.GXt_char5 = GXv_char2[0] ;
      AV66Station = GXt_char5 ;
      GXv_char2[0] = AV56emprcod ;
      GXv_char6[0] = AV67Emprnom ;
      GXv_char7[0] = AV68Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV66Station, GXv_char2, GXv_char6, GXv_char7) ;
      ensayospendientesenvio_wc_impl.this.AV56emprcod = GXv_char2[0] ;
      ensayospendientesenvio_wc_impl.this.AV67Emprnom = GXv_char6[0] ;
      ensayospendientesenvio_wc_impl.this.AV68Usurcod = GXv_char7[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56emprcod", AV56emprcod);
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
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = AV50DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9[0] ;
      AV50DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e191UY2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext10[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext10) ;
      AV6WWPContext = GXv_SdtWWPContext10[0] ;
      if ( AV25ManageFiltersExecutionStep == 1 )
      {
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV25ManageFiltersExecutionStep == 2 )
      {
         AV25ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV22Session.getValue("GestionLaboratorio.EnsayosPendientesEnvio_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("GestionLaboratorio.EnsayosPendientesEnvio_WCColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtLb_numero_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_numero_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_numero_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtLb_Cartaz_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_Cartaz_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Cartaz_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtLb_cartazf_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_cartazf_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_cartazf_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtLb_ArtCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_ArtCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ArtCod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtLb_ArtDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_ArtDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ArtDsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtLb_ColNomC_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_ColNomC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ColNomC_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtLb_ColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_ColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ColNom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtLb_ColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_ColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_ColNum_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtLb_FechaE_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_FechaE_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_FechaE_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtLb_Tipo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtLb_Tipo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Tipo_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavDias_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDias_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDias_Visible), 5, 0), !bGXsfl_41_Refreshing);
      AV52GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52GridCurrentPage), 10, 0));
      AV53GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53GridPageCount), 10, 0));
      AV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = AV15FilterFullText ;
      AV70Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = AV26TFCliNom ;
      AV71Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel = AV27TFCliNom_Sel ;
      AV72Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero = AV28TFLb_numero ;
      AV73Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to = AV29TFLb_numero_To ;
      AV74Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = AV30TFLb_Cartaz ;
      AV75Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel = AV31TFLb_Cartaz_Sel ;
      AV76Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf = AV32TFLb_cartazf ;
      AV77Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = AV36TFLb_ArtCod ;
      AV78Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel = AV37TFLb_ArtCod_Sel ;
      AV79Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = AV38TFLb_ArtDsc ;
      AV80Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel = AV39TFLb_ArtDsc_Sel ;
      AV81Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = AV40TFLb_ColNomC ;
      AV82Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel = AV41TFLb_ColNomC_Sel ;
      AV83Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = AV42TFLb_ColNom ;
      AV84Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel = AV43TFLb_ColNom_Sel ;
      AV85Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum = AV44TFLb_ColNum ;
      AV86Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to = AV45TFLb_ColNum_To ;
      AV87Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae = AV46TFLb_FechaE ;
      AV88Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = AV61TFLb_Tipo ;
      AV89Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel = AV62TFLb_Tipo_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e121UY2( )
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
         AV51PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV51PageToGo) ;
      }
   }

   public void e131UY2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141UY2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV12OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         AV13OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV26TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFCliNom", AV26TFCliNom);
            AV27TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFCliNom_Sel", AV27TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_numero") == 0 )
         {
            AV28TFLb_numero = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFLb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFLb_numero), 8, 0));
            AV29TFLb_numero_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFLb_numero_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFLb_numero_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_Cartaz") == 0 )
         {
            AV30TFLb_Cartaz = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFLb_Cartaz", AV30TFLb_Cartaz);
            AV31TFLb_Cartaz_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFLb_Cartaz_Sel", AV31TFLb_Cartaz_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_cartazf") == 0 )
         {
            AV32TFLb_cartazf = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFLb_cartazf", localUtil.format(AV32TFLb_cartazf, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ArtCod") == 0 )
         {
            AV36TFLb_ArtCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFLb_ArtCod", AV36TFLb_ArtCod);
            AV37TFLb_ArtCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFLb_ArtCod_Sel", AV37TFLb_ArtCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ArtDsc") == 0 )
         {
            AV38TFLb_ArtDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFLb_ArtDsc", AV38TFLb_ArtDsc);
            AV39TFLb_ArtDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFLb_ArtDsc_Sel", AV39TFLb_ArtDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ColNomC") == 0 )
         {
            AV40TFLb_ColNomC = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFLb_ColNomC", AV40TFLb_ColNomC);
            AV41TFLb_ColNomC_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFLb_ColNomC_Sel", AV41TFLb_ColNomC_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ColNom") == 0 )
         {
            AV42TFLb_ColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFLb_ColNom", AV42TFLb_ColNom);
            AV43TFLb_ColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFLb_ColNom_Sel", AV43TFLb_ColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_ColNum") == 0 )
         {
            AV44TFLb_ColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFLb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFLb_ColNum), 6, 0));
            AV45TFLb_ColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFLb_ColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFLb_ColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_FechaE") == 0 )
         {
            AV46TFLb_FechaE = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFLb_FechaE", localUtil.format(AV46TFLb_FechaE, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Lb_Tipo") == 0 )
         {
            AV61TFLb_Tipo = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFLb_Tipo", AV61TFLb_Tipo);
            AV62TFLb_Tipo_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFLb_Tipo_Sel", AV62TFLb_Tipo_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e201UY2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         AV60Dias = (short)((GXutil.ddiff(Gx_date,A5541Lb_FechaE))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDias_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60Dias), 4, 0));
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(41) ;
         }
         sendrow_412( ) ;
         GRID_nEOF = (byte)(1) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
         {
            GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
         }
      }
      if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
      {
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      }
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_41_Refreshing )
      {
         httpContext.doAjaxLoad(41, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e151UY2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.EnsayosPendientesEnvio_WCColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e111UY2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S172 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("GestionLaboratorio.EnsayosPendientesEnvio_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV65Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("GestionLaboratorio.EnsayosPendientesEnvio_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char5 = AV24ManageFiltersXml ;
         GXv_char7[0] = GXt_char5 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "GestionLaboratorio.EnsayosPendientesEnvio_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char7) ;
         ensayospendientesenvio_wc_impl.this.GXt_char5 = GXv_char7[0] ;
         AV24ManageFiltersXml = GXt_char5 ;
         if ( (GXutil.strcmp("", AV24ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV65Pgmname+"GridState", AV24ManageFiltersXml) ;
            AV10GridState.fromxml(AV24ManageFiltersXml, null, null);
            AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
            AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S182 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e161UY2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char7[0] = AV16ExcelFilename ;
      GXv_char6[0] = AV17ErrorMessage ;
      new app.gestionlaboratorio.ensayospendientesenvio_wcexport(remoteHandle, context).execute( GXv_char7, GXv_char6) ;
      ensayospendientesenvio_wc_impl.this.AV16ExcelFilename = GXv_char7[0] ;
      ensayospendientesenvio_wc_impl.this.AV17ErrorMessage = GXv_char6[0] ;
      if ( GXutil.strcmp(AV16ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV16ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV17ErrorMessage);
      }
   }

   public void e171UY2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.gestionlaboratorio.ensayospendientesenvio_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV20ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector11[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "CliNom", "", "Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "Lb_numero", "", "Nº de Ensayo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "Lb_Cartaz", "", "Coleccion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "Lb_cartazf", "", "Fecha", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "Lb_ArtCod", "", "Articulo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "Lb_ArtDsc", "", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "Lb_ColNomC", "", "Color Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "Lb_ColNom", "", "Color", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "Lb_ColNum", "", "Numero", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "Lb_FechaE", "", "Fecha Entrada", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "Lb_Tipo", "", "Tipo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "&Dias", "", "Dias", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXt_char5 = AV19UserCustomValue ;
      GXv_char7[0] = GXt_char5 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.EnsayosPendientesEnvio_WCColumnsSelector", GXv_char7) ;
      ensayospendientesenvio_wc_impl.this.GXt_char5 = GXv_char7[0] ;
      AV19UserCustomValue = GXt_char5 ;
      if ( ! ( (GXutil.strcmp("", AV19UserCustomValue)==0) ) )
      {
         AV21ColumnsSelectorAux.fromxml(AV19UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector11[0] = AV21ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector12[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, GXv_SdtWWPColumnsSelector12) ;
         AV21ColumnsSelectorAux = GXv_SdtWWPColumnsSelector11[0] ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = AV23ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item14[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item13 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "GestionLaboratorio.EnsayosPendientesEnvio_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item14) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item14[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item13 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
      AV26TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFCliNom", AV26TFCliNom);
      AV27TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFCliNom_Sel", AV27TFCliNom_Sel);
      AV28TFLb_numero = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFLb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFLb_numero), 8, 0));
      AV29TFLb_numero_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFLb_numero_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFLb_numero_To), 8, 0));
      AV30TFLb_Cartaz = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFLb_Cartaz", AV30TFLb_Cartaz);
      AV31TFLb_Cartaz_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFLb_Cartaz_Sel", AV31TFLb_Cartaz_Sel);
      AV32TFLb_cartazf = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFLb_cartazf", localUtil.format(AV32TFLb_cartazf, "99/99/99"));
      AV36TFLb_ArtCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFLb_ArtCod", AV36TFLb_ArtCod);
      AV37TFLb_ArtCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFLb_ArtCod_Sel", AV37TFLb_ArtCod_Sel);
      AV38TFLb_ArtDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFLb_ArtDsc", AV38TFLb_ArtDsc);
      AV39TFLb_ArtDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFLb_ArtDsc_Sel", AV39TFLb_ArtDsc_Sel);
      AV40TFLb_ColNomC = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFLb_ColNomC", AV40TFLb_ColNomC);
      AV41TFLb_ColNomC_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFLb_ColNomC_Sel", AV41TFLb_ColNomC_Sel);
      AV42TFLb_ColNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFLb_ColNom", AV42TFLb_ColNom);
      AV43TFLb_ColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFLb_ColNom_Sel", AV43TFLb_ColNom_Sel);
      AV44TFLb_ColNum = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFLb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFLb_ColNum), 6, 0));
      AV45TFLb_ColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFLb_ColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFLb_ColNum_To), 6, 0));
      AV46TFLb_FechaE = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFLb_FechaE", localUtil.format(AV46TFLb_FechaE, "99/99/99"));
      AV61TFLb_Tipo = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFLb_Tipo", AV61TFLb_Tipo);
      AV62TFLb_Tipo_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFLb_Tipo_Sel", AV62TFLb_Tipo_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV65Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV65Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV65Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV91GXV1 = 1 ;
      while ( AV91GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV91GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV26TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFCliNom", AV26TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV27TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFCliNom_Sel", AV27TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV28TFLb_numero = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFLb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFLb_numero), 8, 0));
            AV29TFLb_numero_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFLb_numero_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFLb_numero_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ") == 0 )
         {
            AV30TFLb_Cartaz = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFLb_Cartaz", AV30TFLb_Cartaz);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ_SEL") == 0 )
         {
            AV31TFLb_Cartaz_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFLb_Cartaz_Sel", AV31TFLb_Cartaz_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZF") == 0 )
         {
            AV32TFLb_cartazf = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFLb_cartazf", localUtil.format(AV32TFLb_cartazf, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD") == 0 )
         {
            AV36TFLb_ArtCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFLb_ArtCod", AV36TFLb_ArtCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD_SEL") == 0 )
         {
            AV37TFLb_ArtCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFLb_ArtCod_Sel", AV37TFLb_ArtCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTDSC") == 0 )
         {
            AV38TFLb_ArtDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFLb_ArtDsc", AV38TFLb_ArtDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTDSC_SEL") == 0 )
         {
            AV39TFLb_ArtDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFLb_ArtDsc_Sel", AV39TFLb_ArtDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC") == 0 )
         {
            AV40TFLb_ColNomC = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFLb_ColNomC", AV40TFLb_ColNomC);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC_SEL") == 0 )
         {
            AV41TFLb_ColNomC_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFLb_ColNomC_Sel", AV41TFLb_ColNomC_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM") == 0 )
         {
            AV42TFLb_ColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFLb_ColNom", AV42TFLb_ColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM_SEL") == 0 )
         {
            AV43TFLb_ColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFLb_ColNom_Sel", AV43TFLb_ColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUM") == 0 )
         {
            AV44TFLb_ColNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFLb_ColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFLb_ColNum), 6, 0));
            AV45TFLb_ColNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFLb_ColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFLb_ColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAE") == 0 )
         {
            AV46TFLb_FechaE = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFLb_FechaE", localUtil.format(AV46TFLb_FechaE, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_TIPO") == 0 )
         {
            AV61TFLb_Tipo = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFLb_Tipo", AV61TFLb_Tipo);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_TIPO_SEL") == 0 )
         {
            AV62TFLb_Tipo_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFLb_Tipo_Sel", AV62TFLb_Tipo_Sel);
         }
         AV91GXV1 = (int)(AV91GXV1+1) ;
      }
      GXt_char5 = "" ;
      GXv_char7[0] = GXt_char5 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFCliNom_Sel)==0), AV27TFCliNom_Sel, GXv_char7) ;
      ensayospendientesenvio_wc_impl.this.GXt_char5 = GXv_char7[0] ;
      GXt_char15 = "" ;
      GXv_char6[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFLb_Cartaz_Sel)==0), AV31TFLb_Cartaz_Sel, GXv_char6) ;
      ensayospendientesenvio_wc_impl.this.GXt_char15 = GXv_char6[0] ;
      GXt_char16 = "" ;
      GXv_char2[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFLb_ArtCod_Sel)==0), AV37TFLb_ArtCod_Sel, GXv_char2) ;
      ensayospendientesenvio_wc_impl.this.GXt_char16 = GXv_char2[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFLb_ArtDsc_Sel)==0), AV39TFLb_ArtDsc_Sel, GXv_char18) ;
      ensayospendientesenvio_wc_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFLb_ColNomC_Sel)==0), AV41TFLb_ColNomC_Sel, GXv_char20) ;
      ensayospendientesenvio_wc_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFLb_ColNom_Sel)==0), AV43TFLb_ColNom_Sel, GXv_char22) ;
      ensayospendientesenvio_wc_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFLb_Tipo_Sel)==0), AV62TFLb_Tipo_Sel, GXv_char24) ;
      ensayospendientesenvio_wc_impl.this.GXt_char23 = GXv_char24[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char5+"||"+GXt_char15+"||"+GXt_char16+"|"+GXt_char17+"|"+GXt_char19+"|"+GXt_char21+"|||"+GXt_char23+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFCliNom)==0), AV26TFCliNom, GXv_char24) ;
      ensayospendientesenvio_wc_impl.this.GXt_char23 = GXv_char24[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFLb_Cartaz)==0), AV30TFLb_Cartaz, GXv_char22) ;
      ensayospendientesenvio_wc_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFLb_ArtCod)==0), AV36TFLb_ArtCod, GXv_char20) ;
      ensayospendientesenvio_wc_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFLb_ArtDsc)==0), AV38TFLb_ArtDsc, GXv_char18) ;
      ensayospendientesenvio_wc_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char16 = "" ;
      GXv_char7[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFLb_ColNomC)==0), AV40TFLb_ColNomC, GXv_char7) ;
      ensayospendientesenvio_wc_impl.this.GXt_char16 = GXv_char7[0] ;
      GXt_char15 = "" ;
      GXv_char6[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFLb_ColNom)==0), AV42TFLb_ColNom, GXv_char6) ;
      ensayospendientesenvio_wc_impl.this.GXt_char15 = GXv_char6[0] ;
      GXt_char5 = "" ;
      GXv_char2[0] = GXt_char5 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFLb_Tipo)==0), AV61TFLb_Tipo, GXv_char2) ;
      ensayospendientesenvio_wc_impl.this.GXt_char5 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char23+"|"+((0==AV28TFLb_numero) ? "" : GXutil.str( AV28TFLb_numero, 8, 0))+"|"+GXt_char21+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV32TFLb_cartazf)) ? "" : localUtil.dtoc( AV32TFLb_cartazf, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char19+"|"+GXt_char17+"|"+GXt_char16+"|"+GXt_char15+"|"+((0==AV44TFLb_ColNum) ? "" : GXutil.str( AV44TFLb_ColNum, 6, 0))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46TFLb_FechaE)) ? "" : localUtil.dtoc( AV46TFLb_FechaE, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char5+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV29TFLb_numero_To) ? "" : GXutil.str( AV29TFLb_numero_To, 8, 0))+"|||||||"+((0==AV45TFLb_ColNum_To) ? "" : GXutil.str( AV45TFLb_ColNum_To, 6, 0))+"|||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV65Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState25[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFCLINOM", "", !(GXutil.strcmp("", AV26TFCliNom)==0), (short)(0), AV26TFCliNom, "", !(GXutil.strcmp("", AV27TFCliNom_Sel)==0), AV27TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFLB_NUMERO", "", !((0==AV28TFLb_numero)&&(0==AV29TFLb_numero_To)), (short)(0), GXutil.trim( GXutil.str( AV28TFLb_numero, 8, 0)), GXutil.trim( GXutil.str( AV29TFLb_numero_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFLB_CARTAZ", "", !(GXutil.strcmp("", AV30TFLb_Cartaz)==0), (short)(0), AV30TFLb_Cartaz, "", !(GXutil.strcmp("", AV31TFLb_Cartaz_Sel)==0), AV31TFLb_Cartaz_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFLB_CARTAZF", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV32TFLb_cartazf)), (short)(0), GXutil.trim( localUtil.dtoc( AV32TFLb_cartazf, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFLB_ARTCOD", "", !(GXutil.strcmp("", AV36TFLb_ArtCod)==0), (short)(0), AV36TFLb_ArtCod, "", !(GXutil.strcmp("", AV37TFLb_ArtCod_Sel)==0), AV37TFLb_ArtCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFLB_ARTDSC", "", !(GXutil.strcmp("", AV38TFLb_ArtDsc)==0), (short)(0), AV38TFLb_ArtDsc, "", !(GXutil.strcmp("", AV39TFLb_ArtDsc_Sel)==0), AV39TFLb_ArtDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFLB_COLNOMC", "", !(GXutil.strcmp("", AV40TFLb_ColNomC)==0), (short)(0), AV40TFLb_ColNomC, "", !(GXutil.strcmp("", AV41TFLb_ColNomC_Sel)==0), AV41TFLb_ColNomC_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFLB_COLNOM", "", !(GXutil.strcmp("", AV42TFLb_ColNom)==0), (short)(0), AV42TFLb_ColNom, "", !(GXutil.strcmp("", AV43TFLb_ColNom_Sel)==0), AV43TFLb_ColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFLB_COLNUM", "", !((0==AV44TFLb_ColNum)&&(0==AV45TFLb_ColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV44TFLb_ColNum, 6, 0)), GXutil.trim( GXutil.str( AV45TFLb_ColNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFLB_FECHAE", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46TFLb_FechaE)), (short)(0), GXutil.trim( localUtil.dtoc( AV46TFLb_FechaE, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFLB_TIPO", "", !(GXutil.strcmp("", AV61TFLb_Tipo)==0), (short)(0), AV61TFLb_Tipo, "", !(GXutil.strcmp("", AV62TFLb_Tipo_Sel)==0), AV62TFLb_Tipo_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState25[0] ;
      if ( ! (GXutil.strcmp("", AV56emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV56emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV57Clicod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV57Clicod, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58lb_fechaefrom)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_FECHAEFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV58lb_fechaefrom, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59lb_fechaeto)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_FECHAETO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV59lb_fechaeto, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV65Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV65Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TENS000" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_23_1UY2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV23ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_28_1UY2( true) ;
      }
      else
      {
         wb_table2_28_1UY2( false) ;
      }
      return  ;
   }

   public void wb_table2_28_1UY2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_1UY2e( true) ;
      }
      else
      {
         wb_table1_23_1UY2e( false) ;
      }
   }

   public void wb_table2_28_1UY2( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_GestionLaboratorio\\EnsayosPendientesEnvio_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_28_1UY2e( true) ;
      }
      else
      {
         wb_table2_28_1UY2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV56emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56emprcod", AV56emprcod);
      AV57Clicod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57Clicod), 6, 0));
      AV58lb_fechaefrom = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58lb_fechaefrom", localUtil.format(AV58lb_fechaefrom, "99/99/99"));
      AV59lb_fechaeto = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59lb_fechaeto", localUtil.format(AV59lb_fechaeto, "99/99/99"));
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
      pa1UY2( ) ;
      ws1UY2( ) ;
      we1UY2( ) ;
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
      sCtrlAV56emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV57Clicod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV58lb_fechaefrom = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV59lb_fechaeto = (String)getParm(obj,3,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1UY2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "gestionlaboratorio\\ensayospendientesenvio_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1UY2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV56emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56emprcod", AV56emprcod);
         AV57Clicod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57Clicod), 6, 0));
         AV58lb_fechaefrom = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58lb_fechaefrom", localUtil.format(AV58lb_fechaefrom, "99/99/99"));
         AV59lb_fechaeto = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59lb_fechaeto", localUtil.format(AV59lb_fechaeto, "99/99/99"));
      }
      wcpOAV56emprcod = httpContext.cgiGet( sPrefix+"wcpOAV56emprcod") ;
      wcpOAV57Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV57Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV58lb_fechaefrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV58lb_fechaefrom"), 0) ;
      wcpOAV59lb_fechaeto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV59lb_fechaeto"), 0) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV56emprcod, wcpOAV56emprcod) != 0 ) || ( AV57Clicod != wcpOAV57Clicod ) || !( GXutil.dateCompare(GXutil.resetTime(AV58lb_fechaefrom), GXutil.resetTime(wcpOAV58lb_fechaefrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV59lb_fechaeto), GXutil.resetTime(wcpOAV59lb_fechaeto)) ) ) )
      {
         setjustcreated();
      }
      wcpOAV56emprcod = AV56emprcod ;
      wcpOAV57Clicod = AV57Clicod ;
      wcpOAV58lb_fechaefrom = AV58lb_fechaefrom ;
      wcpOAV59lb_fechaeto = AV59lb_fechaeto ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV56emprcod = httpContext.cgiGet( sPrefix+"AV56emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV56emprcod) > 0 )
      {
         AV56emprcod = httpContext.cgiGet( sCtrlAV56emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56emprcod", AV56emprcod);
      }
      else
      {
         AV56emprcod = httpContext.cgiGet( sPrefix+"AV56emprcod_PARM") ;
      }
      sCtrlAV57Clicod = httpContext.cgiGet( sPrefix+"AV57Clicod_CTRL") ;
      if ( GXutil.len( sCtrlAV57Clicod) > 0 )
      {
         AV57Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV57Clicod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57Clicod), 6, 0));
      }
      else
      {
         AV57Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV57Clicod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV58lb_fechaefrom = httpContext.cgiGet( sPrefix+"AV58lb_fechaefrom_CTRL") ;
      if ( GXutil.len( sCtrlAV58lb_fechaefrom) > 0 )
      {
         AV58lb_fechaefrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV58lb_fechaefrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58lb_fechaefrom", localUtil.format(AV58lb_fechaefrom, "99/99/99"));
      }
      else
      {
         AV58lb_fechaefrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV58lb_fechaefrom_PARM"), 0) ;
      }
      sCtrlAV59lb_fechaeto = httpContext.cgiGet( sPrefix+"AV59lb_fechaeto_CTRL") ;
      if ( GXutil.len( sCtrlAV59lb_fechaeto) > 0 )
      {
         AV59lb_fechaeto = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV59lb_fechaeto), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59lb_fechaeto", localUtil.format(AV59lb_fechaeto, "99/99/99"));
      }
      else
      {
         AV59lb_fechaeto = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV59lb_fechaeto_PARM"), 0) ;
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
      pa1UY2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1UY2( ) ;
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
      ws1UY2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV56emprcod_PARM", GXutil.rtrim( AV56emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV56emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV56emprcod_CTRL", GXutil.rtrim( sCtrlAV56emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV57Clicod_PARM", GXutil.ltrim( localUtil.ntoc( AV57Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV57Clicod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV57Clicod_CTRL", GXutil.rtrim( sCtrlAV57Clicod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58lb_fechaefrom_PARM", localUtil.dtoc( AV58lb_fechaefrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV58lb_fechaefrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58lb_fechaefrom_CTRL", GXutil.rtrim( sCtrlAV58lb_fechaefrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59lb_fechaeto_PARM", localUtil.dtoc( AV59lb_fechaeto, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV59lb_fechaeto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59lb_fechaeto_CTRL", GXutil.rtrim( sCtrlAV59lb_fechaeto));
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
      we1UY2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115555136", true, true);
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
      httpContext.AddJavascriptSource("gestionlaboratorio/ensayospendientesenvio_wc.js", "?202682115555137", false, true);
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
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_41_idx ;
      edtLb_numero_Internalname = sPrefix+"LB_NUMERO_"+sGXsfl_41_idx ;
      edtLb_Cartaz_Internalname = sPrefix+"LB_CARTAZ_"+sGXsfl_41_idx ;
      edtLb_cartazf_Internalname = sPrefix+"LB_CARTAZF_"+sGXsfl_41_idx ;
      edtLb_ArtCod_Internalname = sPrefix+"LB_ARTCOD_"+sGXsfl_41_idx ;
      edtLb_ArtDsc_Internalname = sPrefix+"LB_ARTDSC_"+sGXsfl_41_idx ;
      edtLb_ColNomC_Internalname = sPrefix+"LB_COLNOMC_"+sGXsfl_41_idx ;
      edtLb_ColNom_Internalname = sPrefix+"LB_COLNOM_"+sGXsfl_41_idx ;
      edtLb_ColNum_Internalname = sPrefix+"LB_COLNUM_"+sGXsfl_41_idx ;
      edtLb_FechaE_Internalname = sPrefix+"LB_FECHAE_"+sGXsfl_41_idx ;
      edtLb_Tipo_Internalname = sPrefix+"LB_TIPO_"+sGXsfl_41_idx ;
      edtavDias_Internalname = sPrefix+"vDIAS_"+sGXsfl_41_idx ;
      edtLb_Enviado_Internalname = sPrefix+"LB_ENVIADO_"+sGXsfl_41_idx ;
   }

   public void subsflControlProps_fel_412( )
   {
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_41_fel_idx ;
      edtLb_numero_Internalname = sPrefix+"LB_NUMERO_"+sGXsfl_41_fel_idx ;
      edtLb_Cartaz_Internalname = sPrefix+"LB_CARTAZ_"+sGXsfl_41_fel_idx ;
      edtLb_cartazf_Internalname = sPrefix+"LB_CARTAZF_"+sGXsfl_41_fel_idx ;
      edtLb_ArtCod_Internalname = sPrefix+"LB_ARTCOD_"+sGXsfl_41_fel_idx ;
      edtLb_ArtDsc_Internalname = sPrefix+"LB_ARTDSC_"+sGXsfl_41_fel_idx ;
      edtLb_ColNomC_Internalname = sPrefix+"LB_COLNOMC_"+sGXsfl_41_fel_idx ;
      edtLb_ColNom_Internalname = sPrefix+"LB_COLNOM_"+sGXsfl_41_fel_idx ;
      edtLb_ColNum_Internalname = sPrefix+"LB_COLNUM_"+sGXsfl_41_fel_idx ;
      edtLb_FechaE_Internalname = sPrefix+"LB_FECHAE_"+sGXsfl_41_fel_idx ;
      edtLb_Tipo_Internalname = sPrefix+"LB_TIPO_"+sGXsfl_41_fel_idx ;
      edtavDias_Internalname = sPrefix+"vDIAS_"+sGXsfl_41_fel_idx ;
      edtLb_Enviado_Internalname = sPrefix+"LB_ENVIADO_"+sGXsfl_41_fel_idx ;
   }

   public void sendrow_412( )
   {
      subsflControlProps_412( ) ;
      wb1UY0( ) ;
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_numero_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_numero_Internalname,GXutil.ltrim( localUtil.ntoc( A5532Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_numero_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_numero_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_Cartaz_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_Cartaz_Internalname,GXutil.rtrim( A5540Lb_Cartaz),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_Cartaz_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_Cartaz_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_cartazf_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_cartazf_Internalname,localUtil.format(A5594Lb_cartazf, "99/99/99"),localUtil.format( A5594Lb_cartazf, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_cartazf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_cartazf_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_ArtCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ArtCod_Internalname,GXutil.rtrim( A5533Lb_ArtCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_ArtCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLb_ArtCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_ArtDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ArtDsc_Internalname,GXutil.rtrim( A5534Lb_ArtDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_ArtDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_ArtDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_ColNomC_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ColNomC_Internalname,GXutil.rtrim( A5538Lb_ColNomC),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_ColNomC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_ColNomC_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_ColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ColNom_Internalname,GXutil.rtrim( A5536Lb_ColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_ColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_ColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_ColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_ColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A5537Lb_ColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5537Lb_ColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_ColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_ColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLb_FechaE_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_FechaE_Internalname,localUtil.format(A5541Lb_FechaE, "99/99/99"),localUtil.format( A5541Lb_FechaE, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_FechaE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_FechaE_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLb_Tipo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_Tipo_Internalname,GXutil.rtrim( A5570Lb_Tipo),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_Tipo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLb_Tipo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDias_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDias_Internalname,GXutil.ltrim( localUtil.ntoc( AV60Dias, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDias_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV60Dias), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV60Dias), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDias_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDias_Visible),Integer.valueOf(edtavDias_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_Enviado_Internalname,GXutil.ltrim( localUtil.ntoc( A14098Lb_Enviado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14098Lb_Enviado), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtLb_Enviado_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1UY2( ) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_numero_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº de Ensayo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_Cartaz_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coleccion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_cartazf_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_ArtCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_ArtDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_ColNomC_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_ColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_ColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_FechaE_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLb_Tipo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDias_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dias", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5532Lb_numero, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_numero_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5540Lb_Cartaz));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_Cartaz_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A5594Lb_cartazf, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_cartazf_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5533Lb_ArtCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_ArtCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5534Lb_ArtDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_ArtDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5538Lb_ColNomC));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_ColNomC_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5536Lb_ColNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_ColNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5537Lb_ColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_ColNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A5541Lb_FechaE, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_FechaE_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5570Lb_Tipo));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_Tipo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV60Dias, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDias_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDias_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14098Lb_Enviado, (byte)(1), (byte)(0), ".", "")));
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
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtLb_numero_Internalname = sPrefix+"LB_NUMERO" ;
      edtLb_Cartaz_Internalname = sPrefix+"LB_CARTAZ" ;
      edtLb_cartazf_Internalname = sPrefix+"LB_CARTAZF" ;
      edtLb_ArtCod_Internalname = sPrefix+"LB_ARTCOD" ;
      edtLb_ArtDsc_Internalname = sPrefix+"LB_ARTDSC" ;
      edtLb_ColNomC_Internalname = sPrefix+"LB_COLNOMC" ;
      edtLb_ColNom_Internalname = sPrefix+"LB_COLNOM" ;
      edtLb_ColNum_Internalname = sPrefix+"LB_COLNUM" ;
      edtLb_FechaE_Internalname = sPrefix+"LB_FECHAE" ;
      edtLb_Tipo_Internalname = sPrefix+"LB_TIPO" ;
      edtavDias_Internalname = sPrefix+"vDIAS" ;
      edtLb_Enviado_Internalname = sPrefix+"LB_ENVIADO" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_lb_cartazfauxdate_Internalname = sPrefix+"vDDO_LB_CARTAZFAUXDATE" ;
      divDdo_lb_cartazfauxdates_Internalname = sPrefix+"DDO_LB_CARTAZFAUXDATES" ;
      edtavDdo_lb_fechaeauxdate_Internalname = sPrefix+"vDDO_LB_FECHAEAUXDATE" ;
      divDdo_lb_fechaeauxdates_Internalname = sPrefix+"DDO_LB_FECHAEAUXDATES" ;
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
      edtLb_Enviado_Jsonclick = "" ;
      edtavDias_Jsonclick = "" ;
      edtavDias_Enabled = 0 ;
      edtLb_Tipo_Jsonclick = "" ;
      edtLb_FechaE_Jsonclick = "" ;
      edtLb_ColNum_Jsonclick = "" ;
      edtLb_ColNom_Jsonclick = "" ;
      edtLb_ColNomC_Jsonclick = "" ;
      edtLb_ArtDsc_Jsonclick = "" ;
      edtLb_ArtCod_Jsonclick = "" ;
      edtLb_cartazf_Jsonclick = "" ;
      edtLb_Cartaz_Jsonclick = "" ;
      edtLb_numero_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavDias_Visible = -1 ;
      edtLb_Tipo_Visible = -1 ;
      edtLb_FechaE_Visible = -1 ;
      edtLb_ColNum_Visible = -1 ;
      edtLb_ColNom_Visible = -1 ;
      edtLb_ColNomC_Visible = -1 ;
      edtLb_ArtDsc_Visible = -1 ;
      edtLb_ArtCod_Visible = -1 ;
      edtLb_cartazf_Visible = -1 ;
      edtLb_Cartaz_Visible = -1 ;
      edtLb_numero_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_lb_fechaeauxdate_Jsonclick = "" ;
      edtavDdo_lb_cartazfauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "GestionLaboratorio.EnsayosPendientesEnvio_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic||Dynamic||Dynamic|Dynamic|Dynamic|Dynamic|||Dynamic|" ;
      Ddo_grid_Includedatalist = "T||T||T|T|T|T|||T|" ;
      Ddo_grid_Filterisrange = "|T|||||||T|||" ;
      Ddo_grid_Filtertype = "Character|Numeric|Character|Date|Character|Character|Character|Character|Numeric|Date|Character|" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T|T|T|" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T|T|T|T|T|" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|1|6|7|8|9|10|11|" ;
      Ddo_grid_Columnids = "0:CliNom|1:Lb_numero|2:Lb_Cartaz|3:Lb_cartazf|4:Lb_ArtCod|5:Lb_ArtDsc|6:Lb_ColNomC|7:Lb_ColNom|8:Lb_ColNum|9:Lb_FechaE|10:Lb_Tipo|11:Dias" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV56emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV57Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV58lb_fechaefrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV59lb_fechaeto',fld:'vLB_FECHAETO',pic:''},{av:'AV26TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV27TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV28TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV29TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV30TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV31TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV32TFLb_cartazf',fld:'vTFLB_CARTAZF',pic:''},{av:'AV36TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV37TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV38TFLb_ArtDsc',fld:'vTFLB_ARTDSC',pic:''},{av:'AV39TFLb_ArtDsc_Sel',fld:'vTFLB_ARTDSC_SEL',pic:''},{av:'AV40TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV41TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV42TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV43TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV44TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV45TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV46TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV61TFLb_Tipo',fld:'vTFLB_TIPO',pic:''},{av:'AV62TFLb_Tipo_Sel',fld:'vTFLB_TIPO_SEL',pic:''},{av:'AV65Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_cartazf_Visible',ctrl:'LB_CARTAZF',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ArtDsc_Visible',ctrl:'LB_ARTDSC',prop:'Visible'},{av:'edtLb_ColNomC_Visible',ctrl:'LB_COLNOMC',prop:'Visible'},{av:'edtLb_ColNom_Visible',ctrl:'LB_COLNOM',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtLb_FechaE_Visible',ctrl:'LB_FECHAE',prop:'Visible'},{av:'edtLb_Tipo_Visible',ctrl:'LB_TIPO',prop:'Visible'},{av:'edtavDias_Visible',ctrl:'vDIAS',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121UY2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV56emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV57Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV58lb_fechaefrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV59lb_fechaeto',fld:'vLB_FECHAETO',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV27TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV28TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV29TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV30TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV31TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV32TFLb_cartazf',fld:'vTFLB_CARTAZF',pic:''},{av:'AV36TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV37TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV38TFLb_ArtDsc',fld:'vTFLB_ARTDSC',pic:''},{av:'AV39TFLb_ArtDsc_Sel',fld:'vTFLB_ARTDSC_SEL',pic:''},{av:'AV40TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV41TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV42TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV43TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV44TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV45TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV46TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV61TFLb_Tipo',fld:'vTFLB_TIPO',pic:''},{av:'AV62TFLb_Tipo_Sel',fld:'vTFLB_TIPO_SEL',pic:''},{av:'AV65Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131UY2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV56emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV57Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV58lb_fechaefrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV59lb_fechaeto',fld:'vLB_FECHAETO',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV27TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV28TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV29TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV30TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV31TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV32TFLb_cartazf',fld:'vTFLB_CARTAZF',pic:''},{av:'AV36TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV37TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV38TFLb_ArtDsc',fld:'vTFLB_ARTDSC',pic:''},{av:'AV39TFLb_ArtDsc_Sel',fld:'vTFLB_ARTDSC_SEL',pic:''},{av:'AV40TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV41TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV42TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV43TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV44TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV45TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV46TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV61TFLb_Tipo',fld:'vTFLB_TIPO',pic:''},{av:'AV62TFLb_Tipo_Sel',fld:'vTFLB_TIPO_SEL',pic:''},{av:'AV65Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141UY2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV56emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV57Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV58lb_fechaefrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV59lb_fechaeto',fld:'vLB_FECHAETO',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV27TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV28TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV29TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV30TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV31TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV32TFLb_cartazf',fld:'vTFLB_CARTAZF',pic:''},{av:'AV36TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV37TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV38TFLb_ArtDsc',fld:'vTFLB_ARTDSC',pic:''},{av:'AV39TFLb_ArtDsc_Sel',fld:'vTFLB_ARTDSC_SEL',pic:''},{av:'AV40TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV41TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV42TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV43TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV44TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV45TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV46TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV61TFLb_Tipo',fld:'vTFLB_TIPO',pic:''},{av:'AV62TFLb_Tipo_Sel',fld:'vTFLB_TIPO_SEL',pic:''},{av:'AV65Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV61TFLb_Tipo',fld:'vTFLB_TIPO',pic:''},{av:'AV62TFLb_Tipo_Sel',fld:'vTFLB_TIPO_SEL',pic:''},{av:'AV46TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV44TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV45TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV42TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV43TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV40TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV41TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV38TFLb_ArtDsc',fld:'vTFLB_ARTDSC',pic:''},{av:'AV39TFLb_ArtDsc_Sel',fld:'vTFLB_ARTDSC_SEL',pic:''},{av:'AV36TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV37TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV32TFLb_cartazf',fld:'vTFLB_CARTAZF',pic:''},{av:'AV30TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV31TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV28TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV29TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV26TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV27TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e201UY2',iparms:[{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'A5541Lb_FechaE',fld:'LB_FECHAE',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV60Dias',fld:'vDIAS',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151UY2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV56emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV57Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV58lb_fechaefrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV59lb_fechaeto',fld:'vLB_FECHAETO',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV27TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV28TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV29TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV30TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV31TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV32TFLb_cartazf',fld:'vTFLB_CARTAZF',pic:''},{av:'AV36TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV37TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV38TFLb_ArtDsc',fld:'vTFLB_ARTDSC',pic:''},{av:'AV39TFLb_ArtDsc_Sel',fld:'vTFLB_ARTDSC_SEL',pic:''},{av:'AV40TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV41TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV42TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV43TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV44TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV45TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV46TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV61TFLb_Tipo',fld:'vTFLB_TIPO',pic:''},{av:'AV62TFLb_Tipo_Sel',fld:'vTFLB_TIPO_SEL',pic:''},{av:'AV65Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_cartazf_Visible',ctrl:'LB_CARTAZF',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ArtDsc_Visible',ctrl:'LB_ARTDSC',prop:'Visible'},{av:'edtLb_ColNomC_Visible',ctrl:'LB_COLNOMC',prop:'Visible'},{av:'edtLb_ColNom_Visible',ctrl:'LB_COLNOM',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtLb_FechaE_Visible',ctrl:'LB_FECHAE',prop:'Visible'},{av:'edtLb_Tipo_Visible',ctrl:'LB_TIPO',prop:'Visible'},{av:'edtavDias_Visible',ctrl:'vDIAS',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111UY2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV56emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV57Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV58lb_fechaefrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV59lb_fechaeto',fld:'vLB_FECHAETO',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV27TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV28TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV29TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV30TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV31TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV32TFLb_cartazf',fld:'vTFLB_CARTAZF',pic:''},{av:'AV36TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV37TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV38TFLb_ArtDsc',fld:'vTFLB_ARTDSC',pic:''},{av:'AV39TFLb_ArtDsc_Sel',fld:'vTFLB_ARTDSC_SEL',pic:''},{av:'AV40TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV41TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV42TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV43TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV44TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV45TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV46TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV61TFLb_Tipo',fld:'vTFLB_TIPO',pic:''},{av:'AV62TFLb_Tipo_Sel',fld:'vTFLB_TIPO_SEL',pic:''},{av:'AV65Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV27TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV28TFLb_numero',fld:'vTFLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV29TFLb_numero_To',fld:'vTFLB_NUMERO_TO',pic:'ZZZZZZZ9'},{av:'AV30TFLb_Cartaz',fld:'vTFLB_CARTAZ',pic:''},{av:'AV31TFLb_Cartaz_Sel',fld:'vTFLB_CARTAZ_SEL',pic:''},{av:'AV32TFLb_cartazf',fld:'vTFLB_CARTAZF',pic:''},{av:'AV36TFLb_ArtCod',fld:'vTFLB_ARTCOD',pic:''},{av:'AV37TFLb_ArtCod_Sel',fld:'vTFLB_ARTCOD_SEL',pic:''},{av:'AV38TFLb_ArtDsc',fld:'vTFLB_ARTDSC',pic:''},{av:'AV39TFLb_ArtDsc_Sel',fld:'vTFLB_ARTDSC_SEL',pic:''},{av:'AV40TFLb_ColNomC',fld:'vTFLB_COLNOMC',pic:''},{av:'AV41TFLb_ColNomC_Sel',fld:'vTFLB_COLNOMC_SEL',pic:''},{av:'AV42TFLb_ColNom',fld:'vTFLB_COLNOM',pic:''},{av:'AV43TFLb_ColNom_Sel',fld:'vTFLB_COLNOM_SEL',pic:''},{av:'AV44TFLb_ColNum',fld:'vTFLB_COLNUM',pic:'ZZZZZ9'},{av:'AV45TFLb_ColNum_To',fld:'vTFLB_COLNUM_TO',pic:'ZZZZZ9'},{av:'AV46TFLb_FechaE',fld:'vTFLB_FECHAE',pic:''},{av:'AV61TFLb_Tipo',fld:'vTFLB_TIPO',pic:''},{av:'AV62TFLb_Tipo_Sel',fld:'vTFLB_TIPO_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtLb_numero_Visible',ctrl:'LB_NUMERO',prop:'Visible'},{av:'edtLb_Cartaz_Visible',ctrl:'LB_CARTAZ',prop:'Visible'},{av:'edtLb_cartazf_Visible',ctrl:'LB_CARTAZF',prop:'Visible'},{av:'edtLb_ArtCod_Visible',ctrl:'LB_ARTCOD',prop:'Visible'},{av:'edtLb_ArtDsc_Visible',ctrl:'LB_ARTDSC',prop:'Visible'},{av:'edtLb_ColNomC_Visible',ctrl:'LB_COLNOMC',prop:'Visible'},{av:'edtLb_ColNom_Visible',ctrl:'LB_COLNOM',prop:'Visible'},{av:'edtLb_ColNum_Visible',ctrl:'LB_COLNUM',prop:'Visible'},{av:'edtLb_FechaE_Visible',ctrl:'LB_FECHAE',prop:'Visible'},{av:'edtLb_Tipo_Visible',ctrl:'LB_TIPO',prop:'Visible'},{av:'edtavDias_Visible',ctrl:'vDIAS',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e161UY2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e171UY2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_LB_NUMERO","{handler:'valid_Lb_numero',iparms:[]");
      setEventMetadata("VALID_LB_NUMERO",",oparms:[]}");
      setEventMetadata("VALID_LB_ENVIADO","{handler:'valid_Lb_enviado',iparms:[]");
      setEventMetadata("VALID_LB_ENVIADO",",oparms:[]}");
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
      wcpOAV56emprcod = "" ;
      wcpOAV58lb_fechaefrom = GXutil.nullDate() ;
      wcpOAV59lb_fechaeto = GXutil.nullDate() ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV56emprcod = "" ;
      AV58lb_fechaefrom = GXutil.nullDate() ;
      AV59lb_fechaeto = GXutil.nullDate() ;
      AV15FilterFullText = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV26TFCliNom = "" ;
      AV27TFCliNom_Sel = "" ;
      AV30TFLb_Cartaz = "" ;
      AV31TFLb_Cartaz_Sel = "" ;
      AV32TFLb_cartazf = GXutil.nullDate() ;
      AV36TFLb_ArtCod = "" ;
      AV37TFLb_ArtCod_Sel = "" ;
      AV38TFLb_ArtDsc = "" ;
      AV39TFLb_ArtDsc_Sel = "" ;
      AV40TFLb_ColNomC = "" ;
      AV41TFLb_ColNomC_Sel = "" ;
      AV42TFLb_ColNom = "" ;
      AV43TFLb_ColNom_Sel = "" ;
      AV46TFLb_FechaE = GXutil.nullDate() ;
      AV61TFLb_Tipo = "" ;
      AV62TFLb_Tipo_Sel = "" ;
      AV65Pgmname = "" ;
      Gx_date = GXutil.nullDate() ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV50DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      A396EmprCod = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
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
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV34DDO_Lb_cartazfAuxDate = GXutil.nullDate() ;
      AV48DDO_Lb_FechaEAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A279CliNom = "" ;
      A5540Lb_Cartaz = "" ;
      A5594Lb_cartazf = GXutil.nullDate() ;
      A5533Lb_ArtCod = "" ;
      A5534Lb_ArtDsc = "" ;
      A5538Lb_ColNomC = "" ;
      A5536Lb_ColNom = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5570Lb_Tipo = "" ;
      AV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = "" ;
      AV70Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = "" ;
      AV71Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel = "" ;
      AV74Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = "" ;
      AV75Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel = "" ;
      AV76Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf = GXutil.nullDate() ;
      AV77Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = "" ;
      AV78Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel = "" ;
      AV79Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = "" ;
      AV80Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel = "" ;
      AV81Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = "" ;
      AV82Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel = "" ;
      AV83Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = "" ;
      AV84Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel = "" ;
      AV87Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae = GXutil.nullDate() ;
      AV88Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = "" ;
      AV89Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel = "" ;
      scmdbuf = "" ;
      lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext = "" ;
      lV70Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom = "" ;
      lV74Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz = "" ;
      lV77Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod = "" ;
      lV79Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc = "" ;
      lV81Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc = "" ;
      lV83Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom = "" ;
      lV88Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo = "" ;
      H01UY2_A252CliCod = new int[1] ;
      H01UY2_A5569Lb_EstEns = new byte[1] ;
      H01UY2_A5570Lb_Tipo = new String[] {""} ;
      H01UY2_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      H01UY2_A5537Lb_ColNum = new int[1] ;
      H01UY2_A5536Lb_ColNom = new String[] {""} ;
      H01UY2_A5538Lb_ColNomC = new String[] {""} ;
      H01UY2_A5534Lb_ArtDsc = new String[] {""} ;
      H01UY2_A5533Lb_ArtCod = new String[] {""} ;
      H01UY2_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      H01UY2_A5540Lb_Cartaz = new String[] {""} ;
      H01UY2_A279CliNom = new String[] {""} ;
      H01UY2_A5532Lb_numero = new int[1] ;
      H01UY2_A396EmprCod = new String[] {""} ;
      H01UY3_A252CliCod = new int[1] ;
      H01UY3_A5569Lb_EstEns = new byte[1] ;
      H01UY3_A5570Lb_Tipo = new String[] {""} ;
      H01UY3_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      H01UY3_A5537Lb_ColNum = new int[1] ;
      H01UY3_A5536Lb_ColNom = new String[] {""} ;
      H01UY3_A5538Lb_ColNomC = new String[] {""} ;
      H01UY3_A5534Lb_ArtDsc = new String[] {""} ;
      H01UY3_A5533Lb_ArtCod = new String[] {""} ;
      H01UY3_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      H01UY3_A5540Lb_Cartaz = new String[] {""} ;
      H01UY3_A279CliNom = new String[] {""} ;
      H01UY3_A5532Lb_numero = new int[1] ;
      H01UY3_A396EmprCod = new String[] {""} ;
      GXv_int3 = new int[1] ;
      GXv_int4 = new byte[1] ;
      hsh = "" ;
      AV66Station = "" ;
      AV67Emprnom = "" ;
      AV68Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext10 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV22Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV24ManageFiltersXml = "" ;
      AV16ExcelFilename = "" ;
      AV17ErrorMessage = "" ;
      AV19UserCustomValue = "" ;
      AV21ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char23 = "" ;
      GXv_char24 = new String[1] ;
      GXt_char21 = "" ;
      GXv_char22 = new String[1] ;
      GXt_char19 = "" ;
      GXv_char20 = new String[1] ;
      GXt_char17 = "" ;
      GXv_char18 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char7 = new String[1] ;
      GXt_char15 = "" ;
      GXv_char6 = new String[1] ;
      GXt_char5 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState25 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV56emprcod = "" ;
      sCtrlAV57Clicod = "" ;
      sCtrlAV58lb_fechaefrom = "" ;
      sCtrlAV59lb_fechaeto = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.ensayospendientesenvio_wc__default(),
         new Object[] {
             new Object[] {
            H01UY2_A252CliCod, H01UY2_A5569Lb_EstEns, H01UY2_A5570Lb_Tipo, H01UY2_A5541Lb_FechaE, H01UY2_A5537Lb_ColNum, H01UY2_A5536Lb_ColNom, H01UY2_A5538Lb_ColNomC, H01UY2_A5534Lb_ArtDsc, H01UY2_A5533Lb_ArtCod, H01UY2_A5594Lb_cartazf,
            H01UY2_A5540Lb_Cartaz, H01UY2_A279CliNom, H01UY2_A5532Lb_numero, H01UY2_A396EmprCod
            }
            , new Object[] {
            H01UY3_A252CliCod, H01UY3_A5569Lb_EstEns, H01UY3_A5570Lb_Tipo, H01UY3_A5541Lb_FechaE, H01UY3_A5537Lb_ColNum, H01UY3_A5536Lb_ColNom, H01UY3_A5538Lb_ColNomC, H01UY3_A5534Lb_ArtDsc, H01UY3_A5533Lb_ArtCod, H01UY3_A5594Lb_cartazf,
            H01UY3_A5540Lb_Cartaz, H01UY3_A279CliNom, H01UY3_A5532Lb_numero, H01UY3_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV65Pgmname = "GestionLaboratorio.EnsayosPendientesEnvio_WC" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV65Pgmname = "GestionLaboratorio.EnsayosPendientesEnvio_WC" ;
      Gx_err = (short)(0) ;
      edtavDias_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A14098Lb_Enviado ;
   private byte nDonePA ;
   private byte A5569Lb_EstEns ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int1 ;
   private byte GXv_int4[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV60Dias ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV57Clicod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_41 ;
   private int AV57Clicod ;
   private int nGXsfl_41_idx=1 ;
   private int AV28TFLb_numero ;
   private int AV29TFLb_numero_To ;
   private int AV44TFLb_ColNum ;
   private int AV45TFLb_ColNum_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A5532Lb_numero ;
   private int A5537Lb_ColNum ;
   private int subGrid_Islastpage ;
   private int edtavDias_Enabled ;
   private int AV72Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero ;
   private int AV73Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to ;
   private int AV85Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum ;
   private int AV86Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to ;
   private int A252CliCod ;
   private int GXv_int3[] ;
   private int edtCliNom_Visible ;
   private int edtLb_numero_Visible ;
   private int edtLb_Cartaz_Visible ;
   private int edtLb_cartazf_Visible ;
   private int edtLb_ArtCod_Visible ;
   private int edtLb_ArtDsc_Visible ;
   private int edtLb_ColNomC_Visible ;
   private int edtLb_ColNom_Visible ;
   private int edtLb_ColNum_Visible ;
   private int edtLb_FechaE_Visible ;
   private int edtLb_Tipo_Visible ;
   private int edtavDias_Visible ;
   private int AV51PageToGo ;
   private int AV91GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV52GridCurrentPage ;
   private long AV53GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV56emprcod ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV56emprcod ;
   private String sGXsfl_41_idx="0001" ;
   private String AV26TFCliNom ;
   private String AV27TFCliNom_Sel ;
   private String AV30TFLb_Cartaz ;
   private String AV31TFLb_Cartaz_Sel ;
   private String AV36TFLb_ArtCod ;
   private String AV37TFLb_ArtCod_Sel ;
   private String AV38TFLb_ArtDsc ;
   private String AV39TFLb_ArtDsc_Sel ;
   private String AV40TFLb_ColNomC ;
   private String AV41TFLb_ColNomC_Sel ;
   private String AV42TFLb_ColNom ;
   private String AV43TFLb_ColNom_Sel ;
   private String AV61TFLb_Tipo ;
   private String AV62TFLb_Tipo_Sel ;
   private String AV65Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
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
   private String Ddo_grid_Filteredtext_set ;
   private String Ddo_grid_Filteredtextto_set ;
   private String Ddo_grid_Selectedvalue_set ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Fixable ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
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
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_lb_cartazfauxdates_Internalname ;
   private String edtavDdo_lb_cartazfauxdate_Internalname ;
   private String edtavDdo_lb_cartazfauxdate_Jsonclick ;
   private String divDdo_lb_fechaeauxdates_Internalname ;
   private String edtavDdo_lb_fechaeauxdate_Internalname ;
   private String edtavDdo_lb_fechaeauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String edtLb_numero_Internalname ;
   private String A5540Lb_Cartaz ;
   private String edtLb_Cartaz_Internalname ;
   private String edtLb_cartazf_Internalname ;
   private String A5533Lb_ArtCod ;
   private String edtLb_ArtCod_Internalname ;
   private String A5534Lb_ArtDsc ;
   private String edtLb_ArtDsc_Internalname ;
   private String A5538Lb_ColNomC ;
   private String edtLb_ColNomC_Internalname ;
   private String A5536Lb_ColNom ;
   private String edtLb_ColNom_Internalname ;
   private String edtLb_ColNum_Internalname ;
   private String edtLb_FechaE_Internalname ;
   private String A5570Lb_Tipo ;
   private String edtLb_Tipo_Internalname ;
   private String edtavDias_Internalname ;
   private String edtLb_Enviado_Internalname ;
   private String AV70Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom ;
   private String AV71Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel ;
   private String AV74Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz ;
   private String AV75Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel ;
   private String AV77Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod ;
   private String AV78Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel ;
   private String AV79Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc ;
   private String AV80Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel ;
   private String AV81Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc ;
   private String AV82Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel ;
   private String AV83Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom ;
   private String AV84Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel ;
   private String AV88Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo ;
   private String AV89Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel ;
   private String scmdbuf ;
   private String lV70Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom ;
   private String lV74Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz ;
   private String lV77Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod ;
   private String lV79Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc ;
   private String lV81Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc ;
   private String lV83Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom ;
   private String lV88Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo ;
   private String hsh ;
   private String AV66Station ;
   private String AV67Emprnom ;
   private String AV68Usurcod ;
   private String GXt_char23 ;
   private String GXv_char24[] ;
   private String GXt_char21 ;
   private String GXv_char22[] ;
   private String GXt_char19 ;
   private String GXv_char20[] ;
   private String GXt_char17 ;
   private String GXv_char18[] ;
   private String GXt_char16 ;
   private String GXv_char7[] ;
   private String GXt_char15 ;
   private String GXv_char6[] ;
   private String GXt_char5 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV56emprcod ;
   private String sCtrlAV57Clicod ;
   private String sCtrlAV58lb_fechaefrom ;
   private String sCtrlAV59lb_fechaeto ;
   private String sGXsfl_41_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtCliNom_Jsonclick ;
   private String edtLb_numero_Jsonclick ;
   private String edtLb_Cartaz_Jsonclick ;
   private String edtLb_cartazf_Jsonclick ;
   private String edtLb_ArtCod_Jsonclick ;
   private String edtLb_ArtDsc_Jsonclick ;
   private String edtLb_ColNomC_Jsonclick ;
   private String edtLb_ColNom_Jsonclick ;
   private String edtLb_ColNum_Jsonclick ;
   private String edtLb_FechaE_Jsonclick ;
   private String edtLb_Tipo_Jsonclick ;
   private String edtavDias_Jsonclick ;
   private String edtLb_Enviado_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV58lb_fechaefrom ;
   private java.util.Date wcpOAV59lb_fechaeto ;
   private java.util.Date AV58lb_fechaefrom ;
   private java.util.Date AV59lb_fechaeto ;
   private java.util.Date AV32TFLb_cartazf ;
   private java.util.Date AV46TFLb_FechaE ;
   private java.util.Date Gx_date ;
   private java.util.Date AV34DDO_Lb_cartazfAuxDate ;
   private java.util.Date AV48DDO_Lb_FechaEAuxDate ;
   private java.util.Date A5594Lb_cartazf ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date AV76Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf ;
   private java.util.Date AV87Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
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
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String AV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext ;
   private String lV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext ;
   private String AV16ExcelFilename ;
   private String AV17ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private int[] H01UY2_A252CliCod ;
   private byte[] H01UY2_A5569Lb_EstEns ;
   private String[] H01UY2_A5570Lb_Tipo ;
   private java.util.Date[] H01UY2_A5541Lb_FechaE ;
   private int[] H01UY2_A5537Lb_ColNum ;
   private String[] H01UY2_A5536Lb_ColNom ;
   private String[] H01UY2_A5538Lb_ColNomC ;
   private String[] H01UY2_A5534Lb_ArtDsc ;
   private String[] H01UY2_A5533Lb_ArtCod ;
   private java.util.Date[] H01UY2_A5594Lb_cartazf ;
   private String[] H01UY2_A5540Lb_Cartaz ;
   private String[] H01UY2_A279CliNom ;
   private int[] H01UY2_A5532Lb_numero ;
   private String[] H01UY2_A396EmprCod ;
   private int[] H01UY3_A252CliCod ;
   private byte[] H01UY3_A5569Lb_EstEns ;
   private String[] H01UY3_A5570Lb_Tipo ;
   private java.util.Date[] H01UY3_A5541Lb_FechaE ;
   private int[] H01UY3_A5537Lb_ColNum ;
   private String[] H01UY3_A5536Lb_ColNom ;
   private String[] H01UY3_A5538Lb_ColNomC ;
   private String[] H01UY3_A5534Lb_ArtDsc ;
   private String[] H01UY3_A5533Lb_ArtCod ;
   private java.util.Date[] H01UY3_A5594Lb_cartazf ;
   private String[] H01UY3_A5540Lb_Cartaz ;
   private String[] H01UY3_A279CliNom ;
   private int[] H01UY3_A5532Lb_numero ;
   private String[] H01UY3_A396EmprCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item13 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item14[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext10[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState25[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV50DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9[] ;
}

final  class ensayospendientesenvio_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01UY2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext ,
                                          String AV71Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel ,
                                          String AV70Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom ,
                                          int AV72Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero ,
                                          int AV73Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to ,
                                          String AV75Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel ,
                                          String AV74Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz ,
                                          java.util.Date AV76Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf ,
                                          String AV78Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel ,
                                          String AV77Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod ,
                                          String AV80Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel ,
                                          String AV79Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc ,
                                          String AV82Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel ,
                                          String AV81Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc ,
                                          String AV84Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel ,
                                          String AV83Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom ,
                                          int AV85Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum ,
                                          int AV86Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to ,
                                          java.util.Date AV87Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae ,
                                          String AV89Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel ,
                                          String AV88Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo ,
                                          int AV57Clicod ,
                                          java.util.Date AV58lb_fechaefrom ,
                                          java.util.Date AV59lb_fechaeto ,
                                          String A279CliNom ,
                                          int A5532Lb_numero ,
                                          String A5540Lb_Cartaz ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5538Lb_ColNomC ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          String A5570Lb_Tipo ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5541Lb_FechaE ,
                                          int A252CliCod ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          byte A5569Lb_EstEns ,
                                          byte A14098Lb_Enviado ,
                                          String AV56emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[33];
      Object[] GXv_Object27 = new Object[2];
      scmdbuf = "SELECT T1.CliCod, T1.Lb_EstEns, T1.Lb_Tipo, T1.Lb_FechaE, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_ColNomC, T1.Lb_ArtDsc, T1.Lb_ArtCod, T1.Lb_cartazf, T1.Lb_Cartaz, T2.CliNom," ;
      scmdbuf += " T1.Lb_numero, T1.EmprCod FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_EstEns = 0)");
      if ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Tipo) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int26[1] = (byte)(1) ;
         GXv_int26[2] = (byte)(1) ;
         GXv_int26[3] = (byte)(1) ;
         GXv_int26[4] = (byte)(1) ;
         GXv_int26[5] = (byte)(1) ;
         GXv_int26[6] = (byte)(1) ;
         GXv_int26[7] = (byte)(1) ;
         GXv_int26[8] = (byte)(1) ;
         GXv_int26[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV70Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int26[11] = (byte)(1) ;
      }
      if ( ! (0==AV72Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int26[12] = (byte)(1) ;
      }
      if ( ! (0==AV73Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int26[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int26[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int26[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV77Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int26[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV79Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int26[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV81Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int26[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV83Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int26[24] = (byte)(1) ;
      }
      if ( ! (0==AV85Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int26[25] = (byte)(1) ;
      }
      if ( ! (0==AV86Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int26[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int26[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel)==0) && ( ! (GXutil.strcmp("", AV88Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Tipo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Tipo = ?)");
      }
      else
      {
         GXv_int26[29] = (byte)(1) ;
      }
      if ( ! (0==AV57Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int26[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58lb_fechaefrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int26[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59lb_fechaeto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int26[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtCod" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_numero" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_numero DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_Cartaz" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_Cartaz DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_cartazf" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_cartazf DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtDsc" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNomC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNomC DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNom" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNum" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaE" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaE DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_Tipo" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_Tipo DESC" ;
      }
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
   }

   protected Object[] conditional_H01UY3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext ,
                                          String AV71Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel ,
                                          String AV70Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom ,
                                          int AV72Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero ,
                                          int AV73Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to ,
                                          String AV75Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel ,
                                          String AV74Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz ,
                                          java.util.Date AV76Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf ,
                                          String AV78Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel ,
                                          String AV77Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod ,
                                          String AV80Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel ,
                                          String AV79Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc ,
                                          String AV82Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel ,
                                          String AV81Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc ,
                                          String AV84Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel ,
                                          String AV83Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom ,
                                          int AV85Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum ,
                                          int AV86Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to ,
                                          java.util.Date AV87Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae ,
                                          String AV89Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel ,
                                          String AV88Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo ,
                                          int AV57Clicod ,
                                          java.util.Date AV58lb_fechaefrom ,
                                          java.util.Date AV59lb_fechaeto ,
                                          String A279CliNom ,
                                          int A5532Lb_numero ,
                                          String A5540Lb_Cartaz ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5538Lb_ColNomC ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          String A5570Lb_Tipo ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5541Lb_FechaE ,
                                          int A252CliCod ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          byte A5569Lb_EstEns ,
                                          byte A14098Lb_Enviado ,
                                          String AV56emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int28 = new byte[33];
      Object[] GXv_Object29 = new Object[2];
      scmdbuf = "SELECT T1.CliCod, T1.Lb_EstEns, T1.Lb_Tipo, T1.Lb_FechaE, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_ColNomC, T1.Lb_ArtDsc, T1.Lb_ArtCod, T1.Lb_cartazf, T1.Lb_Cartaz, T2.CliNom," ;
      scmdbuf += " T1.Lb_numero, T1.EmprCod FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_EstEns = 0)");
      if ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_ensayospendientesenvio_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Tipo) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int28[1] = (byte)(1) ;
         GXv_int28[2] = (byte)(1) ;
         GXv_int28[3] = (byte)(1) ;
         GXv_int28[4] = (byte)(1) ;
         GXv_int28[5] = (byte)(1) ;
         GXv_int28[6] = (byte)(1) ;
         GXv_int28[7] = (byte)(1) ;
         GXv_int28[8] = (byte)(1) ;
         GXv_int28[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV70Gestionlaboratorio_ensayospendientesenvio_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Gestionlaboratorio_ensayospendientesenvio_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int28[11] = (byte)(1) ;
      }
      if ( ! (0==AV72Gestionlaboratorio_ensayospendientesenvio_wcds_4_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int28[12] = (byte)(1) ;
      }
      if ( ! (0==AV73Gestionlaboratorio_ensayospendientesenvio_wcds_5_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int28[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_ensayospendientesenvio_wcds_6_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_ensayospendientesenvio_wcds_7_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int28[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76Gestionlaboratorio_ensayospendientesenvio_wcds_8_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int28[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV77Gestionlaboratorio_ensayospendientesenvio_wcds_9_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Gestionlaboratorio_ensayospendientesenvio_wcds_10_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int28[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV79Gestionlaboratorio_ensayospendientesenvio_wcds_11_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Gestionlaboratorio_ensayospendientesenvio_wcds_12_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int28[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV81Gestionlaboratorio_ensayospendientesenvio_wcds_13_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Gestionlaboratorio_ensayospendientesenvio_wcds_14_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int28[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV83Gestionlaboratorio_ensayospendientesenvio_wcds_15_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Gestionlaboratorio_ensayospendientesenvio_wcds_16_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int28[24] = (byte)(1) ;
      }
      if ( ! (0==AV85Gestionlaboratorio_ensayospendientesenvio_wcds_17_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int28[25] = (byte)(1) ;
      }
      if ( ! (0==AV86Gestionlaboratorio_ensayospendientesenvio_wcds_18_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int28[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87Gestionlaboratorio_ensayospendientesenvio_wcds_19_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int28[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel)==0) && ( ! (GXutil.strcmp("", AV88Gestionlaboratorio_ensayospendientesenvio_wcds_20_tflb_tipo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Tipo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Gestionlaboratorio_ensayospendientesenvio_wcds_21_tflb_tipo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Tipo = ?)");
      }
      else
      {
         GXv_int28[29] = (byte)(1) ;
      }
      if ( ! (0==AV57Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int28[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58lb_fechaefrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int28[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59lb_fechaeto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int28[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtCod" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_numero" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_numero DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_Cartaz" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_Cartaz DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_cartazf" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_cartazf DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtDsc" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNomC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNomC DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNom" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNum" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaE" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaE DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_Tipo" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_Tipo DESC" ;
      }
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
                  return conditional_H01UY2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (java.util.Date)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).shortValue() , ((Boolean) dynConstraints[37]).booleanValue() , ((Number) dynConstraints[38]).byteValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , (String)dynConstraints[41] );
            case 1 :
                  return conditional_H01UY3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (java.util.Date)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).shortValue() , ((Boolean) dynConstraints[37]).booleanValue() , ((Number) dynConstraints[38]).byteValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , (String)dynConstraints[41] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01UY2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01UY3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
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
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[49]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[49]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               return;
      }
   }

}

