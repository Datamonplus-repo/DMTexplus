package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class disalb__ww_impl extends GXWebComponent
{
   public disalb__ww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public disalb__ww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( disalb__ww_impl.class ));
   }

   public disalb__ww_impl( int remoteHandle ,
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
      cmbavGridactiongroup1 = new HTMLChoice();
      cmbAlbRReo = new HTMLChoice();
      cmbAlbRUni = new HTMLChoice();
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
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
               AV64CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64CliCod), 6, 0));
               AV63CliNom = httpContext.GetPar( "CliNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63CliNom", AV63CliNom);
               AV65DisArtCod = httpContext.GetPar( "DisArtCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65DisArtCod", AV65DisArtCod);
               AV66DisArtDsc = httpContext.GetPar( "DisArtDsc") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66DisArtDsc", AV66DisArtDsc);
               AV67DisFec = localUtil.parseDateParm( httpContext.GetPar( "DisFec")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67DisFec", localUtil.format(AV67DisFec, "99/99/99"));
               AV68DisUnimed = httpContext.GetPar( "DisUnimed") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68DisUnimed", AV68DisUnimed);
               AV59VisualizarAcciones = GXutil.strtobool( httpContext.GetPar( "VisualizarAcciones")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59VisualizarAcciones", AV59VisualizarAcciones);
               AV60AccionesEnPopup = GXutil.strtobool( httpContext.GetPar( "AccionesEnPopup")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60AccionesEnPopup", AV60AccionesEnPopup);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,Integer.valueOf(A361DisCod),Integer.valueOf(AV64CliCod),AV63CliNom,AV65DisArtCod,AV66DisArtDsc,AV67DisFec,AV68DisUnimed,Boolean.valueOf(AV59VisualizarAcciones),Boolean.valueOf(AV60AccionesEnPopup)});
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
            if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
            {
               A396EmprCod = gxfirstwebparm ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
               {
                  A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
                  AV64CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64CliCod), 6, 0));
                  AV63CliNom = httpContext.GetPar( "CliNom") ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63CliNom", AV63CliNom);
                  AV65DisArtCod = httpContext.GetPar( "DisArtCod") ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65DisArtCod", AV65DisArtCod);
                  AV66DisArtDsc = httpContext.GetPar( "DisArtDsc") ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66DisArtDsc", AV66DisArtDsc);
                  AV67DisFec = localUtil.parseDateParm( httpContext.GetPar( "DisFec")) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67DisFec", localUtil.format(AV67DisFec, "99/99/99"));
                  AV68DisUnimed = httpContext.GetPar( "DisUnimed") ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68DisUnimed", AV68DisUnimed);
                  AV59VisualizarAcciones = GXutil.strtobool( httpContext.GetPar( "VisualizarAcciones")) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59VisualizarAcciones", AV59VisualizarAcciones);
                  AV60AccionesEnPopup = GXutil.strtobool( httpContext.GetPar( "AccionesEnPopup")) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60AccionesEnPopup", AV60AccionesEnPopup);
               }
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
      nRC_GXsfl_67 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_67"))) ;
      nGXsfl_67_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_67_idx"))) ;
      sGXsfl_67_idx = httpContext.GetPar( "sGXsfl_67_idx") ;
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
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV26TFAlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRecCod"))) ;
      AV27TFAlbRecCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRecCod_To"))) ;
      AV28TFAlbRef = httpContext.GetPar( "TFAlbRef") ;
      AV29TFAlbRef_Sel = httpContext.GetPar( "TFAlbRef_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV31TFAlbRReo_Sels);
      AV32TFAlbRLote = httpContext.GetPar( "TFAlbRLote") ;
      AV33TFAlbRLote_Sel = httpContext.GetPar( "TFAlbRLote_Sel") ;
      AV59VisualizarAcciones = GXutil.strtobool( httpContext.GetPar( "VisualizarAcciones")) ;
      AV78Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV69TotKilos = CommonUtil.decimalVal( httpContext.GetPar( "TotKilos"), ".") ;
      AV71TotMetros = CommonUtil.decimalVal( httpContext.GetPar( "TotMetros"), ".") ;
      AV73TotPiezas = GXutil.lval( httpContext.GetPar( "TotPiezas")) ;
      AV64CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV65DisArtCod = httpContext.GetPar( "DisArtCod") ;
      AV68DisUnimed = httpContext.GetPar( "DisUnimed") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A361DisCod, AV20ColumnsSelector, AV26TFAlbRecCod, AV27TFAlbRecCod_To, AV28TFAlbRef, AV29TFAlbRef_Sel, AV31TFAlbRReo_Sels, AV32TFAlbRLote, AV33TFAlbRLote_Sel, AV59VisualizarAcciones, AV78Pgmname, AV12OrderedBy, AV13OrderedDsc, AV69TotKilos, AV71TotMetros, AV73TotPiezas, AV64CliCod, AV65DisArtCod, AV68DisUnimed, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1XH2( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            validateSpaRequest();
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( ! isAjaxCallMode( ) )
            {
            }
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws1XH2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               if ( nDynComponent == 0 )
               {
                  we1XH2( ) ;
               }
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
         httpContext.writeValue( httpContext.getMessage( " Entradas de Almacén", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidos.disalb__ww", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV64CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV63CliNom)),GXutil.URLEncode(GXutil.rtrim(AV65DisArtCod)),GXutil.URLEncode(GXutil.rtrim(AV66DisArtDsc)),GXutil.URLEncode(GXutil.formatDateParm(AV67DisFec)),GXutil.URLEncode(GXutil.rtrim(AV68DisUnimed)),GXutil.URLEncode(GXutil.booltostr(AV59VisualizarAcciones)),GXutil.URLEncode(GXutil.booltostr(AV60AccionesEnPopup))}, new String[] {"EmprCod","DisCod","CliCod","CliNom","DisArtCod","DisArtDsc","DisFec","DisUnimed","VisualizarAcciones","AccionesEnPopup"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKILOS", getSecureSignedToken( sPrefix, localUtil.format( AV69TotKilos, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETROS", getSecureSignedToken( sPrefix, localUtil.format( AV71TotMetros, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTPIEZAS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV73TotPiezas), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"DisAlb__WW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV78Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidos\\disalb__ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_67", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_67, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV56GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV57GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV54DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV54DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA396EmprCod", GXutil.rtrim( wcpOA396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA361DisCod", GXutil.ltrim( localUtil.ntoc( wcpOA361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV64CliCod", GXutil.ltrim( localUtil.ntoc( wcpOAV64CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV63CliNom", GXutil.rtrim( wcpOAV63CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV65DisArtCod", GXutil.rtrim( wcpOAV65DisArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV66DisArtDsc", GXutil.rtrim( wcpOAV66DisArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV67DisFec", localUtil.dtoc( wcpOAV67DisFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV68DisUnimed", GXutil.rtrim( wcpOAV68DisUnimed));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"wcpOAV59VisualizarAcciones", wcpOAV59VisualizarAcciones);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"wcpOAV60AccionesEnPopup", wcpOAV60AccionesEnPopup);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV26TFAlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRECCOD_TO", GXutil.ltrim( localUtil.ntoc( AV27TFAlbRecCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBREF", GXutil.rtrim( AV28TFAlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBREF_SEL", GXutil.rtrim( AV29TFAlbRef_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTFALBRREO_SELS", AV31TFAlbRReo_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTFALBRREO_SELS", AV31TFAlbRReo_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRLOTE", GXutil.rtrim( AV32TFAlbRLote));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRLOTE_SEL", GXutil.rtrim( AV33TFAlbRLote_Sel));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vVISUALIZARACCIONES", AV59VisualizarAcciones);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTKILOS", GXutil.ltrim( localUtil.ntoc( AV69TotKilos, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKILOS", getSecureSignedToken( sPrefix, localUtil.format( AV69TotKilos, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMETROS", GXutil.ltrim( localUtil.ntoc( AV71TotMetros, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETROS", getSecureSignedToken( sPrefix, localUtil.format( AV71TotMetros, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTPIEZAS", GXutil.ltrim( localUtil.ntoc( AV73TotPiezas, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTPIEZAS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV73TotPiezas), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDISUNIMED", GXutil.rtrim( AV68DisUnimed));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vACCIONESENPOPUP", AV60AccionesEnPopup);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBRUNIUTI", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBRPIEUTI", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEPEDIDO_Width", GXutil.rtrim( Dvpanel_tablepedido_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEPEDIDO_Autowidth", GXutil.booltostr( Dvpanel_tablepedido_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEPEDIDO_Autoheight", GXutil.booltostr( Dvpanel_tablepedido_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEPEDIDO_Cls", GXutil.rtrim( Dvpanel_tablepedido_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEPEDIDO_Title", GXutil.rtrim( Dvpanel_tablepedido_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEPEDIDO_Collapsible", GXutil.booltostr( Dvpanel_tablepedido_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEPEDIDO_Collapsed", GXutil.booltostr( Dvpanel_tablepedido_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEPEDIDO_Showcollapseicon", GXutil.booltostr( Dvpanel_tablepedido_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEPEDIDO_Iconposition", GXutil.rtrim( Dvpanel_tablepedido_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEPEDIDO_Autoscroll", GXutil.booltostr( Dvpanel_tablepedido_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Allowmultipleselection", GXutil.rtrim( Ddo_grid_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
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

   public void renderHtmlCloseForm1XH2( )
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
         httpContext.writeText( "<script type=\"text/javascript\">") ;
         httpContext.writeText( "gx.setLanguageCode(\""+httpContext.getLanguageProperty( "code")+"\");") ;
         if ( ! httpContext.isSpaRequest( ) )
         {
            httpContext.writeText( "gx.setDateFormat(\""+httpContext.getLanguageProperty( "date_fmt")+"\");") ;
            httpContext.writeText( "gx.setTimeFormat("+httpContext.getLanguageProperty( "time_fmt")+");") ;
            httpContext.writeText( "gx.setCenturyFirstYear("+40+");") ;
            httpContext.writeText( "gx.setDecimalPoint(\""+httpContext.getLanguageProperty( "decimal_point")+"\");") ;
            httpContext.writeText( "gx.setThousandSeparator(\""+httpContext.getLanguageProperty( "thousand_sep")+"\");") ;
            httpContext.writeText( "gx.StorageTimeZone = "+2+";") ;
         }
         httpContext.writeText( "</script>") ;
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
      return "Pedidos.DisAlb__WW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Entradas de Almacén", "") ;
   }

   public void wb1XH0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.pedidos.disalb__ww");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, divDvpanel_tablepedido_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_tablepedido_cell_Class, "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_tablepedido.setProperty("Width", Dvpanel_tablepedido_Width);
         ucDvpanel_tablepedido.setProperty("AutoWidth", Dvpanel_tablepedido_Autowidth);
         ucDvpanel_tablepedido.setProperty("AutoHeight", Dvpanel_tablepedido_Autoheight);
         ucDvpanel_tablepedido.setProperty("Cls", Dvpanel_tablepedido_Cls);
         ucDvpanel_tablepedido.setProperty("Title", Dvpanel_tablepedido_Title);
         ucDvpanel_tablepedido.setProperty("Collapsible", Dvpanel_tablepedido_Collapsible);
         ucDvpanel_tablepedido.setProperty("Collapsed", Dvpanel_tablepedido_Collapsed);
         ucDvpanel_tablepedido.setProperty("ShowCollapseIcon", Dvpanel_tablepedido_Showcollapseicon);
         ucDvpanel_tablepedido.setProperty("IconPosition", Dvpanel_tablepedido_Iconposition);
         ucDvpanel_tablepedido.setProperty("AutoScroll", Dvpanel_tablepedido_Autoscroll);
         ucDvpanel_tablepedido.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tablepedido_Internalname, sPrefix+"DVPANEL_TABLEPEDIDOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TABLEPEDIDOContainer"+"TablePedido"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablepedido_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 CellMarginTop25", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbngruia_Internalname, httpContext.getMessage( "<b>Nº Disp Int</b>", ""), "", "", lblTbngruia_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_Pedidos\\DisAlb__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisCod_Internalname, httpContext.getMessage( "Codigo Disposicion", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDisfec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDisfec_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavDisfec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDisfec_Internalname, localUtil.format(AV67DisFec, "99/99/99"), localUtil.format( AV67DisFec, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDisfec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDisfec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb__WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDisfec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavDisfec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Pedidos\\DisAlb__WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV64CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV64CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV64CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV63CliNom), GXutil.rtrim( localUtil.format( AV63CliNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDisartcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDisartcod_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDisartcod_Internalname, GXutil.rtrim( AV65DisArtCod), GXutil.rtrim( localUtil.format( AV65DisArtCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDisartcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDisartcod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDisartdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDisartdsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDisartdsc_Internalname, GXutil.rtrim( AV66DisArtDsc), GXutil.rtrim( localUtil.format( AV66DisArtDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDisartdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDisartdsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, divTableheader_Visible, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnagregar2_Internalname, "gx.evt.setGridEvt("+GXutil.str( 67, 2, 0)+","+"null"+");", httpContext.getMessage( "Agregar", ""), bttBtnagregar2_Jsonclick, 5, httpContext.getMessage( "Agregar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOAGREGAR2\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\DisAlb__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 67, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\DisAlb__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_53_1XH2( true) ;
      }
      else
      {
         wb_table1_53_1XH2( false) ;
      }
      return  ;
   }

   public void wb_table1_53_1XH2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", divUnnamedtable1_Height, "px", "", "left", "top", "", "", "div");
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
         startgridcontrol67( ) ;
      }
      if ( wbEnd == 67 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_67 = (int)(nGXsfl_67_idx-1) ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_85_1XH2( true) ;
      }
      else
      {
         wb_table2_85_1XH2( false) ;
      }
      return  ;
   }

   public void wb_table2_85_1XH2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV56GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV57GridPageCount);
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 67, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\DisAlb__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV78Pgmname), GXutil.rtrim( localUtil.format( AV78Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         ucDdo_grid.setProperty("AllowMultipleSelection", Ddo_grid_Allowmultipleselection);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV54DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV54DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb__WW.htm");
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
      if ( wbEnd == 67 )
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

   public void start1XH2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Entradas de Almacén", ""), (short)(0)) ;
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
            strup1XH0( ) ;
         }
      }
   }

   public void ws1XH2( )
   {
      start1XH2( ) ;
      evt1XH2( ) ;
   }

   public void evt1XH2( )
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
                              strup1XH0( ) ;
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
                              strup1XH0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111XH2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1XH0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121XH2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1XH0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131XH2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1XH0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141XH2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOAGREGAR2'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1XH0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoAgregar2' */
                                 e151XH2 ();
                              }
                           }
                           /* No code required for Cancel button. It is implemented as the Reset button. */
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1XH0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "'DOINSERT'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1XH0( ) ;
                           }
                           nGXsfl_67_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_67_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_67_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_672( ) ;
                           cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
                           cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
                           AV75GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75GridActionGroup1), 4, 0));
                           A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
                           cmbAlbRReo.setName( cmbAlbRReo.getInternalname() );
                           cmbAlbRReo.setValue( httpContext.cgiGet( cmbAlbRReo.getInternalname()) );
                           A55AlbRReo = httpContext.cgiGet( cmbAlbRReo.getInternalname()) ;
                           A6463AlbRLote = httpContext.cgiGet( edtAlbRLote_Internalname) ;
                           A4920AlbRGrm2 = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4921AlbRAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)) ;
                           cmbAlbRUni.setName( cmbAlbRUni.getInternalname() );
                           cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
                           A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
                           A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
                           A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A595Kilos = localUtil.ctond( httpContext.cgiGet( edtKilos_Internalname)) ;
                           A631Metros = localUtil.ctond( httpContext.cgiGet( edtMetros_Internalname)) ;
                           A673Piezas = (int)(localUtil.ctol( httpContext.cgiGet( edtPiezas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e161XH2 ();
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
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e171XH2 ();
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
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e181XH2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONGROUP1.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e191XH2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: 'DoInsert' */
                                       e201XH2 ();
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
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                                 {
                                    strup1XH0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
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

   public void we1XH2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1XH2( ) ;
         }
      }
   }

   public void pa1XH2( )
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
            GX_FocusControl = edtavTotvaluekilos_Internalname ;
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
      subsflControlProps_672( ) ;
      while ( nGXsfl_67_idx <= nRC_GXsfl_67 )
      {
         sendrow_672( ) ;
         nGXsfl_67_idx = ((subGrid_Islastpage==1)&&(nGXsfl_67_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_67_idx+1) ;
         sGXsfl_67_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_67_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_672( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String A396EmprCod ,
                                 int A361DisCod ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 int AV26TFAlbRecCod ,
                                 int AV27TFAlbRecCod_To ,
                                 String AV28TFAlbRef ,
                                 String AV29TFAlbRef_Sel ,
                                 GXSimpleCollection<String> AV31TFAlbRReo_Sels ,
                                 String AV32TFAlbRLote ,
                                 String AV33TFAlbRLote_Sel ,
                                 boolean AV59VisualizarAcciones ,
                                 String AV78Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 java.math.BigDecimal AV69TotKilos ,
                                 java.math.BigDecimal AV71TotMetros ,
                                 long AV73TotPiezas ,
                                 int AV64CliCod ,
                                 String AV65DisArtCod ,
                                 String AV68DisUnimed ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e171XH2 ();
      GRID_nCurrentRecord = 0 ;
      rf1XH2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"DisAlb__WW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV78Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidos\\disalb__ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf1XH2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV78Pgmname = "Pedidos.DisAlb__WW" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78Pgmname", AV78Pgmname);
      Gx_err = (short)(0) ;
      edtavDisfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDisfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisfec_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavDisartcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDisartcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisartcod_Enabled), 5, 0), true);
      edtavDisartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDisartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisartdsc_Enabled), 5, 0), true);
      edtavTotvaluekilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluekilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluekilos_Enabled), 5, 0), true);
      edtavTotvaluemetros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemetros_Enabled), 5, 0), true);
      edtavTotvaluepiezas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluepiezas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluepiezas_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1XH2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(67) ;
      /* Execute user event: Refresh */
      e171XH2 ();
      nGXsfl_67_idx = 1 ;
      sGXsfl_67_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_67_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_672( ) ;
      bGXsfl_67_Refreshing = true ;
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
         subsflControlProps_672( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              A55AlbRReo ,
                                              AV87Pedidos_disalb__wwds_5_tfalbrreo_sels ,
                                              Integer.valueOf(AV83Pedidos_disalb__wwds_1_tfalbreccod) ,
                                              Integer.valueOf(AV84Pedidos_disalb__wwds_2_tfalbreccod_to) ,
                                              AV86Pedidos_disalb__wwds_4_tfalbref_sel ,
                                              AV85Pedidos_disalb__wwds_3_tfalbref ,
                                              Integer.valueOf(AV87Pedidos_disalb__wwds_5_tfalbrreo_sels.size()) ,
                                              AV89Pedidos_disalb__wwds_7_tfalbrlote_sel ,
                                              AV88Pedidos_disalb__wwds_6_tfalbrlote ,
                                              Integer.valueOf(A44AlbRecCod) ,
                                              A45AlbRef ,
                                              A6463AlbRLote ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A361DisCod) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT
                                              }
         });
         lV85Pedidos_disalb__wwds_3_tfalbref = GXutil.padr( GXutil.rtrim( AV85Pedidos_disalb__wwds_3_tfalbref), 16, "%") ;
         lV88Pedidos_disalb__wwds_6_tfalbrlote = GXutil.padr( GXutil.rtrim( AV88Pedidos_disalb__wwds_6_tfalbrlote), 20, "%") ;
         /* Using cursor H01XH2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(AV83Pedidos_disalb__wwds_1_tfalbreccod), Integer.valueOf(AV84Pedidos_disalb__wwds_2_tfalbreccod_to), lV85Pedidos_disalb__wwds_3_tfalbref, AV86Pedidos_disalb__wwds_4_tfalbref_sel, lV88Pedidos_disalb__wwds_6_tfalbrlote, AV89Pedidos_disalb__wwds_7_tfalbrlote_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_67_idx = 1 ;
         sGXsfl_67_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_67_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_672( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A673Piezas = H01XH2_A673Piezas[0] ;
            A631Metros = H01XH2_A631Metros[0] ;
            A595Kilos = H01XH2_A595Kilos[0] ;
            A56AlbRUni = H01XH2_A56AlbRUni[0] ;
            A4921AlbRAnc = H01XH2_A4921AlbRAnc[0] ;
            A4920AlbRGrm2 = H01XH2_A4920AlbRGrm2[0] ;
            A6463AlbRLote = H01XH2_A6463AlbRLote[0] ;
            A55AlbRReo = H01XH2_A55AlbRReo[0] ;
            A45AlbRef = H01XH2_A45AlbRef[0] ;
            A44AlbRecCod = H01XH2_A44AlbRecCod[0] ;
            A60AlbRUniUti = H01XH2_A60AlbRUniUti[0] ;
            A58AlbRUniEnt = H01XH2_A58AlbRUniEnt[0] ;
            A54AlbRPieUti = H01XH2_A54AlbRPieUti[0] ;
            A52AlbRPieEnt = H01XH2_A52AlbRPieEnt[0] ;
            A56AlbRUni = H01XH2_A56AlbRUni[0] ;
            A4921AlbRAnc = H01XH2_A4921AlbRAnc[0] ;
            A4920AlbRGrm2 = H01XH2_A4920AlbRGrm2[0] ;
            A6463AlbRLote = H01XH2_A6463AlbRLote[0] ;
            A55AlbRReo = H01XH2_A55AlbRReo[0] ;
            A45AlbRef = H01XH2_A45AlbRef[0] ;
            A60AlbRUniUti = H01XH2_A60AlbRUniUti[0] ;
            A58AlbRUniEnt = H01XH2_A58AlbRUniEnt[0] ;
            A54AlbRPieUti = H01XH2_A54AlbRPieUti[0] ;
            A52AlbRPieEnt = H01XH2_A52AlbRPieEnt[0] ;
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
            {
               A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
            }
            else
            {
               if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
               {
                  A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               }
               else
               {
                  A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               }
            }
            A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
            e181XH2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(67) ;
         wb1XH0( ) ;
      }
      bGXsfl_67_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1XH2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTKILOS", GXutil.ltrim( localUtil.ntoc( AV69TotKilos, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKILOS", getSecureSignedToken( sPrefix, localUtil.format( AV69TotKilos, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMETROS", GXutil.ltrim( localUtil.ntoc( AV71TotMetros, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETROS", getSecureSignedToken( sPrefix, localUtil.format( AV71TotMetros, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTPIEZAS", GXutil.ltrim( localUtil.ntoc( AV73TotPiezas, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTPIEZAS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV73TotPiezas), "ZZZ9")));
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
      AV83Pedidos_disalb__wwds_1_tfalbreccod = AV26TFAlbRecCod ;
      AV84Pedidos_disalb__wwds_2_tfalbreccod_to = AV27TFAlbRecCod_To ;
      AV85Pedidos_disalb__wwds_3_tfalbref = AV28TFAlbRef ;
      AV86Pedidos_disalb__wwds_4_tfalbref_sel = AV29TFAlbRef_Sel ;
      AV87Pedidos_disalb__wwds_5_tfalbrreo_sels = AV31TFAlbRReo_Sels ;
      AV88Pedidos_disalb__wwds_6_tfalbrlote = AV32TFAlbRLote ;
      AV89Pedidos_disalb__wwds_7_tfalbrlote_sel = AV33TFAlbRLote_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV87Pedidos_disalb__wwds_5_tfalbrreo_sels ,
                                           Integer.valueOf(AV83Pedidos_disalb__wwds_1_tfalbreccod) ,
                                           Integer.valueOf(AV84Pedidos_disalb__wwds_2_tfalbreccod_to) ,
                                           AV86Pedidos_disalb__wwds_4_tfalbref_sel ,
                                           AV85Pedidos_disalb__wwds_3_tfalbref ,
                                           Integer.valueOf(AV87Pedidos_disalb__wwds_5_tfalbrreo_sels.size()) ,
                                           AV89Pedidos_disalb__wwds_7_tfalbrlote_sel ,
                                           AV88Pedidos_disalb__wwds_6_tfalbrlote ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A45AlbRef ,
                                           A6463AlbRLote ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A361DisCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV85Pedidos_disalb__wwds_3_tfalbref = GXutil.padr( GXutil.rtrim( AV85Pedidos_disalb__wwds_3_tfalbref), 16, "%") ;
      lV88Pedidos_disalb__wwds_6_tfalbrlote = GXutil.padr( GXutil.rtrim( AV88Pedidos_disalb__wwds_6_tfalbrlote), 20, "%") ;
      /* Using cursor H01XH3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(AV83Pedidos_disalb__wwds_1_tfalbreccod), Integer.valueOf(AV84Pedidos_disalb__wwds_2_tfalbreccod_to), lV85Pedidos_disalb__wwds_3_tfalbref, AV86Pedidos_disalb__wwds_4_tfalbref_sel, lV88Pedidos_disalb__wwds_6_tfalbrlote, AV89Pedidos_disalb__wwds_7_tfalbrlote_sel});
      GRID_nRecordCount = H01XH3_AGRID_nRecordCount[0] ;
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
      AV83Pedidos_disalb__wwds_1_tfalbreccod = AV26TFAlbRecCod ;
      AV84Pedidos_disalb__wwds_2_tfalbreccod_to = AV27TFAlbRecCod_To ;
      AV85Pedidos_disalb__wwds_3_tfalbref = AV28TFAlbRef ;
      AV86Pedidos_disalb__wwds_4_tfalbref_sel = AV29TFAlbRef_Sel ;
      AV87Pedidos_disalb__wwds_5_tfalbrreo_sels = AV31TFAlbRReo_Sels ;
      AV88Pedidos_disalb__wwds_6_tfalbrlote = AV32TFAlbRLote ;
      AV89Pedidos_disalb__wwds_7_tfalbrlote_sel = AV33TFAlbRLote_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A361DisCod, AV20ColumnsSelector, AV26TFAlbRecCod, AV27TFAlbRecCod_To, AV28TFAlbRef, AV29TFAlbRef_Sel, AV31TFAlbRReo_Sels, AV32TFAlbRLote, AV33TFAlbRLote_Sel, AV59VisualizarAcciones, AV78Pgmname, AV12OrderedBy, AV13OrderedDsc, AV69TotKilos, AV71TotMetros, AV73TotPiezas, AV64CliCod, AV65DisArtCod, AV68DisUnimed, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV83Pedidos_disalb__wwds_1_tfalbreccod = AV26TFAlbRecCod ;
      AV84Pedidos_disalb__wwds_2_tfalbreccod_to = AV27TFAlbRecCod_To ;
      AV85Pedidos_disalb__wwds_3_tfalbref = AV28TFAlbRef ;
      AV86Pedidos_disalb__wwds_4_tfalbref_sel = AV29TFAlbRef_Sel ;
      AV87Pedidos_disalb__wwds_5_tfalbrreo_sels = AV31TFAlbRReo_Sels ;
      AV88Pedidos_disalb__wwds_6_tfalbrlote = AV32TFAlbRLote ;
      AV89Pedidos_disalb__wwds_7_tfalbrlote_sel = AV33TFAlbRLote_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A361DisCod, AV20ColumnsSelector, AV26TFAlbRecCod, AV27TFAlbRecCod_To, AV28TFAlbRef, AV29TFAlbRef_Sel, AV31TFAlbRReo_Sels, AV32TFAlbRLote, AV33TFAlbRLote_Sel, AV59VisualizarAcciones, AV78Pgmname, AV12OrderedBy, AV13OrderedDsc, AV69TotKilos, AV71TotMetros, AV73TotPiezas, AV64CliCod, AV65DisArtCod, AV68DisUnimed, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV83Pedidos_disalb__wwds_1_tfalbreccod = AV26TFAlbRecCod ;
      AV84Pedidos_disalb__wwds_2_tfalbreccod_to = AV27TFAlbRecCod_To ;
      AV85Pedidos_disalb__wwds_3_tfalbref = AV28TFAlbRef ;
      AV86Pedidos_disalb__wwds_4_tfalbref_sel = AV29TFAlbRef_Sel ;
      AV87Pedidos_disalb__wwds_5_tfalbrreo_sels = AV31TFAlbRReo_Sels ;
      AV88Pedidos_disalb__wwds_6_tfalbrlote = AV32TFAlbRLote ;
      AV89Pedidos_disalb__wwds_7_tfalbrlote_sel = AV33TFAlbRLote_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A361DisCod, AV20ColumnsSelector, AV26TFAlbRecCod, AV27TFAlbRecCod_To, AV28TFAlbRef, AV29TFAlbRef_Sel, AV31TFAlbRReo_Sels, AV32TFAlbRLote, AV33TFAlbRLote_Sel, AV59VisualizarAcciones, AV78Pgmname, AV12OrderedBy, AV13OrderedDsc, AV69TotKilos, AV71TotMetros, AV73TotPiezas, AV64CliCod, AV65DisArtCod, AV68DisUnimed, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV83Pedidos_disalb__wwds_1_tfalbreccod = AV26TFAlbRecCod ;
      AV84Pedidos_disalb__wwds_2_tfalbreccod_to = AV27TFAlbRecCod_To ;
      AV85Pedidos_disalb__wwds_3_tfalbref = AV28TFAlbRef ;
      AV86Pedidos_disalb__wwds_4_tfalbref_sel = AV29TFAlbRef_Sel ;
      AV87Pedidos_disalb__wwds_5_tfalbrreo_sels = AV31TFAlbRReo_Sels ;
      AV88Pedidos_disalb__wwds_6_tfalbrlote = AV32TFAlbRLote ;
      AV89Pedidos_disalb__wwds_7_tfalbrlote_sel = AV33TFAlbRLote_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A361DisCod, AV20ColumnsSelector, AV26TFAlbRecCod, AV27TFAlbRecCod_To, AV28TFAlbRef, AV29TFAlbRef_Sel, AV31TFAlbRReo_Sels, AV32TFAlbRLote, AV33TFAlbRLote_Sel, AV59VisualizarAcciones, AV78Pgmname, AV12OrderedBy, AV13OrderedDsc, AV69TotKilos, AV71TotMetros, AV73TotPiezas, AV64CliCod, AV65DisArtCod, AV68DisUnimed, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV83Pedidos_disalb__wwds_1_tfalbreccod = AV26TFAlbRecCod ;
      AV84Pedidos_disalb__wwds_2_tfalbreccod_to = AV27TFAlbRecCod_To ;
      AV85Pedidos_disalb__wwds_3_tfalbref = AV28TFAlbRef ;
      AV86Pedidos_disalb__wwds_4_tfalbref_sel = AV29TFAlbRef_Sel ;
      AV87Pedidos_disalb__wwds_5_tfalbrreo_sels = AV31TFAlbRReo_Sels ;
      AV88Pedidos_disalb__wwds_6_tfalbrlote = AV32TFAlbRLote ;
      AV89Pedidos_disalb__wwds_7_tfalbrlote_sel = AV33TFAlbRLote_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A361DisCod, AV20ColumnsSelector, AV26TFAlbRecCod, AV27TFAlbRecCod_To, AV28TFAlbRef, AV29TFAlbRef_Sel, AV31TFAlbRReo_Sels, AV32TFAlbRLote, AV33TFAlbRLote_Sel, AV59VisualizarAcciones, AV78Pgmname, AV12OrderedBy, AV13OrderedDsc, AV69TotKilos, AV71TotMetros, AV73TotPiezas, AV64CliCod, AV65DisArtCod, AV68DisUnimed, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV78Pgmname = "Pedidos.DisAlb__WW" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78Pgmname", AV78Pgmname);
      Gx_err = (short)(0) ;
      edtavDisfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDisfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisfec_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavDisartcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDisartcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisartcod_Enabled), 5, 0), true);
      edtavDisartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDisartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisartdsc_Enabled), 5, 0), true);
      edtavTotvaluekilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluekilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluekilos_Enabled), 5, 0), true);
      edtavTotvaluemetros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemetros_Enabled), 5, 0), true);
      edtavTotvaluepiezas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluepiezas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluepiezas_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1XH0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e161XH2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV54DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_67 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_67"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV56GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV57GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
         wcpOA361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV64CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV64CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV63CliNom = httpContext.cgiGet( sPrefix+"wcpOAV63CliNom") ;
         wcpOAV65DisArtCod = httpContext.cgiGet( sPrefix+"wcpOAV65DisArtCod") ;
         wcpOAV66DisArtDsc = httpContext.cgiGet( sPrefix+"wcpOAV66DisArtDsc") ;
         wcpOAV67DisFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV67DisFec"), 0) ;
         wcpOAV68DisUnimed = httpContext.cgiGet( sPrefix+"wcpOAV68DisUnimed") ;
         wcpOAV59VisualizarAcciones = GXutil.strtobool( httpContext.cgiGet( sPrefix+"wcpOAV59VisualizarAcciones")) ;
         wcpOAV60AccionesEnPopup = GXutil.strtobool( httpContext.cgiGet( sPrefix+"wcpOAV60AccionesEnPopup")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_tablepedido_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEPEDIDO_Width") ;
         Dvpanel_tablepedido_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEPEDIDO_Autowidth")) ;
         Dvpanel_tablepedido_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEPEDIDO_Autoheight")) ;
         Dvpanel_tablepedido_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEPEDIDO_Cls") ;
         Dvpanel_tablepedido_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEPEDIDO_Title") ;
         Dvpanel_tablepedido_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEPEDIDO_Collapsible")) ;
         Dvpanel_tablepedido_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEPEDIDO_Collapsed")) ;
         Dvpanel_tablepedido_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEPEDIDO_Showcollapseicon")) ;
         Dvpanel_tablepedido_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEPEDIDO_Iconposition") ;
         Dvpanel_tablepedido_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEPEDIDO_Autoscroll")) ;
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
         Ddo_grid_Allowmultipleselection = httpContext.cgiGet( sPrefix+"DDO_GRID_Allowmultipleselection") ;
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistfixedvalues") ;
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
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         /* Read variables values. */
         AV70TotValueKilos = httpContext.cgiGet( edtavTotvaluekilos_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TotValueKilos", AV70TotValueKilos);
         AV72TotValueMetros = httpContext.cgiGet( edtavTotvaluemetros_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TotValueMetros", AV72TotValueMetros);
         AV74TotValuePiezas = httpContext.cgiGet( edtavTotvaluepiezas_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TotValuePiezas", AV74TotValuePiezas);
         AV78Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78Pgmname", AV78Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"DisAlb__WW");
         AV78Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78Pgmname", AV78Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV78Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("pedidos\\disalb__ww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e161XH2 ();
      if (returnInSub) return;
   }

   public void e161XH2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV79Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      disalb__ww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV79Station = GXt_char1 ;
      GXv_char2[0] = AV80Emprcod ;
      GXv_char3[0] = AV81Emprnom ;
      GXv_char4[0] = AV82Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV79Station, GXv_char2, GXv_char3, GXv_char4) ;
      disalb__ww_impl.this.AV80Emprcod = GXv_char2[0] ;
      disalb__ww_impl.this.AV81Emprnom = GXv_char3[0] ;
      disalb__ww_impl.this.AV82Usurcod = GXv_char4[0] ;
      divUnnamedtable1_Height = 500 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divUnnamedtable1_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable1_Height), 9, 0), true);
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV54DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV54DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e171XH2( )
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
      /* Execute user subroutine: 'CHECKSECURITYFORACTIONS' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S162 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV22Session.getValue("Pedidos.DisAlb__WWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("Pedidos.DisAlb__WWColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S172 ();
         if (returnInSub) return;
      }
      edtAlbRecCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRecCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Visible), 5, 0), !bGXsfl_67_Refreshing);
      edtAlbRef_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRef_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Visible), 5, 0), !bGXsfl_67_Refreshing);
      cmbAlbRReo.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbRReo.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbRReo.getVisible(), 5, 0), !bGXsfl_67_Refreshing);
      edtAlbRLote_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRLote_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLote_Visible), 5, 0), !bGXsfl_67_Refreshing);
      edtAlbRGrm2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRGrm2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRGrm2_Visible), 5, 0), !bGXsfl_67_Refreshing);
      edtAlbRAnc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRAnc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRAnc_Visible), 5, 0), !bGXsfl_67_Refreshing);
      edtAlbRPieEnt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRPieEnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Visible), 5, 0), !bGXsfl_67_Refreshing);
      edtAlbRUniEnt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRUniEnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Visible), 5, 0), !bGXsfl_67_Refreshing);
      cmbAlbRUni.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbRUni.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbRUni.getVisible(), 5, 0), !bGXsfl_67_Refreshing);
      edtAlbRUniDis_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRUniDis_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Visible), 5, 0), !bGXsfl_67_Refreshing);
      edtAlbRPieDis_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRPieDis_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Visible), 5, 0), !bGXsfl_67_Refreshing);
      edtKilos_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtKilos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKilos_Visible), 5, 0), !bGXsfl_67_Refreshing);
      edtMetros_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMetros_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetros_Visible), 5, 0), !bGXsfl_67_Refreshing);
      edtPiezas_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPiezas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPiezas_Visible), 5, 0), !bGXsfl_67_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S182 ();
      if (returnInSub) return;
      AV56GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56GridCurrentPage), 10, 0));
      AV57GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S192 ();
      if (returnInSub) return;
      AV83Pedidos_disalb__wwds_1_tfalbreccod = AV26TFAlbRecCod ;
      AV84Pedidos_disalb__wwds_2_tfalbreccod_to = AV27TFAlbRecCod_To ;
      AV85Pedidos_disalb__wwds_3_tfalbref = AV28TFAlbRef ;
      AV86Pedidos_disalb__wwds_4_tfalbref_sel = AV29TFAlbRef_Sel ;
      AV87Pedidos_disalb__wwds_5_tfalbrreo_sels = AV31TFAlbRReo_Sels ;
      AV88Pedidos_disalb__wwds_6_tfalbrlote = AV32TFAlbRLote ;
      AV89Pedidos_disalb__wwds_7_tfalbrlote_sel = AV33TFAlbRLote_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
   }

   public void e111XH2( )
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
         AV55PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV55PageToGo) ;
      }
   }

   public void e121XH2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e131XH2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRecCod") == 0 )
         {
            AV26TFAlbRecCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFAlbRecCod), 8, 0));
            AV27TFAlbRecCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFAlbRecCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFAlbRecCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRef") == 0 )
         {
            AV28TFAlbRef = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFAlbRef", AV28TFAlbRef);
            AV29TFAlbRef_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFAlbRef_Sel", AV29TFAlbRef_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRReo") == 0 )
         {
            AV30TFAlbRReo_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFAlbRReo_SelsJson", AV30TFAlbRReo_SelsJson);
            AV31TFAlbRReo_Sels.fromJSonString(AV30TFAlbRReo_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRLote") == 0 )
         {
            AV32TFAlbRLote = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFAlbRLote", AV32TFAlbRLote);
            AV33TFAlbRLote_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFAlbRLote_Sel", AV33TFAlbRLote_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV31TFAlbRReo_Sels", AV31TFAlbRReo_Sels);
   }

   private void e181XH2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         cmbavGridactiongroup1.removeAllItems();
         cmbavGridactiongroup1.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactiongroup1.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Modificar", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactiongroup1.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      }
      AV61Update = httpContext.getMessage( "GXM_update", "") ;
      if ( AV59VisualizarAcciones )
      {
         /* * Property Link not supported in */
         /* * Property Link not supported in */
         /* * Property Link not supported in */
         /* * Property Link not supported in */
         /*
            Assignment error:
            ================
            Expression: [ t('link(',1),t(o(0,'Pedidos\DisAlb__TRN'),28),t(',',7),t([ 68,'Insert' ],44),t(',',7),t(396,2),t(',',7),t(361,2),t(',',7),t(44,2),t(',',7),t('Clicod',23),t(',',7),t('Disartcod',23),t(',',7),t('Disunimed',23),t(')',4) ]
            Target    : [ t('Update',23),t('Link',3) ]
            ForType   : 29
            Type      : []
         */
         /* * Property Class not supported in */
         /* * Property Class not supported in */
         /* * Property Class not supported in */
         /* * Property Class not supported in */
         /*
            Assignment error:
            ================
            Expression: [ t('''Attribute''',3) ]
            Target    : [ t('Update',23),t('Class',3) ]
            ForType   : 29
            Type      : []
         */
      }
      else
      {
         /* * Property Link not supported in */
         /* * Property Link not supported in */
         /* * Property Link not supported in */
         /* * Property Link not supported in */
         /*
            Assignment error:
            ================
            Expression: [ t('""',3) ]
            Target    : [ t('Update',23),t('Link',3) ]
            ForType   : 29
            Type      : []
         */
         /* * Property Class not supported in */
         /* * Property Class not supported in */
         /* * Property Class not supported in */
         /* * Property Class not supported in */
         /*
            Assignment error:
            ================
            Expression: [ t('''Invisible''',3) ]
            Target    : [ t('Update',23),t('Class',3) ]
            ForType   : 29
            Type      : []
         */
      }
      AV62Delete = httpContext.getMessage( "GX_BtnDelete", "") ;
      if ( AV59VisualizarAcciones )
      {
         /* * Property Link not supported in */
         /* * Property Link not supported in */
         /* * Property Link not supported in */
         /* * Property Link not supported in */
         /*
            Assignment error:
            ================
            Expression: [ t('link(',1),t(o(0,'Pedidos\DisAlb__TRN'),28),t(',',7),t([ 68,'Delete' ],44),t(',',7),t(396,2),t(',',7),t(361,2),t(',',7),t(44,2),t(',',7),t('Clicod',23),t(',',7),t('Disartcod',23),t(',',7),t('Disunimed',23),t(')',4) ]
            Target    : [ t('Delete',23),t('Link',3) ]
            ForType   : 29
            Type      : []
         */
         /* * Property Class not supported in */
         /* * Property Class not supported in */
         /* * Property Class not supported in */
         /* * Property Class not supported in */
         /*
            Assignment error:
            ================
            Expression: [ t('''Attribute''',3) ]
            Target    : [ t('Delete',23),t('Class',3) ]
            ForType   : 29
            Type      : []
         */
      }
      else
      {
         /* * Property Link not supported in */
         /* * Property Link not supported in */
         /* * Property Link not supported in */
         /* * Property Link not supported in */
         /*
            Assignment error:
            ================
            Expression: [ t('""',3) ]
            Target    : [ t('Delete',23),t('Link',3) ]
            ForType   : 29
            Type      : []
         */
         /* * Property Class not supported in */
         /* * Property Class not supported in */
         /* * Property Class not supported in */
         /* * Property Class not supported in */
         /*
            Assignment error:
            ================
            Expression: [ t('''Invisible''',3) ]
            Target    : [ t('Delete',23),t('Class',3) ]
            ForType   : 29
            Type      : []
         */
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(67) ;
      }
      sendrow_672( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_67_Refreshing )
      {
         httpContext.doAjaxLoad(67, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV75GridActionGroup1, 4, 0)) );
   }

   public void e141XH2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "Pedidos.DisAlb__WWColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
   }

   public void e191XH2( )
   {
      /* Gridactiongroup1_Click Routine */
      returnInSub = false ;
      if ( AV75GridActionGroup1 == 1 )
      {
         /* Execute user subroutine: 'DO MODIFICAR' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV75GridActionGroup1 == 2 )
      {
         /* Execute user subroutine: 'DO ELIMINAR' */
         S212 ();
         if (returnInSub) return;
      }
      AV75GridActionGroup1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75GridActionGroup1), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV75GridActionGroup1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
   }

   public void e151XH2( )
   {
      /* 'DoAgregar2' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.pedidos.disalb__trn", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(AV64CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV65DisArtCod)),GXutil.URLEncode(GXutil.rtrim(AV68DisUnimed))}, new String[] {"Mode","EmprCod","DisCod","AlbRecCod","ClicodIn","DisArtcodIn","DisUniMedIn"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S172( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV20ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRecCod", "", "N Recep.", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRef", "", "Referencia", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRReo", "", "RC", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRLote", "", "Lote", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRGrm2", "", "Grm2", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRAnc", "", "Ancho", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRPieEnt", "", "Pzas. ent.", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRUniEnt", "", "Cant. ent.", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRUni", "", "Und.", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRUniDis", "", "Cant. disp.", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRPieDis", "", "Pzas. disp.", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Kilos", "", "Kilos", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Metros", "", "Metros", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Piezas", "", "Piezas", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Pedidos.DisAlb__WWColumnsSelector", GXv_char4) ;
      disalb__ww_impl.this.GXt_char1 = GXv_char4[0] ;
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

   public void S152( )
   {
      /* 'CHECKSECURITYFORACTIONS' Routine */
      returnInSub = false ;
      if ( ! ( ! ( AV59VisualizarAcciones ) ) )
      {
         bttBtn_cancel_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtn_cancel_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_cancel_Visible), 5, 0), true);
      }
   }

   public void S202( )
   {
      /* 'DO MODIFICAR' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.pedidos.disalb__trn", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV64CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV65DisArtCod)),GXutil.URLEncode(GXutil.rtrim(AV68DisUnimed))}, new String[] {"Mode","EmprCod","DisCod","AlbRecCod","ClicodIn","DisArtcodIn","DisUniMedIn"}) , new Object[] {});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S212( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.pedidos.disalb__trn", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV64CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV65DisArtCod)),GXutil.URLEncode(GXutil.rtrim(AV68DisUnimed))}, new String[] {"Mode","EmprCod","DisCod","AlbRecCod","ClicodIn","DisArtcodIn","DisUniMedIn"}) , new Object[] {});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV78Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV78Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV78Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      AV90GXV1 = 1 ;
      while ( AV90GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV90GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV26TFAlbRecCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFAlbRecCod), 8, 0));
            AV27TFAlbRecCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFAlbRecCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFAlbRecCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV28TFAlbRef = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFAlbRef", AV28TFAlbRef);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV29TFAlbRef_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFAlbRef_Sel", AV29TFAlbRef_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRREO_SEL") == 0 )
         {
            AV30TFAlbRReo_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFAlbRReo_SelsJson", AV30TFAlbRReo_SelsJson);
            AV31TFAlbRReo_Sels.fromJSonString(AV30TFAlbRReo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOTE") == 0 )
         {
            AV32TFAlbRLote = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFAlbRLote", AV32TFAlbRLote);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOTE_SEL") == 0 )
         {
            AV33TFAlbRLote_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFAlbRLote_Sel", AV33TFAlbRLote_Sel);
         }
         AV90GXV1 = (int)(AV90GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFAlbRef_Sel)==0), AV29TFAlbRef_Sel, GXv_char4) ;
      disalb__ww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char10 = "" ;
      GXv_char3[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV31TFAlbRReo_Sels.size()==0), AV30TFAlbRReo_SelsJson, GXv_char3) ;
      disalb__ww_impl.this.GXt_char10 = GXv_char3[0] ;
      GXt_char11 = "" ;
      GXv_char2[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFAlbRLote_Sel)==0), AV33TFAlbRLote_Sel, GXv_char2) ;
      disalb__ww_impl.this.GXt_char11 = GXv_char2[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char10+"|"+GXt_char11+"||||||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char11 = "" ;
      GXv_char4[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFAlbRef)==0), AV28TFAlbRef, GXv_char4) ;
      disalb__ww_impl.this.GXt_char11 = GXv_char4[0] ;
      GXt_char10 = "" ;
      GXv_char3[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFAlbRLote)==0), AV32TFAlbRLote, GXv_char3) ;
      disalb__ww_impl.this.GXt_char10 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV26TFAlbRecCod) ? "" : GXutil.str( AV26TFAlbRecCod, 8, 0))+"|"+GXt_char11+"||"+GXt_char10+"||||||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV27TFAlbRecCod_To) ? "" : GXutil.str( AV27TFAlbRecCod_To, 8, 0))+"|||||||||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S162( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV78Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState12[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFALBRECCOD", "", !((0==AV26TFAlbRecCod)&&(0==AV27TFAlbRecCod_To)), (short)(0), GXutil.trim( GXutil.str( AV26TFAlbRecCod, 8, 0)), GXutil.trim( GXutil.str( AV27TFAlbRecCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFALBREF", "", !(GXutil.strcmp("", AV28TFAlbRef)==0), (short)(0), AV28TFAlbRef, "", !(GXutil.strcmp("", AV29TFAlbRef_Sel)==0), AV29TFAlbRef_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFALBRREO_SEL", "", !(AV31TFAlbRReo_Sels.size()==0), (short)(0), AV31TFAlbRReo_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFALBRLOTE", "", !(GXutil.strcmp("", AV32TFAlbRLote)==0), (short)(0), AV32TFAlbRLote, "", !(GXutil.strcmp("", AV33TFAlbRLote_Sel)==0), AV33TFAlbRLote_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState12[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV78Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV78Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "Pedidos.DisAlb" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( ! ( ! AV60AccionesEnPopup ) )
      {
         divDvpanel_tablepedido_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divDvpanel_tablepedido_cell_Internalname, "Class", divDvpanel_tablepedido_cell_Class, true);
      }
      else
      {
         divDvpanel_tablepedido_cell_Class = "col-xs-12" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divDvpanel_tablepedido_cell_Internalname, "Class", divDvpanel_tablepedido_cell_Class, true);
      }
      divTableheader_Visible = (((AV59VisualizarAcciones)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divTableheader_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableheader_Visible), 5, 0), true);
   }

   public void S182( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV69TotKilos = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TotKilos", GXutil.ltrimstr( AV69TotKilos, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKILOS", getSecureSignedToken( sPrefix, localUtil.format( AV69TotKilos, "ZZZZZ9.99")));
      AV71TotMetros = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TotMetros", GXutil.ltrimstr( AV71TotMetros, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETROS", getSecureSignedToken( sPrefix, localUtil.format( AV71TotMetros, "ZZZZZ9.99")));
      AV73TotPiezas = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TotPiezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73TotPiezas), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTPIEZAS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV73TotPiezas), "ZZZ9")));
   }

   public void S192( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV83Pedidos_disalb__wwds_1_tfalbreccod = AV26TFAlbRecCod ;
      AV84Pedidos_disalb__wwds_2_tfalbreccod_to = AV27TFAlbRecCod_To ;
      AV85Pedidos_disalb__wwds_3_tfalbref = AV28TFAlbRef ;
      AV86Pedidos_disalb__wwds_4_tfalbref_sel = AV29TFAlbRef_Sel ;
      AV87Pedidos_disalb__wwds_5_tfalbrreo_sels = AV31TFAlbRReo_Sels ;
      AV88Pedidos_disalb__wwds_6_tfalbrlote = AV32TFAlbRLote ;
      AV89Pedidos_disalb__wwds_7_tfalbrlote_sel = AV33TFAlbRLote_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV87Pedidos_disalb__wwds_5_tfalbrreo_sels ,
                                           Integer.valueOf(AV83Pedidos_disalb__wwds_1_tfalbreccod) ,
                                           Integer.valueOf(AV84Pedidos_disalb__wwds_2_tfalbreccod_to) ,
                                           AV86Pedidos_disalb__wwds_4_tfalbref_sel ,
                                           AV85Pedidos_disalb__wwds_3_tfalbref ,
                                           Integer.valueOf(AV87Pedidos_disalb__wwds_5_tfalbrreo_sels.size()) ,
                                           AV89Pedidos_disalb__wwds_7_tfalbrlote_sel ,
                                           AV88Pedidos_disalb__wwds_6_tfalbrlote ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A45AlbRef ,
                                           A6463AlbRLote ,
                                           A396EmprCod ,
                                           Integer.valueOf(A361DisCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV85Pedidos_disalb__wwds_3_tfalbref = GXutil.padr( GXutil.rtrim( AV85Pedidos_disalb__wwds_3_tfalbref), 16, "%") ;
      lV88Pedidos_disalb__wwds_6_tfalbrlote = GXutil.padr( GXutil.rtrim( AV88Pedidos_disalb__wwds_6_tfalbrlote), 20, "%") ;
      /* Using cursor H01XH4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(AV83Pedidos_disalb__wwds_1_tfalbreccod), Integer.valueOf(AV84Pedidos_disalb__wwds_2_tfalbreccod_to), lV85Pedidos_disalb__wwds_3_tfalbref, AV86Pedidos_disalb__wwds_4_tfalbref_sel, lV88Pedidos_disalb__wwds_6_tfalbrlote, AV89Pedidos_disalb__wwds_7_tfalbrlote_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A6463AlbRLote = H01XH4_A6463AlbRLote[0] ;
         A55AlbRReo = H01XH4_A55AlbRReo[0] ;
         A45AlbRef = H01XH4_A45AlbRef[0] ;
         A44AlbRecCod = H01XH4_A44AlbRecCod[0] ;
         A595Kilos = H01XH4_A595Kilos[0] ;
         A631Metros = H01XH4_A631Metros[0] ;
         A673Piezas = H01XH4_A673Piezas[0] ;
         A6463AlbRLote = H01XH4_A6463AlbRLote[0] ;
         A55AlbRReo = H01XH4_A55AlbRReo[0] ;
         A45AlbRef = H01XH4_A45AlbRef[0] ;
         AV69TotKilos = A595Kilos.add(AV69TotKilos) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TotKilos", GXutil.ltrimstr( AV69TotKilos, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKILOS", getSecureSignedToken( sPrefix, localUtil.format( AV69TotKilos, "ZZZZZ9.99")));
         AV71TotMetros = A631Metros.add(AV71TotMetros) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TotMetros", GXutil.ltrimstr( AV71TotMetros, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETROS", getSecureSignedToken( sPrefix, localUtil.format( AV71TotMetros, "ZZZZZ9.99")));
         AV73TotPiezas = (long)(A673Piezas+AV73TotPiezas) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TotPiezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73TotPiezas), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTPIEZAS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV73TotPiezas), "ZZZ9")));
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV70TotValueKilos = localUtil.format( AV69TotKilos, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TotValueKilos", AV70TotValueKilos);
      AV72TotValueMetros = localUtil.format( AV71TotMetros, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TotValueMetros", AV72TotValueMetros);
      AV74TotValuePiezas = localUtil.format( DecimalUtil.doubleToDec(AV73TotPiezas), "ZZZ9") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TotValuePiezas", AV74TotValuePiezas);
   }

   public void e201XH2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      if ( ! AV60AccionesEnPopup )
      {
      }
      else
      {
         httpContext.popup(formatLink("app.pedidos.disalb__trn", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV64CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV65DisArtCod)),GXutil.URLEncode(GXutil.rtrim(AV68DisUnimed))}, new String[] {"Mode","EmprCod","DisCod","AlbRecCod","ClicodIn","DisArtcodIn","DisUniMedIn"}) , new Object[] {});
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
   }

   public void wb_table2_85_1XH2( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluekilos_Internalname, httpContext.getMessage( "Tot Value Kilos", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'" + sPrefix + "',false,'" + sGXsfl_67_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluekilos_Internalname, AV70TotValueKilos, GXutil.rtrim( localUtil.format( AV70TotValueKilos, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluekilos_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluekilos_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluemetros_Internalname, httpContext.getMessage( "Tot Value Metros", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'" + sPrefix + "',false,'" + sGXsfl_67_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluemetros_Internalname, AV72TotValueMetros, GXutil.rtrim( localUtil.format( AV72TotValueMetros, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,104);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluemetros_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluemetros_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluepiezas_Internalname, httpContext.getMessage( "Tot Value Piezas", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'" + sPrefix + "',false,'" + sGXsfl_67_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluepiezas_Internalname, AV74TotValuePiezas, GXutil.rtrim( localUtil.format( AV74TotValuePiezas, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,107);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluepiezas_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluepiezas_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_85_1XH2e( true) ;
      }
      else
      {
         wb_table2_85_1XH2e( false) ;
      }
   }

   public void wb_table1_53_1XH2( boolean wbgen )
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
         wb_table1_53_1XH2e( true) ;
      }
      else
      {
         wb_table1_53_1XH2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A361DisCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      AV64CliCod = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64CliCod), 6, 0));
      AV63CliNom = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63CliNom", AV63CliNom);
      AV65DisArtCod = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65DisArtCod", AV65DisArtCod);
      AV66DisArtDsc = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66DisArtDsc", AV66DisArtDsc);
      AV67DisFec = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67DisFec", localUtil.format(AV67DisFec, "99/99/99"));
      AV68DisUnimed = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68DisUnimed", AV68DisUnimed);
      AV59VisualizarAcciones = ((Boolean) getParm(obj,8,TypeConstants.BOOLEAN)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59VisualizarAcciones", AV59VisualizarAcciones);
      AV60AccionesEnPopup = ((Boolean) getParm(obj,9,TypeConstants.BOOLEAN)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60AccionesEnPopup", AV60AccionesEnPopup);
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
      pa1XH2( ) ;
      ws1XH2( ) ;
      we1XH2( ) ;
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
      sCtrlA396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlA361DisCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV64CliCod = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV63CliNom = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV65DisArtCod = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV66DisArtDsc = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV67DisFec = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV68DisUnimed = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV59VisualizarAcciones = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV60AccionesEnPopup = (String)getParm(obj,9,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1XH2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "pedidos\\disalb__ww", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1XH2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A396EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A361DisCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         AV64CliCod = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64CliCod), 6, 0));
         AV63CliNom = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63CliNom", AV63CliNom);
         AV65DisArtCod = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65DisArtCod", AV65DisArtCod);
         AV66DisArtDsc = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66DisArtDsc", AV66DisArtDsc);
         AV67DisFec = (java.util.Date)getParm(obj,8,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67DisFec", localUtil.format(AV67DisFec, "99/99/99"));
         AV68DisUnimed = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68DisUnimed", AV68DisUnimed);
         AV59VisualizarAcciones = ((Boolean) getParm(obj,10,TypeConstants.BOOLEAN)).booleanValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59VisualizarAcciones", AV59VisualizarAcciones);
         AV60AccionesEnPopup = ((Boolean) getParm(obj,11,TypeConstants.BOOLEAN)).booleanValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60AccionesEnPopup", AV60AccionesEnPopup);
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV64CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV64CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV63CliNom = httpContext.cgiGet( sPrefix+"wcpOAV63CliNom") ;
      wcpOAV65DisArtCod = httpContext.cgiGet( sPrefix+"wcpOAV65DisArtCod") ;
      wcpOAV66DisArtDsc = httpContext.cgiGet( sPrefix+"wcpOAV66DisArtDsc") ;
      wcpOAV67DisFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV67DisFec"), 0) ;
      wcpOAV68DisUnimed = httpContext.cgiGet( sPrefix+"wcpOAV68DisUnimed") ;
      wcpOAV59VisualizarAcciones = GXutil.strtobool( httpContext.cgiGet( sPrefix+"wcpOAV59VisualizarAcciones")) ;
      wcpOAV60AccionesEnPopup = GXutil.strtobool( httpContext.cgiGet( sPrefix+"wcpOAV60AccionesEnPopup")) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( A361DisCod != wcpOA361DisCod ) || ( AV64CliCod != wcpOAV64CliCod ) || ( GXutil.strcmp(AV63CliNom, wcpOAV63CliNom) != 0 ) || ( GXutil.strcmp(AV65DisArtCod, wcpOAV65DisArtCod) != 0 ) || ( GXutil.strcmp(AV66DisArtDsc, wcpOAV66DisArtDsc) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV67DisFec), GXutil.resetTime(wcpOAV67DisFec)) ) || ( GXutil.strcmp(AV68DisUnimed, wcpOAV68DisUnimed) != 0 ) || ( AV59VisualizarAcciones != wcpOAV59VisualizarAcciones ) || ( AV60AccionesEnPopup != wcpOAV60AccionesEnPopup ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA361DisCod = A361DisCod ;
      wcpOAV64CliCod = AV64CliCod ;
      wcpOAV63CliNom = AV63CliNom ;
      wcpOAV65DisArtCod = AV65DisArtCod ;
      wcpOAV66DisArtDsc = AV66DisArtDsc ;
      wcpOAV67DisFec = AV67DisFec ;
      wcpOAV68DisUnimed = AV68DisUnimed ;
      wcpOAV59VisualizarAcciones = AV59VisualizarAcciones ;
      wcpOAV60AccionesEnPopup = AV60AccionesEnPopup ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA396EmprCod = httpContext.cgiGet( sPrefix+"A396EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlA396EmprCod) > 0 )
      {
         A396EmprCod = httpContext.cgiGet( sCtrlA396EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      }
      else
      {
         A396EmprCod = httpContext.cgiGet( sPrefix+"A396EmprCod_PARM") ;
      }
      sCtrlA361DisCod = httpContext.cgiGet( sPrefix+"A361DisCod_CTRL") ;
      if ( GXutil.len( sCtrlA361DisCod) > 0 )
      {
         A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlA361DisCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
      else
      {
         A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A361DisCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV64CliCod = httpContext.cgiGet( sPrefix+"AV64CliCod_CTRL") ;
      if ( GXutil.len( sCtrlAV64CliCod) > 0 )
      {
         AV64CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV64CliCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64CliCod), 6, 0));
      }
      else
      {
         AV64CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV64CliCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV63CliNom = httpContext.cgiGet( sPrefix+"AV63CliNom_CTRL") ;
      if ( GXutil.len( sCtrlAV63CliNom) > 0 )
      {
         AV63CliNom = httpContext.cgiGet( sCtrlAV63CliNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63CliNom", AV63CliNom);
      }
      else
      {
         AV63CliNom = httpContext.cgiGet( sPrefix+"AV63CliNom_PARM") ;
      }
      sCtrlAV65DisArtCod = httpContext.cgiGet( sPrefix+"AV65DisArtCod_CTRL") ;
      if ( GXutil.len( sCtrlAV65DisArtCod) > 0 )
      {
         AV65DisArtCod = httpContext.cgiGet( sCtrlAV65DisArtCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65DisArtCod", AV65DisArtCod);
      }
      else
      {
         AV65DisArtCod = httpContext.cgiGet( sPrefix+"AV65DisArtCod_PARM") ;
      }
      sCtrlAV66DisArtDsc = httpContext.cgiGet( sPrefix+"AV66DisArtDsc_CTRL") ;
      if ( GXutil.len( sCtrlAV66DisArtDsc) > 0 )
      {
         AV66DisArtDsc = httpContext.cgiGet( sCtrlAV66DisArtDsc) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66DisArtDsc", AV66DisArtDsc);
      }
      else
      {
         AV66DisArtDsc = httpContext.cgiGet( sPrefix+"AV66DisArtDsc_PARM") ;
      }
      sCtrlAV67DisFec = httpContext.cgiGet( sPrefix+"AV67DisFec_CTRL") ;
      if ( GXutil.len( sCtrlAV67DisFec) > 0 )
      {
         AV67DisFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV67DisFec), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67DisFec", localUtil.format(AV67DisFec, "99/99/99"));
      }
      else
      {
         AV67DisFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV67DisFec_PARM"), 0) ;
      }
      sCtrlAV68DisUnimed = httpContext.cgiGet( sPrefix+"AV68DisUnimed_CTRL") ;
      if ( GXutil.len( sCtrlAV68DisUnimed) > 0 )
      {
         AV68DisUnimed = httpContext.cgiGet( sCtrlAV68DisUnimed) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68DisUnimed", AV68DisUnimed);
      }
      else
      {
         AV68DisUnimed = httpContext.cgiGet( sPrefix+"AV68DisUnimed_PARM") ;
      }
      sCtrlAV59VisualizarAcciones = httpContext.cgiGet( sPrefix+"AV59VisualizarAcciones_CTRL") ;
      if ( GXutil.len( sCtrlAV59VisualizarAcciones) > 0 )
      {
         AV59VisualizarAcciones = GXutil.strtobool( httpContext.cgiGet( sCtrlAV59VisualizarAcciones)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59VisualizarAcciones", AV59VisualizarAcciones);
      }
      else
      {
         AV59VisualizarAcciones = GXutil.strtobool( httpContext.cgiGet( sPrefix+"AV59VisualizarAcciones_PARM")) ;
      }
      sCtrlAV60AccionesEnPopup = httpContext.cgiGet( sPrefix+"AV60AccionesEnPopup_CTRL") ;
      if ( GXutil.len( sCtrlAV60AccionesEnPopup) > 0 )
      {
         AV60AccionesEnPopup = GXutil.strtobool( httpContext.cgiGet( sCtrlAV60AccionesEnPopup)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60AccionesEnPopup", AV60AccionesEnPopup);
      }
      else
      {
         AV60AccionesEnPopup = GXutil.strtobool( httpContext.cgiGet( sPrefix+"AV60AccionesEnPopup_PARM")) ;
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
      pa1XH2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1XH2( ) ;
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
      ws1XH2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A396EmprCod_PARM", GXutil.rtrim( A396EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlA396EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A396EmprCod_CTRL", GXutil.rtrim( sCtrlA396EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A361DisCod_PARM", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA361DisCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A361DisCod_CTRL", GXutil.rtrim( sCtrlA361DisCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64CliCod_PARM", GXutil.ltrim( localUtil.ntoc( AV64CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV64CliCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64CliCod_CTRL", GXutil.rtrim( sCtrlAV64CliCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63CliNom_PARM", GXutil.rtrim( AV63CliNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV63CliNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63CliNom_CTRL", GXutil.rtrim( sCtrlAV63CliNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65DisArtCod_PARM", GXutil.rtrim( AV65DisArtCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV65DisArtCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65DisArtCod_CTRL", GXutil.rtrim( sCtrlAV65DisArtCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66DisArtDsc_PARM", GXutil.rtrim( AV66DisArtDsc));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV66DisArtDsc)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66DisArtDsc_CTRL", GXutil.rtrim( sCtrlAV66DisArtDsc));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV67DisFec_PARM", localUtil.dtoc( AV67DisFec, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV67DisFec)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV67DisFec_CTRL", GXutil.rtrim( sCtrlAV67DisFec));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV68DisUnimed_PARM", GXutil.rtrim( AV68DisUnimed));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV68DisUnimed)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV68DisUnimed_CTRL", GXutil.rtrim( sCtrlAV68DisUnimed));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59VisualizarAcciones_PARM", GXutil.booltostr( AV59VisualizarAcciones));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV59VisualizarAcciones)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59VisualizarAcciones_CTRL", GXutil.rtrim( sCtrlAV59VisualizarAcciones));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV60AccionesEnPopup_PARM", GXutil.booltostr( AV60AccionesEnPopup));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV60AccionesEnPopup)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV60AccionesEnPopup_CTRL", GXutil.rtrim( sCtrlAV60AccionesEnPopup));
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
      we1XH2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116101393", true, true);
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
      httpContext.AddJavascriptSource("messages."+httpContext.getLanguageProperty( "code")+".js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("pedidos/disalb__ww.js", "?202682116101394", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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

   public void subsflControlProps_672( )
   {
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1_"+sGXsfl_67_idx );
      edtAlbRecCod_Internalname = sPrefix+"ALBRECCOD_"+sGXsfl_67_idx ;
      edtAlbRef_Internalname = sPrefix+"ALBREF_"+sGXsfl_67_idx ;
      cmbAlbRReo.setInternalname( sPrefix+"ALBRREO_"+sGXsfl_67_idx );
      edtAlbRLote_Internalname = sPrefix+"ALBRLOTE_"+sGXsfl_67_idx ;
      edtAlbRGrm2_Internalname = sPrefix+"ALBRGRM2_"+sGXsfl_67_idx ;
      edtAlbRAnc_Internalname = sPrefix+"ALBRANC_"+sGXsfl_67_idx ;
      edtAlbRPieEnt_Internalname = sPrefix+"ALBRPIEENT_"+sGXsfl_67_idx ;
      edtAlbRUniEnt_Internalname = sPrefix+"ALBRUNIENT_"+sGXsfl_67_idx ;
      cmbAlbRUni.setInternalname( sPrefix+"ALBRUNI_"+sGXsfl_67_idx );
      edtAlbRUniDis_Internalname = sPrefix+"ALBRUNIDIS_"+sGXsfl_67_idx ;
      edtAlbRPieDis_Internalname = sPrefix+"ALBRPIEDIS_"+sGXsfl_67_idx ;
      edtKilos_Internalname = sPrefix+"KILOS_"+sGXsfl_67_idx ;
      edtMetros_Internalname = sPrefix+"METROS_"+sGXsfl_67_idx ;
      edtPiezas_Internalname = sPrefix+"PIEZAS_"+sGXsfl_67_idx ;
   }

   public void subsflControlProps_fel_672( )
   {
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1_"+sGXsfl_67_fel_idx );
      edtAlbRecCod_Internalname = sPrefix+"ALBRECCOD_"+sGXsfl_67_fel_idx ;
      edtAlbRef_Internalname = sPrefix+"ALBREF_"+sGXsfl_67_fel_idx ;
      cmbAlbRReo.setInternalname( sPrefix+"ALBRREO_"+sGXsfl_67_fel_idx );
      edtAlbRLote_Internalname = sPrefix+"ALBRLOTE_"+sGXsfl_67_fel_idx ;
      edtAlbRGrm2_Internalname = sPrefix+"ALBRGRM2_"+sGXsfl_67_fel_idx ;
      edtAlbRAnc_Internalname = sPrefix+"ALBRANC_"+sGXsfl_67_fel_idx ;
      edtAlbRPieEnt_Internalname = sPrefix+"ALBRPIEENT_"+sGXsfl_67_fel_idx ;
      edtAlbRUniEnt_Internalname = sPrefix+"ALBRUNIENT_"+sGXsfl_67_fel_idx ;
      cmbAlbRUni.setInternalname( sPrefix+"ALBRUNI_"+sGXsfl_67_fel_idx );
      edtAlbRUniDis_Internalname = sPrefix+"ALBRUNIDIS_"+sGXsfl_67_fel_idx ;
      edtAlbRPieDis_Internalname = sPrefix+"ALBRPIEDIS_"+sGXsfl_67_fel_idx ;
      edtKilos_Internalname = sPrefix+"KILOS_"+sGXsfl_67_fel_idx ;
      edtMetros_Internalname = sPrefix+"METROS_"+sGXsfl_67_fel_idx ;
      edtPiezas_Internalname = sPrefix+"PIEZAS_"+sGXsfl_67_fel_idx ;
   }

   public void sendrow_672( )
   {
      subsflControlProps_672( ) ;
      wb1XH0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_67_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_67_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_67_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 68,'"+sPrefix+"',false,'"+sGXsfl_67_idx+"',67)\"" : " ") ;
         if ( ( cmbavGridactiongroup1.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_67_idx ;
            cmbavGridactiongroup1.setName( GXCCtl );
            cmbavGridactiongroup1.setWebtags( "" );
            if ( cmbavGridactiongroup1.getItemCount() > 0 )
            {
               AV75GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV75GridActionGroup1, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75GridActionGroup1), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactiongroup1,cmbavGridactiongroup1.getInternalname(),GXutil.trim( GXutil.str( AV75GridActionGroup1, 4, 0)),Integer.valueOf(1),cmbavGridactiongroup1.getJsonclick(),Integer.valueOf(5),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVGRIDACTIONGROUP1.CLICK."+sGXsfl_67_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,68);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV75GridActionGroup1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), !bGXsfl_67_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRecCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecCod_Internalname,GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbRecCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbRef_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRef_Internalname,GXutil.rtrim( A45AlbRef),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbRef_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbAlbRReo.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         GXCCtl = "ALBRREO_" + sGXsfl_67_idx ;
         cmbAlbRReo.setName( GXCCtl );
         cmbAlbRReo.setWebtags( "" );
         cmbAlbRReo.addItem("NO", httpContext.getMessage( "NO", ""), (short)(0));
         cmbAlbRReo.addItem("SI", httpContext.getMessage( "SI", ""), (short)(0));
         if ( cmbAlbRReo.getItemCount() > 0 )
         {
            A55AlbRReo = cmbAlbRReo.getValidValue(A55AlbRReo) ;
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbRReo,cmbAlbRReo.getInternalname(),GXutil.rtrim( A55AlbRReo),Integer.valueOf(1),cmbAlbRReo.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbAlbRReo.getVisible()),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), !bGXsfl_67_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbRLote_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRLote_Internalname,GXutil.rtrim( A6463AlbRLote),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRLote_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbRLote_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRGrm2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRGrm2_Internalname,GXutil.ltrim( localUtil.ntoc( A4920AlbRGrm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4920AlbRGrm2), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRGrm2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbRGrm2_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRAnc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRAnc_Internalname,GXutil.ltrim( localUtil.ntoc( A4921AlbRAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4921AlbRAnc), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRAnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbRAnc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRPieEnt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbRPieEnt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRUniEnt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbRUniEnt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbAlbRUni.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         GXCCtl = "ALBRUNI_" + sGXsfl_67_idx ;
         cmbAlbRUni.setName( GXCCtl );
         cmbAlbRUni.setWebtags( "" );
         cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
         cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
         if ( cmbAlbRUni.getItemCount() > 0 )
         {
            A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbRUni,cmbAlbRUni.getInternalname(),GXutil.rtrim( A56AlbRUni),Integer.valueOf(1),cmbAlbRUni.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbAlbRUni.getVisible()),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), !bGXsfl_67_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRUniDis_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniDis_Internalname,GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A57AlbRUniDis, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbRUniDis_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRPieDis_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieDis_Internalname,GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbRPieDis_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtKilos_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtKilos_Internalname,GXutil.ltrim( localUtil.ntoc( A595Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A595Kilos, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtKilos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtKilos_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMetros_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetros_Internalname,GXutil.ltrim( localUtil.ntoc( A631Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A631Metros, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetros_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMetros_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPiezas_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPiezas_Internalname,GXutil.ltrim( localUtil.ntoc( A673Piezas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A673Piezas), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPiezas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPiezas_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1XH2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_67_idx = ((subGrid_Islastpage==1)&&(nGXsfl_67_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_67_idx+1) ;
         sGXsfl_67_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_67_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_672( ) ;
      }
      /* End function sendrow_672 */
   }

   public void startgridcontrol67( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"67\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRecCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Recep.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRef_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Referencia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbAlbRReo.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "RC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRLote_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRGrm2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Grm2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRAnc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ancho", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRPieEnt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pzas. ent.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRUniEnt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cant. ent.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbAlbRUni.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Und.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRUniDis_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cant. disp.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRPieDis_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pzas. disp.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtKilos_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMetros_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPiezas_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
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
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV75GridActionGroup1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A45AlbRef));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRef_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A55AlbRReo));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbAlbRReo.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6463AlbRLote));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRLote_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4920AlbRGrm2, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRGrm2_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4921AlbRAnc, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRAnc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRPieEnt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRUniEnt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A56AlbRUni));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbAlbRUni.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRUniDis_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRPieDis_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A595Kilos, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtKilos_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A631Metros, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMetros_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A673Piezas, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPiezas_Visible, (byte)(5), (byte)(0), ".", "")));
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
      lblTbngruia_Internalname = sPrefix+"TBNGRUIA" ;
      edtDisCod_Internalname = sPrefix+"DISCOD" ;
      edtavDisfec_Internalname = sPrefix+"vDISFEC" ;
      edtavClicod_Internalname = sPrefix+"vCLICOD" ;
      edtavClinom_Internalname = sPrefix+"vCLINOM" ;
      edtavDisartcod_Internalname = sPrefix+"vDISARTCOD" ;
      edtavDisartdsc_Internalname = sPrefix+"vDISARTDSC" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      divTablepedido_Internalname = sPrefix+"TABLEPEDIDO" ;
      Dvpanel_tablepedido_Internalname = sPrefix+"DVPANEL_TABLEPEDIDO" ;
      divDvpanel_tablepedido_cell_Internalname = sPrefix+"DVPANEL_TABLEPEDIDO_CELL" ;
      bttBtnagregar2_Internalname = sPrefix+"BTNAGREGAR2" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1" );
      edtAlbRecCod_Internalname = sPrefix+"ALBRECCOD" ;
      edtAlbRef_Internalname = sPrefix+"ALBREF" ;
      cmbAlbRReo.setInternalname( sPrefix+"ALBRREO" );
      edtAlbRLote_Internalname = sPrefix+"ALBRLOTE" ;
      edtAlbRGrm2_Internalname = sPrefix+"ALBRGRM2" ;
      edtAlbRAnc_Internalname = sPrefix+"ALBRANC" ;
      edtAlbRPieEnt_Internalname = sPrefix+"ALBRPIEENT" ;
      edtAlbRUniEnt_Internalname = sPrefix+"ALBRUNIENT" ;
      cmbAlbRUni.setInternalname( sPrefix+"ALBRUNI" );
      edtAlbRUniDis_Internalname = sPrefix+"ALBRUNIDIS" ;
      edtAlbRPieDis_Internalname = sPrefix+"ALBRPIEDIS" ;
      edtKilos_Internalname = sPrefix+"KILOS" ;
      edtMetros_Internalname = sPrefix+"METROS" ;
      edtPiezas_Internalname = sPrefix+"PIEZAS" ;
      edtavTotvaluekilos_Internalname = sPrefix+"vTOTVALUEKILOS" ;
      edtavTotvaluemetros_Internalname = sPrefix+"vTOTVALUEMETROS" ;
      edtavTotvaluepiezas_Internalname = sPrefix+"vTOTVALUEPIEZAS" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      bttBtn_cancel_Internalname = sPrefix+"BTN_CANCEL" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
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
      edtPiezas_Jsonclick = "" ;
      edtMetros_Jsonclick = "" ;
      edtKilos_Jsonclick = "" ;
      edtAlbRPieDis_Jsonclick = "" ;
      edtAlbRUniDis_Jsonclick = "" ;
      cmbAlbRUni.setJsonclick( "" );
      edtAlbRUniEnt_Jsonclick = "" ;
      edtAlbRPieEnt_Jsonclick = "" ;
      edtAlbRAnc_Jsonclick = "" ;
      edtAlbRGrm2_Jsonclick = "" ;
      edtAlbRLote_Jsonclick = "" ;
      cmbAlbRReo.setJsonclick( "" );
      edtAlbRef_Jsonclick = "" ;
      edtAlbRecCod_Jsonclick = "" ;
      cmbavGridactiongroup1.setJsonclick( "" );
      cmbavGridactiongroup1.setVisible( -1 );
      cmbavGridactiongroup1.setEnabled( 1 );
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvaluepiezas_Jsonclick = "" ;
      edtavTotvaluepiezas_Enabled = 1 ;
      edtavTotvaluemetros_Jsonclick = "" ;
      edtavTotvaluemetros_Enabled = 1 ;
      edtavTotvaluekilos_Jsonclick = "" ;
      edtavTotvaluekilos_Enabled = 1 ;
      edtPiezas_Visible = -1 ;
      edtMetros_Visible = -1 ;
      edtKilos_Visible = -1 ;
      edtAlbRPieDis_Visible = -1 ;
      edtAlbRUniDis_Visible = -1 ;
      cmbAlbRUni.setVisible( -1 );
      edtAlbRUniEnt_Visible = -1 ;
      edtAlbRPieEnt_Visible = -1 ;
      edtAlbRAnc_Visible = -1 ;
      edtAlbRGrm2_Visible = -1 ;
      edtAlbRLote_Visible = -1 ;
      cmbAlbRReo.setVisible( -1 );
      edtAlbRef_Visible = -1 ;
      edtAlbRecCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtn_cancel_Visible = 1 ;
      divUnnamedtable1_Height = 0 ;
      divTableheader_Visible = 1 ;
      edtavDisartdsc_Jsonclick = "" ;
      edtavDisartdsc_Enabled = 0 ;
      edtavDisartcod_Jsonclick = "" ;
      edtavDisartcod_Enabled = 0 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 0 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 0 ;
      edtavDisfec_Jsonclick = "" ;
      edtavDisfec_Enabled = 0 ;
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Enabled = 0 ;
      divDvpanel_tablepedido_cell_Class = "col-xs-12" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "Pedidos.DisAlb__WWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||NO:NO,SI:SI|||||||||||" ;
      Ddo_grid_Allowmultipleselection = "||T|||||||||||" ;
      Ddo_grid_Datalisttype = "|Dynamic|FixedValues|Dynamic||||||||||" ;
      Ddo_grid_Includedatalist = "|T|T|T||||||||||" ;
      Ddo_grid_Filterisrange = "T|||||||||||||" ;
      Ddo_grid_Filtertype = "Numeric|Character||Character||||||||||" ;
      Ddo_grid_Includefilter = "T|T||T||||||||||" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T||||||||||" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5||||||||||" ;
      Ddo_grid_Columnids = "1:AlbRecCod|2:AlbRef|3:AlbRReo|4:AlbRLote|5:AlbRGrm2|6:AlbRAnc|7:AlbRPieEnt|8:AlbRUniEnt|9:AlbRUni|10:AlbRUniDis|11:AlbRPieDis|12:Kilos|13:Metros|14:Piezas" ;
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
      Dvpanel_tablepedido_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tablepedido_Iconposition = "Right" ;
      Dvpanel_tablepedido_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tablepedido_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tablepedido_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_tablepedido_Title = "" ;
      Dvpanel_tablepedido_Cls = "PanelNoHeader" ;
      Dvpanel_tablepedido_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tablepedido_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tablepedido_Width = "100%" ;
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
      GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_67_idx ;
      cmbavGridactiongroup1.setName( GXCCtl );
      cmbavGridactiongroup1.setWebtags( "" );
      if ( cmbavGridactiongroup1.getItemCount() > 0 )
      {
      }
      GXCCtl = "ALBRREO_" + sGXsfl_67_idx ;
      cmbAlbRReo.setName( GXCCtl );
      cmbAlbRReo.setWebtags( "" );
      cmbAlbRReo.addItem("NO", httpContext.getMessage( "NO", ""), (short)(0));
      cmbAlbRReo.addItem("SI", httpContext.getMessage( "SI", ""), (short)(0));
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
      }
      GXCCtl = "ALBRUNI_" + sGXsfl_67_idx ;
      cmbAlbRUni.setName( GXCCtl );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'AV64CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV65DisArtCod',fld:'vDISARTCOD',pic:''},{av:'AV68DisUnimed',fld:'vDISUNIMED',pic:'@!'},{av:'sPrefix'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV26TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV27TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV28TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV29TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV31TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV32TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV33TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV59VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:''},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV69TotKilos',fld:'vTOTKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV71TotMetros',fld:'vTOTMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV73TotPiezas',fld:'vTOTPIEZAS',pic:'ZZZ9',hsh:true},{av:'A595Kilos',fld:'KILOS',pic:'ZZZZZ9.99'},{av:'A631Metros',fld:'METROS',pic:'ZZZZZ9.99'},{av:'A673Piezas',fld:'PIEZAS',pic:'ZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbRecCod_Visible',ctrl:'ALBRECCOD',prop:'Visible'},{av:'edtAlbRef_Visible',ctrl:'ALBREF',prop:'Visible'},{av:'cmbAlbRReo'},{av:'edtAlbRLote_Visible',ctrl:'ALBRLOTE',prop:'Visible'},{av:'edtAlbRGrm2_Visible',ctrl:'ALBRGRM2',prop:'Visible'},{av:'edtAlbRAnc_Visible',ctrl:'ALBRANC',prop:'Visible'},{av:'edtAlbRPieEnt_Visible',ctrl:'ALBRPIEENT',prop:'Visible'},{av:'edtAlbRUniEnt_Visible',ctrl:'ALBRUNIENT',prop:'Visible'},{av:'cmbAlbRUni'},{av:'edtAlbRUniDis_Visible',ctrl:'ALBRUNIDIS',prop:'Visible'},{av:'edtAlbRPieDis_Visible',ctrl:'ALBRPIEDIS',prop:'Visible'},{av:'edtKilos_Visible',ctrl:'KILOS',prop:'Visible'},{av:'edtMetros_Visible',ctrl:'METROS',prop:'Visible'},{av:'edtPiezas_Visible',ctrl:'PIEZAS',prop:'Visible'},{av:'AV56GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV57GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTN_CANCEL',prop:'Visible'},{av:'AV69TotKilos',fld:'vTOTKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV71TotMetros',fld:'vTOTMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV73TotPiezas',fld:'vTOTPIEZAS',pic:'ZZZ9',hsh:true},{av:'AV70TotValueKilos',fld:'vTOTVALUEKILOS',pic:''},{av:'AV72TotValueMetros',fld:'vTOTVALUEMETROS',pic:''},{av:'AV74TotValuePiezas',fld:'vTOTVALUEPIEZAS',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e111XH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV27TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV28TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV29TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV31TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV32TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV33TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV59VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:''},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV69TotKilos',fld:'vTOTKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV71TotMetros',fld:'vTOTMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV73TotPiezas',fld:'vTOTPIEZAS',pic:'ZZZ9',hsh:true},{av:'AV64CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV65DisArtCod',fld:'vDISARTCOD',pic:''},{av:'AV68DisUnimed',fld:'vDISUNIMED',pic:'@!'},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121XH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV27TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV28TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV29TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV31TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV32TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV33TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV59VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:''},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV69TotKilos',fld:'vTOTKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV71TotMetros',fld:'vTOTMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV73TotPiezas',fld:'vTOTPIEZAS',pic:'ZZZ9',hsh:true},{av:'AV64CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV65DisArtCod',fld:'vDISARTCOD',pic:''},{av:'AV68DisUnimed',fld:'vDISUNIMED',pic:'@!'},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e131XH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV27TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV28TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV29TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV31TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV32TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV33TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV59VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:''},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV69TotKilos',fld:'vTOTKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV71TotMetros',fld:'vTOTMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV73TotPiezas',fld:'vTOTPIEZAS',pic:'ZZZ9',hsh:true},{av:'AV64CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV65DisArtCod',fld:'vDISARTCOD',pic:''},{av:'AV68DisUnimed',fld:'vDISUNIMED',pic:'@!'},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV26TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV27TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV28TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV29TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV30TFAlbRReo_SelsJson',fld:'vTFALBRREO_SELSJSON',pic:''},{av:'AV31TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV32TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV33TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /* * Property Class not supported in */
      /* * Property Class not supported in */
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /* * Property Class not supported in */
      /* * Property Class not supported in */
      setEventMetadata("GRID.LOAD","{handler:'e181XH2',iparms:[{av:'AV59VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV64CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV65DisArtCod',fld:'vDISARTCOD',pic:''},{av:'AV68DisUnimed',fld:'vDISUNIMED',pic:'@!'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV75GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{ctrl:'vUPDATE',prop:'Link'},{ctrl:'vUPDATE',prop:'Class'},{ctrl:'vDELETE',prop:'Link'},{ctrl:'vDELETE',prop:'Class'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e141XH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV27TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV28TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV29TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV31TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV32TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV33TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV59VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:''},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV69TotKilos',fld:'vTOTKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV71TotMetros',fld:'vTOTMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV73TotPiezas',fld:'vTOTPIEZAS',pic:'ZZZ9',hsh:true},{av:'AV64CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV65DisArtCod',fld:'vDISARTCOD',pic:''},{av:'AV68DisUnimed',fld:'vDISUNIMED',pic:'@!'},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'},{av:'A595Kilos',fld:'KILOS',pic:'ZZZZZ9.99'},{av:'A631Metros',fld:'METROS',pic:'ZZZZZ9.99'},{av:'A673Piezas',fld:'PIEZAS',pic:'ZZZZZ9'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbRecCod_Visible',ctrl:'ALBRECCOD',prop:'Visible'},{av:'edtAlbRef_Visible',ctrl:'ALBREF',prop:'Visible'},{av:'cmbAlbRReo'},{av:'edtAlbRLote_Visible',ctrl:'ALBRLOTE',prop:'Visible'},{av:'edtAlbRGrm2_Visible',ctrl:'ALBRGRM2',prop:'Visible'},{av:'edtAlbRAnc_Visible',ctrl:'ALBRANC',prop:'Visible'},{av:'edtAlbRPieEnt_Visible',ctrl:'ALBRPIEENT',prop:'Visible'},{av:'edtAlbRUniEnt_Visible',ctrl:'ALBRUNIENT',prop:'Visible'},{av:'cmbAlbRUni'},{av:'edtAlbRUniDis_Visible',ctrl:'ALBRUNIDIS',prop:'Visible'},{av:'edtAlbRPieDis_Visible',ctrl:'ALBRPIEDIS',prop:'Visible'},{av:'edtKilos_Visible',ctrl:'KILOS',prop:'Visible'},{av:'edtMetros_Visible',ctrl:'METROS',prop:'Visible'},{av:'edtPiezas_Visible',ctrl:'PIEZAS',prop:'Visible'},{av:'AV56GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV57GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTN_CANCEL',prop:'Visible'},{av:'AV69TotKilos',fld:'vTOTKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV71TotMetros',fld:'vTOTMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV73TotPiezas',fld:'vTOTPIEZAS',pic:'ZZZ9',hsh:true},{av:'AV70TotValueKilos',fld:'vTOTVALUEKILOS',pic:''},{av:'AV72TotValueMetros',fld:'vTOTVALUEMETROS',pic:''},{av:'AV74TotValuePiezas',fld:'vTOTVALUEPIEZAS',pic:''}]}");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK","{handler:'e191XH2',iparms:[{av:'cmbavGridactiongroup1'},{av:'AV75GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV27TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV28TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV29TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV31TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV32TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV33TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV59VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:''},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV69TotKilos',fld:'vTOTKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV71TotMetros',fld:'vTOTMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV73TotPiezas',fld:'vTOTPIEZAS',pic:'ZZZ9',hsh:true},{av:'AV64CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV65DisArtCod',fld:'vDISARTCOD',pic:''},{av:'AV68DisUnimed',fld:'vDISUNIMED',pic:'@!'},{av:'sPrefix'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A595Kilos',fld:'KILOS',pic:'ZZZZZ9.99'},{av:'A631Metros',fld:'METROS',pic:'ZZZZZ9.99'},{av:'A673Piezas',fld:'PIEZAS',pic:'ZZZZZ9'}]");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV75GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbRecCod_Visible',ctrl:'ALBRECCOD',prop:'Visible'},{av:'edtAlbRef_Visible',ctrl:'ALBREF',prop:'Visible'},{av:'cmbAlbRReo'},{av:'edtAlbRLote_Visible',ctrl:'ALBRLOTE',prop:'Visible'},{av:'edtAlbRGrm2_Visible',ctrl:'ALBRGRM2',prop:'Visible'},{av:'edtAlbRAnc_Visible',ctrl:'ALBRANC',prop:'Visible'},{av:'edtAlbRPieEnt_Visible',ctrl:'ALBRPIEENT',prop:'Visible'},{av:'edtAlbRUniEnt_Visible',ctrl:'ALBRUNIENT',prop:'Visible'},{av:'cmbAlbRUni'},{av:'edtAlbRUniDis_Visible',ctrl:'ALBRUNIDIS',prop:'Visible'},{av:'edtAlbRPieDis_Visible',ctrl:'ALBRPIEDIS',prop:'Visible'},{av:'edtKilos_Visible',ctrl:'KILOS',prop:'Visible'},{av:'edtMetros_Visible',ctrl:'METROS',prop:'Visible'},{av:'edtPiezas_Visible',ctrl:'PIEZAS',prop:'Visible'},{av:'AV56GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV57GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTN_CANCEL',prop:'Visible'},{av:'AV69TotKilos',fld:'vTOTKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV71TotMetros',fld:'vTOTMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV73TotPiezas',fld:'vTOTPIEZAS',pic:'ZZZ9',hsh:true},{av:'AV70TotValueKilos',fld:'vTOTVALUEKILOS',pic:''},{av:'AV72TotValueMetros',fld:'vTOTVALUEMETROS',pic:''},{av:'AV74TotValuePiezas',fld:'vTOTVALUEPIEZAS',pic:''}]}");
      setEventMetadata("'DOAGREGAR2'","{handler:'e151XH2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV64CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV65DisArtCod',fld:'vDISARTCOD',pic:''},{av:'AV68DisUnimed',fld:'vDISUNIMED',pic:'@!'}]");
      setEventMetadata("'DOAGREGAR2'",",oparms:[]}");
      setEventMetadata("'DOINSERT'","{handler:'e201XH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV27TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV28TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV29TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV31TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV32TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV33TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV59VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:''},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV69TotKilos',fld:'vTOTKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV71TotMetros',fld:'vTOTMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV73TotPiezas',fld:'vTOTPIEZAS',pic:'ZZZ9',hsh:true},{av:'AV64CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV65DisArtCod',fld:'vDISARTCOD',pic:''},{av:'AV68DisUnimed',fld:'vDISUNIMED',pic:'@!'},{av:'sPrefix'},{av:'AV60AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:''},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A595Kilos',fld:'KILOS',pic:'ZZZZZ9.99'},{av:'A631Metros',fld:'METROS',pic:'ZZZZZ9.99'},{av:'A673Piezas',fld:'PIEZAS',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOINSERT'",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbRecCod_Visible',ctrl:'ALBRECCOD',prop:'Visible'},{av:'edtAlbRef_Visible',ctrl:'ALBREF',prop:'Visible'},{av:'cmbAlbRReo'},{av:'edtAlbRLote_Visible',ctrl:'ALBRLOTE',prop:'Visible'},{av:'edtAlbRGrm2_Visible',ctrl:'ALBRGRM2',prop:'Visible'},{av:'edtAlbRAnc_Visible',ctrl:'ALBRANC',prop:'Visible'},{av:'edtAlbRPieEnt_Visible',ctrl:'ALBRPIEENT',prop:'Visible'},{av:'edtAlbRUniEnt_Visible',ctrl:'ALBRUNIENT',prop:'Visible'},{av:'cmbAlbRUni'},{av:'edtAlbRUniDis_Visible',ctrl:'ALBRUNIDIS',prop:'Visible'},{av:'edtAlbRPieDis_Visible',ctrl:'ALBRPIEDIS',prop:'Visible'},{av:'edtKilos_Visible',ctrl:'KILOS',prop:'Visible'},{av:'edtMetros_Visible',ctrl:'METROS',prop:'Visible'},{av:'edtPiezas_Visible',ctrl:'PIEZAS',prop:'Visible'},{av:'AV56GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV57GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTN_CANCEL',prop:'Visible'},{av:'AV69TotKilos',fld:'vTOTKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV71TotMetros',fld:'vTOTMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV73TotPiezas',fld:'vTOTPIEZAS',pic:'ZZZ9',hsh:true},{av:'AV70TotValueKilos',fld:'vTOTVALUEKILOS',pic:''},{av:'AV72TotValueMetros',fld:'vTOTVALUEMETROS',pic:''},{av:'AV74TotValuePiezas',fld:'vTOTVALUEPIEZAS',pic:''}]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[]");
      setEventMetadata("VALID_DISCOD",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEENT","{handler:'valid_Albrpieent',iparms:[]");
      setEventMetadata("VALID_ALBRPIEENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIENT","{handler:'valid_Albrunient',iparms:[]");
      setEventMetadata("VALID_ALBRUNIENT",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Piezas',iparms:[]");
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
      wcpOA396EmprCod = "" ;
      wcpOAV63CliNom = "" ;
      wcpOAV65DisArtCod = "" ;
      wcpOAV66DisArtDsc = "" ;
      wcpOAV67DisFec = GXutil.nullDate() ;
      wcpOAV68DisUnimed = "" ;
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
      A396EmprCod = "" ;
      AV63CliNom = "" ;
      AV65DisArtCod = "" ;
      AV66DisArtDsc = "" ;
      AV67DisFec = GXutil.nullDate() ;
      AV68DisUnimed = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV28TFAlbRef = "" ;
      AV29TFAlbRef_Sel = "" ;
      AV31TFAlbRReo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32TFAlbRLote = "" ;
      AV33TFAlbRLote_Sel = "" ;
      AV78Pgmname = "" ;
      AV69TotKilos = DecimalUtil.ZERO ;
      AV71TotMetros = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV54DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A60AlbRUniUti = DecimalUtil.ZERO ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tablepedido = new com.genexus.webpanels.GXUserControl();
      lblTbngruia_Jsonclick = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnagregar2_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      bttBtn_cancel_Jsonclick = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A45AlbRef = "" ;
      A55AlbRReo = "" ;
      A6463AlbRLote = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A595Kilos = DecimalUtil.ZERO ;
      A631Metros = DecimalUtil.ZERO ;
      AV87Pedidos_disalb__wwds_5_tfalbrreo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV85Pedidos_disalb__wwds_3_tfalbref = "" ;
      lV88Pedidos_disalb__wwds_6_tfalbrlote = "" ;
      AV86Pedidos_disalb__wwds_4_tfalbref_sel = "" ;
      AV85Pedidos_disalb__wwds_3_tfalbref = "" ;
      AV89Pedidos_disalb__wwds_7_tfalbrlote_sel = "" ;
      AV88Pedidos_disalb__wwds_6_tfalbrlote = "" ;
      H01XH2_A396EmprCod = new String[] {""} ;
      H01XH2_A361DisCod = new int[1] ;
      H01XH2_A673Piezas = new int[1] ;
      H01XH2_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01XH2_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01XH2_A56AlbRUni = new String[] {""} ;
      H01XH2_A4921AlbRAnc = new short[1] ;
      H01XH2_A4920AlbRGrm2 = new short[1] ;
      H01XH2_A6463AlbRLote = new String[] {""} ;
      H01XH2_A55AlbRReo = new String[] {""} ;
      H01XH2_A45AlbRef = new String[] {""} ;
      H01XH2_A44AlbRecCod = new int[1] ;
      H01XH2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01XH2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01XH2_A54AlbRPieUti = new int[1] ;
      H01XH2_A52AlbRPieEnt = new int[1] ;
      H01XH3_AGRID_nRecordCount = new long[1] ;
      AV70TotValueKilos = "" ;
      AV72TotValueMetros = "" ;
      AV74TotValuePiezas = "" ;
      hsh = "" ;
      AV79Station = "" ;
      AV80Emprcod = "" ;
      AV81Emprnom = "" ;
      AV82Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV22Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      AV30TFAlbRReo_SelsJson = "" ;
      AV61Update = "" ;
      AV62Delete = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV19UserCustomValue = "" ;
      AV21ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXt_char11 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char10 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState12 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      H01XH4_A396EmprCod = new String[] {""} ;
      H01XH4_A361DisCod = new int[1] ;
      H01XH4_A6463AlbRLote = new String[] {""} ;
      H01XH4_A55AlbRReo = new String[] {""} ;
      H01XH4_A45AlbRef = new String[] {""} ;
      H01XH4_A44AlbRecCod = new int[1] ;
      H01XH4_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01XH4_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01XH4_A673Piezas = new int[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA396EmprCod = "" ;
      sCtrlA361DisCod = "" ;
      sCtrlAV64CliCod = "" ;
      sCtrlAV63CliNom = "" ;
      sCtrlAV65DisArtCod = "" ;
      sCtrlAV66DisArtDsc = "" ;
      sCtrlAV67DisFec = "" ;
      sCtrlAV68DisUnimed = "" ;
      sCtrlAV59VisualizarAcciones = "" ;
      sCtrlAV60AccionesEnPopup = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.disalb__ww__default(),
         new Object[] {
             new Object[] {
            H01XH2_A396EmprCod, H01XH2_A361DisCod, H01XH2_A673Piezas, H01XH2_A631Metros, H01XH2_A595Kilos, H01XH2_A56AlbRUni, H01XH2_A4921AlbRAnc, H01XH2_A4920AlbRGrm2, H01XH2_A6463AlbRLote, H01XH2_A55AlbRReo,
            H01XH2_A45AlbRef, H01XH2_A44AlbRecCod, H01XH2_A60AlbRUniUti, H01XH2_A58AlbRUniEnt, H01XH2_A54AlbRPieUti, H01XH2_A52AlbRPieEnt
            }
            , new Object[] {
            H01XH3_AGRID_nRecordCount
            }
            , new Object[] {
            H01XH4_A396EmprCod, H01XH4_A361DisCod, H01XH4_A6463AlbRLote, H01XH4_A55AlbRReo, H01XH4_A45AlbRef, H01XH4_A44AlbRecCod, H01XH4_A595Kilos, H01XH4_A631Metros, H01XH4_A673Piezas
            }
         }
      );
      AV78Pgmname = "Pedidos.DisAlb__WW" ;
      /* GeneXus formulas. */
      AV78Pgmname = "Pedidos.DisAlb__WW" ;
      Gx_err = (short)(0) ;
      edtavDisfec_Enabled = 0 ;
      edtavClicod_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavDisartcod_Enabled = 0 ;
      edtavDisartdsc_Enabled = 0 ;
      edtavTotvaluekilos_Enabled = 0 ;
      edtavTotvaluemetros_Enabled = 0 ;
      edtavTotvaluepiezas_Enabled = 0 ;
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
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV75GridActionGroup1 ;
   private short A4920AlbRGrm2 ;
   private short A4921AlbRAnc ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOA361DisCod ;
   private int wcpOAV64CliCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_67 ;
   private int A361DisCod ;
   private int AV64CliCod ;
   private int nGXsfl_67_idx=1 ;
   private int AV26TFAlbRecCod ;
   private int AV27TFAlbRecCod_To ;
   private int A54AlbRPieUti ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtDisCod_Enabled ;
   private int edtavDisfec_Enabled ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavDisartcod_Enabled ;
   private int edtavDisartdsc_Enabled ;
   private int divTableheader_Visible ;
   private int divUnnamedtable1_Height ;
   private int bttBtn_cancel_Visible ;
   private int edtavPgmname_Enabled ;
   private int edtEmprCod_Visible ;
   private int A44AlbRecCod ;
   private int A52AlbRPieEnt ;
   private int A51AlbRPieDis ;
   private int A673Piezas ;
   private int subGrid_Islastpage ;
   private int edtavTotvaluekilos_Enabled ;
   private int edtavTotvaluemetros_Enabled ;
   private int edtavTotvaluepiezas_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV87Pedidos_disalb__wwds_5_tfalbrreo_sels_size ;
   private int AV83Pedidos_disalb__wwds_1_tfalbreccod ;
   private int AV84Pedidos_disalb__wwds_2_tfalbreccod_to ;
   private int edtAlbRecCod_Visible ;
   private int edtAlbRef_Visible ;
   private int edtAlbRLote_Visible ;
   private int edtAlbRGrm2_Visible ;
   private int edtAlbRAnc_Visible ;
   private int edtAlbRPieEnt_Visible ;
   private int edtAlbRUniEnt_Visible ;
   private int edtAlbRUniDis_Visible ;
   private int edtAlbRPieDis_Visible ;
   private int edtKilos_Visible ;
   private int edtMetros_Visible ;
   private int edtPiezas_Visible ;
   private int AV55PageToGo ;
   private int AV90GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV73TotPiezas ;
   private long AV56GridCurrentPage ;
   private long AV57GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV69TotKilos ;
   private java.math.BigDecimal AV71TotMetros ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal A631Metros ;
   private String wcpOA396EmprCod ;
   private String wcpOAV63CliNom ;
   private String wcpOAV65DisArtCod ;
   private String wcpOAV66DisArtDsc ;
   private String wcpOAV68DisUnimed ;
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
   private String A396EmprCod ;
   private String AV63CliNom ;
   private String AV65DisArtCod ;
   private String AV66DisArtDsc ;
   private String AV68DisUnimed ;
   private String sGXsfl_67_idx="0001" ;
   private String AV28TFAlbRef ;
   private String AV29TFAlbRef_Sel ;
   private String AV32TFAlbRLote ;
   private String AV33TFAlbRLote_Sel ;
   private String AV78Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_tablepedido_Width ;
   private String Dvpanel_tablepedido_Cls ;
   private String Dvpanel_tablepedido_Title ;
   private String Dvpanel_tablepedido_Iconposition ;
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
   private String Ddo_grid_Allowmultipleselection ;
   private String Ddo_grid_Datalistfixedvalues ;
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
   private String divDvpanel_tablepedido_cell_Internalname ;
   private String divDvpanel_tablepedido_cell_Class ;
   private String Dvpanel_tablepedido_Internalname ;
   private String divTablepedido_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String lblTbngruia_Internalname ;
   private String lblTbngruia_Jsonclick ;
   private String edtDisCod_Internalname ;
   private String edtDisCod_Jsonclick ;
   private String edtavDisfec_Internalname ;
   private String edtavDisfec_Jsonclick ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavClinom_Internalname ;
   private String edtavClinom_Jsonclick ;
   private String edtavDisartcod_Internalname ;
   private String edtavDisartcod_Jsonclick ;
   private String edtavDisartdsc_Internalname ;
   private String edtavDisartdsc_Jsonclick ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnagregar2_Internalname ;
   private String bttBtnagregar2_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtAlbRecCod_Internalname ;
   private String A45AlbRef ;
   private String edtAlbRef_Internalname ;
   private String A55AlbRReo ;
   private String A6463AlbRLote ;
   private String edtAlbRLote_Internalname ;
   private String edtAlbRGrm2_Internalname ;
   private String edtAlbRAnc_Internalname ;
   private String edtAlbRPieEnt_Internalname ;
   private String edtAlbRUniEnt_Internalname ;
   private String A56AlbRUni ;
   private String edtAlbRUniDis_Internalname ;
   private String edtAlbRPieDis_Internalname ;
   private String edtKilos_Internalname ;
   private String edtMetros_Internalname ;
   private String edtPiezas_Internalname ;
   private String edtavTotvaluekilos_Internalname ;
   private String edtavTotvaluemetros_Internalname ;
   private String edtavTotvaluepiezas_Internalname ;
   private String scmdbuf ;
   private String lV85Pedidos_disalb__wwds_3_tfalbref ;
   private String lV88Pedidos_disalb__wwds_6_tfalbrlote ;
   private String AV86Pedidos_disalb__wwds_4_tfalbref_sel ;
   private String AV85Pedidos_disalb__wwds_3_tfalbref ;
   private String AV89Pedidos_disalb__wwds_7_tfalbrlote_sel ;
   private String AV88Pedidos_disalb__wwds_6_tfalbrlote ;
   private String hsh ;
   private String AV79Station ;
   private String AV80Emprcod ;
   private String AV81Emprnom ;
   private String AV82Usurcod ;
   private String AV61Update ;
   private String AV62Delete ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char11 ;
   private String GXv_char4[] ;
   private String GXt_char10 ;
   private String GXv_char3[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluekilos_Jsonclick ;
   private String edtavTotvaluemetros_Jsonclick ;
   private String edtavTotvaluepiezas_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String sCtrlA396EmprCod ;
   private String sCtrlA361DisCod ;
   private String sCtrlAV64CliCod ;
   private String sCtrlAV63CliNom ;
   private String sCtrlAV65DisArtCod ;
   private String sCtrlAV66DisArtDsc ;
   private String sCtrlAV67DisFec ;
   private String sCtrlAV68DisUnimed ;
   private String sCtrlAV59VisualizarAcciones ;
   private String sCtrlAV60AccionesEnPopup ;
   private String sGXsfl_67_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtAlbRecCod_Jsonclick ;
   private String edtAlbRef_Jsonclick ;
   private String edtAlbRLote_Jsonclick ;
   private String edtAlbRGrm2_Jsonclick ;
   private String edtAlbRAnc_Jsonclick ;
   private String edtAlbRPieEnt_Jsonclick ;
   private String edtAlbRUniEnt_Jsonclick ;
   private String edtAlbRUniDis_Jsonclick ;
   private String edtAlbRPieDis_Jsonclick ;
   private String edtKilos_Jsonclick ;
   private String edtMetros_Jsonclick ;
   private String edtPiezas_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV67DisFec ;
   private java.util.Date AV67DisFec ;
   private boolean wcpOAV59VisualizarAcciones ;
   private boolean wcpOAV60AccionesEnPopup ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV59VisualizarAcciones ;
   private boolean AV60AccionesEnPopup ;
   private boolean AV13OrderedDsc ;
   private boolean Dvpanel_tablepedido_Autowidth ;
   private boolean Dvpanel_tablepedido_Autoheight ;
   private boolean Dvpanel_tablepedido_Collapsible ;
   private boolean Dvpanel_tablepedido_Collapsed ;
   private boolean Dvpanel_tablepedido_Showcollapseicon ;
   private boolean Dvpanel_tablepedido_Autoscroll ;
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
   private boolean bGXsfl_67_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV18ColumnsSelectorXML ;
   private String AV30TFAlbRReo_SelsJson ;
   private String AV19UserCustomValue ;
   private String AV70TotValueKilos ;
   private String AV72TotValueMetros ;
   private String AV74TotValuePiezas ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tablepedido ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private GXSimpleCollection<String> AV87Pedidos_disalb__wwds_5_tfalbrreo_sels ;
   private HTMLChoice cmbavGridactiongroup1 ;
   private HTMLChoice cmbAlbRReo ;
   private HTMLChoice cmbAlbRUni ;
   private IDataStoreProvider pr_default ;
   private String[] H01XH2_A396EmprCod ;
   private int[] H01XH2_A361DisCod ;
   private int[] H01XH2_A673Piezas ;
   private java.math.BigDecimal[] H01XH2_A631Metros ;
   private java.math.BigDecimal[] H01XH2_A595Kilos ;
   private String[] H01XH2_A56AlbRUni ;
   private short[] H01XH2_A4921AlbRAnc ;
   private short[] H01XH2_A4920AlbRGrm2 ;
   private String[] H01XH2_A6463AlbRLote ;
   private String[] H01XH2_A55AlbRReo ;
   private String[] H01XH2_A45AlbRef ;
   private int[] H01XH2_A44AlbRecCod ;
   private java.math.BigDecimal[] H01XH2_A60AlbRUniUti ;
   private java.math.BigDecimal[] H01XH2_A58AlbRUniEnt ;
   private int[] H01XH2_A54AlbRPieUti ;
   private int[] H01XH2_A52AlbRPieEnt ;
   private long[] H01XH3_AGRID_nRecordCount ;
   private String[] H01XH4_A396EmprCod ;
   private int[] H01XH4_A361DisCod ;
   private String[] H01XH4_A6463AlbRLote ;
   private String[] H01XH4_A55AlbRReo ;
   private String[] H01XH4_A45AlbRef ;
   private int[] H01XH4_A44AlbRecCod ;
   private java.math.BigDecimal[] H01XH4_A595Kilos ;
   private java.math.BigDecimal[] H01XH4_A631Metros ;
   private int[] H01XH4_A673Piezas ;
   private GXSimpleCollection<String> AV31TFAlbRReo_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState12[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV54DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class disalb__ww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01XH2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV87Pedidos_disalb__wwds_5_tfalbrreo_sels ,
                                          int AV83Pedidos_disalb__wwds_1_tfalbreccod ,
                                          int AV84Pedidos_disalb__wwds_2_tfalbreccod_to ,
                                          String AV86Pedidos_disalb__wwds_4_tfalbref_sel ,
                                          String AV85Pedidos_disalb__wwds_3_tfalbref ,
                                          int AV87Pedidos_disalb__wwds_5_tfalbrreo_sels_size ,
                                          String AV89Pedidos_disalb__wwds_7_tfalbrlote_sel ,
                                          String AV88Pedidos_disalb__wwds_6_tfalbrlote ,
                                          int A44AlbRecCod ,
                                          String A45AlbRef ,
                                          String A6463AlbRLote ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A396EmprCod ,
                                          int A361DisCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[13];
      Object[] GXv_Object14 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.DisCod, T1.Piezas, T1.Metros, T1.Kilos, T2.AlbRUni, T2.AlbRAnc, T2.AlbRGrm2, T2.AlbRLote, T2.AlbRReo, T2.AlbRef, T1.AlbRecCod, T2.AlbRUniUti, T2.AlbRUniEnt," ;
      sSelectString += " T2.AlbRPieUti, T2.AlbRPieEnt" ;
      sFromString = " FROM (TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.DisCod = ?)");
      if ( ! (0==AV83Pedidos_disalb__wwds_1_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int13[2] = (byte)(1) ;
      }
      if ( ! (0==AV84Pedidos_disalb__wwds_2_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int13[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Pedidos_disalb__wwds_4_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV85Pedidos_disalb__wwds_3_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Pedidos_disalb__wwds_4_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRef = ?)");
      }
      else
      {
         GXv_int13[5] = (byte)(1) ;
      }
      if ( AV87Pedidos_disalb__wwds_5_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV87Pedidos_disalb__wwds_5_tfalbrreo_sels, "T2.AlbRReo IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV89Pedidos_disalb__wwds_7_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV88Pedidos_disalb__wwds_6_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Pedidos_disalb__wwds_7_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLote = ?)");
      }
      else
      {
         GXv_int13[7] = (byte)(1) ;
      }
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.DisCod, T1.AlbRecCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.AlbRef" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.AlbRef DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.AlbRReo" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.AlbRReo DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.AlbRLote" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.AlbRLote DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.DisCod, T1.AlbRecCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
   }

   protected Object[] conditional_H01XH3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV87Pedidos_disalb__wwds_5_tfalbrreo_sels ,
                                          int AV83Pedidos_disalb__wwds_1_tfalbreccod ,
                                          int AV84Pedidos_disalb__wwds_2_tfalbreccod_to ,
                                          String AV86Pedidos_disalb__wwds_4_tfalbref_sel ,
                                          String AV85Pedidos_disalb__wwds_3_tfalbref ,
                                          int AV87Pedidos_disalb__wwds_5_tfalbrreo_sels_size ,
                                          String AV89Pedidos_disalb__wwds_7_tfalbrlote_sel ,
                                          String AV88Pedidos_disalb__wwds_6_tfalbrlote ,
                                          int A44AlbRecCod ,
                                          String A45AlbRef ,
                                          String A6463AlbRLote ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A396EmprCod ,
                                          int A361DisCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[8];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.DisCod = ?)");
      if ( ! (0==AV83Pedidos_disalb__wwds_1_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int16[2] = (byte)(1) ;
      }
      if ( ! (0==AV84Pedidos_disalb__wwds_2_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int16[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Pedidos_disalb__wwds_4_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV85Pedidos_disalb__wwds_3_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Pedidos_disalb__wwds_4_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRef = ?)");
      }
      else
      {
         GXv_int16[5] = (byte)(1) ;
      }
      if ( AV87Pedidos_disalb__wwds_5_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV87Pedidos_disalb__wwds_5_tfalbrreo_sels, "T2.AlbRReo IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV89Pedidos_disalb__wwds_7_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV88Pedidos_disalb__wwds_6_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Pedidos_disalb__wwds_7_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLote = ?)");
      }
      else
      {
         GXv_int16[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
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
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_H01XH4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV87Pedidos_disalb__wwds_5_tfalbrreo_sels ,
                                          int AV83Pedidos_disalb__wwds_1_tfalbreccod ,
                                          int AV84Pedidos_disalb__wwds_2_tfalbreccod_to ,
                                          String AV86Pedidos_disalb__wwds_4_tfalbref_sel ,
                                          String AV85Pedidos_disalb__wwds_3_tfalbref ,
                                          int AV87Pedidos_disalb__wwds_5_tfalbrreo_sels_size ,
                                          String AV89Pedidos_disalb__wwds_7_tfalbrlote_sel ,
                                          String AV88Pedidos_disalb__wwds_6_tfalbrlote ,
                                          int A44AlbRecCod ,
                                          String A45AlbRef ,
                                          String A6463AlbRLote ,
                                          String A396EmprCod ,
                                          int A361DisCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[8];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisCod, T2.AlbRLote, T2.AlbRReo, T2.AlbRef, T1.AlbRecCod, T1.Kilos, T1.Metros, T1.Piezas FROM (TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.DisCod = ?)");
      if ( ! (0==AV83Pedidos_disalb__wwds_1_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int19[2] = (byte)(1) ;
      }
      if ( ! (0==AV84Pedidos_disalb__wwds_2_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int19[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Pedidos_disalb__wwds_4_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV85Pedidos_disalb__wwds_3_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Pedidos_disalb__wwds_4_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRef = ?)");
      }
      else
      {
         GXv_int19[5] = (byte)(1) ;
      }
      if ( AV87Pedidos_disalb__wwds_5_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV87Pedidos_disalb__wwds_5_tfalbrreo_sels, "T2.AlbRReo IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV89Pedidos_disalb__wwds_7_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV88Pedidos_disalb__wwds_6_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Pedidos_disalb__wwds_7_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLote = ?)");
      }
      else
      {
         GXv_int19[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.DisCod" ;
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
                  return conditional_H01XH2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Boolean) dynConstraints[13]).booleanValue() , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() );
            case 1 :
                  return conditional_H01XH3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Boolean) dynConstraints[13]).booleanValue() , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() );
            case 2 :
                  return conditional_H01XH4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01XH2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01XH3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01XH4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getString(10, 2);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
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
                  stmt.setString(sIdx, (String)parms[13], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 20);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 20);
               }
               return;
      }
   }

}

