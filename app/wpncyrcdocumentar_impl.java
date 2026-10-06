package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wpncyrcdocumentar_impl extends GXDataArea
{
   public wpncyrcdocumentar_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wpncyrcdocumentar_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wpncyrcdocumentar_impl.class ));
   }

   public wpncyrcdocumentar_impl( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavHisadesn = UIFactory.getCheckbox(this);
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
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               A539HisBarCod = (int)(GXutil.lval( httpContext.GetPar( "HisBarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A539HisBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A539HisBarCod), 8, 0));
               A545HisCodReo = (byte)(GXutil.lval( httpContext.GetPar( "HisCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A545HisCodReo", GXutil.str( A545HisCodReo, 1, 0));
               A544HisCodPar = httpContext.GetPar( "HisCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A544HisCodPar", A544HisCodPar);
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
      paDX2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startDX2( ) ;
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
      FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"true\"" : "") ;
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
      if ( nGXWrapped != 1 )
      {
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wpncyrcdocumentar", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A539HisBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A545HisCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A544HisCodPar))}, new String[] {"EmprCod","HisBarCod","HisCodReo","HisCodPar"}) +"\">") ;
         app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
         httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      }
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "HISBARCOD", GXutil.ltrim( localUtil.ntoc( A539HisBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISCODREO", GXutil.ltrim( localUtil.ntoc( A545HisCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISCODPAR", GXutil.rtrim( A544HisCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "HISMTSIMP", GXutil.ltrim( localUtil.ntoc( A13016HisMtsImp, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISMTSCARG", GXutil.ltrim( localUtil.ntoc( A13015HisMtsCarg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPRECARG", GXutil.ltrim( localUtil.ntoc( A13017HisPreCarg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Width", GXutil.rtrim( Dvpanel_pnl1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Autowidth", GXutil.booltostr( Dvpanel_pnl1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Autoheight", GXutil.booltostr( Dvpanel_pnl1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Cls", GXutil.rtrim( Dvpanel_pnl1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Title", GXutil.rtrim( Dvpanel_pnl1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Collapsible", GXutil.booltostr( Dvpanel_pnl1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Collapsed", GXutil.booltostr( Dvpanel_pnl1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Showcollapseicon", GXutil.booltostr( Dvpanel_pnl1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Iconposition", GXutil.rtrim( Dvpanel_pnl1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Autoscroll", GXutil.booltostr( Dvpanel_pnl1_Autoscroll));
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
      if ( nGXWrapped != 1 )
      {
         httpContext.writeTextNL( "</form>") ;
      }
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
         weDX2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtDX2( ) ;
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
      return formatLink("app.wpncyrcdocumentar", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A539HisBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A545HisCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A544HisCodPar))}, new String[] {"EmprCod","HisBarCod","HisCodReo","HisCodPar"})  ;
   }

   public String getPgmname( )
   {
      return "WPNcyRcDocumentar" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "WPNcy Rc Documentar", "") ;
   }

   public void wbDX0( )
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
         /* User Defined Control */
         ucDvpanel_pnl1.setProperty("Width", Dvpanel_pnl1_Width);
         ucDvpanel_pnl1.setProperty("AutoWidth", Dvpanel_pnl1_Autowidth);
         ucDvpanel_pnl1.setProperty("AutoHeight", Dvpanel_pnl1_Autoheight);
         ucDvpanel_pnl1.setProperty("Cls", Dvpanel_pnl1_Cls);
         ucDvpanel_pnl1.setProperty("Title", Dvpanel_pnl1_Title);
         ucDvpanel_pnl1.setProperty("Collapsible", Dvpanel_pnl1_Collapsible);
         ucDvpanel_pnl1.setProperty("Collapsed", Dvpanel_pnl1_Collapsed);
         ucDvpanel_pnl1.setProperty("ShowCollapseIcon", Dvpanel_pnl1_Showcollapseicon);
         ucDvpanel_pnl1.setProperty("IconPosition", Dvpanel_pnl1_Iconposition);
         ucDvpanel_pnl1.setProperty("AutoScroll", Dvpanel_pnl1_Autoscroll);
         ucDvpanel_pnl1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_pnl1_Internalname, "DVPANEL_PNL1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PNL1Container"+"pnl1"+"\" style=\"display:none;\">") ;
         wb_table1_14_DX2( true) ;
      }
      else
      {
         wb_table1_14_DX2( false) ;
      }
      return  ;
   }

   public void wb_table1_14_DX2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
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
         wb_table2_57_DX2( true) ;
      }
      else
      {
         wb_table2_57_DX2( false) ;
      }
      return  ;
   }

   public void wb_table2_57_DX2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         wb_table3_130_DX2( true) ;
      }
      else
      {
         wb_table3_130_DX2( false) ;
      }
      return  ;
   }

   public void wb_table3_130_DX2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
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

   public void startDX2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "WPNcy Rc Documentar", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupDX0( ) ;
   }

   public void wsDX2( )
   {
      startDX2( ) ;
      evtDX2( ) ;
   }

   public void evtDX2( )
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
                           e11DX2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e12DX2 ();
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

   public void weDX2( )
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

   public void paDX2( )
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
            GX_FocusControl = edtavHisacco_Internalname ;
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
      AV16HisAdeSN = ((GXutil.strcmp(GXutil.rtrim( AV16HisAdeSN), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16HisAdeSN", AV16HisAdeSN);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfDX2( ) ;
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
      edtavTipdefcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipdefcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipdefcod_Enabled), 5, 0), true);
      edtavCoddsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCoddsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCoddsc_Enabled), 5, 0), true);
      edtavRps_dsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRps_dsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRps_dsc_Enabled), 5, 0), true);
   }

   public void rfDX2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00DX2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A539HisBarCod), Byte.valueOf(A545HisCodReo), A544HisCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A5662HisAcCo = H00DX2_A5662HisAcCo[0] ;
            n5662HisAcCo = H00DX2_n5662HisAcCo[0] ;
            A5693HisAcCot = H00DX2_A5693HisAcCot[0] ;
            n5693HisAcCot = H00DX2_n5693HisAcCot[0] ;
            A5694HisAdEAcCo = H00DX2_A5694HisAdEAcCo[0] ;
            n5694HisAdEAcCo = H00DX2_n5694HisAdEAcCo[0] ;
            A5695HisAdEAcCt = H00DX2_A5695HisAdEAcCt[0] ;
            n5695HisAdEAcCt = H00DX2_n5695HisAdEAcCt[0] ;
            A6669HisAdeObs = H00DX2_A6669HisAdeObs[0] ;
            n6669HisAdeObs = H00DX2_n6669HisAdeObs[0] ;
            A833TipDefCod = H00DX2_A833TipDefCod[0] ;
            A834TipDefDsc = H00DX2_A834TipDefDsc[0] ;
            n834TipDefDsc = H00DX2_n834TipDefDsc[0] ;
            A5085CodCausa = H00DX2_A5085CodCausa[0] ;
            n5085CodCausa = H00DX2_n5085CodCausa[0] ;
            A5086DscCausa = H00DX2_A5086DscCausa[0] ;
            n5086DscCausa = H00DX2_n5086DscCausa[0] ;
            A12949HisOpecod = H00DX2_A12949HisOpecod[0] ;
            n12949HisOpecod = H00DX2_n12949HisOpecod[0] ;
            A12950HisOpeTur = H00DX2_A12950HisOpeTur[0] ;
            n12950HisOpeTur = H00DX2_n12950HisOpeTur[0] ;
            A7000Rps_Cod = H00DX2_A7000Rps_Cod[0] ;
            n7000Rps_Cod = H00DX2_n7000Rps_Cod[0] ;
            A7001Rps_Dsc = H00DX2_A7001Rps_Dsc[0] ;
            n7001Rps_Dsc = H00DX2_n7001Rps_Dsc[0] ;
            A602MaqCod = H00DX2_A602MaqCod[0] ;
            n602MaqCod = H00DX2_n602MaqCod[0] ;
            A5356Hisoperar = H00DX2_A5356Hisoperar[0] ;
            n5356Hisoperar = H00DX2_n5356Hisoperar[0] ;
            A13015HisMtsCarg = H00DX2_A13015HisMtsCarg[0] ;
            n13015HisMtsCarg = H00DX2_n13015HisMtsCarg[0] ;
            A13016HisMtsImp = H00DX2_A13016HisMtsImp[0] ;
            n13016HisMtsImp = H00DX2_n13016HisMtsImp[0] ;
            A834TipDefDsc = H00DX2_A834TipDefDsc[0] ;
            n834TipDefDsc = H00DX2_n834TipDefDsc[0] ;
            A5086DscCausa = H00DX2_A5086DscCausa[0] ;
            n5086DscCausa = H00DX2_n5086DscCausa[0] ;
            A7001Rps_Dsc = H00DX2_A7001Rps_Dsc[0] ;
            n7001Rps_Dsc = H00DX2_n7001Rps_Dsc[0] ;
            if ( A13015HisMtsCarg.doubleValue() > 0 )
            {
               A13017HisPreCarg = GXutil.roundDecimal( A13016HisMtsImp.divide(A13015HisMtsCarg, 18, java.math.RoundingMode.DOWN), 3) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13017HisPreCarg", GXutil.ltrimstr( A13017HisPreCarg, 13, 5));
            }
            else
            {
               if ( true )
               {
                  A13017HisPreCarg = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13017HisPreCarg", GXutil.ltrimstr( A13017HisPreCarg, 13, 5));
               }
               else
               {
                  A13017HisPreCarg = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13017HisPreCarg", GXutil.ltrimstr( A13017HisPreCarg, 13, 5));
               }
            }
            /* Execute user event: Load */
            e12DX2 ();
            pr_default.readNext(0);
         }
         pr_default.close(0);
         wbDX0( ) ;
      }
   }

   public void send_integrity_lvl_hashesDX2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavTipdefcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipdefcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipdefcod_Enabled), 5, 0), true);
      edtavCoddsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCoddsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCoddsc_Enabled), 5, 0), true);
      edtavRps_dsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRps_dsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRps_dsc_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strupDX0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11DX2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Dvpanel_pnl1_Width = httpContext.cgiGet( "DVPANEL_PNL1_Width") ;
         Dvpanel_pnl1_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL1_Autowidth")) ;
         Dvpanel_pnl1_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL1_Autoheight")) ;
         Dvpanel_pnl1_Cls = httpContext.cgiGet( "DVPANEL_PNL1_Cls") ;
         Dvpanel_pnl1_Title = httpContext.cgiGet( "DVPANEL_PNL1_Title") ;
         Dvpanel_pnl1_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL1_Collapsible")) ;
         Dvpanel_pnl1_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL1_Collapsed")) ;
         Dvpanel_pnl1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL1_Showcollapseicon")) ;
         Dvpanel_pnl1_Iconposition = httpContext.cgiGet( "DVPANEL_PNL1_Iconposition") ;
         Dvpanel_pnl1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL1_Autoscroll")) ;
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
         /* Read variables values. */
         AV11HisAcCo = httpContext.cgiGet( edtavHisacco_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11HisAcCo", AV11HisAcCo);
         AV12HisAcCot = httpContext.cgiGet( edtavHisaccot_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12HisAcCot", AV12HisAcCot);
         AV13HisAdEAcCo = httpContext.cgiGet( edtavHisadeacco_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13HisAdEAcCo", AV13HisAdEAcCo);
         AV14HisAdEAcCt = httpContext.cgiGet( edtavHisadeacct_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14HisAdEAcCt", AV14HisAdEAcCt);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTipdef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTipdef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIPDEF");
            GX_FocusControl = edtavTipdef_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV32TipDef = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TipDef", GXutil.str( AV32TipDef, 1, 0));
         }
         else
         {
            AV32TipDef = (byte)(localUtil.ctol( httpContext.cgiGet( edtavTipdef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TipDef", GXutil.str( AV32TipDef, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTipdefcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTipdefcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIPDEFCOD");
            GX_FocusControl = edtavTipdefcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV33TipDefCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TipDefCod), 4, 0));
         }
         else
         {
            AV33TipDefCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavTipdefcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TipDefCod), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCodcausa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCodcausa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCODCAUSA");
            GX_FocusControl = edtavCodcausa_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7CodCausa = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CodCausa), 4, 0));
         }
         else
         {
            AV7CodCausa = (short)(localUtil.ctol( httpContext.cgiGet( edtavCodcausa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CodCausa), 4, 0));
         }
         AV8CodDsc = httpContext.cgiGet( edtavCoddsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8CodDsc", AV8CodDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavRps_cod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavRps_cod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRPS_COD");
            GX_FocusControl = edtavRps_cod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV28Rps_Cod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Rps_Cod), 4, 0));
         }
         else
         {
            AV28Rps_Cod = (short)(localUtil.ctol( httpContext.cgiGet( edtavRps_cod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Rps_Cod), 4, 0));
         }
         AV29Rps_Dsc = httpContext.cgiGet( edtavRps_dsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Rps_Dsc", AV29Rps_Dsc);
         AV22MaqCod = httpContext.cgiGet( edtavMaqcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22MaqCod", AV22MaqCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavHisopecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavHisopecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHISOPECOD");
            GX_FocusControl = edtavHisopecod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV19HisOpecod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19HisOpecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19HisOpecod), 6, 0));
         }
         else
         {
            AV19HisOpecod = (int)(localUtil.ctol( httpContext.cgiGet( edtavHisopecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19HisOpecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19HisOpecod), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavHisopetur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavHisopetur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHISOPETUR");
            GX_FocusControl = edtavHisopetur_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV21Hisopetur = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21Hisopetur", GXutil.str( AV21Hisopetur, 1, 0));
         }
         else
         {
            AV21Hisopetur = (byte)(localUtil.ctol( httpContext.cgiGet( edtavHisopetur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21Hisopetur", GXutil.str( AV21Hisopetur, 1, 0));
         }
         AV16HisAdeSN = ((GXutil.strcmp(httpContext.cgiGet( chkavHisadesn.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16HisAdeSN", AV16HisAdeSN);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavHisoperar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavHisoperar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHISOPERAR");
            GX_FocusControl = edtavHisoperar_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV20Hisoperar = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20Hisoperar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20Hisoperar), 6, 0));
         }
         else
         {
            AV20Hisoperar = (int)(localUtil.ctol( httpContext.cgiGet( edtavHisoperar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20Hisoperar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20Hisoperar), 6, 0));
         }
         AV15HisAdeObs = httpContext.cgiGet( edtavHisadeobs_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15HisAdeObs", AV15HisAdeObs);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavHismtscargo_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavHismtscargo_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHISMTSCARGO");
            GX_FocusControl = edtavHismtscargo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17HisMtsCargo = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17HisMtsCargo", GXutil.ltrimstr( AV17HisMtsCargo, 9, 2));
         }
         else
         {
            AV17HisMtsCargo = localUtil.ctond( httpContext.cgiGet( edtavHismtscargo_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17HisMtsCargo", GXutil.ltrimstr( AV17HisMtsCargo, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavHismtsimp_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavHismtsimp_Internalname)), DecimalUtil.stringToDec("99999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHISMTSIMP");
            GX_FocusControl = edtavHismtsimp_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18HisMtsImp = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18HisMtsImp", GXutil.ltrimstr( AV18HisMtsImp, 14, 2));
         }
         else
         {
            AV18HisMtsImp = localUtil.ctond( httpContext.cgiGet( edtavHismtsimp_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18HisMtsImp", GXutil.ltrimstr( AV18HisMtsImp, 14, 2));
         }
         AV37TitPrecio = httpContext.cgiGet( edtavTitprecio_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37TitPrecio", AV37TitPrecio);
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
      e11DX2 ();
      if (returnInSub) return;
   }

   public void e11DX2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_int1 = AV5acabats ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "AC2013", ""), GXv_int2) ;
      wpncyrcdocumentar_impl.this.GXt_int1 = GXv_int2[0] ;
      AV5acabats = GXt_int1 ;
      GXt_int1 = AV6carvitin ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVIT", ""), GXv_int2) ;
      wpncyrcdocumentar_impl.this.GXt_int1 = GXv_int2[0] ;
      AV6carvitin = GXt_int1 ;
   }

   protected void nextLoad( )
   {
   }

   protected void e12DX2( )
   {
      /* Load Routine */
      returnInSub = false ;
      AV11HisAcCo = A5662HisAcCo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11HisAcCo", AV11HisAcCo);
      AV12HisAcCot = A5693HisAcCot ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12HisAcCot", AV12HisAcCot);
      AV13HisAdEAcCo = A5694HisAdEAcCo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13HisAdEAcCo", AV13HisAdEAcCo);
      AV14HisAdEAcCt = A5695HisAdEAcCt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14HisAdEAcCt", AV14HisAdEAcCt);
      AV15HisAdeObs = A6669HisAdeObs ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15HisAdeObs", AV15HisAdeObs);
      AV33TipDefCod = A833TipDefCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TipDefCod), 4, 0));
      AV34Tipdefcodold = A833TipDefCod ;
      AV35TipDefDsc = A834TipDefDsc ;
      AV7CodCausa = A5085CodCausa ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CodCausa), 4, 0));
      AV8CodDsc = A5086DscCausa ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8CodDsc", AV8CodDsc);
      AV19HisOpecod = A12949HisOpecod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19HisOpecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19HisOpecod), 6, 0));
      AV21Hisopetur = A12950HisOpeTur ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Hisopetur", GXutil.str( AV21Hisopetur, 1, 0));
      AV28Rps_Cod = A7000Rps_Cod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Rps_Cod), 4, 0));
      AV29Rps_Dsc = A7001Rps_Dsc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Rps_Dsc", AV29Rps_Dsc);
      AV22MaqCod = A602MaqCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22MaqCod", AV22MaqCod);
      AV20Hisoperar = A5356Hisoperar ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Hisoperar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20Hisoperar), 6, 0));
      AV27PrecioCargo = A13017HisPreCarg ;
      AV37TitPrecio = "(" + GXutil.str( AV27PrecioCargo, 7, 3) + httpContext.getMessage( " €/Mt)", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37TitPrecio", AV37TitPrecio);
      AV17HisMtsCargo = A13015HisMtsCarg ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17HisMtsCargo", GXutil.ltrimstr( AV17HisMtsCargo, 9, 2));
      AV18HisMtsImp = A13016HisMtsImp ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18HisMtsImp", GXutil.ltrimstr( AV18HisMtsImp, 14, 2));
   }

   public void wb_table3_130_DX2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable2_Internalname, tblUnnamedtable2_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisadeobs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisadeobs_Internalname, httpContext.getMessage( "Observaciones", ""), "gx-form-item AttributeLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavHisadeobs_Internalname, AV15HisAdeObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,137);\"", (short)(0), 1, edtavHisadeobs_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WPNcyRcDocumentar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavHismtscargo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHismtscargo_Internalname, httpContext.getMessage( "Metros Cargo", ""), "gx-form-item AttributeLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHismtscargo_Internalname, GXutil.ltrim( localUtil.ntoc( AV17HisMtsCargo, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavHismtscargo_Enabled!=0) ? localUtil.format( AV17HisMtsCargo, "ZZZZZ9.99") : localUtil.format( AV17HisMtsCargo, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHismtscargo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavHismtscargo_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WPNcyRcDocumentar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavHismtsimp_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHismtsimp_Internalname, httpContext.getMessage( "Importe Cargo", ""), "gx-form-item AttributeLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 145,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHismtsimp_Internalname, GXutil.ltrim( localUtil.ntoc( AV18HisMtsImp, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavHismtsimp_Enabled!=0) ? localUtil.format( AV18HisMtsImp, "ZZZZZZZZZZ9.99") : localUtil.format( AV18HisMtsImp, "ZZZZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,145);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHismtsimp_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavHismtsimp_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WPNcyRcDocumentar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavTitprecio_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTitprecio_Internalname, httpContext.getMessage( "Tit Precio", ""), "gx-form-item AttributeLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTitprecio_Internalname, GXutil.rtrim( AV37TitPrecio), GXutil.rtrim( localUtil.format( AV37TitPrecio, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTitprecio_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavTitprecio_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WPNcyRcDocumentar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_130_DX2e( true) ;
      }
      else
      {
         wb_table3_130_DX2e( false) ;
      }
   }

   public void wb_table2_57_DX2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable1_Internalname, tblUnnamedtable1_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavTipdef_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTipdef_Internalname, httpContext.getMessage( "Defecto", ""), "gx-form-item AttributeLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipdef_Internalname, GXutil.ltrim( localUtil.ntoc( AV32TipDef, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTipdef_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV32TipDef), "9") : localUtil.format( DecimalUtil.doubleToDec(AV32TipDef), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipdef_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavTipdef_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WPNcyRcDocumentar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavTipdefcod_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipdefcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV33TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTipdefcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV33TipDefCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV33TipDefCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,68);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipdefcod_Jsonclick, 0, "ReadonlyAttribute", "", "", "", "", 1, edtavTipdefcod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WPNcyRcDocumentar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavCodcausa_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCodcausa_Internalname, httpContext.getMessage( "Causa", ""), "gx-form-item AttributeLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCodcausa_Internalname, GXutil.ltrim( localUtil.ntoc( AV7CodCausa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCodcausa_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV7CodCausa), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV7CodCausa), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCodcausa_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavCodcausa_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WPNcyRcDocumentar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavCoddsc_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCoddsc_Internalname, GXutil.rtrim( AV8CodDsc), GXutil.rtrim( localUtil.format( AV8CodDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCoddsc_Jsonclick, 0, "ReadonlyAttribute", "", "", "", "", 1, edtavCoddsc_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WPNcyRcDocumentar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavRps_cod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRps_cod_Internalname, httpContext.getMessage( "Responsabilidad", ""), "gx-form-item AttributeLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRps_cod_Internalname, GXutil.ltrim( localUtil.ntoc( AV28Rps_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRps_cod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV28Rps_Cod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV28Rps_Cod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRps_cod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavRps_cod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WPNcyRcDocumentar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavRps_dsc_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRps_dsc_Internalname, GXutil.rtrim( AV29Rps_Dsc), GXutil.rtrim( localUtil.format( AV29Rps_Dsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,90);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRps_dsc_Jsonclick, 0, "ReadonlyAttribute", "", "", "", "", 1, edtavRps_dsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WPNcyRcDocumentar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqcod_Internalname, httpContext.getMessage( "Maquina", ""), "gx-form-item AttributeLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcod_Internalname, GXutil.rtrim( AV22MaqCod), GXutil.rtrim( localUtil.format( AV22MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavMaqcod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WPNcyRcDocumentar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisopecod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisopecod_Internalname, httpContext.getMessage( "Operario", ""), "gx-form-item AttributeLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisopecod_Internalname, GXutil.ltrim( localUtil.ntoc( AV19HisOpecod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavHisopecod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV19HisOpecod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV19HisOpecod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisopecod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavHisopecod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WPNcyRcDocumentar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisopetur_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisopetur_Internalname, httpContext.getMessage( "Turno", ""), "gx-form-item AttributeLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisopetur_Internalname, GXutil.ltrim( localUtil.ntoc( AV21Hisopetur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavHisopetur_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV21Hisopetur), "9") : localUtil.format( DecimalUtil.doubleToDec(AV21Hisopetur), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisopetur_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavHisopetur_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WPNcyRcDocumentar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+chkavHisadesn.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavHisadesn.getInternalname(), httpContext.getMessage( "Resultado Eficaz?", ""), "gx-form-item AttributeCheckBoxLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
         ClassString = "AttributeCheckBox" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavHisadesn.getInternalname(), AV16HisAdeSN, "", httpContext.getMessage( "Resultado Eficaz?", ""), 1, chkavHisadesn.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(118, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,118);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable11_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisoperar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisoperar_Internalname, httpContext.getMessage( "Responsable", ""), "gx-form-item AttributeLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisoperar_Internalname, GXutil.ltrim( localUtil.ntoc( AV20Hisoperar, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavHisoperar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV20Hisoperar), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV20Hisoperar), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,125);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisoperar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavHisoperar_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WPNcyRcDocumentar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_57_DX2e( true) ;
      }
      else
      {
         wb_table2_57_DX2e( false) ;
      }
   }

   public void wb_table1_14_DX2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblPnl1_Internalname, tblPnl1_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablehisacco_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockhisacco_Internalname, httpContext.getMessage( "Correccion a efectuar, Accion", ""), "", "", lblTextblockhisacco_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WPNcyRcDocumentar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisacco_Internalname, httpContext.getMessage( "Correccion a efectuar, Accion", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavHisacco_Internalname, AV11HisAcCo, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", (short)(0), 1, edtavHisacco_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "3276", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WPNcyRcDocumentar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablehisaccot_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockhisaccot_Internalname, httpContext.getMessage( "Acciones Correctivas", ""), "", "", lblTextblockhisaccot_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WPNcyRcDocumentar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisaccot_Internalname, httpContext.getMessage( "Acciones Correctivas", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavHisaccot_Internalname, AV12HisAcCot, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", (short)(0), 1, edtavHisaccot_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WPNcyRcDocumentar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable12_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablehisadeacco_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockhisadeacco_Internalname, httpContext.getMessage( "Acciones de correccion,Analisis", ""), "", "", lblTextblockhisadeacco_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WPNcyRcDocumentar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisadeacco_Internalname, httpContext.getMessage( "Acciones de correccion,Analisi", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavHisadeacco_Internalname, AV13HisAdEAcCo, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", (short)(0), 1, edtavHisadeacco_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WPNcyRcDocumentar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablehisadeacct_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockhisadeacct_Internalname, httpContext.getMessage( "Acciones correctivas,Analisis", ""), "", "", lblTextblockhisadeacct_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WPNcyRcDocumentar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisadeacct_Internalname, httpContext.getMessage( "Acciones correctivas,Analisis", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavHisadeacct_Internalname, AV14HisAdEAcCt, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,52);\"", (short)(0), 1, edtavHisadeacct_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WPNcyRcDocumentar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_14_DX2e( true) ;
      }
      else
      {
         wb_table1_14_DX2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A539HisBarCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "A539HisBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A539HisBarCod), 8, 0));
      A545HisCodReo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "A545HisCodReo", GXutil.str( A545HisCodReo, 1, 0));
      A544HisCodPar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "A544HisCodPar", A544HisCodPar);
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
      paDX2( ) ;
      wsDX2( ) ;
      weDX2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266101641537", true, true);
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
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("messages."+httpContext.getLanguageProperty( "code")+".js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
         httpContext.AddJavascriptSource("wpncyrcdocumentar.js", "?20266101641538", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTextblockhisacco_Internalname = "TEXTBLOCKHISACCO" ;
      edtavHisacco_Internalname = "vHISACCO" ;
      divUnnamedtablehisacco_Internalname = "UNNAMEDTABLEHISACCO" ;
      lblTextblockhisaccot_Internalname = "TEXTBLOCKHISACCOT" ;
      edtavHisaccot_Internalname = "vHISACCOT" ;
      divUnnamedtablehisaccot_Internalname = "UNNAMEDTABLEHISACCOT" ;
      divTable_Internalname = "TABLE" ;
      lblTextblockhisadeacco_Internalname = "TEXTBLOCKHISADEACCO" ;
      edtavHisadeacco_Internalname = "vHISADEACCO" ;
      divUnnamedtablehisadeacco_Internalname = "UNNAMEDTABLEHISADEACCO" ;
      lblTextblockhisadeacct_Internalname = "TEXTBLOCKHISADEACCT" ;
      edtavHisadeacct_Internalname = "vHISADEACCT" ;
      divUnnamedtablehisadeacct_Internalname = "UNNAMEDTABLEHISADEACCT" ;
      divUnnamedtable12_Internalname = "UNNAMEDTABLE12" ;
      tblPnl1_Internalname = "PNL1" ;
      Dvpanel_pnl1_Internalname = "DVPANEL_PNL1" ;
      edtavTipdef_Internalname = "vTIPDEF" ;
      edtavTipdefcod_Internalname = "vTIPDEFCOD" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavCodcausa_Internalname = "vCODCAUSA" ;
      edtavCoddsc_Internalname = "vCODDSC" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtavRps_cod_Internalname = "vRPS_COD" ;
      edtavRps_dsc_Internalname = "vRPS_DSC" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      edtavMaqcod_Internalname = "vMAQCOD" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      edtavHisopecod_Internalname = "vHISOPECOD" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      edtavHisopetur_Internalname = "vHISOPETUR" ;
      divUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      chkavHisadesn.setInternalname( "vHISADESN" );
      divUnnamedtable10_Internalname = "UNNAMEDTABLE10" ;
      edtavHisoperar_Internalname = "vHISOPERAR" ;
      divUnnamedtable11_Internalname = "UNNAMEDTABLE11" ;
      tblUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtavHisadeobs_Internalname = "vHISADEOBS" ;
      edtavHismtscargo_Internalname = "vHISMTSCARGO" ;
      edtavHismtsimp_Internalname = "vHISMTSIMP" ;
      edtavTitprecio_Internalname = "vTITPRECIO" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      tblUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
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
      edtavHisadeacct_Enabled = 1 ;
      edtavHisadeacco_Enabled = 1 ;
      edtavHisaccot_Enabled = 1 ;
      edtavHisacco_Enabled = 1 ;
      edtavHisoperar_Jsonclick = "" ;
      edtavHisoperar_Enabled = 1 ;
      chkavHisadesn.setEnabled( 1 );
      edtavHisopetur_Jsonclick = "" ;
      edtavHisopetur_Enabled = 1 ;
      edtavHisopecod_Jsonclick = "" ;
      edtavHisopecod_Enabled = 1 ;
      edtavMaqcod_Jsonclick = "" ;
      edtavMaqcod_Enabled = 1 ;
      edtavRps_dsc_Jsonclick = "" ;
      edtavRps_dsc_Enabled = 1 ;
      edtavRps_cod_Jsonclick = "" ;
      edtavRps_cod_Enabled = 1 ;
      edtavCoddsc_Jsonclick = "" ;
      edtavCoddsc_Enabled = 1 ;
      edtavCodcausa_Jsonclick = "" ;
      edtavCodcausa_Enabled = 1 ;
      edtavTipdefcod_Jsonclick = "" ;
      edtavTipdefcod_Enabled = 1 ;
      edtavTipdef_Jsonclick = "" ;
      edtavTipdef_Enabled = 1 ;
      edtavTitprecio_Jsonclick = "" ;
      edtavTitprecio_Enabled = 1 ;
      edtavHismtsimp_Jsonclick = "" ;
      edtavHismtsimp_Enabled = 1 ;
      edtavHismtscargo_Jsonclick = "" ;
      edtavHismtscargo_Enabled = 1 ;
      edtavHisadeobs_Enabled = 1 ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = "" ;
      Dvpanel_unnamedtable2_Cls = "PanelWithBorder_BaseColor" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelWithBorder_BaseColor" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Dvpanel_pnl1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_pnl1_Iconposition = "Right" ;
      Dvpanel_pnl1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_pnl1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_pnl1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_pnl1_Title = httpContext.getMessage( "Acciones/Analisis", "") ;
      Dvpanel_pnl1_Cls = "PanelWithBorder_BaseColor" ;
      Dvpanel_pnl1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_pnl1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_pnl1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "WPNcy Rc Documentar", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      chkavHisadesn.setName( "vHISADESN" );
      chkavHisadesn.setWebtags( "" );
      chkavHisadesn.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavHisadesn.getInternalname(), "TitleCaption", chkavHisadesn.getCaption(), true);
      chkavHisadesn.setCheckedValue( "N" );
      AV16HisAdeSN = ((GXutil.strcmp(GXutil.rtrim( AV16HisAdeSN), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16HisAdeSN", AV16HisAdeSN);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A539HisBarCod',fld:'HISBARCOD',pic:'ZZZZZZZ9'},{av:'A545HisCodReo',fld:'HISCODREO',pic:'9'},{av:'A544HisCodPar',fld:'HISCODPAR',pic:''},{av:'AV16HisAdeSN',fld:'vHISADESN',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALIDV_HISADESN","{handler:'validv_Hisadesn',iparms:[]");
      setEventMetadata("VALIDV_HISADESN",",oparms:[]}");
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
      wcpOA544HisCodPar = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A544HisCodPar = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      A13016HisMtsImp = DecimalUtil.ZERO ;
      A13015HisMtsCarg = DecimalUtil.ZERO ;
      A13017HisPreCarg = DecimalUtil.ZERO ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_pnl1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV16HisAdeSN = "" ;
      scmdbuf = "" ;
      H00DX2_A396EmprCod = new String[] {""} ;
      H00DX2_A539HisBarCod = new int[1] ;
      H00DX2_A545HisCodReo = new byte[1] ;
      H00DX2_A544HisCodPar = new String[] {""} ;
      H00DX2_A5662HisAcCo = new String[] {""} ;
      H00DX2_n5662HisAcCo = new boolean[] {false} ;
      H00DX2_A5693HisAcCot = new String[] {""} ;
      H00DX2_n5693HisAcCot = new boolean[] {false} ;
      H00DX2_A5694HisAdEAcCo = new String[] {""} ;
      H00DX2_n5694HisAdEAcCo = new boolean[] {false} ;
      H00DX2_A5695HisAdEAcCt = new String[] {""} ;
      H00DX2_n5695HisAdEAcCt = new boolean[] {false} ;
      H00DX2_A6669HisAdeObs = new String[] {""} ;
      H00DX2_n6669HisAdeObs = new boolean[] {false} ;
      H00DX2_A833TipDefCod = new short[1] ;
      H00DX2_A834TipDefDsc = new String[] {""} ;
      H00DX2_n834TipDefDsc = new boolean[] {false} ;
      H00DX2_A5085CodCausa = new short[1] ;
      H00DX2_n5085CodCausa = new boolean[] {false} ;
      H00DX2_A5086DscCausa = new String[] {""} ;
      H00DX2_n5086DscCausa = new boolean[] {false} ;
      H00DX2_A12949HisOpecod = new int[1] ;
      H00DX2_n12949HisOpecod = new boolean[] {false} ;
      H00DX2_A12950HisOpeTur = new byte[1] ;
      H00DX2_n12950HisOpeTur = new boolean[] {false} ;
      H00DX2_A7000Rps_Cod = new short[1] ;
      H00DX2_n7000Rps_Cod = new boolean[] {false} ;
      H00DX2_A7001Rps_Dsc = new String[] {""} ;
      H00DX2_n7001Rps_Dsc = new boolean[] {false} ;
      H00DX2_A602MaqCod = new String[] {""} ;
      H00DX2_n602MaqCod = new boolean[] {false} ;
      H00DX2_A5356Hisoperar = new int[1] ;
      H00DX2_n5356Hisoperar = new boolean[] {false} ;
      H00DX2_A13015HisMtsCarg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00DX2_n13015HisMtsCarg = new boolean[] {false} ;
      H00DX2_A13016HisMtsImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00DX2_n13016HisMtsImp = new boolean[] {false} ;
      A5662HisAcCo = "" ;
      A5693HisAcCot = "" ;
      A5694HisAdEAcCo = "" ;
      A5695HisAdEAcCt = "" ;
      A6669HisAdeObs = "" ;
      A834TipDefDsc = "" ;
      A5086DscCausa = "" ;
      A7001Rps_Dsc = "" ;
      A602MaqCod = "" ;
      AV11HisAcCo = "" ;
      AV12HisAcCot = "" ;
      AV13HisAdEAcCo = "" ;
      AV14HisAdEAcCt = "" ;
      AV8CodDsc = "" ;
      AV29Rps_Dsc = "" ;
      AV22MaqCod = "" ;
      AV15HisAdeObs = "" ;
      AV17HisMtsCargo = DecimalUtil.ZERO ;
      AV18HisMtsImp = DecimalUtil.ZERO ;
      AV37TitPrecio = "" ;
      GXv_int2 = new byte[1] ;
      AV35TipDefDsc = "" ;
      AV27PrecioCargo = DecimalUtil.ZERO ;
      sStyleString = "" ;
      TempTags = "" ;
      lblTextblockhisacco_Jsonclick = "" ;
      lblTextblockhisaccot_Jsonclick = "" ;
      lblTextblockhisadeacco_Jsonclick = "" ;
      lblTextblockhisadeacct_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wpncyrcdocumentar__default(),
         new Object[] {
             new Object[] {
            H00DX2_A396EmprCod, H00DX2_A539HisBarCod, H00DX2_A545HisCodReo, H00DX2_A544HisCodPar, H00DX2_A5662HisAcCo, H00DX2_n5662HisAcCo, H00DX2_A5693HisAcCot, H00DX2_n5693HisAcCot, H00DX2_A5694HisAdEAcCo, H00DX2_n5694HisAdEAcCo,
            H00DX2_A5695HisAdEAcCt, H00DX2_n5695HisAdEAcCt, H00DX2_A6669HisAdeObs, H00DX2_n6669HisAdeObs, H00DX2_A833TipDefCod, H00DX2_A834TipDefDsc, H00DX2_n834TipDefDsc, H00DX2_A5085CodCausa, H00DX2_n5085CodCausa, H00DX2_A5086DscCausa,
            H00DX2_n5086DscCausa, H00DX2_A12949HisOpecod, H00DX2_n12949HisOpecod, H00DX2_A12950HisOpeTur, H00DX2_n12950HisOpeTur, H00DX2_A7000Rps_Cod, H00DX2_n7000Rps_Cod, H00DX2_A7001Rps_Dsc, H00DX2_n7001Rps_Dsc, H00DX2_A602MaqCod,
            H00DX2_n602MaqCod, H00DX2_A5356Hisoperar, H00DX2_n5356Hisoperar, H00DX2_A13015HisMtsCarg, H00DX2_n13015HisMtsCarg, H00DX2_A13016HisMtsImp, H00DX2_n13016HisMtsImp
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavTipdefcod_Enabled = 0 ;
      edtavCoddsc_Enabled = 0 ;
      edtavRps_dsc_Enabled = 0 ;
   }

   private byte wcpOA545HisCodReo ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte A545HisCodReo ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte nDonePA ;
   private byte A12950HisOpeTur ;
   private byte AV32TipDef ;
   private byte AV21Hisopetur ;
   private byte AV5acabats ;
   private byte AV6carvitin ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A833TipDefCod ;
   private short A5085CodCausa ;
   private short A7000Rps_Cod ;
   private short AV33TipDefCod ;
   private short AV7CodCausa ;
   private short AV28Rps_Cod ;
   private short AV34Tipdefcodold ;
   private int wcpOA539HisBarCod ;
   private int A539HisBarCod ;
   private int edtavTipdefcod_Enabled ;
   private int edtavCoddsc_Enabled ;
   private int edtavRps_dsc_Enabled ;
   private int A12949HisOpecod ;
   private int A5356Hisoperar ;
   private int AV19HisOpecod ;
   private int AV20Hisoperar ;
   private int edtavHisadeobs_Enabled ;
   private int edtavHismtscargo_Enabled ;
   private int edtavHismtsimp_Enabled ;
   private int edtavTitprecio_Enabled ;
   private int edtavTipdef_Enabled ;
   private int edtavCodcausa_Enabled ;
   private int edtavRps_cod_Enabled ;
   private int edtavMaqcod_Enabled ;
   private int edtavHisopecod_Enabled ;
   private int edtavHisopetur_Enabled ;
   private int edtavHisoperar_Enabled ;
   private int edtavHisacco_Enabled ;
   private int edtavHisaccot_Enabled ;
   private int edtavHisadeacco_Enabled ;
   private int edtavHisadeacct_Enabled ;
   private int idxLst ;
   private java.math.BigDecimal A13016HisMtsImp ;
   private java.math.BigDecimal A13015HisMtsCarg ;
   private java.math.BigDecimal A13017HisPreCarg ;
   private java.math.BigDecimal AV17HisMtsCargo ;
   private java.math.BigDecimal AV18HisMtsImp ;
   private java.math.BigDecimal AV27PrecioCargo ;
   private String wcpOA396EmprCod ;
   private String wcpOA544HisCodPar ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A544HisCodPar ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_pnl1_Width ;
   private String Dvpanel_pnl1_Cls ;
   private String Dvpanel_pnl1_Title ;
   private String Dvpanel_pnl1_Iconposition ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
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
   private String Dvpanel_pnl1_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavHisacco_Internalname ;
   private String AV16HisAdeSN ;
   private String edtavTipdefcod_Internalname ;
   private String edtavCoddsc_Internalname ;
   private String edtavRps_dsc_Internalname ;
   private String scmdbuf ;
   private String A834TipDefDsc ;
   private String A5086DscCausa ;
   private String A7001Rps_Dsc ;
   private String A602MaqCod ;
   private String edtavHisaccot_Internalname ;
   private String edtavHisadeacco_Internalname ;
   private String edtavHisadeacct_Internalname ;
   private String edtavTipdef_Internalname ;
   private String edtavCodcausa_Internalname ;
   private String AV8CodDsc ;
   private String edtavRps_cod_Internalname ;
   private String AV29Rps_Dsc ;
   private String AV22MaqCod ;
   private String edtavMaqcod_Internalname ;
   private String edtavHisopecod_Internalname ;
   private String edtavHisopetur_Internalname ;
   private String edtavHisoperar_Internalname ;
   private String edtavHisadeobs_Internalname ;
   private String edtavHismtscargo_Internalname ;
   private String edtavHismtsimp_Internalname ;
   private String AV37TitPrecio ;
   private String edtavTitprecio_Internalname ;
   private String AV35TipDefDsc ;
   private String sStyleString ;
   private String tblUnnamedtable2_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String TempTags ;
   private String edtavHismtscargo_Jsonclick ;
   private String edtavHismtsimp_Jsonclick ;
   private String edtavTitprecio_Jsonclick ;
   private String tblUnnamedtable1_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavTipdef_Jsonclick ;
   private String edtavTipdefcod_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtavCodcausa_Jsonclick ;
   private String edtavCoddsc_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String edtavRps_cod_Jsonclick ;
   private String edtavRps_dsc_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String edtavMaqcod_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String edtavHisopecod_Jsonclick ;
   private String divUnnamedtable9_Internalname ;
   private String edtavHisopetur_Jsonclick ;
   private String divUnnamedtable10_Internalname ;
   private String divUnnamedtable11_Internalname ;
   private String edtavHisoperar_Jsonclick ;
   private String tblPnl1_Internalname ;
   private String divTable_Internalname ;
   private String divUnnamedtablehisacco_Internalname ;
   private String lblTextblockhisacco_Internalname ;
   private String lblTextblockhisacco_Jsonclick ;
   private String divUnnamedtablehisaccot_Internalname ;
   private String lblTextblockhisaccot_Internalname ;
   private String lblTextblockhisaccot_Jsonclick ;
   private String divUnnamedtable12_Internalname ;
   private String divUnnamedtablehisadeacco_Internalname ;
   private String lblTextblockhisadeacco_Internalname ;
   private String lblTextblockhisadeacco_Jsonclick ;
   private String divUnnamedtablehisadeacct_Internalname ;
   private String lblTextblockhisadeacct_Internalname ;
   private String lblTextblockhisadeacct_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_pnl1_Autowidth ;
   private boolean Dvpanel_pnl1_Autoheight ;
   private boolean Dvpanel_pnl1_Collapsible ;
   private boolean Dvpanel_pnl1_Collapsed ;
   private boolean Dvpanel_pnl1_Showcollapseicon ;
   private boolean Dvpanel_pnl1_Autoscroll ;
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
   private boolean n5662HisAcCo ;
   private boolean n5693HisAcCot ;
   private boolean n5694HisAdEAcCo ;
   private boolean n5695HisAdEAcCt ;
   private boolean n6669HisAdeObs ;
   private boolean n834TipDefDsc ;
   private boolean n5085CodCausa ;
   private boolean n5086DscCausa ;
   private boolean n12949HisOpecod ;
   private boolean n12950HisOpeTur ;
   private boolean n7000Rps_Cod ;
   private boolean n7001Rps_Dsc ;
   private boolean n602MaqCod ;
   private boolean n5356Hisoperar ;
   private boolean n13015HisMtsCarg ;
   private boolean n13016HisMtsImp ;
   private boolean returnInSub ;
   private String A5662HisAcCo ;
   private String A5693HisAcCot ;
   private String A5694HisAdEAcCo ;
   private String A5695HisAdEAcCt ;
   private String A6669HisAdeObs ;
   private String AV11HisAcCo ;
   private String AV12HisAcCot ;
   private String AV13HisAdEAcCo ;
   private String AV14HisAdEAcCt ;
   private String AV15HisAdeObs ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_pnl1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private ICheckbox chkavHisadesn ;
   private IDataStoreProvider pr_default ;
   private String[] H00DX2_A396EmprCod ;
   private int[] H00DX2_A539HisBarCod ;
   private byte[] H00DX2_A545HisCodReo ;
   private String[] H00DX2_A544HisCodPar ;
   private String[] H00DX2_A5662HisAcCo ;
   private boolean[] H00DX2_n5662HisAcCo ;
   private String[] H00DX2_A5693HisAcCot ;
   private boolean[] H00DX2_n5693HisAcCot ;
   private String[] H00DX2_A5694HisAdEAcCo ;
   private boolean[] H00DX2_n5694HisAdEAcCo ;
   private String[] H00DX2_A5695HisAdEAcCt ;
   private boolean[] H00DX2_n5695HisAdEAcCt ;
   private String[] H00DX2_A6669HisAdeObs ;
   private boolean[] H00DX2_n6669HisAdeObs ;
   private short[] H00DX2_A833TipDefCod ;
   private String[] H00DX2_A834TipDefDsc ;
   private boolean[] H00DX2_n834TipDefDsc ;
   private short[] H00DX2_A5085CodCausa ;
   private boolean[] H00DX2_n5085CodCausa ;
   private String[] H00DX2_A5086DscCausa ;
   private boolean[] H00DX2_n5086DscCausa ;
   private int[] H00DX2_A12949HisOpecod ;
   private boolean[] H00DX2_n12949HisOpecod ;
   private byte[] H00DX2_A12950HisOpeTur ;
   private boolean[] H00DX2_n12950HisOpeTur ;
   private short[] H00DX2_A7000Rps_Cod ;
   private boolean[] H00DX2_n7000Rps_Cod ;
   private String[] H00DX2_A7001Rps_Dsc ;
   private boolean[] H00DX2_n7001Rps_Dsc ;
   private String[] H00DX2_A602MaqCod ;
   private boolean[] H00DX2_n602MaqCod ;
   private int[] H00DX2_A5356Hisoperar ;
   private boolean[] H00DX2_n5356Hisoperar ;
   private java.math.BigDecimal[] H00DX2_A13015HisMtsCarg ;
   private boolean[] H00DX2_n13015HisMtsCarg ;
   private java.math.BigDecimal[] H00DX2_A13016HisMtsImp ;
   private boolean[] H00DX2_n13016HisMtsImp ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class wpncyrcdocumentar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00DX2", "SELECT T1.EmprCod, T1.HisBarCod, T1.HisCodReo, T1.HisCodPar, T1.HisAcCo, T1.HisAcCot, T1.HisAdEAcCo, T1.HisAdEAcCt, T1.HisAdeObs, T1.TipDefCod, T2.TipDefDsc, T1.CodCausa, T3.DscCausa, T1.HisOpecod, T1.HisOpeTur, T1.Rps_Cod, T4.Rps_Dsc, T1.MaqCod, T1.Hisoperar, T1.HisMtsCarg, T1.HisMtsImp FROM (((TXPHISREO T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) LEFT JOIN TXPTIPCAU T3 ON T3.EmprCod = T1.EmprCod AND T3.CodCausa = T1.CodCausa) LEFT JOIN TXPCODRPS T4 ON T4.EmprCod = T1.EmprCod AND T4.Rps_Cod = T1.Rps_Cod) WHERE T1.EmprCod = ? and T1.HisBarCod = ? and T1.HisCodReo = ? and T1.HisCodPar = ? ORDER BY T1.EmprCod, T1.HisBarCod, T1.HisCodReo, T1.HisCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((String[]) buf[15])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 60);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(17, 40);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(18, 6);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(19);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

