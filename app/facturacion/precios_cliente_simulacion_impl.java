package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class precios_cliente_simulacion_impl extends GXDataArea
{
   public precios_cliente_simulacion_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public precios_cliente_simulacion_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( precios_cliente_simulacion_impl.class ));
   }

   public precios_cliente_simulacion_impl( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavSeleccionar = UIFactory.getCheckbox(this);
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "Index") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "Index") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "Index") ;
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
            AV45Index = (short)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45Index", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45Index), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINDEX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV45Index), "ZZZ9")));
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
      pa2BL2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2BL2( ) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.precios_cliente_simulacion", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV45Index,4,0))}, new String[] {"Index"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORCOSFORM", getSecureSignedToken( "", localUtil.format( AV17ForCosForm, "ZZZZ9.99999")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLITIPO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7CliTipo, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORNUMCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18ForNumCol), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOLDCLASSE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31OldClasse), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOLDPREKGM", getSecureSignedToken( "", localUtil.format( AV44OldPreKgm, "ZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINDEX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV45Index), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"Precios_cliente_simulacion");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV58Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\precios_cliente_simulacion:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV10Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORCOSFORM", GXutil.ltrim( localUtil.ntoc( AV17ForCosForm, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORCOSFORM", getSecureSignedToken( "", localUtil.format( AV17ForCosForm, "ZZZZ9.99999")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLITIPO", GXutil.rtrim( AV7CliTipo));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLITIPO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7CliTipo, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORNUMCOL", GXutil.ltrim( localUtil.ntoc( AV18ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORNUMCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18ForNumCol), "ZZZZZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRECIOS_CLIENTE_SDT", AV54Precios_cliente_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRECIOS_CLIENTE_SDT", AV54Precios_cliente_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vC_M", GXutil.ltrim( localUtil.ntoc( AV5C_M, (byte)(11), (byte)(8), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMC", GXutil.ltrim( localUtil.ntoc( AV24Mc, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTI", GXutil.ltrim( localUtil.ntoc( AV41Ti, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCM", GXutil.ltrim( localUtil.ntoc( AV8Cm, (byte)(11), (byte)(8), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFI", GXutil.ltrim( localUtil.ntoc( AV14Fi, (byte)(11), (byte)(8), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vF_I", GXutil.ltrim( localUtil.ntoc( AV12F_i, (byte)(8), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDCLASSE", GXutil.ltrim( localUtil.ntoc( AV31OldClasse, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOLDCLASSE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31OldClasse), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDPREKGM", GXutil.ltrim( localUtil.ntoc( AV44OldPreKgm, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOLDPREKGM", getSecureSignedToken( "", localUtil.format( AV44OldPreKgm, "ZZZZZ9.999")));
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
         we2BL2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2BL2( ) ;
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
      return formatLink("app.facturacion.precios_cliente_simulacion", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV45Index,4,0))}, new String[] {"Index"})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.Precios_cliente_simulacion" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Precios_cliente_simulacion", "") ;
   }

   public void wb2BL0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavSeleccionar.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavSeleccionar.getInternalname(), httpContext.getMessage( "OP", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavSeleccionar.getInternalname(), AV38seleccionar, "", httpContext.getMessage( "OP", ""), 1, chkavSeleccionar.getEnabled(), "S", httpContext.getMessage( "Op", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(25, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,25);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-11", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavIndex_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavIndex_Internalname, httpContext.getMessage( "Index", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavIndex_Internalname, GXutil.ltrim( localUtil.ntoc( AV45Index, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavIndex_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV45Index), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV45Index), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIndex_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavIndex_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\Precios_cliente_simulacion.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavGrdtipart_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavGrdtipart_Internalname, httpContext.getMessage( "Classe", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGrdtipart_Internalname, GXutil.ltrim( localUtil.ntoc( AV21GrdTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavGrdtipart_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV21GrdTipArt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV21GrdTipArt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGrdtipart_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavGrdtipart_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\Precios_cliente_simulacion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         ClassString = "CellMarginTop15" + " " + ((GXutil.strcmp(imgUseraction1_gximage, "")==0) ? "GX_Image_prompt_Class" : "GX_Image_"+imgUseraction1_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgUseraction1_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgUseraction1_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOUSERACTION1\\'."+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_Facturacion\\Precios_cliente_simulacion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavGrdtipdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavGrdtipdsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGrdtipdsc_Internalname, GXutil.rtrim( AV23GrdTipDsc), GXutil.rtrim( localUtil.format( AV23GrdTipDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGrdtipdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavGrdtipdsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\Precios_cliente_simulacion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPc_Internalname, httpContext.getMessage( "Preço de custo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPc_Internalname, GXutil.ltrim( localUtil.ntoc( AV33Pc, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPc_Enabled!=0) ? localUtil.format( AV33Pc, "ZZZZ9.99999") : localUtil.format( AV33Pc, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPc_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\Precios_cliente_simulacion.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMv_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMv_Internalname, httpContext.getMessage( "Margem na venda", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMv_Internalname, GXutil.ltrim( localUtil.ntoc( AV26Mv, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMv_Enabled!=0) ? localUtil.format( AV26Mv, "ZZZZZZ9.99") : localUtil.format( AV26Mv, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMv_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMv_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\Precios_cliente_simulacion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPv_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPv_Internalname, httpContext.getMessage( "Preço de venda", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPv_Internalname, GXutil.ltrim( localUtil.ntoc( AV36PV, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPv_Enabled!=0) ? localUtil.format( AV36PV, "ZZZZZ9.999") : localUtil.format( AV36PV, "ZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPv_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPv_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\Precios_cliente_simulacion.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForprekgm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForprekgm_Internalname, httpContext.getMessage( "Preço", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForprekgm_Internalname, GXutil.ltrim( localUtil.ntoc( AV19ForPreKgm, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavForprekgm_Enabled!=0) ? localUtil.format( AV19ForPreKgm, "ZZZZZ9.999") : localUtil.format( AV19ForPreKgm, "ZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForprekgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForprekgm_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\Precios_cliente_simulacion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavObs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavObs_Internalname, httpContext.getMessage( "Observações", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavObs_Internalname, GXutil.rtrim( AV28Obs), GXutil.rtrim( localUtil.format( AV28Obs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavObs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavObs_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\Precios_cliente_simulacion.htm");
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\Precios_cliente_simulacion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\Precios_cliente_simulacion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV58Pgmname), GXutil.rtrim( localUtil.format( AV58Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\Precios_cliente_simulacion.htm");
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

   public void start2BL2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Precios_cliente_simulacion", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2BL0( ) ;
   }

   public void ws2BL2( )
   {
      start2BL2( ) ;
      evt2BL2( ) ;
   }

   public void evt2BL2( )
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
                           e112BL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e122BL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOUSERACTION1'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoUserAction1' */
                           e132BL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VGRDTIPART.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142BL2 ();
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
                                 e152BL2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e162BL2 ();
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

   public void we2BL2( )
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

   public void pa2BL2( )
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
            GX_FocusControl = chkavSeleccionar.getInternalname() ;
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
      AV38seleccionar = ((GXutil.strcmp(GXutil.rtrim( AV38seleccionar), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38seleccionar", AV38seleccionar);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2BL2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV58Pgmname = "Facturacion.Precios_cliente_simulacion" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58Pgmname", AV58Pgmname);
      Gx_err = (short)(0) ;
      edtavIndex_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIndex_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIndex_Enabled), 5, 0), true);
      edtavGrdtipdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrdtipdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrdtipdsc_Enabled), 5, 0), true);
      edtavPc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPc_Enabled), 5, 0), true);
      edtavPv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPv_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2BL2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e162BL2 ();
         wb2BL0( ) ;
      }
   }

   public void send_integrity_lvl_hashes2BL2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vFORCOSFORM", GXutil.ltrim( localUtil.ntoc( AV17ForCosForm, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORCOSFORM", getSecureSignedToken( "", localUtil.format( AV17ForCosForm, "ZZZZ9.99999")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLITIPO", GXutil.rtrim( AV7CliTipo));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLITIPO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7CliTipo, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORNUMCOL", GXutil.ltrim( localUtil.ntoc( AV18ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORNUMCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18ForNumCol), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDCLASSE", GXutil.ltrim( localUtil.ntoc( AV31OldClasse, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOLDCLASSE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31OldClasse), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDPREKGM", GXutil.ltrim( localUtil.ntoc( AV44OldPreKgm, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOLDPREKGM", getSecureSignedToken( "", localUtil.format( AV44OldPreKgm, "ZZZZZ9.999")));
   }

   public void before_start_formulas( )
   {
      AV58Pgmname = "Facturacion.Precios_cliente_simulacion" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58Pgmname", AV58Pgmname);
      Gx_err = (short)(0) ;
      edtavIndex_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIndex_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIndex_Enabled), 5, 0), true);
      edtavGrdtipdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrdtipdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrdtipdsc_Enabled), 5, 0), true);
      edtavPc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPc_Enabled), 5, 0), true);
      edtavPv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPv_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2BL0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e112BL2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         AV44OldPreKgm = localUtil.ctond( httpContext.cgiGet( "vOLDPREKGM")) ;
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
         AV38seleccionar = ((GXutil.strcmp(httpContext.cgiGet( chkavSeleccionar.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38seleccionar", AV38seleccionar);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGrdtipart_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGrdtipart_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRDTIPART");
            GX_FocusControl = edtavGrdtipart_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV21GrdTipArt = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21GrdTipArt), 4, 0));
         }
         else
         {
            AV21GrdTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtavGrdtipart_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21GrdTipArt), 4, 0));
         }
         AV23GrdTipDsc = httpContext.cgiGet( edtavGrdtipdsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23GrdTipDsc", AV23GrdTipDsc);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPc_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPC");
            GX_FocusControl = edtavPc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV33Pc = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33Pc", GXutil.ltrimstr( AV33Pc, 11, 5));
         }
         else
         {
            AV33Pc = localUtil.ctond( httpContext.cgiGet( edtavPc_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33Pc", GXutil.ltrimstr( AV33Pc, 11, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMv_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMv_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMV");
            GX_FocusControl = edtavMv_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV26Mv = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26Mv", GXutil.ltrimstr( AV26Mv, 10, 2));
         }
         else
         {
            AV26Mv = localUtil.ctond( httpContext.cgiGet( edtavMv_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26Mv", GXutil.ltrimstr( AV26Mv, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPv_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPv_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPV");
            GX_FocusControl = edtavPv_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV36PV = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36PV", GXutil.ltrimstr( AV36PV, 12, 5));
         }
         else
         {
            AV36PV = localUtil.ctond( httpContext.cgiGet( edtavPv_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36PV", GXutil.ltrimstr( AV36PV, 12, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavForprekgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavForprekgm_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFORPREKGM");
            GX_FocusControl = edtavForprekgm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV19ForPreKgm = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19ForPreKgm", GXutil.ltrimstr( AV19ForPreKgm, 12, 5));
         }
         else
         {
            AV19ForPreKgm = localUtil.ctond( httpContext.cgiGet( edtavForprekgm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19ForPreKgm", GXutil.ltrimstr( AV19ForPreKgm, 12, 5));
         }
         AV28Obs = httpContext.cgiGet( edtavObs_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Obs", AV28Obs);
         AV58Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58Pgmname", AV58Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"Precios_cliente_simulacion");
         AV58Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58Pgmname", AV58Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV58Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("facturacion\\precios_cliente_simulacion:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e112BL2 ();
      if (returnInSub) return;
   }

   public void e112BL2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV53CadenaDataJSON = AV55WebSession.getValue("Precios_cliente_WC_SDT") ;
      AV54Precios_cliente_SDT.fromJSonString(AV53CadenaDataJSON, null);
      AV21GrdTipArt = ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV54Precios_cliente_SDT.elementAt(-1+AV45Index)).getgxTv_SdtPrecios_cliente_SDT_Item_Grdtipart() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21GrdTipArt), 4, 0));
      AV33Pc = ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV54Precios_cliente_SDT.elementAt(-1+AV45Index)).getgxTv_SdtPrecios_cliente_SDT_Item_Pc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pc", GXutil.ltrimstr( AV33Pc, 11, 5));
      AV26Mv = ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV54Precios_cliente_SDT.elementAt(-1+AV45Index)).getgxTv_SdtPrecios_cliente_SDT_Item_Mv() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Mv", GXutil.ltrimstr( AV26Mv, 10, 2));
      AV17ForCosForm = ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV54Precios_cliente_SDT.elementAt(-1+AV45Index)).getgxTv_SdtPrecios_cliente_SDT_Item_Cr() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17ForCosForm", GXutil.ltrimstr( AV17ForCosForm, 11, 5));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORCOSFORM", getSecureSignedToken( "", localUtil.format( AV17ForCosForm, "ZZZZ9.99999")));
      AV7CliTipo = ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV54Precios_cliente_SDT.elementAt(-1+AV45Index)).getgxTv_SdtPrecios_cliente_SDT_Item_Clitipo() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7CliTipo", AV7CliTipo);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLITIPO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7CliTipo, "@!"))));
      AV18ForNumCol = ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV54Precios_cliente_SDT.elementAt(-1+AV45Index)).getgxTv_SdtPrecios_cliente_SDT_Item_Fornumcol() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18ForNumCol), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORNUMCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18ForNumCol), "ZZZZZZZ9")));
      AV36PV = ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV54Precios_cliente_SDT.elementAt(-1+AV45Index)).getgxTv_SdtPrecios_cliente_SDT_Item_Pv() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36PV", GXutil.ltrimstr( AV36PV, 12, 5));
      AV19ForPreKgm = ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV54Precios_cliente_SDT.elementAt(-1+AV45Index)).getgxTv_SdtPrecios_cliente_SDT_Item_Newprekgm() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19ForPreKgm", GXutil.ltrimstr( AV19ForPreKgm, 12, 5));
      AV28Obs = ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV54Precios_cliente_SDT.elementAt(-1+AV45Index)).getgxTv_SdtPrecios_cliente_SDT_Item_Obs() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Obs", AV28Obs);
      AV5C_M = ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV54Precios_cliente_SDT.elementAt(-1+AV45Index)).getgxTv_SdtPrecios_cliente_SDT_Item_C_m() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5C_M", GXutil.ltrimstr( AV5C_M, 11, 8));
      AV24Mc = ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV54Precios_cliente_SDT.elementAt(-1+AV45Index)).getgxTv_SdtPrecios_cliente_SDT_Item_Mc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Mc", GXutil.ltrimstr( AV24Mc, 7, 3));
      AV41Ti = ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV54Precios_cliente_SDT.elementAt(-1+AV45Index)).getgxTv_SdtPrecios_cliente_SDT_Item_Ti() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Ti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Ti), 4, 0));
      AV8Cm = ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV54Precios_cliente_SDT.elementAt(-1+AV45Index)).getgxTv_SdtPrecios_cliente_SDT_Item_Cm() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Cm", GXutil.ltrimstr( AV8Cm, 11, 8));
      AV14Fi = ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV54Precios_cliente_SDT.elementAt(-1+AV45Index)).getgxTv_SdtPrecios_cliente_SDT_Item_Fi() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Fi", GXutil.ltrimstr( AV14Fi, 11, 8));
      AV12F_i = ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV54Precios_cliente_SDT.elementAt(-1+AV45Index)).getgxTv_SdtPrecios_cliente_SDT_Item_F_i() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12F_i", GXutil.ltrimstr( AV12F_i, 8, 4));
      AV31OldClasse = ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV54Precios_cliente_SDT.elementAt(-1+AV45Index)).getgxTv_SdtPrecios_cliente_SDT_Item_Oldclasse() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31OldClasse", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31OldClasse), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOLDCLASSE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31OldClasse), "ZZZ9")));
      AV39seleccionarIN = ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV54Precios_cliente_SDT.elementAt(-1+AV45Index)).getgxTv_SdtPrecios_cliente_SDT_Item_Seleccionar() ;
      AV38seleccionar = (!AV39seleccionarIN ? "N" : "S") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38seleccionar", AV38seleccionar);
      GXt_char1 = AV40Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      precios_cliente_simulacion_impl.this.GXt_char1 = GXv_char2[0] ;
      AV40Station = GXt_char1 ;
      GXv_char2[0] = AV10Emprcod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV43UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV40Station, GXv_char2, GXv_char3, GXv_char4) ;
      precios_cliente_simulacion_impl.this.AV10Emprcod = GXv_char2[0] ;
      precios_cliente_simulacion_impl.this.AV11EmprNom = GXv_char3[0] ;
      precios_cliente_simulacion_impl.this.AV43UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Emprcod", AV10Emprcod);
      GXt_char1 = AV23GrdTipDsc ;
      GXv_char4[0] = GXt_char1 ;
      new app.get_grdtipdsc(remoteHandle, context).execute( AV10Emprcod, AV21GrdTipArt, GXv_char4) ;
      precios_cliente_simulacion_impl.this.GXt_char1 = GXv_char4[0] ;
      AV23GrdTipDsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23GrdTipDsc", AV23GrdTipDsc);
   }

   public void e122BL2( )
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

   public void e132BL2( )
   {
      /* 'DoUserAction1' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.ficherosbasicos.tgrdtipprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV10Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV21GrdTipArt,4,0)),GXutil.URLEncode(GXutil.rtrim(AV23GrdTipDsc))}, new String[] {"InOutEmprCod","InOutGrdTipArt","InOutGrdTipDsc"}) , new Object[] {"AV10Emprcod","AV21GrdTipArt","AV23GrdTipDsc"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e142BL2( )
   {
      /* Grdtipart_Controlvaluechanged Routine */
      returnInSub = false ;
      GXt_int5 = AV41Ti ;
      GXv_decimal6[0] = AV35Pcm ;
      GXv_decimal7[0] = AV16ForCan ;
      GXv_decimal8[0] = AV5C_M ;
      GXv_decimal9[0] = AV8Cm ;
      GXv_decimal10[0] = AV14Fi ;
      GXv_decimal11[0] = AV24Mc ;
      GXv_decimal12[0] = AV12F_i ;
      GXv_decimal13[0] = AV36PV ;
      GXv_int14[0] = GXt_int5 ;
      new app.pprecli1(remoteHandle, context).execute( AV10Emprcod, AV17ForCosForm, AV21GrdTipArt, AV7CliTipo, AV18ForNumCol, GXv_decimal6, GXv_decimal7, GXv_decimal8, GXv_decimal9, GXv_decimal10, GXv_decimal11, GXv_decimal12, GXv_decimal13, GXv_int14) ;
      precios_cliente_simulacion_impl.this.AV35Pcm = GXv_decimal6[0] ;
      precios_cliente_simulacion_impl.this.AV16ForCan = GXv_decimal7[0] ;
      precios_cliente_simulacion_impl.this.AV5C_M = GXv_decimal8[0] ;
      precios_cliente_simulacion_impl.this.AV8Cm = GXv_decimal9[0] ;
      precios_cliente_simulacion_impl.this.AV14Fi = GXv_decimal10[0] ;
      precios_cliente_simulacion_impl.this.AV24Mc = GXv_decimal11[0] ;
      precios_cliente_simulacion_impl.this.AV12F_i = GXv_decimal12[0] ;
      precios_cliente_simulacion_impl.this.AV36PV = GXv_decimal13[0] ;
      precios_cliente_simulacion_impl.this.GXt_int5 = GXv_int14[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5C_M", GXutil.ltrimstr( AV5C_M, 11, 8));
      httpContext.ajax_rsp_assign_attri("", false, "AV8Cm", GXutil.ltrimstr( AV8Cm, 11, 8));
      httpContext.ajax_rsp_assign_attri("", false, "AV14Fi", GXutil.ltrimstr( AV14Fi, 11, 8));
      httpContext.ajax_rsp_assign_attri("", false, "AV24Mc", GXutil.ltrimstr( AV24Mc, 7, 3));
      httpContext.ajax_rsp_assign_attri("", false, "AV12F_i", GXutil.ltrimstr( AV12F_i, 8, 4));
      httpContext.ajax_rsp_assign_attri("", false, "AV36PV", GXutil.ltrimstr( AV36PV, 12, 5));
      AV41Ti = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Ti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Ti), 4, 0));
      AV33Pc = AV17ForCosForm.add((AV5C_M.multiply(DecimalUtil.doubleToDec(AV41Ti)))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pc", GXutil.ltrimstr( AV33Pc, 11, 5));
      AV36PV = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36PV", GXutil.ltrimstr( AV36PV, 12, 5));
      AV26Mv = AV24Mc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Mv", GXutil.ltrimstr( AV26Mv, 10, 2));
      if ( DecimalUtil.doubleToDec(1).subtract((AV24Mc.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))).doubleValue() > 0 )
      {
         if ( DecimalUtil.compareTo(GXutil.roundDecimal( AV33Pc.divide((DecimalUtil.doubleToDec(1).subtract((AV24Mc.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)))), 18, java.math.RoundingMode.DOWN), 2), DecimalUtil.stringToDec("999999.999")) > 0 )
         {
            AV36PV = DecimalUtil.stringToDec("999999.999") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36PV", GXutil.ltrimstr( AV36PV, 12, 5));
         }
         else
         {
            AV36PV = GXutil.roundDecimal( AV33Pc.divide((DecimalUtil.doubleToDec(1).subtract((AV24Mc.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)))), 18, java.math.RoundingMode.DOWN), 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36PV", GXutil.ltrimstr( AV36PV, 12, 5));
         }
      }
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e152BL2 ();
      if (returnInSub) return;
   }

   public void e152BL2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "Enter %1.", GXutil.trim( GXutil.str( AV45Index, 4, 0)), "", "", "", "", "", "", "", ""), AV58Pgmname) ;
      ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV54Precios_cliente_SDT.elementAt(-1+AV45Index)).setgxTv_SdtPrecios_cliente_SDT_Item_Grdtipart( AV21GrdTipArt );
      ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV54Precios_cliente_SDT.elementAt(-1+AV45Index)).setgxTv_SdtPrecios_cliente_SDT_Item_Pc( AV33Pc );
      ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV54Precios_cliente_SDT.elementAt(-1+AV45Index)).setgxTv_SdtPrecios_cliente_SDT_Item_Mv( AV26Mv );
      ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV54Precios_cliente_SDT.elementAt(-1+AV45Index)).setgxTv_SdtPrecios_cliente_SDT_Item_Pv( AV36PV );
      ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV54Precios_cliente_SDT.elementAt(-1+AV45Index)).setgxTv_SdtPrecios_cliente_SDT_Item_Newprekgm( AV19ForPreKgm );
      ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV54Precios_cliente_SDT.elementAt(-1+AV45Index)).setgxTv_SdtPrecios_cliente_SDT_Item_Obs( AV28Obs );
      ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV54Precios_cliente_SDT.elementAt(-1+AV45Index)).setgxTv_SdtPrecios_cliente_SDT_Item_C_m( AV5C_M );
      ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV54Precios_cliente_SDT.elementAt(-1+AV45Index)).setgxTv_SdtPrecios_cliente_SDT_Item_Mc( AV24Mc );
      ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV54Precios_cliente_SDT.elementAt(-1+AV45Index)).setgxTv_SdtPrecios_cliente_SDT_Item_Ti( AV41Ti );
      ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV54Precios_cliente_SDT.elementAt(-1+AV45Index)).setgxTv_SdtPrecios_cliente_SDT_Item_Cm( AV8Cm );
      ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV54Precios_cliente_SDT.elementAt(-1+AV45Index)).setgxTv_SdtPrecios_cliente_SDT_Item_Fi( AV14Fi );
      ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV54Precios_cliente_SDT.elementAt(-1+AV45Index)).setgxTv_SdtPrecios_cliente_SDT_Item_F_i( AV12F_i );
      ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV54Precios_cliente_SDT.elementAt(-1+AV45Index)).setgxTv_SdtPrecios_cliente_SDT_Item_Oldclasse( AV31OldClasse );
      ((app.facturacion.SdtPrecios_cliente_SDT_Item)AV54Precios_cliente_SDT.elementAt(-1+AV45Index)).setgxTv_SdtPrecios_cliente_SDT_Item_Seleccionar( ((GXutil.strcmp(AV38seleccionar, "N")==0) ? false : true) );
      AV53CadenaDataJSON = AV54Precios_cliente_SDT.toJSonString(false) ;
      AV55WebSession.setValue("Precios_cliente_WC_SDT", GXutil.trim( AV53CadenaDataJSON));
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV54Precios_cliente_SDT", AV54Precios_cliente_SDT);
   }

   protected void nextLoad( )
   {
   }

   protected void e162BL2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV45Index = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45Index", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45Index), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINDEX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV45Index), "ZZZ9")));
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
      pa2BL2( ) ;
      ws2BL2( ) ;
      we2BL2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202672713205054", true, true);
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
      httpContext.AddJavascriptSource("facturacion/precios_cliente_simulacion.js", "?202672713205054", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      chkavSeleccionar.setInternalname( "vSELECCIONAR" );
      edtavIndex_Internalname = "vINDEX" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtavGrdtipart_Internalname = "vGRDTIPART" ;
      imgUseraction1_Internalname = "USERACTION1" ;
      edtavGrdtipdsc_Internalname = "vGRDTIPDSC" ;
      edtavPc_Internalname = "vPC" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavMv_Internalname = "vMV" ;
      edtavPv_Internalname = "vPV" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtavForprekgm_Internalname = "vFORPREKGM" ;
      edtavObs_Internalname = "vOBS" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
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
      edtavObs_Jsonclick = "" ;
      edtavObs_Enabled = 1 ;
      edtavForprekgm_Jsonclick = "" ;
      edtavForprekgm_Enabled = 1 ;
      edtavPv_Jsonclick = "" ;
      edtavPv_Enabled = 1 ;
      edtavMv_Jsonclick = "" ;
      edtavMv_Enabled = 1 ;
      edtavPc_Jsonclick = "" ;
      edtavPc_Enabled = 1 ;
      edtavGrdtipdsc_Jsonclick = "" ;
      edtavGrdtipdsc_Enabled = 1 ;
      edtavGrdtipart_Jsonclick = "" ;
      edtavGrdtipart_Enabled = 1 ;
      edtavIndex_Jsonclick = "" ;
      edtavIndex_Enabled = 0 ;
      chkavSeleccionar.setEnabled( 1 );
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Precios_cliente_simulacion", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      chkavSeleccionar.setName( "vSELECCIONAR" );
      chkavSeleccionar.setWebtags( "" );
      chkavSeleccionar.setCaption( httpContext.getMessage( "Op", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), true);
      chkavSeleccionar.setCheckedValue( "N" );
      AV38seleccionar = ((GXutil.strcmp(GXutil.rtrim( AV38seleccionar), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38seleccionar", AV38seleccionar);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV38seleccionar',fld:'vSELECCIONAR',pic:''},{av:'AV17ForCosForm',fld:'vFORCOSFORM',pic:'ZZZZ9.99999',hsh:true},{av:'AV7CliTipo',fld:'vCLITIPO',pic:'@!',hsh:true},{av:'AV18ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV31OldClasse',fld:'vOLDCLASSE',pic:'ZZZ9',hsh:true},{av:'AV44OldPreKgm',fld:'vOLDPREKGM',pic:'ZZZZZ9.999',hsh:true},{av:'AV45Index',fld:'vINDEX',pic:'ZZZ9',hsh:true},{av:'AV58Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCERRAR'","{handler:'e122BL2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOUSERACTION1'","{handler:'e132BL2',iparms:[{av:'AV10Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV21GrdTipArt',fld:'vGRDTIPART',pic:'ZZZ9'},{av:'AV23GrdTipDsc',fld:'vGRDTIPDSC',pic:''}]");
      setEventMetadata("'DOUSERACTION1'",",oparms:[{av:'AV23GrdTipDsc',fld:'vGRDTIPDSC',pic:''},{av:'AV21GrdTipArt',fld:'vGRDTIPART',pic:'ZZZ9'},{av:'AV10Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VGRDTIPART.CONTROLVALUECHANGED","{handler:'e142BL2',iparms:[{av:'AV10Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV17ForCosForm',fld:'vFORCOSFORM',pic:'ZZZZ9.99999',hsh:true},{av:'AV21GrdTipArt',fld:'vGRDTIPART',pic:'ZZZ9'},{av:'AV7CliTipo',fld:'vCLITIPO',pic:'@!',hsh:true},{av:'AV18ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("VGRDTIPART.CONTROLVALUECHANGED",",oparms:[{av:'AV41Ti',fld:'vTI',pic:'ZZZ9'},{av:'AV36PV',fld:'vPV',pic:'ZZZZZ9.999'},{av:'AV12F_i',fld:'vF_I',pic:'ZZ9.9999'},{av:'AV24Mc',fld:'vMC',pic:'ZZ9.999'},{av:'AV14Fi',fld:'vFI',pic:'Z9.99999999'},{av:'AV8Cm',fld:'vCM',pic:'Z9.99999999'},{av:'AV5C_M',fld:'vC_M',pic:'Z9.99999999'},{av:'AV33Pc',fld:'vPC',pic:'ZZZZ9.99999'},{av:'AV26Mv',fld:'vMV',pic:'ZZZZZZ9.99'}]}");
      setEventMetadata("ENTER","{handler:'e152BL2',iparms:[{av:'AV45Index',fld:'vINDEX',pic:'ZZZ9',hsh:true},{av:'AV58Pgmname',fld:'vPGMNAME',pic:''},{av:'AV21GrdTipArt',fld:'vGRDTIPART',pic:'ZZZ9'},{av:'AV54Precios_cliente_SDT',fld:'vPRECIOS_CLIENTE_SDT',pic:''},{av:'AV33Pc',fld:'vPC',pic:'ZZZZ9.99999'},{av:'AV26Mv',fld:'vMV',pic:'ZZZZZZ9.99'},{av:'AV36PV',fld:'vPV',pic:'ZZZZZ9.999'},{av:'AV19ForPreKgm',fld:'vFORPREKGM',pic:'ZZZZZ9.999'},{av:'AV28Obs',fld:'vOBS',pic:''},{av:'AV5C_M',fld:'vC_M',pic:'Z9.99999999'},{av:'AV24Mc',fld:'vMC',pic:'ZZ9.999'},{av:'AV41Ti',fld:'vTI',pic:'ZZZ9'},{av:'AV8Cm',fld:'vCM',pic:'Z9.99999999'},{av:'AV14Fi',fld:'vFI',pic:'Z9.99999999'},{av:'AV12F_i',fld:'vF_I',pic:'ZZ9.9999'},{av:'AV31OldClasse',fld:'vOLDCLASSE',pic:'ZZZ9',hsh:true},{av:'AV38seleccionar',fld:'vSELECCIONAR',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV54Precios_cliente_SDT',fld:'vPRECIOS_CLIENTE_SDT',pic:''}]}");
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
      AV17ForCosForm = DecimalUtil.ZERO ;
      AV7CliTipo = "" ;
      AV44OldPreKgm = DecimalUtil.ZERO ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV58Pgmname = "" ;
      AV10Emprcod = "" ;
      AV54Precios_cliente_SDT = new GXBaseCollection<app.facturacion.SdtPrecios_cliente_SDT_Item>(app.facturacion.SdtPrecios_cliente_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV5C_M = DecimalUtil.ZERO ;
      AV24Mc = DecimalUtil.ZERO ;
      AV8Cm = DecimalUtil.ZERO ;
      AV14Fi = DecimalUtil.ZERO ;
      AV12F_i = DecimalUtil.ZERO ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV38seleccionar = "" ;
      imgUseraction1_gximage = "" ;
      sImgUrl = "" ;
      imgUseraction1_Jsonclick = "" ;
      AV23GrdTipDsc = "" ;
      AV33Pc = DecimalUtil.ZERO ;
      AV26Mv = DecimalUtil.ZERO ;
      AV36PV = DecimalUtil.ZERO ;
      AV19ForPreKgm = DecimalUtil.ZERO ;
      AV28Obs = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      hsh = "" ;
      AV53CadenaDataJSON = "" ;
      AV55WebSession = httpContext.getWebSession();
      AV40Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV43UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV35Pcm = DecimalUtil.ZERO ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      AV16ForCan = DecimalUtil.ZERO ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_int14 = new short[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      AV58Pgmname = "Facturacion.Precios_cliente_simulacion" ;
      /* GeneXus formulas. */
      AV58Pgmname = "Facturacion.Precios_cliente_simulacion" ;
      Gx_err = (short)(0) ;
      edtavIndex_Enabled = 0 ;
      edtavGrdtipdsc_Enabled = 0 ;
      edtavPc_Enabled = 0 ;
      edtavPv_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wcpOAV45Index ;
   private short AV45Index ;
   private short AV31OldClasse ;
   private short AV41Ti ;
   private short wbEnd ;
   private short wbStart ;
   private short AV21GrdTipArt ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXt_int5 ;
   private short GXv_int14[] ;
   private int AV18ForNumCol ;
   private int edtavIndex_Enabled ;
   private int edtavGrdtipart_Enabled ;
   private int edtavGrdtipdsc_Enabled ;
   private int edtavPc_Enabled ;
   private int edtavMv_Enabled ;
   private int edtavPv_Enabled ;
   private int edtavForprekgm_Enabled ;
   private int edtavObs_Enabled ;
   private int edtavPgmname_Enabled ;
   private int idxLst ;
   private java.math.BigDecimal AV17ForCosForm ;
   private java.math.BigDecimal AV44OldPreKgm ;
   private java.math.BigDecimal AV5C_M ;
   private java.math.BigDecimal AV24Mc ;
   private java.math.BigDecimal AV8Cm ;
   private java.math.BigDecimal AV14Fi ;
   private java.math.BigDecimal AV12F_i ;
   private java.math.BigDecimal AV33Pc ;
   private java.math.BigDecimal AV26Mv ;
   private java.math.BigDecimal AV36PV ;
   private java.math.BigDecimal AV19ForPreKgm ;
   private java.math.BigDecimal AV35Pcm ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal AV16ForCan ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV7CliTipo ;
   private String GXKey ;
   private String AV58Pgmname ;
   private String AV10Emprcod ;
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
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String TempTags ;
   private String AV38seleccionar ;
   private String edtavIndex_Internalname ;
   private String edtavIndex_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtavGrdtipart_Internalname ;
   private String edtavGrdtipart_Jsonclick ;
   private String imgUseraction1_gximage ;
   private String sImgUrl ;
   private String imgUseraction1_Internalname ;
   private String imgUseraction1_Jsonclick ;
   private String edtavGrdtipdsc_Internalname ;
   private String AV23GrdTipDsc ;
   private String edtavGrdtipdsc_Jsonclick ;
   private String edtavPc_Internalname ;
   private String edtavPc_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtavMv_Internalname ;
   private String edtavMv_Jsonclick ;
   private String edtavPv_Internalname ;
   private String edtavPv_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String edtavForprekgm_Internalname ;
   private String edtavForprekgm_Jsonclick ;
   private String edtavObs_Internalname ;
   private String AV28Obs ;
   private String edtavObs_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String hsh ;
   private String AV40Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV43UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
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
   private boolean AV39seleccionarIN ;
   private String AV53CadenaDataJSON ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV55WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavSeleccionar ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.facturacion.SdtPrecios_cliente_SDT_Item> AV54Precios_cliente_SDT ;
}

