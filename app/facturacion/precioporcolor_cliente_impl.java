package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class precioporcolor_cliente_impl extends GXDataArea
{
   public precioporcolor_cliente_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public precioporcolor_cliente_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( precioporcolor_cliente_impl.class ));
   }

   public precioporcolor_cliente_impl( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavPrecioporcolor_cliente_sdt__forpredef = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
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
         if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            AV7Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Emprcod", AV7Emprcod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Emprcod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV8Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Clicod), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8Clicod), "ZZZZZ9")));
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
      nRC_GXsfl_43 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_43"))) ;
      nGXsfl_43_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_43_idx"))) ;
      sGXsfl_43_idx = httpContext.GetPar( "sGXsfl_43_idx") ;
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
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV47Pgmname = httpContext.GetPar( "Pgmname") ;
      AV14FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV7Emprcod = httpContext.GetPar( "Emprcod") ;
      AV8Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV47Pgmname, AV14FilterFullText, AV7Emprcod, AV8Clicod) ;
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
      pa22R2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start22R2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.precioporcolor_cliente", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV8Clicod,6,0))}, new String[] {"Emprcod","Clicod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8Clicod), "ZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"PrecioporColor_Cliente");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV47Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\precioporcolor_cliente:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Precioporcolor_cliente_sdt", AV15PrecioporColor_Cliente_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Precioporcolor_cliente_sdt", AV15PrecioporColor_Cliente_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_43", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_43, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV28GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV29GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV26DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV26DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV25ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV8Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8Clicod), "ZZZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV12GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV12GridState);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRECIOPORCOLOR_CLIENTE_SDT", AV15PrecioporColor_Cliente_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRECIOPORCOLOR_CLIENTE_SDT", AV15PrecioporColor_Cliente_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Icontype", GXutil.rtrim( Ddo_managefilters_Icontype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Icon", GXutil.rtrim( Ddo_managefilters_Icon));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Tooltip", GXutil.rtrim( Ddo_managefilters_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Cls", GXutil.rtrim( Ddo_managefilters_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Width", GXutil.rtrim( Dvpanel_tableheader_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autowidth", GXutil.booltostr( Dvpanel_tableheader_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autoheight", GXutil.booltostr( Dvpanel_tableheader_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Cls", GXutil.rtrim( Dvpanel_tableheader_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Title", GXutil.rtrim( Dvpanel_tableheader_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Collapsible", GXutil.booltostr( Dvpanel_tableheader_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Collapsed", GXutil.booltostr( Dvpanel_tableheader_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Showcollapseicon", GXutil.booltostr( Dvpanel_tableheader_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Iconposition", GXutil.rtrim( Dvpanel_tableheader_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autoscroll", GXutil.booltostr( Dvpanel_tableheader_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Class", GXutil.rtrim( Gridpaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridpaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridpaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Shownext", GXutil.booltostr( Gridpaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showlast", GXutil.booltostr( Gridpaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridpaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridpaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridpaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridpaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridpaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Previous", GXutil.rtrim( Gridpaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Next", GXutil.rtrim( Gridpaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Caption", GXutil.rtrim( Gridpaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridpaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridpaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Width", GXutil.rtrim( Innewwindow1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Height", GXutil.rtrim( Innewwindow1_Height));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Target", GXutil.rtrim( Innewwindow1_Target));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         we22R2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt22R2( ) ;
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
      return formatLink("app.facturacion.precioporcolor_cliente", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV8Clicod,6,0))}, new String[] {"Emprcod","Clicod"})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.PrecioporColor_Cliente" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Precio por Color (Cliente)", "") ;
   }

   public void wb22R0( )
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
         ucDvpanel_tableheader.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableheader_Internalname, "DVPANEL_TABLEHEADERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEHEADERContainer"+"TableHeader"+"\" style=\"display:none;\">") ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\PrecioporColor_Cliente.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 7, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1122r1_client"+"'", TempTags, "", 2, "HLP_Facturacion\\PrecioporColor_Cliente.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\PrecioporColor_Cliente.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\PrecioporColor_Cliente.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_22R2( true) ;
      }
      else
      {
         wb_table1_25_22R2( false) ;
      }
      return  ;
   }

   public void wb_table1_25_22R2e( boolean wbgen )
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
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
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
            AV32GXV1 = nGXsfl_43_idx ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV28GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV29GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV47Pgmname), GXutil.rtrim( localUtil.format( AV47Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\PrecioporColor_Cliente.htm");
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
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV26DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV26DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
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
               AV32GXV1 = nGXsfl_43_idx ;
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

   public void start22R2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Precio por Color (Cliente)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup22R0( ) ;
   }

   public void ws22R2( )
   {
      start22R2( ) ;
      evt22R2( ) ;
   }

   public void evt22R2( )
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
                        else if ( GXutil.strcmp(sEvt, "DDO_MANAGEFILTERS.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1222R2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1322R2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1422R2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1522R2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e1622R2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e1722R2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_43_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_432( ) ;
                           AV32GXV1 = (int)(nGXsfl_43_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV15PrecioporColor_Cliente_SDT.size() >= AV32GXV1 ) && ( AV32GXV1 > 0 ) )
                           {
                              AV15PrecioporColor_Cliente_SDT.currentItem( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)) );
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e1822R2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e1922R2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2022R2 ();
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

   public void we22R2( )
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

   public void pa22R2( )
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
            GX_FocusControl = edtavFilterfulltext_Internalname ;
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
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV47Pgmname ,
                                 String AV14FilterFullText ,
                                 String AV7Emprcod ,
                                 int AV8Clicod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1922R2 ();
      GRID_nCurrentRecord = 0 ;
      rf22R2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"PrecioporColor_Cliente");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV47Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\precioporcolor_cliente:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf22R2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV47Pgmname = "Facturacion.PrecioporColor_Cliente" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Pgmname", AV47Pgmname);
      Gx_err = (short)(0) ;
      edtavPrecioporcolor_cliente_sdt__forser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__forser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__forser_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__forcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__forcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__forcolnum_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__forcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__forcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__forcolnom_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__tipcolcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__tipcolcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__tipcolcod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__fornomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__fornomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__fornomcli_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__fornumcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__fornumcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__fornumcli_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__forprefec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__forprefec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__forprefec_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__forcosform_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__forcosform_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__forcosform_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__coste_general_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__coste_general_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__coste_general_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__coste_total_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__coste_total_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__coste_total_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__grdtipart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__grdtipart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__grdtipart_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__forprekgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__forprekgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__forprekgm_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf22R2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(43) ;
      /* Execute user event: Refresh */
      e1922R2 ();
      nGXsfl_43_idx = 1 ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_432( ) ;
      bGXsfl_43_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
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
         subsflControlProps_432( ) ;
         e2022R2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_43_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e2022R2 ();
         }
         wbEnd = (short)(43) ;
         wb22R0( ) ;
      }
      bGXsfl_43_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes22R2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV8Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8Clicod), "ZZZZZ9")));
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
      return AV15PrecioporColor_Cliente_SDT.size() ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV47Pgmname, AV14FilterFullText, AV7Emprcod, AV8Clicod) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV47Pgmname, AV14FilterFullText, AV7Emprcod, AV8Clicod) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV47Pgmname, AV14FilterFullText, AV7Emprcod, AV8Clicod) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV47Pgmname, AV14FilterFullText, AV7Emprcod, AV8Clicod) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV47Pgmname, AV14FilterFullText, AV7Emprcod, AV8Clicod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV47Pgmname = "Facturacion.PrecioporColor_Cliente" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Pgmname", AV47Pgmname);
      Gx_err = (short)(0) ;
      edtavPrecioporcolor_cliente_sdt__forser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__forser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__forser_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__forcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__forcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__forcolnum_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__forcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__forcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__forcolnom_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__tipcolcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__tipcolcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__tipcolcod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__fornomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__fornomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__fornomcli_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__fornumcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__fornumcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__fornumcli_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__forprefec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__forprefec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__forprefec_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__forcosform_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__forcosform_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__forcosform_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__coste_general_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__coste_general_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__coste_general_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__coste_total_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__coste_total_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__coste_total_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__grdtipart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__grdtipart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__grdtipart_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__forprekgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__forprekgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__forprekgm_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup22R0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1822R2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Precioporcolor_cliente_sdt"), AV15PrecioporColor_Cliente_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV26DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPRECIOPORCOLOR_CLIENTE_SDT"), AV15PrecioporColor_Cliente_SDT);
         /* Read saved values. */
         nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV28GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV29GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_managefilters_Icontype = httpContext.cgiGet( "DDO_MANAGEFILTERS_Icontype") ;
         Ddo_managefilters_Icon = httpContext.cgiGet( "DDO_MANAGEFILTERS_Icon") ;
         Ddo_managefilters_Tooltip = httpContext.cgiGet( "DDO_MANAGEFILTERS_Tooltip") ;
         Ddo_managefilters_Cls = httpContext.cgiGet( "DDO_MANAGEFILTERS_Cls") ;
         Dvpanel_tableheader_Width = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Width") ;
         Dvpanel_tableheader_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autowidth")) ;
         Dvpanel_tableheader_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autoheight")) ;
         Dvpanel_tableheader_Cls = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Cls") ;
         Dvpanel_tableheader_Title = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Title") ;
         Dvpanel_tableheader_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Collapsible")) ;
         Dvpanel_tableheader_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Collapsed")) ;
         Dvpanel_tableheader_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Showcollapseicon")) ;
         Dvpanel_tableheader_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Iconposition") ;
         Dvpanel_tableheader_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autoscroll")) ;
         Gridpaginationbar_Class = httpContext.cgiGet( "GRIDPAGINATIONBAR_Class") ;
         Gridpaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showfirst")) ;
         Gridpaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showprevious")) ;
         Gridpaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Shownext")) ;
         Gridpaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showlast")) ;
         Gridpaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Pagingbuttonsposition = httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridpaginationbar_Pagingcaptionposition = httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagingcaptionposition") ;
         Gridpaginationbar_Emptygridclass = httpContext.cgiGet( "GRIDPAGINATIONBAR_Emptygridclass") ;
         Gridpaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselector")) ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Rowsperpageoptions = httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageoptions") ;
         Gridpaginationbar_Previous = httpContext.cgiGet( "GRIDPAGINATIONBAR_Previous") ;
         Gridpaginationbar_Next = httpContext.cgiGet( "GRIDPAGINATIONBAR_Next") ;
         Gridpaginationbar_Caption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Caption") ;
         Gridpaginationbar_Emptygridcaption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Emptygridcaption") ;
         Gridpaginationbar_Rowsperpagecaption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpagecaption") ;
         Ddo_grid_Caption = httpContext.cgiGet( "DDO_GRID_Caption") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Fixable = httpContext.cgiGet( "DDO_GRID_Fixable") ;
         Innewwindow1_Width = httpContext.cgiGet( "INNEWWINDOW1_Width") ;
         Innewwindow1_Height = httpContext.cgiGet( "INNEWWINDOW1_Height") ;
         Innewwindow1_Target = httpContext.cgiGet( "INNEWWINDOW1_Target") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascolumnsselector")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( "DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_43_fel_idx = 0 ;
         while ( nGXsfl_43_fel_idx < nRC_GXsfl_43 )
         {
            nGXsfl_43_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_43_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_43_fel_idx+1) ;
            sGXsfl_43_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_432( ) ;
            AV32GXV1 = (int)(nGXsfl_43_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV15PrecioporColor_Cliente_SDT.size() >= AV32GXV1 ) && ( AV32GXV1 > 0 ) )
            {
               AV15PrecioporColor_Cliente_SDT.currentItem( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)) );
            }
         }
         if ( nGXsfl_43_fel_idx == 0 )
         {
            nGXsfl_43_idx = 1 ;
            sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_432( ) ;
         }
         nGXsfl_43_fel_idx = 1 ;
         /* Read variables values. */
         AV14FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14FilterFullText", AV14FilterFullText);
         AV47Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47Pgmname", AV47Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"PrecioporColor_Cliente");
         AV47Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47Pgmname", AV47Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV47Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("facturacion\\precioporcolor_cliente:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1822R2 ();
      if (returnInSub) return;
   }

   public void e1822R2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_objcol_SdtPrecioporColor_Cliente_SDT_Item1 = AV15PrecioporColor_Cliente_SDT ;
      GXv_objcol_SdtPrecioporColor_Cliente_SDT_Item2[0] = GXt_objcol_SdtPrecioporColor_Cliente_SDT_Item1 ;
      new app.facturacion.precioporcolor_cliente_dp(remoteHandle, context).execute( AV7Emprcod, AV8Clicod, GXv_objcol_SdtPrecioporColor_Cliente_SDT_Item2) ;
      GXt_objcol_SdtPrecioporColor_Cliente_SDT_Item1 = GXv_objcol_SdtPrecioporColor_Cliente_SDT_Item2[0] ;
      AV15PrecioporColor_Cliente_SDT = GXt_objcol_SdtPrecioporColor_Cliente_SDT_Item1 ;
      gx_BV43 = true ;
      GXt_char3 = AV48Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      precioporcolor_cliente_impl.this.GXt_char3 = GXv_char4[0] ;
      AV48Station = GXt_char3 ;
      GXv_char4[0] = AV7Emprcod ;
      GXv_char5[0] = AV49Emprnom ;
      GXv_char6[0] = AV50Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV48Station, GXv_char4, GXv_char5, GXv_char6) ;
      precioporcolor_cliente_impl.this.AV7Emprcod = GXv_char4[0] ;
      precioporcolor_cliente_impl.this.AV49Emprnom = GXv_char5[0] ;
      precioporcolor_cliente_impl.this.AV50Usurcod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Emprcod", AV7Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Emprcod, "@!"))));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      if ( GXutil.strcmp(AV9HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Precio por Color (Cliente)", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV26DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV26DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e1922R2( )
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
      if ( AV25ManageFiltersExecutionStep == 1 )
      {
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV25ManageFiltersExecutionStep == 2 )
      {
         AV25ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV22Session.getValue("Facturacion.PrecioporColor_ClienteColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("Facturacion.PrecioporColor_ClienteColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S142 ();
         if (returnInSub) return;
      }
      edtavPrecioporcolor_cliente_sdt__forser_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__forser_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__forser_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__forcolnum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__forcolnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__forcolnum_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__forcolnom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__forcolnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__forcolnom_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__tipcolcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__tipcolcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__tipcolcod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__fornomcli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__fornomcli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__fornomcli_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__fornumcli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__fornumcli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__fornumcli_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__new_forprekgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__new_forprekgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__new_forprekgm_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__forprefec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__forprefec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__forprefec_Visible), 5, 0), !bGXsfl_43_Refreshing);
      cmbavPrecioporcolor_cliente_sdt__forpredef.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavPrecioporcolor_cliente_sdt__forpredef.getInternalname(), "Visible", GXutil.ltrimstr( cmbavPrecioporcolor_cliente_sdt__forpredef.getVisible(), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__forcosform_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__forcosform_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__forcosform_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__coste_general_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__coste_general_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__coste_general_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__coste_total_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__coste_total_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__coste_total_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__grdtipart_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__grdtipart_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__grdtipart_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrecioporcolor_cliente_sdt__forprekgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__forprekgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__forprekgm_Visible), 5, 0), !bGXsfl_43_Refreshing);
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S152 ();
      if (returnInSub) return;
      AV28GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28GridCurrentPage), 10, 0));
      AV29GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29GridPageCount), 10, 0));
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12GridState", AV12GridState);
   }

   public void e1322R2( )
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
         AV27PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV27PageToGo) ;
      }
   }

   public void e1422R2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e2022R2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV32GXV1 = 1 ;
      while ( AV32GXV1 <= AV15PrecioporColor_Cliente_SDT.size() )
      {
         AV15PrecioporColor_Cliente_SDT.currentItem( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(43) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_432( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_43_Refreshing )
         {
            httpContext.doAjaxLoad(43, GridRow);
         }
         AV32GXV1 = (int)(AV32GXV1+1) ;
      }
   }

   public void e1522R2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "Facturacion.PrecioporColor_ClienteColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12GridState", AV12GridState);
   }

   public void e1222R2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S162 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S132 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("Facturacion.PrecioporColor_ClienteFilters")),GXutil.URLEncode(GXutil.rtrim(AV47Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("Facturacion.PrecioporColor_ClienteFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char3 = AV24ManageFiltersXml ;
         GXv_char6[0] = GXt_char3 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "Facturacion.PrecioporColor_ClienteFilters", Ddo_managefilters_Activeeventkey, GXv_char6) ;
         precioporcolor_cliente_impl.this.GXt_char3 = GXv_char6[0] ;
         AV24ManageFiltersXml = GXt_char3 ;
         if ( (GXutil.strcmp("", AV24ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S162 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV47Pgmname+"GridState", AV24ManageFiltersXml) ;
            AV12GridState.fromxml(AV24ManageFiltersXml, null, null);
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S172 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12GridState", AV12GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e1622R2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char6[0] = AV16ExcelFilename ;
      GXv_char5[0] = AV17ErrorMessage ;
      new app.facturacion.precioporcolor_clienteexport(remoteHandle, context).execute( GXv_char6, GXv_char5) ;
      precioporcolor_cliente_impl.this.AV16ExcelFilename = GXv_char6[0] ;
      precioporcolor_cliente_impl.this.AV17ErrorMessage = GXv_char5[0] ;
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

   public void e1722R2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.facturacion.precioporcolor_clienteexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
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
      AV20ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PrecioporColor_Cliente_SDT__Forser", "", "Articulo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PrecioporColor_Cliente_SDT__Forcolnum", "", "Numero Color", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PrecioporColor_Cliente_SDT__ForColnom", "", "Color", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PrecioporColor_Cliente_SDT__TipColCod", "", "TC", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PrecioporColor_Cliente_SDT__ForNomCli", "", "Color Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PrecioporColor_Cliente_SDT__ForNumCli", "", "Numero", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PrecioporColor_Cliente_SDT__New_ForPreKgm", "", "Precio Nuevo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PrecioporColor_Cliente_SDT__ForPrefec", "", "Fecha Precio Actual", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PrecioporColor_Cliente_SDT__ForPredef", "", "D?", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PrecioporColor_Cliente_SDT__ForCosForm", "", "Valor Color(K)", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PrecioporColor_Cliente_SDT__Coste_general", "", "Coste General", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PrecioporColor_Cliente_SDT__Coste_total", "", "Coste Total", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PrecioporColor_Cliente_SDT__GrdTipARt", "", "Clase", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PrecioporColor_Cliente_SDT__ForPreKgm", "", "Precio Kg. Old", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char3 = AV19UserCustomValue ;
      GXv_char6[0] = GXt_char3 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Facturacion.PrecioporColor_ClienteColumnsSelector", GXv_char6) ;
      precioporcolor_cliente_impl.this.GXt_char3 = GXv_char6[0] ;
      AV19UserCustomValue = GXt_char3 ;
      if ( ! ( (GXutil.strcmp("", AV19UserCustomValue)==0) ) )
      {
         AV21ColumnsSelectorAux.fromxml(AV19UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV21ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV21ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = AV23ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "Facturacion.PrecioporColor_ClienteFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   }

   public void S162( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV14FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14FilterFullText", AV14FilterFullText);
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV47Pgmname+"GridState"), "") == 0 )
      {
         AV12GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV47Pgmname+"GridState"), null, null);
      }
      else
      {
         AV12GridState.fromxml(AV22Session.getValue(AV47Pgmname+"GridState"), null, null);
      }
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S172 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV12GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV12GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV12GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S172( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV51GXV16 = 1 ;
      while ( AV51GXV16 <= AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV13GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV51GXV16));
         if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV14FilterFullText = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14FilterFullText", AV14FilterFullText);
         }
         AV51GXV16 = (int)(AV51GXV16+1) ;
      }
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV12GridState.fromxml(AV22Session.getValue(AV47Pgmname+"GridState"), null, null);
      AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState14[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV14FilterFullText)==0), (short)(0), AV14FilterFullText, "") ;
      AV12GridState = GXv_SdtWWPGridState14[0] ;
      if ( ! (GXutil.strcmp("", AV7Emprcod)==0) )
      {
         AV13GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV7Emprcod );
         AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV13GridStateFilterValue, 0);
      }
      if ( ! (0==AV8Clicod) )
      {
         AV13GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV8Clicod, 6, 0) );
         AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV13GridStateFilterValue, 0);
      }
      AV12GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV12GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV47Pgmname+"GridState", AV12GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void wb_table1_25_22R2( boolean wbgen )
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
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_30_22R2( true) ;
      }
      else
      {
         wb_table2_30_22R2( false) ;
      }
      return  ;
   }

   public void wb_table2_30_22R2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_22R2e( true) ;
      }
      else
      {
         wb_table1_25_22R2e( false) ;
      }
   }

   public void wb_table2_30_22R2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV14FilterFullText, GXutil.rtrim( localUtil.format( AV14FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_Facturacion\\PrecioporColor_Cliente.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_30_22R2e( true) ;
      }
      else
      {
         wb_table2_30_22R2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV7Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Emprcod", AV7Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Emprcod, "@!"))));
      AV8Clicod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Clicod), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8Clicod), "ZZZZZ9")));
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
      pa22R2( ) ;
      ws22R2( ) ;
      we22R2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116143689", true, true);
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
      httpContext.AddJavascriptSource("facturacion/precioporcolor_cliente.js", "?202682116143690", false, true);
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
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_432( )
   {
      edtavPrecioporcolor_cliente_sdt__forser_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORSER_"+sGXsfl_43_idx ;
      edtavPrecioporcolor_cliente_sdt__forcolnum_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORCOLNUM_"+sGXsfl_43_idx ;
      edtavPrecioporcolor_cliente_sdt__forcolnom_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORCOLNOM_"+sGXsfl_43_idx ;
      edtavPrecioporcolor_cliente_sdt__tipcolcod_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__TIPCOLCOD_"+sGXsfl_43_idx ;
      edtavPrecioporcolor_cliente_sdt__fornomcli_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORNOMCLI_"+sGXsfl_43_idx ;
      edtavPrecioporcolor_cliente_sdt__fornumcli_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORNUMCLI_"+sGXsfl_43_idx ;
      edtavPrecioporcolor_cliente_sdt__new_forprekgm_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__NEW_FORPREKGM_"+sGXsfl_43_idx ;
      edtavPrecioporcolor_cliente_sdt__forprefec_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORPREFEC_"+sGXsfl_43_idx ;
      cmbavPrecioporcolor_cliente_sdt__forpredef.setInternalname( "PRECIOPORCOLOR_CLIENTE_SDT__FORPREDEF_"+sGXsfl_43_idx );
      edtavPrecioporcolor_cliente_sdt__forcosform_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORCOSFORM_"+sGXsfl_43_idx ;
      edtavPrecioporcolor_cliente_sdt__coste_general_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__COSTE_GENERAL_"+sGXsfl_43_idx ;
      edtavPrecioporcolor_cliente_sdt__coste_total_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__COSTE_TOTAL_"+sGXsfl_43_idx ;
      edtavPrecioporcolor_cliente_sdt__grdtipart_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__GRDTIPART_"+sGXsfl_43_idx ;
      edtavPrecioporcolor_cliente_sdt__forprekgm_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORPREKGM_"+sGXsfl_43_idx ;
   }

   public void subsflControlProps_fel_432( )
   {
      edtavPrecioporcolor_cliente_sdt__forser_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORSER_"+sGXsfl_43_fel_idx ;
      edtavPrecioporcolor_cliente_sdt__forcolnum_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORCOLNUM_"+sGXsfl_43_fel_idx ;
      edtavPrecioporcolor_cliente_sdt__forcolnom_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORCOLNOM_"+sGXsfl_43_fel_idx ;
      edtavPrecioporcolor_cliente_sdt__tipcolcod_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__TIPCOLCOD_"+sGXsfl_43_fel_idx ;
      edtavPrecioporcolor_cliente_sdt__fornomcli_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORNOMCLI_"+sGXsfl_43_fel_idx ;
      edtavPrecioporcolor_cliente_sdt__fornumcli_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORNUMCLI_"+sGXsfl_43_fel_idx ;
      edtavPrecioporcolor_cliente_sdt__new_forprekgm_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__NEW_FORPREKGM_"+sGXsfl_43_fel_idx ;
      edtavPrecioporcolor_cliente_sdt__forprefec_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORPREFEC_"+sGXsfl_43_fel_idx ;
      cmbavPrecioporcolor_cliente_sdt__forpredef.setInternalname( "PRECIOPORCOLOR_CLIENTE_SDT__FORPREDEF_"+sGXsfl_43_fel_idx );
      edtavPrecioporcolor_cliente_sdt__forcosform_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORCOSFORM_"+sGXsfl_43_fel_idx ;
      edtavPrecioporcolor_cliente_sdt__coste_general_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__COSTE_GENERAL_"+sGXsfl_43_fel_idx ;
      edtavPrecioporcolor_cliente_sdt__coste_total_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__COSTE_TOTAL_"+sGXsfl_43_fel_idx ;
      edtavPrecioporcolor_cliente_sdt__grdtipart_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__GRDTIPART_"+sGXsfl_43_fel_idx ;
      edtavPrecioporcolor_cliente_sdt__forprekgm_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORPREKGM_"+sGXsfl_43_fel_idx ;
   }

   public void sendrow_432( )
   {
      subsflControlProps_432( ) ;
      wb22R0( ) ;
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavPrecioporcolor_cliente_sdt__forser_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecioporcolor_cliente_sdt__forser_Internalname,GXutil.rtrim( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forser()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrecioporcolor_cliente_sdt__forser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPrecioporcolor_cliente_sdt__forser_Visible),Integer.valueOf(edtavPrecioporcolor_cliente_sdt__forser_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPrecioporcolor_cliente_sdt__forcolnum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecioporcolor_cliente_sdt__forcolnum_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnum(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecioporcolor_cliente_sdt__forcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnum()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnum()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrecioporcolor_cliente_sdt__forcolnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPrecioporcolor_cliente_sdt__forcolnum_Visible),Integer.valueOf(edtavPrecioporcolor_cliente_sdt__forcolnum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavPrecioporcolor_cliente_sdt__forcolnom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecioporcolor_cliente_sdt__forcolnom_Internalname,GXutil.rtrim( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnom()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrecioporcolor_cliente_sdt__forcolnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPrecioporcolor_cliente_sdt__forcolnom_Visible),Integer.valueOf(edtavPrecioporcolor_cliente_sdt__forcolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPrecioporcolor_cliente_sdt__tipcolcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecioporcolor_cliente_sdt__tipcolcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Tipcolcod(), (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecioporcolor_cliente_sdt__tipcolcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Tipcolcod()), "Z9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Tipcolcod()), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrecioporcolor_cliente_sdt__tipcolcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPrecioporcolor_cliente_sdt__tipcolcod_Visible),Integer.valueOf(edtavPrecioporcolor_cliente_sdt__tipcolcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavPrecioporcolor_cliente_sdt__fornomcli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecioporcolor_cliente_sdt__fornomcli_Internalname,GXutil.rtrim( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornomcli()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrecioporcolor_cliente_sdt__fornomcli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPrecioporcolor_cliente_sdt__fornomcli_Visible),Integer.valueOf(edtavPrecioporcolor_cliente_sdt__fornomcli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPrecioporcolor_cliente_sdt__fornumcli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecioporcolor_cliente_sdt__fornumcli_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornumcli(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecioporcolor_cliente_sdt__fornumcli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornumcli()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornumcli()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrecioporcolor_cliente_sdt__fornumcli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPrecioporcolor_cliente_sdt__fornumcli_Visible),Integer.valueOf(edtavPrecioporcolor_cliente_sdt__fornumcli_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPrecioporcolor_cliente_sdt__new_forprekgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrecioporcolor_cliente_sdt__new_forprekgm_Enabled!=0)&&(edtavPrecioporcolor_cliente_sdt__new_forprekgm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 50,'',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecioporcolor_cliente_sdt__new_forprekgm_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_New_forprekgm(), (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_New_forprekgm(), "ZZZZZ9.999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+((edtavPrecioporcolor_cliente_sdt__new_forprekgm_Enabled!=0)&&(edtavPrecioporcolor_cliente_sdt__new_forprekgm_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,50);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrecioporcolor_cliente_sdt__new_forprekgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPrecioporcolor_cliente_sdt__new_forprekgm_Visible),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPrecioporcolor_cliente_sdt__forprefec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecioporcolor_cliente_sdt__forprefec_Internalname,localUtil.format(((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec(), "99/99/99"),localUtil.format( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec(), "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrecioporcolor_cliente_sdt__forprefec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPrecioporcolor_cliente_sdt__forprefec_Visible),Integer.valueOf(edtavPrecioporcolor_cliente_sdt__forprefec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbavPrecioporcolor_cliente_sdt__forpredef.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         TempTags = " " + ((cmbavPrecioporcolor_cliente_sdt__forpredef.getEnabled()!=0)&&(cmbavPrecioporcolor_cliente_sdt__forpredef.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 52,'',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         if ( ( cmbavPrecioporcolor_cliente_sdt__forpredef.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "PRECIOPORCOLOR_CLIENTE_SDT__FORPREDEF_" + sGXsfl_43_idx ;
            cmbavPrecioporcolor_cliente_sdt__forpredef.setName( GXCCtl );
            cmbavPrecioporcolor_cliente_sdt__forpredef.setWebtags( "" );
            cmbavPrecioporcolor_cliente_sdt__forpredef.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
            cmbavPrecioporcolor_cliente_sdt__forpredef.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
            if ( cmbavPrecioporcolor_cliente_sdt__forpredef.getItemCount() > 0 )
            {
               if ( ( AV32GXV1 > 0 ) && ( AV15PrecioporColor_Cliente_SDT.size() >= AV32GXV1 ) && (GXutil.strcmp("", ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef())==0) )
               {
                  ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef( cmbavPrecioporcolor_cliente_sdt__forpredef.getValidValue(((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef()) );
               }
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavPrecioporcolor_cliente_sdt__forpredef,cmbavPrecioporcolor_cliente_sdt__forpredef.getInternalname(),GXutil.rtrim( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef()),Integer.valueOf(1),cmbavPrecioporcolor_cliente_sdt__forpredef.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbavPrecioporcolor_cliente_sdt__forpredef.getVisible()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavPrecioporcolor_cliente_sdt__forpredef.getEnabled()!=0)&&(cmbavPrecioporcolor_cliente_sdt__forpredef.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,52);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavPrecioporcolor_cliente_sdt__forpredef.setValue( GXutil.rtrim( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef()) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavPrecioporcolor_cliente_sdt__forpredef.getInternalname(), "Values", cmbavPrecioporcolor_cliente_sdt__forpredef.ToJavascriptSource(), !bGXsfl_43_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPrecioporcolor_cliente_sdt__forcosform_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecioporcolor_cliente_sdt__forcosform_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcosform(), (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecioporcolor_cliente_sdt__forcosform_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcosform(), "ZZZZ9.99999") : localUtil.format( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcosform(), "ZZZZ9.99999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrecioporcolor_cliente_sdt__forcosform_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPrecioporcolor_cliente_sdt__forcosform_Visible),Integer.valueOf(edtavPrecioporcolor_cliente_sdt__forcosform_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPrecioporcolor_cliente_sdt__coste_general_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecioporcolor_cliente_sdt__coste_general_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_general(), (byte)(6), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecioporcolor_cliente_sdt__coste_general_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_general(), "Z9.999") : localUtil.format( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_general(), "Z9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrecioporcolor_cliente_sdt__coste_general_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPrecioporcolor_cliente_sdt__coste_general_Visible),Integer.valueOf(edtavPrecioporcolor_cliente_sdt__coste_general_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPrecioporcolor_cliente_sdt__coste_total_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecioporcolor_cliente_sdt__coste_total_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_total(), (byte)(6), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecioporcolor_cliente_sdt__coste_total_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_total(), "Z9.999") : localUtil.format( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_total(), "Z9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrecioporcolor_cliente_sdt__coste_total_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPrecioporcolor_cliente_sdt__coste_total_Visible),Integer.valueOf(edtavPrecioporcolor_cliente_sdt__coste_total_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPrecioporcolor_cliente_sdt__grdtipart_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecioporcolor_cliente_sdt__grdtipart_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Grdtipart(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecioporcolor_cliente_sdt__grdtipart_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Grdtipart()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Grdtipart()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrecioporcolor_cliente_sdt__grdtipart_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPrecioporcolor_cliente_sdt__grdtipart_Visible),Integer.valueOf(edtavPrecioporcolor_cliente_sdt__grdtipart_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPrecioporcolor_cliente_sdt__forprekgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecioporcolor_cliente_sdt__forprekgm_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprekgm(), (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecioporcolor_cliente_sdt__forprekgm_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprekgm(), "ZZZZZ9.999") : localUtil.format( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprekgm(), "ZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrecioporcolor_cliente_sdt__forprekgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPrecioporcolor_cliente_sdt__forprekgm_Visible),Integer.valueOf(edtavPrecioporcolor_cliente_sdt__forprekgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes22R2( ) ;
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
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"43\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecioporcolor_cliente_sdt__forser_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecioporcolor_cliente_sdt__forcolnum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecioporcolor_cliente_sdt__forcolnom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecioporcolor_cliente_sdt__tipcolcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "TC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecioporcolor_cliente_sdt__fornomcli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecioporcolor_cliente_sdt__fornumcli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecioporcolor_cliente_sdt__new_forprekgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio Nuevo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecioporcolor_cliente_sdt__forprefec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Precio Actual", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbavPrecioporcolor_cliente_sdt__forpredef.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "D?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecioporcolor_cliente_sdt__forcosform_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor Color(K)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecioporcolor_cliente_sdt__coste_general_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste General", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecioporcolor_cliente_sdt__coste_total_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Total", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecioporcolor_cliente_sdt__grdtipart_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Clase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrecioporcolor_cliente_sdt__forprekgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio Kg. Old", "")) ;
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
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__forser_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__forser_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__forcolnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__forcolnum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__forcolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__forcolnom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__tipcolcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__tipcolcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__fornomcli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__fornomcli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__fornumcli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__fornumcli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__new_forprekgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__forprefec_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__forprefec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbavPrecioporcolor_cliente_sdt__forpredef.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__forcosform_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__forcosform_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__coste_general_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__coste_general_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__coste_total_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__coste_total_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__grdtipart_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__grdtipart_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__forprekgm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__forprekgm_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexport_Internalname = "BTNEXPORT" ;
      bttBtnexportreport_Internalname = "BTNEXPORTREPORT" ;
      bttBtnexportcsv_Internalname = "BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      edtavPrecioporcolor_cliente_sdt__forser_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORSER" ;
      edtavPrecioporcolor_cliente_sdt__forcolnum_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORCOLNUM" ;
      edtavPrecioporcolor_cliente_sdt__forcolnom_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORCOLNOM" ;
      edtavPrecioporcolor_cliente_sdt__tipcolcod_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__TIPCOLCOD" ;
      edtavPrecioporcolor_cliente_sdt__fornomcli_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORNOMCLI" ;
      edtavPrecioporcolor_cliente_sdt__fornumcli_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORNUMCLI" ;
      edtavPrecioporcolor_cliente_sdt__new_forprekgm_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__NEW_FORPREKGM" ;
      edtavPrecioporcolor_cliente_sdt__forprefec_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORPREFEC" ;
      cmbavPrecioporcolor_cliente_sdt__forpredef.setInternalname( "PRECIOPORCOLOR_CLIENTE_SDT__FORPREDEF" );
      edtavPrecioporcolor_cliente_sdt__forcosform_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORCOSFORM" ;
      edtavPrecioporcolor_cliente_sdt__coste_general_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__COSTE_GENERAL" ;
      edtavPrecioporcolor_cliente_sdt__coste_total_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__COSTE_TOTAL" ;
      edtavPrecioporcolor_cliente_sdt__grdtipart_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__GRDTIPART" ;
      edtavPrecioporcolor_cliente_sdt__forprekgm_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORPREKGM" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
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
      edtavPrecioporcolor_cliente_sdt__forprekgm_Jsonclick = "" ;
      edtavPrecioporcolor_cliente_sdt__forprekgm_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__forprekgm_Visible = -1 ;
      edtavPrecioporcolor_cliente_sdt__grdtipart_Jsonclick = "" ;
      edtavPrecioporcolor_cliente_sdt__grdtipart_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__grdtipart_Visible = -1 ;
      edtavPrecioporcolor_cliente_sdt__coste_total_Jsonclick = "" ;
      edtavPrecioporcolor_cliente_sdt__coste_total_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__coste_total_Visible = -1 ;
      edtavPrecioporcolor_cliente_sdt__coste_general_Jsonclick = "" ;
      edtavPrecioporcolor_cliente_sdt__coste_general_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__coste_general_Visible = -1 ;
      edtavPrecioporcolor_cliente_sdt__forcosform_Jsonclick = "" ;
      edtavPrecioporcolor_cliente_sdt__forcosform_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__forcosform_Visible = -1 ;
      cmbavPrecioporcolor_cliente_sdt__forpredef.setJsonclick( "" );
      cmbavPrecioporcolor_cliente_sdt__forpredef.setEnabled( 1 );
      cmbavPrecioporcolor_cliente_sdt__forpredef.setVisible( -1 );
      edtavPrecioporcolor_cliente_sdt__forprefec_Jsonclick = "" ;
      edtavPrecioporcolor_cliente_sdt__forprefec_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__forprefec_Visible = -1 ;
      edtavPrecioporcolor_cliente_sdt__new_forprekgm_Jsonclick = "" ;
      edtavPrecioporcolor_cliente_sdt__new_forprekgm_Enabled = 1 ;
      edtavPrecioporcolor_cliente_sdt__new_forprekgm_Visible = -1 ;
      edtavPrecioporcolor_cliente_sdt__fornumcli_Jsonclick = "" ;
      edtavPrecioporcolor_cliente_sdt__fornumcli_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__fornumcli_Visible = -1 ;
      edtavPrecioporcolor_cliente_sdt__fornomcli_Jsonclick = "" ;
      edtavPrecioporcolor_cliente_sdt__fornomcli_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__fornomcli_Visible = -1 ;
      edtavPrecioporcolor_cliente_sdt__tipcolcod_Jsonclick = "" ;
      edtavPrecioporcolor_cliente_sdt__tipcolcod_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__tipcolcod_Visible = -1 ;
      edtavPrecioporcolor_cliente_sdt__forcolnom_Jsonclick = "" ;
      edtavPrecioporcolor_cliente_sdt__forcolnom_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__forcolnom_Visible = -1 ;
      edtavPrecioporcolor_cliente_sdt__forcolnum_Jsonclick = "" ;
      edtavPrecioporcolor_cliente_sdt__forcolnum_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__forcolnum_Visible = -1 ;
      edtavPrecioporcolor_cliente_sdt__forser_Jsonclick = "" ;
      edtavPrecioporcolor_cliente_sdt__forser_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__forser_Visible = -1 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavPrecioporcolor_cliente_sdt__forprekgm_Visible = -1 ;
      edtavPrecioporcolor_cliente_sdt__grdtipart_Visible = -1 ;
      edtavPrecioporcolor_cliente_sdt__coste_total_Visible = -1 ;
      edtavPrecioporcolor_cliente_sdt__coste_general_Visible = -1 ;
      edtavPrecioporcolor_cliente_sdt__forcosform_Visible = -1 ;
      cmbavPrecioporcolor_cliente_sdt__forpredef.setVisible( -1 );
      edtavPrecioporcolor_cliente_sdt__forprefec_Visible = -1 ;
      edtavPrecioporcolor_cliente_sdt__new_forprekgm_Visible = -1 ;
      edtavPrecioporcolor_cliente_sdt__fornumcli_Visible = -1 ;
      edtavPrecioporcolor_cliente_sdt__fornomcli_Visible = -1 ;
      edtavPrecioporcolor_cliente_sdt__tipcolcod_Visible = -1 ;
      edtavPrecioporcolor_cliente_sdt__forcolnom_Visible = -1 ;
      edtavPrecioporcolor_cliente_sdt__forcolnum_Visible = -1 ;
      edtavPrecioporcolor_cliente_sdt__forser_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPrecioporcolor_cliente_sdt__forprekgm_Enabled = -1 ;
      edtavPrecioporcolor_cliente_sdt__grdtipart_Enabled = -1 ;
      edtavPrecioporcolor_cliente_sdt__coste_total_Enabled = -1 ;
      edtavPrecioporcolor_cliente_sdt__coste_general_Enabled = -1 ;
      edtavPrecioporcolor_cliente_sdt__forcosform_Enabled = -1 ;
      edtavPrecioporcolor_cliente_sdt__forprefec_Enabled = -1 ;
      edtavPrecioporcolor_cliente_sdt__fornumcli_Enabled = -1 ;
      edtavPrecioporcolor_cliente_sdt__fornomcli_Enabled = -1 ;
      edtavPrecioporcolor_cliente_sdt__tipcolcod_Enabled = -1 ;
      edtavPrecioporcolor_cliente_sdt__forcolnom_Enabled = -1 ;
      edtavPrecioporcolor_cliente_sdt__forcolnum_Enabled = -1 ;
      edtavPrecioporcolor_cliente_sdt__forser_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "|||||||||||||" ;
      Ddo_grid_Columnids = "0:PrecioporColor_Cliente_SDT__Forser|1:PrecioporColor_Cliente_SDT__Forcolnum|2:PrecioporColor_Cliente_SDT__ForColnom|3:PrecioporColor_Cliente_SDT__TipColCod|4:PrecioporColor_Cliente_SDT__ForNomCli|5:PrecioporColor_Cliente_SDT__ForNumCli|6:PrecioporColor_Cliente_SDT__New_ForPreKgm|7:PrecioporColor_Cliente_SDT__ForPrefec|8:PrecioporColor_Cliente_SDT__ForPredef|9:PrecioporColor_Cliente_SDT__ForCosForm|10:PrecioporColor_Cliente_SDT__Coste_general|11:PrecioporColor_Cliente_SDT__Coste_total|12:PrecioporColor_Cliente_SDT__GrdTipARt|13:PrecioporColor_Cliente_SDT__ForPreKgm" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Precio por Color (Cliente)", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "PRECIOPORCOLOR_CLIENTE_SDT__FORPREDEF_" + sGXsfl_43_idx ;
      cmbavPrecioporcolor_cliente_sdt__forpredef.setName( GXCCtl );
      cmbavPrecioporcolor_cliente_sdt__forpredef.setWebtags( "" );
      cmbavPrecioporcolor_cliente_sdt__forpredef.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbavPrecioporcolor_cliente_sdt__forpredef.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbavPrecioporcolor_cliente_sdt__forpredef.getItemCount() > 0 )
      {
         if ( ( AV32GXV1 > 0 ) && ( AV15PrecioporColor_Cliente_SDT.size() >= AV32GXV1 ) && (GXutil.strcmp("", ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef())==0) )
         {
            ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef( cmbavPrecioporcolor_cliente_sdt__forpredef.getValidValue(((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV15PrecioporColor_Cliente_SDT.elementAt(-1+AV32GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef()) );
         }
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15PrecioporColor_Cliente_SDT',fld:'vPRECIOPORCOLOR_CLIENTE_SDT',grid:43,pic:''},{av:'nGXsfl_43_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:43},{av:'nRC_GXsfl_43',ctrl:'GRID',prop:'GridRC',grid:43},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV47Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8Clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__FORSER',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__FORCOLNUM',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__FORCOLNOM',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__TIPCOLCOD',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__FORNOMCLI',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__FORNUMCLI',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__NEW_FORPREKGM',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__FORPREFEC',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__FORPREDEF',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__FORCOSFORM',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__COSTE_GENERAL',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__COSTE_TOTAL',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__GRDTIPART',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__FORPREKGM',prop:'Visible'},{av:'AV28GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV29GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV12GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1322R2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15PrecioporColor_Cliente_SDT',fld:'vPRECIOPORCOLOR_CLIENTE_SDT',grid:43,pic:''},{av:'nGXsfl_43_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:43},{av:'nRC_GXsfl_43',ctrl:'GRID',prop:'GridRC',grid:43},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV47Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8Clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1422R2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15PrecioporColor_Cliente_SDT',fld:'vPRECIOPORCOLOR_CLIENTE_SDT',grid:43,pic:''},{av:'nGXsfl_43_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:43},{av:'nRC_GXsfl_43',ctrl:'GRID',prop:'GridRC',grid:43},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV47Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8Clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2022R2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1522R2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15PrecioporColor_Cliente_SDT',fld:'vPRECIOPORCOLOR_CLIENTE_SDT',grid:43,pic:''},{av:'nGXsfl_43_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:43},{av:'nRC_GXsfl_43',ctrl:'GRID',prop:'GridRC',grid:43},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV47Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8Clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__FORSER',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__FORCOLNUM',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__FORCOLNOM',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__TIPCOLCOD',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__FORNOMCLI',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__FORNUMCLI',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__NEW_FORPREKGM',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__FORPREFEC',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__FORPREDEF',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__FORCOSFORM',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__COSTE_GENERAL',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__COSTE_TOTAL',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__GRDTIPART',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__FORPREKGM',prop:'Visible'},{av:'AV28GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV29GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV12GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e1222R2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15PrecioporColor_Cliente_SDT',fld:'vPRECIOPORCOLOR_CLIENTE_SDT',grid:43,pic:''},{av:'nGXsfl_43_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:43},{av:'nRC_GXsfl_43',ctrl:'GRID',prop:'GridRC',grid:43},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV47Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8Clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV12GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV12GridState',fld:'vGRIDSTATE',pic:''},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__FORSER',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__FORCOLNUM',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__FORCOLNOM',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__TIPCOLCOD',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__FORNOMCLI',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__FORNUMCLI',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__NEW_FORPREKGM',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__FORPREFEC',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__FORPREDEF',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__FORCOSFORM',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__COSTE_GENERAL',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__COSTE_TOTAL',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__GRDTIPART',prop:'Visible'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__FORPREKGM',prop:'Visible'},{av:'AV28GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV29GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1622R2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e1122R1',iparms:[]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e1722R2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALIDV_GXV10","{handler:'validv_Gxv10',iparms:[]");
      setEventMetadata("VALIDV_GXV10",",oparms:[]}");
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
      wcpOAV7Emprcod = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV7Emprcod = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV47Pgmname = "" ;
      AV14FilterFullText = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV15PrecioporColor_Cliente_SDT = new GXBaseCollection<app.facturacion.SdtPrecioporColor_Cliente_SDT_Item>(app.facturacion.SdtPrecioporColor_Cliente_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV26DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV12GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
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
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      hsh = "" ;
      GXt_objcol_SdtPrecioporColor_Cliente_SDT_Item1 = new GXBaseCollection<app.facturacion.SdtPrecioporColor_Cliente_SDT_Item>(app.facturacion.SdtPrecioporColor_Cliente_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      GXv_objcol_SdtPrecioporColor_Cliente_SDT_Item2 = new GXBaseCollection[1] ;
      AV48Station = "" ;
      GXv_char4 = new String[1] ;
      AV49Emprnom = "" ;
      AV50Usurcod = "" ;
      AV9HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV22Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV24ManageFiltersXml = "" ;
      AV16ExcelFilename = "" ;
      AV17ErrorMessage = "" ;
      GXv_char5 = new String[1] ;
      AV19UserCustomValue = "" ;
      GXt_char3 = "" ;
      GXv_char6 = new String[1] ;
      AV21ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = new GXBaseCollection[1] ;
      AV13GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState14 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV47Pgmname = "Facturacion.PrecioporColor_Cliente" ;
      /* GeneXus formulas. */
      AV47Pgmname = "Facturacion.PrecioporColor_Cliente" ;
      Gx_err = (short)(0) ;
      edtavPrecioporcolor_cliente_sdt__forser_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__forcolnum_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__forcolnom_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__tipcolcod_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__fornomcli_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__fornumcli_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__forprefec_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__forcosform_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__coste_general_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__coste_total_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__grdtipart_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__forprekgm_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
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
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV8Clicod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_43 ;
   private int AV8Clicod ;
   private int nGXsfl_43_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV32GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavPrecioporcolor_cliente_sdt__forser_Enabled ;
   private int edtavPrecioporcolor_cliente_sdt__forcolnum_Enabled ;
   private int edtavPrecioporcolor_cliente_sdt__forcolnom_Enabled ;
   private int edtavPrecioporcolor_cliente_sdt__tipcolcod_Enabled ;
   private int edtavPrecioporcolor_cliente_sdt__fornomcli_Enabled ;
   private int edtavPrecioporcolor_cliente_sdt__fornumcli_Enabled ;
   private int edtavPrecioporcolor_cliente_sdt__forprefec_Enabled ;
   private int edtavPrecioporcolor_cliente_sdt__forcosform_Enabled ;
   private int edtavPrecioporcolor_cliente_sdt__coste_general_Enabled ;
   private int edtavPrecioporcolor_cliente_sdt__coste_total_Enabled ;
   private int edtavPrecioporcolor_cliente_sdt__grdtipart_Enabled ;
   private int edtavPrecioporcolor_cliente_sdt__forprekgm_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_43_fel_idx=1 ;
   private int edtavPrecioporcolor_cliente_sdt__forser_Visible ;
   private int edtavPrecioporcolor_cliente_sdt__forcolnum_Visible ;
   private int edtavPrecioporcolor_cliente_sdt__forcolnom_Visible ;
   private int edtavPrecioporcolor_cliente_sdt__tipcolcod_Visible ;
   private int edtavPrecioporcolor_cliente_sdt__fornomcli_Visible ;
   private int edtavPrecioporcolor_cliente_sdt__fornumcli_Visible ;
   private int edtavPrecioporcolor_cliente_sdt__new_forprekgm_Visible ;
   private int edtavPrecioporcolor_cliente_sdt__forprefec_Visible ;
   private int edtavPrecioporcolor_cliente_sdt__forcosform_Visible ;
   private int edtavPrecioporcolor_cliente_sdt__coste_general_Visible ;
   private int edtavPrecioporcolor_cliente_sdt__coste_total_Visible ;
   private int edtavPrecioporcolor_cliente_sdt__grdtipart_Visible ;
   private int edtavPrecioporcolor_cliente_sdt__forprekgm_Visible ;
   private int AV27PageToGo ;
   private int AV51GXV16 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavPrecioporcolor_cliente_sdt__new_forprekgm_Enabled ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV28GridCurrentPage ;
   private long AV29GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV7Emprcod ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV7Emprcod ;
   private String sGXsfl_43_idx="0001" ;
   private String AV47Pgmname ;
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
   private String Innewwindow1_Width ;
   private String Innewwindow1_Height ;
   private String Innewwindow1_Target ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
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
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String edtavPrecioporcolor_cliente_sdt__forser_Internalname ;
   private String edtavPrecioporcolor_cliente_sdt__forcolnum_Internalname ;
   private String edtavPrecioporcolor_cliente_sdt__forcolnom_Internalname ;
   private String edtavPrecioporcolor_cliente_sdt__tipcolcod_Internalname ;
   private String edtavPrecioporcolor_cliente_sdt__fornomcli_Internalname ;
   private String edtavPrecioporcolor_cliente_sdt__fornumcli_Internalname ;
   private String edtavPrecioporcolor_cliente_sdt__forprefec_Internalname ;
   private String edtavPrecioporcolor_cliente_sdt__forcosform_Internalname ;
   private String edtavPrecioporcolor_cliente_sdt__coste_general_Internalname ;
   private String edtavPrecioporcolor_cliente_sdt__coste_total_Internalname ;
   private String edtavPrecioporcolor_cliente_sdt__grdtipart_Internalname ;
   private String edtavPrecioporcolor_cliente_sdt__forprekgm_Internalname ;
   private String sGXsfl_43_fel_idx="0001" ;
   private String hsh ;
   private String AV48Station ;
   private String GXv_char4[] ;
   private String AV49Emprnom ;
   private String AV50Usurcod ;
   private String edtavPrecioporcolor_cliente_sdt__new_forprekgm_Internalname ;
   private String GXv_char5[] ;
   private String GXt_char3 ;
   private String GXv_char6[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavPrecioporcolor_cliente_sdt__forser_Jsonclick ;
   private String edtavPrecioporcolor_cliente_sdt__forcolnum_Jsonclick ;
   private String edtavPrecioporcolor_cliente_sdt__forcolnom_Jsonclick ;
   private String edtavPrecioporcolor_cliente_sdt__tipcolcod_Jsonclick ;
   private String edtavPrecioporcolor_cliente_sdt__fornomcli_Jsonclick ;
   private String edtavPrecioporcolor_cliente_sdt__fornumcli_Jsonclick ;
   private String edtavPrecioporcolor_cliente_sdt__new_forprekgm_Jsonclick ;
   private String edtavPrecioporcolor_cliente_sdt__forprefec_Jsonclick ;
   private String GXCCtl ;
   private String edtavPrecioporcolor_cliente_sdt__forcosform_Jsonclick ;
   private String edtavPrecioporcolor_cliente_sdt__coste_general_Jsonclick ;
   private String edtavPrecioporcolor_cliente_sdt__coste_total_Jsonclick ;
   private String edtavPrecioporcolor_cliente_sdt__grdtipart_Jsonclick ;
   private String edtavPrecioporcolor_cliente_sdt__forprekgm_Jsonclick ;
   private String subGrid_Header ;
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
   private boolean bGXsfl_43_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV43 ;
   private boolean gx_refresh_fired ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV14FilterFullText ;
   private String AV16ExcelFilename ;
   private String AV17ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV9HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavPrecioporcolor_cliente_sdt__forpredef ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.facturacion.SdtPrecioporColor_Cliente_SDT_Item> AV15PrecioporColor_Cliente_SDT ;
   private GXBaseCollection<app.facturacion.SdtPrecioporColor_Cliente_SDT_Item> GXt_objcol_SdtPrecioporColor_Cliente_SDT_Item1 ;
   private GXBaseCollection<app.facturacion.SdtPrecioporColor_Cliente_SDT_Item> GXv_objcol_SdtPrecioporColor_Cliente_SDT_Item2[] ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV12GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState14[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV13GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV26DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
}

