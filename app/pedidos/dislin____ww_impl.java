package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class dislin____ww_impl extends GXDataArea
{
   public dislin____ww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public dislin____ww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dislin____ww_impl.class ));
   }

   public dislin____ww_impl( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavDisest = new HTMLChoice();
      cmbavGridactiongroup1 = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
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
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9")));
               AV17CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17CliCod), 6, 0));
               AV18CliNom = httpContext.GetPar( "CliNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18CliNom", AV18CliNom);
               AV19DisArtCod = httpContext.GetPar( "DisArtCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19DisArtCod", AV19DisArtCod);
               AV20DisArtDsc = httpContext.GetPar( "DisArtDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20DisArtDsc", AV20DisArtDsc);
               AV16DisFec = localUtil.parseDateParm( httpContext.GetPar( "DisFec")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16DisFec", localUtil.format(AV16DisFec, "99/99/99"));
               AV42DisUnimed = httpContext.GetPar( "DisUnimed") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV42DisUnimed", AV42DisUnimed);
               AV43Cod_Idtx = httpContext.GetPar( "Cod_Idtx") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV43Cod_Idtx", AV43Cod_Idtx);
               AV21DisEst = (byte)(GXutil.lval( httpContext.GetPar( "DisEst"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21DisEst", GXutil.str( AV21DisEst, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21DisEst), "9")));
               AV5VisualizarAcciones = GXutil.strtobool( httpContext.GetPar( "VisualizarAcciones")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5VisualizarAcciones", AV5VisualizarAcciones);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVISUALIZARACCIONES", getSecureSignedToken( "", AV5VisualizarAcciones));
               AV6AccionesEnPopup = GXutil.strtobool( httpContext.GetPar( "AccionesEnPopup")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6AccionesEnPopup", AV6AccionesEnPopup);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACCIONESENPOPUP", getSecureSignedToken( "", AV6AccionesEnPopup));
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
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_92 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_92"))) ;
      nGXsfl_92_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_92_idx"))) ;
      sGXsfl_92_idx = httpContext.GetPar( "sGXsfl_92_idx") ;
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
      AV23TFProCod = httpContext.GetPar( "TFProCod") ;
      AV24TFProCod_Sel = httpContext.GetPar( "TFProCod_Sel") ;
      AV25TFProDsc = httpContext.GetPar( "TFProDsc") ;
      AV26TFProDsc_Sel = httpContext.GetPar( "TFProDsc_Sel") ;
      AV53Pgmname = httpContext.GetPar( "Pgmname") ;
      AV14OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV15OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      cmbavDisest.fromJSonString( httpContext.GetNextPar( ));
      AV21DisEst = (byte)(GXutil.lval( httpContext.GetPar( "DisEst"))) ;
      AV5VisualizarAcciones = GXutil.strtobool( httpContext.GetPar( "VisualizarAcciones")) ;
      AV6AccionesEnPopup = GXutil.strtobool( httpContext.GetPar( "AccionesEnPopup")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A361DisCod, AV23TFProCod, AV24TFProCod_Sel, AV25TFProDsc, AV26TFProDsc_Sel, AV53Pgmname, AV14OrderedBy, AV15OrderedDsc, AV21DisEst, AV5VisualizarAcciones, AV6AccionesEnPopup) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         MasterPageObj= createMasterPage(remoteHandle, "app.wwpbaseobjects.workwithplusmasterpage");
         MasterPageObj.setDataArea(this,false);
         validateSpaRequest();
         MasterPageObj.webExecute();
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
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
   }

   public byte executeStartEvent( )
   {
      pa2932( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2932( ) ;
      }
      return gxajaxcallmode ;
   }

   public void renderHtmlHeaders( )
   {
      app.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( Form.getCaption()) ;
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
      if ( nGXWrapped != 1 )
      {
         MasterPageObj.master_styles();
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      if ( nGXWrapped == 0 )
      {
         bodyStyle += "-moz-opacity:0;opacity:0;" ;
      }
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle += " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidos.dislin____ww", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV17CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV18CliNom)),GXutil.URLEncode(GXutil.rtrim(AV19DisArtCod)),GXutil.URLEncode(GXutil.rtrim(AV20DisArtDsc)),GXutil.URLEncode(GXutil.formatDateParm(AV16DisFec)),GXutil.URLEncode(GXutil.rtrim(AV42DisUnimed)),GXutil.URLEncode(GXutil.rtrim(AV43Cod_Idtx)),GXutil.URLEncode(GXutil.ltrimstr(AV21DisEst,1,0)),GXutil.URLEncode(GXutil.booltostr(AV5VisualizarAcciones)),GXutil.URLEncode(GXutil.booltostr(AV6AccionesEnPopup))}, new String[] {"EmprCod","DisCod","CliCod","CliNom","DisArtCod","DisArtDsc","DisFec","DisUnimed","Cod_Idtx","DisEst","VisualizarAcciones","AccionesEnPopup"}) +"\">") ;
      app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVISUALIZARACCIONES", getSecureSignedToken( "", AV5VisualizarAcciones));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACCIONESENPOPUP", getSecureSignedToken( "", AV6AccionesEnPopup));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21DisEst), "9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DisLin____WW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV53Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidos\\dislin____ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_92", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_92, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV27DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV27DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROCOD", GXutil.rtrim( AV23TFProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROCOD_SEL", GXutil.rtrim( AV24TFProCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRODSC", GXutil.rtrim( AV25TFProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRODSC_SEL", GXutil.rtrim( AV26TFProDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV14OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV15OrderedDsc);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vVISUALIZARACCIONES", AV5VisualizarAcciones);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVISUALIZARACCIONES", getSecureSignedToken( "", AV5VisualizarAcciones));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vACCIONESENPOPUP", AV6AccionesEnPopup);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACCIONESENPOPUP", getSecureSignedToken( "", AV6AccionesEnPopup));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD_SELECTED", GXutil.rtrim( AV45EmprCod_Selected));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD_SELECTED", GXutil.ltrim( localUtil.ntoc( AV46DisCod_Selected, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCOD_SELECTED", GXutil.rtrim( AV47ProCod_Selected));
      app.GxWebStd.gx_hidden_field( httpContext, "vANTERIOR_DISCOD", GXutil.ltrim( localUtil.ntoc( AV44Anterior_Discod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISUNIMED", GXutil.rtrim( AV42DisUnimed));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOD_IDTX", GXutil.rtrim( AV43Cod_Idtx));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Width", GXutil.rtrim( Dvpanel_tablepedido_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Autowidth", GXutil.booltostr( Dvpanel_tablepedido_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Autoheight", GXutil.booltostr( Dvpanel_tablepedido_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Cls", GXutil.rtrim( Dvpanel_tablepedido_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Title", GXutil.rtrim( Dvpanel_tablepedido_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Collapsible", GXutil.booltostr( Dvpanel_tablepedido_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Collapsed", GXutil.booltostr( Dvpanel_tablepedido_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Showcollapseicon", GXutil.booltostr( Dvpanel_tablepedido_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Iconposition", GXutil.rtrim( Dvpanel_tablepedido_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Autoscroll", GXutil.booltostr( Dvpanel_tablepedido_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Width", GXutil.rtrim( Dvpanel_unnamedtable2_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable2_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable2_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Cls", GXutil.rtrim( Dvpanel_unnamedtable2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Title", GXutil.rtrim( Dvpanel_unnamedtable2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable2_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable2_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable2_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Title", GXutil.rtrim( Dvelop_confirmpanel_enter_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_COPIARPROCESOSPEDIDOANTERIOR_Title", GXutil.rtrim( Dvelop_confirmpanel_copiarprocesospedidoanterior_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_COPIARPROCESOSPEDIDOANTERIOR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_copiarprocesospedidoanterior_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_COPIARPROCESOSPEDIDOANTERIOR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_copiarprocesospedidoanterior_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_COPIARPROCESOSPEDIDOANTERIOR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_copiarprocesospedidoanterior_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_COPIARPROCESOSPEDIDOANTERIOR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_copiarprocesospedidoanterior_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_COPIARPROCESOSPEDIDOANTERIOR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_copiarprocesospedidoanterior_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_COPIARPROCESOSPEDIDOANTERIOR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_copiarprocesospedidoanterior_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_COPIARPROCESOSPEDIDOANTERIOR_Result", GXutil.rtrim( Dvelop_confirmpanel_copiarprocesospedidoanterior_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_COPIARPROCESOSPEDIDOANTERIOR_Result", GXutil.rtrim( Dvelop_confirmpanel_copiarprocesospedidoanterior_Result));
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", GX_FocusControl);
      httpContext.SendAjaxEncryptionKey();
      sendSecurityToken(sPrefix);
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
   }

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we2932( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2932( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.pedidos.dislin____ww", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV17CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV18CliNom)),GXutil.URLEncode(GXutil.rtrim(AV19DisArtCod)),GXutil.URLEncode(GXutil.rtrim(AV20DisArtDsc)),GXutil.URLEncode(GXutil.formatDateParm(AV16DisFec)),GXutil.URLEncode(GXutil.rtrim(AV42DisUnimed)),GXutil.URLEncode(GXutil.rtrim(AV43Cod_Idtx)),GXutil.URLEncode(GXutil.ltrimstr(AV21DisEst,1,0)),GXutil.URLEncode(GXutil.booltostr(AV5VisualizarAcciones)),GXutil.URLEncode(GXutil.booltostr(AV6AccionesEnPopup))}, new String[] {"EmprCod","DisCod","CliCod","CliNom","DisArtCod","DisArtDsc","DisFec","DisUnimed","Cod_Idtx","DisEst","VisualizarAcciones","AccionesEnPopup"})  ;
   }

   public String getPgmname( )
   {
      return "Pedidos.DisLin____WW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Proceso", "") ;
   }

   public void wb2930( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( nGXWrapped == 1 )
         {
            renderHtmlHeaders( ) ;
            renderHtmlOpenForm( ) ;
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
         ucDvpanel_tablepedido.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tablepedido_Internalname, "DVPANEL_TABLEPEDIDOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEPEDIDOContainer"+"TablePedido"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablepedido_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisCod_Internalname, httpContext.getMessage( "Nº Disp. Int.", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisLin____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDisfec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDisfec_Internalname, httpContext.getMessage( "Fecha", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavDisfec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDisfec_Internalname, localUtil.format(AV16DisFec, "99/99/99"), localUtil.format( AV16DisFec, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDisfec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDisfec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisLin____WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDisfec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavDisfec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Pedidos\\DisLin____WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV17CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV17CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV17CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisLin____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Nombre", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV18CliNom), GXutil.rtrim( localUtil.format( AV18CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisLin____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDisartcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDisartcod_Internalname, httpContext.getMessage( "Articulo", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDisartcod_Internalname, GXutil.rtrim( AV19DisArtCod), GXutil.rtrim( localUtil.format( AV19DisArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDisartcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDisartcod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisLin____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDisartdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDisartdsc_Internalname, httpContext.getMessage( "Descripcion", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDisartdsc_Internalname, GXutil.rtrim( AV20DisArtDsc), GXutil.rtrim( localUtil.format( AV20DisArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDisartdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDisartdsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisLin____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavDisest.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavDisest.getInternalname(), httpContext.getMessage( "Estado", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavDisest, cmbavDisest.getInternalname(), GXutil.trim( GXutil.str( AV21DisEst, 1, 0)), 1, cmbavDisest.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavDisest.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_Pedidos\\DisLin____WW.htm");
         cmbavDisest.setValue( GXutil.trim( GXutil.str( AV21DisEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDisest.getInternalname(), "Values", cmbavDisest.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
         ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, "DVPANEL_UNNAMEDTABLE1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedinprocod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockinprocod_Internalname, httpContext.getMessage( "Proceso", ""), "", "", lblTextblockinprocod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Pedidos\\DisLin____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_59_2932( true) ;
      }
      else
      {
         wb_table1_59_2932( false) ;
      }
      return  ;
   }

   public void wb_table1_59_2932e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavInoutprodsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavInoutprodsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_92_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavInoutprodsc_Internalname, GXutil.rtrim( AV48InOutProDsc), GXutil.rtrim( localUtil.format( AV48InOutProDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavInoutprodsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavInoutprodsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisLin____WW.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 92, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtnenter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\DisLin____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncopiarprocesospedidoanterior_Internalname, "gx.evt.setGridEvt("+GXutil.str( 92, 2, 0)+","+"null"+");", httpContext.getMessage( "Copiar Procesos Pedido Anterior", ""), bttBtncopiarprocesospedidoanterior_Jsonclick, 5, httpContext.getMessage( "Copiar Procesos Pedido Anterior", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCOPIARPROCESOSPEDIDOANTERIOR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\DisLin____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 92, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\DisLin____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable2.setProperty("Width", Dvpanel_unnamedtable2_Width);
         ucDvpanel_unnamedtable2.setProperty("AutoWidth", Dvpanel_unnamedtable2_Autowidth);
         ucDvpanel_unnamedtable2.setProperty("AutoHeight", Dvpanel_unnamedtable2_Autoheight);
         ucDvpanel_unnamedtable2.setProperty("Cls", Dvpanel_unnamedtable2_Cls);
         ucDvpanel_unnamedtable2.setProperty("Title", Dvpanel_unnamedtable2_Title);
         ucDvpanel_unnamedtable2.setProperty("Collapsible", Dvpanel_unnamedtable2_Collapsible);
         ucDvpanel_unnamedtable2.setProperty("Collapsed", Dvpanel_unnamedtable2_Collapsed);
         ucDvpanel_unnamedtable2.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable2_Showcollapseicon);
         ucDvpanel_unnamedtable2.setProperty("IconPosition", Dvpanel_unnamedtable2_Iconposition);
         ucDvpanel_unnamedtable2.setProperty("AutoScroll", Dvpanel_unnamedtable2_Autoscroll);
         ucDvpanel_unnamedtable2.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable2_Internalname, "DVPANEL_UNNAMEDTABLE2Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE2Container"+"UnnamedTable2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", divUnnamedtable2_Height, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol92( ) ;
      }
      if ( wbEnd == 92 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_92 = (int)(nGXsfl_92_idx-1) ;
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
            httpContext.writeText( "<div id=\""+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid", GridContainer, subGrid_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData", GridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData"+"V", GridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV53Pgmname), GXutil.rtrim( localUtil.format( AV53Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisLin____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, "DATAMONJSContainer");
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
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV27DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisLin____WW.htm");
         wb_table2_108_2932( true) ;
      }
      else
      {
         wb_table2_108_2932( false) ;
      }
      return  ;
   }

   public void wb_table2_108_2932e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_113_2932( true) ;
      }
      else
      {
         wb_table3_113_2932( false) ;
      }
      return  ;
   }

   public void wb_table3_113_2932e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_118_2932( true) ;
      }
      else
      {
         wb_table4_118_2932( false) ;
      }
      return  ;
   }

   public void wb_table4_118_2932e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 92 )
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
               httpContext.writeText( "<div id=\""+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Grid", GridContainer, subGrid_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData", GridContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData"+"V", GridContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start2932( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         if ( httpContext.exposeMetadata( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
         }
         Form.getMeta().addItem("description", httpContext.getMessage( " Proceso", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2930( ) ;
   }

   public void ws2932( )
   {
      start2932( ) ;
      evt2932( ) ;
   }

   public void evt2932( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            sEvt = httpContext.cgiGet( "_EventName") ;
            EvtGridId = httpContext.cgiGet( "_EventGridId") ;
            EvtRowId = httpContext.cgiGet( "_EventRowId") ;
            if ( GXutil.len( sEvt) > 0 )
            {
               sEvtType = GXutil.left( sEvt, 1) ;
               sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
               if ( GXutil.strcmp(sEvtType, "M") != 0 )
               {
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e112932 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122932 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ENTER.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132932 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_COPIARPROCESOSPEDIDOANTERIOR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142932 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ! wbErr )
                           {
                              Rfr0gs = false ;
                              if ( ! Rfr0gs )
                              {
                                 /* Execute user event: Enter */
                                 e152932 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCOPIARPROCESOSPEDIDOANTERIOR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCopiarProcesosPedidoAnterior' */
                           e162932 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e172932 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VINPROCOD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e182932 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           AV54Pedidos_dislin____wwds_1_tfprocod = AV23TFProCod ;
                           AV55Pedidos_dislin____wwds_2_tfprocod_sel = AV24TFProCod_Sel ;
                           AV56Pedidos_dislin____wwds_3_tfprodsc = AV25TFProDsc ;
                           AV57Pedidos_dislin____wwds_4_tfprodsc_sel = AV26TFProDsc_Sel ;
                           sEvt = httpContext.cgiGet( "GRIDPAGING") ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) )
                        {
                           nGXsfl_92_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_92_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_92_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_922( ) ;
                           cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
                           cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
                           AV34GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34GridActionGroup1), 4, 0));
                           A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
                           A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e192932 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e202932 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e212932 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONGROUP1.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e222932 ();
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
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

   public void we2932( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            if ( nGXWrapped == 1 )
            {
               renderHtmlCloseForm( ) ;
            }
         }
      }
   }

   public void pa2932( )
   {
      if ( nDonePA == 0 )
      {
         if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
         {
            gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
         }
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
         init_web_controls( ) ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = edtavInprocod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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
      subsflControlProps_922( ) ;
      while ( nGXsfl_92_idx <= nRC_GXsfl_92 )
      {
         sendrow_922( ) ;
         nGXsfl_92_idx = ((subGrid_Islastpage==1)&&(nGXsfl_92_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_92_idx+1) ;
         sGXsfl_92_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_92_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_922( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String A396EmprCod ,
                                 int A361DisCod ,
                                 String AV23TFProCod ,
                                 String AV24TFProCod_Sel ,
                                 String AV25TFProDsc ,
                                 String AV26TFProDsc_Sel ,
                                 String AV53Pgmname ,
                                 short AV14OrderedBy ,
                                 boolean AV15OrderedDsc ,
                                 byte AV21DisEst ,
                                 boolean AV5VisualizarAcciones ,
                                 boolean AV6AccionesEnPopup )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e202932 ();
      GRID_nCurrentRecord = 0 ;
      rf2932( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DisLin____WW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV53Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidos\\dislin____ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A758ProCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCOD", GXutil.rtrim( A758ProCod));
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
      if ( cmbavDisest.getItemCount() > 0 )
      {
         AV21DisEst = (byte)(GXutil.lval( cmbavDisest.getValidValue(GXutil.trim( GXutil.str( AV21DisEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21DisEst", GXutil.str( AV21DisEst, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21DisEst), "9")));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavDisest.setValue( GXutil.trim( GXutil.str( AV21DisEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDisest.getInternalname(), "Values", cmbavDisest.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2932( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV53Pgmname = "Pedidos.DisLin____WW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53Pgmname", AV53Pgmname);
      Gx_err = (short)(0) ;
      edtavDisfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisfec_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavDisartcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisartcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisartcod_Enabled), 5, 0), true);
      edtavDisartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisartdsc_Enabled), 5, 0), true);
      cmbavDisest.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDisest.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavDisest.getEnabled(), 5, 0), true);
      edtavInoutprodsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInoutprodsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInoutprodsc_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      imgPrompt_inprocod_Link = "javascript:"+"gx.popup.openPrompt('"+"app.ficherosbasicos.tprocesprompt"+"',["+"{Ctrl:gx.dom.el('"+"EMPRCOD"+"'), id:'"+"EMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vINPROCOD"+"'), id:'"+"vINPROCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vINOUTPRODSC"+"'), id:'"+"vINOUTPRODSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_inprocod_Internalname, "Link", imgPrompt_inprocod_Link, true);
      imgPrompt_inprocod_Link = "javascript:"+"gx.popup.openPrompt('"+"app.ficherosbasicos.tprocesprompt"+"',["+"{Ctrl:gx.dom.el('"+"EMPRCOD"+"'), id:'"+"EMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vINPROCOD"+"'), id:'"+"vINPROCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vINOUTPRODSC"+"'), id:'"+"vINOUTPRODSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_inprocod_Internalname, "Link", imgPrompt_inprocod_Link, true);
   }

   public void rf2932( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(92) ;
      /* Execute user event: Refresh */
      e202932 ();
      nGXsfl_92_idx = 1 ;
      sGXsfl_92_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_92_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_922( ) ;
      bGXsfl_92_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
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
         subsflControlProps_922( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV55Pedidos_dislin____wwds_2_tfprocod_sel ,
                                              AV54Pedidos_dislin____wwds_1_tfprocod ,
                                              AV57Pedidos_dislin____wwds_4_tfprodsc_sel ,
                                              AV56Pedidos_dislin____wwds_3_tfprodsc ,
                                              A758ProCod ,
                                              A759ProDsc ,
                                              Short.valueOf(AV14OrderedBy) ,
                                              Boolean.valueOf(AV15OrderedDsc) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A361DisCod) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT
                                              }
         });
         lV54Pedidos_dislin____wwds_1_tfprocod = GXutil.padr( GXutil.rtrim( AV54Pedidos_dislin____wwds_1_tfprocod), 8, "%") ;
         lV56Pedidos_dislin____wwds_3_tfprodsc = GXutil.padr( GXutil.rtrim( AV56Pedidos_dislin____wwds_3_tfprodsc), 40, "%") ;
         /* Using cursor H02932 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), lV54Pedidos_dislin____wwds_1_tfprocod, AV55Pedidos_dislin____wwds_2_tfprocod_sel, lV56Pedidos_dislin____wwds_3_tfprodsc, AV57Pedidos_dislin____wwds_4_tfprodsc_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_92_idx = 1 ;
         sGXsfl_92_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_92_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_922( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A759ProDsc = H02932_A759ProDsc[0] ;
            A758ProCod = H02932_A758ProCod[0] ;
            A759ProDsc = H02932_A759ProDsc[0] ;
            e212932 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(92) ;
         wb2930( ) ;
      }
      bGXsfl_92_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2932( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PROCOD"+"_"+sGXsfl_92_idx, getSecureSignedToken( sGXsfl_92_idx, GXutil.rtrim( localUtil.format( A758ProCod, ""))));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vVISUALIZARACCIONES", AV5VisualizarAcciones);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVISUALIZARACCIONES", getSecureSignedToken( "", AV5VisualizarAcciones));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vACCIONESENPOPUP", AV6AccionesEnPopup);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACCIONESENPOPUP", getSecureSignedToken( "", AV6AccionesEnPopup));
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
      AV54Pedidos_dislin____wwds_1_tfprocod = AV23TFProCod ;
      AV55Pedidos_dislin____wwds_2_tfprocod_sel = AV24TFProCod_Sel ;
      AV56Pedidos_dislin____wwds_3_tfprodsc = AV25TFProDsc ;
      AV57Pedidos_dislin____wwds_4_tfprodsc_sel = AV26TFProDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV55Pedidos_dislin____wwds_2_tfprocod_sel ,
                                           AV54Pedidos_dislin____wwds_1_tfprocod ,
                                           AV57Pedidos_dislin____wwds_4_tfprodsc_sel ,
                                           AV56Pedidos_dislin____wwds_3_tfprodsc ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           Short.valueOf(AV14OrderedBy) ,
                                           Boolean.valueOf(AV15OrderedDsc) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A361DisCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV54Pedidos_dislin____wwds_1_tfprocod = GXutil.padr( GXutil.rtrim( AV54Pedidos_dislin____wwds_1_tfprocod), 8, "%") ;
      lV56Pedidos_dislin____wwds_3_tfprodsc = GXutil.padr( GXutil.rtrim( AV56Pedidos_dislin____wwds_3_tfprodsc), 40, "%") ;
      /* Using cursor H02933 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), lV54Pedidos_dislin____wwds_1_tfprocod, AV55Pedidos_dislin____wwds_2_tfprocod_sel, lV56Pedidos_dislin____wwds_3_tfprodsc, AV57Pedidos_dislin____wwds_4_tfprodsc_sel});
      GRID_nRecordCount = H02933_AGRID_nRecordCount[0] ;
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
      AV54Pedidos_dislin____wwds_1_tfprocod = AV23TFProCod ;
      AV55Pedidos_dislin____wwds_2_tfprocod_sel = AV24TFProCod_Sel ;
      AV56Pedidos_dislin____wwds_3_tfprodsc = AV25TFProDsc ;
      AV57Pedidos_dislin____wwds_4_tfprodsc_sel = AV26TFProDsc_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A361DisCod, AV23TFProCod, AV24TFProCod_Sel, AV25TFProDsc, AV26TFProDsc_Sel, AV53Pgmname, AV14OrderedBy, AV15OrderedDsc, AV21DisEst, AV5VisualizarAcciones, AV6AccionesEnPopup) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV54Pedidos_dislin____wwds_1_tfprocod = AV23TFProCod ;
      AV55Pedidos_dislin____wwds_2_tfprocod_sel = AV24TFProCod_Sel ;
      AV56Pedidos_dislin____wwds_3_tfprodsc = AV25TFProDsc ;
      AV57Pedidos_dislin____wwds_4_tfprodsc_sel = AV26TFProDsc_Sel ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A361DisCod, AV23TFProCod, AV24TFProCod_Sel, AV25TFProDsc, AV26TFProDsc_Sel, AV53Pgmname, AV14OrderedBy, AV15OrderedDsc, AV21DisEst, AV5VisualizarAcciones, AV6AccionesEnPopup) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV54Pedidos_dislin____wwds_1_tfprocod = AV23TFProCod ;
      AV55Pedidos_dislin____wwds_2_tfprocod_sel = AV24TFProCod_Sel ;
      AV56Pedidos_dislin____wwds_3_tfprodsc = AV25TFProDsc ;
      AV57Pedidos_dislin____wwds_4_tfprodsc_sel = AV26TFProDsc_Sel ;
      if ( GRID_nFirstRecordOnPage >= subgrid_fnc_recordsperpage( ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage-subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A361DisCod, AV23TFProCod, AV24TFProCod_Sel, AV25TFProDsc, AV26TFProDsc_Sel, AV53Pgmname, AV14OrderedBy, AV15OrderedDsc, AV21DisEst, AV5VisualizarAcciones, AV6AccionesEnPopup) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV54Pedidos_dislin____wwds_1_tfprocod = AV23TFProCod ;
      AV55Pedidos_dislin____wwds_2_tfprocod_sel = AV24TFProCod_Sel ;
      AV56Pedidos_dislin____wwds_3_tfprodsc = AV25TFProDsc ;
      AV57Pedidos_dislin____wwds_4_tfprodsc_sel = AV26TFProDsc_Sel ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A361DisCod, AV23TFProCod, AV24TFProCod_Sel, AV25TFProDsc, AV26TFProDsc_Sel, AV53Pgmname, AV14OrderedBy, AV15OrderedDsc, AV21DisEst, AV5VisualizarAcciones, AV6AccionesEnPopup) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV54Pedidos_dislin____wwds_1_tfprocod = AV23TFProCod ;
      AV55Pedidos_dislin____wwds_2_tfprocod_sel = AV24TFProCod_Sel ;
      AV56Pedidos_dislin____wwds_3_tfprodsc = AV25TFProDsc ;
      AV57Pedidos_dislin____wwds_4_tfprodsc_sel = AV26TFProDsc_Sel ;
      if ( nPageNo > 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A361DisCod, AV23TFProCod, AV24TFProCod_Sel, AV25TFProDsc, AV26TFProDsc_Sel, AV53Pgmname, AV14OrderedBy, AV15OrderedDsc, AV21DisEst, AV5VisualizarAcciones, AV6AccionesEnPopup) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV53Pgmname = "Pedidos.DisLin____WW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53Pgmname", AV53Pgmname);
      Gx_err = (short)(0) ;
      edtavDisfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisfec_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavDisartcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisartcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisartcod_Enabled), 5, 0), true);
      edtavDisartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisartdsc_Enabled), 5, 0), true);
      cmbavDisest.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDisest.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavDisest.getEnabled(), 5, 0), true);
      edtavInoutprodsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInoutprodsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInoutprodsc_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      imgPrompt_inprocod_Link = "javascript:"+"gx.popup.openPrompt('"+"app.ficherosbasicos.tprocesprompt"+"',["+"{Ctrl:gx.dom.el('"+"EMPRCOD"+"'), id:'"+"EMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vINPROCOD"+"'), id:'"+"vINPROCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vINOUTPRODSC"+"'), id:'"+"vINOUTPRODSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_inprocod_Internalname, "Link", imgPrompt_inprocod_Link, true);
      imgPrompt_inprocod_Link = "javascript:"+"gx.popup.openPrompt('"+"app.ficherosbasicos.tprocesprompt"+"',["+"{Ctrl:gx.dom.el('"+"EMPRCOD"+"'), id:'"+"EMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vINPROCOD"+"'), id:'"+"vINPROCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vINOUTPRODSC"+"'), id:'"+"vINOUTPRODSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_inprocod_Internalname, "Link", imgPrompt_inprocod_Link, true);
      fix_multi_value_controls( ) ;
   }

   public void strup2930( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e192932 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV27DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_92 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_92"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_tablepedido_Width = httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Width") ;
         Dvpanel_tablepedido_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Autowidth")) ;
         Dvpanel_tablepedido_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Autoheight")) ;
         Dvpanel_tablepedido_Cls = httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Cls") ;
         Dvpanel_tablepedido_Title = httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Title") ;
         Dvpanel_tablepedido_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Collapsible")) ;
         Dvpanel_tablepedido_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Collapsed")) ;
         Dvpanel_tablepedido_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Showcollapseicon")) ;
         Dvpanel_tablepedido_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Iconposition") ;
         Dvpanel_tablepedido_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Autoscroll")) ;
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
         Dvpanel_unnamedtable2_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Width") ;
         Dvpanel_unnamedtable2_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autowidth")) ;
         Dvpanel_unnamedtable2_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoheight")) ;
         Dvpanel_unnamedtable2_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Cls") ;
         Dvpanel_unnamedtable2_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Title") ;
         Dvpanel_unnamedtable2_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsible")) ;
         Dvpanel_unnamedtable2_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsed")) ;
         Dvpanel_unnamedtable2_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Showcollapseicon")) ;
         Dvpanel_unnamedtable2_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Iconposition") ;
         Dvpanel_unnamedtable2_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoscroll")) ;
         Ddo_grid_Caption = httpContext.cgiGet( "DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( "DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( "DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( "DDO_GRID_Includesortasc") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( "DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( "DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Dvelop_confirmpanel_eliminar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Title") ;
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_eliminar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype") ;
         Dvelop_confirmpanel_enter_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Title") ;
         Dvelop_confirmpanel_enter_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext") ;
         Dvelop_confirmpanel_enter_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption") ;
         Dvelop_confirmpanel_enter_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption") ;
         Dvelop_confirmpanel_enter_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_enter_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition") ;
         Dvelop_confirmpanel_enter_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmtype") ;
         Dvelop_confirmpanel_copiarprocesospedidoanterior_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_COPIARPROCESOSPEDIDOANTERIOR_Title") ;
         Dvelop_confirmpanel_copiarprocesospedidoanterior_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_COPIARPROCESOSPEDIDOANTERIOR_Confirmationtext") ;
         Dvelop_confirmpanel_copiarprocesospedidoanterior_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_COPIARPROCESOSPEDIDOANTERIOR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_copiarprocesospedidoanterior_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_COPIARPROCESOSPEDIDOANTERIOR_Nobuttoncaption") ;
         Dvelop_confirmpanel_copiarprocesospedidoanterior_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_COPIARPROCESOSPEDIDOANTERIOR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_copiarprocesospedidoanterior_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_COPIARPROCESOSPEDIDOANTERIOR_Yesbuttonposition") ;
         Dvelop_confirmpanel_copiarprocesospedidoanterior_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_COPIARPROCESOSPEDIDOANTERIOR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         Dvelop_confirmpanel_enter_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Result") ;
         Dvelop_confirmpanel_copiarprocesospedidoanterior_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_COPIARPROCESOSPEDIDOANTERIOR_Result") ;
         /* Read variables values. */
         AV31InProCod = httpContext.cgiGet( edtavInprocod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31InProCod", AV31InProCod);
         AV48InOutProDsc = httpContext.cgiGet( edtavInoutprodsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48InOutProDsc", AV48InOutProDsc);
         AV53Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53Pgmname", AV53Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"DisLin____WW");
         AV53Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53Pgmname", AV53Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV53Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("pedidos\\dislin____ww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e192932 ();
      if (returnInSub) return;
   }

   public void e192932( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV39Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      dislin____ww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV39Station = GXt_char1 ;
      GXv_char2[0] = AV38EmprCod ;
      GXv_char3[0] = AV40EmprNom ;
      GXv_char4[0] = AV41UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV39Station, GXv_char2, GXv_char3, GXv_char4) ;
      dislin____ww_impl.this.AV38EmprCod = GXv_char2[0] ;
      dislin____ww_impl.this.AV40EmprNom = GXv_char3[0] ;
      dislin____ww_impl.this.AV41UsurCod = GXv_char4[0] ;
      divUnnamedtable2_Height = 300 ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable2_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable2_Height), 9, 0), true);
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Proceso", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV14OrderedBy < 1 )
      {
         AV14OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV27DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV27DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      bttBtnenter_Visible = (((AV21DisEst==3) ? false : true) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtnenter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnenter_Visible), 5, 0), true);
      edtavInprocod_Visible = (((AV21DisEst==3) ? false : true) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInprocod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInprocod_Visible), 5, 0), true);
   }

   public void e202932( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV8WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV8WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      AV54Pedidos_dislin____wwds_1_tfprocod = AV23TFProCod ;
      AV55Pedidos_dislin____wwds_2_tfprocod_sel = AV24TFProCod_Sel ;
      AV56Pedidos_dislin____wwds_3_tfprodsc = AV25TFProDsc ;
      AV57Pedidos_dislin____wwds_4_tfprodsc_sel = AV26TFProDsc_Sel ;
   }

   public void e112932( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV14OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14OrderedBy), 4, 0));
         AV15OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15OrderedDsc", AV15OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProCod") == 0 )
         {
            AV23TFProCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFProCod", AV23TFProCod);
            AV24TFProCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFProCod_Sel", AV24TFProCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProDsc") == 0 )
         {
            AV25TFProDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFProDsc", AV25TFProDsc);
            AV26TFProDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFProDsc_Sel", AV26TFProDsc_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e212932( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactiongroup1.removeAllItems();
      cmbavGridactiongroup1.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactiongroup1.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Fases", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      if ( AV21DisEst != 3 )
      {
         cmbavGridactiongroup1.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(92) ;
      }
      sendrow_922( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_92_Refreshing )
      {
         httpContext.doAjaxLoad(92, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV34GridActionGroup1, 4, 0)) );
   }

   public void e222932( )
   {
      /* Gridactiongroup1_Click Routine */
      returnInSub = false ;
      if ( AV34GridActionGroup1 == 1 )
      {
         /* Execute user subroutine: 'DO FASES_' */
         S162 ();
         if (returnInSub) return;
      }
      else if ( AV34GridActionGroup1 == 2 )
      {
         /* Execute user subroutine: 'DO ELIMINAR' */
         S172 ();
         if (returnInSub) return;
      }
      AV34GridActionGroup1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34GridActionGroup1), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV34GridActionGroup1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), true);
   }

   public void e122932( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S182 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e152932 ();
      if (returnInSub) return;
   }

   public void e152932( )
   {
      /* Enter Routine */
      returnInSub = false ;
      if ( (GXutil.strcmp("", AV31InProCod)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Proceso", ""));
         GX_FocusControl = edtavInprocod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         GXv_char4[0] = AV48InOutProDsc ;
         GXv_char3[0] = AV50Proact ;
         new app.descripcionprocesoyactivo(remoteHandle, context).execute( A396EmprCod, AV31InProCod, GXv_char4, GXv_char3) ;
         dislin____ww_impl.this.AV48InOutProDsc = GXv_char4[0] ;
         dislin____ww_impl.this.AV50Proact = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48InOutProDsc", AV48InOutProDsc);
         if ( GXutil.strcmp(AV48InOutProDsc, httpContext.getMessage( "No existe proceso", "")) == 0 )
         {
            httpContext.GX_msglist.addItem(AV48InOutProDsc);
            GX_FocusControl = edtavInprocod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( GXutil.strcmp(AV50Proact, "I") == 0 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso INACTIVO", ""));
               GX_FocusControl = edtavInprocod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               GXv_int8[0] = AV49flag ;
               new app.pedidos.existeprocesoendislin(remoteHandle, context).execute( A396EmprCod, A361DisCod, AV31InProCod, GXv_int8) ;
               dislin____ww_impl.this.AV49flag = GXv_int8[0] ;
               if ( AV49flag == 1 )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "Ya existe este proceso ", "")+GXutil.trim( AV31InProCod)+httpContext.getMessage( " en el pedido ", "")+GXutil.str( A361DisCod, 8, 0));
                  GX_FocusControl = edtavInprocod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               else
               {
                  this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ENTERContainer", "Confirm", "", new Object[] {});
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e132932( )
   {
      /* Dvelop_confirmpanel_enter_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_enter_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ENTER' */
         S192 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e162932( )
   {
      /* 'DoCopiarProcesosPedidoAnterior' Routine */
      returnInSub = false ;
      GXt_int9 = AV44Anterior_Discod ;
      GXv_int10[0] = GXt_int9 ;
      new app.pedidos.discodanterior(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_int10) ;
      dislin____ww_impl.this.GXt_int9 = GXv_int10[0] ;
      AV44Anterior_Discod = GXt_int9 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Anterior_Discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44Anterior_Discod), 8, 0));
      AV44Anterior_Discod = (int)(AV44Anterior_Discod-1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Anterior_Discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44Anterior_Discod), 8, 0));
      if ( AV44Anterior_Discod <= 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO hay pedido anterior", ""));
      }
      else
      {
         Dvelop_confirmpanel_copiarprocesospedidoanterior_Confirmationtext = httpContext.getMessage( "Pedido Anterior ", "")+GXutil.trim( GXutil.str( AV44Anterior_Discod, 8, 0))+GXutil.newLine( ) ;
         ucDvelop_confirmpanel_copiarprocesospedidoanterior.sendProperty(context, "", false, Dvelop_confirmpanel_copiarprocesospedidoanterior_Internalname, "ConfirmationText", Dvelop_confirmpanel_copiarprocesospedidoanterior_Confirmationtext);
         Dvelop_confirmpanel_copiarprocesospedidoanterior_Confirmationtext = Dvelop_confirmpanel_copiarprocesospedidoanterior_Confirmationtext+httpContext.getMessage( "Se copiaran todos los Procesos.", "")+GXutil.newLine( ) ;
         ucDvelop_confirmpanel_copiarprocesospedidoanterior.sendProperty(context, "", false, Dvelop_confirmpanel_copiarprocesospedidoanterior_Internalname, "ConfirmationText", Dvelop_confirmpanel_copiarprocesospedidoanterior_Confirmationtext);
         Dvelop_confirmpanel_copiarprocesospedidoanterior_Confirmationtext = Dvelop_confirmpanel_copiarprocesospedidoanterior_Confirmationtext+httpContext.getMessage( "Confirma el Proceso?", "") ;
         ucDvelop_confirmpanel_copiarprocesospedidoanterior.sendProperty(context, "", false, Dvelop_confirmpanel_copiarprocesospedidoanterior_Internalname, "ConfirmationText", Dvelop_confirmpanel_copiarprocesospedidoanterior_Confirmationtext);
         this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_COPIARPROCESOSPEDIDOANTERIORContainer", "Confirm", "", new Object[] {});
      }
      /*  Sending Event outputs  */
   }

   public void e142932( )
   {
      /* Dvelop_confirmpanel_copiarprocesospedidoanterior_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_copiarprocesospedidoanterior_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION COPIARPROCESOSPEDIDOANTERIOR' */
         S202 ();
         if (returnInSub) return;
      }
   }

   public void e172932( )
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

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV14OrderedBy, 4, 0))+":"+(AV15OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'DO FASES_' Routine */
      returnInSub = false ;
      AV35tmp_EmprCod = A396EmprCod ;
      AV36tmp_DisCod = A361DisCod ;
      AV37tmp_ProCod = A758ProCod ;
      httpContext.popup(formatLink("app.pedidos.disfas___ww", new String[] {GXutil.URLEncode(GXutil.rtrim(AV35tmp_EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV36tmp_DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV37tmp_ProCod)),GXutil.URLEncode(GXutil.booltostr(AV5VisualizarAcciones)),GXutil.URLEncode(GXutil.booltostr(AV6AccionesEnPopup))}, new String[] {"EmprCod","DisCod","ProCod","VisualizarAcciones","AccionesEnPopup"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S172( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.getMessage( "Desea eliminar el Proceso ", "")+GXutil.trim( A758ProCod)+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_eliminar.sendProperty(context, "", false, Dvelop_confirmpanel_eliminar_Internalname, "ConfirmationText", Dvelop_confirmpanel_eliminar_Confirmationtext);
      Dvelop_confirmpanel_eliminar_Confirmationtext = Dvelop_confirmpanel_eliminar_Confirmationtext+httpContext.getMessage( "Para el Nº Ped. Int. ", "")+GXutil.trim( GXutil.str( A361DisCod, 8, 0))+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_eliminar.sendProperty(context, "", false, Dvelop_confirmpanel_eliminar_Internalname, "ConfirmationText", Dvelop_confirmpanel_eliminar_Confirmationtext);
      Dvelop_confirmpanel_eliminar_Confirmationtext = Dvelop_confirmpanel_eliminar_Confirmationtext+httpContext.getMessage( "Empresa ", "")+GXutil.trim( A396EmprCod)+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_eliminar.sendProperty(context, "", false, Dvelop_confirmpanel_eliminar_Internalname, "ConfirmationText", Dvelop_confirmpanel_eliminar_Confirmationtext);
      AV45EmprCod_Selected = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45EmprCod_Selected", AV45EmprCod_Selected);
      AV46DisCod_Selected = A361DisCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46DisCod_Selected", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46DisCod_Selected), 8, 0));
      AV47ProCod_Selected = A758ProCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47ProCod_Selected", AV47ProCod_Selected);
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
   }

   public void S182( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV45EmprCod_Selected ;
      GXv_int10[0] = AV46DisCod_Selected ;
      new app.pedidos.pborpro(remoteHandle, context).execute( GXv_char4, GXv_int10, AV47ProCod_Selected) ;
      dislin____ww_impl.this.AV45EmprCod_Selected = GXv_char4[0] ;
      dislin____ww_impl.this.AV46DisCod_Selected = GXv_int10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45EmprCod_Selected", AV45EmprCod_Selected);
      httpContext.ajax_rsp_assign_attri("", false, "AV46DisCod_Selected", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46DisCod_Selected), 8, 0));
      httpContext.doAjaxRefresh();
   }

   public void S192( )
   {
      /* 'DO ACTION ENTER' Routine */
      returnInSub = false ;
      AV35tmp_EmprCod = A396EmprCod ;
      AV36tmp_DisCod = A361DisCod ;
      new app.pedidos.pnewdislin(remoteHandle, context).execute( AV35tmp_EmprCod, AV36tmp_DisCod, AV31InProCod) ;
      GXv_char4[0] = AV35tmp_EmprCod ;
      GXv_char3[0] = AV31InProCod ;
      new app.pedidos.pfasdis(remoteHandle, context).execute( GXv_char4, AV36tmp_DisCod, GXv_char3) ;
      dislin____ww_impl.this.AV35tmp_EmprCod = GXv_char4[0] ;
      dislin____ww_impl.this.AV31InProCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31InProCod", AV31InProCod);
      AV31InProCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31InProCod", AV31InProCod);
      AV48InOutProDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48InOutProDsc", AV48InOutProDsc);
      GX_FocusControl = edtavInprocod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
      httpContext.doAjaxRefresh();
   }

   public void S202( )
   {
      /* 'DO ACTION COPIARPROCESOSPEDIDOANTERIOR' Routine */
      returnInSub = false ;
      new app.pedidos.procesospedidoanterior(remoteHandle, context).execute( A396EmprCod, A361DisCod, AV44Anterior_Discod) ;
      httpContext.doAjaxRefresh();
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV53Pgmname+"GridState"), "") == 0 )
      {
         AV12GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV53Pgmname+"GridState"), null, null);
      }
      else
      {
         AV12GridState.fromxml(AV22Session.getValue(AV53Pgmname+"GridState"), null, null);
      }
      AV14OrderedBy = AV12GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14OrderedBy), 4, 0));
      AV15OrderedDsc = AV12GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15OrderedDsc", AV15OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      AV58GXV1 = 1 ;
      while ( AV58GXV1 <= AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV13GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV58GXV1));
         if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD") == 0 )
         {
            AV23TFProCod = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFProCod", AV23TFProCod);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD_SEL") == 0 )
         {
            AV24TFProCod_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFProCod_Sel", AV24TFProCod_Sel);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC") == 0 )
         {
            AV25TFProDsc = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFProDsc", AV25TFProDsc);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC_SEL") == 0 )
         {
            AV26TFProDsc_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFProDsc_Sel", AV26TFProDsc_Sel);
         }
         AV58GXV1 = (int)(AV58GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV24TFProCod_Sel)==0), AV24TFProCod_Sel, GXv_char4) ;
      dislin____ww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char11 = "" ;
      GXv_char3[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFProDsc_Sel)==0), AV26TFProDsc_Sel, GXv_char3) ;
      dislin____ww_impl.this.GXt_char11 = GXv_char3[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char11 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char11 = "" ;
      GXv_char4[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV23TFProCod)==0), AV23TFProCod, GXv_char4) ;
      dislin____ww_impl.this.GXt_char11 = GXv_char4[0] ;
      GXt_char1 = "" ;
      GXv_char3[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV25TFProDsc)==0), AV25TFProDsc, GXv_char3) ;
      dislin____ww_impl.this.GXt_char1 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = GXt_char11+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV12GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV12GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV12GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV12GridState.fromxml(AV22Session.getValue(AV53Pgmname+"GridState"), null, null);
      AV12GridState.setgxTv_SdtWWPGridState_Orderedby( AV14OrderedBy );
      AV12GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV15OrderedDsc );
      AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState12[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFPROCOD", "", !(GXutil.strcmp("", AV23TFProCod)==0), (short)(0), AV23TFProCod, "", !(GXutil.strcmp("", AV24TFProCod_Sel)==0), AV24TFProCod_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFPRODSC", "", !(GXutil.strcmp("", AV25TFProDsc)==0), (short)(0), AV25TFProDsc, "", !(GXutil.strcmp("", AV26TFProDsc_Sel)==0), AV26TFProDsc_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState12[0] ;
      AV12GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV12GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV53Pgmname+"GridState", AV12GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV10TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV10TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV53Pgmname );
      AV10TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV10TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV9HTTPRequest.getScriptName()+"?"+AV9HTTPRequest.getQuerystring() );
      AV10TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "Pedidos.DisLin" );
      AV22Session.setValue("TrnContext", AV10TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( ! ( ! AV6AccionesEnPopup ) )
      {
         divDvpanel_tablepedido_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_tablepedido_cell_Internalname, "Class", divDvpanel_tablepedido_cell_Class, true);
      }
      else
      {
         divDvpanel_tablepedido_cell_Class = "col-xs-12 CellMarginTop" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_tablepedido_cell_Internalname, "Class", divDvpanel_tablepedido_cell_Class, true);
      }
   }

   public void e182932( )
   {
      /* Inprocod_Controlvaluechanged Routine */
      returnInSub = false ;
      GXv_char4[0] = AV48InOutProDsc ;
      GXv_char3[0] = AV50Proact ;
      new app.descripcionprocesoyactivo(remoteHandle, context).execute( A396EmprCod, AV31InProCod, GXv_char4, GXv_char3) ;
      dislin____ww_impl.this.AV48InOutProDsc = GXv_char4[0] ;
      dislin____ww_impl.this.AV50Proact = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48InOutProDsc", AV48InOutProDsc);
      if ( GXutil.strcmp(AV50Proact, "I") == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso INACTIVO", ""));
         GX_FocusControl = edtavInprocod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      if ( GXutil.strcmp(AV48InOutProDsc, httpContext.getMessage( "No existe proceso", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(AV48InOutProDsc);
         GX_FocusControl = edtavInprocod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      /*  Sending Event outputs  */
   }

   public void wb_table4_118_2932( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_copiarprocesospedidoanterior_Internalname, tblTabledvelop_confirmpanel_copiarprocesospedidoanterior_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_copiarprocesospedidoanterior.setProperty("Title", Dvelop_confirmpanel_copiarprocesospedidoanterior_Title);
         ucDvelop_confirmpanel_copiarprocesospedidoanterior.setProperty("ConfirmationText", Dvelop_confirmpanel_copiarprocesospedidoanterior_Confirmationtext);
         ucDvelop_confirmpanel_copiarprocesospedidoanterior.setProperty("YesButtonCaption", Dvelop_confirmpanel_copiarprocesospedidoanterior_Yesbuttoncaption);
         ucDvelop_confirmpanel_copiarprocesospedidoanterior.setProperty("NoButtonCaption", Dvelop_confirmpanel_copiarprocesospedidoanterior_Nobuttoncaption);
         ucDvelop_confirmpanel_copiarprocesospedidoanterior.setProperty("CancelButtonCaption", Dvelop_confirmpanel_copiarprocesospedidoanterior_Cancelbuttoncaption);
         ucDvelop_confirmpanel_copiarprocesospedidoanterior.setProperty("YesButtonPosition", Dvelop_confirmpanel_copiarprocesospedidoanterior_Yesbuttonposition);
         ucDvelop_confirmpanel_copiarprocesospedidoanterior.setProperty("ConfirmType", Dvelop_confirmpanel_copiarprocesospedidoanterior_Confirmtype);
         ucDvelop_confirmpanel_copiarprocesospedidoanterior.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_copiarprocesospedidoanterior_Internalname, "DVELOP_CONFIRMPANEL_COPIARPROCESOSPEDIDOANTERIORContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_COPIARPROCESOSPEDIDOANTERIORContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_118_2932e( true) ;
      }
      else
      {
         wb_table4_118_2932e( false) ;
      }
   }

   public void wb_table3_113_2932( boolean wbgen )
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
         ucDvelop_confirmpanel_enter.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_enter_Internalname, "DVELOP_CONFIRMPANEL_ENTERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ENTERContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_113_2932e( true) ;
      }
      else
      {
         wb_table3_113_2932e( false) ;
      }
   }

   public void wb_table2_108_2932( boolean wbgen )
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
         ucDvelop_confirmpanel_eliminar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminar_Internalname, "DVELOP_CONFIRMPANEL_ELIMINARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ELIMINARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_108_2932e( true) ;
      }
      else
      {
         wb_table2_108_2932e( false) ;
      }
   }

   public void wb_table1_59_2932( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedinprocod_Internalname, tblTablemergedinprocod_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavInprocod_Internalname, httpContext.getMessage( "In Pro Cod", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_92_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavInprocod_Internalname, GXutil.rtrim( AV31InProCod), GXutil.rtrim( localUtil.format( AV31InProCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavInprocod_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavInprocod_Visible, edtavInprocod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisLin____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Static images/pictures */
         ClassString = "Image" + " " + ((GXutil.strcmp(imgPrompt_inprocod_gximage, "")==0) ? "GX_Image_prompt_Class" : "GX_Image_"+imgPrompt_inprocod_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgPrompt_inprocod_Internalname, sImgUrl, imgPrompt_inprocod_Link, "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_Pedidos\\DisLin____WW.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_59_2932e( true) ;
      }
      else
      {
         wb_table1_59_2932e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      A361DisCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9")));
      AV17CliCod = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17CliCod), 6, 0));
      AV18CliNom = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18CliNom", AV18CliNom);
      AV19DisArtCod = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19DisArtCod", AV19DisArtCod);
      AV20DisArtDsc = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20DisArtDsc", AV20DisArtDsc);
      AV16DisFec = (java.util.Date)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16DisFec", localUtil.format(AV16DisFec, "99/99/99"));
      AV42DisUnimed = (String)getParm(obj,7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42DisUnimed", AV42DisUnimed);
      AV43Cod_Idtx = (String)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43Cod_Idtx", AV43Cod_Idtx);
      AV21DisEst = ((Number) GXutil.testNumericType( getParm(obj,9), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21DisEst", GXutil.str( AV21DisEst, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21DisEst), "9")));
      AV5VisualizarAcciones = ((Boolean) getParm(obj,10)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5VisualizarAcciones", AV5VisualizarAcciones);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVISUALIZARACCIONES", getSecureSignedToken( "", AV5VisualizarAcciones));
      AV6AccionesEnPopup = ((Boolean) getParm(obj,11)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6AccionesEnPopup", AV6AccionesEnPopup);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACCIONESENPOPUP", getSecureSignedToken( "", AV6AccionesEnPopup));
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
      pa2932( ) ;
      ws2932( ) ;
      we2932( ) ;
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
      httpContext.setWrapped(false);
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

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116151287", true, true);
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
      httpContext.AddJavascriptSource("pedidos/dislin____ww.js", "?202682116151287", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_922( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_92_idx );
      edtProCod_Internalname = "PROCOD_"+sGXsfl_92_idx ;
      edtProDsc_Internalname = "PRODSC_"+sGXsfl_92_idx ;
   }

   public void subsflControlProps_fel_922( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_92_fel_idx );
      edtProCod_Internalname = "PROCOD_"+sGXsfl_92_fel_idx ;
      edtProDsc_Internalname = "PRODSC_"+sGXsfl_92_fel_idx ;
   }

   public void sendrow_922( )
   {
      subsflControlProps_922( ) ;
      wb2930( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_92_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_92_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_92_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 93,'',false,'"+sGXsfl_92_idx+"',92)\"" : " ") ;
         if ( ( cmbavGridactiongroup1.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_92_idx ;
            cmbavGridactiongroup1.setName( GXCCtl );
            cmbavGridactiongroup1.setWebtags( "" );
            if ( cmbavGridactiongroup1.getItemCount() > 0 )
            {
               AV34GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV34GridActionGroup1, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34GridActionGroup1), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactiongroup1,cmbavGridactiongroup1.getInternalname(),GXutil.trim( GXutil.str( AV34GridActionGroup1, 4, 0)),Integer.valueOf(1),cmbavGridactiongroup1.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONGROUP1.CLICK."+sGXsfl_92_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,93);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV34GridActionGroup1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), !bGXsfl_92_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProCod_Internalname,GXutil.rtrim( A758ProCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(92),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProDsc_Internalname,GXutil.rtrim( A759ProDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(92),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes2932( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_92_idx = ((subGrid_Islastpage==1)&&(nGXsfl_92_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_92_idx+1) ;
         sGXsfl_92_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_92_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_922( ) ;
      }
      /* End function sendrow_922 */
   }

   public void startgridcontrol92( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"92\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proceso", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
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
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV34GridActionGroup1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A758ProCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A759ProDsc));
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
      edtDisCod_Internalname = "DISCOD" ;
      edtavDisfec_Internalname = "vDISFEC" ;
      edtavClicod_Internalname = "vCLICOD" ;
      edtavClinom_Internalname = "vCLINOM" ;
      edtavDisartcod_Internalname = "vDISARTCOD" ;
      edtavDisartdsc_Internalname = "vDISARTDSC" ;
      cmbavDisest.setInternalname( "vDISEST" );
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divTablepedido_Internalname = "TABLEPEDIDO" ;
      Dvpanel_tablepedido_Internalname = "DVPANEL_TABLEPEDIDO" ;
      divDvpanel_tablepedido_cell_Internalname = "DVPANEL_TABLEPEDIDO_CELL" ;
      lblTextblockinprocod_Internalname = "TEXTBLOCKINPROCOD" ;
      edtavInprocod_Internalname = "vINPROCOD" ;
      imgPrompt_inprocod_Internalname = "PROMPT_INPROCOD" ;
      tblTablemergedinprocod_Internalname = "TABLEMERGEDINPROCOD" ;
      divTablesplittedinprocod_Internalname = "TABLESPLITTEDINPROCOD" ;
      edtavInoutprodsc_Internalname = "vINOUTPRODSC" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncopiarprocesospedidoanterior_Internalname = "BTNCOPIARPROCESOSPEDIDOANTERIOR" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1" );
      edtProCod_Internalname = "PROCOD" ;
      edtProDsc_Internalname = "PRODSC" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      Dvelop_confirmpanel_eliminar_Internalname = "DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
      Dvelop_confirmpanel_enter_Internalname = "DVELOP_CONFIRMPANEL_ENTER" ;
      tblTabledvelop_confirmpanel_enter_Internalname = "TABLEDVELOP_CONFIRMPANEL_ENTER" ;
      Dvelop_confirmpanel_copiarprocesospedidoanterior_Internalname = "DVELOP_CONFIRMPANEL_COPIARPROCESOSPEDIDOANTERIOR" ;
      tblTabledvelop_confirmpanel_copiarprocesospedidoanterior_Internalname = "TABLEDVELOP_CONFIRMPANEL_COPIARPROCESOSPEDIDOANTERIOR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGrid_Internalname = "GRID" ;
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtProDsc_Jsonclick = "" ;
      edtProCod_Jsonclick = "" ;
      cmbavGridactiongroup1.setJsonclick( "" );
      cmbavGridactiongroup1.setVisible( -1 );
      cmbavGridactiongroup1.setEnabled( 1 );
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      imgPrompt_inprocod_Link = "" ;
      edtavInprocod_Jsonclick = "" ;
      edtavInprocod_Enabled = 1 ;
      edtavInprocod_Visible = 1 ;
      subGrid_Sortable = (byte)(0) ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divUnnamedtable2_Height = 0 ;
      bttBtnenter_Visible = 1 ;
      edtavInoutprodsc_Jsonclick = "" ;
      edtavInoutprodsc_Enabled = 1 ;
      cmbavDisest.setJsonclick( "" );
      cmbavDisest.setEnabled( 0 );
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
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_copiarprocesospedidoanterior_Confirmtype = "1" ;
      Dvelop_confirmpanel_copiarprocesospedidoanterior_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_copiarprocesospedidoanterior_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_copiarprocesospedidoanterior_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_copiarprocesospedidoanterior_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_copiarprocesospedidoanterior_Confirmationtext = "¿Deseas copiar Proceso(s) del Pedido Anterior?" ;
      Dvelop_confirmpanel_copiarprocesospedidoanterior_Title = "" ;
      Dvelop_confirmpanel_enter_Confirmtype = "1" ;
      Dvelop_confirmpanel_enter_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_enter_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_enter_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_enter_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_enter_Confirmationtext = "¿Confirma el Proceso?" ;
      Dvelop_confirmpanel_enter_Title = "" ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Desea eliminar el Proceso?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Ddo_grid_Datalistproc = "Pedidos.DisLin____WWGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "T" ;
      Ddo_grid_Filtertype = "Character|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2" ;
      Ddo_grid_Columnids = "1:ProCod|2:ProDsc" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = "" ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Dvpanel_tablepedido_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tablepedido_Iconposition = "Right" ;
      Dvpanel_tablepedido_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tablepedido_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_tablepedido_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tablepedido_Title = httpContext.getMessage( "Informacion General", "") ;
      Dvpanel_tablepedido_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tablepedido_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tablepedido_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tablepedido_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Proceso", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavDisest.setName( "vDISEST" );
      cmbavDisest.setWebtags( "" );
      cmbavDisest.addItem("1", httpContext.getMessage( "En Pedido", ""), (short)(0));
      cmbavDisest.addItem("3", httpContext.getMessage( "En Produccion", ""), (short)(0));
      if ( cmbavDisest.getItemCount() > 0 )
      {
         AV21DisEst = (byte)(GXutil.lval( cmbavDisest.getValidValue(GXutil.trim( GXutil.str( AV21DisEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21DisEst", GXutil.str( AV21DisEst, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21DisEst), "9")));
      }
      GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_92_idx ;
      cmbavGridactiongroup1.setName( GXCCtl );
      cmbavGridactiongroup1.setWebtags( "" );
      if ( cmbavGridactiongroup1.getItemCount() > 0 )
      {
         AV34GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV34GridActionGroup1, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34GridActionGroup1), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV23TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV24TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV25TFProDsc',fld:'vTFPRODSC',pic:''},{av:'AV26TFProDsc_Sel',fld:'vTFPRODSC_SEL',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'cmbavDisest'},{av:'AV21DisEst',fld:'vDISEST',pic:'9',hsh:true},{av:'AV5VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:'',hsh:true},{av:'AV6AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e112932',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV23TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV24TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV25TFProDsc',fld:'vTFPRODSC',pic:''},{av:'AV26TFProDsc_Sel',fld:'vTFPRODSC_SEL',pic:''},{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'cmbavDisest'},{av:'AV21DisEst',fld:'vDISEST',pic:'9',hsh:true},{av:'AV5VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:'',hsh:true},{av:'AV6AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV23TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV24TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV25TFProDsc',fld:'vTFPRODSC',pic:''},{av:'AV26TFProDsc_Sel',fld:'vTFPRODSC_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e212932',iparms:[{av:'cmbavDisest'},{av:'AV21DisEst',fld:'vDISEST',pic:'9',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV34GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'}]}");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK","{handler:'e222932',iparms:[{av:'cmbavGridactiongroup1'},{av:'AV34GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV23TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV24TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV25TFProDsc',fld:'vTFPRODSC',pic:''},{av:'AV26TFProDsc_Sel',fld:'vTFPRODSC_SEL',pic:''},{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'cmbavDisest'},{av:'AV21DisEst',fld:'vDISEST',pic:'9',hsh:true},{av:'AV5VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:'',hsh:true},{av:'AV6AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:'',hsh:true},{av:'A758ProCod',fld:'PROCOD',pic:'',hsh:true}]");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV34GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'Dvelop_confirmpanel_eliminar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'ConfirmationText'},{av:'AV45EmprCod_Selected',fld:'vEMPRCOD_SELECTED',pic:'@!'},{av:'AV46DisCod_Selected',fld:'vDISCOD_SELECTED',pic:'ZZZZZZZ9'},{av:'AV47ProCod_Selected',fld:'vPROCOD_SELECTED',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e122932',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV23TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV24TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV25TFProDsc',fld:'vTFPRODSC',pic:''},{av:'AV26TFProDsc_Sel',fld:'vTFPRODSC_SEL',pic:''},{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'cmbavDisest'},{av:'AV21DisEst',fld:'vDISEST',pic:'9',hsh:true},{av:'AV5VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:'',hsh:true},{av:'AV6AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:'',hsh:true},{av:'AV45EmprCod_Selected',fld:'vEMPRCOD_SELECTED',pic:'@!'},{av:'AV46DisCod_Selected',fld:'vDISCOD_SELECTED',pic:'ZZZZZZZ9'},{av:'AV47ProCod_Selected',fld:'vPROCOD_SELECTED',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'AV46DisCod_Selected',fld:'vDISCOD_SELECTED',pic:'ZZZZZZZ9'},{av:'AV45EmprCod_Selected',fld:'vEMPRCOD_SELECTED',pic:'@!'}]}");
      setEventMetadata("ENTER","{handler:'e152932',iparms:[{av:'AV31InProCod',fld:'vINPROCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV48InOutProDsc',fld:'vINOUTPRODSC',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE","{handler:'e132932',iparms:[{av:'Dvelop_confirmpanel_enter_Result',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV23TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV24TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV25TFProDsc',fld:'vTFPRODSC',pic:''},{av:'AV26TFProDsc_Sel',fld:'vTFPRODSC_SEL',pic:''},{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'cmbavDisest'},{av:'AV21DisEst',fld:'vDISEST',pic:'9',hsh:true},{av:'AV5VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:'',hsh:true},{av:'AV6AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:'',hsh:true},{av:'AV31InProCod',fld:'vINPROCOD',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE",",oparms:[{av:'AV31InProCod',fld:'vINPROCOD',pic:''},{av:'AV48InOutProDsc',fld:'vINOUTPRODSC',pic:''}]}");
      setEventMetadata("'DOCOPIARPROCESOSPEDIDOANTERIOR'","{handler:'e162932',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("'DOCOPIARPROCESOSPEDIDOANTERIOR'",",oparms:[{av:'AV44Anterior_Discod',fld:'vANTERIOR_DISCOD',pic:'ZZZZZZZ9'},{av:'Dvelop_confirmpanel_copiarprocesospedidoanterior_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_COPIARPROCESOSPEDIDOANTERIOR',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_COPIARPROCESOSPEDIDOANTERIOR.CLOSE","{handler:'e142932',iparms:[{av:'Dvelop_confirmpanel_copiarprocesospedidoanterior_Result',ctrl:'DVELOP_CONFIRMPANEL_COPIARPROCESOSPEDIDOANTERIOR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV23TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV24TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV25TFProDsc',fld:'vTFPRODSC',pic:''},{av:'AV26TFProDsc_Sel',fld:'vTFPRODSC_SEL',pic:''},{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'cmbavDisest'},{av:'AV21DisEst',fld:'vDISEST',pic:'9',hsh:true},{av:'AV5VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:'',hsh:true},{av:'AV6AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:'',hsh:true},{av:'AV44Anterior_Discod',fld:'vANTERIOR_DISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_COPIARPROCESOSPEDIDOANTERIOR.CLOSE",",oparms:[]}");
      setEventMetadata("'DOCERRAR'","{handler:'e172932',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VINPROCOD.CONTROLVALUECHANGED","{handler:'e182932',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV31InProCod',fld:'vINPROCOD',pic:''}]");
      setEventMetadata("VINPROCOD.CONTROLVALUECHANGED",",oparms:[{av:'AV48InOutProDsc',fld:'vINOUTPRODSC',pic:''}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'cmbavDisest'},{av:'AV21DisEst',fld:'vDISEST',pic:'9',hsh:true},{av:'AV5VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:'',hsh:true},{av:'AV6AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:'',hsh:true},{av:'AV23TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV24TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV25TFProDsc',fld:'vTFPRODSC',pic:''},{av:'AV26TFProDsc_Sel',fld:'vTFPRODSC_SEL',pic:''},{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'cmbavDisest'},{av:'AV21DisEst',fld:'vDISEST',pic:'9',hsh:true},{av:'AV5VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:'',hsh:true},{av:'AV6AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:'',hsh:true},{av:'AV23TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV24TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV25TFProDsc',fld:'vTFPRODSC',pic:''},{av:'AV26TFProDsc_Sel',fld:'vTFPRODSC_SEL',pic:''},{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'cmbavDisest'},{av:'AV21DisEst',fld:'vDISEST',pic:'9',hsh:true},{av:'AV5VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:'',hsh:true},{av:'AV6AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:'',hsh:true},{av:'AV23TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV24TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV25TFProDsc',fld:'vTFPRODSC',pic:''},{av:'AV26TFProDsc_Sel',fld:'vTFPRODSC_SEL',pic:''},{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'cmbavDisest'},{av:'AV21DisEst',fld:'vDISEST',pic:'9',hsh:true},{av:'AV5VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:'',hsh:true},{av:'AV6AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:'',hsh:true},{av:'AV23TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV24TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV25TFProDsc',fld:'vTFPRODSC',pic:''},{av:'AV26TFProDsc_Sel',fld:'vTFPRODSC_SEL',pic:''},{av:'AV53Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[]");
      setEventMetadata("VALID_DISCOD",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[]");
      setEventMetadata("VALID_PROCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Prodsc',iparms:[]");
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
      wcpOAV18CliNom = "" ;
      wcpOAV19DisArtCod = "" ;
      wcpOAV20DisArtDsc = "" ;
      wcpOAV16DisFec = GXutil.nullDate() ;
      wcpOAV42DisUnimed = "" ;
      wcpOAV43Cod_Idtx = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      Dvelop_confirmpanel_enter_Result = "" ;
      Dvelop_confirmpanel_copiarprocesospedidoanterior_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV18CliNom = "" ;
      AV19DisArtCod = "" ;
      AV20DisArtDsc = "" ;
      AV16DisFec = GXutil.nullDate() ;
      AV42DisUnimed = "" ;
      AV43Cod_Idtx = "" ;
      AV23TFProCod = "" ;
      AV24TFProCod_Sel = "" ;
      AV25TFProDsc = "" ;
      AV26TFProDsc_Sel = "" ;
      AV53Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV27DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV45EmprCod_Selected = "" ;
      AV47ProCod_Selected = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tablepedido = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      lblTextblockinprocod_Jsonclick = "" ;
      TempTags = "" ;
      AV48InOutProDsc = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncopiarprocesospedidoanterior_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV54Pedidos_dislin____wwds_1_tfprocod = "" ;
      AV55Pedidos_dislin____wwds_2_tfprocod_sel = "" ;
      AV56Pedidos_dislin____wwds_3_tfprodsc = "" ;
      AV57Pedidos_dislin____wwds_4_tfprodsc_sel = "" ;
      A758ProCod = "" ;
      A759ProDsc = "" ;
      scmdbuf = "" ;
      lV54Pedidos_dislin____wwds_1_tfprocod = "" ;
      lV56Pedidos_dislin____wwds_3_tfprodsc = "" ;
      H02932_A396EmprCod = new String[] {""} ;
      H02932_A361DisCod = new int[1] ;
      H02932_A759ProDsc = new String[] {""} ;
      H02932_A758ProCod = new String[] {""} ;
      H02933_AGRID_nRecordCount = new long[1] ;
      AV31InProCod = "" ;
      hsh = "" ;
      AV39Station = "" ;
      AV38EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV40EmprNom = "" ;
      AV41UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV8WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV50Proact = "" ;
      GXv_int8 = new byte[1] ;
      ucDvelop_confirmpanel_copiarprocesospedidoanterior = new com.genexus.webpanels.GXUserControl();
      AV35tmp_EmprCod = "" ;
      AV37tmp_ProCod = "" ;
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      GXv_int10 = new int[1] ;
      AV22Session = httpContext.getWebSession();
      AV12GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV13GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char11 = "" ;
      GXt_char1 = "" ;
      GXv_SdtWWPGridState12 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV10TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV9HTTPRequest = httpContext.getHttpRequest();
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      ucDvelop_confirmpanel_enter = new com.genexus.webpanels.GXUserControl();
      imgPrompt_inprocod_gximage = "" ;
      sImgUrl = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.dislin____ww__default(),
         new Object[] {
             new Object[] {
            H02932_A396EmprCod, H02932_A361DisCod, H02932_A759ProDsc, H02932_A758ProCod
            }
            , new Object[] {
            H02933_AGRID_nRecordCount
            }
         }
      );
      AV53Pgmname = "Pedidos.DisLin____WW" ;
      /* GeneXus formulas. */
      AV53Pgmname = "Pedidos.DisLin____WW" ;
      Gx_err = (short)(0) ;
      edtavDisfec_Enabled = 0 ;
      edtavClicod_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavDisartcod_Enabled = 0 ;
      edtavDisartdsc_Enabled = 0 ;
      cmbavDisest.setEnabled( 0 );
      edtavInoutprodsc_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      imgPrompt_inprocod_Link = "javascript:"+"gx.popup.openPrompt('"+"app.ficherosbasicos.tprocesprompt"+"',["+"{Ctrl:gx.dom.el('"+"EMPRCOD"+"'), id:'"+"EMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vINPROCOD"+"'), id:'"+"vINPROCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vINOUTPRODSC"+"'), id:'"+"vINOUTPRODSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      imgPrompt_inprocod_Link = "javascript:"+"gx.popup.openPrompt('"+"app.ficherosbasicos.tprocesprompt"+"',["+"{Ctrl:gx.dom.el('"+"EMPRCOD"+"'), id:'"+"EMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vINPROCOD"+"'), id:'"+"vINPROCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vINOUTPRODSC"+"'), id:'"+"vINOUTPRODSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
   }

   private byte wcpOAV21DisEst ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV21DisEst ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV49flag ;
   private byte GXv_int8[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV14OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV34GridActionGroup1 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOA361DisCod ;
   private int wcpOAV17CliCod ;
   private int subGrid_Rows ;
   private int nRC_GXsfl_92 ;
   private int A361DisCod ;
   private int AV17CliCod ;
   private int nGXsfl_92_idx=1 ;
   private int AV46DisCod_Selected ;
   private int AV44Anterior_Discod ;
   private int edtDisCod_Enabled ;
   private int edtavDisfec_Enabled ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavDisartcod_Enabled ;
   private int edtavDisartdsc_Enabled ;
   private int edtavInoutprodsc_Enabled ;
   private int bttBtnenter_Visible ;
   private int divUnnamedtable2_Height ;
   private int edtavPgmname_Enabled ;
   private int edtEmprCod_Visible ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int edtavInprocod_Visible ;
   private int GXt_int9 ;
   private int AV36tmp_DisCod ;
   private int GXv_int10[] ;
   private int AV58GXV1 ;
   private int edtavInprocod_Enabled ;
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
   private String wcpOA396EmprCod ;
   private String wcpOAV18CliNom ;
   private String wcpOAV19DisArtCod ;
   private String wcpOAV20DisArtDsc ;
   private String wcpOAV42DisUnimed ;
   private String wcpOAV43Cod_Idtx ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String Dvelop_confirmpanel_enter_Result ;
   private String Dvelop_confirmpanel_copiarprocesospedidoanterior_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV18CliNom ;
   private String AV19DisArtCod ;
   private String AV20DisArtDsc ;
   private String AV42DisUnimed ;
   private String AV43Cod_Idtx ;
   private String sGXsfl_92_idx="0001" ;
   private String AV23TFProCod ;
   private String AV24TFProCod_Sel ;
   private String AV25TFProDsc ;
   private String AV26TFProDsc_Sel ;
   private String AV53Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV45EmprCod_Selected ;
   private String AV47ProCod_Selected ;
   private String Dvpanel_tablepedido_Width ;
   private String Dvpanel_tablepedido_Cls ;
   private String Dvpanel_tablepedido_Title ;
   private String Dvpanel_tablepedido_Iconposition ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Filteredtext_set ;
   private String Ddo_grid_Selectedvalue_set ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
   private String Dvelop_confirmpanel_eliminar_Title ;
   private String Dvelop_confirmpanel_eliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminar_Confirmtype ;
   private String Dvelop_confirmpanel_enter_Title ;
   private String Dvelop_confirmpanel_enter_Confirmationtext ;
   private String Dvelop_confirmpanel_enter_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Nobuttoncaption ;
   private String Dvelop_confirmpanel_enter_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Yesbuttonposition ;
   private String Dvelop_confirmpanel_enter_Confirmtype ;
   private String Dvelop_confirmpanel_copiarprocesospedidoanterior_Title ;
   private String Dvelop_confirmpanel_copiarprocesospedidoanterior_Confirmationtext ;
   private String Dvelop_confirmpanel_copiarprocesospedidoanterior_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_copiarprocesospedidoanterior_Nobuttoncaption ;
   private String Dvelop_confirmpanel_copiarprocesospedidoanterior_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_copiarprocesospedidoanterior_Yesbuttonposition ;
   private String Dvelop_confirmpanel_copiarprocesospedidoanterior_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divDvpanel_tablepedido_cell_Internalname ;
   private String divDvpanel_tablepedido_cell_Class ;
   private String Dvpanel_tablepedido_Internalname ;
   private String divTablepedido_Internalname ;
   private String divUnnamedtable5_Internalname ;
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
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String divTablesplittedinprocod_Internalname ;
   private String lblTextblockinprocod_Internalname ;
   private String lblTextblockinprocod_Jsonclick ;
   private String edtavInoutprodsc_Internalname ;
   private String TempTags ;
   private String AV48InOutProDsc ;
   private String edtavInoutprodsc_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncopiarprocesospedidoanterior_Internalname ;
   private String bttBtncopiarprocesospedidoanterior_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV54Pedidos_dislin____wwds_1_tfprocod ;
   private String AV55Pedidos_dislin____wwds_2_tfprocod_sel ;
   private String AV56Pedidos_dislin____wwds_3_tfprodsc ;
   private String AV57Pedidos_dislin____wwds_4_tfprodsc_sel ;
   private String A758ProCod ;
   private String edtProCod_Internalname ;
   private String A759ProDsc ;
   private String edtProDsc_Internalname ;
   private String edtavInprocod_Internalname ;
   private String imgPrompt_inprocod_Link ;
   private String imgPrompt_inprocod_Internalname ;
   private String scmdbuf ;
   private String lV54Pedidos_dislin____wwds_1_tfprocod ;
   private String lV56Pedidos_dislin____wwds_3_tfprodsc ;
   private String AV31InProCod ;
   private String hsh ;
   private String AV39Station ;
   private String AV38EmprCod ;
   private String GXv_char2[] ;
   private String AV40EmprNom ;
   private String AV41UsurCod ;
   private String AV50Proact ;
   private String Dvelop_confirmpanel_copiarprocesospedidoanterior_Internalname ;
   private String AV35tmp_EmprCod ;
   private String AV37tmp_ProCod ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String GXt_char11 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String tblTabledvelop_confirmpanel_copiarprocesospedidoanterior_Internalname ;
   private String tblTabledvelop_confirmpanel_enter_Internalname ;
   private String Dvelop_confirmpanel_enter_Internalname ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String tblTablemergedinprocod_Internalname ;
   private String edtavInprocod_Jsonclick ;
   private String imgPrompt_inprocod_gximage ;
   private String sImgUrl ;
   private String sGXsfl_92_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtProCod_Jsonclick ;
   private String edtProDsc_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV16DisFec ;
   private java.util.Date AV16DisFec ;
   private boolean wcpOAV5VisualizarAcciones ;
   private boolean wcpOAV6AccionesEnPopup ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV5VisualizarAcciones ;
   private boolean AV6AccionesEnPopup ;
   private boolean AV15OrderedDsc ;
   private boolean Dvpanel_tablepedido_Autowidth ;
   private boolean Dvpanel_tablepedido_Autoheight ;
   private boolean Dvpanel_tablepedido_Collapsible ;
   private boolean Dvpanel_tablepedido_Collapsed ;
   private boolean Dvpanel_tablepedido_Showcollapseicon ;
   private boolean Dvpanel_tablepedido_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_92_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV9HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tablepedido ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_copiarprocesospedidoanterior ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_enter ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavDisest ;
   private HTMLChoice cmbavGridactiongroup1 ;
   private IDataStoreProvider pr_default ;
   private String[] H02932_A396EmprCod ;
   private int[] H02932_A361DisCod ;
   private String[] H02932_A759ProDsc ;
   private String[] H02932_A758ProCod ;
   private long[] H02933_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV8WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV10TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV12GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState12[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV13GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV27DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class dislin____ww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02932( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Pedidos_dislin____wwds_2_tfprocod_sel ,
                                          String AV54Pedidos_dislin____wwds_1_tfprocod ,
                                          String AV57Pedidos_dislin____wwds_4_tfprodsc_sel ,
                                          String AV56Pedidos_dislin____wwds_3_tfprodsc ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          short AV14OrderedBy ,
                                          boolean AV15OrderedDsc ,
                                          String A396EmprCod ,
                                          int A361DisCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[11];
      Object[] GXv_Object14 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.DisCod, T2.ProDsc, T1.ProCod" ;
      sFromString = " FROM (TXPDISLIN T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.DisCod = ?)");
      if ( (GXutil.strcmp("", AV55Pedidos_dislin____wwds_2_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV54Pedidos_dislin____wwds_1_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Pedidos_dislin____wwds_2_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int13[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Pedidos_dislin____wwds_4_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Pedidos_dislin____wwds_3_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Pedidos_dislin____wwds_4_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProDsc = ?)");
      }
      else
      {
         GXv_int13[5] = (byte)(1) ;
      }
      if ( ( AV14OrderedBy == 1 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProCod" ;
      }
      else if ( ( AV14OrderedBy == 1 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProCod DESC" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY T2.ProDsc" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.ProDsc DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
   }

   protected Object[] conditional_H02933( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Pedidos_dislin____wwds_2_tfprocod_sel ,
                                          String AV54Pedidos_dislin____wwds_1_tfprocod ,
                                          String AV57Pedidos_dislin____wwds_4_tfprodsc_sel ,
                                          String AV56Pedidos_dislin____wwds_3_tfprodsc ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          short AV14OrderedBy ,
                                          boolean AV15OrderedDsc ,
                                          String A396EmprCod ,
                                          int A361DisCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[6];
      Object[] GXv_Object16 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPDISLIN T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.DisCod = ?)");
      if ( (GXutil.strcmp("", AV55Pedidos_dislin____wwds_2_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV54Pedidos_dislin____wwds_1_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Pedidos_dislin____wwds_2_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int15[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Pedidos_dislin____wwds_4_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Pedidos_dislin____wwds_3_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Pedidos_dislin____wwds_4_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProDsc = ?)");
      }
      else
      {
         GXv_int15[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV14OrderedBy == 1 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 1 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ( AV15OrderedDsc ) )
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
                  return conditional_H02932(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Boolean) dynConstraints[7]).booleanValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() );
            case 1 :
                  return conditional_H02933(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Boolean) dynConstraints[7]).booleanValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02932", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02933", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
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
                  stmt.setString(sIdx, (String)parms[11], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 40);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 40);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 40);
               }
               return;
      }
   }

}

