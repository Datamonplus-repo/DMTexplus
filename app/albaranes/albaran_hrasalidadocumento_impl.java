package app.albaranes ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class albaran_hrasalidadocumento_impl extends GXDataArea
{
   public albaran_hrasalidadocumento_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public albaran_hrasalidadocumento_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( albaran_hrasalidadocumento_impl.class ));
   }

   public albaran_hrasalidadocumento_impl( int remoteHandle ,
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
            A396EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV14AlbDoc = (int)(GXutil.lval( httpContext.GetPar( "AlbDoc"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14AlbDoc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14AlbDoc), 8, 0));
               AV16FecSal = localUtil.parseDateParm( httpContext.GetPar( "FecSal")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16FecSal", localUtil.format(AV16FecSal, "99/99/99"));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECSAL", getSecureSignedToken( "", AV16FecSal));
               AV15TipoDoc = (byte)(GXutil.lval( httpContext.GetPar( "TipoDoc"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15TipoDoc", GXutil.str( AV15TipoDoc, 1, 0));
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
      pa1UU2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1UU2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.albaranes.albaran_hrasalidadocumento", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV14AlbDoc,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV16FecSal)),GXutil.URLEncode(GXutil.ltrimstr(AV15TipoDoc,1,0))}, new String[] {"EmprCod","AlbDoc","FecSal","TipoDoc"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECSAL", getSecureSignedToken( "", AV16FecSal));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vFECSALI", localUtil.dtoc( AV8Fecsali, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBDOC", GXutil.ltrim( localUtil.ntoc( AV14AlbDoc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPODOC", GXutil.ltrim( localUtil.ntoc( AV15TipoDoc, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECSAL", localUtil.dtoc( AV16FecSal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECSAL", getSecureSignedToken( "", AV16FecSal));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELINGDATOS_Width", GXutil.rtrim( Dvpanel_panelingdatos_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELINGDATOS_Autowidth", GXutil.booltostr( Dvpanel_panelingdatos_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELINGDATOS_Autoheight", GXutil.booltostr( Dvpanel_panelingdatos_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELINGDATOS_Cls", GXutil.rtrim( Dvpanel_panelingdatos_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELINGDATOS_Title", GXutil.rtrim( Dvpanel_panelingdatos_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELINGDATOS_Collapsible", GXutil.booltostr( Dvpanel_panelingdatos_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELINGDATOS_Collapsed", GXutil.booltostr( Dvpanel_panelingdatos_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELINGDATOS_Showcollapseicon", GXutil.booltostr( Dvpanel_panelingdatos_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELINGDATOS_Iconposition", GXutil.rtrim( Dvpanel_panelingdatos_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELINGDATOS_Autoscroll", GXutil.booltostr( Dvpanel_panelingdatos_Autoscroll));
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
         we1UU2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1UU2( ) ;
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
      return formatLink("app.albaranes.albaran_hrasalidadocumento", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV14AlbDoc,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV16FecSal)),GXutil.URLEncode(GXutil.ltrimstr(AV15TipoDoc,1,0))}, new String[] {"EmprCod","AlbDoc","FecSal","TipoDoc"})  ;
   }

   public String getPgmname( )
   {
      return "Albaranes.Albaran_HraSalidaDocumento" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Hora Salida de Documento", "") ;
   }

   public void wb1UU0( )
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
         ucDvpanel_panelingdatos.setProperty("Width", Dvpanel_panelingdatos_Width);
         ucDvpanel_panelingdatos.setProperty("AutoWidth", Dvpanel_panelingdatos_Autowidth);
         ucDvpanel_panelingdatos.setProperty("AutoHeight", Dvpanel_panelingdatos_Autoheight);
         ucDvpanel_panelingdatos.setProperty("Cls", Dvpanel_panelingdatos_Cls);
         ucDvpanel_panelingdatos.setProperty("Title", Dvpanel_panelingdatos_Title);
         ucDvpanel_panelingdatos.setProperty("Collapsible", Dvpanel_panelingdatos_Collapsible);
         ucDvpanel_panelingdatos.setProperty("Collapsed", Dvpanel_panelingdatos_Collapsed);
         ucDvpanel_panelingdatos.setProperty("ShowCollapseIcon", Dvpanel_panelingdatos_Showcollapseicon);
         ucDvpanel_panelingdatos.setProperty("IconPosition", Dvpanel_panelingdatos_Iconposition);
         ucDvpanel_panelingdatos.setProperty("AutoScroll", Dvpanel_panelingdatos_Autoscroll);
         ucDvpanel_panelingdatos.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelingdatos_Internalname, "DVPANEL_PANELINGDATOSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELINGDATOSContainer"+"PanelIngDatos"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelingdatos_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTblcabdatos_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup1_Internalname, httpContext.getMessage( "Informação", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_Albaranes\\Albaran_HraSalidaDocumento.htm");
         wb_table1_24_1UU2( true) ;
      }
      else
      {
         wb_table1_24_1UU2( false) ;
      }
      return  ;
   }

   public void wb_table1_24_1UU2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
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
         app.GxWebStd.gx_div_start( httpContext, divTblingdatos_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFechasali_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFechasali_Internalname, httpContext.getMessage( "Data", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFechasali_Internalname, GXutil.ltrim( localUtil.ntoc( AV17FechaSali, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFechasali_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV17FechaSali), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV17FechaSali), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFechasali_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFechasali_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\Albaran_HraSalidaDocumento.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbhorsal_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbhorsal_Internalname, httpContext.getMessage( "Hora Saida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbhorsal_Internalname, GXutil.rtrim( AV7AlbHorSal), GXutil.rtrim( localUtil.format( AV7AlbHorSal, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbhorsal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbhorsal_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\Albaran_HraSalidaDocumento.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnbtnconfirmar_Internalname, "", httpContext.getMessage( "Confirmar DARA-HORA ENVIO", ""), bttBtnbtnconfirmar_Jsonclick, 5, httpContext.getMessage( "Confirmar DARA-HORA ENVIO", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOBTNCONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Albaranes\\Albaran_HraSalidaDocumento.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV21Pgmname), GXutil.rtrim( localUtil.format( AV21Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\Albaran_HraSalidaDocumento.htm");
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

   public void start1UU2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Hora Salida de Documento", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1UU0( ) ;
   }

   public void ws1UU2( )
   {
      start1UU2( ) ;
      evt1UU2( ) ;
   }

   public void evt1UU2( )
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
                           e111UU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOBTNCONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoBtnConfirmar' */
                           e121UU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e131UU2 ();
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

   public void we1UU2( )
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

   public void pa1UU2( )
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
            GX_FocusControl = edtavUsurcod_Internalname ;
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
      rf1UU2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV21Pgmname = "Albaranes.Albaran_HraSalidaDocumento" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Pgmname", AV21Pgmname);
      Gx_date = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "ZZZ9"));
      Gx_err = (short)(0) ;
      edtavToday_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavToday_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavToday_Enabled), 5, 0), true);
      edtavUsurcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUsurcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUsurcod_Enabled), 5, 0), true);
      edtavEmprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEmprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprcod_Enabled), 5, 0), true);
      edtavEmprnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEmprnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprnom_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1UU2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H01UU2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            /* Execute user event: Load */
            e131UU2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb1UU0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1UU2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vFECSAL", localUtil.dtoc( AV16FecSal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECSAL", getSecureSignedToken( "", AV16FecSal));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
   }

   public void before_start_formulas( )
   {
      AV21Pgmname = "Albaranes.Albaran_HraSalidaDocumento" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Pgmname", AV21Pgmname);
      Gx_date = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "ZZZ9"));
      Gx_err = (short)(0) ;
      edtavToday_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavToday_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavToday_Enabled), 5, 0), true);
      edtavUsurcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUsurcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUsurcod_Enabled), 5, 0), true);
      edtavEmprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEmprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprcod_Enabled), 5, 0), true);
      edtavEmprnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEmprnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprnom_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1UU0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111UU2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Dvpanel_panelingdatos_Width = httpContext.cgiGet( "DVPANEL_PANELINGDATOS_Width") ;
         Dvpanel_panelingdatos_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELINGDATOS_Autowidth")) ;
         Dvpanel_panelingdatos_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELINGDATOS_Autoheight")) ;
         Dvpanel_panelingdatos_Cls = httpContext.cgiGet( "DVPANEL_PANELINGDATOS_Cls") ;
         Dvpanel_panelingdatos_Title = httpContext.cgiGet( "DVPANEL_PANELINGDATOS_Title") ;
         Dvpanel_panelingdatos_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELINGDATOS_Collapsible")) ;
         Dvpanel_panelingdatos_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELINGDATOS_Collapsed")) ;
         Dvpanel_panelingdatos_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELINGDATOS_Showcollapseicon")) ;
         Dvpanel_panelingdatos_Iconposition = httpContext.cgiGet( "DVPANEL_PANELINGDATOS_Iconposition") ;
         Dvpanel_panelingdatos_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELINGDATOS_Autoscroll")) ;
         /* Read variables values. */
         Gx_date = localUtil.ctod( httpContext.cgiGet( edtavToday_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "ZZZ9"));
         AV6UsurCod = GXutil.upper( httpContext.cgiGet( edtavUsurcod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6UsurCod", AV6UsurCod);
         AV9EmprCod = GXutil.upper( httpContext.cgiGet( edtavEmprcod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9EmprCod", AV9EmprCod);
         AV5EmprNom = httpContext.cgiGet( edtavEmprnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5EmprNom", AV5EmprNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavFechasali_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavFechasali_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFECHASALI");
            GX_FocusControl = edtavFechasali_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17FechaSali = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17FechaSali", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17FechaSali), 4, 0));
         }
         else
         {
            AV17FechaSali = (short)(localUtil.ctol( httpContext.cgiGet( edtavFechasali_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17FechaSali", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17FechaSali), 4, 0));
         }
         AV7AlbHorSal = httpContext.cgiGet( edtavAlbhorsal_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7AlbHorSal", AV7AlbHorSal);
         AV21Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Pgmname", AV21Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e111UU2 ();
      if (returnInSub) return;
   }

   public void e111UU2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV6UsurCod = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6UsurCod", AV6UsurCod);
      GXt_char1 = AV10Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      albaran_hrasalidadocumento_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV5EmprNom ;
      GXv_char4[0] = AV6UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV10Station, GXv_char2, GXv_char3, GXv_char4) ;
      albaran_hrasalidadocumento_impl.this.A396EmprCod = GXv_char2[0] ;
      albaran_hrasalidadocumento_impl.this.AV5EmprNom = GXv_char3[0] ;
      albaran_hrasalidadocumento_impl.this.AV6UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprNom", AV5EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV6UsurCod", AV6UsurCod);
      AV9EmprCod = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9EmprCod", AV9EmprCod);
      GXt_char1 = AV7AlbHorSal ;
      GXv_char4[0] = AV9EmprCod ;
      GXv_char3[0] = GXt_char1 ;
      new app.phragr3(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      albaran_hrasalidadocumento_impl.this.AV9EmprCod = GXv_char4[0] ;
      albaran_hrasalidadocumento_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9EmprCod", AV9EmprCod);
      AV7AlbHorSal = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7AlbHorSal", AV7AlbHorSal);
      AV8Fecsali = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Fecsali", localUtil.format(AV8Fecsali, "99/99/99"));
      GXt_char1 = AV10Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      albaran_hrasalidadocumento_impl.this.GXt_char1 = GXv_char4[0] ;
      AV10Station = GXt_char1 ;
      GXv_char4[0] = AV9EmprCod ;
      GXv_char3[0] = AV5EmprNom ;
      GXv_char2[0] = AV6UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV10Station, GXv_char4, GXv_char3, GXv_char2) ;
      albaran_hrasalidadocumento_impl.this.AV9EmprCod = GXv_char4[0] ;
      albaran_hrasalidadocumento_impl.this.AV5EmprNom = GXv_char3[0] ;
      albaran_hrasalidadocumento_impl.this.AV6UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9EmprCod", AV9EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprNom", AV5EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV6UsurCod", AV6UsurCod);
   }

   public void e121UU2( )
   {
      /* 'DoBtnConfirmar' Routine */
      returnInSub = false ;
      AV11Var1 = localUtil.dtoc( AV8Fecsali, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + AV7AlbHorSal ;
      AV12Var2 = localUtil.ctot( AV11Var1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV13DiaHact = GXutil.serverNow( context, remoteHandle, pr_default) ;
      if ( AV12Var2.before( GXutil.serverNow( context, remoteHandle, pr_default) ) )
      {
         Gx_msg = httpContext.getMessage( "Erro. Dia-Hora ", "") + localUtil.ttoc( AV12Var2, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " inferior a ", "") + localUtil.ttoc( AV13DiaHact, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      else
      {
         GXv_char4[0] = AV9EmprCod ;
         GXv_int5[0] = AV14AlbDoc ;
         GXv_date6[0] = AV8Fecsali ;
         GXv_char3[0] = AV7AlbHorSal ;
         GXv_int7[0] = AV15TipoDoc ;
         new app.phhmms(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_date6, GXv_char3, GXv_int7) ;
         albaran_hrasalidadocumento_impl.this.AV9EmprCod = GXv_char4[0] ;
         albaran_hrasalidadocumento_impl.this.AV14AlbDoc = GXv_int5[0] ;
         albaran_hrasalidadocumento_impl.this.AV8Fecsali = GXv_date6[0] ;
         albaran_hrasalidadocumento_impl.this.AV7AlbHorSal = GXv_char3[0] ;
         albaran_hrasalidadocumento_impl.this.AV15TipoDoc = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9EmprCod", AV9EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV14AlbDoc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14AlbDoc), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV8Fecsali", localUtil.format(AV8Fecsali, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV7AlbHorSal", AV7AlbHorSal);
         httpContext.ajax_rsp_assign_attri("", false, "AV15TipoDoc", GXutil.str( AV15TipoDoc, 1, 0));
         httpContext.setWebReturnParms(new Object[] {A396EmprCod,Integer.valueOf(AV14AlbDoc),localUtil.format( AV16FecSal, "99/99/99"),Byte.valueOf(AV15TipoDoc)});
         httpContext.setWebReturnParmsMetadata(new Object[] {"A396EmprCod","AV14AlbDoc","AV16FecSal","AV15TipoDoc"});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e131UU2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_24_1UU2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblGrupoinfo_Internalname, tblGrupoinfo_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtabletoday_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 MergeLabelCell CellWidth_12_5", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocktoday_Internalname, httpContext.getMessage( "Data:", ""), "", "", lblTextblocktoday_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Albaranes\\Albaran_HraSalidaDocumento.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellWidth_87_5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavToday_Internalname, httpContext.getMessage( "Today", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavToday_Internalname, localUtil.format(Gx_date, "ZZZ9"), localUtil.format( Gx_date, "ZZZ9"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavToday_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavToday_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\Albaran_HraSalidaDocumento.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableusurcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 MergeLabelCell CellWidth_12_5", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockusurcod_Internalname, httpContext.getMessage( "Operador:", ""), "", "", lblTextblockusurcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Albaranes\\Albaran_HraSalidaDocumento.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellWidth_87_5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavUsurcod_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUsurcod_Internalname, GXutil.rtrim( AV6UsurCod), GXutil.rtrim( localUtil.format( AV6UsurCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUsurcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavUsurcod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\Albaran_HraSalidaDocumento.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableemprcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockemprcod_Internalname, httpContext.getMessage( "Empresa:", ""), "", "", lblTextblockemprcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Albaranes\\Albaran_HraSalidaDocumento.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-11", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavEmprcod_Internalname, httpContext.getMessage( "Código Empresa", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavEmprcod_Internalname, GXutil.rtrim( AV9EmprCod), GXutil.rtrim( localUtil.format( AV9EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEmprcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavEmprcod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\Albaran_HraSalidaDocumento.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableemprnom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockemprnom_Internalname, "", "", "", lblTextblockemprnom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Albaranes\\Albaran_HraSalidaDocumento.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavEmprnom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavEmprnom_Internalname, GXutil.rtrim( AV5EmprNom), GXutil.rtrim( localUtil.format( AV5EmprNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEmprnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavEmprnom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\Albaran_HraSalidaDocumento.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_24_1UU2e( true) ;
      }
      else
      {
         wb_table1_24_1UU2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      AV14AlbDoc = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14AlbDoc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14AlbDoc), 8, 0));
      AV16FecSal = (java.util.Date)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16FecSal", localUtil.format(AV16FecSal, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECSAL", getSecureSignedToken( "", AV16FecSal));
      AV15TipoDoc = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15TipoDoc", GXutil.str( AV15TipoDoc, 1, 0));
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
      pa1UU2( ) ;
      ws1UU2( ) ;
      we1UU2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415131213", true, true);
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
      httpContext.AddJavascriptSource("albaranes/albaran_hrasalidadocumento.js", "?202682415131213", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTextblocktoday_Internalname = "TEXTBLOCKTODAY" ;
      edtavToday_Internalname = "vTODAY" ;
      divUnnamedtabletoday_Internalname = "UNNAMEDTABLETODAY" ;
      lblTextblockusurcod_Internalname = "TEXTBLOCKUSURCOD" ;
      edtavUsurcod_Internalname = "vUSURCOD" ;
      divUnnamedtableusurcod_Internalname = "UNNAMEDTABLEUSURCOD" ;
      lblTextblockemprcod_Internalname = "TEXTBLOCKEMPRCOD" ;
      edtavEmprcod_Internalname = "vEMPRCOD" ;
      divUnnamedtableemprcod_Internalname = "UNNAMEDTABLEEMPRCOD" ;
      lblTextblockemprnom_Internalname = "TEXTBLOCKEMPRNOM" ;
      edtavEmprnom_Internalname = "vEMPRNOM" ;
      divUnnamedtableemprnom_Internalname = "UNNAMEDTABLEEMPRNOM" ;
      tblGrupoinfo_Internalname = "GRUPOINFO" ;
      grpUnnamedgroup1_Internalname = "UNNAMEDGROUP1" ;
      divTblcabdatos_Internalname = "TBLCABDATOS" ;
      edtavFechasali_Internalname = "vFECHASALI" ;
      edtavAlbhorsal_Internalname = "vALBHORSAL" ;
      divTblingdatos_Internalname = "TBLINGDATOS" ;
      bttBtnbtnconfirmar_Internalname = "BTNBTNCONFIRMAR" ;
      divPanelingdatos_Internalname = "PANELINGDATOS" ;
      Dvpanel_panelingdatos_Internalname = "DVPANEL_PANELINGDATOS" ;
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
      edtavEmprnom_Jsonclick = "" ;
      edtavEmprnom_Enabled = 1 ;
      edtavEmprcod_Jsonclick = "" ;
      edtavEmprcod_Enabled = 1 ;
      edtavUsurcod_Jsonclick = "" ;
      edtavUsurcod_Enabled = 1 ;
      edtavToday_Jsonclick = "" ;
      edtavToday_Enabled = 0 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavAlbhorsal_Jsonclick = "" ;
      edtavAlbhorsal_Enabled = 1 ;
      edtavFechasali_Jsonclick = "" ;
      edtavFechasali_Enabled = 1 ;
      Dvpanel_panelingdatos_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelingdatos_Iconposition = "Right" ;
      Dvpanel_panelingdatos_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelingdatos_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelingdatos_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_panelingdatos_Title = httpContext.getMessage( "HORA SALIDA DOCUMENTO", "") ;
      Dvpanel_panelingdatos_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelingdatos_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelingdatos_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelingdatos_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Hora Salida de Documento", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV16FecSal',fld:'vFECSAL',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOBTNCONFIRMAR'","{handler:'e121UU2',iparms:[{av:'AV8Fecsali',fld:'vFECSALI',pic:''},{av:'AV7AlbHorSal',fld:'vALBHORSAL',pic:''},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV14AlbDoc',fld:'vALBDOC',pic:'ZZZZZZZ9'},{av:'AV15TipoDoc',fld:'vTIPODOC',pic:'9'},{av:'AV16FecSal',fld:'vFECSAL',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("'DOBTNCONFIRMAR'",",oparms:[{av:'AV15TipoDoc',fld:'vTIPODOC',pic:'9'},{av:'AV7AlbHorSal',fld:'vALBHORSAL',pic:''},{av:'AV8Fecsali',fld:'vFECSALI',pic:''},{av:'AV14AlbDoc',fld:'vALBDOC',pic:'ZZZZZZZ9'},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
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
      wcpOA396EmprCod = "" ;
      wcpOAV16FecSal = GXutil.nullDate() ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV16FecSal = GXutil.nullDate() ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV8Fecsali = GXutil.nullDate() ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panelingdatos = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV7AlbHorSal = "" ;
      bttBtnbtnconfirmar_Jsonclick = "" ;
      AV21Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      Gx_date = GXutil.nullDate() ;
      scmdbuf = "" ;
      H01UU2_A396EmprCod = new String[] {""} ;
      AV6UsurCod = "" ;
      AV9EmprCod = "" ;
      AV5EmprNom = "" ;
      AV10Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV11Var1 = "" ;
      AV12Var2 = GXutil.resetTime( GXutil.nullDate() );
      AV13DiaHact = GXutil.resetTime( GXutil.nullDate() );
      Gx_msg = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_date6 = new java.util.Date[1] ;
      GXv_char3 = new String[1] ;
      GXv_int7 = new byte[1] ;
      sStyleString = "" ;
      lblTextblocktoday_Jsonclick = "" ;
      lblTextblockusurcod_Jsonclick = "" ;
      lblTextblockemprcod_Jsonclick = "" ;
      lblTextblockemprnom_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaran_hrasalidadocumento__default(),
         new Object[] {
             new Object[] {
            H01UU2_A396EmprCod
            }
         }
      );
      AV21Pgmname = "Albaranes.Albaran_HraSalidaDocumento" ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      AV21Pgmname = "Albaranes.Albaran_HraSalidaDocumento" ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
      edtavToday_Enabled = 0 ;
      edtavUsurcod_Enabled = 0 ;
      edtavEmprcod_Enabled = 0 ;
      edtavEmprnom_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV15TipoDoc ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV15TipoDoc ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte GXv_int7[] ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short AV17FechaSali ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV14AlbDoc ;
   private int AV14AlbDoc ;
   private int edtavFechasali_Enabled ;
   private int edtavAlbhorsal_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavToday_Enabled ;
   private int edtavUsurcod_Enabled ;
   private int edtavEmprcod_Enabled ;
   private int edtavEmprnom_Enabled ;
   private int GXv_int5[] ;
   private int idxLst ;
   private String wcpOA396EmprCod ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_panelingdatos_Width ;
   private String Dvpanel_panelingdatos_Cls ;
   private String Dvpanel_panelingdatos_Title ;
   private String Dvpanel_panelingdatos_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_panelingdatos_Internalname ;
   private String divPanelingdatos_Internalname ;
   private String divTblcabdatos_Internalname ;
   private String grpUnnamedgroup1_Internalname ;
   private String divTblingdatos_Internalname ;
   private String edtavFechasali_Internalname ;
   private String TempTags ;
   private String edtavFechasali_Jsonclick ;
   private String edtavAlbhorsal_Internalname ;
   private String AV7AlbHorSal ;
   private String edtavAlbhorsal_Jsonclick ;
   private String bttBtnbtnconfirmar_Internalname ;
   private String bttBtnbtnconfirmar_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV21Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavUsurcod_Internalname ;
   private String edtavToday_Internalname ;
   private String edtavEmprcod_Internalname ;
   private String edtavEmprnom_Internalname ;
   private String scmdbuf ;
   private String AV6UsurCod ;
   private String AV9EmprCod ;
   private String AV5EmprNom ;
   private String AV10Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV11Var1 ;
   private String Gx_msg ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String sStyleString ;
   private String tblGrupoinfo_Internalname ;
   private String divUnnamedtabletoday_Internalname ;
   private String lblTextblocktoday_Internalname ;
   private String lblTextblocktoday_Jsonclick ;
   private String edtavToday_Jsonclick ;
   private String divUnnamedtableusurcod_Internalname ;
   private String lblTextblockusurcod_Internalname ;
   private String lblTextblockusurcod_Jsonclick ;
   private String edtavUsurcod_Jsonclick ;
   private String divUnnamedtableemprcod_Internalname ;
   private String lblTextblockemprcod_Internalname ;
   private String lblTextblockemprcod_Jsonclick ;
   private String edtavEmprcod_Jsonclick ;
   private String divUnnamedtableemprnom_Internalname ;
   private String lblTextblockemprnom_Internalname ;
   private String lblTextblockemprnom_Jsonclick ;
   private String edtavEmprnom_Jsonclick ;
   private java.util.Date AV12Var2 ;
   private java.util.Date AV13DiaHact ;
   private java.util.Date wcpOAV16FecSal ;
   private java.util.Date AV16FecSal ;
   private java.util.Date AV8Fecsali ;
   private java.util.Date Gx_date ;
   private java.util.Date GXv_date6[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_panelingdatos_Autowidth ;
   private boolean Dvpanel_panelingdatos_Autoheight ;
   private boolean Dvpanel_panelingdatos_Collapsible ;
   private boolean Dvpanel_panelingdatos_Collapsed ;
   private boolean Dvpanel_panelingdatos_Showcollapseicon ;
   private boolean Dvpanel_panelingdatos_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelingdatos ;
   private IDataStoreProvider pr_default ;
   private String[] H01UU2_A396EmprCod ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class albaran_hrasalidadocumento__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01UU2", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

