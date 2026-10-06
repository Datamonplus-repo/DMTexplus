package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class salidasmanualesproductos_detalle_wp_impl extends GXDataArea
{
   public salidasmanualesproductos_detalle_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public salidasmanualesproductos_detalle_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( salidasmanualesproductos_detalle_wp_impl.class ));
   }

   public salidasmanualesproductos_detalle_wp_impl( int remoteHandle ,
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
         gxfirstwebparm = httpContext.GetFirstPar( "WebSessionKey_LCumco") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "WebSessionKey_LCumco") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "WebSessionKey_LCumco") ;
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
            AV11WebSessionKey_LCumco = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11WebSessionKey_LCumco", AV11WebSessionKey_LCumco);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV12WebSessionKey_LCumCos = httpContext.GetPar( "WebSessionKey_LCumCos") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12WebSessionKey_LCumCos", AV12WebSessionKey_LCumCos);
               AV13WebSessionKey_LCumCo_Ok = httpContext.GetPar( "WebSessionKey_LCumCo_Ok") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13WebSessionKey_LCumCo_Ok", AV13WebSessionKey_LCumCo_Ok);
               AV14WebSessionKey_LCumCo_Index = httpContext.GetPar( "WebSessionKey_LCumCo_Index") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14WebSessionKey_LCumCo_Index", AV14WebSessionKey_LCumCo_Index);
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
      pa1D02( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1D02( ) ;
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
      httpContext.writeText( " "+"class=\"form-horizontal FormSplitScreen\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal FormSplitScreen\" data-gx-class=\"form-horizontal FormSplitScreen\" novalidate action=\""+formatLink("app.salidasmanualesproductos_detalle_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11WebSessionKey_LCumco)),GXutil.URLEncode(GXutil.rtrim(AV12WebSessionKey_LCumCos)),GXutil.URLEncode(GXutil.rtrim(AV13WebSessionKey_LCumCo_Ok)),GXutil.URLEncode(GXutil.rtrim(AV14WebSessionKey_LCumCo_Index))}, new String[] {"WebSessionKey_LCumco","WebSessionKey_LCumCos","WebSessionKey_LCumCo_Ok","WebSessionKey_LCumCo_Index"}) +"\">") ;
      app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal FormSplitScreen", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALIDASMANUALESPRODUCTOS_DETALLE_SDTS", getSecureSignedToken( "", AV8SalidasManualesProductos_Detalle_SDTs));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Salidasmanualesproductos_detalle_sdt", AV5SalidasManualesProductos_Detalle_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Salidasmanualesproductos_detalle_sdt", AV5SalidasManualesProductos_Detalle_SDT);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSALIDASMANUALESPRODUCTOS_DETALLE_SDTS", AV8SalidasManualesProductos_Detalle_SDTs);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSALIDASMANUALESPRODUCTOS_DETALLE_SDTS", AV8SalidasManualesProductos_Detalle_SDTs);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALIDASMANUALESPRODUCTOS_DETALLE_SDTS", getSecureSignedToken( "", AV8SalidasManualesProductos_Detalle_SDTs));
      app.GxWebStd.gx_hidden_field( httpContext, "vWEBSESSIONKEY_LCUMCO", AV11WebSessionKey_LCumco);
      app.GxWebStd.gx_hidden_field( httpContext, "vWEBSESSIONKEY_LCUMCO_OK", AV13WebSessionKey_LCumCo_Ok);
      app.GxWebStd.gx_hidden_field( httpContext, "vWEBSESSIONKEY_LCUMCO_INDEX", AV14WebSessionKey_LCumCo_Index);
      app.GxWebStd.gx_hidden_field( httpContext, "vWEBSESSIONKEY_LCUMCOS", AV12WebSessionKey_LCumCos);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM", GXutil.rtrim( A719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM", GXutil.rtrim( A718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDFACCON", GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXIALM", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCANRES", GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSALIDASMANUALESPRODUCTOS_DETALLE_SDT", AV5SalidasManualesProductos_Detalle_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSALIDASMANUALESPRODUCTOS_DETALLE_SDT", AV5SalidasManualesProductos_Detalle_SDT);
      }
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
         app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal FormSplitScreen" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we1D02( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1D02( ) ;
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
      return formatLink("app.salidasmanualesproductos_detalle_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11WebSessionKey_LCumco)),GXutil.URLEncode(GXutil.rtrim(AV12WebSessionKey_LCumCos)),GXutil.URLEncode(GXutil.rtrim(AV13WebSessionKey_LCumCo_Ok)),GXutil.URLEncode(GXutil.rtrim(AV14WebSessionKey_LCumCo_Index))}, new String[] {"WebSessionKey_LCumco","WebSessionKey_LCumCos","WebSessionKey_LCumCo_Ok","WebSessionKey_LCumCo_Index"})  ;
   }

   public String getPgmname( )
   {
      return "SalidasManualesProductos_Detalle_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Salidas Manuales Productos", "") ;
   }

   public void wb1D00( )
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalidasmanualesproductos_detalle_sdt_prdnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalidasmanualesproductos_detalle_sdt_prdnum_Internalname, httpContext.getMessage( "Codigo Producto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalidasmanualesproductos_detalle_sdt_prdnum_Internalname, GXutil.rtrim( AV5SalidasManualesProductos_Detalle_SDT.getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnum()), GXutil.rtrim( localUtil.format( AV5SalidasManualesProductos_Detalle_SDT.getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnum(), "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalidasmanualesproductos_detalle_sdt_prdnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalidasmanualesproductos_detalle_sdt_prdnum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_SalidasManualesProductos_Detalle_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalidasmanualesproductos_detalle_sdt_prdnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalidasmanualesproductos_detalle_sdt_prdnom_Internalname, httpContext.getMessage( "Descripcion del Producto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalidasmanualesproductos_detalle_sdt_prdnom_Internalname, GXutil.rtrim( AV5SalidasManualesProductos_Detalle_SDT.getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnom()), GXutil.rtrim( localUtil.format( AV5SalidasManualesProductos_Detalle_SDT.getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnom(), "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalidasmanualesproductos_detalle_sdt_prdnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalidasmanualesproductos_detalle_sdt_prdnom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_SalidasManualesProductos_Detalle_WP.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalidasmanualesproductos_detalle_sdt_prdfaccon_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalidasmanualesproductos_detalle_sdt_prdfaccon_Internalname, httpContext.getMessage( "Factor de Conversion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalidasmanualesproductos_detalle_sdt_prdfaccon_Internalname, GXutil.ltrim( localUtil.ntoc( AV5SalidasManualesProductos_Detalle_SDT.getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdfaccon(), (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavSalidasmanualesproductos_detalle_sdt_prdfaccon_Enabled!=0) ? localUtil.format( AV5SalidasManualesProductos_Detalle_SDT.getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdfaccon(), "Z9.9999") : localUtil.format( AV5SalidasManualesProductos_Detalle_SDT.getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdfaccon(), "Z9.9999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalidasmanualesproductos_detalle_sdt_prdfaccon_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalidasmanualesproductos_detalle_sdt_prdfaccon_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SalidasManualesProductos_Detalle_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalidasmanualesproductos_detalle_sdt_prdexialm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalidasmanualesproductos_detalle_sdt_prdexialm_Internalname, httpContext.getMessage( "Existencias Almacen", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalidasmanualesproductos_detalle_sdt_prdexialm_Internalname, GXutil.ltrim( localUtil.ntoc( AV5SalidasManualesProductos_Detalle_SDT.getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexialm(), (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavSalidasmanualesproductos_detalle_sdt_prdexialm_Enabled!=0) ? localUtil.format( AV5SalidasManualesProductos_Detalle_SDT.getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexialm(), "ZZZZZZ9.9999") : localUtil.format( AV5SalidasManualesProductos_Detalle_SDT.getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexialm(), "ZZZZZZ9.9999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalidasmanualesproductos_detalle_sdt_prdexialm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalidasmanualesproductos_detalle_sdt_prdexialm_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SalidasManualesProductos_Detalle_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalidasmanualesproductos_detalle_sdt_prdcanres_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalidasmanualesproductos_detalle_sdt_prdcanres_Internalname, httpContext.getMessage( "Cantidad Reservada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalidasmanualesproductos_detalle_sdt_prdcanres_Internalname, GXutil.ltrim( localUtil.ntoc( AV5SalidasManualesProductos_Detalle_SDT.getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcanres(), (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavSalidasmanualesproductos_detalle_sdt_prdcanres_Enabled!=0) ? localUtil.format( AV5SalidasManualesProductos_Detalle_SDT.getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcanres(), "ZZZZZZ9.9999") : localUtil.format( AV5SalidasManualesProductos_Detalle_SDT.getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcanres(), "ZZZZZZ9.9999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalidasmanualesproductos_detalle_sdt_prdcanres_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalidasmanualesproductos_detalle_sdt_prdcanres_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SalidasManualesProductos_Detalle_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalidasmanualesproductos_detalle_sdt_cumconcant_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalidasmanualesproductos_detalle_sdt_cumconcant_Internalname, httpContext.getMessage( "Cantidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalidasmanualesproductos_detalle_sdt_cumconcant_Internalname, GXutil.ltrim( localUtil.ntoc( AV5SalidasManualesProductos_Detalle_SDT.getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcant(), (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavSalidasmanualesproductos_detalle_sdt_cumconcant_Enabled!=0) ? localUtil.format( AV5SalidasManualesProductos_Detalle_SDT.getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcant(), "ZZZZZZ9.9999") : localUtil.format( AV5SalidasManualesProductos_Detalle_SDT.getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcant(), "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalidasmanualesproductos_detalle_sdt_cumconcant_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalidasmanualesproductos_detalle_sdt_cumconcant_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SalidasManualesProductos_Detalle_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalidasmanualesproductos_detalle_sdt_cumunidad_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalidasmanualesproductos_detalle_sdt_cumunidad_Internalname, httpContext.getMessage( "Unidad Consumo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalidasmanualesproductos_detalle_sdt_cumunidad_Internalname, GXutil.ltrim( localUtil.ntoc( AV5SalidasManualesProductos_Detalle_SDT.getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumunidad(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavSalidasmanualesproductos_detalle_sdt_cumunidad_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV5SalidasManualesProductos_Detalle_SDT.getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumunidad()), "9") : localUtil.format( DecimalUtil.doubleToDec(AV5SalidasManualesProductos_Detalle_SDT.getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumunidad()), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalidasmanualesproductos_detalle_sdt_cumunidad_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalidasmanualesproductos_detalle_sdt_cumunidad_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SalidasManualesProductos_Detalle_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalidasmanualesproductos_detalle_sdt_cumconlot_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalidasmanualesproductos_detalle_sdt_cumconlot_Internalname, httpContext.getMessage( "Lote Producto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalidasmanualesproductos_detalle_sdt_cumconlot_Internalname, GXutil.rtrim( AV5SalidasManualesProductos_Detalle_SDT.getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconlot()), GXutil.rtrim( localUtil.format( AV5SalidasManualesProductos_Detalle_SDT.getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconlot(), "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalidasmanualesproductos_detalle_sdt_cumconlot_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalidasmanualesproductos_detalle_sdt_cumconlot_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_SalidasManualesProductos_Detalle_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SalidasManualesProductos_Detalle_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtncancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SalidasManualesProductos_Detalle_WP.htm");
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalidasmanualesproductos_detalle_sdt_emprcod_Internalname, GXutil.rtrim( AV5SalidasManualesProductos_Detalle_SDT.getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprcod()), GXutil.rtrim( localUtil.format( AV5SalidasManualesProductos_Detalle_SDT.getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprcod(), "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalidasmanualesproductos_detalle_sdt_emprcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavSalidasmanualesproductos_detalle_sdt_emprcod_Visible, 1, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_SalidasManualesProductos_Detalle_WP.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalidasmanualesproductos_detalle_sdt_cumcodcont_Internalname, GXutil.ltrim( localUtil.ntoc( AV5SalidasManualesProductos_Detalle_SDT.getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcodcont(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV5SalidasManualesProductos_Detalle_SDT.getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcodcont()), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalidasmanualesproductos_detalle_sdt_cumcodcont_Jsonclick, 0, "Attribute", "", "", "", "", edtavSalidasmanualesproductos_detalle_sdt_cumcodcont_Visible, 1, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_SalidasManualesProductos_Detalle_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1D02( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Salidas Manuales Productos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1D00( ) ;
   }

   public void ws1D02( )
   {
      start1D02( ) ;
      evt1D02( ) ;
   }

   public void evt1D02( )
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
                           e111D02 ();
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
                                 e121D02 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "SALIDASMANUALESPRODUCTOS_DETALLE_SDT_PRDNUM.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131D02 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e141D02 ();
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

   public void we1D02( )
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

   public void pa1D02( )
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
            GX_FocusControl = edtavSalidasmanualesproductos_detalle_sdt_prdnum_Internalname ;
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
      rf1D02( ) ;
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
      edtavSalidasmanualesproductos_detalle_sdt_prdfaccon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdt_prdfaccon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdt_prdfaccon_Enabled), 5, 0), true);
      edtavSalidasmanualesproductos_detalle_sdt_prdexialm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdt_prdexialm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdt_prdexialm_Enabled), 5, 0), true);
      edtavSalidasmanualesproductos_detalle_sdt_prdcanres_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdt_prdcanres_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdt_prdcanres_Enabled), 5, 0), true);
   }

   public void rf1D02( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e141D02 ();
         wb1D00( ) ;
      }
   }

   public void send_integrity_lvl_hashes1D02( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSALIDASMANUALESPRODUCTOS_DETALLE_SDTS", AV8SalidasManualesProductos_Detalle_SDTs);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSALIDASMANUALESPRODUCTOS_DETALLE_SDTS", AV8SalidasManualesProductos_Detalle_SDTs);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALIDASMANUALESPRODUCTOS_DETALLE_SDTS", getSecureSignedToken( "", AV8SalidasManualesProductos_Detalle_SDTs));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavSalidasmanualesproductos_detalle_sdt_prdfaccon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdt_prdfaccon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdt_prdfaccon_Enabled), 5, 0), true);
      edtavSalidasmanualesproductos_detalle_sdt_prdexialm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdt_prdexialm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdt_prdexialm_Enabled), 5, 0), true);
      edtavSalidasmanualesproductos_detalle_sdt_prdcanres_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdt_prdcanres_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdt_prdcanres_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1D00( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111D02 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vSALIDASMANUALESPRODUCTOS_DETALLE_SDT"), AV5SalidasManualesProductos_Detalle_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Salidasmanualesproductos_detalle_sdt"), AV5SalidasManualesProductos_Detalle_SDT);
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
         /* Read variables values. */
         AV5SalidasManualesProductos_Detalle_SDT.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnum( httpContext.cgiGet( edtavSalidasmanualesproductos_detalle_sdt_prdnum_Internalname) );
         AV5SalidasManualesProductos_Detalle_SDT.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnom( httpContext.cgiGet( edtavSalidasmanualesproductos_detalle_sdt_prdnom_Internalname) );
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavSalidasmanualesproductos_detalle_sdt_prdfaccon_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavSalidasmanualesproductos_detalle_sdt_prdfaccon_Internalname)), DecimalUtil.stringToDec("99.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SALIDASMANUALESPRODUCTOS_DETALLE_SDT_PRDFACCON");
            GX_FocusControl = edtavSalidasmanualesproductos_detalle_sdt_prdfaccon_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5SalidasManualesProductos_Detalle_SDT.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdfaccon( DecimalUtil.ZERO );
         }
         else
         {
            AV5SalidasManualesProductos_Detalle_SDT.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdfaccon( localUtil.ctond( httpContext.cgiGet( edtavSalidasmanualesproductos_detalle_sdt_prdfaccon_Internalname)) );
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavSalidasmanualesproductos_detalle_sdt_prdexialm_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavSalidasmanualesproductos_detalle_sdt_prdexialm_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SALIDASMANUALESPRODUCTOS_DETALLE_SDT_PRDEXIALM");
            GX_FocusControl = edtavSalidasmanualesproductos_detalle_sdt_prdexialm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5SalidasManualesProductos_Detalle_SDT.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexialm( DecimalUtil.ZERO );
         }
         else
         {
            AV5SalidasManualesProductos_Detalle_SDT.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexialm( localUtil.ctond( httpContext.cgiGet( edtavSalidasmanualesproductos_detalle_sdt_prdexialm_Internalname)) );
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavSalidasmanualesproductos_detalle_sdt_prdcanres_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavSalidasmanualesproductos_detalle_sdt_prdcanres_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SALIDASMANUALESPRODUCTOS_DETALLE_SDT_PRDCANRES");
            GX_FocusControl = edtavSalidasmanualesproductos_detalle_sdt_prdcanres_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5SalidasManualesProductos_Detalle_SDT.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcanres( DecimalUtil.ZERO );
         }
         else
         {
            AV5SalidasManualesProductos_Detalle_SDT.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcanres( localUtil.ctond( httpContext.cgiGet( edtavSalidasmanualesproductos_detalle_sdt_prdcanres_Internalname)) );
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavSalidasmanualesproductos_detalle_sdt_cumconcant_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavSalidasmanualesproductos_detalle_sdt_cumconcant_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SALIDASMANUALESPRODUCTOS_DETALLE_SDT_CUMCONCANT");
            GX_FocusControl = edtavSalidasmanualesproductos_detalle_sdt_cumconcant_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5SalidasManualesProductos_Detalle_SDT.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcant( DecimalUtil.ZERO );
         }
         else
         {
            AV5SalidasManualesProductos_Detalle_SDT.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcant( localUtil.ctond( httpContext.cgiGet( edtavSalidasmanualesproductos_detalle_sdt_cumconcant_Internalname)) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavSalidasmanualesproductos_detalle_sdt_cumunidad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavSalidasmanualesproductos_detalle_sdt_cumunidad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SALIDASMANUALESPRODUCTOS_DETALLE_SDT_CUMUNIDAD");
            GX_FocusControl = edtavSalidasmanualesproductos_detalle_sdt_cumunidad_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5SalidasManualesProductos_Detalle_SDT.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumunidad( (byte)(0) );
         }
         else
         {
            AV5SalidasManualesProductos_Detalle_SDT.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumunidad( (byte)(localUtil.ctol( httpContext.cgiGet( edtavSalidasmanualesproductos_detalle_sdt_cumunidad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
         }
         AV5SalidasManualesProductos_Detalle_SDT.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconlot( httpContext.cgiGet( edtavSalidasmanualesproductos_detalle_sdt_cumconlot_Internalname) );
         AV5SalidasManualesProductos_Detalle_SDT.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprcod( GXutil.upper( httpContext.cgiGet( edtavSalidasmanualesproductos_detalle_sdt_emprcod_Internalname)) );
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavSalidasmanualesproductos_detalle_sdt_cumcodcont_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavSalidasmanualesproductos_detalle_sdt_cumcodcont_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SALIDASMANUALESPRODUCTOS_DETALLE_SDT_CUMCODCONT");
            GX_FocusControl = edtavSalidasmanualesproductos_detalle_sdt_cumcodcont_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5SalidasManualesProductos_Detalle_SDT.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcodcont( 0 );
         }
         else
         {
            AV5SalidasManualesProductos_Detalle_SDT.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcodcont( (int)(localUtil.ctol( httpContext.cgiGet( edtavSalidasmanualesproductos_detalle_sdt_cumcodcont_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
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
      e111D02 ();
      if (returnInSub) return;
   }

   public void e111D02( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV30Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      salidasmanualesproductos_detalle_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV30Station = GXt_char1 ;
      GXv_char2[0] = AV31Emprcod ;
      GXv_char3[0] = AV32Emprnom ;
      GXv_char4[0] = AV33Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV30Station, GXv_char2, GXv_char3, GXv_char4) ;
      salidasmanualesproductos_detalle_wp_impl.this.AV31Emprcod = GXv_char2[0] ;
      salidasmanualesproductos_detalle_wp_impl.this.AV32Emprnom = GXv_char3[0] ;
      salidasmanualesproductos_detalle_wp_impl.this.AV33Usurcod = GXv_char4[0] ;
      edtavSalidasmanualesproductos_detalle_sdt_emprcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdt_emprcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdt_emprcod_Visible), 5, 0), true);
      edtavSalidasmanualesproductos_detalle_sdt_cumcodcont_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdt_cumcodcont_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdt_cumcodcont_Visible), 5, 0), true);
      AV5SalidasManualesProductos_Detalle_SDT.fromJSonString(AV9WebSession.getValue(AV11WebSessionKey_LCumco), null);
      AV8SalidasManualesProductos_Detalle_SDTs.fromJSonString(AV9WebSession.getValue(AV12WebSessionKey_LCumCos), null);
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e121D02 ();
      if (returnInSub) return;
   }

   public void e121D02( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV16Messages.clear();
      AV34I = (byte)(1) ;
      while ( AV34I <= AV8SalidasManualesProductos_Detalle_SDTs.size() )
      {
         if ( GXutil.strcmp(((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV8SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV34I)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnum(), AV5SalidasManualesProductos_Detalle_SDT.getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnum()) == 0 )
         {
            AV17Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
            AV17Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Producto, ya existente.", "") );
            AV16Messages.add(AV17Message, 0);
         }
         AV34I = (byte)(AV34I+1) ;
      }
      if ( (GXutil.strcmp("", AV5SalidasManualesProductos_Detalle_SDT.getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnum())==0) )
      {
         AV17Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV17Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Producto NO Valido", "") );
         AV16Messages.add(AV17Message, 0);
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV5SalidasManualesProductos_Detalle_SDT.getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcant())==0) )
      {
         AV17Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV17Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "NO ha introducido Cantidad", "") );
         AV16Messages.add(AV17Message, 0);
      }
      if ( AV16Messages.size() == 0 )
      {
         AV9WebSession.setValue(AV11WebSessionKey_LCumco, AV5SalidasManualesProductos_Detalle_SDT.toJSonString(false, true));
         AV9WebSession.setValue(AV13WebSessionKey_LCumCo_Ok, httpContext.getMessage( "S", ""));
         httpContext.setWebReturnParms(new Object[] {AV11WebSessionKey_LCumco,AV12WebSessionKey_LCumCos,AV13WebSessionKey_LCumCo_Ok,AV14WebSessionKey_LCumCo_Index});
         httpContext.setWebReturnParmsMetadata(new Object[] {"AV11WebSessionKey_LCumco","AV12WebSessionKey_LCumCos","AV13WebSessionKey_LCumCo_Ok","AV14WebSessionKey_LCumCo_Index"});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      else
      {
         AV35GXV11 = 1 ;
         while ( AV35GXV11 <= AV16Messages.size() )
         {
            AV17Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV16Messages.elementAt(-1+AV35GXV11));
            httpContext.GX_msglist.addItem(AV17Message.getgxTv_SdtMessages_Message_Description());
            AV35GXV11 = (int)(AV35GXV11+1) ;
         }
      }
      /*  Sending Event outputs  */
   }

   public void e131D02( )
   {
      /* Salidasmanualesproductos_detalle_sdt_prdnum_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'VALIDARPRODUCTO' */
      S112 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5SalidasManualesProductos_Detalle_SDT", AV5SalidasManualesProductos_Detalle_SDT);
   }

   public void S112( )
   {
      /* 'VALIDARPRODUCTO' Routine */
      returnInSub = false ;
      AV36GXLvl74 = (byte)(0) ;
      /* Using cursor H01D02 */
      pr_default.execute(0, new Object[] {AV5SalidasManualesProductos_Detalle_SDT.getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprcod(), AV5SalidasManualesProductos_Detalle_SDT.getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnum()});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = H01D02_A719PrdNum[0] ;
         A396EmprCod = H01D02_A396EmprCod[0] ;
         A718PrdNom = H01D02_A718PrdNom[0] ;
         A707PrdFacCon = H01D02_A707PrdFacCon[0] ;
         A704PrdExiAlm = H01D02_A704PrdExiAlm[0] ;
         A685PrdCanRes = H01D02_A685PrdCanRes[0] ;
         AV36GXLvl74 = (byte)(1) ;
         AV5SalidasManualesProductos_Detalle_SDT.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnom( A718PrdNom );
         AV5SalidasManualesProductos_Detalle_SDT.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdfaccon( A707PrdFacCon );
         AV5SalidasManualesProductos_Detalle_SDT.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexialm( A704PrdExiAlm );
         AV5SalidasManualesProductos_Detalle_SDT.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcanres( A685PrdCanRes );
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV36GXLvl74 == 0 )
      {
         AV5SalidasManualesProductos_Detalle_SDT.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnom( httpContext.getMessage( "Error. Producto Inexistente", "") );
         AV5SalidasManualesProductos_Detalle_SDT.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdfaccon( DecimalUtil.doubleToDec(0) );
         AV5SalidasManualesProductos_Detalle_SDT.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexialm( DecimalUtil.doubleToDec(0) );
         AV5SalidasManualesProductos_Detalle_SDT.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcanres( DecimalUtil.doubleToDec(0) );
         GX_FocusControl = edtavSalidasmanualesproductos_detalle_sdt_prdnum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e141D02( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV11WebSessionKey_LCumco = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11WebSessionKey_LCumco", AV11WebSessionKey_LCumco);
      AV12WebSessionKey_LCumCos = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12WebSessionKey_LCumCos", AV12WebSessionKey_LCumCos);
      AV13WebSessionKey_LCumCo_Ok = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13WebSessionKey_LCumCo_Ok", AV13WebSessionKey_LCumCo_Ok);
      AV14WebSessionKey_LCumCo_Index = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14WebSessionKey_LCumCo_Index", AV14WebSessionKey_LCumCo_Index);
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
      pa1D02( ) ;
      ws1D02( ) ;
      we1D02( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266101643818", true, true);
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
      httpContext.AddJavascriptSource("salidasmanualesproductos_detalle_wp.js", "?20266101643818", false, true);
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
      edtavSalidasmanualesproductos_detalle_sdt_prdnum_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDT_PRDNUM" ;
      edtavSalidasmanualesproductos_detalle_sdt_prdnom_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDT_PRDNOM" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtavSalidasmanualesproductos_detalle_sdt_prdfaccon_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDT_PRDFACCON" ;
      edtavSalidasmanualesproductos_detalle_sdt_prdexialm_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDT_PRDEXIALM" ;
      edtavSalidasmanualesproductos_detalle_sdt_prdcanres_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDT_PRDCANRES" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavSalidasmanualesproductos_detalle_sdt_cumconcant_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDT_CUMCONCANT" ;
      edtavSalidasmanualesproductos_detalle_sdt_cumunidad_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDT_CUMUNIDAD" ;
      edtavSalidasmanualesproductos_detalle_sdt_cumconlot_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDT_CUMCONLOT" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncancel_Internalname = "BTNCANCEL" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavSalidasmanualesproductos_detalle_sdt_emprcod_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDT_EMPRCOD" ;
      edtavSalidasmanualesproductos_detalle_sdt_cumcodcont_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDT_CUMCODCONT" ;
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
      edtavSalidasmanualesproductos_detalle_sdt_prdcanres_Enabled = -1 ;
      edtavSalidasmanualesproductos_detalle_sdt_prdexialm_Enabled = -1 ;
      edtavSalidasmanualesproductos_detalle_sdt_prdfaccon_Enabled = -1 ;
      edtavSalidasmanualesproductos_detalle_sdt_cumcodcont_Jsonclick = "" ;
      edtavSalidasmanualesproductos_detalle_sdt_cumcodcont_Visible = 1 ;
      edtavSalidasmanualesproductos_detalle_sdt_emprcod_Jsonclick = "" ;
      edtavSalidasmanualesproductos_detalle_sdt_emprcod_Visible = 1 ;
      edtavSalidasmanualesproductos_detalle_sdt_cumconlot_Jsonclick = "" ;
      edtavSalidasmanualesproductos_detalle_sdt_cumconlot_Enabled = 1 ;
      edtavSalidasmanualesproductos_detalle_sdt_cumunidad_Jsonclick = "" ;
      edtavSalidasmanualesproductos_detalle_sdt_cumunidad_Enabled = 1 ;
      edtavSalidasmanualesproductos_detalle_sdt_cumconcant_Jsonclick = "" ;
      edtavSalidasmanualesproductos_detalle_sdt_cumconcant_Enabled = 1 ;
      edtavSalidasmanualesproductos_detalle_sdt_prdcanres_Jsonclick = "" ;
      edtavSalidasmanualesproductos_detalle_sdt_prdcanres_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdt_prdexialm_Jsonclick = "" ;
      edtavSalidasmanualesproductos_detalle_sdt_prdexialm_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdt_prdfaccon_Jsonclick = "" ;
      edtavSalidasmanualesproductos_detalle_sdt_prdfaccon_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdt_prdnom_Jsonclick = "" ;
      edtavSalidasmanualesproductos_detalle_sdt_prdnom_Enabled = 1 ;
      edtavSalidasmanualesproductos_detalle_sdt_prdnum_Jsonclick = "" ;
      edtavSalidasmanualesproductos_detalle_sdt_prdnum_Enabled = 1 ;
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
      Form.setCaption( httpContext.getMessage( "Salidas Manuales Productos", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV8SalidasManualesProductos_Detalle_SDTs',fld:'vSALIDASMANUALESPRODUCTOS_DETALLE_SDTS',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("ENTER","{handler:'e121D02',iparms:[{av:'AV8SalidasManualesProductos_Detalle_SDTs',fld:'vSALIDASMANUALESPRODUCTOS_DETALLE_SDTS',pic:'',hsh:true},{av:'AV5SalidasManualesProductos_Detalle_SDT',fld:'vSALIDASMANUALESPRODUCTOS_DETALLE_SDT',pic:''},{av:'AV11WebSessionKey_LCumco',fld:'vWEBSESSIONKEY_LCUMCO',pic:''},{av:'AV13WebSessionKey_LCumCo_Ok',fld:'vWEBSESSIONKEY_LCUMCO_OK',pic:''},{av:'AV14WebSessionKey_LCumCo_Index',fld:'vWEBSESSIONKEY_LCUMCO_INDEX',pic:''},{av:'AV12WebSessionKey_LCumCos',fld:'vWEBSESSIONKEY_LCUMCOS',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("SALIDASMANUALESPRODUCTOS_DETALLE_SDT_PRDNUM.CONTROLVALUECHANGED","{handler:'e131D02',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV5SalidasManualesProductos_Detalle_SDT',fld:'vSALIDASMANUALESPRODUCTOS_DETALLE_SDT',pic:''},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A685PrdCanRes',fld:'PRDCANRES',pic:'ZZZZZZ9.9999'}]");
      setEventMetadata("SALIDASMANUALESPRODUCTOS_DETALLE_SDT_PRDNUM.CONTROLVALUECHANGED",",oparms:[{av:'AV5SalidasManualesProductos_Detalle_SDT',fld:'vSALIDASMANUALESPRODUCTOS_DETALLE_SDT',pic:''}]}");
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
      wcpOAV11WebSessionKey_LCumco = "" ;
      wcpOAV12WebSessionKey_LCumCos = "" ;
      wcpOAV13WebSessionKey_LCumCo_Ok = "" ;
      wcpOAV14WebSessionKey_LCumCo_Index = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV11WebSessionKey_LCumco = "" ;
      AV12WebSessionKey_LCumCos = "" ;
      AV13WebSessionKey_LCumCo_Ok = "" ;
      AV14WebSessionKey_LCumCo_Index = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV8SalidasManualesProductos_Detalle_SDTs = new GXBaseCollection<app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT>(app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT.class, "SalidasManualesProductos_Detalle_SDT", "TexplusNET", remoteHandle);
      GXKey = "" ;
      AV5SalidasManualesProductos_Detalle_SDT = new app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT(remoteHandle, context);
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      bttBtnenter_Jsonclick = "" ;
      bttBtncancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV30Station = "" ;
      GXt_char1 = "" ;
      AV31Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV32Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV33Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV9WebSession = httpContext.getWebSession();
      AV16Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV17Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      scmdbuf = "" ;
      H01D02_A719PrdNum = new String[] {""} ;
      H01D02_A396EmprCod = new String[] {""} ;
      H01D02_A718PrdNom = new String[] {""} ;
      H01D02_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01D02_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01D02_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.salidasmanualesproductos_detalle_wp__default(),
         new Object[] {
             new Object[] {
            H01D02_A719PrdNum, H01D02_A396EmprCod, H01D02_A718PrdNom, H01D02_A707PrdFacCon, H01D02_A704PrdExiAlm, H01D02_A685PrdCanRes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavSalidasmanualesproductos_detalle_sdt_prdfaccon_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdt_prdexialm_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdt_prdcanres_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte AV34I ;
   private byte AV36GXLvl74 ;
   private byte nGXWrapped ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtavSalidasmanualesproductos_detalle_sdt_prdnum_Enabled ;
   private int edtavSalidasmanualesproductos_detalle_sdt_prdnom_Enabled ;
   private int edtavSalidasmanualesproductos_detalle_sdt_prdfaccon_Enabled ;
   private int edtavSalidasmanualesproductos_detalle_sdt_prdexialm_Enabled ;
   private int edtavSalidasmanualesproductos_detalle_sdt_prdcanres_Enabled ;
   private int edtavSalidasmanualesproductos_detalle_sdt_cumconcant_Enabled ;
   private int edtavSalidasmanualesproductos_detalle_sdt_cumunidad_Enabled ;
   private int edtavSalidasmanualesproductos_detalle_sdt_cumconlot_Enabled ;
   private int edtavSalidasmanualesproductos_detalle_sdt_emprcod_Visible ;
   private int edtavSalidasmanualesproductos_detalle_sdt_cumcodcont_Visible ;
   private int AV35GXV11 ;
   private int idxLst ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String edtavSalidasmanualesproductos_detalle_sdt_prdnum_Internalname ;
   private String TempTags ;
   private String edtavSalidasmanualesproductos_detalle_sdt_prdnum_Jsonclick ;
   private String edtavSalidasmanualesproductos_detalle_sdt_prdnom_Internalname ;
   private String edtavSalidasmanualesproductos_detalle_sdt_prdnom_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavSalidasmanualesproductos_detalle_sdt_prdfaccon_Internalname ;
   private String edtavSalidasmanualesproductos_detalle_sdt_prdfaccon_Jsonclick ;
   private String edtavSalidasmanualesproductos_detalle_sdt_prdexialm_Internalname ;
   private String edtavSalidasmanualesproductos_detalle_sdt_prdexialm_Jsonclick ;
   private String edtavSalidasmanualesproductos_detalle_sdt_prdcanres_Internalname ;
   private String edtavSalidasmanualesproductos_detalle_sdt_prdcanres_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtavSalidasmanualesproductos_detalle_sdt_cumconcant_Internalname ;
   private String edtavSalidasmanualesproductos_detalle_sdt_cumconcant_Jsonclick ;
   private String edtavSalidasmanualesproductos_detalle_sdt_cumunidad_Internalname ;
   private String edtavSalidasmanualesproductos_detalle_sdt_cumunidad_Jsonclick ;
   private String edtavSalidasmanualesproductos_detalle_sdt_cumconlot_Internalname ;
   private String edtavSalidasmanualesproductos_detalle_sdt_cumconlot_Jsonclick ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncancel_Internalname ;
   private String bttBtncancel_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavSalidasmanualesproductos_detalle_sdt_emprcod_Internalname ;
   private String edtavSalidasmanualesproductos_detalle_sdt_emprcod_Jsonclick ;
   private String edtavSalidasmanualesproductos_detalle_sdt_cumcodcont_Internalname ;
   private String edtavSalidasmanualesproductos_detalle_sdt_cumcodcont_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV30Station ;
   private String GXt_char1 ;
   private String AV31Emprcod ;
   private String GXv_char2[] ;
   private String AV32Emprnom ;
   private String GXv_char3[] ;
   private String AV33Usurcod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
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
   private boolean Dvpanel_unnamedtable3_Autowidth ;
   private boolean Dvpanel_unnamedtable3_Autoheight ;
   private boolean Dvpanel_unnamedtable3_Collapsible ;
   private boolean Dvpanel_unnamedtable3_Collapsed ;
   private boolean Dvpanel_unnamedtable3_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable3_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private String wcpOAV11WebSessionKey_LCumco ;
   private String wcpOAV12WebSessionKey_LCumCos ;
   private String wcpOAV13WebSessionKey_LCumCo_Ok ;
   private String wcpOAV14WebSessionKey_LCumCo_Index ;
   private String AV11WebSessionKey_LCumco ;
   private String AV12WebSessionKey_LCumCos ;
   private String AV13WebSessionKey_LCumCo_Ok ;
   private String AV14WebSessionKey_LCumCo_Index ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV9WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private IDataStoreProvider pr_default ;
   private String[] H01D02_A719PrdNum ;
   private String[] H01D02_A396EmprCod ;
   private String[] H01D02_A718PrdNom ;
   private java.math.BigDecimal[] H01D02_A707PrdFacCon ;
   private java.math.BigDecimal[] H01D02_A704PrdExiAlm ;
   private java.math.BigDecimal[] H01D02_A685PrdCanRes ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV16Messages ;
   private GXBaseCollection<app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT> AV8SalidasManualesProductos_Detalle_SDTs ;
   private com.genexus.SdtMessages_Message AV17Message ;
   private app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT AV5SalidasManualesProductos_Detalle_SDT ;
}

final  class salidasmanualesproductos_detalle_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01D02", "SELECT PrdNum, EmprCod, PrdNom, PrdFacCon, PrdExiAlm, PrdCanRes FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
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
               return;
      }
   }

}

