package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class trabajoexterno_recepcion_mto_wp_impl extends GXDataArea
{
   public trabajoexterno_recepcion_mto_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public trabajoexterno_recepcion_mto_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_recepcion_mto_wp_impl.class ));
   }

   public trabajoexterno_recepcion_mto_wp_impl( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactiongroup1 = new HTMLChoice();
      chkavTrabajoexterno_recepcion_mto_sdt__seleccionar = UIFactory.getCheckbox(this);
      cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip = new HTMLChoice();
      chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase = UIFactory.getCheckbox(this);
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
            AV5Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV6ManCod = (short)(GXutil.lval( httpContext.GetPar( "ManCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6ManCod), 4, 0));
               AV7ManNom = httpContext.GetPar( "ManNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7ManNom", AV7ManNom);
               AV8RpExHdFe = localUtil.parseDateParm( httpContext.GetPar( "RpExHdFe")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8RpExHdFe", localUtil.format(AV8RpExHdFe, "99/99/99"));
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
      nRC_GXsfl_46 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_46"))) ;
      nGXsfl_46_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_46_idx"))) ;
      sGXsfl_46_idx = httpContext.GetPar( "sGXsfl_46_idx") ;
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
      AV90Pgmname = httpContext.GetPar( "Pgmname") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV90Pgmname) ;
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
      pa27U2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start27U2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.trabajosexternos.trabajoexterno_recepcion_mto_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6ManCod,4,0)),GXutil.URLEncode(GXutil.rtrim(AV7ManNom)),GXutil.URLEncode(GXutil.formatDateParm(AV8RpExHdFe))}, new String[] {"Emprcod","ManCod","ManNom","RpExHdFe"}) +"\">") ;
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
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TrabajoExterno_Recepcion_Mto_WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV90Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("trabajosexternos\\trabajoexterno_recepcion_mto_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Trabajoexterno_recepcion_mto_sdt", AV17TrabajoExterno_Recepcion_Mto_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Trabajoexterno_recepcion_mto_sdt", AV17TrabajoExterno_Recepcion_Mto_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_46", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_46, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV30GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV31GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRABAJOEXTERNO_RECEPCION_MTO_SDT", AV17TrabajoExterno_Recepcion_Mto_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRABAJOEXTERNO_RECEPCION_MTO_SDT", AV17TrabajoExterno_Recepcion_Mto_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSALEXTALB", GXutil.ltrim( localUtil.ntoc( AV60SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_MODIFICAR_Title", GXutil.rtrim( Dvelop_confirmpanel_modificar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_MODIFICAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_modificar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_MODIFICAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_modificar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_MODIFICAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_modificar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_MODIFICAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_modificar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_MODIFICAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_modificar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_MODIFICAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_modificar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminarentrada_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminarentrada_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarentrada_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarentrada_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarentrada_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminarentrada_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminarentrada_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_MODIFICAR_Result", GXutil.rtrim( Dvelop_confirmpanel_modificar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarentrada_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_MODIFICAR_Result", GXutil.rtrim( Dvelop_confirmpanel_modificar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarentrada_Result));
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
         we27U2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt27U2( ) ;
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
      return formatLink("app.trabajosexternos.trabajoexterno_recepcion_mto_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6ManCod,4,0)),GXutil.URLEncode(GXutil.rtrim(AV7ManNom)),GXutil.URLEncode(GXutil.formatDateParm(AV8RpExHdFe))}, new String[] {"Emprcod","ManCod","ManNom","RpExHdFe"})  ;
   }

   public String getPgmname( )
   {
      return "TrabajosExternos.TrabajoExterno_Recepcion_Mto_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Trabajo Externo Recepcion Mto", "") ;
   }

   public void wb27U0( )
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
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMancod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMancod_Internalname, httpContext.getMessage( "Manufacturador", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMancod_Internalname, GXutil.ltrim( localUtil.ntoc( AV6ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMancod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6ManCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV6ManCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMancod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMancod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Recepcion_Mto_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMannom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMannom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMannom_Internalname, GXutil.rtrim( AV7ManNom), GXutil.rtrim( localUtil.format( AV7ManNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMannom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMannom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Recepcion_Mto_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRpexhdfe_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRpexhdfe_Internalname, httpContext.getMessage( "Fecha Recepcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavRpexhdfe_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRpexhdfe_Internalname, localUtil.format(AV8RpExHdFe, "99/99/99"), localUtil.format( AV8RpExHdFe, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRpexhdfe_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRpexhdfe_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Recepcion_Mto_WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavRpexhdfe_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavRpexhdfe_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TrabajosExternos\\TrabajoExterno_Recepcion_Mto_WP.htm");
         httpContext.writeTextNL( "</div>") ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminarentrada_Internalname, "gx.evt.setGridEvt("+GXutil.str( 46, 2, 0)+","+"null"+");", httpContext.getMessage( "Eliminar ENTRADA", ""), bttBtneliminarentrada_Jsonclick, 7, httpContext.getMessage( "Eliminar ENTRADA", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1127u1_client"+"'", TempTags, "", 2, "HLP_TrabajosExternos\\TrabajoExterno_Recepcion_Mto_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancelar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 46, 2, 0)+","+"null"+");", httpContext.getMessage( "Cancelar", ""), bttBtncancelar_Jsonclick, 5, httpContext.getMessage( "Cancelar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCANCELAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajosExternos\\TrabajoExterno_Recepcion_Mto_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol46( ) ;
      }
      if ( wbEnd == 46 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_46 = (int)(nGXsfl_46_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV63GXV1 = nGXsfl_46_idx ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV30GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV31GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV90Pgmname), GXutil.rtrim( localUtil.format( AV90Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Recepcion_Mto_WP.htm");
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
         wb_table1_87_27U2( true) ;
      }
      else
      {
         wb_table1_87_27U2( false) ;
      }
      return  ;
   }

   public void wb_table1_87_27U2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_92_27U2( true) ;
      }
      else
      {
         wb_table2_92_27U2( false) ;
      }
      return  ;
   }

   public void wb_table2_92_27U2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_97_27U2( true) ;
      }
      else
      {
         wb_table3_97_27U2( false) ;
      }
      return  ;
   }

   public void wb_table3_97_27U2e( boolean wbgen )
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
      if ( wbEnd == 46 )
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
               AV63GXV1 = nGXsfl_46_idx ;
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

   public void start27U2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Trabajo Externo Recepcion Mto", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup27U0( ) ;
   }

   public void ws27U2( )
   {
      start27U2( ) ;
      evt27U2( ) ;
   }

   public void evt27U2( )
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
                           e1227U2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1327U2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_MODIFICAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1427U2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1527U2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINARENTRADA.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1627U2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCANCELAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCancelar' */
                           e1727U2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 63), "TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDTIP.CONTROLVALUECHANGED") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) )
                        {
                           nGXsfl_46_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_462( ) ;
                           AV63GXV1 = (int)(nGXsfl_46_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV17TrabajoExterno_Recepcion_Mto_SDT.size() >= AV63GXV1 ) && ( AV63GXV1 > 0 ) )
                           {
                              AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)) );
                              cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
                              cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
                              AV37GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
                              httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37GridActionGroup1), 4, 0));
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
                                 e1827U2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e1927U2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2027U2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONGROUP1.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2127U2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDTIP.CONTROLVALUECHANGED") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2227U2 ();
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

   public void we27U2( )
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

   public void pa27U2( )
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
      subsflControlProps_462( ) ;
      while ( nGXsfl_46_idx <= nRC_GXsfl_46 )
      {
         sendrow_462( ) ;
         nGXsfl_46_idx = ((subGrid_Islastpage==1)&&(nGXsfl_46_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_46_idx+1) ;
         sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_462( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV90Pgmname )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1927U2 ();
      GRID_nCurrentRecord = 0 ;
      rf27U2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TrabajoExterno_Recepcion_Mto_WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV90Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("trabajosexternos\\trabajoexterno_recepcion_mto_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf27U2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV90Pgmname = "TrabajosExternos.TrabajoExterno_Recepcion_Mto_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90Pgmname", AV90Pgmname);
      Gx_err = (short)(0) ;
      edtavMancod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMancod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMancod_Enabled), 5, 0), true);
      edtavMannom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMannom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMannom_Enabled), 5, 0), true);
      edtavRpexhdfe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRpexhdfe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRpexhdfe_Enabled), 5, 0), true);
      chkavTrabajoexterno_recepcion_mto_sdt__seleccionar.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavTrabajoexterno_recepcion_mto_sdt__seleccionar.getInternalname(), "Enabled", GXutil.ltrimstr( chkavTrabajoexterno_recepcion_mto_sdt__seleccionar.getEnabled(), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdfe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__rpexhdfe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__rpexhdfe_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdalb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__rpexhdalb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__rpexhdalb_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__rpexhdli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__rpexhdli_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__barcod_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__barcodreo_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__barcodpar_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__barordlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__barordlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__barordlin_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__fascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__fascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__fascod_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__clicod_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__clinom_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__barser_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__barserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__barserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__barserdsc_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__rpexsalln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__rpexsalln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__rpexsalln_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.getInternalname(), "Enabled", GXutil.ltrimstr( chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.getEnabled(), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__kgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__kgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__kgs_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__mts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__mts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__mts_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__pzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__pzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__pzs_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__barunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__barunimed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__barunimed_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__oldkgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__oldkgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__oldkgs_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__oldmts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__oldmts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__oldmts_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__oldpzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__oldpzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__oldpzs_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf27U2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(46) ;
      /* Execute user event: Refresh */
      e1927U2 ();
      nGXsfl_46_idx = 1 ;
      sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_462( ) ;
      bGXsfl_46_Refreshing = true ;
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
         subsflControlProps_462( ) ;
         e2027U2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_46_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e2027U2 ();
         }
         wbEnd = (short)(46) ;
         wb27U0( ) ;
      }
      bGXsfl_46_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes27U2( )
   {
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
      return AV17TrabajoExterno_Recepcion_Mto_SDT.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV90Pgmname) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV90Pgmname) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV90Pgmname) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV90Pgmname) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV90Pgmname) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV90Pgmname = "TrabajosExternos.TrabajoExterno_Recepcion_Mto_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90Pgmname", AV90Pgmname);
      Gx_err = (short)(0) ;
      edtavMancod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMancod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMancod_Enabled), 5, 0), true);
      edtavMannom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMannom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMannom_Enabled), 5, 0), true);
      edtavRpexhdfe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRpexhdfe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRpexhdfe_Enabled), 5, 0), true);
      chkavTrabajoexterno_recepcion_mto_sdt__seleccionar.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavTrabajoexterno_recepcion_mto_sdt__seleccionar.getInternalname(), "Enabled", GXutil.ltrimstr( chkavTrabajoexterno_recepcion_mto_sdt__seleccionar.getEnabled(), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdfe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__rpexhdfe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__rpexhdfe_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdalb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__rpexhdalb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__rpexhdalb_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__rpexhdli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__rpexhdli_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__barcod_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__barcodreo_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__barcodpar_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__barordlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__barordlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__barordlin_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__fascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__fascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__fascod_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__clicod_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__clinom_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__barser_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__barserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__barserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__barserdsc_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__rpexsalln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__rpexsalln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__rpexsalln_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.getInternalname(), "Enabled", GXutil.ltrimstr( chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.getEnabled(), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__kgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__kgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__kgs_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__mts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__mts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__mts_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__pzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__pzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__pzs_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__barunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__barunimed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__barunimed_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__oldkgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__oldkgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__oldkgs_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__oldmts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__oldmts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__oldmts_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__oldpzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__oldpzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_mto_sdt__oldpzs_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup27U0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1827U2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Trabajoexterno_recepcion_mto_sdt"), AV17TrabajoExterno_Recepcion_Mto_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTRABAJOEXTERNO_RECEPCION_MTO_SDT"), AV17TrabajoExterno_Recepcion_Mto_SDT);
         /* Read saved values. */
         nRC_GXsfl_46 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_46"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV30GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV31GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Dvelop_confirmpanel_modificar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_MODIFICAR_Title") ;
         Dvelop_confirmpanel_modificar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_MODIFICAR_Confirmationtext") ;
         Dvelop_confirmpanel_modificar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_MODIFICAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_modificar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_MODIFICAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_modificar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_MODIFICAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_modificar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_MODIFICAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_modificar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_MODIFICAR_Confirmtype") ;
         Dvelop_confirmpanel_eliminar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Title") ;
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_eliminar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype") ;
         Dvelop_confirmpanel_eliminarentrada_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Title") ;
         Dvelop_confirmpanel_eliminarentrada_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Confirmationtext") ;
         Dvelop_confirmpanel_eliminarentrada_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminarentrada_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminarentrada_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminarentrada_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminarentrada_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Dvelop_confirmpanel_modificar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_MODIFICAR_Result") ;
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         Dvelop_confirmpanel_eliminarentrada_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARENTRADA_Result") ;
         nRC_GXsfl_46 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_46"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_46_fel_idx = 0 ;
         while ( nGXsfl_46_fel_idx < nRC_GXsfl_46 )
         {
            nGXsfl_46_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_46_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_46_fel_idx+1) ;
            sGXsfl_46_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_462( ) ;
            AV63GXV1 = (int)(nGXsfl_46_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV17TrabajoExterno_Recepcion_Mto_SDT.size() >= AV63GXV1 ) && ( AV63GXV1 > 0 ) )
            {
               AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)) );
               cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
               cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
               AV37GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
            }
         }
         if ( nGXsfl_46_fel_idx == 0 )
         {
            nGXsfl_46_idx = 1 ;
            sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_462( ) ;
         }
         nGXsfl_46_fel_idx = 1 ;
         /* Read variables values. */
         AV90Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV90Pgmname", AV90Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TrabajoExterno_Recepcion_Mto_WP");
         AV90Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV90Pgmname", AV90Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV90Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("trabajosexternos\\trabajoexterno_recepcion_mto_wp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1827U2 ();
      if (returnInSub) return;
   }

   public void e1827U2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV34Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      trabajoexterno_recepcion_mto_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV34Station = GXt_char1 ;
      GXv_char2[0] = AV5Emprcod ;
      GXv_char3[0] = AV35EmprNom ;
      GXv_char4[0] = AV36UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV34Station, GXv_char2, GXv_char3, GXv_char4) ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV5Emprcod = GXv_char2[0] ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV35EmprNom = GXv_char3[0] ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV36UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Trabajo Externo Recepcion Mto", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_char1 = AV33TrabajoExterno_Recepcion_Mto_json ;
      GXv_char4[0] = GXt_char1 ;
      new app.trabajosexternos.trabajoexterno_recepcion_mto_prc(remoteHandle, context).execute( AV5Emprcod, AV6ManCod, AV8RpExHdFe, GXv_char4) ;
      trabajoexterno_recepcion_mto_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV33TrabajoExterno_Recepcion_Mto_json = GXt_char1 ;
      AV17TrabajoExterno_Recepcion_Mto_SDT.fromJSonString(AV33TrabajoExterno_Recepcion_Mto_json, null);
      gx_BV46 = true ;
   }

   public void e1927U2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext5[0] = AV10WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV10WWPContext = GXv_SdtWWPContext5[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S132 ();
      if (returnInSub) return;
      AV30GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30GridCurrentPage), 10, 0));
      AV31GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31GridPageCount), 10, 0));
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdkgs_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__rpexhdkgs_Internalname, "Columnheaderclass", edtavTrabajoexterno_recepcion_mto_sdt__rpexhdkgs_Columnheaderclass, !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdmts_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__rpexhdmts_Internalname, "Columnheaderclass", edtavTrabajoexterno_recepcion_mto_sdt__rpexhdmts_Columnheaderclass, !bGXsfl_46_Refreshing);
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdcns_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_mto_sdt__rpexhdcns_Internalname, "Columnheaderclass", edtavTrabajoexterno_recepcion_mto_sdt__rpexhdcns_Columnheaderclass, !bGXsfl_46_Refreshing);
      cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.getInternalname(), "Columnheaderclass", cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.getColumnHeaderClass(), !bGXsfl_46_Refreshing);
      chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop("", false, chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.getInternalname(), "Columnheaderclass", chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.getColumnHeaderClass(), !bGXsfl_46_Refreshing);
      /*  Sending Event outputs  */
   }

   public void e1227U2( )
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
         AV29PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV29PageToGo) ;
      }
   }

   public void e1327U2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e2027U2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV63GXV1 = 1 ;
      while ( AV63GXV1 <= AV17TrabajoExterno_Recepcion_Mto_SDT.size() )
      {
         AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)) );
         cmbavGridactiongroup1.removeAllItems();
         cmbavGridactiongroup1.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactiongroup1.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Modificar", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactiongroup1.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         edtavTrabajoexterno_recepcion_mto_sdt__rpexhdkgs_Columnclass = "WWColumn WWColumnSuccess WWColumnSuccessSingleCell" ;
         edtavTrabajoexterno_recepcion_mto_sdt__rpexhdmts_Columnclass = "WWColumn WWColumnSuccess WWColumnSuccessSingleCell" ;
         edtavTrabajoexterno_recepcion_mto_sdt__rpexhdcns_Columnclass = "WWColumn WWColumnSuccess WWColumnSuccessSingleCell" ;
         cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.setColumnClass( "WWColumn WWColumnSuccess WWColumnSuccessSingleCell" );
         chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.setColumnClass( "WWColumn WWColumnSuccess WWColumnSuccessSingleCell" );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(46) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_462( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_46_Refreshing )
         {
            httpContext.doAjaxLoad(46, GridRow);
         }
         AV63GXV1 = (int)(AV63GXV1+1) ;
      }
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV37GridActionGroup1, 4, 0)) );
   }

   public void e2127U2( )
   {
      AV63GXV1 = (int)(nGXsfl_46_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV63GXV1 > 0 ) && ( AV17TrabajoExterno_Recepcion_Mto_SDT.size() >= AV63GXV1 ) )
      {
         AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)) );
      }
      /* Gridactiongroup1_Click Routine */
      returnInSub = false ;
      if ( AV37GridActionGroup1 == 1 )
      {
         /* Execute user subroutine: 'DO MODIFICAR' */
         S142 ();
         if (returnInSub) return;
      }
      else if ( AV37GridActionGroup1 == 2 )
      {
         /* Execute user subroutine: 'DO ELIMINAR' */
         S152 ();
         if (returnInSub) return;
      }
      AV37GridActionGroup1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37GridActionGroup1), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV37GridActionGroup1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), true);
   }

   public void e1427U2( )
   {
      AV63GXV1 = (int)(nGXsfl_46_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV63GXV1 > 0 ) && ( AV17TrabajoExterno_Recepcion_Mto_SDT.size() >= AV63GXV1 ) )
      {
         AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)) );
      }
      /* Dvelop_confirmpanel_modificar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_modificar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION MODIFICAR' */
         S162 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17TrabajoExterno_Recepcion_Mto_SDT", AV17TrabajoExterno_Recepcion_Mto_SDT);
      nGXsfl_46_bak_idx = nGXsfl_46_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV90Pgmname) ;
      nGXsfl_46_idx = nGXsfl_46_bak_idx ;
      sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_462( ) ;
   }

   public void e1527U2( )
   {
      AV63GXV1 = (int)(nGXsfl_46_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV63GXV1 > 0 ) && ( AV17TrabajoExterno_Recepcion_Mto_SDT.size() >= AV63GXV1 ) )
      {
         AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)) );
      }
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S172 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17TrabajoExterno_Recepcion_Mto_SDT", AV17TrabajoExterno_Recepcion_Mto_SDT);
      nGXsfl_46_bak_idx = nGXsfl_46_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV90Pgmname) ;
      nGXsfl_46_idx = nGXsfl_46_bak_idx ;
      sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_462( ) ;
   }

   public void e1627U2( )
   {
      AV63GXV1 = (int)(nGXsfl_46_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV63GXV1 > 0 ) && ( AV17TrabajoExterno_Recepcion_Mto_SDT.size() >= AV63GXV1 ) )
      {
         AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)) );
      }
      /* Dvelop_confirmpanel_eliminarentrada_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminarentrada_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINARENTRADA' */
         S182 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      if ( gx_BV46 )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17TrabajoExterno_Recepcion_Mto_SDT", AV17TrabajoExterno_Recepcion_Mto_SDT);
         nGXsfl_46_bak_idx = nGXsfl_46_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV90Pgmname) ;
         nGXsfl_46_idx = nGXsfl_46_bak_idx ;
         sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_462( ) ;
      }
   }

   public void e1727U2( )
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
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
   }

   public void S142( )
   {
      /* 'DO MODIFICAR' Routine */
      returnInSub = false ;
      if ( (0==((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdli()) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO hay Linea (#)", ""));
      }
      else
      {
         AV41kgsd = ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Kgs().add(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldkgs()) ;
         AV42mtsd = ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Mts().add(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldmts()) ;
         if ( ( DecimalUtil.compareTo(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdkgs(), AV41kgsd) > 0 ) && ( GXutil.strcmp(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barunimed(), "K") == 0 ) )
         {
            Gx_msg = httpContext.getMessage( "Kgs =", "") + GXutil.trim( GXutil.str( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdkgs(), 9, 2)) + httpContext.getMessage( " > a Kgs Disponibles= ", "") + GXutil.trim( GXutil.str( AV41kgsd, 9, 2)) ;
            httpContext.GX_msglist.addItem(Gx_msg);
            httpContext.doAjaxRefresh();
         }
         else
         {
            if ( ( DecimalUtil.compareTo(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdmts(), AV42mtsd) > 0 ) && ( GXutil.strcmp(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barunimed(), "M") == 0 ) )
            {
               Gx_msg = httpContext.getMessage( "Mts =", "") + GXutil.trim( GXutil.str( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdmts(), 9, 2)) + httpContext.getMessage( " > a Mts Disponibles= ", "") + GXutil.trim( GXutil.str( AV42mtsd, 9, 2)) ;
               httpContext.GX_msglist.addItem(Gx_msg);
               httpContext.doAjaxRefresh();
            }
            else
            {
               Dvelop_confirmpanel_modificar_Confirmationtext = httpContext.getMessage( "Desea Modificar la Linea (#)", "")+GXutil.str( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdli(), 4, 0)+GXutil.newLine( ) ;
               ucDvelop_confirmpanel_modificar.sendProperty(context, "", false, Dvelop_confirmpanel_modificar_Internalname, "ConfirmationText", Dvelop_confirmpanel_modificar_Confirmationtext);
               Dvelop_confirmpanel_modificar_Confirmationtext = Dvelop_confirmpanel_modificar_Confirmationtext+httpContext.getMessage( "Confirma la MODIFICACION?", "") ;
               ucDvelop_confirmpanel_modificar.sendProperty(context, "", false, Dvelop_confirmpanel_modificar_Internalname, "ConfirmationText", Dvelop_confirmpanel_modificar_Confirmationtext);
               this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_MODIFICARContainer", "Confirm", "", new Object[] {});
            }
         }
      }
   }

   public void S162( )
   {
      /* 'DO ACTION MODIFICAR' Routine */
      returnInSub = false ;
      AV43RpExHdFein = ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe() ;
      AV44RpExHdLi = ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdli() ;
      AV51oldcns = ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldpzs() ;
      AV50oldkgs = ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldkgs() ;
      AV49oldmts = ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldmts() ;
      AV45RpExHdCns = ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdcns() ;
      AV47RpExHdKgs = ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdkgs() ;
      AV46RpExHdMts = ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdmts() ;
      AV48RpExHdTip = ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdtip() ;
      AV52RpExHdAlb = ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdalb() ;
      AV53RpExSalLn = ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexsalln() ;
      AV54barcod = ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcod() ;
      AV55barcodreo = ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodreo() ;
      AV56barcodpar = ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodpar() ;
      AV59FasCodn = ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Fascod() ;
      AV58OrdLin = ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barordlin() ;
      if ( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Cerrarfase() )
      {
         AV57Flag = "S" ;
      }
      else
      {
         AV57Flag = "N" ;
      }
      GXv_char4[0] = AV5Emprcod ;
      GXv_int6[0] = AV6ManCod ;
      GXv_date7[0] = AV43RpExHdFein ;
      GXv_int8[0] = AV44RpExHdLi ;
      GXv_int9[0] = (short)(AV51oldcns) ;
      GXv_decimal10[0] = AV50oldkgs ;
      GXv_decimal11[0] = AV49oldmts ;
      GXv_int12[0] = AV45RpExHdCns ;
      GXv_decimal13[0] = AV47RpExHdKgs ;
      GXv_decimal14[0] = AV46RpExHdMts ;
      GXv_char3[0] = AV48RpExHdTip ;
      new app.pwork06(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_date7, GXv_int8, GXv_int9, GXv_decimal10, GXv_decimal11, GXv_int12, GXv_decimal13, GXv_decimal14, GXv_char3) ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV5Emprcod = GXv_char4[0] ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV6ManCod = GXv_int6[0] ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV43RpExHdFein = GXv_date7[0] ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV44RpExHdLi = GXv_int8[0] ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV51oldcns = GXv_int9[0] ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV50oldkgs = GXv_decimal10[0] ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV49oldmts = GXv_decimal11[0] ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV45RpExHdCns = GXv_int12[0] ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV47RpExHdKgs = GXv_decimal13[0] ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV46RpExHdMts = GXv_decimal14[0] ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV48RpExHdTip = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV6ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6ManCod), 4, 0));
      GXv_char4[0] = AV5Emprcod ;
      GXv_int12[0] = AV6ManCod ;
      GXv_char3[0] = httpContext.getMessage( "R", "") ;
      GXv_int15[0] = AV52RpExHdAlb ;
      GXv_int9[0] = AV44RpExHdLi ;
      GXv_decimal14[0] = AV50oldkgs ;
      GXv_decimal13[0] = AV49oldmts ;
      GXv_int8[0] = (short)(AV51oldcns) ;
      GXv_decimal11[0] = AV47RpExHdKgs ;
      GXv_decimal10[0] = AV46RpExHdMts ;
      GXv_int6[0] = AV45RpExHdCns ;
      GXv_date7[0] = AV43RpExHdFein ;
      GXv_int16[0] = AV54barcod ;
      GXv_int17[0] = AV55barcodreo ;
      GXv_char2[0] = AV56barcodpar ;
      GXv_char18[0] = AV48RpExHdTip ;
      GXv_char19[0] = httpContext.getMessage( "N", "") ;
      GXv_int20[0] = AV53RpExSalLn ;
      new app.pmmvrhd1(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_int15, GXv_int9, GXv_decimal14, GXv_decimal13, GXv_int8, GXv_decimal11, GXv_decimal10, GXv_int6, GXv_date7, GXv_int16, GXv_int17, GXv_char2, GXv_char18, GXv_char19, GXv_int20) ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV5Emprcod = GXv_char4[0] ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV6ManCod = GXv_int12[0] ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV52RpExHdAlb = GXv_int15[0] ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV44RpExHdLi = GXv_int9[0] ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV50oldkgs = GXv_decimal14[0] ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV49oldmts = GXv_decimal13[0] ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV51oldcns = GXv_int8[0] ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV47RpExHdKgs = GXv_decimal11[0] ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV46RpExHdMts = GXv_decimal10[0] ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV45RpExHdCns = GXv_int6[0] ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV43RpExHdFein = GXv_date7[0] ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV54barcod = GXv_int16[0] ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV55barcodreo = GXv_int17[0] ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV56barcodpar = GXv_char2[0] ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV48RpExHdTip = GXv_char18[0] ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV53RpExSalLn = GXv_int20[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV6ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6ManCod), 4, 0));
      if ( GXutil.strcmp(AV48RpExHdTip, "T") == 0 )
      {
         GXv_char19[0] = AV5Emprcod ;
         GXv_int16[0] = AV54barcod ;
         GXv_int17[0] = AV55barcodreo ;
         GXv_char18[0] = AV56barcodpar ;
         GXv_int20[0] = AV58OrdLin ;
         GXv_char4[0] = AV59FasCodn ;
         GXv_date7[0] = AV8RpExHdFe ;
         GXv_int21[0] = (byte)(2) ;
         GXv_int15[0] = AV60SalExtAlb ;
         GXv_int12[0] = AV45RpExHdCns ;
         GXv_decimal14[0] = AV47RpExHdKgs ;
         GXv_decimal13[0] = AV46RpExHdMts ;
         GXv_char3[0] = AV57Flag ;
         new app.phdrexwpasoflag(remoteHandle, context).execute( GXv_char19, GXv_int16, GXv_int17, GXv_char18, GXv_int20, GXv_char4, GXv_date7, GXv_int21, GXv_int15, GXv_int12, GXv_decimal14, GXv_decimal13, GXv_char3) ;
         trabajoexterno_recepcion_mto_wp_impl.this.AV5Emprcod = GXv_char19[0] ;
         trabajoexterno_recepcion_mto_wp_impl.this.AV54barcod = GXv_int16[0] ;
         trabajoexterno_recepcion_mto_wp_impl.this.AV55barcodreo = GXv_int17[0] ;
         trabajoexterno_recepcion_mto_wp_impl.this.AV56barcodpar = GXv_char18[0] ;
         trabajoexterno_recepcion_mto_wp_impl.this.AV58OrdLin = GXv_int20[0] ;
         trabajoexterno_recepcion_mto_wp_impl.this.AV59FasCodn = GXv_char4[0] ;
         trabajoexterno_recepcion_mto_wp_impl.this.AV8RpExHdFe = GXv_date7[0] ;
         trabajoexterno_recepcion_mto_wp_impl.this.AV60SalExtAlb = GXv_int15[0] ;
         trabajoexterno_recepcion_mto_wp_impl.this.AV45RpExHdCns = GXv_int12[0] ;
         trabajoexterno_recepcion_mto_wp_impl.this.AV47RpExHdKgs = GXv_decimal14[0] ;
         trabajoexterno_recepcion_mto_wp_impl.this.AV46RpExHdMts = GXv_decimal13[0] ;
         trabajoexterno_recepcion_mto_wp_impl.this.AV57Flag = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV8RpExHdFe", localUtil.format(AV8RpExHdFe, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV60SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60SalExtAlb), 8, 0));
      }
      GXt_char1 = AV33TrabajoExterno_Recepcion_Mto_json ;
      GXv_char19[0] = GXt_char1 ;
      new app.trabajosexternos.trabajoexterno_recepcion_mto_prc(remoteHandle, context).execute( AV5Emprcod, AV6ManCod, AV8RpExHdFe, GXv_char19) ;
      trabajoexterno_recepcion_mto_wp_impl.this.GXt_char1 = GXv_char19[0] ;
      AV33TrabajoExterno_Recepcion_Mto_json = GXt_char1 ;
      AV17TrabajoExterno_Recepcion_Mto_SDT.fromJSonString(AV33TrabajoExterno_Recepcion_Mto_json, null);
      gx_BV46 = true ;
      httpContext.doAjaxRefresh();
   }

   public void S152( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      if ( (0==((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdli()) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO hay Linea (#)", ""));
      }
      else
      {
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.getMessage( "Deseas eliminar la linea (#) ", "")+GXutil.trim( GXutil.str( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdli(), 4, 0))+" ?" ;
         ucDvelop_confirmpanel_eliminar.sendProperty(context, "", false, Dvelop_confirmpanel_eliminar_Internalname, "ConfirmationText", Dvelop_confirmpanel_eliminar_Confirmationtext);
         this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
         httpContext.doAjaxRefresh();
      }
   }

   public void S172( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      AV38var_RpExHdFe = ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe() ;
      AV39var_RpExHdLi = ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdli() ;
      GXv_char19[0] = AV5Emprcod ;
      GXv_int20[0] = AV6ManCod ;
      GXv_date7[0] = AV38var_RpExHdFe ;
      GXv_int12[0] = AV39var_RpExHdLi ;
      new app.pwork07(remoteHandle, context).execute( GXv_char19, GXv_int20, GXv_date7, GXv_int12) ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV5Emprcod = GXv_char19[0] ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV6ManCod = GXv_int20[0] ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV38var_RpExHdFe = GXv_date7[0] ;
      trabajoexterno_recepcion_mto_wp_impl.this.AV39var_RpExHdLi = GXv_int12[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV6ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6ManCod), 4, 0));
      GXt_char1 = AV33TrabajoExterno_Recepcion_Mto_json ;
      GXv_char19[0] = GXt_char1 ;
      new app.trabajosexternos.trabajoexterno_recepcion_mto_prc(remoteHandle, context).execute( AV5Emprcod, AV6ManCod, AV8RpExHdFe, GXv_char19) ;
      trabajoexterno_recepcion_mto_wp_impl.this.GXt_char1 = GXv_char19[0] ;
      AV33TrabajoExterno_Recepcion_Mto_json = GXt_char1 ;
      AV17TrabajoExterno_Recepcion_Mto_SDT.fromJSonString(AV33TrabajoExterno_Recepcion_Mto_json, null);
      gx_BV46 = true ;
      httpContext.doAjaxRefresh();
   }

   public void S182( )
   {
      /* 'DO ACTION ELIMINARENTRADA' Routine */
      returnInSub = false ;
      new app.pwork08(remoteHandle, context).execute( AV5Emprcod, AV6ManCod, AV8RpExHdFe) ;
      GXt_char1 = AV33TrabajoExterno_Recepcion_Mto_json ;
      GXv_char19[0] = GXt_char1 ;
      new app.trabajosexternos.trabajoexterno_recepcion_mto_prc(remoteHandle, context).execute( AV5Emprcod, AV6ManCod, AV8RpExHdFe, GXv_char19) ;
      trabajoexterno_recepcion_mto_wp_impl.this.GXt_char1 = GXv_char19[0] ;
      AV33TrabajoExterno_Recepcion_Mto_json = GXt_char1 ;
      AV17TrabajoExterno_Recepcion_Mto_SDT.fromJSonString(AV33TrabajoExterno_Recepcion_Mto_json, null);
      gx_BV46 = true ;
      httpContext.doAjaxRefresh();
   }

   public void S112( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV24Session.getValue(AV90Pgmname+"GridState"), "") == 0 )
      {
         AV14GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV90Pgmname+"GridState"), null, null);
      }
      else
      {
         AV14GridState.fromxml(AV24Session.getValue(AV90Pgmname+"GridState"), null, null);
      }
      if ( ! (GXutil.strcmp("", GXutil.trim( AV14GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV14GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV14GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S122( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV14GridState.fromxml(AV24Session.getValue(AV90Pgmname+"GridState"), null, null);
      AV14GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV14GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV90Pgmname+"GridState", AV14GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void e2227U2( )
   {
      AV63GXV1 = (int)(nGXsfl_46_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV63GXV1 > 0 ) && ( AV17TrabajoExterno_Recepcion_Mto_SDT.size() >= AV63GXV1 ) )
      {
         AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)) );
      }
      /* Trabajoexterno_recepcion_mto_sdt__rpexhdtip_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdtip(), "T") == 0 )
      {
         ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Cerrarfase( true );
      }
      else
      {
         ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Cerrarfase( false );
      }
      if ( GXutil.strcmp(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(AV17TrabajoExterno_Recepcion_Mto_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdtip(), "P") == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Ha seleccionado Parcial. Recordar que se ha de modificar kilos y/o metros", ""));
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17TrabajoExterno_Recepcion_Mto_SDT", AV17TrabajoExterno_Recepcion_Mto_SDT);
      nGXsfl_46_bak_idx = nGXsfl_46_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV90Pgmname) ;
      nGXsfl_46_idx = nGXsfl_46_bak_idx ;
      sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_462( ) ;
   }

   public void wb_table3_97_27U2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminarentrada_Internalname, tblTabledvelop_confirmpanel_eliminarentrada_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminarentrada.setProperty("Title", Dvelop_confirmpanel_eliminarentrada_Title);
         ucDvelop_confirmpanel_eliminarentrada.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminarentrada_Confirmationtext);
         ucDvelop_confirmpanel_eliminarentrada.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminarentrada_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminarentrada.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminarentrada_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminarentrada.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminarentrada_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminarentrada.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminarentrada_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminarentrada.setProperty("ConfirmType", Dvelop_confirmpanel_eliminarentrada_Confirmtype);
         ucDvelop_confirmpanel_eliminarentrada.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminarentrada_Internalname, "DVELOP_CONFIRMPANEL_ELIMINARENTRADAContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ELIMINARENTRADAContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_97_27U2e( true) ;
      }
      else
      {
         wb_table3_97_27U2e( false) ;
      }
   }

   public void wb_table2_92_27U2( boolean wbgen )
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
         wb_table2_92_27U2e( true) ;
      }
      else
      {
         wb_table2_92_27U2e( false) ;
      }
   }

   public void wb_table1_87_27U2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_modificar_Internalname, tblTabledvelop_confirmpanel_modificar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_modificar.setProperty("Title", Dvelop_confirmpanel_modificar_Title);
         ucDvelop_confirmpanel_modificar.setProperty("ConfirmationText", Dvelop_confirmpanel_modificar_Confirmationtext);
         ucDvelop_confirmpanel_modificar.setProperty("YesButtonCaption", Dvelop_confirmpanel_modificar_Yesbuttoncaption);
         ucDvelop_confirmpanel_modificar.setProperty("NoButtonCaption", Dvelop_confirmpanel_modificar_Nobuttoncaption);
         ucDvelop_confirmpanel_modificar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_modificar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_modificar.setProperty("YesButtonPosition", Dvelop_confirmpanel_modificar_Yesbuttonposition);
         ucDvelop_confirmpanel_modificar.setProperty("ConfirmType", Dvelop_confirmpanel_modificar_Confirmtype);
         ucDvelop_confirmpanel_modificar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_modificar_Internalname, "DVELOP_CONFIRMPANEL_MODIFICARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_MODIFICARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_87_27U2e( true) ;
      }
      else
      {
         wb_table1_87_27U2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
      AV6ManCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6ManCod), 4, 0));
      AV7ManNom = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7ManNom", AV7ManNom);
      AV8RpExHdFe = (java.util.Date)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8RpExHdFe", localUtil.format(AV8RpExHdFe, "99/99/99"));
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
      pa27U2( ) ;
      ws27U2( ) ;
      we27U2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116145989", true, true);
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
      httpContext.AddJavascriptSource("trabajosexternos/trabajoexterno_recepcion_mto_wp.js", "?202682116145989", false, true);
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

   public void subsflControlProps_462( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_46_idx );
      chkavTrabajoexterno_recepcion_mto_sdt__seleccionar.setInternalname( "TRABAJOEXTERNO_RECEPCION_MTO_SDT__SELECCIONAR_"+sGXsfl_46_idx );
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdfe_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDFE_"+sGXsfl_46_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdalb_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDALB_"+sGXsfl_46_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdli_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDLI_"+sGXsfl_46_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__barcod_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__BARCOD_"+sGXsfl_46_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__barcodreo_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__BARCODREO_"+sGXsfl_46_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__barcodpar_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__BARCODPAR_"+sGXsfl_46_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__barordlin_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__BARORDLIN_"+sGXsfl_46_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__fascod_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__FASCOD_"+sGXsfl_46_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__clicod_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__CLICOD_"+sGXsfl_46_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__clinom_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__CLINOM_"+sGXsfl_46_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__barser_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__BARSER_"+sGXsfl_46_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__barserdsc_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__BARSERDSC_"+sGXsfl_46_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdkgs_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDKGS_"+sGXsfl_46_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdmts_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDMTS_"+sGXsfl_46_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdcns_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDCNS_"+sGXsfl_46_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexsalln_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXSALLN_"+sGXsfl_46_idx ;
      cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.setInternalname( "TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDTIP_"+sGXsfl_46_idx );
      chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.setInternalname( "TRABAJOEXTERNO_RECEPCION_MTO_SDT__CERRARFASE_"+sGXsfl_46_idx );
      edtavTrabajoexterno_recepcion_mto_sdt__kgs_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__KGS_"+sGXsfl_46_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__mts_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__MTS_"+sGXsfl_46_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__pzs_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__PZS_"+sGXsfl_46_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__barunimed_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__BARUNIMED_"+sGXsfl_46_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__oldkgs_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__OLDKGS_"+sGXsfl_46_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__oldmts_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__OLDMTS_"+sGXsfl_46_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__oldpzs_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__OLDPZS_"+sGXsfl_46_idx ;
   }

   public void subsflControlProps_fel_462( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_46_fel_idx );
      chkavTrabajoexterno_recepcion_mto_sdt__seleccionar.setInternalname( "TRABAJOEXTERNO_RECEPCION_MTO_SDT__SELECCIONAR_"+sGXsfl_46_fel_idx );
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdfe_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDFE_"+sGXsfl_46_fel_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdalb_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDALB_"+sGXsfl_46_fel_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdli_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDLI_"+sGXsfl_46_fel_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__barcod_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__BARCOD_"+sGXsfl_46_fel_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__barcodreo_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__BARCODREO_"+sGXsfl_46_fel_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__barcodpar_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__BARCODPAR_"+sGXsfl_46_fel_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__barordlin_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__BARORDLIN_"+sGXsfl_46_fel_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__fascod_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__FASCOD_"+sGXsfl_46_fel_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__clicod_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__CLICOD_"+sGXsfl_46_fel_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__clinom_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__CLINOM_"+sGXsfl_46_fel_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__barser_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__BARSER_"+sGXsfl_46_fel_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__barserdsc_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__BARSERDSC_"+sGXsfl_46_fel_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdkgs_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDKGS_"+sGXsfl_46_fel_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdmts_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDMTS_"+sGXsfl_46_fel_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdcns_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDCNS_"+sGXsfl_46_fel_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexsalln_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXSALLN_"+sGXsfl_46_fel_idx ;
      cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.setInternalname( "TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDTIP_"+sGXsfl_46_fel_idx );
      chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.setInternalname( "TRABAJOEXTERNO_RECEPCION_MTO_SDT__CERRARFASE_"+sGXsfl_46_fel_idx );
      edtavTrabajoexterno_recepcion_mto_sdt__kgs_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__KGS_"+sGXsfl_46_fel_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__mts_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__MTS_"+sGXsfl_46_fel_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__pzs_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__PZS_"+sGXsfl_46_fel_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__barunimed_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__BARUNIMED_"+sGXsfl_46_fel_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__oldkgs_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__OLDKGS_"+sGXsfl_46_fel_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__oldmts_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__OLDMTS_"+sGXsfl_46_fel_idx ;
      edtavTrabajoexterno_recepcion_mto_sdt__oldpzs_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__OLDPZS_"+sGXsfl_46_fel_idx ;
   }

   public void sendrow_462( )
   {
      subsflControlProps_462( ) ;
      wb27U0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_46_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_46_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_46_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 47,'',false,'"+sGXsfl_46_idx+"',46)\"" : " ") ;
         if ( ( cmbavGridactiongroup1.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_46_idx ;
            cmbavGridactiongroup1.setName( GXCCtl );
            cmbavGridactiongroup1.setWebtags( "" );
            if ( cmbavGridactiongroup1.getItemCount() > 0 )
            {
               if ( ( AV63GXV1 > 0 ) && ( AV17TrabajoExterno_Recepcion_Mto_SDT.size() >= AV63GXV1 ) && (0==AV37GridActionGroup1) )
               {
                  AV37GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV37GridActionGroup1, 4, 0))))) ;
                  httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37GridActionGroup1), 4, 0));
               }
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactiongroup1,cmbavGridactiongroup1.getInternalname(),GXutil.trim( GXutil.str( AV37GridActionGroup1, 4, 0)),Integer.valueOf(1),cmbavGridactiongroup1.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONGROUP1.CLICK."+sGXsfl_46_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,47);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV37GridActionGroup1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), !bGXsfl_46_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__SELECCIONAR_" + sGXsfl_46_idx ;
         chkavTrabajoexterno_recepcion_mto_sdt__seleccionar.setName( GXCCtl );
         chkavTrabajoexterno_recepcion_mto_sdt__seleccionar.setWebtags( "" );
         chkavTrabajoexterno_recepcion_mto_sdt__seleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavTrabajoexterno_recepcion_mto_sdt__seleccionar.getInternalname(), "TitleCaption", chkavTrabajoexterno_recepcion_mto_sdt__seleccionar.getCaption(), !bGXsfl_46_Refreshing);
         chkavTrabajoexterno_recepcion_mto_sdt__seleccionar.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavTrabajoexterno_recepcion_mto_sdt__seleccionar.getInternalname(),GXutil.booltostr( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Seleccionar()),"","",Integer.valueOf(0),Integer.valueOf(chkavTrabajoexterno_recepcion_mto_sdt__seleccionar.getEnabled()),"true","",StyleString,ClassString,"WWColumn","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_mto_sdt__rpexhdfe_Internalname,localUtil.format(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe(), "99/99/99"),localUtil.format( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe(), "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_mto_sdt__rpexhdfe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTrabajoexterno_recepcion_mto_sdt__rpexhdfe_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_mto_sdt__rpexhdalb_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdalb(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTrabajoexterno_recepcion_mto_sdt__rpexhdalb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdalb()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdalb()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_mto_sdt__rpexhdalb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTrabajoexterno_recepcion_mto_sdt__rpexhdalb_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_mto_sdt__rpexhdli_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdli(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTrabajoexterno_recepcion_mto_sdt__rpexhdli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdli()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdli()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_mto_sdt__rpexhdli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTrabajoexterno_recepcion_mto_sdt__rpexhdli_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_mto_sdt__barcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcod(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTrabajoexterno_recepcion_mto_sdt__barcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcod()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcod()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_mto_sdt__barcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTrabajoexterno_recepcion_mto_sdt__barcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_mto_sdt__barcodreo_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodreo(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTrabajoexterno_recepcion_mto_sdt__barcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodreo()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodreo()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_mto_sdt__barcodreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTrabajoexterno_recepcion_mto_sdt__barcodreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_mto_sdt__barcodpar_Internalname,GXutil.rtrim( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodpar()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_mto_sdt__barcodpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTrabajoexterno_recepcion_mto_sdt__barcodpar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_mto_sdt__barordlin_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barordlin(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTrabajoexterno_recepcion_mto_sdt__barordlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barordlin()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barordlin()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_mto_sdt__barordlin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTrabajoexterno_recepcion_mto_sdt__barordlin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_mto_sdt__fascod_Internalname,GXutil.rtrim( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Fascod()),GXutil.rtrim( localUtil.format( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Fascod(), "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_mto_sdt__fascod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTrabajoexterno_recepcion_mto_sdt__fascod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_mto_sdt__clicod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clicod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTrabajoexterno_recepcion_mto_sdt__clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clicod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clicod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_mto_sdt__clicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavTrabajoexterno_recepcion_mto_sdt__clicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_mto_sdt__clinom_Internalname,GXutil.rtrim( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clinom()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_mto_sdt__clinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTrabajoexterno_recepcion_mto_sdt__clinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_mto_sdt__barser_Internalname,GXutil.rtrim( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barser()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_mto_sdt__barser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTrabajoexterno_recepcion_mto_sdt__barser_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_mto_sdt__barserdsc_Internalname,GXutil.rtrim( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barserdsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_mto_sdt__barserdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTrabajoexterno_recepcion_mto_sdt__barserdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTrabajoexterno_recepcion_mto_sdt__rpexhdkgs_Enabled!=0)&&(edtavTrabajoexterno_recepcion_mto_sdt__rpexhdkgs_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 61,'',false,'"+sGXsfl_46_idx+"',46)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_mto_sdt__rpexhdkgs_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdkgs(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdkgs(), "ZZZZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavTrabajoexterno_recepcion_mto_sdt__rpexhdkgs_Enabled!=0)&&(edtavTrabajoexterno_recepcion_mto_sdt__rpexhdkgs_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,61);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_mto_sdt__rpexhdkgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavTrabajoexterno_recepcion_mto_sdt__rpexhdkgs_Columnclass,edtavTrabajoexterno_recepcion_mto_sdt__rpexhdkgs_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTrabajoexterno_recepcion_mto_sdt__rpexhdmts_Enabled!=0)&&(edtavTrabajoexterno_recepcion_mto_sdt__rpexhdmts_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 62,'',false,'"+sGXsfl_46_idx+"',46)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_mto_sdt__rpexhdmts_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdmts(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdmts(), "ZZZZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavTrabajoexterno_recepcion_mto_sdt__rpexhdmts_Enabled!=0)&&(edtavTrabajoexterno_recepcion_mto_sdt__rpexhdmts_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,62);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_mto_sdt__rpexhdmts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavTrabajoexterno_recepcion_mto_sdt__rpexhdmts_Columnclass,edtavTrabajoexterno_recepcion_mto_sdt__rpexhdmts_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTrabajoexterno_recepcion_mto_sdt__rpexhdcns_Enabled!=0)&&(edtavTrabajoexterno_recepcion_mto_sdt__rpexhdcns_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 63,'',false,'"+sGXsfl_46_idx+"',46)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_mto_sdt__rpexhdcns_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdcns(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdcns()), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavTrabajoexterno_recepcion_mto_sdt__rpexhdcns_Enabled!=0)&&(edtavTrabajoexterno_recepcion_mto_sdt__rpexhdcns_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_mto_sdt__rpexhdcns_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavTrabajoexterno_recepcion_mto_sdt__rpexhdcns_Columnclass,edtavTrabajoexterno_recepcion_mto_sdt__rpexhdcns_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_mto_sdt__rpexsalln_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexsalln(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTrabajoexterno_recepcion_mto_sdt__rpexsalln_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexsalln()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexsalln()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_mto_sdt__rpexsalln_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavTrabajoexterno_recepcion_mto_sdt__rpexsalln_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.getEnabled()!=0)&&(cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 65,'',false,'"+sGXsfl_46_idx+"',46)\"" : " ") ;
         if ( ( cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDTIP_" + sGXsfl_46_idx ;
            cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.setName( GXCCtl );
            cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.setWebtags( "" );
            cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.addItem("T", httpContext.getMessage( "Total", ""), (short)(0));
            cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.addItem("P", httpContext.getMessage( "Parcial", ""), (short)(0));
            if ( cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.getItemCount() > 0 )
            {
               if ( ( AV63GXV1 > 0 ) && ( AV17TrabajoExterno_Recepcion_Mto_SDT.size() >= AV63GXV1 ) && (GXutil.strcmp("", ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdtip())==0) )
               {
                  ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdtip( cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.getValidValue(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdtip()) );
               }
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip,cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.getInternalname(),GXutil.rtrim( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdtip()),Integer.valueOf(1),cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.getColumnClass(),cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.getColumnHeaderClass(),TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.getEnabled()!=0)&&(cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,65);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.setValue( GXutil.rtrim( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdtip()) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.getInternalname(), "Values", cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.ToJavascriptSource(), !bGXsfl_46_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__CERRARFASE_" + sGXsfl_46_idx ;
         chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.setName( GXCCtl );
         chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.setWebtags( "" );
         chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.getInternalname(), "TitleCaption", chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.getCaption(), !bGXsfl_46_Refreshing);
         chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.getInternalname(),GXutil.booltostr( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Cerrarfase()),"","",Integer.valueOf(-1),Integer.valueOf(chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.getEnabled()),"true","",StyleString,ClassString,chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.getColumnClass(),chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.getColumnHeaderClass(),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_mto_sdt__kgs_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Kgs(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTrabajoexterno_recepcion_mto_sdt__kgs_Enabled!=0) ? localUtil.format( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Kgs(), "ZZZZZ9.99") : localUtil.format( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Kgs(), "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_mto_sdt__kgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavTrabajoexterno_recepcion_mto_sdt__kgs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_mto_sdt__mts_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Mts(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTrabajoexterno_recepcion_mto_sdt__mts_Enabled!=0) ? localUtil.format( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Mts(), "ZZZZZ9.99") : localUtil.format( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Mts(), "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_mto_sdt__mts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavTrabajoexterno_recepcion_mto_sdt__mts_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_mto_sdt__pzs_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Pzs(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTrabajoexterno_recepcion_mto_sdt__pzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Pzs()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Pzs()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_mto_sdt__pzs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavTrabajoexterno_recepcion_mto_sdt__pzs_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_mto_sdt__barunimed_Internalname,GXutil.rtrim( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barunimed()),GXutil.rtrim( localUtil.format( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barunimed(), "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_mto_sdt__barunimed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavTrabajoexterno_recepcion_mto_sdt__barunimed_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_mto_sdt__oldkgs_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldkgs(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTrabajoexterno_recepcion_mto_sdt__oldkgs_Enabled!=0) ? localUtil.format( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldkgs(), "ZZZZZ9.99") : localUtil.format( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldkgs(), "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_mto_sdt__oldkgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavTrabajoexterno_recepcion_mto_sdt__oldkgs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_mto_sdt__oldmts_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldmts(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTrabajoexterno_recepcion_mto_sdt__oldmts_Enabled!=0) ? localUtil.format( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldmts(), "ZZZZZ9.99") : localUtil.format( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldmts(), "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_mto_sdt__oldmts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavTrabajoexterno_recepcion_mto_sdt__oldmts_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_mto_sdt__oldpzs_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldpzs(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTrabajoexterno_recepcion_mto_sdt__oldpzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldpzs()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldpzs()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_mto_sdt__oldpzs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavTrabajoexterno_recepcion_mto_sdt__oldpzs_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes27U2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_46_idx = ((subGrid_Islastpage==1)&&(nGXsfl_46_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_46_idx+1) ;
         sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_462( ) ;
      }
      /* End function sendrow_462 */
   }

   public void startgridcontrol46( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"46\">") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Op", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Recepcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Documento", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº HDR", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea Documento Enviado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T/P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cerrar Fase?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pzs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Old Kgs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Old Mts", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Old Pzs", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV37GridActionGroup1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkavTrabajoexterno_recepcion_mto_sdt__seleccionar.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_mto_sdt__rpexhdfe_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_mto_sdt__rpexhdalb_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_mto_sdt__rpexhdli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_mto_sdt__barcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_mto_sdt__barcodreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_mto_sdt__barcodpar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_mto_sdt__barordlin_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_mto_sdt__fascod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_mto_sdt__clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_mto_sdt__clinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_mto_sdt__barser_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_mto_sdt__barserdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavTrabajoexterno_recepcion_mto_sdt__rpexhdkgs_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavTrabajoexterno_recepcion_mto_sdt__rpexhdkgs_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavTrabajoexterno_recepcion_mto_sdt__rpexhdmts_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavTrabajoexterno_recepcion_mto_sdt__rpexhdmts_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavTrabajoexterno_recepcion_mto_sdt__rpexhdcns_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavTrabajoexterno_recepcion_mto_sdt__rpexhdcns_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_mto_sdt__rpexsalln_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.getColumnHeaderClass()));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_mto_sdt__kgs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_mto_sdt__mts_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_mto_sdt__pzs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_mto_sdt__barunimed_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_mto_sdt__oldkgs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_mto_sdt__oldmts_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_mto_sdt__oldpzs_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtavMancod_Internalname = "vMANCOD" ;
      edtavMannom_Internalname = "vMANNOM" ;
      edtavRpexhdfe_Internalname = "vRPEXHDFE" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      bttBtneliminarentrada_Internalname = "BTNELIMINARENTRADA" ;
      bttBtncancelar_Internalname = "BTNCANCELAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1" );
      chkavTrabajoexterno_recepcion_mto_sdt__seleccionar.setInternalname( "TRABAJOEXTERNO_RECEPCION_MTO_SDT__SELECCIONAR" );
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdfe_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDFE" ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdalb_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDALB" ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdli_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDLI" ;
      edtavTrabajoexterno_recepcion_mto_sdt__barcod_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__BARCOD" ;
      edtavTrabajoexterno_recepcion_mto_sdt__barcodreo_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__BARCODREO" ;
      edtavTrabajoexterno_recepcion_mto_sdt__barcodpar_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__BARCODPAR" ;
      edtavTrabajoexterno_recepcion_mto_sdt__barordlin_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__BARORDLIN" ;
      edtavTrabajoexterno_recepcion_mto_sdt__fascod_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__FASCOD" ;
      edtavTrabajoexterno_recepcion_mto_sdt__clicod_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__CLICOD" ;
      edtavTrabajoexterno_recepcion_mto_sdt__clinom_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__CLINOM" ;
      edtavTrabajoexterno_recepcion_mto_sdt__barser_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__BARSER" ;
      edtavTrabajoexterno_recepcion_mto_sdt__barserdsc_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__BARSERDSC" ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdkgs_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDKGS" ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdmts_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDMTS" ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdcns_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDCNS" ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexsalln_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXSALLN" ;
      cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.setInternalname( "TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDTIP" );
      chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.setInternalname( "TRABAJOEXTERNO_RECEPCION_MTO_SDT__CERRARFASE" );
      edtavTrabajoexterno_recepcion_mto_sdt__kgs_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__KGS" ;
      edtavTrabajoexterno_recepcion_mto_sdt__mts_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__MTS" ;
      edtavTrabajoexterno_recepcion_mto_sdt__pzs_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__PZS" ;
      edtavTrabajoexterno_recepcion_mto_sdt__barunimed_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__BARUNIMED" ;
      edtavTrabajoexterno_recepcion_mto_sdt__oldkgs_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__OLDKGS" ;
      edtavTrabajoexterno_recepcion_mto_sdt__oldmts_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__OLDMTS" ;
      edtavTrabajoexterno_recepcion_mto_sdt__oldpzs_Internalname = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__OLDPZS" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Dvelop_confirmpanel_modificar_Internalname = "DVELOP_CONFIRMPANEL_MODIFICAR" ;
      tblTabledvelop_confirmpanel_modificar_Internalname = "TABLEDVELOP_CONFIRMPANEL_MODIFICAR" ;
      Dvelop_confirmpanel_eliminar_Internalname = "DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
      Dvelop_confirmpanel_eliminarentrada_Internalname = "DVELOP_CONFIRMPANEL_ELIMINARENTRADA" ;
      tblTabledvelop_confirmpanel_eliminarentrada_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINARENTRADA" ;
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
      edtavTrabajoexterno_recepcion_mto_sdt__oldpzs_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_mto_sdt__oldpzs_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__oldmts_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_mto_sdt__oldmts_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__oldkgs_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_mto_sdt__oldkgs_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__barunimed_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_mto_sdt__barunimed_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__pzs_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_mto_sdt__pzs_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__mts_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_mto_sdt__mts_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__kgs_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_mto_sdt__kgs_Enabled = 0 ;
      chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.setCaption( "" );
      chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.setColumnHeaderClass( "" );
      chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.setColumnClass( "WWColumn" );
      chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.setEnabled( 0 );
      cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.setJsonclick( "" );
      cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.setVisible( -1 );
      cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.setEnabled( 1 );
      cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.setColumnHeaderClass( "" );
      cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.setColumnClass( "WWColumn" );
      edtavTrabajoexterno_recepcion_mto_sdt__rpexsalln_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexsalln_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdcns_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdcns_Columnheaderclass = "" ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdcns_Columnclass = "WWColumn" ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdcns_Visible = -1 ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdcns_Enabled = 1 ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdmts_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdmts_Columnheaderclass = "" ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdmts_Columnclass = "WWColumn" ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdmts_Visible = -1 ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdmts_Enabled = 1 ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdkgs_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdkgs_Columnheaderclass = "" ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdkgs_Columnclass = "WWColumn" ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdkgs_Visible = -1 ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdkgs_Enabled = 1 ;
      edtavTrabajoexterno_recepcion_mto_sdt__barserdsc_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_mto_sdt__barserdsc_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__barser_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_mto_sdt__barser_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__clinom_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_mto_sdt__clinom_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__clicod_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_mto_sdt__clicod_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__fascod_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_mto_sdt__fascod_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__barordlin_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_mto_sdt__barordlin_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__barcodpar_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_mto_sdt__barcodpar_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__barcodreo_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_mto_sdt__barcodreo_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__barcod_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_mto_sdt__barcod_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdli_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdli_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdalb_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdalb_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdfe_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdfe_Enabled = 0 ;
      chkavTrabajoexterno_recepcion_mto_sdt__seleccionar.setCaption( "" );
      chkavTrabajoexterno_recepcion_mto_sdt__seleccionar.setEnabled( 0 );
      cmbavGridactiongroup1.setJsonclick( "" );
      cmbavGridactiongroup1.setVisible( -1 );
      cmbavGridactiongroup1.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTrabajoexterno_recepcion_mto_sdt__oldpzs_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_mto_sdt__oldmts_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_mto_sdt__oldkgs_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_mto_sdt__barunimed_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_mto_sdt__pzs_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_mto_sdt__mts_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_mto_sdt__kgs_Enabled = -1 ;
      chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.setEnabled( -1 );
      edtavTrabajoexterno_recepcion_mto_sdt__rpexsalln_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_mto_sdt__barserdsc_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_mto_sdt__barser_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_mto_sdt__clinom_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_mto_sdt__clicod_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_mto_sdt__fascod_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_mto_sdt__barordlin_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_mto_sdt__barcodpar_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_mto_sdt__barcodreo_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_mto_sdt__barcod_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdli_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdalb_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdfe_Enabled = -1 ;
      chkavTrabajoexterno_recepcion_mto_sdt__seleccionar.setEnabled( -1 );
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavRpexhdfe_Jsonclick = "" ;
      edtavRpexhdfe_Enabled = 0 ;
      edtavMannom_Jsonclick = "" ;
      edtavMannom_Enabled = 0 ;
      edtavMancod_Jsonclick = "" ;
      edtavMancod_Enabled = 0 ;
      Dvelop_confirmpanel_eliminarentrada_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminarentrada_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminarentrada_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminarentrada_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminarentrada_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminarentrada_Confirmationtext = "¿Desea eliminar la ENTRADA?" ;
      Dvelop_confirmpanel_eliminarentrada_Title = "" ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Desea eliminar la linea?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Dvelop_confirmpanel_modificar_Confirmtype = "1" ;
      Dvelop_confirmpanel_modificar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_modificar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_modificar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_modificar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_modificar_Confirmationtext = "¿Desea modilicar la linea?" ;
      Dvelop_confirmpanel_modificar_Title = "" ;
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
      Form.setCaption( httpContext.getMessage( "Trabajo Externo Recepcion Mto", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_46_idx ;
      cmbavGridactiongroup1.setName( GXCCtl );
      cmbavGridactiongroup1.setWebtags( "" );
      if ( cmbavGridactiongroup1.getItemCount() > 0 )
      {
         if ( ( AV63GXV1 > 0 ) && ( AV17TrabajoExterno_Recepcion_Mto_SDT.size() >= AV63GXV1 ) && (0==AV37GridActionGroup1) )
         {
            AV37GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV37GridActionGroup1, 4, 0))))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37GridActionGroup1), 4, 0));
         }
      }
      GXCCtl = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__SELECCIONAR_" + sGXsfl_46_idx ;
      chkavTrabajoexterno_recepcion_mto_sdt__seleccionar.setName( GXCCtl );
      chkavTrabajoexterno_recepcion_mto_sdt__seleccionar.setWebtags( "" );
      chkavTrabajoexterno_recepcion_mto_sdt__seleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavTrabajoexterno_recepcion_mto_sdt__seleccionar.getInternalname(), "TitleCaption", chkavTrabajoexterno_recepcion_mto_sdt__seleccionar.getCaption(), !bGXsfl_46_Refreshing);
      chkavTrabajoexterno_recepcion_mto_sdt__seleccionar.setCheckedValue( "false" );
      GXCCtl = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDTIP_" + sGXsfl_46_idx ;
      cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.setName( GXCCtl );
      cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.setWebtags( "" );
      cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.addItem("T", httpContext.getMessage( "Total", ""), (short)(0));
      cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.addItem("P", httpContext.getMessage( "Parcial", ""), (short)(0));
      if ( cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.getItemCount() > 0 )
      {
         if ( ( AV63GXV1 > 0 ) && ( AV17TrabajoExterno_Recepcion_Mto_SDT.size() >= AV63GXV1 ) && (GXutil.strcmp("", ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdtip())==0) )
         {
            ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdtip( cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip.getValidValue(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)AV17TrabajoExterno_Recepcion_Mto_SDT.elementAt(-1+AV63GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdtip()) );
         }
      }
      GXCCtl = "TRABAJOEXTERNO_RECEPCION_MTO_SDT__CERRARFASE_" + sGXsfl_46_idx ;
      chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.setName( GXCCtl );
      chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.setWebtags( "" );
      chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.getInternalname(), "TitleCaption", chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.getCaption(), !bGXsfl_46_Refreshing);
      chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.setCheckedValue( "false" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV17TrabajoExterno_Recepcion_Mto_SDT',fld:'vTRABAJOEXTERNO_RECEPCION_MTO_SDT',grid:46,pic:''},{av:'nGXsfl_46_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:46},{av:'nRC_GXsfl_46',ctrl:'GRID',prop:'GridRC',grid:46},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV90Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV30GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV31GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDKGS',prop:'Columnheaderclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDMTS',prop:'Columnheaderclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDCNS',prop:'Columnheaderclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDTIP',prop:'Columnheaderclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_MTO_SDT__CERRARFASE',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1227U2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV17TrabajoExterno_Recepcion_Mto_SDT',fld:'vTRABAJOEXTERNO_RECEPCION_MTO_SDT',grid:46,pic:''},{av:'nGXsfl_46_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:46},{av:'nRC_GXsfl_46',ctrl:'GRID',prop:'GridRC',grid:46},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV90Pgmname',fld:'vPGMNAME',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1327U2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV17TrabajoExterno_Recepcion_Mto_SDT',fld:'vTRABAJOEXTERNO_RECEPCION_MTO_SDT',grid:46,pic:''},{av:'nGXsfl_46_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:46},{av:'nRC_GXsfl_46',ctrl:'GRID',prop:'GridRC',grid:46},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV90Pgmname',fld:'vPGMNAME',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2027U2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV37GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{ctrl:'TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDKGS',prop:'Columnclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDMTS',prop:'Columnclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDCNS',prop:'Columnclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDTIP',prop:'Columnclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_MTO_SDT__CERRARFASE',prop:'Columnclass'}]}");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK","{handler:'e2127U2',iparms:[{av:'cmbavGridactiongroup1'},{av:'AV37GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV17TrabajoExterno_Recepcion_Mto_SDT',fld:'vTRABAJOEXTERNO_RECEPCION_MTO_SDT',grid:46,pic:''},{av:'nGXsfl_46_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:46},{av:'nRC_GXsfl_46',ctrl:'GRID',prop:'GridRC',grid:46},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV90Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV37GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'Dvelop_confirmpanel_modificar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_MODIFICAR',prop:'ConfirmationText'},{av:'Dvelop_confirmpanel_eliminar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'ConfirmationText'},{av:'AV30GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV31GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDKGS',prop:'Columnheaderclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDMTS',prop:'Columnheaderclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDCNS',prop:'Columnheaderclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDTIP',prop:'Columnheaderclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_MTO_SDT__CERRARFASE',prop:'Columnheaderclass'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_MODIFICAR.CLOSE","{handler:'e1427U2',iparms:[{av:'Dvelop_confirmpanel_modificar_Result',ctrl:'DVELOP_CONFIRMPANEL_MODIFICAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV17TrabajoExterno_Recepcion_Mto_SDT',fld:'vTRABAJOEXTERNO_RECEPCION_MTO_SDT',grid:46,pic:''},{av:'nGXsfl_46_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:46},{av:'nRC_GXsfl_46',ctrl:'GRID',prop:'GridRC',grid:46},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV90Pgmname',fld:'vPGMNAME',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV8RpExHdFe',fld:'vRPEXHDFE',pic:''},{av:'AV60SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_MODIFICAR.CLOSE",",oparms:[{av:'AV6ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV8RpExHdFe',fld:'vRPEXHDFE',pic:''},{av:'AV17TrabajoExterno_Recepcion_Mto_SDT',fld:'vTRABAJOEXTERNO_RECEPCION_MTO_SDT',grid:46,pic:''},{av:'nGXsfl_46_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:46},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_46',ctrl:'GRID',prop:'GridRC',grid:46},{av:'AV30GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV31GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDKGS',prop:'Columnheaderclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDMTS',prop:'Columnheaderclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDCNS',prop:'Columnheaderclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDTIP',prop:'Columnheaderclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_MTO_SDT__CERRARFASE',prop:'Columnheaderclass'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e1527U2',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV17TrabajoExterno_Recepcion_Mto_SDT',fld:'vTRABAJOEXTERNO_RECEPCION_MTO_SDT',grid:46,pic:''},{av:'nGXsfl_46_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:46},{av:'nRC_GXsfl_46',ctrl:'GRID',prop:'GridRC',grid:46},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV90Pgmname',fld:'vPGMNAME',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV8RpExHdFe',fld:'vRPEXHDFE',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'AV6ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV17TrabajoExterno_Recepcion_Mto_SDT',fld:'vTRABAJOEXTERNO_RECEPCION_MTO_SDT',grid:46,pic:''},{av:'nGXsfl_46_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:46},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_46',ctrl:'GRID',prop:'GridRC',grid:46},{av:'AV30GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV31GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDKGS',prop:'Columnheaderclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDMTS',prop:'Columnheaderclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDCNS',prop:'Columnheaderclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDTIP',prop:'Columnheaderclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_MTO_SDT__CERRARFASE',prop:'Columnheaderclass'}]}");
      setEventMetadata("'DOELIMINARENTRADA'","{handler:'e1127U1',iparms:[{av:'AV8RpExHdFe',fld:'vRPEXHDFE',pic:''}]");
      setEventMetadata("'DOELIMINARENTRADA'",",oparms:[{av:'Dvelop_confirmpanel_eliminarentrada_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARENTRADA',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARENTRADA.CLOSE","{handler:'e1627U2',iparms:[{av:'Dvelop_confirmpanel_eliminarentrada_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARENTRADA',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV17TrabajoExterno_Recepcion_Mto_SDT',fld:'vTRABAJOEXTERNO_RECEPCION_MTO_SDT',grid:46,pic:''},{av:'nGXsfl_46_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:46},{av:'nRC_GXsfl_46',ctrl:'GRID',prop:'GridRC',grid:46},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV90Pgmname',fld:'vPGMNAME',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV8RpExHdFe',fld:'vRPEXHDFE',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARENTRADA.CLOSE",",oparms:[{av:'AV17TrabajoExterno_Recepcion_Mto_SDT',fld:'vTRABAJOEXTERNO_RECEPCION_MTO_SDT',grid:46,pic:''},{av:'nGXsfl_46_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:46},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_46',ctrl:'GRID',prop:'GridRC',grid:46},{av:'AV30GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV31GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDKGS',prop:'Columnheaderclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDMTS',prop:'Columnheaderclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDCNS',prop:'Columnheaderclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDTIP',prop:'Columnheaderclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_MTO_SDT__CERRARFASE',prop:'Columnheaderclass'}]}");
      setEventMetadata("'DOCANCELAR'","{handler:'e1727U2',iparms:[]");
      setEventMetadata("'DOCANCELAR'",",oparms:[]}");
      setEventMetadata("TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDTIP.CONTROLVALUECHANGED","{handler:'e2227U2',iparms:[{av:'AV17TrabajoExterno_Recepcion_Mto_SDT',fld:'vTRABAJOEXTERNO_RECEPCION_MTO_SDT',grid:46,pic:''},{av:'nGXsfl_46_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:46},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_46',ctrl:'GRID',prop:'GridRC',grid:46},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV90Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("TRABAJOEXTERNO_RECEPCION_MTO_SDT__RPEXHDTIP.CONTROLVALUECHANGED",",oparms:[{av:'AV17TrabajoExterno_Recepcion_Mto_SDT',fld:'vTRABAJOEXTERNO_RECEPCION_MTO_SDT',grid:46,pic:''},{av:'nGXsfl_46_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:46},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_46',ctrl:'GRID',prop:'GridRC',grid:46}]}");
      setEventMetadata("VALIDV_GXV24","{handler:'validv_Gxv24',iparms:[]");
      setEventMetadata("VALIDV_GXV24",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv27',iparms:[]");
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
      wcpOAV5Emprcod = "" ;
      wcpOAV7ManNom = "" ;
      wcpOAV8RpExHdFe = GXutil.nullDate() ;
      Gridpaginationbar_Selectedpage = "" ;
      Dvelop_confirmpanel_modificar_Result = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      Dvelop_confirmpanel_eliminarentrada_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV5Emprcod = "" ;
      AV7ManNom = "" ;
      AV8RpExHdFe = GXutil.nullDate() ;
      AV90Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV17TrabajoExterno_Recepcion_Mto_SDT = new GXBaseCollection<app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item>(app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtneliminarentrada_Jsonclick = "" ;
      bttBtncancelar_Jsonclick = "" ;
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
      AV34Station = "" ;
      AV35EmprNom = "" ;
      AV36UsurCod = "" ;
      AV33TrabajoExterno_Recepcion_Mto_json = "" ;
      AV10WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV41kgsd = DecimalUtil.ZERO ;
      AV42mtsd = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      ucDvelop_confirmpanel_modificar = new com.genexus.webpanels.GXUserControl();
      AV43RpExHdFein = GXutil.nullDate() ;
      AV50oldkgs = DecimalUtil.ZERO ;
      AV49oldmts = DecimalUtil.ZERO ;
      AV47RpExHdKgs = DecimalUtil.ZERO ;
      AV46RpExHdMts = DecimalUtil.ZERO ;
      AV48RpExHdTip = "" ;
      AV56barcodpar = "" ;
      AV59FasCodn = "" ;
      AV57Flag = "" ;
      GXv_int9 = new short[1] ;
      GXv_int8 = new short[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_int6 = new short[1] ;
      GXv_char2 = new String[1] ;
      GXv_int16 = new int[1] ;
      GXv_int17 = new byte[1] ;
      GXv_char18 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int21 = new byte[1] ;
      GXv_int15 = new int[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_char3 = new String[1] ;
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      AV38var_RpExHdFe = GXutil.nullDate() ;
      GXv_int20 = new short[1] ;
      GXv_date7 = new java.util.Date[1] ;
      GXv_int12 = new short[1] ;
      GXt_char1 = "" ;
      GXv_char19 = new String[1] ;
      AV24Session = httpContext.getWebSession();
      AV14GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      ucDvelop_confirmpanel_eliminarentrada = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV90Pgmname = "TrabajosExternos.TrabajoExterno_Recepcion_Mto_WP" ;
      /* GeneXus formulas. */
      AV90Pgmname = "TrabajosExternos.TrabajoExterno_Recepcion_Mto_WP" ;
      Gx_err = (short)(0) ;
      edtavMancod_Enabled = 0 ;
      edtavMannom_Enabled = 0 ;
      edtavRpexhdfe_Enabled = 0 ;
      chkavTrabajoexterno_recepcion_mto_sdt__seleccionar.setEnabled( 0 );
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdfe_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdalb_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexhdli_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__barcod_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__barcodreo_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__barcodpar_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__barordlin_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__fascod_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__clicod_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__clinom_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__barser_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__barserdsc_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__rpexsalln_Enabled = 0 ;
      chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase.setEnabled( 0 );
      edtavTrabajoexterno_recepcion_mto_sdt__kgs_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__mts_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__pzs_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__barunimed_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__oldkgs_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__oldmts_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_mto_sdt__oldpzs_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte AV55barcodreo ;
   private byte GXv_int17[] ;
   private byte GXv_int21[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV6ManCod ;
   private short AV6ManCod ;
   private short wbEnd ;
   private short wbStart ;
   private short AV37GridActionGroup1 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV44RpExHdLi ;
   private short AV45RpExHdCns ;
   private short AV53RpExSalLn ;
   private short AV58OrdLin ;
   private short GXv_int9[] ;
   private short GXv_int8[] ;
   private short GXv_int6[] ;
   private short AV39var_RpExHdLi ;
   private short GXv_int20[] ;
   private short GXv_int12[] ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_46 ;
   private int nGXsfl_46_idx=1 ;
   private int AV60SalExtAlb ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavMancod_Enabled ;
   private int edtavMannom_Enabled ;
   private int edtavRpexhdfe_Enabled ;
   private int AV63GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavTrabajoexterno_recepcion_mto_sdt__rpexhdfe_Enabled ;
   private int edtavTrabajoexterno_recepcion_mto_sdt__rpexhdalb_Enabled ;
   private int edtavTrabajoexterno_recepcion_mto_sdt__rpexhdli_Enabled ;
   private int edtavTrabajoexterno_recepcion_mto_sdt__barcod_Enabled ;
   private int edtavTrabajoexterno_recepcion_mto_sdt__barcodreo_Enabled ;
   private int edtavTrabajoexterno_recepcion_mto_sdt__barcodpar_Enabled ;
   private int edtavTrabajoexterno_recepcion_mto_sdt__barordlin_Enabled ;
   private int edtavTrabajoexterno_recepcion_mto_sdt__fascod_Enabled ;
   private int edtavTrabajoexterno_recepcion_mto_sdt__clicod_Enabled ;
   private int edtavTrabajoexterno_recepcion_mto_sdt__clinom_Enabled ;
   private int edtavTrabajoexterno_recepcion_mto_sdt__barser_Enabled ;
   private int edtavTrabajoexterno_recepcion_mto_sdt__barserdsc_Enabled ;
   private int edtavTrabajoexterno_recepcion_mto_sdt__rpexsalln_Enabled ;
   private int edtavTrabajoexterno_recepcion_mto_sdt__kgs_Enabled ;
   private int edtavTrabajoexterno_recepcion_mto_sdt__mts_Enabled ;
   private int edtavTrabajoexterno_recepcion_mto_sdt__pzs_Enabled ;
   private int edtavTrabajoexterno_recepcion_mto_sdt__barunimed_Enabled ;
   private int edtavTrabajoexterno_recepcion_mto_sdt__oldkgs_Enabled ;
   private int edtavTrabajoexterno_recepcion_mto_sdt__oldmts_Enabled ;
   private int edtavTrabajoexterno_recepcion_mto_sdt__oldpzs_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_46_fel_idx=1 ;
   private int AV29PageToGo ;
   private int nGXsfl_46_bak_idx=1 ;
   private int AV51oldcns ;
   private int AV52RpExHdAlb ;
   private int AV54barcod ;
   private int GXv_int16[] ;
   private int GXv_int15[] ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavTrabajoexterno_recepcion_mto_sdt__rpexhdkgs_Enabled ;
   private int edtavTrabajoexterno_recepcion_mto_sdt__rpexhdkgs_Visible ;
   private int edtavTrabajoexterno_recepcion_mto_sdt__rpexhdmts_Enabled ;
   private int edtavTrabajoexterno_recepcion_mto_sdt__rpexhdmts_Visible ;
   private int edtavTrabajoexterno_recepcion_mto_sdt__rpexhdcns_Enabled ;
   private int edtavTrabajoexterno_recepcion_mto_sdt__rpexhdcns_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV30GridCurrentPage ;
   private long AV31GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV41kgsd ;
   private java.math.BigDecimal AV42mtsd ;
   private java.math.BigDecimal AV50oldkgs ;
   private java.math.BigDecimal AV49oldmts ;
   private java.math.BigDecimal AV47RpExHdKgs ;
   private java.math.BigDecimal AV46RpExHdMts ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private String wcpOAV5Emprcod ;
   private String wcpOAV7ManNom ;
   private String Gridpaginationbar_Selectedpage ;
   private String Dvelop_confirmpanel_modificar_Result ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String Dvelop_confirmpanel_eliminarentrada_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV5Emprcod ;
   private String AV7ManNom ;
   private String sGXsfl_46_idx="0001" ;
   private String AV90Pgmname ;
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
   private String Dvelop_confirmpanel_modificar_Title ;
   private String Dvelop_confirmpanel_modificar_Confirmationtext ;
   private String Dvelop_confirmpanel_modificar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_modificar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_modificar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_modificar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_modificar_Confirmtype ;
   private String Dvelop_confirmpanel_eliminar_Title ;
   private String Dvelop_confirmpanel_eliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminar_Confirmtype ;
   private String Dvelop_confirmpanel_eliminarentrada_Title ;
   private String Dvelop_confirmpanel_eliminarentrada_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminarentrada_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarentrada_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminarentrada_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarentrada_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminarentrada_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavMancod_Internalname ;
   private String edtavMancod_Jsonclick ;
   private String edtavMannom_Internalname ;
   private String edtavMannom_Jsonclick ;
   private String edtavRpexhdfe_Internalname ;
   private String edtavRpexhdfe_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String bttBtneliminarentrada_Internalname ;
   private String bttBtneliminarentrada_Jsonclick ;
   private String bttBtncancelar_Internalname ;
   private String bttBtncancelar_Jsonclick ;
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
   private String edtavTrabajoexterno_recepcion_mto_sdt__rpexhdfe_Internalname ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__rpexhdalb_Internalname ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__rpexhdli_Internalname ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__barcod_Internalname ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__barcodreo_Internalname ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__barcodpar_Internalname ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__barordlin_Internalname ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__fascod_Internalname ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__clicod_Internalname ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__clinom_Internalname ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__barser_Internalname ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__barserdsc_Internalname ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__rpexsalln_Internalname ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__kgs_Internalname ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__mts_Internalname ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__pzs_Internalname ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__barunimed_Internalname ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__oldkgs_Internalname ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__oldmts_Internalname ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__oldpzs_Internalname ;
   private String sGXsfl_46_fel_idx="0001" ;
   private String hsh ;
   private String AV34Station ;
   private String AV35EmprNom ;
   private String AV36UsurCod ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__rpexhdkgs_Columnheaderclass ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__rpexhdkgs_Internalname ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__rpexhdmts_Columnheaderclass ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__rpexhdmts_Internalname ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__rpexhdcns_Columnheaderclass ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__rpexhdcns_Internalname ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__rpexhdkgs_Columnclass ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__rpexhdmts_Columnclass ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__rpexhdcns_Columnclass ;
   private String Gx_msg ;
   private String Dvelop_confirmpanel_modificar_Internalname ;
   private String AV48RpExHdTip ;
   private String AV56barcodpar ;
   private String AV59FasCodn ;
   private String AV57Flag ;
   private String GXv_char2[] ;
   private String GXv_char18[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String GXt_char1 ;
   private String GXv_char19[] ;
   private String tblTabledvelop_confirmpanel_eliminarentrada_Internalname ;
   private String Dvelop_confirmpanel_eliminarentrada_Internalname ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String tblTabledvelop_confirmpanel_modificar_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__rpexhdfe_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__rpexhdalb_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__rpexhdli_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__barcod_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__barcodreo_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__barcodpar_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__barordlin_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__fascod_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__clicod_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__clinom_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__barser_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__barserdsc_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__rpexhdkgs_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__rpexhdmts_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__rpexhdcns_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__rpexsalln_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__kgs_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__mts_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__pzs_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__barunimed_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__oldkgs_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__oldmts_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_mto_sdt__oldpzs_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV8RpExHdFe ;
   private java.util.Date AV8RpExHdFe ;
   private java.util.Date AV43RpExHdFein ;
   private java.util.Date AV38var_RpExHdFe ;
   private java.util.Date GXv_date7[] ;
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
   private boolean bGXsfl_46_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV46 ;
   private boolean gx_refresh_fired ;
   private String AV33TrabajoExterno_Recepcion_Mto_json ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV24Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_modificar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminarentrada ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactiongroup1 ;
   private ICheckbox chkavTrabajoexterno_recepcion_mto_sdt__seleccionar ;
   private HTMLChoice cmbavTrabajoexterno_recepcion_mto_sdt__rpexhdtip ;
   private ICheckbox chkavTrabajoexterno_recepcion_mto_sdt__cerrarfase ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item> AV17TrabajoExterno_Recepcion_Mto_SDT ;
   private app.wwpbaseobjects.SdtWWPContext AV10WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV14GridState ;
}

