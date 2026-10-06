package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class preparoxmldocumentoproveedorat_impl extends GXDataArea
{
   public preparoxmldocumentoproveedorat_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public preparoxmldocumentoproveedorat_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preparoxmldocumentoproveedorat_impl.class ));
   }

   public preparoxmldocumentoproveedorat_impl( int remoteHandle ,
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
            AV10EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV20AlbProID = (int)(GXutil.lval( httpContext.GetPar( "AlbProID"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20AlbProID), 8, 0));
               AV21AlbProSys = localUtil.parseDTimeParm( httpContext.GetPar( "AlbProSys")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21AlbProSys", localUtil.ttoc( AV21AlbProSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV58AlbProDate = localUtil.parseDateParm( httpContext.GetPar( "AlbProDate")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV58AlbProDate", localUtil.format(AV58AlbProDate, "99/99/99"));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPRODATE", getSecureSignedToken( "", AV58AlbProDate));
               AV22AlbProSal = localUtil.parseDTimeParm( httpContext.GetPar( "AlbProSal")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV22AlbProSal", localUtil.ttoc( AV22AlbProSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV40Cadena = httpContext.GetPar( "Cadena") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV40Cadena", AV40Cadena);
               AV41Hash = httpContext.GetPar( "Hash") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV41Hash", AV41Hash);
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
      pa18T2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start18T2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.preparoxmldocumentoproveedorat", new String[] {GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV20AlbProID,8,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV21AlbProSys)),GXutil.URLEncode(GXutil.formatDateParm(AV58AlbProDate)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV22AlbProSal)),GXutil.URLEncode(GXutil.rtrim(AV40Cadena)),GXutil.URLEncode(GXutil.rtrim(AV41Hash))}, new String[] {"EmprCod","AlbProID","AlbProSys","AlbProDate","AlbProSal","Cadena","Hash"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSERIEAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV52SerieAT, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPRODATE", getSecureSignedToken( "", AV58AlbProDate));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"PreparoXMLDocumentoProveedorAT");
      forbiddenHiddens.add("Dir", GXutil.rtrim( localUtil.format( AV8Dir, "")));
      forbiddenHiddens.add("UserAT", GXutil.rtrim( localUtil.format( AV12UserAT, "")));
      forbiddenHiddens.add("PassAT", GXutil.rtrim( localUtil.format( AV11PassAT, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("stocksquimicos\\preparoxmldocumentoproveedorat:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV10EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPATH", AV39Path);
      app.GxWebStd.gx_hidden_field( httpContext, "vFICHERO", GXutil.rtrim( AV32Fichero));
      app.GxWebStd.gx_hidden_field( httpContext, "vLINEAS", GXutil.ltrim( localUtil.ntoc( AV31Lineas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCALPRO", GXutil.ltrim( localUtil.ntoc( AV24CalPro, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSERIEAT", GXutil.rtrim( AV52SerieAT));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSERIEAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV52SerieAT, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROID", GXutil.ltrim( localUtil.ntoc( A13418AlbProID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPRODATE", localUtil.dtoc( A13430AlbProDate, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROIDAT", GXutil.rtrim( A13436AlbProIDAT));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROHH", A13433AlbProHh);
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROINEX", GXutil.ltrim( localUtil.ntoc( A13452AlbProInEx, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROCNT", GXutil.ltrim( localUtil.ntoc( A13443AlbProCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCADENA", GXutil.rtrim( AV40Cadena));
      app.GxWebStd.gx_hidden_field( httpContext, "vHASH", GXutil.rtrim( AV41Hash));
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
         we18T2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt18T2( ) ;
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
      return formatLink("app.stocksquimicos.preparoxmldocumentoproveedorat", new String[] {GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV20AlbProID,8,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV21AlbProSys)),GXutil.URLEncode(GXutil.formatDateParm(AV58AlbProDate)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV22AlbProSal)),GXutil.URLEncode(GXutil.rtrim(AV40Cadena)),GXutil.URLEncode(GXutil.rtrim(AV41Hash))}, new String[] {"EmprCod","AlbProID","AlbProSys","AlbProDate","AlbProSal","Cadena","Hash"})  ;
   }

   public String getPgmname( )
   {
      return "StocksQuimicos.PreparoXMLDocumentoProveedorAT" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Preparo XML Documento Proveedor", "") ;
   }

   public void wb18T0( )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFechahorasalida_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFechahorasalida_Internalname, localUtil.ttoc( AV53FechaHoraSalida, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV53FechaHoraSalida, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFechahorasalida_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFechahorasalida_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\PreparoXMLDocumentoProveedorAT.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFechahorasalida_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFechahorasalida_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\PreparoXMLDocumentoProveedorAT.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDiahact_Internalname, localUtil.ttoc( AV54DiaHact, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV54DiaHact, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDiahact_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDiahact_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\PreparoXMLDocumentoProveedorAT.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDiahact_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavDiahact_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\PreparoXMLDocumentoProveedorAT.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDiasalida_Internalname, localUtil.format(AV55diasalida, "99/99/99"), localUtil.format( AV55diasalida, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDiasalida_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDiasalida_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\PreparoXMLDocumentoProveedorAT.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDiasalida_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavDiasalida_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\PreparoXMLDocumentoProveedorAT.htm");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmessage_Internalname, lblTbmessage_Caption, "", "", lblTbmessage_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_StocksQuimicos\\PreparoXMLDocumentoProveedorAT.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDir_Internalname, GXutil.rtrim( AV8Dir), GXutil.rtrim( localUtil.format( AV8Dir, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDir_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDir_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\PreparoXMLDocumentoProveedorAT.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUserat_Internalname, GXutil.rtrim( AV12UserAT), GXutil.rtrim( localUtil.format( AV12UserAT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUserat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavUserat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\PreparoXMLDocumentoProveedorAT.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPassat_Internalname, GXutil.rtrim( AV11PassAT), GXutil.rtrim( localUtil.format( AV11PassAT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPassat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPassat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(-1), (short)(0), 0, (byte)(0), (byte)(0), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\PreparoXMLDocumentoProveedorAT.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbproid_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbproid_Internalname, httpContext.getMessage( "Nº Guia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbproid_Internalname, GXutil.ltrim( localUtil.ntoc( AV20AlbProID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbproid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV20AlbProID), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV20AlbProID), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbproid_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbproid_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\PreparoXMLDocumentoProveedorAT.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprodate_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprodate_Internalname, httpContext.getMessage( "Data Guia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavAlbprodate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprodate_Internalname, localUtil.format(AV58AlbProDate, "99/99/99"), localUtil.format( AV58AlbProDate, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprodate_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprodate_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\PreparoXMLDocumentoProveedorAT.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbprodate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbprodate_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\PreparoXMLDocumentoProveedorAT.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprosal_Internalname, localUtil.ttoc( AV22AlbProSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV22AlbProSal, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprosal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprosal_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\PreparoXMLDocumentoProveedorAT.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbprosal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbprosal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\PreparoXMLDocumentoProveedorAT.htm");
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
         httpContext.writeText( "<div id=\""+edtavAlbprosys_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprosys_Internalname, localUtil.ttoc( AV21AlbProSys, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV21AlbProSys, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprosys_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprosys_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\PreparoXMLDocumentoProveedorAT.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbprosys_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbprosys_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\PreparoXMLDocumentoProveedorAT.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbproatcud_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbproatcud_Internalname, httpContext.getMessage( "ATCUD", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbproatcud_Internalname, GXutil.rtrim( AV62AlbProATCUD), GXutil.rtrim( localUtil.format( AV62AlbProATCUD, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbproatcud_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbproatcud_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\PreparoXMLDocumentoProveedorAT.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbproserat_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbproserat_Internalname, httpContext.getMessage( "Serie", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbproserat_Internalname, GXutil.rtrim( AV61AlbProSerAT), GXutil.rtrim( localUtil.format( AV61AlbProSerAT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbproserat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbproserat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\PreparoXMLDocumentoProveedorAT.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprotipat_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprotipat_Internalname, httpContext.getMessage( "Tipo doc.", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprotipat_Internalname, GXutil.rtrim( AV60AlbProTipAT), GXutil.rtrim( localUtil.format( AV60AlbProTipAT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprotipat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprotipat_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\PreparoXMLDocumentoProveedorAT.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\PreparoXMLDocumentoProveedorAT.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\PreparoXMLDocumentoProveedorAT.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnatcud_Internalname, "", httpContext.getMessage( "ATCUD", ""), bttBtnatcud_Jsonclick, 5, httpContext.getMessage( "ATCUD", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOATCUD\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\PreparoXMLDocumentoProveedorAT.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV65Pgmname), GXutil.rtrim( localUtil.format( AV65Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\PreparoXMLDocumentoProveedorAT.htm");
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

   public void start18T2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Preparo XML Documento Proveedor", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup18T0( ) ;
   }

   public void ws18T2( )
   {
      start18T2( ) ;
      evt18T2( ) ;
   }

   public void evt18T2( )
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
                           e1118T2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e1218T2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOATCUD'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoATCUD' */
                           e1318T2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOXML'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoXML' */
                           e1418T2 ();
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
                                 e1518T2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e1618T2 ();
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

   public void we18T2( )
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

   public void pa18T2( )
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
      rf18T2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV65Pgmname = "StocksQuimicos.PreparoXMLDocumentoProveedorAT" ;
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
      edtavAlbproid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbproid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbproid_Enabled), 5, 0), true);
      edtavAlbprodate_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprodate_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprodate_Enabled), 5, 0), true);
      edtavAlbprosal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprosal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprosal_Enabled), 5, 0), true);
      edtavAlbprosys_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprosys_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprosys_Enabled), 5, 0), true);
      edtavAlbproatcud_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbproatcud_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbproatcud_Enabled), 5, 0), true);
      edtavAlbproserat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbproserat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbproserat_Enabled), 5, 0), true);
      edtavAlbprotipat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprotipat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprotipat_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf18T2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1618T2 ();
         wb18T0( ) ;
      }
   }

   public void send_integrity_lvl_hashes18T2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vSERIEAT", GXutil.rtrim( AV52SerieAT));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSERIEAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV52SerieAT, ""))));
   }

   public void before_start_formulas( )
   {
      AV65Pgmname = "StocksQuimicos.PreparoXMLDocumentoProveedorAT" ;
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
      edtavAlbproid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbproid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbproid_Enabled), 5, 0), true);
      edtavAlbprodate_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprodate_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprodate_Enabled), 5, 0), true);
      edtavAlbprosal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprosal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprosal_Enabled), 5, 0), true);
      edtavAlbprosys_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprosys_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprosys_Enabled), 5, 0), true);
      edtavAlbproatcud_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbproatcud_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbproatcud_Enabled), 5, 0), true);
      edtavAlbproserat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbproserat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbproserat_Enabled), 5, 0), true);
      edtavAlbprotipat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprotipat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprotipat_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup18T0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1118T2 ();
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
            AV53FechaHoraSalida = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV53FechaHoraSalida", localUtil.ttoc( AV53FechaHoraSalida, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV53FechaHoraSalida = localUtil.ctot( httpContext.cgiGet( edtavFechahorasalida_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53FechaHoraSalida", localUtil.ttoc( AV53FechaHoraSalida, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavDiahact_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vDIAHACT");
            GX_FocusControl = edtavDiahact_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV54DiaHact = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV54DiaHact", localUtil.ttoc( AV54DiaHact, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV54DiaHact = localUtil.ctot( httpContext.cgiGet( edtavDiahact_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54DiaHact", localUtil.ttoc( AV54DiaHact, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDiasalida_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDIASALIDA");
            GX_FocusControl = edtavDiasalida_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV55diasalida = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55diasalida", localUtil.format(AV55diasalida, "99/99/99"));
         }
         else
         {
            AV55diasalida = localUtil.ctod( httpContext.cgiGet( edtavDiasalida_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55diasalida", localUtil.format(AV55diasalida, "99/99/99"));
         }
         AV8Dir = httpContext.cgiGet( edtavDir_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Dir", AV8Dir);
         AV12UserAT = httpContext.cgiGet( edtavUserat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12UserAT", AV12UserAT);
         AV11PassAT = httpContext.cgiGet( edtavPassat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11PassAT", AV11PassAT);
         AV62AlbProATCUD = httpContext.cgiGet( edtavAlbproatcud_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62AlbProATCUD", AV62AlbProATCUD);
         AV61AlbProSerAT = httpContext.cgiGet( edtavAlbproserat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61AlbProSerAT", AV61AlbProSerAT);
         AV60AlbProTipAT = httpContext.cgiGet( edtavAlbprotipat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60AlbProTipAT", AV60AlbProTipAT);
         AV65Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65Pgmname", AV65Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"PreparoXMLDocumentoProveedorAT");
         AV8Dir = httpContext.cgiGet( edtavDir_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Dir", AV8Dir);
         forbiddenHiddens.add("Dir", GXutil.rtrim( localUtil.format( AV8Dir, "")));
         AV12UserAT = httpContext.cgiGet( edtavUserat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12UserAT", AV12UserAT);
         forbiddenHiddens.add("UserAT", GXutil.rtrim( localUtil.format( AV12UserAT, "")));
         AV11PassAT = httpContext.cgiGet( edtavPassat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11PassAT", AV11PassAT);
         forbiddenHiddens.add("PassAT", GXutil.rtrim( localUtil.format( AV11PassAT, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("stocksquimicos\\preparoxmldocumentoproveedorat:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1118T2 ();
      if (returnInSub) return;
   }

   public void e1118T2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_dtime1 = AV53FechaHoraSalida ;
      GXv_dtime2[0] = GXt_dtime1 ;
      new app.stocksquimicos.ptrz001(remoteHandle, context).execute( AV10EmprCod, GXv_dtime2) ;
      preparoxmldocumentoproveedorat_impl.this.GXt_dtime1 = GXv_dtime2[0] ;
      AV53FechaHoraSalida = GXt_dtime1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53FechaHoraSalida", localUtil.ttoc( AV53FechaHoraSalida, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV56InoutFechaHoraSalida = AV53FechaHoraSalida ;
      AV54DiaHact = GXutil.serverNow( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54DiaHact", localUtil.ttoc( AV54DiaHact, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV55diasalida = GXutil.resetTime(localUtil.ctot( localUtil.ttoc( AV53FechaHoraSalida, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55diasalida", localUtil.format(AV55diasalida, "99/99/99"));
      GXt_char3 = AV8Dir ;
      GXv_char4[0] = GXt_char3 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "SAFTW1", ""), GXv_char4) ;
      preparoxmldocumentoproveedorat_impl.this.GXt_char3 = GXv_char4[0] ;
      AV8Dir = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Dir", AV8Dir);
      if ( GXutil.strcmp(AV8Dir, "") == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Path ¡¡¡¡.Revisar Contador SAFTW1", ""));
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      GXt_char3 = AV12UserAT ;
      GXv_char4[0] = AV10EmprCod ;
      GXv_char5[0] = httpContext.getMessage( "USEAT5", "") ;
      GXv_char6[0] = GXt_char3 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_char6) ;
      preparoxmldocumentoproveedorat_impl.this.AV10EmprCod = GXv_char4[0] ;
      preparoxmldocumentoproveedorat_impl.this.GXt_char3 = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      AV12UserAT = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12UserAT", AV12UserAT);
      GXt_char3 = AV11PassAT ;
      GXv_char6[0] = AV10EmprCod ;
      GXv_char5[0] = httpContext.getMessage( "PASAT5", "") ;
      GXv_char4[0] = GXt_char3 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4) ;
      preparoxmldocumentoproveedorat_impl.this.AV10EmprCod = GXv_char6[0] ;
      preparoxmldocumentoproveedorat_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      AV11PassAT = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11PassAT", AV11PassAT);
      AV16Vurl = httpContext.getMessage( "urlt", "") ;
      GXt_char3 = AV16Vurl ;
      GXv_char6[0] = AV10EmprCod ;
      GXv_char5[0] = httpContext.getMessage( "URL", "") ;
      GXv_char4[0] = GXt_char3 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4) ;
      preparoxmldocumentoproveedorat_impl.this.AV10EmprCod = GXv_char6[0] ;
      preparoxmldocumentoproveedorat_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      AV16Vurl = GXt_char3 ;
      GXt_char3 = AV15Vpfx ;
      GXv_char6[0] = GXt_char3 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "PFX", ""), GXv_char6) ;
      preparoxmldocumentoproveedorat_impl.this.GXt_char3 = GXv_char6[0] ;
      AV15Vpfx = GXt_char3 ;
      GXt_char3 = AV14Vpasspfx ;
      GXv_char6[0] = GXt_char3 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "PASPFX", ""), GXv_char6) ;
      preparoxmldocumentoproveedorat_impl.this.GXt_char3 = GXv_char6[0] ;
      AV14Vpasspfx = GXt_char3 ;
      GXt_int7 = AV13VerCom ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "APISEN", ""), GXv_int8) ;
      preparoxmldocumentoproveedorat_impl.this.GXt_int7 = GXv_int8[0] ;
      AV13VerCom = GXt_int7 ;
      GXt_int7 = AV17hb ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "HEABOD", ""), GXv_int8) ;
      preparoxmldocumentoproveedorat_impl.this.GXt_int7 = GXv_int8[0] ;
      AV17hb = GXt_int7 ;
      GXt_int7 = (byte)(AV18ATVeces) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "ATINTE", ""), GXv_int8) ;
      preparoxmldocumentoproveedorat_impl.this.GXt_int7 = GXv_int8[0] ;
      AV18ATVeces = GXt_int7 ;
      GXt_int7 = (byte)(AV19endutex) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "ENDTEX", ""), GXv_int8) ;
      preparoxmldocumentoproveedorat_impl.this.GXt_int7 = GXv_int8[0] ;
      AV19endutex = GXt_int7 ;
      /* Using cursor H018T2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A395EmprCif = H018T2_A395EmprCif[0] ;
         n395EmprCif = H018T2_n395EmprCif[0] ;
         AV9EmprCif = A395EmprCif ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      GXv_char6[0] = AV51contidsernew ;
      new app.trabajosexternos.obtengocodigoserieat(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "REMTRA", ""), GXv_char6) ;
      preparoxmldocumentoproveedorat_impl.this.AV51contidsernew = GXv_char6[0] ;
      AV52SerieAT = ((GXutil.strcmp("", AV51contidsernew)==0) ? "GD7" : AV51contidsernew) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52SerieAT", AV52SerieAT);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSERIEAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV52SerieAT, ""))));
      AV32Fichero = GXutil.trim( AV52SerieAT) + GXutil.padl( GXutil.trim( GXutil.str( AV20AlbProID, 8, 0)), (short)(8), "0") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Fichero", AV32Fichero);
      AV39Path = GXutil.trim( AV8Dir) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Path", AV39Path);
      GXt_char3 = AV47Station ;
      GXv_char6[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char6) ;
      preparoxmldocumentoproveedorat_impl.this.GXt_char3 = GXv_char6[0] ;
      AV47Station = GXt_char3 ;
      GXv_char6[0] = AV10EmprCod ;
      GXv_char5[0] = AV48EmprNom ;
      GXv_char4[0] = AV49UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV47Station, GXv_char6, GXv_char5, GXv_char4) ;
      preparoxmldocumentoproveedorat_impl.this.AV10EmprCod = GXv_char6[0] ;
      preparoxmldocumentoproveedorat_impl.this.AV48EmprNom = GXv_char5[0] ;
      preparoxmldocumentoproveedorat_impl.this.AV49UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      divUnnamedtable2_Height = 30 ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable2_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable2_Height), 9, 0), true);
      GXv_char6[0] = AV62AlbProATCUD ;
      GXv_char5[0] = AV61AlbProSerAT ;
      GXv_char4[0] = AV60AlbProTipAT ;
      new app.stocksquimicos.documentotransporteproveedor_get_atcud(remoteHandle, context).execute( AV10EmprCod, AV20AlbProID, GXv_char6, GXv_char5, GXv_char4) ;
      preparoxmldocumentoproveedorat_impl.this.AV62AlbProATCUD = GXv_char6[0] ;
      preparoxmldocumentoproveedorat_impl.this.AV61AlbProSerAT = GXv_char5[0] ;
      preparoxmldocumentoproveedorat_impl.this.AV60AlbProTipAT = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62AlbProATCUD", AV62AlbProATCUD);
      httpContext.ajax_rsp_assign_attri("", false, "AV61AlbProSerAT", AV61AlbProSerAT);
      httpContext.ajax_rsp_assign_attri("", false, "AV60AlbProTipAT", AV60AlbProTipAT);
   }

   public void e1218T2( )
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

   public void e1318T2( )
   {
      /* 'DoATCUD' Routine */
      returnInSub = false ;
      lblTbmessage_Caption = "  " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( ! (GXutil.strcmp("", AV62AlbProATCUD)==0) && ! (GXutil.strcmp("", AV61AlbProSerAT)==0) && ! (GXutil.strcmp("", AV60AlbProTipAT)==0) )
      {
         lblTbmessage_Caption = httpContext.getMessage( "Ya existe ATCUD¡¡", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      }
      else
      {
         new app.stocksquimicos.documentotransporteproveedor_atcud(remoteHandle, context).execute( AV10EmprCod, AV20AlbProID) ;
         GXv_char6[0] = AV62AlbProATCUD ;
         GXv_char5[0] = AV61AlbProSerAT ;
         GXv_char4[0] = AV60AlbProTipAT ;
         new app.stocksquimicos.documentotransporteproveedor_get_atcud(remoteHandle, context).execute( AV10EmprCod, AV20AlbProID, GXv_char6, GXv_char5, GXv_char4) ;
         preparoxmldocumentoproveedorat_impl.this.AV62AlbProATCUD = GXv_char6[0] ;
         preparoxmldocumentoproveedorat_impl.this.AV61AlbProSerAT = GXv_char5[0] ;
         preparoxmldocumentoproveedorat_impl.this.AV60AlbProTipAT = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62AlbProATCUD", AV62AlbProATCUD);
         httpContext.ajax_rsp_assign_attri("", false, "AV61AlbProSerAT", AV61AlbProSerAT);
         httpContext.ajax_rsp_assign_attri("", false, "AV60AlbProTipAT", AV60AlbProTipAT);
         httpContext.doAjaxRefresh();
      }
      /*  Sending Event outputs  */
   }

   public void e1418T2( )
   {
      /* 'DoXML' Routine */
      returnInSub = false ;
      Gx_msg = "" ;
      GXv_char6[0] = AV10EmprCod ;
      GXv_int9[0] = AV20AlbProID ;
      GXv_char5[0] = AV39Path ;
      GXv_char4[0] = AV32Fichero ;
      GXv_objcol_SdtMessages_Message10[0] = AV42Messages ;
      GXv_boolean11[0] = AV43OK ;
      new app.stocksquimicos.pdpxml(remoteHandle, context).execute( GXv_char6, GXv_int9, GXv_char5, GXv_char4, GXv_objcol_SdtMessages_Message10, GXv_boolean11) ;
      preparoxmldocumentoproveedorat_impl.this.AV10EmprCod = GXv_char6[0] ;
      preparoxmldocumentoproveedorat_impl.this.AV20AlbProID = GXv_int9[0] ;
      preparoxmldocumentoproveedorat_impl.this.AV39Path = GXv_char5[0] ;
      preparoxmldocumentoproveedorat_impl.this.AV32Fichero = GXv_char4[0] ;
      AV42Messages = GXv_objcol_SdtMessages_Message10[0] ;
      preparoxmldocumentoproveedorat_impl.this.AV43OK = GXv_boolean11[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV20AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20AlbProID), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV39Path", AV39Path);
      httpContext.ajax_rsp_assign_attri("", false, "AV32Fichero", AV32Fichero);
      if ( (0==AV42Messages.size()) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Archivo XML creado correctamente en ", "")+AV39Path);
      }
      else
      {
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e1518T2 ();
      if (returnInSub) return;
   }

   public void e1518T2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( (GXutil.strcmp("", AV62AlbProATCUD)==0) || (GXutil.strcmp("", AV61AlbProSerAT)==0) || (GXutil.strcmp("", AV60AlbProTipAT)==0) )
      {
         lblTbmessage_Caption = httpContext.getMessage( "Falta ATCUD¡¡¡ o Falta SERIE¡¡¡ o Falta Tipo Documento¡¡¡", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      }
      else
      {
         GXv_char6[0] = AV57msg_control ;
         new app.documentotransporteproveedor_ctrlhashanteriorcopy1(remoteHandle, context).execute( AV10EmprCod, AV20AlbProID, GXv_char6) ;
         preparoxmldocumentoproveedorat_impl.this.AV57msg_control = GXv_char6[0] ;
         if ( ! (GXutil.strcmp("", AV57msg_control)==0) )
         {
            lblTbmessage_Caption = AV57msg_control ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         }
         else
         {
            AV54DiaHact = GXutil.serverNow( context, remoteHandle, pr_default) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54DiaHact", localUtil.ttoc( AV54DiaHact, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            if ( AV53FechaHoraSalida.before( GXutil.serverNow( context, remoteHandle, pr_default) ) )
            {
               Gx_msg = httpContext.getMessage( "Erro. Dia-Hora Salida ", "") + localUtil.ttoc( AV53FechaHoraSalida, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " inferior a Dia Actual ", "") + localUtil.ttoc( AV54DiaHact, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
               lblTbmessage_Caption = Gx_msg ;
               httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            }
            else
            {
               if ( AV53FechaHoraSalida.before( AV58AlbProDate ) )
               {
                  Gx_msg = httpContext.getMessage( "Erro. Dia-Hora Salida ", "") + localUtil.ttoc( AV53FechaHoraSalida, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " inferior a Data Documento ", "") + localUtil.dtoc( AV58AlbProDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                  lblTbmessage_Caption = Gx_msg ;
                  httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
               }
               else
               {
                  AV22AlbProSal = AV53FechaHoraSalida ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV22AlbProSal", localUtil.ttoc( AV22AlbProSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                  AV21AlbProSys = AV54DiaHact ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV21AlbProSys", localUtil.ttoc( AV21AlbProSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                  new app.actualizodiahorasalidadocumentoproveedor(remoteHandle, context).execute( AV10EmprCod, AV20AlbProID, AV22AlbProSal, AV21AlbProSys) ;
                  AV59AlbProDateIN = AV58AlbProDate ;
                  GXv_char6[0] = AV10EmprCod ;
                  GXv_int9[0] = AV20AlbProID ;
                  GXv_date12[0] = AV59AlbProDateIN ;
                  GXv_dtime2[0] = AV21AlbProSys ;
                  GXv_char5[0] = AV40Cadena ;
                  GXv_char4[0] = AV23Firma ;
                  new app.stocksquimicos.obtengocadenaparahashdocumentoproveedor(remoteHandle, context).execute( GXv_char6, GXv_int9, GXv_date12, GXv_dtime2, GXv_char5, GXv_char4) ;
                  preparoxmldocumentoproveedorat_impl.this.AV10EmprCod = GXv_char6[0] ;
                  preparoxmldocumentoproveedorat_impl.this.AV20AlbProID = GXv_int9[0] ;
                  preparoxmldocumentoproveedorat_impl.this.AV59AlbProDateIN = GXv_date12[0] ;
                  preparoxmldocumentoproveedorat_impl.this.AV21AlbProSys = GXv_dtime2[0] ;
                  preparoxmldocumentoproveedorat_impl.this.AV40Cadena = GXv_char5[0] ;
                  preparoxmldocumentoproveedorat_impl.this.AV23Firma = GXv_char4[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV20AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20AlbProID), 8, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV21AlbProSys", localUtil.ttoc( AV21AlbProSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                  httpContext.ajax_rsp_assign_attri("", false, "AV40Cadena", AV40Cadena);
                  GXv_char6[0] = AV41Hash ;
                  GXv_objcol_SdtMessages_Message10[0] = AV42Messages ;
                  GXv_boolean11[0] = AV43OK ;
                  new app.hash_obtener(remoteHandle, context).execute( AV40Cadena, GXv_char6, GXv_objcol_SdtMessages_Message10, GXv_boolean11) ;
                  preparoxmldocumentoproveedorat_impl.this.AV41Hash = GXv_char6[0] ;
                  AV42Messages = GXv_objcol_SdtMessages_Message10[0] ;
                  preparoxmldocumentoproveedorat_impl.this.AV43OK = GXv_boolean11[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV41Hash", AV41Hash);
                  if ( ! AV43OK )
                  {
                     AV68GXV1 = 1 ;
                     while ( AV68GXV1 <= AV42Messages.size() )
                     {
                        AV44Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV42Messages.elementAt(-1+AV68GXV1));
                        httpContext.GX_msglist.addItem(AV44Message.getgxTv_SdtMessages_Message_Description());
                        AV68GXV1 = (int)(AV68GXV1+1) ;
                     }
                  }
                  else
                  {
                     /* Execute user subroutine: 'CALPRO' */
                     S112 ();
                     if (returnInSub) return;
                     if ( (0==AV31Lineas) )
                     {
                        lblTbmessage_Caption = httpContext.getMessage( "NO tiene Lineas ¡¡¡¡", "") ;
                        httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                     }
                     else
                     {
                        if ( GXutil.strcmp(AV8Dir, "") == 0 )
                        {
                           lblTbmessage_Caption = httpContext.getMessage( "Falta Path ¡¡¡¡.Revisar Contador SAFTW1", "") ;
                           httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                        }
                        else
                        {
                           if ( (0==AV24CalPro) )
                           {
                              lblTbmessage_Caption = httpContext.getMessage( "Nao Existe Documento¡¡¡", "") ;
                              httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                           }
                           else
                           {
                              lblTbmessage_Caption = httpContext.getMessage( "Hash creado correctamente", "") ;
                              httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                              GXv_char6[0] = AV10EmprCod ;
                              GXv_int9[0] = AV20AlbProID ;
                              GXv_char5[0] = AV40Cadena ;
                              GXv_char4[0] = AV41Hash ;
                              new app.stocksquimicos.actualizohashdocumentoproveedor(remoteHandle, context).execute( GXv_char6, GXv_int9, GXv_char5, GXv_char4) ;
                              preparoxmldocumentoproveedorat_impl.this.AV10EmprCod = GXv_char6[0] ;
                              preparoxmldocumentoproveedorat_impl.this.AV20AlbProID = GXv_int9[0] ;
                              preparoxmldocumentoproveedorat_impl.this.AV40Cadena = GXv_char5[0] ;
                              preparoxmldocumentoproveedorat_impl.this.AV41Hash = GXv_char4[0] ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
                              httpContext.ajax_rsp_assign_attri("", false, "AV20AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20AlbProID), 8, 0));
                              httpContext.ajax_rsp_assign_attri("", false, "AV40Cadena", AV40Cadena);
                              httpContext.ajax_rsp_assign_attri("", false, "AV41Hash", AV41Hash);
                              if ( (GXutil.strcmp("", AV41Hash)==0) )
                              {
                                 Gx_msg = httpContext.getMessage( "Atenção O código HASH está faltando.", "") + GXutil.newLine( ) ;
                                 Gx_msg += httpContext.getMessage( "É necessário criar o HASH para o documento.", "") + GXutil.newLine( ) ;
                                 lblTbmessage_Caption = Gx_msg ;
                                 httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                              }
                              else
                              {
                                 AV32Fichero = GXutil.trim( AV52SerieAT) + GXutil.padl( GXutil.trim( GXutil.str( AV20AlbProID, 8, 0)), (short)(8), "0") ;
                                 httpContext.ajax_rsp_assign_attri("", false, "AV32Fichero", AV32Fichero);
                                 AV33File.setSource( GXutil.trim( AV8Dir)+"\\"+GXutil.trim( AV32Fichero)+httpContext.getMessage( ".xml", "") );
                                 AV39Path = GXutil.trim( AV8Dir) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "AV39Path", AV39Path);
                                 GXv_char6[0] = AV10EmprCod ;
                                 GXv_int9[0] = AV20AlbProID ;
                                 GXv_char5[0] = AV39Path ;
                                 GXv_char4[0] = AV32Fichero ;
                                 GXv_objcol_SdtMessages_Message10[0] = AV42Messages ;
                                 GXv_boolean11[0] = AV43OK ;
                                 new app.stocksquimicos.pdpxml(remoteHandle, context).execute( GXv_char6, GXv_int9, GXv_char5, GXv_char4, GXv_objcol_SdtMessages_Message10, GXv_boolean11) ;
                                 preparoxmldocumentoproveedorat_impl.this.AV10EmprCod = GXv_char6[0] ;
                                 preparoxmldocumentoproveedorat_impl.this.AV20AlbProID = GXv_int9[0] ;
                                 preparoxmldocumentoproveedorat_impl.this.AV39Path = GXv_char5[0] ;
                                 preparoxmldocumentoproveedorat_impl.this.AV32Fichero = GXv_char4[0] ;
                                 AV42Messages = GXv_objcol_SdtMessages_Message10[0] ;
                                 preparoxmldocumentoproveedorat_impl.this.AV43OK = GXv_boolean11[0] ;
                                 httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
                                 httpContext.ajax_rsp_assign_attri("", false, "AV20AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20AlbProID), 8, 0));
                                 httpContext.ajax_rsp_assign_attri("", false, "AV39Path", AV39Path);
                                 httpContext.ajax_rsp_assign_attri("", false, "AV32Fichero", AV32Fichero);
                                 if ( ! AV43OK )
                                 {
                                    AV69GXV2 = 1 ;
                                    while ( AV69GXV2 <= AV42Messages.size() )
                                    {
                                       AV44Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV42Messages.elementAt(-1+AV69GXV2));
                                       httpContext.GX_msglist.addItem(AV44Message.getgxTv_SdtMessages_Message_Description());
                                       AV69GXV2 = (int)(AV69GXV2+1) ;
                                    }
                                 }
                                 else
                                 {
                                    GXv_objcol_SdtMessages_Message10[0] = AV42Messages ;
                                    GXv_boolean11[0] = AV43OK ;
                                    new app.at_comunicar(remoteHandle, context).execute( AV10EmprCod, AV32Fichero, AV12UserAT, AV11PassAT, GXv_objcol_SdtMessages_Message10, GXv_boolean11) ;
                                    AV42Messages = GXv_objcol_SdtMessages_Message10[0] ;
                                    preparoxmldocumentoproveedorat_impl.this.AV43OK = GXv_boolean11[0] ;
                                    AV46Messages_tojson = AV42Messages.toJSonString(false) ;
                                    AV37FileR = GXutil.trim( AV52SerieAT) + GXutil.padl( GXutil.trim( GXutil.str( AV20AlbProID, 8, 0)), (short)(8), "0") ;
                                    AV33File.setSource( GXutil.trim( AV8Dir)+"\\"+GXutil.trim( AV37FileR)+httpContext.getMessage( "result", "")+httpContext.getMessage( ".xml", "") );
                                    AV45Var_File = AV33File.getAbsoluteName() ;
                                    if ( AV43OK )
                                    {
                                       GXv_char6[0] = AV10EmprCod ;
                                       GXv_char5[0] = AV32Fichero ;
                                       GXv_int9[0] = AV20AlbProID ;
                                       GXv_objcol_SdtMessages_Message10[0] = AV42Messages ;
                                       GXv_boolean11[0] = AV43OK ;
                                       new app.stocksquimicos.documentotransporteproveedor_result(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_int9, GXv_objcol_SdtMessages_Message10, GXv_boolean11) ;
                                       preparoxmldocumentoproveedorat_impl.this.AV10EmprCod = GXv_char6[0] ;
                                       preparoxmldocumentoproveedorat_impl.this.AV32Fichero = GXv_char5[0] ;
                                       preparoxmldocumentoproveedorat_impl.this.AV20AlbProID = GXv_int9[0] ;
                                       AV42Messages = GXv_objcol_SdtMessages_Message10[0] ;
                                       preparoxmldocumentoproveedorat_impl.this.AV43OK = GXv_boolean11[0] ;
                                       httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
                                       httpContext.ajax_rsp_assign_attri("", false, "AV32Fichero", AV32Fichero);
                                       httpContext.ajax_rsp_assign_attri("", false, "AV20AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20AlbProID), 8, 0));
                                       AV46Messages_tojson = AV42Messages.toJSonString(false) ;
                                       httpContext.popup(formatLink("app.stocksquimicos.documentotransporteproveedor_5", new String[] {GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV32Fichero)),GXutil.URLEncode(GXutil.ltrimstr(AV20AlbProID,8,0)),GXutil.URLEncode(GXutil.rtrim(AV46Messages_tojson)),GXutil.URLEncode(GXutil.booltostr(AV43OK))}, new String[] {"Emprcod","Fichero","AlbProID","Messages_tojson","Ok"}) , new Object[] {});
                                       if ( ! AV43OK )
                                       {
                                          httpContext.popup(formatLink("app.stocksquimicos.imprimirdocumentosproveedor", new String[] {GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV20AlbProID,8,0))}, new String[] {"Emprcod","AlbProID"}) , new Object[] {"AV10EmprCod","AV20AlbProID"});
                                          httpContext.setWebReturnParms(new Object[] {});
                                          httpContext.setWebReturnParmsMetadata(new Object[] {});
                                          httpContext.wjLocDisableFrm = (byte)(1) ;
                                          httpContext.nUserReturn = (byte)(1) ;
                                          returnInSub = true;
                                          if (true) return;
                                       }
                                       else
                                       {
                                          httpContext.popup(formatLink("app.stocksquimicos.imprimirdocumentosproveedor", new String[] {GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV20AlbProID,8,0))}, new String[] {"Emprcod","AlbProID"}) , new Object[] {"AV10EmprCod","AV20AlbProID"});
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
                                       AV70GXV3 = 1 ;
                                       while ( AV70GXV3 <= AV42Messages.size() )
                                       {
                                          AV44Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV42Messages.elementAt(-1+AV70GXV3));
                                          AV50Var_mensaje = AV44Message.getgxTv_SdtMessages_Message_Id() + GXutil.newLine( ) ;
                                          AV50Var_mensaje += AV44Message.getgxTv_SdtMessages_Message_Description() + GXutil.newLine( ) ;
                                          httpContext.GX_msglist.addItem(AV50Var_mensaje);
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
      }
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'CALPRO' Routine */
      returnInSub = false ;
      /* Using cursor H018T3 */
      pr_default.execute(1, new Object[] {AV10EmprCod, Integer.valueOf(AV20AlbProID)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A13418AlbProID = H018T3_A13418AlbProID[0] ;
         A396EmprCod = H018T3_A396EmprCod[0] ;
         A13430AlbProDate = H018T3_A13430AlbProDate[0] ;
         A13436AlbProIDAT = H018T3_A13436AlbProIDAT[0] ;
         A13433AlbProHh = H018T3_A13433AlbProHh[0] ;
         A13452AlbProInEx = H018T3_A13452AlbProInEx[0] ;
         AV26AlbProfch = A13430AlbProDate ;
         AV27ALbLic = A13436AlbProIDAT ;
         AV24CalPro = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24CalPro", GXutil.str( AV24CalPro, 1, 0));
         AV28AlbCOmcod = A13418AlbProID ;
         AV29Albfmd = A13433AlbProHh ;
         AV30AlbProInEx = A13452AlbProInEx ;
         AV31Lineas = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31Lineas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Lineas), 4, 0));
         /* Optimized group. */
         /* Using cursor H018T4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID)});
         cV31Lineas = H018T4_AV31Lineas[0] ;
         pr_default.close(2);
         AV31Lineas = (short)(AV31Lineas+cV31Lineas*1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31Lineas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Lineas), 4, 0));
         /* End optimized group. */
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   protected void nextLoad( )
   {
   }

   protected void e1618T2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV10EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      AV20AlbProID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20AlbProID), 8, 0));
      AV21AlbProSys = (java.util.Date)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21AlbProSys", localUtil.ttoc( AV21AlbProSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV58AlbProDate = (java.util.Date)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58AlbProDate", localUtil.format(AV58AlbProDate, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPRODATE", getSecureSignedToken( "", AV58AlbProDate));
      AV22AlbProSal = (java.util.Date)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22AlbProSal", localUtil.ttoc( AV22AlbProSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV40Cadena = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Cadena", AV40Cadena);
      AV41Hash = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Hash", AV41Hash);
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
      pa18T2( ) ;
      ws18T2( ) ;
      we18T2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241513775", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/preparoxmldocumentoproveedorat.js", "?20268241513775", false, true);
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
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      edtavDir_Internalname = "vDIR" ;
      edtavUserat_Internalname = "vUSERAT" ;
      edtavPassat_Internalname = "vPASSAT" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtavAlbproid_Internalname = "vALBPROID" ;
      edtavAlbprodate_Internalname = "vALBPRODATE" ;
      edtavAlbprosal_Internalname = "vALBPROSAL" ;
      edtavAlbprosys_Internalname = "vALBPROSYS" ;
      edtavAlbproatcud_Internalname = "vALBPROATCUD" ;
      edtavAlbproserat_Internalname = "vALBPROSERAT" ;
      edtavAlbprotipat_Internalname = "vALBPROTIPAT" ;
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
      divUnnamedtable2_Height = 0 ;
      edtavAlbprotipat_Jsonclick = "" ;
      edtavAlbprotipat_Enabled = 1 ;
      edtavAlbproserat_Jsonclick = "" ;
      edtavAlbproserat_Enabled = 1 ;
      edtavAlbproatcud_Jsonclick = "" ;
      edtavAlbproatcud_Enabled = 1 ;
      edtavAlbprosys_Jsonclick = "" ;
      edtavAlbprosys_Enabled = 0 ;
      edtavAlbprosal_Jsonclick = "" ;
      edtavAlbprosal_Enabled = 0 ;
      edtavAlbprodate_Jsonclick = "" ;
      edtavAlbprodate_Enabled = 0 ;
      edtavAlbproid_Jsonclick = "" ;
      edtavAlbproid_Enabled = 0 ;
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
      Dvpanel_panel_filtros_Title = "" ;
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
      Form.setCaption( httpContext.getMessage( "Preparo XML Documento Proveedor", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV52SerieAT',fld:'vSERIEAT',pic:'',hsh:true},{av:'AV58AlbProDate',fld:'vALBPRODATE',pic:'',hsh:true},{av:'AV8Dir',fld:'vDIR',pic:''},{av:'AV12UserAT',fld:'vUSERAT',pic:''},{av:'AV11PassAT',fld:'vPASSAT',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1218T2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOATCUD'","{handler:'e1318T2',iparms:[{av:'AV62AlbProATCUD',fld:'vALBPROATCUD',pic:''},{av:'AV61AlbProSerAT',fld:'vALBPROSERAT',pic:''},{av:'AV60AlbProTipAT',fld:'vALBPROTIPAT',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV20AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOATCUD'",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV60AlbProTipAT',fld:'vALBPROTIPAT',pic:''},{av:'AV61AlbProSerAT',fld:'vALBPROSERAT',pic:''},{av:'AV62AlbProATCUD',fld:'vALBPROATCUD',pic:''}]}");
      setEventMetadata("'DOXML'","{handler:'e1418T2',iparms:[{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV20AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'AV39Path',fld:'vPATH',pic:''},{av:'AV32Fichero',fld:'vFICHERO',pic:''}]");
      setEventMetadata("'DOXML'",",oparms:[{av:'AV32Fichero',fld:'vFICHERO',pic:''},{av:'AV39Path',fld:'vPATH',pic:''},{av:'AV20AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("ENTER","{handler:'e1518T2',iparms:[{av:'AV62AlbProATCUD',fld:'vALBPROATCUD',pic:''},{av:'AV61AlbProSerAT',fld:'vALBPROSERAT',pic:''},{av:'AV60AlbProTipAT',fld:'vALBPROTIPAT',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV20AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'AV53FechaHoraSalida',fld:'vFECHAHORASALIDA',pic:'99/99/99 99:99:99'},{av:'AV58AlbProDate',fld:'vALBPRODATE',pic:'',hsh:true},{av:'AV31Lineas',fld:'vLINEAS',pic:'ZZZ9'},{av:'AV8Dir',fld:'vDIR',pic:''},{av:'AV24CalPro',fld:'vCALPRO',pic:'9'},{av:'AV52SerieAT',fld:'vSERIEAT',pic:'',hsh:true},{av:'AV12UserAT',fld:'vUSERAT',pic:''},{av:'AV11PassAT',fld:'vPASSAT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13418AlbProID',fld:'ALBPROID',pic:'ZZZZZZZ9'},{av:'A13430AlbProDate',fld:'ALBPRODATE',pic:''},{av:'A13436AlbProIDAT',fld:'ALBPROIDAT',pic:''},{av:'A13433AlbProHh',fld:'ALBPROHH',pic:''},{av:'A13452AlbProInEx',fld:'ALBPROINEX',pic:'9'},{av:'A13443AlbProCnt',fld:'ALBPROCNT',pic:'ZZZZZ9.99'}]");
      setEventMetadata("ENTER",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV54DiaHact',fld:'vDIAHACT',pic:'99/99/99 99:99'},{av:'AV22AlbProSal',fld:'vALBPROSAL',pic:'99/99/99 99:99'},{av:'AV21AlbProSys',fld:'vALBPROSYS',pic:'99/99/99 99:99'},{av:'AV40Cadena',fld:'vCADENA',pic:''},{av:'AV20AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV41Hash',fld:'vHASH',pic:''},{av:'AV32Fichero',fld:'vFICHERO',pic:''},{av:'AV39Path',fld:'vPATH',pic:''},{av:'AV24CalPro',fld:'vCALPRO',pic:'9'},{av:'AV31Lineas',fld:'vLINEAS',pic:'ZZZ9'}]}");
      setEventMetadata("VALIDV_ALBPROID","{handler:'validv_Albproid',iparms:[]");
      setEventMetadata("VALIDV_ALBPROID",",oparms:[]}");
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
      wcpOAV10EmprCod = "" ;
      wcpOAV21AlbProSys = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV58AlbProDate = GXutil.nullDate() ;
      wcpOAV22AlbProSal = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV40Cadena = "" ;
      wcpOAV41Hash = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV10EmprCod = "" ;
      AV21AlbProSys = GXutil.resetTime( GXutil.nullDate() );
      AV58AlbProDate = GXutil.nullDate() ;
      AV22AlbProSal = GXutil.resetTime( GXutil.nullDate() );
      AV40Cadena = "" ;
      AV41Hash = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV52SerieAT = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV8Dir = "" ;
      AV12UserAT = "" ;
      AV11PassAT = "" ;
      AV39Path = "" ;
      AV32Fichero = "" ;
      A396EmprCod = "" ;
      A13430AlbProDate = GXutil.nullDate() ;
      A13436AlbProIDAT = "" ;
      A13433AlbProHh = "" ;
      A13443AlbProCnt = DecimalUtil.ZERO ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV53FechaHoraSalida = GXutil.resetTime( GXutil.nullDate() );
      AV54DiaHact = GXutil.resetTime( GXutil.nullDate() );
      AV55diasalida = GXutil.nullDate() ;
      lblTbmessage_Jsonclick = "" ;
      ucDvpanel_unnamedtable4 = new com.genexus.webpanels.GXUserControl();
      AV62AlbProATCUD = "" ;
      AV61AlbProSerAT = "" ;
      AV60AlbProTipAT = "" ;
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
      GXt_dtime1 = GXutil.resetTime( GXutil.nullDate() );
      AV56InoutFechaHoraSalida = GXutil.resetTime( GXutil.nullDate() );
      AV16Vurl = "" ;
      AV15Vpfx = "" ;
      AV14Vpasspfx = "" ;
      GXv_int8 = new byte[1] ;
      scmdbuf = "" ;
      H018T2_A396EmprCod = new String[] {""} ;
      H018T2_A395EmprCif = new String[] {""} ;
      H018T2_n395EmprCif = new boolean[] {false} ;
      A395EmprCif = "" ;
      AV9EmprCif = "" ;
      AV51contidsernew = "" ;
      AV47Station = "" ;
      GXt_char3 = "" ;
      AV48EmprNom = "" ;
      AV49UsurCod = "" ;
      Gx_msg = "" ;
      AV42Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV57msg_control = "" ;
      AV59AlbProDateIN = GXutil.nullDate() ;
      GXv_date12 = new java.util.Date[1] ;
      GXv_dtime2 = new java.util.Date[1] ;
      AV23Firma = "" ;
      AV44Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV33File = new com.genexus.util.GXFile();
      GXv_char4 = new String[1] ;
      AV46Messages_tojson = "" ;
      AV37FileR = "" ;
      AV45Var_File = "" ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_objcol_SdtMessages_Message10 = new GXBaseCollection[1] ;
      GXv_boolean11 = new boolean[1] ;
      AV50Var_mensaje = "" ;
      H018T3_A13418AlbProID = new int[1] ;
      H018T3_A396EmprCod = new String[] {""} ;
      H018T3_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      H018T3_A13436AlbProIDAT = new String[] {""} ;
      H018T3_A13433AlbProHh = new String[] {""} ;
      H018T3_A13452AlbProInEx = new byte[1] ;
      AV26AlbProfch = GXutil.nullDate() ;
      AV27ALbLic = "" ;
      AV29Albfmd = "" ;
      H018T4_AV31Lineas = new short[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.preparoxmldocumentoproveedorat__default(),
         new Object[] {
             new Object[] {
            H018T2_A396EmprCod, H018T2_A395EmprCif, H018T2_n395EmprCif
            }
            , new Object[] {
            H018T3_A13418AlbProID, H018T3_A396EmprCod, H018T3_A13430AlbProDate, H018T3_A13436AlbProIDAT, H018T3_A13433AlbProHh, H018T3_A13452AlbProInEx
            }
            , new Object[] {
            H018T4_AV31Lineas
            }
         }
      );
      AV65Pgmname = "StocksQuimicos.PreparoXMLDocumentoProveedorAT" ;
      /* GeneXus formulas. */
      AV65Pgmname = "StocksQuimicos.PreparoXMLDocumentoProveedorAT" ;
      Gx_err = (short)(0) ;
      edtavDiahact_Enabled = 0 ;
      edtavDiasalida_Enabled = 0 ;
      edtavDir_Enabled = 0 ;
      edtavUserat_Enabled = 0 ;
      edtavPassat_Enabled = 0 ;
      edtavAlbproid_Enabled = 0 ;
      edtavAlbprodate_Enabled = 0 ;
      edtavAlbprosal_Enabled = 0 ;
      edtavAlbprosys_Enabled = 0 ;
      edtavAlbproatcud_Enabled = 0 ;
      edtavAlbproserat_Enabled = 0 ;
      edtavAlbprotipat_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV24CalPro ;
   private byte A13452AlbProInEx ;
   private byte nDonePA ;
   private byte AV13VerCom ;
   private byte AV17hb ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte AV30AlbProInEx ;
   private byte nGXWrapped ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV31Lineas ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV18ATVeces ;
   private short AV19endutex ;
   private short cV31Lineas ;
   private int wcpOAV20AlbProID ;
   private int AV20AlbProID ;
   private int A13418AlbProID ;
   private int edtavFechahorasalida_Enabled ;
   private int edtavDiahact_Enabled ;
   private int edtavDiasalida_Enabled ;
   private int edtavDir_Enabled ;
   private int edtavUserat_Enabled ;
   private int edtavPassat_Enabled ;
   private int edtavAlbproid_Enabled ;
   private int edtavAlbprodate_Enabled ;
   private int edtavAlbprosal_Enabled ;
   private int edtavAlbprosys_Enabled ;
   private int edtavAlbproatcud_Enabled ;
   private int edtavAlbproserat_Enabled ;
   private int edtavAlbprotipat_Enabled ;
   private int divUnnamedtable2_Height ;
   private int edtavPgmname_Enabled ;
   private int AV68GXV1 ;
   private int AV69GXV2 ;
   private int GXv_int9[] ;
   private int AV70GXV3 ;
   private int AV28AlbCOmcod ;
   private int idxLst ;
   private java.math.BigDecimal A13443AlbProCnt ;
   private String wcpOAV10EmprCod ;
   private String wcpOAV40Cadena ;
   private String wcpOAV41Hash ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV10EmprCod ;
   private String AV40Cadena ;
   private String AV41Hash ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV52SerieAT ;
   private String GXKey ;
   private String AV8Dir ;
   private String AV12UserAT ;
   private String AV11PassAT ;
   private String AV32Fichero ;
   private String A396EmprCod ;
   private String A13436AlbProIDAT ;
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
   private String edtavAlbproid_Internalname ;
   private String edtavAlbproid_Jsonclick ;
   private String edtavAlbprodate_Internalname ;
   private String edtavAlbprodate_Jsonclick ;
   private String edtavAlbprosal_Internalname ;
   private String edtavAlbprosal_Jsonclick ;
   private String edtavAlbprosys_Internalname ;
   private String edtavAlbprosys_Jsonclick ;
   private String edtavAlbproatcud_Internalname ;
   private String AV62AlbProATCUD ;
   private String edtavAlbproatcud_Jsonclick ;
   private String edtavAlbproserat_Internalname ;
   private String AV61AlbProSerAT ;
   private String edtavAlbproserat_Jsonclick ;
   private String edtavAlbprotipat_Internalname ;
   private String AV60AlbProTipAT ;
   private String edtavAlbprotipat_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String bttBtnatcud_Internalname ;
   private String bttBtnatcud_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV65Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String hsh ;
   private String AV16Vurl ;
   private String AV15Vpfx ;
   private String AV14Vpasspfx ;
   private String scmdbuf ;
   private String A395EmprCif ;
   private String AV9EmprCif ;
   private String AV51contidsernew ;
   private String AV47Station ;
   private String GXt_char3 ;
   private String AV48EmprNom ;
   private String AV49UsurCod ;
   private String Gx_msg ;
   private String GXv_char4[] ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String AV27ALbLic ;
   private java.util.Date wcpOAV21AlbProSys ;
   private java.util.Date wcpOAV22AlbProSal ;
   private java.util.Date AV21AlbProSys ;
   private java.util.Date AV22AlbProSal ;
   private java.util.Date AV53FechaHoraSalida ;
   private java.util.Date AV54DiaHact ;
   private java.util.Date GXt_dtime1 ;
   private java.util.Date AV56InoutFechaHoraSalida ;
   private java.util.Date GXv_dtime2[] ;
   private java.util.Date wcpOAV58AlbProDate ;
   private java.util.Date AV58AlbProDate ;
   private java.util.Date A13430AlbProDate ;
   private java.util.Date AV55diasalida ;
   private java.util.Date AV59AlbProDateIN ;
   private java.util.Date GXv_date12[] ;
   private java.util.Date AV26AlbProfch ;
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
   private boolean AV43OK ;
   private boolean GXv_boolean11[] ;
   private String AV39Path ;
   private String A13433AlbProHh ;
   private String AV57msg_control ;
   private String AV23Firma ;
   private String AV46Messages_tojson ;
   private String AV37FileR ;
   private String AV45Var_File ;
   private String AV50Var_mensaje ;
   private String AV29Albfmd ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable4 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXFile AV33File ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H018T2_A396EmprCod ;
   private String[] H018T2_A395EmprCif ;
   private boolean[] H018T2_n395EmprCif ;
   private int[] H018T3_A13418AlbProID ;
   private String[] H018T3_A396EmprCod ;
   private java.util.Date[] H018T3_A13430AlbProDate ;
   private String[] H018T3_A13436AlbProIDAT ;
   private String[] H018T3_A13433AlbProHh ;
   private byte[] H018T3_A13452AlbProInEx ;
   private short[] H018T4_AV31Lineas ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV42Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message10[] ;
   private com.genexus.SdtMessages_Message AV44Message ;
}

final  class preparoxmldocumentoproveedorat__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H018T2", "SELECT EmprCod, EmprCif FROM TXPEMPRES ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H018T3", "SELECT AlbProID, EmprCod, AlbProDate, AlbProIDAT, AlbProHh, AlbProInEx FROM TXPCALPRO WHERE EmprCod = ? and AlbProID = ? ORDER BY EmprCod, AlbProID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H018T4", "SELECT COUNT(*) FROM TXPLALPRO WHERE EmprCod = ? and AlbProID = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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

