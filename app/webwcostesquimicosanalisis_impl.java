package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwcostesquimicosanalisis_impl extends GXDataArea
{
   public webwcostesquimicosanalisis_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwcostesquimicosanalisis_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwcostesquimicosanalisis_impl.class ));
   }

   public webwcostesquimicosanalisis_impl( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavHreracab = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetNextPar( ) ;
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
            gxfirstwebparm = httpContext.GetNextPar( ) ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetNextPar( ) ;
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
      paT72( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startT72( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webwcostesquimicosanalisis", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV98Maqcod2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCALCULO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV20Calculo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11Barcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13Barcodreo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Barcodpar, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD2", GXutil.rtrim( AV98Maqcod2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV98Maqcod2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCALCULO", GXutil.ltrim( localUtil.ntoc( AV20Calculo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCALCULO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV20Calculo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV11Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11Barcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV13Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13Barcodreo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV12Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Barcodpar, ""))));
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
      httpContext.writeTextNL( "</form>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      include_jscripts( ) ;
      if ( ! ( WebComp_Wcwcwanalisiscostesquimicoss == null ) )
      {
         WebComp_Wcwcwanalisiscostesquimicoss.componentjscripts();
      }
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
         weT72( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtT72( ) ;
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
      return formatLink("app.webwcostesquimicosanalisis", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WebWCostesQuimicosAnalisis" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Costes Quimicos Analisis", "") ;
   }

   public void wbT70( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavHreracab.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavHreracab.getInternalname(), httpContext.getMessage( "Receta", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavHreracab, cmbavHreracab.getInternalname(), GXutil.rtrim( AV66HreRacab), 1, cmbavHreracab.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavHreracab.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,22);\"", "", true, (byte)(0), "HLP_WebWCostesQuimicosAnalisis.htm");
         cmbavHreracab.setValue( GXutil.rtrim( AV66HreRacab) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavHreracab.getInternalname(), "Values", cmbavHreracab.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedfec1_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockfec1_Internalname, httpContext.getMessage( "Periodo", ""), "", "", lblTextblockfec1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWCostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
         wb_table1_30_T72( true) ;
      }
      else
      {
         wb_table1_30_T72( false) ;
      }
      return  ;
   }

   public void wb_table1_30_T72e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicod1_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockclicod1_Internalname, httpContext.getMessage( "Clientes", ""), "", "", lblTextblockclicod1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWCostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
         wb_table2_46_T72( true) ;
      }
      else
      {
         wb_table2_46_T72( false) ;
      }
      return  ;
   }

   public void wb_table2_46_T72e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedartcod1_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockartcod1_Internalname, httpContext.getMessage( "Articulos", ""), "", "", lblTextblockartcod1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWCostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
         wb_table3_62_T72( true) ;
      }
      else
      {
         wb_table3_62_T72( false) ;
      }
      return  ;
   }

   public void wb_table3_62_T72e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedbarcolnom1_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarcolnom1_Internalname, httpContext.getMessage( "Colores", ""), "", "", lblTextblockbarcolnom1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWCostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
         wb_table4_78_T72( true) ;
      }
      else
      {
         wb_table4_78_T72( false) ;
      }
      return  ;
   }

   public void wb_table4_78_T72e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedtipcolcod1_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocktipcolcod1_Internalname, httpContext.getMessage( "Tc", ""), "", "", lblTextblocktipcolcod1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWCostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
         wb_table5_102_T72( true) ;
      }
      else
      {
         wb_table5_102_T72( false) ;
      }
      return  ;
   }

   public void wb_table5_102_T72e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedintcod1_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockintcod1_Internalname, httpContext.getMessage( "Intensidades", ""), "", "", lblTextblockintcod1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWCostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
         wb_table6_118_T72( true) ;
      }
      else
      {
         wb_table6_118_T72( false) ;
      }
      return  ;
   }

   public void wb_table6_118_T72e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedtipartcod1_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocktipartcod1_Internalname, httpContext.getMessage( "Tipos Artículos", ""), "", "", lblTextblocktipartcod1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWCostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
         wb_table7_134_T72( true) ;
      }
      else
      {
         wb_table7_134_T72( false) ;
      }
      return  ;
   }

   public void wb_table7_134_T72e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0150"+"", GXutil.rtrim( WebComp_Wcwcwanalisiscostesquimicoss_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0150"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcwanalisiscostesquimicoss_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcwanalisiscostesquimicoss), GXutil.lower( WebComp_Wcwcwanalisiscostesquimicoss_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0150"+"");
               }
               WebComp_Wcwcwanalisiscostesquimicoss.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcwanalisiscostesquimicoss), GXutil.lower( WebComp_Wcwcwanalisiscostesquimicoss_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
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

   public void startT72( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Costes Quimicos Analisis", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupT70( ) ;
   }

   public void wsT72( )
   {
      startT72( ) ;
      evtT72( ) ;
   }

   public void evtT72( )
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
                           e11T72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Refresh */
                           e12T72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VHRERACAB.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13T72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VFEC1.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14T72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VFEC2.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15T72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCLICOD1.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e16T72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCLICOD2.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e17T72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VARTCOD1.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e18T72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VARTCOD2.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e19T72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARCOLNOM1.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e20T72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARCOLNOM2.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e21T72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARCOLNUM1.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e22T72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARCOLNUM2.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e23T72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VTIPCOLCOD1.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e24T72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VTIPCOLCOD2.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e25T72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VINTCOD1.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e26T72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VINTCOD2.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e27T72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VTIPARTCOD1.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e28T72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VTIPARTCOD2.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e29T72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e30T72 ();
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
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 150 )
                     {
                        OldWcwcwanalisiscostesquimicoss = httpContext.cgiGet( "W0150") ;
                        if ( ( GXutil.len( OldWcwcwanalisiscostesquimicoss) == 0 ) || ( GXutil.strcmp(OldWcwcwanalisiscostesquimicoss, WebComp_Wcwcwanalisiscostesquimicoss_Component) != 0 ) )
                        {
                           WebComp_Wcwcwanalisiscostesquimicoss = WebUtils.getWebComponent(getClass(), "app." + OldWcwcwanalisiscostesquimicoss + "_impl", remoteHandle, context);
                           WebComp_Wcwcwanalisiscostesquimicoss_Component = OldWcwcwanalisiscostesquimicoss ;
                        }
                        if ( GXutil.len( WebComp_Wcwcwanalisiscostesquimicoss_Component) != 0 )
                        {
                           WebComp_Wcwcwanalisiscostesquimicoss.componentprocess("W0150", "", sEvt);
                        }
                        WebComp_Wcwcwanalisiscostesquimicoss_Component = OldWcwcwanalisiscostesquimicoss ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void weT72( )
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

   public void paT72( )
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
            GX_FocusControl = cmbavHreracab.getInternalname() ;
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
      if ( cmbavHreracab.getItemCount() > 0 )
      {
         AV66HreRacab = cmbavHreracab.getValidValue(AV66HreRacab) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66HreRacab", AV66HreRacab);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavHreracab.setValue( GXutil.rtrim( AV66HreRacab) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavHreracab.getInternalname(), "Values", cmbavHreracab.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfT72( ) ;
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

   public void rfT72( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e12T72 ();
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcwanalisiscostesquimicoss_Component) != 0 )
            {
               WebComp_Wcwcwanalisiscostesquimicoss.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00T72 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            /* Execute user event: Load */
            e30T72 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wbT70( ) ;
      }
   }

   public void send_integrity_lvl_hashesT72( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD2", GXutil.rtrim( AV98Maqcod2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV98Maqcod2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCALCULO", GXutil.ltrim( localUtil.ntoc( AV20Calculo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCALCULO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV20Calculo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV11Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11Barcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV13Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13Barcodreo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV12Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Barcodpar, ""))));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupT70( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11T72 ();
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
         /* Read variables values. */
         cmbavHreracab.setValue( httpContext.cgiGet( cmbavHreracab.getInternalname()) );
         AV66HreRacab = httpContext.cgiGet( cmbavHreracab.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66HreRacab", AV66HreRacab);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFec1_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFEC1");
            GX_FocusControl = edtavFec1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV41Fec1 = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41Fec1", localUtil.format(AV41Fec1, "99/99/99"));
         }
         else
         {
            AV41Fec1 = localUtil.ctod( httpContext.cgiGet( edtavFec1_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41Fec1", localUtil.format(AV41Fec1, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFec2_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFEC2");
            GX_FocusControl = edtavFec2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV42Fec2 = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42Fec2", localUtil.format(AV42Fec2, "99/99/99"));
         }
         else
         {
            AV42Fec2 = localUtil.ctod( httpContext.cgiGet( edtavFec2_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42Fec2", localUtil.format(AV42Fec2, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD1");
            GX_FocusControl = edtavClicod1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV23Clicod1 = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23Clicod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Clicod1), 6, 0));
         }
         else
         {
            AV23Clicod1 = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23Clicod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Clicod1), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD2");
            GX_FocusControl = edtavClicod2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV24Clicod2 = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24Clicod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24Clicod2), 6, 0));
         }
         else
         {
            AV24Clicod2 = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24Clicod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24Clicod2), 6, 0));
         }
         AV6ARtcod1 = httpContext.cgiGet( edtavArtcod1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6ARtcod1", AV6ARtcod1);
         AV7Artcod2 = httpContext.cgiGet( edtavArtcod2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7Artcod2", AV7Artcod2);
         AV14Barcolnom1 = httpContext.cgiGet( edtavBarcolnom1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Barcolnom1", AV14Barcolnom1);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUM1");
            GX_FocusControl = edtavBarcolnum1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17Barcolnum1 = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Barcolnum1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Barcolnum1), 6, 0));
         }
         else
         {
            AV17Barcolnum1 = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Barcolnum1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Barcolnum1), 6, 0));
         }
         AV15barcolnom2 = httpContext.cgiGet( edtavBarcolnom2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15barcolnom2", AV15barcolnom2);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUM2");
            GX_FocusControl = edtavBarcolnum2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18Barcolnum2 = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Barcolnum2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Barcolnum2), 6, 0));
         }
         else
         {
            AV18Barcolnum2 = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Barcolnum2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Barcolnum2), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTipcolcod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTipcolcod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIPCOLCOD1");
            GX_FocusControl = edtavTipcolcod1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV116Tipcolcod1 = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV116Tipcolcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116Tipcolcod1), 2, 0));
         }
         else
         {
            AV116Tipcolcod1 = (byte)(localUtil.ctol( httpContext.cgiGet( edtavTipcolcod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV116Tipcolcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116Tipcolcod1), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTipcolcod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTipcolcod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIPCOLCOD2");
            GX_FocusControl = edtavTipcolcod2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV117TipColcod2 = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV117TipColcod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV117TipColcod2), 2, 0));
         }
         else
         {
            AV117TipColcod2 = (byte)(localUtil.ctol( httpContext.cgiGet( edtavTipcolcod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV117TipColcod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV117TipColcod2), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavIntcod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavIntcod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINTCOD1");
            GX_FocusControl = edtavIntcod1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV72Intcod1 = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72Intcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72Intcod1), 2, 0));
         }
         else
         {
            AV72Intcod1 = (byte)(localUtil.ctol( httpContext.cgiGet( edtavIntcod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72Intcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72Intcod1), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavIntcod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavIntcod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINTCOD2");
            GX_FocusControl = edtavIntcod2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV73Intcod2 = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73Intcod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73Intcod2), 2, 0));
         }
         else
         {
            AV73Intcod2 = (byte)(localUtil.ctol( httpContext.cgiGet( edtavIntcod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73Intcod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73Intcod2), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTipartcod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTipartcod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIPARTCOD1");
            GX_FocusControl = edtavTipartcod1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV113TipArtCod1 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV113TipArtCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113TipArtCod1), 4, 0));
         }
         else
         {
            AV113TipArtCod1 = (short)(localUtil.ctol( httpContext.cgiGet( edtavTipartcod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV113TipArtCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113TipArtCod1), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTipartcod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTipartcod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIPARTCOD2");
            GX_FocusControl = edtavTipartcod2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV114TipArtCod2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV114TipArtCod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV114TipArtCod2), 4, 0));
         }
         else
         {
            AV114TipArtCod2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavTipartcod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV114TipArtCod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV114TipArtCod2), 4, 0));
         }
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
      e11T72 ();
      if (returnInSub) return;
   }

   public void e11T72( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV5Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwcostesquimicosanalisis_impl.this.GXt_char1 = GXv_char2[0] ;
      AV5Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV39EmprNom ;
      GXv_char4[0] = AV121UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV5Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwcostesquimicosanalisis_impl.this.A396EmprCod = GXv_char2[0] ;
      webwcostesquimicosanalisis_impl.this.AV39EmprNom = GXv_char3[0] ;
      webwcostesquimicosanalisis_impl.this.AV121UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      AV41Fec1 = GXutil.dadd(GXutil.today( ),-(7)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Fec1", localUtil.format(AV41Fec1, "99/99/99"));
      AV42Fec2 = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Fec2", localUtil.format(AV42Fec2, "99/99/99"));
      AV66HreRacab = httpContext.getMessage( "T", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66HreRacab", AV66HreRacab);
      GXt_char1 = AV5Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webwcostesquimicosanalisis_impl.this.GXt_char1 = GXv_char4[0] ;
      AV5Station = GXt_char1 ;
      GXv_char4[0] = AV38EmprCod ;
      GXv_char3[0] = AV39EmprNom ;
      GXv_char2[0] = AV121UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV5Station, GXv_char4, GXv_char3, GXv_char2) ;
      webwcostesquimicosanalisis_impl.this.AV38EmprCod = GXv_char4[0] ;
      webwcostesquimicosanalisis_impl.this.AV39EmprNom = GXv_char3[0] ;
      webwcostesquimicosanalisis_impl.this.AV121UsurCod = GXv_char2[0] ;
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcwanalisiscostesquimicoss = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcwanalisiscostesquimicoss_Component), GXutil.lower( "WCWAnalisisCostesQuimicoss")) != 0 )
      {
         WebComp_Wcwcwanalisiscostesquimicoss = WebUtils.getWebComponent(getClass(), "app.wcwanalisiscostesquimicoss_impl", remoteHandle, context);
         WebComp_Wcwcwanalisiscostesquimicoss_Component = "WCWAnalisisCostesQuimicoss" ;
      }
      if ( GXutil.len( WebComp_Wcwcwanalisiscostesquimicoss_Component) != 0 )
      {
         WebComp_Wcwcwanalisiscostesquimicoss.setjustcreated();
         WebComp_Wcwcwanalisiscostesquimicoss.componentprepare(new Object[] {"W0150","",AV38EmprCod,AV66HreRacab,AV41Fec1,AV42Fec2,Byte.valueOf(AV20Calculo),Integer.valueOf(AV11Barcod),Byte.valueOf(AV13Barcodreo),AV12Barcodpar,AV6ARtcod1,AV8Artcod3,AV14Barcolnom1,AV16Barcolnom3,Integer.valueOf(AV17Barcolnum1),Integer.valueOf(AV19Barcolnum3),Integer.valueOf(AV23Clicod1),Integer.valueOf(AV25Clicod3),Byte.valueOf(AV72Intcod1),Byte.valueOf(AV74Intcod3),Short.valueOf(AV113TipArtCod1),Short.valueOf(AV115Tipartcod3),Byte.valueOf(AV116Tipcolcod1),Byte.valueOf(AV118Tipcolcod3)});
         WebComp_Wcwcwanalisiscostesquimicoss.componentbind(new Object[] {"","vHRERACAB","vFEC1","vFEC2","","","","","vARTCOD1","","vBARCOLNOM1","","vBARCOLNUM1","","vCLICOD1","","vINTCOD1","","vTIPARTCOD1","","vTIPCOLCOD1",""});
      }
   }

   public void e12T72( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      AV43Fec3 = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42Fec2)) ? GXutil.today( ) : AV42Fec2) ;
      AV25Clicod3 = ((0==AV24Clicod2) ? 999999 : AV24Clicod2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Clicod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Clicod3), 6, 0));
      AV8Artcod3 = ((GXutil.strcmp("", AV7Artcod2)==0) ? httpContext.getMessage( "zzzzzzzzzzzzzzzz", "") : AV7Artcod2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Artcod3", AV8Artcod3);
      AV115Tipartcod3 = (short)(((0==AV114TipArtCod2) ? 9999 : AV114TipArtCod2)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV115Tipartcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV115Tipartcod3), 4, 0));
      AV16Barcolnom3 = ((GXutil.strcmp("", AV15barcolnom2)==0) ? httpContext.getMessage( "zzzzzzzzzzzzz", "") : AV15barcolnom2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Barcolnom3", AV16Barcolnom3);
      AV19Barcolnum3 = ((0==AV18Barcolnum2) ? 999999 : AV18Barcolnum2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Barcolnum3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Barcolnum3), 6, 0));
      AV118Tipcolcod3 = (byte)(((0==AV117TipColcod2) ? 99 : AV117TipColcod2)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV118Tipcolcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV118Tipcolcod3), 2, 0));
      AV74Intcod3 = (byte)(((0==AV73Intcod2) ? 99 : AV73Intcod2)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74Intcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74Intcod3), 2, 0));
      AV99Maqcod3 = ((GXutil.strcmp("", AV98Maqcod2)==0) ? httpContext.getMessage( "ZZZZZZ", "") : AV98Maqcod2) ;
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcwanalisiscostesquimicoss = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcwanalisiscostesquimicoss_Component), GXutil.lower( "WCWAnalisisCostesQuimicoss")) != 0 )
      {
         WebComp_Wcwcwanalisiscostesquimicoss = WebUtils.getWebComponent(getClass(), "app.wcwanalisiscostesquimicoss_impl", remoteHandle, context);
         WebComp_Wcwcwanalisiscostesquimicoss_Component = "WCWAnalisisCostesQuimicoss" ;
      }
      if ( GXutil.len( WebComp_Wcwcwanalisiscostesquimicoss_Component) != 0 )
      {
         WebComp_Wcwcwanalisiscostesquimicoss.setjustcreated();
         WebComp_Wcwcwanalisiscostesquimicoss.componentprepare(new Object[] {"W0150","",A396EmprCod,AV66HreRacab,AV41Fec1,AV42Fec2,Byte.valueOf(AV20Calculo),Integer.valueOf(AV11Barcod),Byte.valueOf(AV13Barcodreo),AV12Barcodpar,AV6ARtcod1,AV8Artcod3,AV14Barcolnom1,AV16Barcolnom3,Integer.valueOf(AV17Barcolnum1),Integer.valueOf(AV19Barcolnum3),Integer.valueOf(AV23Clicod1),Integer.valueOf(AV25Clicod3),Byte.valueOf(AV72Intcod1),Byte.valueOf(AV74Intcod3),Short.valueOf(AV113TipArtCod1),Short.valueOf(AV115Tipartcod3),Byte.valueOf(AV116Tipcolcod1),Byte.valueOf(AV118Tipcolcod3)});
         WebComp_Wcwcwanalisiscostesquimicoss.componentbind(new Object[] {"","vHRERACAB","vFEC1","vFEC2","","","","","vARTCOD1","","vBARCOLNOM1","","vBARCOLNUM1","","vCLICOD1","","vINTCOD1","","vTIPARTCOD1","","vTIPCOLCOD1",""});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwcwanalisiscostesquimicoss )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0150"+"");
         WebComp_Wcwcwanalisiscostesquimicoss.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /*  Sending Event outputs  */
   }

   public void e13T72( )
   {
      /* Hreracab_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e14T72( )
   {
      /* Fec1_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e15T72( )
   {
      /* Fec2_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e16T72( )
   {
      /* Clicod1_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e17T72( )
   {
      /* Clicod2_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e18T72( )
   {
      /* Artcod1_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e19T72( )
   {
      /* Artcod2_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e20T72( )
   {
      /* Barcolnom1_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e21T72( )
   {
      /* Barcolnom2_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e22T72( )
   {
      /* Barcolnum1_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e23T72( )
   {
      /* Barcolnum2_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e24T72( )
   {
      /* Tipcolcod1_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e25T72( )
   {
      /* Tipcolcod2_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e26T72( )
   {
      /* Intcod1_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e27T72( )
   {
      /* Intcod2_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e28T72( )
   {
      /* Tipartcod1_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e29T72( )
   {
      /* Tipartcod2_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   protected void nextLoad( )
   {
   }

   protected void e30T72( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table7_134_T72( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedtipartcod1_Internalname, tblTablemergedtipartcod1_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTipartcod1_Internalname, httpContext.getMessage( "Tipo Artículo", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 138,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipartcod1_Internalname, GXutil.ltrim( localUtil.ntoc( AV113TipArtCod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTipartcod1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV113TipArtCod1), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV113TipArtCod1), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,138);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipartcod1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipartcod1_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWCostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavTipartcod2_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 142,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipartcod2_Internalname, GXutil.ltrim( localUtil.ntoc( AV114TipArtCod2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTipartcod2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV114TipArtCod2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV114TipArtCod2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,142);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipartcod2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipartcod2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWCostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_134_T72e( true) ;
      }
      else
      {
         wb_table7_134_T72e( false) ;
      }
   }

   public void wb_table6_118_T72( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedintcod1_Internalname, tblTablemergedintcod1_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavIntcod1_Internalname, httpContext.getMessage( "Código Intensidad", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavIntcod1_Internalname, GXutil.ltrim( localUtil.ntoc( AV72Intcod1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavIntcod1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV72Intcod1), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV72Intcod1), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,122);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIntcod1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavIntcod1_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWCostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavIntcod2_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavIntcod2_Internalname, GXutil.ltrim( localUtil.ntoc( AV73Intcod2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavIntcod2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV73Intcod2), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV73Intcod2), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIntcod2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavIntcod2_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWCostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_118_T72e( true) ;
      }
      else
      {
         wb_table6_118_T72e( false) ;
      }
   }

   public void wb_table5_102_T72( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedtipcolcod1_Internalname, tblTablemergedtipcolcod1_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTipcolcod1_Internalname, httpContext.getMessage( "Código Tipo Colorante", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipcolcod1_Internalname, GXutil.ltrim( localUtil.ntoc( AV116Tipcolcod1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTipcolcod1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV116Tipcolcod1), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV116Tipcolcod1), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipcolcod1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipcolcod1_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWCostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavTipcolcod2_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipcolcod2_Internalname, GXutil.ltrim( localUtil.ntoc( AV117TipColcod2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTipcolcod2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV117TipColcod2), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV117TipColcod2), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,110);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipcolcod2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipcolcod2_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWCostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_102_T72e( true) ;
      }
      else
      {
         wb_table5_102_T72e( false) ;
      }
   }

   public void wb_table4_78_T72( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedbarcolnom1_Internalname, tblTablemergedbarcolnom1_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom1_Internalname, httpContext.getMessage( "Color", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom1_Internalname, GXutil.rtrim( AV14Barcolnom1), GXutil.rtrim( localUtil.format( AV14Barcolnom1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,82);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom1_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWCostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnum1_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum1_Internalname, GXutil.ltrim( localUtil.ntoc( AV17Barcolnum1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV17Barcolnum1), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV17Barcolnum1), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum1_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWCostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnom2_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom2_Internalname, GXutil.rtrim( AV15barcolnom2), GXutil.rtrim( localUtil.format( AV15barcolnom2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,90);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom2_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWCostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnum2_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum2_Internalname, GXutil.ltrim( localUtil.ntoc( AV18Barcolnum2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV18Barcolnum2), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV18Barcolnum2), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum2_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWCostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_78_T72e( true) ;
      }
      else
      {
         wb_table4_78_T72e( false) ;
      }
   }

   public void wb_table3_62_T72( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedartcod1_Internalname, tblTablemergedartcod1_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavArtcod1_Internalname, httpContext.getMessage( "Articulo", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtcod1_Internalname, GXutil.rtrim( AV6ARtcod1), GXutil.rtrim( localUtil.format( AV6ARtcod1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtcod1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtcod1_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWCostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtcod2_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtcod2_Internalname, GXutil.rtrim( AV7Artcod2), GXutil.rtrim( localUtil.format( AV7Artcod2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtcod2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtcod2_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWCostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_62_T72e( true) ;
      }
      else
      {
         wb_table3_62_T72e( false) ;
      }
   }

   public void wb_table2_46_T72( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedclicod1_Internalname, tblTablemergedclicod1_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod1_Internalname, httpContext.getMessage( "Cliente", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod1_Internalname, GXutil.ltrim( localUtil.ntoc( AV23Clicod1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV23Clicod1), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV23Clicod1), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod1_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWCostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod2_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod2_Internalname, GXutil.ltrim( localUtil.ntoc( AV24Clicod2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV24Clicod2), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV24Clicod2), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod2_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWCostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_46_T72e( true) ;
      }
      else
      {
         wb_table2_46_T72e( false) ;
      }
   }

   public void wb_table1_30_T72( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedfec1_Internalname, tblTablemergedfec1_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFec1_Internalname, httpContext.getMessage( "Fec1", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFec1_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFec1_Internalname, localUtil.format(AV41Fec1, "99/99/99"), localUtil.format( AV41Fec1, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFec1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFec1_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWCostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFec1_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFec1_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebWCostesQuimicosAnalisis.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavFec2_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFec2_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFec2_Internalname, localUtil.format(AV42Fec2, "99/99/99"), localUtil.format( AV42Fec2, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFec2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFec2_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWCostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFec2_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFec2_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebWCostesQuimicosAnalisis.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_30_T72e( true) ;
      }
      else
      {
         wb_table1_30_T72e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
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
      paT72( ) ;
      wsT72( ) ;
      weT72( ) ;
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
      if ( ! ( WebComp_Wcwcwanalisiscostesquimicoss == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcwanalisiscostesquimicoss_Component) != 0 )
         {
            WebComp_Wcwcwanalisiscostesquimicoss.componentthemes();
         }
      }
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241513558", true, true);
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
      httpContext.AddJavascriptSource("webwcostesquimicosanalisis.js", "?20268241513559", false, true);
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
      cmbavHreracab.setInternalname( "vHRERACAB" );
      lblTextblockfec1_Internalname = "TEXTBLOCKFEC1" ;
      edtavFec1_Internalname = "vFEC1" ;
      edtavFec2_Internalname = "vFEC2" ;
      tblTablemergedfec1_Internalname = "TABLEMERGEDFEC1" ;
      divTablesplittedfec1_Internalname = "TABLESPLITTEDFEC1" ;
      lblTextblockclicod1_Internalname = "TEXTBLOCKCLICOD1" ;
      edtavClicod1_Internalname = "vCLICOD1" ;
      edtavClicod2_Internalname = "vCLICOD2" ;
      tblTablemergedclicod1_Internalname = "TABLEMERGEDCLICOD1" ;
      divTablesplittedclicod1_Internalname = "TABLESPLITTEDCLICOD1" ;
      lblTextblockartcod1_Internalname = "TEXTBLOCKARTCOD1" ;
      edtavArtcod1_Internalname = "vARTCOD1" ;
      edtavArtcod2_Internalname = "vARTCOD2" ;
      tblTablemergedartcod1_Internalname = "TABLEMERGEDARTCOD1" ;
      divTablesplittedartcod1_Internalname = "TABLESPLITTEDARTCOD1" ;
      lblTextblockbarcolnom1_Internalname = "TEXTBLOCKBARCOLNOM1" ;
      edtavBarcolnom1_Internalname = "vBARCOLNOM1" ;
      edtavBarcolnum1_Internalname = "vBARCOLNUM1" ;
      edtavBarcolnom2_Internalname = "vBARCOLNOM2" ;
      edtavBarcolnum2_Internalname = "vBARCOLNUM2" ;
      tblTablemergedbarcolnom1_Internalname = "TABLEMERGEDBARCOLNOM1" ;
      divTablesplittedbarcolnom1_Internalname = "TABLESPLITTEDBARCOLNOM1" ;
      lblTextblocktipcolcod1_Internalname = "TEXTBLOCKTIPCOLCOD1" ;
      edtavTipcolcod1_Internalname = "vTIPCOLCOD1" ;
      edtavTipcolcod2_Internalname = "vTIPCOLCOD2" ;
      tblTablemergedtipcolcod1_Internalname = "TABLEMERGEDTIPCOLCOD1" ;
      divTablesplittedtipcolcod1_Internalname = "TABLESPLITTEDTIPCOLCOD1" ;
      lblTextblockintcod1_Internalname = "TEXTBLOCKINTCOD1" ;
      edtavIntcod1_Internalname = "vINTCOD1" ;
      edtavIntcod2_Internalname = "vINTCOD2" ;
      tblTablemergedintcod1_Internalname = "TABLEMERGEDINTCOD1" ;
      divTablesplittedintcod1_Internalname = "TABLESPLITTEDINTCOD1" ;
      lblTextblocktipartcod1_Internalname = "TEXTBLOCKTIPARTCOD1" ;
      edtavTipartcod1_Internalname = "vTIPARTCOD1" ;
      edtavTipartcod2_Internalname = "vTIPARTCOD2" ;
      tblTablemergedtipartcod1_Internalname = "TABLEMERGEDTIPARTCOD1" ;
      divTablesplittedtipartcod1_Internalname = "TABLESPLITTEDTIPARTCOD1" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
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
      edtavFec2_Jsonclick = "" ;
      edtavFec2_Enabled = 1 ;
      edtavFec1_Jsonclick = "" ;
      edtavFec1_Enabled = 1 ;
      edtavClicod2_Jsonclick = "" ;
      edtavClicod2_Enabled = 1 ;
      edtavClicod1_Jsonclick = "" ;
      edtavClicod1_Enabled = 1 ;
      edtavArtcod2_Jsonclick = "" ;
      edtavArtcod2_Enabled = 1 ;
      edtavArtcod1_Jsonclick = "" ;
      edtavArtcod1_Enabled = 1 ;
      edtavBarcolnum2_Jsonclick = "" ;
      edtavBarcolnum2_Enabled = 1 ;
      edtavBarcolnom2_Jsonclick = "" ;
      edtavBarcolnom2_Enabled = 1 ;
      edtavBarcolnum1_Jsonclick = "" ;
      edtavBarcolnum1_Enabled = 1 ;
      edtavBarcolnom1_Jsonclick = "" ;
      edtavBarcolnom1_Enabled = 1 ;
      edtavTipcolcod2_Jsonclick = "" ;
      edtavTipcolcod2_Enabled = 1 ;
      edtavTipcolcod1_Jsonclick = "" ;
      edtavTipcolcod1_Enabled = 1 ;
      edtavIntcod2_Jsonclick = "" ;
      edtavIntcod2_Enabled = 1 ;
      edtavIntcod1_Jsonclick = "" ;
      edtavIntcod1_Enabled = 1 ;
      edtavTipartcod2_Jsonclick = "" ;
      edtavTipartcod2_Enabled = 1 ;
      edtavTipartcod1_Jsonclick = "" ;
      edtavTipartcod1_Enabled = 1 ;
      cmbavHreracab.setJsonclick( "" );
      cmbavHreracab.setEnabled( 1 );
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Detalle de Hdrs", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Filtros", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Costes Quimicos Analisis", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavHreracab.setName( "vHRERACAB" );
      cmbavHreracab.setWebtags( "" );
      cmbavHreracab.addItem("T", httpContext.getMessage( "Todas", ""), (short)(0));
      cmbavHreracab.addItem("", httpContext.getMessage( "Tinte", ""), (short)(0));
      cmbavHreracab.addItem("S", httpContext.getMessage( "Acabados", ""), (short)(0));
      if ( cmbavHreracab.getItemCount() > 0 )
      {
         AV66HreRacab = cmbavHreracab.getValidValue(AV66HreRacab) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66HreRacab", AV66HreRacab);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV42Fec2',fld:'vFEC2',pic:''},{av:'AV24Clicod2',fld:'vCLICOD2',pic:'ZZZZZ9'},{av:'AV7Artcod2',fld:'vARTCOD2',pic:''},{av:'AV114TipArtCod2',fld:'vTIPARTCOD2',pic:'ZZZ9'},{av:'AV15barcolnom2',fld:'vBARCOLNOM2',pic:''},{av:'AV18Barcolnum2',fld:'vBARCOLNUM2',pic:'ZZZZZ9'},{av:'AV117TipColcod2',fld:'vTIPCOLCOD2',pic:'Z9'},{av:'AV73Intcod2',fld:'vINTCOD2',pic:'Z9'},{av:'cmbavHreracab'},{av:'AV66HreRacab',fld:'vHRERACAB',pic:''},{av:'AV41Fec1',fld:'vFEC1',pic:''},{av:'AV6ARtcod1',fld:'vARTCOD1',pic:''},{av:'AV14Barcolnom1',fld:'vBARCOLNOM1',pic:''},{av:'AV17Barcolnum1',fld:'vBARCOLNUM1',pic:'ZZZZZ9'},{av:'AV23Clicod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'AV72Intcod1',fld:'vINTCOD1',pic:'Z9'},{av:'AV113TipArtCod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV116Tipcolcod1',fld:'vTIPCOLCOD1',pic:'Z9'},{av:'AV98Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV20Calculo',fld:'vCALCULO',pic:'9',hsh:true},{av:'AV11Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV13Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV12Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25Clicod3',fld:'vCLICOD3',pic:'ZZZZZ9'},{av:'AV8Artcod3',fld:'vARTCOD3',pic:''},{av:'AV115Tipartcod3',fld:'vTIPARTCOD3',pic:'ZZZ9'},{av:'AV16Barcolnom3',fld:'vBARCOLNOM3',pic:''},{av:'AV19Barcolnum3',fld:'vBARCOLNUM3',pic:'ZZZZZ9'},{av:'AV118Tipcolcod3',fld:'vTIPCOLCOD3',pic:'Z9'},{av:'AV74Intcod3',fld:'vINTCOD3',pic:'Z9'},{ctrl:'WCWCWANALISISCOSTESQUIMICOSS'}]}");
      setEventMetadata("VHRERACAB.CONTROLVALUECHANGED","{handler:'e13T72',iparms:[]");
      setEventMetadata("VHRERACAB.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VFEC1.CONTROLVALUECHANGED","{handler:'e14T72',iparms:[]");
      setEventMetadata("VFEC1.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VFEC2.CONTROLVALUECHANGED","{handler:'e15T72',iparms:[]");
      setEventMetadata("VFEC2.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VCLICOD1.CONTROLVALUECHANGED","{handler:'e16T72',iparms:[]");
      setEventMetadata("VCLICOD1.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VCLICOD2.CONTROLVALUECHANGED","{handler:'e17T72',iparms:[]");
      setEventMetadata("VCLICOD2.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VARTCOD1.CONTROLVALUECHANGED","{handler:'e18T72',iparms:[]");
      setEventMetadata("VARTCOD1.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VARTCOD2.CONTROLVALUECHANGED","{handler:'e19T72',iparms:[]");
      setEventMetadata("VARTCOD2.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VBARCOLNOM1.CONTROLVALUECHANGED","{handler:'e20T72',iparms:[]");
      setEventMetadata("VBARCOLNOM1.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VBARCOLNOM2.CONTROLVALUECHANGED","{handler:'e21T72',iparms:[]");
      setEventMetadata("VBARCOLNOM2.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VBARCOLNUM1.CONTROLVALUECHANGED","{handler:'e22T72',iparms:[]");
      setEventMetadata("VBARCOLNUM1.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VBARCOLNUM2.CONTROLVALUECHANGED","{handler:'e23T72',iparms:[]");
      setEventMetadata("VBARCOLNUM2.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VTIPCOLCOD1.CONTROLVALUECHANGED","{handler:'e24T72',iparms:[]");
      setEventMetadata("VTIPCOLCOD1.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VTIPCOLCOD2.CONTROLVALUECHANGED","{handler:'e25T72',iparms:[]");
      setEventMetadata("VTIPCOLCOD2.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VINTCOD1.CONTROLVALUECHANGED","{handler:'e26T72',iparms:[]");
      setEventMetadata("VINTCOD1.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VINTCOD2.CONTROLVALUECHANGED","{handler:'e27T72',iparms:[]");
      setEventMetadata("VINTCOD2.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VTIPARTCOD1.CONTROLVALUECHANGED","{handler:'e28T72',iparms:[]");
      setEventMetadata("VTIPARTCOD1.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VTIPARTCOD2.CONTROLVALUECHANGED","{handler:'e29T72',iparms:[]");
      setEventMetadata("VTIPARTCOD2.CONTROLVALUECHANGED",",oparms:[]}");
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
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV98Maqcod2 = "" ;
      A396EmprCod = "" ;
      AV12Barcodpar = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV66HreRacab = "" ;
      lblTextblockfec1_Jsonclick = "" ;
      lblTextblockclicod1_Jsonclick = "" ;
      lblTextblockartcod1_Jsonclick = "" ;
      lblTextblockbarcolnom1_Jsonclick = "" ;
      lblTextblocktipcolcod1_Jsonclick = "" ;
      lblTextblockintcod1_Jsonclick = "" ;
      lblTextblocktipartcod1_Jsonclick = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      WebComp_Wcwcwanalisiscostesquimicoss_Component = "" ;
      OldWcwcwanalisiscostesquimicoss = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      scmdbuf = "" ;
      H00T72_A396EmprCod = new String[] {""} ;
      AV41Fec1 = GXutil.nullDate() ;
      AV42Fec2 = GXutil.nullDate() ;
      AV6ARtcod1 = "" ;
      AV7Artcod2 = "" ;
      AV14Barcolnom1 = "" ;
      AV15barcolnom2 = "" ;
      AV5Station = "" ;
      AV39EmprNom = "" ;
      AV121UsurCod = "" ;
      GXt_char1 = "" ;
      AV38EmprCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV8Artcod3 = "" ;
      AV16Barcolnom3 = "" ;
      AV43Fec3 = GXutil.nullDate() ;
      AV99Maqcod3 = "" ;
      sStyleString = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwcostesquimicosanalisis__default(),
         new Object[] {
             new Object[] {
            H00T72_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      WebComp_Wcwcwanalisiscostesquimicoss = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV20Calculo ;
   private byte AV13Barcodreo ;
   private byte nDonePA ;
   private byte AV116Tipcolcod1 ;
   private byte AV117TipColcod2 ;
   private byte AV72Intcod1 ;
   private byte AV73Intcod2 ;
   private byte AV74Intcod3 ;
   private byte AV118Tipcolcod3 ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV113TipArtCod1 ;
   private short AV114TipArtCod2 ;
   private short AV115Tipartcod3 ;
   private int AV11Barcod ;
   private int AV23Clicod1 ;
   private int AV24Clicod2 ;
   private int AV17Barcolnum1 ;
   private int AV18Barcolnum2 ;
   private int AV19Barcolnum3 ;
   private int AV25Clicod3 ;
   private int edtavTipartcod1_Enabled ;
   private int edtavTipartcod2_Enabled ;
   private int edtavIntcod1_Enabled ;
   private int edtavIntcod2_Enabled ;
   private int edtavTipcolcod1_Enabled ;
   private int edtavTipcolcod2_Enabled ;
   private int edtavBarcolnom1_Enabled ;
   private int edtavBarcolnum1_Enabled ;
   private int edtavBarcolnom2_Enabled ;
   private int edtavBarcolnum2_Enabled ;
   private int edtavArtcod1_Enabled ;
   private int edtavArtcod2_Enabled ;
   private int edtavClicod1_Enabled ;
   private int edtavClicod2_Enabled ;
   private int edtavFec1_Enabled ;
   private int edtavFec2_Enabled ;
   private int idxLst ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV98Maqcod2 ;
   private String A396EmprCod ;
   private String AV12Barcodpar ;
   private String GXKey ;
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
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String AV66HreRacab ;
   private String divTablesplittedfec1_Internalname ;
   private String lblTextblockfec1_Internalname ;
   private String lblTextblockfec1_Jsonclick ;
   private String divTablesplittedclicod1_Internalname ;
   private String lblTextblockclicod1_Internalname ;
   private String lblTextblockclicod1_Jsonclick ;
   private String divTablesplittedartcod1_Internalname ;
   private String lblTextblockartcod1_Internalname ;
   private String lblTextblockartcod1_Jsonclick ;
   private String divTablesplittedbarcolnom1_Internalname ;
   private String lblTextblockbarcolnom1_Internalname ;
   private String lblTextblockbarcolnom1_Jsonclick ;
   private String divTablesplittedtipcolcod1_Internalname ;
   private String lblTextblocktipcolcod1_Internalname ;
   private String lblTextblocktipcolcod1_Jsonclick ;
   private String divTablesplittedintcod1_Internalname ;
   private String lblTextblockintcod1_Internalname ;
   private String lblTextblockintcod1_Jsonclick ;
   private String divTablesplittedtipartcod1_Internalname ;
   private String lblTextblocktipartcod1_Internalname ;
   private String lblTextblocktipartcod1_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String WebComp_Wcwcwanalisiscostesquimicoss_Component ;
   private String OldWcwcwanalisiscostesquimicoss ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String scmdbuf ;
   private String edtavFec1_Internalname ;
   private String edtavFec2_Internalname ;
   private String edtavClicod1_Internalname ;
   private String edtavClicod2_Internalname ;
   private String AV6ARtcod1 ;
   private String edtavArtcod1_Internalname ;
   private String AV7Artcod2 ;
   private String edtavArtcod2_Internalname ;
   private String AV14Barcolnom1 ;
   private String edtavBarcolnom1_Internalname ;
   private String edtavBarcolnum1_Internalname ;
   private String AV15barcolnom2 ;
   private String edtavBarcolnom2_Internalname ;
   private String edtavBarcolnum2_Internalname ;
   private String edtavTipcolcod1_Internalname ;
   private String edtavTipcolcod2_Internalname ;
   private String edtavIntcod1_Internalname ;
   private String edtavIntcod2_Internalname ;
   private String edtavTipartcod1_Internalname ;
   private String edtavTipartcod2_Internalname ;
   private String AV5Station ;
   private String AV39EmprNom ;
   private String AV121UsurCod ;
   private String GXt_char1 ;
   private String AV38EmprCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV8Artcod3 ;
   private String AV16Barcolnom3 ;
   private String AV99Maqcod3 ;
   private String sStyleString ;
   private String tblTablemergedtipartcod1_Internalname ;
   private String edtavTipartcod1_Jsonclick ;
   private String edtavTipartcod2_Jsonclick ;
   private String tblTablemergedintcod1_Internalname ;
   private String edtavIntcod1_Jsonclick ;
   private String edtavIntcod2_Jsonclick ;
   private String tblTablemergedtipcolcod1_Internalname ;
   private String edtavTipcolcod1_Jsonclick ;
   private String edtavTipcolcod2_Jsonclick ;
   private String tblTablemergedbarcolnom1_Internalname ;
   private String edtavBarcolnom1_Jsonclick ;
   private String edtavBarcolnum1_Jsonclick ;
   private String edtavBarcolnom2_Jsonclick ;
   private String edtavBarcolnum2_Jsonclick ;
   private String tblTablemergedartcod1_Internalname ;
   private String edtavArtcod1_Jsonclick ;
   private String edtavArtcod2_Jsonclick ;
   private String tblTablemergedclicod1_Internalname ;
   private String edtavClicod1_Jsonclick ;
   private String edtavClicod2_Jsonclick ;
   private String tblTablemergedfec1_Internalname ;
   private String edtavFec1_Jsonclick ;
   private String edtavFec2_Jsonclick ;
   private java.util.Date AV41Fec1 ;
   private java.util.Date AV42Fec2 ;
   private java.util.Date AV43Fec3 ;
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
   private boolean bDynCreated_Wcwcwanalisiscostesquimicoss ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcwcwanalisiscostesquimicoss ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private HTMLChoice cmbavHreracab ;
   private IDataStoreProvider pr_default ;
   private String[] H00T72_A396EmprCod ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class webwcostesquimicosanalisis__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00T72", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

