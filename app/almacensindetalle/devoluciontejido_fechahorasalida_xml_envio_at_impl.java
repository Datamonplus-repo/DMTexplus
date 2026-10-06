package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class devoluciontejido_fechahorasalida_xml_envio_at_impl extends GXDataArea
{
   public devoluciontejido_fechahorasalida_xml_envio_at_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public devoluciontejido_fechahorasalida_xml_envio_at_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( devoluciontejido_fechahorasalida_xml_envio_at_impl.class ));
   }

   public devoluciontejido_fechahorasalida_xml_envio_at_impl( int remoteHandle ,
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
            AV21EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV17DevCruId = (int)(GXutil.lval( httpContext.GetPar( "DevCruId"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17DevCruId), 8, 0));
               AV15DevCruDtSys = localUtil.parseDTimeParm( httpContext.GetPar( "DevCruDtSys")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15DevCruDtSys", localUtil.ttoc( AV15DevCruDtSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV25Hash = httpContext.GetPar( "Hash") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25Hash", AV25Hash);
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
      pa2A02( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2A02( ) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.almacensindetalle.devoluciontejido_fechahorasalida_xml_envio_at", new String[] {GXutil.URLEncode(GXutil.rtrim(AV21EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV17DevCruId,8,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV15DevCruDtSys)),GXutil.URLEncode(GXutil.rtrim(AV25Hash))}, new String[] {"EmprCod","DevCruId","DevCruDtSys","Hash"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSERIEAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34SerieAT, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DevolucionTejido_FechaHoraSalida_XML_Envio_AT");
      forbiddenHiddens.add("Dir", GXutil.rtrim( localUtil.format( AV19Dir, "")));
      forbiddenHiddens.add("UserAT", GXutil.rtrim( localUtil.format( AV35UserAT, "")));
      forbiddenHiddens.add("PassAT", GXutil.rtrim( localUtil.format( AV32PassAT, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("almacensindetalle\\devoluciontejido_fechahorasalida_xml_envio_at:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV21EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vLINEAS", GXutil.ltrim( localUtil.ntoc( AV26Lineas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDEVCRU", GXutil.ltrim( localUtil.ntoc( AV14devcru, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSERIEAT", GXutil.rtrim( AV34SerieAT));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSERIEAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34SerieAT, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUID", GXutil.ltrim( localUtil.ntoc( A11669DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUFEC", localUtil.dtoc( A11670DevCruFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUATID", GXutil.rtrim( A11680DevCruAtId));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUHASH", GXutil.rtrim( A11674DevCruHash));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECCOD", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHASH", GXutil.rtrim( AV25Hash));
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
         we2A02( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2A02( ) ;
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
      return formatLink("app.almacensindetalle.devoluciontejido_fechahorasalida_xml_envio_at", new String[] {GXutil.URLEncode(GXutil.rtrim(AV21EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV17DevCruId,8,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV15DevCruDtSys)),GXutil.URLEncode(GXutil.rtrim(AV25Hash))}, new String[] {"EmprCod","DevCruId","DevCruDtSys","Hash"})  ;
   }

   public String getPgmname( )
   {
      return "AlmacenSinDetalle.DevolucionTejido_FechaHoraSalida_XML_Envio_AT" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Fecha-Hora Salida, Hash, Comunico a AT", "") ;
   }

   public void wb2A00( )
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFechahorasalida_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFechahorasalida_Internalname, httpContext.getMessage( "Fecha-Hora Salida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFechahorasalida_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFechahorasalida_Internalname, localUtil.ttoc( AV44FechaHoraSalida, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV44FechaHoraSalida, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFechahorasalida_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFechahorasalida_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_FechaHoraSalida_XML_Envio_AT.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFechahorasalida_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFechahorasalida_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_FechaHoraSalida_XML_Envio_AT.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDiahact_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDiahact_Internalname, httpContext.getMessage( "Dia-Hora Actual", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDiahact_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDiahact_Internalname, localUtil.ttoc( AV42DiaHact, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV42DiaHact, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDiahact_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDiahact_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_FechaHoraSalida_XML_Envio_AT.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDiahact_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavDiahact_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_FechaHoraSalida_XML_Envio_AT.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDiasalida_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDiasalida_Internalname, httpContext.getMessage( "diasalida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDiasalida_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDiasalida_Internalname, localUtil.format(AV49diasalida, "99/99/99"), localUtil.format( AV49diasalida, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDiasalida_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDiasalida_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_FechaHoraSalida_XML_Envio_AT.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDiasalida_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavDiasalida_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_FechaHoraSalida_XML_Envio_AT.htm");
         httpContext.writeTextNL( "</div>") ;
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
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmessage_Internalname, lblTbmessage_Caption, "", "", lblTbmessage_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_AlmacenSinDetalle\\DevolucionTejido_FechaHoraSalida_XML_Envio_AT.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDir_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDir_Internalname, httpContext.getMessage( "path", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDir_Internalname, GXutil.rtrim( AV19Dir), GXutil.rtrim( localUtil.format( AV19Dir, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDir_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDir_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_FechaHoraSalida_XML_Envio_AT.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavUserat_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavUserat_Internalname, httpContext.getMessage( "Utilizador Portal Finanzas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUserat_Internalname, GXutil.rtrim( AV35UserAT), GXutil.rtrim( localUtil.format( AV35UserAT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUserat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavUserat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_FechaHoraSalida_XML_Envio_AT.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPassat_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPassat_Internalname, httpContext.getMessage( "Senha acceso do Utilizador", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPassat_Internalname, GXutil.rtrim( AV32PassAT), GXutil.rtrim( localUtil.format( AV32PassAT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPassat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPassat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(-1), (short)(0), 0, (byte)(0), (byte)(0), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_FechaHoraSalida_XML_Envio_AT.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDevcruid_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDevcruid_Internalname, httpContext.getMessage( "Nº Guia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDevcruid_Internalname, GXutil.ltrim( localUtil.ntoc( AV17DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavDevcruid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV17DevCruId), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV17DevCruId), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDevcruid_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDevcruid_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_FechaHoraSalida_XML_Envio_AT.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDevcrufec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDevcrufec_Internalname, httpContext.getMessage( "Data ", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDevcrufec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDevcrufec_Internalname, localUtil.format(AV16DevCruFec, "99/99/99"), localUtil.format( AV16DevCruFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDevcrufec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDevcrufec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_FechaHoraSalida_XML_Envio_AT.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDevcrufec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavDevcrufec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_FechaHoraSalida_XML_Envio_AT.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDevcrusal_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDevcrusal_Internalname, httpContext.getMessage( "Data Hora-Salida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDevcrusal_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDevcrusal_Internalname, localUtil.ttoc( AV18DevCruSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV18DevCruSal, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDevcrusal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDevcrusal_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_FechaHoraSalida_XML_Envio_AT.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDevcrusal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavDevcrusal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_FechaHoraSalida_XML_Envio_AT.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDevcrudtsys_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDevcrudtsys_Internalname, httpContext.getMessage( "Data System Hash", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavDevcrudtsys_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDevcrudtsys_Internalname, localUtil.ttoc( AV15DevCruDtSys, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV15DevCruDtSys, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDevcrudtsys_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDevcrudtsys_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_FechaHoraSalida_XML_Envio_AT.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDevcrudtsys_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavDevcrudtsys_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_FechaHoraSalida_XML_Envio_AT.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDevcruatcud_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDevcruatcud_Internalname, httpContext.getMessage( "ATCUD", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDevcruatcud_Internalname, GXutil.rtrim( AV51DevCruATCUD), GXutil.rtrim( localUtil.format( AV51DevCruATCUD, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDevcruatcud_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDevcruatcud_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_FechaHoraSalida_XML_Envio_AT.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDevcruserat_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDevcruserat_Internalname, httpContext.getMessage( "Serie", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDevcruserat_Internalname, GXutil.rtrim( AV52DevCruSerAT), GXutil.rtrim( localUtil.format( AV52DevCruSerAT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDevcruserat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDevcruserat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_FechaHoraSalida_XML_Envio_AT.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDevcrutipat_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDevcrutipat_Internalname, httpContext.getMessage( "Tipo Doc.", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDevcrutipat_Internalname, GXutil.rtrim( AV53DevCruTipAT), GXutil.rtrim( localUtil.format( AV53DevCruTipAT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,93);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDevcrutipat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDevcrutipat_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_FechaHoraSalida_XML_Envio_AT.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\DevolucionTejido_FechaHoraSalida_XML_Envio_AT.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\DevolucionTejido_FechaHoraSalida_XML_Envio_AT.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnatcud_Internalname, "", httpContext.getMessage( "ATCUD", ""), bttBtnatcud_Jsonclick, 5, httpContext.getMessage( "ATCUD", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOATCUD\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\DevolucionTejido_FechaHoraSalida_XML_Envio_AT.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV56Pgmname), GXutil.rtrim( localUtil.format( AV56Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_FechaHoraSalida_XML_Envio_AT.htm");
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start2A02( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Fecha-Hora Salida, Hash, Comunico a AT", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2A00( ) ;
   }

   public void ws2A02( )
   {
      start2A02( ) ;
      evt2A02( ) ;
   }

   public void evt2A02( )
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
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e112A02 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e122A02 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOATCUD'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoATCUD' */
                           e132A02 ();
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
                                 e142A02 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e152A02 ();
                           /* No code required for Cancel button. It is implemented as the Reset button. */
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
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we2A02( )
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

   public void pa2A02( )
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
            GX_FocusControl = edtavFechahorasalida_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
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
      rf2A02( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV56Pgmname = "AlmacenSinDetalle.DevolucionTejido_FechaHoraSalida_XML_Envio_AT" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56Pgmname", AV56Pgmname);
      Gx_err = (short)(0) ;
      edtavDiahact_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDiahact_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiahact_Enabled), 5, 0), true);
      edtavDiasalida_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDiasalida_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiasalida_Enabled), 5, 0), true);
      edtavDir_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDir_Enabled), 5, 0), true);
      edtavUserat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUserat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUserat_Enabled), 5, 0), true);
      edtavPassat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPassat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPassat_Enabled), 5, 0), true);
      edtavDevcruid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDevcruid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDevcruid_Enabled), 5, 0), true);
      edtavDevcrufec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDevcrufec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDevcrufec_Enabled), 5, 0), true);
      edtavDevcrusal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDevcrusal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDevcrusal_Enabled), 5, 0), true);
      edtavDevcrudtsys_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDevcrudtsys_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDevcrudtsys_Enabled), 5, 0), true);
      edtavDevcruatcud_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDevcruatcud_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDevcruatcud_Enabled), 5, 0), true);
      edtavDevcruserat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDevcruserat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDevcruserat_Enabled), 5, 0), true);
      edtavDevcrutipat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDevcrutipat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDevcrutipat_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2A02( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e152A02 ();
         wb2A00( ) ;
      }
   }

   public void send_integrity_lvl_hashes2A02( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vSERIEAT", GXutil.rtrim( AV34SerieAT));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSERIEAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34SerieAT, ""))));
   }

   public void before_start_formulas( )
   {
      AV56Pgmname = "AlmacenSinDetalle.DevolucionTejido_FechaHoraSalida_XML_Envio_AT" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56Pgmname", AV56Pgmname);
      Gx_err = (short)(0) ;
      edtavDiahact_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDiahact_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiahact_Enabled), 5, 0), true);
      edtavDiasalida_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDiasalida_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiasalida_Enabled), 5, 0), true);
      edtavDir_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDir_Enabled), 5, 0), true);
      edtavUserat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUserat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUserat_Enabled), 5, 0), true);
      edtavPassat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPassat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPassat_Enabled), 5, 0), true);
      edtavDevcruid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDevcruid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDevcruid_Enabled), 5, 0), true);
      edtavDevcrufec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDevcrufec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDevcrufec_Enabled), 5, 0), true);
      edtavDevcrusal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDevcrusal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDevcrusal_Enabled), 5, 0), true);
      edtavDevcrudtsys_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDevcrudtsys_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDevcrudtsys_Enabled), 5, 0), true);
      edtavDevcruatcud_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDevcruatcud_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDevcruatcud_Enabled), 5, 0), true);
      edtavDevcruserat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDevcruserat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDevcruserat_Enabled), 5, 0), true);
      edtavDevcrutipat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDevcrutipat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDevcrutipat_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2A00( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e112A02 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
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
         /* Read variables values. */
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavFechahorasalida_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vFECHAHORASALIDA");
            GX_FocusControl = edtavFechahorasalida_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV44FechaHoraSalida = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV44FechaHoraSalida", localUtil.ttoc( AV44FechaHoraSalida, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV44FechaHoraSalida = localUtil.ctot( httpContext.cgiGet( edtavFechahorasalida_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44FechaHoraSalida", localUtil.ttoc( AV44FechaHoraSalida, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavDiahact_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vDIAHACT");
            GX_FocusControl = edtavDiahact_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV42DiaHact = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV42DiaHact", localUtil.ttoc( AV42DiaHact, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV42DiaHact = localUtil.ctot( httpContext.cgiGet( edtavDiahact_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42DiaHact", localUtil.ttoc( AV42DiaHact, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDiasalida_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDIASALIDA");
            GX_FocusControl = edtavDiasalida_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV49diasalida = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49diasalida", localUtil.format(AV49diasalida, "99/99/99"));
         }
         else
         {
            AV49diasalida = localUtil.ctod( httpContext.cgiGet( edtavDiasalida_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49diasalida", localUtil.format(AV49diasalida, "99/99/99"));
         }
         AV19Dir = httpContext.cgiGet( edtavDir_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Dir", AV19Dir);
         AV35UserAT = httpContext.cgiGet( edtavUserat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35UserAT", AV35UserAT);
         AV32PassAT = httpContext.cgiGet( edtavPassat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32PassAT", AV32PassAT);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDevcrufec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDEVCRUFEC");
            GX_FocusControl = edtavDevcrufec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16DevCruFec = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16DevCruFec", localUtil.format(AV16DevCruFec, "99/99/99"));
         }
         else
         {
            AV16DevCruFec = localUtil.ctod( httpContext.cgiGet( edtavDevcrufec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16DevCruFec", localUtil.format(AV16DevCruFec, "99/99/99"));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavDevcrusal_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vDEVCRUSAL");
            GX_FocusControl = edtavDevcrusal_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18DevCruSal = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV18DevCruSal", localUtil.ttoc( AV18DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV18DevCruSal = localUtil.ctot( httpContext.cgiGet( edtavDevcrusal_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18DevCruSal", localUtil.ttoc( AV18DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         AV51DevCruATCUD = httpContext.cgiGet( edtavDevcruatcud_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51DevCruATCUD", AV51DevCruATCUD);
         AV52DevCruSerAT = httpContext.cgiGet( edtavDevcruserat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52DevCruSerAT", AV52DevCruSerAT);
         AV53DevCruTipAT = httpContext.cgiGet( edtavDevcrutipat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53DevCruTipAT", AV53DevCruTipAT);
         AV56Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56Pgmname", AV56Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"DevolucionTejido_FechaHoraSalida_XML_Envio_AT");
         AV19Dir = httpContext.cgiGet( edtavDir_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Dir", AV19Dir);
         forbiddenHiddens.add("Dir", GXutil.rtrim( localUtil.format( AV19Dir, "")));
         AV35UserAT = httpContext.cgiGet( edtavUserat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35UserAT", AV35UserAT);
         forbiddenHiddens.add("UserAT", GXutil.rtrim( localUtil.format( AV35UserAT, "")));
         AV32PassAT = httpContext.cgiGet( edtavPassat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32PassAT", AV32PassAT);
         forbiddenHiddens.add("PassAT", GXutil.rtrim( localUtil.format( AV32PassAT, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("almacensindetalle\\devoluciontejido_fechahorasalida_xml_envio_at:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
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
      e112A02 ();
      if (returnInSub) return;
   }

   public void e112A02( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_dtime1 = AV46InoutFechaHoraSalida ;
      GXv_dtime2[0] = GXt_dtime1 ;
      new app.stocksquimicos.ptrz001(remoteHandle, context).execute( AV21EmprCod, GXv_dtime2) ;
      devoluciontejido_fechahorasalida_xml_envio_at_impl.this.GXt_dtime1 = GXv_dtime2[0] ;
      AV46InoutFechaHoraSalida = GXt_dtime1 ;
      AV44FechaHoraSalida = AV46InoutFechaHoraSalida ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44FechaHoraSalida", localUtil.ttoc( AV44FechaHoraSalida, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV42DiaHact = GXutil.serverNow( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42DiaHact", localUtil.ttoc( AV42DiaHact, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV49diasalida = GXutil.resetTime(localUtil.ctot( localUtil.ttoc( AV44FechaHoraSalida, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49diasalida", localUtil.format(AV49diasalida, "99/99/99"));
      GXt_char3 = AV19Dir ;
      GXv_char4[0] = GXt_char3 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV21EmprCod, httpContext.getMessage( "SAFTW1", ""), GXv_char4) ;
      devoluciontejido_fechahorasalida_xml_envio_at_impl.this.GXt_char3 = GXv_char4[0] ;
      AV19Dir = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Dir", AV19Dir);
      if ( GXutil.strcmp(AV19Dir, "") == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Path ¡¡¡¡.Revisar Contador SAFTW1", ""));
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      GXt_char3 = AV35UserAT ;
      GXv_char4[0] = AV21EmprCod ;
      GXv_char5[0] = httpContext.getMessage( "USEAT3", "") ;
      GXv_char6[0] = GXt_char3 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_char6) ;
      devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV21EmprCod = GXv_char4[0] ;
      devoluciontejido_fechahorasalida_xml_envio_at_impl.this.GXt_char3 = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
      AV35UserAT = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35UserAT", AV35UserAT);
      GXt_char3 = AV32PassAT ;
      GXv_char6[0] = AV21EmprCod ;
      GXv_char5[0] = httpContext.getMessage( "PASAT3", "") ;
      GXv_char4[0] = GXt_char3 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4) ;
      devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV21EmprCod = GXv_char6[0] ;
      devoluciontejido_fechahorasalida_xml_envio_at_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
      AV32PassAT = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32PassAT", AV32PassAT);
      AV41Vurl = httpContext.getMessage( "urlt", "") ;
      GXt_char3 = AV41Vurl ;
      GXv_char6[0] = AV21EmprCod ;
      GXv_char5[0] = httpContext.getMessage( "URL", "") ;
      GXv_char4[0] = GXt_char3 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4) ;
      devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV21EmprCod = GXv_char6[0] ;
      devoluciontejido_fechahorasalida_xml_envio_at_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
      AV41Vurl = GXt_char3 ;
      GXt_char3 = AV40Vpfx ;
      GXv_char6[0] = GXt_char3 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV21EmprCod, httpContext.getMessage( "PFX", ""), GXv_char6) ;
      devoluciontejido_fechahorasalida_xml_envio_at_impl.this.GXt_char3 = GXv_char6[0] ;
      AV40Vpfx = GXt_char3 ;
      GXt_char3 = AV39Vpasspfx ;
      GXv_char6[0] = GXt_char3 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV21EmprCod, httpContext.getMessage( "PASPFX", ""), GXv_char6) ;
      devoluciontejido_fechahorasalida_xml_envio_at_impl.this.GXt_char3 = GXv_char6[0] ;
      AV39Vpasspfx = GXt_char3 ;
      GXt_int7 = AV38VerCom ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV21EmprCod, httpContext.getMessage( "APISEN", ""), GXv_int8) ;
      devoluciontejido_fechahorasalida_xml_envio_at_impl.this.GXt_int7 = GXv_int8[0] ;
      AV38VerCom = GXt_int7 ;
      /* Using cursor H02A02 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A395EmprCif = H02A02_A395EmprCif[0] ;
         n395EmprCif = H02A02_n395EmprCif[0] ;
         AV20EmprCif = A395EmprCif ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      GXt_char3 = AV6Station ;
      GXv_char6[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char6) ;
      devoluciontejido_fechahorasalida_xml_envio_at_impl.this.GXt_char3 = GXv_char6[0] ;
      AV6Station = GXt_char3 ;
      GXv_char6[0] = AV21EmprCod ;
      GXv_char5[0] = AV5EmprNom ;
      GXv_char4[0] = AV7UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV6Station, GXv_char6, GXv_char5, GXv_char4) ;
      devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV21EmprCod = GXv_char6[0] ;
      devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV5EmprNom = GXv_char5[0] ;
      devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV7UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
      GXv_char6[0] = AV13contidsernew ;
      new app.trabajosexternos.obtengocodigoserieat(remoteHandle, context).execute( AV21EmprCod, "022400", GXv_char6) ;
      devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV13contidsernew = GXv_char6[0] ;
      AV34SerieAT = ((GXutil.strcmp("", AV13contidsernew)==0) ? "GD6" : AV13contidsernew) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34SerieAT", AV34SerieAT);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSERIEAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34SerieAT, ""))));
      GXv_date9[0] = AV16DevCruFec ;
      new app.almacensindetalle.devoluciontejido_obtengofecha(remoteHandle, context).execute( AV21EmprCod, AV17DevCruId, GXv_date9) ;
      devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV16DevCruFec = GXv_date9[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16DevCruFec", localUtil.format(AV16DevCruFec, "99/99/99"));
      GXv_char6[0] = AV51DevCruATCUD ;
      GXv_char5[0] = AV52DevCruSerAT ;
      GXv_char4[0] = AV53DevCruTipAT ;
      new app.almacensindetalle.devoluciontejido_get_atcud(remoteHandle, context).execute( AV21EmprCod, AV17DevCruId, GXv_char6, GXv_char5, GXv_char4) ;
      devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV51DevCruATCUD = GXv_char6[0] ;
      devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV52DevCruSerAT = GXv_char5[0] ;
      devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV53DevCruTipAT = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51DevCruATCUD", AV51DevCruATCUD);
      httpContext.ajax_rsp_assign_attri("", false, "AV52DevCruSerAT", AV52DevCruSerAT);
      httpContext.ajax_rsp_assign_attri("", false, "AV53DevCruTipAT", AV53DevCruTipAT);
   }

   public void e122A02( )
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

   public void e132A02( )
   {
      /* 'DoATCUD' Routine */
      returnInSub = false ;
      lblTbmessage_Caption = "  " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( ! (GXutil.strcmp("", AV51DevCruATCUD)==0) && ! (GXutil.strcmp("", AV52DevCruSerAT)==0) && ! (GXutil.strcmp("", AV53DevCruTipAT)==0) )
      {
         lblTbmessage_Caption = httpContext.getMessage( "Ya existe ATCUD¡¡", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      }
      else
      {
         new app.almacensindetalle.devoluciontejido_atcud(remoteHandle, context).execute( AV21EmprCod, AV17DevCruId) ;
         GXv_char6[0] = AV51DevCruATCUD ;
         GXv_char5[0] = AV52DevCruSerAT ;
         GXv_char4[0] = AV53DevCruTipAT ;
         new app.almacensindetalle.devoluciontejido_get_atcud(remoteHandle, context).execute( AV21EmprCod, AV17DevCruId, GXv_char6, GXv_char5, GXv_char4) ;
         devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV51DevCruATCUD = GXv_char6[0] ;
         devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV52DevCruSerAT = GXv_char5[0] ;
         devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV53DevCruTipAT = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51DevCruATCUD", AV51DevCruATCUD);
         httpContext.ajax_rsp_assign_attri("", false, "AV52DevCruSerAT", AV52DevCruSerAT);
         httpContext.ajax_rsp_assign_attri("", false, "AV53DevCruTipAT", AV53DevCruTipAT);
         httpContext.doAjaxRefresh();
      }
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e142A02 ();
      if (returnInSub) return;
   }

   public void e142A02( )
   {
      /* Enter Routine */
      returnInSub = false ;
      lblTbmessage_Caption = "  " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( (GXutil.strcmp("", AV51DevCruATCUD)==0) || (GXutil.strcmp("", AV52DevCruSerAT)==0) || (GXutil.strcmp("", AV53DevCruTipAT)==0) )
      {
         lblTbmessage_Caption = httpContext.getMessage( "Falta ATCUD¡¡¡ o Falta SERIE¡¡¡ o Falta Tipo Documento¡¡¡", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      }
      else
      {
         GXv_char6[0] = AV30msg_control ;
         new app.devoluciontejido_ctrlhashanterior_2(remoteHandle, context).execute( AV21EmprCod, AV17DevCruId, GXv_char6) ;
         devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV30msg_control = GXv_char6[0] ;
         if ( ! (GXutil.strcmp("", AV30msg_control)==0) )
         {
            lblTbmessage_Caption = AV30msg_control ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         }
         else
         {
            AV42DiaHact = GXutil.serverNow( context, remoteHandle, pr_default) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42DiaHact", localUtil.ttoc( AV42DiaHact, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            if ( AV44FechaHoraSalida.before( GXutil.serverNow( context, remoteHandle, pr_default) ) )
            {
               Gx_msg = httpContext.getMessage( "Erro. Dia-Hora Salida ", "") + localUtil.ttoc( AV44FechaHoraSalida, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " inferior a Dia Actual ", "") + localUtil.ttoc( AV42DiaHact, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
               lblTbmessage_Caption = Gx_msg ;
               httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            }
            else
            {
               if ( AV44FechaHoraSalida.before( AV16DevCruFec ) )
               {
                  Gx_msg = httpContext.getMessage( "Erro. Dia-Hora Salida ", "") + localUtil.ttoc( AV44FechaHoraSalida, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " inferior a Data Documento ", "") + localUtil.dtoc( AV16DevCruFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                  lblTbmessage_Caption = Gx_msg ;
                  httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
               }
               else
               {
                  AV18DevCruSal = AV44FechaHoraSalida ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV18DevCruSal", localUtil.ttoc( AV18DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                  AV15DevCruDtSys = AV42DiaHact ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV15DevCruDtSys", localUtil.ttoc( AV15DevCruDtSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                  new app.documentotransporteproduccion.actualizodiahorasalidadevoluciontejido(remoteHandle, context).execute( AV21EmprCod, AV17DevCruId, AV18DevCruSal, AV15DevCruDtSys) ;
                  AV50DevCruIdIN = AV17DevCruId ;
                  GXv_char6[0] = AV21EmprCod ;
                  GXv_int10[0] = AV17DevCruId ;
                  GXv_date9[0] = AV16DevCruFec ;
                  GXv_dtime2[0] = AV15DevCruDtSys ;
                  GXv_int8[0] = (byte)(3) ;
                  GXv_int11[0] = (byte)(1) ;
                  GXv_char5[0] = AV12Cadena ;
                  new app.almacensindetalle.obtengocadenaparahashdevolucionalmacen(remoteHandle, context).execute( GXv_char6, GXv_int10, GXv_date9, GXv_dtime2, GXv_int8, GXv_int11, GXv_char5) ;
                  devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV21EmprCod = GXv_char6[0] ;
                  devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV17DevCruId = GXv_int10[0] ;
                  devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV16DevCruFec = GXv_date9[0] ;
                  devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV15DevCruDtSys = GXv_dtime2[0] ;
                  devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV12Cadena = GXv_char5[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV17DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17DevCruId), 8, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV16DevCruFec", localUtil.format(AV16DevCruFec, "99/99/99"));
                  httpContext.ajax_rsp_assign_attri("", false, "AV15DevCruDtSys", localUtil.ttoc( AV15DevCruDtSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                  GXv_char6[0] = AV25Hash ;
                  GXv_objcol_SdtMessages_Message12[0] = AV28Messages ;
                  GXv_boolean13[0] = AV31OK ;
                  new app.hash_obtener(remoteHandle, context).execute( AV12Cadena, GXv_char6, GXv_objcol_SdtMessages_Message12, GXv_boolean13) ;
                  devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV25Hash = GXv_char6[0] ;
                  AV28Messages = GXv_objcol_SdtMessages_Message12[0] ;
                  devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV31OK = GXv_boolean13[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV25Hash", AV25Hash);
                  if ( ! AV31OK )
                  {
                     AV59GXV1 = 1 ;
                     while ( AV59GXV1 <= AV28Messages.size() )
                     {
                        AV27Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV28Messages.elementAt(-1+AV59GXV1));
                        httpContext.GX_msglist.addItem(AV27Message.getgxTv_SdtMessages_Message_Description());
                        AV59GXV1 = (int)(AV59GXV1+1) ;
                     }
                  }
                  else
                  {
                     /* Execute user subroutine: 'DEVCRU' */
                     S112 ();
                     if (returnInSub) return;
                     if ( (0==AV26Lineas) )
                     {
                        lblTbmessage_Caption = httpContext.getMessage( "NO tiene Lineas ¡¡¡¡", "") ;
                        httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                     }
                     else
                     {
                        if ( GXutil.strcmp(AV19Dir, "") == 0 )
                        {
                           lblTbmessage_Caption = httpContext.getMessage( "Falta Path ¡¡¡¡.Revisar Contador SAFTW1", "") ;
                           httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                        }
                        else
                        {
                           if ( (0==AV14devcru) )
                           {
                              lblTbmessage_Caption = httpContext.getMessage( "Nao Existe Documento¡¡¡", "") ;
                              httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                           }
                           else
                           {
                              lblTbmessage_Caption = httpContext.getMessage( "Hash creado correctamente", "") ;
                              httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                              GXv_char6[0] = AV21EmprCod ;
                              GXv_int10[0] = AV17DevCruId ;
                              GXv_char5[0] = AV12Cadena ;
                              GXv_char4[0] = AV25Hash ;
                              new app.almacensindetalle.actualizohashdevolucionalmacen(remoteHandle, context).execute( GXv_char6, GXv_int10, GXv_char5, GXv_char4) ;
                              devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV21EmprCod = GXv_char6[0] ;
                              devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV17DevCruId = GXv_int10[0] ;
                              devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV12Cadena = GXv_char5[0] ;
                              devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV25Hash = GXv_char4[0] ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
                              httpContext.ajax_rsp_assign_attri("", false, "AV17DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17DevCruId), 8, 0));
                              httpContext.ajax_rsp_assign_attri("", false, "AV25Hash", AV25Hash);
                              if ( (GXutil.strcmp("", AV25Hash)==0) )
                              {
                                 Gx_msg = httpContext.getMessage( "Atenção O código HASH está faltando.", "") + GXutil.newLine( ) ;
                                 Gx_msg += httpContext.getMessage( "É necessário criar o HASH para o documento.", "") + GXutil.newLine( ) ;
                                 lblTbmessage_Caption = Gx_msg ;
                                 httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                              }
                              else
                              {
                                 AV22Fichero = GXutil.trim( AV34SerieAT) + GXutil.padl( GXutil.trim( GXutil.str( AV17DevCruId, 8, 0)), (short)(8), "0") ;
                                 AV47File.setSource( GXutil.trim( AV19Dir)+"\\"+GXutil.trim( AV22Fichero)+httpContext.getMessage( ".xml", "") );
                                 AV33Path = GXutil.trim( AV19Dir) ;
                                 GXv_char6[0] = AV21EmprCod ;
                                 GXv_int10[0] = AV17DevCruId ;
                                 GXv_char5[0] = AV33Path ;
                                 GXv_char4[0] = AV22Fichero ;
                                 GXv_objcol_SdtMessages_Message12[0] = AV28Messages ;
                                 GXv_boolean13[0] = AV31OK ;
                                 new app.almacensindetalle.pdcxml(remoteHandle, context).execute( GXv_char6, GXv_int10, GXv_char5, GXv_char4, GXv_objcol_SdtMessages_Message12, GXv_boolean13) ;
                                 devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV21EmprCod = GXv_char6[0] ;
                                 devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV17DevCruId = GXv_int10[0] ;
                                 devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV33Path = GXv_char5[0] ;
                                 devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV22Fichero = GXv_char4[0] ;
                                 AV28Messages = GXv_objcol_SdtMessages_Message12[0] ;
                                 devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV31OK = GXv_boolean13[0] ;
                                 httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
                                 httpContext.ajax_rsp_assign_attri("", false, "AV17DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17DevCruId), 8, 0));
                                 if ( ! AV31OK )
                                 {
                                    AV60GXV2 = 1 ;
                                    while ( AV60GXV2 <= AV28Messages.size() )
                                    {
                                       AV27Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV28Messages.elementAt(-1+AV60GXV2));
                                       httpContext.GX_msglist.addItem(AV27Message.getgxTv_SdtMessages_Message_Description());
                                       AV60GXV2 = (int)(AV60GXV2+1) ;
                                    }
                                 }
                                 else
                                 {
                                    GXv_objcol_SdtMessages_Message12[0] = AV28Messages ;
                                    GXv_boolean13[0] = AV31OK ;
                                    new app.at_comunicar(remoteHandle, context).execute( AV21EmprCod, AV22Fichero, AV35UserAT, AV32PassAT, GXv_objcol_SdtMessages_Message12, GXv_boolean13) ;
                                    AV28Messages = GXv_objcol_SdtMessages_Message12[0] ;
                                    devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV31OK = GXv_boolean13[0] ;
                                    AV29Messages_tojson = AV28Messages.toJSonString(false) ;
                                    AV23FileR = GXutil.trim( AV34SerieAT) + GXutil.padl( GXutil.trim( GXutil.str( AV17DevCruId, 8, 0)), (short)(8), "0") ;
                                    AV47File.setSource( GXutil.trim( AV19Dir)+"\\"+GXutil.trim( AV23FileR)+httpContext.getMessage( "result", "")+httpContext.getMessage( ".xml", "") );
                                    AV36Var_File = AV47File.getAbsoluteName() ;
                                    if ( AV31OK )
                                    {
                                       GXv_char6[0] = AV21EmprCod ;
                                       GXv_char5[0] = AV22Fichero ;
                                       GXv_int10[0] = AV17DevCruId ;
                                       GXv_objcol_SdtMessages_Message12[0] = AV28Messages ;
                                       GXv_boolean13[0] = AV31OK ;
                                       new app.almacensindetalle.devoluciontejido_result(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_int10, GXv_objcol_SdtMessages_Message12, GXv_boolean13) ;
                                       devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV21EmprCod = GXv_char6[0] ;
                                       devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV22Fichero = GXv_char5[0] ;
                                       devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV17DevCruId = GXv_int10[0] ;
                                       AV28Messages = GXv_objcol_SdtMessages_Message12[0] ;
                                       devoluciontejido_fechahorasalida_xml_envio_at_impl.this.AV31OK = GXv_boolean13[0] ;
                                       httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
                                       httpContext.ajax_rsp_assign_attri("", false, "AV17DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17DevCruId), 8, 0));
                                       AV29Messages_tojson = AV28Messages.toJSonString(false) ;
                                       httpContext.popup(formatLink("app.almacensindetalle.devoluciontejido_6", new String[] {GXutil.URLEncode(GXutil.rtrim(AV21EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV22Fichero)),GXutil.URLEncode(GXutil.ltrimstr(AV17DevCruId,8,0)),GXutil.URLEncode(GXutil.rtrim(AV29Messages_tojson)),GXutil.URLEncode(GXutil.booltostr(AV31OK))}, new String[] {"Emprcod","Fichero","DevCruId","Messages_tojson","Ok"}) , new Object[] {});
                                       if ( ! AV31OK )
                                       {
                                          httpContext.popup(formatLink("app.almacensindetalle.imprimirdevolucion", new String[] {GXutil.URLEncode(GXutil.rtrim(AV21EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV17DevCruId,8,0))}, new String[] {"Emprcod","DevCruId"}) , new Object[] {"AV21EmprCod","AV17DevCruId"});
                                          httpContext.setWebReturnParms(new Object[] {});
                                          httpContext.setWebReturnParmsMetadata(new Object[] {});
                                          httpContext.wjLocDisableFrm = (byte)(1) ;
                                          httpContext.nUserReturn = (byte)(1) ;
                                          returnInSub = true;
                                          if (true) return;
                                       }
                                       else
                                       {
                                          httpContext.popup(formatLink("app.almacensindetalle.imprimirdevolucion", new String[] {GXutil.URLEncode(GXutil.rtrim(AV21EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV17DevCruId,8,0))}, new String[] {"Emprcod","DevCruId"}) , new Object[] {"AV21EmprCod","AV17DevCruId"});
                                          httpContext.setWebReturnParms(new Object[] {});
                                          httpContext.setWebReturnParmsMetadata(new Object[] {});
                                          httpContext.wjLocDisableFrm = (byte)(1) ;
                                          httpContext.nUserReturn = (byte)(1) ;
                                          returnInSub = true;
                                          if (true) return;
                                       }
                                    }
                                    else
                                    {
                                       AV61GXV3 = 1 ;
                                       while ( AV61GXV3 <= AV28Messages.size() )
                                       {
                                          AV27Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV28Messages.elementAt(-1+AV61GXV3));
                                          AV37Var_mensaje = AV27Message.getgxTv_SdtMessages_Message_Id() + GXutil.newLine( ) ;
                                          AV37Var_mensaje += AV27Message.getgxTv_SdtMessages_Message_Description() + GXutil.newLine( ) ;
                                          httpContext.GX_msglist.addItem(AV37Var_mensaje);
                                          AV61GXV3 = (int)(AV61GXV3+1) ;
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'DEVCRU' Routine */
      returnInSub = false ;
      /* Using cursor H02A03 */
      pr_default.execute(1, new Object[] {AV21EmprCod, Integer.valueOf(AV17DevCruId)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A11669DevCruId = H02A03_A11669DevCruId[0] ;
         A396EmprCod = H02A03_A396EmprCod[0] ;
         A11670DevCruFec = H02A03_A11670DevCruFec[0] ;
         A11680DevCruAtId = H02A03_A11680DevCruAtId[0] ;
         A11674DevCruHash = H02A03_A11674DevCruHash[0] ;
         AV11AlbProfch = A11670DevCruFec ;
         AV10ALbLic = A11680DevCruAtId ;
         AV14devcru = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14devcru", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14devcru), 4, 0));
         AV8AlbCOmcod = A11669DevCruId ;
         AV9Albfmd = A11674DevCruHash ;
         AV26Lineas = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Lineas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Lineas), 4, 0));
         /* Optimized group. */
         /* Using cursor H02A04 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
         cV26Lineas = H02A04_AV26Lineas[0] ;
         pr_default.close(2);
         AV26Lineas = (short)(AV26Lineas+cV26Lineas*1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Lineas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Lineas), 4, 0));
         /* End optimized group. */
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   protected void nextLoad( )
   {
   }

   protected void e152A02( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV21EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
      AV17DevCruId = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17DevCruId), 8, 0));
      AV15DevCruDtSys = (java.util.Date)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15DevCruDtSys", localUtil.ttoc( AV15DevCruDtSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV25Hash = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Hash", AV25Hash);
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
      pa2A02( ) ;
      ws2A02( ) ;
      we2A02( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415132230", true, true);
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
      httpContext.AddJavascriptSource("almacensindetalle/devoluciontejido_fechahorasalida_xml_envio_at.js", "?202682415132230", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavFechahorasalida_Internalname = "vFECHAHORASALIDA" ;
      edtavDiahact_Internalname = "vDIAHACT" ;
      edtavDiasalida_Internalname = "vDIASALIDA" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      lblTbmessage_Internalname = "TBMESSAGE" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtavDir_Internalname = "vDIR" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavUserat_Internalname = "vUSERAT" ;
      edtavPassat_Internalname = "vPASSAT" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtavDevcruid_Internalname = "vDEVCRUID" ;
      edtavDevcrufec_Internalname = "vDEVCRUFEC" ;
      edtavDevcrusal_Internalname = "vDEVCRUSAL" ;
      edtavDevcrudtsys_Internalname = "vDEVCRUDTSYS" ;
      edtavDevcruatcud_Internalname = "vDEVCRUATCUD" ;
      edtavDevcruserat_Internalname = "vDEVCRUSERAT" ;
      edtavDevcrutipat_Internalname = "vDEVCRUTIPAT" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      bttBtnatcud_Internalname = "BTNATCUD" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
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
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavDevcrutipat_Jsonclick = "" ;
      edtavDevcrutipat_Enabled = 1 ;
      edtavDevcruserat_Jsonclick = "" ;
      edtavDevcruserat_Enabled = 1 ;
      edtavDevcruatcud_Jsonclick = "" ;
      edtavDevcruatcud_Enabled = 1 ;
      edtavDevcrudtsys_Jsonclick = "" ;
      edtavDevcrudtsys_Enabled = 0 ;
      edtavDevcrusal_Jsonclick = "" ;
      edtavDevcrusal_Enabled = 1 ;
      edtavDevcrufec_Jsonclick = "" ;
      edtavDevcrufec_Enabled = 1 ;
      edtavDevcruid_Jsonclick = "" ;
      edtavDevcruid_Enabled = 0 ;
      edtavPassat_Jsonclick = "" ;
      edtavPassat_Enabled = 1 ;
      edtavUserat_Jsonclick = "" ;
      edtavUserat_Enabled = 1 ;
      edtavDir_Jsonclick = "" ;
      edtavDir_Enabled = 1 ;
      lblTbmessage_Caption = "  " ;
      edtavDiasalida_Jsonclick = "" ;
      edtavDiasalida_Enabled = 1 ;
      edtavDiahact_Jsonclick = "" ;
      edtavDiahact_Enabled = 1 ;
      edtavFechahorasalida_Jsonclick = "" ;
      edtavFechahorasalida_Enabled = 1 ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Informacion Envio Web Service AT", "") ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Fecha-Hora Salida, Hash, Comunico a AT", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV34SerieAT',fld:'vSERIEAT',pic:'',hsh:true},{av:'AV19Dir',fld:'vDIR',pic:''},{av:'AV35UserAT',fld:'vUSERAT',pic:''},{av:'AV32PassAT',fld:'vPASSAT',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCERRAR'","{handler:'e122A02',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOATCUD'","{handler:'e132A02',iparms:[{av:'AV51DevCruATCUD',fld:'vDEVCRUATCUD',pic:''},{av:'AV52DevCruSerAT',fld:'vDEVCRUSERAT',pic:''},{av:'AV53DevCruTipAT',fld:'vDEVCRUTIPAT',pic:''},{av:'AV21EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV17DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOATCUD'",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV53DevCruTipAT',fld:'vDEVCRUTIPAT',pic:''},{av:'AV52DevCruSerAT',fld:'vDEVCRUSERAT',pic:''},{av:'AV51DevCruATCUD',fld:'vDEVCRUATCUD',pic:''}]}");
      setEventMetadata("ENTER","{handler:'e142A02',iparms:[{av:'AV51DevCruATCUD',fld:'vDEVCRUATCUD',pic:''},{av:'AV52DevCruSerAT',fld:'vDEVCRUSERAT',pic:''},{av:'AV53DevCruTipAT',fld:'vDEVCRUTIPAT',pic:''},{av:'AV21EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV17DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV44FechaHoraSalida',fld:'vFECHAHORASALIDA',pic:'99/99/99 99:99:99'},{av:'AV16DevCruFec',fld:'vDEVCRUFEC',pic:''},{av:'AV26Lineas',fld:'vLINEAS',pic:'ZZZ9'},{av:'AV19Dir',fld:'vDIR',pic:''},{av:'AV14devcru',fld:'vDEVCRU',pic:'ZZZ9'},{av:'AV34SerieAT',fld:'vSERIEAT',pic:'',hsh:true},{av:'AV35UserAT',fld:'vUSERAT',pic:''},{av:'AV32PassAT',fld:'vPASSAT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9'},{av:'A11670DevCruFec',fld:'DEVCRUFEC',pic:''},{av:'A11680DevCruAtId',fld:'DEVCRUATID',pic:''},{av:'A11674DevCruHash',fld:'DEVCRUHASH',pic:''},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV42DiaHact',fld:'vDIAHACT',pic:'99/99/99 99:99:99'},{av:'AV18DevCruSal',fld:'vDEVCRUSAL',pic:'99/99/99 99:99'},{av:'AV15DevCruDtSys',fld:'vDEVCRUDTSYS',pic:'99/99/99 99:99'},{av:'AV16DevCruFec',fld:'vDEVCRUFEC',pic:''},{av:'AV17DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV21EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25Hash',fld:'vHASH',pic:''},{av:'AV14devcru',fld:'vDEVCRU',pic:'ZZZ9'},{av:'AV26Lineas',fld:'vLINEAS',pic:'ZZZ9'}]}");
      setEventMetadata("VALIDV_DEVCRUID","{handler:'validv_Devcruid',iparms:[]");
      setEventMetadata("VALIDV_DEVCRUID",",oparms:[]}");
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
      wcpOAV21EmprCod = "" ;
      wcpOAV15DevCruDtSys = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV25Hash = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV21EmprCod = "" ;
      AV15DevCruDtSys = GXutil.resetTime( GXutil.nullDate() );
      AV25Hash = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV34SerieAT = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV19Dir = "" ;
      AV35UserAT = "" ;
      AV32PassAT = "" ;
      A396EmprCod = "" ;
      A11670DevCruFec = GXutil.nullDate() ;
      A11680DevCruAtId = "" ;
      A11674DevCruHash = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV44FechaHoraSalida = GXutil.resetTime( GXutil.nullDate() );
      AV42DiaHact = GXutil.resetTime( GXutil.nullDate() );
      AV49diasalida = GXutil.nullDate() ;
      lblTbmessage_Jsonclick = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      AV16DevCruFec = GXutil.nullDate() ;
      AV18DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      AV51DevCruATCUD = "" ;
      AV52DevCruSerAT = "" ;
      AV53DevCruTipAT = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      bttBtnatcud_Jsonclick = "" ;
      AV56Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      hsh = "" ;
      AV46InoutFechaHoraSalida = GXutil.resetTime( GXutil.nullDate() );
      GXt_dtime1 = GXutil.resetTime( GXutil.nullDate() );
      AV41Vurl = "" ;
      AV40Vpfx = "" ;
      AV39Vpasspfx = "" ;
      scmdbuf = "" ;
      H02A02_A396EmprCod = new String[] {""} ;
      H02A02_A395EmprCif = new String[] {""} ;
      H02A02_n395EmprCif = new boolean[] {false} ;
      A395EmprCif = "" ;
      AV20EmprCif = "" ;
      AV6Station = "" ;
      GXt_char3 = "" ;
      AV5EmprNom = "" ;
      AV7UsurCod = "" ;
      AV13contidsernew = "" ;
      AV30msg_control = "" ;
      Gx_msg = "" ;
      GXv_date9 = new java.util.Date[1] ;
      GXv_dtime2 = new java.util.Date[1] ;
      GXv_int8 = new byte[1] ;
      GXv_int11 = new byte[1] ;
      AV12Cadena = "" ;
      AV28Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV27Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV22Fichero = "" ;
      AV47File = new com.genexus.util.GXFile();
      AV33Path = "" ;
      GXv_char4 = new String[1] ;
      AV29Messages_tojson = "" ;
      AV23FileR = "" ;
      AV36Var_File = "" ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_objcol_SdtMessages_Message12 = new GXBaseCollection[1] ;
      GXv_boolean13 = new boolean[1] ;
      AV37Var_mensaje = "" ;
      H02A03_A11669DevCruId = new int[1] ;
      H02A03_A396EmprCod = new String[] {""} ;
      H02A03_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      H02A03_A11680DevCruAtId = new String[] {""} ;
      H02A03_A11674DevCruHash = new String[] {""} ;
      AV11AlbProfch = GXutil.nullDate() ;
      AV10ALbLic = "" ;
      AV9Albfmd = "" ;
      H02A04_AV26Lineas = new short[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.devoluciontejido_fechahorasalida_xml_envio_at__default(),
         new Object[] {
             new Object[] {
            H02A02_A396EmprCod, H02A02_A395EmprCif, H02A02_n395EmprCif
            }
            , new Object[] {
            H02A03_A11669DevCruId, H02A03_A396EmprCod, H02A03_A11670DevCruFec, H02A03_A11680DevCruAtId, H02A03_A11674DevCruHash
            }
            , new Object[] {
            H02A04_AV26Lineas
            }
         }
      );
      AV56Pgmname = "AlmacenSinDetalle.DevolucionTejido_FechaHoraSalida_XML_Envio_AT" ;
      /* GeneXus formulas. */
      AV56Pgmname = "AlmacenSinDetalle.DevolucionTejido_FechaHoraSalida_XML_Envio_AT" ;
      Gx_err = (short)(0) ;
      edtavDiahact_Enabled = 0 ;
      edtavDiasalida_Enabled = 0 ;
      edtavDir_Enabled = 0 ;
      edtavUserat_Enabled = 0 ;
      edtavPassat_Enabled = 0 ;
      edtavDevcruid_Enabled = 0 ;
      edtavDevcrufec_Enabled = 0 ;
      edtavDevcrusal_Enabled = 0 ;
      edtavDevcrudtsys_Enabled = 0 ;
      edtavDevcruatcud_Enabled = 0 ;
      edtavDevcruserat_Enabled = 0 ;
      edtavDevcrutipat_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte AV38VerCom ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte GXv_int11[] ;
   private byte nGXWrapped ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV26Lineas ;
   private short AV14devcru ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short cV26Lineas ;
   private int wcpOAV17DevCruId ;
   private int AV17DevCruId ;
   private int A11669DevCruId ;
   private int A44AlbRecCod ;
   private int edtavFechahorasalida_Enabled ;
   private int edtavDiahact_Enabled ;
   private int edtavDiasalida_Enabled ;
   private int edtavDir_Enabled ;
   private int edtavUserat_Enabled ;
   private int edtavPassat_Enabled ;
   private int edtavDevcruid_Enabled ;
   private int edtavDevcrufec_Enabled ;
   private int edtavDevcrusal_Enabled ;
   private int edtavDevcrudtsys_Enabled ;
   private int edtavDevcruatcud_Enabled ;
   private int edtavDevcruserat_Enabled ;
   private int edtavDevcrutipat_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV50DevCruIdIN ;
   private int AV59GXV1 ;
   private int AV60GXV2 ;
   private int GXv_int10[] ;
   private int AV61GXV3 ;
   private int AV8AlbCOmcod ;
   private int idxLst ;
   private String wcpOAV21EmprCod ;
   private String wcpOAV25Hash ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV21EmprCod ;
   private String AV25Hash ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV34SerieAT ;
   private String GXKey ;
   private String AV19Dir ;
   private String AV35UserAT ;
   private String AV32PassAT ;
   private String A396EmprCod ;
   private String A11680DevCruAtId ;
   private String A11674DevCruHash ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String edtavFechahorasalida_Internalname ;
   private String TempTags ;
   private String edtavFechahorasalida_Jsonclick ;
   private String edtavDiahact_Internalname ;
   private String edtavDiahact_Jsonclick ;
   private String edtavDiasalida_Internalname ;
   private String edtavDiasalida_Jsonclick ;
   private String lblTbmessage_Internalname ;
   private String lblTbmessage_Caption ;
   private String lblTbmessage_Jsonclick ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavDir_Internalname ;
   private String edtavDir_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtavUserat_Internalname ;
   private String edtavUserat_Jsonclick ;
   private String edtavPassat_Internalname ;
   private String edtavPassat_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String edtavDevcruid_Internalname ;
   private String edtavDevcruid_Jsonclick ;
   private String edtavDevcrufec_Internalname ;
   private String edtavDevcrufec_Jsonclick ;
   private String edtavDevcrusal_Internalname ;
   private String edtavDevcrusal_Jsonclick ;
   private String edtavDevcrudtsys_Internalname ;
   private String edtavDevcrudtsys_Jsonclick ;
   private String edtavDevcruatcud_Internalname ;
   private String AV51DevCruATCUD ;
   private String edtavDevcruatcud_Jsonclick ;
   private String edtavDevcruserat_Internalname ;
   private String AV52DevCruSerAT ;
   private String edtavDevcruserat_Jsonclick ;
   private String edtavDevcrutipat_Internalname ;
   private String AV53DevCruTipAT ;
   private String edtavDevcrutipat_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String bttBtnatcud_Internalname ;
   private String bttBtnatcud_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV56Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String hsh ;
   private String AV41Vurl ;
   private String AV40Vpfx ;
   private String AV39Vpasspfx ;
   private String scmdbuf ;
   private String A395EmprCif ;
   private String AV20EmprCif ;
   private String AV6Station ;
   private String GXt_char3 ;
   private String AV5EmprNom ;
   private String AV7UsurCod ;
   private String AV13contidsernew ;
   private String Gx_msg ;
   private String AV22Fichero ;
   private String GXv_char4[] ;
   private String AV23FileR ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String AV10ALbLic ;
   private java.util.Date wcpOAV15DevCruDtSys ;
   private java.util.Date AV15DevCruDtSys ;
   private java.util.Date AV44FechaHoraSalida ;
   private java.util.Date AV42DiaHact ;
   private java.util.Date AV18DevCruSal ;
   private java.util.Date AV46InoutFechaHoraSalida ;
   private java.util.Date GXt_dtime1 ;
   private java.util.Date GXv_dtime2[] ;
   private java.util.Date A11670DevCruFec ;
   private java.util.Date AV49diasalida ;
   private java.util.Date AV16DevCruFec ;
   private java.util.Date GXv_date9[] ;
   private java.util.Date AV11AlbProfch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n395EmprCif ;
   private boolean AV31OK ;
   private boolean GXv_boolean13[] ;
   private String AV30msg_control ;
   private String AV12Cadena ;
   private String AV33Path ;
   private String AV29Messages_tojson ;
   private String AV36Var_File ;
   private String AV37Var_mensaje ;
   private String AV9Albfmd ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXFile AV47File ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H02A02_A396EmprCod ;
   private String[] H02A02_A395EmprCif ;
   private boolean[] H02A02_n395EmprCif ;
   private int[] H02A03_A11669DevCruId ;
   private String[] H02A03_A396EmprCod ;
   private java.util.Date[] H02A03_A11670DevCruFec ;
   private String[] H02A03_A11680DevCruAtId ;
   private String[] H02A03_A11674DevCruHash ;
   private short[] H02A04_AV26Lineas ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV28Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message12[] ;
   private com.genexus.SdtMessages_Message AV27Message ;
}

final  class devoluciontejido_fechahorasalida_xml_envio_at__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02A02", "SELECT EmprCod, EmprCif FROM TXPEMPRES ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02A03", "SELECT DevCruId, EmprCod, DevCruFec, DevCruAtId, DevCruHash FROM TXPDEVCRU WHERE EmprCod = ? and DevCruId = ? ORDER BY EmprCod, DevCruId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H02A04", "SELECT COUNT(*) FROM TXPDEVCR1 WHERE EmprCod = ? and DevCruId = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 15);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 200);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

