package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcconsultadevolucionesalmacentejidoencrudosindetalle_impl extends GXWebComponent
{
   public wcconsultadevolucionesalmacentejidoencrudosindetalle_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcconsultadevolucionesalmacentejidoencrudosindetalle_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcconsultadevolucionesalmacentejidoencrudosindetalle_impl.class ));
   }

   public wcconsultadevolucionesalmacentejidoencrudosindetalle_impl( int remoteHandle ,
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
               AV48Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48Emprcod", AV48Emprcod);
               AV49DevCruFec = localUtil.parseDateParm( httpContext.GetPar( "DevCruFec")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49DevCruFec", localUtil.format(AV49DevCruFec, "99/99/99"));
               AV51DevCruFec_to = localUtil.parseDateParm( httpContext.GetPar( "DevCruFec_to")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51DevCruFec_to", localUtil.format(AV51DevCruFec_to, "99/99/99"));
               AV50Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Clicod), 6, 0));
               AV52Clicod_to = (int)(GXutil.lval( httpContext.GetPar( "Clicod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Clicod_to), 6, 0));
               AV56AlbRef = httpContext.GetPar( "AlbRef") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56AlbRef", AV56AlbRef);
               AV57AlbREnt = httpContext.GetPar( "AlbREnt") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57AlbREnt", AV57AlbREnt);
               AV58AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58AlbRecCod), 8, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV48Emprcod,AV49DevCruFec,AV51DevCruFec_to,Integer.valueOf(AV50Clicod),Integer.valueOf(AV52Clicod_to),AV56AlbRef,AV57AlbREnt,Integer.valueOf(AV58AlbRecCod)});
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
      nRC_GXsfl_43 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_43"))) ;
      nGXsfl_43_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_43_idx"))) ;
      sGXsfl_43_idx = httpContext.GetPar( "sGXsfl_43_idx") ;
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
      AV48Emprcod = httpContext.GetPar( "Emprcod") ;
      AV49DevCruFec = localUtil.parseDateParm( httpContext.GetPar( "DevCruFec")) ;
      AV51DevCruFec_to = localUtil.parseDateParm( httpContext.GetPar( "DevCruFec_to")) ;
      AV50Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
      AV52Clicod_to = (int)(GXutil.lval( httpContext.GetPar( "Clicod_to"))) ;
      AV56AlbRef = httpContext.GetPar( "AlbRef") ;
      AV57AlbREnt = httpContext.GetPar( "AlbREnt") ;
      AV58AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV26TFDevCruId = (int)(GXutil.lval( httpContext.GetPar( "TFDevCruId"))) ;
      AV27TFDevCruId_To = (int)(GXutil.lval( httpContext.GetPar( "TFDevCruId_To"))) ;
      AV28TFDevCruFec = localUtil.parseDateParm( httpContext.GetPar( "TFDevCruFec")) ;
      AV32TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV33TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV34TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV35TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV36TFTrnCod = (short)(GXutil.lval( httpContext.GetPar( "TFTrnCod"))) ;
      AV37TFTrnCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFTrnCod_To"))) ;
      AV38TFTrnNom = httpContext.GetPar( "TFTrnNom") ;
      AV39TFTrnNom_Sel = httpContext.GetPar( "TFTrnNom_Sel") ;
      AV40TFDevCruMat = httpContext.GetPar( "TFDevCruMat") ;
      AV41TFDevCruMat_Sel = httpContext.GetPar( "TFDevCruMat_Sel") ;
      AV42TFDevCruObs = httpContext.GetPar( "TFDevCruObs") ;
      AV43TFDevCruObs_Sel = httpContext.GetPar( "TFDevCruObs_Sel") ;
      AV80Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV48Emprcod, AV49DevCruFec, AV51DevCruFec_to, AV50Clicod, AV52Clicod_to, AV56AlbRef, AV57AlbREnt, AV58AlbRecCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFDevCruId, AV27TFDevCruId_To, AV28TFDevCruFec, AV32TFCliCod, AV33TFCliCod_To, AV34TFCliNom, AV35TFCliNom_Sel, AV36TFTrnCod, AV37TFTrnCod_To, AV38TFTrnNom, AV39TFTrnNom_Sel, AV40TFDevCruMat, AV41TFDevCruMat_Sel, AV42TFDevCruObs, AV43TFDevCruObs_Sel, AV80Pgmname, AV12OrderedBy, AV13OrderedDsc, A396EmprCod, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa16O2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Devolucion Almacen Tejido Crudo (sin detalle)", "")) ;
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
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcconsultadevolucionesalmacentejidoencrudosindetalle", new String[] {GXutil.URLEncode(GXutil.rtrim(AV48Emprcod)),GXutil.URLEncode(GXutil.formatDateParm(AV49DevCruFec)),GXutil.URLEncode(GXutil.formatDateParm(AV51DevCruFec_to)),GXutil.URLEncode(GXutil.ltrimstr(AV50Clicod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV52Clicod_to,6,0)),GXutil.URLEncode(GXutil.rtrim(AV56AlbRef)),GXutil.URLEncode(GXutil.rtrim(AV57AlbREnt)),GXutil.URLEncode(GXutil.ltrimstr(AV58AlbRecCod,8,0))}, new String[] {"Emprcod","DevCruFec","DevCruFec_to","Clicod","Clicod_to","AlbRef","AlbREnt","AlbRecCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV80Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV15FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_43", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_43, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV46GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV47GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV44DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV44DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV48Emprcod", GXutil.rtrim( wcpOAV48Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV49DevCruFec", localUtil.dtoc( wcpOAV49DevCruFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV51DevCruFec_to", localUtil.dtoc( wcpOAV51DevCruFec_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV50Clicod", GXutil.ltrim( localUtil.ntoc( wcpOAV50Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV52Clicod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV52Clicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV56AlbRef", GXutil.rtrim( wcpOAV56AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV57AlbREnt", GXutil.rtrim( wcpOAV57AlbREnt));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV58AlbRecCod", GXutil.ltrim( localUtil.ntoc( wcpOAV58AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV25ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDEVCRUID", GXutil.ltrim( localUtil.ntoc( AV26TFDevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDEVCRUID_TO", GXutil.ltrim( localUtil.ntoc( AV27TFDevCruId_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDEVCRUFEC", localUtil.dtoc( AV28TFDevCruFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV32TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV33TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM", GXutil.rtrim( AV34TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM_SEL", GXutil.rtrim( AV35TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTRNCOD", GXutil.ltrim( localUtil.ntoc( AV36TFTrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTRNCOD_TO", GXutil.ltrim( localUtil.ntoc( AV37TFTrnCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTRNNOM", GXutil.rtrim( AV38TFTrnNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTRNNOM_SEL", GXutil.rtrim( AV39TFTrnNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDEVCRUMAT", GXutil.rtrim( AV40TFDevCruMat));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDEVCRUMAT_SEL", GXutil.rtrim( AV41TFDevCruMat_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDEVCRUOBS", AV42TFDevCruObs);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDEVCRUOBS_SEL", AV43TFDevCruObs_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV80Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV80Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV48Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDEVCRUFEC", localUtil.dtoc( AV49DevCruFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDEVCRUFEC_TO", localUtil.dtoc( AV51DevCruFec_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV50Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV52Clicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBREF", GXutil.rtrim( AV56AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRENT", GXutil.rtrim( AV57AlbREnt));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV58AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Width", GXutil.rtrim( Innewwindow1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Height", GXutil.rtrim( Innewwindow1_Height));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Target", GXutil.rtrim( Innewwindow1_Target));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
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

   public void renderHtmlCloseForm16O2( )
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
         if ( ! ( WebComp_Grid_dwc == null ) )
         {
            WebComp_Grid_dwc.componentjscripts();
         }
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
      return "WCConsultaDevolucionesAlmacenTejidoencrudosindetalle" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Devolucion Almacen Tejido Crudo (sin detalle)", "") ;
   }

   public void wb16O0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcconsultadevolucionesalmacentejidoencrudosindetalle");
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
            httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCConsultaDevolucionesAlmacenTejidoencrudosindetalle.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 7, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e1116o1_client"+"'", TempTags, "", 2, "HLP_WCConsultaDevolucionesAlmacenTejidoencrudosindetalle.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCConsultaDevolucionesAlmacenTejidoencrudosindetalle.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCConsultaDevolucionesAlmacenTejidoencrudosindetalle.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_16O2( true) ;
      }
      else
      {
         wb_table1_25_16O2( false) ;
      }
      return  ;
   }

   public void wb_table1_25_16O2e( boolean wbgen )
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
         startgridcontrol43( ) ;
      }
      if ( wbEnd == 43 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_43 = (int)(nGXsfl_43_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV46GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV47GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divCell_grid_dwc_Internalname, 1, 0, "px", 0, "px", divCell_grid_dwc_Class, "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0060"+"", GXutil.rtrim( WebComp_Grid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0060"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_43_Refreshing )
            {
               if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0060"+"");
                  }
                  WebComp_Grid_dwc.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspEndCmp();
                  }
               }
            }
            httpContext.writeText( "</div>") ;
         }
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
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV44DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, sPrefix+"INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV44DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, sPrefix+"GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_devcrufecauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_devcrufecauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_devcrufecauxdate_Internalname, localUtil.format(AV30DDO_DevCruFecAuxDate, "99/99/99"), localUtil.format( AV30DDO_DevCruFecAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,70);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_devcrufecauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCConsultaDevolucionesAlmacenTejidoencrudosindetalle.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_devcrufecauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WCConsultaDevolucionesAlmacenTejidoencrudosindetalle.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 43 )
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

   public void start16O2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Devolucion Almacen Tejido Crudo (sin detalle)", ""), (short)(0)) ;
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
            strup16O0( ) ;
         }
      }
   }

   public void ws16O2( )
   {
      start16O2( ) ;
      evt16O2( ) ;
   }

   public void evt16O2( )
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
                              strup16O0( ) ;
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
                              strup16O0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1216O2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup16O0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1316O2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup16O0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1416O2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup16O0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1516O2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup16O0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1616O2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup16O0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e1716O2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup16O0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e1816O2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup16O0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavDetailwebcomponent_Internalname ;
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
                              strup16O0( ) ;
                           }
                           nGXsfl_43_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_432( ) ;
                           AV53DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV53DetailWebComponent);
                           A11669DevCruId = (int)(localUtil.ctol( httpContext.cgiGet( edtDevCruId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A11670DevCruFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtDevCruFec_Internalname), 0)) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n840TrnCod = false ;
                           A841TrnNom = httpContext.cgiGet( edtTrnNom_Internalname) ;
                           n841TrnNom = false ;
                           A11672DevCruMat = httpContext.cgiGet( edtDevCruMat_Internalname) ;
                           A11682DevCruObs = httpContext.cgiGet( edtDevCruObs_Internalname) ;
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavDevcruund_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDevcruund_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDEVCRUUND");
                              GX_FocusControl = edtavDevcruund_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV54DevCruUnd = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDevcruund_Internalname, GXutil.ltrimstr( AV54DevCruUnd, 9, 2));
                           }
                           else
                           {
                              AV54DevCruUnd = localUtil.ctond( httpContext.cgiGet( edtavDevcruund_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDevcruund_Internalname, GXutil.ltrimstr( AV54DevCruUnd, 9, 2));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavDevcrupzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavDevcrupzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDEVCRUPZS");
                              GX_FocusControl = edtavDevcrupzs_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV55DevCruPzs = 0 ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDevcrupzs_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55DevCruPzs), 6, 0));
                           }
                           else
                           {
                              AV55DevCruPzs = (int)(localUtil.ctol( httpContext.cgiGet( edtavDevcrupzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDevcrupzs_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55DevCruPzs), 6, 0));
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
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e1916O2 ();
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
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e2016O2 ();
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
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e2116O2 ();
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
                                    strup16O0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
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
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 60 )
                     {
                        OldGrid_dwc = httpContext.cgiGet( sPrefix+"W0060") ;
                        if ( ( GXutil.len( OldGrid_dwc) == 0 ) || ( GXutil.strcmp(OldGrid_dwc, WebComp_Grid_dwc_Component) != 0 ) )
                        {
                           WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldGrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Grid_dwc_Component = OldGrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
                        {
                           WebComp_Grid_dwc.componentprocess(sPrefix+"W0060", "", sEvt);
                        }
                        WebComp_Grid_dwc_Component = OldGrid_dwc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we16O2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm16O2( ) ;
         }
      }
   }

   public void pa16O2( )
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
      subsflControlProps_432( ) ;
      while ( nGXsfl_43_idx <= nRC_GXsfl_43 )
      {
         sendrow_432( ) ;
         nGXsfl_43_idx = ((subGrid_Islastpage==1)&&(nGXsfl_43_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV15FilterFullText ,
                                 String AV48Emprcod ,
                                 java.util.Date AV49DevCruFec ,
                                 java.util.Date AV51DevCruFec_to ,
                                 int AV50Clicod ,
                                 int AV52Clicod_to ,
                                 String AV56AlbRef ,
                                 String AV57AlbREnt ,
                                 int AV58AlbRecCod ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 int AV26TFDevCruId ,
                                 int AV27TFDevCruId_To ,
                                 java.util.Date AV28TFDevCruFec ,
                                 int AV32TFCliCod ,
                                 int AV33TFCliCod_To ,
                                 String AV34TFCliNom ,
                                 String AV35TFCliNom_Sel ,
                                 short AV36TFTrnCod ,
                                 short AV37TFTrnCod_To ,
                                 String AV38TFTrnNom ,
                                 String AV39TFTrnNom_Sel ,
                                 String AV40TFDevCruMat ,
                                 String AV41TFDevCruMat_Sel ,
                                 String AV42TFDevCruObs ,
                                 String AV43TFDevCruObs_Sel ,
                                 String AV80Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String A396EmprCod ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2016O2 ();
      GRID_nCurrentRecord = 0 ;
      rf16O2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVCRUID", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A11669DevCruId), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVCRUID", GXutil.ltrim( localUtil.ntoc( A11669DevCruId, (byte)(8), (byte)(0), ".", "")));
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
      rf16O2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV80Pgmname = "WCConsultaDevolucionesAlmacenTejidoencrudosindetalle" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavDevcruund_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDevcruund_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDevcruund_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavDevcrupzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDevcrupzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDevcrupzs_Enabled), 5, 0), !bGXsfl_43_Refreshing);
   }

   public void rf16O2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(43) ;
      /* Execute user event: Refresh */
      e2016O2 ();
      nGXsfl_43_idx = 1 ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_432( ) ;
      bGXsfl_43_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
            {
               WebComp_Grid_dwc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_432( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext ,
                                              Integer.valueOf(AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid) ,
                                              Integer.valueOf(AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to) ,
                                              AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec ,
                                              Integer.valueOf(AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod) ,
                                              Integer.valueOf(AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to) ,
                                              AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel ,
                                              AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom ,
                                              Short.valueOf(AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod) ,
                                              Short.valueOf(AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to) ,
                                              AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel ,
                                              AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom ,
                                              AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel ,
                                              AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat ,
                                              AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel ,
                                              AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs ,
                                              Integer.valueOf(AV50Clicod) ,
                                              Integer.valueOf(AV52Clicod_to) ,
                                              AV49DevCruFec ,
                                              AV51DevCruFec_to ,
                                              Integer.valueOf(AV58AlbRecCod) ,
                                              AV56AlbRef ,
                                              AV57AlbREnt ,
                                              Integer.valueOf(A11669DevCruId) ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              Short.valueOf(A840TrnCod) ,
                                              A841TrnNom ,
                                              A11672DevCruMat ,
                                              A11682DevCruObs ,
                                              A11670DevCruFec ,
                                              Integer.valueOf(A44AlbRecCod) ,
                                              A45AlbRef ,
                                              A46AlbREnt ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV48Emprcod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
         lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
         lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
         lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
         lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
         lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
         lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
         lV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom = GXutil.padr( GXutil.rtrim( AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom), 30, "%") ;
         lV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom = GXutil.padr( GXutil.rtrim( AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom), 30, "%") ;
         lV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat = GXutil.padr( GXutil.rtrim( AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat), 20, "%") ;
         lV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs = GXutil.concat( GXutil.rtrim( AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs), "%", "") ;
         lV56AlbRef = GXutil.padr( GXutil.rtrim( AV56AlbRef), 16, "%") ;
         lV57AlbREnt = GXutil.padr( GXutil.rtrim( AV57AlbREnt), 8, "%") ;
         /* Using cursor H016O3 */
         pr_default.execute(0, new Object[] {AV48Emprcod, lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, Integer.valueOf(AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid), Integer.valueOf(AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to), AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec, Integer.valueOf(AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod), Integer.valueOf(AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to), lV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom, AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel, Short.valueOf(AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod), Short.valueOf(AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to), lV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom, AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel, lV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat, AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel, lV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs, AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel, Integer.valueOf(AV50Clicod), Integer.valueOf(AV52Clicod_to), AV49DevCruFec, AV51DevCruFec_to, Integer.valueOf(AV58AlbRecCod), lV56AlbRef, lV57AlbREnt, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_43_idx = 1 ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A46AlbREnt = H016O3_A46AlbREnt[0] ;
            A45AlbRef = H016O3_A45AlbRef[0] ;
            A44AlbRecCod = H016O3_A44AlbRecCod[0] ;
            A396EmprCod = H016O3_A396EmprCod[0] ;
            A11682DevCruObs = H016O3_A11682DevCruObs[0] ;
            A11672DevCruMat = H016O3_A11672DevCruMat[0] ;
            A841TrnNom = H016O3_A841TrnNom[0] ;
            n841TrnNom = H016O3_n841TrnNom[0] ;
            A840TrnCod = H016O3_A840TrnCod[0] ;
            n840TrnCod = H016O3_n840TrnCod[0] ;
            A279CliNom = H016O3_A279CliNom[0] ;
            A252CliCod = H016O3_A252CliCod[0] ;
            A11670DevCruFec = H016O3_A11670DevCruFec[0] ;
            A11669DevCruId = H016O3_A11669DevCruId[0] ;
            A40000GXC1 = H016O3_A40000GXC1[0] ;
            n40000GXC1 = H016O3_n40000GXC1[0] ;
            A40001GXC2 = H016O3_A40001GXC2[0] ;
            n40001GXC2 = H016O3_n40001GXC2[0] ;
            A46AlbREnt = H016O3_A46AlbREnt[0] ;
            A45AlbRef = H016O3_A45AlbRef[0] ;
            A840TrnCod = H016O3_A840TrnCod[0] ;
            n840TrnCod = H016O3_n840TrnCod[0] ;
            A252CliCod = H016O3_A252CliCod[0] ;
            A279CliNom = H016O3_A279CliNom[0] ;
            A841TrnNom = H016O3_A841TrnNom[0] ;
            n841TrnNom = H016O3_n841TrnNom[0] ;
            A11682DevCruObs = H016O3_A11682DevCruObs[0] ;
            A11672DevCruMat = H016O3_A11672DevCruMat[0] ;
            A11670DevCruFec = H016O3_A11670DevCruFec[0] ;
            A40000GXC1 = H016O3_A40000GXC1[0] ;
            n40000GXC1 = H016O3_n40000GXC1[0] ;
            A40001GXC2 = H016O3_A40001GXC2[0] ;
            n40001GXC2 = H016O3_n40001GXC2[0] ;
            e2116O2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(43) ;
         wb16O0( ) ;
      }
      bGXsfl_43_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes16O2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV80Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV80Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_DEVCRUID"+"_"+sGXsfl_43_idx, getSecureSignedToken( sPrefix+sGXsfl_43_idx, localUtil.format( DecimalUtil.doubleToDec(A11669DevCruId), "ZZZZZZZ9")));
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
      AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = AV15FilterFullText ;
      AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid = AV26TFDevCruId ;
      AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to = AV27TFDevCruId_To ;
      AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec = AV28TFDevCruFec ;
      AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod = AV32TFCliCod ;
      AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to = AV33TFCliCod_To ;
      AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom = AV34TFCliNom ;
      AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel = AV35TFCliNom_Sel ;
      AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod = AV36TFTrnCod ;
      AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to = AV37TFTrnCod_To ;
      AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom = AV38TFTrnNom ;
      AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel = AV39TFTrnNom_Sel ;
      AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat = AV40TFDevCruMat ;
      AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel = AV41TFDevCruMat_Sel ;
      AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs = AV42TFDevCruObs ;
      AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel = AV43TFDevCruObs_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext ,
                                           Integer.valueOf(AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid) ,
                                           Integer.valueOf(AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to) ,
                                           AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec ,
                                           Integer.valueOf(AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod) ,
                                           Integer.valueOf(AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to) ,
                                           AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel ,
                                           AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom ,
                                           Short.valueOf(AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod) ,
                                           Short.valueOf(AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to) ,
                                           AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel ,
                                           AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom ,
                                           AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel ,
                                           AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat ,
                                           AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel ,
                                           AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs ,
                                           Integer.valueOf(AV50Clicod) ,
                                           Integer.valueOf(AV52Clicod_to) ,
                                           AV49DevCruFec ,
                                           AV51DevCruFec_to ,
                                           Integer.valueOf(AV58AlbRecCod) ,
                                           AV56AlbRef ,
                                           AV57AlbREnt ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A11672DevCruMat ,
                                           A11682DevCruObs ,
                                           A11670DevCruFec ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A45AlbRef ,
                                           A46AlbREnt ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV48Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext), "%", "") ;
      lV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom = GXutil.padr( GXutil.rtrim( AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom), 30, "%") ;
      lV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom = GXutil.padr( GXutil.rtrim( AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom), 30, "%") ;
      lV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat = GXutil.padr( GXutil.rtrim( AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat), 20, "%") ;
      lV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs = GXutil.concat( GXutil.rtrim( AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs), "%", "") ;
      lV56AlbRef = GXutil.padr( GXutil.rtrim( AV56AlbRef), 16, "%") ;
      lV57AlbREnt = GXutil.padr( GXutil.rtrim( AV57AlbREnt), 8, "%") ;
      /* Using cursor H016O5 */
      pr_default.execute(1, new Object[] {AV48Emprcod, lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext, Integer.valueOf(AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid), Integer.valueOf(AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to), AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec, Integer.valueOf(AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod), Integer.valueOf(AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to), lV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom, AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel, Short.valueOf(AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod), Short.valueOf(AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to), lV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom, AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel, lV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat, AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel, lV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs, AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel, Integer.valueOf(AV50Clicod), Integer.valueOf(AV52Clicod_to), AV49DevCruFec, AV51DevCruFec_to, Integer.valueOf(AV58AlbRecCod), lV56AlbRef, lV57AlbREnt});
      GRID_nRecordCount = H016O5_AGRID_nRecordCount[0] ;
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
      AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = AV15FilterFullText ;
      AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid = AV26TFDevCruId ;
      AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to = AV27TFDevCruId_To ;
      AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec = AV28TFDevCruFec ;
      AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod = AV32TFCliCod ;
      AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to = AV33TFCliCod_To ;
      AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom = AV34TFCliNom ;
      AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel = AV35TFCliNom_Sel ;
      AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod = AV36TFTrnCod ;
      AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to = AV37TFTrnCod_To ;
      AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom = AV38TFTrnNom ;
      AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel = AV39TFTrnNom_Sel ;
      AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat = AV40TFDevCruMat ;
      AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel = AV41TFDevCruMat_Sel ;
      AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs = AV42TFDevCruObs ;
      AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel = AV43TFDevCruObs_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV48Emprcod, AV49DevCruFec, AV51DevCruFec_to, AV50Clicod, AV52Clicod_to, AV56AlbRef, AV57AlbREnt, AV58AlbRecCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFDevCruId, AV27TFDevCruId_To, AV28TFDevCruFec, AV32TFCliCod, AV33TFCliCod_To, AV34TFCliNom, AV35TFCliNom_Sel, AV36TFTrnCod, AV37TFTrnCod_To, AV38TFTrnNom, AV39TFTrnNom_Sel, AV40TFDevCruMat, AV41TFDevCruMat_Sel, AV42TFDevCruObs, AV43TFDevCruObs_Sel, AV80Pgmname, AV12OrderedBy, AV13OrderedDsc, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = AV15FilterFullText ;
      AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid = AV26TFDevCruId ;
      AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to = AV27TFDevCruId_To ;
      AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec = AV28TFDevCruFec ;
      AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod = AV32TFCliCod ;
      AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to = AV33TFCliCod_To ;
      AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom = AV34TFCliNom ;
      AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel = AV35TFCliNom_Sel ;
      AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod = AV36TFTrnCod ;
      AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to = AV37TFTrnCod_To ;
      AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom = AV38TFTrnNom ;
      AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel = AV39TFTrnNom_Sel ;
      AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat = AV40TFDevCruMat ;
      AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel = AV41TFDevCruMat_Sel ;
      AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs = AV42TFDevCruObs ;
      AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel = AV43TFDevCruObs_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV48Emprcod, AV49DevCruFec, AV51DevCruFec_to, AV50Clicod, AV52Clicod_to, AV56AlbRef, AV57AlbREnt, AV58AlbRecCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFDevCruId, AV27TFDevCruId_To, AV28TFDevCruFec, AV32TFCliCod, AV33TFCliCod_To, AV34TFCliNom, AV35TFCliNom_Sel, AV36TFTrnCod, AV37TFTrnCod_To, AV38TFTrnNom, AV39TFTrnNom_Sel, AV40TFDevCruMat, AV41TFDevCruMat_Sel, AV42TFDevCruObs, AV43TFDevCruObs_Sel, AV80Pgmname, AV12OrderedBy, AV13OrderedDsc, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = AV15FilterFullText ;
      AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid = AV26TFDevCruId ;
      AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to = AV27TFDevCruId_To ;
      AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec = AV28TFDevCruFec ;
      AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod = AV32TFCliCod ;
      AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to = AV33TFCliCod_To ;
      AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom = AV34TFCliNom ;
      AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel = AV35TFCliNom_Sel ;
      AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod = AV36TFTrnCod ;
      AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to = AV37TFTrnCod_To ;
      AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom = AV38TFTrnNom ;
      AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel = AV39TFTrnNom_Sel ;
      AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat = AV40TFDevCruMat ;
      AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel = AV41TFDevCruMat_Sel ;
      AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs = AV42TFDevCruObs ;
      AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel = AV43TFDevCruObs_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV48Emprcod, AV49DevCruFec, AV51DevCruFec_to, AV50Clicod, AV52Clicod_to, AV56AlbRef, AV57AlbREnt, AV58AlbRecCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFDevCruId, AV27TFDevCruId_To, AV28TFDevCruFec, AV32TFCliCod, AV33TFCliCod_To, AV34TFCliNom, AV35TFCliNom_Sel, AV36TFTrnCod, AV37TFTrnCod_To, AV38TFTrnNom, AV39TFTrnNom_Sel, AV40TFDevCruMat, AV41TFDevCruMat_Sel, AV42TFDevCruObs, AV43TFDevCruObs_Sel, AV80Pgmname, AV12OrderedBy, AV13OrderedDsc, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = AV15FilterFullText ;
      AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid = AV26TFDevCruId ;
      AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to = AV27TFDevCruId_To ;
      AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec = AV28TFDevCruFec ;
      AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod = AV32TFCliCod ;
      AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to = AV33TFCliCod_To ;
      AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom = AV34TFCliNom ;
      AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel = AV35TFCliNom_Sel ;
      AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod = AV36TFTrnCod ;
      AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to = AV37TFTrnCod_To ;
      AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom = AV38TFTrnNom ;
      AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel = AV39TFTrnNom_Sel ;
      AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat = AV40TFDevCruMat ;
      AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel = AV41TFDevCruMat_Sel ;
      AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs = AV42TFDevCruObs ;
      AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel = AV43TFDevCruObs_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV48Emprcod, AV49DevCruFec, AV51DevCruFec_to, AV50Clicod, AV52Clicod_to, AV56AlbRef, AV57AlbREnt, AV58AlbRecCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFDevCruId, AV27TFDevCruId_To, AV28TFDevCruFec, AV32TFCliCod, AV33TFCliCod_To, AV34TFCliNom, AV35TFCliNom_Sel, AV36TFTrnCod, AV37TFTrnCod_To, AV38TFTrnNom, AV39TFTrnNom_Sel, AV40TFDevCruMat, AV41TFDevCruMat_Sel, AV42TFDevCruObs, AV43TFDevCruObs_Sel, AV80Pgmname, AV12OrderedBy, AV13OrderedDsc, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = AV15FilterFullText ;
      AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid = AV26TFDevCruId ;
      AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to = AV27TFDevCruId_To ;
      AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec = AV28TFDevCruFec ;
      AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod = AV32TFCliCod ;
      AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to = AV33TFCliCod_To ;
      AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom = AV34TFCliNom ;
      AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel = AV35TFCliNom_Sel ;
      AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod = AV36TFTrnCod ;
      AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to = AV37TFTrnCod_To ;
      AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom = AV38TFTrnNom ;
      AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel = AV39TFTrnNom_Sel ;
      AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat = AV40TFDevCruMat ;
      AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel = AV41TFDevCruMat_Sel ;
      AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs = AV42TFDevCruObs ;
      AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel = AV43TFDevCruObs_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV48Emprcod, AV49DevCruFec, AV51DevCruFec_to, AV50Clicod, AV52Clicod_to, AV56AlbRef, AV57AlbREnt, AV58AlbRecCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFDevCruId, AV27TFDevCruId_To, AV28TFDevCruFec, AV32TFCliCod, AV33TFCliCod_To, AV34TFCliNom, AV35TFCliNom_Sel, AV36TFTrnCod, AV37TFTrnCod_To, AV38TFTrnNom, AV39TFTrnNom_Sel, AV40TFDevCruMat, AV41TFDevCruMat_Sel, AV42TFDevCruObs, AV43TFDevCruObs_Sel, AV80Pgmname, AV12OrderedBy, AV13OrderedDsc, A396EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV80Pgmname = "WCConsultaDevolucionesAlmacenTejidoencrudosindetalle" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavDevcruund_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDevcruund_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDevcruund_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavDevcrupzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDevcrupzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDevcrupzs_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strup16O0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1916O2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV44DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV46GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV47GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV48Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV48Emprcod") ;
         wcpOAV49DevCruFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV49DevCruFec"), 0) ;
         wcpOAV51DevCruFec_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV51DevCruFec_to"), 0) ;
         wcpOAV50Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV50Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV52Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV52Clicod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV56AlbRef = httpContext.cgiGet( sPrefix+"wcpOAV56AlbRef") ;
         wcpOAV57AlbREnt = httpContext.cgiGet( sPrefix+"wcpOAV57AlbREnt") ;
         wcpOAV58AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV58AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A396EmprCod = httpContext.cgiGet( sPrefix+"EMPRCOD") ;
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
         Innewwindow1_Width = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Width") ;
         Innewwindow1_Height = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Height") ;
         Innewwindow1_Target = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Target") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
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
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_devcrufecauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_DEVCRUFECAUXDATE");
            GX_FocusControl = edtavDdo_devcrufecauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30DDO_DevCruFecAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30DDO_DevCruFecAuxDate", localUtil.format(AV30DDO_DevCruFecAuxDate, "99/99/99"));
         }
         else
         {
            AV30DDO_DevCruFecAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_devcrufecauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30DDO_DevCruFecAuxDate", localUtil.format(AV30DDO_DevCruFecAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
      e1916O2 ();
      if (returnInSub) return;
   }

   public void e1916O2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV59Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcconsultadevolucionesalmacentejidoencrudosindetalle_impl.this.GXt_char1 = GXv_char2[0] ;
      AV59Station = GXt_char1 ;
      GXv_char2[0] = AV48Emprcod ;
      GXv_char3[0] = AV60EmprNom ;
      GXv_char4[0] = AV61UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV59Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcconsultadevolucionesalmacentejidoencrudosindetalle_impl.this.AV48Emprcod = GXv_char2[0] ;
      wcconsultadevolucionesalmacentejidoencrudosindetalle_impl.this.AV60EmprNom = GXv_char3[0] ;
      wcconsultadevolucionesalmacentejidoencrudosindetalle_impl.this.AV61UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48Emprcod", AV48Emprcod);
      divCell_grid_dwc_Class = "Invisible WCD_"+GXutil.upper( subGrid_Internalname) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divCell_grid_dwc_Internalname, "Class", divCell_grid_dwc_Class, true);
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV44DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV44DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e2016O2( )
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
      if ( GXutil.strcmp(AV22Session.getValue("WCConsultaDevolucionesAlmacenTejidoencrudosindetalleColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("WCConsultaDevolucionesAlmacenTejidoencrudosindetalleColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtDevCruId_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDevCruId_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruId_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtDevCruFec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDevCruFec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruFec_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtTrnCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTrnCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtTrnNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTrnNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnNom_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtDevCruMat_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDevCruMat_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruMat_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtDevCruObs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDevCruObs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruObs_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavDevcruund_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDevcruund_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDevcruund_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavDevcrupzs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDevcrupzs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDevcrupzs_Visible), 5, 0), !bGXsfl_43_Refreshing);
      AV46GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46GridCurrentPage), 10, 0));
      AV47GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47GridPageCount), 10, 0));
      AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = AV15FilterFullText ;
      AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid = AV26TFDevCruId ;
      AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to = AV27TFDevCruId_To ;
      AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec = AV28TFDevCruFec ;
      AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod = AV32TFCliCod ;
      AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to = AV33TFCliCod_To ;
      AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom = AV34TFCliNom ;
      AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel = AV35TFCliNom_Sel ;
      AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod = AV36TFTrnCod ;
      AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to = AV37TFTrnCod_To ;
      AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom = AV38TFTrnNom ;
      AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel = AV39TFTrnNom_Sel ;
      AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat = AV40TFDevCruMat ;
      AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel = AV41TFDevCruMat_Sel ;
      AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs = AV42TFDevCruObs ;
      AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel = AV43TFDevCruObs_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e1316O2( )
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
         AV45PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV45PageToGo) ;
      }
   }

   public void e1416O2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1516O2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DevCruId") == 0 )
         {
            AV26TFDevCruId = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFDevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFDevCruId), 8, 0));
            AV27TFDevCruId_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFDevCruId_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFDevCruId_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DevCruFec") == 0 )
         {
            AV28TFDevCruFec = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFDevCruFec", localUtil.format(AV28TFDevCruFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV32TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFCliCod), 6, 0));
            AV33TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV34TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFCliNom", AV34TFCliNom);
            AV35TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFCliNom_Sel", AV35TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TrnCod") == 0 )
         {
            AV36TFTrnCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFTrnCod), 4, 0));
            AV37TFTrnCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFTrnCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFTrnCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TrnNom") == 0 )
         {
            AV38TFTrnNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFTrnNom", AV38TFTrnNom);
            AV39TFTrnNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFTrnNom_Sel", AV39TFTrnNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DevCruMat") == 0 )
         {
            AV40TFDevCruMat = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFDevCruMat", AV40TFDevCruMat);
            AV41TFDevCruMat_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFDevCruMat_Sel", AV41TFDevCruMat_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DevCruObs") == 0 )
         {
            AV42TFDevCruObs = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFDevCruObs", AV42TFDevCruObs);
            AV43TFDevCruObs_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFDevCruObs_Sel", AV43TFDevCruObs_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e2116O2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV53DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV53DetailWebComponent);
      AV54DevCruUnd = A40000GXC1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDevcruund_Internalname, GXutil.ltrimstr( AV54DevCruUnd, 9, 2));
      AV55DevCruPzs = A40001GXC2 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDevcrupzs_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55DevCruPzs), 6, 0));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(43) ;
      }
      sendrow_432( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_43_Refreshing )
      {
         httpContext.doAjaxLoad(43, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e1616O2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WCConsultaDevolucionesAlmacenTejidoencrudosindetalleColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e1216O2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WCConsultaDevolucionesAlmacenTejidoencrudosindetalleFilters")),GXutil.URLEncode(GXutil.rtrim(AV80Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WCConsultaDevolucionesAlmacenTejidoencrudosindetalleFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WCConsultaDevolucionesAlmacenTejidoencrudosindetalleFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         wcconsultadevolucionesalmacentejidoencrudosindetalle_impl.this.GXt_char1 = GXv_char4[0] ;
         AV24ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV24ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV80Pgmname+"GridState", AV24ManageFiltersXml) ;
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

   public void e1716O2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.wcconsultadevolucionesalmacentejidoencrudosindetalleexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      wcconsultadevolucionesalmacentejidoencrudosindetalle_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      wcconsultadevolucionesalmacentejidoencrudosindetalle_impl.this.AV17ErrorMessage = GXv_char3[0] ;
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

   public void e1816O2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.wcconsultadevolucionesalmacentejidoencrudosindetalleexportcsv", new String[] {}, new String[] {}) );
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
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DevCruId", "", "Devolucion Id", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DevCruFec", "", "Fecha Devolucion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliCod", "", "Cliente", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliNom", "", "Nombre Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "TrnCod", "", "Cod Transp", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "TrnNom", "", "Transportista", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DevCruMat", "", "Matricula", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DevCruObs", "", "Observaciones", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&DevCruUnd", "Devolucion", "Unidades", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&DevCruPzs", "Devolucion", "Piezas", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCConsultaDevolucionesAlmacenTejidoencrudosindetalleColumnsSelector", GXv_char4) ;
      wcconsultadevolucionesalmacentejidoencrudosindetalle_impl.this.GXt_char1 = GXv_char4[0] ;
      AV19UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV19UserCustomValue)==0) ) )
      {
         AV21ColumnsSelectorAux.fromxml(AV19UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV21ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV21ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV23ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WCConsultaDevolucionesAlmacenTejidoencrudosindetalleFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
      AV26TFDevCruId = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFDevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFDevCruId), 8, 0));
      AV27TFDevCruId_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFDevCruId_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFDevCruId_To), 8, 0));
      AV28TFDevCruFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFDevCruFec", localUtil.format(AV28TFDevCruFec, "99/99/99"));
      AV32TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFCliCod), 6, 0));
      AV33TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFCliCod_To), 6, 0));
      AV34TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFCliNom", AV34TFCliNom);
      AV35TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFCliNom_Sel", AV35TFCliNom_Sel);
      AV36TFTrnCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFTrnCod), 4, 0));
      AV37TFTrnCod_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFTrnCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFTrnCod_To), 4, 0));
      AV38TFTrnNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFTrnNom", AV38TFTrnNom);
      AV39TFTrnNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFTrnNom_Sel", AV39TFTrnNom_Sel);
      AV40TFDevCruMat = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFDevCruMat", AV40TFDevCruMat);
      AV41TFDevCruMat_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFDevCruMat_Sel", AV41TFDevCruMat_Sel);
      AV42TFDevCruObs = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFDevCruObs", AV42TFDevCruObs);
      AV43TFDevCruObs_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFDevCruObs_Sel", AV43TFDevCruObs_Sel);
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
      if ( GXutil.strcmp(AV22Session.getValue(AV80Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV80Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV80Pgmname+"GridState"), null, null);
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
      AV81GXV1 = 1 ;
      while ( AV81GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV81GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUID") == 0 )
         {
            AV26TFDevCruId = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFDevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFDevCruId), 8, 0));
            AV27TFDevCruId_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFDevCruId_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFDevCruId_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUFEC") == 0 )
         {
            AV28TFDevCruFec = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFDevCruFec", localUtil.format(AV28TFDevCruFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV32TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFCliCod), 6, 0));
            AV33TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV34TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFCliNom", AV34TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV35TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFCliNom_Sel", AV35TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNCOD") == 0 )
         {
            AV36TFTrnCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFTrnCod), 4, 0));
            AV37TFTrnCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFTrnCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFTrnCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV38TFTrnNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFTrnNom", AV38TFTrnNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV39TFTrnNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFTrnNom_Sel", AV39TFTrnNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUMAT") == 0 )
         {
            AV40TFDevCruMat = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFDevCruMat", AV40TFDevCruMat);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUMAT_SEL") == 0 )
         {
            AV41TFDevCruMat_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFDevCruMat_Sel", AV41TFDevCruMat_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUOBS") == 0 )
         {
            AV42TFDevCruObs = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFDevCruObs", AV42TFDevCruObs);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUOBS_SEL") == 0 )
         {
            AV43TFDevCruObs_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFDevCruObs_Sel", AV43TFDevCruObs_Sel);
         }
         AV81GXV1 = (int)(AV81GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFCliNom_Sel)==0), AV35TFCliNom_Sel, GXv_char4) ;
      wcconsultadevolucionesalmacentejidoencrudosindetalle_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFTrnNom_Sel)==0), AV39TFTrnNom_Sel, GXv_char3) ;
      wcconsultadevolucionesalmacentejidoencrudosindetalle_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFDevCruMat_Sel)==0), AV41TFDevCruMat_Sel, GXv_char2) ;
      wcconsultadevolucionesalmacentejidoencrudosindetalle_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFDevCruObs_Sel)==0), AV43TFDevCruObs_Sel, GXv_char15) ;
      wcconsultadevolucionesalmacentejidoencrudosindetalle_impl.this.GXt_char14 = GXv_char15[0] ;
      Ddo_grid_Selectedvalue_set = "|||"+GXt_char1+"||"+GXt_char12+"|"+GXt_char13+"|"+GXt_char14+"||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFCliNom)==0), AV34TFCliNom, GXv_char15) ;
      wcconsultadevolucionesalmacentejidoencrudosindetalle_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFTrnNom)==0), AV38TFTrnNom, GXv_char4) ;
      wcconsultadevolucionesalmacentejidoencrudosindetalle_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFDevCruMat)==0), AV40TFDevCruMat, GXv_char3) ;
      wcconsultadevolucionesalmacentejidoencrudosindetalle_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFDevCruObs)==0), AV42TFDevCruObs, GXv_char2) ;
      wcconsultadevolucionesalmacentejidoencrudosindetalle_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV26TFDevCruId) ? "" : GXutil.str( AV26TFDevCruId, 8, 0))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV28TFDevCruFec)) ? "" : localUtil.dtoc( AV28TFDevCruFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV32TFCliCod) ? "" : GXutil.str( AV32TFCliCod, 6, 0))+"|"+GXt_char14+"|"+((0==AV36TFTrnCod) ? "" : GXutil.str( AV36TFTrnCod, 4, 0))+"|"+GXt_char13+"|"+GXt_char12+"|"+GXt_char1+"||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV27TFDevCruId_To) ? "" : GXutil.str( AV27TFDevCruId_To, 8, 0))+"||"+((0==AV33TFCliCod_To) ? "" : GXutil.str( AV33TFCliCod_To, 6, 0))+"||"+((0==AV37TFTrnCod_To) ? "" : GXutil.str( AV37TFTrnCod_To, 4, 0))+"|||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV80Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFDEVCRUID", "", !((0==AV26TFDevCruId)&&(0==AV27TFDevCruId_To)), (short)(0), GXutil.trim( GXutil.str( AV26TFDevCruId, 8, 0)), GXutil.trim( GXutil.str( AV27TFDevCruId_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFDEVCRUFEC", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV28TFDevCruFec)), (short)(0), GXutil.trim( localUtil.dtoc( AV28TFDevCruFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFCLICOD", "", !((0==AV32TFCliCod)&&(0==AV33TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV32TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV33TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFCLINOM", "", !(GXutil.strcmp("", AV34TFCliNom)==0), (short)(0), AV34TFCliNom, "", !(GXutil.strcmp("", AV35TFCliNom_Sel)==0), AV35TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFTRNCOD", "", !((0==AV36TFTrnCod)&&(0==AV37TFTrnCod_To)), (short)(0), GXutil.trim( GXutil.str( AV36TFTrnCod, 4, 0)), GXutil.trim( GXutil.str( AV37TFTrnCod_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFTRNNOM", "", !(GXutil.strcmp("", AV38TFTrnNom)==0), (short)(0), AV38TFTrnNom, "", !(GXutil.strcmp("", AV39TFTrnNom_Sel)==0), AV39TFTrnNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFDEVCRUMAT", "", !(GXutil.strcmp("", AV40TFDevCruMat)==0), (short)(0), AV40TFDevCruMat, "", !(GXutil.strcmp("", AV41TFDevCruMat_Sel)==0), AV41TFDevCruMat_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFDEVCRUOBS", "", !(GXutil.strcmp("", AV42TFDevCruObs)==0), (short)(0), AV42TFDevCruObs, "", !(GXutil.strcmp("", AV43TFDevCruObs_Sel)==0), AV43TFDevCruObs_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      if ( ! (GXutil.strcmp("", AV48Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV48Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV49DevCruFec)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&DEVCRUFEC" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV49DevCruFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV51DevCruFec_to)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&DEVCRUFEC_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV51DevCruFec_to, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV50Clicod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV50Clicod, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV52Clicod_to) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD_TO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV52Clicod_to, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV56AlbRef)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBREF" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV56AlbRef );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV57AlbREnt)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBRENT" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV57AlbREnt );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV58AlbRecCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBRECCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV58AlbRecCod, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV80Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV80Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "DevolucionAlmacenTejidoCrudosindetalle" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_25_16O2( boolean wbgen )
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
         wb_table2_30_16O2( true) ;
      }
      else
      {
         wb_table2_30_16O2( false) ;
      }
      return  ;
   }

   public void wb_table2_30_16O2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_16O2e( true) ;
      }
      else
      {
         wb_table1_25_16O2e( false) ;
      }
   }

   public void wb_table2_30_16O2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WCConsultaDevolucionesAlmacenTejidoencrudosindetalle.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_30_16O2e( true) ;
      }
      else
      {
         wb_table2_30_16O2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV48Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48Emprcod", AV48Emprcod);
      AV49DevCruFec = (java.util.Date)getParm(obj,1,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49DevCruFec", localUtil.format(AV49DevCruFec, "99/99/99"));
      AV51DevCruFec_to = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51DevCruFec_to", localUtil.format(AV51DevCruFec_to, "99/99/99"));
      AV50Clicod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Clicod), 6, 0));
      AV52Clicod_to = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Clicod_to), 6, 0));
      AV56AlbRef = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56AlbRef", AV56AlbRef);
      AV57AlbREnt = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57AlbREnt", AV57AlbREnt);
      AV58AlbRecCod = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58AlbRecCod), 8, 0));
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
      pa16O2( ) ;
      ws16O2( ) ;
      we16O2( ) ;
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
      sCtrlAV48Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV49DevCruFec = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV51DevCruFec_to = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV50Clicod = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV52Clicod_to = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV56AlbRef = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV57AlbREnt = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV58AlbRecCod = (String)getParm(obj,7,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa16O2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcconsultadevolucionesalmacentejidoencrudosindetalle", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa16O2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV48Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48Emprcod", AV48Emprcod);
         AV49DevCruFec = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49DevCruFec", localUtil.format(AV49DevCruFec, "99/99/99"));
         AV51DevCruFec_to = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51DevCruFec_to", localUtil.format(AV51DevCruFec_to, "99/99/99"));
         AV50Clicod = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Clicod), 6, 0));
         AV52Clicod_to = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Clicod_to), 6, 0));
         AV56AlbRef = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56AlbRef", AV56AlbRef);
         AV57AlbREnt = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57AlbREnt", AV57AlbREnt);
         AV58AlbRecCod = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58AlbRecCod), 8, 0));
      }
      wcpOAV48Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV48Emprcod") ;
      wcpOAV49DevCruFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV49DevCruFec"), 0) ;
      wcpOAV51DevCruFec_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV51DevCruFec_to"), 0) ;
      wcpOAV50Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV50Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV52Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV52Clicod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV56AlbRef = httpContext.cgiGet( sPrefix+"wcpOAV56AlbRef") ;
      wcpOAV57AlbREnt = httpContext.cgiGet( sPrefix+"wcpOAV57AlbREnt") ;
      wcpOAV58AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV58AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV48Emprcod, wcpOAV48Emprcod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV49DevCruFec), GXutil.resetTime(wcpOAV49DevCruFec)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV51DevCruFec_to), GXutil.resetTime(wcpOAV51DevCruFec_to)) ) || ( AV50Clicod != wcpOAV50Clicod ) || ( AV52Clicod_to != wcpOAV52Clicod_to ) || ( GXutil.strcmp(AV56AlbRef, wcpOAV56AlbRef) != 0 ) || ( GXutil.strcmp(AV57AlbREnt, wcpOAV57AlbREnt) != 0 ) || ( AV58AlbRecCod != wcpOAV58AlbRecCod ) ) )
      {
         setjustcreated();
      }
      wcpOAV48Emprcod = AV48Emprcod ;
      wcpOAV49DevCruFec = AV49DevCruFec ;
      wcpOAV51DevCruFec_to = AV51DevCruFec_to ;
      wcpOAV50Clicod = AV50Clicod ;
      wcpOAV52Clicod_to = AV52Clicod_to ;
      wcpOAV56AlbRef = AV56AlbRef ;
      wcpOAV57AlbREnt = AV57AlbREnt ;
      wcpOAV58AlbRecCod = AV58AlbRecCod ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV48Emprcod = httpContext.cgiGet( sPrefix+"AV48Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV48Emprcod) > 0 )
      {
         AV48Emprcod = httpContext.cgiGet( sCtrlAV48Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48Emprcod", AV48Emprcod);
      }
      else
      {
         AV48Emprcod = httpContext.cgiGet( sPrefix+"AV48Emprcod_PARM") ;
      }
      sCtrlAV49DevCruFec = httpContext.cgiGet( sPrefix+"AV49DevCruFec_CTRL") ;
      if ( GXutil.len( sCtrlAV49DevCruFec) > 0 )
      {
         AV49DevCruFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV49DevCruFec), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49DevCruFec", localUtil.format(AV49DevCruFec, "99/99/99"));
      }
      else
      {
         AV49DevCruFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV49DevCruFec_PARM"), 0) ;
      }
      sCtrlAV51DevCruFec_to = httpContext.cgiGet( sPrefix+"AV51DevCruFec_to_CTRL") ;
      if ( GXutil.len( sCtrlAV51DevCruFec_to) > 0 )
      {
         AV51DevCruFec_to = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV51DevCruFec_to), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51DevCruFec_to", localUtil.format(AV51DevCruFec_to, "99/99/99"));
      }
      else
      {
         AV51DevCruFec_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV51DevCruFec_to_PARM"), 0) ;
      }
      sCtrlAV50Clicod = httpContext.cgiGet( sPrefix+"AV50Clicod_CTRL") ;
      if ( GXutil.len( sCtrlAV50Clicod) > 0 )
      {
         AV50Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV50Clicod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Clicod), 6, 0));
      }
      else
      {
         AV50Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV50Clicod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV52Clicod_to = httpContext.cgiGet( sPrefix+"AV52Clicod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV52Clicod_to) > 0 )
      {
         AV52Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV52Clicod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Clicod_to), 6, 0));
      }
      else
      {
         AV52Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV52Clicod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV56AlbRef = httpContext.cgiGet( sPrefix+"AV56AlbRef_CTRL") ;
      if ( GXutil.len( sCtrlAV56AlbRef) > 0 )
      {
         AV56AlbRef = httpContext.cgiGet( sCtrlAV56AlbRef) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56AlbRef", AV56AlbRef);
      }
      else
      {
         AV56AlbRef = httpContext.cgiGet( sPrefix+"AV56AlbRef_PARM") ;
      }
      sCtrlAV57AlbREnt = httpContext.cgiGet( sPrefix+"AV57AlbREnt_CTRL") ;
      if ( GXutil.len( sCtrlAV57AlbREnt) > 0 )
      {
         AV57AlbREnt = httpContext.cgiGet( sCtrlAV57AlbREnt) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57AlbREnt", AV57AlbREnt);
      }
      else
      {
         AV57AlbREnt = httpContext.cgiGet( sPrefix+"AV57AlbREnt_PARM") ;
      }
      sCtrlAV58AlbRecCod = httpContext.cgiGet( sPrefix+"AV58AlbRecCod_CTRL") ;
      if ( GXutil.len( sCtrlAV58AlbRecCod) > 0 )
      {
         AV58AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV58AlbRecCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58AlbRecCod), 8, 0));
      }
      else
      {
         AV58AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV58AlbRecCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa16O2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws16O2( ) ;
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
      ws16O2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV48Emprcod_PARM", GXutil.rtrim( AV48Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV48Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV48Emprcod_CTRL", GXutil.rtrim( sCtrlAV48Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV49DevCruFec_PARM", localUtil.dtoc( AV49DevCruFec, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV49DevCruFec)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV49DevCruFec_CTRL", GXutil.rtrim( sCtrlAV49DevCruFec));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV51DevCruFec_to_PARM", localUtil.dtoc( AV51DevCruFec_to, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV51DevCruFec_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV51DevCruFec_to_CTRL", GXutil.rtrim( sCtrlAV51DevCruFec_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV50Clicod_PARM", GXutil.ltrim( localUtil.ntoc( AV50Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV50Clicod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV50Clicod_CTRL", GXutil.rtrim( sCtrlAV50Clicod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV52Clicod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV52Clicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV52Clicod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV52Clicod_to_CTRL", GXutil.rtrim( sCtrlAV52Clicod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV56AlbRef_PARM", GXutil.rtrim( AV56AlbRef));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV56AlbRef)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV56AlbRef_CTRL", GXutil.rtrim( sCtrlAV56AlbRef));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV57AlbREnt_PARM", GXutil.rtrim( AV57AlbREnt));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV57AlbREnt)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV57AlbREnt_CTRL", GXutil.rtrim( sCtrlAV57AlbREnt));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58AlbRecCod_PARM", GXutil.ltrim( localUtil.ntoc( AV58AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV58AlbRecCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58AlbRecCod_CTRL", GXutil.rtrim( sCtrlAV58AlbRecCod));
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
      we16O2( ) ;
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
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         WebComp_Grid_dwc.componentjscripts();
      }
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
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
         {
            WebComp_Grid_dwc.componentthemes();
         }
      }
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211681765", true, true);
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
      httpContext.AddJavascriptSource("wcconsultadevolucionesalmacentejidoencrudosindetalle.js", "?20268211681766", false, true);
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
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_432( )
   {
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_43_idx ;
      edtDevCruId_Internalname = sPrefix+"DEVCRUID_"+sGXsfl_43_idx ;
      edtDevCruFec_Internalname = sPrefix+"DEVCRUFEC_"+sGXsfl_43_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_43_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_43_idx ;
      edtTrnCod_Internalname = sPrefix+"TRNCOD_"+sGXsfl_43_idx ;
      edtTrnNom_Internalname = sPrefix+"TRNNOM_"+sGXsfl_43_idx ;
      edtDevCruMat_Internalname = sPrefix+"DEVCRUMAT_"+sGXsfl_43_idx ;
      edtDevCruObs_Internalname = sPrefix+"DEVCRUOBS_"+sGXsfl_43_idx ;
      edtavDevcruund_Internalname = sPrefix+"vDEVCRUUND_"+sGXsfl_43_idx ;
      edtavDevcrupzs_Internalname = sPrefix+"vDEVCRUPZS_"+sGXsfl_43_idx ;
   }

   public void subsflControlProps_fel_432( )
   {
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_43_fel_idx ;
      edtDevCruId_Internalname = sPrefix+"DEVCRUID_"+sGXsfl_43_fel_idx ;
      edtDevCruFec_Internalname = sPrefix+"DEVCRUFEC_"+sGXsfl_43_fel_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_43_fel_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_43_fel_idx ;
      edtTrnCod_Internalname = sPrefix+"TRNCOD_"+sGXsfl_43_fel_idx ;
      edtTrnNom_Internalname = sPrefix+"TRNNOM_"+sGXsfl_43_fel_idx ;
      edtDevCruMat_Internalname = sPrefix+"DEVCRUMAT_"+sGXsfl_43_fel_idx ;
      edtDevCruObs_Internalname = sPrefix+"DEVCRUOBS_"+sGXsfl_43_fel_idx ;
      edtavDevcruund_Internalname = sPrefix+"vDEVCRUUND_"+sGXsfl_43_fel_idx ;
      edtavDevcrupzs_Internalname = sPrefix+"vDEVCRUPZS_"+sGXsfl_43_fel_idx ;
   }

   public void sendrow_432( )
   {
      subsflControlProps_432( ) ;
      wb16O0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_43_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_43_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_43_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 44,'"+sPrefix+"',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV53DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,44);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+"e2216o2_client"+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWIconActionColumn WCD_ActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDevCruId_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruId_Internalname,GXutil.ltrim( localUtil.ntoc( A11669DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11669DevCruId), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDevCruId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDevCruId_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDevCruFec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruFec_Internalname,localUtil.format(A11670DevCruFec, "99/99/99"),localUtil.format( A11670DevCruFec, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDevCruFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtDevCruFec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtTrnCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTrnCod_Internalname,GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","",httpContext.getMessage( "Codigo Transportista", ""),"",edtTrnCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTrnCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtTrnNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTrnNom_Internalname,GXutil.rtrim( A841TrnNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTrnNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTrnNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDevCruMat_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruMat_Internalname,GXutil.rtrim( A11672DevCruMat),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDevCruMat_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDevCruMat_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDevCruObs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruObs_Internalname,A11682DevCruObs,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDevCruObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDevCruObs_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDevcruund_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDevcruund_Enabled!=0)&&(edtavDevcruund_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 53,'"+sPrefix+"',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDevcruund_Internalname,GXutil.ltrim( localUtil.ntoc( AV54DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDevcruund_Enabled!=0) ? localUtil.format( AV54DevCruUnd, "ZZZZZ9.99") : localUtil.format( AV54DevCruUnd, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavDevcruund_Enabled!=0)&&(edtavDevcruund_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,53);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDevcruund_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDevcruund_Visible),Integer.valueOf(edtavDevcruund_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDevcrupzs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDevcrupzs_Enabled!=0)&&(edtavDevcrupzs_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 54,'"+sPrefix+"',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDevcrupzs_Internalname,GXutil.ltrim( localUtil.ntoc( AV55DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDevcrupzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV55DevCruPzs), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV55DevCruPzs), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavDevcrupzs_Enabled!=0)&&(edtavDevcrupzs_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDevcrupzs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDevcrupzs_Visible),Integer.valueOf(edtavDevcrupzs_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes16O2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_43_idx = ((subGrid_Islastpage==1)&&(nGXsfl_43_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
      }
      /* End function sendrow_432 */
   }

   public void startgridcontrol43( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"43\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDevCruId_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Devolucion Id", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDevCruFec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Devolucion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTrnCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cod Transp", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTrnNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Transportista", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDevCruMat_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Matricula", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDevCruObs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Observaciones", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDevcruund_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidades", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDevcrupzs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV53DetailWebComponent));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11669DevCruId, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDevCruId_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A11670DevCruFec, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDevCruFec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTrnCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A841TrnNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTrnNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11672DevCruMat));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDevCruMat_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A11682DevCruObs);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDevCruObs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV54DevCruUnd, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDevcruund_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDevcruund_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV55DevCruPzs, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDevcrupzs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDevcrupzs_Visible, (byte)(5), (byte)(0), ".", "")));
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
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT" ;
      edtDevCruId_Internalname = sPrefix+"DEVCRUID" ;
      edtDevCruFec_Internalname = sPrefix+"DEVCRUFEC" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtTrnCod_Internalname = sPrefix+"TRNCOD" ;
      edtTrnNom_Internalname = sPrefix+"TRNNOM" ;
      edtDevCruMat_Internalname = sPrefix+"DEVCRUMAT" ;
      edtDevCruObs_Internalname = sPrefix+"DEVCRUOBS" ;
      edtavDevcruund_Internalname = sPrefix+"vDEVCRUUND" ;
      edtavDevcrupzs_Internalname = sPrefix+"vDEVCRUPZS" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divCell_grid_dwc_Internalname = sPrefix+"CELL_GRID_DWC" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Innewwindow1_Internalname = sPrefix+"INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_titlescategories_Internalname = sPrefix+"GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_devcrufecauxdate_Internalname = sPrefix+"vDDO_DEVCRUFECAUXDATE" ;
      divDdo_devcrufecauxdates_Internalname = sPrefix+"DDO_DEVCRUFECAUXDATES" ;
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
      edtavDevcrupzs_Jsonclick = "" ;
      edtavDevcrupzs_Enabled = 1 ;
      edtavDevcruund_Jsonclick = "" ;
      edtavDevcruund_Enabled = 1 ;
      edtDevCruObs_Jsonclick = "" ;
      edtDevCruMat_Jsonclick = "" ;
      edtTrnNom_Jsonclick = "" ;
      edtTrnCod_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtDevCruFec_Jsonclick = "" ;
      edtDevCruId_Jsonclick = "" ;
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Visible = -1 ;
      edtavDetailwebcomponent_Enabled = 1 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavDevcrupzs_Visible = -1 ;
      edtavDevcruund_Visible = -1 ;
      edtDevCruObs_Visible = -1 ;
      edtDevCruMat_Visible = -1 ;
      edtTrnNom_Visible = -1 ;
      edtTrnCod_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      edtDevCruFec_Visible = -1 ;
      edtDevCruId_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_devcrufecauxdate_Jsonclick = "" ;
      divCell_grid_dwc_Class = "col-xs-12" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;;;Devolucion;Devolucion" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Datalistproc = "WCConsultaDevolucionesAlmacenTejidoencrudosindetalleGetFilterData" ;
      Ddo_grid_Datalisttype = "|||Dynamic||Dynamic|Dynamic|Dynamic||" ;
      Ddo_grid_Includedatalist = "|||T||T|T|T||" ;
      Ddo_grid_Filterisrange = "T||T||T|||||" ;
      Ddo_grid_Filtertype = "Numeric|Date|Numeric|Character|Numeric|Character|Character|Character||" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T||" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T|T||" ;
      Ddo_grid_Columnssortvalues = "2|1|3|4|5|6|7|8||" ;
      Ddo_grid_Columnids = "1:DevCruId|2:DevCruFec|3:CliCod|4:CliNom|5:TrnCod|6:TrnNom|7:DevCruMat|8:DevCruObs|9:DevCruUnd|10:DevCruPzs" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49DevCruFec',fld:'vDEVCRUFEC',pic:''},{av:'AV51DevCruFec_to',fld:'vDEVCRUFEC_TO',pic:''},{av:'AV50Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV52Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV56AlbRef',fld:'vALBREF',pic:''},{av:'AV57AlbREnt',fld:'vALBRENT',pic:''},{av:'AV58AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV26TFDevCruId',fld:'vTFDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV27TFDevCruId_To',fld:'vTFDEVCRUID_TO',pic:'ZZZZZZZ9'},{av:'AV28TFDevCruFec',fld:'vTFDEVCRUFEC',pic:''},{av:'AV32TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV33TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV36TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV37TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV38TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV39TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV40TFDevCruMat',fld:'vTFDEVCRUMAT',pic:''},{av:'AV41TFDevCruMat_Sel',fld:'vTFDEVCRUMAT_SEL',pic:''},{av:'AV42TFDevCruObs',fld:'vTFDEVCRUOBS',pic:''},{av:'AV43TFDevCruObs_Sel',fld:'vTFDEVCRUOBS_SEL',pic:''},{av:'AV80Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtDevCruId_Visible',ctrl:'DEVCRUID',prop:'Visible'},{av:'edtDevCruFec_Visible',ctrl:'DEVCRUFEC',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtTrnCod_Visible',ctrl:'TRNCOD',prop:'Visible'},{av:'edtTrnNom_Visible',ctrl:'TRNNOM',prop:'Visible'},{av:'edtDevCruMat_Visible',ctrl:'DEVCRUMAT',prop:'Visible'},{av:'edtDevCruObs_Visible',ctrl:'DEVCRUOBS',prop:'Visible'},{av:'edtavDevcruund_Visible',ctrl:'vDEVCRUUND',prop:'Visible'},{av:'edtavDevcrupzs_Visible',ctrl:'vDEVCRUPZS',prop:'Visible'},{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1316O2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49DevCruFec',fld:'vDEVCRUFEC',pic:''},{av:'AV51DevCruFec_to',fld:'vDEVCRUFEC_TO',pic:''},{av:'AV50Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV52Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV56AlbRef',fld:'vALBREF',pic:''},{av:'AV57AlbREnt',fld:'vALBRENT',pic:''},{av:'AV58AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFDevCruId',fld:'vTFDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV27TFDevCruId_To',fld:'vTFDEVCRUID_TO',pic:'ZZZZZZZ9'},{av:'AV28TFDevCruFec',fld:'vTFDEVCRUFEC',pic:''},{av:'AV32TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV33TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV36TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV37TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV38TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV39TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV40TFDevCruMat',fld:'vTFDEVCRUMAT',pic:''},{av:'AV41TFDevCruMat_Sel',fld:'vTFDEVCRUMAT_SEL',pic:''},{av:'AV42TFDevCruObs',fld:'vTFDEVCRUOBS',pic:''},{av:'AV43TFDevCruObs_Sel',fld:'vTFDEVCRUOBS_SEL',pic:''},{av:'AV80Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1416O2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49DevCruFec',fld:'vDEVCRUFEC',pic:''},{av:'AV51DevCruFec_to',fld:'vDEVCRUFEC_TO',pic:''},{av:'AV50Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV52Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV56AlbRef',fld:'vALBREF',pic:''},{av:'AV57AlbREnt',fld:'vALBRENT',pic:''},{av:'AV58AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFDevCruId',fld:'vTFDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV27TFDevCruId_To',fld:'vTFDEVCRUID_TO',pic:'ZZZZZZZ9'},{av:'AV28TFDevCruFec',fld:'vTFDEVCRUFEC',pic:''},{av:'AV32TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV33TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV36TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV37TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV38TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV39TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV40TFDevCruMat',fld:'vTFDEVCRUMAT',pic:''},{av:'AV41TFDevCruMat_Sel',fld:'vTFDEVCRUMAT_SEL',pic:''},{av:'AV42TFDevCruObs',fld:'vTFDEVCRUOBS',pic:''},{av:'AV43TFDevCruObs_Sel',fld:'vTFDEVCRUOBS_SEL',pic:''},{av:'AV80Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1516O2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49DevCruFec',fld:'vDEVCRUFEC',pic:''},{av:'AV51DevCruFec_to',fld:'vDEVCRUFEC_TO',pic:''},{av:'AV50Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV52Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV56AlbRef',fld:'vALBREF',pic:''},{av:'AV57AlbREnt',fld:'vALBRENT',pic:''},{av:'AV58AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFDevCruId',fld:'vTFDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV27TFDevCruId_To',fld:'vTFDEVCRUID_TO',pic:'ZZZZZZZ9'},{av:'AV28TFDevCruFec',fld:'vTFDEVCRUFEC',pic:''},{av:'AV32TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV33TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV36TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV37TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV38TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV39TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV40TFDevCruMat',fld:'vTFDEVCRUMAT',pic:''},{av:'AV41TFDevCruMat_Sel',fld:'vTFDEVCRUMAT_SEL',pic:''},{av:'AV42TFDevCruObs',fld:'vTFDEVCRUOBS',pic:''},{av:'AV43TFDevCruObs_Sel',fld:'vTFDEVCRUOBS_SEL',pic:''},{av:'AV80Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV42TFDevCruObs',fld:'vTFDEVCRUOBS',pic:''},{av:'AV43TFDevCruObs_Sel',fld:'vTFDEVCRUOBS_SEL',pic:''},{av:'AV40TFDevCruMat',fld:'vTFDEVCRUMAT',pic:''},{av:'AV41TFDevCruMat_Sel',fld:'vTFDEVCRUMAT_SEL',pic:''},{av:'AV38TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV39TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV36TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV37TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV32TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV33TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV28TFDevCruFec',fld:'vTFDEVCRUFEC',pic:''},{av:'AV26TFDevCruId',fld:'vTFDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV27TFDevCruId_To',fld:'vTFDEVCRUID_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2116O2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV53DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''},{av:'AV54DevCruUnd',fld:'vDEVCRUUND',pic:'ZZZZZ9.99'},{av:'A40000GXC1',fld:'GXC1',pic:'999999.99'},{av:'AV55DevCruPzs',fld:'vDEVCRUPZS',pic:'ZZZZZ9'},{av:'A40001GXC2',fld:'GXC2',pic:'999999'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1616O2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49DevCruFec',fld:'vDEVCRUFEC',pic:''},{av:'AV51DevCruFec_to',fld:'vDEVCRUFEC_TO',pic:''},{av:'AV50Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV52Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV56AlbRef',fld:'vALBREF',pic:''},{av:'AV57AlbREnt',fld:'vALBRENT',pic:''},{av:'AV58AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFDevCruId',fld:'vTFDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV27TFDevCruId_To',fld:'vTFDEVCRUID_TO',pic:'ZZZZZZZ9'},{av:'AV28TFDevCruFec',fld:'vTFDEVCRUFEC',pic:''},{av:'AV32TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV33TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV36TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV37TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV38TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV39TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV40TFDevCruMat',fld:'vTFDEVCRUMAT',pic:''},{av:'AV41TFDevCruMat_Sel',fld:'vTFDEVCRUMAT_SEL',pic:''},{av:'AV42TFDevCruObs',fld:'vTFDEVCRUOBS',pic:''},{av:'AV43TFDevCruObs_Sel',fld:'vTFDEVCRUOBS_SEL',pic:''},{av:'AV80Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtDevCruId_Visible',ctrl:'DEVCRUID',prop:'Visible'},{av:'edtDevCruFec_Visible',ctrl:'DEVCRUFEC',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtTrnCod_Visible',ctrl:'TRNCOD',prop:'Visible'},{av:'edtTrnNom_Visible',ctrl:'TRNNOM',prop:'Visible'},{av:'edtDevCruMat_Visible',ctrl:'DEVCRUMAT',prop:'Visible'},{av:'edtDevCruObs_Visible',ctrl:'DEVCRUOBS',prop:'Visible'},{av:'edtavDevcruund_Visible',ctrl:'vDEVCRUUND',prop:'Visible'},{av:'edtavDevcrupzs_Visible',ctrl:'vDEVCRUPZS',prop:'Visible'},{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e1216O2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49DevCruFec',fld:'vDEVCRUFEC',pic:''},{av:'AV51DevCruFec_to',fld:'vDEVCRUFEC_TO',pic:''},{av:'AV50Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV52Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV56AlbRef',fld:'vALBREF',pic:''},{av:'AV57AlbREnt',fld:'vALBRENT',pic:''},{av:'AV58AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFDevCruId',fld:'vTFDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV27TFDevCruId_To',fld:'vTFDEVCRUID_TO',pic:'ZZZZZZZ9'},{av:'AV28TFDevCruFec',fld:'vTFDEVCRUFEC',pic:''},{av:'AV32TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV33TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV36TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV37TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV38TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV39TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV40TFDevCruMat',fld:'vTFDEVCRUMAT',pic:''},{av:'AV41TFDevCruMat_Sel',fld:'vTFDEVCRUMAT_SEL',pic:''},{av:'AV42TFDevCruObs',fld:'vTFDEVCRUOBS',pic:''},{av:'AV43TFDevCruObs_Sel',fld:'vTFDEVCRUOBS_SEL',pic:''},{av:'AV80Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFDevCruId',fld:'vTFDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV27TFDevCruId_To',fld:'vTFDEVCRUID_TO',pic:'ZZZZZZZ9'},{av:'AV28TFDevCruFec',fld:'vTFDEVCRUFEC',pic:''},{av:'AV32TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV33TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV36TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV37TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV38TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV39TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV40TFDevCruMat',fld:'vTFDEVCRUMAT',pic:''},{av:'AV41TFDevCruMat_Sel',fld:'vTFDEVCRUMAT_SEL',pic:''},{av:'AV42TFDevCruObs',fld:'vTFDEVCRUOBS',pic:''},{av:'AV43TFDevCruObs_Sel',fld:'vTFDEVCRUOBS_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtDevCruId_Visible',ctrl:'DEVCRUID',prop:'Visible'},{av:'edtDevCruFec_Visible',ctrl:'DEVCRUFEC',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtTrnCod_Visible',ctrl:'TRNCOD',prop:'Visible'},{av:'edtTrnNom_Visible',ctrl:'TRNNOM',prop:'Visible'},{av:'edtDevCruMat_Visible',ctrl:'DEVCRUMAT',prop:'Visible'},{av:'edtDevCruObs_Visible',ctrl:'DEVCRUOBS',prop:'Visible'},{av:'edtavDevcruund_Visible',ctrl:'vDEVCRUUND',prop:'Visible'},{av:'edtavDevcrupzs_Visible',ctrl:'vDEVCRUPZS',prop:'Visible'},{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1716O2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e1116O1',iparms:[]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e1816O2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e2216O2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'GRID_DWC'}]}");
      setEventMetadata("VALID_DEVCRUID","{handler:'valid_Devcruid',iparms:[]");
      setEventMetadata("VALID_DEVCRUID",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[]");
      setEventMetadata("VALID_TRNCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Devcrupzs',iparms:[]");
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
      wcpOAV48Emprcod = "" ;
      wcpOAV49DevCruFec = GXutil.nullDate() ;
      wcpOAV51DevCruFec_to = GXutil.nullDate() ;
      wcpOAV56AlbRef = "" ;
      wcpOAV57AlbREnt = "" ;
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
      AV48Emprcod = "" ;
      AV49DevCruFec = GXutil.nullDate() ;
      AV51DevCruFec_to = GXutil.nullDate() ;
      AV56AlbRef = "" ;
      AV57AlbREnt = "" ;
      AV15FilterFullText = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV28TFDevCruFec = GXutil.nullDate() ;
      AV34TFCliNom = "" ;
      AV35TFCliNom_Sel = "" ;
      AV38TFTrnNom = "" ;
      AV39TFTrnNom_Sel = "" ;
      AV40TFDevCruMat = "" ;
      AV41TFDevCruMat_Sel = "" ;
      AV42TFDevCruObs = "" ;
      AV43TFDevCruObs_Sel = "" ;
      AV80Pgmname = "" ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV44DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
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
      WebComp_Grid_dwc_Component = "" ;
      OldGrid_dwc = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV30DDO_DevCruFecAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV53DetailWebComponent = "" ;
      A11670DevCruFec = GXutil.nullDate() ;
      A279CliNom = "" ;
      A841TrnNom = "" ;
      A11672DevCruMat = "" ;
      A11682DevCruObs = "" ;
      AV54DevCruUnd = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = "" ;
      lV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom = "" ;
      lV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom = "" ;
      lV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat = "" ;
      lV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs = "" ;
      lV56AlbRef = "" ;
      lV57AlbREnt = "" ;
      AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext = "" ;
      AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec = GXutil.nullDate() ;
      AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel = "" ;
      AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom = "" ;
      AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel = "" ;
      AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom = "" ;
      AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel = "" ;
      AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat = "" ;
      AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel = "" ;
      AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs = "" ;
      A45AlbRef = "" ;
      A46AlbREnt = "" ;
      H016O3_A46AlbREnt = new String[] {""} ;
      H016O3_A45AlbRef = new String[] {""} ;
      H016O3_A44AlbRecCod = new int[1] ;
      H016O3_A396EmprCod = new String[] {""} ;
      H016O3_A11682DevCruObs = new String[] {""} ;
      H016O3_A11672DevCruMat = new String[] {""} ;
      H016O3_A841TrnNom = new String[] {""} ;
      H016O3_n841TrnNom = new boolean[] {false} ;
      H016O3_A840TrnCod = new short[1] ;
      H016O3_n840TrnCod = new boolean[] {false} ;
      H016O3_A279CliNom = new String[] {""} ;
      H016O3_A252CliCod = new int[1] ;
      H016O3_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      H016O3_A11669DevCruId = new int[1] ;
      H016O3_A40000GXC1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H016O3_n40000GXC1 = new boolean[] {false} ;
      H016O3_A40001GXC2 = new int[1] ;
      H016O3_n40001GXC2 = new boolean[] {false} ;
      A40000GXC1 = DecimalUtil.ZERO ;
      H016O5_AGRID_nRecordCount = new long[1] ;
      AV59Station = "" ;
      AV60EmprNom = "" ;
      AV61UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV22Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV24ManageFiltersXml = "" ;
      AV16ExcelFilename = "" ;
      AV17ErrorMessage = "" ;
      AV19UserCustomValue = "" ;
      AV21ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState16 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV48Emprcod = "" ;
      sCtrlAV49DevCruFec = "" ;
      sCtrlAV51DevCruFec_to = "" ;
      sCtrlAV50Clicod = "" ;
      sCtrlAV52Clicod_to = "" ;
      sCtrlAV56AlbRef = "" ;
      sCtrlAV57AlbREnt = "" ;
      sCtrlAV58AlbRecCod = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcconsultadevolucionesalmacentejidoencrudosindetalle__default(),
         new Object[] {
             new Object[] {
            H016O3_A46AlbREnt, H016O3_A45AlbRef, H016O3_A44AlbRecCod, H016O3_A396EmprCod, H016O3_A11682DevCruObs, H016O3_A11672DevCruMat, H016O3_A841TrnNom, H016O3_n841TrnNom, H016O3_A840TrnCod, H016O3_n840TrnCod,
            H016O3_A279CliNom, H016O3_A252CliCod, H016O3_A11670DevCruFec, H016O3_A11669DevCruId, H016O3_A40000GXC1, H016O3_n40000GXC1, H016O3_A40001GXC2, H016O3_n40001GXC2
            }
            , new Object[] {
            H016O5_AGRID_nRecordCount
            }
         }
      );
      AV80Pgmname = "WCConsultaDevolucionesAlmacenTejidoencrudosindetalle" ;
      /* GeneXus formulas. */
      AV80Pgmname = "WCConsultaDevolucionesAlmacenTejidoencrudosindetalle" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      edtavDevcruund_Enabled = 0 ;
      edtavDevcrupzs_Enabled = 0 ;
      WebComp_Grid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV25ManageFiltersExecutionStep ;
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
   private short AV36TFTrnCod ;
   private short AV37TFTrnCod_To ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short A840TrnCod ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod ;
   private short AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to ;
   private int wcpOAV50Clicod ;
   private int wcpOAV52Clicod_to ;
   private int wcpOAV58AlbRecCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_43 ;
   private int AV50Clicod ;
   private int AV52Clicod_to ;
   private int AV58AlbRecCod ;
   private int nGXsfl_43_idx=1 ;
   private int AV26TFDevCruId ;
   private int AV27TFDevCruId_To ;
   private int AV32TFCliCod ;
   private int AV33TFCliCod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A11669DevCruId ;
   private int A252CliCod ;
   private int AV55DevCruPzs ;
   private int subGrid_Islastpage ;
   private int edtavDetailwebcomponent_Enabled ;
   private int edtavDevcruund_Enabled ;
   private int edtavDevcrupzs_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid ;
   private int AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to ;
   private int AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod ;
   private int AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to ;
   private int A44AlbRecCod ;
   private int A40001GXC2 ;
   private int edtDevCruId_Visible ;
   private int edtDevCruFec_Visible ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtTrnCod_Visible ;
   private int edtTrnNom_Visible ;
   private int edtDevCruMat_Visible ;
   private int edtDevCruObs_Visible ;
   private int edtavDevcruund_Visible ;
   private int edtavDevcrupzs_Visible ;
   private int AV45PageToGo ;
   private int AV81GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavDetailwebcomponent_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV46GridCurrentPage ;
   private long AV47GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV54DevCruUnd ;
   private java.math.BigDecimal A40000GXC1 ;
   private String wcpOAV48Emprcod ;
   private String wcpOAV56AlbRef ;
   private String wcpOAV57AlbREnt ;
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
   private String AV48Emprcod ;
   private String AV56AlbRef ;
   private String AV57AlbREnt ;
   private String sGXsfl_43_idx="0001" ;
   private String AV34TFCliNom ;
   private String AV35TFCliNom_Sel ;
   private String AV38TFTrnNom ;
   private String AV39TFTrnNom_Sel ;
   private String AV40TFDevCruMat ;
   private String AV41TFDevCruMat_Sel ;
   private String AV80Pgmname ;
   private String A396EmprCod ;
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
   private String Innewwindow1_Width ;
   private String Innewwindow1_Height ;
   private String Innewwindow1_Target ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
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
   private String divCell_grid_dwc_Internalname ;
   private String divCell_grid_dwc_Class ;
   private String WebComp_Grid_dwc_Component ;
   private String OldGrid_dwc ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_devcrufecauxdates_Internalname ;
   private String edtavDdo_devcrufecauxdate_Internalname ;
   private String edtavDdo_devcrufecauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavDetailwebcomponent_Internalname ;
   private String AV53DetailWebComponent ;
   private String edtDevCruId_Internalname ;
   private String edtDevCruFec_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String edtTrnCod_Internalname ;
   private String A841TrnNom ;
   private String edtTrnNom_Internalname ;
   private String A11672DevCruMat ;
   private String edtDevCruMat_Internalname ;
   private String edtDevCruObs_Internalname ;
   private String edtavDevcruund_Internalname ;
   private String edtavDevcrupzs_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom ;
   private String lV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom ;
   private String lV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat ;
   private String lV56AlbRef ;
   private String lV57AlbREnt ;
   private String AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel ;
   private String AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom ;
   private String AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel ;
   private String AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom ;
   private String AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel ;
   private String AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat ;
   private String A45AlbRef ;
   private String A46AlbREnt ;
   private String AV59Station ;
   private String AV60EmprNom ;
   private String AV61UsurCod ;
   private String GXt_char14 ;
   private String GXv_char15[] ;
   private String GXt_char13 ;
   private String GXv_char4[] ;
   private String GXt_char12 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV48Emprcod ;
   private String sCtrlAV49DevCruFec ;
   private String sCtrlAV51DevCruFec_to ;
   private String sCtrlAV50Clicod ;
   private String sCtrlAV52Clicod_to ;
   private String sCtrlAV56AlbRef ;
   private String sCtrlAV57AlbREnt ;
   private String sCtrlAV58AlbRecCod ;
   private String sGXsfl_43_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String edtDevCruId_Jsonclick ;
   private String edtDevCruFec_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtTrnCod_Jsonclick ;
   private String edtTrnNom_Jsonclick ;
   private String edtDevCruMat_Jsonclick ;
   private String edtDevCruObs_Jsonclick ;
   private String edtavDevcruund_Jsonclick ;
   private String edtavDevcrupzs_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV49DevCruFec ;
   private java.util.Date wcpOAV51DevCruFec_to ;
   private java.util.Date AV49DevCruFec ;
   private java.util.Date AV51DevCruFec_to ;
   private java.util.Date AV28TFDevCruFec ;
   private java.util.Date AV30DDO_DevCruFecAuxDate ;
   private java.util.Date A11670DevCruFec ;
   private java.util.Date AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec ;
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
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean bGXsfl_43_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n840TrnCod ;
   private boolean n841TrnNom ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n40000GXC1 ;
   private boolean n40001GXC2 ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String AV42TFDevCruObs ;
   private String AV43TFDevCruObs_Sel ;
   private String A11682DevCruObs ;
   private String lV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext ;
   private String lV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs ;
   private String AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext ;
   private String AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel ;
   private String AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs ;
   private String AV16ExcelFilename ;
   private String AV17ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Grid_dwc ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private IDataStoreProvider pr_default ;
   private String[] H016O3_A46AlbREnt ;
   private String[] H016O3_A45AlbRef ;
   private int[] H016O3_A44AlbRecCod ;
   private String[] H016O3_A396EmprCod ;
   private String[] H016O3_A11682DevCruObs ;
   private String[] H016O3_A11672DevCruMat ;
   private String[] H016O3_A841TrnNom ;
   private boolean[] H016O3_n841TrnNom ;
   private short[] H016O3_A840TrnCod ;
   private boolean[] H016O3_n840TrnCod ;
   private String[] H016O3_A279CliNom ;
   private int[] H016O3_A252CliCod ;
   private java.util.Date[] H016O3_A11670DevCruFec ;
   private int[] H016O3_A11669DevCruId ;
   private java.math.BigDecimal[] H016O3_A40000GXC1 ;
   private boolean[] H016O3_n40000GXC1 ;
   private int[] H016O3_A40001GXC2 ;
   private boolean[] H016O3_n40001GXC2 ;
   private long[] H016O5_AGRID_nRecordCount ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState16[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV44DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class wcconsultadevolucionesalmacentejidoencrudosindetalle__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H016O3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext ,
                                          int AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid ,
                                          int AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to ,
                                          java.util.Date AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec ,
                                          int AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod ,
                                          int AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to ,
                                          String AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel ,
                                          String AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom ,
                                          short AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod ,
                                          short AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to ,
                                          String AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel ,
                                          String AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom ,
                                          String AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel ,
                                          String AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat ,
                                          String AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel ,
                                          String AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs ,
                                          int AV50Clicod ,
                                          int AV52Clicod_to ,
                                          java.util.Date AV49DevCruFec ,
                                          java.util.Date AV51DevCruFec_to ,
                                          int AV58AlbRecCod ,
                                          String AV56AlbRef ,
                                          String AV57AlbREnt ,
                                          int A11669DevCruId ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A11672DevCruMat ,
                                          String A11682DevCruObs ,
                                          java.util.Date A11670DevCruFec ,
                                          int A44AlbRecCod ,
                                          String A45AlbRef ,
                                          String A46AlbREnt ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV48Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[35];
      Object[] GXv_Object18 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T2.AlbREnt, T2.AlbRef, T1.AlbRecCod, T1.EmprCod, T5.DevCruObs, T5.DevCruMat, T4.TrnNom, T2.TrnCod, T3.CliNom, T2.CliCod, T5.DevCruFec, T1.DevCruId, COALESCE( T6.GXC1," ;
      sSelectString += " 0) AS GXC1, COALESCE( T6.GXC2, 0) AS GXC2" ;
      sFromString = " FROM (((((TXPDEVCR1 T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND" ;
      sFromString += " T3.CliCod = T2.CliCod) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T2.TrnCod) INNER JOIN TXPDEVCRU T5 ON T5.EmprCod = T1.EmprCod AND T5.DevCruId" ;
      sFromString += " = T1.DevCruId) LEFT JOIN (SELECT SUM(DevCruUnd) AS GXC1, EmprCod, DevCruId, AlbRecCod, SUM(DevCruPzs) AS GXC2 FROM TXPDEVCR1 GROUP BY EmprCod, DevCruId, AlbRecCod" ;
      sFromString += " ) T6 ON T6.EmprCod = T1.EmprCod AND T6.DevCruId = T1.DevCruId AND T6.AlbRecCod = T1.AlbRecCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.DevCruId,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T4.TrnNom) like '%' || UPPER(?)) or ( UPPER(T5.DevCruMat) like '%' || UPPER(?)) or ( UPPER(T5.DevCruObs) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int17[1] = (byte)(1) ;
         GXv_int17[2] = (byte)(1) ;
         GXv_int17[3] = (byte)(1) ;
         GXv_int17[4] = (byte)(1) ;
         GXv_int17[5] = (byte)(1) ;
         GXv_int17[6] = (byte)(1) ;
         GXv_int17[7] = (byte)(1) ;
      }
      if ( ! (0==AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid) )
      {
         addWhere(sWhereString, "(T1.DevCruId >= ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (0==AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to) )
      {
         addWhere(sWhereString, "(T1.DevCruId <= ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec)) )
      {
         addWhere(sWhereString, "(T5.DevCruFec >= ?)");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (0==AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (0==AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (0==AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod) )
      {
         addWhere(sWhereString, "(T2.TrnCod >= ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( ! (0==AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to) )
      {
         addWhere(sWhereString, "(T2.TrnCod <= ?)");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TrnNom = ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel)==0) && ( ! (GXutil.strcmp("", AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.DevCruMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel)==0) )
      {
         addWhere(sWhereString, "(T5.DevCruMat = ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel)==0) && ( ! (GXutil.strcmp("", AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.DevCruObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel)==0) )
      {
         addWhere(sWhereString, "(T5.DevCruObs = ?)");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! (0==AV50Clicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( ! (0==AV52Clicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV49DevCruFec)) )
      {
         addWhere(sWhereString, "(T5.DevCruFec >= ?)");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV51DevCruFec_to)) )
      {
         addWhere(sWhereString, "(T5.DevCruFec <= ?)");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( ! (0==AV58AlbRecCod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod = ?)");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56AlbRef)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRef like ?)");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57AlbREnt)==0) )
      {
         addWhere(sWhereString, "(T2.AlbREnt like ?)");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T5.DevCruFec" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T5.DevCruFec DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DevCruId" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DevCruId DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.TrnCod" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.TrnCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T4.TrnNom" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T4.TrnNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T5.DevCruMat" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T5.DevCruMat DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T5.DevCruObs" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T5.DevCruObs DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.DevCruId, T1.AlbRecCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_H016O5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext ,
                                          int AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid ,
                                          int AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to ,
                                          java.util.Date AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec ,
                                          int AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod ,
                                          int AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to ,
                                          String AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel ,
                                          String AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom ,
                                          short AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod ,
                                          short AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to ,
                                          String AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel ,
                                          String AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom ,
                                          String AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel ,
                                          String AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat ,
                                          String AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel ,
                                          String AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs ,
                                          int AV50Clicod ,
                                          int AV52Clicod_to ,
                                          java.util.Date AV49DevCruFec ,
                                          java.util.Date AV51DevCruFec_to ,
                                          int AV58AlbRecCod ,
                                          String AV56AlbRef ,
                                          String AV57AlbREnt ,
                                          int A11669DevCruId ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A11672DevCruMat ,
                                          String A11682DevCruObs ,
                                          java.util.Date A11670DevCruFec ,
                                          int A44AlbRecCod ,
                                          String A45AlbRef ,
                                          String A46AlbREnt ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV48Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[30];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (((((TXPDEVCR1 T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T2.TrnCod) INNER JOIN TXPDEVCRU T5 ON T5.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T5.DevCruId = T1.DevCruId) LEFT JOIN (SELECT SUM(DevCruUnd) AS GXC1, EmprCod, DevCruId, AlbRecCod, SUM(DevCruPzs) AS GXC2 FROM TXPDEVCR1 GROUP BY EmprCod, DevCruId," ;
      scmdbuf += " AlbRecCod ) T6 ON T6.EmprCod = T1.EmprCod AND T6.DevCruId = T1.DevCruId AND T6.AlbRecCod = T1.AlbRecCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV64Wcconsultadevolucionesalmacentejidoencrudosindetalleds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.DevCruId,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T4.TrnNom) like '%' || UPPER(?)) or ( UPPER(T5.DevCruMat) like '%' || UPPER(?)) or ( UPPER(T5.DevCruObs) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int19[1] = (byte)(1) ;
         GXv_int19[2] = (byte)(1) ;
         GXv_int19[3] = (byte)(1) ;
         GXv_int19[4] = (byte)(1) ;
         GXv_int19[5] = (byte)(1) ;
         GXv_int19[6] = (byte)(1) ;
         GXv_int19[7] = (byte)(1) ;
      }
      if ( ! (0==AV65Wcconsultadevolucionesalmacentejidoencrudosindetalleds_2_tfdevcruid) )
      {
         addWhere(sWhereString, "(T1.DevCruId >= ?)");
      }
      else
      {
         GXv_int19[8] = (byte)(1) ;
      }
      if ( ! (0==AV66Wcconsultadevolucionesalmacentejidoencrudosindetalleds_3_tfdevcruid_to) )
      {
         addWhere(sWhereString, "(T1.DevCruId <= ?)");
      }
      else
      {
         GXv_int19[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67Wcconsultadevolucionesalmacentejidoencrudosindetalleds_4_tfdevcrufec)) )
      {
         addWhere(sWhereString, "(T5.DevCruFec >= ?)");
      }
      else
      {
         GXv_int19[10] = (byte)(1) ;
      }
      if ( ! (0==AV68Wcconsultadevolucionesalmacentejidoencrudosindetalleds_5_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int19[11] = (byte)(1) ;
      }
      if ( ! (0==AV69Wcconsultadevolucionesalmacentejidoencrudosindetalleds_6_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int19[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV70Wcconsultadevolucionesalmacentejidoencrudosindetalleds_7_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Wcconsultadevolucionesalmacentejidoencrudosindetalleds_8_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( ! (0==AV72Wcconsultadevolucionesalmacentejidoencrudosindetalleds_9_tftrncod) )
      {
         addWhere(sWhereString, "(T2.TrnCod >= ?)");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( ! (0==AV73Wcconsultadevolucionesalmacentejidoencrudosindetalleds_10_tftrncod_to) )
      {
         addWhere(sWhereString, "(T2.TrnCod <= ?)");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV74Wcconsultadevolucionesalmacentejidoencrudosindetalleds_11_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Wcconsultadevolucionesalmacentejidoencrudosindetalleds_12_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TrnNom = ?)");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel)==0) && ( ! (GXutil.strcmp("", AV76Wcconsultadevolucionesalmacentejidoencrudosindetalleds_13_tfdevcrumat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.DevCruMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Wcconsultadevolucionesalmacentejidoencrudosindetalleds_14_tfdevcrumat_sel)==0) )
      {
         addWhere(sWhereString, "(T5.DevCruMat = ?)");
      }
      else
      {
         GXv_int19[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel)==0) && ( ! (GXutil.strcmp("", AV78Wcconsultadevolucionesalmacentejidoencrudosindetalleds_15_tfdevcruobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.DevCruObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Wcconsultadevolucionesalmacentejidoencrudosindetalleds_16_tfdevcruobs_sel)==0) )
      {
         addWhere(sWhereString, "(T5.DevCruObs = ?)");
      }
      else
      {
         GXv_int19[22] = (byte)(1) ;
      }
      if ( ! (0==AV50Clicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int19[23] = (byte)(1) ;
      }
      if ( ! (0==AV52Clicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int19[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV49DevCruFec)) )
      {
         addWhere(sWhereString, "(T5.DevCruFec >= ?)");
      }
      else
      {
         GXv_int19[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV51DevCruFec_to)) )
      {
         addWhere(sWhereString, "(T5.DevCruFec <= ?)");
      }
      else
      {
         GXv_int19[26] = (byte)(1) ;
      }
      if ( ! (0==AV58AlbRecCod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod = ?)");
      }
      else
      {
         GXv_int19[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56AlbRef)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRef like ?)");
      }
      else
      {
         GXv_int19[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57AlbREnt)==0) )
      {
         addWhere(sWhereString, "(T2.AlbREnt like ?)");
      }
      else
      {
         GXv_int19[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
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
                  return conditional_H016O3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() , ((Boolean) dynConstraints[35]).booleanValue() , (String)dynConstraints[36] , (String)dynConstraints[37] );
            case 1 :
                  return conditional_H016O5(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() , ((Boolean) dynConstraints[35]).booleanValue() , (String)dynConstraints[36] , (String)dynConstraints[37] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H016O3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H016O5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(14);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[35], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 200);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 200);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 200);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 200);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               return;
      }
   }

}

