package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwnumpz2_impl extends GXDataArea
{
   public webwnumpz2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwnumpz2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwnumpz2_impl.class ));
   }

   public webwnumpz2_impl( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavAlbruni = new HTMLChoice();
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
               AV7AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7AlbRecCod), 8, 0));
               AV10AlbrUni = httpContext.GetPar( "AlbrUni") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10AlbrUni", AV10AlbrUni);
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
      paB22( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startB22( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webwnumpz2", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV7AlbRecCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV10AlbrUni))}, new String[] {"EmprCod","AlbRecCod","AlbrUni"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPESO", getSecureSignedToken( "", localUtil.format( AV25Peso, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPZAAUT", getSecureSignedToken( "", localUtil.format( AV26PzaAut, "ZZZZZZ9.99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV18EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV7AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTUNISEC", GXutil.ltrim( localUtil.ntoc( AV32TotUniSec, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPESO", GXutil.ltrim( localUtil.ntoc( AV25Peso, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPESO", getSecureSignedToken( "", localUtil.format( AV25Peso, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPZAAUT", GXutil.ltrim( localUtil.ntoc( AV26PzaAut, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPZAAUT", getSecureSignedToken( "", localUtil.format( AV26PzaAut, "ZZZZZZ9.99")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Result));
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
         weB22( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtB22( ) ;
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
      return formatLink("app.webwnumpz2", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV7AlbRecCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV10AlbrUni))}, new String[] {"EmprCod","AlbRecCod","AlbrUni"})  ;
   }

   public String getPgmname( )
   {
      return "WebWnumPz2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Numeracion Piezas Almacen", "") ;
   }

   public void wbB20( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-7", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-direction:column;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpes_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpes_Internalname, httpContext.getMessage( "Pml", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpes_Internalname, GXutil.ltrim( localUtil.ntoc( AV13Barpes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarpes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV13Barpes), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV13Barpes), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,17);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpes_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWnumPz2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavRdo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRdo_Internalname, httpContext.getMessage( "Rdo", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRdo_Internalname, GXutil.ltrim( localUtil.ntoc( AV27Rdo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRdo_Enabled!=0) ? localUtil.format( AV27Rdo, "ZZ9.99") : localUtil.format( AV27Rdo, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,21);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRdo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRdo_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWnumPz2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavAnc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAnc_Internalname, httpContext.getMessage( "Ancho", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAnc_Internalname, GXutil.ltrim( localUtil.ntoc( AV12Anc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV12Anc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV12Anc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAnc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAnc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWnumPz2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavGm2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavGm2_Internalname, httpContext.getMessage( "Gm2", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGm2_Internalname, GXutil.ltrim( localUtil.ntoc( AV21Gm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavGm2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV21Gm2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV21Gm2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGm2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavGm2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWnumPz2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavTotpzas_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotpzas_Internalname, httpContext.getMessage( "Total Piezas", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotpzas_Internalname, GXutil.ltrim( localUtil.ntoc( AV30TotPzas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTotpzas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV30TotPzas), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV30TotPzas), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotpzas_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTotpzas_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWnumPz2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedtotunikm_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocktotunikm_Internalname, httpContext.getMessage( "Total Unidades", ""), "", "", lblTextblocktotunikm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWnumPz2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
         wb_table1_40_B22( true) ;
      }
      else
      {
         wb_table1_40_B22( false) ;
      }
      return  ;
   }

   public void wb_table1_40_B22e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-7", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e11b21_client"+"'", TempTags, "", 2, "HLP_WebWnumPz2.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         wb_table2_65_B22( true) ;
      }
      else
      {
         wb_table2_65_B22( false) ;
      }
      return  ;
   }

   public void wb_table2_65_B22e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void startB22( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Numeracion Piezas Almacen", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupB20( ) ;
   }

   public void wsB22( )
   {
      startB22( ) ;
      evtB22( ) ;
   }

   public void evtB22( )
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
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12B22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e13B22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e14B22 ();
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

   public void weB22( )
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

   public void paB22( )
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
            GX_FocusControl = edtavBarpes_Internalname ;
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
      if ( cmbavAlbruni.getItemCount() > 0 )
      {
         AV10AlbrUni = cmbavAlbruni.getValidValue(AV10AlbrUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10AlbrUni", AV10AlbrUni);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavAlbruni.setValue( GXutil.rtrim( AV10AlbrUni) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbruni.getInternalname(), "Values", cmbavAlbruni.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfB22( ) ;
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
   }

   public void rfB22( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00B22 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            /* Execute user event: Load */
            e14B22 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wbB20( ) ;
      }
   }

   public void send_integrity_lvl_hashesB22( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPESO", GXutil.ltrim( localUtil.ntoc( AV25Peso, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPESO", getSecureSignedToken( "", localUtil.format( AV25Peso, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPZAAUT", GXutil.ltrim( localUtil.ntoc( AV26PzaAut, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPZAAUT", getSecureSignedToken( "", localUtil.format( AV26PzaAut, "ZZZZZZ9.99")));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupB20( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13B22 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         AV32TotUniSec = localUtil.ctond( httpContext.cgiGet( "vTOTUNISEC")) ;
         AV26PzaAut = localUtil.ctond( httpContext.cgiGet( "vPZAAUT")) ;
         AV25Peso = localUtil.ctond( httpContext.cgiGet( "vPESO")) ;
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
         Dvelop_confirmpanel_btnconfirmar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype") ;
         Dvelop_confirmpanel_btnconfirmar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarpes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarpes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARPES");
            GX_FocusControl = edtavBarpes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13Barpes = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13Barpes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Barpes), 4, 0));
         }
         else
         {
            AV13Barpes = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarpes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13Barpes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Barpes), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavRdo_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRdo_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRDO");
            GX_FocusControl = edtavRdo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV27Rdo = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Rdo", GXutil.ltrimstr( AV27Rdo, 6, 2));
         }
         else
         {
            AV27Rdo = localUtil.ctond( httpContext.cgiGet( edtavRdo_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Rdo", GXutil.ltrimstr( AV27Rdo, 6, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vANC");
            GX_FocusControl = edtavAnc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12Anc = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12Anc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Anc), 4, 0));
         }
         else
         {
            AV12Anc = (short)(localUtil.ctol( httpContext.cgiGet( edtavAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12Anc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Anc), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGM2");
            GX_FocusControl = edtavGm2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV21Gm2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21Gm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Gm2), 4, 0));
         }
         else
         {
            AV21Gm2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavGm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21Gm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Gm2), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTotpzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTotpzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTPZAS");
            GX_FocusControl = edtavTotpzas_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30TotPzas = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TotPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TotPzas), 4, 0));
         }
         else
         {
            AV30TotPzas = (short)(localUtil.ctol( httpContext.cgiGet( edtavTotpzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TotPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TotPzas), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTotunikm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTotunikm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTUNIKM");
            GX_FocusControl = edtavTotunikm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV31TotUniKM = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TotUniKM", GXutil.ltrimstr( AV31TotUniKM, 9, 2));
         }
         else
         {
            AV31TotUniKM = localUtil.ctond( httpContext.cgiGet( edtavTotunikm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TotUniKM", GXutil.ltrimstr( AV31TotUniKM, 9, 2));
         }
         cmbavAlbruni.setValue( httpContext.cgiGet( cmbavAlbruni.getInternalname()) );
         AV10AlbrUni = httpContext.cgiGet( cmbavAlbruni.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10AlbrUni", AV10AlbrUni);
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
      e13B22 ();
      if (returnInSub) return;
   }

   public void e13B22( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV29Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwnumpz2_impl.this.GXt_char1 = GXv_char2[0] ;
      AV29Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV19EmprNom ;
      GXv_char4[0] = AV33UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV29Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwnumpz2_impl.this.A396EmprCod = GXv_char2[0] ;
      webwnumpz2_impl.this.AV19EmprNom = GXv_char3[0] ;
      webwnumpz2_impl.this.AV33UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      AV18EmprCod = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
      GXv_int5[0] = (byte)(DecimalUtil.decToDouble(AV26PzaAut)) ;
      new app.pexicon(remoteHandle, context).execute( AV18EmprCod, httpContext.getMessage( "PZAAUT", ""), GXv_int5) ;
      webwnumpz2_impl.this.AV26PzaAut = DecimalUtil.doubleToDec(GXv_int5[0]) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26PzaAut", GXutil.ltrimstr( AV26PzaAut, 10, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPZAAUT", getSecureSignedToken( "", localUtil.format( AV26PzaAut, "ZZZZZZ9.99")));
      GXt_int6 = AV28Stamperia ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV18EmprCod, httpContext.getMessage( "STAMPE", ""), GXv_int5) ;
      webwnumpz2_impl.this.GXt_int6 = GXv_int5[0] ;
      AV28Stamperia = GXt_int6 ;
      GXt_int6 = AV20Estampamos ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV18EmprCod, httpContext.getMessage( "ESTAMP", ""), GXv_int5) ;
      webwnumpz2_impl.this.GXt_int6 = GXv_int5[0] ;
      AV20Estampamos = GXt_int6 ;
      GXt_int6 = AV17DatosCrudo ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV18EmprCod, httpContext.getMessage( "CRUPML", ""), GXv_int5) ;
      webwnumpz2_impl.this.GXt_int6 = GXv_int5[0] ;
      AV17DatosCrudo = GXt_int6 ;
      GXt_int6 = AV16DatosArticulo ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV18EmprCod, httpContext.getMessage( "DATART", ""), GXv_int5) ;
      webwnumpz2_impl.this.GXt_int6 = GXv_int5[0] ;
      AV16DatosArticulo = GXt_int6 ;
      AV12Anc = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Anc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Anc), 4, 0));
      AV13Barpes = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Barpes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Barpes), 4, 0));
      AV21Gm2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Gm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Gm2), 4, 0));
      AV6AlbRanc = (short)(0) ;
      if ( AV26PzaAut.doubleValue() == 1 )
      {
         if ( GXutil.strcmp(AV10AlbrUni, httpContext.getMessage( "K", "")) == 0 )
         {
            AV11AlbRUniSec = httpContext.getMessage( "M", "") ;
         }
         else
         {
            AV11AlbRUniSec = httpContext.getMessage( "K", "") ;
         }
         /* Using cursor H00B23 */
         pr_default.execute(1, new Object[] {AV18EmprCod, Integer.valueOf(AV7AlbRecCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A44AlbRecCod = H00B23_A44AlbRecCod[0] ;
            A45AlbRef = H00B23_A45AlbRef[0] ;
            A252CliCod = H00B23_A252CliCod[0] ;
            A4922AlbPml = H00B23_A4922AlbPml[0] ;
            A4921AlbRAnc = H00B23_A4921AlbRAnc[0] ;
            A4920AlbRGrm2 = H00B23_A4920AlbRGrm2[0] ;
            A11761CliUltNPz = H00B23_A11761CliUltNPz[0] ;
            A11761CliUltNPz = H00B23_A11761CliUltNPz[0] ;
            AV8AlbRef = A45AlbRef ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8AlbRef", AV8AlbRef);
            AV14CliCod = A252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CliCod), 6, 0));
            AV5AlbPml = A4922AlbPml ;
            AV6AlbRanc = A4921AlbRAnc ;
            AV9AlbRGrm2 = A4920AlbRGrm2 ;
            AV15CliUltNPz = A11761CliUltNPz ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Using cursor H00B24 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV14CliCod), AV8AlbRef});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A65ArtCod = H00B24_A65ArtCod[0] ;
            A252CliCod = H00B24_A252CliCod[0] ;
            A95ArtRen = H00B24_A95ArtRen[0] ;
            n95ArtRen = H00B24_n95ArtRen[0] ;
            A1148ArtPml = H00B24_A1148ArtPml[0] ;
            n1148ArtPml = H00B24_n1148ArtPml[0] ;
            A11761CliUltNPz = H00B24_A11761CliUltNPz[0] ;
            A11761CliUltNPz = H00B24_A11761CliUltNPz[0] ;
            AV27Rdo = A95ArtRen ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Rdo", GXutil.ltrimstr( AV27Rdo, 6, 2));
            AV13Barpes = A1148ArtPml ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13Barpes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Barpes), 4, 0));
            AV15CliUltNPz = A11761CliUltNPz ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         AV12Anc = AV6AlbRanc ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Anc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Anc), 4, 0));
         AV21Gm2 = AV9AlbRGrm2 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Gm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Gm2), 4, 0));
         if ( AV13Barpes == 0 )
         {
            AV13Barpes = AV5AlbPml ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13Barpes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Barpes), 4, 0));
         }
      }
      if ( ( AV28Stamperia == 1 ) || ( AV16DatosArticulo == 1 ) )
      {
         /* Using cursor H00B25 */
         pr_default.execute(3, new Object[] {AV18EmprCod, Integer.valueOf(AV7AlbRecCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A44AlbRecCod = H00B25_A44AlbRecCod[0] ;
            A45AlbRef = H00B25_A45AlbRef[0] ;
            A252CliCod = H00B25_A252CliCod[0] ;
            A4922AlbPml = H00B25_A4922AlbPml[0] ;
            A4921AlbRAnc = H00B25_A4921AlbRAnc[0] ;
            A4920AlbRGrm2 = H00B25_A4920AlbRGrm2[0] ;
            AV8AlbRef = A45AlbRef ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8AlbRef", AV8AlbRef);
            AV14CliCod = A252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CliCod), 6, 0));
            AV5AlbPml = A4922AlbPml ;
            AV6AlbRanc = A4921AlbRAnc ;
            AV9AlbRGrm2 = A4920AlbRGrm2 ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         /* Using cursor H00B26 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV14CliCod), AV8AlbRef});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A65ArtCod = H00B26_A65ArtCod[0] ;
            A252CliCod = H00B26_A252CliCod[0] ;
            A95ArtRen = H00B26_A95ArtRen[0] ;
            n95ArtRen = H00B26_n95ArtRen[0] ;
            A1148ArtPml = H00B26_A1148ArtPml[0] ;
            n1148ArtPml = H00B26_n1148ArtPml[0] ;
            A7415ArtPmlCru = H00B26_A7415ArtPmlCru[0] ;
            n7415ArtPmlCru = H00B26_n7415ArtPmlCru[0] ;
            A1903ArtGraAca = H00B26_A1903ArtGraAca[0] ;
            n1903ArtGraAca = H00B26_n1903ArtGraAca[0] ;
            A63ArtAcaMin = H00B26_A63ArtAcaMin[0] ;
            n63ArtAcaMin = H00B26_n63ArtAcaMin[0] ;
            AV27Rdo = A95ArtRen ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Rdo", GXutil.ltrimstr( AV27Rdo, 6, 2));
            AV13Barpes = ((AV17DatosCrudo==1) ? A7415ArtPmlCru : A1148ArtPml) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13Barpes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Barpes), 4, 0));
            AV21Gm2 = A1903ArtGraAca ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21Gm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Gm2), 4, 0));
            AV12Anc = A63ArtAcaMin ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12Anc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Anc), 4, 0));
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
      }
      GXt_char1 = AV29Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webwnumpz2_impl.this.GXt_char1 = GXv_char4[0] ;
      AV29Station = GXt_char1 ;
      GXv_char4[0] = AV18EmprCod ;
      GXv_char3[0] = AV19EmprNom ;
      GXv_char2[0] = AV33UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV29Station, GXv_char4, GXv_char3, GXv_char2) ;
      webwnumpz2_impl.this.AV18EmprCod = GXv_char4[0] ;
      webwnumpz2_impl.this.AV19EmprNom = GXv_char3[0] ;
      webwnumpz2_impl.this.AV33UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
   }

   public void e12B22( )
   {
      /* Dvelop_confirmpanel_btnconfirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnconfirmar_Result, httpContext.getMessage( "Yes", "")) == 0 )
      {
         if ( AV30TotPzas == 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR. Total de Piezas nulo", ""));
         }
         else
         {
            GXv_char4[0] = AV18EmprCod ;
            GXv_int7[0] = AV7AlbRecCod ;
            GXv_decimal8[0] = AV31TotUniKM ;
            GXv_decimal9[0] = AV32TotUniSec ;
            GXv_int10[0] = AV30TotPzas ;
            GXv_char3[0] = AV10AlbrUni ;
            GXv_int11[0] = AV12Anc ;
            GXv_decimal12[0] = AV27Rdo ;
            GXv_int13[0] = AV13Barpes ;
            new app.pnumpz2(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_decimal8, GXv_decimal9, GXv_int10, GXv_char3, GXv_int11, GXv_decimal12, GXv_int13) ;
            webwnumpz2_impl.this.AV18EmprCod = GXv_char4[0] ;
            webwnumpz2_impl.this.AV7AlbRecCod = GXv_int7[0] ;
            webwnumpz2_impl.this.AV31TotUniKM = GXv_decimal8[0] ;
            webwnumpz2_impl.this.AV32TotUniSec = GXv_decimal9[0] ;
            webwnumpz2_impl.this.AV30TotPzas = GXv_int10[0] ;
            webwnumpz2_impl.this.AV10AlbrUni = GXv_char3[0] ;
            webwnumpz2_impl.this.AV12Anc = GXv_int11[0] ;
            webwnumpz2_impl.this.AV27Rdo = GXv_decimal12[0] ;
            webwnumpz2_impl.this.AV13Barpes = GXv_int13[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV7AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7AlbRecCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV31TotUniKM", GXutil.ltrimstr( AV31TotUniKM, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV32TotUniSec", GXutil.ltrimstr( AV32TotUniSec, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV30TotPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TotPzas), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV10AlbrUni", AV10AlbrUni);
            httpContext.ajax_rsp_assign_attri("", false, "AV12Anc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Anc), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV27Rdo", GXutil.ltrimstr( AV27Rdo, 6, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV13Barpes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Barpes), 4, 0));
            httpContext.setWebReturnParms(new Object[] {A396EmprCod,Integer.valueOf(AV7AlbRecCod),AV10AlbrUni});
            httpContext.setWebReturnParmsMetadata(new Object[] {"A396EmprCod","AV7AlbRecCod","AV10AlbrUni"});
            httpContext.wjLocDisableFrm = (byte)(1) ;
            httpContext.nUserReturn = (byte)(1) ;
            returnInSub = true;
            if (true) return;
         }
      }
      /*  Sending Event outputs  */
      cmbavAlbruni.setValue( GXutil.rtrim( AV10AlbrUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbruni.getInternalname(), "Values", cmbavAlbruni.ToJavascriptSource(), true);
   }

   protected void nextLoad( )
   {
   }

   protected void e14B22( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table2_65_B22( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnconfirmar_Internalname, tblTabledvelop_confirmpanel_btnconfirmar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnconfirmar.setProperty("Title", Dvelop_confirmpanel_btnconfirmar_Title);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("ConfirmationText", Dvelop_confirmpanel_btnconfirmar_Confirmationtext);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("ConfirmType", Dvelop_confirmpanel_btnconfirmar_Confirmtype);
         ucDvelop_confirmpanel_btnconfirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnconfirmar_Internalname, "DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_65_B22e( true) ;
      }
      else
      {
         wb_table2_65_B22e( false) ;
      }
   }

   public void wb_table1_40_B22( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedtotunikm_Internalname, tblTablemergedtotunikm_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotunikm_Internalname, httpContext.getMessage( "TotUniKM", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotunikm_Internalname, GXutil.ltrim( localUtil.ntoc( AV31TotUniKM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTotunikm_Enabled!=0) ? localUtil.format( AV31TotUniKM, "ZZZZZ9.99") : localUtil.format( AV31TotUniKM, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotunikm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTotunikm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWnumPz2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavAlbruni.getInternalname(), httpContext.getMessage( "Unidad", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavAlbruni, cmbavAlbruni.getInternalname(), GXutil.rtrim( AV10AlbrUni), 1, cmbavAlbruni.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavAlbruni.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_WebWnumPz2.htm");
         cmbavAlbruni.setValue( GXutil.rtrim( AV10AlbrUni) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbruni.getInternalname(), "Values", cmbavAlbruni.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_40_B22e( true) ;
      }
      else
      {
         wb_table1_40_B22e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      AV7AlbRecCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7AlbRecCod), 8, 0));
      AV10AlbrUni = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10AlbrUni", AV10AlbrUni);
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
      paB22( ) ;
      wsB22( ) ;
      weB22( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415125178", true, true);
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
      httpContext.AddJavascriptSource("webwnumpz2.js", "?202682415125178", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavBarpes_Internalname = "vBARPES" ;
      edtavRdo_Internalname = "vRDO" ;
      edtavAnc_Internalname = "vANC" ;
      edtavGm2_Internalname = "vGM2" ;
      edtavTotpzas_Internalname = "vTOTPZAS" ;
      lblTextblocktotunikm_Internalname = "TEXTBLOCKTOTUNIKM" ;
      edtavTotunikm_Internalname = "vTOTUNIKM" ;
      cmbavAlbruni.setInternalname( "vALBRUNI" );
      tblTablemergedtotunikm_Internalname = "TABLEMERGEDTOTUNIKM" ;
      divTablesplittedtotunikm_Internalname = "TABLESPLITTEDTOTUNIKM" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Dvelop_confirmpanel_btnconfirmar_Internalname = "DVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
      tblTabledvelop_confirmpanel_btnconfirmar_Internalname = "TABLEDVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
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
      cmbavAlbruni.setJsonclick( "" );
      cmbavAlbruni.setEnabled( 0 );
      edtavTotunikm_Jsonclick = "" ;
      edtavTotunikm_Enabled = 1 ;
      edtavTotpzas_Jsonclick = "" ;
      edtavTotpzas_Enabled = 1 ;
      edtavGm2_Jsonclick = "" ;
      edtavGm2_Enabled = 1 ;
      edtavAnc_Jsonclick = "" ;
      edtavAnc_Enabled = 1 ;
      edtavRdo_Jsonclick = "" ;
      edtavRdo_Enabled = 1 ;
      edtavBarpes_Jsonclick = "" ;
      edtavBarpes_Enabled = 1 ;
      Dvelop_confirmpanel_btnconfirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnconfirmar_Confirmationtext = "Confirma los datos?" ;
      Dvelop_confirmpanel_btnconfirmar_Title = httpContext.getMessage( "Confirmar", "") ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = "" ;
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
      Form.setCaption( httpContext.getMessage( "Numeracion Piezas Almacen", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavAlbruni.setName( "vALBRUNI" );
      cmbavAlbruni.setWebtags( "" );
      cmbavAlbruni.addItem("K", httpContext.getMessage( "Kilos", ""), (short)(0));
      cmbavAlbruni.addItem("M", httpContext.getMessage( "Metros", ""), (short)(0));
      if ( cmbavAlbruni.getItemCount() > 0 )
      {
         AV10AlbrUni = cmbavAlbruni.getValidValue(AV10AlbrUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10AlbrUni", AV10AlbrUni);
      }
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV25Peso',fld:'vPESO',pic:'ZZZZZ9.99',hsh:true},{av:'AV26PzaAut',fld:'vPZAAUT',pic:'ZZZZZZ9.99',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e11B21',iparms:[]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE","{handler:'e12B22',iparms:[{av:'Dvelop_confirmpanel_btnconfirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNCONFIRMAR',prop:'Result'},{av:'AV30TotPzas',fld:'vTOTPZAS',pic:'ZZZ9'},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV31TotUniKM',fld:'vTOTUNIKM',pic:'ZZZZZ9.99'},{av:'AV32TotUniSec',fld:'vTOTUNISEC',pic:'ZZZZZ9.99'},{av:'cmbavAlbruni'},{av:'AV10AlbrUni',fld:'vALBRUNI',pic:'@!'},{av:'AV12Anc',fld:'vANC',pic:'ZZZ9'},{av:'AV27Rdo',fld:'vRDO',pic:'ZZ9.99'},{av:'AV13Barpes',fld:'vBARPES',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE",",oparms:[{av:'AV13Barpes',fld:'vBARPES',pic:'ZZZ9'},{av:'AV27Rdo',fld:'vRDO',pic:'ZZ9.99'},{av:'AV12Anc',fld:'vANC',pic:'ZZZ9'},{av:'cmbavAlbruni'},{av:'AV10AlbrUni',fld:'vALBRUNI',pic:'@!'},{av:'AV30TotPzas',fld:'vTOTPZAS',pic:'ZZZ9'},{av:'AV32TotUniSec',fld:'vTOTUNISEC',pic:'ZZZZZ9.99'},{av:'AV31TotUniKM',fld:'vTOTUNIKM',pic:'ZZZZZ9.99'},{av:'AV7AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
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
      wcpOAV10AlbrUni = "" ;
      Dvelop_confirmpanel_btnconfirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV10AlbrUni = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV25Peso = DecimalUtil.ZERO ;
      AV26PzaAut = DecimalUtil.ZERO ;
      GXKey = "" ;
      AV18EmprCod = "" ;
      AV32TotUniSec = DecimalUtil.ZERO ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV27Rdo = DecimalUtil.ZERO ;
      lblTextblocktotunikm_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      bttBtnconfirmar_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      scmdbuf = "" ;
      H00B22_A396EmprCod = new String[] {""} ;
      AV31TotUniKM = DecimalUtil.ZERO ;
      AV29Station = "" ;
      AV19EmprNom = "" ;
      AV33UsurCod = "" ;
      GXv_int5 = new byte[1] ;
      AV11AlbRUniSec = "" ;
      H00B23_A44AlbRecCod = new int[1] ;
      H00B23_A396EmprCod = new String[] {""} ;
      H00B23_A45AlbRef = new String[] {""} ;
      H00B23_A252CliCod = new int[1] ;
      H00B23_A4922AlbPml = new short[1] ;
      H00B23_A4921AlbRAnc = new short[1] ;
      H00B23_A4920AlbRGrm2 = new short[1] ;
      H00B23_A11761CliUltNPz = new int[1] ;
      A45AlbRef = "" ;
      AV8AlbRef = "" ;
      H00B24_A396EmprCod = new String[] {""} ;
      H00B24_A65ArtCod = new String[] {""} ;
      H00B24_A252CliCod = new int[1] ;
      H00B24_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00B24_n95ArtRen = new boolean[] {false} ;
      H00B24_A1148ArtPml = new short[1] ;
      H00B24_n1148ArtPml = new boolean[] {false} ;
      H00B24_A11761CliUltNPz = new int[1] ;
      A65ArtCod = "" ;
      A95ArtRen = DecimalUtil.ZERO ;
      H00B25_A44AlbRecCod = new int[1] ;
      H00B25_A396EmprCod = new String[] {""} ;
      H00B25_A45AlbRef = new String[] {""} ;
      H00B25_A252CliCod = new int[1] ;
      H00B25_A4922AlbPml = new short[1] ;
      H00B25_A4921AlbRAnc = new short[1] ;
      H00B25_A4920AlbRGrm2 = new short[1] ;
      H00B26_A396EmprCod = new String[] {""} ;
      H00B26_A65ArtCod = new String[] {""} ;
      H00B26_A252CliCod = new int[1] ;
      H00B26_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00B26_n95ArtRen = new boolean[] {false} ;
      H00B26_A1148ArtPml = new short[1] ;
      H00B26_n1148ArtPml = new boolean[] {false} ;
      H00B26_A7415ArtPmlCru = new short[1] ;
      H00B26_n7415ArtPmlCru = new boolean[] {false} ;
      H00B26_A1903ArtGraAca = new short[1] ;
      H00B26_n1903ArtGraAca = new boolean[] {false} ;
      H00B26_A63ArtAcaMin = new short[1] ;
      H00B26_n63ArtAcaMin = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_int10 = new short[1] ;
      GXv_char3 = new String[1] ;
      GXv_int11 = new short[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_int13 = new short[1] ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_btnconfirmar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwnumpz2__default(),
         new Object[] {
             new Object[] {
            H00B22_A396EmprCod
            }
            , new Object[] {
            H00B23_A44AlbRecCod, H00B23_A396EmprCod, H00B23_A45AlbRef, H00B23_A252CliCod, H00B23_A4922AlbPml, H00B23_A4921AlbRAnc, H00B23_A4920AlbRGrm2, H00B23_A11761CliUltNPz
            }
            , new Object[] {
            H00B24_A396EmprCod, H00B24_A65ArtCod, H00B24_A252CliCod, H00B24_A95ArtRen, H00B24_n95ArtRen, H00B24_A1148ArtPml, H00B24_n1148ArtPml, H00B24_A11761CliUltNPz
            }
            , new Object[] {
            H00B25_A44AlbRecCod, H00B25_A396EmprCod, H00B25_A45AlbRef, H00B25_A252CliCod, H00B25_A4922AlbPml, H00B25_A4921AlbRAnc, H00B25_A4920AlbRGrm2
            }
            , new Object[] {
            H00B26_A396EmprCod, H00B26_A65ArtCod, H00B26_A252CliCod, H00B26_A95ArtRen, H00B26_n95ArtRen, H00B26_A1148ArtPml, H00B26_n1148ArtPml, H00B26_A7415ArtPmlCru, H00B26_n7415ArtPmlCru, H00B26_A1903ArtGraAca,
            H00B26_n1903ArtGraAca, H00B26_A63ArtAcaMin, H00B26_n63ArtAcaMin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte AV28Stamperia ;
   private byte AV20Estampamos ;
   private byte AV17DatosCrudo ;
   private byte AV16DatosArticulo ;
   private byte GXt_int6 ;
   private byte GXv_int5[] ;
   private byte nGXWrapped ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV13Barpes ;
   private short AV12Anc ;
   private short AV21Gm2 ;
   private short AV30TotPzas ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV6AlbRanc ;
   private short A4922AlbPml ;
   private short A4921AlbRAnc ;
   private short A4920AlbRGrm2 ;
   private short AV5AlbPml ;
   private short AV9AlbRGrm2 ;
   private short A1148ArtPml ;
   private short A7415ArtPmlCru ;
   private short A1903ArtGraAca ;
   private short A63ArtAcaMin ;
   private short GXv_int10[] ;
   private short GXv_int11[] ;
   private short GXv_int13[] ;
   private int wcpOAV7AlbRecCod ;
   private int AV7AlbRecCod ;
   private int edtavBarpes_Enabled ;
   private int edtavRdo_Enabled ;
   private int edtavAnc_Enabled ;
   private int edtavGm2_Enabled ;
   private int edtavTotpzas_Enabled ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A11761CliUltNPz ;
   private int AV14CliCod ;
   private int AV15CliUltNPz ;
   private int GXv_int7[] ;
   private int edtavTotunikm_Enabled ;
   private int idxLst ;
   private java.math.BigDecimal AV25Peso ;
   private java.math.BigDecimal AV26PzaAut ;
   private java.math.BigDecimal AV32TotUniSec ;
   private java.math.BigDecimal AV27Rdo ;
   private java.math.BigDecimal AV31TotUniKM ;
   private java.math.BigDecimal A95ArtRen ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private String wcpOA396EmprCod ;
   private String wcpOAV10AlbrUni ;
   private String Dvelop_confirmpanel_btnconfirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV10AlbrUni ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV18EmprCod ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvelop_confirmpanel_btnconfirmar_Title ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmtype ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavBarpes_Internalname ;
   private String TempTags ;
   private String edtavBarpes_Jsonclick ;
   private String edtavRdo_Internalname ;
   private String edtavRdo_Jsonclick ;
   private String edtavAnc_Internalname ;
   private String edtavAnc_Jsonclick ;
   private String edtavGm2_Internalname ;
   private String edtavGm2_Jsonclick ;
   private String edtavTotpzas_Internalname ;
   private String edtavTotpzas_Jsonclick ;
   private String divTablesplittedtotunikm_Internalname ;
   private String lblTextblocktotunikm_Internalname ;
   private String lblTextblocktotunikm_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String scmdbuf ;
   private String edtavTotunikm_Internalname ;
   private String AV29Station ;
   private String AV19EmprNom ;
   private String AV33UsurCod ;
   private String AV11AlbRUniSec ;
   private String A45AlbRef ;
   private String AV8AlbRef ;
   private String A65ArtCod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_btnconfirmar_Internalname ;
   private String Dvelop_confirmpanel_btnconfirmar_Internalname ;
   private String tblTablemergedtotunikm_Internalname ;
   private String edtavTotunikm_Jsonclick ;
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
   private boolean n95ArtRen ;
   private boolean n1148ArtPml ;
   private boolean n7415ArtPmlCru ;
   private boolean n1903ArtGraAca ;
   private boolean n63ArtAcaMin ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnconfirmar ;
   private HTMLChoice cmbavAlbruni ;
   private IDataStoreProvider pr_default ;
   private String[] H00B22_A396EmprCod ;
   private int[] H00B23_A44AlbRecCod ;
   private String[] H00B23_A396EmprCod ;
   private String[] H00B23_A45AlbRef ;
   private int[] H00B23_A252CliCod ;
   private short[] H00B23_A4922AlbPml ;
   private short[] H00B23_A4921AlbRAnc ;
   private short[] H00B23_A4920AlbRGrm2 ;
   private int[] H00B23_A11761CliUltNPz ;
   private String[] H00B24_A396EmprCod ;
   private String[] H00B24_A65ArtCod ;
   private int[] H00B24_A252CliCod ;
   private java.math.BigDecimal[] H00B24_A95ArtRen ;
   private boolean[] H00B24_n95ArtRen ;
   private short[] H00B24_A1148ArtPml ;
   private boolean[] H00B24_n1148ArtPml ;
   private int[] H00B24_A11761CliUltNPz ;
   private int[] H00B25_A44AlbRecCod ;
   private String[] H00B25_A396EmprCod ;
   private String[] H00B25_A45AlbRef ;
   private int[] H00B25_A252CliCod ;
   private short[] H00B25_A4922AlbPml ;
   private short[] H00B25_A4921AlbRAnc ;
   private short[] H00B25_A4920AlbRGrm2 ;
   private String[] H00B26_A396EmprCod ;
   private String[] H00B26_A65ArtCod ;
   private int[] H00B26_A252CliCod ;
   private java.math.BigDecimal[] H00B26_A95ArtRen ;
   private boolean[] H00B26_n95ArtRen ;
   private short[] H00B26_A1148ArtPml ;
   private boolean[] H00B26_n1148ArtPml ;
   private short[] H00B26_A7415ArtPmlCru ;
   private boolean[] H00B26_n7415ArtPmlCru ;
   private short[] H00B26_A1903ArtGraAca ;
   private boolean[] H00B26_n1903ArtGraAca ;
   private short[] H00B26_A63ArtAcaMin ;
   private boolean[] H00B26_n63ArtAcaMin ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class webwnumpz2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00B22", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00B23", "SELECT T1.AlbRecCod, T1.EmprCod, T1.AlbRef, T1.CliCod, T1.AlbPml, T1.AlbRAnc, T1.AlbRGrm2, T2.CliUltNPz FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00B24", "SELECT T1.EmprCod, T1.ArtCod, T1.CliCod, T1.ArtRen, T1.ArtPml, T2.CliUltNPz FROM (TXPARTICU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00B25", "SELECT AlbRecCod, EmprCod, AlbRef, CliCod, AlbPml, AlbRAnc, AlbRGrm2 FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00B26", "SELECT EmprCod, ArtCod, CliCod, ArtRen, ArtPml, ArtPmlCru, ArtGraAca, ArtAcaMin FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

