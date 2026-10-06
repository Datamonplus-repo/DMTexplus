package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class trabajoexterno_recepcion__wp_impl extends GXDataArea
{
   public trabajoexterno_recepcion__wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public trabajoexterno_recepcion__wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_recepcion__wp_impl.class ));
   }

   public trabajoexterno_recepcion__wp_impl( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavTrabajoexterno_recepcion_sdt__seleccionar = UIFactory.getCheckbox(this);
      cmbavTrabajoexterno_recepcion_sdt__rpexhdtip = new HTMLChoice();
      chkavTrabajoexterno_recepcion_sdt__cerrarfase = UIFactory.getCheckbox(this);
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
            AV17Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Emprcod", AV17Emprcod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV18ManCod = (short)(GXutil.lval( httpContext.GetPar( "ManCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18ManCod), 4, 0));
               AV26ManNom = httpContext.GetPar( "ManNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26ManNom", AV26ManNom);
               AV19SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19SalExtAlb), 8, 0));
               AV20Fechafrom = localUtil.parseDateParm( httpContext.GetPar( "Fechafrom")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20Fechafrom", localUtil.format(AV20Fechafrom, "99/99/99"));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECHAFROM", getSecureSignedToken( "", AV20Fechafrom));
               AV21Fechato = localUtil.parseDateParm( httpContext.GetPar( "Fechato")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21Fechato", localUtil.format(AV21Fechato, "99/99/99"));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECHATO", getSecureSignedToken( "", AV21Fechato));
               AV27RpExHdFe = localUtil.parseDateParm( httpContext.GetPar( "RpExHdFe")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27RpExHdFe", localUtil.format(AV27RpExHdFe, "99/99/99"));
               AV28RpExtDoc = httpContext.GetPar( "RpExtDoc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28RpExtDoc", AV28RpExtDoc);
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
      nRC_GXsfl_62 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_62"))) ;
      nGXsfl_62_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_62_idx"))) ;
      sGXsfl_62_idx = httpContext.GetPar( "sGXsfl_62_idx") ;
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
      AV76Pgmname = httpContext.GetPar( "Pgmname") ;
      AV20Fechafrom = localUtil.parseDateParm( httpContext.GetPar( "Fechafrom")) ;
      AV21Fechato = localUtil.parseDateParm( httpContext.GetPar( "Fechato")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV76Pgmname, AV20Fechafrom, AV21Fechato) ;
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
      pa27K2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start27K2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.trabajosexternos.trabajoexterno_recepcion__wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV17Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV18ManCod,4,0)),GXutil.URLEncode(GXutil.rtrim(AV26ManNom)),GXutil.URLEncode(GXutil.ltrimstr(AV19SalExtAlb,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV20Fechafrom)),GXutil.URLEncode(GXutil.formatDateParm(AV21Fechato)),GXutil.URLEncode(GXutil.formatDateParm(AV27RpExHdFe)),GXutil.URLEncode(GXutil.rtrim(AV28RpExtDoc))}, new String[] {"Emprcod","ManCod","ManNom","SalExtAlb","Fechafrom","Fechato","RpExHdFe","RpExtDoc"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECHAFROM", getSecureSignedToken( "", AV20Fechafrom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECHATO", getSecureSignedToken( "", AV21Fechato));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TrabajoExterno_Recepcion__WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV76Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("trabajosexternos\\trabajoexterno_recepcion__wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Trabajoexterno_recepcion_sdt", AV12TrabajoExterno_Recepcion_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Trabajoexterno_recepcion_sdt", AV12TrabajoExterno_Recepcion_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_62", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_62, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV15GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV16GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRABAJOEXTERNO_RECEPCION_SDT", AV12TrabajoExterno_Recepcion_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRABAJOEXTERNO_RECEPCION_SDT", AV12TrabajoExterno_Recepcion_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV17Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vRPEXHDUL", GXutil.ltrim( localUtil.ntoc( AV40RpExHdUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRABAJOEXTERNO_RECEPCION_SDT_ITEM", AV30TrabajoExterno_Recepcion_SDT_item);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRABAJOEXTERNO_RECEPCION_SDT_ITEM", AV30TrabajoExterno_Recepcion_SDT_item);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGXV30", GXutil.ltrim( localUtil.ntoc( AV77GXV30, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLINEAS", GXutil.ltrim( localUtil.ntoc( AV29Lineas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
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
         we27K2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt27K2( ) ;
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
      return formatLink("app.trabajosexternos.trabajoexterno_recepcion__wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV17Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV18ManCod,4,0)),GXutil.URLEncode(GXutil.rtrim(AV26ManNom)),GXutil.URLEncode(GXutil.ltrimstr(AV19SalExtAlb,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV20Fechafrom)),GXutil.URLEncode(GXutil.formatDateParm(AV21Fechato)),GXutil.URLEncode(GXutil.formatDateParm(AV27RpExHdFe)),GXutil.URLEncode(GXutil.rtrim(AV28RpExtDoc))}, new String[] {"Emprcod","ManCod","ManNom","SalExtAlb","Fechafrom","Fechato","RpExHdFe","RpExtDoc"})  ;
   }

   public String getPgmname( )
   {
      return "TrabajosExternos.TrabajoExterno_Recepcion__WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Trabajo Externo (Recepcion)", "") ;
   }

   public void wb27K0( )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMancod_Internalname, GXutil.ltrim( localUtil.ntoc( AV18ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMancod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV18ManCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV18ManCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMancod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMancod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Recepcion__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMannom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMannom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMannom_Internalname, GXutil.rtrim( AV26ManNom), GXutil.rtrim( localUtil.format( AV26ManNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMannom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMannom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Recepcion__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRpexhdfe_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRpexhdfe_Internalname, httpContext.getMessage( "Fecha Recepcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavRpexhdfe_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRpexhdfe_Internalname, localUtil.format(AV27RpExHdFe, "99/99/99"), localUtil.format( AV27RpExHdFe, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRpexhdfe_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRpexhdfe_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Recepcion__WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavRpexhdfe_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavRpexhdfe_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TrabajosExternos\\TrabajoExterno_Recepcion__WP.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRpextdoc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRpextdoc_Internalname, httpContext.getMessage( "Documento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRpextdoc_Internalname, GXutil.rtrim( AV28RpExtDoc), GXutil.rtrim( localUtil.format( AV28RpExtDoc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRpextdoc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRpextdoc_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Recepcion__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalextalb_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalextalb_Internalname, httpContext.getMessage( "Nº Guia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalextalb_Internalname, GXutil.ltrim( localUtil.ntoc( AV19SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavSalextalb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV19SalExtAlb), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV19SalExtAlb), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalextalb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalextalb_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Recepcion__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFechafrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFechafrom_Internalname, httpContext.getMessage( "Fecha Envio Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavFechafrom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFechafrom_Internalname, localUtil.format(AV20Fechafrom, "99/99/99"), localUtil.format( AV20Fechafrom, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFechafrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFechafrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Recepcion__WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFechafrom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFechafrom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TrabajosExternos\\TrabajoExterno_Recepcion__WP.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFechato_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFechato_Internalname, httpContext.getMessage( "Fecha Envio Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavFechato_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFechato_Internalname, localUtil.format(AV21Fechato, "99/99/99"), localUtil.format( AV21Fechato, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFechato_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFechato_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Recepcion__WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFechato_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFechato_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TrabajosExternos\\TrabajoExterno_Recepcion__WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 62, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1127k1_client"+"'", TempTags, "", 2, "HLP_TrabajosExternos\\TrabajoExterno_Recepcion__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 62, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajosExternos\\TrabajoExterno_Recepcion__WP.htm");
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
         startgridcontrol62( ) ;
      }
      if ( wbEnd == 62 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_62 = (int)(nGXsfl_62_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV47GXV1 = nGXsfl_62_idx ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV15GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV16GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV76Pgmname), GXutil.rtrim( localUtil.format( AV76Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Recepcion__WP.htm");
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
         wb_table1_104_27K2( true) ;
      }
      else
      {
         wb_table1_104_27K2( false) ;
      }
      return  ;
   }

   public void wb_table1_104_27K2e( boolean wbgen )
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
      if ( wbEnd == 62 )
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
               AV47GXV1 = nGXsfl_62_idx ;
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

   public void start27K2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Trabajo Externo (Recepcion)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup27K0( ) ;
   }

   public void ws27K2( )
   {
      start27K2( ) ;
      evt27K2( ) ;
   }

   public void evt27K2( )
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
                           e1227K2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1327K2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1427K2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e1527K2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 59), "TRABAJOEXTERNO_RECEPCION_SDT__RPEXHDTIP.CONTROLVALUECHANGED") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 61), "TRABAJOEXTERNO_RECEPCION_SDT__SELECCIONAR.CONTROLVALUECHANGED") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_62_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_622( ) ;
                           AV47GXV1 = (int)(nGXsfl_62_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV12TrabajoExterno_Recepcion_SDT.size() >= AV47GXV1 ) && ( AV47GXV1 > 0 ) )
                           {
                              AV12TrabajoExterno_Recepcion_SDT.currentItem( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)) );
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
                                 e1627K2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e1727K2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e1827K2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "TRABAJOEXTERNO_RECEPCION_SDT__RPEXHDTIP.CONTROLVALUECHANGED") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e1927K2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "TRABAJOEXTERNO_RECEPCION_SDT__SELECCIONAR.CONTROLVALUECHANGED") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2027K2 ();
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

   public void we27K2( )
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

   public void pa27K2( )
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
      subsflControlProps_622( ) ;
      while ( nGXsfl_62_idx <= nRC_GXsfl_62 )
      {
         sendrow_622( ) ;
         nGXsfl_62_idx = ((subGrid_Islastpage==1)&&(nGXsfl_62_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_62_idx+1) ;
         sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_622( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV76Pgmname ,
                                 java.util.Date AV20Fechafrom ,
                                 java.util.Date AV21Fechato )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1727K2 ();
      GRID_nCurrentRecord = 0 ;
      rf27K2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TrabajoExterno_Recepcion__WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV76Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("trabajosexternos\\trabajoexterno_recepcion__wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf27K2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV76Pgmname = "TrabajosExternos.TrabajoExterno_Recepcion__WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76Pgmname", AV76Pgmname);
      Gx_err = (short)(0) ;
      edtavMancod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMancod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMancod_Enabled), 5, 0), true);
      edtavMannom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMannom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMannom_Enabled), 5, 0), true);
      edtavRpexhdfe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRpexhdfe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRpexhdfe_Enabled), 5, 0), true);
      edtavRpextdoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRpextdoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRpextdoc_Enabled), 5, 0), true);
      edtavSalextalb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalextalb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalextalb_Enabled), 5, 0), true);
      edtavFechafrom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFechafrom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFechafrom_Enabled), 5, 0), true);
      edtavFechato_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFechato_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFechato_Enabled), 5, 0), true);
      edtavTrabajoexterno_recepcion_sdt__salextalb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__salextalb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__salextalb_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__salextfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__salextfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__salextfec_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__barcod_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__barcodreo_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__barcodpar_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__clicod_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__clinom_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__barser_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__barserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__barserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__barserdsc_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__ordlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__ordlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__ordlin_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__fascodn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__fascodn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__fascodn_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__fasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__fasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__fasdsc_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__salexnln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__salexnln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__salexnln_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__oldkgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__oldkgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__oldkgs_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__oldmts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__oldmts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__oldmts_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__oldcns_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__oldcns_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__oldcns_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__barnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__barnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__barnomcli_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__mancod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__mancod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__mancod_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__barcolnom_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__barunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__barunimed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__barunimed_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__exhdpz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__exhdpz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__exhdpz_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__salexesb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__salexesb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__salexesb_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf27K2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(62) ;
      /* Execute user event: Refresh */
      e1727K2 ();
      nGXsfl_62_idx = 1 ;
      sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_622( ) ;
      bGXsfl_62_Refreshing = true ;
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
         subsflControlProps_622( ) ;
         e1827K2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_62_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e1827K2 ();
         }
         wbEnd = (short)(62) ;
         wb27K0( ) ;
      }
      bGXsfl_62_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes27K2( )
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
      return AV12TrabajoExterno_Recepcion_SDT.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV76Pgmname, AV20Fechafrom, AV21Fechato) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV76Pgmname, AV20Fechafrom, AV21Fechato) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV76Pgmname, AV20Fechafrom, AV21Fechato) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV76Pgmname, AV20Fechafrom, AV21Fechato) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV76Pgmname, AV20Fechafrom, AV21Fechato) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV76Pgmname = "TrabajosExternos.TrabajoExterno_Recepcion__WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76Pgmname", AV76Pgmname);
      Gx_err = (short)(0) ;
      edtavMancod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMancod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMancod_Enabled), 5, 0), true);
      edtavMannom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMannom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMannom_Enabled), 5, 0), true);
      edtavRpexhdfe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRpexhdfe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRpexhdfe_Enabled), 5, 0), true);
      edtavRpextdoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRpextdoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRpextdoc_Enabled), 5, 0), true);
      edtavSalextalb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalextalb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalextalb_Enabled), 5, 0), true);
      edtavFechafrom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFechafrom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFechafrom_Enabled), 5, 0), true);
      edtavFechato_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFechato_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFechato_Enabled), 5, 0), true);
      edtavTrabajoexterno_recepcion_sdt__salextalb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__salextalb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__salextalb_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__salextfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__salextfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__salextfec_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__barcod_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__barcodreo_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__barcodpar_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__clicod_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__clinom_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__barser_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__barserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__barserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__barserdsc_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__ordlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__ordlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__ordlin_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__fascodn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__fascodn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__fascodn_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__fasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__fasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__fasdsc_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__salexnln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__salexnln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__salexnln_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__oldkgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__oldkgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__oldkgs_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__oldmts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__oldmts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__oldmts_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__oldcns_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__oldcns_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__oldcns_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__barnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__barnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__barnomcli_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__mancod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__mancod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__mancod_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__barcolnom_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__barunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__barunimed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__barunimed_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__exhdpz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__exhdpz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__exhdpz_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__salexesb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__salexesb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_recepcion_sdt__salexesb_Enabled), 5, 0), !bGXsfl_62_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup27K0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1627K2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Trabajoexterno_recepcion_sdt"), AV12TrabajoExterno_Recepcion_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTRABAJOEXTERNO_RECEPCION_SDT"), AV12TrabajoExterno_Recepcion_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTRABAJOEXTERNO_RECEPCION_SDT_ITEM"), AV30TrabajoExterno_Recepcion_SDT_item);
         /* Read saved values. */
         nRC_GXsfl_62 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_62"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV15GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV16GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV77GXV30 = (int)(localUtil.ctol( httpContext.cgiGet( "vGXV30"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV29Lineas = (short)(localUtil.ctol( httpContext.cgiGet( "vLINEAS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Dvelop_confirmpanel_confirmar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Title") ;
         Dvelop_confirmpanel_confirmar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_confirmar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_confirmar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Dvelop_confirmpanel_confirmar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Result") ;
         nRC_GXsfl_62 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_62"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_62_fel_idx = 0 ;
         while ( nGXsfl_62_fel_idx < nRC_GXsfl_62 )
         {
            nGXsfl_62_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_62_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_62_fel_idx+1) ;
            sGXsfl_62_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_622( ) ;
            AV47GXV1 = (int)(nGXsfl_62_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV12TrabajoExterno_Recepcion_SDT.size() >= AV47GXV1 ) && ( AV47GXV1 > 0 ) )
            {
               AV12TrabajoExterno_Recepcion_SDT.currentItem( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)) );
            }
         }
         if ( nGXsfl_62_fel_idx == 0 )
         {
            nGXsfl_62_idx = 1 ;
            sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_622( ) ;
         }
         nGXsfl_62_fel_idx = 1 ;
         /* Read variables values. */
         AV76Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV76Pgmname", AV76Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TrabajoExterno_Recepcion__WP");
         AV76Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV76Pgmname", AV76Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV76Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("trabajosexternos\\trabajoexterno_recepcion__wp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1627K2 ();
      if (returnInSub) return;
   }

   public void e1627K2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV23Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      trabajoexterno_recepcion__wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Station = GXt_char1 ;
      GXv_char2[0] = AV17Emprcod ;
      GXv_char3[0] = AV24EmprNom ;
      GXv_char4[0] = AV25UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV23Station, GXv_char2, GXv_char3, GXv_char4) ;
      trabajoexterno_recepcion__wp_impl.this.AV17Emprcod = GXv_char2[0] ;
      trabajoexterno_recepcion__wp_impl.this.AV24EmprNom = GXv_char3[0] ;
      trabajoexterno_recepcion__wp_impl.this.AV25UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Emprcod", AV17Emprcod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Trabajo Externo (Recepcion)", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_char1 = AV22TrabajoExterno_Recepcion_SDT_json ;
      GXv_char4[0] = GXt_char1 ;
      new app.trabajosexternos.trabajoexterno_recepcion_prc(remoteHandle, context).execute( AV17Emprcod, AV18ManCod, AV19SalExtAlb, AV20Fechafrom, AV21Fechato, GXv_char4) ;
      trabajoexterno_recepcion__wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV22TrabajoExterno_Recepcion_SDT_json = GXt_char1 ;
      AV12TrabajoExterno_Recepcion_SDT.fromJSonString(AV22TrabajoExterno_Recepcion_SDT_json, null);
      gx_BV62 = true ;
   }

   public void e1727K2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext5[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV6WWPContext = GXv_SdtWWPContext5[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S132 ();
      if (returnInSub) return;
      AV15GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15GridCurrentPage), 10, 0));
      AV16GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16GridPageCount), 10, 0));
      edtavTrabajoexterno_recepcion_sdt__rpexhdcns_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__rpexhdcns_Internalname, "Columnheaderclass", edtavTrabajoexterno_recepcion_sdt__rpexhdcns_Columnheaderclass, !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__rpexhdkgs_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__rpexhdkgs_Internalname, "Columnheaderclass", edtavTrabajoexterno_recepcion_sdt__rpexhdkgs_Columnheaderclass, !bGXsfl_62_Refreshing);
      edtavTrabajoexterno_recepcion_sdt__rpexhdmts_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_recepcion_sdt__rpexhdmts_Internalname, "Columnheaderclass", edtavTrabajoexterno_recepcion_sdt__rpexhdmts_Columnheaderclass, !bGXsfl_62_Refreshing);
      cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.getInternalname(), "Columnheaderclass", cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.getColumnHeaderClass(), !bGXsfl_62_Refreshing);
      chkavTrabajoexterno_recepcion_sdt__cerrarfase.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop("", false, chkavTrabajoexterno_recepcion_sdt__cerrarfase.getInternalname(), "Columnheaderclass", chkavTrabajoexterno_recepcion_sdt__cerrarfase.getColumnHeaderClass(), !bGXsfl_62_Refreshing);
      /*  Sending Event outputs  */
   }

   public void e1227K2( )
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
         AV14PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV14PageToGo) ;
      }
   }

   public void e1327K2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e1827K2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV47GXV1 = 1 ;
      while ( AV47GXV1 <= AV12TrabajoExterno_Recepcion_SDT.size() )
      {
         AV12TrabajoExterno_Recepcion_SDT.currentItem( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)) );
         edtavTrabajoexterno_recepcion_sdt__rpexhdcns_Columnclass = "WWColumn WWColumnSuccess WWColumnSuccessSingleCell" ;
         edtavTrabajoexterno_recepcion_sdt__rpexhdkgs_Columnclass = "WWColumn WWColumnSuccess WWColumnSuccessSingleCell" ;
         edtavTrabajoexterno_recepcion_sdt__rpexhdmts_Columnclass = "WWColumn WWColumnSuccess WWColumnSuccessSingleCell" ;
         cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.setColumnClass( "WWColumn WWColumnSuccess WWColumnSuccessSingleCell" );
         chkavTrabajoexterno_recepcion_sdt__cerrarfase.setColumnClass( "WWColumn WWColumnSuccess WWColumnSuccessSingleCell" );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(62) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_622( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_62_Refreshing )
         {
            httpContext.doAjaxLoad(62, GridRow);
         }
         AV47GXV1 = (int)(AV47GXV1+1) ;
      }
      /*  Sending Event outputs  */
   }

   public void e1427K2( )
   {
      AV47GXV1 = (int)(nGXsfl_62_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV47GXV1 > 0 ) && ( AV12TrabajoExterno_Recepcion_SDT.size() >= AV47GXV1 ) )
      {
         AV12TrabajoExterno_Recepcion_SDT.currentItem( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)) );
      }
      /* Dvelop_confirmpanel_confirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_confirmar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFIRMAR' */
         S142 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12TrabajoExterno_Recepcion_SDT", AV12TrabajoExterno_Recepcion_SDT);
      nGXsfl_62_bak_idx = nGXsfl_62_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV76Pgmname, AV20Fechafrom, AV21Fechato) ;
      nGXsfl_62_idx = nGXsfl_62_bak_idx ;
      sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_622( ) ;
   }

   public void e1527K2( )
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
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      AV78GXV31 = 1 ;
      while ( AV78GXV31 <= AV12TrabajoExterno_Recepcion_SDT.size() )
      {
         AV30TrabajoExterno_Recepcion_SDT_item = (app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV78GXV31));
         if ( AV30TrabajoExterno_Recepcion_SDT_item.getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Seleccionar() )
         {
            AV31BarCod = AV30TrabajoExterno_Recepcion_SDT_item.getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcod() ;
            AV32BarCodReo = AV30TrabajoExterno_Recepcion_SDT_item.getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodreo() ;
            AV33BarCodPar = AV30TrabajoExterno_Recepcion_SDT_item.getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodpar() ;
            AV34SalExtAlb_grid = AV30TrabajoExterno_Recepcion_SDT_item.getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextalb() ;
            AV35RpExHdCns = AV30TrabajoExterno_Recepcion_SDT_item.getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdcns() ;
            AV36RpExHdKgs = AV30TrabajoExterno_Recepcion_SDT_item.getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdkgs() ;
            AV37RpExHdMts = AV30TrabajoExterno_Recepcion_SDT_item.getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdmts() ;
            AV38RpExHdTip = AV30TrabajoExterno_Recepcion_SDT_item.getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdtip() ;
            AV39SalExNln = AV30TrabajoExterno_Recepcion_SDT_item.getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexnln() ;
            AV41OrdLin = AV30TrabajoExterno_Recepcion_SDT_item.getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Ordlin() ;
            AV43FasCodn = AV30TrabajoExterno_Recepcion_SDT_item.getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fascodn() ;
            if ( AV30TrabajoExterno_Recepcion_SDT_item.getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Cerrarfase() )
            {
               AV44Flag = "S" ;
            }
            else
            {
               AV44Flag = "N" ;
            }
            GXv_char4[0] = AV17Emprcod ;
            GXv_int6[0] = AV18ManCod ;
            GXv_date7[0] = AV27RpExHdFe ;
            GXv_int8[0] = AV31BarCod ;
            GXv_int9[0] = AV32BarCodReo ;
            GXv_char3[0] = AV33BarCodPar ;
            GXv_int10[0] = AV34SalExtAlb_grid ;
            GXv_int11[0] = AV35RpExHdCns ;
            GXv_decimal12[0] = AV36RpExHdKgs ;
            GXv_decimal13[0] = AV37RpExHdMts ;
            GXv_char2[0] = AV38RpExHdTip ;
            GXv_int14[0] = AV39SalExNln ;
            GXv_char15[0] = AV28RpExtDoc ;
            GXv_int16[0] = AV40RpExHdUl ;
            new app.pwork05(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_date7, GXv_int8, GXv_int9, GXv_char3, GXv_int10, GXv_int11, GXv_decimal12, GXv_decimal13, GXv_char2, GXv_int14, GXv_char15, GXv_int16) ;
            trabajoexterno_recepcion__wp_impl.this.AV17Emprcod = GXv_char4[0] ;
            trabajoexterno_recepcion__wp_impl.this.AV18ManCod = GXv_int6[0] ;
            trabajoexterno_recepcion__wp_impl.this.AV27RpExHdFe = GXv_date7[0] ;
            trabajoexterno_recepcion__wp_impl.this.AV31BarCod = GXv_int8[0] ;
            trabajoexterno_recepcion__wp_impl.this.AV32BarCodReo = GXv_int9[0] ;
            trabajoexterno_recepcion__wp_impl.this.AV33BarCodPar = GXv_char3[0] ;
            trabajoexterno_recepcion__wp_impl.this.AV34SalExtAlb_grid = GXv_int10[0] ;
            trabajoexterno_recepcion__wp_impl.this.AV35RpExHdCns = GXv_int11[0] ;
            trabajoexterno_recepcion__wp_impl.this.AV36RpExHdKgs = GXv_decimal12[0] ;
            trabajoexterno_recepcion__wp_impl.this.AV37RpExHdMts = GXv_decimal13[0] ;
            trabajoexterno_recepcion__wp_impl.this.AV38RpExHdTip = GXv_char2[0] ;
            trabajoexterno_recepcion__wp_impl.this.AV39SalExNln = GXv_int14[0] ;
            trabajoexterno_recepcion__wp_impl.this.AV28RpExtDoc = GXv_char15[0] ;
            trabajoexterno_recepcion__wp_impl.this.AV40RpExHdUl = GXv_int16[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Emprcod", AV17Emprcod);
            httpContext.ajax_rsp_assign_attri("", false, "AV18ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18ManCod), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV27RpExHdFe", localUtil.format(AV27RpExHdFe, "99/99/99"));
            httpContext.ajax_rsp_assign_attri("", false, "AV28RpExtDoc", AV28RpExtDoc);
            httpContext.ajax_rsp_assign_attri("", false, "AV40RpExHdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40RpExHdUl), 4, 0));
            if ( GXutil.strcmp(AV38RpExHdTip, "T") == 0 )
            {
               GXv_char15[0] = AV17Emprcod ;
               GXv_int10[0] = AV31BarCod ;
               GXv_int9[0] = AV32BarCodReo ;
               GXv_char4[0] = AV33BarCodPar ;
               GXv_int16[0] = AV41OrdLin ;
               GXv_char3[0] = AV43FasCodn ;
               GXv_date7[0] = AV27RpExHdFe ;
               GXv_int17[0] = (byte)(2) ;
               GXv_int8[0] = AV19SalExtAlb ;
               GXv_int14[0] = AV35RpExHdCns ;
               GXv_decimal13[0] = AV36RpExHdKgs ;
               GXv_decimal12[0] = AV37RpExHdMts ;
               GXv_char2[0] = AV44Flag ;
               new app.phdrexwpasoflag(remoteHandle, context).execute( GXv_char15, GXv_int10, GXv_int9, GXv_char4, GXv_int16, GXv_char3, GXv_date7, GXv_int17, GXv_int8, GXv_int14, GXv_decimal13, GXv_decimal12, GXv_char2) ;
               trabajoexterno_recepcion__wp_impl.this.AV17Emprcod = GXv_char15[0] ;
               trabajoexterno_recepcion__wp_impl.this.AV31BarCod = GXv_int10[0] ;
               trabajoexterno_recepcion__wp_impl.this.AV32BarCodReo = GXv_int9[0] ;
               trabajoexterno_recepcion__wp_impl.this.AV33BarCodPar = GXv_char4[0] ;
               trabajoexterno_recepcion__wp_impl.this.AV41OrdLin = GXv_int16[0] ;
               trabajoexterno_recepcion__wp_impl.this.AV43FasCodn = GXv_char3[0] ;
               trabajoexterno_recepcion__wp_impl.this.AV27RpExHdFe = GXv_date7[0] ;
               trabajoexterno_recepcion__wp_impl.this.AV19SalExtAlb = GXv_int8[0] ;
               trabajoexterno_recepcion__wp_impl.this.AV35RpExHdCns = GXv_int14[0] ;
               trabajoexterno_recepcion__wp_impl.this.AV36RpExHdKgs = GXv_decimal13[0] ;
               trabajoexterno_recepcion__wp_impl.this.AV37RpExHdMts = GXv_decimal12[0] ;
               trabajoexterno_recepcion__wp_impl.this.AV44Flag = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17Emprcod", AV17Emprcod);
               httpContext.ajax_rsp_assign_attri("", false, "AV27RpExHdFe", localUtil.format(AV27RpExHdFe, "99/99/99"));
               httpContext.ajax_rsp_assign_attri("", false, "AV19SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19SalExtAlb), 8, 0));
            }
            GXv_char15[0] = AV17Emprcod ;
            GXv_int16[0] = AV18ManCod ;
            GXv_char4[0] = "R" ;
            GXv_int10[0] = AV34SalExtAlb_grid ;
            GXv_int14[0] = AV40RpExHdUl ;
            GXv_decimal13[0] = AV36RpExHdKgs ;
            GXv_decimal12[0] = AV37RpExHdMts ;
            GXv_int11[0] = AV35RpExHdCns ;
            GXv_date7[0] = AV27RpExHdFe ;
            GXv_int8[0] = AV31BarCod ;
            GXv_int17[0] = AV32BarCodReo ;
            GXv_char3[0] = AV33BarCodPar ;
            GXv_char2[0] = AV38RpExHdTip ;
            GXv_char18[0] = "N" ;
            GXv_int6[0] = AV39SalExNln ;
            new app.trabajosexternos.pamvrhd1(remoteHandle, context).execute( GXv_char15, GXv_int16, GXv_char4, GXv_int10, GXv_int14, GXv_decimal13, GXv_decimal12, GXv_int11, GXv_date7, GXv_int8, GXv_int17, GXv_char3, GXv_char2, GXv_char18, GXv_int6) ;
            trabajoexterno_recepcion__wp_impl.this.AV17Emprcod = GXv_char15[0] ;
            trabajoexterno_recepcion__wp_impl.this.AV18ManCod = GXv_int16[0] ;
            trabajoexterno_recepcion__wp_impl.this.AV34SalExtAlb_grid = GXv_int10[0] ;
            trabajoexterno_recepcion__wp_impl.this.AV40RpExHdUl = GXv_int14[0] ;
            trabajoexterno_recepcion__wp_impl.this.AV36RpExHdKgs = GXv_decimal13[0] ;
            trabajoexterno_recepcion__wp_impl.this.AV37RpExHdMts = GXv_decimal12[0] ;
            trabajoexterno_recepcion__wp_impl.this.AV35RpExHdCns = GXv_int11[0] ;
            trabajoexterno_recepcion__wp_impl.this.AV27RpExHdFe = GXv_date7[0] ;
            trabajoexterno_recepcion__wp_impl.this.AV31BarCod = GXv_int8[0] ;
            trabajoexterno_recepcion__wp_impl.this.AV32BarCodReo = GXv_int17[0] ;
            trabajoexterno_recepcion__wp_impl.this.AV33BarCodPar = GXv_char3[0] ;
            trabajoexterno_recepcion__wp_impl.this.AV38RpExHdTip = GXv_char2[0] ;
            trabajoexterno_recepcion__wp_impl.this.AV39SalExNln = GXv_int6[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Emprcod", AV17Emprcod);
            httpContext.ajax_rsp_assign_attri("", false, "AV18ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18ManCod), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV40RpExHdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40RpExHdUl), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV27RpExHdFe", localUtil.format(AV27RpExHdFe, "99/99/99"));
         }
         AV78GXV31 = (int)(AV78GXV31+1) ;
      }
      GXt_char1 = AV22TrabajoExterno_Recepcion_SDT_json ;
      GXv_char18[0] = GXt_char1 ;
      new app.trabajosexternos.trabajoexterno_recepcion_prc(remoteHandle, context).execute( AV17Emprcod, AV18ManCod, AV19SalExtAlb, AV20Fechafrom, AV21Fechato, GXv_char18) ;
      trabajoexterno_recepcion__wp_impl.this.GXt_char1 = GXv_char18[0] ;
      AV22TrabajoExterno_Recepcion_SDT_json = GXt_char1 ;
      AV12TrabajoExterno_Recepcion_SDT.fromJSonString(AV22TrabajoExterno_Recepcion_SDT_json, null);
      gx_BV62 = true ;
      httpContext.doAjaxRefresh();
   }

   public void S112( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV13Session.getValue(AV76Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV76Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV13Session.getValue(AV76Pgmname+"GridState"), null, null);
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
      AV10GridState.fromxml(AV13Session.getValue(AV76Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV76Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void e1927K2( )
   {
      AV47GXV1 = (int)(nGXsfl_62_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV47GXV1 > 0 ) && ( AV12TrabajoExterno_Recepcion_SDT.size() >= AV47GXV1 ) )
      {
         AV12TrabajoExterno_Recepcion_SDT.currentItem( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)) );
      }
      /* Trabajoexterno_recepcion_sdt__rpexhdtip_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)(AV12TrabajoExterno_Recepcion_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdtip(), "T") == 0 )
      {
         ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)(AV12TrabajoExterno_Recepcion_SDT.currentItem())).setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Cerrarfase( true );
      }
      else
      {
         ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)(AV12TrabajoExterno_Recepcion_SDT.currentItem())).setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Cerrarfase( false );
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Ha seleccionado Parcial. Debe de modificar Kilos y/o Metros", ""));
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12TrabajoExterno_Recepcion_SDT", AV12TrabajoExterno_Recepcion_SDT);
      nGXsfl_62_bak_idx = nGXsfl_62_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV76Pgmname, AV20Fechafrom, AV21Fechato) ;
      nGXsfl_62_idx = nGXsfl_62_bak_idx ;
      sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_622( ) ;
   }

   public void e2027K2( )
   {
      AV47GXV1 = (int)(nGXsfl_62_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV47GXV1 > 0 ) && ( AV12TrabajoExterno_Recepcion_SDT.size() >= AV47GXV1 ) )
      {
         AV12TrabajoExterno_Recepcion_SDT.currentItem( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)) );
      }
      /* Trabajoexterno_recepcion_sdt__seleccionar_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)(AV12TrabajoExterno_Recepcion_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Seleccionar() )
      {
         if ( GXutil.resetTime(AV27RpExHdFe).before( GXutil.resetTime( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)(AV12TrabajoExterno_Recepcion_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec() )) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "La fecha de Recepcion ", "")+GXutil.trim( localUtil.dtoc( AV27RpExHdFe, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+httpContext.getMessage( " es inferior a la Fecha Envio ", "")+GXutil.trim( localUtil.dtoc( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)(AV12TrabajoExterno_Recepcion_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+httpContext.getMessage( " de la linea seleccionada", ""));
            ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)(AV12TrabajoExterno_Recepcion_SDT.currentItem())).setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Seleccionar( false );
            GX_FocusControl = cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         if ( ( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)(AV12TrabajoExterno_Recepcion_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdmts().doubleValue() == 0 ) && ( GXutil.strcmp(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)(AV12TrabajoExterno_Recepcion_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barunimed(), "M") == 0 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Para seleccionar (Op), se ha de introducir los Metros", ""));
            ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)(AV12TrabajoExterno_Recepcion_SDT.currentItem())).setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Seleccionar( false );
            GX_FocusControl = edtavTrabajoexterno_recepcion_sdt__rpexhdmts_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         if ( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)(AV12TrabajoExterno_Recepcion_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdmts().doubleValue() > 0 )
         {
            if ( DecimalUtil.compareTo(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)(AV12TrabajoExterno_Recepcion_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdmts(), ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)(AV12TrabajoExterno_Recepcion_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldmts()) > 0 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Metros Recepcion ", "")+GXutil.trim( GXutil.str( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)(AV12TrabajoExterno_Recepcion_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdmts(), 9, 2))+httpContext.getMessage( " > Metros Disponibles ", "")+GXutil.trim( GXutil.str( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)(AV12TrabajoExterno_Recepcion_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldmts(), 9, 2)));
               ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)(AV12TrabajoExterno_Recepcion_SDT.currentItem())).setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Seleccionar( false );
               GX_FocusControl = edtavTrabajoexterno_recepcion_sdt__rpexhdmts_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
         }
         if ( ( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)(AV12TrabajoExterno_Recepcion_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdkgs().doubleValue() == 0 ) && ( GXutil.strcmp(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)(AV12TrabajoExterno_Recepcion_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barunimed(), "K") == 0 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Para seleccionar (Op), se ha de introducir los Kilos", ""));
            ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)(AV12TrabajoExterno_Recepcion_SDT.currentItem())).setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Seleccionar( false );
            GX_FocusControl = edtavTrabajoexterno_recepcion_sdt__rpexhdkgs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         if ( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)(AV12TrabajoExterno_Recepcion_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdkgs().doubleValue() > 0 )
         {
            if ( DecimalUtil.compareTo(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)(AV12TrabajoExterno_Recepcion_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdkgs(), ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)(AV12TrabajoExterno_Recepcion_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldkgs()) > 0 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Kilos Recepcion ", "")+GXutil.trim( GXutil.str( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)(AV12TrabajoExterno_Recepcion_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdkgs(), 9, 2))+httpContext.getMessage( " > Kilos Disponibles ", "")+GXutil.trim( GXutil.str( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)(AV12TrabajoExterno_Recepcion_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldkgs(), 9, 2)));
               ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)(AV12TrabajoExterno_Recepcion_SDT.currentItem())).setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Seleccionar( false );
               GX_FocusControl = edtavTrabajoexterno_recepcion_sdt__rpexhdkgs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
         }
         if ( GXutil.strcmp(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)(AV12TrabajoExterno_Recepcion_SDT.currentItem())).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdtip(), "*") == 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Debe de indicar si es Total o Parcial la recepcion", ""));
            ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)(AV12TrabajoExterno_Recepcion_SDT.currentItem())).setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Seleccionar( false );
            GX_FocusControl = cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12TrabajoExterno_Recepcion_SDT", AV12TrabajoExterno_Recepcion_SDT);
      nGXsfl_62_bak_idx = nGXsfl_62_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV76Pgmname, AV20Fechafrom, AV21Fechato) ;
      nGXsfl_62_idx = nGXsfl_62_bak_idx ;
      sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_622( ) ;
   }

   public void wb_table1_104_27K2( boolean wbgen )
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
         ucDvelop_confirmpanel_confirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_confirmar_Internalname, "DVELOP_CONFIRMPANEL_CONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_CONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_104_27K2e( true) ;
      }
      else
      {
         wb_table1_104_27K2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV17Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Emprcod", AV17Emprcod);
      AV18ManCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18ManCod), 4, 0));
      AV26ManNom = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26ManNom", AV26ManNom);
      AV19SalExtAlb = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19SalExtAlb), 8, 0));
      AV20Fechafrom = (java.util.Date)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Fechafrom", localUtil.format(AV20Fechafrom, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECHAFROM", getSecureSignedToken( "", AV20Fechafrom));
      AV21Fechato = (java.util.Date)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Fechato", localUtil.format(AV21Fechato, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECHATO", getSecureSignedToken( "", AV21Fechato));
      AV27RpExHdFe = (java.util.Date)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27RpExHdFe", localUtil.format(AV27RpExHdFe, "99/99/99"));
      AV28RpExtDoc = (String)getParm(obj,7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28RpExtDoc", AV28RpExtDoc);
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
      pa27K2( ) ;
      ws27K2( ) ;
      we27K2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116145779", true, true);
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
      httpContext.AddJavascriptSource("trabajosexternos/trabajoexterno_recepcion__wp.js", "?202682116145779", false, true);
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

   public void subsflControlProps_622( )
   {
      chkavTrabajoexterno_recepcion_sdt__seleccionar.setInternalname( "TRABAJOEXTERNO_RECEPCION_SDT__SELECCIONAR_"+sGXsfl_62_idx );
      edtavTrabajoexterno_recepcion_sdt__salextalb_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__SALEXTALB_"+sGXsfl_62_idx ;
      edtavTrabajoexterno_recepcion_sdt__salextfec_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__SALEXTFEC_"+sGXsfl_62_idx ;
      edtavTrabajoexterno_recepcion_sdt__barcod_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__BARCOD_"+sGXsfl_62_idx ;
      edtavTrabajoexterno_recepcion_sdt__barcodreo_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__BARCODREO_"+sGXsfl_62_idx ;
      edtavTrabajoexterno_recepcion_sdt__barcodpar_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__BARCODPAR_"+sGXsfl_62_idx ;
      edtavTrabajoexterno_recepcion_sdt__clicod_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__CLICOD_"+sGXsfl_62_idx ;
      edtavTrabajoexterno_recepcion_sdt__clinom_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__CLINOM_"+sGXsfl_62_idx ;
      edtavTrabajoexterno_recepcion_sdt__barser_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__BARSER_"+sGXsfl_62_idx ;
      edtavTrabajoexterno_recepcion_sdt__barserdsc_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__BARSERDSC_"+sGXsfl_62_idx ;
      edtavTrabajoexterno_recepcion_sdt__ordlin_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__ORDLIN_"+sGXsfl_62_idx ;
      edtavTrabajoexterno_recepcion_sdt__fascodn_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__FASCODN_"+sGXsfl_62_idx ;
      edtavTrabajoexterno_recepcion_sdt__fasdsc_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__FASDSC_"+sGXsfl_62_idx ;
      edtavTrabajoexterno_recepcion_sdt__rpexhdcns_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__RPEXHDCNS_"+sGXsfl_62_idx ;
      edtavTrabajoexterno_recepcion_sdt__rpexhdkgs_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__RPEXHDKGS_"+sGXsfl_62_idx ;
      edtavTrabajoexterno_recepcion_sdt__rpexhdmts_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__RPEXHDMTS_"+sGXsfl_62_idx ;
      cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.setInternalname( "TRABAJOEXTERNO_RECEPCION_SDT__RPEXHDTIP_"+sGXsfl_62_idx );
      chkavTrabajoexterno_recepcion_sdt__cerrarfase.setInternalname( "TRABAJOEXTERNO_RECEPCION_SDT__CERRARFASE_"+sGXsfl_62_idx );
      edtavTrabajoexterno_recepcion_sdt__salexnln_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__SALEXNLN_"+sGXsfl_62_idx ;
      edtavTrabajoexterno_recepcion_sdt__oldkgs_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__OLDKGS_"+sGXsfl_62_idx ;
      edtavTrabajoexterno_recepcion_sdt__oldmts_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__OLDMTS_"+sGXsfl_62_idx ;
      edtavTrabajoexterno_recepcion_sdt__oldcns_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__OLDCNS_"+sGXsfl_62_idx ;
      edtavTrabajoexterno_recepcion_sdt__barnomcli_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__BARNOMCLI_"+sGXsfl_62_idx ;
      edtavTrabajoexterno_recepcion_sdt__mancod_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__MANCOD_"+sGXsfl_62_idx ;
      edtavTrabajoexterno_recepcion_sdt__barcolnom_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__BARCOLNOM_"+sGXsfl_62_idx ;
      edtavTrabajoexterno_recepcion_sdt__barunimed_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__BARUNIMED_"+sGXsfl_62_idx ;
      edtavTrabajoexterno_recepcion_sdt__exhdpz_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__EXHDPZ_"+sGXsfl_62_idx ;
      edtavTrabajoexterno_recepcion_sdt__salexesb_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__SALEXESB_"+sGXsfl_62_idx ;
   }

   public void subsflControlProps_fel_622( )
   {
      chkavTrabajoexterno_recepcion_sdt__seleccionar.setInternalname( "TRABAJOEXTERNO_RECEPCION_SDT__SELECCIONAR_"+sGXsfl_62_fel_idx );
      edtavTrabajoexterno_recepcion_sdt__salextalb_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__SALEXTALB_"+sGXsfl_62_fel_idx ;
      edtavTrabajoexterno_recepcion_sdt__salextfec_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__SALEXTFEC_"+sGXsfl_62_fel_idx ;
      edtavTrabajoexterno_recepcion_sdt__barcod_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__BARCOD_"+sGXsfl_62_fel_idx ;
      edtavTrabajoexterno_recepcion_sdt__barcodreo_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__BARCODREO_"+sGXsfl_62_fel_idx ;
      edtavTrabajoexterno_recepcion_sdt__barcodpar_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__BARCODPAR_"+sGXsfl_62_fel_idx ;
      edtavTrabajoexterno_recepcion_sdt__clicod_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__CLICOD_"+sGXsfl_62_fel_idx ;
      edtavTrabajoexterno_recepcion_sdt__clinom_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__CLINOM_"+sGXsfl_62_fel_idx ;
      edtavTrabajoexterno_recepcion_sdt__barser_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__BARSER_"+sGXsfl_62_fel_idx ;
      edtavTrabajoexterno_recepcion_sdt__barserdsc_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__BARSERDSC_"+sGXsfl_62_fel_idx ;
      edtavTrabajoexterno_recepcion_sdt__ordlin_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__ORDLIN_"+sGXsfl_62_fel_idx ;
      edtavTrabajoexterno_recepcion_sdt__fascodn_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__FASCODN_"+sGXsfl_62_fel_idx ;
      edtavTrabajoexterno_recepcion_sdt__fasdsc_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__FASDSC_"+sGXsfl_62_fel_idx ;
      edtavTrabajoexterno_recepcion_sdt__rpexhdcns_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__RPEXHDCNS_"+sGXsfl_62_fel_idx ;
      edtavTrabajoexterno_recepcion_sdt__rpexhdkgs_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__RPEXHDKGS_"+sGXsfl_62_fel_idx ;
      edtavTrabajoexterno_recepcion_sdt__rpexhdmts_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__RPEXHDMTS_"+sGXsfl_62_fel_idx ;
      cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.setInternalname( "TRABAJOEXTERNO_RECEPCION_SDT__RPEXHDTIP_"+sGXsfl_62_fel_idx );
      chkavTrabajoexterno_recepcion_sdt__cerrarfase.setInternalname( "TRABAJOEXTERNO_RECEPCION_SDT__CERRARFASE_"+sGXsfl_62_fel_idx );
      edtavTrabajoexterno_recepcion_sdt__salexnln_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__SALEXNLN_"+sGXsfl_62_fel_idx ;
      edtavTrabajoexterno_recepcion_sdt__oldkgs_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__OLDKGS_"+sGXsfl_62_fel_idx ;
      edtavTrabajoexterno_recepcion_sdt__oldmts_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__OLDMTS_"+sGXsfl_62_fel_idx ;
      edtavTrabajoexterno_recepcion_sdt__oldcns_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__OLDCNS_"+sGXsfl_62_fel_idx ;
      edtavTrabajoexterno_recepcion_sdt__barnomcli_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__BARNOMCLI_"+sGXsfl_62_fel_idx ;
      edtavTrabajoexterno_recepcion_sdt__mancod_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__MANCOD_"+sGXsfl_62_fel_idx ;
      edtavTrabajoexterno_recepcion_sdt__barcolnom_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__BARCOLNOM_"+sGXsfl_62_fel_idx ;
      edtavTrabajoexterno_recepcion_sdt__barunimed_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__BARUNIMED_"+sGXsfl_62_fel_idx ;
      edtavTrabajoexterno_recepcion_sdt__exhdpz_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__EXHDPZ_"+sGXsfl_62_fel_idx ;
      edtavTrabajoexterno_recepcion_sdt__salexesb_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__SALEXESB_"+sGXsfl_62_fel_idx ;
   }

   public void sendrow_622( )
   {
      subsflControlProps_622( ) ;
      wb27K0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_62_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_62_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_62_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavTrabajoexterno_recepcion_sdt__seleccionar.getEnabled()!=0)&&(chkavTrabajoexterno_recepcion_sdt__seleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 63,'',false,'"+sGXsfl_62_idx+"',62)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "TRABAJOEXTERNO_RECEPCION_SDT__SELECCIONAR_" + sGXsfl_62_idx ;
         chkavTrabajoexterno_recepcion_sdt__seleccionar.setName( GXCCtl );
         chkavTrabajoexterno_recepcion_sdt__seleccionar.setWebtags( "" );
         chkavTrabajoexterno_recepcion_sdt__seleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavTrabajoexterno_recepcion_sdt__seleccionar.getInternalname(), "TitleCaption", chkavTrabajoexterno_recepcion_sdt__seleccionar.getCaption(), !bGXsfl_62_Refreshing);
         chkavTrabajoexterno_recepcion_sdt__seleccionar.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavTrabajoexterno_recepcion_sdt__seleccionar.getInternalname(),GXutil.booltostr( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Seleccionar()),"","",Integer.valueOf(-1),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(63, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavTrabajoexterno_recepcion_sdt__seleccionar.getEnabled()!=0)&&(chkavTrabajoexterno_recepcion_sdt__seleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,63);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_sdt__salextalb_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextalb(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTrabajoexterno_recepcion_sdt__salextalb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextalb()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextalb()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_sdt__salextalb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTrabajoexterno_recepcion_sdt__salextalb_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_sdt__salextfec_Internalname,localUtil.format(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec(), "99/99/99"),localUtil.format( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec(), "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_sdt__salextfec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTrabajoexterno_recepcion_sdt__salextfec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_sdt__barcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcod(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTrabajoexterno_recepcion_sdt__barcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcod()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcod()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_sdt__barcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTrabajoexterno_recepcion_sdt__barcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_sdt__barcodreo_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodreo(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTrabajoexterno_recepcion_sdt__barcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodreo()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodreo()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_sdt__barcodreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTrabajoexterno_recepcion_sdt__barcodreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_sdt__barcodpar_Internalname,GXutil.rtrim( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodpar()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_sdt__barcodpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTrabajoexterno_recepcion_sdt__barcodpar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_sdt__clicod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clicod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTrabajoexterno_recepcion_sdt__clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clicod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clicod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_sdt__clicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTrabajoexterno_recepcion_sdt__clicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_sdt__clinom_Internalname,GXutil.rtrim( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clinom()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_sdt__clinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTrabajoexterno_recepcion_sdt__clinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_sdt__barser_Internalname,GXutil.rtrim( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barser()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_sdt__barser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTrabajoexterno_recepcion_sdt__barser_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_sdt__barserdsc_Internalname,GXutil.rtrim( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barserdsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_sdt__barserdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTrabajoexterno_recepcion_sdt__barserdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_sdt__ordlin_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Ordlin(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTrabajoexterno_recepcion_sdt__ordlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Ordlin()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Ordlin()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_sdt__ordlin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTrabajoexterno_recepcion_sdt__ordlin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_sdt__fascodn_Internalname,GXutil.rtrim( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fascodn()),GXutil.rtrim( localUtil.format( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fascodn(), "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_sdt__fascodn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTrabajoexterno_recepcion_sdt__fascodn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_sdt__fasdsc_Internalname,GXutil.rtrim( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fasdsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_sdt__fasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTrabajoexterno_recepcion_sdt__fasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTrabajoexterno_recepcion_sdt__rpexhdcns_Enabled!=0)&&(edtavTrabajoexterno_recepcion_sdt__rpexhdcns_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 76,'',false,'"+sGXsfl_62_idx+"',62)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_sdt__rpexhdcns_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdcns(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdcns()), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavTrabajoexterno_recepcion_sdt__rpexhdcns_Enabled!=0)&&(edtavTrabajoexterno_recepcion_sdt__rpexhdcns_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_sdt__rpexhdcns_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavTrabajoexterno_recepcion_sdt__rpexhdcns_Columnclass,edtavTrabajoexterno_recepcion_sdt__rpexhdcns_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTrabajoexterno_recepcion_sdt__rpexhdkgs_Enabled!=0)&&(edtavTrabajoexterno_recepcion_sdt__rpexhdkgs_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 77,'',false,'"+sGXsfl_62_idx+"',62)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_sdt__rpexhdkgs_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdkgs(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdkgs(), "ZZZZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavTrabajoexterno_recepcion_sdt__rpexhdkgs_Enabled!=0)&&(edtavTrabajoexterno_recepcion_sdt__rpexhdkgs_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,77);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_sdt__rpexhdkgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavTrabajoexterno_recepcion_sdt__rpexhdkgs_Columnclass,edtavTrabajoexterno_recepcion_sdt__rpexhdkgs_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTrabajoexterno_recepcion_sdt__rpexhdmts_Enabled!=0)&&(edtavTrabajoexterno_recepcion_sdt__rpexhdmts_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 78,'',false,'"+sGXsfl_62_idx+"',62)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_sdt__rpexhdmts_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdmts(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdmts(), "ZZZZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavTrabajoexterno_recepcion_sdt__rpexhdmts_Enabled!=0)&&(edtavTrabajoexterno_recepcion_sdt__rpexhdmts_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,78);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_sdt__rpexhdmts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavTrabajoexterno_recepcion_sdt__rpexhdmts_Columnclass,edtavTrabajoexterno_recepcion_sdt__rpexhdmts_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.getEnabled()!=0)&&(cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 79,'',false,'"+sGXsfl_62_idx+"',62)\"" : " ") ;
         if ( ( cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "TRABAJOEXTERNO_RECEPCION_SDT__RPEXHDTIP_" + sGXsfl_62_idx ;
            cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.setName( GXCCtl );
            cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.setWebtags( "" );
            cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.addItem("*", httpContext.getMessage( "s/d", ""), (short)(0));
            cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.addItem("T", httpContext.getMessage( "Total", ""), (short)(0));
            cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.addItem("P", httpContext.getMessage( "Parcial", ""), (short)(0));
            if ( cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.getItemCount() > 0 )
            {
               if ( ( AV47GXV1 > 0 ) && ( AV12TrabajoExterno_Recepcion_SDT.size() >= AV47GXV1 ) && (GXutil.strcmp("", ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdtip())==0) )
               {
                  ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdtip( cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.getValidValue(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdtip()) );
               }
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavTrabajoexterno_recepcion_sdt__rpexhdtip,cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.getInternalname(),GXutil.rtrim( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdtip()),Integer.valueOf(1),cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.getColumnClass(),cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.getColumnHeaderClass(),TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.getEnabled()!=0)&&(cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,79);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.setValue( GXutil.rtrim( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdtip()) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.getInternalname(), "Values", cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.ToJavascriptSource(), !bGXsfl_62_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavTrabajoexterno_recepcion_sdt__cerrarfase.getEnabled()!=0)&&(chkavTrabajoexterno_recepcion_sdt__cerrarfase.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 80,'',false,'"+sGXsfl_62_idx+"',62)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "TRABAJOEXTERNO_RECEPCION_SDT__CERRARFASE_" + sGXsfl_62_idx ;
         chkavTrabajoexterno_recepcion_sdt__cerrarfase.setName( GXCCtl );
         chkavTrabajoexterno_recepcion_sdt__cerrarfase.setWebtags( "" );
         chkavTrabajoexterno_recepcion_sdt__cerrarfase.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavTrabajoexterno_recepcion_sdt__cerrarfase.getInternalname(), "TitleCaption", chkavTrabajoexterno_recepcion_sdt__cerrarfase.getCaption(), !bGXsfl_62_Refreshing);
         chkavTrabajoexterno_recepcion_sdt__cerrarfase.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavTrabajoexterno_recepcion_sdt__cerrarfase.getInternalname(),GXutil.booltostr( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Cerrarfase()),"","",Integer.valueOf(-1),Integer.valueOf(1),"true","",StyleString,ClassString,chkavTrabajoexterno_recepcion_sdt__cerrarfase.getColumnClass(),chkavTrabajoexterno_recepcion_sdt__cerrarfase.getColumnHeaderClass(),TempTags+" onclick="+"\"gx.fn.checkboxClick(80, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavTrabajoexterno_recepcion_sdt__cerrarfase.getEnabled()!=0)&&(chkavTrabajoexterno_recepcion_sdt__cerrarfase.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,80);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_sdt__salexnln_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexnln(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTrabajoexterno_recepcion_sdt__salexnln_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexnln()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexnln()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_sdt__salexnln_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavTrabajoexterno_recepcion_sdt__salexnln_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_sdt__oldkgs_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldkgs(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTrabajoexterno_recepcion_sdt__oldkgs_Enabled!=0) ? localUtil.format( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldkgs(), "ZZZZZ9.99") : localUtil.format( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldkgs(), "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_sdt__oldkgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavTrabajoexterno_recepcion_sdt__oldkgs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_sdt__oldmts_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldmts(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTrabajoexterno_recepcion_sdt__oldmts_Enabled!=0) ? localUtil.format( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldmts(), "ZZZZZ9.99") : localUtil.format( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldmts(), "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_sdt__oldmts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavTrabajoexterno_recepcion_sdt__oldmts_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_sdt__oldcns_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldcns(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTrabajoexterno_recepcion_sdt__oldcns_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldcns()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldcns()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_sdt__oldcns_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavTrabajoexterno_recepcion_sdt__oldcns_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_sdt__barnomcli_Internalname,GXutil.rtrim( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barnomcli()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_sdt__barnomcli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavTrabajoexterno_recepcion_sdt__barnomcli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_sdt__mancod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Mancod(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTrabajoexterno_recepcion_sdt__mancod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Mancod()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Mancod()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_sdt__mancod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavTrabajoexterno_recepcion_sdt__mancod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_sdt__barcolnom_Internalname,GXutil.rtrim( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcolnom()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_sdt__barcolnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavTrabajoexterno_recepcion_sdt__barcolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_sdt__barunimed_Internalname,GXutil.rtrim( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barunimed()),GXutil.rtrim( localUtil.format( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barunimed(), "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_sdt__barunimed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavTrabajoexterno_recepcion_sdt__barunimed_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_sdt__exhdpz_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Exhdpz(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTrabajoexterno_recepcion_sdt__exhdpz_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Exhdpz()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Exhdpz()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_sdt__exhdpz_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavTrabajoexterno_recepcion_sdt__exhdpz_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_recepcion_sdt__salexesb_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexesb(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTrabajoexterno_recepcion_sdt__salexesb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexesb()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexesb()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_recepcion_sdt__salexesb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavTrabajoexterno_recepcion_sdt__salexesb_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes27K2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_62_idx = ((subGrid_Islastpage==1)&&(nGXsfl_62_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_62_idx+1) ;
         sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_622( ) ;
      }
      /* End function sendrow_622 */
   }

   public void startgridcontrol62( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"62\">") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Op", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Guia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Envio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T/P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cerrar Fase?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero de Linea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Manufacturador", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Exh Dpz", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado", "")) ;
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
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_sdt__salextalb_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_sdt__salextfec_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_sdt__barcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_sdt__barcodreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_sdt__barcodpar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_sdt__clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_sdt__clinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_sdt__barser_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_sdt__barserdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_sdt__ordlin_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_sdt__fascodn_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_sdt__fasdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavTrabajoexterno_recepcion_sdt__rpexhdcns_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavTrabajoexterno_recepcion_sdt__rpexhdcns_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavTrabajoexterno_recepcion_sdt__rpexhdkgs_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavTrabajoexterno_recepcion_sdt__rpexhdkgs_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavTrabajoexterno_recepcion_sdt__rpexhdmts_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavTrabajoexterno_recepcion_sdt__rpexhdmts_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( chkavTrabajoexterno_recepcion_sdt__cerrarfase.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( chkavTrabajoexterno_recepcion_sdt__cerrarfase.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_sdt__salexnln_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_sdt__oldkgs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_sdt__oldmts_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_sdt__oldcns_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_sdt__barnomcli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_sdt__mancod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_sdt__barcolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_sdt__barunimed_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_sdt__exhdpz_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_recepcion_sdt__salexesb_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtavRpextdoc_Internalname = "vRPEXTDOC" ;
      edtavSalextalb_Internalname = "vSALEXTALB" ;
      edtavFechafrom_Internalname = "vFECHAFROM" ;
      edtavFechato_Internalname = "vFECHATO" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      chkavTrabajoexterno_recepcion_sdt__seleccionar.setInternalname( "TRABAJOEXTERNO_RECEPCION_SDT__SELECCIONAR" );
      edtavTrabajoexterno_recepcion_sdt__salextalb_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__SALEXTALB" ;
      edtavTrabajoexterno_recepcion_sdt__salextfec_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__SALEXTFEC" ;
      edtavTrabajoexterno_recepcion_sdt__barcod_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__BARCOD" ;
      edtavTrabajoexterno_recepcion_sdt__barcodreo_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__BARCODREO" ;
      edtavTrabajoexterno_recepcion_sdt__barcodpar_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__BARCODPAR" ;
      edtavTrabajoexterno_recepcion_sdt__clicod_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__CLICOD" ;
      edtavTrabajoexterno_recepcion_sdt__clinom_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__CLINOM" ;
      edtavTrabajoexterno_recepcion_sdt__barser_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__BARSER" ;
      edtavTrabajoexterno_recepcion_sdt__barserdsc_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__BARSERDSC" ;
      edtavTrabajoexterno_recepcion_sdt__ordlin_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__ORDLIN" ;
      edtavTrabajoexterno_recepcion_sdt__fascodn_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__FASCODN" ;
      edtavTrabajoexterno_recepcion_sdt__fasdsc_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__FASDSC" ;
      edtavTrabajoexterno_recepcion_sdt__rpexhdcns_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__RPEXHDCNS" ;
      edtavTrabajoexterno_recepcion_sdt__rpexhdkgs_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__RPEXHDKGS" ;
      edtavTrabajoexterno_recepcion_sdt__rpexhdmts_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__RPEXHDMTS" ;
      cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.setInternalname( "TRABAJOEXTERNO_RECEPCION_SDT__RPEXHDTIP" );
      chkavTrabajoexterno_recepcion_sdt__cerrarfase.setInternalname( "TRABAJOEXTERNO_RECEPCION_SDT__CERRARFASE" );
      edtavTrabajoexterno_recepcion_sdt__salexnln_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__SALEXNLN" ;
      edtavTrabajoexterno_recepcion_sdt__oldkgs_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__OLDKGS" ;
      edtavTrabajoexterno_recepcion_sdt__oldmts_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__OLDMTS" ;
      edtavTrabajoexterno_recepcion_sdt__oldcns_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__OLDCNS" ;
      edtavTrabajoexterno_recepcion_sdt__barnomcli_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__BARNOMCLI" ;
      edtavTrabajoexterno_recepcion_sdt__mancod_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__MANCOD" ;
      edtavTrabajoexterno_recepcion_sdt__barcolnom_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__BARCOLNOM" ;
      edtavTrabajoexterno_recepcion_sdt__barunimed_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__BARUNIMED" ;
      edtavTrabajoexterno_recepcion_sdt__exhdpz_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__EXHDPZ" ;
      edtavTrabajoexterno_recepcion_sdt__salexesb_Internalname = "TRABAJOEXTERNO_RECEPCION_SDT__SALEXESB" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Dvelop_confirmpanel_confirmar_Internalname = "DVELOP_CONFIRMPANEL_CONFIRMAR" ;
      tblTabledvelop_confirmpanel_confirmar_Internalname = "TABLEDVELOP_CONFIRMPANEL_CONFIRMAR" ;
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
      edtavTrabajoexterno_recepcion_sdt__salexesb_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_sdt__salexesb_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__exhdpz_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_sdt__exhdpz_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__barunimed_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_sdt__barunimed_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__barcolnom_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_sdt__barcolnom_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__mancod_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_sdt__mancod_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__barnomcli_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_sdt__barnomcli_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__oldcns_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_sdt__oldcns_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__oldmts_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_sdt__oldmts_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__oldkgs_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_sdt__oldkgs_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__salexnln_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_sdt__salexnln_Enabled = 0 ;
      chkavTrabajoexterno_recepcion_sdt__cerrarfase.setCaption( "" );
      chkavTrabajoexterno_recepcion_sdt__cerrarfase.setColumnHeaderClass( "" );
      chkavTrabajoexterno_recepcion_sdt__cerrarfase.setColumnClass( "WWColumn" );
      chkavTrabajoexterno_recepcion_sdt__cerrarfase.setVisible( -1 );
      chkavTrabajoexterno_recepcion_sdt__cerrarfase.setEnabled( 1 );
      cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.setJsonclick( "" );
      cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.setVisible( -1 );
      cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.setEnabled( 1 );
      cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.setColumnHeaderClass( "" );
      cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.setColumnClass( "WWColumn" );
      edtavTrabajoexterno_recepcion_sdt__rpexhdmts_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_sdt__rpexhdmts_Columnheaderclass = "" ;
      edtavTrabajoexterno_recepcion_sdt__rpexhdmts_Columnclass = "WWColumn" ;
      edtavTrabajoexterno_recepcion_sdt__rpexhdmts_Visible = -1 ;
      edtavTrabajoexterno_recepcion_sdt__rpexhdmts_Enabled = 1 ;
      edtavTrabajoexterno_recepcion_sdt__rpexhdkgs_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_sdt__rpexhdkgs_Columnheaderclass = "" ;
      edtavTrabajoexterno_recepcion_sdt__rpexhdkgs_Columnclass = "WWColumn" ;
      edtavTrabajoexterno_recepcion_sdt__rpexhdkgs_Visible = -1 ;
      edtavTrabajoexterno_recepcion_sdt__rpexhdkgs_Enabled = 1 ;
      edtavTrabajoexterno_recepcion_sdt__rpexhdcns_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_sdt__rpexhdcns_Columnheaderclass = "" ;
      edtavTrabajoexterno_recepcion_sdt__rpexhdcns_Columnclass = "WWColumn" ;
      edtavTrabajoexterno_recepcion_sdt__rpexhdcns_Visible = -1 ;
      edtavTrabajoexterno_recepcion_sdt__rpexhdcns_Enabled = 1 ;
      edtavTrabajoexterno_recepcion_sdt__fasdsc_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_sdt__fasdsc_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__fascodn_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_sdt__fascodn_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__ordlin_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_sdt__ordlin_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__barserdsc_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_sdt__barserdsc_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__barser_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_sdt__barser_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__clinom_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_sdt__clinom_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__clicod_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_sdt__clicod_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__barcodpar_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_sdt__barcodpar_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__barcodreo_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_sdt__barcodreo_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__barcod_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_sdt__barcod_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__salextfec_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_sdt__salextfec_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__salextalb_Jsonclick = "" ;
      edtavTrabajoexterno_recepcion_sdt__salextalb_Enabled = 0 ;
      chkavTrabajoexterno_recepcion_sdt__seleccionar.setCaption( "" );
      chkavTrabajoexterno_recepcion_sdt__seleccionar.setVisible( -1 );
      chkavTrabajoexterno_recepcion_sdt__seleccionar.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTrabajoexterno_recepcion_sdt__salexesb_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_sdt__exhdpz_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_sdt__barunimed_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_sdt__barcolnom_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_sdt__mancod_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_sdt__barnomcli_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_sdt__oldcns_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_sdt__oldmts_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_sdt__oldkgs_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_sdt__salexnln_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_sdt__fasdsc_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_sdt__fascodn_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_sdt__ordlin_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_sdt__barserdsc_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_sdt__barser_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_sdt__clinom_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_sdt__clicod_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_sdt__barcodpar_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_sdt__barcodreo_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_sdt__barcod_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_sdt__salextfec_Enabled = -1 ;
      edtavTrabajoexterno_recepcion_sdt__salextalb_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavFechato_Jsonclick = "" ;
      edtavFechato_Enabled = 0 ;
      edtavFechafrom_Jsonclick = "" ;
      edtavFechafrom_Enabled = 0 ;
      edtavSalextalb_Jsonclick = "" ;
      edtavSalextalb_Enabled = 0 ;
      edtavRpextdoc_Jsonclick = "" ;
      edtavRpextdoc_Enabled = 0 ;
      edtavRpexhdfe_Jsonclick = "" ;
      edtavRpexhdfe_Enabled = 0 ;
      edtavMannom_Jsonclick = "" ;
      edtavMannom_Enabled = 0 ;
      edtavMancod_Jsonclick = "" ;
      edtavMancod_Enabled = 0 ;
      Dvelop_confirmpanel_confirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar_Confirmationtext = "¿Confirma los datos?" ;
      Dvelop_confirmpanel_confirmar_Title = "" ;
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
      Form.setCaption( httpContext.getMessage( "Trabajo Externo (Recepcion)", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "TRABAJOEXTERNO_RECEPCION_SDT__SELECCIONAR_" + sGXsfl_62_idx ;
      chkavTrabajoexterno_recepcion_sdt__seleccionar.setName( GXCCtl );
      chkavTrabajoexterno_recepcion_sdt__seleccionar.setWebtags( "" );
      chkavTrabajoexterno_recepcion_sdt__seleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavTrabajoexterno_recepcion_sdt__seleccionar.getInternalname(), "TitleCaption", chkavTrabajoexterno_recepcion_sdt__seleccionar.getCaption(), !bGXsfl_62_Refreshing);
      chkavTrabajoexterno_recepcion_sdt__seleccionar.setCheckedValue( "false" );
      GXCCtl = "TRABAJOEXTERNO_RECEPCION_SDT__RPEXHDTIP_" + sGXsfl_62_idx ;
      cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.setName( GXCCtl );
      cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.setWebtags( "" );
      cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.addItem("*", httpContext.getMessage( "s/d", ""), (short)(0));
      cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.addItem("T", httpContext.getMessage( "Total", ""), (short)(0));
      cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.addItem("P", httpContext.getMessage( "Parcial", ""), (short)(0));
      if ( cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.getItemCount() > 0 )
      {
         if ( ( AV47GXV1 > 0 ) && ( AV12TrabajoExterno_Recepcion_SDT.size() >= AV47GXV1 ) && (GXutil.strcmp("", ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdtip())==0) )
         {
            ((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdtip( cmbavTrabajoexterno_recepcion_sdt__rpexhdtip.getValidValue(((app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)AV12TrabajoExterno_Recepcion_SDT.elementAt(-1+AV47GXV1)).getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdtip()) );
         }
      }
      GXCCtl = "TRABAJOEXTERNO_RECEPCION_SDT__CERRARFASE_" + sGXsfl_62_idx ;
      chkavTrabajoexterno_recepcion_sdt__cerrarfase.setName( GXCCtl );
      chkavTrabajoexterno_recepcion_sdt__cerrarfase.setWebtags( "" );
      chkavTrabajoexterno_recepcion_sdt__cerrarfase.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavTrabajoexterno_recepcion_sdt__cerrarfase.getInternalname(), "TitleCaption", chkavTrabajoexterno_recepcion_sdt__cerrarfase.getCaption(), !bGXsfl_62_Refreshing);
      chkavTrabajoexterno_recepcion_sdt__cerrarfase.setCheckedValue( "false" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV12TrabajoExterno_Recepcion_SDT',fld:'vTRABAJOEXTERNO_RECEPCION_SDT',grid:62,pic:''},{av:'nGXsfl_62_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:62},{av:'nRC_GXsfl_62',ctrl:'GRID',prop:'GridRC',grid:62},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV76Pgmname',fld:'vPGMNAME',pic:''},{av:'AV20Fechafrom',fld:'vFECHAFROM',pic:'',hsh:true},{av:'AV21Fechato',fld:'vFECHATO',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV15GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV16GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'TRABAJOEXTERNO_RECEPCION_SDT__RPEXHDCNS',prop:'Columnheaderclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_SDT__RPEXHDKGS',prop:'Columnheaderclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_SDT__RPEXHDMTS',prop:'Columnheaderclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_SDT__RPEXHDTIP',prop:'Columnheaderclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_SDT__CERRARFASE',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1227K2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV12TrabajoExterno_Recepcion_SDT',fld:'vTRABAJOEXTERNO_RECEPCION_SDT',grid:62,pic:''},{av:'nGXsfl_62_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:62},{av:'nRC_GXsfl_62',ctrl:'GRID',prop:'GridRC',grid:62},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV76Pgmname',fld:'vPGMNAME',pic:''},{av:'AV20Fechafrom',fld:'vFECHAFROM',pic:'',hsh:true},{av:'AV21Fechato',fld:'vFECHATO',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1327K2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV12TrabajoExterno_Recepcion_SDT',fld:'vTRABAJOEXTERNO_RECEPCION_SDT',grid:62,pic:''},{av:'nGXsfl_62_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:62},{av:'nRC_GXsfl_62',ctrl:'GRID',prop:'GridRC',grid:62},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV76Pgmname',fld:'vPGMNAME',pic:''},{av:'AV20Fechafrom',fld:'vFECHAFROM',pic:'',hsh:true},{av:'AV21Fechato',fld:'vFECHATO',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e1827K2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{ctrl:'TRABAJOEXTERNO_RECEPCION_SDT__RPEXHDCNS',prop:'Columnclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_SDT__RPEXHDKGS',prop:'Columnclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_SDT__RPEXHDMTS',prop:'Columnclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_SDT__RPEXHDTIP',prop:'Columnclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_SDT__CERRARFASE',prop:'Columnclass'}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e1127K1',iparms:[{av:'AV12TrabajoExterno_Recepcion_SDT',fld:'vTRABAJOEXTERNO_RECEPCION_SDT',grid:62,pic:''},{av:'nGXsfl_62_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:62},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_62',ctrl:'GRID',prop:'GridRC',grid:62}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE","{handler:'e1427K2',iparms:[{av:'Dvelop_confirmpanel_confirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV12TrabajoExterno_Recepcion_SDT',fld:'vTRABAJOEXTERNO_RECEPCION_SDT',grid:62,pic:''},{av:'nGXsfl_62_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:62},{av:'nRC_GXsfl_62',ctrl:'GRID',prop:'GridRC',grid:62},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV76Pgmname',fld:'vPGMNAME',pic:''},{av:'AV20Fechafrom',fld:'vFECHAFROM',pic:'',hsh:true},{av:'AV21Fechato',fld:'vFECHATO',pic:'',hsh:true},{av:'AV17Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV18ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV27RpExHdFe',fld:'vRPEXHDFE',pic:''},{av:'AV28RpExtDoc',fld:'vRPEXTDOC',pic:''},{av:'AV40RpExHdUl',fld:'vRPEXHDUL',pic:'ZZZ9'},{av:'AV19SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE",",oparms:[{av:'AV40RpExHdUl',fld:'vRPEXHDUL',pic:'ZZZ9'},{av:'AV28RpExtDoc',fld:'vRPEXTDOC',pic:''},{av:'AV27RpExHdFe',fld:'vRPEXHDFE',pic:''},{av:'AV18ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV17Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV19SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV12TrabajoExterno_Recepcion_SDT',fld:'vTRABAJOEXTERNO_RECEPCION_SDT',grid:62,pic:''},{av:'nGXsfl_62_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:62},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_62',ctrl:'GRID',prop:'GridRC',grid:62},{av:'AV15GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV16GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'TRABAJOEXTERNO_RECEPCION_SDT__RPEXHDCNS',prop:'Columnheaderclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_SDT__RPEXHDKGS',prop:'Columnheaderclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_SDT__RPEXHDMTS',prop:'Columnheaderclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_SDT__RPEXHDTIP',prop:'Columnheaderclass'},{ctrl:'TRABAJOEXTERNO_RECEPCION_SDT__CERRARFASE',prop:'Columnheaderclass'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1527K2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("TRABAJOEXTERNO_RECEPCION_SDT__RPEXHDTIP.CONTROLVALUECHANGED","{handler:'e1927K2',iparms:[{av:'AV12TrabajoExterno_Recepcion_SDT',fld:'vTRABAJOEXTERNO_RECEPCION_SDT',grid:62,pic:''},{av:'nGXsfl_62_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:62},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_62',ctrl:'GRID',prop:'GridRC',grid:62},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV76Pgmname',fld:'vPGMNAME',pic:''},{av:'AV20Fechafrom',fld:'vFECHAFROM',pic:'',hsh:true},{av:'AV21Fechato',fld:'vFECHATO',pic:'',hsh:true}]");
      setEventMetadata("TRABAJOEXTERNO_RECEPCION_SDT__RPEXHDTIP.CONTROLVALUECHANGED",",oparms:[{av:'AV12TrabajoExterno_Recepcion_SDT',fld:'vTRABAJOEXTERNO_RECEPCION_SDT',grid:62,pic:''},{av:'nGXsfl_62_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:62},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_62',ctrl:'GRID',prop:'GridRC',grid:62}]}");
      setEventMetadata("TRABAJOEXTERNO_RECEPCION_SDT__SELECCIONAR.CONTROLVALUECHANGED","{handler:'e2027K2',iparms:[{av:'AV12TrabajoExterno_Recepcion_SDT',fld:'vTRABAJOEXTERNO_RECEPCION_SDT',grid:62,pic:''},{av:'nGXsfl_62_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:62},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_62',ctrl:'GRID',prop:'GridRC',grid:62},{av:'AV27RpExHdFe',fld:'vRPEXHDFE',pic:''},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV76Pgmname',fld:'vPGMNAME',pic:''},{av:'AV20Fechafrom',fld:'vFECHAFROM',pic:'',hsh:true},{av:'AV21Fechato',fld:'vFECHATO',pic:'',hsh:true}]");
      setEventMetadata("TRABAJOEXTERNO_RECEPCION_SDT__SELECCIONAR.CONTROLVALUECHANGED",",oparms:[{av:'AV12TrabajoExterno_Recepcion_SDT',fld:'vTRABAJOEXTERNO_RECEPCION_SDT',grid:62,pic:''},{av:'nGXsfl_62_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:62},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_62',ctrl:'GRID',prop:'GridRC',grid:62}]}");
      setEventMetadata("VALIDV_GXV27","{handler:'validv_Gxv27',iparms:[]");
      setEventMetadata("VALIDV_GXV27",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv29',iparms:[]");
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
      wcpOAV17Emprcod = "" ;
      wcpOAV26ManNom = "" ;
      wcpOAV20Fechafrom = GXutil.nullDate() ;
      wcpOAV21Fechato = GXutil.nullDate() ;
      wcpOAV27RpExHdFe = GXutil.nullDate() ;
      wcpOAV28RpExtDoc = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Dvelop_confirmpanel_confirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV17Emprcod = "" ;
      AV26ManNom = "" ;
      AV20Fechafrom = GXutil.nullDate() ;
      AV21Fechato = GXutil.nullDate() ;
      AV27RpExHdFe = GXutil.nullDate() ;
      AV28RpExtDoc = "" ;
      AV76Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV12TrabajoExterno_Recepcion_SDT = new GXBaseCollection<app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item>(app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV30TrabajoExterno_Recepcion_SDT_item = new app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item(remoteHandle, context);
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
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
      AV23Station = "" ;
      AV24EmprNom = "" ;
      AV25UsurCod = "" ;
      AV22TrabajoExterno_Recepcion_SDT_json = "" ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV33BarCodPar = "" ;
      AV36RpExHdKgs = DecimalUtil.ZERO ;
      AV37RpExHdMts = DecimalUtil.ZERO ;
      AV38RpExHdTip = "" ;
      AV43FasCodn = "" ;
      AV44Flag = "" ;
      GXv_int9 = new byte[1] ;
      GXv_char15 = new String[1] ;
      GXv_int16 = new short[1] ;
      GXv_char4 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int14 = new short[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_int11 = new short[1] ;
      GXv_date7 = new java.util.Date[1] ;
      GXv_int8 = new int[1] ;
      GXv_int17 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int6 = new short[1] ;
      GXt_char1 = "" ;
      GXv_char18 = new String[1] ;
      AV13Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV76Pgmname = "TrabajosExternos.TrabajoExterno_Recepcion__WP" ;
      /* GeneXus formulas. */
      AV76Pgmname = "TrabajosExternos.TrabajoExterno_Recepcion__WP" ;
      Gx_err = (short)(0) ;
      edtavMancod_Enabled = 0 ;
      edtavMannom_Enabled = 0 ;
      edtavRpexhdfe_Enabled = 0 ;
      edtavRpextdoc_Enabled = 0 ;
      edtavSalextalb_Enabled = 0 ;
      edtavFechafrom_Enabled = 0 ;
      edtavFechato_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__salextalb_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__salextfec_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__barcod_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__barcodreo_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__barcodpar_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__clicod_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__clinom_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__barser_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__barserdsc_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__ordlin_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__fascodn_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__fasdsc_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__salexnln_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__oldkgs_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__oldmts_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__oldcns_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__barnomcli_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__mancod_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__barcolnom_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__barunimed_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__exhdpz_Enabled = 0 ;
      edtavTrabajoexterno_recepcion_sdt__salexesb_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte AV32BarCodReo ;
   private byte GXv_int9[] ;
   private byte GXv_int17[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV18ManCod ;
   private short AV18ManCod ;
   private short AV40RpExHdUl ;
   private short AV29Lineas ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV35RpExHdCns ;
   private short AV39SalExNln ;
   private short AV41OrdLin ;
   private short GXv_int16[] ;
   private short GXv_int14[] ;
   private short GXv_int11[] ;
   private short GXv_int6[] ;
   private int wcpOAV19SalExtAlb ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_62 ;
   private int AV19SalExtAlb ;
   private int nGXsfl_62_idx=1 ;
   private int AV77GXV30 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavMancod_Enabled ;
   private int edtavMannom_Enabled ;
   private int edtavRpexhdfe_Enabled ;
   private int edtavRpextdoc_Enabled ;
   private int edtavSalextalb_Enabled ;
   private int edtavFechafrom_Enabled ;
   private int edtavFechato_Enabled ;
   private int AV47GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavTrabajoexterno_recepcion_sdt__salextalb_Enabled ;
   private int edtavTrabajoexterno_recepcion_sdt__salextfec_Enabled ;
   private int edtavTrabajoexterno_recepcion_sdt__barcod_Enabled ;
   private int edtavTrabajoexterno_recepcion_sdt__barcodreo_Enabled ;
   private int edtavTrabajoexterno_recepcion_sdt__barcodpar_Enabled ;
   private int edtavTrabajoexterno_recepcion_sdt__clicod_Enabled ;
   private int edtavTrabajoexterno_recepcion_sdt__clinom_Enabled ;
   private int edtavTrabajoexterno_recepcion_sdt__barser_Enabled ;
   private int edtavTrabajoexterno_recepcion_sdt__barserdsc_Enabled ;
   private int edtavTrabajoexterno_recepcion_sdt__ordlin_Enabled ;
   private int edtavTrabajoexterno_recepcion_sdt__fascodn_Enabled ;
   private int edtavTrabajoexterno_recepcion_sdt__fasdsc_Enabled ;
   private int edtavTrabajoexterno_recepcion_sdt__salexnln_Enabled ;
   private int edtavTrabajoexterno_recepcion_sdt__oldkgs_Enabled ;
   private int edtavTrabajoexterno_recepcion_sdt__oldmts_Enabled ;
   private int edtavTrabajoexterno_recepcion_sdt__oldcns_Enabled ;
   private int edtavTrabajoexterno_recepcion_sdt__barnomcli_Enabled ;
   private int edtavTrabajoexterno_recepcion_sdt__mancod_Enabled ;
   private int edtavTrabajoexterno_recepcion_sdt__barcolnom_Enabled ;
   private int edtavTrabajoexterno_recepcion_sdt__barunimed_Enabled ;
   private int edtavTrabajoexterno_recepcion_sdt__exhdpz_Enabled ;
   private int edtavTrabajoexterno_recepcion_sdt__salexesb_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_62_fel_idx=1 ;
   private int AV14PageToGo ;
   private int nGXsfl_62_bak_idx=1 ;
   private int AV78GXV31 ;
   private int AV31BarCod ;
   private int AV34SalExtAlb_grid ;
   private int GXv_int10[] ;
   private int GXv_int8[] ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavTrabajoexterno_recepcion_sdt__rpexhdcns_Enabled ;
   private int edtavTrabajoexterno_recepcion_sdt__rpexhdcns_Visible ;
   private int edtavTrabajoexterno_recepcion_sdt__rpexhdkgs_Enabled ;
   private int edtavTrabajoexterno_recepcion_sdt__rpexhdkgs_Visible ;
   private int edtavTrabajoexterno_recepcion_sdt__rpexhdmts_Enabled ;
   private int edtavTrabajoexterno_recepcion_sdt__rpexhdmts_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV15GridCurrentPage ;
   private long AV16GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV36RpExHdKgs ;
   private java.math.BigDecimal AV37RpExHdMts ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private String wcpOAV17Emprcod ;
   private String wcpOAV26ManNom ;
   private String wcpOAV28RpExtDoc ;
   private String Gridpaginationbar_Selectedpage ;
   private String Dvelop_confirmpanel_confirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV17Emprcod ;
   private String AV26ManNom ;
   private String AV28RpExtDoc ;
   private String sGXsfl_62_idx="0001" ;
   private String AV76Pgmname ;
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
   private String Dvelop_confirmpanel_confirmar_Title ;
   private String Dvelop_confirmpanel_confirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_confirmar_Confirmtype ;
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
   private String edtavRpextdoc_Internalname ;
   private String edtavRpextdoc_Jsonclick ;
   private String edtavSalextalb_Internalname ;
   private String edtavSalextalb_Jsonclick ;
   private String edtavFechafrom_Internalname ;
   private String edtavFechafrom_Jsonclick ;
   private String edtavFechato_Internalname ;
   private String edtavFechato_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
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
   private String edtavTrabajoexterno_recepcion_sdt__salextalb_Internalname ;
   private String edtavTrabajoexterno_recepcion_sdt__salextfec_Internalname ;
   private String edtavTrabajoexterno_recepcion_sdt__barcod_Internalname ;
   private String edtavTrabajoexterno_recepcion_sdt__barcodreo_Internalname ;
   private String edtavTrabajoexterno_recepcion_sdt__barcodpar_Internalname ;
   private String edtavTrabajoexterno_recepcion_sdt__clicod_Internalname ;
   private String edtavTrabajoexterno_recepcion_sdt__clinom_Internalname ;
   private String edtavTrabajoexterno_recepcion_sdt__barser_Internalname ;
   private String edtavTrabajoexterno_recepcion_sdt__barserdsc_Internalname ;
   private String edtavTrabajoexterno_recepcion_sdt__ordlin_Internalname ;
   private String edtavTrabajoexterno_recepcion_sdt__fascodn_Internalname ;
   private String edtavTrabajoexterno_recepcion_sdt__fasdsc_Internalname ;
   private String edtavTrabajoexterno_recepcion_sdt__salexnln_Internalname ;
   private String edtavTrabajoexterno_recepcion_sdt__oldkgs_Internalname ;
   private String edtavTrabajoexterno_recepcion_sdt__oldmts_Internalname ;
   private String edtavTrabajoexterno_recepcion_sdt__oldcns_Internalname ;
   private String edtavTrabajoexterno_recepcion_sdt__barnomcli_Internalname ;
   private String edtavTrabajoexterno_recepcion_sdt__mancod_Internalname ;
   private String edtavTrabajoexterno_recepcion_sdt__barcolnom_Internalname ;
   private String edtavTrabajoexterno_recepcion_sdt__barunimed_Internalname ;
   private String edtavTrabajoexterno_recepcion_sdt__exhdpz_Internalname ;
   private String edtavTrabajoexterno_recepcion_sdt__salexesb_Internalname ;
   private String sGXsfl_62_fel_idx="0001" ;
   private String hsh ;
   private String AV23Station ;
   private String AV24EmprNom ;
   private String AV25UsurCod ;
   private String edtavTrabajoexterno_recepcion_sdt__rpexhdcns_Columnheaderclass ;
   private String edtavTrabajoexterno_recepcion_sdt__rpexhdcns_Internalname ;
   private String edtavTrabajoexterno_recepcion_sdt__rpexhdkgs_Columnheaderclass ;
   private String edtavTrabajoexterno_recepcion_sdt__rpexhdkgs_Internalname ;
   private String edtavTrabajoexterno_recepcion_sdt__rpexhdmts_Columnheaderclass ;
   private String edtavTrabajoexterno_recepcion_sdt__rpexhdmts_Internalname ;
   private String edtavTrabajoexterno_recepcion_sdt__rpexhdcns_Columnclass ;
   private String edtavTrabajoexterno_recepcion_sdt__rpexhdkgs_Columnclass ;
   private String edtavTrabajoexterno_recepcion_sdt__rpexhdmts_Columnclass ;
   private String AV33BarCodPar ;
   private String AV38RpExHdTip ;
   private String AV43FasCodn ;
   private String AV44Flag ;
   private String GXv_char15[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXt_char1 ;
   private String GXv_char18[] ;
   private String tblTabledvelop_confirmpanel_confirmar_Internalname ;
   private String Dvelop_confirmpanel_confirmar_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavTrabajoexterno_recepcion_sdt__salextalb_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_sdt__salextfec_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_sdt__barcod_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_sdt__barcodreo_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_sdt__barcodpar_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_sdt__clicod_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_sdt__clinom_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_sdt__barser_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_sdt__barserdsc_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_sdt__ordlin_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_sdt__fascodn_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_sdt__fasdsc_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_sdt__rpexhdcns_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_sdt__rpexhdkgs_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_sdt__rpexhdmts_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_sdt__salexnln_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_sdt__oldkgs_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_sdt__oldmts_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_sdt__oldcns_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_sdt__barnomcli_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_sdt__mancod_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_sdt__barcolnom_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_sdt__barunimed_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_sdt__exhdpz_Jsonclick ;
   private String edtavTrabajoexterno_recepcion_sdt__salexesb_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV20Fechafrom ;
   private java.util.Date wcpOAV21Fechato ;
   private java.util.Date wcpOAV27RpExHdFe ;
   private java.util.Date AV20Fechafrom ;
   private java.util.Date AV21Fechato ;
   private java.util.Date AV27RpExHdFe ;
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
   private boolean bGXsfl_62_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV62 ;
   private boolean gx_refresh_fired ;
   private String AV22TrabajoExterno_Recepcion_SDT_json ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavTrabajoexterno_recepcion_sdt__seleccionar ;
   private HTMLChoice cmbavTrabajoexterno_recepcion_sdt__rpexhdtip ;
   private ICheckbox chkavTrabajoexterno_recepcion_sdt__cerrarfase ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item> AV12TrabajoExterno_Recepcion_SDT ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item AV30TrabajoExterno_Recepcion_SDT_item ;
}

