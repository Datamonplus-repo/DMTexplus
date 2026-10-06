package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class cambiocolorenhdragrupada_impl extends GXDataArea
{
   public cambiocolorenhdragrupada_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public cambiocolorenhdragrupada_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cambiocolorenhdragrupada_impl.class ));
   }

   public cambiocolorenhdragrupada_impl( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
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
            AV6EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV9BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCod), 8, 0));
               AV8BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodReo", GXutil.str( AV8BarCodReo, 1, 0));
               AV7BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodPar", AV7BarCodPar);
               AV10CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10CliCod), 6, 0));
               AV11BarSer = httpContext.GetPar( "BarSer") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11BarSer", AV11BarSer);
               AV12BarColNom = httpContext.GetPar( "BarColNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12BarColNom", AV12BarColNom);
               AV13BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarColNum), 6, 0));
               AV14BarTipCol = (byte)(GXutil.lval( httpContext.GetPar( "BarTipCol"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarTipCol), 2, 0));
               AV15BarNomCli = httpContext.GetPar( "BarNomCli") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15BarNomCli", AV15BarNomCli);
               AV5BarNumCli = (int)(GXutil.lval( httpContext.GetPar( "BarNumCli"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarNumCli), 6, 0));
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
      nRC_GXsfl_77 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_77"))) ;
      nGXsfl_77_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_77_idx"))) ;
      sGXsfl_77_idx = httpContext.GetPar( "sGXsfl_77_idx") ;
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
      AV6EmprCod = httpContext.GetPar( "EmprCod") ;
      AV9BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV8BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV7BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV30TFBarAgrNhdr = httpContext.GetPar( "TFBarAgrNhdr") ;
      AV31TFBarAgrNhdr_Sel = httpContext.GetPar( "TFBarAgrNhdr_Sel") ;
      AV32TFBarAgrSer = httpContext.GetPar( "TFBarAgrSer") ;
      AV33TFBarAgrSer_Sel = httpContext.GetPar( "TFBarAgrSer_Sel") ;
      AV34TFColNomAgr = httpContext.GetPar( "TFColNomAgr") ;
      AV35TFColNomAgr_Sel = httpContext.GetPar( "TFColNomAgr_Sel") ;
      AV36TFColNumAgr = (int)(GXutil.lval( httpContext.GetPar( "TFColNumAgr"))) ;
      AV37TFColNumAgr_To = (int)(GXutil.lval( httpContext.GetPar( "TFColNumAgr_To"))) ;
      AV48Pgmname = httpContext.GetPar( "Pgmname") ;
      AV23OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV24OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV45FlagCorE = (short)(GXutil.lval( httpContext.GetPar( "FlagCorE"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV6EmprCod, AV9BarCod, AV8BarCodReo, AV7BarCodPar, AV30TFBarAgrNhdr, AV31TFBarAgrNhdr_Sel, AV32TFBarAgrSer, AV33TFBarAgrSer_Sel, AV34TFColNomAgr, AV35TFColNomAgr_Sel, AV36TFColNumAgr, AV37TFColNumAgr_To, AV48Pgmname, AV23OrderedBy, AV24OrderedDsc, AV45FlagCorE) ;
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
      pa28D2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start28D2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.gestionlaboratorio.cambiocolorenhdragrupada", new String[] {GXutil.URLEncode(GXutil.rtrim(AV6EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV7BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV10CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV11BarSer)),GXutil.URLEncode(GXutil.rtrim(AV12BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV13BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14BarTipCol,2,0)),GXutil.URLEncode(GXutil.rtrim(AV15BarNomCli)),GXutil.URLEncode(GXutil.ltrimstr(AV5BarNumCli,6,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","CliCod","BarSer","BarColNom","BarColNum","BarTipCol","BarNomCli","BarNumCli"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGCORE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV45FlagCorE), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"CambioColorenHdrAgrupada");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV48Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\cambiocolorenhdragrupada:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_77", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_77, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV38DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV38DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARAGRNHDR", GXutil.rtrim( AV30TFBarAgrNhdr));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARAGRNHDR_SEL", GXutil.rtrim( AV31TFBarAgrNhdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARAGRSER", GXutil.rtrim( AV32TFBarAgrSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARAGRSER_SEL", GXutil.rtrim( AV33TFBarAgrSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCOLNOMAGR", GXutil.rtrim( AV34TFColNomAgr));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCOLNOMAGR_SEL", GXutil.rtrim( AV35TFColNomAgr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCOLNUMAGR", GXutil.ltrim( localUtil.ntoc( AV36TFColNumAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCOLNUMAGR_TO", GXutil.ltrim( localUtil.ntoc( AV37TFColNumAgr_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV23OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV24OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV6EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCORE", GXutil.ltrim( localUtil.ntoc( AV45FlagCorE, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGCORE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV45FlagCorE), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFORME_Title", GXutil.rtrim( Dvelop_confirmpanel_conforme_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFORME_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_conforme_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFORME_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_conforme_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFORME_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_conforme_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFORME_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_conforme_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFORME_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_conforme_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFORME_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_conforme_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFORME_Result", GXutil.rtrim( Dvelop_confirmpanel_conforme_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFORME_Result", GXutil.rtrim( Dvelop_confirmpanel_conforme_Result));
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
         we28D2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt28D2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return false ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.gestionlaboratorio.cambiocolorenhdragrupada", new String[] {GXutil.URLEncode(GXutil.rtrim(AV6EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV7BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV10CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV11BarSer)),GXutil.URLEncode(GXutil.rtrim(AV12BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV13BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14BarTipCol,2,0)),GXutil.URLEncode(GXutil.rtrim(AV15BarNomCli)),GXutil.URLEncode(GXutil.ltrimstr(AV5BarNumCli,6,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","CliCod","BarSer","BarColNom","BarColNum","BarTipCol","BarNomCli","BarNumCli"})  ;
   }

   public String getPgmname( )
   {
      return "GestionLaboratorio.CambioColorenHdrAgrupada" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Cambio de Color en Hdrs Agrupadas", "") ;
   }

   public void wb28D0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "Nº Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV9BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV9BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV9BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\CambioColorenHdrAgrupada.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV8BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV8BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV8BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\CambioColorenHdrAgrupada.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodpar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV7BarCodPar), GXutil.rtrim( localUtil.format( AV7BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\CambioColorenHdrAgrupada.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV10CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV10CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV10CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\CambioColorenHdrAgrupada.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarser_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarser_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV11BarSer), GXutil.rtrim( localUtil.format( AV11BarSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\CambioColorenHdrAgrupada.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV12BarColNom), GXutil.rtrim( localUtil.format( AV12BarColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\CambioColorenHdrAgrupada.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnum_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV13BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV13BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV13BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\CambioColorenHdrAgrupada.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBartipcol_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBartipcol_Internalname, httpContext.getMessage( "TC", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBartipcol_Internalname, GXutil.ltrim( localUtil.ntoc( AV14BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBartipcol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV14BarTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV14BarTipCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBartipcol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBartipcol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\CambioColorenHdrAgrupada.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnomcli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnomcli_Internalname, httpContext.getMessage( "Color Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnomcli_Internalname, GXutil.rtrim( AV15BarNomCli), GXutil.rtrim( localUtil.format( AV15BarNomCli, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnomcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnomcli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\CambioColorenHdrAgrupada.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnumcli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnumcli_Internalname, httpContext.getMessage( "Numero ", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnumcli_Internalname, GXutil.ltrim( localUtil.ntoc( AV5BarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarnumcli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV5BarNumCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV5BarNumCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnumcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnumcli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\CambioColorenHdrAgrupada.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconforme_Internalname, "gx.evt.setGridEvt("+GXutil.str( 77, 2, 0)+","+"null"+");", httpContext.getMessage( "Conforme", ""), bttBtnconforme_Jsonclick, 7, httpContext.getMessage( "Conforme", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1128d1_client"+"'", TempTags, "", 2, "HLP_GestionLaboratorio\\CambioColorenHdrAgrupada.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 77, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\CambioColorenHdrAgrupada.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-xs", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol77( ) ;
      }
      if ( wbEnd == 77 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_77 = (int)(nGXsfl_77_idx-1) ;
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV48Pgmname), GXutil.rtrim( localUtil.format( AV48Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\CambioColorenHdrAgrupada.htm");
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
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV38DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table1_99_28D2( true) ;
      }
      else
      {
         wb_table1_99_28D2( false) ;
      }
      return  ;
   }

   public void wb_table1_99_28D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 77 )
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

   public void start28D2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Cambio de Color en Hdrs Agrupadas", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup28D0( ) ;
   }

   public void ws28D2( )
   {
      start28D2( ) ;
      evt28D2( ) ;
   }

   public void evt28D2( )
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
                           e1228D2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFORME.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1328D2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e1428D2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           AV49Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr = AV30TFBarAgrNhdr ;
                           AV50Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel = AV31TFBarAgrNhdr_Sel ;
                           AV51Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser = AV32TFBarAgrSer ;
                           AV52Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel = AV33TFBarAgrSer_Sel ;
                           AV53Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr = AV34TFColNomAgr ;
                           AV54Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel = AV35TFColNomAgr_Sel ;
                           AV55Gestionlaboratorio_cambiocolorenhdragrupadads_7_tfcolnumagr = AV36TFColNumAgr ;
                           AV56Gestionlaboratorio_cambiocolorenhdragrupadads_8_tfcolnumagr_to = AV37TFColNumAgr_To ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_77_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_77_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_77_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_772( ) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A13792BarAgrNhdr = httpContext.cgiGet( edtBarAgrNhdr_Internalname) ;
                           A119BarAgrCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAgrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A124BarAgrReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarAgrReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A122BarAgrPar = httpContext.cgiGet( edtBarAgrPar_Internalname) ;
                           A1245BarAgrSer = httpContext.cgiGet( edtBarAgrSer_Internalname) ;
                           A1510ColNomAgr = httpContext.cgiGet( edtColNomAgr_Internalname) ;
                           A1512ColNumAgr = (int)(localUtil.ctol( httpContext.cgiGet( edtColNumAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e1528D2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e1628D2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e1728D2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    if ( ! Rfr0gs )
                                    {
                                    }
                                    dynload_actions( ) ;
                                 }
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

   public void we28D2( )
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

   public void pa28D2( )
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
      subsflControlProps_772( ) ;
      while ( nGXsfl_77_idx <= nRC_GXsfl_77 )
      {
         sendrow_772( ) ;
         nGXsfl_77_idx = ((subGrid_Islastpage==1)&&(nGXsfl_77_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_77_idx+1) ;
         sGXsfl_77_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_77_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_772( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV6EmprCod ,
                                 int AV9BarCod ,
                                 byte AV8BarCodReo ,
                                 String AV7BarCodPar ,
                                 String AV30TFBarAgrNhdr ,
                                 String AV31TFBarAgrNhdr_Sel ,
                                 String AV32TFBarAgrSer ,
                                 String AV33TFBarAgrSer_Sel ,
                                 String AV34TFColNomAgr ,
                                 String AV35TFColNomAgr_Sel ,
                                 int AV36TFColNumAgr ,
                                 int AV37TFColNumAgr_To ,
                                 String AV48Pgmname ,
                                 short AV23OrderedBy ,
                                 boolean AV24OrderedDsc ,
                                 short AV45FlagCorE )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1628D2 ();
      GRID_nCurrentRecord = 0 ;
      rf28D2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"CambioColorenHdrAgrupada");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV48Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\cambiocolorenhdragrupada:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      GRID_nFirstRecordOnPage = 0 ;
      GRID_nCurrentRecord = 0 ;
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_77_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf28D2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV48Pgmname = "GestionLaboratorio.CambioColorenHdrAgrupada" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Pgmname", AV48Pgmname);
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), true);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), true);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavBartipcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartipcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartipcol_Enabled), 5, 0), true);
      edtavBarnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnomcli_Enabled), 5, 0), true);
      edtavBarnumcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnumcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnumcli_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf28D2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(77) ;
      /* Execute user event: Refresh */
      e1628D2 ();
      nGXsfl_77_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_77_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_77_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_772( ) ;
      bGXsfl_77_Refreshing = true ;
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
         subsflControlProps_772( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV50Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel ,
                                              AV49Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr ,
                                              AV52Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel ,
                                              AV51Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser ,
                                              AV54Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel ,
                                              AV53Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr ,
                                              Integer.valueOf(AV55Gestionlaboratorio_cambiocolorenhdragrupadads_7_tfcolnumagr) ,
                                              Integer.valueOf(AV56Gestionlaboratorio_cambiocolorenhdragrupadads_8_tfcolnumagr_to) ,
                                              Integer.valueOf(A119BarAgrCod) ,
                                              Byte.valueOf(A124BarAgrReo) ,
                                              A122BarAgrPar ,
                                              A1245BarAgrSer ,
                                              A1510ColNomAgr ,
                                              Integer.valueOf(A1512ColNumAgr) ,
                                              Short.valueOf(AV23OrderedBy) ,
                                              Boolean.valueOf(AV24OrderedDsc) ,
                                              AV6EmprCod ,
                                              Integer.valueOf(AV9BarCod) ,
                                              Byte.valueOf(AV8BarCodReo) ,
                                              AV7BarCodPar ,
                                              A396EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         lV49Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr = GXutil.padr( GXutil.rtrim( AV49Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr), 11, "%") ;
         lV51Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser = GXutil.padr( GXutil.rtrim( AV51Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser), 16, "%") ;
         lV53Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr = GXutil.padr( GXutil.rtrim( AV53Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr), 13, "%") ;
         /* Using cursor H028D2 */
         pr_default.execute(0, new Object[] {AV6EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV8BarCodReo), AV7BarCodPar, lV49Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr, AV50Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel, lV51Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser, AV52Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel, lV53Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr, AV54Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel, Integer.valueOf(AV55Gestionlaboratorio_cambiocolorenhdragrupadads_7_tfcolnumagr), Integer.valueOf(AV56Gestionlaboratorio_cambiocolorenhdragrupadads_8_tfcolnumagr_to), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_77_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_77_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_77_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_772( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H028D2_A396EmprCod[0] ;
            A1512ColNumAgr = H028D2_A1512ColNumAgr[0] ;
            A1510ColNomAgr = H028D2_A1510ColNomAgr[0] ;
            A1245BarAgrSer = H028D2_A1245BarAgrSer[0] ;
            A130BarCodPar = H028D2_A130BarCodPar[0] ;
            A132BarCodReo = H028D2_A132BarCodReo[0] ;
            A129BarCod = H028D2_A129BarCod[0] ;
            A122BarAgrPar = H028D2_A122BarAgrPar[0] ;
            A124BarAgrReo = H028D2_A124BarAgrReo[0] ;
            A119BarAgrCod = H028D2_A119BarAgrCod[0] ;
            A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
            e1728D2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(77) ;
         wb28D0( ) ;
      }
      bGXsfl_77_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes28D2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCORE", GXutil.ltrim( localUtil.ntoc( AV45FlagCorE, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGCORE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV45FlagCorE), "ZZZ9")));
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
      AV49Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr = AV30TFBarAgrNhdr ;
      AV50Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel = AV31TFBarAgrNhdr_Sel ;
      AV51Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser = AV32TFBarAgrSer ;
      AV52Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel = AV33TFBarAgrSer_Sel ;
      AV53Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr = AV34TFColNomAgr ;
      AV54Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel = AV35TFColNomAgr_Sel ;
      AV55Gestionlaboratorio_cambiocolorenhdragrupadads_7_tfcolnumagr = AV36TFColNumAgr ;
      AV56Gestionlaboratorio_cambiocolorenhdragrupadads_8_tfcolnumagr_to = AV37TFColNumAgr_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV50Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel ,
                                           AV49Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr ,
                                           AV52Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel ,
                                           AV51Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser ,
                                           AV54Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel ,
                                           AV53Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr ,
                                           Integer.valueOf(AV55Gestionlaboratorio_cambiocolorenhdragrupadads_7_tfcolnumagr) ,
                                           Integer.valueOf(AV56Gestionlaboratorio_cambiocolorenhdragrupadads_8_tfcolnumagr_to) ,
                                           Integer.valueOf(A119BarAgrCod) ,
                                           Byte.valueOf(A124BarAgrReo) ,
                                           A122BarAgrPar ,
                                           A1245BarAgrSer ,
                                           A1510ColNomAgr ,
                                           Integer.valueOf(A1512ColNumAgr) ,
                                           Short.valueOf(AV23OrderedBy) ,
                                           Boolean.valueOf(AV24OrderedDsc) ,
                                           AV6EmprCod ,
                                           Integer.valueOf(AV9BarCod) ,
                                           Byte.valueOf(AV8BarCodReo) ,
                                           AV7BarCodPar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV49Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr = GXutil.padr( GXutil.rtrim( AV49Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr), 11, "%") ;
      lV51Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser = GXutil.padr( GXutil.rtrim( AV51Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser), 16, "%") ;
      lV53Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr = GXutil.padr( GXutil.rtrim( AV53Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr), 13, "%") ;
      /* Using cursor H028D3 */
      pr_default.execute(1, new Object[] {AV6EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV8BarCodReo), AV7BarCodPar, lV49Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr, AV50Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel, lV51Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser, AV52Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel, lV53Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr, AV54Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel, Integer.valueOf(AV55Gestionlaboratorio_cambiocolorenhdragrupadads_7_tfcolnumagr), Integer.valueOf(AV56Gestionlaboratorio_cambiocolorenhdragrupadads_8_tfcolnumagr_to)});
      GRID_nRecordCount = H028D3_AGRID_nRecordCount[0] ;
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
      AV49Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr = AV30TFBarAgrNhdr ;
      AV50Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel = AV31TFBarAgrNhdr_Sel ;
      AV51Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser = AV32TFBarAgrSer ;
      AV52Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel = AV33TFBarAgrSer_Sel ;
      AV53Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr = AV34TFColNomAgr ;
      AV54Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel = AV35TFColNomAgr_Sel ;
      AV55Gestionlaboratorio_cambiocolorenhdragrupadads_7_tfcolnumagr = AV36TFColNumAgr ;
      AV56Gestionlaboratorio_cambiocolorenhdragrupadads_8_tfcolnumagr_to = AV37TFColNumAgr_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV6EmprCod, AV9BarCod, AV8BarCodReo, AV7BarCodPar, AV30TFBarAgrNhdr, AV31TFBarAgrNhdr_Sel, AV32TFBarAgrSer, AV33TFBarAgrSer_Sel, AV34TFColNomAgr, AV35TFColNomAgr_Sel, AV36TFColNumAgr, AV37TFColNumAgr_To, AV48Pgmname, AV23OrderedBy, AV24OrderedDsc, AV45FlagCorE) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV49Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr = AV30TFBarAgrNhdr ;
      AV50Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel = AV31TFBarAgrNhdr_Sel ;
      AV51Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser = AV32TFBarAgrSer ;
      AV52Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel = AV33TFBarAgrSer_Sel ;
      AV53Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr = AV34TFColNomAgr ;
      AV54Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel = AV35TFColNomAgr_Sel ;
      AV55Gestionlaboratorio_cambiocolorenhdragrupadads_7_tfcolnumagr = AV36TFColNumAgr ;
      AV56Gestionlaboratorio_cambiocolorenhdragrupadads_8_tfcolnumagr_to = AV37TFColNumAgr_To ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV6EmprCod, AV9BarCod, AV8BarCodReo, AV7BarCodPar, AV30TFBarAgrNhdr, AV31TFBarAgrNhdr_Sel, AV32TFBarAgrSer, AV33TFBarAgrSer_Sel, AV34TFColNomAgr, AV35TFColNomAgr_Sel, AV36TFColNumAgr, AV37TFColNumAgr_To, AV48Pgmname, AV23OrderedBy, AV24OrderedDsc, AV45FlagCorE) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV49Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr = AV30TFBarAgrNhdr ;
      AV50Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel = AV31TFBarAgrNhdr_Sel ;
      AV51Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser = AV32TFBarAgrSer ;
      AV52Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel = AV33TFBarAgrSer_Sel ;
      AV53Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr = AV34TFColNomAgr ;
      AV54Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel = AV35TFColNomAgr_Sel ;
      AV55Gestionlaboratorio_cambiocolorenhdragrupadads_7_tfcolnumagr = AV36TFColNumAgr ;
      AV56Gestionlaboratorio_cambiocolorenhdragrupadads_8_tfcolnumagr_to = AV37TFColNumAgr_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV6EmprCod, AV9BarCod, AV8BarCodReo, AV7BarCodPar, AV30TFBarAgrNhdr, AV31TFBarAgrNhdr_Sel, AV32TFBarAgrSer, AV33TFBarAgrSer_Sel, AV34TFColNomAgr, AV35TFColNomAgr_Sel, AV36TFColNumAgr, AV37TFColNumAgr_To, AV48Pgmname, AV23OrderedBy, AV24OrderedDsc, AV45FlagCorE) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV49Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr = AV30TFBarAgrNhdr ;
      AV50Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel = AV31TFBarAgrNhdr_Sel ;
      AV51Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser = AV32TFBarAgrSer ;
      AV52Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel = AV33TFBarAgrSer_Sel ;
      AV53Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr = AV34TFColNomAgr ;
      AV54Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel = AV35TFColNomAgr_Sel ;
      AV55Gestionlaboratorio_cambiocolorenhdragrupadads_7_tfcolnumagr = AV36TFColNumAgr ;
      AV56Gestionlaboratorio_cambiocolorenhdragrupadads_8_tfcolnumagr_to = AV37TFColNumAgr_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV6EmprCod, AV9BarCod, AV8BarCodReo, AV7BarCodPar, AV30TFBarAgrNhdr, AV31TFBarAgrNhdr_Sel, AV32TFBarAgrSer, AV33TFBarAgrSer_Sel, AV34TFColNomAgr, AV35TFColNomAgr_Sel, AV36TFColNumAgr, AV37TFColNumAgr_To, AV48Pgmname, AV23OrderedBy, AV24OrderedDsc, AV45FlagCorE) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV49Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr = AV30TFBarAgrNhdr ;
      AV50Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel = AV31TFBarAgrNhdr_Sel ;
      AV51Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser = AV32TFBarAgrSer ;
      AV52Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel = AV33TFBarAgrSer_Sel ;
      AV53Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr = AV34TFColNomAgr ;
      AV54Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel = AV35TFColNomAgr_Sel ;
      AV55Gestionlaboratorio_cambiocolorenhdragrupadads_7_tfcolnumagr = AV36TFColNumAgr ;
      AV56Gestionlaboratorio_cambiocolorenhdragrupadads_8_tfcolnumagr_to = AV37TFColNumAgr_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV6EmprCod, AV9BarCod, AV8BarCodReo, AV7BarCodPar, AV30TFBarAgrNhdr, AV31TFBarAgrNhdr_Sel, AV32TFBarAgrSer, AV33TFBarAgrSer_Sel, AV34TFColNomAgr, AV35TFColNomAgr_Sel, AV36TFColNumAgr, AV37TFColNumAgr_To, AV48Pgmname, AV23OrderedBy, AV24OrderedDsc, AV45FlagCorE) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV48Pgmname = "GestionLaboratorio.CambioColorenHdrAgrupada" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Pgmname", AV48Pgmname);
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), true);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), true);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavBartipcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartipcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartipcol_Enabled), 5, 0), true);
      edtavBarnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnomcli_Enabled), 5, 0), true);
      edtavBarnumcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnumcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnumcli_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup28D0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1528D2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV38DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_77 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_77"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Ddo_grid_Caption = httpContext.cgiGet( "DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( "DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( "DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( "DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( "DDO_GRID_Includesortasc") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( "DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( "DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( "DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Dvelop_confirmpanel_conforme_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFORME_Title") ;
         Dvelop_confirmpanel_conforme_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFORME_Confirmationtext") ;
         Dvelop_confirmpanel_conforme_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFORME_Yesbuttoncaption") ;
         Dvelop_confirmpanel_conforme_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFORME_Nobuttoncaption") ;
         Dvelop_confirmpanel_conforme_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFORME_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_conforme_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFORME_Yesbuttonposition") ;
         Dvelop_confirmpanel_conforme_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFORME_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( "GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Dvelop_confirmpanel_conforme_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFORME_Result") ;
         /* Read variables values. */
         AV9BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCod), 8, 0));
         AV8BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodReo", GXutil.str( AV8BarCodReo, 1, 0));
         AV7BarCodPar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodPar", AV7BarCodPar);
         AV10CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10CliCod), 6, 0));
         AV11BarSer = httpContext.cgiGet( edtavBarser_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11BarSer", AV11BarSer);
         AV12BarColNom = httpContext.cgiGet( edtavBarcolnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12BarColNom", AV12BarColNom);
         AV13BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarColNum), 6, 0));
         AV14BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBartipcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarTipCol), 2, 0));
         AV15BarNomCli = httpContext.cgiGet( edtavBarnomcli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15BarNomCli", AV15BarNomCli);
         AV5BarNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarnumcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarNumCli), 6, 0));
         AV48Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Pgmname", AV48Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"CambioColorenHdrAgrupada");
         AV48Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Pgmname", AV48Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV48Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("gestionlaboratorio\\cambiocolorenhdragrupada:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1528D2 ();
      if (returnInSub) return;
   }

   public void e1528D2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV42Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      cambiocolorenhdragrupada_impl.this.GXt_char1 = GXv_char2[0] ;
      AV42Station = GXt_char1 ;
      GXv_char2[0] = AV6EmprCod ;
      GXv_char3[0] = AV43EmprNom ;
      GXv_char4[0] = AV44UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV42Station, GXv_char2, GXv_char3, GXv_char4) ;
      cambiocolorenhdragrupada_impl.this.AV6EmprCod = GXv_char2[0] ;
      cambiocolorenhdragrupada_impl.this.AV43EmprNom = GXv_char3[0] ;
      cambiocolorenhdragrupada_impl.this.AV44UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
      subGrid_Rows = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Cambio de Color en Hdrs Agrupadas", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV23OrderedBy < 1 )
      {
         AV23OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV38DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV38DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      GXt_int7 = (byte)(AV45FlagCorE) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV6EmprCod, httpContext.getMessage( "NEWCOR", ""), GXv_int8) ;
      cambiocolorenhdragrupada_impl.this.GXt_int7 = GXv_int8[0] ;
      AV45FlagCorE = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45FlagCorE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45FlagCorE), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGCORE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV45FlagCorE), "ZZZ9")));
   }

   public void e1628D2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV17WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV17WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      AV49Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr = AV30TFBarAgrNhdr ;
      AV50Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel = AV31TFBarAgrNhdr_Sel ;
      AV51Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser = AV32TFBarAgrSer ;
      AV52Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel = AV33TFBarAgrSer_Sel ;
      AV53Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr = AV34TFColNomAgr ;
      AV54Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel = AV35TFColNomAgr_Sel ;
      AV55Gestionlaboratorio_cambiocolorenhdragrupadads_7_tfcolnumagr = AV36TFColNumAgr ;
      AV56Gestionlaboratorio_cambiocolorenhdragrupadads_8_tfcolnumagr_to = AV37TFColNumAgr_To ;
   }

   public void e1228D2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV23OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23OrderedBy), 4, 0));
         AV24OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24OrderedDsc", AV24OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAgrNhdr") == 0 )
         {
            AV30TFBarAgrNhdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFBarAgrNhdr", AV30TFBarAgrNhdr);
            AV31TFBarAgrNhdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFBarAgrNhdr_Sel", AV31TFBarAgrNhdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAgrSer") == 0 )
         {
            AV32TFBarAgrSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFBarAgrSer", AV32TFBarAgrSer);
            AV33TFBarAgrSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFBarAgrSer_Sel", AV33TFBarAgrSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ColNomAgr") == 0 )
         {
            AV34TFColNomAgr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFColNomAgr", AV34TFColNomAgr);
            AV35TFColNomAgr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFColNomAgr_Sel", AV35TFColNomAgr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ColNumAgr") == 0 )
         {
            AV36TFColNumAgr = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFColNumAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFColNumAgr), 6, 0));
            AV37TFColNumAgr_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFColNumAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFColNumAgr_To), 6, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e1728D2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(77) ;
      }
      sendrow_772( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_77_Refreshing )
      {
         httpContext.doAjaxLoad(77, GridRow);
      }
   }

   public void e1328D2( )
   {
      /* Dvelop_confirmpanel_conforme_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_conforme_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFORME' */
         S152 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e1428D2( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {AV6EmprCod,Integer.valueOf(AV9BarCod),Byte.valueOf(AV8BarCodReo),AV7BarCodPar,Integer.valueOf(AV10CliCod),AV11BarSer,AV12BarColNom,Integer.valueOf(AV13BarColNum),Byte.valueOf(AV14BarTipCol),AV15BarNomCli,Integer.valueOf(AV5BarNumCli)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV6EmprCod","AV9BarCod","AV8BarCodReo","AV7BarCodPar","AV10CliCod","AV11BarSer","AV12BarColNom","AV13BarColNum","AV14BarTipCol","AV15BarNomCli","AV5BarNumCli"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV23OrderedBy, 4, 0))+":"+(AV24OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'DO ACTION CONFORME' Routine */
      returnInSub = false ;
      /* Start For Each Line */
      nRC_GXsfl_77 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_77"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_77_fel_idx = 0 ;
      while ( nGXsfl_77_fel_idx < nRC_GXsfl_77 )
      {
         nGXsfl_77_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_77_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_77_fel_idx+1) ;
         sGXsfl_77_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_77_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_772( ) ;
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         A13792BarAgrNhdr = httpContext.cgiGet( edtBarAgrNhdr_Internalname) ;
         A119BarAgrCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAgrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A124BarAgrReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarAgrReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A122BarAgrPar = httpContext.cgiGet( edtBarAgrPar_Internalname) ;
         A1245BarAgrSer = httpContext.cgiGet( edtBarAgrSer_Internalname) ;
         A1510ColNomAgr = httpContext.cgiGet( edtColNomAgr_Internalname) ;
         A1512ColNumAgr = (int)(localUtil.ctol( httpContext.cgiGet( edtColNumAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GXv_char4[0] = AV6EmprCod ;
         GXv_int10[0] = A119BarAgrCod ;
         GXv_int8[0] = A124BarAgrReo ;
         GXv_char3[0] = A122BarAgrPar ;
         GXv_char2[0] = AV12BarColNom ;
         GXv_int11[0] = AV13BarColNum ;
         GXv_char12[0] = AV15BarNomCli ;
         GXv_int13[0] = AV5BarNumCli ;
         new app.pchgcola(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int8, GXv_char3, GXv_char2, GXv_int11, GXv_char12, GXv_int13) ;
         cambiocolorenhdragrupada_impl.this.AV6EmprCod = GXv_char4[0] ;
         cambiocolorenhdragrupada_impl.this.A119BarAgrCod = GXv_int10[0] ;
         cambiocolorenhdragrupada_impl.this.A124BarAgrReo = GXv_int8[0] ;
         cambiocolorenhdragrupada_impl.this.A122BarAgrPar = GXv_char3[0] ;
         cambiocolorenhdragrupada_impl.this.AV12BarColNom = GXv_char2[0] ;
         cambiocolorenhdragrupada_impl.this.AV13BarColNum = GXv_int11[0] ;
         cambiocolorenhdragrupada_impl.this.AV15BarNomCli = GXv_char12[0] ;
         cambiocolorenhdragrupada_impl.this.AV5BarNumCli = GXv_int13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV12BarColNom", AV12BarColNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV13BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarColNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV15BarNomCli", AV15BarNomCli);
         httpContext.ajax_rsp_assign_attri("", false, "AV5BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarNumCli), 6, 0));
         GXv_char12[0] = AV6EmprCod ;
         GXv_int13[0] = A119BarAgrCod ;
         GXv_int8[0] = A124BarAgrReo ;
         GXv_char4[0] = A122BarAgrPar ;
         GXv_char3[0] = AV11BarSer ;
         GXv_char2[0] = AV12BarColNom ;
         GXv_int11[0] = AV13BarColNum ;
         GXv_int14[0] = AV14BarTipCol ;
         GXv_char15[0] = AV15BarNomCli ;
         GXv_int10[0] = AV5BarNumCli ;
         new app.pnueco3(remoteHandle, context).execute( GXv_char12, GXv_int13, GXv_int8, GXv_char4, GXv_char3, GXv_char2, GXv_int11, GXv_int14, GXv_char15, GXv_int10) ;
         cambiocolorenhdragrupada_impl.this.AV6EmprCod = GXv_char12[0] ;
         cambiocolorenhdragrupada_impl.this.A119BarAgrCod = GXv_int13[0] ;
         cambiocolorenhdragrupada_impl.this.A124BarAgrReo = GXv_int8[0] ;
         cambiocolorenhdragrupada_impl.this.A122BarAgrPar = GXv_char4[0] ;
         cambiocolorenhdragrupada_impl.this.AV11BarSer = GXv_char3[0] ;
         cambiocolorenhdragrupada_impl.this.AV12BarColNom = GXv_char2[0] ;
         cambiocolorenhdragrupada_impl.this.AV13BarColNum = GXv_int11[0] ;
         cambiocolorenhdragrupada_impl.this.AV14BarTipCol = GXv_int14[0] ;
         cambiocolorenhdragrupada_impl.this.AV15BarNomCli = GXv_char15[0] ;
         cambiocolorenhdragrupada_impl.this.AV5BarNumCli = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV11BarSer", AV11BarSer);
         httpContext.ajax_rsp_assign_attri("", false, "AV12BarColNom", AV12BarColNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV13BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarColNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV14BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarTipCol), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV15BarNomCli", AV15BarNomCli);
         httpContext.ajax_rsp_assign_attri("", false, "AV5BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarNumCli), 6, 0));
         if ( AV45FlagCorE == 1 )
         {
            GXv_char15[0] = AV6EmprCod ;
            GXv_int13[0] = A119BarAgrCod ;
            GXv_int14[0] = A124BarAgrReo ;
            GXv_char12[0] = A122BarAgrPar ;
            GXv_int11[0] = AV10CliCod ;
            GXv_char4[0] = AV11BarSer ;
            GXv_char3[0] = AV12BarColNom ;
            GXv_int10[0] = AV13BarColNum ;
            GXv_int8[0] = AV14BarTipCol ;
            new app.pnewcor(remoteHandle, context).execute( GXv_char15, GXv_int13, GXv_int14, GXv_char12, GXv_int11, GXv_char4, GXv_char3, GXv_int10, GXv_int8) ;
            cambiocolorenhdragrupada_impl.this.AV6EmprCod = GXv_char15[0] ;
            cambiocolorenhdragrupada_impl.this.A119BarAgrCod = GXv_int13[0] ;
            cambiocolorenhdragrupada_impl.this.A124BarAgrReo = GXv_int14[0] ;
            cambiocolorenhdragrupada_impl.this.A122BarAgrPar = GXv_char12[0] ;
            cambiocolorenhdragrupada_impl.this.AV10CliCod = GXv_int11[0] ;
            cambiocolorenhdragrupada_impl.this.AV11BarSer = GXv_char4[0] ;
            cambiocolorenhdragrupada_impl.this.AV12BarColNom = GXv_char3[0] ;
            cambiocolorenhdragrupada_impl.this.AV13BarColNum = GXv_int10[0] ;
            cambiocolorenhdragrupada_impl.this.AV14BarTipCol = GXv_int8[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV10CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10CliCod), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV11BarSer", AV11BarSer);
            httpContext.ajax_rsp_assign_attri("", false, "AV12BarColNom", AV12BarColNom);
            httpContext.ajax_rsp_assign_attri("", false, "AV13BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarColNum), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV14BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarTipCol), 2, 0));
         }
         /* End For Each Line */
      }
      if ( nGXsfl_77_fel_idx == 0 )
      {
         nGXsfl_77_idx = 1 ;
         sGXsfl_77_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_77_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_772( ) ;
      }
      nGXsfl_77_fel_idx = 1 ;
      GXv_char15[0] = AV6EmprCod ;
      GXv_int13[0] = AV9BarCod ;
      GXv_int14[0] = AV8BarCodReo ;
      GXv_char12[0] = AV7BarCodPar ;
      GXv_char4[0] = AV12BarColNom ;
      GXv_int11[0] = AV13BarColNum ;
      GXv_char3[0] = AV15BarNomCli ;
      GXv_int10[0] = AV5BarNumCli ;
      new app.pchgcola(remoteHandle, context).execute( GXv_char15, GXv_int13, GXv_int14, GXv_char12, GXv_char4, GXv_int11, GXv_char3, GXv_int10) ;
      cambiocolorenhdragrupada_impl.this.AV6EmprCod = GXv_char15[0] ;
      cambiocolorenhdragrupada_impl.this.AV9BarCod = GXv_int13[0] ;
      cambiocolorenhdragrupada_impl.this.AV8BarCodReo = GXv_int14[0] ;
      cambiocolorenhdragrupada_impl.this.AV7BarCodPar = GXv_char12[0] ;
      cambiocolorenhdragrupada_impl.this.AV12BarColNom = GXv_char4[0] ;
      cambiocolorenhdragrupada_impl.this.AV13BarColNum = GXv_int11[0] ;
      cambiocolorenhdragrupada_impl.this.AV15BarNomCli = GXv_char3[0] ;
      cambiocolorenhdragrupada_impl.this.AV5BarNumCli = GXv_int10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV9BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodReo", GXutil.str( AV8BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodPar", AV7BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "AV12BarColNom", AV12BarColNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV13BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarColNum), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV15BarNomCli", AV15BarNomCli);
      httpContext.ajax_rsp_assign_attri("", false, "AV5BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarNumCli), 6, 0));
      httpContext.setWebReturnParms(new Object[] {AV6EmprCod,Integer.valueOf(AV9BarCod),Byte.valueOf(AV8BarCodReo),AV7BarCodPar,Integer.valueOf(AV10CliCod),AV11BarSer,AV12BarColNom,Integer.valueOf(AV13BarColNum),Byte.valueOf(AV14BarTipCol),AV15BarNomCli,Integer.valueOf(AV5BarNumCli)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV6EmprCod","AV9BarCod","AV8BarCodReo","AV7BarCodPar","AV10CliCod","AV11BarSer","AV12BarColNom","AV13BarColNum","AV14BarTipCol","AV15BarNomCli","AV5BarNumCli"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV26Session.getValue(AV48Pgmname+"GridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV48Pgmname+"GridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV26Session.getValue(AV48Pgmname+"GridState"), null, null);
      }
      AV23OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23OrderedBy), 4, 0));
      AV24OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24OrderedDsc", AV24OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV58GXV1 = 1 ;
      while ( AV58GXV1 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV58GXV1));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRNHDR") == 0 )
         {
            AV30TFBarAgrNhdr = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFBarAgrNhdr", AV30TFBarAgrNhdr);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRNHDR_SEL") == 0 )
         {
            AV31TFBarAgrNhdr_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFBarAgrNhdr_Sel", AV31TFBarAgrNhdr_Sel);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRSER") == 0 )
         {
            AV32TFBarAgrSer = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFBarAgrSer", AV32TFBarAgrSer);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRSER_SEL") == 0 )
         {
            AV33TFBarAgrSer_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFBarAgrSer_Sel", AV33TFBarAgrSer_Sel);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNOMAGR") == 0 )
         {
            AV34TFColNomAgr = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFColNomAgr", AV34TFColNomAgr);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNOMAGR_SEL") == 0 )
         {
            AV35TFColNomAgr_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFColNomAgr_Sel", AV35TFColNomAgr_Sel);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNUMAGR") == 0 )
         {
            AV36TFColNumAgr = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFColNumAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFColNumAgr), 6, 0));
            AV37TFColNumAgr_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFColNumAgr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFColNumAgr_To), 6, 0));
         }
         AV58GXV1 = (int)(AV58GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char15[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFBarAgrNhdr_Sel)==0), AV31TFBarAgrNhdr_Sel, GXv_char15) ;
      cambiocolorenhdragrupada_impl.this.GXt_char1 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char12[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFBarAgrSer_Sel)==0), AV33TFBarAgrSer_Sel, GXv_char12) ;
      cambiocolorenhdragrupada_impl.this.GXt_char16 = GXv_char12[0] ;
      GXt_char17 = "" ;
      GXv_char4[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFColNomAgr_Sel)==0), AV35TFColNomAgr_Sel, GXv_char4) ;
      cambiocolorenhdragrupada_impl.this.GXt_char17 = GXv_char4[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char16+"|"+GXt_char17+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char17 = "" ;
      GXv_char15[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFBarAgrNhdr)==0), AV30TFBarAgrNhdr, GXv_char15) ;
      cambiocolorenhdragrupada_impl.this.GXt_char17 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char12[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFBarAgrSer)==0), AV32TFBarAgrSer, GXv_char12) ;
      cambiocolorenhdragrupada_impl.this.GXt_char16 = GXv_char12[0] ;
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFColNomAgr)==0), AV34TFColNomAgr, GXv_char4) ;
      cambiocolorenhdragrupada_impl.this.GXt_char1 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = GXt_char17+"|"+GXt_char16+"|"+GXt_char1+"|"+((0==AV36TFColNumAgr) ? "" : GXutil.str( AV36TFColNumAgr, 6, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|||"+((0==AV37TFColNumAgr_To) ? "" : GXutil.str( AV37TFColNumAgr_To, 6, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV21GridState.fromxml(AV26Session.getValue(AV48Pgmname+"GridState"), null, null);
      AV21GridState.setgxTv_SdtWWPGridState_Orderedby( AV23OrderedBy );
      AV21GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV24OrderedDsc );
      AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState18[0] = AV21GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFBARAGRNHDR", "", !(GXutil.strcmp("", AV30TFBarAgrNhdr)==0), (short)(0), AV30TFBarAgrNhdr, "", !(GXutil.strcmp("", AV31TFBarAgrNhdr_Sel)==0), AV31TFBarAgrNhdr_Sel, "") ;
      AV21GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV21GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFBARAGRSER", "", !(GXutil.strcmp("", AV32TFBarAgrSer)==0), (short)(0), AV32TFBarAgrSer, "", !(GXutil.strcmp("", AV33TFBarAgrSer_Sel)==0), AV33TFBarAgrSer_Sel, "") ;
      AV21GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV21GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFCOLNOMAGR", "", !(GXutil.strcmp("", AV34TFColNomAgr)==0), (short)(0), AV34TFColNomAgr, "", !(GXutil.strcmp("", AV35TFColNomAgr_Sel)==0), AV35TFColNomAgr_Sel, "") ;
      AV21GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV21GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFCOLNUMAGR", "", !((0==AV36TFColNumAgr)&&(0==AV37TFColNumAgr_To)), (short)(0), GXutil.trim( GXutil.str( AV36TFColNumAgr, 6, 0)), GXutil.trim( GXutil.str( AV37TFColNumAgr_To, 6, 0))) ;
      AV21GridState = GXv_SdtWWPGridState18[0] ;
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV48Pgmname+"GridState", AV21GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV19TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV19TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV48Pgmname );
      AV19TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV19TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV18HTTPRequest.getScriptName()+"?"+AV18HTTPRequest.getQuerystring() );
      AV19TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "BARAGR" );
      AV26Session.setValue("TrnContext", AV19TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_99_28D2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_conforme_Internalname, tblTabledvelop_confirmpanel_conforme_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_conforme.setProperty("Title", Dvelop_confirmpanel_conforme_Title);
         ucDvelop_confirmpanel_conforme.setProperty("ConfirmationText", Dvelop_confirmpanel_conforme_Confirmationtext);
         ucDvelop_confirmpanel_conforme.setProperty("YesButtonCaption", Dvelop_confirmpanel_conforme_Yesbuttoncaption);
         ucDvelop_confirmpanel_conforme.setProperty("NoButtonCaption", Dvelop_confirmpanel_conforme_Nobuttoncaption);
         ucDvelop_confirmpanel_conforme.setProperty("CancelButtonCaption", Dvelop_confirmpanel_conforme_Cancelbuttoncaption);
         ucDvelop_confirmpanel_conforme.setProperty("YesButtonPosition", Dvelop_confirmpanel_conforme_Yesbuttonposition);
         ucDvelop_confirmpanel_conforme.setProperty("ConfirmType", Dvelop_confirmpanel_conforme_Confirmtype);
         ucDvelop_confirmpanel_conforme.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_conforme_Internalname, "DVELOP_CONFIRMPANEL_CONFORMEContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_CONFORMEContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_99_28D2e( true) ;
      }
      else
      {
         wb_table1_99_28D2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV6EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
      AV9BarCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCod), 8, 0));
      AV8BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodReo", GXutil.str( AV8BarCodReo, 1, 0));
      AV7BarCodPar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodPar", AV7BarCodPar);
      AV10CliCod = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10CliCod), 6, 0));
      AV11BarSer = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11BarSer", AV11BarSer);
      AV12BarColNom = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12BarColNom", AV12BarColNom);
      AV13BarColNum = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarColNum), 6, 0));
      AV14BarTipCol = ((Number) GXutil.testNumericType( getParm(obj,8), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarTipCol), 2, 0));
      AV15BarNomCli = (String)getParm(obj,9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15BarNomCli", AV15BarNomCli);
      AV5BarNumCli = ((Number) GXutil.testNumericType( getParm(obj,10), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarNumCli), 6, 0));
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
      pa28D2( ) ;
      ws28D2( ) ;
      we28D2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211615266", true, true);
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
      httpContext.AddJavascriptSource("gestionlaboratorio/cambiocolorenhdragrupada.js", "?20268211615266", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_772( )
   {
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_77_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_77_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_77_idx ;
      edtBarAgrNhdr_Internalname = "BARAGRNHDR_"+sGXsfl_77_idx ;
      edtBarAgrCod_Internalname = "BARAGRCOD_"+sGXsfl_77_idx ;
      edtBarAgrReo_Internalname = "BARAGRREO_"+sGXsfl_77_idx ;
      edtBarAgrPar_Internalname = "BARAGRPAR_"+sGXsfl_77_idx ;
      edtBarAgrSer_Internalname = "BARAGRSER_"+sGXsfl_77_idx ;
      edtColNomAgr_Internalname = "COLNOMAGR_"+sGXsfl_77_idx ;
      edtColNumAgr_Internalname = "COLNUMAGR_"+sGXsfl_77_idx ;
   }

   public void subsflControlProps_fel_772( )
   {
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_77_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_77_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_77_fel_idx ;
      edtBarAgrNhdr_Internalname = "BARAGRNHDR_"+sGXsfl_77_fel_idx ;
      edtBarAgrCod_Internalname = "BARAGRCOD_"+sGXsfl_77_fel_idx ;
      edtBarAgrReo_Internalname = "BARAGRREO_"+sGXsfl_77_fel_idx ;
      edtBarAgrPar_Internalname = "BARAGRPAR_"+sGXsfl_77_fel_idx ;
      edtBarAgrSer_Internalname = "BARAGRSER_"+sGXsfl_77_fel_idx ;
      edtColNomAgr_Internalname = "COLNOMAGR_"+sGXsfl_77_fel_idx ;
      edtColNumAgr_Internalname = "COLNUMAGR_"+sGXsfl_77_fel_idx ;
   }

   public void sendrow_772( )
   {
      subsflControlProps_772( ) ;
      wb28D0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_77_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_77_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_77_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(77),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(77),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(77),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrNhdr_Internalname,GXutil.rtrim( A13792BarAgrNhdr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrNhdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(77),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrCod_Internalname,GXutil.ltrim( localUtil.ntoc( A119BarAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A119BarAgrCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(77),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrReo_Internalname,GXutil.ltrim( localUtil.ntoc( A124BarAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A124BarAgrReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(77),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrPar_Internalname,GXutil.rtrim( A122BarAgrPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(77),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrSer_Internalname,GXutil.rtrim( A1245BarAgrSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(77),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColNomAgr_Internalname,GXutil.rtrim( A1510ColNomAgr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtColNomAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(77),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColNumAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A1512ColNumAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1512ColNumAgr), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtColNumAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(77),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes28D2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_77_idx = ((subGrid_Islastpage==1)&&(nGXsfl_77_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_77_idx+1) ;
         sGXsfl_77_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_77_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_772( ) ;
      }
      /* End function sendrow_772 */
   }

   public void startgridcontrol77( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"77\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Reoperado Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Particion Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N° Hdr Agrupada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº HDR", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N° Color", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13792BarAgrNhdr));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A119BarAgrCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A124BarAgrReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A122BarAgrPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1245BarAgrSer));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1510ColNomAgr));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1512ColNumAgr, (byte)(6), (byte)(0), ".", "")));
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
      edtavBarcod_Internalname = "vBARCOD" ;
      edtavBarcodreo_Internalname = "vBARCODREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtavClicod_Internalname = "vCLICOD" ;
      edtavBarser_Internalname = "vBARSER" ;
      edtavBarcolnom_Internalname = "vBARCOLNOM" ;
      edtavBarcolnum_Internalname = "vBARCOLNUM" ;
      edtavBartipcol_Internalname = "vBARTIPCOL" ;
      edtavBarnomcli_Internalname = "vBARNOMCLI" ;
      edtavBarnumcli_Internalname = "vBARNUMCLI" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      bttBtnconforme_Internalname = "BTNCONFORME" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtBarAgrNhdr_Internalname = "BARAGRNHDR" ;
      edtBarAgrCod_Internalname = "BARAGRCOD" ;
      edtBarAgrReo_Internalname = "BARAGRREO" ;
      edtBarAgrPar_Internalname = "BARAGRPAR" ;
      edtBarAgrSer_Internalname = "BARAGRSER" ;
      edtColNomAgr_Internalname = "COLNOMAGR" ;
      edtColNumAgr_Internalname = "COLNUMAGR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Dvelop_confirmpanel_conforme_Internalname = "DVELOP_CONFIRMPANEL_CONFORME" ;
      tblTabledvelop_confirmpanel_conforme_Internalname = "TABLEDVELOP_CONFIRMPANEL_CONFORME" ;
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
      edtColNumAgr_Jsonclick = "" ;
      edtColNomAgr_Jsonclick = "" ;
      edtBarAgrSer_Jsonclick = "" ;
      edtBarAgrPar_Jsonclick = "" ;
      edtBarAgrReo_Jsonclick = "" ;
      edtBarAgrCod_Jsonclick = "" ;
      edtBarAgrNhdr_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavBarnumcli_Jsonclick = "" ;
      edtavBarnumcli_Enabled = 0 ;
      edtavBarnomcli_Jsonclick = "" ;
      edtavBarnomcli_Enabled = 0 ;
      edtavBartipcol_Jsonclick = "" ;
      edtavBartipcol_Enabled = 0 ;
      edtavBarcolnum_Jsonclick = "" ;
      edtavBarcolnum_Enabled = 0 ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarser_Jsonclick = "" ;
      edtavBarser_Enabled = 0 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 0 ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 0 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Dvelop_confirmpanel_conforme_Confirmtype = "1" ;
      Dvelop_confirmpanel_conforme_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_conforme_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_conforme_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_conforme_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_conforme_Confirmationtext = "¿Conforme?" ;
      Dvelop_confirmpanel_conforme_Title = "" ;
      Ddo_grid_Datalistproc = "GestionLaboratorio.CambioColorenHdrAgrupadaGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic|Dynamic|" ;
      Ddo_grid_Includedatalist = "T|T|T|" ;
      Ddo_grid_Filterisrange = "|||T" ;
      Ddo_grid_Filtertype = "Character|Character|Character|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "|T|T|T" ;
      Ddo_grid_Columnssortvalues = "|2|3|4" ;
      Ddo_grid_Columnids = "3:BarAgrNhdr|7:BarAgrSer|8:ColNomAgr|9:ColNumAgr" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Informacion Hdr Principal", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Cambio de Color en Hdrs Agrupadas", "") );
      subGrid_Rows = 50 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV30TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV31TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'AV32TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV33TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV34TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV35TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV36TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV37TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV23OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV24OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV45FlagCorE',fld:'vFLAGCORE',pic:'ZZZ9',hsh:true},{av:'AV48Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1228D2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV30TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV31TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'AV32TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV33TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV34TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV35TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV36TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV37TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV48Pgmname',fld:'vPGMNAME',pic:''},{av:'AV23OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV24OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV45FlagCorE',fld:'vFLAGCORE',pic:'ZZZ9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV23OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV24OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV30TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV31TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'AV32TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV33TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV34TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV35TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV36TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV37TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e1728D2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("'DOCONFORME'","{handler:'e1128D1',iparms:[{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("'DOCONFORME'",",oparms:[{av:'Dvelop_confirmpanel_conforme_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_CONFORME',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFORME.CLOSE","{handler:'e1328D2',iparms:[{av:'Dvelop_confirmpanel_conforme_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFORME',prop:'Result'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A119BarAgrCod',fld:'BARAGRCOD',grid:77,pic:'ZZZZZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_77',ctrl:'GRID',grid:77,prop:'GridRC',grid:77},{av:'A124BarAgrReo',fld:'BARAGRREO',grid:77,pic:'9'},{av:'A122BarAgrPar',fld:'BARAGRPAR',grid:77,pic:''},{av:'AV12BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV13BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV15BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV5BarNumCli',fld:'vBARNUMCLI',pic:'ZZZZZ9'},{av:'AV11BarSer',fld:'vBARSER',pic:''},{av:'AV14BarTipCol',fld:'vBARTIPCOL',pic:'Z9'},{av:'AV45FlagCorE',fld:'vFLAGCORE',pic:'ZZZ9',hsh:true},{av:'AV10CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFORME.CLOSE",",oparms:[{av:'AV5BarNumCli',fld:'vBARNUMCLI',pic:'ZZZZZ9'},{av:'AV15BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV13BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV12BarColNom',fld:'vBARCOLNOM',pic:''},{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV14BarTipCol',fld:'vBARTIPCOL',pic:'Z9'},{av:'AV11BarSer',fld:'vBARSER',pic:''},{av:'AV10CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV8BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1428D2',iparms:[{av:'AV5BarNumCli',fld:'vBARNUMCLI',pic:'ZZZZZ9'},{av:'AV15BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV14BarTipCol',fld:'vBARTIPCOL',pic:'Z9'},{av:'AV13BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV12BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV11BarSer',fld:'vBARSER',pic:''},{av:'AV10CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV8BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV45FlagCorE',fld:'vFLAGCORE',pic:'ZZZ9',hsh:true},{av:'AV30TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV31TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'AV32TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV33TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV34TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV35TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV36TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV37TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV48Pgmname',fld:'vPGMNAME',pic:''},{av:'AV23OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV24OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV45FlagCorE',fld:'vFLAGCORE',pic:'ZZZ9',hsh:true},{av:'AV30TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV31TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'AV32TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV33TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV34TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV35TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV36TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV37TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV48Pgmname',fld:'vPGMNAME',pic:''},{av:'AV23OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV24OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV45FlagCorE',fld:'vFLAGCORE',pic:'ZZZ9',hsh:true},{av:'AV30TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV31TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'AV32TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV33TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV34TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV35TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV36TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV37TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV48Pgmname',fld:'vPGMNAME',pic:''},{av:'AV23OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV24OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV45FlagCorE',fld:'vFLAGCORE',pic:'ZZZ9',hsh:true},{av:'AV30TFBarAgrNhdr',fld:'vTFBARAGRNHDR',pic:''},{av:'AV31TFBarAgrNhdr_Sel',fld:'vTFBARAGRNHDR_SEL',pic:''},{av:'AV32TFBarAgrSer',fld:'vTFBARAGRSER',pic:''},{av:'AV33TFBarAgrSer_Sel',fld:'vTFBARAGRSER_SEL',pic:''},{av:'AV34TFColNomAgr',fld:'vTFCOLNOMAGR',pic:''},{av:'AV35TFColNomAgr_Sel',fld:'vTFCOLNOMAGR_SEL',pic:''},{av:'AV36TFColNumAgr',fld:'vTFCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV37TFColNumAgr_To',fld:'vTFCOLNUMAGR_TO',pic:'ZZZZZ9'},{av:'AV48Pgmname',fld:'vPGMNAME',pic:''},{av:'AV23OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV24OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[]}");
      setEventMetadata("VALIDV_BARCOD","{handler:'validv_Barcod',iparms:[]");
      setEventMetadata("VALIDV_BARCOD",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODREO","{handler:'validv_Barcodreo',iparms:[]");
      setEventMetadata("VALIDV_BARCODREO",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODPAR","{handler:'validv_Barcodpar',iparms:[]");
      setEventMetadata("VALIDV_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_BARAGRCOD","{handler:'valid_Baragrcod',iparms:[]");
      setEventMetadata("VALID_BARAGRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARAGRREO","{handler:'valid_Baragrreo',iparms:[]");
      setEventMetadata("VALID_BARAGRREO",",oparms:[]}");
      setEventMetadata("VALID_BARAGRPAR","{handler:'valid_Baragrpar',iparms:[]");
      setEventMetadata("VALID_BARAGRPAR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Colnumagr',iparms:[]");
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
      wcpOAV6EmprCod = "" ;
      wcpOAV7BarCodPar = "" ;
      wcpOAV11BarSer = "" ;
      wcpOAV12BarColNom = "" ;
      wcpOAV15BarNomCli = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Dvelop_confirmpanel_conforme_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV6EmprCod = "" ;
      AV7BarCodPar = "" ;
      AV11BarSer = "" ;
      AV12BarColNom = "" ;
      AV15BarNomCli = "" ;
      AV30TFBarAgrNhdr = "" ;
      AV31TFBarAgrNhdr_Sel = "" ;
      AV32TFBarAgrSer = "" ;
      AV33TFBarAgrSer_Sel = "" ;
      AV34TFColNomAgr = "" ;
      AV35TFColNomAgr_Sel = "" ;
      AV48Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV38DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtnconforme_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV49Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr = "" ;
      AV50Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel = "" ;
      AV51Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser = "" ;
      AV52Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel = "" ;
      AV53Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr = "" ;
      AV54Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel = "" ;
      A130BarCodPar = "" ;
      A13792BarAgrNhdr = "" ;
      A122BarAgrPar = "" ;
      A1245BarAgrSer = "" ;
      A1510ColNomAgr = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV49Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr = "" ;
      lV51Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser = "" ;
      lV53Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr = "" ;
      A396EmprCod = "" ;
      H028D2_A396EmprCod = new String[] {""} ;
      H028D2_A1512ColNumAgr = new int[1] ;
      H028D2_A1510ColNomAgr = new String[] {""} ;
      H028D2_A1245BarAgrSer = new String[] {""} ;
      H028D2_A130BarCodPar = new String[] {""} ;
      H028D2_A132BarCodReo = new byte[1] ;
      H028D2_A129BarCod = new int[1] ;
      H028D2_A122BarAgrPar = new String[] {""} ;
      H028D2_A124BarAgrReo = new byte[1] ;
      H028D2_A119BarAgrCod = new int[1] ;
      H028D3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV42Station = "" ;
      AV43EmprNom = "" ;
      AV44UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV17WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      GXv_char2 = new String[1] ;
      GXv_int8 = new byte[1] ;
      GXv_int13 = new int[1] ;
      GXv_int14 = new byte[1] ;
      GXv_int11 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_int10 = new int[1] ;
      AV26Session = httpContext.getWebSession();
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char17 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char12 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_SdtWWPGridState18 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV19TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV18HTTPRequest = httpContext.getHttpRequest();
      ucDvelop_confirmpanel_conforme = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.cambiocolorenhdragrupada__default(),
         new Object[] {
             new Object[] {
            H028D2_A396EmprCod, H028D2_A1512ColNumAgr, H028D2_A1510ColNomAgr, H028D2_A1245BarAgrSer, H028D2_A130BarCodPar, H028D2_A132BarCodReo, H028D2_A129BarCod, H028D2_A122BarAgrPar, H028D2_A124BarAgrReo, H028D2_A119BarAgrCod
            }
            , new Object[] {
            H028D3_AGRID_nRecordCount
            }
         }
      );
      AV48Pgmname = "GestionLaboratorio.CambioColorenHdrAgrupada" ;
      /* GeneXus formulas. */
      AV48Pgmname = "GestionLaboratorio.CambioColorenHdrAgrupada" ;
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcodpar_Enabled = 0 ;
      edtavClicod_Enabled = 0 ;
      edtavBarser_Enabled = 0 ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarcolnum_Enabled = 0 ;
      edtavBartipcol_Enabled = 0 ;
      edtavBarnomcli_Enabled = 0 ;
      edtavBarnumcli_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV8BarCodReo ;
   private byte wcpOAV14BarTipCol ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV8BarCodReo ;
   private byte AV14BarTipCol ;
   private byte gxajaxcallmode ;
   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte GXv_int14[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV23OrderedBy ;
   private short AV45FlagCorE ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV9BarCod ;
   private int wcpOAV10CliCod ;
   private int wcpOAV13BarColNum ;
   private int wcpOAV5BarNumCli ;
   private int nRC_GXsfl_77 ;
   private int subGrid_Rows ;
   private int AV9BarCod ;
   private int AV10CliCod ;
   private int AV13BarColNum ;
   private int AV5BarNumCli ;
   private int nGXsfl_77_idx=1 ;
   private int AV36TFColNumAgr ;
   private int AV37TFColNumAgr_To ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavClicod_Enabled ;
   private int edtavBarser_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int edtavBarcolnum_Enabled ;
   private int edtavBartipcol_Enabled ;
   private int edtavBarnomcli_Enabled ;
   private int edtavBarnumcli_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV55Gestionlaboratorio_cambiocolorenhdragrupadads_7_tfcolnumagr ;
   private int AV56Gestionlaboratorio_cambiocolorenhdragrupadads_8_tfcolnumagr_to ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private int A1512ColNumAgr ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int nGXsfl_77_fel_idx=1 ;
   private int GXv_int13[] ;
   private int GXv_int11[] ;
   private int GXv_int10[] ;
   private int AV58GXV1 ;
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
   private String wcpOAV6EmprCod ;
   private String wcpOAV7BarCodPar ;
   private String wcpOAV11BarSer ;
   private String wcpOAV12BarColNom ;
   private String wcpOAV15BarNomCli ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Dvelop_confirmpanel_conforme_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV6EmprCod ;
   private String AV7BarCodPar ;
   private String AV11BarSer ;
   private String AV12BarColNom ;
   private String AV15BarNomCli ;
   private String sGXsfl_77_idx="0001" ;
   private String AV30TFBarAgrNhdr ;
   private String AV31TFBarAgrNhdr_Sel ;
   private String AV32TFBarAgrSer ;
   private String AV33TFBarAgrSer_Sel ;
   private String AV34TFColNomAgr ;
   private String AV35TFColNomAgr_Sel ;
   private String AV48Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
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
   private String Dvelop_confirmpanel_conforme_Title ;
   private String Dvelop_confirmpanel_conforme_Confirmationtext ;
   private String Dvelop_confirmpanel_conforme_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_conforme_Nobuttoncaption ;
   private String Dvelop_confirmpanel_conforme_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_conforme_Yesbuttonposition ;
   private String Dvelop_confirmpanel_conforme_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Infinitescrolling ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavBarcod_Internalname ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcodreo_Internalname ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String edtavBarcodpar_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavBarser_Internalname ;
   private String edtavBarser_Jsonclick ;
   private String edtavBarcolnom_Internalname ;
   private String edtavBarcolnom_Jsonclick ;
   private String edtavBarcolnum_Internalname ;
   private String edtavBarcolnum_Jsonclick ;
   private String edtavBartipcol_Internalname ;
   private String edtavBartipcol_Jsonclick ;
   private String edtavBarnomcli_Internalname ;
   private String edtavBarnomcli_Jsonclick ;
   private String edtavBarnumcli_Internalname ;
   private String edtavBarnumcli_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String TempTags ;
   private String bttBtnconforme_Internalname ;
   private String bttBtnconforme_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV49Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr ;
   private String AV50Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel ;
   private String AV51Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser ;
   private String AV52Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel ;
   private String AV53Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr ;
   private String AV54Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String A13792BarAgrNhdr ;
   private String edtBarAgrNhdr_Internalname ;
   private String edtBarAgrCod_Internalname ;
   private String edtBarAgrReo_Internalname ;
   private String A122BarAgrPar ;
   private String edtBarAgrPar_Internalname ;
   private String A1245BarAgrSer ;
   private String edtBarAgrSer_Internalname ;
   private String A1510ColNomAgr ;
   private String edtColNomAgr_Internalname ;
   private String edtColNumAgr_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV49Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr ;
   private String lV51Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser ;
   private String lV53Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr ;
   private String A396EmprCod ;
   private String hsh ;
   private String AV42Station ;
   private String AV43EmprNom ;
   private String AV44UsurCod ;
   private String sGXsfl_77_fel_idx="0001" ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXt_char17 ;
   private String GXv_char15[] ;
   private String GXt_char16 ;
   private String GXv_char12[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String tblTabledvelop_confirmpanel_conforme_Internalname ;
   private String Dvelop_confirmpanel_conforme_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtBarAgrNhdr_Jsonclick ;
   private String edtBarAgrCod_Jsonclick ;
   private String edtBarAgrReo_Jsonclick ;
   private String edtBarAgrPar_Jsonclick ;
   private String edtBarAgrSer_Jsonclick ;
   private String edtColNomAgr_Jsonclick ;
   private String edtColNumAgr_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV24OrderedDsc ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_77_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV18HTTPRequest ;
   private com.genexus.webpanels.WebSession AV26Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_conforme ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H028D2_A396EmprCod ;
   private int[] H028D2_A1512ColNumAgr ;
   private String[] H028D2_A1510ColNomAgr ;
   private String[] H028D2_A1245BarAgrSer ;
   private String[] H028D2_A130BarCodPar ;
   private byte[] H028D2_A132BarCodReo ;
   private int[] H028D2_A129BarCod ;
   private String[] H028D2_A122BarAgrPar ;
   private byte[] H028D2_A124BarAgrReo ;
   private int[] H028D2_A119BarAgrCod ;
   private long[] H028D3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV17WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV19TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState18[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV38DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class cambiocolorenhdragrupada__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H028D2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel ,
                                          String AV49Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr ,
                                          String AV52Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel ,
                                          String AV51Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser ,
                                          String AV54Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel ,
                                          String AV53Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr ,
                                          int AV55Gestionlaboratorio_cambiocolorenhdragrupadads_7_tfcolnumagr ,
                                          int AV56Gestionlaboratorio_cambiocolorenhdragrupadads_8_tfcolnumagr_to ,
                                          int A119BarAgrCod ,
                                          byte A124BarAgrReo ,
                                          String A122BarAgrPar ,
                                          String A1245BarAgrSer ,
                                          String A1510ColNomAgr ,
                                          int A1512ColNumAgr ,
                                          short AV23OrderedBy ,
                                          boolean AV24OrderedDsc ,
                                          String AV6EmprCod ,
                                          int AV9BarCod ,
                                          byte AV8BarCodReo ,
                                          String AV7BarCodPar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[17];
      Object[] GXv_Object20 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " /*+ FIRST_ROWS(51) */ EmprCod, ColNumAgr, ColNomAgr, BarAgrSer, BarCodPar, BarCodReo, BarCod, BarAgrPar, BarAgrReo, BarAgrCod" ;
      sFromString = " FROM TXPBARAGR" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV50Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV49Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar = ?)");
      }
      else
      {
         GXv_int19[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel)==0) && ( ! (GXutil.strcmp("", AV51Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrSer = ?)");
      }
      else
      {
         GXv_int19[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel)==0) && ( ! (GXutil.strcmp("", AV53Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNomAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNomAgr = ?)");
      }
      else
      {
         GXv_int19[9] = (byte)(1) ;
      }
      if ( ! (0==AV55Gestionlaboratorio_cambiocolorenhdragrupadads_7_tfcolnumagr) )
      {
         addWhere(sWhereString, "(ColNumAgr >= ?)");
      }
      else
      {
         GXv_int19[10] = (byte)(1) ;
      }
      if ( ! (0==AV56Gestionlaboratorio_cambiocolorenhdragrupadads_8_tfcolnumagr_to) )
      {
         addWhere(sWhereString, "(ColNumAgr <= ?)");
      }
      else
      {
         GXv_int19[11] = (byte)(1) ;
      }
      if ( AV23OrderedBy == 1 )
      {
         sOrderString += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      }
      else if ( ( AV23OrderedBy == 2 ) && ! AV24OrderedDsc )
      {
         sOrderString += " ORDER BY BarAgrSer" ;
      }
      else if ( ( AV23OrderedBy == 2 ) && ( AV24OrderedDsc ) )
      {
         sOrderString += " ORDER BY BarAgrSer DESC" ;
      }
      else if ( ( AV23OrderedBy == 3 ) && ! AV24OrderedDsc )
      {
         sOrderString += " ORDER BY ColNomAgr" ;
      }
      else if ( ( AV23OrderedBy == 3 ) && ( AV24OrderedDsc ) )
      {
         sOrderString += " ORDER BY ColNomAgr DESC" ;
      }
      else if ( ( AV23OrderedBy == 4 ) && ! AV24OrderedDsc )
      {
         sOrderString += " ORDER BY ColNumAgr" ;
      }
      else if ( ( AV23OrderedBy == 4 ) && ( AV24OrderedDsc ) )
      {
         sOrderString += " ORDER BY ColNumAgr DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
   }

   protected Object[] conditional_H028D3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel ,
                                          String AV49Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr ,
                                          String AV52Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel ,
                                          String AV51Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser ,
                                          String AV54Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel ,
                                          String AV53Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr ,
                                          int AV55Gestionlaboratorio_cambiocolorenhdragrupadads_7_tfcolnumagr ,
                                          int AV56Gestionlaboratorio_cambiocolorenhdragrupadads_8_tfcolnumagr_to ,
                                          int A119BarAgrCod ,
                                          byte A124BarAgrReo ,
                                          String A122BarAgrPar ,
                                          String A1245BarAgrSer ,
                                          String A1510ColNomAgr ,
                                          int A1512ColNumAgr ,
                                          short AV23OrderedBy ,
                                          boolean AV24OrderedDsc ,
                                          String AV6EmprCod ,
                                          int AV9BarCod ,
                                          byte AV8BarCodReo ,
                                          String AV7BarCodPar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[12];
      Object[] GXv_Object22 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPBARAGR" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV50Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV49Gestionlaboratorio_cambiocolorenhdragrupadads_1_tfbaragrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Gestionlaboratorio_cambiocolorenhdragrupadads_2_tfbaragrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar = ?)");
      }
      else
      {
         GXv_int21[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel)==0) && ( ! (GXutil.strcmp("", AV51Gestionlaboratorio_cambiocolorenhdragrupadads_3_tfbaragrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Gestionlaboratorio_cambiocolorenhdragrupadads_4_tfbaragrser_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrSer = ?)");
      }
      else
      {
         GXv_int21[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel)==0) && ( ! (GXutil.strcmp("", AV53Gestionlaboratorio_cambiocolorenhdragrupadads_5_tfcolnomagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNomAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Gestionlaboratorio_cambiocolorenhdragrupadads_6_tfcolnomagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNomAgr = ?)");
      }
      else
      {
         GXv_int21[9] = (byte)(1) ;
      }
      if ( ! (0==AV55Gestionlaboratorio_cambiocolorenhdragrupadads_7_tfcolnumagr) )
      {
         addWhere(sWhereString, "(ColNumAgr >= ?)");
      }
      else
      {
         GXv_int21[10] = (byte)(1) ;
      }
      if ( ! (0==AV56Gestionlaboratorio_cambiocolorenhdragrupadads_8_tfcolnumagr_to) )
      {
         addWhere(sWhereString, "(ColNumAgr <= ?)");
      }
      else
      {
         GXv_int21[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV23OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV23OrderedBy == 2 ) && ! AV24OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV23OrderedBy == 2 ) && ( AV24OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV23OrderedBy == 3 ) && ! AV24OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV23OrderedBy == 3 ) && ( AV24OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV23OrderedBy == 4 ) && ! AV24OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV23OrderedBy == 4 ) && ( AV24OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
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
                  return conditional_H028D2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).shortValue() , ((Boolean) dynConstraints[15]).booleanValue() , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] );
            case 1 :
                  return conditional_H028D3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).shortValue() , ((Boolean) dynConstraints[15]).booleanValue() , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H028D2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H028D3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
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
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[19]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[14]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               return;
      }
   }

}

