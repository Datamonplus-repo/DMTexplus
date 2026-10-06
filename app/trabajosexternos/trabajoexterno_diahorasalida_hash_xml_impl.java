package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class trabajoexterno_diahorasalida_hash_xml_impl extends GXDataArea
{
   public trabajoexterno_diahorasalida_hash_xml_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public trabajoexterno_diahorasalida_hash_xml_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_diahorasalida_hash_xml_impl.class ));
   }

   public trabajoexterno_diahorasalida_hash_xml_impl( int remoteHandle ,
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
               AV59SalExtFec = localUtil.parseDateParm( httpContext.GetPar( "SalExtFec")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV59SalExtFec", localUtil.format(AV59SalExtFec, "99/99/99"));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALEXTFEC", getSecureSignedToken( "", AV59SalExtFec));
               AV51SalFhh = localUtil.parseDTimeParm( httpContext.GetPar( "SalFhh")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV51SalFhh", localUtil.ttoc( AV51SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      pa2AA2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2AA2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.trabajosexternos.trabajoexterno_diahorasalida_hash_xml", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV50SalExtAlb,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV59SalExtFec)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV51SalFhh)),GXutil.URLEncode(GXutil.rtrim(AV36Cadena)),GXutil.URLEncode(GXutil.rtrim(AV37Hash))}, new String[] {"EmprCod","SalExtAlb","SalExtFec","SalFhh","Cadena","Hash"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALEXTFEC", getSecureSignedToken( "", AV59SalExtFec));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TrabajoExterno_DiaHoraSalida_Hash_XML");
      forbiddenHiddens.add("Dir", GXutil.rtrim( localUtil.format( AV9Dir, "")));
      forbiddenHiddens.add("UserAT", GXutil.rtrim( localUtil.format( AV15UserAT, "")));
      forbiddenHiddens.add("PassAT", GXutil.rtrim( localUtil.format( AV14PassAT, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("trabajosexternos\\trabajoexterno_diahorasalida_hash_xml:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV11EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vLINEAS", GXutil.ltrim( localUtil.ntoc( AV27Lineas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCALPRD", GXutil.ltrim( localUtil.ntoc( AV49Calprd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSERIEAT", GXutil.rtrim( AV54SerieAT));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSERIEAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV54SerieAT, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXTALB", GXutil.ltrim( localUtil.ntoc( A2253SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXTFEC", localUtil.dtoc( A2256SalExtFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "SALCODEID", GXutil.rtrim( A10742SalCodeID));
      app.GxWebStd.gx_hidden_field( httpContext, "SALFMD", GXutil.rtrim( A10077SalFmd));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXNLN", GXutil.ltrim( localUtil.ntoc( A6248SalExNln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCADENA", GXutil.rtrim( AV36Cadena));
      app.GxWebStd.gx_hidden_field( httpContext, "vHASH", GXutil.rtrim( AV37Hash));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Width", GXutil.rtrim( Dvpanel_unnamedtable3_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable3_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable3_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Cls", GXutil.rtrim( Dvpanel_unnamedtable3_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Title", GXutil.rtrim( Dvpanel_unnamedtable3_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable3_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable3_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable3_Autoscroll));
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
         we2AA2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2AA2( ) ;
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
      return formatLink("app.trabajosexternos.trabajoexterno_diahorasalida_hash_xml", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV50SalExtAlb,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV59SalExtFec)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV51SalFhh)),GXutil.URLEncode(GXutil.rtrim(AV36Cadena)),GXutil.URLEncode(GXutil.rtrim(AV37Hash))}, new String[] {"EmprCod","SalExtAlb","SalExtFec","SalFhh","Cadena","Hash"})  ;
   }

   public String getPgmname( )
   {
      return "TrabajosExternos.TrabajoExterno_DiaHoraSalida_Hash_XML" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Preparo XML AT Trabajo Externo", "") ;
   }

   public void wb2AA0( )
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
         ucDvpanel_unnamedtable3.setProperty("Width", Dvpanel_unnamedtable3_Width);
         ucDvpanel_unnamedtable3.setProperty("AutoWidth", Dvpanel_unnamedtable3_Autowidth);
         ucDvpanel_unnamedtable3.setProperty("AutoHeight", Dvpanel_unnamedtable3_Autoheight);
         ucDvpanel_unnamedtable3.setProperty("Cls", Dvpanel_unnamedtable3_Cls);
         ucDvpanel_unnamedtable3.setProperty("Title", Dvpanel_unnamedtable3_Title);
         ucDvpanel_unnamedtable3.setProperty("Collapsible", Dvpanel_unnamedtable3_Collapsible);
         ucDvpanel_unnamedtable3.setProperty("Collapsed", Dvpanel_unnamedtable3_Collapsed);
         ucDvpanel_unnamedtable3.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable3_Showcollapseicon);
         ucDvpanel_unnamedtable3.setProperty("IconPosition", Dvpanel_unnamedtable3_Iconposition);
         ucDvpanel_unnamedtable3.setProperty("AutoScroll", Dvpanel_unnamedtable3_Autoscroll);
         ucDvpanel_unnamedtable3.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable3_Internalname, "DVPANEL_UNNAMEDTABLE3Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE3Container"+"UnnamedTable3"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFechahorasalida_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFechahorasalida_Internalname, localUtil.ttoc( AV56FechaHoraSalida, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV56FechaHoraSalida, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFechahorasalida_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFechahorasalida_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_DiaHoraSalida_Hash_XML.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFechahorasalida_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFechahorasalida_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TrabajosExternos\\TrabajoExterno_DiaHoraSalida_Hash_XML.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDiahact_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDiahact_Internalname, localUtil.ttoc( AV57DiaHact, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV57DiaHact, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDiahact_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDiahact_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_DiaHoraSalida_Hash_XML.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDiahact_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavDiahact_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TrabajosExternos\\TrabajoExterno_DiaHoraSalida_Hash_XML.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDiasalida_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDiasalida_Internalname, localUtil.format(AV58diasalida, "99/99/99"), localUtil.format( AV58diasalida, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDiasalida_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDiasalida_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_DiaHoraSalida_Hash_XML.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDiasalida_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavDiasalida_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TrabajosExternos\\TrabajoExterno_DiaHoraSalida_Hash_XML.htm");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmessage_Internalname, lblTbmessage_Caption, "", "", lblTbmessage_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_TrabajosExternos\\TrabajoExterno_DiaHoraSalida_Hash_XML.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDir_Internalname, GXutil.rtrim( AV9Dir), GXutil.rtrim( localUtil.format( AV9Dir, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDir_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDir_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_DiaHoraSalida_Hash_XML.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUserat_Internalname, GXutil.rtrim( AV15UserAT), GXutil.rtrim( localUtil.format( AV15UserAT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUserat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavUserat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_DiaHoraSalida_Hash_XML.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPassat_Internalname, GXutil.rtrim( AV14PassAT), GXutil.rtrim( localUtil.format( AV14PassAT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPassat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPassat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(-1), (short)(0), 0, (byte)(0), (byte)(0), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_DiaHoraSalida_Hash_XML.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalextalb_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalextalb_Internalname, httpContext.getMessage( "Nº Guia", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalextalb_Internalname, GXutil.ltrim( localUtil.ntoc( AV50SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavSalextalb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV50SalExtAlb), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV50SalExtAlb), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalextalb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalextalb_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_DiaHoraSalida_Hash_XML.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalextfec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalextfec_Internalname, httpContext.getMessage( "Data", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavSalextfec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalextfec_Internalname, localUtil.format(AV59SalExtFec, "99/99/99"), localUtil.format( AV59SalExtFec, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalextfec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalextfec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_DiaHoraSalida_Hash_XML.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavSalextfec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavSalextfec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TrabajosExternos\\TrabajoExterno_DiaHoraSalida_Hash_XML.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalfecsal_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalfecsal_Internalname, httpContext.getMessage( "Data Saida", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavSalfecsal_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalfecsal_Internalname, localUtil.format(AV61SalFecSal, "99/99/99"), localUtil.format( AV61SalFecSal, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalfecsal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalfecsal_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_DiaHoraSalida_Hash_XML.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavSalfecsal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavSalfecsal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TrabajosExternos\\TrabajoExterno_DiaHoraSalida_Hash_XML.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalexthor_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalexthor_Internalname, httpContext.getMessage( "Hora Saida", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalexthor_Internalname, GXutil.rtrim( AV52SalExtHor), GXutil.rtrim( localUtil.format( AV52SalExtHor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,83);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalexthor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalexthor_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_DiaHoraSalida_Hash_XML.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalfhh_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalfhh_Internalname, httpContext.getMessage( "Data System Hash", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavSalfhh_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalfhh_Internalname, localUtil.ttoc( AV51SalFhh, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV51SalFhh, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalfhh_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalfhh_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_DiaHoraSalida_Hash_XML.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavSalfhh_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavSalfhh_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TrabajosExternos\\TrabajoExterno_DiaHoraSalida_Hash_XML.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalextatcud_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalextatcud_Internalname, httpContext.getMessage( "ATCUD", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalextatcud_Internalname, GXutil.rtrim( AV63SalExtATCUD), GXutil.rtrim( localUtil.format( AV63SalExtATCUD, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalextatcud_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalextatcud_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_DiaHoraSalida_Hash_XML.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalextserat_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalextserat_Internalname, httpContext.getMessage( "Serie", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalextserat_Internalname, GXutil.rtrim( AV64SalExtSerAT), GXutil.rtrim( localUtil.format( AV64SalExtSerAT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalextserat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalextserat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_DiaHoraSalida_Hash_XML.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalexttipat_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalexttipat_Internalname, httpContext.getMessage( "Tipo Doc.", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalexttipat_Internalname, GXutil.rtrim( AV65SalExtTipAT), GXutil.rtrim( localUtil.format( AV65SalExtTipAT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalexttipat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalexttipat_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_DiaHoraSalida_Hash_XML.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajosExternos\\TrabajoExterno_DiaHoraSalida_Hash_XML.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajosExternos\\TrabajoExterno_DiaHoraSalida_Hash_XML.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnatcud_Internalname, "", httpContext.getMessage( "ATCUD", ""), bttBtnatcud_Jsonclick, 5, httpContext.getMessage( "ATCUD", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOATCUD\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajosExternos\\TrabajoExterno_DiaHoraSalida_Hash_XML.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", divUnnamedtable2_Height, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV68Pgmname), GXutil.rtrim( localUtil.format( AV68Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_DiaHoraSalida_Hash_XML.htm");
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

   public void start2AA2( )
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
      strup2AA0( ) ;
   }

   public void ws2AA2( )
   {
      start2AA2( ) ;
      evt2AA2( ) ;
   }

   public void evt2AA2( )
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
                           e112AA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e122AA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOATCUD'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoATCUD' */
                           e132AA2 ();
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
                                 e142AA2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e152AA2 ();
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

   public void we2AA2( )
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

   public void pa2AA2( )
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
      rf2AA2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV68Pgmname = "TrabajosExternos.TrabajoExterno_DiaHoraSalida_Hash_XML" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68Pgmname", AV68Pgmname);
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
      edtavSalextalb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalextalb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalextalb_Enabled), 5, 0), true);
      edtavSalfhh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalfhh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalfhh_Enabled), 5, 0), true);
      edtavSalextatcud_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalextatcud_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalextatcud_Enabled), 5, 0), true);
      edtavSalextserat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalextserat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalextserat_Enabled), 5, 0), true);
      edtavSalexttipat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalexttipat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalexttipat_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2AA2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e152AA2 ();
         wb2AA0( ) ;
      }
   }

   public void send_integrity_lvl_hashes2AA2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vSERIEAT", GXutil.rtrim( AV54SerieAT));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSERIEAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV54SerieAT, ""))));
   }

   public void before_start_formulas( )
   {
      AV68Pgmname = "TrabajosExternos.TrabajoExterno_DiaHoraSalida_Hash_XML" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68Pgmname", AV68Pgmname);
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
      edtavSalextalb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalextalb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalextalb_Enabled), 5, 0), true);
      edtavSalfhh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalfhh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalfhh_Enabled), 5, 0), true);
      edtavSalextatcud_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalextatcud_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalextatcud_Enabled), 5, 0), true);
      edtavSalextserat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalextserat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalextserat_Enabled), 5, 0), true);
      edtavSalexttipat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalexttipat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalexttipat_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2AA0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e112AA2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Dvpanel_unnamedtable3_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Width") ;
         Dvpanel_unnamedtable3_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autowidth")) ;
         Dvpanel_unnamedtable3_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autoheight")) ;
         Dvpanel_unnamedtable3_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Cls") ;
         Dvpanel_unnamedtable3_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Title") ;
         Dvpanel_unnamedtable3_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Collapsible")) ;
         Dvpanel_unnamedtable3_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Collapsed")) ;
         Dvpanel_unnamedtable3_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Showcollapseicon")) ;
         Dvpanel_unnamedtable3_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Iconposition") ;
         Dvpanel_unnamedtable3_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autoscroll")) ;
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
            AV56FechaHoraSalida = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV56FechaHoraSalida", localUtil.ttoc( AV56FechaHoraSalida, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV56FechaHoraSalida = localUtil.ctot( httpContext.cgiGet( edtavFechahorasalida_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56FechaHoraSalida", localUtil.ttoc( AV56FechaHoraSalida, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavDiahact_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vDIAHACT");
            GX_FocusControl = edtavDiahact_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV57DiaHact = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV57DiaHact", localUtil.ttoc( AV57DiaHact, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV57DiaHact = localUtil.ctot( httpContext.cgiGet( edtavDiahact_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57DiaHact", localUtil.ttoc( AV57DiaHact, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDiasalida_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDIASALIDA");
            GX_FocusControl = edtavDiasalida_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV58diasalida = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58diasalida", localUtil.format(AV58diasalida, "99/99/99"));
         }
         else
         {
            AV58diasalida = localUtil.ctod( httpContext.cgiGet( edtavDiasalida_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58diasalida", localUtil.format(AV58diasalida, "99/99/99"));
         }
         AV9Dir = httpContext.cgiGet( edtavDir_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Dir", AV9Dir);
         AV15UserAT = httpContext.cgiGet( edtavUserat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15UserAT", AV15UserAT);
         AV14PassAT = httpContext.cgiGet( edtavPassat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14PassAT", AV14PassAT);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavSalfecsal_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vSALFECSAL");
            GX_FocusControl = edtavSalfecsal_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV61SalFecSal = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61SalFecSal", localUtil.format(AV61SalFecSal, "99/99/99"));
         }
         else
         {
            AV61SalFecSal = localUtil.ctod( httpContext.cgiGet( edtavSalfecsal_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61SalFecSal", localUtil.format(AV61SalFecSal, "99/99/99"));
         }
         AV52SalExtHor = httpContext.cgiGet( edtavSalexthor_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52SalExtHor", AV52SalExtHor);
         AV63SalExtATCUD = httpContext.cgiGet( edtavSalextatcud_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63SalExtATCUD", AV63SalExtATCUD);
         AV64SalExtSerAT = httpContext.cgiGet( edtavSalextserat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64SalExtSerAT", AV64SalExtSerAT);
         AV65SalExtTipAT = httpContext.cgiGet( edtavSalexttipat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65SalExtTipAT", AV65SalExtTipAT);
         AV68Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV68Pgmname", AV68Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TrabajoExterno_DiaHoraSalida_Hash_XML");
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
            GXutil.writeLogError("trabajosexternos\\trabajoexterno_diahorasalida_hash_xml:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e112AA2 ();
      if (returnInSub) return;
   }

   public void e112AA2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_dtime1 = AV55InoutFechaHoraSalida ;
      GXv_dtime2[0] = GXt_dtime1 ;
      new app.stocksquimicos.ptrz001(remoteHandle, context).execute( AV11EmprCod, GXv_dtime2) ;
      trabajoexterno_diahorasalida_hash_xml_impl.this.GXt_dtime1 = GXv_dtime2[0] ;
      AV55InoutFechaHoraSalida = GXt_dtime1 ;
      AV56FechaHoraSalida = AV55InoutFechaHoraSalida ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56FechaHoraSalida", localUtil.ttoc( AV56FechaHoraSalida, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV57DiaHact = GXutil.serverNow( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57DiaHact", localUtil.ttoc( AV57DiaHact, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV58diasalida = GXutil.resetTime(localUtil.ctot( localUtil.ttoc( AV56FechaHoraSalida, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58diasalida", localUtil.format(AV58diasalida, "99/99/99"));
      AV52SalExtHor = localUtil.ttoc( AV56FechaHoraSalida, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52SalExtHor", AV52SalExtHor);
      AV61SalFecSal = localUtil.ctod( localUtil.ttoc( AV56FechaHoraSalida, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61SalFecSal", localUtil.format(AV61SalFecSal, "99/99/99"));
      GXt_char3 = AV9Dir ;
      GXv_char4[0] = GXt_char3 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "SAFTW1", ""), GXv_char4) ;
      trabajoexterno_diahorasalida_hash_xml_impl.this.GXt_char3 = GXv_char4[0] ;
      AV9Dir = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Dir", AV9Dir);
      if ( GXutil.strcmp(AV9Dir, "") == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Path ¡¡¡¡.Revisar Contador SAFTW1", ""));
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      GXt_char3 = AV15UserAT ;
      GXv_char4[0] = AV11EmprCod ;
      GXv_char5[0] = httpContext.getMessage( "USEAT4", "") ;
      GXv_char6[0] = GXt_char3 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_char6) ;
      trabajoexterno_diahorasalida_hash_xml_impl.this.AV11EmprCod = GXv_char4[0] ;
      trabajoexterno_diahorasalida_hash_xml_impl.this.GXt_char3 = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
      AV15UserAT = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15UserAT", AV15UserAT);
      GXt_char3 = AV14PassAT ;
      GXv_char6[0] = AV11EmprCod ;
      GXv_char5[0] = httpContext.getMessage( "PASAT4", "") ;
      GXv_char4[0] = GXt_char3 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4) ;
      trabajoexterno_diahorasalida_hash_xml_impl.this.AV11EmprCod = GXv_char6[0] ;
      trabajoexterno_diahorasalida_hash_xml_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
      AV14PassAT = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14PassAT", AV14PassAT);
      AV19Vurl = httpContext.getMessage( "urlt", "") ;
      GXt_char3 = AV19Vurl ;
      GXv_char6[0] = AV11EmprCod ;
      GXv_char5[0] = httpContext.getMessage( "URL", "") ;
      GXv_char4[0] = GXt_char3 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4) ;
      trabajoexterno_diahorasalida_hash_xml_impl.this.AV11EmprCod = GXv_char6[0] ;
      trabajoexterno_diahorasalida_hash_xml_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
      AV19Vurl = GXt_char3 ;
      GXt_char3 = AV18Vpfx ;
      GXv_char6[0] = GXt_char3 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "PFX", ""), GXv_char6) ;
      trabajoexterno_diahorasalida_hash_xml_impl.this.GXt_char3 = GXv_char6[0] ;
      AV18Vpfx = GXt_char3 ;
      GXt_char3 = AV17Vpasspfx ;
      GXv_char6[0] = GXt_char3 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "PASPFX", ""), GXv_char6) ;
      trabajoexterno_diahorasalida_hash_xml_impl.this.GXt_char3 = GXv_char6[0] ;
      AV17Vpasspfx = GXt_char3 ;
      GXt_int7 = AV16VerCom ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "APISEN", ""), GXv_int8) ;
      trabajoexterno_diahorasalida_hash_xml_impl.this.GXt_int7 = GXv_int8[0] ;
      AV16VerCom = GXt_int7 ;
      GXt_int7 = AV13hb ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "HEABOD", ""), GXv_int8) ;
      trabajoexterno_diahorasalida_hash_xml_impl.this.GXt_int7 = GXv_int8[0] ;
      AV13hb = GXt_int7 ;
      GXt_int7 = (byte)(AV8ATVeces) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "ATINTE", ""), GXv_int8) ;
      trabajoexterno_diahorasalida_hash_xml_impl.this.GXt_int7 = GXv_int8[0] ;
      AV8ATVeces = GXt_int7 ;
      GXt_int7 = (byte)(AV12endutex) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "ENDTEX", ""), GXv_int8) ;
      trabajoexterno_diahorasalida_hash_xml_impl.this.GXt_int7 = GXv_int8[0] ;
      AV12endutex = GXt_int7 ;
      /* Using cursor H02AA2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A395EmprCif = H02AA2_A395EmprCif[0] ;
         n395EmprCif = H02AA2_n395EmprCif[0] ;
         AV10EmprCif = A395EmprCif ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      GXv_char6[0] = AV53contidsernew ;
      new app.trabajosexternos.obtengocodigoserieat(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "EXTHDR", ""), GXv_char6) ;
      trabajoexterno_diahorasalida_hash_xml_impl.this.AV53contidsernew = GXv_char6[0] ;
      AV54SerieAT = ((GXutil.strcmp("", AV53contidsernew)==0) ? "GT5" : AV53contidsernew) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54SerieAT", AV54SerieAT);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSERIEAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV54SerieAT, ""))));
      AV28Fichero = GXutil.trim( AV54SerieAT) + GXutil.padl( GXutil.trim( GXutil.str( AV50SalExtAlb, 8, 0)), (short)(8), "0") ;
      AV35Path = GXutil.trim( AV9Dir) ;
      GXt_char3 = AV43Station ;
      GXv_char6[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char6) ;
      trabajoexterno_diahorasalida_hash_xml_impl.this.GXt_char3 = GXv_char6[0] ;
      AV43Station = GXt_char3 ;
      GXv_char6[0] = AV11EmprCod ;
      GXv_char5[0] = AV44EmprNom ;
      GXv_char4[0] = AV45UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV43Station, GXv_char6, GXv_char5, GXv_char4) ;
      trabajoexterno_diahorasalida_hash_xml_impl.this.AV11EmprCod = GXv_char6[0] ;
      trabajoexterno_diahorasalida_hash_xml_impl.this.AV44EmprNom = GXv_char5[0] ;
      trabajoexterno_diahorasalida_hash_xml_impl.this.AV45UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
      divUnnamedtable2_Height = 30 ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable2_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable2_Height), 9, 0), true);
      GXv_char6[0] = AV63SalExtATCUD ;
      GXv_char5[0] = AV64SalExtSerAT ;
      GXv_char4[0] = AV65SalExtTipAT ;
      new app.trabajosexternos.trabajoexterno_get_atcud(remoteHandle, context).execute( AV11EmprCod, AV50SalExtAlb, GXv_char6, GXv_char5, GXv_char4) ;
      trabajoexterno_diahorasalida_hash_xml_impl.this.AV63SalExtATCUD = GXv_char6[0] ;
      trabajoexterno_diahorasalida_hash_xml_impl.this.AV64SalExtSerAT = GXv_char5[0] ;
      trabajoexterno_diahorasalida_hash_xml_impl.this.AV65SalExtTipAT = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63SalExtATCUD", AV63SalExtATCUD);
      httpContext.ajax_rsp_assign_attri("", false, "AV64SalExtSerAT", AV64SalExtSerAT);
      httpContext.ajax_rsp_assign_attri("", false, "AV65SalExtTipAT", AV65SalExtTipAT);
   }

   public void e122AA2( )
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

   public void e132AA2( )
   {
      /* 'DoATCUD' Routine */
      returnInSub = false ;
      lblTbmessage_Caption = "  " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( ! (GXutil.strcmp("", AV63SalExtATCUD)==0) && ! (GXutil.strcmp("", AV64SalExtSerAT)==0) && ! (GXutil.strcmp("", AV65SalExtTipAT)==0) )
      {
         lblTbmessage_Caption = httpContext.getMessage( "Ya existe ATCUD¡¡", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      }
      else
      {
         new app.trabajosexternos.trabajoexterno_atcud(remoteHandle, context).execute( AV11EmprCod, AV50SalExtAlb) ;
         GXv_char6[0] = AV63SalExtATCUD ;
         GXv_char5[0] = AV64SalExtSerAT ;
         GXv_char4[0] = AV65SalExtTipAT ;
         new app.trabajosexternos.trabajoexterno_get_atcud(remoteHandle, context).execute( AV11EmprCod, AV50SalExtAlb, GXv_char6, GXv_char5, GXv_char4) ;
         trabajoexterno_diahorasalida_hash_xml_impl.this.AV63SalExtATCUD = GXv_char6[0] ;
         trabajoexterno_diahorasalida_hash_xml_impl.this.AV64SalExtSerAT = GXv_char5[0] ;
         trabajoexterno_diahorasalida_hash_xml_impl.this.AV65SalExtTipAT = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63SalExtATCUD", AV63SalExtATCUD);
         httpContext.ajax_rsp_assign_attri("", false, "AV64SalExtSerAT", AV64SalExtSerAT);
         httpContext.ajax_rsp_assign_attri("", false, "AV65SalExtTipAT", AV65SalExtTipAT);
         httpContext.doAjaxRefresh();
      }
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e142AA2 ();
      if (returnInSub) return;
   }

   public void e142AA2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( (GXutil.strcmp("", AV63SalExtATCUD)==0) || (GXutil.strcmp("", AV64SalExtSerAT)==0) || (GXutil.strcmp("", AV65SalExtTipAT)==0) )
      {
         lblTbmessage_Caption = httpContext.getMessage( "Falta ATCUD¡¡¡ o Falta SERIE¡¡¡ o Falta Tipo Documento¡¡¡", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      }
      else
      {
         GXv_char6[0] = AV60msg_control ;
         new app.trabajosexternos.trabjoexterno_ctrlhashanterior_2copy1(remoteHandle, context).execute( AV11EmprCod, AV50SalExtAlb, GXv_char6) ;
         trabajoexterno_diahorasalida_hash_xml_impl.this.AV60msg_control = GXv_char6[0] ;
         if ( ! (GXutil.strcmp("", AV60msg_control)==0) )
         {
            lblTbmessage_Caption = AV60msg_control ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         }
         else
         {
            AV57DiaHact = GXutil.serverNow( context, remoteHandle, pr_default) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57DiaHact", localUtil.ttoc( AV57DiaHact, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            if ( AV56FechaHoraSalida.before( GXutil.serverNow( context, remoteHandle, pr_default) ) )
            {
               Gx_msg = httpContext.getMessage( "Erro. Dia-Hora Salida ", "") + localUtil.ttoc( AV56FechaHoraSalida, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " inferior a Dia Actual ", "") + localUtil.ttoc( AV57DiaHact, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
               lblTbmessage_Caption = Gx_msg ;
               httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            }
            else
            {
               if ( AV56FechaHoraSalida.before( AV59SalExtFec ) )
               {
                  Gx_msg = httpContext.getMessage( "Erro. Dia-Hora Salida ", "") + localUtil.ttoc( AV56FechaHoraSalida, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " inferior a Data Documento ", "") + localUtil.dtoc( AV59SalExtFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                  lblTbmessage_Caption = Gx_msg ;
                  httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
               }
               else
               {
                  AV52SalExtHor = localUtil.ttoc( AV56FechaHoraSalida, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV52SalExtHor", AV52SalExtHor);
                  AV61SalFecSal = localUtil.ctod( localUtil.ttoc( AV56FechaHoraSalida, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV61SalFecSal", localUtil.format(AV61SalFecSal, "99/99/99"));
                  AV51SalFhh = AV57DiaHact ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV51SalFhh", localUtil.ttoc( AV51SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                  System.out.println( httpContext.getMessage( "&SalExtHor=", "")+AV52SalExtHor+httpContext.getMessage( "&SalFecSal=", "")+localUtil.dtoc( AV61SalFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")+httpContext.getMessage( "&SalFhh=", "")+localUtil.ttoc( AV51SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") );
                  new app.trabajosexternos.trabajoexterno_actualizodiahorasalidacopy1(remoteHandle, context).execute( AV11EmprCod, AV50SalExtAlb, AV61SalFecSal, AV52SalExtHor, AV51SalFhh) ;
                  AV62SalExtFecIN = AV59SalExtFec ;
                  GXv_char6[0] = AV11EmprCod ;
                  GXv_int9[0] = AV50SalExtAlb ;
                  GXv_date10[0] = AV62SalExtFecIN ;
                  GXv_dtime2[0] = AV51SalFhh ;
                  GXv_char5[0] = AV36Cadena ;
                  GXv_char4[0] = AV20Firma ;
                  new app.trabajosexternos.trabajoexterno_actualizohash_cadenaparahash(remoteHandle, context).execute( GXv_char6, GXv_int9, GXv_date10, GXv_dtime2, GXv_char5, GXv_char4) ;
                  trabajoexterno_diahorasalida_hash_xml_impl.this.AV11EmprCod = GXv_char6[0] ;
                  trabajoexterno_diahorasalida_hash_xml_impl.this.AV50SalExtAlb = GXv_int9[0] ;
                  trabajoexterno_diahorasalida_hash_xml_impl.this.AV62SalExtFecIN = GXv_date10[0] ;
                  trabajoexterno_diahorasalida_hash_xml_impl.this.AV51SalFhh = GXv_dtime2[0] ;
                  trabajoexterno_diahorasalida_hash_xml_impl.this.AV36Cadena = GXv_char5[0] ;
                  trabajoexterno_diahorasalida_hash_xml_impl.this.AV20Firma = GXv_char4[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV50SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50SalExtAlb), 8, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV51SalFhh", localUtil.ttoc( AV51SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                  httpContext.ajax_rsp_assign_attri("", false, "AV36Cadena", AV36Cadena);
                  GXv_char6[0] = AV37Hash ;
                  GXv_objcol_SdtMessages_Message11[0] = AV38Messages ;
                  GXv_boolean12[0] = AV39OK ;
                  new app.hash_obtener(remoteHandle, context).execute( AV36Cadena, GXv_char6, GXv_objcol_SdtMessages_Message11, GXv_boolean12) ;
                  trabajoexterno_diahorasalida_hash_xml_impl.this.AV37Hash = GXv_char6[0] ;
                  AV38Messages = GXv_objcol_SdtMessages_Message11[0] ;
                  trabajoexterno_diahorasalida_hash_xml_impl.this.AV39OK = GXv_boolean12[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV37Hash", AV37Hash);
                  if ( ! AV39OK )
                  {
                     AV71GXV1 = 1 ;
                     while ( AV71GXV1 <= AV38Messages.size() )
                     {
                        AV40Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV38Messages.elementAt(-1+AV71GXV1));
                        httpContext.GX_msglist.addItem(AV40Message.getgxTv_SdtMessages_Message_Description());
                        AV71GXV1 = (int)(AV71GXV1+1) ;
                     }
                  }
                  else
                  {
                     /* Execute user subroutine: 'CEXTSA' */
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
                              lblTbmessage_Caption = httpContext.getMessage( "Hash creado correctamente", "") ;
                              httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                              GXv_char6[0] = AV11EmprCod ;
                              GXv_int9[0] = AV50SalExtAlb ;
                              GXv_char5[0] = AV36Cadena ;
                              GXv_char4[0] = AV37Hash ;
                              new app.trabajosexternos.trabajoexterno_actualizohash(remoteHandle, context).execute( GXv_char6, GXv_int9, GXv_char5, GXv_char4) ;
                              trabajoexterno_diahorasalida_hash_xml_impl.this.AV11EmprCod = GXv_char6[0] ;
                              trabajoexterno_diahorasalida_hash_xml_impl.this.AV50SalExtAlb = GXv_int9[0] ;
                              trabajoexterno_diahorasalida_hash_xml_impl.this.AV36Cadena = GXv_char5[0] ;
                              trabajoexterno_diahorasalida_hash_xml_impl.this.AV37Hash = GXv_char4[0] ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
                              httpContext.ajax_rsp_assign_attri("", false, "AV50SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50SalExtAlb), 8, 0));
                              httpContext.ajax_rsp_assign_attri("", false, "AV36Cadena", AV36Cadena);
                              httpContext.ajax_rsp_assign_attri("", false, "AV37Hash", AV37Hash);
                              if ( (GXutil.strcmp("", AV37Hash)==0) )
                              {
                                 Gx_msg = httpContext.getMessage( "Atenção O código HASH está faltando.", "") + GXutil.newLine( ) ;
                                 Gx_msg += httpContext.getMessage( "É necessário criar o HASH para o documento.", "") + GXutil.newLine( ) ;
                                 lblTbmessage_Caption = Gx_msg ;
                                 httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                              }
                              else
                              {
                                 AV28Fichero = GXutil.trim( AV54SerieAT) + GXutil.padl( GXutil.trim( GXutil.str( AV50SalExtAlb, 8, 0)), (short)(8), "0") ;
                                 AV35Path = GXutil.trim( AV9Dir) ;
                                 GXv_char6[0] = AV11EmprCod ;
                                 GXv_int9[0] = AV50SalExtAlb ;
                                 GXv_char5[0] = AV35Path ;
                                 GXv_char4[0] = AV28Fichero ;
                                 GXv_objcol_SdtMessages_Message11[0] = AV38Messages ;
                                 GXv_boolean12[0] = AV39OK ;
                                 new app.trabajosexternos.ptexml2(remoteHandle, context).execute( GXv_char6, GXv_int9, GXv_char5, GXv_char4, GXv_objcol_SdtMessages_Message11, GXv_boolean12) ;
                                 trabajoexterno_diahorasalida_hash_xml_impl.this.AV11EmprCod = GXv_char6[0] ;
                                 trabajoexterno_diahorasalida_hash_xml_impl.this.AV50SalExtAlb = GXv_int9[0] ;
                                 trabajoexterno_diahorasalida_hash_xml_impl.this.AV35Path = GXv_char5[0] ;
                                 trabajoexterno_diahorasalida_hash_xml_impl.this.AV28Fichero = GXv_char4[0] ;
                                 AV38Messages = GXv_objcol_SdtMessages_Message11[0] ;
                                 trabajoexterno_diahorasalida_hash_xml_impl.this.AV39OK = GXv_boolean12[0] ;
                                 httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
                                 httpContext.ajax_rsp_assign_attri("", false, "AV50SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50SalExtAlb), 8, 0));
                                 if ( ! AV39OK )
                                 {
                                    AV72GXV2 = 1 ;
                                    while ( AV72GXV2 <= AV38Messages.size() )
                                    {
                                       AV40Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV38Messages.elementAt(-1+AV72GXV2));
                                       httpContext.GX_msglist.addItem(AV40Message.getgxTv_SdtMessages_Message_Description());
                                       AV72GXV2 = (int)(AV72GXV2+1) ;
                                    }
                                 }
                                 else
                                 {
                                    GXv_objcol_SdtMessages_Message11[0] = AV38Messages ;
                                    GXv_boolean12[0] = AV39OK ;
                                    new app.at_comunicar(remoteHandle, context).execute( AV11EmprCod, AV28Fichero, AV15UserAT, AV14PassAT, GXv_objcol_SdtMessages_Message11, GXv_boolean12) ;
                                    AV38Messages = GXv_objcol_SdtMessages_Message11[0] ;
                                    trabajoexterno_diahorasalida_hash_xml_impl.this.AV39OK = GXv_boolean12[0] ;
                                    AV42Messages_tojson = AV38Messages.toJSonString(false) ;
                                    AV33FileR = AV54SerieAT + GXutil.padl( GXutil.trim( GXutil.str( AV50SalExtAlb, 8, 0)), (short)(8), "0") ;
                                    AV29File.setSource( GXutil.trim( AV9Dir)+"\\"+GXutil.trim( AV33FileR)+httpContext.getMessage( "result", "")+httpContext.getMessage( ".xml", "") );
                                    AV41Var_File = AV29File.getAbsoluteName() ;
                                    if ( AV39OK )
                                    {
                                       GXv_char6[0] = AV11EmprCod ;
                                       GXv_char5[0] = AV28Fichero ;
                                       GXv_int13[0] = AV50SalExtAlb ;
                                       GXv_objcol_SdtMessages_Message11[0] = AV38Messages ;
                                       GXv_boolean12[0] = AV39OK ;
                                       new app.trabajosexternos.trabajoexterno_result(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_int13, GXv_objcol_SdtMessages_Message11, GXv_boolean12) ;
                                       trabajoexterno_diahorasalida_hash_xml_impl.this.AV11EmprCod = GXv_char6[0] ;
                                       trabajoexterno_diahorasalida_hash_xml_impl.this.AV28Fichero = GXv_char5[0] ;
                                       trabajoexterno_diahorasalida_hash_xml_impl.this.AV50SalExtAlb = (int)((int)(GXv_int13[0])) ;
                                       AV38Messages = GXv_objcol_SdtMessages_Message11[0] ;
                                       trabajoexterno_diahorasalida_hash_xml_impl.this.AV39OK = GXv_boolean12[0] ;
                                       httpContext.ajax_rsp_assign_attri("", false, "AV11EmprCod", AV11EmprCod);
                                       httpContext.ajax_rsp_assign_attri("", false, "AV50SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50SalExtAlb), 8, 0));
                                       AV42Messages_tojson = AV38Messages.toJSonString(false) ;
                                       httpContext.popup(formatLink("app.trabajosexternos.trabajoexterno_informeficheroresult", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV28Fichero)),GXutil.URLEncode(GXutil.ltrimstr(AV50SalExtAlb,8,0)),GXutil.URLEncode(GXutil.rtrim(AV42Messages_tojson)),GXutil.URLEncode(GXutil.booltostr(AV39OK))}, new String[] {"Emprcod","Fichero","AlbProCod","Messages_tojson","Ok"}) , new Object[] {});
                                       if ( ! AV39OK )
                                       {
                                          httpContext.popup(formatLink("app.trabajosexternos.trabajoexterno_impresion", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV50SalExtAlb,8,0))}, new String[] {"Emprcod","SalExtAlb"}) , new Object[] {});
                                          httpContext.setWebReturnParms(new Object[] {});
                                          httpContext.setWebReturnParmsMetadata(new Object[] {});
                                          httpContext.wjLocDisableFrm = (byte)(1) ;
                                          httpContext.nUserReturn = (byte)(1) ;
                                          returnInSub = true;
                                          if (true) return;
                                       }
                                       else
                                       {
                                          httpContext.popup(formatLink("app.trabajosexternos.trabajoexterno_impresion", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV50SalExtAlb,8,0))}, new String[] {"Emprcod","SalExtAlb"}) , new Object[] {});
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
                                       AV73GXV3 = 1 ;
                                       while ( AV73GXV3 <= AV38Messages.size() )
                                       {
                                          AV40Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV38Messages.elementAt(-1+AV73GXV3));
                                          AV46Var_mensaje = AV40Message.getgxTv_SdtMessages_Message_Id() + GXutil.newLine( ) ;
                                          AV46Var_mensaje += AV40Message.getgxTv_SdtMessages_Message_Description() + GXutil.newLine( ) ;
                                          httpContext.GX_msglist.addItem(AV46Var_mensaje);
                                          AV73GXV3 = (int)(AV73GXV3+1) ;
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
      /* 'CEXTSA' Routine */
      returnInSub = false ;
      /* Using cursor H02AA3 */
      pr_default.execute(1, new Object[] {AV11EmprCod, Integer.valueOf(AV50SalExtAlb)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A2253SalExtAlb = H02AA3_A2253SalExtAlb[0] ;
         A396EmprCod = H02AA3_A396EmprCod[0] ;
         A2256SalExtFec = H02AA3_A2256SalExtFec[0] ;
         A10742SalCodeID = H02AA3_A10742SalCodeID[0] ;
         A10077SalFmd = H02AA3_A10077SalFmd[0] ;
         AV22AlbProfch = A2256SalExtFec ;
         AV23ALbLic = A10742SalCodeID ;
         AV49Calprd = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49Calprd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49Calprd), 4, 0));
         AV24AlbCOmcod = A2253SalExtAlb ;
         AV25Albfmd = A10077SalFmd ;
         AV27Lineas = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Lineas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Lineas), 4, 0));
         /* Optimized group. */
         /* Using cursor H02AA4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
         cV27Lineas = H02AA4_AV27Lineas[0] ;
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

   protected void e152AA2( )
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
      AV59SalExtFec = (java.util.Date)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59SalExtFec", localUtil.format(AV59SalExtFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALEXTFEC", getSecureSignedToken( "", AV59SalExtFec));
      AV51SalFhh = (java.util.Date)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51SalFhh", localUtil.ttoc( AV51SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      pa2AA2( ) ;
      ws2AA2( ) ;
      we2AA2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415132444", true, true);
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
      httpContext.AddJavascriptSource("trabajosexternos/trabajoexterno_diahorasalida_hash_xml.js", "?202682415132444", false, true);
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
      edtavFechahorasalida_Internalname = "vFECHAHORASALIDA" ;
      edtavDiahact_Internalname = "vDIAHACT" ;
      edtavDiasalida_Internalname = "vDIASALIDA" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      lblTbmessage_Internalname = "TBMESSAGE" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      edtavDir_Internalname = "vDIR" ;
      edtavUserat_Internalname = "vUSERAT" ;
      edtavPassat_Internalname = "vPASSAT" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtavSalextalb_Internalname = "vSALEXTALB" ;
      edtavSalextfec_Internalname = "vSALEXTFEC" ;
      edtavSalfecsal_Internalname = "vSALFECSAL" ;
      edtavSalexthor_Internalname = "vSALEXTHOR" ;
      edtavSalfhh_Internalname = "vSALFHH" ;
      edtavSalextatcud_Internalname = "vSALEXTATCUD" ;
      edtavSalextserat_Internalname = "vSALEXTSERAT" ;
      edtavSalexttipat_Internalname = "vSALEXTTIPAT" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      Dvpanel_unnamedtable4_Internalname = "DVPANEL_UNNAMEDTABLE4" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      bttBtnatcud_Internalname = "BTNATCUD" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
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
      divUnnamedtable2_Height = 0 ;
      edtavSalexttipat_Jsonclick = "" ;
      edtavSalexttipat_Enabled = 1 ;
      edtavSalextserat_Jsonclick = "" ;
      edtavSalextserat_Enabled = 1 ;
      edtavSalextatcud_Jsonclick = "" ;
      edtavSalextatcud_Enabled = 1 ;
      edtavSalfhh_Jsonclick = "" ;
      edtavSalfhh_Enabled = 0 ;
      edtavSalexthor_Jsonclick = "" ;
      edtavSalexthor_Enabled = 1 ;
      edtavSalfecsal_Jsonclick = "" ;
      edtavSalfecsal_Enabled = 1 ;
      edtavSalextfec_Jsonclick = "" ;
      edtavSalextfec_Enabled = 0 ;
      edtavSalextalb_Jsonclick = "" ;
      edtavSalextalb_Enabled = 0 ;
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
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = "" ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV54SerieAT',fld:'vSERIEAT',pic:'',hsh:true},{av:'AV59SalExtFec',fld:'vSALEXTFEC',pic:'',hsh:true},{av:'AV9Dir',fld:'vDIR',pic:''},{av:'AV15UserAT',fld:'vUSERAT',pic:''},{av:'AV14PassAT',fld:'vPASSAT',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCERRAR'","{handler:'e122AA2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOATCUD'","{handler:'e132AA2',iparms:[{av:'AV63SalExtATCUD',fld:'vSALEXTATCUD',pic:''},{av:'AV64SalExtSerAT',fld:'vSALEXTSERAT',pic:''},{av:'AV65SalExtTipAT',fld:'vSALEXTTIPAT',pic:''},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOATCUD'",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV65SalExtTipAT',fld:'vSALEXTTIPAT',pic:''},{av:'AV64SalExtSerAT',fld:'vSALEXTSERAT',pic:''},{av:'AV63SalExtATCUD',fld:'vSALEXTATCUD',pic:''}]}");
      setEventMetadata("ENTER","{handler:'e142AA2',iparms:[{av:'AV63SalExtATCUD',fld:'vSALEXTATCUD',pic:''},{av:'AV64SalExtSerAT',fld:'vSALEXTSERAT',pic:''},{av:'AV65SalExtTipAT',fld:'vSALEXTTIPAT',pic:''},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV56FechaHoraSalida',fld:'vFECHAHORASALIDA',pic:'99/99/99 99:99'},{av:'AV59SalExtFec',fld:'vSALEXTFEC',pic:'',hsh:true},{av:'AV27Lineas',fld:'vLINEAS',pic:'ZZZ9'},{av:'AV9Dir',fld:'vDIR',pic:''},{av:'AV49Calprd',fld:'vCALPRD',pic:'ZZZ9'},{av:'AV54SerieAT',fld:'vSERIEAT',pic:'',hsh:true},{av:'AV15UserAT',fld:'vUSERAT',pic:''},{av:'AV14PassAT',fld:'vPASSAT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9'},{av:'A2256SalExtFec',fld:'SALEXTFEC',pic:''},{av:'A10742SalCodeID',fld:'SALCODEID',pic:''},{av:'A10077SalFmd',fld:'SALFMD',pic:''},{av:'A6248SalExNln',fld:'SALEXNLN',pic:'ZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV57DiaHact',fld:'vDIAHACT',pic:'99/99/99 99:99'},{av:'AV52SalExtHor',fld:'vSALEXTHOR',pic:''},{av:'AV61SalFecSal',fld:'vSALFECSAL',pic:''},{av:'AV51SalFhh',fld:'vSALFHH',pic:'99/99/99 99:99'},{av:'AV36Cadena',fld:'vCADENA',pic:''},{av:'AV50SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV37Hash',fld:'vHASH',pic:''},{av:'AV49Calprd',fld:'vCALPRD',pic:'ZZZ9'},{av:'AV27Lineas',fld:'vLINEAS',pic:'ZZZ9'}]}");
      setEventMetadata("VALIDV_SALEXTALB","{handler:'validv_Salextalb',iparms:[]");
      setEventMetadata("VALIDV_SALEXTALB",",oparms:[]}");
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
      wcpOAV59SalExtFec = GXutil.nullDate() ;
      wcpOAV51SalFhh = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV36Cadena = "" ;
      wcpOAV37Hash = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV11EmprCod = "" ;
      AV59SalExtFec = GXutil.nullDate() ;
      AV51SalFhh = GXutil.resetTime( GXutil.nullDate() );
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
      A396EmprCod = "" ;
      A2256SalExtFec = GXutil.nullDate() ;
      A10742SalCodeID = "" ;
      A10077SalFmd = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV56FechaHoraSalida = GXutil.resetTime( GXutil.nullDate() );
      AV57DiaHact = GXutil.resetTime( GXutil.nullDate() );
      AV58diasalida = GXutil.nullDate() ;
      lblTbmessage_Jsonclick = "" ;
      ucDvpanel_unnamedtable4 = new com.genexus.webpanels.GXUserControl();
      AV61SalFecSal = GXutil.nullDate() ;
      AV52SalExtHor = "" ;
      AV63SalExtATCUD = "" ;
      AV64SalExtSerAT = "" ;
      AV65SalExtTipAT = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      bttBtnatcud_Jsonclick = "" ;
      AV68Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      hsh = "" ;
      AV55InoutFechaHoraSalida = GXutil.resetTime( GXutil.nullDate() );
      GXt_dtime1 = GXutil.resetTime( GXutil.nullDate() );
      AV19Vurl = "" ;
      AV18Vpfx = "" ;
      AV17Vpasspfx = "" ;
      GXv_int8 = new byte[1] ;
      scmdbuf = "" ;
      H02AA2_A396EmprCod = new String[] {""} ;
      H02AA2_A395EmprCif = new String[] {""} ;
      H02AA2_n395EmprCif = new boolean[] {false} ;
      A395EmprCif = "" ;
      AV10EmprCif = "" ;
      AV53contidsernew = "" ;
      AV28Fichero = "" ;
      AV35Path = "" ;
      AV43Station = "" ;
      GXt_char3 = "" ;
      AV44EmprNom = "" ;
      AV45UsurCod = "" ;
      AV60msg_control = "" ;
      Gx_msg = "" ;
      AV62SalExtFecIN = GXutil.nullDate() ;
      GXv_date10 = new java.util.Date[1] ;
      GXv_dtime2 = new java.util.Date[1] ;
      AV20Firma = "" ;
      AV38Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV40Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      GXv_int9 = new int[1] ;
      GXv_char4 = new String[1] ;
      AV42Messages_tojson = "" ;
      AV33FileR = "" ;
      AV29File = new com.genexus.util.GXFile();
      AV41Var_File = "" ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int13 = new long[1] ;
      GXv_objcol_SdtMessages_Message11 = new GXBaseCollection[1] ;
      GXv_boolean12 = new boolean[1] ;
      AV46Var_mensaje = "" ;
      H02AA3_A2253SalExtAlb = new int[1] ;
      H02AA3_A396EmprCod = new String[] {""} ;
      H02AA3_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      H02AA3_A10742SalCodeID = new String[] {""} ;
      H02AA3_A10077SalFmd = new String[] {""} ;
      AV22AlbProfch = GXutil.nullDate() ;
      AV23ALbLic = "" ;
      AV25Albfmd = "" ;
      H02AA4_AV27Lineas = new short[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_diahorasalida_hash_xml__default(),
         new Object[] {
             new Object[] {
            H02AA2_A396EmprCod, H02AA2_A395EmprCif, H02AA2_n395EmprCif
            }
            , new Object[] {
            H02AA3_A2253SalExtAlb, H02AA3_A396EmprCod, H02AA3_A2256SalExtFec, H02AA3_A10742SalCodeID, H02AA3_A10077SalFmd
            }
            , new Object[] {
            H02AA4_AV27Lineas
            }
         }
      );
      AV68Pgmname = "TrabajosExternos.TrabajoExterno_DiaHoraSalida_Hash_XML" ;
      /* GeneXus formulas. */
      AV68Pgmname = "TrabajosExternos.TrabajoExterno_DiaHoraSalida_Hash_XML" ;
      Gx_err = (short)(0) ;
      edtavDiahact_Enabled = 0 ;
      edtavDiasalida_Enabled = 0 ;
      edtavDir_Enabled = 0 ;
      edtavUserat_Enabled = 0 ;
      edtavPassat_Enabled = 0 ;
      edtavSalextalb_Enabled = 0 ;
      edtavSalfhh_Enabled = 0 ;
      edtavSalextatcud_Enabled = 0 ;
      edtavSalextserat_Enabled = 0 ;
      edtavSalexttipat_Enabled = 0 ;
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
   private int edtavFechahorasalida_Enabled ;
   private int edtavDiahact_Enabled ;
   private int edtavDiasalida_Enabled ;
   private int edtavDir_Enabled ;
   private int edtavUserat_Enabled ;
   private int edtavPassat_Enabled ;
   private int edtavSalextalb_Enabled ;
   private int edtavSalextfec_Enabled ;
   private int edtavSalfecsal_Enabled ;
   private int edtavSalexthor_Enabled ;
   private int edtavSalfhh_Enabled ;
   private int edtavSalextatcud_Enabled ;
   private int edtavSalextserat_Enabled ;
   private int edtavSalexttipat_Enabled ;
   private int divUnnamedtable2_Height ;
   private int edtavPgmname_Enabled ;
   private int AV71GXV1 ;
   private int GXv_int9[] ;
   private int AV72GXV2 ;
   private int AV73GXV3 ;
   private int AV24AlbCOmcod ;
   private int idxLst ;
   private long GXv_int13[] ;
   private String wcpOAV11EmprCod ;
   private String wcpOAV36Cadena ;
   private String wcpOAV37Hash ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV11EmprCod ;
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
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
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
   private String divTablecontent_Internalname ;
   private String Dvpanel_panel_filtros_Internalname ;
   private String divPanel_filtros_Internalname ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
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
   private String edtavSalextalb_Internalname ;
   private String edtavSalextalb_Jsonclick ;
   private String edtavSalextfec_Internalname ;
   private String edtavSalextfec_Jsonclick ;
   private String edtavSalfecsal_Internalname ;
   private String edtavSalfecsal_Jsonclick ;
   private String edtavSalexthor_Internalname ;
   private String AV52SalExtHor ;
   private String edtavSalexthor_Jsonclick ;
   private String edtavSalfhh_Internalname ;
   private String edtavSalfhh_Jsonclick ;
   private String edtavSalextatcud_Internalname ;
   private String AV63SalExtATCUD ;
   private String edtavSalextatcud_Jsonclick ;
   private String edtavSalextserat_Internalname ;
   private String AV64SalExtSerAT ;
   private String edtavSalextserat_Jsonclick ;
   private String edtavSalexttipat_Internalname ;
   private String AV65SalExtTipAT ;
   private String edtavSalexttipat_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String bttBtnatcud_Internalname ;
   private String bttBtnatcud_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV68Pgmname ;
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
   private String AV28Fichero ;
   private String AV43Station ;
   private String GXt_char3 ;
   private String AV44EmprNom ;
   private String AV45UsurCod ;
   private String Gx_msg ;
   private String GXv_char4[] ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String AV23ALbLic ;
   private java.util.Date wcpOAV51SalFhh ;
   private java.util.Date AV51SalFhh ;
   private java.util.Date AV56FechaHoraSalida ;
   private java.util.Date AV57DiaHact ;
   private java.util.Date AV55InoutFechaHoraSalida ;
   private java.util.Date GXt_dtime1 ;
   private java.util.Date GXv_dtime2[] ;
   private java.util.Date wcpOAV59SalExtFec ;
   private java.util.Date AV59SalExtFec ;
   private java.util.Date A2256SalExtFec ;
   private java.util.Date AV58diasalida ;
   private java.util.Date AV61SalFecSal ;
   private java.util.Date AV62SalExtFecIN ;
   private java.util.Date GXv_date10[] ;
   private java.util.Date AV22AlbProfch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_unnamedtable3_Autowidth ;
   private boolean Dvpanel_unnamedtable3_Autoheight ;
   private boolean Dvpanel_unnamedtable3_Collapsible ;
   private boolean Dvpanel_unnamedtable3_Collapsed ;
   private boolean Dvpanel_unnamedtable3_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable3_Autoscroll ;
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
   private boolean GXv_boolean12[] ;
   private String AV35Path ;
   private String AV60msg_control ;
   private String AV20Firma ;
   private String AV42Messages_tojson ;
   private String AV33FileR ;
   private String AV41Var_File ;
   private String AV46Var_mensaje ;
   private String AV25Albfmd ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable4 ;
   private com.genexus.util.GXFile AV29File ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H02AA2_A396EmprCod ;
   private String[] H02AA2_A395EmprCif ;
   private boolean[] H02AA2_n395EmprCif ;
   private int[] H02AA3_A2253SalExtAlb ;
   private String[] H02AA3_A396EmprCod ;
   private java.util.Date[] H02AA3_A2256SalExtFec ;
   private String[] H02AA3_A10742SalCodeID ;
   private String[] H02AA3_A10077SalFmd ;
   private short[] H02AA4_AV27Lineas ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV38Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message11[] ;
   private com.genexus.SdtMessages_Message AV40Message ;
}

final  class trabajoexterno_diahorasalida_hash_xml__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02AA2", "SELECT EmprCod, EmprCif FROM TXPEMPRES ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02AA3", "SELECT SalExtAlb, EmprCod, SalExtFec, SalCodeID, SalFmd FROM TXPCEXTSA WHERE EmprCod = ? and SalExtAlb = ? ORDER BY EmprCod, SalExtAlb ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H02AA4", "SELECT COUNT(*) FROM TXPEXHDPZ WHERE EmprCod = ? and SalExtAlb = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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

