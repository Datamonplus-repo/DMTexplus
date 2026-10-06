package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class preparoxmldevolucionesenvioat_impl extends GXDataArea
{
   public preparoxmldevolucionesenvioat_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public preparoxmldevolucionesenvioat_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preparoxmldevolucionesenvioat_impl.class ));
   }

   public preparoxmldevolucionesenvioat_impl( int remoteHandle ,
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
            AV7EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV6DevCruId = (int)(GXutil.lval( httpContext.GetPar( "DevCruId"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6DevCruId), 8, 0));
               AV5DevCruDtSys = localUtil.parseDTimeParm( httpContext.GetPar( "DevCruDtSys")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5DevCruDtSys", localUtil.ttoc( AV5DevCruDtSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV8DevCruSal = localUtil.parseDTimeParm( httpContext.GetPar( "DevCruSal")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8DevCruSal", localUtil.ttoc( AV8DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV17Hash = httpContext.GetPar( "Hash") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17Hash", AV17Hash);
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
      pa17J2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start17J2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.almacensindetalle.preparoxmldevolucionesenvioat", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6DevCruId,8,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV5DevCruDtSys)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV8DevCruSal)),GXutil.URLEncode(GXutil.rtrim(AV17Hash))}, new String[] {"EmprCod","DevCruId","DevCruDtSys","DevCruSal","Hash"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSERIEAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39SerieAT, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31AlbProID), "ZZZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"PreparoXMLDevolucionesEnvioAT");
      forbiddenHiddens.add("Dir", GXutil.rtrim( localUtil.format( AV9Dir, "")));
      forbiddenHiddens.add("UserAT", GXutil.rtrim( localUtil.format( AV10UserAT, "")));
      forbiddenHiddens.add("PassAT", GXutil.rtrim( localUtil.format( AV11PassAT, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("almacensindetalle\\preparoxmldevolucionesenvioat:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vHASH", GXutil.rtrim( AV17Hash));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vLINEAS", GXutil.ltrim( localUtil.ntoc( AV19Lineas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDEVCRU", GXutil.ltrim( localUtil.ntoc( AV18devcru, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSERIEAT", GXutil.rtrim( AV39SerieAT));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSERIEAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39SerieAT, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROID", GXutil.ltrim( localUtil.ntoc( AV31AlbProID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31AlbProID), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUID", GXutil.ltrim( localUtil.ntoc( A11669DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUFEC", localUtil.dtoc( A11670DevCruFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUATID", GXutil.rtrim( A11680DevCruAtId));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUHASH", GXutil.rtrim( A11674DevCruHash));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECCOD", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
         we17J2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt17J2( ) ;
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
      return formatLink("app.almacensindetalle.preparoxmldevolucionesenvioat", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6DevCruId,8,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV5DevCruDtSys)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV8DevCruSal)),GXutil.URLEncode(GXutil.rtrim(AV17Hash))}, new String[] {"EmprCod","DevCruId","DevCruDtSys","DevCruSal","Hash"})  ;
   }

   public String getPgmname( )
   {
      return "AlmacenSinDetalle.PreparoXMLDevolucionesEnvioAT" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Preparo XML Devoluciones Envio AT", "") ;
   }

   public void wb17J0( )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDir_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDir_Internalname, httpContext.getMessage( "path", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDir_Internalname, GXutil.rtrim( AV9Dir), GXutil.rtrim( localUtil.format( AV9Dir, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDir_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDir_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\PreparoXMLDevolucionesEnvioAT.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavUserat_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavUserat_Internalname, httpContext.getMessage( "Utilizador Portal Finanzas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUserat_Internalname, GXutil.rtrim( AV10UserAT), GXutil.rtrim( localUtil.format( AV10UserAT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUserat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavUserat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\PreparoXMLDevolucionesEnvioAT.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPassat_Internalname, GXutil.rtrim( AV11PassAT), GXutil.rtrim( localUtil.format( AV11PassAT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPassat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPassat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(-1), (short)(0), 0, (byte)(0), (byte)(0), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\PreparoXMLDevolucionesEnvioAT.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDevcruid_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDevcruid_Internalname, httpContext.getMessage( "Nº Guia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDevcruid_Internalname, GXutil.ltrim( localUtil.ntoc( AV6DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavDevcruid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6DevCruId), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV6DevCruId), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDevcruid_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDevcruid_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\PreparoXMLDevolucionesEnvioAT.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDevcrufec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDevcrufec_Internalname, httpContext.getMessage( "Data Guia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDevcrufec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDevcrufec_Internalname, localUtil.format(AV40DevCruFec, "99/99/99"), localUtil.format( AV40DevCruFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDevcrufec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDevcrufec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\PreparoXMLDevolucionesEnvioAT.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDevcrufec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavDevcrufec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\PreparoXMLDevolucionesEnvioAT.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDevcrusal_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDevcrusal_Internalname, httpContext.getMessage( "Data Hora-Salida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavDevcrusal_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDevcrusal_Internalname, localUtil.ttoc( AV8DevCruSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV8DevCruSal, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDevcrusal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDevcrusal_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\PreparoXMLDevolucionesEnvioAT.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDevcrusal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavDevcrusal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\PreparoXMLDevolucionesEnvioAT.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDevcrudtsys_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDevcrudtsys_Internalname, httpContext.getMessage( "Data System Hash", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavDevcrudtsys_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDevcrudtsys_Internalname, localUtil.ttoc( AV5DevCruDtSys, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV5DevCruDtSys, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDevcrudtsys_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDevcrudtsys_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\PreparoXMLDevolucionesEnvioAT.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDevcrudtsys_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavDevcrudtsys_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\PreparoXMLDevolucionesEnvioAT.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\PreparoXMLDevolucionesEnvioAT.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\PreparoXMLDevolucionesEnvioAT.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV46Pgmname), GXutil.rtrim( localUtil.format( AV46Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\PreparoXMLDevolucionesEnvioAT.htm");
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

   public void start17J2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Preparo XML Devoluciones Envio AT", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup17J0( ) ;
   }

   public void ws17J2( )
   {
      start17J2( ) ;
      evt17J2( ) ;
   }

   public void evt17J2( )
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
                           e1117J2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e1217J2 ();
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
                                 e1317J2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e1417J2 ();
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

   public void we17J2( )
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

   public void pa17J2( )
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
            GX_FocusControl = edtavDir_Internalname ;
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
      rf17J2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV46Pgmname = "AlmacenSinDetalle.PreparoXMLDevolucionesEnvioAT" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Pgmname", AV46Pgmname);
      Gx_err = (short)(0) ;
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
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf17J2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1417J2 ();
         wb17J0( ) ;
      }
   }

   public void send_integrity_lvl_hashes17J2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vSERIEAT", GXutil.rtrim( AV39SerieAT));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSERIEAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39SerieAT, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROID", GXutil.ltrim( localUtil.ntoc( AV31AlbProID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31AlbProID), "ZZZZZZZ9")));
   }

   public void before_start_formulas( )
   {
      AV46Pgmname = "AlmacenSinDetalle.PreparoXMLDevolucionesEnvioAT" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Pgmname", AV46Pgmname);
      Gx_err = (short)(0) ;
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
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup17J0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1117J2 ();
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
         /* Read variables values. */
         AV9Dir = httpContext.cgiGet( edtavDir_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Dir", AV9Dir);
         AV10UserAT = httpContext.cgiGet( edtavUserat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10UserAT", AV10UserAT);
         AV11PassAT = httpContext.cgiGet( edtavPassat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11PassAT", AV11PassAT);
         AV6DevCruId = (int)(localUtil.ctol( httpContext.cgiGet( edtavDevcruid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6DevCruId), 8, 0));
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDevcrufec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDEVCRUFEC");
            GX_FocusControl = edtavDevcrufec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV40DevCruFec = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40DevCruFec", localUtil.format(AV40DevCruFec, "99/99/99"));
         }
         else
         {
            AV40DevCruFec = localUtil.ctod( httpContext.cgiGet( edtavDevcrufec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40DevCruFec", localUtil.format(AV40DevCruFec, "99/99/99"));
         }
         AV5DevCruDtSys = localUtil.ctot( httpContext.cgiGet( edtavDevcrudtsys_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5DevCruDtSys", localUtil.ttoc( AV5DevCruDtSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV46Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46Pgmname", AV46Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"PreparoXMLDevolucionesEnvioAT");
         AV9Dir = httpContext.cgiGet( edtavDir_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Dir", AV9Dir);
         forbiddenHiddens.add("Dir", GXutil.rtrim( localUtil.format( AV9Dir, "")));
         AV10UserAT = httpContext.cgiGet( edtavUserat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10UserAT", AV10UserAT);
         forbiddenHiddens.add("UserAT", GXutil.rtrim( localUtil.format( AV10UserAT, "")));
         AV11PassAT = httpContext.cgiGet( edtavPassat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11PassAT", AV11PassAT);
         forbiddenHiddens.add("PassAT", GXutil.rtrim( localUtil.format( AV11PassAT, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("almacensindetalle\\preparoxmldevolucionesenvioat:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1117J2 ();
      if (returnInSub) return;
   }

   public void e1117J2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV9Dir ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "SAFTW1", ""), GXv_char2) ;
      preparoxmldevolucionesenvioat_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9Dir = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Dir", AV9Dir);
      if ( GXutil.strcmp(AV9Dir, "") == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Path ¡¡¡¡.Revisar Contador SAFTW1", ""));
         httpContext.setWebReturnParms(new Object[] {AV7EmprCod,Integer.valueOf(AV6DevCruId),localUtil.format( AV5DevCruDtSys, "99/99/99 99:99"),localUtil.format( AV8DevCruSal, "99/99/99 99:99"),AV17Hash});
         httpContext.setWebReturnParmsMetadata(new Object[] {"AV7EmprCod","AV6DevCruId","AV5DevCruDtSys","AV8DevCruSal","AV17Hash"});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      GXt_char1 = AV10UserAT ;
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "USEAT3", "") ;
      GXv_char4[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
      preparoxmldevolucionesenvioat_impl.this.AV7EmprCod = GXv_char2[0] ;
      preparoxmldevolucionesenvioat_impl.this.GXt_char1 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      AV10UserAT = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10UserAT", AV10UserAT);
      GXt_char1 = AV11PassAT ;
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "PASAT3", "") ;
      GXv_char2[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      preparoxmldevolucionesenvioat_impl.this.AV7EmprCod = GXv_char4[0] ;
      preparoxmldevolucionesenvioat_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      AV11PassAT = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11PassAT", AV11PassAT);
      AV12Vurl = httpContext.getMessage( "urlt", "") ;
      GXt_char1 = AV12Vurl ;
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "URL", "") ;
      GXv_char2[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      preparoxmldevolucionesenvioat_impl.this.AV7EmprCod = GXv_char4[0] ;
      preparoxmldevolucionesenvioat_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      AV12Vurl = GXt_char1 ;
      GXt_char1 = AV13Vpfx ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "PFX", ""), GXv_char4) ;
      preparoxmldevolucionesenvioat_impl.this.GXt_char1 = GXv_char4[0] ;
      AV13Vpfx = GXt_char1 ;
      GXt_char1 = AV14Vpasspfx ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "PASPFX", ""), GXv_char4) ;
      preparoxmldevolucionesenvioat_impl.this.GXt_char1 = GXv_char4[0] ;
      AV14Vpasspfx = GXt_char1 ;
      GXt_int5 = AV15VerCom ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "APISEN", ""), GXv_int6) ;
      preparoxmldevolucionesenvioat_impl.this.GXt_int5 = GXv_int6[0] ;
      AV15VerCom = GXt_int5 ;
      /* Using cursor H017J2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A395EmprCif = H017J2_A395EmprCif[0] ;
         n395EmprCif = H017J2_n395EmprCif[0] ;
         AV16EmprCif = A395EmprCif ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      GXt_char1 = AV28Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      preparoxmldevolucionesenvioat_impl.this.GXt_char1 = GXv_char4[0] ;
      AV28Station = GXt_char1 ;
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = AV29EmprNom ;
      GXv_char2[0] = AV30UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV28Station, GXv_char4, GXv_char3, GXv_char2) ;
      preparoxmldevolucionesenvioat_impl.this.AV7EmprCod = GXv_char4[0] ;
      preparoxmldevolucionesenvioat_impl.this.AV29EmprNom = GXv_char3[0] ;
      preparoxmldevolucionesenvioat_impl.this.AV30UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      GXv_char4[0] = AV38contidsernew ;
      new app.trabajosexternos.obtengocodigoserieat(remoteHandle, context).execute( AV7EmprCod, "022400", GXv_char4) ;
      preparoxmldevolucionesenvioat_impl.this.AV38contidsernew = GXv_char4[0] ;
      AV39SerieAT = ((GXutil.strcmp("", AV38contidsernew)==0) ? "GD6" : AV38contidsernew) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39SerieAT", AV39SerieAT);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSERIEAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39SerieAT, ""))));
      GXv_date7[0] = AV40DevCruFec ;
      new app.almacensindetalle.devoluciontejido_obtengofecha(remoteHandle, context).execute( AV7EmprCod, AV6DevCruId, GXv_date7) ;
      preparoxmldevolucionesenvioat_impl.this.AV40DevCruFec = GXv_date7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40DevCruFec", localUtil.format(AV40DevCruFec, "99/99/99"));
   }

   public void e1217J2( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {AV7EmprCod,Integer.valueOf(AV6DevCruId),localUtil.format( AV5DevCruDtSys, "99/99/99 99:99"),localUtil.format( AV8DevCruSal, "99/99/99 99:99"),AV17Hash});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV7EmprCod","AV6DevCruId","AV5DevCruDtSys","AV8DevCruSal","AV17Hash"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e1317J2 ();
      if (returnInSub) return;
   }

   public void e1317J2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      GXv_char4[0] = AV42msg_control ;
      new app.devoluciontejido_ctrlhashanterior_2(remoteHandle, context).execute( AV7EmprCod, AV6DevCruId, GXv_char4) ;
      preparoxmldevolucionesenvioat_impl.this.AV42msg_control = GXv_char4[0] ;
      if ( ! (GXutil.strcmp("", AV42msg_control)==0) )
      {
         httpContext.GX_msglist.addItem(AV42msg_control);
      }
      else
      {
         GXv_char4[0] = AV7EmprCod ;
         GXv_int8[0] = AV6DevCruId ;
         GXv_date7[0] = AV40DevCruFec ;
         GXv_dtime9[0] = AV5DevCruDtSys ;
         GXv_int6[0] = (byte)(3) ;
         GXv_int10[0] = (byte)(1) ;
         GXv_char3[0] = AV41Cadena ;
         new app.almacensindetalle.obtengocadenaparahashdevolucionalmacen(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_date7, GXv_dtime9, GXv_int6, GXv_int10, GXv_char3) ;
         preparoxmldevolucionesenvioat_impl.this.AV7EmprCod = GXv_char4[0] ;
         preparoxmldevolucionesenvioat_impl.this.AV6DevCruId = GXv_int8[0] ;
         preparoxmldevolucionesenvioat_impl.this.AV40DevCruFec = GXv_date7[0] ;
         preparoxmldevolucionesenvioat_impl.this.AV5DevCruDtSys = GXv_dtime9[0] ;
         preparoxmldevolucionesenvioat_impl.this.AV41Cadena = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV6DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6DevCruId), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV40DevCruFec", localUtil.format(AV40DevCruFec, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV5DevCruDtSys", localUtil.ttoc( AV5DevCruDtSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GXv_char4[0] = AV17Hash ;
         GXv_objcol_SdtMessages_Message11[0] = AV25Messages ;
         GXv_boolean12[0] = AV26OK ;
         new app.hash_obtener(remoteHandle, context).execute( AV41Cadena, GXv_char4, GXv_objcol_SdtMessages_Message11, GXv_boolean12) ;
         preparoxmldevolucionesenvioat_impl.this.AV17Hash = GXv_char4[0] ;
         AV25Messages = GXv_objcol_SdtMessages_Message11[0] ;
         preparoxmldevolucionesenvioat_impl.this.AV26OK = GXv_boolean12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Hash", AV17Hash);
         if ( ! AV26OK )
         {
            AV48GXV1 = 1 ;
            while ( AV48GXV1 <= AV25Messages.size() )
            {
               AV27Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV25Messages.elementAt(-1+AV48GXV1));
               httpContext.GX_msglist.addItem(AV27Message.getgxTv_SdtMessages_Message_Description());
               AV48GXV1 = (int)(AV48GXV1+1) ;
            }
         }
         else
         {
            /* Execute user subroutine: 'DEVCRU' */
            S112 ();
            if (returnInSub) return;
            if ( (0==AV19Lineas) )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "NO tiene Lineas ¡¡¡¡", ""));
            }
            else
            {
               if ( GXutil.strcmp(AV9Dir, "") == 0 )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Path ¡¡¡¡.Revisar Contador SAFTW1", ""));
               }
               else
               {
                  if ( (0==AV18devcru) )
                  {
                     httpContext.GX_msglist.addItem(httpContext.getMessage( "Nao Existe Documento¡¡¡", ""));
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(httpContext.getMessage( "Hash creado correctamente", ""));
                     GXv_char4[0] = AV7EmprCod ;
                     GXv_int8[0] = AV6DevCruId ;
                     GXv_char3[0] = AV41Cadena ;
                     GXv_char2[0] = AV17Hash ;
                     new app.almacensindetalle.actualizohashdevolucionalmacen(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2) ;
                     preparoxmldevolucionesenvioat_impl.this.AV7EmprCod = GXv_char4[0] ;
                     preparoxmldevolucionesenvioat_impl.this.AV6DevCruId = GXv_int8[0] ;
                     preparoxmldevolucionesenvioat_impl.this.AV41Cadena = GXv_char3[0] ;
                     preparoxmldevolucionesenvioat_impl.this.AV17Hash = GXv_char2[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
                     httpContext.ajax_rsp_assign_attri("", false, "AV6DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6DevCruId), 8, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "AV17Hash", AV17Hash);
                     if ( (GXutil.strcmp("", AV17Hash)==0) )
                     {
                        Gx_msg = httpContext.getMessage( "Atenção O código HASH está faltando.", "") + GXutil.newLine( ) ;
                        Gx_msg += httpContext.getMessage( "É necessário criar o HASH para o documento.", "") + GXutil.newLine( ) ;
                        httpContext.GX_msglist.addItem(Gx_msg);
                     }
                     else
                     {
                        AV35Fichero = GXutil.trim( AV39SerieAT) + GXutil.padl( GXutil.trim( GXutil.str( AV6DevCruId, 8, 0)), (short)(8), "0") ;
                        AV24File.setSource( GXutil.trim( AV9Dir)+"\\"+GXutil.trim( AV35Fichero)+httpContext.getMessage( ".xml", "") );
                        AV36Path = GXutil.trim( AV9Dir) ;
                        GXv_char4[0] = AV7EmprCod ;
                        GXv_int8[0] = AV6DevCruId ;
                        GXv_char3[0] = AV36Path ;
                        GXv_char2[0] = AV35Fichero ;
                        GXv_objcol_SdtMessages_Message11[0] = AV25Messages ;
                        GXv_boolean12[0] = AV26OK ;
                        new app.almacensindetalle.pdcxml(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2, GXv_objcol_SdtMessages_Message11, GXv_boolean12) ;
                        preparoxmldevolucionesenvioat_impl.this.AV7EmprCod = GXv_char4[0] ;
                        preparoxmldevolucionesenvioat_impl.this.AV6DevCruId = GXv_int8[0] ;
                        preparoxmldevolucionesenvioat_impl.this.AV36Path = GXv_char3[0] ;
                        preparoxmldevolucionesenvioat_impl.this.AV35Fichero = GXv_char2[0] ;
                        AV25Messages = GXv_objcol_SdtMessages_Message11[0] ;
                        preparoxmldevolucionesenvioat_impl.this.AV26OK = GXv_boolean12[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "AV6DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6DevCruId), 8, 0));
                        if ( ! AV26OK )
                        {
                           AV50GXV2 = 1 ;
                           while ( AV50GXV2 <= AV25Messages.size() )
                           {
                              AV27Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV25Messages.elementAt(-1+AV50GXV2));
                              httpContext.GX_msglist.addItem(AV27Message.getgxTv_SdtMessages_Message_Description());
                              AV50GXV2 = (int)(AV50GXV2+1) ;
                           }
                        }
                        else
                        {
                           GXv_objcol_SdtMessages_Message11[0] = AV25Messages ;
                           GXv_boolean12[0] = AV26OK ;
                           new app.at_comunicar(remoteHandle, context).execute( AV7EmprCod, AV35Fichero, AV10UserAT, AV11PassAT, GXv_objcol_SdtMessages_Message11, GXv_boolean12) ;
                           AV25Messages = GXv_objcol_SdtMessages_Message11[0] ;
                           preparoxmldevolucionesenvioat_impl.this.AV26OK = GXv_boolean12[0] ;
                           AV33Messages_tojson = AV25Messages.toJSonString(false) ;
                           AV34FileR = GXutil.trim( AV39SerieAT) + GXutil.padl( GXutil.trim( GXutil.str( AV31AlbProID, 8, 0)), (short)(8), "0") ;
                           AV24File.setSource( GXutil.trim( AV9Dir)+"\\"+GXutil.trim( AV34FileR)+httpContext.getMessage( "result", "")+httpContext.getMessage( ".xml", "") );
                           AV32Var_File = AV24File.getAbsoluteName() ;
                           if ( AV26OK )
                           {
                              GXv_char4[0] = AV7EmprCod ;
                              GXv_char3[0] = AV35Fichero ;
                              GXv_int8[0] = AV6DevCruId ;
                              GXv_objcol_SdtMessages_Message11[0] = AV25Messages ;
                              GXv_boolean12[0] = AV26OK ;
                              new app.almacensindetalle.devoluciontejido_result(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int8, GXv_objcol_SdtMessages_Message11, GXv_boolean12) ;
                              preparoxmldevolucionesenvioat_impl.this.AV7EmprCod = GXv_char4[0] ;
                              preparoxmldevolucionesenvioat_impl.this.AV35Fichero = GXv_char3[0] ;
                              preparoxmldevolucionesenvioat_impl.this.AV6DevCruId = GXv_int8[0] ;
                              AV25Messages = GXv_objcol_SdtMessages_Message11[0] ;
                              preparoxmldevolucionesenvioat_impl.this.AV26OK = GXv_boolean12[0] ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
                              httpContext.ajax_rsp_assign_attri("", false, "AV6DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6DevCruId), 8, 0));
                              AV33Messages_tojson = AV25Messages.toJSonString(false) ;
                              httpContext.popup(formatLink("app.almacensindetalle.devoluciontejido_6", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV35Fichero)),GXutil.URLEncode(GXutil.ltrimstr(AV6DevCruId,8,0)),GXutil.URLEncode(GXutil.rtrim(AV33Messages_tojson)),GXutil.URLEncode(GXutil.booltostr(AV26OK))}, new String[] {"Emprcod","Fichero","DevCruId","Messages_tojson","Ok"}) , new Object[] {});
                              if ( ! AV26OK )
                              {
                                 httpContext.popup(formatLink("app.almacensindetalle.imprimirdevolucion", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6DevCruId,8,0))}, new String[] {"Emprcod","DevCruId"}) , new Object[] {"AV7EmprCod","AV6DevCruId"});
                                 httpContext.setWebReturnParms(new Object[] {AV7EmprCod,Integer.valueOf(AV6DevCruId),localUtil.format( AV5DevCruDtSys, "99/99/99 99:99"),localUtil.format( AV8DevCruSal, "99/99/99 99:99"),AV17Hash});
                                 httpContext.setWebReturnParmsMetadata(new Object[] {"AV7EmprCod","AV6DevCruId","AV5DevCruDtSys","AV8DevCruSal","AV17Hash"});
                                 httpContext.wjLocDisableFrm = (byte)(1) ;
                                 httpContext.nUserReturn = (byte)(1) ;
                                 returnInSub = true;
                                 if (true) return;
                              }
                              else
                              {
                                 httpContext.popup(formatLink("app.almacensindetalle.imprimirdevolucion", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6DevCruId,8,0))}, new String[] {"Emprcod","DevCruId"}) , new Object[] {"AV7EmprCod","AV6DevCruId"});
                                 httpContext.setWebReturnParms(new Object[] {AV7EmprCod,Integer.valueOf(AV6DevCruId),localUtil.format( AV5DevCruDtSys, "99/99/99 99:99"),localUtil.format( AV8DevCruSal, "99/99/99 99:99"),AV17Hash});
                                 httpContext.setWebReturnParmsMetadata(new Object[] {"AV7EmprCod","AV6DevCruId","AV5DevCruDtSys","AV8DevCruSal","AV17Hash"});
                                 httpContext.wjLocDisableFrm = (byte)(1) ;
                                 httpContext.nUserReturn = (byte)(1) ;
                                 returnInSub = true;
                                 if (true) return;
                              }
                           }
                           else
                           {
                              AV51GXV3 = 1 ;
                              while ( AV51GXV3 <= AV25Messages.size() )
                              {
                                 AV27Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV25Messages.elementAt(-1+AV51GXV3));
                                 AV37Var_mensaje = AV27Message.getgxTv_SdtMessages_Message_Id() + GXutil.newLine( ) ;
                                 AV37Var_mensaje += AV27Message.getgxTv_SdtMessages_Message_Description() + GXutil.newLine( ) ;
                                 httpContext.GX_msglist.addItem(AV37Var_mensaje);
                                 AV51GXV3 = (int)(AV51GXV3+1) ;
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
      /* Using cursor H017J3 */
      pr_default.execute(1, new Object[] {AV7EmprCod, Integer.valueOf(AV6DevCruId)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A11669DevCruId = H017J3_A11669DevCruId[0] ;
         A396EmprCod = H017J3_A396EmprCod[0] ;
         A11670DevCruFec = H017J3_A11670DevCruFec[0] ;
         A11680DevCruAtId = H017J3_A11680DevCruAtId[0] ;
         A11674DevCruHash = H017J3_A11674DevCruHash[0] ;
         AV21AlbProfch = A11670DevCruFec ;
         AV22ALbLic = A11680DevCruAtId ;
         AV18devcru = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18devcru", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18devcru), 4, 0));
         AV23AlbCOmcod = A11669DevCruId ;
         AV20Albfmd = A11674DevCruHash ;
         AV19Lineas = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Lineas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Lineas), 4, 0));
         /* Optimized group. */
         /* Using cursor H017J4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
         cV19Lineas = H017J4_AV19Lineas[0] ;
         pr_default.close(2);
         AV19Lineas = (short)(AV19Lineas+cV19Lineas*1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Lineas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Lineas), 4, 0));
         /* End optimized group. */
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   protected void nextLoad( )
   {
   }

   protected void e1417J2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV7EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      AV6DevCruId = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6DevCruId), 8, 0));
      AV5DevCruDtSys = (java.util.Date)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5DevCruDtSys", localUtil.ttoc( AV5DevCruDtSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV8DevCruSal = (java.util.Date)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8DevCruSal", localUtil.ttoc( AV8DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV17Hash = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Hash", AV17Hash);
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
      pa17J2( ) ;
      ws17J2( ) ;
      we17J2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241513688", true, true);
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
      httpContext.AddJavascriptSource("almacensindetalle/preparoxmldevolucionesenvioat.js", "?20268241513688", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavDir_Internalname = "vDIR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtavUserat_Internalname = "vUSERAT" ;
      edtavPassat_Internalname = "vPASSAT" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavDevcruid_Internalname = "vDEVCRUID" ;
      edtavDevcrufec_Internalname = "vDEVCRUFEC" ;
      edtavDevcrusal_Internalname = "vDEVCRUSAL" ;
      edtavDevcrudtsys_Internalname = "vDEVCRUDTSYS" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
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
      edtavDevcrudtsys_Jsonclick = "" ;
      edtavDevcrudtsys_Enabled = 0 ;
      edtavDevcrusal_Jsonclick = "" ;
      edtavDevcrusal_Enabled = 0 ;
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
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Informacion Envio Web Service AT", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Preparo XML Devoluciones Envio AT", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV39SerieAT',fld:'vSERIEAT',pic:'',hsh:true},{av:'AV31AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9',hsh:true},{av:'AV9Dir',fld:'vDIR',pic:''},{av:'AV10UserAT',fld:'vUSERAT',pic:''},{av:'AV11PassAT',fld:'vPASSAT',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1217J2',iparms:[{av:'AV17Hash',fld:'vHASH',pic:''},{av:'AV8DevCruSal',fld:'vDEVCRUSAL',pic:'99/99/99 99:99'},{av:'AV5DevCruDtSys',fld:'vDEVCRUDTSYS',pic:'99/99/99 99:99'},{av:'AV6DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("ENTER","{handler:'e1317J2',iparms:[{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV40DevCruFec',fld:'vDEVCRUFEC',pic:''},{av:'AV5DevCruDtSys',fld:'vDEVCRUDTSYS',pic:'99/99/99 99:99'},{av:'AV19Lineas',fld:'vLINEAS',pic:'ZZZ9'},{av:'AV9Dir',fld:'vDIR',pic:''},{av:'AV18devcru',fld:'vDEVCRU',pic:'ZZZ9'},{av:'AV39SerieAT',fld:'vSERIEAT',pic:'',hsh:true},{av:'AV10UserAT',fld:'vUSERAT',pic:''},{av:'AV11PassAT',fld:'vPASSAT',pic:''},{av:'AV31AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9',hsh:true},{av:'AV8DevCruSal',fld:'vDEVCRUSAL',pic:'99/99/99 99:99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9'},{av:'A11670DevCruFec',fld:'DEVCRUFEC',pic:''},{av:'A11680DevCruAtId',fld:'DEVCRUATID',pic:''},{av:'A11674DevCruHash',fld:'DEVCRUHASH',pic:''},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV5DevCruDtSys',fld:'vDEVCRUDTSYS',pic:'99/99/99 99:99'},{av:'AV40DevCruFec',fld:'vDEVCRUFEC',pic:''},{av:'AV6DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV17Hash',fld:'vHASH',pic:''},{av:'AV18devcru',fld:'vDEVCRU',pic:'ZZZ9'},{av:'AV19Lineas',fld:'vLINEAS',pic:'ZZZ9'}]}");
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
      wcpOAV7EmprCod = "" ;
      wcpOAV5DevCruDtSys = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV8DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV17Hash = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV7EmprCod = "" ;
      AV5DevCruDtSys = GXutil.resetTime( GXutil.nullDate() );
      AV8DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      AV17Hash = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV39SerieAT = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV9Dir = "" ;
      AV10UserAT = "" ;
      AV11PassAT = "" ;
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
      AV40DevCruFec = GXutil.nullDate() ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      AV46Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      hsh = "" ;
      AV12Vurl = "" ;
      AV13Vpfx = "" ;
      AV14Vpasspfx = "" ;
      scmdbuf = "" ;
      H017J2_A396EmprCod = new String[] {""} ;
      H017J2_A395EmprCif = new String[] {""} ;
      H017J2_n395EmprCif = new boolean[] {false} ;
      A395EmprCif = "" ;
      AV16EmprCif = "" ;
      AV28Station = "" ;
      GXt_char1 = "" ;
      AV29EmprNom = "" ;
      AV30UsurCod = "" ;
      AV38contidsernew = "" ;
      AV42msg_control = "" ;
      GXv_date7 = new java.util.Date[1] ;
      GXv_dtime9 = new java.util.Date[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int10 = new byte[1] ;
      AV41Cadena = "" ;
      AV25Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV27Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      Gx_msg = "" ;
      AV35Fichero = "" ;
      AV24File = new com.genexus.util.GXFile();
      AV36Path = "" ;
      GXv_char2 = new String[1] ;
      AV33Messages_tojson = "" ;
      AV34FileR = "" ;
      AV32Var_File = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_objcol_SdtMessages_Message11 = new GXBaseCollection[1] ;
      GXv_boolean12 = new boolean[1] ;
      AV37Var_mensaje = "" ;
      H017J3_A11669DevCruId = new int[1] ;
      H017J3_A396EmprCod = new String[] {""} ;
      H017J3_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      H017J3_A11680DevCruAtId = new String[] {""} ;
      H017J3_A11674DevCruHash = new String[] {""} ;
      AV21AlbProfch = GXutil.nullDate() ;
      AV22ALbLic = "" ;
      AV20Albfmd = "" ;
      H017J4_AV19Lineas = new short[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.preparoxmldevolucionesenvioat__default(),
         new Object[] {
             new Object[] {
            H017J2_A396EmprCod, H017J2_A395EmprCif, H017J2_n395EmprCif
            }
            , new Object[] {
            H017J3_A11669DevCruId, H017J3_A396EmprCod, H017J3_A11670DevCruFec, H017J3_A11680DevCruAtId, H017J3_A11674DevCruHash
            }
            , new Object[] {
            H017J4_AV19Lineas
            }
         }
      );
      AV46Pgmname = "AlmacenSinDetalle.PreparoXMLDevolucionesEnvioAT" ;
      /* GeneXus formulas. */
      AV46Pgmname = "AlmacenSinDetalle.PreparoXMLDevolucionesEnvioAT" ;
      Gx_err = (short)(0) ;
      edtavDir_Enabled = 0 ;
      edtavUserat_Enabled = 0 ;
      edtavPassat_Enabled = 0 ;
      edtavDevcruid_Enabled = 0 ;
      edtavDevcrufec_Enabled = 0 ;
      edtavDevcrusal_Enabled = 0 ;
      edtavDevcrudtsys_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte AV15VerCom ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte GXv_int10[] ;
   private byte nGXWrapped ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV19Lineas ;
   private short AV18devcru ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short cV19Lineas ;
   private int wcpOAV6DevCruId ;
   private int AV6DevCruId ;
   private int AV31AlbProID ;
   private int A11669DevCruId ;
   private int A44AlbRecCod ;
   private int edtavDir_Enabled ;
   private int edtavUserat_Enabled ;
   private int edtavPassat_Enabled ;
   private int edtavDevcruid_Enabled ;
   private int edtavDevcrufec_Enabled ;
   private int edtavDevcrusal_Enabled ;
   private int edtavDevcrudtsys_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV48GXV1 ;
   private int AV50GXV2 ;
   private int GXv_int8[] ;
   private int AV51GXV3 ;
   private int AV23AlbCOmcod ;
   private int idxLst ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV17Hash ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV7EmprCod ;
   private String AV17Hash ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV39SerieAT ;
   private String GXKey ;
   private String AV9Dir ;
   private String AV10UserAT ;
   private String AV11PassAT ;
   private String A396EmprCod ;
   private String A11680DevCruAtId ;
   private String A11674DevCruHash ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavDir_Internalname ;
   private String TempTags ;
   private String edtavDir_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtavUserat_Internalname ;
   private String edtavUserat_Jsonclick ;
   private String edtavPassat_Internalname ;
   private String edtavPassat_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtavDevcruid_Internalname ;
   private String edtavDevcruid_Jsonclick ;
   private String edtavDevcrufec_Internalname ;
   private String edtavDevcrufec_Jsonclick ;
   private String edtavDevcrusal_Internalname ;
   private String edtavDevcrusal_Jsonclick ;
   private String edtavDevcrudtsys_Internalname ;
   private String edtavDevcrudtsys_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV46Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String hsh ;
   private String AV12Vurl ;
   private String AV13Vpfx ;
   private String AV14Vpasspfx ;
   private String scmdbuf ;
   private String A395EmprCif ;
   private String AV16EmprCif ;
   private String AV28Station ;
   private String GXt_char1 ;
   private String AV29EmprNom ;
   private String AV30UsurCod ;
   private String AV38contidsernew ;
   private String Gx_msg ;
   private String AV35Fichero ;
   private String GXv_char2[] ;
   private String AV34FileR ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String AV22ALbLic ;
   private java.util.Date wcpOAV5DevCruDtSys ;
   private java.util.Date wcpOAV8DevCruSal ;
   private java.util.Date AV5DevCruDtSys ;
   private java.util.Date AV8DevCruSal ;
   private java.util.Date GXv_dtime9[] ;
   private java.util.Date A11670DevCruFec ;
   private java.util.Date AV40DevCruFec ;
   private java.util.Date GXv_date7[] ;
   private java.util.Date AV21AlbProfch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n395EmprCif ;
   private boolean AV26OK ;
   private boolean GXv_boolean12[] ;
   private String AV42msg_control ;
   private String AV41Cadena ;
   private String AV36Path ;
   private String AV33Messages_tojson ;
   private String AV32Var_File ;
   private String AV37Var_mensaje ;
   private String AV20Albfmd ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXFile AV24File ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H017J2_A396EmprCod ;
   private String[] H017J2_A395EmprCif ;
   private boolean[] H017J2_n395EmprCif ;
   private int[] H017J3_A11669DevCruId ;
   private String[] H017J3_A396EmprCod ;
   private java.util.Date[] H017J3_A11670DevCruFec ;
   private String[] H017J3_A11680DevCruAtId ;
   private String[] H017J3_A11674DevCruHash ;
   private short[] H017J4_AV19Lineas ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV25Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message11[] ;
   private com.genexus.SdtMessages_Message AV27Message ;
}

final  class preparoxmldevolucionesenvioat__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H017J2", "SELECT EmprCod, EmprCif FROM TXPEMPRES ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H017J3", "SELECT DevCruId, EmprCod, DevCruFec, DevCruAtId, DevCruHash FROM TXPDEVCRU WHERE EmprCod = ? and DevCruId = ? ORDER BY EmprCod, DevCruId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H017J4", "SELECT COUNT(*) FROM TXPDEVCR1 WHERE EmprCod = ? and DevCruId = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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

