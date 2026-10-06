package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class precioporcolor_cliente_wp_impl extends GXDataArea
{
   public precioporcolor_cliente_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public precioporcolor_cliente_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( precioporcolor_cliente_wp_impl.class ));
   }

   public precioporcolor_cliente_wp_impl( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactiongroup1 = new HTMLChoice();
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
            AV26Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26Emprcod", AV26Emprcod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV27CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27CliCod), 6, 0));
               AV28CliNom = httpContext.GetPar( "CliNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28CliNom", AV28CliNom);
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
      nRC_GXsfl_44 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_44"))) ;
      nGXsfl_44_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_44_idx"))) ;
      sGXsfl_44_idx = httpContext.GetPar( "sGXsfl_44_idx") ;
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
      AV58Pgmname = httpContext.GetPar( "Pgmname") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV13PrecioporColor_Cliente_SDT);
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV58Pgmname, AV13PrecioporColor_Cliente_SDT) ;
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
      pa2302( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2302( ) ;
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.precioporcolor_cliente_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV26Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV27CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV28CliNom))}, new String[] {"Emprcod","CliCod","CliNom"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRECIOPORCOLOR_CLIENTE_SDT", getSecureSignedToken( "", AV13PrecioporColor_Cliente_SDT));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"PrecioporColor_Cliente_WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV58Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\precioporcolor_cliente_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Precioporcolor_cliente_sdt", AV13PrecioporColor_Cliente_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Precioporcolor_cliente_sdt", AV13PrecioporColor_Cliente_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Precioporcolor_cliente_sdt", getSecureSignedToken( "", AV13PrecioporColor_Cliente_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_44", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_44, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV24GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV25GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV26Emprcod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRECIOPORCOLOR_CLIENTE_SDT", AV13PrecioporColor_Cliente_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRECIOPORCOLOR_CLIENTE_SDT", AV13PrecioporColor_Cliente_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRECIOPORCOLOR_CLIENTE_SDT", getSecureSignedToken( "", AV13PrecioporColor_Cliente_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Title", GXutil.rtrim( Dvelop_confirmpanel_enter_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
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
         we2302( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2302( ) ;
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
      return formatLink("app.facturacion.precioporcolor_cliente_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV26Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV27CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV28CliNom))}, new String[] {"Emprcod","CliCod","CliNom"})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.PrecioporColor_Cliente_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Precio por Color Cliente", "") ;
   }

   public void wb2300( )
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV27CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV27CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV27CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\PrecioporColor_Cliente_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV28CliNom), GXutil.rtrim( localUtil.format( AV28CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\PrecioporColor_Cliente_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 44, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\PrecioporColor_Cliente_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 44, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\PrecioporColor_Cliente_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         startgridcontrol44( ) ;
      }
      if ( wbEnd == 44 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_44 = (int)(nGXsfl_44_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV43GXV1 = nGXsfl_44_idx ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV24GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV25GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV58Pgmname), GXutil.rtrim( localUtil.format( AV58Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\PrecioporColor_Cliente_WP.htm");
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
         wb_table1_73_2302( true) ;
      }
      else
      {
         wb_table1_73_2302( false) ;
      }
      return  ;
   }

   public void wb_table1_73_2302e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 44 )
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
               AV43GXV1 = nGXsfl_44_idx ;
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

   public void start2302( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Precio por Color Cliente", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2300( ) ;
   }

   public void ws2302( )
   {
      start2302( ) ;
      evt2302( ) ;
   }

   public void evt2302( )
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
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e112302 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122302 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ENTER.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132302 ();
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
                                 e142302 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e152302 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) )
                        {
                           nGXsfl_44_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_442( ) ;
                           AV43GXV1 = (int)(nGXsfl_44_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV13PrecioporColor_Cliente_SDT.size() >= AV43GXV1 ) && ( AV43GXV1 > 0 ) )
                           {
                              AV13PrecioporColor_Cliente_SDT.currentItem( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)) );
                              cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
                              cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
                              AV40GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
                              httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40GridActionGroup1), 4, 0));
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
                                 e162302 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e172302 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e182302 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONGROUP1.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e192302 ();
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

   public void we2302( )
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

   public void pa2302( )
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
      subsflControlProps_442( ) ;
      while ( nGXsfl_44_idx <= nRC_GXsfl_44 )
      {
         sendrow_442( ) ;
         nGXsfl_44_idx = ((subGrid_Islastpage==1)&&(nGXsfl_44_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_44_idx+1) ;
         sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_442( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV58Pgmname ,
                                 GXBaseCollection<app.facturacion.SdtPrecioporColor_Cliente_SDT_Item> AV13PrecioporColor_Cliente_SDT )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e172302 ();
      GRID_nCurrentRecord = 0 ;
      rf2302( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"PrecioporColor_Cliente_WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV58Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\precioporcolor_cliente_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf2302( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV58Pgmname = "Facturacion.PrecioporColor_Cliente_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58Pgmname", AV58Pgmname);
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavPrecioporcolor_cliente_sdt__forser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__forser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__forser_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavPrecioporcolor_cliente_sdt__forcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__forcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__forcolnum_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavPrecioporcolor_cliente_sdt__forcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__forcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__forcolnom_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavPrecioporcolor_cliente_sdt__tipcolcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__tipcolcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__tipcolcod_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavPrecioporcolor_cliente_sdt__fornomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__fornomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__fornomcli_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavPrecioporcolor_cliente_sdt__fornumcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__fornumcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__fornumcli_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavPrecioporcolor_cliente_sdt__forprefec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__forprefec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__forprefec_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavPrecioporcolor_cliente_sdt__forcosform_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__forcosform_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__forcosform_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavPrecioporcolor_cliente_sdt__coste_general_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__coste_general_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__coste_general_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavPrecioporcolor_cliente_sdt__coste_total_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__coste_total_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__coste_total_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavPrecioporcolor_cliente_sdt__forprekgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__forprekgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__forprekgm_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavPrecioporcolor_cliente_sdt__grdtipart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__grdtipart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__grdtipart_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2302( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(44) ;
      /* Execute user event: Refresh */
      e172302 ();
      nGXsfl_44_idx = 1 ;
      sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_442( ) ;
      bGXsfl_44_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_442( ) ;
         e182302 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_44_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e182302 ();
         }
         wbEnd = (short)(44) ;
         wb2300( ) ;
      }
      bGXsfl_44_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2302( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRECIOPORCOLOR_CLIENTE_SDT", AV13PrecioporColor_Cliente_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRECIOPORCOLOR_CLIENTE_SDT", AV13PrecioporColor_Cliente_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRECIOPORCOLOR_CLIENTE_SDT", getSecureSignedToken( "", AV13PrecioporColor_Cliente_SDT));
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
      return AV13PrecioporColor_Cliente_SDT.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV58Pgmname, AV13PrecioporColor_Cliente_SDT) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV58Pgmname, AV13PrecioporColor_Cliente_SDT) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV58Pgmname, AV13PrecioporColor_Cliente_SDT) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV58Pgmname, AV13PrecioporColor_Cliente_SDT) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV58Pgmname, AV13PrecioporColor_Cliente_SDT) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV58Pgmname = "Facturacion.PrecioporColor_Cliente_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58Pgmname", AV58Pgmname);
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavPrecioporcolor_cliente_sdt__forser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__forser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__forser_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavPrecioporcolor_cliente_sdt__forcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__forcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__forcolnum_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavPrecioporcolor_cliente_sdt__forcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__forcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__forcolnom_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavPrecioporcolor_cliente_sdt__tipcolcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__tipcolcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__tipcolcod_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavPrecioporcolor_cliente_sdt__fornomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__fornomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__fornomcli_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavPrecioporcolor_cliente_sdt__fornumcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__fornumcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__fornumcli_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavPrecioporcolor_cliente_sdt__forprefec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__forprefec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__forprefec_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavPrecioporcolor_cliente_sdt__forcosform_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__forcosform_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__forcosform_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavPrecioporcolor_cliente_sdt__coste_general_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__coste_general_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__coste_general_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavPrecioporcolor_cliente_sdt__coste_total_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__coste_total_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__coste_total_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavPrecioporcolor_cliente_sdt__forprekgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__forprekgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__forprekgm_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavPrecioporcolor_cliente_sdt__grdtipart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__grdtipart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecioporcolor_cliente_sdt__grdtipart_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2300( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e162302 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Precioporcolor_cliente_sdt"), AV13PrecioporColor_Cliente_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPRECIOPORCOLOR_CLIENTE_SDT"), AV13PrecioporColor_Cliente_SDT);
         /* Read saved values. */
         nRC_GXsfl_44 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_44"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV24GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV25GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Dvelop_confirmpanel_enter_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Title") ;
         Dvelop_confirmpanel_enter_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext") ;
         Dvelop_confirmpanel_enter_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption") ;
         Dvelop_confirmpanel_enter_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption") ;
         Dvelop_confirmpanel_enter_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_enter_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition") ;
         Dvelop_confirmpanel_enter_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Dvelop_confirmpanel_enter_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Result") ;
         nRC_GXsfl_44 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_44"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_44_fel_idx = 0 ;
         while ( nGXsfl_44_fel_idx < nRC_GXsfl_44 )
         {
            nGXsfl_44_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_44_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_44_fel_idx+1) ;
            sGXsfl_44_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_442( ) ;
            AV43GXV1 = (int)(nGXsfl_44_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV13PrecioporColor_Cliente_SDT.size() >= AV43GXV1 ) && ( AV43GXV1 > 0 ) )
            {
               AV13PrecioporColor_Cliente_SDT.currentItem( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)) );
               cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
               cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
               AV40GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
            }
         }
         if ( nGXsfl_44_fel_idx == 0 )
         {
            nGXsfl_44_idx = 1 ;
            sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_442( ) ;
         }
         nGXsfl_44_fel_idx = 1 ;
         /* Read variables values. */
         AV58Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58Pgmname", AV58Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"PrecioporColor_Cliente_WP");
         AV58Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58Pgmname", AV58Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV58Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("facturacion\\precioporcolor_cliente_wp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e162302 ();
      if (returnInSub) return;
   }

   public void e162302( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_objcol_SdtPrecioporColor_Cliente_SDT_Item1 = AV13PrecioporColor_Cliente_SDT ;
      GXv_objcol_SdtPrecioporColor_Cliente_SDT_Item2[0] = GXt_objcol_SdtPrecioporColor_Cliente_SDT_Item1 ;
      new app.facturacion.precioporcolor_cliente_dp(remoteHandle, context).execute( AV26Emprcod, AV27CliCod, GXv_objcol_SdtPrecioporColor_Cliente_SDT_Item2) ;
      GXt_objcol_SdtPrecioporColor_Cliente_SDT_Item1 = GXv_objcol_SdtPrecioporColor_Cliente_SDT_Item2[0] ;
      AV13PrecioporColor_Cliente_SDT = GXt_objcol_SdtPrecioporColor_Cliente_SDT_Item1 ;
      gx_BV44 = true ;
      GXt_char3 = AV37Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      precioporcolor_cliente_wp_impl.this.GXt_char3 = GXv_char4[0] ;
      AV37Station = GXt_char3 ;
      GXv_char4[0] = AV26Emprcod ;
      GXv_char5[0] = AV38EmprNom ;
      GXv_char6[0] = AV39UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV37Station, GXv_char4, GXv_char5, GXv_char6) ;
      precioporcolor_cliente_wp_impl.this.AV26Emprcod = GXv_char4[0] ;
      precioporcolor_cliente_wp_impl.this.AV38EmprNom = GXv_char5[0] ;
      precioporcolor_cliente_wp_impl.this.AV39UsurCod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Emprcod", AV26Emprcod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Precio por Color Cliente", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e172302( )
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
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S132 ();
      if (returnInSub) return;
      AV24GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24GridCurrentPage), 10, 0));
      AV25GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25GridPageCount), 10, 0));
      edtavPrecioporcolor_cliente_sdt__new_forprekgm_Columnheaderclass = "WWColumn ColumnColorSuccess" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrecioporcolor_cliente_sdt__new_forprekgm_Internalname, "Columnheaderclass", edtavPrecioporcolor_cliente_sdt__new_forprekgm_Columnheaderclass, !bGXsfl_44_Refreshing);
      /*  Sending Event outputs  */
   }

   public void e112302( )
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
         AV23PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV23PageToGo) ;
      }
   }

   public void e122302( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e182302( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV43GXV1 = 1 ;
      while ( AV43GXV1 <= AV13PrecioporColor_Cliente_SDT.size() )
      {
         AV13PrecioporColor_Cliente_SDT.currentItem( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)) );
         cmbavGridactiongroup1.removeAllItems();
         cmbavGridactiongroup1.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactiongroup1.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Recargos", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         edtavPrecioporcolor_cliente_sdt__new_forprekgm_Columnclass = "WWColumn ColumnColorSuccess WWColumnSuccess WWColumnSuccessSingleCell" ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(44) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_442( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_44_Refreshing )
         {
            httpContext.doAjaxLoad(44, GridRow);
         }
         AV43GXV1 = (int)(AV43GXV1+1) ;
      }
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV40GridActionGroup1, 4, 0)) );
   }

   public void e192302( )
   {
      AV43GXV1 = (int)(nGXsfl_44_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV43GXV1 > 0 ) && ( AV13PrecioporColor_Cliente_SDT.size() >= AV43GXV1 ) )
      {
         AV13PrecioporColor_Cliente_SDT.currentItem( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)) );
      }
      /* Gridactiongroup1_Click Routine */
      returnInSub = false ;
      if ( AV40GridActionGroup1 == 1 )
      {
         /* Execute user subroutine: 'DO USERACTION1' */
         S142 ();
         if (returnInSub) return;
      }
      AV40GridActionGroup1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40GridActionGroup1), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV40GridActionGroup1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), true);
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e142302 ();
      if (returnInSub) return;
   }

   public void e142302( )
   {
      /* Enter Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ENTERContainer", "Confirm", "", new Object[] {});
   }

   public void e132302( )
   {
      AV43GXV1 = (int)(nGXsfl_44_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV43GXV1 > 0 ) && ( AV13PrecioporColor_Cliente_SDT.size() >= AV43GXV1 ) )
      {
         AV13PrecioporColor_Cliente_SDT.currentItem( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)) );
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

   public void e152302( )
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

   public void S132( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
   }

   public void S142( )
   {
      /* 'DO USERACTION1' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.facturacion.treccor_wp", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV26Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV27CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)(AV13PrecioporColor_Cliente_SDT.currentItem())).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forser())),GXutil.URLEncode(GXutil.rtrim(((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)(AV13PrecioporColor_Cliente_SDT.currentItem())).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnom())),GXutil.URLEncode(GXutil.ltrimstr(((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)(AV13PrecioporColor_Cliente_SDT.currentItem())).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnum(),6,0)),GXutil.URLEncode(GXutil.ltrimstr(((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)(AV13PrecioporColor_Cliente_SDT.currentItem())).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Tipcolcod(),2,0))}, new String[] {"Mode","emprcod","CliCod","ForSer","ForColNom","ForColNum","TipColCod"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S152( )
   {
      /* 'DO ACTION ENTER' Routine */
      returnInSub = false ;
      AV59GXV16 = 1 ;
      while ( AV59GXV16 <= AV13PrecioporColor_Cliente_SDT.size() )
      {
         AV29Item_PrecioporColor_Cliente_SDT = (app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV59GXV16));
         AV30NewPreKgm = AV29Item_PrecioporColor_Cliente_SDT.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_New_forprekgm() ;
         AV36Forprekgm = AV29Item_PrecioporColor_Cliente_SDT.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprekgm() ;
         AV31Predef = AV29Item_PrecioporColor_Cliente_SDT.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef() ;
         AV32ForSer = AV29Item_PrecioporColor_Cliente_SDT.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forser() ;
         AV33ForColNom = AV29Item_PrecioporColor_Cliente_SDT.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnom() ;
         AV34ForColNum = AV29Item_PrecioporColor_Cliente_SDT.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnum() ;
         AV35tipcolcod = AV29Item_PrecioporColor_Cliente_SDT.getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Tipcolcod() ;
         if ( DecimalUtil.compareTo(AV30NewPreKgm, AV36Forprekgm) != 0 )
         {
            GXv_char6[0] = AV26Emprcod ;
            GXv_int8[0] = AV27CliCod ;
            GXv_char5[0] = AV32ForSer ;
            GXv_char4[0] = AV33ForColNom ;
            GXv_int9[0] = AV34ForColNum ;
            GXv_int10[0] = AV35tipcolcod ;
            GXv_decimal11[0] = AV30NewPreKgm ;
            GXv_decimal12[0] = DecimalUtil.doubleToDec(0) ;
            GXv_char13[0] = AV31Predef ;
            GXv_int14[0] = (byte)(0) ;
            GXv_char15[0] = " " ;
            new app.pmodpre(remoteHandle, context).execute( GXv_char6, GXv_int8, GXv_char5, GXv_char4, GXv_int9, GXv_int10, GXv_decimal11, GXv_decimal12, GXv_char13, GXv_int14, GXv_char15) ;
            precioporcolor_cliente_wp_impl.this.AV26Emprcod = GXv_char6[0] ;
            precioporcolor_cliente_wp_impl.this.AV27CliCod = GXv_int8[0] ;
            precioporcolor_cliente_wp_impl.this.AV32ForSer = GXv_char5[0] ;
            precioporcolor_cliente_wp_impl.this.AV33ForColNom = GXv_char4[0] ;
            precioporcolor_cliente_wp_impl.this.AV34ForColNum = GXv_int9[0] ;
            precioporcolor_cliente_wp_impl.this.AV35tipcolcod = GXv_int10[0] ;
            precioporcolor_cliente_wp_impl.this.AV30NewPreKgm = GXv_decimal11[0] ;
            precioporcolor_cliente_wp_impl.this.AV31Predef = GXv_char13[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26Emprcod", AV26Emprcod);
            httpContext.ajax_rsp_assign_attri("", false, "AV27CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27CliCod), 6, 0));
         }
         AV59GXV16 = (int)(AV59GXV16+1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV18Session.getValue(AV58Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV58Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV18Session.getValue(AV58Pgmname+"GridState"), null, null);
      }
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S122( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV18Session.getValue(AV58Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV58Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void wb_table1_73_2302( boolean wbgen )
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
         wb_table1_73_2302e( true) ;
      }
      else
      {
         wb_table1_73_2302e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV26Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Emprcod", AV26Emprcod);
      AV27CliCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27CliCod), 6, 0));
      AV28CliNom = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28CliNom", AV28CliNom);
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
      pa2302( ) ;
      ws2302( ) ;
      we2302( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116143763", true, true);
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
      httpContext.AddJavascriptSource("facturacion/precioporcolor_cliente_wp.js", "?202682116143764", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_442( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_44_idx );
      edtavPrecioporcolor_cliente_sdt__forser_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORSER_"+sGXsfl_44_idx ;
      edtavPrecioporcolor_cliente_sdt__forcolnum_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORCOLNUM_"+sGXsfl_44_idx ;
      edtavPrecioporcolor_cliente_sdt__forcolnom_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORCOLNOM_"+sGXsfl_44_idx ;
      edtavPrecioporcolor_cliente_sdt__tipcolcod_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__TIPCOLCOD_"+sGXsfl_44_idx ;
      edtavPrecioporcolor_cliente_sdt__fornomcli_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORNOMCLI_"+sGXsfl_44_idx ;
      edtavPrecioporcolor_cliente_sdt__fornumcli_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORNUMCLI_"+sGXsfl_44_idx ;
      edtavPrecioporcolor_cliente_sdt__new_forprekgm_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__NEW_FORPREKGM_"+sGXsfl_44_idx ;
      edtavPrecioporcolor_cliente_sdt__forprefec_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORPREFEC_"+sGXsfl_44_idx ;
      cmbavPrecioporcolor_cliente_sdt__forpredef.setInternalname( "PRECIOPORCOLOR_CLIENTE_SDT__FORPREDEF_"+sGXsfl_44_idx );
      edtavPrecioporcolor_cliente_sdt__forcosform_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORCOSFORM_"+sGXsfl_44_idx ;
      edtavPrecioporcolor_cliente_sdt__coste_general_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__COSTE_GENERAL_"+sGXsfl_44_idx ;
      edtavPrecioporcolor_cliente_sdt__coste_total_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__COSTE_TOTAL_"+sGXsfl_44_idx ;
      edtavPrecioporcolor_cliente_sdt__forprekgm_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORPREKGM_"+sGXsfl_44_idx ;
      edtavPrecioporcolor_cliente_sdt__grdtipart_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__GRDTIPART_"+sGXsfl_44_idx ;
   }

   public void subsflControlProps_fel_442( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_44_fel_idx );
      edtavPrecioporcolor_cliente_sdt__forser_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORSER_"+sGXsfl_44_fel_idx ;
      edtavPrecioporcolor_cliente_sdt__forcolnum_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORCOLNUM_"+sGXsfl_44_fel_idx ;
      edtavPrecioporcolor_cliente_sdt__forcolnom_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORCOLNOM_"+sGXsfl_44_fel_idx ;
      edtavPrecioporcolor_cliente_sdt__tipcolcod_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__TIPCOLCOD_"+sGXsfl_44_fel_idx ;
      edtavPrecioporcolor_cliente_sdt__fornomcli_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORNOMCLI_"+sGXsfl_44_fel_idx ;
      edtavPrecioporcolor_cliente_sdt__fornumcli_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORNUMCLI_"+sGXsfl_44_fel_idx ;
      edtavPrecioporcolor_cliente_sdt__new_forprekgm_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__NEW_FORPREKGM_"+sGXsfl_44_fel_idx ;
      edtavPrecioporcolor_cliente_sdt__forprefec_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORPREFEC_"+sGXsfl_44_fel_idx ;
      cmbavPrecioporcolor_cliente_sdt__forpredef.setInternalname( "PRECIOPORCOLOR_CLIENTE_SDT__FORPREDEF_"+sGXsfl_44_fel_idx );
      edtavPrecioporcolor_cliente_sdt__forcosform_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORCOSFORM_"+sGXsfl_44_fel_idx ;
      edtavPrecioporcolor_cliente_sdt__coste_general_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__COSTE_GENERAL_"+sGXsfl_44_fel_idx ;
      edtavPrecioporcolor_cliente_sdt__coste_total_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__COSTE_TOTAL_"+sGXsfl_44_fel_idx ;
      edtavPrecioporcolor_cliente_sdt__forprekgm_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORPREKGM_"+sGXsfl_44_fel_idx ;
      edtavPrecioporcolor_cliente_sdt__grdtipart_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__GRDTIPART_"+sGXsfl_44_fel_idx ;
   }

   public void sendrow_442( )
   {
      subsflControlProps_442( ) ;
      wb2300( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_44_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_44_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_44_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 45,'',false,'"+sGXsfl_44_idx+"',44)\"" : " ") ;
         if ( ( cmbavGridactiongroup1.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_44_idx ;
            cmbavGridactiongroup1.setName( GXCCtl );
            cmbavGridactiongroup1.setWebtags( "" );
            if ( cmbavGridactiongroup1.getItemCount() > 0 )
            {
               if ( ( AV43GXV1 > 0 ) && ( AV13PrecioporColor_Cliente_SDT.size() >= AV43GXV1 ) && (0==AV40GridActionGroup1) )
               {
                  AV40GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV40GridActionGroup1, 4, 0))))) ;
                  httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40GridActionGroup1), 4, 0));
               }
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactiongroup1,cmbavGridactiongroup1.getInternalname(),GXutil.trim( GXutil.str( AV40GridActionGroup1, 4, 0)),Integer.valueOf(1),cmbavGridactiongroup1.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONGROUP1.CLICK."+sGXsfl_44_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,45);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV40GridActionGroup1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), !bGXsfl_44_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecioporcolor_cliente_sdt__forser_Internalname,GXutil.rtrim( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forser()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrecioporcolor_cliente_sdt__forser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPrecioporcolor_cliente_sdt__forser_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecioporcolor_cliente_sdt__forcolnum_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnum(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecioporcolor_cliente_sdt__forcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnum()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnum()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrecioporcolor_cliente_sdt__forcolnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPrecioporcolor_cliente_sdt__forcolnum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecioporcolor_cliente_sdt__forcolnom_Internalname,GXutil.rtrim( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnom()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrecioporcolor_cliente_sdt__forcolnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPrecioporcolor_cliente_sdt__forcolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecioporcolor_cliente_sdt__tipcolcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Tipcolcod(), (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecioporcolor_cliente_sdt__tipcolcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Tipcolcod()), "Z9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Tipcolcod()), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrecioporcolor_cliente_sdt__tipcolcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPrecioporcolor_cliente_sdt__tipcolcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecioporcolor_cliente_sdt__fornomcli_Internalname,GXutil.rtrim( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornomcli()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrecioporcolor_cliente_sdt__fornomcli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPrecioporcolor_cliente_sdt__fornomcli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecioporcolor_cliente_sdt__fornumcli_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornumcli(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecioporcolor_cliente_sdt__fornumcli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornumcli()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornumcli()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrecioporcolor_cliente_sdt__fornumcli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPrecioporcolor_cliente_sdt__fornumcli_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrecioporcolor_cliente_sdt__new_forprekgm_Enabled!=0)&&(edtavPrecioporcolor_cliente_sdt__new_forprekgm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 52,'',false,'"+sGXsfl_44_idx+"',44)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecioporcolor_cliente_sdt__new_forprekgm_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_New_forprekgm(), (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_New_forprekgm(), "ZZZZZ9.999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+((edtavPrecioporcolor_cliente_sdt__new_forprekgm_Enabled!=0)&&(edtavPrecioporcolor_cliente_sdt__new_forprekgm_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,52);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrecioporcolor_cliente_sdt__new_forprekgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavPrecioporcolor_cliente_sdt__new_forprekgm_Columnclass,edtavPrecioporcolor_cliente_sdt__new_forprekgm_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecioporcolor_cliente_sdt__forprefec_Internalname,localUtil.format(((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec(), "99/99/99"),localUtil.format( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec(), "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrecioporcolor_cliente_sdt__forprefec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPrecioporcolor_cliente_sdt__forprefec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavPrecioporcolor_cliente_sdt__forpredef.getEnabled()!=0)&&(cmbavPrecioporcolor_cliente_sdt__forpredef.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 54,'',false,'"+sGXsfl_44_idx+"',44)\"" : " ") ;
         if ( ( cmbavPrecioporcolor_cliente_sdt__forpredef.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "PRECIOPORCOLOR_CLIENTE_SDT__FORPREDEF_" + sGXsfl_44_idx ;
            cmbavPrecioporcolor_cliente_sdt__forpredef.setName( GXCCtl );
            cmbavPrecioporcolor_cliente_sdt__forpredef.setWebtags( "" );
            cmbavPrecioporcolor_cliente_sdt__forpredef.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
            cmbavPrecioporcolor_cliente_sdt__forpredef.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
            if ( cmbavPrecioporcolor_cliente_sdt__forpredef.getItemCount() > 0 )
            {
               if ( ( AV43GXV1 > 0 ) && ( AV13PrecioporColor_Cliente_SDT.size() >= AV43GXV1 ) && (GXutil.strcmp("", ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef())==0) )
               {
                  ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef( cmbavPrecioporcolor_cliente_sdt__forpredef.getValidValue(((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef()) );
               }
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavPrecioporcolor_cliente_sdt__forpredef,cmbavPrecioporcolor_cliente_sdt__forpredef.getInternalname(),GXutil.rtrim( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef()),Integer.valueOf(1),cmbavPrecioporcolor_cliente_sdt__forpredef.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavPrecioporcolor_cliente_sdt__forpredef.getEnabled()!=0)&&(cmbavPrecioporcolor_cliente_sdt__forpredef.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,54);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavPrecioporcolor_cliente_sdt__forpredef.setValue( GXutil.rtrim( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef()) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavPrecioporcolor_cliente_sdt__forpredef.getInternalname(), "Values", cmbavPrecioporcolor_cliente_sdt__forpredef.ToJavascriptSource(), !bGXsfl_44_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecioporcolor_cliente_sdt__forcosform_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcosform(), (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecioporcolor_cliente_sdt__forcosform_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcosform(), "ZZZZ9.99999") : localUtil.format( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcosform(), "ZZZZ9.99999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrecioporcolor_cliente_sdt__forcosform_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPrecioporcolor_cliente_sdt__forcosform_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecioporcolor_cliente_sdt__coste_general_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_general(), (byte)(6), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecioporcolor_cliente_sdt__coste_general_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_general(), "Z9.999") : localUtil.format( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_general(), "Z9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrecioporcolor_cliente_sdt__coste_general_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPrecioporcolor_cliente_sdt__coste_general_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecioporcolor_cliente_sdt__coste_total_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_total(), (byte)(6), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecioporcolor_cliente_sdt__coste_total_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_total(), "Z9.999") : localUtil.format( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_total(), "Z9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrecioporcolor_cliente_sdt__coste_total_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPrecioporcolor_cliente_sdt__coste_total_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecioporcolor_cliente_sdt__forprekgm_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprekgm(), (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecioporcolor_cliente_sdt__forprekgm_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprekgm(), "ZZZZZ9.999") : localUtil.format( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprekgm(), "ZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrecioporcolor_cliente_sdt__forprekgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPrecioporcolor_cliente_sdt__forprekgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecioporcolor_cliente_sdt__grdtipart_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Grdtipart(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecioporcolor_cliente_sdt__grdtipart_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Grdtipart()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Grdtipart()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrecioporcolor_cliente_sdt__grdtipart_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPrecioporcolor_cliente_sdt__grdtipart_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2302( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_44_idx = ((subGrid_Islastpage==1)&&(nGXsfl_44_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_44_idx+1) ;
         sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_442( ) ;
      }
      /* End function sendrow_442 */
   }

   public void startgridcontrol44( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"44\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Artigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Número Cor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "TC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cor Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Novo preço", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Data Preço", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "D?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste General", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Total", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Old Preço Kg", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Classe", "")) ;
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
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV40GridActionGroup1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__forser_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__forcolnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__forcolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__tipcolcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__fornomcli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__fornumcli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavPrecioporcolor_cliente_sdt__new_forprekgm_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavPrecioporcolor_cliente_sdt__new_forprekgm_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__forprefec_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__forcosform_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__coste_general_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__coste_total_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__forprekgm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecioporcolor_cliente_sdt__grdtipart_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtavClicod_Internalname = "vCLICOD" ;
      edtavClinom_Internalname = "vCLINOM" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1" );
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
      edtavPrecioporcolor_cliente_sdt__forprekgm_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__FORPREKGM" ;
      edtavPrecioporcolor_cliente_sdt__grdtipart_Internalname = "PRECIOPORCOLOR_CLIENTE_SDT__GRDTIPART" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Dvelop_confirmpanel_enter_Internalname = "DVELOP_CONFIRMPANEL_ENTER" ;
      tblTabledvelop_confirmpanel_enter_Internalname = "TABLEDVELOP_CONFIRMPANEL_ENTER" ;
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
      edtavPrecioporcolor_cliente_sdt__grdtipart_Jsonclick = "" ;
      edtavPrecioporcolor_cliente_sdt__grdtipart_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__forprekgm_Jsonclick = "" ;
      edtavPrecioporcolor_cliente_sdt__forprekgm_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__coste_total_Jsonclick = "" ;
      edtavPrecioporcolor_cliente_sdt__coste_total_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__coste_general_Jsonclick = "" ;
      edtavPrecioporcolor_cliente_sdt__coste_general_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__forcosform_Jsonclick = "" ;
      edtavPrecioporcolor_cliente_sdt__forcosform_Enabled = 0 ;
      cmbavPrecioporcolor_cliente_sdt__forpredef.setJsonclick( "" );
      cmbavPrecioporcolor_cliente_sdt__forpredef.setVisible( -1 );
      cmbavPrecioporcolor_cliente_sdt__forpredef.setEnabled( 1 );
      edtavPrecioporcolor_cliente_sdt__forprefec_Jsonclick = "" ;
      edtavPrecioporcolor_cliente_sdt__forprefec_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__new_forprekgm_Jsonclick = "" ;
      edtavPrecioporcolor_cliente_sdt__new_forprekgm_Columnheaderclass = "" ;
      edtavPrecioporcolor_cliente_sdt__new_forprekgm_Columnclass = "WWColumn ColumnColorSuccess" ;
      edtavPrecioporcolor_cliente_sdt__new_forprekgm_Visible = -1 ;
      edtavPrecioporcolor_cliente_sdt__new_forprekgm_Enabled = 1 ;
      edtavPrecioporcolor_cliente_sdt__fornumcli_Jsonclick = "" ;
      edtavPrecioporcolor_cliente_sdt__fornumcli_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__fornomcli_Jsonclick = "" ;
      edtavPrecioporcolor_cliente_sdt__fornomcli_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__tipcolcod_Jsonclick = "" ;
      edtavPrecioporcolor_cliente_sdt__tipcolcod_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__forcolnom_Jsonclick = "" ;
      edtavPrecioporcolor_cliente_sdt__forcolnom_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__forcolnum_Jsonclick = "" ;
      edtavPrecioporcolor_cliente_sdt__forcolnum_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__forser_Jsonclick = "" ;
      edtavPrecioporcolor_cliente_sdt__forser_Enabled = 0 ;
      cmbavGridactiongroup1.setJsonclick( "" );
      cmbavGridactiongroup1.setVisible( -1 );
      cmbavGridactiongroup1.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavPrecioporcolor_cliente_sdt__grdtipart_Enabled = -1 ;
      edtavPrecioporcolor_cliente_sdt__forprekgm_Enabled = -1 ;
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
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 0 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 0 ;
      Dvelop_confirmpanel_enter_Confirmtype = "1" ;
      Dvelop_confirmpanel_enter_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_enter_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_enter_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_enter_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_enter_Confirmationtext = "¿Confirma los precios?" ;
      Dvelop_confirmpanel_enter_Title = "" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Precio por Color Cliente", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_44_idx ;
      cmbavGridactiongroup1.setName( GXCCtl );
      cmbavGridactiongroup1.setWebtags( "" );
      if ( cmbavGridactiongroup1.getItemCount() > 0 )
      {
         if ( ( AV43GXV1 > 0 ) && ( AV13PrecioporColor_Cliente_SDT.size() >= AV43GXV1 ) && (0==AV40GridActionGroup1) )
         {
            AV40GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV40GridActionGroup1, 4, 0))))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40GridActionGroup1), 4, 0));
         }
      }
      GXCCtl = "PRECIOPORCOLOR_CLIENTE_SDT__FORPREDEF_" + sGXsfl_44_idx ;
      cmbavPrecioporcolor_cliente_sdt__forpredef.setName( GXCCtl );
      cmbavPrecioporcolor_cliente_sdt__forpredef.setWebtags( "" );
      cmbavPrecioporcolor_cliente_sdt__forpredef.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbavPrecioporcolor_cliente_sdt__forpredef.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbavPrecioporcolor_cliente_sdt__forpredef.getItemCount() > 0 )
      {
         if ( ( AV43GXV1 > 0 ) && ( AV13PrecioporColor_Cliente_SDT.size() >= AV43GXV1 ) && (GXutil.strcmp("", ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef())==0) )
         {
            ((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef( cmbavPrecioporcolor_cliente_sdt__forpredef.getValidValue(((app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)AV13PrecioporColor_Cliente_SDT.elementAt(-1+AV43GXV1)).getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef()) );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV58Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13PrecioporColor_Cliente_SDT',fld:'vPRECIOPORCOLOR_CLIENTE_SDT',grid:44,pic:'',hsh:true},{av:'nGXsfl_44_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:44},{av:'nRC_GXsfl_44',ctrl:'GRID',prop:'GridRC',grid:44}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV24GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV25GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__NEW_FORPREKGM',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e112302',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV58Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13PrecioporColor_Cliente_SDT',fld:'vPRECIOPORCOLOR_CLIENTE_SDT',grid:44,pic:'',hsh:true},{av:'nGXsfl_44_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:44},{av:'nRC_GXsfl_44',ctrl:'GRID',prop:'GridRC',grid:44},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e122302',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV58Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13PrecioporColor_Cliente_SDT',fld:'vPRECIOPORCOLOR_CLIENTE_SDT',grid:44,pic:'',hsh:true},{av:'nGXsfl_44_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:44},{av:'nRC_GXsfl_44',ctrl:'GRID',prop:'GridRC',grid:44},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e182302',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV40GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__NEW_FORPREKGM',prop:'Columnclass'}]}");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK","{handler:'e192302',iparms:[{av:'cmbavGridactiongroup1'},{av:'AV40GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV58Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13PrecioporColor_Cliente_SDT',fld:'vPRECIOPORCOLOR_CLIENTE_SDT',grid:44,pic:'',hsh:true},{av:'nGXsfl_44_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:44},{av:'nRC_GXsfl_44',ctrl:'GRID',prop:'GridRC',grid:44},{av:'AV26Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV27CliCod',fld:'vCLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV40GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'AV24GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV25GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'PRECIOPORCOLOR_CLIENTE_SDT__NEW_FORPREKGM',prop:'Columnheaderclass'}]}");
      setEventMetadata("ENTER","{handler:'e142302',iparms:[]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE","{handler:'e132302',iparms:[{av:'Dvelop_confirmpanel_enter_Result',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'Result'},{av:'AV13PrecioporColor_Cliente_SDT',fld:'vPRECIOPORCOLOR_CLIENTE_SDT',grid:44,pic:'',hsh:true},{av:'nGXsfl_44_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:44},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_44',ctrl:'GRID',prop:'GridRC',grid:44},{av:'AV26Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV27CliCod',fld:'vCLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE",",oparms:[{av:'AV27CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV26Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e152302',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
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
      wcpOAV26Emprcod = "" ;
      wcpOAV28CliNom = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Dvelop_confirmpanel_enter_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV26Emprcod = "" ;
      AV28CliNom = "" ;
      AV58Pgmname = "" ;
      AV13PrecioporColor_Cliente_SDT = new GXBaseCollection<app.facturacion.SdtPrecioporColor_Cliente_SDT_Item>(app.facturacion.SdtPrecioporColor_Cliente_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      hsh = "" ;
      GXt_objcol_SdtPrecioporColor_Cliente_SDT_Item1 = new GXBaseCollection<app.facturacion.SdtPrecioporColor_Cliente_SDT_Item>(app.facturacion.SdtPrecioporColor_Cliente_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      GXv_objcol_SdtPrecioporColor_Cliente_SDT_Item2 = new GXBaseCollection[1] ;
      AV37Station = "" ;
      GXt_char3 = "" ;
      AV38EmprNom = "" ;
      AV39UsurCod = "" ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV29Item_PrecioporColor_Cliente_SDT = new app.facturacion.SdtPrecioporColor_Cliente_SDT_Item(remoteHandle, context);
      AV30NewPreKgm = DecimalUtil.ZERO ;
      AV36Forprekgm = DecimalUtil.ZERO ;
      AV31Predef = "" ;
      AV32ForSer = "" ;
      AV33ForColNom = "" ;
      GXv_char6 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_int10 = new byte[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_char13 = new String[1] ;
      GXv_int14 = new byte[1] ;
      GXv_char15 = new String[1] ;
      AV18Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      ucDvelop_confirmpanel_enter = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV58Pgmname = "Facturacion.PrecioporColor_Cliente_WP" ;
      /* GeneXus formulas. */
      AV58Pgmname = "Facturacion.PrecioporColor_Cliente_WP" ;
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
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
      edtavPrecioporcolor_cliente_sdt__forprekgm_Enabled = 0 ;
      edtavPrecioporcolor_cliente_sdt__grdtipart_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte AV35tipcolcod ;
   private byte GXv_int10[] ;
   private byte GXv_int14[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wbEnd ;
   private short wbStart ;
   private short AV40GridActionGroup1 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV27CliCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_44 ;
   private int AV27CliCod ;
   private int nGXsfl_44_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int AV43GXV1 ;
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
   private int edtavPrecioporcolor_cliente_sdt__forprekgm_Enabled ;
   private int edtavPrecioporcolor_cliente_sdt__grdtipart_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_44_fel_idx=1 ;
   private int AV23PageToGo ;
   private int AV59GXV16 ;
   private int AV34ForColNum ;
   private int GXv_int8[] ;
   private int GXv_int9[] ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavPrecioporcolor_cliente_sdt__new_forprekgm_Enabled ;
   private int edtavPrecioporcolor_cliente_sdt__new_forprekgm_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV24GridCurrentPage ;
   private long AV25GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV30NewPreKgm ;
   private java.math.BigDecimal AV36Forprekgm ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private String wcpOAV26Emprcod ;
   private String wcpOAV28CliNom ;
   private String Gridpaginationbar_Selectedpage ;
   private String Dvelop_confirmpanel_enter_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV26Emprcod ;
   private String AV28CliNom ;
   private String sGXsfl_44_idx="0001" ;
   private String AV58Pgmname ;
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
   private String Dvelop_confirmpanel_enter_Title ;
   private String Dvelop_confirmpanel_enter_Confirmationtext ;
   private String Dvelop_confirmpanel_enter_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Nobuttoncaption ;
   private String Dvelop_confirmpanel_enter_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Yesbuttonposition ;
   private String Dvelop_confirmpanel_enter_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavClinom_Internalname ;
   private String edtavClinom_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
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
   private String edtavPrecioporcolor_cliente_sdt__forprekgm_Internalname ;
   private String edtavPrecioporcolor_cliente_sdt__grdtipart_Internalname ;
   private String sGXsfl_44_fel_idx="0001" ;
   private String hsh ;
   private String AV37Station ;
   private String GXt_char3 ;
   private String AV38EmprNom ;
   private String AV39UsurCod ;
   private String edtavPrecioporcolor_cliente_sdt__new_forprekgm_Columnheaderclass ;
   private String edtavPrecioporcolor_cliente_sdt__new_forprekgm_Internalname ;
   private String edtavPrecioporcolor_cliente_sdt__new_forprekgm_Columnclass ;
   private String AV31Predef ;
   private String AV32ForSer ;
   private String AV33ForColNom ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char13[] ;
   private String GXv_char15[] ;
   private String tblTabledvelop_confirmpanel_enter_Internalname ;
   private String Dvelop_confirmpanel_enter_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavPrecioporcolor_cliente_sdt__forser_Jsonclick ;
   private String edtavPrecioporcolor_cliente_sdt__forcolnum_Jsonclick ;
   private String edtavPrecioporcolor_cliente_sdt__forcolnom_Jsonclick ;
   private String edtavPrecioporcolor_cliente_sdt__tipcolcod_Jsonclick ;
   private String edtavPrecioporcolor_cliente_sdt__fornomcli_Jsonclick ;
   private String edtavPrecioporcolor_cliente_sdt__fornumcli_Jsonclick ;
   private String edtavPrecioporcolor_cliente_sdt__new_forprekgm_Jsonclick ;
   private String edtavPrecioporcolor_cliente_sdt__forprefec_Jsonclick ;
   private String edtavPrecioporcolor_cliente_sdt__forcosform_Jsonclick ;
   private String edtavPrecioporcolor_cliente_sdt__coste_general_Jsonclick ;
   private String edtavPrecioporcolor_cliente_sdt__coste_total_Jsonclick ;
   private String edtavPrecioporcolor_cliente_sdt__forprekgm_Jsonclick ;
   private String edtavPrecioporcolor_cliente_sdt__grdtipart_Jsonclick ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_44_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV44 ;
   private boolean gx_refresh_fired ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV18Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_enter ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactiongroup1 ;
   private HTMLChoice cmbavPrecioporcolor_cliente_sdt__forpredef ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.facturacion.SdtPrecioporColor_Cliente_SDT_Item> AV13PrecioporColor_Cliente_SDT ;
   private GXBaseCollection<app.facturacion.SdtPrecioporColor_Cliente_SDT_Item> GXt_objcol_SdtPrecioporColor_Cliente_SDT_Item1 ;
   private GXBaseCollection<app.facturacion.SdtPrecioporColor_Cliente_SDT_Item> GXv_objcol_SdtPrecioporColor_Cliente_SDT_Item2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.facturacion.SdtPrecioporColor_Cliente_SDT_Item AV29Item_PrecioporColor_Cliente_SDT ;
}

