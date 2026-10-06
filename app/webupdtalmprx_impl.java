package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webupdtalmprx_impl extends GXDataArea
{
   public webupdtalmprx_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webupdtalmprx_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webupdtalmprx_impl.class ));
   }

   public webupdtalmprx_impl( int remoteHandle ,
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
         gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
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
            AV15Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Emprcod", AV15Emprcod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV21PrdNum = httpContext.GetPar( "PrdNum") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21PrdNum", AV21PrdNum);
               AV20PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20PrvNum), 6, 0));
               AV24LinEnt = (short)(GXutil.lval( httpContext.GetPar( "LinEnt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24LinEnt), 4, 0));
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
      pa11A2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start11A2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webupdtalmprx", new String[] {GXutil.URLEncode(GXutil.rtrim(AV15Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV21PrdNum)),GXutil.URLEncode(GXutil.ltrimstr(AV20PrvNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV24LinEnt,4,0))}, new String[] {"Emprcod","PrdNum","PrvNum","LinEnt"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLASTFEC", getSecureSignedToken( "", AV22LastFec));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vLASTFEC", localUtil.dtoc( AV22LastFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLASTFEC", getSecureSignedToken( "", AV22LastFec));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV15Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNUM", GXutil.rtrim( AV21PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vLINENT", GXutil.ltrim( localUtil.ntoc( AV24LinEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDENTPRE", GXutil.ltrim( localUtil.ntoc( AV27OldEntpre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDENTUNIENT", GXutil.ltrim( localUtil.ntoc( AV26OldEntUnient, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRVNUM", GXutil.ltrim( localUtil.ntoc( AV20PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
         we11A2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt11A2( ) ;
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
      return formatLink("app.webupdtalmprx", new String[] {GXutil.URLEncode(GXutil.rtrim(AV15Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV21PrdNum)),GXutil.URLEncode(GXutil.ltrimstr(AV20PrvNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV24LinEnt,4,0))}, new String[] {"Emprcod","PrdNum","PrvNum","LinEnt"})  ;
   }

   public String getPgmname( )
   {
      return "WebUpdTALMPRX" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Entrada Producto Almacen(UPD)", "") ;
   }

   public void wb11A0( )
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavEntfecent_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavEntfecent_Internalname, httpContext.getMessage( "Fecha ", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavEntfecent_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavEntfecent_Internalname, localUtil.format(AV5EntFecEnt, "99/99/99"), localUtil.format( AV5EntFecEnt, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEntfecent_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavEntfecent_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebUpdTALMPRX.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavEntfecent_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavEntfecent_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebUpdTALMPRX.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divAlbaran_cell_Internalname, 1, 0, "px", 0, "px", divAlbaran_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavAlbaran_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbaran_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbaran_Internalname, httpContext.getMessage( "Nº Documento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbaran_Internalname, GXutil.rtrim( AV6Albaran), GXutil.rtrim( localUtil.format( AV6Albaran, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbaran_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavAlbaran_Visible, edtavAlbaran_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebUpdTALMPRX.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divEntnalbar_cell_Internalname, 1, 0, "px", 0, "px", divEntnalbar_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavEntnalbar_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavEntnalbar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavEntnalbar_Internalname, httpContext.getMessage( "Nº Documento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavEntnalbar_Internalname, GXutil.rtrim( AV7EntNAlbar), GXutil.rtrim( localUtil.format( AV7EntNAlbar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEntnalbar_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavEntnalbar_Visible, edtavEntnalbar_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebUpdTALMPRX.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedpedcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockpedcod_Internalname, httpContext.getMessage( "Nº Pedido", ""), "", "", lblTextblockpedcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebUpdTALMPRX.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
         wb_table1_42_11A2( true) ;
      }
      else
      {
         wb_table1_42_11A2( false) ;
      }
      return  ;
   }

   public void wb_table1_42_11A2e( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavEntprvnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavEntprvnum_Internalname, httpContext.getMessage( "Proveedor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavEntprvnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV9EntPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavEntprvnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV9EntPrvNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV9EntPrvNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEntprvnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavEntprvnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebUpdTALMPRX.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavEntunient_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavEntunient_Internalname, httpContext.getMessage( "Unidades", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavEntunient_Internalname, GXutil.ltrim( localUtil.ntoc( AV10EntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavEntunient_Enabled!=0) ? localUtil.format( AV10EntUniEnt, "ZZZZZ9.99") : localUtil.format( AV10EntUniEnt, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,60);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEntunient_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavEntunient_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebUpdTALMPRX.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableentunirem_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockentunirem_Internalname, httpContext.getMessage( "Unidades Stock", ""), "", "", lblTextblockentunirem_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebUpdTALMPRX.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavEntunirem_Internalname, httpContext.getMessage( "Unidades remanentes", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavEntunirem_Internalname, GXutil.ltrim( localUtil.ntoc( AV25EntUnirem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavEntunirem_Enabled!=0) ? localUtil.format( AV25EntUnirem, "ZZZZZ9.9999") : localUtil.format( AV25EntUnirem, "ZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,68);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEntunirem_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavEntunirem_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebUpdTALMPRX.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavEntpre_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavEntpre_Internalname, httpContext.getMessage( "Precio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavEntpre_Internalname, GXutil.ltrim( localUtil.ntoc( AV11EntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavEntpre_Enabled!=0) ? localUtil.format( AV11EntPre, "ZZZZZZZ9.999") : localUtil.format( AV11EntPre, "ZZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEntpre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavEntpre_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebUpdTALMPRX.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavEntlotn_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavEntlotn_Internalname, httpContext.getMessage( "Nº Lote", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavEntlotn_Internalname, GXutil.rtrim( AV12EntLotN), GXutil.rtrim( localUtil.format( AV12EntLotN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEntlotn_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavEntlotn_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebUpdTALMPRX.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavEntfval_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavEntfval_Internalname, httpContext.getMessage( "Caducidad del producto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavEntfval_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavEntfval_Internalname, localUtil.format(AV13EntFVal, "99/99/99"), localUtil.format( AV13EntFVal, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,83);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEntfval_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavEntfval_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebUpdTALMPRX.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavEntfval_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavEntfval_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebUpdTALMPRX.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavEntobs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavEntobs_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavEntobs_Internalname, GXutil.rtrim( AV14EntObs), GXutil.rtrim( localUtil.format( AV14EntObs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,88);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEntobs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavEntobs_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebUpdTALMPRX.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1111a1_client"+"'", TempTags, "", 2, "HLP_WebUpdTALMPRX.htm");
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
         wb_table2_100_11A2( true) ;
      }
      else
      {
         wb_table2_100_11A2( false) ;
      }
      return  ;
   }

   public void wb_table2_100_11A2e( boolean wbgen )
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

   public void start11A2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Entrada Producto Almacen(UPD)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup11A0( ) ;
   }

   public void ws11A2( )
   {
      start11A2( ) ;
      evt11A2( ) ;
   }

   public void evt11A2( )
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
                           e1211A2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e1311A2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e1411A2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOPROMPTPEDIDO'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoPromptPedido' */
                           e1511A2 ();
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

   public void we11A2( )
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

   public void pa11A2( )
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
            GX_FocusControl = edtavEntfecent_Internalname ;
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
      rf11A2( ) ;
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
      edtavEntunirem_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEntunirem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntunirem_Enabled), 5, 0), true);
   }

   public void rf11A2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1411A2 ();
         wb11A0( ) ;
      }
   }

   public void send_integrity_lvl_hashes11A2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vLASTFEC", localUtil.dtoc( AV22LastFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLASTFEC", getSecureSignedToken( "", AV22LastFec));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavEntunirem_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEntunirem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntunirem_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup11A0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1311A2 ();
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
         Dvelop_confirmpanel_btnconfirmar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype") ;
         Dvelop_confirmpanel_btnconfirmar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result") ;
         /* Read variables values. */
         if ( localUtil.vcdate( httpContext.cgiGet( edtavEntfecent_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vENTFECENT");
            GX_FocusControl = edtavEntfecent_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5EntFecEnt = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5EntFecEnt", localUtil.format(AV5EntFecEnt, "99/99/99"));
         }
         else
         {
            AV5EntFecEnt = localUtil.ctod( httpContext.cgiGet( edtavEntfecent_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5EntFecEnt", localUtil.format(AV5EntFecEnt, "99/99/99"));
         }
         AV6Albaran = httpContext.cgiGet( edtavAlbaran_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Albaran", AV6Albaran);
         AV7EntNAlbar = httpContext.cgiGet( edtavEntnalbar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7EntNAlbar", AV7EntNAlbar);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPedcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPedcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPEDCOD");
            GX_FocusControl = edtavPedcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8PedCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8PedCod), 8, 0));
         }
         else
         {
            AV8PedCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavPedcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8PedCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavEntprvnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavEntprvnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vENTPRVNUM");
            GX_FocusControl = edtavEntprvnum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9EntPrvNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9EntPrvNum), 6, 0));
         }
         else
         {
            AV9EntPrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavEntprvnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9EntPrvNum), 6, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavEntunient_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavEntunient_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vENTUNIENT");
            GX_FocusControl = edtavEntunient_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10EntUniEnt = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10EntUniEnt", GXutil.ltrimstr( AV10EntUniEnt, 9, 2));
         }
         else
         {
            AV10EntUniEnt = localUtil.ctond( httpContext.cgiGet( edtavEntunient_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10EntUniEnt", GXutil.ltrimstr( AV10EntUniEnt, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavEntunirem_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavEntunirem_Internalname)), DecimalUtil.stringToDec("999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vENTUNIREM");
            GX_FocusControl = edtavEntunirem_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV25EntUnirem = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25EntUnirem", GXutil.ltrimstr( AV25EntUnirem, 11, 4));
         }
         else
         {
            AV25EntUnirem = localUtil.ctond( httpContext.cgiGet( edtavEntunirem_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25EntUnirem", GXutil.ltrimstr( AV25EntUnirem, 11, 4));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavEntpre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavEntpre_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vENTPRE");
            GX_FocusControl = edtavEntpre_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11EntPre = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11EntPre", GXutil.ltrimstr( AV11EntPre, 14, 5));
         }
         else
         {
            AV11EntPre = localUtil.ctond( httpContext.cgiGet( edtavEntpre_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11EntPre", GXutil.ltrimstr( AV11EntPre, 14, 5));
         }
         AV12EntLotN = httpContext.cgiGet( edtavEntlotn_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12EntLotN", AV12EntLotN);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavEntfval_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vENTFVAL");
            GX_FocusControl = edtavEntfval_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13EntFVal = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13EntFVal", localUtil.format(AV13EntFVal, "99/99/99"));
         }
         else
         {
            AV13EntFVal = localUtil.ctod( httpContext.cgiGet( edtavEntfval_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13EntFVal", localUtil.format(AV13EntFVal, "99/99/99"));
         }
         AV14EntObs = httpContext.cgiGet( edtavEntobs_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14EntObs", AV14EntObs);
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
      e1311A2 ();
      if (returnInSub) return;
   }

   public void e1311A2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV18Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webupdtalmprx_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Station = GXt_char1 ;
      GXv_char2[0] = AV15Emprcod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV19UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      webupdtalmprx_impl.this.AV15Emprcod = GXv_char2[0] ;
      webupdtalmprx_impl.this.AV16EmprNom = GXv_char3[0] ;
      webupdtalmprx_impl.this.AV19UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Emprcod", AV15Emprcod);
      GXv_char4[0] = AV15Emprcod ;
      GXv_char3[0] = AV21PrdNum ;
      GXv_date5[0] = AV22LastFec ;
      new app.pstm005(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date5) ;
      webupdtalmprx_impl.this.AV15Emprcod = GXv_char4[0] ;
      webupdtalmprx_impl.this.AV21PrdNum = GXv_char3[0] ;
      webupdtalmprx_impl.this.AV22LastFec = GXv_date5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Emprcod", AV15Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV21PrdNum", AV21PrdNum);
      httpContext.ajax_rsp_assign_attri("", false, "AV22LastFec", localUtil.format(AV22LastFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLASTFEC", getSecureSignedToken( "", AV22LastFec));
      GXt_int6 = (byte)(AV17Nalbaran20) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV15Emprcod, httpContext.getMessage( "ALBA20", ""), GXv_int7) ;
      webupdtalmprx_impl.this.GXt_int6 = GXv_int7[0] ;
      AV17Nalbaran20 = GXt_int6 ;
      GXt_int6 = (byte)(AV23FlagFecCcs) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV15Emprcod, httpContext.getMessage( "FECCCS", ""), GXv_int7) ;
      webupdtalmprx_impl.this.GXt_int6 = GXv_int7[0] ;
      AV23FlagFecCcs = GXt_int6 ;
      /* Using cursor H011A2 */
      pr_default.execute(0, new Object[] {AV15Emprcod, AV21PrdNum, Short.valueOf(AV24LinEnt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A597LinEnt = H011A2_A597LinEnt[0] ;
         A719PrdNum = H011A2_A719PrdNum[0] ;
         A396EmprCod = H011A2_A396EmprCod[0] ;
         A11Albaran = H011A2_A11Albaran[0] ;
         A415EntFecEnt = H011A2_A415EntFecEnt[0] ;
         A5685EntFVal = H011A2_A5685EntFVal[0] ;
         A5686EntLotN = H011A2_A5686EntLotN[0] ;
         A12857EntNAlbar = H011A2_A12857EntNAlbar[0] ;
         A10783EntObs = H011A2_A10783EntObs[0] ;
         A417EntPre = H011A2_A417EntPre[0] ;
         A6156EntPrvNum = H011A2_A6156EntPrvNum[0] ;
         n6156EntPrvNum = H011A2_n6156EntPrvNum[0] ;
         A418EntUniEnt = H011A2_A418EntUniEnt[0] ;
         A658PedCod = H011A2_A658PedCod[0] ;
         n658PedCod = H011A2_n658PedCod[0] ;
         A419EntUniRem = H011A2_A419EntUniRem[0] ;
         AV6Albaran = A11Albaran ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Albaran", AV6Albaran);
         AV5EntFecEnt = A415EntFecEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5EntFecEnt", localUtil.format(AV5EntFecEnt, "99/99/99"));
         AV13EntFVal = A5685EntFVal ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13EntFVal", localUtil.format(AV13EntFVal, "99/99/99"));
         AV12EntLotN = A5686EntLotN ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12EntLotN", AV12EntLotN);
         AV7EntNAlbar = A12857EntNAlbar ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7EntNAlbar", AV7EntNAlbar);
         AV14EntObs = A10783EntObs ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14EntObs", AV14EntObs);
         AV11EntPre = A417EntPre ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11EntPre", GXutil.ltrimstr( AV11EntPre, 14, 5));
         AV9EntPrvNum = A6156EntPrvNum ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9EntPrvNum), 6, 0));
         AV10EntUniEnt = A418EntUniEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10EntUniEnt", GXutil.ltrimstr( AV10EntUniEnt, 9, 2));
         AV8PedCod = A658PedCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8PedCod), 8, 0));
         AV25EntUnirem = A419EntUniRem ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25EntUnirem", GXutil.ltrimstr( AV25EntUnirem, 11, 4));
         AV26OldEntUnient = A418EntUniEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26OldEntUnient", GXutil.ltrimstr( AV26OldEntUnient, 9, 2));
         AV27OldEntpre = A417EntPre ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27OldEntpre", GXutil.ltrimstr( AV27OldEntpre, 14, 5));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      GXt_char1 = AV18Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webupdtalmprx_impl.this.GXt_char1 = GXv_char4[0] ;
      AV18Station = GXt_char1 ;
      GXv_char4[0] = AV15Emprcod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char2[0] = AV19UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char4, GXv_char3, GXv_char2) ;
      webupdtalmprx_impl.this.AV15Emprcod = GXv_char4[0] ;
      webupdtalmprx_impl.this.AV16EmprNom = GXv_char3[0] ;
      webupdtalmprx_impl.this.AV19UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Emprcod", AV15Emprcod);
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
   }

   public void e1211A2( )
   {
      /* Dvelop_confirmpanel_btnconfirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnconfirmar_Result, "Yes") == 0 )
      {
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV10EntUniEnt)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Debe de entrar Unidades", ""));
            GX_FocusControl = edtavEntunient_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV11EntPre)==0) )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Precio con valor cero", ""));
               GX_FocusControl = edtavEntpre_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV5EntFecEnt)) )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "Debe de entrar Fecha", ""));
                  GX_FocusControl = edtavEntfecent_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               else
               {
                  if ( GXutil.resetTime(AV22LastFec).after( GXutil.resetTime( AV5EntFecEnt )) )
                  {
                     Gx_msg = httpContext.getMessage( "Atencion.Ultimo Mov Fecha ", "") + GXutil.trim( localUtil.dtoc( AV22LastFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + httpContext.getMessage( " superior a Fecha Mov ", "") + GXutil.trim( localUtil.dtoc( AV5EntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
                     httpContext.GX_msglist.addItem(Gx_msg);
                     GX_FocusControl = edtavEntfecent_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                  }
                  else
                  {
                     GXv_char4[0] = AV15Emprcod ;
                     GXv_char3[0] = AV21PrdNum ;
                     GXv_int8[0] = AV24LinEnt ;
                     GXv_char2[0] = AV6Albaran ;
                     GXv_date5[0] = AV5EntFecEnt ;
                     GXv_date9[0] = AV13EntFVal ;
                     GXv_char10[0] = AV12EntLotN ;
                     GXv_char11[0] = AV7EntNAlbar ;
                     GXv_decimal12[0] = AV11EntPre ;
                     GXv_decimal13[0] = AV27OldEntpre ;
                     GXv_int14[0] = AV9EntPrvNum ;
                     GXv_decimal15[0] = AV10EntUniEnt ;
                     GXv_decimal16[0] = AV26OldEntUnient ;
                     GXv_int17[0] = AV8PedCod ;
                     new app.core.updtalmprx(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int8, GXv_char2, GXv_date5, GXv_date9, GXv_char10, GXv_char11, GXv_decimal12, GXv_decimal13, GXv_int14, GXv_decimal15, GXv_decimal16, GXv_int17) ;
                     webupdtalmprx_impl.this.AV15Emprcod = GXv_char4[0] ;
                     webupdtalmprx_impl.this.AV21PrdNum = GXv_char3[0] ;
                     webupdtalmprx_impl.this.AV24LinEnt = GXv_int8[0] ;
                     webupdtalmprx_impl.this.AV6Albaran = GXv_char2[0] ;
                     webupdtalmprx_impl.this.AV5EntFecEnt = GXv_date5[0] ;
                     webupdtalmprx_impl.this.AV13EntFVal = GXv_date9[0] ;
                     webupdtalmprx_impl.this.AV12EntLotN = GXv_char10[0] ;
                     webupdtalmprx_impl.this.AV7EntNAlbar = GXv_char11[0] ;
                     webupdtalmprx_impl.this.AV11EntPre = GXv_decimal12[0] ;
                     webupdtalmprx_impl.this.AV27OldEntpre = GXv_decimal13[0] ;
                     webupdtalmprx_impl.this.AV9EntPrvNum = GXv_int14[0] ;
                     webupdtalmprx_impl.this.AV10EntUniEnt = GXv_decimal15[0] ;
                     webupdtalmprx_impl.this.AV26OldEntUnient = GXv_decimal16[0] ;
                     webupdtalmprx_impl.this.AV8PedCod = GXv_int17[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV15Emprcod", AV15Emprcod);
                     httpContext.ajax_rsp_assign_attri("", false, "AV21PrdNum", AV21PrdNum);
                     httpContext.ajax_rsp_assign_attri("", false, "AV24LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24LinEnt), 4, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "AV6Albaran", AV6Albaran);
                     httpContext.ajax_rsp_assign_attri("", false, "AV5EntFecEnt", localUtil.format(AV5EntFecEnt, "99/99/99"));
                     httpContext.ajax_rsp_assign_attri("", false, "AV13EntFVal", localUtil.format(AV13EntFVal, "99/99/99"));
                     httpContext.ajax_rsp_assign_attri("", false, "AV12EntLotN", AV12EntLotN);
                     httpContext.ajax_rsp_assign_attri("", false, "AV7EntNAlbar", AV7EntNAlbar);
                     httpContext.ajax_rsp_assign_attri("", false, "AV11EntPre", GXutil.ltrimstr( AV11EntPre, 14, 5));
                     httpContext.ajax_rsp_assign_attri("", false, "AV27OldEntpre", GXutil.ltrimstr( AV27OldEntpre, 14, 5));
                     httpContext.ajax_rsp_assign_attri("", false, "AV9EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9EntPrvNum), 6, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "AV10EntUniEnt", GXutil.ltrimstr( AV10EntUniEnt, 9, 2));
                     httpContext.ajax_rsp_assign_attri("", false, "AV26OldEntUnient", GXutil.ltrimstr( AV26OldEntUnient, 9, 2));
                     httpContext.ajax_rsp_assign_attri("", false, "AV8PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8PedCod), 8, 0));
                     httpContext.setWebReturnParms(new Object[] {AV15Emprcod,AV21PrdNum,Integer.valueOf(AV20PrvNum),Short.valueOf(AV24LinEnt)});
                     httpContext.setWebReturnParmsMetadata(new Object[] {"AV15Emprcod","AV21PrdNum","AV20PrvNum","AV24LinEnt"});
                     httpContext.wjLocDisableFrm = (byte)(1) ;
                     httpContext.nUserReturn = (byte)(1) ;
                     returnInSub = true;
                     if (true) return;
                  }
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e1511A2( )
   {
      /* 'DoPromptPedido' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.comprasquimicos.tpedidoprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV15Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV8PedCod,8,0))}, new String[] {"InOutEmprCod","InOutPedCod"}) , new Object[] {"AV15Emprcod","AV8PedCod"});
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV15Emprcod, httpContext.getMessage( "ALBA20", "")) == 0 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtavAlbaran_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavAlbaran_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbaran_Visible), 5, 0), true);
         divAlbaran_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divAlbaran_cell_Internalname, "Class", divAlbaran_cell_Class, true);
      }
      else
      {
         edtavAlbaran_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavAlbaran_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbaran_Visible), 5, 0), true);
         divAlbaran_cell_Class = "col-xs-12" ;
         httpContext.ajax_rsp_assign_prop("", false, divAlbaran_cell_Internalname, "Class", divAlbaran_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV15Emprcod, httpContext.getMessage( "ALBA20", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtavEntnalbar_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavEntnalbar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntnalbar_Visible), 5, 0), true);
         divEntnalbar_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divEntnalbar_cell_Internalname, "Class", divEntnalbar_cell_Class, true);
      }
      else
      {
         edtavEntnalbar_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavEntnalbar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntnalbar_Visible), 5, 0), true);
         divEntnalbar_cell_Class = "col-xs-12" ;
         httpContext.ajax_rsp_assign_prop("", false, divEntnalbar_cell_Internalname, "Class", divEntnalbar_cell_Class, true);
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e1411A2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table2_100_11A2( boolean wbgen )
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
         wb_table2_100_11A2e( true) ;
      }
      else
      {
         wb_table2_100_11A2e( false) ;
      }
   }

   public void wb_table1_42_11A2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedpedcod_Internalname, tblTablemergedpedcod_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPedcod_Internalname, httpContext.getMessage( "Ped Cod", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPedcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV8PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPedcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV8PedCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV8PedCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPedcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPedcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebUpdTALMPRX.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Image" + " " + ((GXutil.strcmp(imgPromptpedido_gximage, "")==0) ? "GX_Image_prompt_Class" : "GX_Image_"+imgPromptpedido_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgPromptpedido_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgPromptpedido_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOPROMPTPEDIDO\\'."+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WebUpdTALMPRX.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_42_11A2e( true) ;
      }
      else
      {
         wb_table1_42_11A2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV15Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Emprcod", AV15Emprcod);
      AV21PrdNum = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21PrdNum", AV21PrdNum);
      AV20PrvNum = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20PrvNum), 6, 0));
      AV24LinEnt = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24LinEnt), 4, 0));
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
      pa11A2( ) ;
      ws11A2( ) ;
      we11A2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016423641", true, true);
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
      httpContext.AddJavascriptSource("webupdtalmprx.js", "?202661016423641", false, true);
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
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavEntfecent_Internalname = "vENTFECENT" ;
      edtavAlbaran_Internalname = "vALBARAN" ;
      divAlbaran_cell_Internalname = "ALBARAN_CELL" ;
      edtavEntnalbar_Internalname = "vENTNALBAR" ;
      divEntnalbar_cell_Internalname = "ENTNALBAR_CELL" ;
      lblTextblockpedcod_Internalname = "TEXTBLOCKPEDCOD" ;
      edtavPedcod_Internalname = "vPEDCOD" ;
      imgPromptpedido_Internalname = "PROMPTPEDIDO" ;
      tblTablemergedpedcod_Internalname = "TABLEMERGEDPEDCOD" ;
      divTablesplittedpedcod_Internalname = "TABLESPLITTEDPEDCOD" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtavEntprvnum_Internalname = "vENTPRVNUM" ;
      edtavEntunient_Internalname = "vENTUNIENT" ;
      lblTextblockentunirem_Internalname = "TEXTBLOCKENTUNIREM" ;
      edtavEntunirem_Internalname = "vENTUNIREM" ;
      divUnnamedtableentunirem_Internalname = "UNNAMEDTABLEENTUNIREM" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavEntpre_Internalname = "vENTPRE" ;
      edtavEntlotn_Internalname = "vENTLOTN" ;
      edtavEntfval_Internalname = "vENTFVAL" ;
      edtavEntobs_Internalname = "vENTOBS" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
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
      edtavPedcod_Jsonclick = "" ;
      edtavPedcod_Enabled = 1 ;
      edtavEntobs_Jsonclick = "" ;
      edtavEntobs_Enabled = 1 ;
      edtavEntfval_Jsonclick = "" ;
      edtavEntfval_Enabled = 1 ;
      edtavEntlotn_Jsonclick = "" ;
      edtavEntlotn_Enabled = 1 ;
      edtavEntpre_Jsonclick = "" ;
      edtavEntpre_Enabled = 1 ;
      edtavEntunirem_Jsonclick = "" ;
      edtavEntunirem_Enabled = 1 ;
      edtavEntunient_Jsonclick = "" ;
      edtavEntunient_Enabled = 1 ;
      edtavEntprvnum_Jsonclick = "" ;
      edtavEntprvnum_Enabled = 1 ;
      edtavEntnalbar_Jsonclick = "" ;
      edtavEntnalbar_Enabled = 1 ;
      edtavEntnalbar_Visible = 1 ;
      divEntnalbar_cell_Class = "col-xs-12" ;
      edtavAlbaran_Jsonclick = "" ;
      edtavAlbaran_Enabled = 1 ;
      edtavAlbaran_Visible = 1 ;
      divAlbaran_cell_Class = "col-xs-12" ;
      edtavEntfecent_Jsonclick = "" ;
      edtavEntfecent_Enabled = 1 ;
      Dvelop_confirmpanel_btnconfirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnconfirmar_Confirmationtext = "¿Confirma la modificacion?" ;
      Dvelop_confirmpanel_btnconfirmar_Title = "" ;
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
      Form.setCaption( httpContext.getMessage( "Entrada Producto Almacen(UPD)", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV22LastFec',fld:'vLASTFEC',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e1111A1',iparms:[]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE","{handler:'e1211A2',iparms:[{av:'Dvelop_confirmpanel_btnconfirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNCONFIRMAR',prop:'Result'},{av:'AV10EntUniEnt',fld:'vENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV11EntPre',fld:'vENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV5EntFecEnt',fld:'vENTFECENT',pic:''},{av:'AV22LastFec',fld:'vLASTFEC',pic:'',hsh:true},{av:'AV15Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV21PrdNum',fld:'vPRDNUM',pic:''},{av:'AV24LinEnt',fld:'vLINENT',pic:'ZZZ9'},{av:'AV6Albaran',fld:'vALBARAN',pic:''},{av:'AV13EntFVal',fld:'vENTFVAL',pic:''},{av:'AV12EntLotN',fld:'vENTLOTN',pic:''},{av:'AV7EntNAlbar',fld:'vENTNALBAR',pic:''},{av:'AV27OldEntpre',fld:'vOLDENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV9EntPrvNum',fld:'vENTPRVNUM',pic:'ZZZZZ9'},{av:'AV26OldEntUnient',fld:'vOLDENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV8PedCod',fld:'vPEDCOD',pic:'ZZZZZZZ9'},{av:'AV20PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE",",oparms:[{av:'AV8PedCod',fld:'vPEDCOD',pic:'ZZZZZZZ9'},{av:'AV26OldEntUnient',fld:'vOLDENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV10EntUniEnt',fld:'vENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV9EntPrvNum',fld:'vENTPRVNUM',pic:'ZZZZZ9'},{av:'AV27OldEntpre',fld:'vOLDENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV11EntPre',fld:'vENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV7EntNAlbar',fld:'vENTNALBAR',pic:''},{av:'AV12EntLotN',fld:'vENTLOTN',pic:''},{av:'AV13EntFVal',fld:'vENTFVAL',pic:''},{av:'AV5EntFecEnt',fld:'vENTFECENT',pic:''},{av:'AV6Albaran',fld:'vALBARAN',pic:''},{av:'AV24LinEnt',fld:'vLINENT',pic:'ZZZ9'},{av:'AV21PrdNum',fld:'vPRDNUM',pic:''},{av:'AV15Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOPROMPTPEDIDO'","{handler:'e1511A2',iparms:[{av:'AV15Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8PedCod',fld:'vPEDCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOPROMPTPEDIDO'",",oparms:[{av:'AV8PedCod',fld:'vPEDCOD',pic:'ZZZZZZZ9'},{av:'AV15Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
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
      wcpOAV15Emprcod = "" ;
      wcpOAV21PrdNum = "" ;
      Dvelop_confirmpanel_btnconfirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV15Emprcod = "" ;
      AV21PrdNum = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV22LastFec = GXutil.nullDate() ;
      GXKey = "" ;
      AV27OldEntpre = DecimalUtil.ZERO ;
      AV26OldEntUnient = DecimalUtil.ZERO ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV5EntFecEnt = GXutil.nullDate() ;
      AV6Albaran = "" ;
      AV7EntNAlbar = "" ;
      lblTextblockpedcod_Jsonclick = "" ;
      AV10EntUniEnt = DecimalUtil.ZERO ;
      lblTextblockentunirem_Jsonclick = "" ;
      AV25EntUnirem = DecimalUtil.ZERO ;
      AV11EntPre = DecimalUtil.ZERO ;
      AV12EntLotN = "" ;
      AV13EntFVal = GXutil.nullDate() ;
      AV14EntObs = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      bttBtnconfirmar_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV18Station = "" ;
      AV16EmprNom = "" ;
      AV19UsurCod = "" ;
      GXv_int7 = new byte[1] ;
      scmdbuf = "" ;
      H011A2_A597LinEnt = new short[1] ;
      H011A2_A719PrdNum = new String[] {""} ;
      H011A2_A396EmprCod = new String[] {""} ;
      H011A2_A11Albaran = new String[] {""} ;
      H011A2_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      H011A2_A5685EntFVal = new java.util.Date[] {GXutil.nullDate()} ;
      H011A2_A5686EntLotN = new String[] {""} ;
      H011A2_A12857EntNAlbar = new String[] {""} ;
      H011A2_A10783EntObs = new String[] {""} ;
      H011A2_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H011A2_A6156EntPrvNum = new int[1] ;
      H011A2_n6156EntPrvNum = new boolean[] {false} ;
      H011A2_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H011A2_A658PedCod = new int[1] ;
      H011A2_n658PedCod = new boolean[] {false} ;
      H011A2_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A11Albaran = "" ;
      A415EntFecEnt = GXutil.nullDate() ;
      A5685EntFVal = GXutil.nullDate() ;
      A5686EntLotN = "" ;
      A12857EntNAlbar = "" ;
      A10783EntObs = "" ;
      A417EntPre = DecimalUtil.ZERO ;
      A418EntUniEnt = DecimalUtil.ZERO ;
      A419EntUniRem = DecimalUtil.ZERO ;
      GXt_char1 = "" ;
      Gx_msg = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int8 = new short[1] ;
      GXv_char2 = new String[1] ;
      GXv_date5 = new java.util.Date[1] ;
      GXv_date9 = new java.util.Date[1] ;
      GXv_char10 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_int14 = new int[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      GXv_int17 = new int[1] ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_btnconfirmar = new com.genexus.webpanels.GXUserControl();
      imgPromptpedido_gximage = "" ;
      sImgUrl = "" ;
      imgPromptpedido_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webupdtalmprx__default(),
         new Object[] {
             new Object[] {
            H011A2_A597LinEnt, H011A2_A719PrdNum, H011A2_A396EmprCod, H011A2_A11Albaran, H011A2_A415EntFecEnt, H011A2_A5685EntFVal, H011A2_A5686EntLotN, H011A2_A12857EntNAlbar, H011A2_A10783EntObs, H011A2_A417EntPre,
            H011A2_A6156EntPrvNum, H011A2_n6156EntPrvNum, H011A2_A418EntUniEnt, H011A2_A658PedCod, H011A2_n658PedCod, H011A2_A419EntUniRem
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavEntunirem_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte GXt_int6 ;
   private byte GXv_int7[] ;
   private byte nGXWrapped ;
   private short wcpOAV24LinEnt ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV24LinEnt ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV17Nalbaran20 ;
   private short AV23FlagFecCcs ;
   private short A597LinEnt ;
   private short GXv_int8[] ;
   private int wcpOAV20PrvNum ;
   private int AV20PrvNum ;
   private int edtavEntfecent_Enabled ;
   private int edtavAlbaran_Visible ;
   private int edtavAlbaran_Enabled ;
   private int edtavEntnalbar_Visible ;
   private int edtavEntnalbar_Enabled ;
   private int AV9EntPrvNum ;
   private int edtavEntprvnum_Enabled ;
   private int edtavEntunient_Enabled ;
   private int edtavEntunirem_Enabled ;
   private int edtavEntpre_Enabled ;
   private int edtavEntlotn_Enabled ;
   private int edtavEntfval_Enabled ;
   private int edtavEntobs_Enabled ;
   private int AV8PedCod ;
   private int A6156EntPrvNum ;
   private int A658PedCod ;
   private int GXv_int14[] ;
   private int GXv_int17[] ;
   private int edtavPedcod_Enabled ;
   private int idxLst ;
   private java.math.BigDecimal AV27OldEntpre ;
   private java.math.BigDecimal AV26OldEntUnient ;
   private java.math.BigDecimal AV10EntUniEnt ;
   private java.math.BigDecimal AV25EntUnirem ;
   private java.math.BigDecimal AV11EntPre ;
   private java.math.BigDecimal A417EntPre ;
   private java.math.BigDecimal A418EntUniEnt ;
   private java.math.BigDecimal A419EntUniRem ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private String wcpOAV15Emprcod ;
   private String wcpOAV21PrdNum ;
   private String Dvelop_confirmpanel_btnconfirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV15Emprcod ;
   private String AV21PrdNum ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavEntfecent_Internalname ;
   private String TempTags ;
   private String edtavEntfecent_Jsonclick ;
   private String divAlbaran_cell_Internalname ;
   private String divAlbaran_cell_Class ;
   private String edtavAlbaran_Internalname ;
   private String AV6Albaran ;
   private String edtavAlbaran_Jsonclick ;
   private String divEntnalbar_cell_Internalname ;
   private String divEntnalbar_cell_Class ;
   private String edtavEntnalbar_Internalname ;
   private String AV7EntNAlbar ;
   private String edtavEntnalbar_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String divTablesplittedpedcod_Internalname ;
   private String lblTextblockpedcod_Internalname ;
   private String lblTextblockpedcod_Jsonclick ;
   private String edtavEntprvnum_Internalname ;
   private String edtavEntprvnum_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtavEntunient_Internalname ;
   private String edtavEntunient_Jsonclick ;
   private String divUnnamedtableentunirem_Internalname ;
   private String lblTextblockentunirem_Internalname ;
   private String lblTextblockentunirem_Jsonclick ;
   private String edtavEntunirem_Internalname ;
   private String edtavEntunirem_Jsonclick ;
   private String edtavEntpre_Internalname ;
   private String edtavEntpre_Jsonclick ;
   private String edtavEntlotn_Internalname ;
   private String AV12EntLotN ;
   private String edtavEntlotn_Jsonclick ;
   private String edtavEntfval_Internalname ;
   private String edtavEntfval_Jsonclick ;
   private String edtavEntobs_Internalname ;
   private String AV14EntObs ;
   private String edtavEntobs_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavPedcod_Internalname ;
   private String AV18Station ;
   private String AV16EmprNom ;
   private String AV19UsurCod ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String A11Albaran ;
   private String A5686EntLotN ;
   private String A12857EntNAlbar ;
   private String A10783EntObs ;
   private String GXt_char1 ;
   private String Gx_msg ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char10[] ;
   private String GXv_char11[] ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_btnconfirmar_Internalname ;
   private String Dvelop_confirmpanel_btnconfirmar_Internalname ;
   private String tblTablemergedpedcod_Internalname ;
   private String edtavPedcod_Jsonclick ;
   private String imgPromptpedido_gximage ;
   private String sImgUrl ;
   private String imgPromptpedido_Internalname ;
   private String imgPromptpedido_Jsonclick ;
   private java.util.Date AV22LastFec ;
   private java.util.Date AV5EntFecEnt ;
   private java.util.Date AV13EntFVal ;
   private java.util.Date A415EntFecEnt ;
   private java.util.Date A5685EntFVal ;
   private java.util.Date GXv_date5[] ;
   private java.util.Date GXv_date9[] ;
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
   private boolean n6156EntPrvNum ;
   private boolean n658PedCod ;
   private boolean Cond_result ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnconfirmar ;
   private IDataStoreProvider pr_default ;
   private short[] H011A2_A597LinEnt ;
   private String[] H011A2_A719PrdNum ;
   private String[] H011A2_A396EmprCod ;
   private String[] H011A2_A11Albaran ;
   private java.util.Date[] H011A2_A415EntFecEnt ;
   private java.util.Date[] H011A2_A5685EntFVal ;
   private String[] H011A2_A5686EntLotN ;
   private String[] H011A2_A12857EntNAlbar ;
   private String[] H011A2_A10783EntObs ;
   private java.math.BigDecimal[] H011A2_A417EntPre ;
   private int[] H011A2_A6156EntPrvNum ;
   private boolean[] H011A2_n6156EntPrvNum ;
   private java.math.BigDecimal[] H011A2_A418EntUniEnt ;
   private int[] H011A2_A658PedCod ;
   private boolean[] H011A2_n658PedCod ;
   private java.math.BigDecimal[] H011A2_A419EntUniRem ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class webupdtalmprx__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H011A2", "SELECT LinEnt, PrdNum, EmprCod, Albaran, EntFecEnt, EntFVal, EntLotN, EntNAlbar, EntObs, EntPre, EntPrvNum, EntUniEnt, PedCod, EntUniRem FROM TXPENTALM WHERE EmprCod = ? and PrdNum = ? and LinEnt = ? ORDER BY EmprCod, PrdNum, LinEnt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((String[]) buf[8])[0] = rslt.getString(9, 100);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,4);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

