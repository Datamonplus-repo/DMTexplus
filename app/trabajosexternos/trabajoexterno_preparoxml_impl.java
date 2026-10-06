package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class trabajoexterno_preparoxml_impl extends GXDataArea
{
   public trabajoexterno_preparoxml_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public trabajoexterno_preparoxml_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_preparoxml_impl.class ));
   }

   public trabajoexterno_preparoxml_impl( int remoteHandle ,
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
               AV50SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV50SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50SalExtAlb), 8, 0));
               AV51SalFhh = localUtil.parseDTimeParm( httpContext.GetPar( "SalFhh")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV51SalFhh", localUtil.ttoc( AV51SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV52SalExtHor = httpContext.GetPar( "SalExtHor") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV52SalExtHor", AV52SalExtHor);
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
      pa27F2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start27F2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.trabajosexternos.trabajoexterno_preparoxml", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV50SalExtAlb,8,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV51SalFhh)),GXutil.URLEncode(GXutil.rtrim(AV52SalExtHor)),GXutil.URLEncode(GXutil.rtrim(AV36Cadena)),GXutil.URLEncode(GXutil.rtrim(AV37Hash))}, new String[] {"EmprCod","SalExtAlb","SalFhh","SalExtHor","Cadena","Hash"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSERIEAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV54SerieAT, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TrabajoExterno_PreparoXML");
      forbiddenHiddens.add("Dir", GXutil.rtrim( localUtil.format( AV9Dir, "")));
      forbiddenHiddens.add("UserAT", GXutil.rtrim( localUtil.format( AV15UserAT, "")));
      forbiddenHiddens.add("PassAT", GXutil.rtrim( localUtil.format( AV14PassAT, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("trabajosexternos\\trabajoexterno_preparoxml:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV11EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSALEXTALB", GXutil.ltrim( localUtil.ntoc( AV50SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPATH", AV35Path);
      app.GxWebStd.gx_hidden_field( httpContext, "vSALEXTHOR", GXutil.rtrim( AV52SalExtHor));
      app.GxWebStd.gx_hidden_field( httpContext, "vSALFHH", localUtil.ttoc( AV51SalFhh, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vLINEAS", GXutil.ltrim( localUtil.ntoc( AV27Lineas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCALPRD", GXutil.ltrim( localUtil.ntoc( AV49Calprd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBFMD", AV25Albfmd);
      app.GxWebStd.gx_hidden_field( httpContext, "vSERIEAT", GXutil.rtrim( AV54SerieAT));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSERIEAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV54SerieAT, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXTALB", GXutil.ltrim( localUtil.ntoc( A2253SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXTFEC", localUtil.dtoc( A2256SalExtFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "SALCODEID", GXutil.rtrim( A10742SalCodeID));
      app.GxWebStd.gx_hidden_field( httpContext, "SALFMD", GXutil.rtrim( A10077SalFmd));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXNLN", GXutil.ltrim( localUtil.ntoc( A6248SalExNln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
         we27F2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt27F2( ) ;
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
      return formatLink("app.trabajosexternos.trabajoexterno_preparoxml", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV50SalExtAlb,8,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV51SalFhh)),GXutil.URLEncode(GXutil.rtrim(AV52SalExtHor)),GXutil.URLEncode(GXutil.rtrim(AV36Cadena)),GXutil.URLEncode(GXutil.rtrim(AV37Hash))}, new String[] {"EmprCod","SalExtAlb","SalFhh","SalExtHor","Cadena","Hash"})  ;
   }

   public String getPgmname( )
   {
      return "TrabajosExternos.TrabajoExterno_PreparoXML" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Preparo XML AT Trabajo Externo", "") ;
   }

   public void wb27F0( )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDir_Internalname, GXutil.rtrim( AV9Dir), GXutil.rtrim( localUtil.format( AV9Dir, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDir_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDir_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_PreparoXML.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUserat_Internalname, GXutil.rtrim( AV15UserAT), GXutil.rtrim( localUtil.format( AV15UserAT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUserat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavUserat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_PreparoXML.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPassat_Internalname, GXutil.rtrim( AV14PassAT), GXutil.rtrim( localUtil.format( AV14PassAT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPassat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPassat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(-1), (short)(0), 0, (byte)(0), (byte)(0), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_PreparoXML.htm");
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
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajosExternos\\TrabajoExterno_PreparoXML.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajosExternos\\TrabajoExterno_PreparoXML.htm");
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
         app.GxWebStd.gx_html_textarea( httpContext, edtavCadena_Internalname, GXutil.rtrim( AV36Cadena), "", "", (short)(0), 1, edtavCadena_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "300", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TrabajosExternos\\TrabajoExterno_PreparoXML.htm");
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
         app.GxWebStd.gx_html_textarea( httpContext, edtavHash_Internalname, GXutil.rtrim( AV37Hash), "", "", (short)(0), 1, edtavHash_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TrabajosExternos\\TrabajoExterno_PreparoXML.htm");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnxml_Internalname, "", httpContext.getMessage( "XML", ""), bttBtnxml_Jsonclick, 5, httpContext.getMessage( "XML", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOXML\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajosExternos\\TrabajoExterno_PreparoXML.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFichero_Internalname, GXutil.rtrim( AV28Fichero), GXutil.rtrim( localUtil.format( AV28Fichero, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFichero_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFichero_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_PreparoXML.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV57Pgmname), GXutil.rtrim( localUtil.format( AV57Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_PreparoXML.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start27F2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Preparo XML AT Trabajo Externo", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup27F0( ) ;
   }

   public void ws27F2( )
   {
      start27F2( ) ;
      evt27F2( ) ;
   }

   public void evt27F2( )
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
                           e1127F2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOXML'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoXML' */
                           e1227F2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e1327F2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoConfirmar' */
                           e1427F2 ();
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
                                 e1527F2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e1627F2 ();
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

   public void we27F2( )
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

   public void pa27F2( )
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
      rf27F2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV57Pgmname = "TrabajosExternos.TrabajoExterno_PreparoXML" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57Pgmname", AV57Pgmname);
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
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf27F2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1627F2 ();
         wb27F0( ) ;
      }
   }

   public void send_integrity_lvl_hashes27F2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vSERIEAT", GXutil.rtrim( AV54SerieAT));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSERIEAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV54SerieAT, ""))));
   }

   public void before_start_formulas( )
   {
      AV57Pgmname = "TrabajosExternos.TrabajoExterno_PreparoXML" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57Pgmname", AV57Pgmname);
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
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup27F0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1127F2 ();
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
         AV57Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57Pgmname", AV57Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TrabajoExterno_PreparoXML");
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
            GXutil.writeLogError("trabajosexternos\\trabajoexterno_preparoxml:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1127F2 ();
      if (returnInSub) return;
   }

   public void e1127F2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV9Dir ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "SAFTW1", ""), GXv_char2) ;
      trabajoexterno_preparoxml_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9Dir = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Dir", AV9Dir);
      if ( GXutil.strcmp(AV9Dir, "") == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Path ¡¡¡¡.Revisar Contador SAFTW1", ""));
         httpContext.setWebReturnParms(new Object[] {AV11EmprCod,Integer.valueOf(AV50SalExtAlb),localUtil.format( AV51SalFhh, "99/99/99 99:99"),AV52SalExtHor,AV36Cadena,AV37Hash});
         httpContext.setWebReturnParmsMetadata(new Object[] {"AV11EmprCod","AV50SalExtAlb","AV51SalFhh","AV52SalExtHor","AV36Cadena","AV37Hash"});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      GXt_char1 = AV15UserAT ;
      GXv_char2[0] = AV11EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "USEAT4", "") ;
      GXv_char4[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
      trabajoexterno_preparoxml_impl.this.AV11EmprCod = GXv_char2[0] ;
      trabajoexterno_preparoxml_impl.this.GXt_char1 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
      AV15UserAT = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15UserAT", AV15UserAT);
      GXt_char1 = AV14PassAT ;
      GXv_char4[0] = AV11EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "PASAT4", "") ;
      GXv_char2[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      trabajoexterno_preparoxml_impl.this.AV11EmprCod = GXv_char4[0] ;
      trabajoexterno_preparoxml_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
      AV14PassAT = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14PassAT", AV14PassAT);
      AV19Vurl = httpContext.getMessage( "urlt", "") ;
      GXt_char1 = AV19Vurl ;
      GXv_char4[0] = AV11EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "URL", "") ;
      GXv_char2[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      trabajoexterno_preparoxml_impl.this.AV11EmprCod = GXv_char4[0] ;
      trabajoexterno_preparoxml_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
      AV19Vurl = GXt_char1 ;
      GXt_char1 = AV18Vpfx ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "PFX", ""), GXv_char4) ;
      trabajoexterno_preparoxml_impl.this.GXt_char1 = GXv_char4[0] ;
      AV18Vpfx = GXt_char1 ;
      GXt_char1 = AV17Vpasspfx ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "PASPFX", ""), GXv_char4) ;
      trabajoexterno_preparoxml_impl.this.GXt_char1 = GXv_char4[0] ;
      AV17Vpasspfx = GXt_char1 ;
      GXt_int5 = AV16VerCom ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "APISEN", ""), GXv_int6) ;
      trabajoexterno_preparoxml_impl.this.GXt_int5 = GXv_int6[0] ;
      AV16VerCom = GXt_int5 ;
      GXt_int5 = AV13hb ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "HEABOD", ""), GXv_int6) ;
      trabajoexterno_preparoxml_impl.this.GXt_int5 = GXv_int6[0] ;
      AV13hb = GXt_int5 ;
      GXt_int5 = (byte)(AV8ATVeces) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "ATINTE", ""), GXv_int6) ;
      trabajoexterno_preparoxml_impl.this.GXt_int5 = GXv_int6[0] ;
      AV8ATVeces = GXt_int5 ;
      GXt_int5 = (byte)(AV12endutex) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "ENDTEX", ""), GXv_int6) ;
      trabajoexterno_preparoxml_impl.this.GXt_int5 = GXv_int6[0] ;
      AV12endutex = GXt_int5 ;
      /* Using cursor H027F2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A395EmprCif = H027F2_A395EmprCif[0] ;
         n395EmprCif = H027F2_n395EmprCif[0] ;
         AV10EmprCif = A395EmprCif ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      GXv_char4[0] = AV53contidsernew ;
      new app.trabajosexternos.obtengocodigoserieat(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "EXTHDR", ""), GXv_char4) ;
      trabajoexterno_preparoxml_impl.this.AV53contidsernew = GXv_char4[0] ;
      AV54SerieAT = ((GXutil.strcmp("", AV53contidsernew)==0) ? "GT5" : AV53contidsernew) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54SerieAT", AV54SerieAT);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSERIEAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV54SerieAT, ""))));
      AV28Fichero = GXutil.trim( AV54SerieAT) + GXutil.padl( GXutil.trim( GXutil.str( AV50SalExtAlb, 8, 0)), (short)(8), "0") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Fichero", AV28Fichero);
      AV35Path = GXutil.trim( AV9Dir) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Path", AV35Path);
      GXt_char1 = AV43Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      trabajoexterno_preparoxml_impl.this.GXt_char1 = GXv_char4[0] ;
      AV43Station = GXt_char1 ;
      GXv_char4[0] = AV11EmprCod ;
      GXv_char3[0] = AV44EmprNom ;
      GXv_char2[0] = AV45UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV43Station, GXv_char4, GXv_char3, GXv_char2) ;
      trabajoexterno_preparoxml_impl.this.AV11EmprCod = GXv_char4[0] ;
      trabajoexterno_preparoxml_impl.this.AV44EmprNom = GXv_char3[0] ;
      trabajoexterno_preparoxml_impl.this.AV45UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
      divUnnamedtable3_Height = 30 ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable3_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable3_Height), 9, 0), true);
   }

   public void e1227F2( )
   {
      /* 'DoXML' Routine */
      returnInSub = false ;
      Gx_msg = "" ;
      GXv_char4[0] = AV11EmprCod ;
      GXv_int7[0] = AV50SalExtAlb ;
      GXv_char3[0] = AV35Path ;
      GXv_char2[0] = AV28Fichero ;
      GXv_objcol_SdtMessages_Message8[0] = AV38Messages ;
      GXv_boolean9[0] = AV39OK ;
      new app.trabajosexternos.ptexml2(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3, GXv_char2, GXv_objcol_SdtMessages_Message8, GXv_boolean9) ;
      trabajoexterno_preparoxml_impl.this.AV11EmprCod = GXv_char4[0] ;
      trabajoexterno_preparoxml_impl.this.AV50SalExtAlb = GXv_int7[0] ;
      trabajoexterno_preparoxml_impl.this.AV35Path = GXv_char3[0] ;
      trabajoexterno_preparoxml_impl.this.AV28Fichero = GXv_char2[0] ;
      AV38Messages = GXv_objcol_SdtMessages_Message8[0] ;
      trabajoexterno_preparoxml_impl.this.AV39OK = GXv_boolean9[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV50SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50SalExtAlb), 8, 0));
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

   public void e1327F2( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {AV11EmprCod,Integer.valueOf(AV50SalExtAlb),localUtil.format( AV51SalFhh, "99/99/99 99:99"),AV52SalExtHor,AV36Cadena,AV37Hash});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV11EmprCod","AV50SalExtAlb","AV51SalFhh","AV52SalExtHor","AV36Cadena","AV37Hash"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e1427F2( )
   {
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'CEXTSA' */
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
                  AV28Fichero = GXutil.trim( AV54SerieAT) + GXutil.padl( GXutil.trim( GXutil.str( AV50SalExtAlb, 8, 0)), (short)(8), "0") ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV28Fichero", AV28Fichero);
                  AV35Path = GXutil.trim( AV9Dir) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV35Path", AV35Path);
                  GXv_char4[0] = AV11EmprCod ;
                  GXv_int7[0] = AV50SalExtAlb ;
                  GXv_char3[0] = AV35Path ;
                  GXv_char2[0] = AV28Fichero ;
                  GXv_objcol_SdtMessages_Message8[0] = AV38Messages ;
                  GXv_boolean9[0] = AV39OK ;
                  new app.trabajosexternos.ptexml2(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3, GXv_char2, GXv_objcol_SdtMessages_Message8, GXv_boolean9) ;
                  trabajoexterno_preparoxml_impl.this.AV11EmprCod = GXv_char4[0] ;
                  trabajoexterno_preparoxml_impl.this.AV50SalExtAlb = GXv_int7[0] ;
                  trabajoexterno_preparoxml_impl.this.AV35Path = GXv_char3[0] ;
                  trabajoexterno_preparoxml_impl.this.AV28Fichero = GXv_char2[0] ;
                  AV38Messages = GXv_objcol_SdtMessages_Message8[0] ;
                  trabajoexterno_preparoxml_impl.this.AV39OK = GXv_boolean9[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV50SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50SalExtAlb), 8, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV35Path", AV35Path);
                  httpContext.ajax_rsp_assign_attri("", false, "AV28Fichero", AV28Fichero);
                  if ( ! AV39OK )
                  {
                     AV60GXV1 = 1 ;
                     while ( AV60GXV1 <= AV38Messages.size() )
                     {
                        AV40Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV38Messages.elementAt(-1+AV60GXV1));
                        httpContext.GX_msglist.addItem(AV40Message.getgxTv_SdtMessages_Message_Description());
                        AV60GXV1 = (int)(AV60GXV1+1) ;
                     }
                  }
                  else
                  {
                     GXv_objcol_SdtMessages_Message8[0] = AV38Messages ;
                     GXv_boolean9[0] = AV39OK ;
                     new app.at_comunicar(remoteHandle, context).execute( AV11EmprCod, AV28Fichero, AV15UserAT, AV14PassAT, GXv_objcol_SdtMessages_Message8, GXv_boolean9) ;
                     AV38Messages = GXv_objcol_SdtMessages_Message8[0] ;
                     trabajoexterno_preparoxml_impl.this.AV39OK = GXv_boolean9[0] ;
                     AV42Messages_tojson = AV38Messages.toJSonString(false) ;
                     AV33FileR = GXutil.trim( AV54SerieAT) + GXutil.padl( GXutil.trim( GXutil.str( AV50SalExtAlb, 8, 0)), (short)(8), "0") ;
                     AV29File.setSource( GXutil.trim( AV9Dir)+"\\"+GXutil.trim( AV33FileR)+httpContext.getMessage( "result", "")+httpContext.getMessage( ".xml", "") );
                     AV41Var_File = AV29File.getAbsoluteName() ;
                     if ( AV39OK )
                     {
                        GXv_char4[0] = AV11EmprCod ;
                        GXv_char3[0] = AV28Fichero ;
                        GXv_int10[0] = AV50SalExtAlb ;
                        GXv_objcol_SdtMessages_Message8[0] = AV38Messages ;
                        GXv_boolean9[0] = AV39OK ;
                        new app.trabajosexternos.trabajoexterno_result(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int10, GXv_objcol_SdtMessages_Message8, GXv_boolean9) ;
                        trabajoexterno_preparoxml_impl.this.AV11EmprCod = GXv_char4[0] ;
                        trabajoexterno_preparoxml_impl.this.AV28Fichero = GXv_char3[0] ;
                        trabajoexterno_preparoxml_impl.this.AV50SalExtAlb = (int)((int)(GXv_int10[0])) ;
                        AV38Messages = GXv_objcol_SdtMessages_Message8[0] ;
                        trabajoexterno_preparoxml_impl.this.AV39OK = GXv_boolean9[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "AV28Fichero", AV28Fichero);
                        httpContext.ajax_rsp_assign_attri("", false, "AV50SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50SalExtAlb), 8, 0));
                        AV42Messages_tojson = AV38Messages.toJSonString(false) ;
                        httpContext.popup(formatLink("app.trabajosexternos.trabajoexterno_informeficheroresult", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV28Fichero)),GXutil.URLEncode(GXutil.ltrimstr(AV50SalExtAlb,8,0)),GXutil.URLEncode(GXutil.rtrim(AV42Messages_tojson)),GXutil.URLEncode(GXutil.booltostr(AV39OK))}, new String[] {"Emprcod","Fichero","AlbProCod","Messages_tojson","Ok"}) , new Object[] {});
                        if ( ! AV39OK )
                        {
                           AV61GXV2 = 1 ;
                           while ( AV61GXV2 <= AV38Messages.size() )
                           {
                              AV40Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV38Messages.elementAt(-1+AV61GXV2));
                              AV46Var_mensaje = AV40Message.getgxTv_SdtMessages_Message_Id() + GXutil.newLine( ) ;
                              AV46Var_mensaje += AV40Message.getgxTv_SdtMessages_Message_Description() + GXutil.newLine( ) ;
                              httpContext.GX_msglist.addItem(AV46Var_mensaje);
                              AV61GXV2 = (int)(AV61GXV2+1) ;
                           }
                        }
                        else
                        {
                           httpContext.popup(formatLink("app.trabajosexternos.trabajoexterno_impresion", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV50SalExtAlb,8,0))}, new String[] {"Emprcod","SalExtAlb"}) , new Object[] {});
                           httpContext.setWebReturnParms(new Object[] {AV11EmprCod,Integer.valueOf(AV50SalExtAlb),localUtil.format( AV51SalFhh, "99/99/99 99:99"),AV52SalExtHor,AV36Cadena,AV37Hash});
                           httpContext.setWebReturnParmsMetadata(new Object[] {"AV11EmprCod","AV50SalExtAlb","AV51SalFhh","AV52SalExtHor","AV36Cadena","AV37Hash"});
                           httpContext.wjLocDisableFrm = (byte)(1) ;
                           httpContext.nUserReturn = (byte)(1) ;
                           returnInSub = true;
                           if (true) return;
                        }
                     }
                     else
                     {
                        AV62GXV3 = 1 ;
                        while ( AV62GXV3 <= AV38Messages.size() )
                        {
                           AV40Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV38Messages.elementAt(-1+AV62GXV3));
                           AV46Var_mensaje = AV40Message.getgxTv_SdtMessages_Message_Id() + GXutil.newLine( ) ;
                           AV46Var_mensaje += AV40Message.getgxTv_SdtMessages_Message_Description() + GXutil.newLine( ) ;
                           httpContext.GX_msglist.addItem(AV46Var_mensaje);
                           AV62GXV3 = (int)(AV62GXV3+1) ;
                        }
                     }
                  }
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e1527F2 ();
      if (returnInSub) return;
   }

   public void e1527F2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'CEXTSA' */
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
                  AV28Fichero = GXutil.trim( AV54SerieAT) + GXutil.padl( GXutil.trim( GXutil.str( AV50SalExtAlb, 8, 0)), (short)(8), "0") ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV28Fichero", AV28Fichero);
                  AV35Path = GXutil.trim( AV9Dir) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV35Path", AV35Path);
                  GXv_char4[0] = AV11EmprCod ;
                  GXv_int7[0] = AV50SalExtAlb ;
                  GXv_char3[0] = AV35Path ;
                  GXv_char2[0] = AV28Fichero ;
                  GXv_objcol_SdtMessages_Message8[0] = AV38Messages ;
                  GXv_boolean9[0] = AV39OK ;
                  new app.trabajosexternos.ptexml2(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3, GXv_char2, GXv_objcol_SdtMessages_Message8, GXv_boolean9) ;
                  trabajoexterno_preparoxml_impl.this.AV11EmprCod = GXv_char4[0] ;
                  trabajoexterno_preparoxml_impl.this.AV50SalExtAlb = GXv_int7[0] ;
                  trabajoexterno_preparoxml_impl.this.AV35Path = GXv_char3[0] ;
                  trabajoexterno_preparoxml_impl.this.AV28Fichero = GXv_char2[0] ;
                  AV38Messages = GXv_objcol_SdtMessages_Message8[0] ;
                  trabajoexterno_preparoxml_impl.this.AV39OK = GXv_boolean9[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV50SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50SalExtAlb), 8, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV35Path", AV35Path);
                  httpContext.ajax_rsp_assign_attri("", false, "AV28Fichero", AV28Fichero);
                  if ( ! AV39OK )
                  {
                     AV63GXV4 = 1 ;
                     while ( AV63GXV4 <= AV38Messages.size() )
                     {
                        AV40Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV38Messages.elementAt(-1+AV63GXV4));
                        httpContext.GX_msglist.addItem(AV40Message.getgxTv_SdtMessages_Message_Description());
                        AV63GXV4 = (int)(AV63GXV4+1) ;
                     }
                  }
                  else
                  {
                     GXv_objcol_SdtMessages_Message8[0] = AV38Messages ;
                     GXv_boolean9[0] = AV39OK ;
                     new app.at_comunicar(remoteHandle, context).execute( AV11EmprCod, AV28Fichero, AV15UserAT, AV14PassAT, GXv_objcol_SdtMessages_Message8, GXv_boolean9) ;
                     AV38Messages = GXv_objcol_SdtMessages_Message8[0] ;
                     trabajoexterno_preparoxml_impl.this.AV39OK = GXv_boolean9[0] ;
                     AV42Messages_tojson = AV38Messages.toJSonString(false) ;
                     AV33FileR = httpContext.getMessage( "GT5", "") + GXutil.padl( GXutil.trim( GXutil.str( AV50SalExtAlb, 8, 0)), (short)(8), "0") ;
                     AV29File.setSource( GXutil.trim( AV9Dir)+"\\"+GXutil.trim( AV33FileR)+httpContext.getMessage( "result", "")+httpContext.getMessage( ".xml", "") );
                     AV41Var_File = AV29File.getAbsoluteName() ;
                     if ( AV39OK )
                     {
                        GXv_char4[0] = AV11EmprCod ;
                        GXv_char3[0] = AV28Fichero ;
                        GXv_int10[0] = AV50SalExtAlb ;
                        GXv_objcol_SdtMessages_Message8[0] = AV38Messages ;
                        GXv_boolean9[0] = AV39OK ;
                        new app.trabajosexternos.trabajoexterno_result(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int10, GXv_objcol_SdtMessages_Message8, GXv_boolean9) ;
                        trabajoexterno_preparoxml_impl.this.AV11EmprCod = GXv_char4[0] ;
                        trabajoexterno_preparoxml_impl.this.AV28Fichero = GXv_char3[0] ;
                        trabajoexterno_preparoxml_impl.this.AV50SalExtAlb = (int)((int)(GXv_int10[0])) ;
                        AV38Messages = GXv_objcol_SdtMessages_Message8[0] ;
                        trabajoexterno_preparoxml_impl.this.AV39OK = GXv_boolean9[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "AV28Fichero", AV28Fichero);
                        httpContext.ajax_rsp_assign_attri("", false, "AV50SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50SalExtAlb), 8, 0));
                        AV42Messages_tojson = AV38Messages.toJSonString(false) ;
                        httpContext.popup(formatLink("app.trabajosexternos.trabajoexterno_informeficheroresult", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV28Fichero)),GXutil.URLEncode(GXutil.ltrimstr(AV50SalExtAlb,8,0)),GXutil.URLEncode(GXutil.rtrim(AV42Messages_tojson)),GXutil.URLEncode(GXutil.booltostr(AV39OK))}, new String[] {"Emprcod","Fichero","AlbProCod","Messages_tojson","Ok"}) , new Object[] {});
                        if ( ! AV39OK )
                        {
                           AV64GXV5 = 1 ;
                           while ( AV64GXV5 <= AV38Messages.size() )
                           {
                              AV40Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV38Messages.elementAt(-1+AV64GXV5));
                              AV46Var_mensaje = AV40Message.getgxTv_SdtMessages_Message_Id() + GXutil.newLine( ) ;
                              AV46Var_mensaje += AV40Message.getgxTv_SdtMessages_Message_Description() + GXutil.newLine( ) ;
                              httpContext.GX_msglist.addItem(AV46Var_mensaje);
                              AV64GXV5 = (int)(AV64GXV5+1) ;
                           }
                        }
                        else
                        {
                           httpContext.popup(formatLink("app.trabajosexternos.trabajoexterno_impresion", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV50SalExtAlb,8,0))}, new String[] {"Emprcod","SalExtAlb"}) , new Object[] {});
                           httpContext.setWebReturnParms(new Object[] {AV11EmprCod,Integer.valueOf(AV50SalExtAlb),localUtil.format( AV51SalFhh, "99/99/99 99:99"),AV52SalExtHor,AV36Cadena,AV37Hash});
                           httpContext.setWebReturnParmsMetadata(new Object[] {"AV11EmprCod","AV50SalExtAlb","AV51SalFhh","AV52SalExtHor","AV36Cadena","AV37Hash"});
                           httpContext.wjLocDisableFrm = (byte)(1) ;
                           httpContext.nUserReturn = (byte)(1) ;
                           returnInSub = true;
                           if (true) return;
                        }
                     }
                     else
                     {
                        AV65GXV6 = 1 ;
                        while ( AV65GXV6 <= AV38Messages.size() )
                        {
                           AV40Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV38Messages.elementAt(-1+AV65GXV6));
                           AV46Var_mensaje = AV40Message.getgxTv_SdtMessages_Message_Id() + GXutil.newLine( ) ;
                           AV46Var_mensaje += AV40Message.getgxTv_SdtMessages_Message_Description() + GXutil.newLine( ) ;
                           httpContext.GX_msglist.addItem(AV46Var_mensaje);
                           AV65GXV6 = (int)(AV65GXV6+1) ;
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
      /* 'CEXTSA' Routine */
      returnInSub = false ;
      /* Using cursor H027F3 */
      pr_default.execute(1, new Object[] {AV11EmprCod, Integer.valueOf(AV50SalExtAlb)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A2253SalExtAlb = H027F3_A2253SalExtAlb[0] ;
         A396EmprCod = H027F3_A396EmprCod[0] ;
         A2256SalExtFec = H027F3_A2256SalExtFec[0] ;
         A10742SalCodeID = H027F3_A10742SalCodeID[0] ;
         A10077SalFmd = H027F3_A10077SalFmd[0] ;
         AV22AlbProfch = A2256SalExtFec ;
         AV23ALbLic = A10742SalCodeID ;
         AV49Calprd = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49Calprd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49Calprd), 4, 0));
         AV24AlbCOmcod = A2253SalExtAlb ;
         AV25Albfmd = A10077SalFmd ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25Albfmd", AV25Albfmd);
         AV27Lineas = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Lineas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Lineas), 4, 0));
         /* Optimized group. */
         /* Using cursor H027F4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
         cV27Lineas = H027F4_AV27Lineas[0] ;
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

   protected void e1627F2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV11EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
      AV50SalExtAlb = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50SalExtAlb), 8, 0));
      AV51SalFhh = (java.util.Date)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51SalFhh", localUtil.ttoc( AV51SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV52SalExtHor = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52SalExtHor", AV52SalExtHor);
      AV36Cadena = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Cadena", AV36Cadena);
      AV37Hash = (String)getParm(obj,5) ;
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
      pa27F2( ) ;
      ws27F2( ) ;
      we27F2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415132139", true, true);
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
      httpContext.AddJavascriptSource("trabajosexternos/trabajoexterno_preparoxml.js", "?202682415132139", false, true);
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
      edtavPgmname_Internalname = "vPGMNAME" ;
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
      Form.setCaption( httpContext.getMessage( "Preparo XML AT Trabajo Externo", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV54SerieAT',fld:'vSERIEAT',pic:'',hsh:true},{av:'AV9Dir',fld:'vDIR',pic:''},{av:'AV15UserAT',fld:'vUSERAT',pic:''},{av:'AV14PassAT',fld:'vPASSAT',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOXML'","{handler:'e1227F2',iparms:[{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV35Path',fld:'vPATH',pic:''},{av:'AV28Fichero',fld:'vFICHERO',pic:''}]");
      setEventMetadata("'DOXML'",",oparms:[{av:'AV28Fichero',fld:'vFICHERO',pic:''},{av:'AV35Path',fld:'vPATH',pic:''},{av:'AV50SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1327F2',iparms:[{av:'AV37Hash',fld:'vHASH',pic:''},{av:'AV36Cadena',fld:'vCADENA',pic:''},{av:'AV52SalExtHor',fld:'vSALEXTHOR',pic:''},{av:'AV51SalFhh',fld:'vSALFHH',pic:'99/99/99 99:99'},{av:'AV50SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e1427F2',iparms:[{av:'AV27Lineas',fld:'vLINEAS',pic:'ZZZ9'},{av:'AV9Dir',fld:'vDIR',pic:''},{av:'AV49Calprd',fld:'vCALPRD',pic:'ZZZ9'},{av:'AV25Albfmd',fld:'vALBFMD',pic:''},{av:'AV54SerieAT',fld:'vSERIEAT',pic:'',hsh:true},{av:'AV50SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV15UserAT',fld:'vUSERAT',pic:''},{av:'AV14PassAT',fld:'vPASSAT',pic:''},{av:'AV37Hash',fld:'vHASH',pic:''},{av:'AV36Cadena',fld:'vCADENA',pic:''},{av:'AV52SalExtHor',fld:'vSALEXTHOR',pic:''},{av:'AV51SalFhh',fld:'vSALFHH',pic:'99/99/99 99:99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9'},{av:'A2256SalExtFec',fld:'SALEXTFEC',pic:''},{av:'A10742SalCodeID',fld:'SALCODEID',pic:''},{av:'A10077SalFmd',fld:'SALFMD',pic:''},{av:'A6248SalExNln',fld:'SALEXNLN',pic:'ZZZ9'}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'AV28Fichero',fld:'vFICHERO',pic:''},{av:'AV35Path',fld:'vPATH',pic:''},{av:'AV50SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49Calprd',fld:'vCALPRD',pic:'ZZZ9'},{av:'AV25Albfmd',fld:'vALBFMD',pic:''},{av:'AV27Lineas',fld:'vLINEAS',pic:'ZZZ9'}]}");
      setEventMetadata("ENTER","{handler:'e1527F2',iparms:[{av:'AV27Lineas',fld:'vLINEAS',pic:'ZZZ9'},{av:'AV9Dir',fld:'vDIR',pic:''},{av:'AV49Calprd',fld:'vCALPRD',pic:'ZZZ9'},{av:'AV25Albfmd',fld:'vALBFMD',pic:''},{av:'AV54SerieAT',fld:'vSERIEAT',pic:'',hsh:true},{av:'AV50SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV15UserAT',fld:'vUSERAT',pic:''},{av:'AV14PassAT',fld:'vPASSAT',pic:''},{av:'AV37Hash',fld:'vHASH',pic:''},{av:'AV36Cadena',fld:'vCADENA',pic:''},{av:'AV52SalExtHor',fld:'vSALEXTHOR',pic:''},{av:'AV51SalFhh',fld:'vSALFHH',pic:'99/99/99 99:99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9'},{av:'A2256SalExtFec',fld:'SALEXTFEC',pic:''},{av:'A10742SalCodeID',fld:'SALCODEID',pic:''},{av:'A10077SalFmd',fld:'SALFMD',pic:''},{av:'A6248SalExNln',fld:'SALEXNLN',pic:'ZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV28Fichero',fld:'vFICHERO',pic:''},{av:'AV35Path',fld:'vPATH',pic:''},{av:'AV50SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49Calprd',fld:'vCALPRD',pic:'ZZZ9'},{av:'AV25Albfmd',fld:'vALBFMD',pic:''},{av:'AV27Lineas',fld:'vLINEAS',pic:'ZZZ9'}]}");
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
      wcpOAV51SalFhh = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV52SalExtHor = "" ;
      wcpOAV36Cadena = "" ;
      wcpOAV37Hash = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV11EmprCod = "" ;
      AV51SalFhh = GXutil.resetTime( GXutil.nullDate() );
      AV52SalExtHor = "" ;
      AV36Cadena = "" ;
      AV37Hash = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV54SerieAT = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV9Dir = "" ;
      AV15UserAT = "" ;
      AV14PassAT = "" ;
      AV35Path = "" ;
      AV25Albfmd = "" ;
      A396EmprCod = "" ;
      A2256SalExtFec = GXutil.nullDate() ;
      A10742SalCodeID = "" ;
      A10077SalFmd = "" ;
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
      AV57Pgmname = "" ;
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
      H027F2_A396EmprCod = new String[] {""} ;
      H027F2_A395EmprCif = new String[] {""} ;
      H027F2_n395EmprCif = new boolean[] {false} ;
      A395EmprCif = "" ;
      AV10EmprCif = "" ;
      AV53contidsernew = "" ;
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
      AV46Var_mensaje = "" ;
      GXv_int7 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int10 = new long[1] ;
      GXv_objcol_SdtMessages_Message8 = new GXBaseCollection[1] ;
      GXv_boolean9 = new boolean[1] ;
      H027F3_A2253SalExtAlb = new int[1] ;
      H027F3_A396EmprCod = new String[] {""} ;
      H027F3_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      H027F3_A10742SalCodeID = new String[] {""} ;
      H027F3_A10077SalFmd = new String[] {""} ;
      AV22AlbProfch = GXutil.nullDate() ;
      AV23ALbLic = "" ;
      H027F4_AV27Lineas = new short[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_preparoxml__default(),
         new Object[] {
             new Object[] {
            H027F2_A396EmprCod, H027F2_A395EmprCif, H027F2_n395EmprCif
            }
            , new Object[] {
            H027F3_A2253SalExtAlb, H027F3_A396EmprCod, H027F3_A2256SalExtFec, H027F3_A10742SalCodeID, H027F3_A10077SalFmd
            }
            , new Object[] {
            H027F4_AV27Lineas
            }
         }
      );
      AV57Pgmname = "TrabajosExternos.TrabajoExterno_PreparoXML" ;
      /* GeneXus formulas. */
      AV57Pgmname = "TrabajosExternos.TrabajoExterno_PreparoXML" ;
      Gx_err = (short)(0) ;
      edtavDir_Enabled = 0 ;
      edtavUserat_Enabled = 0 ;
      edtavPassat_Enabled = 0 ;
      edtavCadena_Enabled = 0 ;
      edtavHash_Enabled = 0 ;
      edtavFichero_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
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
   private short A6248SalExNln ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV8ATVeces ;
   private short AV12endutex ;
   private short cV27Lineas ;
   private int wcpOAV50SalExtAlb ;
   private int AV50SalExtAlb ;
   private int A2253SalExtAlb ;
   private int edtavDir_Enabled ;
   private int edtavUserat_Enabled ;
   private int edtavPassat_Enabled ;
   private int edtavCadena_Enabled ;
   private int edtavHash_Enabled ;
   private int edtavFichero_Enabled ;
   private int divUnnamedtable3_Height ;
   private int edtavPgmname_Enabled ;
   private int AV60GXV1 ;
   private int AV61GXV2 ;
   private int AV62GXV3 ;
   private int GXv_int7[] ;
   private int AV63GXV4 ;
   private int AV64GXV5 ;
   private int AV65GXV6 ;
   private int AV24AlbCOmcod ;
   private int idxLst ;
   private long GXv_int10[] ;
   private String wcpOAV11EmprCod ;
   private String wcpOAV52SalExtHor ;
   private String wcpOAV36Cadena ;
   private String wcpOAV37Hash ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV11EmprCod ;
   private String AV52SalExtHor ;
   private String AV36Cadena ;
   private String AV37Hash ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV54SerieAT ;
   private String GXKey ;
   private String AV9Dir ;
   private String AV15UserAT ;
   private String AV14PassAT ;
   private String A396EmprCod ;
   private String A10742SalCodeID ;
   private String A10077SalFmd ;
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
   private String edtavPgmname_Internalname ;
   private String AV57Pgmname ;
   private String edtavPgmname_Jsonclick ;
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
   private String AV53contidsernew ;
   private String AV43Station ;
   private String GXt_char1 ;
   private String AV44EmprNom ;
   private String AV45UsurCod ;
   private String Gx_msg ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String AV23ALbLic ;
   private java.util.Date wcpOAV51SalFhh ;
   private java.util.Date AV51SalFhh ;
   private java.util.Date A2256SalExtFec ;
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
   private String AV35Path ;
   private String AV25Albfmd ;
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
   private String[] H027F2_A396EmprCod ;
   private String[] H027F2_A395EmprCif ;
   private boolean[] H027F2_n395EmprCif ;
   private int[] H027F3_A2253SalExtAlb ;
   private String[] H027F3_A396EmprCod ;
   private java.util.Date[] H027F3_A2256SalExtFec ;
   private String[] H027F3_A10742SalCodeID ;
   private String[] H027F3_A10077SalFmd ;
   private short[] H027F4_AV27Lineas ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV38Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message8[] ;
   private com.genexus.SdtMessages_Message AV40Message ;
}

final  class trabajoexterno_preparoxml__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H027F2", "SELECT EmprCod, EmprCif FROM TXPEMPRES ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H027F3", "SELECT SalExtAlb, EmprCod, SalExtFec, SalCodeID, SalFmd FROM TXPCEXTSA WHERE EmprCod = ? and SalExtAlb = ? ORDER BY EmprCod, SalExtAlb ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H027F4", "SELECT COUNT(*) FROM TXPEXHDPZ WHERE EmprCod = ? and SalExtAlb = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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

