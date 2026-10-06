package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class documentotransporteproduccion_fecha_hora_salida_hash_impl extends GXDataArea
{
   public documentotransporteproduccion_fecha_hora_salida_hash_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public documentotransporteproduccion_fecha_hora_salida_hash_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransporteproduccion_fecha_hora_salida_hash_impl.class ));
   }

   public documentotransporteproduccion_fecha_hora_salida_hash_impl( int remoteHandle ,
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
            AV11EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV48AlbProcod = GXutil.lval( httpContext.GetPar( "AlbProcod")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV48AlbProcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48AlbProcod), 10, 0));
               AV56AlbHhfm = localUtil.parseDTimeParm( httpContext.GetPar( "AlbHhfm")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV56AlbHhfm", localUtil.ttoc( AV56AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV6AlbProSal = localUtil.parseDTimeParm( httpContext.GetPar( "AlbProSal")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6AlbProSal", localUtil.ttoc( AV6AlbProSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV47ALbProPri = httpContext.GetPar( "ALbProPri") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV47ALbProPri", AV47ALbProPri);
               AV36Cadena = httpContext.GetPar( "Cadena") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV36Cadena", AV36Cadena);
               AV37Hash = httpContext.GetPar( "Hash") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV37Hash", AV37Hash);
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
      pa2A52( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2A52( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.documentotransporteproduccion.documentotransporteproduccion_fecha_hora_salida_hash", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV48AlbProcod,10,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV56AlbHhfm)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV6AlbProSal)),GXutil.URLEncode(GXutil.rtrim(AV47ALbProPri)),GXutil.URLEncode(GXutil.rtrim(AV36Cadena)),GXutil.URLEncode(GXutil.rtrim(AV37Hash))}, new String[] {"EmprCod","AlbProcod","AlbHhfm","AlbProSal","ALbProPri","Cadena","Hash"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoTransporteProduccion_Fecha_Hora_Salida_Hash");
      forbiddenHiddens.add("Dir", GXutil.rtrim( localUtil.format( AV9Dir, "")));
      forbiddenHiddens.add("UserAT", GXutil.rtrim( localUtil.format( AV15UserAT, "")));
      forbiddenHiddens.add("PassAT", GXutil.rtrim( localUtil.format( AV14PassAT, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("documentotransporteproduccion\\documentotransporteproduccion_fecha_hora_salida_hash:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vHASH", GXutil.rtrim( AV37Hash));
      app.GxWebStd.gx_hidden_field( httpContext, "vCADENA", GXutil.rtrim( AV36Cadena));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROPRI", GXutil.rtrim( AV47ALbProPri));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBHHFM", localUtil.ttoc( AV56AlbHhfm, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV11EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vLINEAS", GXutil.ltrim( localUtil.ntoc( AV27Lineas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCALPRD", GXutil.ltrim( localUtil.ntoc( AV49Calprd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBMARCA", GXutil.rtrim( AV59albmarca));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROCOD", GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROFCH", localUtil.dtoc( A34AlbProfch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBLIC", GXutil.rtrim( A7101AlbLic));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBFMD", A10017AlbFmd);
      app.GxWebStd.gx_hidden_field( httpContext, "ALBMARCA", GXutil.rtrim( A5140AlbMarca));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBKGME", GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Width", GXutil.rtrim( Dvpanel_unnamedtable4_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable4_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable4_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Cls", GXutil.rtrim( Dvpanel_unnamedtable4_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Title", GXutil.rtrim( Dvpanel_unnamedtable4_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable4_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable4_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable4_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable4_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable4_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Width", GXutil.rtrim( Dvpanel_panel_filtros_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Autowidth", GXutil.booltostr( Dvpanel_panel_filtros_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Autoheight", GXutil.booltostr( Dvpanel_panel_filtros_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Cls", GXutil.rtrim( Dvpanel_panel_filtros_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Title", GXutil.rtrim( Dvpanel_panel_filtros_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Collapsible", GXutil.booltostr( Dvpanel_panel_filtros_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Collapsed", GXutil.booltostr( Dvpanel_panel_filtros_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Showcollapseicon", GXutil.booltostr( Dvpanel_panel_filtros_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Iconposition", GXutil.rtrim( Dvpanel_panel_filtros_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Autoscroll", GXutil.booltostr( Dvpanel_panel_filtros_Autoscroll));
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
         we2A52( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2A52( ) ;
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
      return formatLink("app.documentotransporteproduccion.documentotransporteproduccion_fecha_hora_salida_hash", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV48AlbProcod,10,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV56AlbHhfm)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV6AlbProSal)),GXutil.URLEncode(GXutil.rtrim(AV47ALbProPri)),GXutil.URLEncode(GXutil.rtrim(AV36Cadena)),GXutil.URLEncode(GXutil.rtrim(AV37Hash))}, new String[] {"EmprCod","AlbProcod","AlbHhfm","AlbProSal","ALbProPri","Cadena","Hash"})  ;
   }

   public String getPgmname( )
   {
      return "DocumentoTransporteProduccion.DocumentoTransporteProduccion_Fecha_Hora_Salida_Hash" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Preparo XML AT Documentode Transporte Produccion", "") ;
   }

   public void wb2A50( )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFechahorasalida_Internalname, localUtil.ttoc( AV52FechaHoraSalida, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV52FechaHoraSalida, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFechahorasalida_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFechahorasalida_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentoTransporteProduccion_Fecha_Hora_Salida_Hash.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFechahorasalida_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFechahorasalida_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoTransporteProduccion\\DocumentoTransporteProduccion_Fecha_Hora_Salida_Hash.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDiahact_Internalname, localUtil.ttoc( AV53DiaHact, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV53DiaHact, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDiahact_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDiahact_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentoTransporteProduccion_Fecha_Hora_Salida_Hash.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDiahact_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavDiahact_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoTransporteProduccion\\DocumentoTransporteProduccion_Fecha_Hora_Salida_Hash.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDiasalida_Internalname, localUtil.format(AV54diasalida, "99/99/99"), localUtil.format( AV54diasalida, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDiasalida_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDiasalida_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentoTransporteProduccion_Fecha_Hora_Salida_Hash.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDiasalida_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavDiasalida_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoTransporteProduccion\\DocumentoTransporteProduccion_Fecha_Hora_Salida_Hash.htm");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmessage_Internalname, lblTbmessage_Caption, "", "", lblTbmessage_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_DocumentoTransporteProduccion\\DocumentoTransporteProduccion_Fecha_Hora_Salida_Hash.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panel_filtros.setProperty("Width", Dvpanel_panel_filtros_Width);
         ucDvpanel_panel_filtros.setProperty("AutoWidth", Dvpanel_panel_filtros_Autowidth);
         ucDvpanel_panel_filtros.setProperty("AutoHeight", Dvpanel_panel_filtros_Autoheight);
         ucDvpanel_panel_filtros.setProperty("Cls", Dvpanel_panel_filtros_Cls);
         ucDvpanel_panel_filtros.setProperty("Title", Dvpanel_panel_filtros_Title);
         ucDvpanel_panel_filtros.setProperty("Collapsible", Dvpanel_panel_filtros_Collapsible);
         ucDvpanel_panel_filtros.setProperty("Collapsed", Dvpanel_panel_filtros_Collapsed);
         ucDvpanel_panel_filtros.setProperty("ShowCollapseIcon", Dvpanel_panel_filtros_Showcollapseicon);
         ucDvpanel_panel_filtros.setProperty("IconPosition", Dvpanel_panel_filtros_Iconposition);
         ucDvpanel_panel_filtros.setProperty("AutoScroll", Dvpanel_panel_filtros_Autoscroll);
         ucDvpanel_panel_filtros.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel_filtros_Internalname, "DVPANEL_PANEL_FILTROSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANEL_FILTROSContainer"+"Panel_Filtros"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel_filtros_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable4.setProperty("Width", Dvpanel_unnamedtable4_Width);
         ucDvpanel_unnamedtable4.setProperty("AutoWidth", Dvpanel_unnamedtable4_Autowidth);
         ucDvpanel_unnamedtable4.setProperty("AutoHeight", Dvpanel_unnamedtable4_Autoheight);
         ucDvpanel_unnamedtable4.setProperty("Cls", Dvpanel_unnamedtable4_Cls);
         ucDvpanel_unnamedtable4.setProperty("Title", Dvpanel_unnamedtable4_Title);
         ucDvpanel_unnamedtable4.setProperty("Collapsible", Dvpanel_unnamedtable4_Collapsible);
         ucDvpanel_unnamedtable4.setProperty("Collapsed", Dvpanel_unnamedtable4_Collapsed);
         ucDvpanel_unnamedtable4.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable4_Showcollapseicon);
         ucDvpanel_unnamedtable4.setProperty("IconPosition", Dvpanel_unnamedtable4_Iconposition);
         ucDvpanel_unnamedtable4.setProperty("AutoScroll", Dvpanel_unnamedtable4_Autoscroll);
         ucDvpanel_unnamedtable4.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable4_Internalname, "DVPANEL_UNNAMEDTABLE4Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE4Container"+"UnnamedTable4"+"\" style=\"display:none;\">") ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDir_Internalname, GXutil.rtrim( AV9Dir), GXutil.rtrim( localUtil.format( AV9Dir, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDir_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDir_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentoTransporteProduccion_Fecha_Hora_Salida_Hash.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUserat_Internalname, GXutil.rtrim( AV15UserAT), GXutil.rtrim( localUtil.format( AV15UserAT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUserat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavUserat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentoTransporteProduccion_Fecha_Hora_Salida_Hash.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPassat_Internalname, GXutil.rtrim( AV14PassAT), GXutil.rtrim( localUtil.format( AV14PassAT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPassat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPassat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(-1), (short)(0), 0, (byte)(0), (byte)(0), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentoTransporteProduccion_Fecha_Hora_Salida_Hash.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprocod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprocod_Internalname, httpContext.getMessage( "Nº Guia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprocod_Internalname, GXutil.ltrim( localUtil.ntoc( AV48AlbProcod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbprocod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV48AlbProcod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV48AlbProcod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprocod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprocod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentoTransporteProduccion_Fecha_Hora_Salida_Hash.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprofch_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprofch_Internalname, httpContext.getMessage( "Data Guia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbprofch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprofch_Internalname, localUtil.format(AV22AlbProfch, "99/99/99"), localUtil.format( AV22AlbProfch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprofch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprofch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentoTransporteProduccion_Fecha_Hora_Salida_Hash.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbprofch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbprofch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoTransporteProduccion\\DocumentoTransporteProduccion_Fecha_Hora_Salida_Hash.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprosal_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprosal_Internalname, httpContext.getMessage( "Data Hora-Salida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavAlbprosal_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprosal_Internalname, localUtil.ttoc( AV6AlbProSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV6AlbProSal, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprosal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprosal_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentoTransporteProduccion_Fecha_Hora_Salida_Hash.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbprosal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbprosal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoTransporteProduccion\\DocumentoTransporteProduccion_Fecha_Hora_Salida_Hash.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprosys_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprosys_Internalname, httpContext.getMessage( "Data System Hash", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbprosys_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprosys_Internalname, localUtil.ttoc( AV7AlbProSys, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV7AlbProSys, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,83);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprosys_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprosys_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentoTransporteProduccion_Fecha_Hora_Salida_Hash.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbprosys_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbprosys_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoTransporteProduccion\\DocumentoTransporteProduccion_Fecha_Hora_Salida_Hash.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbpdatcud_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbpdatcud_Internalname, httpContext.getMessage( "ATCUD", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbpdatcud_Internalname, GXutil.rtrim( AV62AlbPdATCUD), GXutil.rtrim( localUtil.format( AV62AlbPdATCUD, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbpdatcud_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbpdatcud_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentoTransporteProduccion_Fecha_Hora_Salida_Hash.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbpdserat_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbpdserat_Internalname, httpContext.getMessage( "Serie", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbpdserat_Internalname, GXutil.rtrim( AV61AlbPdSerAT), GXutil.rtrim( localUtil.format( AV61AlbPdSerAT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbpdserat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbpdserat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentoTransporteProduccion_Fecha_Hora_Salida_Hash.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbpdtipat_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbpdtipat_Internalname, httpContext.getMessage( "Tipo Doc.", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbpdtipat_Internalname, GXutil.rtrim( AV60AlbPdTipAT), GXutil.rtrim( localUtil.format( AV60AlbPdTipAT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbpdtipat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbpdtipat_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentoTransporteProduccion_Fecha_Hora_Salida_Hash.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentoTransporteProduccion_Fecha_Hora_Salida_Hash.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentoTransporteProduccion_Fecha_Hora_Salida_Hash.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnatcud_Internalname, "", httpContext.getMessage( "ATCUD", ""), bttBtnatcud_Jsonclick, 5, httpContext.getMessage( "ATCUD", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOATCUD\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentoTransporteProduccion_Fecha_Hora_Salida_Hash.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", divUnnamedtable3_Height, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV65Pgmname), GXutil.rtrim( localUtil.format( AV65Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentoTransporteProduccion_Fecha_Hora_Salida_Hash.htm");
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

   public void start2A52( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Preparo XML AT Documentode Transporte Produccion", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2A50( ) ;
   }

   public void ws2A52( )
   {
      start2A52( ) ;
      evt2A52( ) ;
   }

   public void evt2A52( )
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
                           e112A52 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e122A52 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOATCUD'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoATCUD' */
                           e132A52 ();
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
                                 e142A52 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e152A52 ();
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

   public void we2A52( )
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

   public void pa2A52( )
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
      rf2A52( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV65Pgmname = "DocumentoTransporteProduccion.DocumentoTransporteProduccion_Fecha_Hora_Salida_Hash" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65Pgmname", AV65Pgmname);
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
      edtavAlbprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprocod_Enabled), 5, 0), true);
      edtavAlbprofch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprofch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprofch_Enabled), 5, 0), true);
      edtavAlbprosal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprosal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprosal_Enabled), 5, 0), true);
      edtavAlbprosys_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprosys_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprosys_Enabled), 5, 0), true);
      edtavAlbpdatcud_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbpdatcud_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbpdatcud_Enabled), 5, 0), true);
      edtavAlbpdserat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbpdserat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbpdserat_Enabled), 5, 0), true);
      edtavAlbpdtipat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbpdtipat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbpdtipat_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2A52( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e152A52 ();
         wb2A50( ) ;
      }
   }

   public void send_integrity_lvl_hashes2A52( )
   {
   }

   public void before_start_formulas( )
   {
      AV65Pgmname = "DocumentoTransporteProduccion.DocumentoTransporteProduccion_Fecha_Hora_Salida_Hash" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65Pgmname", AV65Pgmname);
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
      edtavAlbprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprocod_Enabled), 5, 0), true);
      edtavAlbprofch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprofch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprofch_Enabled), 5, 0), true);
      edtavAlbprosal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprosal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprosal_Enabled), 5, 0), true);
      edtavAlbprosys_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprosys_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprosys_Enabled), 5, 0), true);
      edtavAlbpdatcud_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbpdatcud_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbpdatcud_Enabled), 5, 0), true);
      edtavAlbpdserat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbpdserat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbpdserat_Enabled), 5, 0), true);
      edtavAlbpdtipat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbpdtipat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbpdtipat_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2A50( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e112A52 ();
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
         Dvpanel_unnamedtable4_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Width") ;
         Dvpanel_unnamedtable4_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autowidth")) ;
         Dvpanel_unnamedtable4_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autoheight")) ;
         Dvpanel_unnamedtable4_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Cls") ;
         Dvpanel_unnamedtable4_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Title") ;
         Dvpanel_unnamedtable4_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Collapsible")) ;
         Dvpanel_unnamedtable4_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Collapsed")) ;
         Dvpanel_unnamedtable4_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Showcollapseicon")) ;
         Dvpanel_unnamedtable4_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Iconposition") ;
         Dvpanel_unnamedtable4_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autoscroll")) ;
         Dvpanel_panel_filtros_Width = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Width") ;
         Dvpanel_panel_filtros_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Autowidth")) ;
         Dvpanel_panel_filtros_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Autoheight")) ;
         Dvpanel_panel_filtros_Cls = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Cls") ;
         Dvpanel_panel_filtros_Title = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Title") ;
         Dvpanel_panel_filtros_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Collapsible")) ;
         Dvpanel_panel_filtros_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Collapsed")) ;
         Dvpanel_panel_filtros_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Showcollapseicon")) ;
         Dvpanel_panel_filtros_Iconposition = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Iconposition") ;
         Dvpanel_panel_filtros_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Autoscroll")) ;
         /* Read variables values. */
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavFechahorasalida_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vFECHAHORASALIDA");
            GX_FocusControl = edtavFechahorasalida_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV52FechaHoraSalida = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV52FechaHoraSalida", localUtil.ttoc( AV52FechaHoraSalida, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV52FechaHoraSalida = localUtil.ctot( httpContext.cgiGet( edtavFechahorasalida_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52FechaHoraSalida", localUtil.ttoc( AV52FechaHoraSalida, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavDiahact_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vDIAHACT");
            GX_FocusControl = edtavDiahact_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV53DiaHact = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV53DiaHact", localUtil.ttoc( AV53DiaHact, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV53DiaHact = localUtil.ctot( httpContext.cgiGet( edtavDiahact_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53DiaHact", localUtil.ttoc( AV53DiaHact, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDiasalida_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDIASALIDA");
            GX_FocusControl = edtavDiasalida_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV54diasalida = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54diasalida", localUtil.format(AV54diasalida, "99/99/99"));
         }
         else
         {
            AV54diasalida = localUtil.ctod( httpContext.cgiGet( edtavDiasalida_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54diasalida", localUtil.format(AV54diasalida, "99/99/99"));
         }
         AV9Dir = httpContext.cgiGet( edtavDir_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Dir", AV9Dir);
         AV15UserAT = httpContext.cgiGet( edtavUserat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15UserAT", AV15UserAT);
         AV14PassAT = httpContext.cgiGet( edtavPassat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14PassAT", AV14PassAT);
         AV48AlbProcod = localUtil.ctol( httpContext.cgiGet( edtavAlbprocod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48AlbProcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48AlbProcod), 10, 0));
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbprofch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBPROFCH");
            GX_FocusControl = edtavAlbprofch_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV22AlbProfch = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22AlbProfch", localUtil.format(AV22AlbProfch, "99/99/99"));
         }
         else
         {
            AV22AlbProfch = localUtil.ctod( httpContext.cgiGet( edtavAlbprofch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22AlbProfch", localUtil.format(AV22AlbProfch, "99/99/99"));
         }
         AV6AlbProSal = localUtil.ctot( httpContext.cgiGet( edtavAlbprosal_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6AlbProSal", localUtil.ttoc( AV6AlbProSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavAlbprosys_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vALBPROSYS");
            GX_FocusControl = edtavAlbprosys_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7AlbProSys = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV7AlbProSys", localUtil.ttoc( AV7AlbProSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV7AlbProSys = localUtil.ctot( httpContext.cgiGet( edtavAlbprosys_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7AlbProSys", localUtil.ttoc( AV7AlbProSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         AV62AlbPdATCUD = httpContext.cgiGet( edtavAlbpdatcud_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62AlbPdATCUD", AV62AlbPdATCUD);
         AV61AlbPdSerAT = httpContext.cgiGet( edtavAlbpdserat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61AlbPdSerAT", AV61AlbPdSerAT);
         AV60AlbPdTipAT = httpContext.cgiGet( edtavAlbpdtipat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60AlbPdTipAT", AV60AlbPdTipAT);
         AV65Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65Pgmname", AV65Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoTransporteProduccion_Fecha_Hora_Salida_Hash");
         AV9Dir = httpContext.cgiGet( edtavDir_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Dir", AV9Dir);
         forbiddenHiddens.add("Dir", GXutil.rtrim( localUtil.format( AV9Dir, "")));
         AV15UserAT = httpContext.cgiGet( edtavUserat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15UserAT", AV15UserAT);
         forbiddenHiddens.add("UserAT", GXutil.rtrim( localUtil.format( AV15UserAT, "")));
         AV14PassAT = httpContext.cgiGet( edtavPassat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14PassAT", AV14PassAT);
         forbiddenHiddens.add("PassAT", GXutil.rtrim( localUtil.format( AV14PassAT, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("documentotransporteproduccion\\documentotransporteproduccion_fecha_hora_salida_hash:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e112A52 ();
      if (returnInSub) return;
   }

   public void e112A52( )
   {
      /* Start Routine */
      returnInSub = false ;
      System.out.println( httpContext.getMessage( "---------------------------- sTART. DocumentoTransporteProduccion_Fecha_Hora_Salida_Hash -------------------------------", "") );
      GXt_dtime1 = AV57InoutFechaHoraSalida ;
      GXv_dtime2[0] = GXt_dtime1 ;
      new app.stocksquimicos.ptrz001(remoteHandle, context).execute( AV11EmprCod, GXv_dtime2) ;
      documentotransporteproduccion_fecha_hora_salida_hash_impl.this.GXt_dtime1 = GXv_dtime2[0] ;
      AV57InoutFechaHoraSalida = GXt_dtime1 ;
      AV52FechaHoraSalida = AV57InoutFechaHoraSalida ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52FechaHoraSalida", localUtil.ttoc( AV52FechaHoraSalida, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV53DiaHact = GXutil.serverNow( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53DiaHact", localUtil.ttoc( AV53DiaHact, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV54diasalida = GXutil.resetTime(localUtil.ctot( localUtil.ttoc( AV52FechaHoraSalida, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54diasalida", localUtil.format(AV54diasalida, "99/99/99"));
      GXt_char3 = AV9Dir ;
      GXv_char4[0] = GXt_char3 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "SAFTW1", ""), GXv_char4) ;
      documentotransporteproduccion_fecha_hora_salida_hash_impl.this.GXt_char3 = GXv_char4[0] ;
      AV9Dir = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Dir", AV9Dir);
      if ( GXutil.strcmp(AV9Dir, "") == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Path ¡¡¡¡.Revisar Contador SAFTW1", ""));
         httpContext.setWebReturnParms(new Object[] {AV11EmprCod,Long.valueOf(AV48AlbProcod),localUtil.format( AV56AlbHhfm, "99/99/99 99:99"),localUtil.format( AV6AlbProSal, "99/99/99 99:99"),AV47ALbProPri,AV36Cadena,AV37Hash});
         httpContext.setWebReturnParmsMetadata(new Object[] {"AV11EmprCod","AV48AlbProcod","AV56AlbHhfm","AV6AlbProSal","AV47ALbProPri","AV36Cadena","AV37Hash"});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      GXt_char3 = AV15UserAT ;
      GXv_char4[0] = AV11EmprCod ;
      GXv_char5[0] = httpContext.getMessage( "USEAT1", "") ;
      GXv_char6[0] = GXt_char3 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_char6) ;
      documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV11EmprCod = GXv_char4[0] ;
      documentotransporteproduccion_fecha_hora_salida_hash_impl.this.GXt_char3 = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
      AV15UserAT = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15UserAT", AV15UserAT);
      GXt_char3 = AV14PassAT ;
      GXv_char6[0] = AV11EmprCod ;
      GXv_char5[0] = httpContext.getMessage( "PASAT1", "") ;
      GXv_char4[0] = GXt_char3 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4) ;
      documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV11EmprCod = GXv_char6[0] ;
      documentotransporteproduccion_fecha_hora_salida_hash_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
      AV14PassAT = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14PassAT", AV14PassAT);
      AV19Vurl = httpContext.getMessage( "urlt", "") ;
      GXt_char3 = AV19Vurl ;
      GXv_char6[0] = AV11EmprCod ;
      GXv_char5[0] = httpContext.getMessage( "URL", "") ;
      GXv_char4[0] = GXt_char3 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4) ;
      documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV11EmprCod = GXv_char6[0] ;
      documentotransporteproduccion_fecha_hora_salida_hash_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
      AV19Vurl = GXt_char3 ;
      GXt_char3 = AV18Vpfx ;
      GXv_char6[0] = GXt_char3 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "PFX", ""), GXv_char6) ;
      documentotransporteproduccion_fecha_hora_salida_hash_impl.this.GXt_char3 = GXv_char6[0] ;
      AV18Vpfx = GXt_char3 ;
      GXt_char3 = AV17Vpasspfx ;
      GXv_char6[0] = GXt_char3 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "PASPFX", ""), GXv_char6) ;
      documentotransporteproduccion_fecha_hora_salida_hash_impl.this.GXt_char3 = GXv_char6[0] ;
      AV17Vpasspfx = GXt_char3 ;
      GXt_int7 = AV16VerCom ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "APISEN", ""), GXv_int8) ;
      documentotransporteproduccion_fecha_hora_salida_hash_impl.this.GXt_int7 = GXv_int8[0] ;
      AV16VerCom = GXt_int7 ;
      GXt_int7 = AV13hb ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "HEABOD", ""), GXv_int8) ;
      documentotransporteproduccion_fecha_hora_salida_hash_impl.this.GXt_int7 = GXv_int8[0] ;
      AV13hb = GXt_int7 ;
      GXt_int7 = (byte)(AV8ATVeces) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "ATINTE", ""), GXv_int8) ;
      documentotransporteproduccion_fecha_hora_salida_hash_impl.this.GXt_int7 = GXv_int8[0] ;
      AV8ATVeces = GXt_int7 ;
      GXt_int7 = (byte)(AV12endutex) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "ENDTEX", ""), GXv_int8) ;
      documentotransporteproduccion_fecha_hora_salida_hash_impl.this.GXt_int7 = GXv_int8[0] ;
      AV12endutex = GXt_int7 ;
      /* Using cursor H02A52 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A395EmprCif = H02A52_A395EmprCif[0] ;
         n395EmprCif = H02A52_n395EmprCif[0] ;
         AV10EmprCif = A395EmprCif ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV47ALbProPri, "1") == 0 )
      {
         GXv_char6[0] = AV50contidsernew ;
         new app.trabajosexternos.obtengocodigoserieat(remoteHandle, context).execute( AV11EmprCod, "666666", GXv_char6) ;
         documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV50contidsernew = GXv_char6[0] ;
         AV51SerieAT = ((GXutil.strcmp("", AV50contidsernew)==0) ? "GR1" : AV50contidsernew) ;
         AV28Fichero = GXutil.trim( AV51SerieAT) + GXutil.padl( GXutil.trim( GXutil.str( AV48AlbProcod, 10, 0)), (short)(10), "0") ;
      }
      else
      {
         GXv_char6[0] = AV50contidsernew ;
         new app.trabajosexternos.obtengocodigoserieat(remoteHandle, context).execute( AV11EmprCod, "555555", GXv_char6) ;
         documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV50contidsernew = GXv_char6[0] ;
         AV51SerieAT = ((GXutil.strcmp("", AV50contidsernew)==0) ? "GT2" : AV50contidsernew) ;
         AV28Fichero = GXutil.trim( AV51SerieAT) + GXutil.padl( GXutil.trim( GXutil.str( AV48AlbProcod, 10, 0)), (short)(10), "0") ;
      }
      AV35Path = GXutil.trim( AV9Dir) ;
      GXv_date9[0] = AV22AlbProfch ;
      new app.documentotransporteproduccion.documentotransporteproduccion_obtengofecha(remoteHandle, context).execute( AV11EmprCod, AV48AlbProcod, GXv_date9) ;
      documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV22AlbProfch = GXv_date9[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22AlbProfch", localUtil.format(AV22AlbProfch, "99/99/99"));
      System.out.println( httpContext.getMessage( "---------------------------- RETORNO DocumentoTransporteProduccion_obtengoFecha  -------------------------------", "")+localUtil.dtoc( AV22AlbProfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
      GXt_char3 = AV43Station ;
      GXv_char6[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char6) ;
      documentotransporteproduccion_fecha_hora_salida_hash_impl.this.GXt_char3 = GXv_char6[0] ;
      AV43Station = GXt_char3 ;
      GXv_char6[0] = AV11EmprCod ;
      GXv_char5[0] = AV44EmprNom ;
      GXv_char4[0] = AV45UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV43Station, GXv_char6, GXv_char5, GXv_char4) ;
      documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV11EmprCod = GXv_char6[0] ;
      documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV44EmprNom = GXv_char5[0] ;
      documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV45UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
      divUnnamedtable3_Height = 30 ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable3_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable3_Height), 9, 0), true);
      GXv_char6[0] = AV62AlbPdATCUD ;
      GXv_char5[0] = AV61AlbPdSerAT ;
      GXv_char4[0] = AV60AlbPdTipAT ;
      new app.documentotransporteproduccion.documentotransporteproduccion_get_atcud(remoteHandle, context).execute( AV11EmprCod, AV48AlbProcod, GXv_char6, GXv_char5, GXv_char4) ;
      documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV62AlbPdATCUD = GXv_char6[0] ;
      documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV61AlbPdSerAT = GXv_char5[0] ;
      documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV60AlbPdTipAT = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62AlbPdATCUD", AV62AlbPdATCUD);
      httpContext.ajax_rsp_assign_attri("", false, "AV61AlbPdSerAT", AV61AlbPdSerAT);
      httpContext.ajax_rsp_assign_attri("", false, "AV60AlbPdTipAT", AV60AlbPdTipAT);
      System.out.println( httpContext.getMessage( "---------------------------- RETORNO DocumentoTransporteProduccion_get_ATCUD  -------------------------------", "")+AV62AlbPdATCUD );
   }

   public void e122A52( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {AV11EmprCod,Long.valueOf(AV48AlbProcod),localUtil.format( AV56AlbHhfm, "99/99/99 99:99"),localUtil.format( AV6AlbProSal, "99/99/99 99:99"),AV47ALbProPri,AV36Cadena,AV37Hash});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV11EmprCod","AV48AlbProcod","AV56AlbHhfm","AV6AlbProSal","AV47ALbProPri","AV36Cadena","AV37Hash"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e132A52( )
   {
      /* 'DoATCUD' Routine */
      returnInSub = false ;
      lblTbmessage_Caption = "  " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( ! (GXutil.strcmp("", AV62AlbPdATCUD)==0) && ! (GXutil.strcmp("", AV61AlbPdSerAT)==0) && ! (GXutil.strcmp("", AV60AlbPdTipAT)==0) )
      {
         lblTbmessage_Caption = httpContext.getMessage( "Ya existe ATCUD¡¡", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      }
      else
      {
         new app.documentotransporteproduccion.documentodetransporteproduccion_atcud(remoteHandle, context).execute( AV11EmprCod, AV48AlbProcod) ;
         GXv_char6[0] = AV62AlbPdATCUD ;
         GXv_char5[0] = AV61AlbPdSerAT ;
         GXv_char4[0] = AV60AlbPdTipAT ;
         new app.documentotransporteproduccion.documentotransporteproduccion_get_atcud(remoteHandle, context).execute( AV11EmprCod, AV48AlbProcod, GXv_char6, GXv_char5, GXv_char4) ;
         documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV62AlbPdATCUD = GXv_char6[0] ;
         documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV61AlbPdSerAT = GXv_char5[0] ;
         documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV60AlbPdTipAT = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62AlbPdATCUD", AV62AlbPdATCUD);
         httpContext.ajax_rsp_assign_attri("", false, "AV61AlbPdSerAT", AV61AlbPdSerAT);
         httpContext.ajax_rsp_assign_attri("", false, "AV60AlbPdTipAT", AV60AlbPdTipAT);
         httpContext.doAjaxRefresh();
      }
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e142A52 ();
      if (returnInSub) return;
   }

   public void e142A52( )
   {
      /* Enter Routine */
      returnInSub = false ;
      lblTbmessage_Caption = "  " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( (GXutil.strcmp("", AV62AlbPdATCUD)==0) || (GXutil.strcmp("", AV61AlbPdSerAT)==0) || (GXutil.strcmp("", AV60AlbPdTipAT)==0) )
      {
         lblTbmessage_Caption = httpContext.getMessage( "Falta ATCUD¡¡¡ o Falta SERIE¡¡¡ o Falta Tipo Documento¡¡¡", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      }
      else
      {
         GXv_char6[0] = AV55msg_control ;
         new app.pctrlhashanterior_2(remoteHandle, context).execute( AV11EmprCod, AV47ALbProPri, AV48AlbProcod, GXv_char6) ;
         documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV55msg_control = GXv_char6[0] ;
         if ( ! (GXutil.strcmp("", AV55msg_control)==0) )
         {
            lblTbmessage_Caption = AV55msg_control ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         }
         else
         {
            AV53DiaHact = GXutil.serverNow( context, remoteHandle, pr_default) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53DiaHact", localUtil.ttoc( AV53DiaHact, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            if ( AV52FechaHoraSalida.before( GXutil.serverNow( context, remoteHandle, pr_default) ) )
            {
               Gx_msg = httpContext.getMessage( "Erro. Dia-Hora Salida ", "") + localUtil.ttoc( AV52FechaHoraSalida, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " inferior a Dia Actual ", "") + localUtil.ttoc( AV53DiaHact, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
               lblTbmessage_Caption = Gx_msg ;
               httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            }
            else
            {
               if ( AV52FechaHoraSalida.before( AV22AlbProfch ) )
               {
                  Gx_msg = httpContext.getMessage( "Erro. Dia-Hora Salida ", "") + localUtil.ttoc( AV52FechaHoraSalida, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " inferior a Data Documento ", "") + localUtil.dtoc( AV22AlbProfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                  lblTbmessage_Caption = Gx_msg ;
                  httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
               }
               else
               {
                  AV6AlbProSal = AV52FechaHoraSalida ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV6AlbProSal", localUtil.ttoc( AV6AlbProSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                  AV56AlbHhfm = AV53DiaHact ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV56AlbHhfm", localUtil.ttoc( AV56AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                  new app.documentotransporteproduccion.documentotransporteproduccion_fechahorasalida_fechasistema(remoteHandle, context).execute( AV11EmprCod, AV48AlbProcod, AV6AlbProSal, AV56AlbHhfm) ;
                  AV58AlbProfchin = AV22AlbProfch ;
                  GXv_char6[0] = AV36Cadena ;
                  GXv_char5[0] = AV20Firma ;
                  new app.documentotransporteproduccion.obtengocadenaparahashdocumentodetransporteproduccion(remoteHandle, context).execute( AV11EmprCod, (int)(AV48AlbProcod), AV58AlbProfchin, AV56AlbHhfm, GXv_char6, GXv_char5) ;
                  documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV36Cadena = GXv_char6[0] ;
                  documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV20Firma = GXv_char5[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV36Cadena", AV36Cadena);
                  GXv_char6[0] = AV37Hash ;
                  GXv_objcol_SdtMessages_Message10[0] = AV38Messages ;
                  GXv_boolean11[0] = AV39OK ;
                  new app.hash_obtener(remoteHandle, context).execute( AV36Cadena, GXv_char6, GXv_objcol_SdtMessages_Message10, GXv_boolean11) ;
                  documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV37Hash = GXv_char6[0] ;
                  AV38Messages = GXv_objcol_SdtMessages_Message10[0] ;
                  documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV39OK = GXv_boolean11[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV37Hash", AV37Hash);
                  if ( ! AV39OK )
                  {
                     AV68GXV1 = 1 ;
                     while ( AV68GXV1 <= AV38Messages.size() )
                     {
                        AV40Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV38Messages.elementAt(-1+AV68GXV1));
                        httpContext.GX_msglist.addItem(AV40Message.getgxTv_SdtMessages_Message_Description());
                        AV68GXV1 = (int)(AV68GXV1+1) ;
                     }
                  }
                  else
                  {
                     /* Execute user subroutine: 'CALPRD' */
                     S112 ();
                     if (returnInSub) return;
                     if ( (0==AV27Lineas) )
                     {
                        lblTbmessage_Caption = httpContext.getMessage( "NO tiene Lineas ¡¡¡¡", "") ;
                        httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                     }
                     else
                     {
                        if ( GXutil.strcmp(AV9Dir, "") == 0 )
                        {
                           lblTbmessage_Caption = httpContext.getMessage( "Falta Path ¡¡¡¡.Revisar Contador SAFTW1", "") ;
                           httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                        }
                        else
                        {
                           if ( (0==AV49Calprd) )
                           {
                              lblTbmessage_Caption = httpContext.getMessage( "Nao Existe Documento¡¡¡", "") ;
                              httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                           }
                           else
                           {
                              httpContext.GX_msglist.addItem(httpContext.getMessage( "Hash creado correctamente", ""));
                              GXv_char6[0] = AV36Cadena ;
                              GXv_char5[0] = AV37Hash ;
                              new app.documentotransporteproduccion.actualizohashdocumentodetransporteproduccion(remoteHandle, context).execute( AV11EmprCod, (int)(AV48AlbProcod), GXv_char6, GXv_char5) ;
                              documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV36Cadena = GXv_char6[0] ;
                              documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV37Hash = GXv_char5[0] ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV36Cadena", AV36Cadena);
                              httpContext.ajax_rsp_assign_attri("", false, "AV37Hash", AV37Hash);
                              if ( GXutil.strcmp(AV47ALbProPri, "1") == 0 )
                              {
                                 GXv_char6[0] = AV50contidsernew ;
                                 new app.trabajosexternos.obtengocodigoserieat(remoteHandle, context).execute( AV11EmprCod, "666666", GXv_char6) ;
                                 documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV50contidsernew = GXv_char6[0] ;
                                 AV51SerieAT = ((GXutil.strcmp("", AV50contidsernew)==0) ? "GR1" : AV50contidsernew) ;
                                 AV28Fichero = GXutil.trim( AV51SerieAT) + GXutil.padl( GXutil.trim( GXutil.str( AV48AlbProcod, 10, 0)), (short)(10), "0") ;
                              }
                              else
                              {
                                 GXv_char6[0] = AV50contidsernew ;
                                 new app.trabajosexternos.obtengocodigoserieat(remoteHandle, context).execute( AV11EmprCod, "555555", GXv_char6) ;
                                 documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV50contidsernew = GXv_char6[0] ;
                                 AV51SerieAT = ((GXutil.strcmp("", AV50contidsernew)==0) ? "GT2" : AV50contidsernew) ;
                                 AV28Fichero = GXutil.trim( AV51SerieAT) + GXutil.padl( GXutil.trim( GXutil.str( AV48AlbProcod, 10, 0)), (short)(10), "0") ;
                              }
                              AV35Path = GXutil.trim( AV9Dir) ;
                              GXv_char6[0] = AV11EmprCod ;
                              GXv_int12[0] = AV48AlbProcod ;
                              GXv_char5[0] = AV35Path ;
                              GXv_char4[0] = AV28Fichero ;
                              GXv_objcol_SdtMessages_Message10[0] = AV38Messages ;
                              GXv_boolean11[0] = AV39OK ;
                              new app.pgrxml(remoteHandle, context).execute( GXv_char6, GXv_int12, GXv_char5, GXv_char4, GXv_objcol_SdtMessages_Message10, GXv_boolean11) ;
                              documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV11EmprCod = GXv_char6[0] ;
                              documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV48AlbProcod = GXv_int12[0] ;
                              documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV35Path = GXv_char5[0] ;
                              documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV28Fichero = GXv_char4[0] ;
                              AV38Messages = GXv_objcol_SdtMessages_Message10[0] ;
                              documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV39OK = GXv_boolean11[0] ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
                              httpContext.ajax_rsp_assign_attri("", false, "AV48AlbProcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48AlbProcod), 10, 0));
                              if ( ! AV39OK )
                              {
                                 AV69GXV2 = 1 ;
                                 while ( AV69GXV2 <= AV38Messages.size() )
                                 {
                                    AV40Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV38Messages.elementAt(-1+AV69GXV2));
                                    httpContext.GX_msglist.addItem(AV40Message.getgxTv_SdtMessages_Message_Description());
                                    AV69GXV2 = (int)(AV69GXV2+1) ;
                                 }
                              }
                              else
                              {
                                 GXv_objcol_SdtMessages_Message10[0] = AV38Messages ;
                                 GXv_boolean11[0] = AV39OK ;
                                 new app.at_comunicar(remoteHandle, context).execute( AV11EmprCod, AV28Fichero, AV15UserAT, AV14PassAT, GXv_objcol_SdtMessages_Message10, GXv_boolean11) ;
                                 AV38Messages = GXv_objcol_SdtMessages_Message10[0] ;
                                 documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV39OK = GXv_boolean11[0] ;
                                 AV42Messages_tojson = AV38Messages.toJSonString(false) ;
                                 if ( GXutil.strcmp(AV47ALbProPri, "1") == 0 )
                                 {
                                    GXv_char6[0] = AV50contidsernew ;
                                    new app.trabajosexternos.obtengocodigoserieat(remoteHandle, context).execute( AV11EmprCod, "666666", GXv_char6) ;
                                    documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV50contidsernew = GXv_char6[0] ;
                                    AV51SerieAT = ((GXutil.strcmp("", AV50contidsernew)==0) ? "GR1" : AV50contidsernew) ;
                                    AV33FileR = GXutil.trim( AV51SerieAT) + GXutil.padl( GXutil.trim( GXutil.str( AV48AlbProcod, 10, 0)), (short)(10), "0") ;
                                 }
                                 else
                                 {
                                    GXv_char6[0] = AV50contidsernew ;
                                    new app.trabajosexternos.obtengocodigoserieat(remoteHandle, context).execute( AV11EmprCod, "555555", GXv_char6) ;
                                    documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV50contidsernew = GXv_char6[0] ;
                                    AV51SerieAT = ((GXutil.strcmp("", AV50contidsernew)==0) ? "GT2" : AV50contidsernew) ;
                                    AV33FileR = GXutil.trim( AV51SerieAT) + GXutil.padl( GXutil.trim( GXutil.str( AV48AlbProcod, 10, 0)), (short)(10), "0") ;
                                 }
                                 AV29File.setSource( GXutil.trim( AV9Dir)+"\\"+GXutil.trim( AV33FileR)+httpContext.getMessage( "result", "")+httpContext.getMessage( ".xml", "") );
                                 AV41Var_File = AV29File.getAbsoluteName() ;
                                 if ( AV39OK )
                                 {
                                    GXv_char6[0] = AV11EmprCod ;
                                    GXv_char5[0] = AV28Fichero ;
                                    GXv_int12[0] = AV48AlbProcod ;
                                    GXv_char4[0] = AV47ALbProPri ;
                                    GXv_objcol_SdtMessages_Message10[0] = AV38Messages ;
                                    GXv_boolean11[0] = AV39OK ;
                                    new app.documentotransporteproduccion.documentodetransporteproduccion_result(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_int12, GXv_char4, GXv_objcol_SdtMessages_Message10, GXv_boolean11) ;
                                    documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV11EmprCod = GXv_char6[0] ;
                                    documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV28Fichero = GXv_char5[0] ;
                                    documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV48AlbProcod = GXv_int12[0] ;
                                    documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV47ALbProPri = GXv_char4[0] ;
                                    AV38Messages = GXv_objcol_SdtMessages_Message10[0] ;
                                    documentotransporteproduccion_fecha_hora_salida_hash_impl.this.AV39OK = GXv_boolean11[0] ;
                                    httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
                                    httpContext.ajax_rsp_assign_attri("", false, "AV48AlbProcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48AlbProcod), 10, 0));
                                    httpContext.ajax_rsp_assign_attri("", false, "AV47ALbProPri", AV47ALbProPri);
                                    AV42Messages_tojson = AV38Messages.toJSonString(false) ;
                                    httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_10", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV28Fichero)),GXutil.URLEncode(GXutil.ltrimstr(AV48AlbProcod,10,0)),GXutil.URLEncode(GXutil.rtrim(AV47ALbProPri)),GXutil.URLEncode(GXutil.rtrim(AV42Messages_tojson)),GXutil.URLEncode(GXutil.booltostr(AV39OK))}, new String[] {"Emprcod","Fichero","AlbProCod","ALbProPri","Messages_tojson","Ok"}) , new Object[] {});
                                    if ( ! AV39OK )
                                    {
                                       httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_5", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV48AlbProcod,10,0)),GXutil.URLEncode(GXutil.rtrim(AV59albmarca))}, new String[] {"AuxEmprcod","AlbProcod","albmarca"}) , new Object[] {});
                                       httpContext.doAjaxRefresh();
                                    }
                                    else
                                    {
                                       httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_5", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV48AlbProcod,10,0)),GXutil.URLEncode(GXutil.rtrim(AV59albmarca))}, new String[] {"AuxEmprcod","AlbProcod","albmarca"}) , new Object[] {});
                                       httpContext.doAjaxRefresh();
                                    }
                                 }
                                 else
                                 {
                                    AV70GXV3 = 1 ;
                                    while ( AV70GXV3 <= AV38Messages.size() )
                                    {
                                       AV40Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV38Messages.elementAt(-1+AV70GXV3));
                                       AV46Var_mensaje = AV40Message.getgxTv_SdtMessages_Message_Id() + GXutil.newLine( ) ;
                                       AV46Var_mensaje += AV40Message.getgxTv_SdtMessages_Message_Description() + GXutil.newLine( ) ;
                                       httpContext.GX_msglist.addItem(AV46Var_mensaje);
                                       AV70GXV3 = (int)(AV70GXV3+1) ;
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
      /* 'CALPRD' Routine */
      returnInSub = false ;
      /* Using cursor H02A53 */
      pr_default.execute(1, new Object[] {AV11EmprCod, Long.valueOf(AV48AlbProcod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A30AlbProCod = H02A53_A30AlbProCod[0] ;
         A396EmprCod = H02A53_A396EmprCod[0] ;
         A34AlbProfch = H02A53_A34AlbProfch[0] ;
         A7101AlbLic = H02A53_A7101AlbLic[0] ;
         A10017AlbFmd = H02A53_A10017AlbFmd[0] ;
         n10017AlbFmd = H02A53_n10017AlbFmd[0] ;
         A5140AlbMarca = H02A53_A5140AlbMarca[0] ;
         AV22AlbProfch = A34AlbProfch ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22AlbProfch", localUtil.format(AV22AlbProfch, "99/99/99"));
         AV23ALbLic = A7101AlbLic ;
         AV49Calprd = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49Calprd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49Calprd), 4, 0));
         AV24AlbCOmcod = (int)(A30AlbProCod) ;
         AV25Albfmd = A10017AlbFmd ;
         AV59albmarca = A5140AlbMarca ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59albmarca", AV59albmarca);
         AV27Lineas = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Lineas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Lineas), 4, 0));
         /* Optimized group. */
         /* Using cursor H02A54 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         cV27Lineas = H02A54_AV27Lineas[0] ;
         pr_default.close(2);
         AV27Lineas = (short)(AV27Lineas+cV27Lineas*1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Lineas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Lineas), 4, 0));
         /* End optimized group. */
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   protected void nextLoad( )
   {
   }

   protected void e152A52( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV11EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
      AV48AlbProcod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48AlbProcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48AlbProcod), 10, 0));
      AV56AlbHhfm = (java.util.Date)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56AlbHhfm", localUtil.ttoc( AV56AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV6AlbProSal = (java.util.Date)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6AlbProSal", localUtil.ttoc( AV6AlbProSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV47ALbProPri = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47ALbProPri", AV47ALbProPri);
      AV36Cadena = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Cadena", AV36Cadena);
      AV37Hash = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Hash", AV37Hash);
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
      pa2A52( ) ;
      ws2A52( ) ;
      we2A52( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415132522", true, true);
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
      httpContext.AddJavascriptSource("documentotransporteproduccion/documentotransporteproduccion_fecha_hora_salida_hash.js", "?202682415132522", false, true);
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
      edtavUserat_Internalname = "vUSERAT" ;
      edtavPassat_Internalname = "vPASSAT" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtavAlbprocod_Internalname = "vALBPROCOD" ;
      edtavAlbprofch_Internalname = "vALBPROFCH" ;
      edtavAlbprosal_Internalname = "vALBPROSAL" ;
      edtavAlbprosys_Internalname = "vALBPROSYS" ;
      edtavAlbpdatcud_Internalname = "vALBPDATCUD" ;
      edtavAlbpdserat_Internalname = "vALBPDSERAT" ;
      edtavAlbpdtipat_Internalname = "vALBPDTIPAT" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      Dvpanel_unnamedtable4_Internalname = "DVPANEL_UNNAMEDTABLE4" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      bttBtnatcud_Internalname = "BTNATCUD" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
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
      divUnnamedtable3_Height = 0 ;
      edtavAlbpdtipat_Jsonclick = "" ;
      edtavAlbpdtipat_Enabled = 1 ;
      edtavAlbpdserat_Jsonclick = "" ;
      edtavAlbpdserat_Enabled = 1 ;
      edtavAlbpdatcud_Jsonclick = "" ;
      edtavAlbpdatcud_Enabled = 1 ;
      edtavAlbprosys_Jsonclick = "" ;
      edtavAlbprosys_Enabled = 1 ;
      edtavAlbprosal_Jsonclick = "" ;
      edtavAlbprosal_Enabled = 0 ;
      edtavAlbprofch_Jsonclick = "" ;
      edtavAlbprofch_Enabled = 1 ;
      edtavAlbprocod_Jsonclick = "" ;
      edtavAlbprocod_Enabled = 0 ;
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
      Dvpanel_panel_filtros_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Iconposition = "Right" ;
      Dvpanel_panel_filtros_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtros_Title = httpContext.getMessage( "<i class=\"fas fa-filter\"></i> Filtros", "") ;
      Dvpanel_panel_filtros_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_filtros_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtros_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Width = "100%" ;
      Dvpanel_unnamedtable4_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Iconposition = "Right" ;
      Dvpanel_unnamedtable4_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Title = httpContext.getMessage( "Informacion Envio Web Service AT", "") ;
      Dvpanel_unnamedtable4_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable4_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Width = "100%" ;
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
      Form.setCaption( httpContext.getMessage( "Preparo XML AT Documentode Transporte Produccion", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV9Dir',fld:'vDIR',pic:''},{av:'AV15UserAT',fld:'vUSERAT',pic:''},{av:'AV14PassAT',fld:'vPASSAT',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCERRAR'","{handler:'e122A52',iparms:[{av:'AV37Hash',fld:'vHASH',pic:''},{av:'AV36Cadena',fld:'vCADENA',pic:''},{av:'AV47ALbProPri',fld:'vALBPROPRI',pic:'9'},{av:'AV6AlbProSal',fld:'vALBPROSAL',pic:'99/99/99 99:99'},{av:'AV56AlbHhfm',fld:'vALBHHFM',pic:'99/99/99 99:99'},{av:'AV48AlbProcod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOATCUD'","{handler:'e132A52',iparms:[{av:'AV62AlbPdATCUD',fld:'vALBPDATCUD',pic:''},{av:'AV61AlbPdSerAT',fld:'vALBPDSERAT',pic:''},{av:'AV60AlbPdTipAT',fld:'vALBPDTIPAT',pic:''},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48AlbProcod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("'DOATCUD'",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV60AlbPdTipAT',fld:'vALBPDTIPAT',pic:''},{av:'AV61AlbPdSerAT',fld:'vALBPDSERAT',pic:''},{av:'AV62AlbPdATCUD',fld:'vALBPDATCUD',pic:''}]}");
      setEventMetadata("ENTER","{handler:'e142A52',iparms:[{av:'AV62AlbPdATCUD',fld:'vALBPDATCUD',pic:''},{av:'AV61AlbPdSerAT',fld:'vALBPDSERAT',pic:''},{av:'AV60AlbPdTipAT',fld:'vALBPDTIPAT',pic:''},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV47ALbProPri',fld:'vALBPROPRI',pic:'9'},{av:'AV48AlbProcod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV52FechaHoraSalida',fld:'vFECHAHORASALIDA',pic:'99/99/99 99:99:99'},{av:'AV22AlbProfch',fld:'vALBPROFCH',pic:''},{av:'AV27Lineas',fld:'vLINEAS',pic:'ZZZ9'},{av:'AV9Dir',fld:'vDIR',pic:''},{av:'AV49Calprd',fld:'vCALPRD',pic:'ZZZ9'},{av:'AV15UserAT',fld:'vUSERAT',pic:''},{av:'AV14PassAT',fld:'vPASSAT',pic:''},{av:'AV59albmarca',fld:'vALBMARCA',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'A7101AlbLic',fld:'ALBLIC',pic:''},{av:'A10017AlbFmd',fld:'ALBFMD',pic:''},{av:'A5140AlbMarca',fld:'ALBMARCA',pic:''},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'}]");
      setEventMetadata("ENTER",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV53DiaHact',fld:'vDIAHACT',pic:'99/99/99 99:99'},{av:'AV6AlbProSal',fld:'vALBPROSAL',pic:'99/99/99 99:99'},{av:'AV56AlbHhfm',fld:'vALBHHFM',pic:'99/99/99 99:99'},{av:'AV36Cadena',fld:'vCADENA',pic:''},{av:'AV37Hash',fld:'vHASH',pic:''},{av:'AV48AlbProcod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV47ALbProPri',fld:'vALBPROPRI',pic:'9'},{av:'AV22AlbProfch',fld:'vALBPROFCH',pic:''},{av:'AV49Calprd',fld:'vCALPRD',pic:'ZZZ9'},{av:'AV59albmarca',fld:'vALBMARCA',pic:''},{av:'AV27Lineas',fld:'vLINEAS',pic:'ZZZ9'}]}");
      setEventMetadata("VALIDV_ALBPROCOD","{handler:'validv_Albprocod',iparms:[]");
      setEventMetadata("VALIDV_ALBPROCOD",",oparms:[]}");
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
      wcpOAV11EmprCod = "" ;
      wcpOAV56AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV6AlbProSal = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV47ALbProPri = "" ;
      wcpOAV36Cadena = "" ;
      wcpOAV37Hash = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV11EmprCod = "" ;
      AV56AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      AV6AlbProSal = GXutil.resetTime( GXutil.nullDate() );
      AV47ALbProPri = "" ;
      AV36Cadena = "" ;
      AV37Hash = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV9Dir = "" ;
      AV15UserAT = "" ;
      AV14PassAT = "" ;
      AV59albmarca = "" ;
      A396EmprCod = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A7101AlbLic = "" ;
      A10017AlbFmd = "" ;
      A5140AlbMarca = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV52FechaHoraSalida = GXutil.resetTime( GXutil.nullDate() );
      AV53DiaHact = GXutil.resetTime( GXutil.nullDate() );
      AV54diasalida = GXutil.nullDate() ;
      lblTbmessage_Jsonclick = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable4 = new com.genexus.webpanels.GXUserControl();
      AV22AlbProfch = GXutil.nullDate() ;
      AV7AlbProSys = GXutil.resetTime( GXutil.nullDate() );
      AV62AlbPdATCUD = "" ;
      AV61AlbPdSerAT = "" ;
      AV60AlbPdTipAT = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      bttBtnatcud_Jsonclick = "" ;
      AV65Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      hsh = "" ;
      AV57InoutFechaHoraSalida = GXutil.resetTime( GXutil.nullDate() );
      GXt_dtime1 = GXutil.resetTime( GXutil.nullDate() );
      GXv_dtime2 = new java.util.Date[1] ;
      AV19Vurl = "" ;
      AV18Vpfx = "" ;
      AV17Vpasspfx = "" ;
      GXv_int8 = new byte[1] ;
      scmdbuf = "" ;
      H02A52_A396EmprCod = new String[] {""} ;
      H02A52_A395EmprCif = new String[] {""} ;
      H02A52_n395EmprCif = new boolean[] {false} ;
      A395EmprCif = "" ;
      AV10EmprCif = "" ;
      AV50contidsernew = "" ;
      AV51SerieAT = "" ;
      AV28Fichero = "" ;
      AV35Path = "" ;
      GXv_date9 = new java.util.Date[1] ;
      AV43Station = "" ;
      GXt_char3 = "" ;
      AV44EmprNom = "" ;
      AV45UsurCod = "" ;
      AV55msg_control = "" ;
      Gx_msg = "" ;
      AV58AlbProfchin = GXutil.nullDate() ;
      AV20Firma = "" ;
      AV38Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV40Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV42Messages_tojson = "" ;
      AV33FileR = "" ;
      AV29File = new com.genexus.util.GXFile();
      AV41Var_File = "" ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int12 = new long[1] ;
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtMessages_Message10 = new GXBaseCollection[1] ;
      GXv_boolean11 = new boolean[1] ;
      AV46Var_mensaje = "" ;
      H02A53_A30AlbProCod = new long[1] ;
      H02A53_A396EmprCod = new String[] {""} ;
      H02A53_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H02A53_A7101AlbLic = new String[] {""} ;
      H02A53_A10017AlbFmd = new String[] {""} ;
      H02A53_n10017AlbFmd = new boolean[] {false} ;
      H02A53_A5140AlbMarca = new String[] {""} ;
      AV23ALbLic = "" ;
      AV25Albfmd = "" ;
      H02A54_AV27Lineas = new short[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentotransporteproduccion_fecha_hora_salida_hash__default(),
         new Object[] {
             new Object[] {
            H02A52_A396EmprCod, H02A52_A395EmprCif, H02A52_n395EmprCif
            }
            , new Object[] {
            H02A53_A30AlbProCod, H02A53_A396EmprCod, H02A53_A34AlbProfch, H02A53_A7101AlbLic, H02A53_A10017AlbFmd, H02A53_n10017AlbFmd, H02A53_A5140AlbMarca
            }
            , new Object[] {
            H02A54_AV27Lineas
            }
         }
      );
      AV65Pgmname = "DocumentoTransporteProduccion.DocumentoTransporteProduccion_Fecha_Hora_Salida_Hash" ;
      /* GeneXus formulas. */
      AV65Pgmname = "DocumentoTransporteProduccion.DocumentoTransporteProduccion_Fecha_Hora_Salida_Hash" ;
      Gx_err = (short)(0) ;
      edtavDiahact_Enabled = 0 ;
      edtavDiasalida_Enabled = 0 ;
      edtavDir_Enabled = 0 ;
      edtavUserat_Enabled = 0 ;
      edtavPassat_Enabled = 0 ;
      edtavAlbprocod_Enabled = 0 ;
      edtavAlbprofch_Enabled = 0 ;
      edtavAlbprosal_Enabled = 0 ;
      edtavAlbprosys_Enabled = 0 ;
      edtavAlbpdatcud_Enabled = 0 ;
      edtavAlbpdserat_Enabled = 0 ;
      edtavAlbpdtipat_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte AV16VerCom ;
   private byte AV13hb ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte nGXWrapped ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV27Lineas ;
   private short AV49Calprd ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV8ATVeces ;
   private short AV12endutex ;
   private short cV27Lineas ;
   private int edtavFechahorasalida_Enabled ;
   private int edtavDiahact_Enabled ;
   private int edtavDiasalida_Enabled ;
   private int edtavDir_Enabled ;
   private int edtavUserat_Enabled ;
   private int edtavPassat_Enabled ;
   private int edtavAlbprocod_Enabled ;
   private int edtavAlbprofch_Enabled ;
   private int edtavAlbprosal_Enabled ;
   private int edtavAlbprosys_Enabled ;
   private int edtavAlbpdatcud_Enabled ;
   private int edtavAlbpdserat_Enabled ;
   private int edtavAlbpdtipat_Enabled ;
   private int divUnnamedtable3_Height ;
   private int edtavPgmname_Enabled ;
   private int AV68GXV1 ;
   private int AV69GXV2 ;
   private int AV70GXV3 ;
   private int AV24AlbCOmcod ;
   private int idxLst ;
   private long wcpOAV48AlbProcod ;
   private long AV48AlbProcod ;
   private long A30AlbProCod ;
   private long GXv_int12[] ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private String wcpOAV11EmprCod ;
   private String wcpOAV47ALbProPri ;
   private String wcpOAV36Cadena ;
   private String wcpOAV37Hash ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV11EmprCod ;
   private String AV47ALbProPri ;
   private String AV36Cadena ;
   private String AV37Hash ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV9Dir ;
   private String AV15UserAT ;
   private String AV14PassAT ;
   private String AV59albmarca ;
   private String A396EmprCod ;
   private String A7101AlbLic ;
   private String A5140AlbMarca ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable4_Width ;
   private String Dvpanel_unnamedtable4_Cls ;
   private String Dvpanel_unnamedtable4_Title ;
   private String Dvpanel_unnamedtable4_Iconposition ;
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
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
   private String Dvpanel_panel_filtros_Internalname ;
   private String divPanel_filtros_Internalname ;
   private String Dvpanel_unnamedtable4_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavDir_Internalname ;
   private String edtavDir_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtavUserat_Internalname ;
   private String edtavUserat_Jsonclick ;
   private String edtavPassat_Internalname ;
   private String edtavPassat_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String edtavAlbprocod_Internalname ;
   private String edtavAlbprocod_Jsonclick ;
   private String edtavAlbprofch_Internalname ;
   private String edtavAlbprofch_Jsonclick ;
   private String edtavAlbprosal_Internalname ;
   private String edtavAlbprosal_Jsonclick ;
   private String edtavAlbprosys_Internalname ;
   private String edtavAlbprosys_Jsonclick ;
   private String edtavAlbpdatcud_Internalname ;
   private String AV62AlbPdATCUD ;
   private String edtavAlbpdatcud_Jsonclick ;
   private String edtavAlbpdserat_Internalname ;
   private String AV61AlbPdSerAT ;
   private String edtavAlbpdserat_Jsonclick ;
   private String edtavAlbpdtipat_Internalname ;
   private String AV60AlbPdTipAT ;
   private String edtavAlbpdtipat_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String bttBtnatcud_Internalname ;
   private String bttBtnatcud_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV65Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String hsh ;
   private String AV19Vurl ;
   private String AV18Vpfx ;
   private String AV17Vpasspfx ;
   private String scmdbuf ;
   private String A395EmprCif ;
   private String AV10EmprCif ;
   private String AV50contidsernew ;
   private String AV51SerieAT ;
   private String AV28Fichero ;
   private String AV43Station ;
   private String GXt_char3 ;
   private String AV44EmprNom ;
   private String AV45UsurCod ;
   private String Gx_msg ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String AV23ALbLic ;
   private java.util.Date wcpOAV56AlbHhfm ;
   private java.util.Date wcpOAV6AlbProSal ;
   private java.util.Date AV56AlbHhfm ;
   private java.util.Date AV6AlbProSal ;
   private java.util.Date AV52FechaHoraSalida ;
   private java.util.Date AV53DiaHact ;
   private java.util.Date AV7AlbProSys ;
   private java.util.Date AV57InoutFechaHoraSalida ;
   private java.util.Date GXt_dtime1 ;
   private java.util.Date GXv_dtime2[] ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date AV54diasalida ;
   private java.util.Date AV22AlbProfch ;
   private java.util.Date GXv_date9[] ;
   private java.util.Date AV58AlbProfchin ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_unnamedtable4_Autowidth ;
   private boolean Dvpanel_unnamedtable4_Autoheight ;
   private boolean Dvpanel_unnamedtable4_Collapsible ;
   private boolean Dvpanel_unnamedtable4_Collapsed ;
   private boolean Dvpanel_unnamedtable4_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable4_Autoscroll ;
   private boolean Dvpanel_panel_filtros_Autowidth ;
   private boolean Dvpanel_panel_filtros_Autoheight ;
   private boolean Dvpanel_panel_filtros_Collapsible ;
   private boolean Dvpanel_panel_filtros_Collapsed ;
   private boolean Dvpanel_panel_filtros_Showcollapseicon ;
   private boolean Dvpanel_panel_filtros_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n395EmprCif ;
   private boolean AV39OK ;
   private boolean GXv_boolean11[] ;
   private boolean n10017AlbFmd ;
   private String A10017AlbFmd ;
   private String AV35Path ;
   private String AV55msg_control ;
   private String AV20Firma ;
   private String AV42Messages_tojson ;
   private String AV33FileR ;
   private String AV41Var_File ;
   private String AV46Var_mensaje ;
   private String AV25Albfmd ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable4 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXFile AV29File ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H02A52_A396EmprCod ;
   private String[] H02A52_A395EmprCif ;
   private boolean[] H02A52_n395EmprCif ;
   private long[] H02A53_A30AlbProCod ;
   private String[] H02A53_A396EmprCod ;
   private java.util.Date[] H02A53_A34AlbProfch ;
   private String[] H02A53_A7101AlbLic ;
   private String[] H02A53_A10017AlbFmd ;
   private boolean[] H02A53_n10017AlbFmd ;
   private String[] H02A53_A5140AlbMarca ;
   private short[] H02A54_AV27Lineas ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV38Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message10[] ;
   private com.genexus.SdtMessages_Message AV40Message ;
}

final  class documentotransporteproduccion_fecha_hora_salida_hash__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02A52", "SELECT EmprCod, EmprCif FROM TXPEMPRES ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02A53", "SELECT AlbProCod, EmprCod, AlbProfch, AlbLic, AlbFmd, AlbMarca FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H02A54", "SELECT COUNT(*) FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

