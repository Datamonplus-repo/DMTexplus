package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class hojaderuta_pieza_ins_impl extends GXDataArea
{
   public hojaderuta_pieza_ins_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public hojaderuta_pieza_ins_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hojaderuta_pieza_ins_impl.class ));
   }

   public hojaderuta_pieza_ins_impl( int remoteHandle ,
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
            AV5EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV6BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
               AV7BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
               AV8BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodPar", AV8BarCodPar);
               AV25Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Clicod), 6, 0));
               AV34Discod = (int)(GXutil.lval( httpContext.GetPar( "Discod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV34Discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Discod), 8, 0));
               AV9BarUniMed = httpContext.GetPar( "BarUniMed") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9BarUniMed", AV9BarUniMed);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9BarUniMed, "@!"))));
               AV10BarPes = (short)(GXutil.lval( httpContext.GetPar( "BarPes"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10BarPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarPes), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10BarPes), "ZZZ9")));
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
      pa1S32( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1S32( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidosclientesindetalle.hojaderuta_pieza_ins", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV25Clicod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV34Discod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV9BarUniMed)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarPes,4,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","Clicod","Discod","BarUniMed","BarPes"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9BarUniMed, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10BarPes), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16TinEst), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11BarAgrEst, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vBARUNIMED", GXutil.rtrim( AV9BarUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9BarUniMed, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPES", GXutil.ltrim( localUtil.ntoc( AV10BarPes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10BarPes), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV6BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV7BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV8BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vTINEST", GXutil.ltrim( localUtil.ntoc( AV16TinEst, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16TinEst), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD", GXutil.ltrim( localUtil.ntoc( AV34Discod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARAGREST", GXutil.rtrim( AV11BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11BarAgrEst, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV25Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRPIEDIS", GXutil.ltrim( localUtil.ntoc( AV43albrpiedis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRUNIDIS", GXutil.ltrim( localUtil.ntoc( AV42Albrunidis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
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
         we1S32( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1S32( ) ;
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
      return formatLink("app.pedidosclientesindetalle.hojaderuta_pieza_ins", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV25Clicod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV34Discod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV9BarUniMed)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarPes,4,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","Clicod","Discod","BarUniMed","BarPes"})  ;
   }

   public String getPgmname( )
   {
      return "PedidosClienteSinDetalle.HojadeRuta_Pieza_INS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Agregar Entrada", "") ;
   }

   public void wb1S30( )
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
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent15", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbreccod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbreccod_Internalname, httpContext.getMessage( "Nº Recepcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbreccod_Internalname, GXutil.ltrim( localUtil.ntoc( AV12AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbreccod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV12AlbRecCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV12AlbRecCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbreccod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbreccod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Pieza_INS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+imgavPromptalbrec_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Active Bitmap Variable */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(imgavPromptalbrec_gximage, "")==0) ? "" : "GX_Image_"+imgavPromptalbrec_gximage+"_Class") ;
         StyleString = "" ;
         AV37promptalbrec_IsBlob = (boolean)(((GXutil.strcmp("", AV37promptalbrec)==0)&&(GXutil.strcmp("", AV46Promptalbrec_GXI)==0))||!(GXutil.strcmp("", AV37promptalbrec)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV37promptalbrec)==0) ? AV46Promptalbrec_GXI : httpContext.getResourceRelative(AV37promptalbrec)) ;
         app.GxWebStd.gx_bitmap( httpContext, imgavPromptalbrec_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, -1, 0, "", 0, "", 0, 0, 7, imgavPromptalbrec_Jsonclick, "'"+""+"'"+",false,"+"'"+"e111s31_client"+"'", StyleString, ClassString, "", "", "", "", ""+TempTags, "", "", 1, AV37promptalbrec_IsBlob, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_PedidosClienteSinDetalle\\HojadeRuta_Pieza_INS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpiekil_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpiekil_Internalname, httpContext.getMessage( "Kilos", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpiekil_Internalname, GXutil.ltrim( localUtil.ntoc( AV13BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarpiekil_Enabled!=0) ? localUtil.format( AV13BarPieKil, "ZZZZZ9.99") : localUtil.format( AV13BarPieKil, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpiekil_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpiekil_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Pieza_INS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpiemet_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpiemet_Internalname, httpContext.getMessage( "Metros", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpiemet_Internalname, GXutil.ltrim( localUtil.ntoc( AV14BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarpiemet_Enabled!=0) ? localUtil.format( AV14BarPieMet, "ZZZZZ9.99") : localUtil.format( AV14BarPieMet, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpiemet_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpiemet_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Pieza_INS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpiepie_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpiepie_Internalname, httpContext.getMessage( "Piezas", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpiepie_Internalname, GXutil.ltrim( localUtil.ntoc( AV15BarPiePie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarpiepie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV15BarPiePie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV15BarPiePie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpiepie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpiepie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta_Pieza_INS.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 5, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\HojadeRuta_Pieza_INS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\HojadeRuta_Pieza_INS.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         wb_table1_58_1S32( true) ;
      }
      else
      {
         wb_table1_58_1S32( false) ;
      }
      return  ;
   }

   public void wb_table1_58_1S32e( boolean wbgen )
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

   public void start1S32( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Agregar Entrada", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1S30( ) ;
   }

   public void ws1S32( )
   {
      start1S32( ) ;
      evt1S32( ) ;
   }

   public void evt1S32( )
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
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121S32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e131S32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoConfirmar' */
                           e141S32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e151S32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VALBRECCOD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e161S32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e171S32 ();
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

   public void we1S32( )
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

   public void pa1S32( )
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
            GX_FocusControl = edtavAlbreccod_Internalname ;
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
      rf1S32( ) ;
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

   public void rf1S32( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e171S32 ();
         wb1S30( ) ;
      }
   }

   public void send_integrity_lvl_hashes1S32( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vBARUNIMED", GXutil.rtrim( AV9BarUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9BarUniMed, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPES", GXutil.ltrim( localUtil.ntoc( AV10BarPes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10BarPes), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTINEST", GXutil.ltrim( localUtil.ntoc( AV16TinEst, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16TinEst), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARAGREST", GXutil.rtrim( AV11BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGREST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11BarAgrEst, "@!"))));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1S30( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e131S32 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         AV9BarUniMed = httpContext.cgiGet( "vBARUNIMED") ;
         AV43albrpiedis = (int)(localUtil.ctol( httpContext.cgiGet( "vALBRPIEDIS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV42Albrunidis = localUtil.ctond( httpContext.cgiGet( "vALBRUNIDIS")) ;
         AV25Clicod = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV5EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
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
         Dvelop_confirmpanel_confirmar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Title") ;
         Dvelop_confirmpanel_confirmar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_confirmar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_confirmar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype") ;
         Dvelop_confirmpanel_confirmar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbreccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbreccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBRECCOD");
            GX_FocusControl = edtavAlbreccod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12AlbRecCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12AlbRecCod), 8, 0));
         }
         else
         {
            AV12AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavAlbreccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12AlbRecCod), 8, 0));
         }
         AV37promptalbrec = httpContext.cgiGet( imgavPromptalbrec_Internalname) ;
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarpiekil_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarpiekil_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARPIEKIL");
            GX_FocusControl = edtavBarpiekil_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13BarPieKil = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13BarPieKil", GXutil.ltrimstr( AV13BarPieKil, 9, 2));
         }
         else
         {
            AV13BarPieKil = localUtil.ctond( httpContext.cgiGet( edtavBarpiekil_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13BarPieKil", GXutil.ltrimstr( AV13BarPieKil, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarpiemet_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarpiemet_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARPIEMET");
            GX_FocusControl = edtavBarpiemet_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14BarPieMet = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14BarPieMet", GXutil.ltrimstr( AV14BarPieMet, 9, 2));
         }
         else
         {
            AV14BarPieMet = localUtil.ctond( httpContext.cgiGet( edtavBarpiemet_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14BarPieMet", GXutil.ltrimstr( AV14BarPieMet, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarpiepie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarpiepie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARPIEPIE");
            GX_FocusControl = edtavBarpiepie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15BarPiePie = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarPiePie), 6, 0));
         }
         else
         {
            AV15BarPiePie = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarpiepie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarPiePie), 6, 0));
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
      e131S32 ();
      if (returnInSub) return;
   }

   public void e131S32( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_int1 = (byte)(AV16TinEst) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "TINEST", ""), GXv_int2) ;
      hojaderuta_pieza_ins_impl.this.GXt_int1 = GXv_int2[0] ;
      AV16TinEst = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16TinEst", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16TinEst), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16TinEst), "ZZZ9")));
      GXv_int2[0] = (byte)(AV17Vertic) ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "VERTIC", ""), GXv_int2) ;
      hojaderuta_pieza_ins_impl.this.AV17Vertic = GXv_int2[0] ;
      GXt_int1 = (byte)(AV18Tela) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "TEJIDO", ""), GXv_int2) ;
      hojaderuta_pieza_ins_impl.this.GXt_int1 = GXv_int2[0] ;
      AV18Tela = GXt_int1 ;
      GXt_int1 = (byte)(AV19Erfoc) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int2) ;
      hojaderuta_pieza_ins_impl.this.GXt_int1 = GXv_int2[0] ;
      AV19Erfoc = GXt_int1 ;
      GXt_int1 = (byte)(AV20TTRN22) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "TTRN22", ""), GXv_int2) ;
      hojaderuta_pieza_ins_impl.this.GXt_int1 = GXv_int2[0] ;
      AV20TTRN22 = GXt_int1 ;
      AV27Hdr = GXutil.trim( GXutil.str( AV6BarCod, 8, 0)) + "-" + GXutil.str( AV7BarCodReo, 1, 0) + AV8BarCodPar ;
      imgavPromptalbrec_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptalbrec_Internalname, "gximage", imgavPromptalbrec_gximage, true);
      AV37promptalbrec = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptalbrec_Internalname, "Bitmap", ((GXutil.strcmp("", AV37promptalbrec)==0) ? AV46Promptalbrec_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV37promptalbrec))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptalbrec_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV37promptalbrec), true);
      AV46Promptalbrec_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptalbrec_Internalname, "Bitmap", ((GXutil.strcmp("", AV37promptalbrec)==0) ? AV46Promptalbrec_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV37promptalbrec))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPromptalbrec_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV37promptalbrec), true);
      AV12AlbRecCod = AV38AlbRecCodIN ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12AlbRecCod), 8, 0));
      GXt_char3 = AV47Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      hojaderuta_pieza_ins_impl.this.GXt_char3 = GXv_char4[0] ;
      AV47Station = GXt_char3 ;
      GXv_char4[0] = AV5EmprCod ;
      GXv_char5[0] = AV48Emprnom ;
      GXv_char6[0] = AV49Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV47Station, GXv_char4, GXv_char5, GXv_char6) ;
      hojaderuta_pieza_ins_impl.this.AV5EmprCod = GXv_char4[0] ;
      hojaderuta_pieza_ins_impl.this.AV48Emprnom = GXv_char5[0] ;
      hojaderuta_pieza_ins_impl.this.AV49Usurcod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
   }

   public void e141S32( )
   {
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      if ( (0==AV15BarPiePie) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Debe entrar Piezas", ""));
         GX_FocusControl = edtavBarpiepie_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( (0==AV12AlbRecCod) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "N Recepcion nulo", ""));
            GX_FocusControl = edtavAlbreccod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( ( GXutil.strcmp(AV9BarUniMed, "K") == 0 ) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV13BarPieKil)==0) )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Debe de entrar Kilos", ""));
               GX_FocusControl = edtavBarpiekil_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               if ( ( GXutil.strcmp(AV9BarUniMed, "M") == 0 ) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV14BarPieMet)==0) )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "Debe de entrar Metros", ""));
                  GX_FocusControl = edtavBarpiemet_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               else
               {
                  GXv_decimal7[0] = AV30KilosDisp ;
                  GXv_decimal8[0] = AV31MetrosDisp ;
                  GXv_int9[0] = AV32PiezasDisp ;
                  GXv_char6[0] = AV29Errmessages ;
                  new app.unidadespiezasdisponibles(remoteHandle, context).execute( AV5EmprCod, AV12AlbRecCod, AV9BarUniMed, GXv_decimal7, GXv_decimal8, GXv_int9, GXv_char6) ;
                  hojaderuta_pieza_ins_impl.this.AV30KilosDisp = GXv_decimal7[0] ;
                  hojaderuta_pieza_ins_impl.this.AV31MetrosDisp = GXv_decimal8[0] ;
                  hojaderuta_pieza_ins_impl.this.AV32PiezasDisp = GXv_int9[0] ;
                  hojaderuta_pieza_ins_impl.this.AV29Errmessages = GXv_char6[0] ;
                  if ( ! (GXutil.strcmp("", AV29Errmessages)==0) )
                  {
                     httpContext.GX_msglist.addItem(AV29Errmessages);
                     GX_FocusControl = edtavAlbreccod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                  }
                  else
                  {
                     if ( ( GXutil.strcmp(AV9BarUniMed, "M") == 0 ) && ( DecimalUtil.compareTo(AV14BarPieMet, AV31MetrosDisp) > 0 ) )
                     {
                        Gx_msg = httpContext.getMessage( "Los metros ", "") + GXutil.trim( GXutil.str( AV14BarPieMet, 9, 2)) + httpContext.getMessage( " es mayor a los disponibles ", "") + GXutil.trim( GXutil.str( AV31MetrosDisp, 9, 2)) ;
                        httpContext.GX_msglist.addItem(Gx_msg);
                        GX_FocusControl = edtavAlbreccod_Internalname ;
                        httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        httpContext.doAjaxSetFocus(GX_FocusControl);
                     }
                     else
                     {
                        if ( ( GXutil.strcmp(AV9BarUniMed, "K") == 0 ) && ( DecimalUtil.compareTo(AV13BarPieKil, AV30KilosDisp) > 0 ) )
                        {
                           Gx_msg = httpContext.getMessage( "Los kilos ", "") + GXutil.trim( GXutil.str( AV13BarPieKil, 9, 2)) + httpContext.getMessage( " es mayor a los disponibles ", "") + GXutil.trim( GXutil.str( AV30KilosDisp, 9, 2)) ;
                           httpContext.GX_msglist.addItem(Gx_msg);
                           GX_FocusControl = edtavAlbreccod_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           httpContext.doAjaxSetFocus(GX_FocusControl);
                        }
                        else
                        {
                           this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_CONFIRMARContainer", "Confirm", "", new Object[] {});
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public void e121S32( )
   {
      /* Dvelop_confirmpanel_confirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_confirmar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFIRMAR' */
         S112 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e151S32( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {AV5EmprCod,Integer.valueOf(AV6BarCod),Byte.valueOf(AV7BarCodReo),AV8BarCodPar,Integer.valueOf(AV25Clicod),Integer.valueOf(AV34Discod),AV9BarUniMed,Short.valueOf(AV10BarPes)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV5EmprCod","AV6BarCod","AV7BarCodReo","AV8BarCodPar","AV25Clicod","AV34Discod","AV9BarUniMed","AV10BarPes"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      AV33BarpieCod = GXutil.str( AV12AlbRecCod, 8, 0) ;
      AV13BarPieKil = ((GXutil.strcmp(AV9BarUniMed, httpContext.getMessage( "M", ""))==0) ? AV14BarPieMet.multiply(DecimalUtil.doubleToDec(AV10BarPes)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) : AV13BarPieKil) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13BarPieKil", GXutil.ltrimstr( AV13BarPieKil, 9, 2));
      GXv_char6[0] = AV5EmprCod ;
      GXv_int9[0] = AV6BarCod ;
      GXv_int2[0] = AV7BarCodReo ;
      GXv_char5[0] = AV8BarCodPar ;
      GXv_int10[0] = AV12AlbRecCod ;
      GXv_char4[0] = AV33BarpieCod ;
      GXv_decimal8[0] = AV13BarPieKil ;
      GXv_decimal7[0] = AV14BarPieMet ;
      GXv_int11[0] = AV15BarPiePie ;
      new app.paltpin(remoteHandle, context).execute( GXv_char6, GXv_int9, GXv_int2, GXv_char5, GXv_int10, GXv_char4, GXv_decimal8, GXv_decimal7, GXv_int11) ;
      hojaderuta_pieza_ins_impl.this.AV5EmprCod = GXv_char6[0] ;
      hojaderuta_pieza_ins_impl.this.AV6BarCod = GXv_int9[0] ;
      hojaderuta_pieza_ins_impl.this.AV7BarCodReo = GXv_int2[0] ;
      hojaderuta_pieza_ins_impl.this.AV8BarCodPar = GXv_char5[0] ;
      hojaderuta_pieza_ins_impl.this.AV12AlbRecCod = GXv_int10[0] ;
      hojaderuta_pieza_ins_impl.this.AV33BarpieCod = GXv_char4[0] ;
      hojaderuta_pieza_ins_impl.this.AV13BarPieKil = GXv_decimal8[0] ;
      hojaderuta_pieza_ins_impl.this.AV14BarPieMet = GXv_decimal7[0] ;
      hojaderuta_pieza_ins_impl.this.AV15BarPiePie = GXv_int11[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodPar", AV8BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "AV12AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12AlbRecCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV13BarPieKil", GXutil.ltrimstr( AV13BarPieKil, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV14BarPieMet", GXutil.ltrimstr( AV14BarPieMet, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV15BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarPiePie), 6, 0));
      if ( AV16TinEst == 1 )
      {
         GXv_char6[0] = AV5EmprCod ;
         GXv_int11[0] = AV34Discod ;
         GXv_decimal8[0] = AV14BarPieMet ;
         GXv_int10[0] = AV15BarPiePie ;
         new app.pcreoemp(remoteHandle, context).execute( GXv_char6, GXv_int11, GXv_decimal8, GXv_int10) ;
         hojaderuta_pieza_ins_impl.this.AV5EmprCod = GXv_char6[0] ;
         hojaderuta_pieza_ins_impl.this.AV34Discod = GXv_int11[0] ;
         hojaderuta_pieza_ins_impl.this.AV14BarPieMet = GXv_decimal8[0] ;
         hojaderuta_pieza_ins_impl.this.AV15BarPiePie = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV34Discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Discod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV14BarPieMet", GXutil.ltrimstr( AV14BarPieMet, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV15BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarPiePie), 6, 0));
      }
      if ( GXutil.strcmp(AV11BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
      {
         GXv_char6[0] = AV5EmprCod ;
         GXv_int11[0] = AV6BarCod ;
         GXv_int2[0] = AV7BarCodReo ;
         GXv_char5[0] = AV8BarCodPar ;
         new app.pactagr(remoteHandle, context).execute( GXv_char6, GXv_int11, GXv_int2, GXv_char5) ;
         hojaderuta_pieza_ins_impl.this.AV5EmprCod = GXv_char6[0] ;
         hojaderuta_pieza_ins_impl.this.AV6BarCod = GXv_int11[0] ;
         hojaderuta_pieza_ins_impl.this.AV7BarCodReo = GXv_int2[0] ;
         hojaderuta_pieza_ins_impl.this.AV8BarCodPar = GXv_char5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodPar", AV8BarCodPar);
      }
      httpContext.setWebReturnParms(new Object[] {AV5EmprCod,Integer.valueOf(AV6BarCod),Byte.valueOf(AV7BarCodReo),AV8BarCodPar,Integer.valueOf(AV25Clicod),Integer.valueOf(AV34Discod),AV9BarUniMed,Short.valueOf(AV10BarPes)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV5EmprCod","AV6BarCod","AV7BarCodReo","AV8BarCodPar","AV25Clicod","AV34Discod","AV9BarUniMed","AV10BarPes"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e161S32( )
   {
      /* Albreccod_Controlvaluechanged Routine */
      returnInSub = false ;
      GXv_decimal8[0] = AV13BarPieKil ;
      GXv_decimal7[0] = AV14BarPieMet ;
      GXv_int11[0] = AV15BarPiePie ;
      GXv_char6[0] = AV29Errmessages ;
      new app.unidadespiezasdisponibles(remoteHandle, context).execute( AV5EmprCod, AV12AlbRecCod, AV9BarUniMed, GXv_decimal8, GXv_decimal7, GXv_int11, GXv_char6) ;
      hojaderuta_pieza_ins_impl.this.AV13BarPieKil = GXv_decimal8[0] ;
      hojaderuta_pieza_ins_impl.this.AV14BarPieMet = GXv_decimal7[0] ;
      hojaderuta_pieza_ins_impl.this.AV15BarPiePie = GXv_int11[0] ;
      hojaderuta_pieza_ins_impl.this.AV29Errmessages = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13BarPieKil", GXutil.ltrimstr( AV13BarPieKil, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV14BarPieMet", GXutil.ltrimstr( AV14BarPieMet, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV15BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarPiePie), 6, 0));
      if ( ! (GXutil.strcmp("", AV29Errmessages)==0) )
      {
         httpContext.GX_msglist.addItem(AV29Errmessages);
         GX_FocusControl = edtavAlbreccod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         httpContext.doAjaxRefresh();
      }
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e171S32( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_58_1S32( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_confirmar_Internalname, tblTabledvelop_confirmpanel_confirmar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_confirmar.setProperty("Title", Dvelop_confirmpanel_confirmar_Title);
         ucDvelop_confirmpanel_confirmar.setProperty("ConfirmationText", Dvelop_confirmpanel_confirmar_Confirmationtext);
         ucDvelop_confirmpanel_confirmar.setProperty("YesButtonCaption", Dvelop_confirmpanel_confirmar_Yesbuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("NoButtonCaption", Dvelop_confirmpanel_confirmar_Nobuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_confirmar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("YesButtonPosition", Dvelop_confirmpanel_confirmar_Yesbuttonposition);
         ucDvelop_confirmpanel_confirmar.setProperty("ConfirmType", Dvelop_confirmpanel_confirmar_Confirmtype);
         ucDvelop_confirmpanel_confirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_confirmar_Internalname, "DVELOP_CONFIRMPANEL_CONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_CONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_58_1S32e( true) ;
      }
      else
      {
         wb_table1_58_1S32e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      AV6BarCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
      AV7BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
      AV8BarCodPar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodPar", AV8BarCodPar);
      AV25Clicod = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Clicod), 6, 0));
      AV34Discod = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Discod), 8, 0));
      AV9BarUniMed = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9BarUniMed", AV9BarUniMed);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9BarUniMed, "@!"))));
      AV10BarPes = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10BarPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarPes), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10BarPes), "ZZZ9")));
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
      pa1S32( ) ;
      ws1S32( ) ;
      we1S32( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20267613484460", true, true);
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
      httpContext.AddJavascriptSource("pedidosclientesindetalle/hojaderuta_pieza_ins.js", "?20267613484460", false, true);
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
      edtavAlbreccod_Internalname = "vALBRECCOD" ;
      imgavPromptalbrec_Internalname = "vPROMPTALBREC" ;
      edtavBarpiekil_Internalname = "vBARPIEKIL" ;
      edtavBarpiemet_Internalname = "vBARPIEMET" ;
      edtavBarpiepie_Internalname = "vBARPIEPIE" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Dvelop_confirmpanel_confirmar_Internalname = "DVELOP_CONFIRMPANEL_CONFIRMAR" ;
      tblTabledvelop_confirmpanel_confirmar_Internalname = "TABLEDVELOP_CONFIRMPANEL_CONFIRMAR" ;
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
      edtavBarpiepie_Jsonclick = "" ;
      edtavBarpiepie_Enabled = 1 ;
      edtavBarpiemet_Jsonclick = "" ;
      edtavBarpiemet_Enabled = 1 ;
      edtavBarpiekil_Jsonclick = "" ;
      edtavBarpiekil_Enabled = 1 ;
      imgavPromptalbrec_Jsonclick = "" ;
      imgavPromptalbrec_gximage = "" ;
      edtavAlbreccod_Jsonclick = "" ;
      edtavAlbreccod_Enabled = 1 ;
      Dvelop_confirmpanel_confirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar_Confirmationtext = "¿Confirma Alta?" ;
      Dvelop_confirmpanel_confirmar_Title = httpContext.getMessage( "Confirmacion", "") ;
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
      Form.setCaption( httpContext.getMessage( "Agregar Entrada", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV16TinEst',fld:'vTINEST',pic:'ZZZ9',hsh:true},{av:'AV11BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV9BarUniMed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV10BarPes',fld:'vBARPES',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e141S32',iparms:[{av:'AV15BarPiePie',fld:'vBARPIEPIE',pic:'ZZZZZ9'},{av:'AV12AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV9BarUniMed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV13BarPieKil',fld:'vBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV14BarPieMet',fld:'vBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE","{handler:'e121S32',iparms:[{av:'Dvelop_confirmpanel_confirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Result'},{av:'AV12AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV9BarUniMed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV14BarPieMet',fld:'vBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV10BarPes',fld:'vBARPES',pic:'ZZZ9',hsh:true},{av:'AV13BarPieKil',fld:'vBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV15BarPiePie',fld:'vBARPIEPIE',pic:'ZZZZZ9'},{av:'AV16TinEst',fld:'vTINEST',pic:'ZZZ9',hsh:true},{av:'AV34Discod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV11BarAgrEst',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV25Clicod',fld:'vCLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE",",oparms:[{av:'AV13BarPieKil',fld:'vBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV15BarPiePie',fld:'vBARPIEPIE',pic:'ZZZZZ9'},{av:'AV14BarPieMet',fld:'vBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV12AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV34Discod',fld:'vDISCOD',pic:'ZZZZZZZ9'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e151S32',iparms:[{av:'AV10BarPes',fld:'vBARPES',pic:'ZZZ9',hsh:true},{av:'AV9BarUniMed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV34Discod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV25Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VALBRECCOD.CONTROLVALUECHANGED","{handler:'e161S32',iparms:[{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV12AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV9BarUniMed',fld:'vBARUNIMED',pic:'@!',hsh:true}]");
      setEventMetadata("VALBRECCOD.CONTROLVALUECHANGED",",oparms:[{av:'AV15BarPiePie',fld:'vBARPIEPIE',pic:'ZZZZZ9'},{av:'AV14BarPieMet',fld:'vBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV13BarPieKil',fld:'vBARPIEKIL',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VPROMPTALBREC.CLICK","{handler:'e111S31',iparms:[{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV12AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV25Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV9BarUniMed',fld:'vBARUNIMED',pic:'@!',hsh:true}]");
      setEventMetadata("VPROMPTALBREC.CLICK",",oparms:[{av:'AV25Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV12AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV15BarPiePie',fld:'vBARPIEPIE',pic:'ZZZZZ9'},{av:'AV13BarPieKil',fld:'vBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV14BarPieMet',fld:'vBARPIEMET',pic:'ZZZZZ9.99'}]}");
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
      wcpOAV5EmprCod = "" ;
      wcpOAV8BarCodPar = "" ;
      wcpOAV9BarUniMed = "" ;
      Dvelop_confirmpanel_confirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV5EmprCod = "" ;
      AV8BarCodPar = "" ;
      AV9BarUniMed = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV11BarAgrEst = "" ;
      GXKey = "" ;
      AV42Albrunidis = DecimalUtil.ZERO ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV37promptalbrec = "" ;
      AV46Promptalbrec_GXI = "" ;
      sImgUrl = "" ;
      AV13BarPieKil = DecimalUtil.ZERO ;
      AV14BarPieMet = DecimalUtil.ZERO ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV27Hdr = "" ;
      AV47Station = "" ;
      GXt_char3 = "" ;
      AV48Emprnom = "" ;
      AV49Usurcod = "" ;
      AV30KilosDisp = DecimalUtil.ZERO ;
      AV31MetrosDisp = DecimalUtil.ZERO ;
      AV29Errmessages = "" ;
      Gx_msg = "" ;
      AV33BarpieCod = "" ;
      GXv_int9 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_int11 = new int[1] ;
      GXv_char6 = new String[1] ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte wcpOAV7BarCodReo ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV7BarCodReo ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte nGXWrapped ;
   private short wcpOAV10BarPes ;
   private short AV10BarPes ;
   private short AV16TinEst ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV17Vertic ;
   private short AV18Tela ;
   private short AV19Erfoc ;
   private short AV20TTRN22 ;
   private int wcpOAV6BarCod ;
   private int wcpOAV25Clicod ;
   private int wcpOAV34Discod ;
   private int AV6BarCod ;
   private int AV25Clicod ;
   private int AV34Discod ;
   private int AV43albrpiedis ;
   private int AV12AlbRecCod ;
   private int edtavAlbreccod_Enabled ;
   private int edtavBarpiekil_Enabled ;
   private int edtavBarpiemet_Enabled ;
   private int AV15BarPiePie ;
   private int edtavBarpiepie_Enabled ;
   private int AV38AlbRecCodIN ;
   private int AV32PiezasDisp ;
   private int GXv_int9[] ;
   private int GXv_int10[] ;
   private int GXv_int11[] ;
   private int idxLst ;
   private java.math.BigDecimal AV42Albrunidis ;
   private java.math.BigDecimal AV13BarPieKil ;
   private java.math.BigDecimal AV14BarPieMet ;
   private java.math.BigDecimal AV30KilosDisp ;
   private java.math.BigDecimal AV31MetrosDisp ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private String wcpOAV5EmprCod ;
   private String wcpOAV8BarCodPar ;
   private String wcpOAV9BarUniMed ;
   private String Dvelop_confirmpanel_confirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV5EmprCod ;
   private String AV8BarCodPar ;
   private String AV9BarUniMed ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV11BarAgrEst ;
   private String GXKey ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvelop_confirmpanel_confirmar_Title ;
   private String Dvelop_confirmpanel_confirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_confirmar_Confirmtype ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavAlbreccod_Internalname ;
   private String TempTags ;
   private String edtavAlbreccod_Jsonclick ;
   private String imgavPromptalbrec_Internalname ;
   private String imgavPromptalbrec_gximage ;
   private String sImgUrl ;
   private String imgavPromptalbrec_Jsonclick ;
   private String edtavBarpiekil_Internalname ;
   private String edtavBarpiekil_Jsonclick ;
   private String edtavBarpiemet_Internalname ;
   private String edtavBarpiemet_Jsonclick ;
   private String edtavBarpiepie_Internalname ;
   private String edtavBarpiepie_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV27Hdr ;
   private String AV47Station ;
   private String GXt_char3 ;
   private String AV48Emprnom ;
   private String AV49Usurcod ;
   private String Gx_msg ;
   private String AV33BarpieCod ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_confirmar_Internalname ;
   private String Dvelop_confirmpanel_confirmar_Internalname ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean wbLoad ;
   private boolean AV37promptalbrec_IsBlob ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private String AV46Promptalbrec_GXI ;
   private String AV29Errmessages ;
   private String AV37promptalbrec ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmar ;
   private com.genexus.webpanels.GXWebForm Form ;
}

