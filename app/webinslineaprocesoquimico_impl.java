package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webinslineaprocesoquimico_impl extends GXDataArea
{
   public webinslineaprocesoquimico_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webinslineaprocesoquimico_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webinslineaprocesoquimico_impl.class ));
   }

   public webinslineaprocesoquimico_impl( int remoteHandle ,
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vPROFORPRD") == 0 )
         {
            A770ProForPrd = httpContext.GetPar( "ProForPrd") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvproforprdQN0( A770ProForPrd) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vFORPRDUME") == 0 )
         {
            A13746ForPrdCDsc = httpContext.GetPar( "ForPrdCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvforprdumeQN0( A13746ForPrdCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vFORPRDUME") == 0 )
         {
            A13746ForPrdCDsc = httpContext.GetPar( "ForPrdCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvforprdumeQN0( A13746ForPrdCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vFORPRDUME") == 0 )
         {
            hV11ForPrdUMe = httpContext.GetPar( "hV11ForPrdUMe") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvforprdumeQN2( hV11ForPrdUMe) ;
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
            AV5Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV6Proforcod = httpContext.GetPar( "Proforcod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6Proforcod", AV6Proforcod);
               AV7ProForDsc = httpContext.GetPar( "ProForDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7ProForDsc", AV7ProForDsc);
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
      paQN2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startQN2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webinslineaprocesoquimico", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV6Proforcod)),GXutil.URLEncode(GXutil.rtrim(AV7ProForDsc))}, new String[] {"Emprcod","Proforcod","ProForDsc"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "vEXISTELINEA", GXutil.ltrim( localUtil.ntoc( AV16Existelinea, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV5Emprcod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vOBJETOREFRESCAR", AV17ObjetoRefrescar);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vOBJETOREFRESCAR", AV17ObjetoRefrescar);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCOD", GXutil.rtrim( A764ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORLIN", GXutil.ltrim( localUtil.ntoc( A767ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvFORPRDUME", GXutil.ltrim( localUtil.ntoc( AV11ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM", GXutil.rtrim( A40000PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDUMEFO", GXutil.ltrim( localUtil.ntoc( A40001PrdUMeFo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNINSERTARLINEA_Title", GXutil.rtrim( Dvelop_confirmpanel_btninsertarlinea_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNINSERTARLINEA_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btninsertarlinea_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNINSERTARLINEA_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btninsertarlinea_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNINSERTARLINEA_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btninsertarlinea_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNINSERTARLINEA_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btninsertarlinea_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNINSERTARLINEA_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btninsertarlinea_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNINSERTARLINEA_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btninsertarlinea_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNINSERTARLINEA_Result", GXutil.rtrim( Dvelop_confirmpanel_btninsertarlinea_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNINSERTARLINEA_Result", GXutil.rtrim( Dvelop_confirmpanel_btninsertarlinea_Result));
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
         weQN2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtQN2( ) ;
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
      return formatLink("app.webinslineaprocesoquimico", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV6Proforcod)),GXutil.URLEncode(GXutil.rtrim(AV7ProForDsc))}, new String[] {"Emprcod","Proforcod","ProForDsc"})  ;
   }

   public String getPgmname( )
   {
      return "WebInsLineaProcesoQuimico" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Web Ins Linea Proceso Quimico", "") ;
   }

   public void wbQN0( )
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableproforcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockproforcod_Internalname, httpContext.getMessage( "Proceso", ""), "", "", lblTextblockproforcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebInsLineaProcesoQuimico.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavProforcod_Internalname, httpContext.getMessage( "Proceso Formula ID", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProforcod_Internalname, GXutil.rtrim( AV6Proforcod), GXutil.rtrim( localUtil.format( AV6Proforcod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProforcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavProforcod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebInsLineaProcesoQuimico.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavProfordsc_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProfordsc_Internalname, GXutil.rtrim( AV7ProForDsc), GXutil.rtrim( localUtil.format( AV7ProForDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProfordsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavProfordsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebInsLineaProcesoQuimico.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableproforlin_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockproforlin_Internalname, "#", "", "", lblTextblockproforlin_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebInsLineaProcesoQuimico.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavProforlin_Internalname, httpContext.getMessage( "Pro For Lin", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProforlin_Internalname, GXutil.ltrim( localUtil.ntoc( AV8ProForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavProforlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV8ProForLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV8ProForLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProforlin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavProforlin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebInsLineaProcesoQuimico.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableproforprd_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockproforprd_Internalname, httpContext.getMessage( "Producto", ""), "", "", lblTextblockproforprd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebInsLineaProcesoQuimico.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavProforprd_Internalname, httpContext.getMessage( "Pro For Prd", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProforprd_Internalname, GXutil.rtrim( AV9ProForPrd), GXutil.rtrim( localUtil.format( AV9ProForPrd, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProforprd_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavProforprd_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_WebInsLineaProcesoQuimico.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableprofordes_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockprofordes_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblockprofordes_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebInsLineaProcesoQuimico.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavProfordes_Internalname, httpContext.getMessage( "Pro For Des", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProfordes_Internalname, GXutil.rtrim( AV10ProForDes), GXutil.rtrim( localUtil.format( AV10ProForDes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProfordes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavProfordes_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebInsLineaProcesoQuimico.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableforprdume_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockforprdume_Internalname, httpContext.getMessage( "Und", ""), "", "", lblTextblockforprdume_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebInsLineaProcesoQuimico.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForprdume_Internalname, httpContext.getMessage( "For Prd UMe", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForprdume_Internalname, hV11ForPrdUMe, GXutil.rtrim( localUtil.format( hV11ForPrdUMe, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,72);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForprdume_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForprdume_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_WebInsLineaProcesoQuimico.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableproforcan_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockproforcan_Internalname, httpContext.getMessage( "Cantidad", ""), "", "", lblTextblockproforcan_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebInsLineaProcesoQuimico.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavProforcan_Internalname, httpContext.getMessage( "Pro For Can", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProforcan_Internalname, GXutil.ltrim( localUtil.ntoc( AV13ProForCan, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavProforcan_Enabled!=0) ? localUtil.format( AV13ProForCan, "ZZZZZ9.9999") : localUtil.format( AV13ProForCan, "ZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,80);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProforcan_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavProforcan_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebInsLineaProcesoQuimico.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableprofornro_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockprofornro_Internalname, httpContext.getMessage( "Nº", ""), "", "", lblTextblockprofornro_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebInsLineaProcesoQuimico.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavProfornro_Internalname, httpContext.getMessage( "Pro For Nro", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProfornro_Internalname, GXutil.ltrim( localUtil.ntoc( AV14ProForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavProfornro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV14ProForNro), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV14ProForNro), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,88);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProfornro_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavProfornro_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebInsLineaProcesoQuimico.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableprofortnq_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockprofortnq_Internalname, httpContext.getMessage( "Tanque", ""), "", "", lblTextblockprofortnq_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebInsLineaProcesoQuimico.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavProfortnq_Internalname, httpContext.getMessage( "Pro For Tnq", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProfortnq_Internalname, GXutil.ltrim( localUtil.ntoc( AV15ProForTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavProfortnq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV15ProForTnq), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV15ProForTnq), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProfortnq_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavProfortnq_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebInsLineaProcesoQuimico.htm");
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
         wb_table1_101_QN2( true) ;
      }
      else
      {
         wb_table1_101_QN2( false) ;
      }
      return  ;
   }

   public void wb_table1_101_QN2e( boolean wbgen )
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         wb_table2_110_QN2( true) ;
      }
      else
      {
         wb_table2_110_QN2( false) ;
      }
      return  ;
   }

   public void wb_table2_110_QN2e( boolean wbgen )
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

   public void startQN2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Web Ins Linea Proceso Quimico", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupQN0( ) ;
   }

   public void wsQN2( )
   {
      startQN2( ) ;
      evtQN2( ) ;
   }

   public void evtQN2( )
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
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNINSERTARLINEA.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e11QN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e12QN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VPROFORPRD.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13QN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e14QN2 ();
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

   public void weQN2( )
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

   public void paQN2( )
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
            GX_FocusControl = edtavProforlin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgvvproforprdQN0( String A770ProForPrd )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvproforprd_dataQN0( A770ProForPrd) ;
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

   protected void gxsgvvproforprd_dataQN0( String A770ProForPrd )
   {
      l770ProForPrd = GXutil.padr( GXutil.rtrim( A770ProForPrd), 6, "%") ;
      /* Using cursor H00QN2 */
      pr_default.execute(0, new Object[] {l770ProForPrd});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H00QN2_A770ProForPrd[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H00QN2_A770ProForPrd[0]));
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxsgvvforprdumeQN0( String A13746ForPrdCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvforprdume_dataQN0( A13746ForPrdCDsc) ;
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

   protected void gxsgvvforprdume_dataQN0( String A13746ForPrdCDsc )
   {
      l13746ForPrdCDsc = GXutil.concat( GXutil.rtrim( A13746ForPrdCDsc), "%", "") ;
      /* Using cursor H00QN3 */
      pr_default.execute(1, new Object[] {l13746ForPrdCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(1) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H00QN3_A13746ForPrdCDsc[0]) , GXutil.padr( "%" + GXutil.upper( A13746ForPrdCDsc) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H00QN3_A13746ForPrdCDsc[0]);
            gxdynajaxctrldescr.add(H00QN3_A13746ForPrdCDsc[0]);
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void gxhcvvforprdumeQN2( String A13746ForPrdCDsc )
   {
      /* Using cursor H00QN4 */
      pr_default.execute(2, new Object[] {A13746ForPrdCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(2) != 101) )
      {
         if ( GXutil.strcmp(H00QN4_A13746ForPrdCDsc[0], A13746ForPrdCDsc) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13746ForPrdCDsc = H00QN4_A13746ForPrdCDsc[0] ;
            A396EmprCod = H00QN4_A396EmprCod[0] ;
            A490ForPrdUMe = H00QN4_A490ForPrdUMe[0] ;
         }
         pr_default.readNext(2);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")))+"\"") ;
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
      rfQN2( ) ;
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
      edtavProforcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProforcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProforcod_Enabled), 5, 0), true);
      edtavProfordsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProfordsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProfordsc_Enabled), 5, 0), true);
   }

   public void rfQN2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e14QN2 ();
         wbQN0( ) ;
      }
   }

   public void send_integrity_lvl_hashesQN2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavProforcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProforcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProforcod_Enabled), 5, 0), true);
      edtavProfordsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProfordsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProfordsc_Enabled), 5, 0), true);
      /* Using cursor H00QN6 */
      pr_default.execute(3, new Object[] {AV5Emprcod, AV9ProForPrd});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A40000PrdNom = H00QN6_A40000PrdNom[0] ;
         n40000PrdNom = H00QN6_n40000PrdNom[0] ;
         A40001PrdUMeFo = H00QN6_A40001PrdUMeFo[0] ;
         n40001PrdUMeFo = H00QN6_n40001PrdUMeFo[0] ;
      }
      else
      {
         A40000PrdNom = " " ;
         n40000PrdNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A40000PrdNom", A40000PrdNom);
         A40001PrdUMeFo = (byte)(0) ;
         n40001PrdUMeFo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A40001PrdUMeFo", GXutil.str( A40001PrdUMeFo, 1, 0));
      }
      pr_default.close(3);
      fix_multi_value_controls( ) ;
   }

   public void strupQN0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e12QN2 ();
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
         Dvelop_confirmpanel_btninsertarlinea_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNINSERTARLINEA_Title") ;
         Dvelop_confirmpanel_btninsertarlinea_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNINSERTARLINEA_Confirmationtext") ;
         Dvelop_confirmpanel_btninsertarlinea_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNINSERTARLINEA_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btninsertarlinea_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNINSERTARLINEA_Nobuttoncaption") ;
         Dvelop_confirmpanel_btninsertarlinea_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNINSERTARLINEA_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btninsertarlinea_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNINSERTARLINEA_Yesbuttonposition") ;
         Dvelop_confirmpanel_btninsertarlinea_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNINSERTARLINEA_Confirmtype") ;
         Dvelop_confirmpanel_btninsertarlinea_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNINSERTARLINEA_Result") ;
         /* Read variables values. */
         AV6Proforcod = httpContext.cgiGet( edtavProforcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Proforcod", AV6Proforcod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavProforlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavProforlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPROFORLIN");
            GX_FocusControl = edtavProforlin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8ProForLin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8ProForLin), 4, 0));
         }
         else
         {
            AV8ProForLin = (short)(localUtil.ctol( httpContext.cgiGet( edtavProforlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8ProForLin), 4, 0));
         }
         AV9ProForPrd = httpContext.cgiGet( edtavProforprd_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9ProForPrd", AV9ProForPrd);
         AV10ProForDes = httpContext.cgiGet( edtavProfordes_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10ProForDes", AV10ProForDes);
         hV11ForPrdUMe = httpContext.cgiGet( edtavForprdume_Internalname) ;
         if ( (GXutil.strcmp("", hV11ForPrdUMe)==0) )
         {
            AV11ForPrdUMe = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11ForPrdUMe", GXutil.str( AV11ForPrdUMe, 1, 0));
         }
         else
         {
            A13746ForPrdCDsc = hV11ForPrdUMe ;
            /* Using cursor H00QN7 */
            pr_default.execute(4, new Object[] {A13746ForPrdCDsc});
            AV11ForPrdUMe = H00QN7_A490ForPrdUMe[0] ;
            if ( ! ( (pr_default.getStatus(4) == 101) ) )
            {
               pr_default.readNext(4);
               if ( ! ( (pr_default.getStatus(4) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "vFORPRDUME");
                  GX_FocusControl = edtavForprdume_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(4);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV11ForPrdUMe", hV11ForPrdUMe);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavProforcan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavProforcan_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPROFORCAN");
            GX_FocusControl = edtavProforcan_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13ProForCan = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13ProForCan", GXutil.ltrimstr( AV13ProForCan, 12, 5));
         }
         else
         {
            AV13ProForCan = localUtil.ctond( httpContext.cgiGet( edtavProforcan_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13ProForCan", GXutil.ltrimstr( AV13ProForCan, 12, 5));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavProfornro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavProfornro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPROFORNRO");
            GX_FocusControl = edtavProfornro_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14ProForNro = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14ProForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14ProForNro), 2, 0));
         }
         else
         {
            AV14ProForNro = (byte)(localUtil.ctol( httpContext.cgiGet( edtavProfornro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14ProForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14ProForNro), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavProfortnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavProfortnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPROFORTNQ");
            GX_FocusControl = edtavProfortnq_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15ProForTnq = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15ProForTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15ProForTnq), 2, 0));
         }
         else
         {
            AV15ProForTnq = (byte)(localUtil.ctol( httpContext.cgiGet( edtavProfortnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15ProForTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15ProForTnq), 2, 0));
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
      e12QN2 ();
      if ( returnInSub )
      {
         pr_default.close(3);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e12QN2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV22Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webinslineaprocesoquimico_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Station = GXt_char1 ;
      GXv_char2[0] = AV5Emprcod ;
      GXv_char3[0] = AV23Emprnom ;
      GXv_char4[0] = AV24Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char2, GXv_char3, GXv_char4) ;
      webinslineaprocesoquimico_impl.this.AV5Emprcod = GXv_char2[0] ;
      webinslineaprocesoquimico_impl.this.AV23Emprnom = GXv_char3[0] ;
      webinslineaprocesoquimico_impl.this.AV24Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
   }

   public void e11QN2( )
   {
      /* Dvelop_confirmpanel_btninsertarlinea_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btninsertarlinea_Result, "Yes") == 0 )
      {
         if ( (0==AV8ProForLin) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor incorrecto", ""));
            GX_FocusControl = edtavProforlin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            /* Execute user subroutine: 'EXISTELINEALPROFO' */
            S112 ();
            if ( returnInSub )
            {
               pr_default.close(3);
               returnInSub = true;
               if (true) return;
            }
            if ( AV16Existelinea == 1 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Esta linea (#) ya existe", ""));
               GX_FocusControl = edtavProforlin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               GXv_char4[0] = AV5Emprcod ;
               GXv_char3[0] = AV6Proforcod ;
               GXv_int5[0] = AV8ProForLin ;
               GXv_char2[0] = AV9ProForPrd ;
               GXv_char6[0] = AV10ProForDes ;
               GXv_int7[0] = AV11ForPrdUMe ;
               GXv_decimal8[0] = AV13ProForCan ;
               GXv_int9[0] = AV14ProForNro ;
               GXv_int10[0] = AV15ProForTnq ;
               new app.inslineaprocesoquimico(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int5, GXv_char2, GXv_char6, GXv_int7, GXv_decimal8, GXv_int9, GXv_int10) ;
               webinslineaprocesoquimico_impl.this.AV5Emprcod = GXv_char4[0] ;
               webinslineaprocesoquimico_impl.this.AV6Proforcod = GXv_char3[0] ;
               webinslineaprocesoquimico_impl.this.AV8ProForLin = GXv_int5[0] ;
               webinslineaprocesoquimico_impl.this.AV9ProForPrd = GXv_char2[0] ;
               webinslineaprocesoquimico_impl.this.AV10ProForDes = GXv_char6[0] ;
               webinslineaprocesoquimico_impl.this.AV11ForPrdUMe = GXv_int7[0] ;
               webinslineaprocesoquimico_impl.this.AV13ProForCan = GXv_decimal8[0] ;
               webinslineaprocesoquimico_impl.this.AV14ProForNro = GXv_int9[0] ;
               webinslineaprocesoquimico_impl.this.AV15ProForTnq = GXv_int10[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
               httpContext.ajax_rsp_assign_attri("", false, "AV6Proforcod", AV6Proforcod);
               httpContext.ajax_rsp_assign_attri("", false, "AV8ProForLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8ProForLin), 4, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV9ProForPrd", AV9ProForPrd);
               httpContext.ajax_rsp_assign_attri("", false, "AV10ProForDes", AV10ProForDes);
               httpContext.ajax_rsp_assign_attri("", false, "AV11ForPrdUMe", GXutil.str( AV11ForPrdUMe, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV13ProForCan", GXutil.ltrimstr( AV13ProForCan, 12, 5));
               httpContext.ajax_rsp_assign_attri("", false, "AV14ProForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14ProForNro), 2, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV15ProForTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15ProForTnq), 2, 0));
               AV17ObjetoRefrescar.add(httpContext.getMessage( "TPROFOR", ""), 0);
               this.executeExternalObjectMethod("", false, "GlobalEvents", "RefrescarObjeto", new Object[] {AV17ObjetoRefrescar,Boolean.valueOf(true)}, true);
               httpContext.setWebReturnParms(new Object[] {AV5Emprcod,AV6Proforcod,AV7ProForDsc});
               httpContext.setWebReturnParmsMetadata(new Object[] {"AV5Emprcod","AV6Proforcod","AV7ProForDsc"});
               httpContext.wjLocDisableFrm = (byte)(1) ;
               httpContext.nUserReturn = (byte)(1) ;
               pr_default.close(3);
               returnInSub = true;
               if (true) return;
            }
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17ObjetoRefrescar", AV17ObjetoRefrescar);
   }

   public void e13QN2( )
   {
      /* Proforprd_Isvalid Routine */
      returnInSub = false ;
      /* Using cursor H00QN9 */
      pr_default.execute(5, new Object[] {AV5Emprcod, AV9ProForPrd});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A40000PrdNom = H00QN9_A40000PrdNom[0] ;
         n40000PrdNom = H00QN9_n40000PrdNom[0] ;
         A40001PrdUMeFo = H00QN9_A40001PrdUMeFo[0] ;
         n40001PrdUMeFo = H00QN9_n40001PrdUMeFo[0] ;
      }
      else
      {
         A40000PrdNom = " " ;
         n40000PrdNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A40000PrdNom", A40000PrdNom);
         A40001PrdUMeFo = (byte)(0) ;
         n40001PrdUMeFo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A40001PrdUMeFo", GXutil.str( A40001PrdUMeFo, 1, 0));
      }
      pr_default.close(5);
      if ( ! (GXutil.strcmp("", AV9ProForPrd)==0) )
      {
         AV10ProForDes = A40000PrdNom ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10ProForDes", AV10ProForDes);
         AV11ForPrdUMe = A40001PrdUMeFo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11ForPrdUMe", GXutil.str( AV11ForPrdUMe, 1, 0));
         /* Using cursor H00QN10 */
         pr_default.execute(6, new Object[] {Byte.valueOf(AV11ForPrdUMe)});
         hV11ForPrdUMe = "" ;
         while ( (pr_default.getStatus(6) != 101) )
         {
            hV11ForPrdUMe = H00QN10_A13746ForPrdCDsc[0] ;
            if (true) break;
         }
         pr_default.close(6);
         httpContext.ajax_rsp_assign_attri("", false, "hV11ForPrdUMe", hV11ForPrdUMe);
      }
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'EXISTELINEALPROFO' Routine */
      returnInSub = false ;
      AV16Existelinea = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Existelinea", GXutil.str( AV16Existelinea, 1, 0));
      /* Using cursor H00QN11 */
      pr_default.execute(7, new Object[] {AV5Emprcod, AV6Proforcod, Short.valueOf(AV8ProForLin)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A767ProForLin = H00QN11_A767ProForLin[0] ;
         A764ProForCod = H00QN11_A764ProForCod[0] ;
         A396EmprCod = H00QN11_A396EmprCod[0] ;
         AV16Existelinea = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Existelinea", GXutil.str( AV16Existelinea, 1, 0));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
   }

   protected void nextLoad( )
   {
   }

   protected void e14QN2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table2_110_QN2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btninsertarlinea_Internalname, tblTabledvelop_confirmpanel_btninsertarlinea_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btninsertarlinea.setProperty("Title", Dvelop_confirmpanel_btninsertarlinea_Title);
         ucDvelop_confirmpanel_btninsertarlinea.setProperty("ConfirmationText", Dvelop_confirmpanel_btninsertarlinea_Confirmationtext);
         ucDvelop_confirmpanel_btninsertarlinea.setProperty("YesButtonCaption", Dvelop_confirmpanel_btninsertarlinea_Yesbuttoncaption);
         ucDvelop_confirmpanel_btninsertarlinea.setProperty("NoButtonCaption", Dvelop_confirmpanel_btninsertarlinea_Nobuttoncaption);
         ucDvelop_confirmpanel_btninsertarlinea.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btninsertarlinea_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btninsertarlinea.setProperty("YesButtonPosition", Dvelop_confirmpanel_btninsertarlinea_Yesbuttonposition);
         ucDvelop_confirmpanel_btninsertarlinea.setProperty("ConfirmType", Dvelop_confirmpanel_btninsertarlinea_Confirmtype);
         ucDvelop_confirmpanel_btninsertarlinea.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btninsertarlinea_Internalname, "DVELOP_CONFIRMPANEL_BTNINSERTARLINEAContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_BTNINSERTARLINEAContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_110_QN2e( true) ;
      }
      else
      {
         wb_table2_110_QN2e( false) ;
      }
   }

   public void wb_table1_101_QN2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable3_Internalname, tblUnnamedtable3_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsertarlinea_Internalname, "", httpContext.getMessage( "Insertar Linea", ""), bttBtninsertarlinea_Jsonclick, 7, httpContext.getMessage( "Insertar Linea", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e15qn1_client"+"'", TempTags, "", 2, "HLP_WebInsLineaProcesoQuimico.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_101_QN2e( true) ;
      }
      else
      {
         wb_table1_101_QN2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
      AV6Proforcod = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Proforcod", AV6Proforcod);
      AV7ProForDsc = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7ProForDsc", AV7ProForDsc);
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
      paQN2( ) ;
      wsQN2( ) ;
      weQN2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026799181340", true, true);
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
      httpContext.AddJavascriptSource("webinslineaprocesoquimico.js", "?2026799181340", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTextblockproforcod_Internalname = "TEXTBLOCKPROFORCOD" ;
      edtavProforcod_Internalname = "vPROFORCOD" ;
      divUnnamedtableproforcod_Internalname = "UNNAMEDTABLEPROFORCOD" ;
      edtavProfordsc_Internalname = "vPROFORDSC" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      lblTextblockproforlin_Internalname = "TEXTBLOCKPROFORLIN" ;
      edtavProforlin_Internalname = "vPROFORLIN" ;
      divUnnamedtableproforlin_Internalname = "UNNAMEDTABLEPROFORLIN" ;
      lblTextblockproforprd_Internalname = "TEXTBLOCKPROFORPRD" ;
      edtavProforprd_Internalname = "vPROFORPRD" ;
      divUnnamedtableproforprd_Internalname = "UNNAMEDTABLEPROFORPRD" ;
      lblTextblockprofordes_Internalname = "TEXTBLOCKPROFORDES" ;
      edtavProfordes_Internalname = "vPROFORDES" ;
      divUnnamedtableprofordes_Internalname = "UNNAMEDTABLEPROFORDES" ;
      lblTextblockforprdume_Internalname = "TEXTBLOCKFORPRDUME" ;
      edtavForprdume_Internalname = "vFORPRDUME" ;
      divUnnamedtableforprdume_Internalname = "UNNAMEDTABLEFORPRDUME" ;
      lblTextblockproforcan_Internalname = "TEXTBLOCKPROFORCAN" ;
      edtavProforcan_Internalname = "vPROFORCAN" ;
      divUnnamedtableproforcan_Internalname = "UNNAMEDTABLEPROFORCAN" ;
      lblTextblockprofornro_Internalname = "TEXTBLOCKPROFORNRO" ;
      edtavProfornro_Internalname = "vPROFORNRO" ;
      divUnnamedtableprofornro_Internalname = "UNNAMEDTABLEPROFORNRO" ;
      lblTextblockprofortnq_Internalname = "TEXTBLOCKPROFORTNQ" ;
      edtavProfortnq_Internalname = "vPROFORTNQ" ;
      divUnnamedtableprofortnq_Internalname = "UNNAMEDTABLEPROFORTNQ" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      bttBtninsertarlinea_Internalname = "BTNINSERTARLINEA" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      tblUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Dvelop_confirmpanel_btninsertarlinea_Internalname = "DVELOP_CONFIRMPANEL_BTNINSERTARLINEA" ;
      tblTabledvelop_confirmpanel_btninsertarlinea_Internalname = "TABLEDVELOP_CONFIRMPANEL_BTNINSERTARLINEA" ;
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
      edtavProfortnq_Jsonclick = "" ;
      edtavProfortnq_Enabled = 1 ;
      edtavProfornro_Jsonclick = "" ;
      edtavProfornro_Enabled = 1 ;
      edtavProforcan_Jsonclick = "" ;
      edtavProforcan_Enabled = 1 ;
      edtavForprdume_Jsonclick = "" ;
      edtavForprdume_Enabled = 1 ;
      edtavProfordes_Jsonclick = "" ;
      edtavProfordes_Enabled = 1 ;
      edtavProforprd_Jsonclick = "" ;
      edtavProforprd_Enabled = 1 ;
      edtavProforlin_Jsonclick = "" ;
      edtavProforlin_Enabled = 1 ;
      edtavProfordsc_Jsonclick = "" ;
      edtavProfordsc_Enabled = 0 ;
      edtavProforcod_Jsonclick = "" ;
      edtavProforcod_Enabled = 0 ;
      Dvelop_confirmpanel_btninsertarlinea_Confirmtype = "1" ;
      Dvelop_confirmpanel_btninsertarlinea_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btninsertarlinea_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btninsertarlinea_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btninsertarlinea_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btninsertarlinea_Confirmationtext = "¿Desea insertar la linea?" ;
      Dvelop_confirmpanel_btninsertarlinea_Title = "" ;
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
      Form.setCaption( httpContext.getMessage( "Web Ins Linea Proceso Quimico", "") );
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

   public void validv_Forprdume( )
   {
      if ( (GXutil.strcmp("", hV11ForPrdUMe)==0) )
      {
         AV11ForPrdUMe = (byte)(0) ;
      }
      else
      {
         A13746ForPrdCDsc = hV11ForPrdUMe ;
         /* Using cursor H00QN12 */
         pr_default.execute(8, new Object[] {A13746ForPrdCDsc});
         AV11ForPrdUMe = H00QN12_A490ForPrdUMe[0] ;
         if ( ! ( (pr_default.getStatus(8) == 101) ) )
         {
            pr_default.readNext(8);
            if ( ! ( (pr_default.getStatus(8) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "vFORPRDUME");
               GX_FocusControl = edtavForprdume_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(8);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV11ForPrdUMe", hV11ForPrdUMe);
      if ( ! ( ( AV11ForPrdUMe == 0 ) || ( AV11ForPrdUMe == 1 ) || ( AV11ForPrdUMe == 2 ) || ( AV11ForPrdUMe == 3 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "For Prd UMe", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "vFORPRDUME");
         GX_FocusControl = edtavForprdume_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV11ForPrdUMe", GXutil.ltrim( localUtil.ntoc( AV11ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV11ForPrdUMe", hV11ForPrdUMe);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOINSERTARLINEA'","{handler:'e15QN1',iparms:[]");
      setEventMetadata("'DOINSERTARLINEA'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNINSERTARLINEA.CLOSE","{handler:'e11QN2',iparms:[{av:'Dvelop_confirmpanel_btninsertarlinea_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNINSERTARLINEA',prop:'Result'},{av:'AV8ProForLin',fld:'vPROFORLIN',pic:'ZZZ9'},{av:'AV16Existelinea',fld:'vEXISTELINEA',pic:'9'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Proforcod',fld:'vPROFORCOD',pic:''},{av:'AV9ProForPrd',fld:'vPROFORPRD',pic:''},{av:'AV10ProForDes',fld:'vPROFORDES',pic:''},{av:'AV11ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV13ProForCan',fld:'vPROFORCAN',pic:'ZZZZZ9.9999'},{av:'AV14ProForNro',fld:'vPROFORNRO',pic:'Z9'},{av:'AV15ProForTnq',fld:'vPROFORTNQ',pic:'Z9'},{av:'AV17ObjetoRefrescar',fld:'vOBJETOREFRESCAR',pic:''},{av:'AV7ProForDsc',fld:'vPROFORDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A767ProForLin',fld:'PROFORLIN',pic:'ZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNINSERTARLINEA.CLOSE",",oparms:[{av:'AV15ProForTnq',fld:'vPROFORTNQ',pic:'Z9'},{av:'AV14ProForNro',fld:'vPROFORNRO',pic:'Z9'},{av:'AV13ProForCan',fld:'vPROFORCAN',pic:'ZZZZZ9.9999'},{av:'AV11ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV10ProForDes',fld:'vPROFORDES',pic:''},{av:'AV9ProForPrd',fld:'vPROFORPRD',pic:''},{av:'AV8ProForLin',fld:'vPROFORLIN',pic:'ZZZ9'},{av:'AV6Proforcod',fld:'vPROFORCOD',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV17ObjetoRefrescar',fld:'vOBJETOREFRESCAR',pic:''},{av:'AV16Existelinea',fld:'vEXISTELINEA',pic:'9'}]}");
      setEventMetadata("VPROFORPRD.ISVALID","{handler:'e13QN2',iparms:[{av:'AV9ProForPrd',fld:'vPROFORPRD',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("VPROFORPRD.ISVALID",",oparms:[{av:'AV10ProForDes',fld:'vPROFORDES',pic:''},{av:'A40000PrdNom',fld:'PRDNOM',pic:''},{av:'AV11ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'A40001PrdUMeFo',fld:'PRDUMEFO',pic:'9'}]}");
      setEventMetadata("VALIDV_PROFORCOD","{handler:'validv_Proforcod',iparms:[]");
      setEventMetadata("VALIDV_PROFORCOD",",oparms:[]}");
      setEventMetadata("VALIDV_PROFORLIN","{handler:'validv_Proforlin',iparms:[]");
      setEventMetadata("VALIDV_PROFORLIN",",oparms:[]}");
      setEventMetadata("VALIDV_FORPRDUME","{handler:'validv_Forprdume',iparms:[{av:'hV11ForPrdUMe'},{av:'AV11ForPrdUMe',fld:'vFORPRDUME',pic:'9'}]");
      setEventMetadata("VALIDV_FORPRDUME",",oparms:[{av:'AV11ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'hV11ForPrdUMe'}]}");
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
      wcpOAV5Emprcod = "" ;
      wcpOAV6Proforcod = "" ;
      wcpOAV7ProForDsc = "" ;
      Dvelop_confirmpanel_btninsertarlinea_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A770ProForPrd = "" ;
      A13746ForPrdCDsc = "" ;
      hV11ForPrdUMe = "" ;
      AV5Emprcod = "" ;
      AV6Proforcod = "" ;
      AV7ProForDsc = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV17ObjetoRefrescar = new GXSimpleCollection<String>(String.class, "internal", "");
      A396EmprCod = "" ;
      A764ProForCod = "" ;
      A40000PrdNom = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      lblTextblockproforcod_Jsonclick = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      lblTextblockproforlin_Jsonclick = "" ;
      TempTags = "" ;
      lblTextblockproforprd_Jsonclick = "" ;
      AV9ProForPrd = "" ;
      lblTextblockprofordes_Jsonclick = "" ;
      AV10ProForDes = "" ;
      lblTextblockforprdume_Jsonclick = "" ;
      lblTextblockproforcan_Jsonclick = "" ;
      AV13ProForCan = DecimalUtil.ZERO ;
      lblTextblockprofornro_Jsonclick = "" ;
      lblTextblockprofortnq_Jsonclick = "" ;
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l770ProForPrd = "" ;
      H00QN2_A770ProForPrd = new String[] {""} ;
      l13746ForPrdCDsc = "" ;
      H00QN3_A13746ForPrdCDsc = new String[] {""} ;
      H00QN4_A13746ForPrdCDsc = new String[] {""} ;
      H00QN4_A396EmprCod = new String[] {""} ;
      H00QN4_A490ForPrdUMe = new byte[1] ;
      H00QN6_A40000PrdNom = new String[] {""} ;
      H00QN6_n40000PrdNom = new boolean[] {false} ;
      H00QN6_A40001PrdUMeFo = new byte[1] ;
      H00QN6_n40001PrdUMeFo = new boolean[] {false} ;
      H00QN7_A13746ForPrdCDsc = new String[] {""} ;
      H00QN7_A396EmprCod = new String[] {""} ;
      H00QN7_A490ForPrdUMe = new byte[1] ;
      AV22Station = "" ;
      GXt_char1 = "" ;
      AV23Emprnom = "" ;
      AV24Usurcod = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int5 = new short[1] ;
      GXv_char2 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_int7 = new byte[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_int9 = new byte[1] ;
      GXv_int10 = new byte[1] ;
      H00QN9_A40000PrdNom = new String[] {""} ;
      H00QN9_n40000PrdNom = new boolean[] {false} ;
      H00QN9_A40001PrdUMeFo = new byte[1] ;
      H00QN9_n40001PrdUMeFo = new boolean[] {false} ;
      H00QN10_A13746ForPrdCDsc = new String[] {""} ;
      H00QN10_A396EmprCod = new String[] {""} ;
      H00QN10_A490ForPrdUMe = new byte[1] ;
      H00QN11_A767ProForLin = new short[1] ;
      H00QN11_A764ProForCod = new String[] {""} ;
      H00QN11_A396EmprCod = new String[] {""} ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_btninsertarlinea = new com.genexus.webpanels.GXUserControl();
      bttBtninsertarlinea_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      H00QN12_A13746ForPrdCDsc = new String[] {""} ;
      H00QN12_A396EmprCod = new String[] {""} ;
      H00QN12_A490ForPrdUMe = new byte[1] ;
      ZhV11ForPrdUMe = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webinslineaprocesoquimico__default(),
         new Object[] {
             new Object[] {
            H00QN2_A770ProForPrd
            }
            , new Object[] {
            H00QN3_A13746ForPrdCDsc
            }
            , new Object[] {
            H00QN4_A13746ForPrdCDsc, H00QN4_A396EmprCod, H00QN4_A490ForPrdUMe
            }
            , new Object[] {
            H00QN6_A40000PrdNom, H00QN6_n40000PrdNom, H00QN6_A40001PrdUMeFo, H00QN6_n40001PrdUMeFo
            }
            , new Object[] {
            H00QN7_A13746ForPrdCDsc, H00QN7_A396EmprCod, H00QN7_A490ForPrdUMe
            }
            , new Object[] {
            H00QN9_A40000PrdNom, H00QN9_n40000PrdNom, H00QN9_A40001PrdUMeFo, H00QN9_n40001PrdUMeFo
            }
            , new Object[] {
            H00QN10_A13746ForPrdCDsc, H00QN10_A396EmprCod, H00QN10_A490ForPrdUMe
            }
            , new Object[] {
            H00QN11_A767ProForLin, H00QN11_A764ProForCod, H00QN11_A396EmprCod
            }
            , new Object[] {
            H00QN12_A13746ForPrdCDsc, H00QN12_A396EmprCod, H00QN12_A490ForPrdUMe
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavProforcod_Enabled = 0 ;
      edtavProfordsc_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV16Existelinea ;
   private byte AV11ForPrdUMe ;
   private byte A40001PrdUMeFo ;
   private byte AV14ProForNro ;
   private byte AV15ProForTnq ;
   private byte nDonePA ;
   private byte A490ForPrdUMe ;
   private byte GXv_int7[] ;
   private byte GXv_int9[] ;
   private byte GXv_int10[] ;
   private byte nGXWrapped ;
   private byte ZV11ForPrdUMe ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short A767ProForLin ;
   private short wbEnd ;
   private short wbStart ;
   private short AV8ProForLin ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private short GXv_int5[] ;
   private int edtavProforcod_Enabled ;
   private int edtavProfordsc_Enabled ;
   private int edtavProforlin_Enabled ;
   private int edtavProforprd_Enabled ;
   private int edtavProfordes_Enabled ;
   private int edtavForprdume_Enabled ;
   private int edtavProforcan_Enabled ;
   private int edtavProfornro_Enabled ;
   private int edtavProfortnq_Enabled ;
   private int gxdynajaxindex ;
   private int idxLst ;
   private java.math.BigDecimal AV13ProForCan ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private String wcpOAV5Emprcod ;
   private String wcpOAV6Proforcod ;
   private String wcpOAV7ProForDsc ;
   private String Dvelop_confirmpanel_btninsertarlinea_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A770ProForPrd ;
   private String AV5Emprcod ;
   private String AV6Proforcod ;
   private String AV7ProForDsc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String A40000PrdNom ;
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
   private String Dvelop_confirmpanel_btninsertarlinea_Title ;
   private String Dvelop_confirmpanel_btninsertarlinea_Confirmationtext ;
   private String Dvelop_confirmpanel_btninsertarlinea_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btninsertarlinea_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btninsertarlinea_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btninsertarlinea_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btninsertarlinea_Confirmtype ;
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
   private String divUnnamedtableproforcod_Internalname ;
   private String lblTextblockproforcod_Internalname ;
   private String lblTextblockproforcod_Jsonclick ;
   private String edtavProforcod_Internalname ;
   private String edtavProforcod_Jsonclick ;
   private String edtavProfordsc_Internalname ;
   private String edtavProfordsc_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String divUnnamedtableproforlin_Internalname ;
   private String lblTextblockproforlin_Internalname ;
   private String lblTextblockproforlin_Jsonclick ;
   private String edtavProforlin_Internalname ;
   private String TempTags ;
   private String edtavProforlin_Jsonclick ;
   private String divUnnamedtableproforprd_Internalname ;
   private String lblTextblockproforprd_Internalname ;
   private String lblTextblockproforprd_Jsonclick ;
   private String edtavProforprd_Internalname ;
   private String AV9ProForPrd ;
   private String edtavProforprd_Jsonclick ;
   private String divUnnamedtableprofordes_Internalname ;
   private String lblTextblockprofordes_Internalname ;
   private String lblTextblockprofordes_Jsonclick ;
   private String edtavProfordes_Internalname ;
   private String AV10ProForDes ;
   private String edtavProfordes_Jsonclick ;
   private String divUnnamedtableforprdume_Internalname ;
   private String lblTextblockforprdume_Internalname ;
   private String lblTextblockforprdume_Jsonclick ;
   private String edtavForprdume_Internalname ;
   private String edtavForprdume_Jsonclick ;
   private String divUnnamedtableproforcan_Internalname ;
   private String lblTextblockproforcan_Internalname ;
   private String lblTextblockproforcan_Jsonclick ;
   private String edtavProforcan_Internalname ;
   private String edtavProforcan_Jsonclick ;
   private String divUnnamedtableprofornro_Internalname ;
   private String lblTextblockprofornro_Internalname ;
   private String lblTextblockprofornro_Jsonclick ;
   private String edtavProfornro_Internalname ;
   private String edtavProfornro_Jsonclick ;
   private String divUnnamedtableprofortnq_Internalname ;
   private String lblTextblockprofortnq_Internalname ;
   private String lblTextblockprofortnq_Jsonclick ;
   private String edtavProfortnq_Internalname ;
   private String edtavProfortnq_Jsonclick ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String l770ProForPrd ;
   private String AV22Station ;
   private String GXt_char1 ;
   private String AV23Emprnom ;
   private String AV24Usurcod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char6[] ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_btninsertarlinea_Internalname ;
   private String Dvelop_confirmpanel_btninsertarlinea_Internalname ;
   private String tblUnnamedtable3_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String bttBtninsertarlinea_Internalname ;
   private String bttBtninsertarlinea_Jsonclick ;
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
   private boolean n40000PrdNom ;
   private boolean n40001PrdUMeFo ;
   private boolean returnInSub ;
   private String A13746ForPrdCDsc ;
   private String hV11ForPrdUMe ;
   private String l13746ForPrdCDsc ;
   private String ZhV11ForPrdUMe ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btninsertarlinea ;
   private IDataStoreProvider pr_default ;
   private String[] H00QN2_A770ProForPrd ;
   private String[] H00QN3_A13746ForPrdCDsc ;
   private String[] H00QN4_A13746ForPrdCDsc ;
   private String[] H00QN4_A396EmprCod ;
   private byte[] H00QN4_A490ForPrdUMe ;
   private String[] H00QN6_A40000PrdNom ;
   private boolean[] H00QN6_n40000PrdNom ;
   private byte[] H00QN6_A40001PrdUMeFo ;
   private boolean[] H00QN6_n40001PrdUMeFo ;
   private String[] H00QN7_A13746ForPrdCDsc ;
   private String[] H00QN7_A396EmprCod ;
   private byte[] H00QN7_A490ForPrdUMe ;
   private String[] H00QN9_A40000PrdNom ;
   private boolean[] H00QN9_n40000PrdNom ;
   private byte[] H00QN9_A40001PrdUMeFo ;
   private boolean[] H00QN9_n40001PrdUMeFo ;
   private String[] H00QN10_A13746ForPrdCDsc ;
   private String[] H00QN10_A396EmprCod ;
   private byte[] H00QN10_A490ForPrdUMe ;
   private short[] H00QN11_A767ProForLin ;
   private String[] H00QN11_A764ProForCod ;
   private String[] H00QN11_A396EmprCod ;
   private String[] H00QN12_A13746ForPrdCDsc ;
   private String[] H00QN12_A396EmprCod ;
   private byte[] H00QN12_A490ForPrdUMe ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV17ObjetoRefrescar ;
}

final  class webinslineaprocesoquimico__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00QN2", "SELECT * FROM (SELECT DISTINCT ProForPrd FROM TXPLPROFO WHERE UPPER(ProForPrd) like '%' || UPPER(?) ORDER BY ProForPrd) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00QN3", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc FROM TXPUNMEPR WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, '')))) like '%' || UPPER(?) ORDER BY ForPrdCDsc) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00QN4", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00QN6", "SELECT COALESCE( T1.PrdNom, ' ') AS PrdNom, COALESCE( T1.PrdUMeFo, 0) AS PrdUMeFo FROM (SELECT PrdNom, EmprCod, PrdNum, PrdUMeFo FROM TXPPRODUC WHERE (EmprCod = ?) AND (PrdNum = ?) ) T1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00QN7", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00QN9", "SELECT COALESCE( T1.PrdNom, ' ') AS PrdNom, COALESCE( T1.PrdUMeFo, 0) AS PrdUMeFo FROM (SELECT PrdNom, EmprCod, PrdNum, PrdUMeFo FROM TXPPRODUC WHERE (EmprCod = ?) AND (PrdNum = ?) ) T1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00QN10", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE ForPrdUMe = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00QN11", "SELECT ProForLin, ProForCod, EmprCod FROM TXPLPROFO WHERE EmprCod = ? and ProForCod = ? and ProForLin = ? ORDER BY EmprCod, ProForCod, ProForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00QN12", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
               stmt.setString(1, (String)parms[0], 6);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
      }
   }

}

