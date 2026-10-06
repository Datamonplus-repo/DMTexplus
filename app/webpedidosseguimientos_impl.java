package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webpedidosseguimientos_impl extends GXDataArea
{
   public webpedidosseguimientos_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webpedidosseguimientos_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webpedidosseguimientos_impl.class ));
   }

   public webpedidosseguimientos_impl( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavPedsit = new HTMLChoice();
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vPRVNUM") == 0 )
         {
            A13719PrvNNom = httpContext.GetPar( "PrvNNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvprvnumYD0( A13719PrvNNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vPRDNUM") == 0 )
         {
            A13747PrdCDsc = httpContext.GetPar( "PrdCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvprdnumYD0( A13747PrdCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vPRVNUM") == 0 )
         {
            A13719PrvNNom = httpContext.GetPar( "PrvNNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvprvnumYD0( A13719PrvNNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vPRVNUM") == 0 )
         {
            hV6PrvNum = httpContext.GetPar( "hV6PrvNum") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvprvnumYD2( hV6PrvNum) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vPRDNUM") == 0 )
         {
            A13747PrdCDsc = httpContext.GetPar( "PrdCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvprdnumYD0( A13747PrdCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vPRDNUM") == 0 )
         {
            hV8PrdNum = httpContext.GetPar( "hV8PrdNum") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvprdnumYD2( hV8PrdNum) ;
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
      paYD2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startYD2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webpedidosseguimientos", new String[] {}, new String[] {}) +"\">") ;
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
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV10EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvPRVNUM", GXutil.ltrim( localUtil.ntoc( AV6PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvPRDNUM", GXutil.rtrim( AV8PrdNum));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL2_Width", GXutil.rtrim( Dvpanel_panel2_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL2_Autowidth", GXutil.booltostr( Dvpanel_panel2_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL2_Autoheight", GXutil.booltostr( Dvpanel_panel2_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL2_Cls", GXutil.rtrim( Dvpanel_panel2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL2_Title", GXutil.rtrim( Dvpanel_panel2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL2_Collapsible", GXutil.booltostr( Dvpanel_panel2_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL2_Collapsed", GXutil.booltostr( Dvpanel_panel2_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL2_Showcollapseicon", GXutil.booltostr( Dvpanel_panel2_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL2_Iconposition", GXutil.rtrim( Dvpanel_panel2_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL2_Autoscroll", GXutil.booltostr( Dvpanel_panel2_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL3_Width", GXutil.rtrim( Dvpanel_panel3_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL3_Autowidth", GXutil.booltostr( Dvpanel_panel3_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL3_Autoheight", GXutil.booltostr( Dvpanel_panel3_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL3_Cls", GXutil.rtrim( Dvpanel_panel3_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL3_Title", GXutil.rtrim( Dvpanel_panel3_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL3_Collapsible", GXutil.booltostr( Dvpanel_panel3_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL3_Collapsed", GXutil.booltostr( Dvpanel_panel3_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL3_Showcollapseicon", GXutil.booltostr( Dvpanel_panel3_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL3_Iconposition", GXutil.rtrim( Dvpanel_panel3_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL3_Autoscroll", GXutil.booltostr( Dvpanel_panel3_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL4_Width", GXutil.rtrim( Dvpanel_panel4_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL4_Autowidth", GXutil.booltostr( Dvpanel_panel4_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL4_Autoheight", GXutil.booltostr( Dvpanel_panel4_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL4_Cls", GXutil.rtrim( Dvpanel_panel4_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL4_Title", GXutil.rtrim( Dvpanel_panel4_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL4_Collapsible", GXutil.booltostr( Dvpanel_panel4_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL4_Collapsed", GXutil.booltostr( Dvpanel_panel4_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL4_Showcollapseicon", GXutil.booltostr( Dvpanel_panel4_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL4_Iconposition", GXutil.rtrim( Dvpanel_panel4_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL4_Autoscroll", GXutil.booltostr( Dvpanel_panel4_Autoscroll));
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
      if ( ! ( WebComp_Wcwcseguimientonpedido == null ) )
      {
         WebComp_Wcwcseguimientonpedido.componentjscripts();
      }
      if ( ! ( WebComp_Wcwcseguimientoproveedor == null ) )
      {
         WebComp_Wcwcseguimientoproveedor.componentjscripts();
      }
      if ( ! ( WebComp_Wcwcseguimientoproducto == null ) )
      {
         WebComp_Wcwcseguimientoproducto.componentjscripts();
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
         weYD2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtYD2( ) ;
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
      return formatLink("app.webpedidosseguimientos", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WebPedidosSeguimientos" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Seguimientos Pedidos", "") ;
   }

   public void wbYD0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPedcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPedcod_Internalname, httpContext.getMessage( "N Pedido", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPedcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV5PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPedcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV5PedCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV5PedCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPedcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPedcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebPedidosSeguimientos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "Image" + " " + ((GXutil.strcmp(imgPromptpedidos_gximage, "")==0) ? "GX_Image_prompt_Class" : "GX_Image_"+imgPromptpedidos_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgPromptpedidos_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 7, imgPromptpedidos_Jsonclick, "'"+""+"'"+",false,"+"'"+"e11yd1_client"+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WebPedidosSeguimientos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrvnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrvnum_Internalname, httpContext.getMessage( "Proveedor", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrvnum_Internalname, hV6PrvNum, GXutil.rtrim( localUtil.format( hV6PrvNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrvnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrvnum_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_WebPedidosSeguimientos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrdnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrdnum_Internalname, httpContext.getMessage( "Producto", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdnum_Internalname, hV8PrdNum, GXutil.rtrim( localUtil.format( hV8PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrdnum_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_WebPedidosSeguimientos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavPedsit.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavPedsit, cmbavPedsit.getInternalname(), GXutil.rtrim( AV7PedSit), 1, cmbavPedsit.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavPedsit.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "", true, (byte)(0), "HLP_WebPedidosSeguimientos.htm");
         cmbavPedsit.setValue( GXutil.rtrim( AV7PedSit) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavPedsit.getInternalname(), "Values", cmbavPedsit.ToJavascriptSource(), true);
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
         ucDvpanel_panel2.setProperty("Width", Dvpanel_panel2_Width);
         ucDvpanel_panel2.setProperty("AutoWidth", Dvpanel_panel2_Autowidth);
         ucDvpanel_panel2.setProperty("AutoHeight", Dvpanel_panel2_Autoheight);
         ucDvpanel_panel2.setProperty("Cls", Dvpanel_panel2_Cls);
         ucDvpanel_panel2.setProperty("Title", Dvpanel_panel2_Title);
         ucDvpanel_panel2.setProperty("Collapsible", Dvpanel_panel2_Collapsible);
         ucDvpanel_panel2.setProperty("Collapsed", Dvpanel_panel2_Collapsed);
         ucDvpanel_panel2.setProperty("ShowCollapseIcon", Dvpanel_panel2_Showcollapseicon);
         ucDvpanel_panel2.setProperty("IconPosition", Dvpanel_panel2_Iconposition);
         ucDvpanel_panel2.setProperty("AutoScroll", Dvpanel_panel2_Autoscroll);
         ucDvpanel_panel2.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel2_Internalname, "DVPANEL_PANEL2Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANEL2Container"+"Panel2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0044"+"", GXutil.rtrim( WebComp_Wcwcseguimientonpedido_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0044"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcseguimientonpedido_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcseguimientonpedido), GXutil.lower( WebComp_Wcwcseguimientonpedido_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0044"+"");
               }
               WebComp_Wcwcseguimientonpedido.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcseguimientonpedido), GXutil.lower( WebComp_Wcwcseguimientonpedido_Component)) != 0 )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panel3.setProperty("Width", Dvpanel_panel3_Width);
         ucDvpanel_panel3.setProperty("AutoWidth", Dvpanel_panel3_Autowidth);
         ucDvpanel_panel3.setProperty("AutoHeight", Dvpanel_panel3_Autoheight);
         ucDvpanel_panel3.setProperty("Cls", Dvpanel_panel3_Cls);
         ucDvpanel_panel3.setProperty("Title", Dvpanel_panel3_Title);
         ucDvpanel_panel3.setProperty("Collapsible", Dvpanel_panel3_Collapsible);
         ucDvpanel_panel3.setProperty("Collapsed", Dvpanel_panel3_Collapsed);
         ucDvpanel_panel3.setProperty("ShowCollapseIcon", Dvpanel_panel3_Showcollapseicon);
         ucDvpanel_panel3.setProperty("IconPosition", Dvpanel_panel3_Iconposition);
         ucDvpanel_panel3.setProperty("AutoScroll", Dvpanel_panel3_Autoscroll);
         ucDvpanel_panel3.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel3_Internalname, "DVPANEL_PANEL3Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANEL3Container"+"Panel3"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0052"+"", GXutil.rtrim( WebComp_Wcwcseguimientoproveedor_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0052"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcseguimientoproveedor_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcseguimientoproveedor), GXutil.lower( WebComp_Wcwcseguimientoproveedor_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0052"+"");
               }
               WebComp_Wcwcseguimientoproveedor.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcseguimientoproveedor), GXutil.lower( WebComp_Wcwcseguimientoproveedor_Component)) != 0 )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panel4.setProperty("Width", Dvpanel_panel4_Width);
         ucDvpanel_panel4.setProperty("AutoWidth", Dvpanel_panel4_Autowidth);
         ucDvpanel_panel4.setProperty("AutoHeight", Dvpanel_panel4_Autoheight);
         ucDvpanel_panel4.setProperty("Cls", Dvpanel_panel4_Cls);
         ucDvpanel_panel4.setProperty("Title", Dvpanel_panel4_Title);
         ucDvpanel_panel4.setProperty("Collapsible", Dvpanel_panel4_Collapsible);
         ucDvpanel_panel4.setProperty("Collapsed", Dvpanel_panel4_Collapsed);
         ucDvpanel_panel4.setProperty("ShowCollapseIcon", Dvpanel_panel4_Showcollapseicon);
         ucDvpanel_panel4.setProperty("IconPosition", Dvpanel_panel4_Iconposition);
         ucDvpanel_panel4.setProperty("AutoScroll", Dvpanel_panel4_Autoscroll);
         ucDvpanel_panel4.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel4_Internalname, "DVPANEL_PANEL4Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANEL4Container"+"Panel4"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0060"+"", GXutil.rtrim( WebComp_Wcwcseguimientoproducto_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0060"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcseguimientoproducto_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcseguimientoproducto), GXutil.lower( WebComp_Wcwcseguimientoproducto_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0060"+"");
               }
               WebComp_Wcwcseguimientoproducto.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcseguimientoproducto), GXutil.lower( WebComp_Wcwcseguimientoproducto_Component)) != 0 )
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

   public void startYD2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Seguimientos Pedidos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupYD0( ) ;
   }

   public void wsYD2( )
   {
      startYD2( ) ;
      evtYD2( ) ;
   }

   public void evtYD2( )
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
                           e12YD2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Refresh */
                           e13YD2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VPEDCOD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14YD2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VPRVNUM.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15YD2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VPRDNUM.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e16YD2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VPEDSIT.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e17YD2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e18YD2 ();
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
                     if ( nCmpId == 44 )
                     {
                        OldWcwcseguimientonpedido = httpContext.cgiGet( "W0044") ;
                        if ( ( GXutil.len( OldWcwcseguimientonpedido) == 0 ) || ( GXutil.strcmp(OldWcwcseguimientonpedido, WebComp_Wcwcseguimientonpedido_Component) != 0 ) )
                        {
                           WebComp_Wcwcseguimientonpedido = WebUtils.getWebComponent(getClass(), "app." + OldWcwcseguimientonpedido + "_impl", remoteHandle, context);
                           WebComp_Wcwcseguimientonpedido_Component = OldWcwcseguimientonpedido ;
                        }
                        if ( GXutil.len( WebComp_Wcwcseguimientonpedido_Component) != 0 )
                        {
                           WebComp_Wcwcseguimientonpedido.componentprocess("W0044", "", sEvt);
                        }
                        WebComp_Wcwcseguimientonpedido_Component = OldWcwcseguimientonpedido ;
                     }
                     else if ( nCmpId == 52 )
                     {
                        OldWcwcseguimientoproveedor = httpContext.cgiGet( "W0052") ;
                        if ( ( GXutil.len( OldWcwcseguimientoproveedor) == 0 ) || ( GXutil.strcmp(OldWcwcseguimientoproveedor, WebComp_Wcwcseguimientoproveedor_Component) != 0 ) )
                        {
                           WebComp_Wcwcseguimientoproveedor = WebUtils.getWebComponent(getClass(), "app." + OldWcwcseguimientoproveedor + "_impl", remoteHandle, context);
                           WebComp_Wcwcseguimientoproveedor_Component = OldWcwcseguimientoproveedor ;
                        }
                        if ( GXutil.len( WebComp_Wcwcseguimientoproveedor_Component) != 0 )
                        {
                           WebComp_Wcwcseguimientoproveedor.componentprocess("W0052", "", sEvt);
                        }
                        WebComp_Wcwcseguimientoproveedor_Component = OldWcwcseguimientoproveedor ;
                     }
                     else if ( nCmpId == 60 )
                     {
                        OldWcwcseguimientoproducto = httpContext.cgiGet( "W0060") ;
                        if ( ( GXutil.len( OldWcwcseguimientoproducto) == 0 ) || ( GXutil.strcmp(OldWcwcseguimientoproducto, WebComp_Wcwcseguimientoproducto_Component) != 0 ) )
                        {
                           WebComp_Wcwcseguimientoproducto = WebUtils.getWebComponent(getClass(), "app." + OldWcwcseguimientoproducto + "_impl", remoteHandle, context);
                           WebComp_Wcwcseguimientoproducto_Component = OldWcwcseguimientoproducto ;
                        }
                        if ( GXutil.len( WebComp_Wcwcseguimientoproducto_Component) != 0 )
                        {
                           WebComp_Wcwcseguimientoproducto.componentprocess("W0060", "", sEvt);
                        }
                        WebComp_Wcwcseguimientoproducto_Component = OldWcwcseguimientoproducto ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void weYD2( )
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

   public void paYD2( )
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
            GX_FocusControl = edtavPedcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgvvprvnumYD0( String A13719PrvNNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvprvnum_dataYD0( A13719PrvNNom) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgvvprvnum_dataYD0( String A13719PrvNNom )
   {
      l13719PrvNNom = GXutil.concat( GXutil.rtrim( A13719PrvNNom), "%", "") ;
      /* Using cursor H00YD2 */
      pr_default.execute(0, new Object[] {l13719PrvNNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H00YD2_A13719PrvNNom[0]) , GXutil.padr( "%" + GXutil.upper( A13719PrvNNom) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H00YD2_A13719PrvNNom[0]);
            gxdynajaxctrldescr.add(H00YD2_A13719PrvNNom[0]);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxsgvvprdnumYD0( String A13747PrdCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvprdnum_dataYD0( A13747PrdCDsc) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgvvprdnum_dataYD0( String A13747PrdCDsc )
   {
      l13747PrdCDsc = GXutil.concat( GXutil.rtrim( A13747PrdCDsc), "%", "") ;
      /* Using cursor H00YD3 */
      pr_default.execute(1, new Object[] {l13747PrdCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(1) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H00YD3_A13747PrdCDsc[0]) , GXutil.padr( "%" + GXutil.upper( A13747PrdCDsc) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H00YD3_A13747PrdCDsc[0]);
            gxdynajaxctrldescr.add(H00YD3_A13747PrdCDsc[0]);
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void gxhcvvprvnumYD2( String A13719PrvNNom )
   {
      /* Using cursor H00YD4 */
      pr_default.execute(2, new Object[] {A13719PrvNNom});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(2) != 101) )
      {
         if ( GXutil.strcmp(H00YD4_A13719PrvNNom[0], A13719PrvNNom) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13719PrvNNom = H00YD4_A13719PrvNNom[0] ;
            A396EmprCod = H00YD4_A396EmprCod[0] ;
            A795PrvNum = H00YD4_A795PrvNum[0] ;
         }
         pr_default.readNext(2);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(2);
   }

   public void gxhcvvprdnumYD2( String A13747PrdCDsc )
   {
      /* Using cursor H00YD5 */
      pr_default.execute(3, new Object[] {A13747PrdCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(3) != 101) )
      {
         if ( GXutil.strcmp(H00YD5_A13747PrdCDsc[0], A13747PrdCDsc) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13747PrdCDsc = H00YD5_A13747PrdCDsc[0] ;
            A396EmprCod = H00YD5_A396EmprCod[0] ;
            A719PrdNum = H00YD5_A719PrdNum[0] ;
         }
         pr_default.readNext(3);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(3);
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
      if ( cmbavPedsit.getItemCount() > 0 )
      {
         AV7PedSit = cmbavPedsit.getValidValue(AV7PedSit) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7PedSit", AV7PedSit);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavPedsit.setValue( GXutil.rtrim( AV7PedSit) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavPedsit.getInternalname(), "Values", cmbavPedsit.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfYD2( ) ;
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

   public void rfYD2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e13YD2 ();
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcseguimientonpedido_Component) != 0 )
            {
               WebComp_Wcwcseguimientonpedido.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcseguimientoproveedor_Component) != 0 )
            {
               WebComp_Wcwcseguimientoproveedor.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcseguimientoproducto_Component) != 0 )
            {
               WebComp_Wcwcseguimientoproducto.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e18YD2 ();
         wbYD0( ) ;
      }
   }

   public void send_integrity_lvl_hashesYD2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupYD0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e12YD2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         AV10EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
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
         Dvpanel_panel2_Width = httpContext.cgiGet( "DVPANEL_PANEL2_Width") ;
         Dvpanel_panel2_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL2_Autowidth")) ;
         Dvpanel_panel2_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL2_Autoheight")) ;
         Dvpanel_panel2_Cls = httpContext.cgiGet( "DVPANEL_PANEL2_Cls") ;
         Dvpanel_panel2_Title = httpContext.cgiGet( "DVPANEL_PANEL2_Title") ;
         Dvpanel_panel2_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL2_Collapsible")) ;
         Dvpanel_panel2_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL2_Collapsed")) ;
         Dvpanel_panel2_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL2_Showcollapseicon")) ;
         Dvpanel_panel2_Iconposition = httpContext.cgiGet( "DVPANEL_PANEL2_Iconposition") ;
         Dvpanel_panel2_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL2_Autoscroll")) ;
         Dvpanel_panel3_Width = httpContext.cgiGet( "DVPANEL_PANEL3_Width") ;
         Dvpanel_panel3_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL3_Autowidth")) ;
         Dvpanel_panel3_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL3_Autoheight")) ;
         Dvpanel_panel3_Cls = httpContext.cgiGet( "DVPANEL_PANEL3_Cls") ;
         Dvpanel_panel3_Title = httpContext.cgiGet( "DVPANEL_PANEL3_Title") ;
         Dvpanel_panel3_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL3_Collapsible")) ;
         Dvpanel_panel3_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL3_Collapsed")) ;
         Dvpanel_panel3_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL3_Showcollapseicon")) ;
         Dvpanel_panel3_Iconposition = httpContext.cgiGet( "DVPANEL_PANEL3_Iconposition") ;
         Dvpanel_panel3_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL3_Autoscroll")) ;
         Dvpanel_panel4_Width = httpContext.cgiGet( "DVPANEL_PANEL4_Width") ;
         Dvpanel_panel4_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL4_Autowidth")) ;
         Dvpanel_panel4_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL4_Autoheight")) ;
         Dvpanel_panel4_Cls = httpContext.cgiGet( "DVPANEL_PANEL4_Cls") ;
         Dvpanel_panel4_Title = httpContext.cgiGet( "DVPANEL_PANEL4_Title") ;
         Dvpanel_panel4_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL4_Collapsible")) ;
         Dvpanel_panel4_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL4_Collapsed")) ;
         Dvpanel_panel4_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL4_Showcollapseicon")) ;
         Dvpanel_panel4_Iconposition = httpContext.cgiGet( "DVPANEL_PANEL4_Iconposition") ;
         Dvpanel_panel4_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL4_Autoscroll")) ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPedcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPedcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPEDCOD");
            GX_FocusControl = edtavPedcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5PedCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5PedCod), 8, 0));
         }
         else
         {
            AV5PedCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavPedcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5PedCod), 8, 0));
         }
         hV6PrvNum = httpContext.cgiGet( edtavPrvnum_Internalname) ;
         if ( (GXutil.strcmp("", hV6PrvNum)==0) )
         {
            AV6PrvNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6PrvNum), 6, 0));
         }
         else
         {
            A13719PrvNNom = hV6PrvNum ;
            /* Using cursor H00YD6 */
            pr_default.execute(4, new Object[] {A13719PrvNNom});
            AV6PrvNum = H00YD6_A795PrvNum[0] ;
            if ( ! ( (pr_default.getStatus(4) == 101) ) )
            {
               pr_default.readNext(4);
               if ( ! ( (pr_default.getStatus(4) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Numero y Nombre", "")}), 1, "vPRVNUM");
                  GX_FocusControl = edtavPrvnum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(4);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV6PrvNum", hV6PrvNum);
         hV8PrdNum = httpContext.cgiGet( edtavPrdnum_Internalname) ;
         if ( (GXutil.strcmp("", hV8PrdNum)==0) )
         {
            AV8PrdNum = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8PrdNum", AV8PrdNum);
         }
         else
         {
            A13747PrdCDsc = hV8PrdNum ;
            /* Using cursor H00YD7 */
            pr_default.execute(5, new Object[] {A13747PrdCDsc});
            AV8PrdNum = H00YD7_A719PrdNum[0] ;
            if ( ! ( (pr_default.getStatus(5) == 101) ) )
            {
               pr_default.readNext(5);
               if ( ! ( (pr_default.getStatus(5) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Producto", "")}), 1, "vPRDNUM");
                  GX_FocusControl = edtavPrdnum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(5);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV8PrdNum", hV8PrdNum);
         cmbavPedsit.setValue( httpContext.cgiGet( cmbavPedsit.getInternalname()) );
         AV7PedSit = httpContext.cgiGet( cmbavPedsit.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7PedSit", AV7PedSit);
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
      e12YD2 ();
      if (returnInSub) return;
   }

   public void e12YD2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV9Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webpedidosseguimientos_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9Station = GXt_char1 ;
      GXv_char2[0] = AV10EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV12UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char2, GXv_char3, GXv_char4) ;
      webpedidosseguimientos_impl.this.AV10EmprCod = GXv_char2[0] ;
      webpedidosseguimientos_impl.this.AV11EmprNom = GXv_char3[0] ;
      webpedidosseguimientos_impl.this.AV12UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      GXt_char1 = AV9Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webpedidosseguimientos_impl.this.GXt_char1 = GXv_char4[0] ;
      AV9Station = GXt_char1 ;
      GXv_char4[0] = AV10EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char2[0] = AV12UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char4, GXv_char3, GXv_char2) ;
      webpedidosseguimientos_impl.this.AV10EmprCod = GXv_char4[0] ;
      webpedidosseguimientos_impl.this.AV11EmprNom = GXv_char3[0] ;
      webpedidosseguimientos_impl.this.AV12UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcseguimientoproducto = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcseguimientoproducto_Component), GXutil.lower( "WCSeguimientoProducto")) != 0 )
      {
         WebComp_Wcwcseguimientoproducto = WebUtils.getWebComponent(getClass(), "app.wcseguimientoproducto_impl", remoteHandle, context);
         WebComp_Wcwcseguimientoproducto_Component = "WCSeguimientoProducto" ;
      }
      if ( GXutil.len( WebComp_Wcwcseguimientoproducto_Component) != 0 )
      {
         WebComp_Wcwcseguimientoproducto.setjustcreated();
         WebComp_Wcwcseguimientoproducto.componentprepare(new Object[] {"W0060","",AV10EmprCod,AV8PrdNum});
         WebComp_Wcwcseguimientoproducto.componentbind(new Object[] {"","vPRDNUM"});
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcseguimientoproveedor = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcseguimientoproveedor_Component), GXutil.lower( "WCSeguimientoProveedor")) != 0 )
      {
         WebComp_Wcwcseguimientoproveedor = WebUtils.getWebComponent(getClass(), "app.wcseguimientoproveedor_impl", remoteHandle, context);
         WebComp_Wcwcseguimientoproveedor_Component = "WCSeguimientoProveedor" ;
      }
      if ( GXutil.len( WebComp_Wcwcseguimientoproveedor_Component) != 0 )
      {
         WebComp_Wcwcseguimientoproveedor.setjustcreated();
         WebComp_Wcwcseguimientoproveedor.componentprepare(new Object[] {"W0052","",AV10EmprCod,Integer.valueOf(AV6PrvNum),AV7PedSit});
         WebComp_Wcwcseguimientoproveedor.componentbind(new Object[] {"","vPRVNUM","vPEDSIT"});
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcseguimientonpedido = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcseguimientonpedido_Component), GXutil.lower( "WCSeguimientoNPedido")) != 0 )
      {
         WebComp_Wcwcseguimientonpedido = WebUtils.getWebComponent(getClass(), "app.wcseguimientonpedido_impl", remoteHandle, context);
         WebComp_Wcwcseguimientonpedido_Component = "WCSeguimientoNPedido" ;
      }
      if ( GXutil.len( WebComp_Wcwcseguimientonpedido_Component) != 0 )
      {
         WebComp_Wcwcseguimientonpedido.setjustcreated();
         WebComp_Wcwcseguimientonpedido.componentprepare(new Object[] {"W0044","",AV10EmprCod,Integer.valueOf(AV5PedCod)});
         WebComp_Wcwcseguimientonpedido.componentbind(new Object[] {"","vPEDCOD"});
      }
   }

   public void e13YD2( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcseguimientoproducto = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcseguimientoproducto_Component), GXutil.lower( "WCSeguimientoProducto")) != 0 )
      {
         WebComp_Wcwcseguimientoproducto = WebUtils.getWebComponent(getClass(), "app.wcseguimientoproducto_impl", remoteHandle, context);
         WebComp_Wcwcseguimientoproducto_Component = "WCSeguimientoProducto" ;
      }
      if ( GXutil.len( WebComp_Wcwcseguimientoproducto_Component) != 0 )
      {
         WebComp_Wcwcseguimientoproducto.setjustcreated();
         WebComp_Wcwcseguimientoproducto.componentprepare(new Object[] {"W0060","",AV10EmprCod,AV8PrdNum});
         WebComp_Wcwcseguimientoproducto.componentbind(new Object[] {"","vPRDNUM"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwcseguimientoproducto )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0060"+"");
         WebComp_Wcwcseguimientoproducto.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcseguimientonpedido = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcseguimientonpedido_Component), GXutil.lower( "WCSeguimientoNPedido")) != 0 )
      {
         WebComp_Wcwcseguimientonpedido = WebUtils.getWebComponent(getClass(), "app.wcseguimientonpedido_impl", remoteHandle, context);
         WebComp_Wcwcseguimientonpedido_Component = "WCSeguimientoNPedido" ;
      }
      if ( GXutil.len( WebComp_Wcwcseguimientonpedido_Component) != 0 )
      {
         WebComp_Wcwcseguimientonpedido.setjustcreated();
         WebComp_Wcwcseguimientonpedido.componentprepare(new Object[] {"W0044","",AV10EmprCod,Integer.valueOf(AV5PedCod)});
         WebComp_Wcwcseguimientonpedido.componentbind(new Object[] {"","vPEDCOD"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwcseguimientonpedido )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0044"+"");
         WebComp_Wcwcseguimientonpedido.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcseguimientoproveedor = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcseguimientoproveedor_Component), GXutil.lower( "WCSeguimientoProveedor")) != 0 )
      {
         WebComp_Wcwcseguimientoproveedor = WebUtils.getWebComponent(getClass(), "app.wcseguimientoproveedor_impl", remoteHandle, context);
         WebComp_Wcwcseguimientoproveedor_Component = "WCSeguimientoProveedor" ;
      }
      if ( GXutil.len( WebComp_Wcwcseguimientoproveedor_Component) != 0 )
      {
         WebComp_Wcwcseguimientoproveedor.setjustcreated();
         WebComp_Wcwcseguimientoproveedor.componentprepare(new Object[] {"W0052","",AV10EmprCod,Integer.valueOf(AV6PrvNum),AV7PedSit});
         WebComp_Wcwcseguimientoproveedor.componentbind(new Object[] {"","vPRVNUM","vPEDSIT"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwcseguimientoproveedor )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0052"+"");
         WebComp_Wcwcseguimientoproveedor.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /*  Sending Event outputs  */
   }

   public void e14YD2( )
   {
      /* Pedcod_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e15YD2( )
   {
      /* Prvnum_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e16YD2( )
   {
      /* Prdnum_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e17YD2( )
   {
      /* Pedsit_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   protected void nextLoad( )
   {
   }

   protected void e18YD2( )
   {
      /* Load Routine */
      returnInSub = false ;
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
      paYD2( ) ;
      wsYD2( ) ;
      weYD2( ) ;
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
      if ( ! ( WebComp_Wcwcseguimientonpedido == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcseguimientonpedido_Component) != 0 )
         {
            WebComp_Wcwcseguimientonpedido.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwcseguimientoproveedor == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcseguimientoproveedor_Component) != 0 )
         {
            WebComp_Wcwcseguimientoproveedor.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwcseguimientoproducto == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcseguimientoproducto_Component) != 0 )
         {
            WebComp_Wcwcseguimientoproducto.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016422913", true, true);
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
      httpContext.AddJavascriptSource("webpedidosseguimientos.js", "?202661016422914", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      edtavPedcod_Internalname = "vPEDCOD" ;
      imgPromptpedidos_Internalname = "PROMPTPEDIDOS" ;
      edtavPrvnum_Internalname = "vPRVNUM" ;
      edtavPrdnum_Internalname = "vPRDNUM" ;
      cmbavPedsit.setInternalname( "vPEDSIT" );
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divPanel2_Internalname = "PANEL2" ;
      Dvpanel_panel2_Internalname = "DVPANEL_PANEL2" ;
      divPanel3_Internalname = "PANEL3" ;
      Dvpanel_panel3_Internalname = "DVPANEL_PANEL3" ;
      divPanel4_Internalname = "PANEL4" ;
      Dvpanel_panel4_Internalname = "DVPANEL_PANEL4" ;
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
      cmbavPedsit.setJsonclick( "" );
      cmbavPedsit.setEnabled( 1 );
      edtavPrdnum_Jsonclick = "" ;
      edtavPrdnum_Enabled = 1 ;
      edtavPrvnum_Jsonclick = "" ;
      edtavPrvnum_Enabled = 1 ;
      edtavPedcod_Jsonclick = "" ;
      edtavPedcod_Enabled = 1 ;
      Dvpanel_panel4_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel4_Iconposition = "Right" ;
      Dvpanel_panel4_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel4_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel4_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel4_Title = httpContext.getMessage( "Producto", "") ;
      Dvpanel_panel4_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel4_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel4_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel4_Width = "100%" ;
      Dvpanel_panel3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel3_Iconposition = "Right" ;
      Dvpanel_panel3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel3_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel3_Title = httpContext.getMessage( "Proveedor", "") ;
      Dvpanel_panel3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel3_Width = "100%" ;
      Dvpanel_panel2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel2_Iconposition = "Right" ;
      Dvpanel_panel2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel2_Title = httpContext.getMessage( "N Pedido", "") ;
      Dvpanel_panel2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel2_Width = "100%" ;
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
      Form.setCaption( httpContext.getMessage( "Seguimientos Pedidos", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavPedsit.setName( "vPEDSIT" );
      cmbavPedsit.setWebtags( "" );
      cmbavPedsit.addItem("N", httpContext.getMessage( "Pendiente", ""), (short)(0));
      cmbavPedsit.addItem("S", httpContext.getMessage( "Cerrados", ""), (short)(0));
      cmbavPedsit.addItem("X", httpContext.getMessage( "Todos", ""), (short)(0));
      if ( cmbavPedsit.getItemCount() > 0 )
      {
         AV7PedSit = cmbavPedsit.getValidValue(AV7PedSit) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7PedSit", AV7PedSit);
      }
      /* End function init_web_controls */
   }

   public void validv_Prvnum( )
   {
      if ( (GXutil.strcmp("", hV6PrvNum)==0) )
      {
         AV6PrvNum = 0 ;
      }
      else
      {
         A13719PrvNNom = hV6PrvNum ;
         /* Using cursor H00YD8 */
         pr_default.execute(6, new Object[] {A13719PrvNNom});
         AV6PrvNum = H00YD8_A795PrvNum[0] ;
         if ( ! ( (pr_default.getStatus(6) == 101) ) )
         {
            pr_default.readNext(6);
            if ( ! ( (pr_default.getStatus(6) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Numero y Nombre", "")}), 1, "vPRVNUM");
               GX_FocusControl = edtavPrvnum_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(6);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV6PrvNum", hV6PrvNum);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV6PrvNum", GXutil.ltrim( localUtil.ntoc( AV6PrvNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV6PrvNum", hV6PrvNum);
   }

   public void validv_Prdnum( )
   {
      if ( (GXutil.strcmp("", hV8PrdNum)==0) )
      {
         AV8PrdNum = "" ;
      }
      else
      {
         A13747PrdCDsc = hV8PrdNum ;
         /* Using cursor H00YD9 */
         pr_default.execute(7, new Object[] {A13747PrdCDsc});
         AV8PrdNum = H00YD9_A719PrdNum[0] ;
         if ( ! ( (pr_default.getStatus(7) == 101) ) )
         {
            pr_default.readNext(7);
            if ( ! ( (pr_default.getStatus(7) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Producto", "")}), 1, "vPRDNUM");
               GX_FocusControl = edtavPrdnum_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(7);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV8PrdNum", hV8PrdNum);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV8PrdNum", GXutil.rtrim( AV8PrdNum));
      httpContext.ajax_rsp_assign_attri("", false, "hV8PrdNum", hV8PrdNum);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8PrdNum',fld:'vPRDNUM',pic:''},{av:'AV5PedCod',fld:'vPEDCOD',pic:'ZZZZZZZ9'},{av:'AV6PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'cmbavPedsit'},{av:'AV7PedSit',fld:'vPEDSIT',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[{ctrl:'WCWCSEGUIMIENTOPRODUCTO'},{ctrl:'WCWCSEGUIMIENTONPEDIDO'},{ctrl:'WCWCSEGUIMIENTOPROVEEDOR'}]}");
      setEventMetadata("'DOPROMPTPEDIDOS'","{handler:'e11YD1',iparms:[{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5PedCod',fld:'vPEDCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOPROMPTPEDIDOS'",",oparms:[{av:'AV5PedCod',fld:'vPEDCOD',pic:'ZZZZZZZ9'},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VPEDCOD.CONTROLVALUECHANGED","{handler:'e14YD2',iparms:[]");
      setEventMetadata("VPEDCOD.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VPRVNUM.CONTROLVALUECHANGED","{handler:'e15YD2',iparms:[]");
      setEventMetadata("VPRVNUM.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VPRDNUM.CONTROLVALUECHANGED","{handler:'e16YD2',iparms:[]");
      setEventMetadata("VPRDNUM.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VPEDSIT.CONTROLVALUECHANGED","{handler:'e17YD2',iparms:[]");
      setEventMetadata("VPEDSIT.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VALIDV_PRVNUM","{handler:'validv_Prvnum',iparms:[{av:'hV6PrvNum'},{av:'AV6PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'}]");
      setEventMetadata("VALIDV_PRVNUM",",oparms:[{av:'AV6PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'hV6PrvNum'}]}");
      setEventMetadata("VALIDV_PRDNUM","{handler:'validv_Prdnum',iparms:[{av:'hV8PrdNum'},{av:'AV8PrdNum',fld:'vPRDNUM',pic:''}]");
      setEventMetadata("VALIDV_PRDNUM",",oparms:[{av:'AV8PrdNum',fld:'vPRDNUM',pic:''},{av:'hV8PrdNum'}]}");
      setEventMetadata("VALIDV_PEDSIT","{handler:'validv_Pedsit',iparms:[]");
      setEventMetadata("VALIDV_PEDSIT",",oparms:[]}");
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
      A13719PrvNNom = "" ;
      A13747PrdCDsc = "" ;
      hV6PrvNum = "" ;
      hV8PrdNum = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV10EmprCod = "" ;
      AV8PrdNum = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      imgPromptpedidos_gximage = "" ;
      sImgUrl = "" ;
      imgPromptpedidos_Jsonclick = "" ;
      AV7PedSit = "" ;
      ucDvpanel_panel2 = new com.genexus.webpanels.GXUserControl();
      WebComp_Wcwcseguimientonpedido_Component = "" ;
      OldWcwcseguimientonpedido = "" ;
      ucDvpanel_panel3 = new com.genexus.webpanels.GXUserControl();
      WebComp_Wcwcseguimientoproveedor_Component = "" ;
      OldWcwcseguimientoproveedor = "" ;
      ucDvpanel_panel4 = new com.genexus.webpanels.GXUserControl();
      WebComp_Wcwcseguimientoproducto_Component = "" ;
      OldWcwcseguimientoproducto = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l13719PrvNNom = "" ;
      H00YD2_A13719PrvNNom = new String[] {""} ;
      l13747PrdCDsc = "" ;
      H00YD3_A13747PrdCDsc = new String[] {""} ;
      H00YD4_A13719PrvNNom = new String[] {""} ;
      H00YD4_A396EmprCod = new String[] {""} ;
      H00YD4_A795PrvNum = new int[1] ;
      A396EmprCod = "" ;
      H00YD5_A13747PrdCDsc = new String[] {""} ;
      H00YD5_A396EmprCod = new String[] {""} ;
      H00YD5_A719PrdNum = new String[] {""} ;
      A719PrdNum = "" ;
      H00YD6_A13719PrvNNom = new String[] {""} ;
      H00YD6_A396EmprCod = new String[] {""} ;
      H00YD6_A795PrvNum = new int[1] ;
      H00YD7_A13747PrdCDsc = new String[] {""} ;
      H00YD7_A396EmprCod = new String[] {""} ;
      H00YD7_A719PrdNum = new String[] {""} ;
      AV9Station = "" ;
      AV11EmprNom = "" ;
      AV12UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      H00YD8_A13719PrvNNom = new String[] {""} ;
      H00YD8_A396EmprCod = new String[] {""} ;
      H00YD8_A795PrvNum = new int[1] ;
      ZhV6PrvNum = "" ;
      H00YD9_A13747PrdCDsc = new String[] {""} ;
      H00YD9_A396EmprCod = new String[] {""} ;
      H00YD9_A719PrdNum = new String[] {""} ;
      ZV8PrdNum = "" ;
      ZhV8PrdNum = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webpedidosseguimientos__default(),
         new Object[] {
             new Object[] {
            H00YD2_A13719PrvNNom
            }
            , new Object[] {
            H00YD3_A13747PrdCDsc
            }
            , new Object[] {
            H00YD4_A13719PrvNNom, H00YD4_A396EmprCod, H00YD4_A795PrvNum
            }
            , new Object[] {
            H00YD5_A13747PrdCDsc, H00YD5_A396EmprCod, H00YD5_A719PrdNum
            }
            , new Object[] {
            H00YD6_A13719PrvNNom, H00YD6_A396EmprCod, H00YD6_A795PrvNum
            }
            , new Object[] {
            H00YD7_A13747PrdCDsc, H00YD7_A396EmprCod, H00YD7_A719PrdNum
            }
            , new Object[] {
            H00YD8_A13719PrvNNom, H00YD8_A396EmprCod, H00YD8_A795PrvNum
            }
            , new Object[] {
            H00YD9_A13747PrdCDsc, H00YD9_A396EmprCod, H00YD9_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      WebComp_Wcwcseguimientonpedido = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwcseguimientoproveedor = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwcseguimientoproducto = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private int AV6PrvNum ;
   private int AV5PedCod ;
   private int edtavPedcod_Enabled ;
   private int edtavPrvnum_Enabled ;
   private int edtavPrdnum_Enabled ;
   private int gxdynajaxindex ;
   private int A795PrvNum ;
   private int idxLst ;
   private int ZV6PrvNum ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV10EmprCod ;
   private String AV8PrdNum ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_panel2_Width ;
   private String Dvpanel_panel2_Cls ;
   private String Dvpanel_panel2_Title ;
   private String Dvpanel_panel2_Iconposition ;
   private String Dvpanel_panel3_Width ;
   private String Dvpanel_panel3_Cls ;
   private String Dvpanel_panel3_Title ;
   private String Dvpanel_panel3_Iconposition ;
   private String Dvpanel_panel4_Width ;
   private String Dvpanel_panel4_Cls ;
   private String Dvpanel_panel4_Title ;
   private String Dvpanel_panel4_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavPedcod_Internalname ;
   private String TempTags ;
   private String edtavPedcod_Jsonclick ;
   private String imgPromptpedidos_gximage ;
   private String sImgUrl ;
   private String imgPromptpedidos_Internalname ;
   private String imgPromptpedidos_Jsonclick ;
   private String edtavPrvnum_Internalname ;
   private String edtavPrvnum_Jsonclick ;
   private String edtavPrdnum_Internalname ;
   private String edtavPrdnum_Jsonclick ;
   private String AV7PedSit ;
   private String Dvpanel_panel2_Internalname ;
   private String divPanel2_Internalname ;
   private String WebComp_Wcwcseguimientonpedido_Component ;
   private String OldWcwcseguimientonpedido ;
   private String Dvpanel_panel3_Internalname ;
   private String divPanel3_Internalname ;
   private String WebComp_Wcwcseguimientoproveedor_Component ;
   private String OldWcwcseguimientoproveedor ;
   private String Dvpanel_panel4_Internalname ;
   private String divPanel4_Internalname ;
   private String WebComp_Wcwcseguimientoproducto_Component ;
   private String OldWcwcseguimientoproducto ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV9Station ;
   private String AV11EmprNom ;
   private String AV12UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZV8PrdNum ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_panel2_Autowidth ;
   private boolean Dvpanel_panel2_Autoheight ;
   private boolean Dvpanel_panel2_Collapsible ;
   private boolean Dvpanel_panel2_Collapsed ;
   private boolean Dvpanel_panel2_Showcollapseicon ;
   private boolean Dvpanel_panel2_Autoscroll ;
   private boolean Dvpanel_panel3_Autowidth ;
   private boolean Dvpanel_panel3_Autoheight ;
   private boolean Dvpanel_panel3_Collapsible ;
   private boolean Dvpanel_panel3_Collapsed ;
   private boolean Dvpanel_panel3_Showcollapseicon ;
   private boolean Dvpanel_panel3_Autoscroll ;
   private boolean Dvpanel_panel4_Autowidth ;
   private boolean Dvpanel_panel4_Autoheight ;
   private boolean Dvpanel_panel4_Collapsible ;
   private boolean Dvpanel_panel4_Collapsed ;
   private boolean Dvpanel_panel4_Showcollapseicon ;
   private boolean Dvpanel_panel4_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wcwcseguimientoproducto ;
   private boolean bDynCreated_Wcwcseguimientoproveedor ;
   private boolean bDynCreated_Wcwcseguimientonpedido ;
   private String A13719PrvNNom ;
   private String A13747PrdCDsc ;
   private String hV6PrvNum ;
   private String hV8PrdNum ;
   private String l13719PrvNNom ;
   private String l13747PrdCDsc ;
   private String ZhV6PrvNum ;
   private String ZhV8PrdNum ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcwcseguimientonpedido ;
   private GXWebComponent WebComp_Wcwcseguimientoproveedor ;
   private GXWebComponent WebComp_Wcwcseguimientoproducto ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel3 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel4 ;
   private HTMLChoice cmbavPedsit ;
   private IDataStoreProvider pr_default ;
   private String[] H00YD2_A13719PrvNNom ;
   private String[] H00YD3_A13747PrdCDsc ;
   private String[] H00YD4_A13719PrvNNom ;
   private String[] H00YD4_A396EmprCod ;
   private int[] H00YD4_A795PrvNum ;
   private String[] H00YD5_A13747PrdCDsc ;
   private String[] H00YD5_A396EmprCod ;
   private String[] H00YD5_A719PrdNum ;
   private String[] H00YD6_A13719PrvNNom ;
   private String[] H00YD6_A396EmprCod ;
   private int[] H00YD6_A795PrvNum ;
   private String[] H00YD7_A13747PrdCDsc ;
   private String[] H00YD7_A396EmprCod ;
   private String[] H00YD7_A719PrdNum ;
   private String[] H00YD8_A13719PrvNNom ;
   private String[] H00YD8_A396EmprCod ;
   private int[] H00YD8_A795PrvNum ;
   private String[] H00YD9_A13747PrdCDsc ;
   private String[] H00YD9_A396EmprCod ;
   private String[] H00YD9_A719PrdNum ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class webpedidosseguimientos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00YD2", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom FROM TXPPRVGEN WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, '')))) like '%' || UPPER(?)) WHERE rownum <= 20 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00YD3", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc FROM TXPPRODUC WHERE UPPER(RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom))) like '%' || UPPER(?)) WHERE rownum <= 20 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00YD4", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00YD5", "SELECT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00YD6", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00YD7", "SELECT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00YD8", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00YD9", "SELECT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
      }
   }

}

