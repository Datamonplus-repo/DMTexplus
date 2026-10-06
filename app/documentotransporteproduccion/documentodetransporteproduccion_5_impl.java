package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_5_impl extends GXDataArea
{
   public documentodetransporteproduccion_5_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public documentodetransporteproduccion_5_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_5_impl.class ));
   }

   public documentodetransporteproduccion_5_impl( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavAlbmarca = new HTMLChoice();
      chkavVermail = UIFactory.getCheckbox(this);
      chkavClimailpke = UIFactory.getCheckbox(this);
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "AuxEmprcod") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "AuxEmprcod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "AuxEmprcod") ;
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
            AV64AuxEmprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64AuxEmprcod", AV64AuxEmprcod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV10AlbProcod = GXutil.lval( httpContext.GetPar( "AlbProcod")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10AlbProcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10AlbProcod), 10, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10AlbProcod), "ZZZZZZZZZ9")));
               AV62albmarca = httpContext.GetPar( "albmarca") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV62albmarca", AV62albmarca);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBMARCA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62albmarca, ""))));
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
      pa2512( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2512( ) ;
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_5", new String[] {GXutil.URLEncode(GXutil.rtrim(AV64AuxEmprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV10AlbProcod,10,0)),GXutil.URLEncode(GXutil.rtrim(AV62albmarca))}, new String[] {"AuxEmprcod","AlbProcod","albmarca"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTRDATE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV58strDate, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTRTIME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV71strTime, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGMODA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17FlagModa), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGUIREMCLI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25Guiremcli), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOD_PAIS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31Cod_pais), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROFCH", getSecureSignedToken( "", AV28albprofch));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDIRECTORY", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV65Directory, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLIMAILGRE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26CliMailGrE, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10AlbProcod), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBMARCA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62albmarca, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DocumentodeTransporteProduccion_5");
      forbiddenHiddens.add("CliMailgr", GXutil.rtrim( localUtil.format( AV23CliMailgr, "")));
      forbiddenHiddens.add("PATHPDF", GXutil.rtrim( localUtil.format( AV35PATHPDF, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("documentotransporteproduccion\\documentodetransporteproduccion_5:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vSTRDATE", AV58strDate);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTRDATE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV58strDate, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTRTIME", AV71strTime);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTRTIME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV71strTime, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDT_MERGEPDF", AV51Sdt_MergePDF);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDT_MERGEPDF", AV51Sdt_MergePDF);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGMODA", GXutil.ltrim( localUtil.ntoc( AV17FlagModa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGMODA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17FlagModa), "ZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOPIA", AV16Copia);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOPIA", AV16Copia);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV9Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vGUIREMCLI", GXutil.ltrim( localUtil.ntoc( AV25Guiremcli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGUIREMCLI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25Guiremcli), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOD_PAIS", GXutil.ltrim( localUtil.ntoc( AV31Cod_pais, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOD_PAIS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31Cod_pais), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROFCH", localUtil.dtoc( AV28albprofch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROFCH", getSecureSignedToken( "", AV28albprofch));
      app.GxWebStd.gx_hidden_field( httpContext, "vDIRECTORY", AV65Directory);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDIRECTORY", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV65Directory, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEXCELFILENAME", AV32ExcelFilename);
      app.GxWebStd.gx_hidden_field( httpContext, "vCLIMAILGRE", GXutil.rtrim( AV26CliMailGrE));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLIMAILGRE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26CliMailGrE, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vAUXEMPRCOD", GXutil.rtrim( AV64AuxEmprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Width", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Autowidth", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Autoheight", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Cls", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Title", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Collapsible", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Collapsed", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Showcollapseicon", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Iconposition", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Autoscroll", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Autoscroll));
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
         we2512( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2512( ) ;
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
      return formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_5", new String[] {GXutil.URLEncode(GXutil.rtrim(AV64AuxEmprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV10AlbProcod,10,0)),GXutil.URLEncode(GXutil.rtrim(AV62albmarca))}, new String[] {"AuxEmprcod","AlbProcod","albmarca"})  ;
   }

   public String getPgmname( )
   {
      return "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_5" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Imprimir", "") ;
   }

   public void wb2510( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panel_filtrosgenerales.setProperty("Width", Dvpanel_panel_filtrosgenerales_Width);
         ucDvpanel_panel_filtrosgenerales.setProperty("AutoWidth", Dvpanel_panel_filtrosgenerales_Autowidth);
         ucDvpanel_panel_filtrosgenerales.setProperty("AutoHeight", Dvpanel_panel_filtrosgenerales_Autoheight);
         ucDvpanel_panel_filtrosgenerales.setProperty("Cls", Dvpanel_panel_filtrosgenerales_Cls);
         ucDvpanel_panel_filtrosgenerales.setProperty("Title", Dvpanel_panel_filtrosgenerales_Title);
         ucDvpanel_panel_filtrosgenerales.setProperty("Collapsible", Dvpanel_panel_filtrosgenerales_Collapsible);
         ucDvpanel_panel_filtrosgenerales.setProperty("Collapsed", Dvpanel_panel_filtrosgenerales_Collapsed);
         ucDvpanel_panel_filtrosgenerales.setProperty("ShowCollapseIcon", Dvpanel_panel_filtrosgenerales_Showcollapseicon);
         ucDvpanel_panel_filtrosgenerales.setProperty("IconPosition", Dvpanel_panel_filtrosgenerales_Iconposition);
         ucDvpanel_panel_filtrosgenerales.setProperty("AutoScroll", Dvpanel_panel_filtrosgenerales_Autoscroll);
         ucDvpanel_panel_filtrosgenerales.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel_filtrosgenerales_Internalname, "DVPANEL_PANEL_FILTROSGENERALESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANEL_FILTROSGENERALESContainer"+"Panel_FiltrosGenerales"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel_filtrosgenerales_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprocod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprocod_Internalname, httpContext.getMessage( "Nº Guia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprocod_Internalname, GXutil.ltrim( localUtil.ntoc( AV10AlbProcod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbprocod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV10AlbProcod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV10AlbProcod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprocod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprocod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_5.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCopias2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCopias2_Internalname, httpContext.getMessage( "Copias", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCopias2_Internalname, GXutil.ltrim( localUtil.ntoc( AV11Copias2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCopias2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV11Copias2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV11Copias2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCopias2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCopias2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_5.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-7", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavAlbmarca.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavAlbmarca.getInternalname(), httpContext.getMessage( "Tipo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavAlbmarca, cmbavAlbmarca.getInternalname(), GXutil.rtrim( AV62albmarca), 1, cmbavAlbmarca.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavAlbmarca.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_5.htm");
         cmbavAlbmarca.setValue( GXutil.rtrim( AV62albmarca) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbmarca.getInternalname(), "Values", cmbavAlbmarca.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, divTable_filtrosgenerales_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavVermail.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavVermail.getInternalname(), httpContext.getMessage( "Veja a ecran de envio de correio?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavVermail.getInternalname(), GXutil.booltostr( AV36VerMail), "", httpContext.getMessage( "Veja a ecran de envio de correio?", ""), 1, chkavVermail.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(46, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,46);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClimailgr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClimailgr_Internalname, httpContext.getMessage( "E-mail Guia Remessa", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClimailgr_Internalname, GXutil.rtrim( AV23CliMailgr), GXutil.rtrim( localUtil.format( AV23CliMailgr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClimailgr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClimailgr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_5.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPathpdf_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPathpdf_Internalname, httpContext.getMessage( "Path", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPathpdf_Internalname, GXutil.rtrim( AV35PATHPDF), GXutil.rtrim( localUtil.format( AV35PATHPDF, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPathpdf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPathpdf_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_5.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_acciones_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_5.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_5.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divTable_progress_Internalname, 1, 0, "px", 0, "px", "Table_ProgressBar", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucProgressbar.render(context, "gxprogressindicator", Progressbar_Internalname, "PROGRESSBARContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV74Pgmname), GXutil.rtrim( localUtil.format( AV74Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_5.htm");
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
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavClimailpke.getInternalname(), AV27CliMailPkE, "", "", chkavClimailpke.getVisible(), 1, "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(81, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,81);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start2512( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Imprimir", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2510( ) ;
   }

   public void ws2512( )
   {
      start2512( ) ;
      evt2512( ) ;
   }

   public void evt2512( )
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
                           e112512 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e122512 ();
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
                                 e132512 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e142512 ();
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

   public void we2512( )
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

   public void pa2512( )
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
            GX_FocusControl = edtavCopias2_Internalname ;
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
      if ( cmbavAlbmarca.getItemCount() > 0 )
      {
         AV62albmarca = cmbavAlbmarca.getValidValue(AV62albmarca) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62albmarca", AV62albmarca);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBMARCA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62albmarca, ""))));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavAlbmarca.setValue( GXutil.rtrim( AV62albmarca) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbmarca.getInternalname(), "Values", cmbavAlbmarca.ToJavascriptSource(), true);
      }
      AV36VerMail = GXutil.strtobool( GXutil.booltostr( AV36VerMail)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36VerMail", AV36VerMail);
      AV27CliMailPkE = ((GXutil.strcmp(GXutil.rtrim( AV27CliMailPkE), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27CliMailPkE", AV27CliMailPkE);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2512( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV74Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_5" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74Pgmname", AV74Pgmname);
      Gx_err = (short)(0) ;
      edtavAlbprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprocod_Enabled), 5, 0), true);
      cmbavAlbmarca.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbmarca.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavAlbmarca.getEnabled(), 5, 0), true);
      edtavClimailgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClimailgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClimailgr_Enabled), 5, 0), true);
      edtavPathpdf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPathpdf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPathpdf_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2512( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e142512 ();
         wb2510( ) ;
      }
   }

   public void send_integrity_lvl_hashes2512( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vSTRDATE", AV58strDate);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTRDATE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV58strDate, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTRTIME", AV71strTime);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTRTIME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV71strTime, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGMODA", GXutil.ltrim( localUtil.ntoc( AV17FlagModa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGMODA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17FlagModa), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV9Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vGUIREMCLI", GXutil.ltrim( localUtil.ntoc( AV25Guiremcli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGUIREMCLI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25Guiremcli), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOD_PAIS", GXutil.ltrim( localUtil.ntoc( AV31Cod_pais, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOD_PAIS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31Cod_pais), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROFCH", localUtil.dtoc( AV28albprofch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROFCH", getSecureSignedToken( "", AV28albprofch));
      app.GxWebStd.gx_hidden_field( httpContext, "vDIRECTORY", AV65Directory);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDIRECTORY", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV65Directory, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLIMAILGRE", GXutil.rtrim( AV26CliMailGrE));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLIMAILGRE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26CliMailGrE, ""))));
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV74Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_5" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74Pgmname", AV74Pgmname);
      Gx_err = (short)(0) ;
      edtavAlbprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprocod_Enabled), 5, 0), true);
      cmbavAlbmarca.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbmarca.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavAlbmarca.getEnabled(), 5, 0), true);
      edtavClimailgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClimailgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClimailgr_Enabled), 5, 0), true);
      edtavPathpdf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPathpdf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPathpdf_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2510( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e112512 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Dvpanel_panel_filtrosgenerales_Width = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Width") ;
         Dvpanel_panel_filtrosgenerales_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Autowidth")) ;
         Dvpanel_panel_filtrosgenerales_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Autoheight")) ;
         Dvpanel_panel_filtrosgenerales_Cls = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Cls") ;
         Dvpanel_panel_filtrosgenerales_Title = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Title") ;
         Dvpanel_panel_filtrosgenerales_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Collapsible")) ;
         Dvpanel_panel_filtrosgenerales_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Collapsed")) ;
         Dvpanel_panel_filtrosgenerales_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Showcollapseicon")) ;
         Dvpanel_panel_filtrosgenerales_Iconposition = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Iconposition") ;
         Dvpanel_panel_filtrosgenerales_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Autoscroll")) ;
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCopias2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCopias2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOPIAS2");
            GX_FocusControl = edtavCopias2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11Copias2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11Copias2), 4, 0));
         }
         else
         {
            AV11Copias2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavCopias2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11Copias2), 4, 0));
         }
         AV36VerMail = GXutil.strtobool( httpContext.cgiGet( chkavVermail.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36VerMail", AV36VerMail);
         AV23CliMailgr = httpContext.cgiGet( edtavClimailgr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23CliMailgr", AV23CliMailgr);
         AV35PATHPDF = httpContext.cgiGet( edtavPathpdf_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35PATHPDF", AV35PATHPDF);
         AV74Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV74Pgmname", AV74Pgmname);
         AV27CliMailPkE = ((GXutil.strcmp(httpContext.cgiGet( chkavClimailpke.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27CliMailPkE", AV27CliMailPkE);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"DocumentodeTransporteProduccion_5");
         AV23CliMailgr = httpContext.cgiGet( edtavClimailgr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23CliMailgr", AV23CliMailgr);
         forbiddenHiddens.add("CliMailgr", GXutil.rtrim( localUtil.format( AV23CliMailgr, "")));
         AV35PATHPDF = httpContext.cgiGet( edtavPathpdf_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35PATHPDF", AV35PATHPDF);
         forbiddenHiddens.add("PATHPDF", GXutil.rtrim( localUtil.format( AV35PATHPDF, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("documentotransporteproduccion\\documentodetransporteproduccion_5:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e112512 ();
      if (returnInSub) return;
   }

   public void e112512( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      documentodetransporteproduccion_5_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      GXv_char2[0] = AV9Emprcod ;
      GXv_char3[0] = AV13EmprNom ;
      GXv_char4[0] = AV14UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      documentodetransporteproduccion_5_impl.this.AV9Emprcod = GXv_char2[0] ;
      documentodetransporteproduccion_5_impl.this.AV13EmprNom = GXv_char3[0] ;
      documentodetransporteproduccion_5_impl.this.AV14UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Emprcod", AV9Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9Emprcod, "@!"))));
      chkavClimailpke.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavClimailpke.getInternalname(), "Visible", GXutil.ltrimstr( chkavClimailpke.getVisible(), 5, 0), true);
      GXt_int5 = AV15copias ;
      GXv_int6[0] = GXt_int5 ;
      new app.pbuscon(remoteHandle, context).execute( AV9Emprcod, "100005", GXv_int6) ;
      documentodetransporteproduccion_5_impl.this.GXt_int5 = GXv_int6[0] ;
      AV15copias = (short)(GXt_int5) ;
      if ( AV15copias == 0 )
      {
         AV15copias = (short)(1) ;
      }
      AV11Copias2 = AV15copias ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11Copias2), 4, 0));
      AV16Copia[1-1] = httpContext.getMessage( "Original", "") ;
      AV16Copia[2-1] = httpContext.getMessage( "Duplicado", "") ;
      AV16Copia[3-1] = httpContext.getMessage( "Triplicado", "") ;
      AV16Copia[4-1] = httpContext.getMessage( "Quadriplicado", "") ;
      GXt_int7 = (byte)(AV17FlagModa) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV9Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      documentodetransporteproduccion_5_impl.this.GXt_int7 = GXv_int8[0] ;
      AV17FlagModa = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17FlagModa", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17FlagModa), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGMODA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17FlagModa), "ZZZ9")));
      /* Using cursor H02512 */
      pr_default.execute(0, new Object[] {AV9Emprcod, Long.valueOf(AV10AlbProcod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A129BarCod = H02512_A129BarCod[0] ;
         A132BarCodReo = H02512_A132BarCodReo[0] ;
         A130BarCodPar = H02512_A130BarCodPar[0] ;
         A252CliCod = H02512_A252CliCod[0] ;
         n252CliCod = H02512_n252CliCod[0] ;
         A30AlbProCod = H02512_A30AlbProCod[0] ;
         A396EmprCod = H02512_A396EmprCod[0] ;
         A39AlbProPri = H02512_A39AlbProPri[0] ;
         A1902CliValA = H02512_A1902CliValA[0] ;
         A2242AlbSec = H02512_A2242AlbSec[0] ;
         A11620CliMailGr = H02512_A11620CliMailGr[0] ;
         A11621CliMailPk = H02512_A11621CliMailPk[0] ;
         A1243GuiRemCli = H02512_A1243GuiRemCli[0] ;
         A11622CliMailGrE = H02512_A11622CliMailGrE[0] ;
         A11623CliMailPkE = H02512_A11623CliMailPkE[0] ;
         A34AlbProfch = H02512_A34AlbProfch[0] ;
         A5291BarTipCor = H02512_A5291BarTipCor[0] ;
         A10301Cod_pais = H02512_A10301Cod_pais[0] ;
         n10301Cod_pais = H02512_n10301Cod_pais[0] ;
         A252CliCod = H02512_A252CliCod[0] ;
         n252CliCod = H02512_n252CliCod[0] ;
         A5291BarTipCor = H02512_A5291BarTipCor[0] ;
         A39AlbProPri = H02512_A39AlbProPri[0] ;
         A2242AlbSec = H02512_A2242AlbSec[0] ;
         A1243GuiRemCli = H02512_A1243GuiRemCli[0] ;
         A34AlbProfch = H02512_A34AlbProfch[0] ;
         A1902CliValA = H02512_A1902CliValA[0] ;
         A11620CliMailGr = H02512_A11620CliMailGr[0] ;
         A11621CliMailPk = H02512_A11621CliMailPk[0] ;
         A11622CliMailGrE = H02512_A11622CliMailGrE[0] ;
         A11623CliMailPkE = H02512_A11623CliMailPkE[0] ;
         A10301Cod_pais = H02512_A10301Cod_pais[0] ;
         n10301Cod_pais = H02512_n10301Cod_pais[0] ;
         AV21ALbProPri = A39AlbProPri ;
         AV20CliValA = A1902CliValA ;
         AV22AlbSec = A2242AlbSec ;
         AV23CliMailgr = A11620CliMailGr ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23CliMailgr", AV23CliMailgr);
         AV24CliMailpk = A11621CliMailPk ;
         AV25Guiremcli = A1243GuiRemCli ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25Guiremcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Guiremcli), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGUIREMCLI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25Guiremcli), "ZZZZZ9")));
         AV26CliMailGrE = A11622CliMailGrE ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26CliMailGrE", AV26CliMailGrE);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLIMAILGRE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26CliMailGrE, ""))));
         AV27CliMailPkE = A11623CliMailPkE ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27CliMailPkE", AV27CliMailPkE);
         AV28albprofch = A34AlbProfch ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28albprofch", localUtil.format(AV28albprofch, "99/99/99"));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROFCH", getSecureSignedToken( "", AV28albprofch));
         AV29BarTipCor = A5291BarTipCor ;
         AV31Cod_pais = A10301Cod_pais ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31Cod_pais", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Cod_pais), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOD_PAIS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31Cod_pais), "ZZZ9")));
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV36VerMail = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36VerMail", AV36VerMail);
      GXt_char1 = AV35PATHPDF ;
      GXv_char4[0] = GXt_char1 ;
      new app.pbusemplin(remoteHandle, context).execute( AV9Emprcod, httpContext.getMessage( "WEBPDF", ""), GXv_char4) ;
      documentodetransporteproduccion_5_impl.this.GXt_char1 = GXv_char4[0] ;
      AV35PATHPDF = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35PATHPDF", AV35PATHPDF);
      AV55Year = (short)(GXutil.year( Gx_date)) ;
      AV56Day = (byte)(GXutil.day( Gx_date)) ;
      AV57Mounth = (byte)(GXutil.month( Gx_date)) ;
      AV68Hour = (byte)(GXutil.hour( GXutil.now( ))) ;
      AV67Minute = (byte)(GXutil.minute( GXutil.now( ))) ;
      AV66Second = (byte)(GXutil.second( GXutil.now( ))) ;
      AV58strDate = GXutil.padl( GXutil.trim( GXutil.str( GXutil.year( AV28albprofch), 10, 0)), (short)(4), "0") + GXutil.padl( GXutil.trim( GXutil.str( GXutil.month( AV28albprofch), 10, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( GXutil.day( AV28albprofch), 10, 0)), (short)(2), "0") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58strDate", AV58strDate);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTRDATE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV58strDate, ""))));
      AV71strTime = GXutil.format( "%1%2%3", GXutil.padl( localUtil.format( DecimalUtil.doubleToDec(AV68Hour), "99"), (short)(2), "0"), GXutil.padl( localUtil.format( DecimalUtil.doubleToDec(AV67Minute), "99"), (short)(2), "0"), GXutil.padl( localUtil.format( DecimalUtil.doubleToDec(AV66Second), "99"), (short)(2), "0"), "", "", "", "", "", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71strTime", AV71strTime);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTRTIME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV71strTime, ""))));
   }

   public void e122512( )
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

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e132512 ();
      if (returnInSub) return;
   }

   public void e132512( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV61sAlbProcod = localUtil.format( DecimalUtil.doubleToDec(AV10AlbProcod), "ZZZZZZZZZ9") ;
      AV50ReportOutPut = GXutil.format( "%1", AV35PATHPDF, "", "", "", "", "", "", "", "") + GXutil.format( "##CLIENTE##_%1_%2%3.pdf", GXutil.trim( AV61sAlbProcod), AV58strDate, AV71strTime, "", "", "", "", "", "") ;
      AV38File.setSource( AV50ReportOutPut );
      if ( AV38File.exists() )
      {
         AV38File.delete();
      }
      AV77GXV1 = 1 ;
      while ( AV77GXV1 <= AV51Sdt_MergePDF.size() )
      {
         AV52Sdt_MergePDF_Item = (app.SdtSdt_MergePDF_PDF)((app.SdtSdt_MergePDF_PDF)AV51Sdt_MergePDF.elementAt(-1+AV77GXV1));
         AV46PathFile = AV52Sdt_MergePDF_Item.getgxTv_SdtSdt_MergePDF_PDF_Realpath() ;
         AV38File.setSource( AV46PathFile );
         if ( AV38File.exists() )
         {
            AV38File.delete();
         }
         AV77GXV1 = (int)(AV77GXV1+1) ;
      }
      AV49ReportInPut = "" ;
      AV49ReportInPut = GXutil.trim( AV35PATHPDF) ;
      AV53x = (short)(1) ;
      AV51Sdt_MergePDF.clear();
      AV18i = (short)(1) ;
      AV15copias = AV11Copias2 ;
      while ( AV15copias > 0 )
      {
         if ( AV17FlagModa == 1 )
         {
            if ( AV18i > 5 )
            {
               AV18i = (short)(5) ;
            }
            AV19TextoCopia = AV16Copia[AV18i-1] ;
            AV46PathFile = "" ;
            AV46PathFile = GXutil.format( httpContext.getMessage( "%1Report_%2_%3.pdf", ""), AV49ReportInPut, GXutil.trim( AV19TextoCopia), GXutil.trim( GXutil.str( AV53x, 4, 0)), "", "", "", "", "", "") ;
            new app.paguagrmodacopy1(remoteHandle, context).execute( AV46PathFile, AV9Emprcod, AV10AlbProcod, "", AV19TextoCopia) ;
            AV52Sdt_MergePDF_Item = (app.SdtSdt_MergePDF_PDF)new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
            AV52Sdt_MergePDF_Item.setgxTv_SdtSdt_MergePDF_PDF_Realpath( AV46PathFile );
            AV51Sdt_MergePDF.add(AV52Sdt_MergePDF_Item, 0);
            AV53x = (short)(AV53x+1) ;
            AV18i = (short)(AV18i+1) ;
         }
         AV30vCopias = (short)(1) ;
         AV15copias = (short)(AV15copias-1) ;
      }
      AV53x = (short)(AV53x+1) ;
      AV45ListPdfJson = AV51Sdt_MergePDF.toJSonString(false) ;
      AV59ReportCliCod = AV60websession.getValue(httpContext.getMessage( "PAguaGRMODACopy1_Clicod", "")) ;
      AV50ReportOutPut = GXutil.strReplace( AV50ReportOutPut, httpContext.getMessage( "##CLIENTE##", ""), GXutil.trim( AV59ReportCliCod)) ;
      AV48PathPDFFull = AV54AppTool.merge(AV45ListPdfJson, AV50ReportOutPut, true) ;
      AV60websession.remove(httpContext.getMessage( "PAguaGRMODACopy1_Clicod", ""));
      GXt_char1 = AV44Link ;
      GXv_char4[0] = GXt_char1 ;
      new app.viewfile(remoteHandle, context).execute( AV48PathPDFFull, "", GXv_char4) ;
      documentodetransporteproduccion_5_impl.this.GXt_char1 = GXv_char4[0] ;
      AV44Link = GXt_char1 ;
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "windows", "", new Object[] {AV44Link,httpContext.getMessage( "_blank", "")});
      if ( ( AV17FlagModa == 1 ) && ( GXutil.strcmp(AV27CliMailPkE, "S") == 0 ) )
      {
         GXv_char4[0] = AV32ExcelFilename ;
         GXv_char3[0] = AV33ErrorMessage ;
         GXv_char2[0] = AV34RutaAdjunto ;
         GXv_int9[0] = AV63lmetpi ;
         new app.documentotransporteproduccion.documentodetransporteproduccion_6(remoteHandle, context).execute( AV9Emprcod, AV10AlbProcod, AV25Guiremcli, AV31Cod_pais, AV28albprofch, AV65Directory, GXv_char4, GXv_char3, GXv_char2, GXv_int9) ;
         documentodetransporteproduccion_5_impl.this.AV32ExcelFilename = GXv_char4[0] ;
         documentodetransporteproduccion_5_impl.this.AV33ErrorMessage = GXv_char3[0] ;
         documentodetransporteproduccion_5_impl.this.AV34RutaAdjunto = GXv_char2[0] ;
         documentodetransporteproduccion_5_impl.this.AV63lmetpi = GXv_int9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32ExcelFilename", AV32ExcelFilename);
         AV38File.setSource( AV34RutaAdjunto );
         if ( AV38File.exists() )
         {
            GXt_char1 = AV44Link ;
            GXv_char4[0] = GXt_char1 ;
            new app.viewfile(remoteHandle, context).execute( AV32ExcelFilename, "", GXv_char4) ;
            documentodetransporteproduccion_5_impl.this.GXt_char1 = GXv_char4[0] ;
            AV44Link = GXt_char1 ;
            callWebObject(formatLink(AV44Link, new String[] {}, new String[] {}) );
            httpContext.wjLocDisableFrm = (byte)(0) ;
         }
         else
         {
            httpContext.GX_msglist.addItem(AV33ErrorMessage);
         }
         AV38File.close();
      }
      if ( ( AV17FlagModa == 1 ) && ( ( GXutil.strcmp(AV26CliMailGrE, "S") == 0 ) || ( GXutil.strcmp(AV27CliMailPkE, "S") == 0 ) ) && ( GXutil.strcmp(AV62albmarca, "A") != 0 ) )
      {
         if ( (GXutil.strcmp("", AV23CliMailgr)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente NO tiene mail", ""));
         }
         else
         {
            new app.albaranes.albaran_enviomailalbaranproduccionsdp(remoteHandle, context).execute( AV9Emprcod, AV10AlbProcod, AV28albprofch, AV50ReportOutPut, AV36VerMail) ;
         }
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV51Sdt_MergePDF", AV51Sdt_MergePDF);
   }

   protected void nextLoad( )
   {
   }

   protected void e142512( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV64AuxEmprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64AuxEmprcod", AV64AuxEmprcod);
      AV10AlbProcod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10AlbProcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10AlbProcod), 10, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10AlbProcod), "ZZZZZZZZZ9")));
      AV62albmarca = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62albmarca", AV62albmarca);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBMARCA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62albmarca, ""))));
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
      pa2512( ) ;
      ws2512( ) ;
      we2512( ) ;
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
      httpContext.AddStyleSheetFile("GXProgressIndicator/css/bootstrap-progressbar-3.0.1.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682813455058", true, true);
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
      httpContext.AddJavascriptSource("documentotransporteproduccion/documentodetransporteproduccion_5.js", "?202682813455058", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavAlbprocod_Internalname = "vALBPROCOD" ;
      edtavCopias2_Internalname = "vCOPIAS2" ;
      cmbavAlbmarca.setInternalname( "vALBMARCA" );
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      chkavVermail.setInternalname( "vVERMAIL" );
      edtavClimailgr_Internalname = "vCLIMAILGR" ;
      edtavPathpdf_Internalname = "vPATHPDF" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      Progressbar_Internalname = "PROGRESSBAR" ;
      divTable_progress_Internalname = "TABLE_PROGRESS" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      chkavClimailpke.setInternalname( "vCLIMAILPKE" );
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
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
      chkavClimailpke.setVisible( 1 );
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavPathpdf_Jsonclick = "" ;
      edtavPathpdf_Enabled = 1 ;
      edtavClimailgr_Jsonclick = "" ;
      edtavClimailgr_Enabled = 1 ;
      chkavVermail.setEnabled( 1 );
      cmbavAlbmarca.setJsonclick( "" );
      cmbavAlbmarca.setEnabled( 0 );
      edtavCopias2_Jsonclick = "" ;
      edtavCopias2_Enabled = 1 ;
      edtavAlbprocod_Jsonclick = "" ;
      edtavAlbprocod_Enabled = 0 ;
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
      Dvpanel_panel_filtrosgenerales_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Iconposition = "Right" ;
      Dvpanel_panel_filtrosgenerales_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtrosgenerales_Title = httpContext.getMessage( "Generales", "") ;
      Dvpanel_panel_filtrosgenerales_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_filtrosgenerales_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtrosgenerales_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Imprimir", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavAlbmarca.setName( "vALBMARCA" );
      cmbavAlbmarca.setWebtags( "" );
      cmbavAlbmarca.addItem("", httpContext.getMessage( "Activo", ""), (short)(0));
      cmbavAlbmarca.addItem("A", httpContext.getMessage( "Anulado", ""), (short)(0));
      if ( cmbavAlbmarca.getItemCount() > 0 )
      {
         AV62albmarca = cmbavAlbmarca.getValidValue(AV62albmarca) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62albmarca", AV62albmarca);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBMARCA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62albmarca, ""))));
      }
      chkavVermail.setName( "vVERMAIL" );
      chkavVermail.setWebtags( "" );
      chkavVermail.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavVermail.getInternalname(), "TitleCaption", chkavVermail.getCaption(), true);
      chkavVermail.setCheckedValue( "false" );
      AV36VerMail = GXutil.strtobool( GXutil.booltostr( AV36VerMail)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36VerMail", AV36VerMail);
      chkavClimailpke.setName( "vCLIMAILPKE" );
      chkavClimailpke.setWebtags( "" );
      chkavClimailpke.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavClimailpke.getInternalname(), "TitleCaption", chkavClimailpke.getCaption(), true);
      chkavClimailpke.setCheckedValue( "N" );
      AV27CliMailPkE = ((GXutil.strcmp(GXutil.rtrim( AV27CliMailPkE), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27CliMailPkE", AV27CliMailPkE);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV36VerMail',fld:'vVERMAIL',pic:''},{av:'AV27CliMailPkE',fld:'vCLIMAILPKE',pic:''},{av:'AV58strDate',fld:'vSTRDATE',pic:'',hsh:true},{av:'AV71strTime',fld:'vSTRTIME',pic:'',hsh:true},{av:'AV17FlagModa',fld:'vFLAGMODA',pic:'ZZZ9',hsh:true},{av:'AV9Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV25Guiremcli',fld:'vGUIREMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV31Cod_pais',fld:'vCOD_PAIS',pic:'ZZZ9',hsh:true},{av:'AV28albprofch',fld:'vALBPROFCH',pic:'',hsh:true},{av:'AV65Directory',fld:'vDIRECTORY',pic:'',hsh:true},{av:'AV26CliMailGrE',fld:'vCLIMAILGRE',pic:'',hsh:true},{av:'AV10AlbProcod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'cmbavAlbmarca'},{av:'AV62albmarca',fld:'vALBMARCA',pic:'',hsh:true},{av:'AV23CliMailgr',fld:'vCLIMAILGR',pic:''},{av:'AV35PATHPDF',fld:'vPATHPDF',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCERRAR'","{handler:'e122512',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("ENTER","{handler:'e132512',iparms:[{av:'AV10AlbProcod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV35PATHPDF',fld:'vPATHPDF',pic:''},{av:'AV58strDate',fld:'vSTRDATE',pic:'',hsh:true},{av:'AV71strTime',fld:'vSTRTIME',pic:'',hsh:true},{av:'AV51Sdt_MergePDF',fld:'vSDT_MERGEPDF',pic:''},{av:'AV11Copias2',fld:'vCOPIAS2',pic:'ZZZ9'},{av:'AV17FlagModa',fld:'vFLAGMODA',pic:'ZZZ9',hsh:true},{av:'AV16Copia',fld:'vCOPIA',pic:''},{av:'AV9Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV27CliMailPkE',fld:'vCLIMAILPKE',pic:''},{av:'AV25Guiremcli',fld:'vGUIREMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV31Cod_pais',fld:'vCOD_PAIS',pic:'ZZZ9',hsh:true},{av:'AV28albprofch',fld:'vALBPROFCH',pic:'',hsh:true},{av:'AV65Directory',fld:'vDIRECTORY',pic:'',hsh:true},{av:'AV32ExcelFilename',fld:'vEXCELFILENAME',pic:''},{av:'AV26CliMailGrE',fld:'vCLIMAILGRE',pic:'',hsh:true},{av:'cmbavAlbmarca'},{av:'AV62albmarca',fld:'vALBMARCA',pic:'',hsh:true},{av:'AV23CliMailgr',fld:'vCLIMAILGR',pic:''},{av:'AV36VerMail',fld:'vVERMAIL',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV51Sdt_MergePDF',fld:'vSDT_MERGEPDF',pic:''},{av:'AV32ExcelFilename',fld:'vEXCELFILENAME',pic:''}]}");
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
      wcpOAV64AuxEmprcod = "" ;
      wcpOAV62albmarca = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV64AuxEmprcod = "" ;
      AV62albmarca = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV58strDate = "" ;
      AV71strTime = "" ;
      AV9Emprcod = "" ;
      AV28albprofch = GXutil.nullDate() ;
      AV65Directory = "" ;
      AV26CliMailGrE = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV23CliMailgr = "" ;
      AV35PATHPDF = "" ;
      AV51Sdt_MergePDF = new GXBaseCollection<app.SdtSdt_MergePDF_PDF>(app.SdtSdt_MergePDF_PDF.class, "PDF", "TexplusNET", remoteHandle);
      AV16Copia = new String[5] ;
      GX_I = 1 ;
      while ( GX_I <= 5 )
      {
         AV16Copia[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV32ExcelFilename = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucProgressbar = new com.genexus.webpanels.GXUserControl();
      AV74Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV27CliMailPkE = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      Gx_date = GXutil.nullDate() ;
      hsh = "" ;
      AV12Station = "" ;
      AV13EmprNom = "" ;
      AV14UsurCod = "" ;
      GXv_int6 = new int[1] ;
      GXv_int8 = new byte[1] ;
      scmdbuf = "" ;
      H02512_A129BarCod = new int[1] ;
      H02512_A132BarCodReo = new byte[1] ;
      H02512_A130BarCodPar = new String[] {""} ;
      H02512_A252CliCod = new int[1] ;
      H02512_n252CliCod = new boolean[] {false} ;
      H02512_A30AlbProCod = new long[1] ;
      H02512_A396EmprCod = new String[] {""} ;
      H02512_A39AlbProPri = new String[] {""} ;
      H02512_A1902CliValA = new String[] {""} ;
      H02512_A2242AlbSec = new String[] {""} ;
      H02512_A11620CliMailGr = new String[] {""} ;
      H02512_A11621CliMailPk = new String[] {""} ;
      H02512_A1243GuiRemCli = new int[1] ;
      H02512_A11622CliMailGrE = new String[] {""} ;
      H02512_A11623CliMailPkE = new String[] {""} ;
      H02512_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H02512_A5291BarTipCor = new String[] {""} ;
      H02512_A10301Cod_pais = new short[1] ;
      H02512_n10301Cod_pais = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A39AlbProPri = "" ;
      A1902CliValA = "" ;
      A2242AlbSec = "" ;
      A11620CliMailGr = "" ;
      A11621CliMailPk = "" ;
      A11622CliMailGrE = "" ;
      A11623CliMailPkE = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A5291BarTipCor = "" ;
      AV21ALbProPri = "" ;
      AV20CliValA = "" ;
      AV22AlbSec = "" ;
      AV24CliMailpk = "" ;
      AV29BarTipCor = "" ;
      AV61sAlbProcod = "" ;
      AV50ReportOutPut = "" ;
      AV38File = new com.genexus.util.GXFile();
      AV52Sdt_MergePDF_Item = new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
      AV46PathFile = "" ;
      AV49ReportInPut = "" ;
      AV19TextoCopia = "" ;
      AV45ListPdfJson = "" ;
      AV59ReportCliCod = "" ;
      AV60websession = httpContext.getWebSession();
      AV48PathPDFFull = "" ;
      AV54AppTool = new app.SdtAppTool(remoteHandle, context);
      AV44Link = "" ;
      AV33ErrorMessage = "" ;
      GXv_char3 = new String[1] ;
      AV34RutaAdjunto = "" ;
      GXv_char2 = new String[1] ;
      GXv_int9 = new short[1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_5__default(),
         new Object[] {
             new Object[] {
            H02512_A129BarCod, H02512_A132BarCodReo, H02512_A130BarCodPar, H02512_A252CliCod, H02512_n252CliCod, H02512_A30AlbProCod, H02512_A396EmprCod, H02512_A39AlbProPri, H02512_A1902CliValA, H02512_A2242AlbSec,
            H02512_A11620CliMailGr, H02512_A11621CliMailPk, H02512_A1243GuiRemCli, H02512_A11622CliMailGrE, H02512_A11623CliMailPkE, H02512_A34AlbProfch, H02512_A5291BarTipCor, H02512_A10301Cod_pais, H02512_n10301Cod_pais
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV74Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_5" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV74Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_5" ;
      Gx_err = (short)(0) ;
      edtavAlbprocod_Enabled = 0 ;
      cmbavAlbmarca.setEnabled( 0 );
      edtavClimailgr_Enabled = 0 ;
      edtavPathpdf_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte A132BarCodReo ;
   private byte AV56Day ;
   private byte AV57Mounth ;
   private byte AV68Hour ;
   private byte AV67Minute ;
   private byte AV66Second ;
   private byte nGXWrapped ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV17FlagModa ;
   private short AV31Cod_pais ;
   private short wbEnd ;
   private short wbStart ;
   private short AV11Copias2 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV15copias ;
   private short A10301Cod_pais ;
   private short AV55Year ;
   private short AV53x ;
   private short AV18i ;
   private short AV30vCopias ;
   private short AV63lmetpi ;
   private short GXv_int9[] ;
   private int AV25Guiremcli ;
   private int edtavAlbprocod_Enabled ;
   private int edtavCopias2_Enabled ;
   private int edtavClimailgr_Enabled ;
   private int edtavPathpdf_Enabled ;
   private int edtavPgmname_Enabled ;
   private int GXt_int5 ;
   private int GXv_int6[] ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A1243GuiRemCli ;
   private int AV77GXV1 ;
   private int idxLst ;
   private int GX_I ;
   private long wcpOAV10AlbProcod ;
   private long AV10AlbProcod ;
   private long A30AlbProCod ;
   private String wcpOAV64AuxEmprcod ;
   private String wcpOAV62albmarca ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV64AuxEmprcod ;
   private String AV62albmarca ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV9Emprcod ;
   private String AV26CliMailGrE ;
   private String GXKey ;
   private String AV23CliMailgr ;
   private String AV35PATHPDF ;
   private String AV16Copia[] ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
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
   private String Dvpanel_panel_filtrosgenerales_Internalname ;
   private String divPanel_filtrosgenerales_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavAlbprocod_Internalname ;
   private String edtavAlbprocod_Jsonclick ;
   private String edtavCopias2_Internalname ;
   private String TempTags ;
   private String edtavCopias2_Jsonclick ;
   private String divTable_filtrosgenerales_Internalname ;
   private String edtavClimailgr_Internalname ;
   private String edtavClimailgr_Jsonclick ;
   private String edtavPathpdf_Internalname ;
   private String edtavPathpdf_Jsonclick ;
   private String divTable_acciones_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divTable_progress_Internalname ;
   private String Progressbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV74Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String AV27CliMailPkE ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String hsh ;
   private String AV12Station ;
   private String AV13EmprNom ;
   private String AV14UsurCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A39AlbProPri ;
   private String A1902CliValA ;
   private String A2242AlbSec ;
   private String A11620CliMailGr ;
   private String A11621CliMailPk ;
   private String A11622CliMailGrE ;
   private String A11623CliMailPkE ;
   private String A5291BarTipCor ;
   private String AV21ALbProPri ;
   private String AV20CliValA ;
   private String AV22AlbSec ;
   private String AV24CliMailpk ;
   private String AV29BarTipCor ;
   private String AV19TextoCopia ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private java.util.Date AV28albprofch ;
   private java.util.Date Gx_date ;
   private java.util.Date A34AlbProfch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_panel_filtrosgenerales_Autowidth ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoheight ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsible ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsed ;
   private boolean Dvpanel_panel_filtrosgenerales_Showcollapseicon ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoscroll ;
   private boolean Dvpanel_panel_filtros_Autowidth ;
   private boolean Dvpanel_panel_filtros_Autoheight ;
   private boolean Dvpanel_panel_filtros_Collapsible ;
   private boolean Dvpanel_panel_filtros_Collapsed ;
   private boolean Dvpanel_panel_filtros_Showcollapseicon ;
   private boolean Dvpanel_panel_filtros_Autoscroll ;
   private boolean wbLoad ;
   private boolean AV36VerMail ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private boolean n10301Cod_pais ;
   private String AV45ListPdfJson ;
   private String AV58strDate ;
   private String AV71strTime ;
   private String AV65Directory ;
   private String AV32ExcelFilename ;
   private String AV61sAlbProcod ;
   private String AV50ReportOutPut ;
   private String AV46PathFile ;
   private String AV49ReportInPut ;
   private String AV59ReportCliCod ;
   private String AV48PathPDFFull ;
   private String AV44Link ;
   private String AV33ErrorMessage ;
   private String AV34RutaAdjunto ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV60websession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucProgressbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXFile AV38File ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private app.SdtAppTool AV54AppTool ;
   private HTMLChoice cmbavAlbmarca ;
   private ICheckbox chkavVermail ;
   private ICheckbox chkavClimailpke ;
   private IDataStoreProvider pr_default ;
   private int[] H02512_A129BarCod ;
   private byte[] H02512_A132BarCodReo ;
   private String[] H02512_A130BarCodPar ;
   private int[] H02512_A252CliCod ;
   private boolean[] H02512_n252CliCod ;
   private long[] H02512_A30AlbProCod ;
   private String[] H02512_A396EmprCod ;
   private String[] H02512_A39AlbProPri ;
   private String[] H02512_A1902CliValA ;
   private String[] H02512_A2242AlbSec ;
   private String[] H02512_A11620CliMailGr ;
   private String[] H02512_A11621CliMailPk ;
   private int[] H02512_A1243GuiRemCli ;
   private String[] H02512_A11622CliMailGrE ;
   private String[] H02512_A11623CliMailPkE ;
   private java.util.Date[] H02512_A34AlbProfch ;
   private String[] H02512_A5291BarTipCor ;
   private short[] H02512_A10301Cod_pais ;
   private boolean[] H02512_n10301Cod_pais ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.SdtSdt_MergePDF_PDF> AV51Sdt_MergePDF ;
   private app.SdtSdt_MergePDF_PDF AV52Sdt_MergePDF_Item ;
}

final  class documentodetransporteproduccion_5__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02512", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.CliCod, T1.AlbProCod, T1.EmprCod, T3.AlbProPri, T4.CliValA, T3.AlbSec, T4.CliMailGr, T4.CliMailPk, T3.GuiRemCli, T4.CliMailGrE, T4.CliMailPkE, T3.AlbProfch, T2.BarTipCor, T4.Cod_pais FROM (((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T2.CliCod) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 100);
               ((String[]) buf[11])[0] = rslt.getString(11, 100);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 2);
               ((short[]) buf[17])[0] = rslt.getShort(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

