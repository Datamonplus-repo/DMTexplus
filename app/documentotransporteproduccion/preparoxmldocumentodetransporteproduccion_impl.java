package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class preparoxmldocumentodetransporteproduccion_impl extends GXDataArea
{
   public preparoxmldocumentodetransporteproduccion_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public preparoxmldocumentodetransporteproduccion_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preparoxmldocumentodetransporteproduccion_impl.class ));
   }

   public preparoxmldocumentodetransporteproduccion_impl( int remoteHandle ,
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
               AV7AlbProSys = localUtil.parseDTimeParm( httpContext.GetPar( "AlbProSys")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7AlbProSys", localUtil.ttoc( AV7AlbProSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      pa2552( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2552( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.documentotransporteproduccion.preparoxmldocumentodetransporteproduccion", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV48AlbProcod,10,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV7AlbProSys)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV6AlbProSal)),GXutil.URLEncode(GXutil.rtrim(AV47ALbProPri)),GXutil.URLEncode(GXutil.rtrim(AV36Cadena)),GXutil.URLEncode(GXutil.rtrim(AV37Hash))}, new String[] {"EmprCod","AlbProcod","AlbProSys","AlbProSal","ALbProPri","Cadena","Hash"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"PreparoXMLDocumentodeTransporteProduccion");
      forbiddenHiddens.add("Dir", GXutil.rtrim( localUtil.format( AV9Dir, "")));
      forbiddenHiddens.add("UserAT", GXutil.rtrim( localUtil.format( AV15UserAT, "")));
      forbiddenHiddens.add("PassAT", GXutil.rtrim( localUtil.format( AV14PassAT, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("documentotransporteproduccion\\preparoxmldocumentodetransporteproduccion:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV11EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROCOD", GXutil.ltrim( localUtil.ntoc( AV48AlbProcod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPATH", AV35Path);
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROPRI", GXutil.rtrim( AV47ALbProPri));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROSAL", localUtil.ttoc( AV6AlbProSal, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROSYS", localUtil.ttoc( AV7AlbProSys, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vLINEAS", GXutil.ltrim( localUtil.ntoc( AV27Lineas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCALPRD", GXutil.ltrim( localUtil.ntoc( AV49Calprd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBFMD", AV25Albfmd);
      app.GxWebStd.gx_hidden_field( httpContext, "vALBMARCA", GXutil.rtrim( AV52albmarca));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROCOD", GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROFCH", localUtil.dtoc( A34AlbProfch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBLIC", GXutil.rtrim( A7101AlbLic));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBFMD", A10017AlbFmd);
      app.GxWebStd.gx_hidden_field( httpContext, "ALBMARCA", GXutil.rtrim( A5140AlbMarca));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBKGME", GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Width", GXutil.rtrim( Dvpanel_unnamedtable7_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable7_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable7_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Cls", GXutil.rtrim( Dvpanel_unnamedtable7_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Title", GXutil.rtrim( Dvpanel_unnamedtable7_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable7_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable7_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable7_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable7_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable7_Autoscroll));
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
         we2552( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2552( ) ;
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
      return formatLink("app.documentotransporteproduccion.preparoxmldocumentodetransporteproduccion", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV48AlbProcod,10,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV7AlbProSys)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV6AlbProSal)),GXutil.URLEncode(GXutil.rtrim(AV47ALbProPri)),GXutil.URLEncode(GXutil.rtrim(AV36Cadena)),GXutil.URLEncode(GXutil.rtrim(AV37Hash))}, new String[] {"EmprCod","AlbProcod","AlbProSys","AlbProSal","ALbProPri","Cadena","Hash"})  ;
   }

   public String getPgmname( )
   {
      return "DocumentoTransporteProduccion.PreparoXMLDocumentodeTransporteProduccion" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Preparo XML AT Documentode Transporte Produccion", "") ;
   }

   public void wb2550( )
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
         ucDvpanel_unnamedtable7.setProperty("Width", Dvpanel_unnamedtable7_Width);
         ucDvpanel_unnamedtable7.setProperty("AutoWidth", Dvpanel_unnamedtable7_Autowidth);
         ucDvpanel_unnamedtable7.setProperty("AutoHeight", Dvpanel_unnamedtable7_Autoheight);
         ucDvpanel_unnamedtable7.setProperty("Cls", Dvpanel_unnamedtable7_Cls);
         ucDvpanel_unnamedtable7.setProperty("Title", Dvpanel_unnamedtable7_Title);
         ucDvpanel_unnamedtable7.setProperty("Collapsible", Dvpanel_unnamedtable7_Collapsible);
         ucDvpanel_unnamedtable7.setProperty("Collapsed", Dvpanel_unnamedtable7_Collapsed);
         ucDvpanel_unnamedtable7.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable7_Showcollapseicon);
         ucDvpanel_unnamedtable7.setProperty("IconPosition", Dvpanel_unnamedtable7_Iconposition);
         ucDvpanel_unnamedtable7.setProperty("AutoScroll", Dvpanel_unnamedtable7_Autoscroll);
         ucDvpanel_unnamedtable7.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable7_Internalname, "DVPANEL_UNNAMEDTABLE7Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE7Container"+"UnnamedTable7"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDir_Internalname, GXutil.rtrim( AV9Dir), GXutil.rtrim( localUtil.format( AV9Dir, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDir_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDir_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\PreparoXMLDocumentodeTransporteProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUserat_Internalname, GXutil.rtrim( AV15UserAT), GXutil.rtrim( localUtil.format( AV15UserAT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUserat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavUserat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\PreparoXMLDocumentodeTransporteProduccion.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPassat_Internalname, GXutil.rtrim( AV14PassAT), GXutil.rtrim( localUtil.format( AV14PassAT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPassat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPassat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(-1), (short)(0), 0, (byte)(0), (byte)(0), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\PreparoXMLDocumentodeTransporteProduccion.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
         ClassString = "Buttton" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\PreparoXMLDocumentodeTransporteProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\PreparoXMLDocumentodeTransporteProduccion.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCadena_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCadena_Internalname, httpContext.getMessage( "Cadena", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavCadena_Internalname, GXutil.rtrim( AV36Cadena), "", "", (short)(0), 1, edtavCadena_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "300", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_DocumentoTransporteProduccion\\PreparoXMLDocumentodeTransporteProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHash_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHash_Internalname, httpContext.getMessage( "Hash", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavHash_Internalname, GXutil.rtrim( AV37Hash), "", "", (short)(0), 1, edtavHash_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_DocumentoTransporteProduccion\\PreparoXMLDocumentodeTransporteProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnxml_Internalname, "", httpContext.getMessage( "XML", ""), bttBtnxml_Jsonclick, 5, httpContext.getMessage( "XML", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOXML\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\PreparoXMLDocumentodeTransporteProduccion.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFichero_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFichero_Internalname, httpContext.getMessage( "Fichero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFichero_Internalname, GXutil.rtrim( AV28Fichero), GXutil.rtrim( localUtil.format( AV28Fichero, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFichero_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFichero_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\PreparoXMLDocumentodeTransporteProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", divUnnamedtable3_Height, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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

   public void start2552( )
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
      strup2550( ) ;
   }

   public void ws2552( )
   {
      start2552( ) ;
      evt2552( ) ;
   }

   public void evt2552( )
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
                           e112552 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOXML'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoXML' */
                           e122552 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e132552 ();
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
                                 e142552 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e152552 ();
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

   public void we2552( )
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

   public void pa2552( )
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
      rf2552( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavDir_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDir_Enabled), 5, 0), true);
      edtavUserat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUserat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUserat_Enabled), 5, 0), true);
      edtavPassat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPassat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPassat_Enabled), 5, 0), true);
      edtavCadena_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCadena_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCadena_Enabled), 5, 0), true);
      edtavHash_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHash_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHash_Enabled), 5, 0), true);
      edtavFichero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFichero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFichero_Enabled), 5, 0), true);
   }

   public void rf2552( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e152552 ();
         wb2550( ) ;
      }
   }

   public void send_integrity_lvl_hashes2552( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavDir_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDir_Enabled), 5, 0), true);
      edtavUserat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUserat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUserat_Enabled), 5, 0), true);
      edtavPassat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPassat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPassat_Enabled), 5, 0), true);
      edtavCadena_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCadena_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCadena_Enabled), 5, 0), true);
      edtavHash_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHash_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHash_Enabled), 5, 0), true);
      edtavFichero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFichero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFichero_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2550( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e112552 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Dvpanel_unnamedtable7_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Width") ;
         Dvpanel_unnamedtable7_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Autowidth")) ;
         Dvpanel_unnamedtable7_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Autoheight")) ;
         Dvpanel_unnamedtable7_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Cls") ;
         Dvpanel_unnamedtable7_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Title") ;
         Dvpanel_unnamedtable7_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Collapsible")) ;
         Dvpanel_unnamedtable7_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Collapsed")) ;
         Dvpanel_unnamedtable7_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Showcollapseicon")) ;
         Dvpanel_unnamedtable7_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Iconposition") ;
         Dvpanel_unnamedtable7_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Autoscroll")) ;
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
         AV9Dir = httpContext.cgiGet( edtavDir_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Dir", AV9Dir);
         AV15UserAT = httpContext.cgiGet( edtavUserat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15UserAT", AV15UserAT);
         AV14PassAT = httpContext.cgiGet( edtavPassat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14PassAT", AV14PassAT);
         AV28Fichero = httpContext.cgiGet( edtavFichero_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Fichero", AV28Fichero);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"PreparoXMLDocumentodeTransporteProduccion");
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
            GXutil.writeLogError("documentotransporteproduccion\\preparoxmldocumentodetransporteproduccion:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e112552 ();
      if (returnInSub) return;
   }

   public void e112552( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV9Dir ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "SAFTW1", ""), GXv_char2) ;
      preparoxmldocumentodetransporteproduccion_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9Dir = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Dir", AV9Dir);
      if ( GXutil.strcmp(AV9Dir, "") == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Path ¡¡¡¡.Revisar Contador SAFTW1", ""));
         httpContext.setWebReturnParms(new Object[] {AV11EmprCod,Long.valueOf(AV48AlbProcod),localUtil.format( AV7AlbProSys, "99/99/99 99:99"),localUtil.format( AV6AlbProSal, "99/99/99 99:99"),AV47ALbProPri,AV36Cadena,AV37Hash});
         httpContext.setWebReturnParmsMetadata(new Object[] {"AV11EmprCod","AV48AlbProcod","AV7AlbProSys","AV6AlbProSal","AV47ALbProPri","AV36Cadena","AV37Hash"});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      GXt_char1 = AV15UserAT ;
      GXv_char2[0] = AV11EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "USEAT1", "") ;
      GXv_char4[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
      preparoxmldocumentodetransporteproduccion_impl.this.AV11EmprCod = GXv_char2[0] ;
      preparoxmldocumentodetransporteproduccion_impl.this.GXt_char1 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
      AV15UserAT = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15UserAT", AV15UserAT);
      GXt_char1 = AV14PassAT ;
      GXv_char4[0] = AV11EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "PASAT1", "") ;
      GXv_char2[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      preparoxmldocumentodetransporteproduccion_impl.this.AV11EmprCod = GXv_char4[0] ;
      preparoxmldocumentodetransporteproduccion_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
      AV14PassAT = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14PassAT", AV14PassAT);
      AV19Vurl = httpContext.getMessage( "urlt", "") ;
      GXt_char1 = AV19Vurl ;
      GXv_char4[0] = AV11EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "URL", "") ;
      GXv_char2[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      preparoxmldocumentodetransporteproduccion_impl.this.AV11EmprCod = GXv_char4[0] ;
      preparoxmldocumentodetransporteproduccion_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
      AV19Vurl = GXt_char1 ;
      GXt_char1 = AV18Vpfx ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "PFX", ""), GXv_char4) ;
      preparoxmldocumentodetransporteproduccion_impl.this.GXt_char1 = GXv_char4[0] ;
      AV18Vpfx = GXt_char1 ;
      GXt_char1 = AV17Vpasspfx ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "PASPFX", ""), GXv_char4) ;
      preparoxmldocumentodetransporteproduccion_impl.this.GXt_char1 = GXv_char4[0] ;
      AV17Vpasspfx = GXt_char1 ;
      GXt_int5 = AV16VerCom ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "APISEN", ""), GXv_int6) ;
      preparoxmldocumentodetransporteproduccion_impl.this.GXt_int5 = GXv_int6[0] ;
      AV16VerCom = GXt_int5 ;
      GXt_int5 = AV13hb ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "HEABOD", ""), GXv_int6) ;
      preparoxmldocumentodetransporteproduccion_impl.this.GXt_int5 = GXv_int6[0] ;
      AV13hb = GXt_int5 ;
      GXt_int5 = (byte)(AV8ATVeces) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "ATINTE", ""), GXv_int6) ;
      preparoxmldocumentodetransporteproduccion_impl.this.GXt_int5 = GXv_int6[0] ;
      AV8ATVeces = GXt_int5 ;
      GXt_int5 = (byte)(AV12endutex) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "ENDTEX", ""), GXv_int6) ;
      preparoxmldocumentodetransporteproduccion_impl.this.GXt_int5 = GXv_int6[0] ;
      AV12endutex = GXt_int5 ;
      /* Using cursor H02552 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A395EmprCif = H02552_A395EmprCif[0] ;
         n395EmprCif = H02552_n395EmprCif[0] ;
         AV10EmprCif = A395EmprCif ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV47ALbProPri, "1") == 0 )
      {
         GXv_char4[0] = AV50contidsernew ;
         new app.trabajosexternos.obtengocodigoserieat(remoteHandle, context).execute( AV11EmprCod, "666666", GXv_char4) ;
         preparoxmldocumentodetransporteproduccion_impl.this.AV50contidsernew = GXv_char4[0] ;
         AV51SerieAT = ((GXutil.strcmp("", AV50contidsernew)==0) ? "GR1" : AV50contidsernew) ;
         AV28Fichero = GXutil.trim( AV51SerieAT) + GXutil.padl( GXutil.trim( GXutil.str( AV48AlbProcod, 10, 0)), (short)(10), "0") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Fichero", AV28Fichero);
      }
      else
      {
         GXv_char4[0] = AV50contidsernew ;
         new app.trabajosexternos.obtengocodigoserieat(remoteHandle, context).execute( AV11EmprCod, "555555", GXv_char4) ;
         preparoxmldocumentodetransporteproduccion_impl.this.AV50contidsernew = GXv_char4[0] ;
         AV51SerieAT = ((GXutil.strcmp("", AV50contidsernew)==0) ? "GT2" : AV50contidsernew) ;
         AV28Fichero = GXutil.trim( AV51SerieAT) + GXutil.padl( GXutil.trim( GXutil.str( AV48AlbProcod, 10, 0)), (short)(10), "0") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Fichero", AV28Fichero);
      }
      AV35Path = GXutil.trim( AV9Dir) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Path", AV35Path);
      GXt_char1 = AV43Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      preparoxmldocumentodetransporteproduccion_impl.this.GXt_char1 = GXv_char4[0] ;
      AV43Station = GXt_char1 ;
      GXv_char4[0] = AV11EmprCod ;
      GXv_char3[0] = AV44EmprNom ;
      GXv_char2[0] = AV45UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV43Station, GXv_char4, GXv_char3, GXv_char2) ;
      preparoxmldocumentodetransporteproduccion_impl.this.AV11EmprCod = GXv_char4[0] ;
      preparoxmldocumentodetransporteproduccion_impl.this.AV44EmprNom = GXv_char3[0] ;
      preparoxmldocumentodetransporteproduccion_impl.this.AV45UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
      divUnnamedtable3_Height = 30 ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable3_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable3_Height), 9, 0), true);
   }

   public void e122552( )
   {
      /* 'DoXML' Routine */
      returnInSub = false ;
      Gx_msg = "" ;
      GXv_char4[0] = AV11EmprCod ;
      GXv_int7[0] = AV48AlbProcod ;
      GXv_char3[0] = AV35Path ;
      GXv_char2[0] = AV28Fichero ;
      GXv_objcol_SdtMessages_Message8[0] = AV38Messages ;
      GXv_boolean9[0] = AV39OK ;
      new app.pgrxml(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3, GXv_char2, GXv_objcol_SdtMessages_Message8, GXv_boolean9) ;
      preparoxmldocumentodetransporteproduccion_impl.this.AV11EmprCod = GXv_char4[0] ;
      preparoxmldocumentodetransporteproduccion_impl.this.AV48AlbProcod = GXv_int7[0] ;
      preparoxmldocumentodetransporteproduccion_impl.this.AV35Path = GXv_char3[0] ;
      preparoxmldocumentodetransporteproduccion_impl.this.AV28Fichero = GXv_char2[0] ;
      AV38Messages = GXv_objcol_SdtMessages_Message8[0] ;
      preparoxmldocumentodetransporteproduccion_impl.this.AV39OK = GXv_boolean9[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV48AlbProcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48AlbProcod), 10, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV35Path", AV35Path);
      httpContext.ajax_rsp_assign_attri("", false, "AV28Fichero", AV28Fichero);
      if ( (0==AV38Messages.size()) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Archivo XML creado correctamente en ", "")+AV35Path);
      }
      else
      {
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      /*  Sending Event outputs  */
   }

   public void e132552( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {AV11EmprCod,Long.valueOf(AV48AlbProcod),localUtil.format( AV7AlbProSys, "99/99/99 99:99"),localUtil.format( AV6AlbProSal, "99/99/99 99:99"),AV47ALbProPri,AV36Cadena,AV37Hash});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV11EmprCod","AV48AlbProcod","AV7AlbProSys","AV6AlbProSal","AV47ALbProPri","AV36Cadena","AV37Hash"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e142552 ();
      if (returnInSub) return;
   }

   public void e142552( )
   {
      /* Enter Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'CALPRD' */
      S112 ();
      if (returnInSub) return;
      if ( (0==AV27Lineas) )
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
            if ( (0==AV49Calprd) )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Nao Existe Documento¡¡¡", ""));
            }
            else
            {
               if ( (GXutil.strcmp("", AV25Albfmd)==0) )
               {
                  Gx_msg = httpContext.getMessage( "Atenção O código HASH está faltando.", "") + GXutil.newLine( ) ;
                  Gx_msg += httpContext.getMessage( "É necessário criar o HASH para o documento.", "") + GXutil.newLine( ) ;
                  httpContext.GX_msglist.addItem(Gx_msg);
               }
               else
               {
                  if ( GXutil.strcmp(AV47ALbProPri, "1") == 0 )
                  {
                     GXv_char4[0] = AV50contidsernew ;
                     new app.trabajosexternos.obtengocodigoserieat(remoteHandle, context).execute( AV11EmprCod, "666666", GXv_char4) ;
                     preparoxmldocumentodetransporteproduccion_impl.this.AV50contidsernew = GXv_char4[0] ;
                     AV51SerieAT = ((GXutil.strcmp("", AV50contidsernew)==0) ? "GR1" : AV50contidsernew) ;
                     AV28Fichero = GXutil.trim( AV51SerieAT) + GXutil.padl( GXutil.trim( GXutil.str( AV48AlbProcod, 10, 0)), (short)(10), "0") ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV28Fichero", AV28Fichero);
                  }
                  else
                  {
                     GXv_char4[0] = AV50contidsernew ;
                     new app.trabajosexternos.obtengocodigoserieat(remoteHandle, context).execute( AV11EmprCod, "555555", GXv_char4) ;
                     preparoxmldocumentodetransporteproduccion_impl.this.AV50contidsernew = GXv_char4[0] ;
                     AV51SerieAT = ((GXutil.strcmp("", AV50contidsernew)==0) ? "GT2" : AV50contidsernew) ;
                     AV28Fichero = GXutil.trim( AV51SerieAT) + GXutil.padl( GXutil.trim( GXutil.str( AV48AlbProcod, 10, 0)), (short)(10), "0") ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV28Fichero", AV28Fichero);
                  }
                  AV35Path = GXutil.trim( AV9Dir) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV35Path", AV35Path);
                  GXv_char4[0] = AV11EmprCod ;
                  GXv_int7[0] = AV48AlbProcod ;
                  GXv_char3[0] = AV35Path ;
                  GXv_char2[0] = AV28Fichero ;
                  GXv_objcol_SdtMessages_Message8[0] = AV38Messages ;
                  GXv_boolean9[0] = AV39OK ;
                  new app.pgrxml(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3, GXv_char2, GXv_objcol_SdtMessages_Message8, GXv_boolean9) ;
                  preparoxmldocumentodetransporteproduccion_impl.this.AV11EmprCod = GXv_char4[0] ;
                  preparoxmldocumentodetransporteproduccion_impl.this.AV48AlbProcod = GXv_int7[0] ;
                  preparoxmldocumentodetransporteproduccion_impl.this.AV35Path = GXv_char3[0] ;
                  preparoxmldocumentodetransporteproduccion_impl.this.AV28Fichero = GXv_char2[0] ;
                  AV38Messages = GXv_objcol_SdtMessages_Message8[0] ;
                  preparoxmldocumentodetransporteproduccion_impl.this.AV39OK = GXv_boolean9[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV48AlbProcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48AlbProcod), 10, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV35Path", AV35Path);
                  httpContext.ajax_rsp_assign_attri("", false, "AV28Fichero", AV28Fichero);
                  if ( ! AV39OK )
                  {
                     AV57GXV1 = 1 ;
                     while ( AV57GXV1 <= AV38Messages.size() )
                     {
                        AV40Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV38Messages.elementAt(-1+AV57GXV1));
                        httpContext.GX_msglist.addItem(AV40Message.getgxTv_SdtMessages_Message_Description());
                        AV57GXV1 = (int)(AV57GXV1+1) ;
                     }
                  }
                  else
                  {
                     GXv_objcol_SdtMessages_Message8[0] = AV38Messages ;
                     GXv_boolean9[0] = AV39OK ;
                     new app.at_comunicar(remoteHandle, context).execute( AV11EmprCod, AV28Fichero, AV15UserAT, AV14PassAT, GXv_objcol_SdtMessages_Message8, GXv_boolean9) ;
                     AV38Messages = GXv_objcol_SdtMessages_Message8[0] ;
                     preparoxmldocumentodetransporteproduccion_impl.this.AV39OK = GXv_boolean9[0] ;
                     AV42Messages_tojson = AV38Messages.toJSonString(false) ;
                     if ( GXutil.strcmp(AV47ALbProPri, "1") == 0 )
                     {
                        GXv_char4[0] = AV50contidsernew ;
                        new app.trabajosexternos.obtengocodigoserieat(remoteHandle, context).execute( AV11EmprCod, "666666", GXv_char4) ;
                        preparoxmldocumentodetransporteproduccion_impl.this.AV50contidsernew = GXv_char4[0] ;
                        AV51SerieAT = ((GXutil.strcmp("", AV50contidsernew)==0) ? "GR1" : AV50contidsernew) ;
                        AV33FileR = GXutil.trim( AV51SerieAT) + GXutil.padl( GXutil.trim( GXutil.str( AV48AlbProcod, 10, 0)), (short)(10), "0") ;
                     }
                     else
                     {
                        GXv_char4[0] = AV50contidsernew ;
                        new app.trabajosexternos.obtengocodigoserieat(remoteHandle, context).execute( AV11EmprCod, "555555", GXv_char4) ;
                        preparoxmldocumentodetransporteproduccion_impl.this.AV50contidsernew = GXv_char4[0] ;
                        AV51SerieAT = ((GXutil.strcmp("", AV50contidsernew)==0) ? "GT2" : AV50contidsernew) ;
                        AV33FileR = GXutil.trim( AV51SerieAT) + GXutil.padl( GXutil.trim( GXutil.str( AV48AlbProcod, 10, 0)), (short)(10), "0") ;
                     }
                     AV29File.setSource( GXutil.trim( AV9Dir)+"\\"+GXutil.trim( AV33FileR)+httpContext.getMessage( "result", "")+httpContext.getMessage( ".xml", "") );
                     AV41Var_File = AV29File.getAbsoluteName() ;
                     if ( AV39OK )
                     {
                        GXv_char4[0] = AV11EmprCod ;
                        GXv_char3[0] = AV28Fichero ;
                        GXv_int7[0] = AV48AlbProcod ;
                        GXv_char2[0] = AV47ALbProPri ;
                        GXv_objcol_SdtMessages_Message8[0] = AV38Messages ;
                        GXv_boolean9[0] = AV39OK ;
                        new app.documentotransporteproduccion.documentodetransporteproduccion_result(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int7, GXv_char2, GXv_objcol_SdtMessages_Message8, GXv_boolean9) ;
                        preparoxmldocumentodetransporteproduccion_impl.this.AV11EmprCod = GXv_char4[0] ;
                        preparoxmldocumentodetransporteproduccion_impl.this.AV28Fichero = GXv_char3[0] ;
                        preparoxmldocumentodetransporteproduccion_impl.this.AV48AlbProcod = GXv_int7[0] ;
                        preparoxmldocumentodetransporteproduccion_impl.this.AV47ALbProPri = GXv_char2[0] ;
                        AV38Messages = GXv_objcol_SdtMessages_Message8[0] ;
                        preparoxmldocumentodetransporteproduccion_impl.this.AV39OK = GXv_boolean9[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "AV28Fichero", AV28Fichero);
                        httpContext.ajax_rsp_assign_attri("", false, "AV48AlbProcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48AlbProcod), 10, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV47ALbProPri", AV47ALbProPri);
                        AV42Messages_tojson = AV38Messages.toJSonString(false) ;
                        httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_10", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV28Fichero)),GXutil.URLEncode(GXutil.ltrimstr(AV48AlbProcod,10,0)),GXutil.URLEncode(GXutil.rtrim(AV47ALbProPri)),GXutil.URLEncode(GXutil.rtrim(AV42Messages_tojson)),GXutil.URLEncode(GXutil.booltostr(AV39OK))}, new String[] {"Emprcod","Fichero","AlbProCod","ALbProPri","Messages_tojson","Ok"}) , new Object[] {});
                        if ( ! AV39OK )
                        {
                           AV58GXV2 = 1 ;
                           while ( AV58GXV2 <= AV38Messages.size() )
                           {
                              AV40Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV38Messages.elementAt(-1+AV58GXV2));
                              AV46Var_mensaje = AV40Message.getgxTv_SdtMessages_Message_Id() + GXutil.newLine( ) ;
                              AV46Var_mensaje += AV40Message.getgxTv_SdtMessages_Message_Description() + GXutil.newLine( ) ;
                              httpContext.GX_msglist.addItem(AV46Var_mensaje);
                              AV58GXV2 = (int)(AV58GXV2+1) ;
                           }
                        }
                        else
                        {
                           httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_5", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV48AlbProcod,10,0)),GXutil.URLEncode(GXutil.rtrim(AV52albmarca))}, new String[] {"AuxEmprcod","AlbProcod","albmarca"}) , new Object[] {});
                           httpContext.setWebReturnParms(new Object[] {AV11EmprCod,Long.valueOf(AV48AlbProcod),localUtil.format( AV7AlbProSys, "99/99/99 99:99"),localUtil.format( AV6AlbProSal, "99/99/99 99:99"),AV47ALbProPri,AV36Cadena,AV37Hash});
                           httpContext.setWebReturnParmsMetadata(new Object[] {"AV11EmprCod","AV48AlbProcod","AV7AlbProSys","AV6AlbProSal","AV47ALbProPri","AV36Cadena","AV37Hash"});
                           httpContext.wjLocDisableFrm = (byte)(1) ;
                           httpContext.nUserReturn = (byte)(1) ;
                           returnInSub = true;
                           if (true) return;
                        }
                     }
                     else
                     {
                        AV59GXV3 = 1 ;
                        while ( AV59GXV3 <= AV38Messages.size() )
                        {
                           AV40Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV38Messages.elementAt(-1+AV59GXV3));
                           AV46Var_mensaje = AV40Message.getgxTv_SdtMessages_Message_Id() + GXutil.newLine( ) ;
                           AV46Var_mensaje += AV40Message.getgxTv_SdtMessages_Message_Description() + GXutil.newLine( ) ;
                           httpContext.GX_msglist.addItem(AV46Var_mensaje);
                           AV59GXV3 = (int)(AV59GXV3+1) ;
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
      /* Using cursor H02553 */
      pr_default.execute(1, new Object[] {AV11EmprCod, Long.valueOf(AV48AlbProcod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A30AlbProCod = H02553_A30AlbProCod[0] ;
         A396EmprCod = H02553_A396EmprCod[0] ;
         A34AlbProfch = H02553_A34AlbProfch[0] ;
         A7101AlbLic = H02553_A7101AlbLic[0] ;
         A10017AlbFmd = H02553_A10017AlbFmd[0] ;
         n10017AlbFmd = H02553_n10017AlbFmd[0] ;
         A5140AlbMarca = H02553_A5140AlbMarca[0] ;
         AV22AlbProfch = A34AlbProfch ;
         AV23ALbLic = A7101AlbLic ;
         AV49Calprd = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49Calprd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49Calprd), 4, 0));
         AV24AlbCOmcod = (int)(A30AlbProCod) ;
         AV25Albfmd = A10017AlbFmd ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25Albfmd", AV25Albfmd);
         AV52albmarca = A5140AlbMarca ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52albmarca", AV52albmarca);
         AV27Lineas = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Lineas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Lineas), 4, 0));
         /* Optimized group. */
         /* Using cursor H02554 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         cV27Lineas = H02554_AV27Lineas[0] ;
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

   protected void e152552( )
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
      AV7AlbProSys = (java.util.Date)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7AlbProSys", localUtil.ttoc( AV7AlbProSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      pa2552( ) ;
      ws2552( ) ;
      we2552( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415131985", true, true);
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
      httpContext.AddJavascriptSource("documentotransporteproduccion/preparoxmldocumentodetransporteproduccion.js", "?202682415131985", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavDir_Internalname = "vDIR" ;
      edtavUserat_Internalname = "vUSERAT" ;
      edtavPassat_Internalname = "vPASSAT" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      Dvpanel_unnamedtable7_Internalname = "DVPANEL_UNNAMEDTABLE7" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtavCadena_Internalname = "vCADENA" ;
      edtavHash_Internalname = "vHASH" ;
      bttBtnxml_Internalname = "BTNXML" ;
      edtavFichero_Internalname = "vFICHERO" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
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
      divUnnamedtable3_Height = 0 ;
      edtavFichero_Jsonclick = "" ;
      edtavFichero_Enabled = 1 ;
      edtavHash_Enabled = 0 ;
      edtavCadena_Enabled = 0 ;
      edtavPassat_Jsonclick = "" ;
      edtavPassat_Enabled = 1 ;
      edtavUserat_Jsonclick = "" ;
      edtavUserat_Enabled = 1 ;
      edtavDir_Jsonclick = "" ;
      edtavDir_Enabled = 1 ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "AT", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
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
      Dvpanel_unnamedtable7_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Iconposition = "Right" ;
      Dvpanel_unnamedtable7_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable7_Title = httpContext.getMessage( "Informacion Envio Web Service AT", "") ;
      Dvpanel_unnamedtable7_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable7_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable7_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Width = "100%" ;
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
      setEventMetadata("'DOXML'","{handler:'e122552',iparms:[{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48AlbProcod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV35Path',fld:'vPATH',pic:''},{av:'AV28Fichero',fld:'vFICHERO',pic:''}]");
      setEventMetadata("'DOXML'",",oparms:[{av:'AV28Fichero',fld:'vFICHERO',pic:''},{av:'AV35Path',fld:'vPATH',pic:''},{av:'AV48AlbProcod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e132552',iparms:[{av:'AV37Hash',fld:'vHASH',pic:''},{av:'AV36Cadena',fld:'vCADENA',pic:''},{av:'AV47ALbProPri',fld:'vALBPROPRI',pic:'9'},{av:'AV6AlbProSal',fld:'vALBPROSAL',pic:'99/99/99 99:99'},{av:'AV7AlbProSys',fld:'vALBPROSYS',pic:'99/99/99 99:99'},{av:'AV48AlbProcod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("ENTER","{handler:'e142552',iparms:[{av:'AV27Lineas',fld:'vLINEAS',pic:'ZZZ9'},{av:'AV9Dir',fld:'vDIR',pic:''},{av:'AV49Calprd',fld:'vCALPRD',pic:'ZZZ9'},{av:'AV25Albfmd',fld:'vALBFMD',pic:''},{av:'AV47ALbProPri',fld:'vALBPROPRI',pic:'9'},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48AlbProcod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV15UserAT',fld:'vUSERAT',pic:''},{av:'AV14PassAT',fld:'vPASSAT',pic:''},{av:'AV52albmarca',fld:'vALBMARCA',pic:''},{av:'AV37Hash',fld:'vHASH',pic:''},{av:'AV36Cadena',fld:'vCADENA',pic:''},{av:'AV6AlbProSal',fld:'vALBPROSAL',pic:'99/99/99 99:99'},{av:'AV7AlbProSys',fld:'vALBPROSYS',pic:'99/99/99 99:99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'A7101AlbLic',fld:'ALBLIC',pic:''},{av:'A10017AlbFmd',fld:'ALBFMD',pic:''},{av:'A5140AlbMarca',fld:'ALBMARCA',pic:''},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV28Fichero',fld:'vFICHERO',pic:''},{av:'AV35Path',fld:'vPATH',pic:''},{av:'AV48AlbProcod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV47ALbProPri',fld:'vALBPROPRI',pic:'9'},{av:'AV49Calprd',fld:'vCALPRD',pic:'ZZZ9'},{av:'AV25Albfmd',fld:'vALBFMD',pic:''},{av:'AV52albmarca',fld:'vALBMARCA',pic:''},{av:'AV27Lineas',fld:'vLINEAS',pic:'ZZZ9'}]}");
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
      wcpOAV7AlbProSys = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV6AlbProSal = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV47ALbProPri = "" ;
      wcpOAV36Cadena = "" ;
      wcpOAV37Hash = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV11EmprCod = "" ;
      AV7AlbProSys = GXutil.resetTime( GXutil.nullDate() );
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
      AV35Path = "" ;
      AV25Albfmd = "" ;
      AV52albmarca = "" ;
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
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable7 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      bttBtnxml_Jsonclick = "" ;
      AV28Fichero = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      hsh = "" ;
      AV19Vurl = "" ;
      AV18Vpfx = "" ;
      AV17Vpasspfx = "" ;
      GXv_int6 = new byte[1] ;
      scmdbuf = "" ;
      H02552_A396EmprCod = new String[] {""} ;
      H02552_A395EmprCif = new String[] {""} ;
      H02552_n395EmprCif = new boolean[] {false} ;
      A395EmprCif = "" ;
      AV10EmprCif = "" ;
      AV50contidsernew = "" ;
      AV51SerieAT = "" ;
      AV43Station = "" ;
      GXt_char1 = "" ;
      AV44EmprNom = "" ;
      AV45UsurCod = "" ;
      Gx_msg = "" ;
      AV38Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV40Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV42Messages_tojson = "" ;
      AV33FileR = "" ;
      AV29File = new com.genexus.util.GXFile();
      AV41Var_File = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int7 = new long[1] ;
      GXv_char2 = new String[1] ;
      GXv_objcol_SdtMessages_Message8 = new GXBaseCollection[1] ;
      GXv_boolean9 = new boolean[1] ;
      AV46Var_mensaje = "" ;
      H02553_A30AlbProCod = new long[1] ;
      H02553_A396EmprCod = new String[] {""} ;
      H02553_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H02553_A7101AlbLic = new String[] {""} ;
      H02553_A10017AlbFmd = new String[] {""} ;
      H02553_n10017AlbFmd = new boolean[] {false} ;
      H02553_A5140AlbMarca = new String[] {""} ;
      AV22AlbProfch = GXutil.nullDate() ;
      AV23ALbLic = "" ;
      H02554_AV27Lineas = new short[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.preparoxmldocumentodetransporteproduccion__default(),
         new Object[] {
             new Object[] {
            H02552_A396EmprCod, H02552_A395EmprCif, H02552_n395EmprCif
            }
            , new Object[] {
            H02553_A30AlbProCod, H02553_A396EmprCod, H02553_A34AlbProfch, H02553_A7101AlbLic, H02553_A10017AlbFmd, H02553_n10017AlbFmd, H02553_A5140AlbMarca
            }
            , new Object[] {
            H02554_AV27Lineas
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavDir_Enabled = 0 ;
      edtavUserat_Enabled = 0 ;
      edtavPassat_Enabled = 0 ;
      edtavCadena_Enabled = 0 ;
      edtavHash_Enabled = 0 ;
      edtavFichero_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte AV16VerCom ;
   private byte AV13hb ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
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
   private int edtavDir_Enabled ;
   private int edtavUserat_Enabled ;
   private int edtavPassat_Enabled ;
   private int edtavCadena_Enabled ;
   private int edtavHash_Enabled ;
   private int edtavFichero_Enabled ;
   private int divUnnamedtable3_Height ;
   private int AV57GXV1 ;
   private int AV58GXV2 ;
   private int AV59GXV3 ;
   private int AV24AlbCOmcod ;
   private int idxLst ;
   private long wcpOAV48AlbProcod ;
   private long AV48AlbProcod ;
   private long A30AlbProCod ;
   private long GXv_int7[] ;
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
   private String AV52albmarca ;
   private String A396EmprCod ;
   private String A7101AlbLic ;
   private String A5140AlbMarca ;
   private String Dvpanel_unnamedtable7_Width ;
   private String Dvpanel_unnamedtable7_Cls ;
   private String Dvpanel_unnamedtable7_Title ;
   private String Dvpanel_unnamedtable7_Iconposition ;
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
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
   private String divTablecontent_Internalname ;
   private String Dvpanel_panel_filtros_Internalname ;
   private String divPanel_filtros_Internalname ;
   private String Dvpanel_unnamedtable7_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String edtavDir_Internalname ;
   private String TempTags ;
   private String edtavDir_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String edtavUserat_Internalname ;
   private String edtavUserat_Jsonclick ;
   private String edtavPassat_Internalname ;
   private String edtavPassat_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavCadena_Internalname ;
   private String edtavHash_Internalname ;
   private String bttBtnxml_Internalname ;
   private String bttBtnxml_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String edtavFichero_Internalname ;
   private String AV28Fichero ;
   private String edtavFichero_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String divUnnamedtable3_Internalname ;
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
   private String AV43Station ;
   private String GXt_char1 ;
   private String AV44EmprNom ;
   private String AV45UsurCod ;
   private String Gx_msg ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV23ALbLic ;
   private java.util.Date wcpOAV7AlbProSys ;
   private java.util.Date wcpOAV6AlbProSal ;
   private java.util.Date AV7AlbProSys ;
   private java.util.Date AV6AlbProSal ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date AV22AlbProfch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_unnamedtable7_Autowidth ;
   private boolean Dvpanel_unnamedtable7_Autoheight ;
   private boolean Dvpanel_unnamedtable7_Collapsible ;
   private boolean Dvpanel_unnamedtable7_Collapsed ;
   private boolean Dvpanel_unnamedtable7_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable7_Autoscroll ;
   private boolean Dvpanel_panel_filtros_Autowidth ;
   private boolean Dvpanel_panel_filtros_Autoheight ;
   private boolean Dvpanel_panel_filtros_Collapsible ;
   private boolean Dvpanel_panel_filtros_Collapsed ;
   private boolean Dvpanel_panel_filtros_Showcollapseicon ;
   private boolean Dvpanel_panel_filtros_Autoscroll ;
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
   private boolean AV39OK ;
   private boolean GXv_boolean9[] ;
   private boolean n10017AlbFmd ;
   private String AV35Path ;
   private String AV25Albfmd ;
   private String A10017AlbFmd ;
   private String AV42Messages_tojson ;
   private String AV33FileR ;
   private String AV41Var_File ;
   private String AV46Var_mensaje ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable7 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.util.GXFile AV29File ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H02552_A396EmprCod ;
   private String[] H02552_A395EmprCif ;
   private boolean[] H02552_n395EmprCif ;
   private long[] H02553_A30AlbProCod ;
   private String[] H02553_A396EmprCod ;
   private java.util.Date[] H02553_A34AlbProfch ;
   private String[] H02553_A7101AlbLic ;
   private String[] H02553_A10017AlbFmd ;
   private boolean[] H02553_n10017AlbFmd ;
   private String[] H02553_A5140AlbMarca ;
   private short[] H02554_AV27Lineas ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV38Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message8[] ;
   private com.genexus.SdtMessages_Message AV40Message ;
}

final  class preparoxmldocumentodetransporteproduccion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02552", "SELECT EmprCod, EmprCif FROM TXPEMPRES ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02553", "SELECT AlbProCod, EmprCod, AlbProfch, AlbLic, AlbFmd, AlbMarca FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H02554", "SELECT COUNT(*) FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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

